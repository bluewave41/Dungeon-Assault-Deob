public class ma_ {
	
}

/*import com.ms.directX.*;
import com.ms.awt.*;
import com.ms.win32.*;
import java.awt.*;
import com.ms.com.*;

final class ma_ implements IEnumModesCallback
{
    private static int[] _a;
    private DirectDraw _b;
    private static int _c;
    
    public final void callbackEnumModes(final DDSurfaceDesc ddSurfaceDesc, final IUnknown unknown) {
        if (null != ma_._a) {
            ma_._a[ma_._c++] = ddSurfaceDesc.width;
            ma_._a[ma_._c++] = ddSurfaceDesc.height;
            ma_._a[ma_._c++] = ddSurfaceDesc.rgbBitCount;
            ma_._a[ma_._c++] = ddSurfaceDesc.refreshRate;
        }
        else {
            ma_._c += 4;
        }
    }
    
    final void a121(final byte b, final Frame frame, final int n, final int n2, final int n3, final int n4) {
        frame.setVisible(true);
        final int hwnd = ((WComponentPeer)frame.getPeer()).getHwnd();
        if (b != 6) {
            this._b = null;
        }
        User32.SetWindowLong(hwnd, -16, Integer.MIN_VALUE);
        User32.SetWindowLong(hwnd, -20, 8);
        this._b.setCooperativeLevel((Component)frame, 17);
        this._b.setDisplayMode(n, n2, n3, n4, 0);
        frame.setBounds(0, 0, n, n2);
        frame.toFront();
        frame.requestFocus();
    }
    
    public ma_() {
        (this._b = new DirectDraw()).initialize((_Guid)null);
    }
    
    final int[] a878(final int n) {
        if (n != 10127) {
            this._b = null;
        }
        this._b.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, (IEnumModesCallback)this);
        ma_._a = new int[ma_._c];
        ma_._c = 0;
        this._b.enumDisplayModes(0, (DDSurfaceDesc)null, (IUnknown)null, (IEnumModesCallback)this);
        final int[] a = ma_._a;
        ma_._c = 0;
        ma_._a = null;
        return a;
    }
    
    final void a266(final int n, final Frame frame) {
        this._b.restoreDisplayMode();
        this._b.setCooperativeLevel((Component)frame, 8);
    }
}*/
