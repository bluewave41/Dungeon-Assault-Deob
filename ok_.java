class ok_ extends ko_
{
    int _G;
    private boolean _Cb;
    private Graphic _C;
    private int _Z;
    private md_ _F;
    private int _xb;
    static int[] _S;
    private int _vb;
    int _lb;
    private int _Eb;
    private int _ub;
    //original name: _jb
    static String enchantress;
    private boolean _bb;
    Graphic _L;
    private int _H;
    int _B;
    private int _db;
    private boolean _qb;
    private String _K;
    private int _Db;
    private int _M;
    private int _eb;
    boolean _hb;
    private Graphic[] _rb;
    private int _W;
    static HeaderLabelText _Y;
    private Graphic[] _Fb;
    private boolean _ib;
    private int _nb;
    private int _x;
    private int _tb;
    private int _pb;
    private boolean _kb;
    private int _Ab;
    se_ _y;
    int _fb;
    int _ob;
    private int _yb;
    private int _I;
    private boolean _A;
    private Graphic[] _U;
    private String _Q;
    private Graphic _ab;
    static int[] _X;
    private int _sb;
    private boolean _V;
    private Graphic[] _R;
    private int _Bb;
    private int _T;
    private int _N;
    private int _mb;
    private boolean _O;
    private Graphic _P;
    private Graphic[] _E;
    int _D;
    private int _zb;
    private int _wb;
    private Graphic _cb;
    int _gb;
    private int _J;
    
    final void a430(final int n, final boolean b) {
        im_._a = !b;
        ti_._i = !b;
        this.a116(gf_._c, 0, 7183, 0, true, gf_._i);
        if (n != -2) {
            this._sb = 49;
        }
    }
    
    final void e150(final int n) {
        if (n != 30509) {
            return;
        }
        if (null != this._F) {
            for (ok_ ok_ = (ok_)this._F.d024(-14205); null != ok_; ok_ = (ok_)this._F.g024(20)) {
                ok_._O = true;
                ok_.e150(30509);
            }
        }
    }
    
    ok_(final long n, final ok_ ok_) {
        this(n, ok_, 0, 0, 0, 0, null);
    }
    
    ok_(final long n, final ok_ ok_, final String s) {
        this(n, ok_, 0, 0, 0, 0, s);
    }
    
    private final void a074(final int n, final int n2, final int n3, boolean b, final boolean b2, boolean cb, final boolean b3, boolean hb, final boolean b4, final int n4, final int n5) {
        this._ub = n3 + this._D;
        this._zb = n + this._gb;
        final int j = gf_._j;
        final int f = gf_._f;
        final int h = gf_._h;
        final int e = gf_._e;
        gf_.a115(this._zb, this._ub, this._ob + this._zb, this._ub + this._B);
        if (!this._O) {
            cb = this._Cb;
            hb = this._hb;
            b = (0 != this._I);
        }
        final boolean b5 = b2 & this._kb;
        Graphic[] array = this._U;
        Graphic cn_ = this._L;
        int n6 = this._fb;
        int n7 = n5;
        if (!b5) {
            if (null != this._C) {
                cn_ = this._C;
            }
            if (this._wb >= 0) {
                n6 = this._wb;
            }
            if (this._Fb != null) {
                array = this._Fb;
            }
        }
        int n8 = 0;
        if (hb) {
            if (this._Eb != Integer.MIN_VALUE) {
                n8 = this._Eb;
            }
            if (this._ab != null) {
                cn_ = this._ab;
            }
            if (0 <= this._Z) {
                n6 = this._Z;
            }
            if (this._mb != Integer.MIN_VALUE) {
                n7 = this._mb;
            }
            if (null != this._rb) {
                array = this._rb;
            }
        }
        if (b) {
            if (this._R != null) {
                array = this._R;
            }
            if (Integer.MIN_VALUE != this._eb) {
                n8 = this._eb;
            }
            if (0 <= this._Db) {
                n6 = this._Db;
            }
            if (Integer.MIN_VALUE != this._nb) {
                n7 = this._nb;
            }
            if (null != this._P) {
                cn_ = this._P;
            }
        }
        if (cb) {
            if (this._H != Integer.MIN_VALUE) {
                n8 = this._H;
            }
            if (this._tb >= 0) {
                n6 = this._tb;
            }
            if (null != this._cb) {
                cn_ = this._cb;
            }
            if (this._E != null) {
                array = this._E;
            }
            if (Integer.MIN_VALUE != this._W) {
                n7 = this._W;
            }
        }
        final int n9 = n7 + this._M;
        int n10 = this._yb + n8;
        if (this._ib) {
            sn_.a311(n5 + 100, n2, array, n, n3, n4);
        }
        else {
            sn_.a311(-33, this._B, array, this._zb, this._ub, this._ob);
        }
        if (null != cn_) {
            int n11 = this._zb + n9;
            if (this._lb == 1) {
                n11 += (this._ob - cn_.imageWidth2) / 2;
            }
            int n12 = this._ub + n10;
            if (2 == this._lb) {
                n11 += -cn_.imageWidth2 + this._ob;
            }
            if (this._vb == 1) {
                n12 += (this._B - cn_.imageHeight2) / 2;
            }
            if (this._vb == 2) {
                n12 += -cn_.imageHeight2 + this._B;
            }
            if (256 <= this._Ab) {
                cn_.drawImage(n11, n12);
            }
            else {
                cn_.d326(n11, n12, this._Ab);
            }
        }
        if (null != this._Q && null != this._y) {
            String s = this._Q;
            if (b3 && null != this._K) {
                s += this._K;
            }
            if (this._y.b926(s) > -(2 * this._xb) + this._ob || 0 <= s.indexOf("<br>")) {
                this._y.a450(s, n9 + this._zb + this._xb, n10 + this._ub, this._ob - 2 * this._xb, this._B, n6, -1, this._J, this._lb, this._vb, this._Bb);
            }
            else {
                if (1 == this._vb) {
                    n10 += (-this._y._E + (-this._y._H + this._B)) / 2;
                }
                else if (this._vb == 2) {
                    n10 += this._B - this._y._E - this._y._H;
                }
                if (0 == this._lb) {
                    this._y.a068(s, n9 + (this._xb + this._zb), this._y._H + (this._ub + n10), n6, -1, this._J);
                }
                else if (this._lb == 1) {
                    this._y.b068(s, n9 + (this._xb + this._zb + (-(2 * this._xb) + this._ob) / 2), this._y._H + n10 + this._ub, n6, -1, this._J);
                }
                else if (2 == this._lb) {
                    this._y.c068(s, -(2 * this._xb) + (this._ob + (n9 + this._xb)) + this._zb, this._y._H + (this._ub + n10), n6, -1, this._J);
                }
                else {
                    this._y.a450(s, n9 + (this._xb + this._zb), n10 + this._ub, -(2 * this._xb) + this._ob, this._B, n6, -1, this._J, this._lb, this._vb, this._Bb);
                }
            }
        }
        if (null != this._F) {
            for (ok_ ok_ = (ok_)this._F.e024(); ok_ != null; ok_ = (ok_)this._F.a024(4)) {
                ok_.a074(this._zb + n7, this._B, n8 + this._ub, b, b5, cb, b3, hb, this._A, this._ob, 0);
            }
        }
        gf_.e115(j, f, h, e);
    }
    
    static final void a009(final String[] array) {
        if (null != cd_.registerScreen) {
            cd_.registerScreen._W.a144((byte)(-104), array);
        }
        if (null != pj_._c) {
            pj_._c._P.a144((byte)(-126), array);
        }
    }
    
    final void b540(final boolean b, final int n) {
        if (n < 59) {
            f150(124);
        }
        this.a074(0, gf_._c, 0, false, true, false, b, false, false, gf_._i, 0);
    }
    
    private final void a466(final byte b, final ok_ ok_) {
        if (null != ok_) {
            if (ok_._Cb) {
                this._Cb = ok_._Cb;
            }
            if (ok_._fb != 0) {
                this._fb = ok_._fb;
            }
            if (256 != ok_._J) {
                this._J = ok_._J;
            }
            if (ok_._L != null) {
                this._L = ok_._L;
            }
            if (ok_._cb != null) {
                this._cb = ok_._cb;
            }
            if (null != ok_._K) {
                this._K = ok_._K;
            }
            if (ok_._O) {
                this._O = ok_._O;
            }
            if (ok_._Z >= 0) {
                this._Z = ok_._Z;
            }
            if (ok_._C != null) {
                this._C = ok_._C;
            }
            if (ok_._R != null) {
                this._R = ok_._R;
            }
            if (null != ok_._Fb) {
                this._Fb = ok_._Fb;
            }
            if (null != ok_._P) {
                this._P = ok_._P;
            }
            if (ok_._Q != null) {
                this._Q = ok_._Q;
            }
            if (ok_._ib) {
                this._ib = ok_._ib;
            }
            if (0 <= ok_._tb) {
                this._tb = ok_._tb;
            }
            if (ok_._Db >= 0) {
                this._Db = ok_._Db;
            }
            if (ok_._ab != null) {
                this._ab = ok_._ab;
            }
            if (0 != ok_._xb) {
                this._xb = ok_._xb;
            }
            if (ok_._wb >= 0) {
                this._wb = ok_._wb;
            }
            if (ok_._qb) {
                this._qb = ok_._qb;
            }
            if (null != ok_._y) {
                this._y = ok_._y;
            }
            if (0 != ok_._Bb) {
                this._Bb = ok_._Bb;
            }
            if (!ok_._kb) {
                this._kb = ok_._kb;
            }
            if (ok_._rb != null) {
                this._rb = ok_._rb;
            }
            if (ok_._E != null) {
                this._E = ok_._E;
            }
            if (ok_._U != null) {
                this._U = ok_._U;
            }
            if (0 != ok_._lb) {
                this._lb = ok_._lb;
            }
            if (ok_._Eb != Integer.MIN_VALUE) {
                this._Eb = ok_._Eb;
            }
            if (0 != ok_._vb) {
                this._vb = ok_._vb;
            }
            if (ok_._eb != Integer.MIN_VALUE) {
                this._eb = ok_._eb;
            }
            this._A = (this._qb && ok_._A);
            if (Integer.MIN_VALUE != ok_._nb) {
                this._nb = ok_._nb;
            }
            if (ok_._mb != Integer.MIN_VALUE) {
                this._mb = ok_._mb;
            }
            if (Integer.MIN_VALUE != ok_._H) {
                this._H = ok_._H;
            }
            if (0 != ok_._yb) {
                this._yb = ok_._yb;
            }
            if (ok_._bb) {
                this._bb = ok_._bb;
            }
            if (Integer.MIN_VALUE != ok_._W) {
                this._W = ok_._W;
            }
            if (ok_._M != 0) {
                this._M = ok_._M;
            }
        }
        if (b < 27) {
            ok_._Y = null;
        }
    }
    
    public static void f150(final int n) {
        if (n != -16218) {
            return;
        }
        ok_.enchantress = null;
        ok_._S = null;
        ok_._Y = null;
        ok_._X = null;
    }
    
    private final void a116(final int n, final int n2, final int n3, final int n4, final boolean b, final int n5) {
        int n6;
        if (this._sb > 0) {
            n6 = -(-this._sb >> 2);
        }
        else {
            n6 = this._sb >> 2;
        }
        this._sb -= n6;
        this._gb += n6;
        int n7;
        if (this._pb > 0) {
            n7 = -(-this._pb >> 2);
        }
        else {
            n7 = this._pb >> 2;
        }
        this._D += n7;
        this._pb -= n7;
        int n8;
        if (0 >= this._T) {
            n8 = this._T >> 2;
        }
        else {
            n8 = -(-this._T >> 2);
        }
        this._T -= n8;
        this._ob += n8;
        int n9;
        if (this._x <= 0) {
            n9 = this._x >> 2;
        }
        else {
            n9 = -(-this._x >> 2);
        }
        if (n3 != 7183) {
            return;
        }
        final boolean b2 = b & this._kb;
        this._ub = this._D + n4;
        this._x -= n9;
        this._zb = this._gb + n2;
        this._B += n9;
        final int j = gf_._j;
        final int f = gf_._f;
        final int h = gf_._h;
        final int e = gf_._e;
        gf_.a115(this._zb, this._ub, this._ob + this._zb, this._B + this._ub);
        boolean b3 = false;
        if (!ti_._i && b2 && no_.isMetaDown != 0 && gf_._j <= lc_.mouseX && lc_.mouseX < gf_._h && hm_.mouseY >= gf_._f && gf_._e > hm_.mouseY) {
            b3 = true;
            this._db = lc_.mouseX - this._zb;
            this._I = no_.isMetaDown;
            this._G = no_.isMetaDown;
            this._N = -this._ub + hm_.mouseY;
        }
        else {
            this._G = 0;
            if (0 != no_.isMetaDown) {
                this._I = 0;
            }
        }
        if (la_.isMetaDown == 0) {
            this._I = 0;
        }
        this._V = (!im_._a && hj_.mouseX >= gf_._j && gf_._h > hj_.mouseX && Animation.mouseY >= gf_._f && gf_._e > Animation.mouseY);
        this._hb = (this._V && la_.isMetaDown == this._I && b2);
        if (null != this._F) {
            for (ok_ ok_ = (ok_)this._F.d024(-14205); ok_ != null; ok_ = (ok_)this._F.g024(20)) {
                ok_.a116(this._B, this._zb, 7183, this._ub, b2, this._ob);
            }
        }
        if (this._V) {
            im_._a = true;
        }
        if (b3) {
            ti_._i = true;
        }
        gf_.e115(j, f, h, e);
        if (0 != this._I && this._bb) {
            this._gb = -n2 - this._db + hj_.mouseX;
            this._D = -n4 + (Animation.mouseY - this._N);
            if (0 > this._gb) {
                this._gb = 0;
            }
            if (this._D < 0) {
                this._D = 0;
            }
            if (-this._ob + n5 < this._gb) {
                this._gb = -this._ob + n5;
            }
            if (-this._B + n < this._D) {
                this._D = n - this._B;
            }
            this._sb = 0;
            this._pb = 0;
            this._zb = this._gb + n2;
            this._ub = this._D + n4;
        }
    }
    
    final void a652(final ok_ ok_, final byte b) {
        if (b != 124) {
            this._xb = 89;
        }
        if (this._F == null) {
            this._F = new md_();
        }
        this._F.a865(ok_);
    }
    
    private ok_(final long h, final ok_ ok_, final int gb, final int d, final int ob, final int b, final String q) {
        this._Eb = Integer.MIN_VALUE;
        this._eb = Integer.MIN_VALUE;
        this._H = Integer.MIN_VALUE;
        this._qb = false;
        this._Db = -1;
        this._Z = -1;
        this._Ab = 256;
        this._A = false;
        this._mb = Integer.MIN_VALUE;
        this._tb = -1;
        this._W = Integer.MIN_VALUE;
        this._nb = Integer.MIN_VALUE;
        this._kb = true;
        this._wb = -1;
        this._J = 256;
        this._D = d;
        super._h = h;
        this._gb = gb;
        this._B = b;
        this._ob = ob;
        this.a466((byte)30, ok_);
        if (null != q) {
            this._Q = q;
        }
    }
    
    static {
        ok_.enchantress = "Enchantress";
        ok_._S = new int[8192];
        ok_._X = new int[] { 0, 16777164, 16776960, 16763904, 16737792, 16720384, 16711680, 12255232, 4456448, 0 };
    }
}
