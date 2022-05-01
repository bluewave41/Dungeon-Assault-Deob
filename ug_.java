final class ug_ extends qb_
{
    private int _L;
    private wa_ _W;
    private int[] _O;
    private int[] _q;
    private lp_[][] _u;
    private int[] _J;
    private int[] _U;
    private int[] _m;
    private lp_[][] _r;
    private int _x;
    private int[] _N;
    private int[] _K;
    int[] _Q;
    private vm_ _A;
    private int[] _s;
    private int[] _I;
    int[] _o;
    private int[] _n;
    private int[] _V;
    private int[] _B;
    private int[] _P;
    static int[] _E;
    int[] _G;
    static fd_ _w;
    private long _F;
    private boolean _T;
    private long _z;
    private int _t;
    private int _p;
    static qk_ _y;
    private hg_ _R;
    private vh_ _S;
    private int _v;
    private boolean _D;
    //original name: _M
    static String[] tutorial_raid_complete;
    
    //original signature: final synchronized void d150(final int n) {
    final synchronized void d150() {
        this.c540(true, 100);
    }
    
    private final void a326(final int n, final int n2, final int n3) {
        this._O[n3] = n2;
        this._Q[n3] = (int)(0.5 + 2097152.0 * Math.pow(n, 5.4931640625E-4 * n2));
    }
    
    private final void a548(final boolean b, final int n, final int n2, final int n3) {
        final lp_ lp_ = this._u[n2][n];
        if (lp_ != null) {
            if (!b) {
                this.b397(null, -89, 102);
            }
            this._u[n2][n] = null;
            if ((this._G[n2] & 0x2) != 0x0) {
                for (lp_ lp_2 = (lp_)this._R._q.e024(); null != lp_2; lp_2 = (lp_)this._R._q.a024(4)) {
                    if (lp_2._p == lp_._p && lp_2._r < 0 && lp_2 != lp_) {
                        lp_._r = 0;
                        break;
                    }
                }
            }
            else {
                lp_._r = 0;
            }
        }
    }
    
    final synchronized void a787(final vh_ vh_, final int n, final boolean b) {
        this.a083(true, -16257, vh_, b);
        if (n != 20938) {
            a776(null);
        }
    }
    
    private final void a679(final byte b, final int n, final int n2) {
        if (b < 70) {
            return;
        }
        if (n != this._P[n2]) {
            this._P[n2] = n;
            for (int i = 0; i < 128; ++i) {
                this._r[n2][i] = null;
            }
        }
    }
    
    //original signature: private final void a430(final int n, final boolean b) {
    private final void a430(final int n) {
        for (lp_ lp_ = (lp_)this._R._q.e024(); null != lp_; lp_ = (lp_)this._R._q.a024(4)) {
            if (0 > n || lp_._p == n) {
                if (null != lp_._v) {
                    lp_._v.f150(vn_._t / 100);
                    if (lp_._v.e801()) {
                        this._R._o.b501(lp_._v);
                    }
                    lp_.b487();
                }
                if (0 > lp_._r) {
                    this._u[lp_._p][lp_._y] = null;
                }
                lp_.a487(false);
            }
        }
    }
    
    final synchronized boolean b427(final byte b) {
        if (b >= -116) {
            this._q = null;
        }
        return this._A.g801();
    }
    
    private final void b679(final byte b, final int n, final int n2) {
        this._J[n2] = n;
        this._K[n2] = nb_.and(-128, n);
        if (b >= -54) {
            this._N = null;
        }
        this.a679((byte)114, n, n2);
    }
    
    private final void a115(final int n, final int n2, final int n3, final int n4) {
        if (n4 < 62) {
            this.f093(-63, 116);
        }
    }
    
    //original signature: final synchronized void f150(final int n) {
    final synchronized void f150() {
        for (kk_ kk_ = (kk_)this._W.a457(true); kk_ != null; kk_ = (kk_)this._W.a024(4318)) {
            kk_.a423((byte)(-97));
        }
    }
    
    private final void d540(final boolean b, final int n) {
        if (b) {
            this.a430(-1);
        }
        else {
            this.b540(true, -1);
        }
        this.e093(-1, 0);
        for (int n2 = 0; 16 > n2; ++n2) {
            this._P[n2] = this._J[n2];
        }
        if (n != 16) {
            this.a769(null);
        }
        for (int i = 0; i < 16; ++i) {
            this._K[i] = nb_.and(this._J[i], -128);
        }
    }
    
    private final void b115(final int n, final int n2, final int n3, final int p4) {
        this.a548(true, n3, p4, 64);
        if (0x0 != (0x2 & this._G[p4])) {
            for (lp_ lp_ = (lp_)this._R._q.d024(-14205); lp_ != null; lp_ = (lp_)this._R._q.g024(20)) {
                if (lp_._p == p4 && lp_._r < 0) {
                    this._u[p4][lp_._y] = null;
                    this._u[p4][n3] = lp_;
                    final int n4 = lp_._s + (lp_._w * lp_._J >> 12);
                    final lp_ lp_2 = lp_;
                    lp_2._s += n3 - lp_._y << 8;
                    lp_._y = n3;
                    lp_._J = n4 - lp_._s;
                    lp_._w = 4096;
                    return;
                }
            }
        }
        final kk_ x = (kk_)this._W.a722(this._P[p4], 8);
        if (x == null) {
            return;
        }
        final va_ i = x._k[n3];
        if (i != null) {
            final lp_ lp_3 = new lp_();
            lp_3._x = x;
            lp_3._I = i;
            lp_3._p = p4;
            lp_3._A = x._n[n3];
            lp_3._D = x._o[n3];
            lp_3._y = n3;
            lp_3._t = 1024 + x._m[n3] * x._j * (n * n) >> 11;
            lp_3._i = (x._p[n3] & 0xFF);
            lp_3._s = (n3 << 8) - (0x7FFF & x._r[n3]);
            lp_3._r = -1;
            lp_3._j = 0;
            lp_3._u = 0;
            lp_3._k = 0;
            lp_3._l = 0;
            if (0 != this._o[p4]) {
                lp_3._v = ni_.a456(i, this.a845((byte)46, lp_3), 0, this.a449(lp_3, false));
                this.a777(lp_3, 4917, x._r[n3] < 0);
            }
            else {
                lp_3._v = ni_.a456(i, this.a845((byte)78, lp_3), this.b786(lp_3, 0), this.a449(lp_3, false));
            }
            if (0 > x._r[n3]) {
                lp_3._v.e150(-1);
            }
            if (lp_3._D >= 0) {
                final lp_ lp_4 = this._r[p4][lp_3._D];
                if (lp_4 != null && 0 > lp_4._r) {
                    this._u[p4][lp_4._y] = null;
                    lp_4._r = 0;
                }
                this._r[p4][lp_3._D] = lp_3;
            }
            this._R._q.a865(lp_3);
            this._u[p4][n3] = lp_3;
        }
    }
    
    private final void f093(final int n, final int n2) {
        if ((this._G[n] & 0x4) != 0x0) {
            for (lp_ lp_ = (lp_)this._R._q.e024(); lp_ != null; lp_ = (lp_)this._R._q.a024(4)) {
                if (n == lp_._p) {
                    lp_._m = 0;
                }
            }
        }
    }
    
    //original signature: final boolean a769(final lp_ lp_, final int n) {
    final boolean a769(final lp_ lp_) {
        if (lp_._v != null) {
            return false;
        }
        if (0 <= lp_._r) {
            lp_.a487(false);
            if (lp_._D > 0 && lp_ == this._r[lp_._p][lp_._D]) {
                this._r[lp_._p][lp_._D] = null;
            }
        }
        return true;
    }
    
    //original signature: private final void a183(final boolean b, final int n, final int n2) {
    private final void a183(final int n, final int index) {
        this._B[index] = n;
    }
    
    private final synchronized void c540(final boolean b, final int n) {
        this._A.c797();
        if (n <= 27) {
            return;
        }
        this._S = null;
        this.d540(b, 16);
    }
    
    private final int a845(final byte b, final lp_ lp_) {
        int n = (lp_._J * lp_._w >> 12) + lp_._s + ((this._B[lp_._p] - 8192) * this._I[lp_._p] >> 12);
        if (b <= 2) {
            this.b397(null, 108, -85);
        }
        final of_ a = lp_._A;
        if (a._i > 0 && (a._h > 0 || 0 < this._U[lp_._p])) {
            int n2 = a._h << 2;
            final int n3 = a._a << 1;
            if (lp_._G < n3) {
                n2 = lp_._G * n2 / n3;
            }
            n += (int)(Math.sin((lp_._E & 0x1FF) * 0.01227184630308513) * (n2 + (this._U[lp_._p] >> 7)));
        }
        final int n4 = (int)(256 * lp_._I._n * Math.pow(2.0, 3.255208333333333E-4 * n) / vn_._t + 0.5);
        return (n4 >= 1) ? n4 : 1;
    }
    
    //original signature: final synchronized void a599(final int n, final int n2, final byte b) {
    final synchronized void a599(final int n, final int n2) {
        if (n2 >= 0) {
            this._V[n2] = n;
        }
        else {
            for (int n3 = 0; 16 > n3; ++n3) {
                this._V[n3] = n;
            }
        }
    }
    
    @Override
    final synchronized void b397(final int[] array, int n, int n2) {
        if (this._A.g801()) {
            final int n3 = this._A._c * this._x / vn_._t;
            do {
                final long z = this._z + n2 * (long)n3;
                if (this._F - z >= 0L) {
                    this._z = z;
                    break;
                }
                final int n4 = (int)((n3 + this._F - this._z - 1L) / n3);
                this._z += n3 * (long)n4;
                this._R.b397(array, n, n4);
                this.a423((byte)(-24));
                n += n4;
                n2 -= n4;
            } while (this._A.g801());
        }
        this._R.b397(array, n, n2);
    }
    
    private final void e093(int n, final int n2) {
        if (n2 > n) {
            for (n = 0; 16 > n; ++n) {
                this.e093(n, n2 + 0);
            }
            return;
        }
        this._q[n] = 12800;
        this._n[n] = 8192;
        this._m[n] = 16383;
        this._B[n] = 8192;
        this._U[n] = 0;
        this._s[n] = 8192;
        this.d093(n, -1);
        this.f093(n, n2 - 108);
        this._G[n] = 0;
        this._N[n] = 32767;
        this._I[n] = 256;
        this._o[n] = 0;
        this.a326(2, 8192, n);
    }
    
    //original signature: static final String a776(final boolean b, final int n, final CharSequence charSequence) {
    static final String a776(final CharSequence charSequence) {
        final String a776 = cm_.a776(charSequence);
        if (a776 != null) {
            return a776;
        }
        for (int i = 0; i < charSequence.length(); ++i) {
            if (!rp_.a624(charSequence.charAt(i))) {
                return me_.create_alert_namechars;
            }
        }
        return null;
    }
    
    @Override
    final synchronized qb_ d207() {
        return this._R;
    }
    
    final synchronized void c679(final byte b, final int n, final int n2) {
        this.b679((byte)(-87), n, n2);
    }
    
    private final synchronized void a083(final boolean b, final int n, final vh_ vh_, final boolean t) {
        this.c540(b, n + 16353);
        this._A.a604(vh_._i);
        this._z = 0L;
        if (n != -16257) {
            this.a787(null, -111, false);
        }
        this._T = t;
        for (int i = this._A.a784(), n2 = 0; i > n2; ++n2) {
            this._A.d150(n2);
            this._A.b150(n2);
            this._A.a150(n2);
        }
        this._p = this._A.b784();
        this._t = this._A._d[this._p];
        this._F = this._A.e138(this._t);
    }
    
    @Override
    final synchronized qb_ c207() {
        return null;
    }
    
    private final void b540(final boolean b, final int n) {
        for (lp_ lp_ = (lp_)this._R._q.e024(); lp_ != null; lp_ = (lp_)this._R._q.a024(4)) {
            if (0 > n || n == lp_._p) {
                if (0 > lp_._r) {
                    this._u[lp_._p][lp_._y] = null;
                    lp_._r = 0;
                }
            }
        }
        if (!b) {
            this._x = 27;
        }
    }
    
    final synchronized void c093(final int l, final int n) {
        if (n != 24509) {
            return;
        }
        this._L = l;
    }
    
    public static void e150() {
        ug_._E = null;
        ug_._y = null;
        ug_.tutorial_raid_complete = null;
        ug_._w = null;
    }
    
    private final void a423(final byte b) {
        if (b != -24) {
            this._V = null;
        }
        int p = this._p;
        int t = this._t;
        long f = this._F;
        if (this._S != null && this._v == t) {
            this.a083(this._D, -16257, this._S, this._T);
            this.a423((byte)(-24));
            return;
        }
        while (this._t == t) {
            while (this._A._d[p] == t) {
                this._A.d150(p);
                final int c137 = this._A.c137(p);
                if (c137 != 0) {
                    this._A.e797();
                    this._A.a150(p);
                    if (!this._A.f801()) {
                        break;
                    }
                    if (null != this._S) {
                        this.a787(this._S, 20938, this._T);
                        this.a423((byte)(-24));
                        return;
                    }
                    if (this._T && t == 1) {
                        this._A.a111(f);
                        break;
                    }
                    this.d540(true, 16);
                    this._A.c797();
                    return;
                }
                else {
                    if (0x0 != (0x80 & c137)) {
                        this.a093(c137, 16384);
                    }
                    this._A.b150(p);
                    this._A.a150(p);
                }
            }
            p = this._A.b784();
            t = this._A._d[p];
            f = this._A.e138(t);
        }
        this._t = t;
        this._F = f;
        this._p = p;
        if (null != this._S && t > this._v) {
            this._p = -1;
            this._t = this._v;
            this._F = this._A.e138(this._t);
        }
    }
    
    final boolean a293(final int n, final int n2, final int n3, final lp_ lp_, final int[] array) {
        lp_._H = vn_._t / 100;
        if (0 <= lp_._r && (null == lp_._v || lp_._v.f801())) {
            lp_.b487();
            lp_.a487(false);
            if (0 < lp_._D) {
                if (this._r[lp_._p][lp_._D] == lp_) {
                    this._r[lp_._p][lp_._D] = null;
                }
            }
            return true;
        }
        final int w = lp_._w;
        if (0 < w) {
            int w2 = w - (int)(Math.pow(2.0, 4.921259842519685E-4 * this._s[lp_._p]) * 16.0 + 0.5);
            if (0 > w2) {
                w2 = 0;
            }
            lp_._w = w2;
        }
        lp_._v.g150(this.a845((byte)119, lp_));
        final of_ a = lp_._A;
        lp_._E += a._i;
        boolean b = false;
        ++lp_._G;
        final double n4 = ((lp_._J * lp_._w >> 12) + (lp_._y - 60 << 8)) * 5.086263020833333E-6;
        if (0 < a._c) {
            if (0 >= a._b) {
                lp_._k += 128;
            }
            else {
                lp_._k += (int)(0.5 + 128.0 * Math.pow(2.0, n4 * a._b));
            }
            if (819200 <= lp_._k * a._c) {
                b = true;
            }
        }
        if (a._n != null) {
            if (a._e <= 0) {
                lp_._u += 128;
            }
            else {
                lp_._u += (int)(Math.pow(2.0, n4 * a._e) * 128.0 + 0.5);
            }
            while (lp_._l < a._n.length - 2 && lp_._u > (a._n[lp_._l + 2] & 0xFF) << 8) {
                lp_._l += 2;
            }
            if (a._n.length - 2 == lp_._l && a._n[1 + lp_._l] == 0) {
                b = true;
            }
        }
        if (0 <= lp_._r && null != a._o && (0x1 & this._G[lp_._p]) == 0x0) {
            if (lp_._D < 0 || this._r[lp_._p][lp_._D] != lp_) {
                if (0 >= a._m) {
                    lp_._r += 128;
                }
                else {
                    lp_._r += (int)(Math.pow(2.0, n4 * a._m) * 128.0 + 0.5);
                }
                while (a._o.length - 2 > lp_._j && (a._o[lp_._j + 2] & 0xFF) << 8 < lp_._r) {
                    lp_._j += 2;
                }
                if (lp_._j == a._o.length - 2) {
                    b = true;
                }
            }
        }
        if (!b) {
            lp_._v.a326(lp_._H, this.b786(lp_, 0), this.a449(lp_, false));
            return false;
        }
        lp_._v.f150(lp_._H);
        if (array != null) {
            lp_._v.b397(array, n2, n3);
        }
        else {
            lp_._v.a150(n3);
        }
        if (lp_._v.e801()) {
            this._R._o.b501(lp_._v);
        }
        lp_.b487();
        if (lp_._r >= 0) {
            lp_.a487(false);
            if (0 < lp_._D) {
                if (this._r[lp_._p][lp_._D] == lp_) {
                    this._r[lp_._p][lp_._D] = null;
                }
            }
        }
        return true;
    }
    
    private final void a093(final int n, final int n2) {
        final int n3 = n & 0xF0;
        if (n3 == 128) {
            this.a548(true, (0x7F9B & n) >> 8, 0xF & n, (0x7FC061 & n) >> 16);
            return;
        }
        if (n3 == 144) {
            final int n4 = n & 0xF;
            final int n5 = n >> 8 & 0x7F;
            final int n6 = (n & 0x7FF4CD) >> 16;
            if (0 >= n6) {
                this.a548(true, n5, n4, 64);
            }
            else {
                this.b115(n6, -29, n5, n4);
            }
            return;
        }
        if (160 == n3) {
            this.a115((n & 0x7F68) >> 8, n >> 16 & 0x7F, n & 0xF, 73);
            return;
        }
        if (176 == n3) {
            final int n7 = 0xF & n;
            final int n8 = n >> 8 & 0x7F;
            final int n9 = (n & 0x7F9FF5) >> 16;
            if (n8 == 0) {
                this._K[n7] = (n9 << 14) + nb_.and(this._K[n7], -2080769);
            }
            if (32 == n8) {
                this._K[n7] = (n9 << 7) + nb_.and(this._K[n7], -16257);
            }
            if (n8 != 0) {
                this._U[n7] = (n9 << 7) + nb_.and(this._U[n7], -16257);
            }
            if (33 == n8) {
                this._U[n7] = nb_.and(-128, this._U[n7]) + n9;
            }
            if (n8 == 5) {
                this._s[n7] = (n9 << 7) + nb_.and(this._s[n7], -16257);
            }
            if (37 == n8) {
                this._s[n7] = n9 + nb_.and(-128, this._s[n7]);
            }
            if (n8 == 7) {
                this._q[n7] = (n9 << 7) + nb_.and(this._q[n7], -16257);
            }
            if (39 == n8) {
                this._q[n7] = nb_.and(-128, this._q[n7]) + n9;
            }
            if (10 == n8) {
                this._n[n7] = (n9 << 7) + nb_.and(this._n[n7], -16257);
            }
            if (n8 == 42) {
                this._n[n7] = n9 + nb_.and(-128, this._n[n7]);
            }
            if (n8 == 11) {
                this._m[n7] = (n9 << 7) + nb_.and(this._m[n7], -16257);
            }
            if (43 == n8) {
                this._m[n7] = n9 + nb_.and(-128, this._m[n7]);
            }
            if (64 == n8) {
                if (64 <= n9) {
                    this._G[n7] = mp_.or(this._G[n7], 1);
                }
                else {
                    this._G[n7] = nb_.and(this._G[n7], -2);
                }
            }
            if (n8 == 65) {
                if (64 <= n9) {
                    this._G[n7] = mp_.or(this._G[n7], 2);
                }
                else {
                    this.d093(n7, -1);
                    this._G[n7] = nb_.and(this._G[n7], -3);
                }
            }
            if (n8 == 99) {
                this._N[n7] = (n9 << 7) + nb_.and(127, this._N[n7]);
            }
            if (n8 == 98) {
                this._N[n7] = nb_.and(16256, this._N[n7]) + n9;
            }
            if (101 == n8) {
                this._N[n7] = (n9 << 7) + 16384 + nb_.and(this._N[n7], 127);
            }
            if (100 == n8) {
                this._N[n7] = nb_.and(this._N[n7], 16256) + (16384 + n9);
            }
            if (120 == n8) {
                this.a430(n7);
            }
            if (121 == n8) {
                this.e093(n7, 0);
            }
            if (n8 == 123) {
                this.b540(true, n7);
            }
            if (n8 == 6) {
                if (16384 == this._N[n7]) {
                    this._I[n7] = nb_.and(-16257, this._I[n7]) + (n9 << 7);
                }
            }
            if (38 == n8 && this._N[n7] == 16384) {
                this._I[n7] = nb_.and(-128, this._I[n7]) + n9;
            }
            if (16 == n8) {
                this._o[n7] = nb_.and(-16257, this._o[n7]) + (n9 << 7);
            }
            if (48 == n8) {
                this._o[n7] = nb_.and(-128, this._o[n7]) + n9;
            }
            if (81 == n8) {
                if (n9 < 64) {
                    this.f093(n7, n2 ^ 0x4022);
                    this._G[n7] = nb_.and(this._G[n7], -5);
                }
                else {
                    this._G[n7] = mp_.or(this._G[n7], 4);
                }
            }
            if (n8 == 17) {
                this.a326(2, (0xFFFFC07F & this._O[n7]) + (n9 << 7), n7);
            }
            if (49 == n8) {
                this.a326(2, n9 + (this._O[n7] & 0xFFFFFF80), n7);
            }
            return;
        }
        if (n3 == 192) {
            final int n10 = 0xF & n;
            this.a679((byte)106, this._K[n10] + (0x7F & n >> 8), n10);
            return;
        }
        if (n2 != 16384) {
            this._m = null;
        }
        if (n3 == 208) {
            return;
        }
        if (224 == n3) {
            this.a183((n >> 9 & 0x3F80) + ((0x7FF9 & n) >> 8), n & 0xF);
            return;
        }
        if ((0xFF & n) != 0xFF) {
            return;
        }
        this.d540(true, 16);
    }
    
    static final int a527(final boolean b, final int n) {
        if (!b) {
            return 34;
        }
        if (65536L <= n) {
            if (n >= 16777216L) {
                if (268435456L <= n) {
                    if (1073741824L <= n) {
                        return lc_._h[n >> 24];
                    }
                    return lc_._h[n >> 22] >> 1;
                }
                else {
                    if (67108864L > n) {
                        return lc_._h[n >> 18] >> 3;
                    }
                    return lc_._h[n >> 20] >> 2;
                }
            }
            else if (1048576L <= n) {
                if (n >= 4194304L) {
                    return lc_._h[n >> 16] >> 4;
                }
                return lc_._h[n >> 14] >> 5;
            }
            else {
                if (n >= 262144L) {
                    return lc_._h[n >> 12] >> 6;
                }
                return lc_._h[n >> 10] >> 7;
            }
        }
        else if (256L > n) {
            if (n >= 0) {
                return lc_._h[n] >> 12;
            }
            return -1;
        }
        else if (n >= 4096L) {
            if (n < 16384L) {
                return lc_._h[n >> 6] >> 9;
            }
            return lc_._h[n >> 8] >> 8;
        }
        else {
            if (n >= 1024L) {
                return lc_._h[n >> 4] >> 10;
            }
            return lc_._h[n >> 2] >> 11;
        }
    }
    
    private final int a449(final lp_ lp_, final boolean b) {
        if (b) {
            this.b786(null, 45);
        }
        final int n = this._n[lp_._p];
        if (8192 > n) {
            return 32 + n * lp_._i >> 6;
        }
        return -((-lp_._i + 128) * (-n + 16384) + 32 >> 6) + 16384;
    }
    
    private final void d093(final int n, final int n2) {
        if (n2 != ~(this._G[n] & 0x2)) {
            for (lp_ lp_ = (lp_)this._R._q.e024(); null != lp_; lp_ = (lp_)this._R._q.a024(4)) {
                if (n == lp_._p) {
                    if (this._u[n][lp_._y] == null) {
                        if (0 > lp_._r) {
                            lp_._r = 0;
                        }
                    }
                }
            }
        }
    }
    
    //original signature: final synchronized void b093(final int x, final int n) {
    final synchronized void b093() {
        this._x = 1000000;
    }
    
    @Override
    final synchronized void a150(int n) {
        if (this._A.g801()) {
            final int n2 = this._x * this._A._c / vn_._t;
            do {
                final long z = n * (long)n2 + this._z;
                if (this._F - z >= 0L) {
                    this._z = z;
                    break;
                }
                final int n3 = (int)((n2 - 1L + this._F - this._z) / n2);
                this._z += n3 * (long)n2;
                this._R.a150(n3);
                n -= n3;
                this.a423((byte)(-24));
            } while (this._A.g801());
        }
        this._R.a150(n);
    }
    
    final synchronized boolean a688(final boolean b, final lc_ lc_, final nh_ nh_, final int n, final vh_ vh_) {
        vh_.a797();
        if (b) {
            this._u = null;
        }
        boolean b2 = true;
        int[] array = null;
        if (n > 0) {
            array = new int[] { n };
        }
        for (mk_ mk_ = (mk_)vh_._j.a457(true); mk_ != null; mk_ = (mk_)vh_._j.a024(4318)) {
            final int n2 = (int)mk_._h;
            kk_ a204 = (kk_)this._W.a722(n2, 8);
            if (a204 == null) {
                a204 = dl_.a204(n2, nh_);
                if (a204 == null) {
                    b2 = false;
                    continue;
                }
                this._W.a102(a204, 12460, n2);
            }
            if (!a204.a920((byte)45, lc_, array, mk_._k)) {
                b2 = false;
            }
        }
        if (b2) {
            vh_.b797();
        }
        return b2;
    }
    
    private final int b786(final lp_ lp_, final int n) {
        if (this._V[lp_._p] != 0) {
            final of_ a = lp_._A;
            final int n2 = 4096 + this._q[lp_._p] * this._m[lp_._p] >> 13;
            int n3 = this._V[lp_._p] * ((16384 + (n2 * n2 + 16384 >> 15) * lp_._t >> 15) * this._L + 128 >> 8) + 128 >> 8;
            if (a._c > 0) {
                n3 = (int)(Math.pow(0.5, lp_._k * 1.953125E-5 * a._c) * n3 + 0.5);
            }
            if (null != a._n) {
                final int u = lp_._u;
                int n4 = a._n[lp_._l + 1];
                if (lp_._l < a._n.length - 2) {
                    final int n5 = 0xFF00 & a._n[lp_._l] << 8;
                    n4 += (-n4 + a._n[3 + lp_._l]) * (-n5 + u) / (((0xFF & a._n[2 + lp_._l]) << 8) - n5);
                }
                n3 = n4 * n3 + 32 >> 6;
            }
            if (n < lp_._r && null != a._o) {
                final int r = lp_._r;
                int n6 = a._o[1 + lp_._j];
                if (lp_._j < a._o.length - 2) {
                    final int n7 = (0xFF & a._o[lp_._j]) << 8;
                    n6 += (-n7 + r) * (-n6 + a._o[lp_._j + 3]) / (((a._o[lp_._j + 2] & 0xFF) << 8) - n7);
                }
                n3 = n3 * n6 + 32 >> 6;
            }
            return n3;
        }
        return 0;
    }
    
    final void a777(final lp_ lp_, final int n, final boolean b) {
        final int length = lp_._I._k.length;
        int n2;
        if (b && lp_._I._j) {
            n2 = (int)((-lp_._I._l + length + length) * (long)this._o[lp_._p] >> 6);
            final int n3 = length << 8;
            if (n2 >= n3) {
                lp_._v.b487(true);
                n2 = n3 + n3 - 1 - n2;
            }
        }
        else {
            n2 = (int)(length * (long)this._o[lp_._p] >> 6);
        }
        lp_._v.i150(n2);
        if (n != 4917) {
            this.a688(false, null, null, 98, null);
        }
    }
    
    public ug_() {
        this._L = 256;
        this._q = new int[16];
        this._u = new lp_[16][128];
        this._O = new int[16];
        this._I = new int[16];
        this._K = new int[16];
        this._m = new int[16];
        this._x = 1000000;
        this._r = new lp_[16][128];
        this._V = new int[16];
        this._J = new int[16];
        this._U = new int[16];
        this._Q = new int[16];
        this._N = new int[16];
        this._B = new int[16];
        this._s = new int[16];
        this._P = new int[16];
        this._n = new int[16];
        this._G = new int[16];
        this._o = new int[16];
        this._A = new vm_();
        this._R = new hg_(this);
        this._W = new wa_(128);
        this.a599(256, -1);
        this.d540(true, 16);
    }
    
    ug_(final ug_ ug_) {
        this._L = 256;
        this._q = new int[16];
        this._u = new lp_[16][128];
        this._O = new int[16];
        this._I = new int[16];
        this._K = new int[16];
        this._m = new int[16];
        this._x = 1000000;
        this._r = new lp_[16][128];
        this._V = new int[16];
        this._J = new int[16];
        this._U = new int[16];
        this._Q = new int[16];
        this._N = new int[16];
        this._B = new int[16];
        this._s = new int[16];
        this._P = new int[16];
        this._n = new int[16];
        this._G = new int[16];
        this._o = new int[16];
        this._A = new vm_();
        this._R = new hg_(this);
        this._W = ug_._W;
        this.a599(256, -1);
        this.d540(true, 16);
    }
    
    static {
        ug_._E = GUICheckbox.b330(0, 0, 64);
        ug_._w = new fd_(2);
        ug_.tutorial_raid_complete = new String[] { "Hoard Room", "Well done! By reaching the <%highlight>hoard room</col> you have claimed possession of this dungeon. It is now yours to defend against other players. When you raid the dungeon of another player, their dragon will occupy this central tile instead, and you will have the opportunity to steal a portion of their Treasure and Renown.<br><br><%command>For now, end this game (by clicking Exit) and we will move on to Dungeon Construction.</col>" };
    }
}
