import java.awt.*;

final class eo_
{
	//original name: _a
    private GraphicsDevice graphicsDevice;
    //original name: _b
    private DisplayMode displayMode;
    
    //original signature: private final void a050(final Frame fullScreenWindow, final int n) {
    private final void setFullscreen(final Frame fullScreenWindow) {
        try {
            this.graphicsDevice.setFullScreenWindow(fullScreenWindow);
        }
        finally {}
    }
    
    public final void enter(final Frame frame, final int n, final int n2, final int n3, int n4) {
        this.displayMode = this.graphicsDevice.getDisplayMode();
        if (this.displayMode != null) {
            frame.setUndecorated(true);
            frame.enableInputMethods(false);
            this.setFullscreen(frame);
            if (n4 == 0) {
                final int refreshRate = this.displayMode.getRefreshRate();
                final DisplayMode[] displayModes = this.graphicsDevice.getDisplayModes();
                int n5 = 0;
                for (int i = 0; i < displayModes.length; ++i) {
                    if (n == displayModes[i].getWidth() && displayModes[i].getHeight() == n2) {
                        if (n3 == displayModes[i].getBitDepth()) {
                            final int refreshRate2 = displayModes[i].getRefreshRate();
                            if (n5 == 0 || Math.abs(refreshRate2 - refreshRate) < Math.abs(n4 - refreshRate)) {
                                n5 = 1;
                                n4 = refreshRate2;
                            }
                        }
                    }
                }
                if (n5 == 0) {
                    n4 = refreshRate;
                }
            }
            this.graphicsDevice.setDisplayMode(new DisplayMode(n, n2, n3, n4));
            return;
        }
        throw new NullPointerException();
    }
    
    public final int[] listmodes() {
        final DisplayMode[] displayModes = this.graphicsDevice.getDisplayModes();
        final int[] array = new int[displayModes.length << 2];
        for (int i = 0; i < displayModes.length; ++i) {
            array[i << 2] = displayModes[i].getWidth();
            array[(i << 2) + 1] = displayModes[i].getHeight();
            array[2 + (i << 2)] = displayModes[i].getBitDepth();
            array[(i << 2) + 3] = displayModes[i].getRefreshRate();
        }
        return array;
    }
    
    public final void exit() {
        if (this.displayMode != null) {
            this.graphicsDevice.setDisplayMode(this.displayMode);
            if (!this.graphicsDevice.getDisplayMode().equals(this.displayMode)) {
                throw new RuntimeException("");
            }
            this.displayMode = null;
        }
        this.setFullscreen(null);
    }
    
    public eo_() throws Exception {
        final GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.graphicsDevice = localGraphicsEnvironment.getDefaultScreenDevice();
        if (this.graphicsDevice.isFullScreenSupported()) {
            return;
        }
        final GraphicsDevice[] screenDevices = localGraphicsEnvironment.getScreenDevices();
        for (int n = 0; screenDevices.length > n; ++n) {
            final GraphicsDevice a = screenDevices[n];
            if (a != null && a.isFullScreenSupported()) {
                this.graphicsDevice = a;
                return;
            }
        }
        throw new Exception();
    }
}
