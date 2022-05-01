final class kc_ extends ii_ implements vg_
{
    private int[] _N;
    private se_ _K;
    private int _O;
    //original name: _P
    static String text_raid_fatal;
    private nk_ _L;
    private GUIButton[] _T;
    static int[][] _S;
    static int[] _Q;
    static int[] _M;
    static int[][] _V;
    private String _R;
    static int _U;
    
    final void a871(final int n, final int n2, final String s) {
        final int o = this._O;
        if (n2 != 6824) {
            return;
        }
        this.a093(o + 1, 0);
        this._T[o] = this.a592(s, this, (byte)(-82));
        this._N[o] = n;
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        super.a115(n, n2, n3 ^ 0x0, n4);
        this._K.a385(this._R, 14 + n2 + super.xAxisOffset, super.yAxisOffset + (n4 + 10), super.componentWidth - 28, super.componentHeight, 16777215, -1, n3, 0, this._K._H);
    }
    
    kc_(final nk_ l, final se_ k, final String r) {
        super(0, 0, 288, 0, null);
        this._O = 0;
        this._K = k;
        this._R = r;
        this._L = l;
        this.b050(0, 288, 0, 0, ((null != this._R) ? this._K.a490(this._R, 260, this._K._H) : 0) + 22);
    }
    
    @Override
    public final void a475(final GUIButton ck_, final byte b, final int n, final int n2, final int n3) {
        if (b != 98) {
            return;
        }
        int n4 = 0;
        while (this._O > n4) {
            if (this._T[n4] != ck_) {
                ++n4;
            }
            else {
                if (-1 == this._N[n4]) {
                    this._L.j423((byte)85);
                    break;
                }
                sn_.a093(73, this._N[n4]);
                break;
            }
        }
    }
    
    public static void a150() {
        kc_._M = null;
        kc_._V = null;
        kc_._S = null;
        kc_.text_raid_fatal = null;
        kc_._Q = null;
    }
    
    static final ki_[] a899(final qg_ qg_, final int n) {
        if (!qg_.a154(n + 61)) {
            return new ki_[0];
        }
        final pn_ a256 = qg_.a256();
        while (a256._c == 0) {
            pj_.a054(0, 10L);
        }
        if (a256._c == 2) {
            return new ki_[0];
        }
        final int[] array = (int[])a256._f;
        final ki_[] array2 = new ki_[array.length >> 2];
        for (int i = 0; i < array2.length; ++i) {
            final ki_ ki_ = new ki_();
            array2[i] = ki_;
            ki_._g = array[i << 2];
            ki_._d = array[(i << 2) + 1];
            ki_._b = array[2 + (i << 2)];
            ki_._a = array[3 + (i << 2)];
        }
        if (n != 10) {
            a899(null, 35);
        }
        return array2;
    }
    
    private final void a093(final int o, final int n) {
        if (o <= this._O) {
            return;
        }
        final GUIButton[] t = new GUIButton[o];
        final int[] n2 = new int[o];
        for (int n3 = n; this._O > n3; ++n3) {
            t[n3] = this._T[n3];
            n2[n3] = this._N[n3];
        }
        this._O = o;
        this._N = n2;
        this._T = t;
    }
    
    static final ab_ a263(final String s, final boolean b) {
        if (null == s || s.length() == 0) {
            return to_._e;
        }
        final int index = s.indexOf(64);
        if (index == -1) {
            return ri_._e;
        }
        final String substring = s.substring(0, index);
        final String substring2 = s.substring(index + 1);
        final ab_ a263 = mo_.a263(substring, b);
        if (null != a263) {
            return a263;
        }
        return ed_.a524(substring2);
    }
    
    final GUIButton a592(final String s, final pg_ pg_, final byte b) {
        final GUIButton ck_ = new GUIButton(s, pg_);
        if (b > -73) {
            this.a115(-80, 42, 35, 65);
        }
        ck_._o = new na_();
        final int n = super.componentHeight - 2;
        this.b050(0, super.componentWidth, 0, 0, super.componentHeight + 34);
        ck_.b050(0, super.componentWidth - 14, n, 7, 30);
        this.b485(ck_);
        return ck_;
    }
    
    static {
        kc_.text_raid_fatal = "If you attempt to raid this dragon you will awaken it.<br><br>Do you wish to proceed?";
        kc_._S = new int[9][];
        kc_._V = new int[9][];
        for (int n = 0; 8 >= n; ++n) {
            kc_._S[n] = new int[32];
            final int n2 = n * 8 + 106;
            final int n3 = 8 * n + 192;
            final int n4 = 80 + 6 * n;
            final int n5 = 6 * n + 144;
            final int n6 = n * 10;
            final int n7 = n * 10 + 8;
            for (int n8 = 0; 32 > n8; ++n8) {
                kc_._S[n][n8] = mp_.or(mp_.or(n4 + n8 * (n5 - n4) / 32 << 8, mp_.or(-445743104, (n3 - n2) * n8 / 32 + n2) << 16), (-n6 + n7) * n8 / 32 + n6);
            }
            final int n9 = 4 * n + 223;
            final int n10 = 223 + n * 4;
            final int n11 = 128 + n * 8;
            final int n12 = n * 4 + 223;
            kc_._V[n] = new int[32];
            final int n13 = 128 + 8 * n;
            final int n14 = 96 + 6 * n;
            for (int i = 0; i < 32; ++i) {
                kc_._V[n][i] = mp_.or(mp_.or(mp_.or(i * (n10 - n11) / 32 + n11, 77168640) << 16, (n9 - n13) * i / 32 + n13 << 8), n14 + (n12 - n14) * i / 32);
            }
        }
        kc_._M = new int[32];
        for (int j = 0; j < 32; ++j) {
            kc_._M[j] = mp_.or((112 + j * 2) * 65793, Integer.MIN_VALUE);
        }
    }
}
