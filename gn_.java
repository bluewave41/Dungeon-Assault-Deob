import java.awt.*;
import java.awt.event.*;

final class gn_
{
    private String _j;
    String _f;
    String _b;
    //original name: _i
    static Graphic[] frame_top;
    int _a;
    private String _e;
    int _g;
    static int _h;
    //original name: _c
    static Graphic benefits_blurbpane;
    
    //original signature: static final void a649(final Component component) {
    static final void removeListeners(final Component component) {
        component.removeMouseListener(ib_._f);
        component.removeMouseMotionListener(ib_._f);
        component.removeFocusListener(ib_._f);
        ua_.isMetaDown = 0;
    }
    
    public static void a150(final int n) {
        if (n != 194) {
            a150(3);
        }
        gn_.frame_top = null;
        gn_.benefits_blurbpane = null;
    }
    
    final void a423(final byte b) {
        this._b = rf_._K.a803(this._e, (byte)(-48));
        this._f = rf_._K.a803(this._j, (byte)(-48));
        this._a = 10 + la_.roman12._H * oj_.a170(this._f, new int[] { 194 }, la_.roman12);
        if (b > -68) {
            removeListeners(null);
        }
        if (null != this._b) {
            final int n = (null != this._b) ? oj_.a170(this._b, new int[] { 194 }, ne_.roman20) : 0;
            this._g = n * ne_.roman20._H;
            this._a += ne_.roman20._H * n + 10;
        }
        else {
            this._g = 0;
        }
    }
    
    gn_(final String e, final String j) {
        this._j = j;
        this._e = e;
    }
}
