import java.awt.*;

class vn_
{
    int[] _q;
    private boolean _u;
    private static int _l;
    static boolean _g;
    private static bk_ _e;
    private long _b;
    private int _d;
    static int _t;
    private qb_ _h;
    private long _o;
    private int _a;
    private qb_[] _n;
    protected int _j;
    private long _m;
    private int _i;
    private int _r;
    private qb_[] _p;
    private int _s;
    protected int _f;
    private int _c;
    private boolean _k;
    
    final synchronized void a797() {
        if (this._u) {
            return;
        }
        long b = kd_.getTime();
        try {
            if (b > this._b + 6000L) {
                this._b = b - 6000L;
            }
            while (b > this._b + 5000L) {
                this.a150(256);
                this._b += 256000 / vn_._t;
                b = kd_.getTime();
            }
        }
        catch (Exception ex) {
            this._b = b;
        }
        if (this._q == null) {
            return;
        }
        try {
            if (this._o != 0L) {
                if (b < this._o) {
                    return;
                }
                this.b150(this._j);
                this._o = 0L;
                this._k = true;
            }
            int i = this.f784();
            if (this._c - i > this._a) {
                this._a = this._c - i;
            }
            int n = this._f + this._s;
            if (n + 256 > 16384) {
                n = 16128;
            }
            if (n + 256 > this._j) {
                this._j += 1024;
                if (this._j > 16384) {
                    this._j = 16384;
                }
                this.d797();
                this.b150(this._j);
                i = 0;
                this._k = true;
                if (n + 256 > this._j) {
                    n = this._j - 256;
                    this._s = n - this._f;
                }
            }
            while (i < n) {
                this.a704(this._q, 256);
                this.b797();
                i += 256;
            }
            if (b > this._m) {
                if (!this._k) {
                    if (this._a == 0 && this._i == 0) {
                        this.d797();
                        this._o = b + 2000L;
                        return;
                    }
                    this._s = Math.min(this._i, this._a);
                    this._i = this._a;
                }
                else {
                    this._k = false;
                }
                this._a = 0;
                this._m = b + 2000L;
            }
            this._c = i;
        }
        catch (Exception ex2) {
            this.d797();
            this._o = b + 2000L;
        }
    }
    
    final synchronized void c797() {
        if (vn_._e != null) {
            boolean b = true;
            for (int i = 0; i < 2; ++i) {
                if (vn_._e._g[i] == this) {
                    vn_._e._g[i] = null;
                }
                if (vn_._e._g[i] != null) {
                    b = false;
                }
            }
            if (b) {
                vn_._e._a = true;
                while (vn_._e._d) {
                    pj_.a054(0, 50L);
                }
                vn_._e = null;
            }
        }
        this.d797();
        this._q = null;
        this._u = true;
    }
    
    void d797() {
    }
    
    final synchronized void a501(final qb_ h) {
        this._h = h;
    }
    
