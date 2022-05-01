import java.awt.image.*;
import java.awt.*;

final class w_
{
    private Robot _a;
    private Component _b;
    
    public final void showcursor(Component b, final boolean b2) {
        if (!b2) {
            if (b == null) {
                throw new NullPointerException();
            }
        }
        else {
            b = null;
        }
        if (this._b == b) {
            return;
        }
        if (this._b != null) {
            this._b.setCursor(null);
            this._b = null;
        }
        if (null != b) {
            b.setCursor(b.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
            this._b = b;
        }
    }
    
    public final void setcustomcursor(final Component component, final int[] array, final int n, final int n2, final Point point) {
        if (null == array) {
            component.setCursor(null);
        }
        else {
            final BufferedImage bufferedImage = new BufferedImage(n, n2, 2);
            bufferedImage.setRGB(0, 0, n, n2, array, 0, n);
            component.setCursor(component.getToolkit().createCustomCursor(bufferedImage, point, null));
        }
    }
    
    public final void movemouse(final int n, final int n2) {
        this._a.mouseMove(n, n2);
    }
    
    public w_() throws Exception {
        this._a = new Robot();
    }
}
