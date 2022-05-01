final class sa_
{
    private int _m;
    //original name: _v
    static AmbientAudioTrack[] da_ambience_drip;
    private int _d;
    private int _s;
    //original name: _h
    static String create_optin_news_tooltip;
    private int _q;
    private int _j;
    int _k;
    private Graphic _a;
    private int _p;
    //original name: _w
    static String loading_graphics;
    private Graphic _u;
    static hd_ _x;
    private Graphic _g;
    private Graphic _c;
    int _b;
    private int _l;
    static int _f;
    private int _o;
    static String _t;
    private Graphic _r;
    private int _n;
    private int _i;
    int _y;
    //original name: _e
    static String text_revive;
    
    final void a098(final Graphic cn_, final int n, final boolean b, final int n2, final int n3) {
        this._i = this._l;
        this._n = this._p;
        this._a = this._r;
        this._c = this._u;
        this._p = n;
        this._l = n3;
        if (b) {
            this._q = n3;
            this._g = cn_;
            this._d = n;
        }
        else {
            this._s = 32;
        }
        this._u = cn_;
        jh_.a303(this._r = new Graphic(this._u.imageWidth + 4, 4 + this._u.imageHeight));
        this._u.e326(2, 2, 12690143);
        gf_.d669(2, 2, 0, 0, this._r.imageWidth, this._r.imageHeight);
        jh_.b797();
        final Graphic r = this._r;
        this._r._A = -2;
        r._w = -2;
        this._o = 384;
    }
    
    public static void b487() {
        sa_._x = null;
        sa_.create_optin_news_tooltip = null;
        sa_.text_revive = null;
        sa_._t = null;
        sa_.da_ambience_drip = null;
        sa_.loading_graphics = null;
    }
    
    private final void a150(final int n) {
        if (n != 384) {
            this.a126(33, false, null);
        }
        this.a098(this._g, this._d, true, -89, this._q);
    }
    
    final void a423(final byte b) {
        final int n = (-this._u.imageWidth + this._b >> 1) + this._m;
        final int n2 = this._j + this._l;
        if (0 != this._o) {
            if (256 < this._o) {
                if (null != this._c) {
                    final int n3 = this._m + (this._b - this._c.imageWidth >> 1);
                    final int n4 = this._i + this._j;
                    this.a394(n4, (byte)80, n3, this._o - 256 << 1, this._c);
                    this.a394(n4, (byte)(-35), n3, -this._o + 384 << 1, this._a);
                }
            }
            else if (128 < this._o) {
                if (this._c != null) {
                    this.a394(this._i + this._j, (byte)62, this._m + (this._b - this._c.imageWidth >> 1), this._o - 128 << 1, this._a);
                }
                this.a394(n2, (byte)107, n, -this._o + 256 << 1, this._r);
            }
            else {
                this.a394(n2, (byte)(-28), n, this._o << 1, this._r);
                this.a394(n2, (byte)105, n, 128 - this._o << 1, this._u);
            }
        }
        else {
            this.a075(n, n2, this._u, (byte)(-66));
        }
        if (b >= -20) {
            sa_.create_optin_news_tooltip = null;
        }
    }
    
    private final void a394(final int n, final byte b, final int n2, final int n3, final Graphic cn_) {
        final int[] array = new int[4];
        gf_.a331(array);
        for (int i = 1; i < this._k; ++i) {
            final int n4 = i * n3 / this._k;
            gf_.e115(this._m, i + this._j, this._m + this._b, 1 + (this._j + i));
            cn_.b326(n2, n, n4);
            gf_.e115(this._m, this._y + (this._j - 1) - i, this._b + this._m, -i + (this._j + this._y));
            cn_.b326(n2, n, n4);
        }
        gf_.e115(this._m, this._k + this._j, this._m + this._b, this._j + this._y - this._k);
        cn_.b326(n2, n, n3);
        gf_.b331(array);
    }
    
    private final void a075(final int n, final int n2, final Graphic cn_, final byte b) {
        final int[] array = new int[4];
        gf_.a331(array);
        for (int n3 = 1; this._k > n3; ++n3) {
            final int n4 = (n3 << 8) / this._k;
            gf_.e115(this._m, this._j + n3, this._m + this._b, n3 + (this._j + 1));
            cn_.d326(n, n2, n4);
            gf_.e115(this._m, -n3 + (this._y + this._j - 1), this._b + this._m, this._y + this._j - n3);
            cn_.d326(n, n2, n4);
        }
        gf_.e115(this._m, this._j + this._k, this._b + this._m, this._j + (this._y - this._k));
        cn_.drawImage(n, n2);
        gf_.b331(array);
    }
    
    final void a126(final int n, final boolean b, final Graphic cn_) {
        this.a098(cn_, 0, b, 118, this._y - cn_.imageHeight >> 1);
        if (n != 1929) {
            this.a487(false);
        }
    }
    
    final void a050(final boolean b, final String s, final byte b2, final String s2, final int n) {
        jh_.c797();
        final int n2 = this._b - 40;
        final String[] a782 = jn_.a782(s2, new int[] { n2 }, -121, la_.roman12);
        int n3 = la_.roman12._E + a782.length * la_.roman12._H;
        if (s != null) {
            n3 += 2 * la_.roman12._H;
        }
        int h = la_.roman12._H;
        final Graphic cn_ = new Graphic(n2, n3);
        cn_.e797();
        if (null != s) {
            db_.roman12bold.c191(s, n2 >> 1, h, n, -1);
            h += 2 * la_.roman12._H;
        }
        final String[] array = a782;
        for (int i = 0; i < array.length; ++i) {
            la_.roman12.c191(array[i], n2 >> 1, h, n, -1);
            h += la_.roman12._H;
        }
        jh_.b797();
        this.a126(1929, b, cn_);
        if (b2 != 91) {
            a846((byte)(-10), -54, -25, -114, null);
        }
    }
    
    final void a487(final boolean b) {
        this._o -= 12;
        if (0 > this._o) {
            this._o = 0;
        }
        if ((mo_._a & 0x3) == 0x0) {
            if (this._o == 0) {
                if (--this._p < 0) {
                    if (this._g != this._u) {
                        if (0 >= --this._s) {
                            this.a150(384);
                        }
                    }
                }
                else {
                    --this._l;
                    if (16 == this._p) {
                        this.a150(384);
                    }
                }
            }
            if (--this._n >= 0) {
                --this._i;
            }
        }
        if (b) {
            this.a487(true);
        }
    }
    
    static final void a846(final byte b, int n, int n2, final int n3, final int[] array) {
        while (--n >= 0) {
            final int n4 = n2;
            array[n4] = n3 + (nb_.and(array[n4], 16711422) >> 1);
            ++n2;
        }
        if (b != 45) {
            a846((byte)65, 42, 56, 44, null);
        }
    }
    
    sa_(final int m, final int j, final int b, final int y) {
        this._k = 16;
        this._b = b;
        this._y = y;
        this._j = j;
        this._m = m;
    }
    
    static {
        sa_.create_optin_news_tooltip = "Updates will sent to the email address you've given";
        sa_.loading_graphics = "Loading graphics";
        sa_.text_revive = "REVIVE";
    }
}
