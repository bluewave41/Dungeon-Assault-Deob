import java.util.*;

final class wg_
{
    private int[] _h;
    private int _t;
    private static int[] _r;
    int _o;
    private int[] _g;
    private static int[] _q;
    private fh_ _n;
    private fh_ _f;
    private fh_ _m;
    private fh_ _d;
    private int _k;
    private fh_ _i;
    private bi_ _x;
    private fh_ _v;
    private int[] _u;
    private fh_ _c;
    private fh_ _p;
    private static int[] _b;
    int _s;
    private fh_ _l;
    private static int[] _y;
    private static int[] _j;
    private static int[] _a;
    private static int[] _e;
    private static int[] _w;
    
    final int[] a111(final int n, final int n2) {
        cj_.a397(wg_._r, 0, n);
        if (n2 < 10) {
            return wg_._r;
        }
        final double n3 = n / (n2 + 0.0);
        this._d.a797();
        this._m.a797();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (this._n != null) {
            this._n.a797();
            this._v.a797();
            n4 = (int)((this._n._j - this._n._c) * 32.768 / n3);
            n5 = (int)(this._n._c * 32.768 / n3);
        }
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        if (this._p != null) {
            this._p.a797();
            this._c.a797();
            n7 = (int)((this._p._j - this._p._c) * 32.768 / n3);
            n8 = (int)(this._p._c * 32.768 / n3);
        }
        for (int i = 0; i < 5; ++i) {
            if (this._g[i] != 0) {
                wg_._w[i] = 0;
                wg_._a[i] = (int)(this._u[i] * n3);
                wg_._e[i] = (this._g[i] << 14) / 100;
                wg_._j[i] = (int)((this._d._j - this._d._c) * 32.768 * Math.pow(1.0057929410678534, this._h[i]) / n3);
                wg_._y[i] = (int)(this._d._c * 32.768 / n3);
            }
        }
        for (int j = 0; j < n; ++j) {
            int a137 = this._d.a137(n);
            int a138 = this._m.a137(n);
            if (this._n != null) {
                final int a139 = this._n.a137(n);
                a137 += this.a313(n6, this._v.a137(n), this._n._d) >> 1;
                n6 += (a139 * n4 >> 16) + n5;
            }
            if (this._p != null) {
                final int a140 = this._p.a137(n);
                a138 = a138 * ((this.a313(n9, this._c.a137(n), this._p._d) >> 1) + 32768) >> 15;
                n9 += (a140 * n7 >> 16) + n8;
            }
            for (int k = 0; k < 5; ++k) {
                if (this._g[k] != 0) {
                    final int n10 = j + wg_._a[k];
                    if (n10 < n) {
                        final int[] r = wg_._r;
                        final int n11 = n10;
                        r[n11] += this.a313(wg_._w[k], a138 * wg_._e[k] >> 15, this._d._d);
                        final int[] w = wg_._w;
                        final int n12 = k;
                        w[n12] += (a137 * wg_._j[k] >> 16) + wg_._y[k];
                    }
                }
            }
        }
        if (this._i != null) {
            this._i.a797();
            this._l.a797();
            int n13 = 0;
            boolean b = true;
            for (int l = 0; l < n; ++l) {
                final int a141 = this._i.a137(n);
                final int a142 = this._l.a137(n);
                int n14;
                if (b) {
                    n14 = this._i._c + ((this._i._j - this._i._c) * a141 >> 8);
                }
                else {
                    n14 = this._i._c + ((this._i._j - this._i._c) * a142 >> 8);
                }
                n13 += 256;
                if (n13 >= n14) {
                    n13 = 0;
                    b = !b;
                }
                if (b) {
                    wg_._r[l] = 0;
                }
            }
        }
        if (this._k > 0 && this._t > 0) {
            int n16;
            for (int n15 = n16 = (int)(this._k * n3); n16 < n; ++n16) {
                final int[] r2 = wg_._r;
                final int n17 = n16;
                r2[n17] += wg_._r[n16 - n15] * this._t / 100;
            }
        }
        if (this._x._e[0] > 0 || this._x._e[1] > 0) {
            this._f.a797();
            int n18 = this._f.a137(n + 1);
            int n19 = this._x.a197(0, n18 / 65536.0f);
            int n20 = this._x.a197(1, n18 / 65536.0f);
            if (n >= n19 + n20) {
                int n21 = 0;
                int n22 = n20;
                if (n22 > n - n19) {
                    n22 = n - n19;
                }
                while (n21 < n22) {
                    int n23 = (int)(wg_._r[n21 + n19] * (long)bi_._d >> 16);
                    for (int n24 = 0; n24 < n19; ++n24) {
                        n23 += (int)(wg_._r[n21 + n19 - 1 - n24] * (long)bi_._c[0][n24] >> 16);
                    }
                    for (int n25 = 0; n25 < n21; ++n25) {
                        n23 -= (int)(wg_._r[n21 - 1 - n25] * (long)bi_._c[1][n25] >> 16);
                    }
                    wg_._r[n21] = n23;
                    n18 = this._f.a137(n + 1);
                    ++n21;
                }
                int n26 = 128;
                while (true) {
                    if (n26 > n - n19) {
                        n26 = n - n19;
                    }
                    while (n21 < n26) {
                        int n27 = (int)(wg_._r[n21 + n19] * (long)bi_._d >> 16);
                        for (int n28 = 0; n28 < n19; ++n28) {
                            n27 += (int)(wg_._r[n21 + n19 - 1 - n28] * (long)bi_._c[0][n28] >> 16);
                        }
                        for (int n29 = 0; n29 < n20; ++n29) {
                            n27 -= (int)(wg_._r[n21 - 1 - n29] * (long)bi_._c[1][n29] >> 16);
                        }
                        wg_._r[n21] = n27;
                        n18 = this._f.a137(n + 1);
                        ++n21;
                    }
                    if (n21 >= n - n19) {
                        break;
                    }
                    n19 = this._x.a197(0, n18 / 65536.0f);
                    n20 = this._x.a197(1, n18 / 65536.0f);
                    n26 += 128;
                }
                while (n21 < n) {
                    int n30 = 0;
                    for (int n31 = n21 + n19 - n; n31 < n19; ++n31) {
                        n30 += (int)(wg_._r[n21 + n19 - 1 - n31] * (long)bi_._c[0][n31] >> 16);
                    }
                    for (int n32 = 0; n32 < n20; ++n32) {
                        n30 -= (int)(wg_._r[n21 - 1 - n32] * (long)bi_._c[1][n32] >> 16);
                    }
                    wg_._r[n21] = n30;
                    this._f.a137(n + 1);
                    ++n21;
                }
            }
        }
        for (int n33 = 0; n33 < n; ++n33) {
            if (wg_._r[n33] < -32768) {
                wg_._r[n33] = -32768;
            }
            if (wg_._r[n33] > 32767) {
                wg_._r[n33] = 32767;
            }
        }
        return wg_._r;
    }
    
