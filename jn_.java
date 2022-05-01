final class jn_ implements ca_
{
    private se_ _g;
    static int[] _k;
    static int _d;
    private int _b;
    private int _i;
    static boolean _c;
    static gn_ _l;
    private int _f;
    private int _m;
    static Graphic _a;
    private int _j;
    private int _e;
    private int _h;
    static lg_ _n;
    
    @Override
    public final void a623(final byte b, final lm_ lm_, final int n, final int n2, final boolean b2) {
        final j_ j_ = (j_)((lm_ instanceof j_) ? lm_ : null);
        gf_.b050(lm_.xAxisOffset + n, n2 + lm_.yAxisOffset, lm_.componentWidth, lm_.componentHeight, this._i);
        if (null != j_) {}
        final int n3 = n + lm_.xAxisOffset + j_._I;
        final int n4 = j_._R + lm_.yAxisOffset + n2;
        gf_.f115(n3, n4, j_._M, this._h);
        if (b != 34) {
            return;
        }
        if (j_._P != -1) {
            final double n5 = 2.0 * (j_._P * 3.141592653589793) / j_._N;
            gf_.f115(n3 + (int)(-Math.sin(n5) * j_._M), n4 + (int)(Math.cos(n5) * j_._M), 1, this._b);
        }
        gf_.f115(n3, n4, 2, 1);
        final double n6 = j_._K * 3.141592653589793 * 2.0 / j_._N;
        gf_.c050(n3, n4, (int)(-Math.sin(n6) * j_._M) + n3, (int)(Math.cos(n6) * j_._M) + n4, 1);
        if (null != this._g) {
            final int n7 = this._e + j_._I + j_._M;
            this._g.a385(lm_.buttonText, lm_.xAxisOffset + n + n7, this._m + lm_.yAxisOffset + n2, -this._e - n7 + lm_.componentWidth, -(this._e << 1) + lm_.componentHeight, this._f, this._j, 1, 1, 0);
        }
    }
    
    static final String[] a782(final String s, final int[] array, final int n, final se_ se_) {
        if (wk_._a == null) {
            wk_._a = new String[16];
        }
        if (n > -59) {
            a782(null, null, -127, null);
        }
        int a899;
        while (true) {
            try {
                a899 = se_.a899(s, array, wk_._a);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                if (wk_._a.length < 1024) {
                    wk_._a = new String[wk_._a.length << 1];
                    continue;
                }
                return null;
            }
            break;
        }
        final String[] array2 = new String[a899];
        for (int i = 0; i < a899; ++i) {
            array2[i] = new String(wk_._a[i]);
        }
        ig_.a722(array2);
        return array2;
    }
    
    public static void a150() {
        jn_._n = null;
        jn_._k = null;
        jn_._l = null;
        jn_._a = null;
    }
    
    jn_(final se_ g, final int e, final int m, final int f, final int j, final int h, final int b, final int i) {
        this._f = f;
        this._j = j;
        this._e = e;
        this._h = h;
        this._m = m;
        this._g = g;
        this._b = b;
        this._i = i;
    }
}