    private final void a704(final int[] array, final int n) {
        int n2 = n;
        if (vn_._g) {
            n2 <<= 1;
        }
        cj_.a397(array, 0, n2);
        this._r -= n;
        if (this._h != null && this._r <= 0) {
            this._r += vn_._t >> 4;
            b501(this._h);
            this.a312(this._h, this._h.b784());
            int n3 = 0;
            int i = 255;
            int n4 = 7;
        Label_0403:
            while (i != 0) {
                int n5;
                int n6;
                if (n4 < 0) {
                    n5 = (n4 & 0x3);
                    n6 = -(n4 >> 2);
                }
                else {
                    n5 = n4;
                    n6 = 0;
                }
                for (int j = i >>> n5 & 0x11111111; j != 0; j >>>= 4) {
                    if ((j & 0x1) != 0x0) {
                        i &= ~(1 << n5);
                        qb_ qb_ = null;
                        qb_ l = this._p[n5];
                        while (l != null) {
                            final ap_ k = l._k;
                            if (k != null && k._i > n6) {
                                i |= 1 << n5;
                                qb_ = l;
                                l = l._l;
                            }
                            else {
                                l._i = true;
                                final int a784 = 0;
                                n3 += a784;
                                if (k != null) {
                                    final ap_ ap_ = k;
                                    ap_._i += a784;
                                }
                                if (n3 >= this._d) {
                                    break Label_0403;
                                }
                                qb_ qb_2 = l.d207();
                                if (qb_2 != null) {
                                    final int m = l._j;
                                    while (qb_2 != null) {
                                        this.a312(qb_2, m * qb_2.b784() >> 8);
                                        qb_2 = l.c207();
                                    }
                                }
                                final qb_ l2 = l._l;
                                l._l = null;
                                if (qb_ == null) {
                                    this._p[n5] = l2;
                                }
                                else {
                                    qb_._l = l2;
                                }
                                if (l2 == null) {
                                    this._n[n5] = qb_;
                                }
                                l = l2;
                            }
                        }
                    }
                    n5 += 4;
                    ++n6;
                }
                --n4;
            }
            for (int n7 = 0; n7 < 8; ++n7) {
                qb_ qb_3 = this._p[n7];
                this._p[n7] = (this._n[n7] = null);
                while (qb_3 != null) {
                    final qb_ l3 = qb_3._l;
                    qb_3._l = null;
                    qb_3 = l3;
                }
            }
        }
        if (this._r < 0) {
            this._r = 0;
        }
        if (this._h != null) {
            this._h.b397(array, 0, n);
        }
        this._b = kd_.getTime();
    }
    
    int f784() throws Exception {
        return this._j;
    }
    
    private static final void b501(final qb_ qb_) {
        qb_._i = false;
        if (qb_._k != null) {
            qb_._k._i = 0;
        }
        for (qb_ qb_2 = qb_.d207(); qb_2 != null; qb_2 = qb_.c207()) {
            b501(qb_2);
        }
    }
    
    void b150(final int n) throws Exception {
    }
    
    static final vn_ a393(final qg_ h, final Component component, final int n, int f) {
        if (vn_._t == 0) {
            throw new IllegalStateException();
        }
        if (n < 0 || n >= 2) {
            throw new IllegalArgumentException();
        }
        if (f < 256) {
            f = 256;
        }
        try {
            final wn_ wn_ = new wn_();
            wn_._q = new int[256 * (vn_._g ? 2 : 1)];
            wn_._f = f;
            wn_.a963(component);
            wn_._j = (f & 0xFFFFFC00) + 1024;
            if (wn_._j > 16384) {
                wn_._j = 16384;
            }
            wn_.b150(wn_._j);
            if (vn_._l > 0 && vn_._e == null) {
                vn_._e = new bk_();
                (vn_._e._h = h).a508(vn_._l, vn_._e);
            }
            if (vn_._e != null) {
                if (vn_._e._g[n] != null) {
                    throw new IllegalArgumentException();
                }
                vn_._e._g[n] = wn_;
            }
            return wn_;
        }
        catch (Throwable t) {
            return new vn_();
        }
    }
    
    static final void a773(final int t, final boolean g, final int l) {
        if (t < 8000 || t > 48000) {
            throw new IllegalArgumentException();
        }
        vn_._t = t;
        vn_._g = g;
        vn_._l = l;
    }
    
    private final void a150(final int n) {
        this._r -= n;
        if (this._r < 0) {
            this._r = 0;
        }
        if (this._h != null) {
            this._h.a150(n);
        }
    }
    
    void a963(final Component component) throws Exception {
    }
    
    public static void e797() {
        vn_._e = null;
    }
    
    private final void a312(final qb_ l, final int j) {
        final int n = j >> 5;
        final qb_ qb_ = this._n[n];
        if (qb_ == null) {
            this._p[n] = l;
        }
        else {
            qb_._l = l;
        }
        this._n[n] = l;
        l._j = j;
    }
    
    void b797() throws Exception {
    }
    
    vn_() {
        this._d = 32;
        this._u = false;
        this._b = kd_.getTime();
        this._n = new qb_[8];
        this._p = new qb_[8];
        this._o = 0L;
        this._m = 0L;
        this._a = 0;
        this._i = 0;
        this._r = 0;
        this._c = 0;
        this._k = true;
    }
}
