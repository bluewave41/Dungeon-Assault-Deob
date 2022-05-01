final class bp_
{
	//original name: _h
    static String text_unspent_x;
    private int _b;
    static int[] _e;
    private int[] _f;
    private boolean _a;
    static int _d;
    private int _g;
    //original name: _c
    static String text_raider_trapped_incap;
    
    private final int c080(final int n, final int n2) {
        if (n2 != -13676) {
            this.b093(-126, 111);
        }
        int i = this._f.length;
        while (i <= n) {
            if (this._a) {
                if (i == 0) {
                    i = 1;
                }
                else {
                    i *= this._g;
                }
            }
            else {
                i += this._g;
            }
        }
        return i;
    }
    
    private final void a326(final int b, final int n, final int n2) {
        if (n != 0) {
            return;
        }
        if (this._b < b) {
            this._b = b;
        }
        if (this._f.length <= b) {
            this.d093(-93, b);
        }
        this._f[b] = n2;
    }
    
    private final void d093(final int n, final int n2) {
        final int[] f = new int[this.c080(n2, -13676)];
        cj_.a382(this._f, 0, f, 0, this._f.length);
        this._f = f;
    }
    
    static final um_ a243(final int f, final String a) {
        final ha_ ha_ = new ha_();
        ha_.port = f;
        ha_.hostName = a;
        return ha_;
    }
    
    static final void a131(int f, final Graphic cn_, int j) {
        j += cn_._w;
        f += cn_._A;
        int n = j + f * gf_._i;
        int n2 = 0;
        int v = cn_.imageHeight;
        int y = cn_.imageWidth;
        int n3 = gf_._i - y;
        if (gf_._f > f) {
            final int n4 = -f + gf_._f;
            n2 += y * n4;
            f = gf_._f;
            v -= n4;
            n += n4 * gf_._i;
        }
        int n5 = 0;
        if (v + f > gf_._e) {
            v -= -gf_._e + f + v;
        }
        if (gf_._j > j) {
            final int n6 = gf_._j - j;
            y -= n6;
            j = gf_._j;
            n5 += n6;
            n3 += n6;
            n2 += n6;
            n += n6;
        }
        if (gf_._h < j + y) {
            final int n7 = j + (y - gf_._h);
            n3 += n7;
            y -= n7;
            n5 += n7;
        }
        if (0 >= y || v <= 0) {
            return;
        }
        id_.a728(n, 0, v, n5, cn_._B, n2, y, gf_._b, n3);
    }
    
    final void b093(final int n, final int n2) {
        if (0 > n || this._b < n) {
            throw new ArrayIndexOutOfBoundsException(n);
        }
        if (n != this._b) {
            cj_.a382(this._f, n + 1, this._f, n, -n + this._b);
        }
        --this._b;
    }
    
    static final void a883(final Graphic q, final byte b, final String m) {
        lg_._m = m;
        rf_._Q = q;
        if (b != 51) {
            bp_.text_unspent_x = null;
        }
    }
    
    final int a080(final int n, final int n2) {
        if (n != -814) {
            return 73;
        }
        if (n2 > this._b) {
            throw new ArrayIndexOutOfBoundsException(n2);
        }
        return this._f[n2];
    }
    
    public static void a150() {
        bp_.text_raider_trapped_incap = null;
        bp_.text_unspent_x = null;
        bp_._e = null;
    }
    
    final int a410(final byte b) {
        if (b > -36) {
            return 3;
        }
        return 1 + this._b;
    }
    
    final void e093(final int n, final int n2) {
        if (n2 > -66) {
            a883(null, (byte)50, null);
        }
        this.a326(1 + this._b, 0, n);
    }
    
    static final void b150(final int n) {
        synchronized (in_._C) {
            ++hl_._g;
            je_._i = pj_._x;
            if (0 > ia_._M) {
                for (int i = 0; i < 112; ++i) {
                    qk_._e[i] = false;
                }
                ia_._M = dl_._b;
            }
            else {
                while (dl_._b != ia_._M) {
                    final int n2 = ih_._r[dl_._b];
                    dl_._b = (0x7F & dl_._b + 1);
                    if (0 > n2) {
                        qk_._e[~n2] = false;
                    }
                    else {
                        qk_._e[n2] = true;
                    }
                }
            }
            if (n <= 28) {
                return;
            }
            pj_._x = ka_._c;
        }
    }
    
    private bp_() throws Throwable {
        throw new Error();
    }
    
    static {
        bp_.text_unspent_x = "Treasure: <col=DB0100><%0></col>";
        bp_.text_raider_trapped_incap = "Your raider was trapped and incapacitated.";
        bp_._e = new int[8];
    }
}
