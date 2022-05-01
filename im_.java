import java.awt.*;
import java.awt.event.*;

final class im_ implements ca_
{
    private int _g;
    private int _c;
    private int _f;
    //original name: _l
    static String create_ineligible;
    private int _i;
    static boolean _a;
    static volatile boolean _d;
    private int _k;
    private se_ _j;
    //original name: _m
    static Graphic scrollbar_slider;
    static me_ _b;
    private int _h;
    static Graphic _e;
    
    @Override
    public final void a623(final byte b, final lm_ lm_, final int n, final int n2, final boolean b2) {
        final eb_ eb_ = (eb_)((lm_ instanceof eb_) ? lm_ : null);
        gf_.b050(lm_.xAxisOffset + n, n2 + lm_.yAxisOffset, lm_.componentWidth, lm_.componentHeight, this._k);
        if (null == eb_) {}
        final int n3 = lm_.componentWidth - eb_._J * 2;
        if (b != 34) {
            this._c = 108;
        }
        final int n4 = eb_._J + (n + lm_.xAxisOffset);
        final int n5 = eb_._N + lm_.yAxisOffset + n2;
        gf_.c050(n4, n5, n3 + n4, n5, this._h);
        for (int i = eb_.i137(97) - 1; i >= 0; --i) {
            gf_.f115(n4 + n3 * eb_.a080(-1, i) / eb_.a137(-116), n5, this._f, this._i);
        }
        if (this._j != null) {
            this._j.c191(eb_.buttonText, n3 / 2 + n4, this._j._R + n5 + eb_._N, this._c, this._g);
        }
    }
    
    public static void a150() {
        im_.scrollbar_slider = null;
        im_._b = null;
        im_.create_ineligible = null;
        im_._e = null;
    }
    
    //original signature: static final void a249(final Component component) {
    static final void addListeners(final Component component) {
        component.addMouseListener(ib_._f);
        component.addMouseMotionListener(ib_._f);
        component.addFocusListener(ib_._f);
    }
    
    //useless constructor?
    im_(final se_ j, final int c, final int g, final int h, final int k, final int f, final int i) {
        this._g = g;
        this._c = c;
        this._h = h;
        this._k = k;
        this._j = j;
        this._f = f;
        this._i = i;
    }
    
    static {
        im_.create_ineligible = "Unfortunately you are not eligible to create an account.";
        im_._d = true;
    }
}
