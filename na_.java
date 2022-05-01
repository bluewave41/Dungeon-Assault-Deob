final class na_ extends hh_
{
    static ji_ _D;
    //original name: _A
    static Graphic piece_saurus_warrior;
    static cc_ _y;
    private int _F;
    private Graphic[] _x;
    private int _z;
    //original name: _w
    static HeaderLabelText instructionsHeaderLabel;
    private int _E;
    static Graphic[] _C;
    static int[] _G;
    
    public static void c150(final int n) {
        na_.piece_saurus_warrior = null;
        if (n >= -26) {
            return;
        }
        na_._C = null;
        na_._G = null;
        na_._D = null;
        na_.instructionsHeaderLabel = null;
        na_._y = null;
    }
    
    static final void a520(final boolean b, final int n, final boolean b2) {
        hd_.a164(n ^ 0x27A9F5, b2, null, b);
        if (n != 2591221) {
            na_.piece_saurus_warrior = null;
        }
    }
    
    public na_() {
        this(2188450, 2591221, 9543);
    }
    
    private na_(final int z, final int f, final int e) {
        this._x = na_._C;
        this._E = e;
        this._F = f;
        this._z = z;
        super._u = hc_._f;
    }
    
    @Override
    public final void a623(final byte b, final lm_ lm_, final int n, final int n2, boolean b2) {
        final boolean b3 = lm_._u;
        if (lm_ instanceof GUIButton) {
            b2 &= ((GUIButton)lm_)._B;
        }
        ad_.a028(lm_.componentWidth, n2 + lm_.yAxisOffset + (-this._x[0].imageHeight2 + lm_.componentHeight >> 1), n + lm_.xAxisOffset, (!b2) ? this._E : (b3 ? this._F : this._z), this._x);
        final int n3 = b2 ? 16777215 : 7105644;
        if (b != 34) {
            c150(123);
        }
        super._u.a385(lm_.buttonText, n + lm_.xAxisOffset, n2 - (-lm_.yAxisOffset + 2), lm_.componentWidth, lm_.componentHeight, n3, -1, 1, 1, super._u._H);
    }
    
    static {
        na_._G = new int[] { 28, 234, 513, 709, 950, 1046, 1325, 1430, 1693 };
    }
}
