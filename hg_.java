final class hg_ extends qb_
{
    private ug_ _m;
    static md_ _n;
    static long _s;
    static int[] _t;
    static wi_ _r;
    //original name: _p
    static String skeleton_sentinels;
    md_ _q;
    mb_ _o;
    
    //original signature: private final void a633(final lp_ lp_, final int[] array, final int n, int n2, int n3, final boolean b) {
    private final void a633(final lp_ lp_, final int[] array, final int n, int n2, int n3) {
        if (0x0 != (0x4 & this._m._G[lp_._p]) && lp_._r < 0) {
            final int n4 = this._m._Q[lp_._p] / vn_._t;
            while (true) {
                final int n5 = (-lp_._m + (1048575 + n4)) / n4;
                if (n5 > n3) {
                    break;
                }
                lp_._v.b397(array, n2, n5);
                n2 += n5;
                lp_._m += n5 * n4 - 1048576;
                n3 -= n5;
                int n6 = vn_._t / 100;
                final int n7 = 262144 / n4;
                if (n7 < n6) {
                    n6 = n7;
                }
                final ni_ v = lp_._v;
                if (this._m._o[lp_._p] != 0) {
                    lp_._v = ni_.a456(lp_._I, v.l784(), 0, v.h784());
                    this._m.a777(lp_, 4917, lp_._x._r[lp_._y] < 0);
                    lp_._v.a093(n6, v.i784());
                }
                else {
                    lp_._v = ni_.a456(lp_._I, v.l784(), v.i784(), v.h784());
                }
                if (0 > lp_._x._r[lp_._y]) {
                    lp_._v.e150(-1);
                }
                v.f150(n6);
                v.b397(array, n2, -n2 + n);
                if (!v.e801()) {
                    continue;
                }
                this._o.b501(v);
            }
            lp_._m += n3 * n4;
        }
        lp_._v.b397(array, n2, n3);
    }
    
    static final void a326(final int n, final int n2, final int n3) {
        if (null == kc_._Q || kc_._Q.length < n3) {
            kc_._Q = new int[n3 * 2];
        }
        if (i_._t == null || n3 > i_._t.length) {
            i_._t = new int[n3 * 2];
        }
        if (null == mf_._d || n3 > mf_._d.length) {
            mf_._d = new int[n3 * 2];
        }
        if (wa_._m == null || n3 > wa_._m.length) {
            wa_._m = new int[n3 * 2];
        }
        if (null == tc_._w || n3 > tc_._w.length) {
            tc_._w = new int[n3 * 2];
        }
        if (null == ci_._n || n3 > ci_._n.length) {
            ci_._n = new int[n3 * 2];
        }
        if (ol_._k == null || n3 + n2 > ol_._k.length) {
            ol_._k = new int[2 * (n2 + n3)];
        }
        if (HeaderLabelText._e == null || n3 > HeaderLabelText._e.length) {
            HeaderLabelText._e = new boolean[n3 * 2];
        }
        ln_._d = Integer.MIN_VALUE;
        n_._d = Integer.MIN_VALUE;
        ib_._e = Integer.MAX_VALUE;
        da_._B = Integer.MAX_VALUE;
        if (n != 31751) {
            a326(59, -22, 8);
        }
        lc_._d = 0;
    }
    
    private final void a946(final int n, final lp_ lp_, int n2) {
        if (0x0 != (0x4 & this._m._G[lp_._p]) && lp_._r < 0) {
            final int n3 = this._m._Q[lp_._p] / vn_._t;
            final int n4 = (-lp_._m + n3 + 1048575) / n3;
            lp_._m = (0xFFFFF & n3 * n2 + lp_._m);
            if (n2 >= n4) {
                if (0 != this._m._o[lp_._p]) {
                    lp_._v = ni_.a456(lp_._I, lp_._v.l784(), 0, lp_._v.h784());
                    this._m.a777(lp_, 4917, lp_._x._r[lp_._y] < 0);
                }
                else {
                    lp_._v = ni_.a456(lp_._I, lp_._v.l784(), lp_._v.i784(), lp_._v.h784());
                }
                if (0 > lp_._x._r[lp_._y]) {
                    lp_._v.e150(-1);
                }
                n2 = lp_._m / n3;
            }
        }
        if (n >= -71) {
            hg_._t = null;
        }
        lp_._v.a150(n2);
    }
    
    @Override
    final int return8() {
        return 0;
    }
    
    @Override
    final void a150(final int n) {
        this._o.a150(n);
    Label_0108:
        for (lp_ lp_ = (lp_)this._q.e024(); lp_ != null; lp_ = (lp_)this._q.a024(4)) {
            if (!this._m.a769(lp_)) {
                int n2 = n;
                while (lp_._H < n2) {
                    this.a946(-72, lp_, lp_._H);
                    n2 -= lp_._H;
                    if (!this._m.a293(-127, 0, n2, lp_, null)) {
                        continue;
                    }
                    continue Label_0108;
                }
                this.a946(-84, lp_, n2);
                final lp_ lp_2 = lp_;
                lp_2._H -= n2;
            }
        }
    }
    
    @Override
    final qb_ c207() {
        while (true) {
            final lp_ lp_ = (lp_)this._q.a024(4);
            if (lp_ == null) {
                return null;
            }
            if (null != lp_._v) {
                return lp_._v;
            }
        }
    }
    
    public static void d150() {
        hg_._r = null;
        hg_.skeleton_sentinels = null;
        hg_._n = null;
        hg_._t = null;
    }
    
    @Override
    final qb_ d207() {
        final lp_ lp_ = (lp_)this._q.e024();
        if (null == lp_) {
            return null;
        }
        if (null == lp_._v) {
            return this.c207();
        }
        return lp_._v;
    }
    
    @Override
    final void b397(final int[] array, final int n, final int n2) {
        this._o.b397(array, n, n2);
    Label_0153:
        for (lp_ lp_ = (lp_)this._q.e024(); null != lp_; lp_ = (lp_)this._q.a024(4)) {
            if (!this._m.a769(lp_)) {
                int i = n2;
                int n3 = n;
                while (i > lp_._H) {
                    this.a633(lp_, array, i + n3, n3, lp_._H);
                    i -= lp_._H;
                    n3 += lp_._H;
                    if (!this._m.a293(118, n3, i, lp_, array)) {
                        continue;
                    }
                    continue Label_0153;
                }
                this.a633(lp_, array, n3 + i, n3, i);
                final lp_ lp_2 = lp_;
                lp_2._H -= i;
            }
        }
    }
    
    hg_(final ug_ m) {
        this._q = new md_();
        this._o = new mb_();
        this._m = m;
    }
    
    static {
        hg_._n = new md_();
        hg_.skeleton_sentinels = "Skeleton Sentinels";
    }
}