    private final int a313(final int n, final int n2, final int n3) {
        if (n3 == 1) {
            if ((n & 0x7FFF) < 16384) {
                return n2;
            }
            return -n2;
        }
        else {
            if (n3 == 2) {
                return wg_._b[n & 0x7FFF] * n2 >> 14;
            }
            if (n3 == 3) {
                return ((n & 0x7FFF) * n2 >> 14) - n2;
            }
            if (n3 == 4) {
                return wg_._q[n / 2607 & 0x7FFF] * n2;
            }
            return 0;
        }
    }
    
    final void a962(final ec_ ec_) {
        (this._d = new fh_()).b962(ec_);
        (this._m = new fh_()).b962(ec_);
        if (ec_.readByte() != 0) {
            --ec_.currentIndex;
            (this._n = new fh_()).b962(ec_);
            (this._v = new fh_()).b962(ec_);
        }
        if (ec_.readByte() != 0) {
            --ec_.currentIndex;
            (this._p = new fh_()).b962(ec_);
            (this._c = new fh_()).b962(ec_);
        }
        if (ec_.readByte() != 0) {
            --ec_.currentIndex;
            (this._i = new fh_()).b962(ec_);
            (this._l = new fh_()).b962(ec_);
        }
        for (int i = 0; i < 10; ++i) {
            final int d410 = ec_.d410();
            if (d410 == 0) {
                break;
            }
            this._g[i] = d410;
            this._h[i] = ec_.l137();
            this._u[i] = ec_.d410();
        }
        this._k = ec_.d410();
        this._t = ec_.d410();
        this._s = ec_.readShort();
        this._o = ec_.readShort();
        this._x = new bi_();
        this._f = new fh_();
        this._x.a739(ec_, this._f);
    }
    
    public static void a797() {
        wg_._r = null;
        wg_._q = null;
        wg_._b = null;
        wg_._w = null;
        wg_._a = null;
        wg_._e = null;
        wg_._j = null;
        wg_._y = null;
    }
    
    wg_() {
        this._g = new int[] { 0, 0, 0, 0, 0 };
        this._o = 0;
        this._t = 100;
        this._k = 0;
        this._h = new int[] { 0, 0, 0, 0, 0 };
        this._u = new int[] { 0, 0, 0, 0, 0 };
        this._s = 500;
    }
    
    static {
        wg_._q = new int[32768];
        final Random random = new Random(0L);
        for (int i = 0; i < 32768; ++i) {
            wg_._q[i] = (random.nextInt() & 0x2) - 1;
        }
        wg_._b = new int[32768];
        for (int j = 0; j < 32768; ++j) {
            wg_._b[j] = (int)(Math.sin(j / 5215.1903) * 16384.0);
        }
        wg_._r = new int[220500];
        wg_._y = new int[5];
        wg_._j = new int[5];
        wg_._a = new int[5];
        wg_._e = new int[5];
        wg_._w = new int[5];
    }
}
