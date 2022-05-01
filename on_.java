public class on_ {
	
}

/*import com.ms.win32.*;
import java.awt.*;
import com.ms.awt.*;
import com.ms.dll.*;

final class on_ extends Callback
{
    private boolean _d;
    private int _c;
    private volatile int _a;
    private volatile boolean _e;
    private volatile int _b;
    
    final synchronized int callback(final int n, final int n2, final int n3, final int n4) {
        if (this._b != n) {
            return User32.CallWindowProc(User32.GetWindowLong(n, -4), n, n2, n3, n4);
        }
        if (32 == n2) {
            if (0x1 == (n4 & 0xFFFF)) {
                User32.SetCursor(this._e ? this._c : 0);
                return 0;
            }
        }
        if (101024 == n2) {
            User32.SetCursor(this._e ? this._c : 0);
            return 0;
        }
        if (1 == n2) {
            this._b = 0;
            this._e = true;
        }
        return User32.CallWindowProc(this._a, n, n2, n3, n4);
    }
    
    final void a834(final int n, final Component component, final boolean e) {
        final int topHwnd = ((WComponentPeer)component.getPeer()).getTopHwnd();
        if (topHwnd == this._b && !this._e == !e) {
            return;
        }
        if (!this._d) {
            this._c = User32.LoadCursor(0, 32512);
            Root.alloc((Object)this);
            this._d = true;
        }
        if (n != -14677) {
            this._b = -126;
        }
        if (this._b != topHwnd) {
            if (this._b != 0) {
                this._e = true;
                User32.SendMessage(topHwnd, 101024, 0, 0);
                synchronized (this) {
                    User32.SetWindowLong(this._b, -4, this._a);
                }
            }
            synchronized (this) {
                this._b = topHwnd;
                this._a = User32.SetWindowLong(this._b, -4, (Object)this);
            }
        }
        this._e = e;
        User32.SendMessage(topHwnd, 101024, 0, 0);
    }
    
    final void a773(final int n, final boolean b, final int n2) {
        User32.SetCursorPos(n, n2);
        if (!b) {
            this._e = false;
        }
    }
    
    on_() {
        this._e = true;
    }
}*/
