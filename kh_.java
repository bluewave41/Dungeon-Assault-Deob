final class kh_ extends ip_
{
    private boolean _p;
    private String _o;
    private static long[] _q;
    //original name: _r
    static Graphic revive_icon;
    static int _t;
    static int _n;
    static en_ _u;
    static boolean _s;
    //original name: _m
    static Graphic[] cursor;
    
    final void e487(final boolean b) {
        if (!b) {
            return;
        }
        this._o = null;
    }
    
    public static void e423() {
        kh_._q = null;
        kh_.cursor = null;
        kh_.revive_icon = null;
        kh_._u = null;
    }
    
    static final void e150() {
        jh_.c797();
        if (null == DungeonPath._c) {
            bn_._f = new Graphic(378, 300);
            DungeonPath._c = new Graphic(410, 332);
            DungeonPath._c._A = -16;
            DungeonPath._c._w = -16;
        }
        bn_._f.e797();
        gf_.a797();
        for (int n = 0; 7 > n; ++n) {
            int n2 = 27 * (-n + 6);
            final int n3 = 20 * n;
            int n4 = -n + 6;
            for (int n5 = 0; 1 + n > n5; ++n5, n2 += 54) {
                final int n6 = 16777215;
                if (null != qj_.dungeonLayout[n4]) {
                    if (n4 != 0 && n4 != 6) {
                        rl_._d[5].e326(n2, n3, n6);
                    }
                    if (n4 != 6) {
                        if (48 != n4) {
                            rl_._d[4].e326(27 + n2, n3, n6);
                        }
                    }
                    ed_.a587(n3, n2, n4, n6);
                    rl_._d[4].e326(n2, n3 + 20, n6);
                    rl_._d[5].e326(27 + n2, 20 + n3, n6);
                }
                n4 += 8;
            }
        }
        for (int n7 = 7; 13 > n7; ++n7) {
            int n8 = 27 * n7 - 162;
            final int n9 = 20 * n7;
            int n10 = n7 * 7 - 42;
            for (int n11 = 0; 13 - n7 > n11; ++n11, n8 += 54) {
                final int n12 = 16777215;
                if (null != qj_.dungeonLayout[n10]) {
                    rl_._d[5].e326(n8, n9, n12);
                    rl_._d[4].e326(27 + n8, n9, n12);
                    ed_.a587(n9, n8, n10, n12);
                    rl_._d[5].e326(27 + n8, n9 + 20 + 0, n12);
                    rl_._d[4].e326(n8, n9 + 20 - 0, n12);
                }
                n10 += 8;
            }
        }
        DungeonPath._c.e797();
        gf_.a797();
        bn_._f.e326(16, 16, 8454143);
        gf_.d669(8, 8, 0, 0, DungeonPath._c.imageWidth, DungeonPath._c.imageHeight);
        bn_._f.e326(16, 16, 0);
        jh_.b797();
    }
    
    static final boolean d427() {
        if (-1 == nj_._b) { //this would run if the first login byte wasn't 0
            if (!oi_.readServerData(1)) {
                return false;
            }
            nj_._b = ra_._c.readByte();
            ra_._c.currentIndex = 0;
        }
        if (nj_._b == -2) { //whats this?
            if (!oi_.readServerData(2)) {
                return false;
            }
            nj_._b = ra_._c.readShort();
            ra_._c.currentIndex = 0;
        }
        return oi_.readServerData(nj_._b);
    }
    
    static final boolean d491() {
        return null != gi_._S || uc_.g154() || null != mh_._e || GUIButton.g154(-1);
    }
    
    @Override
    final od_ a212(final String o, final int n) {
        if (o_.a017(o)) {
            if (!o.equals(this._o)) {
                final vk_ a041 = vk_.a041(o);
                if (null == a041 || null != a041._g) {
                    return oc_._A;
                }
                this._p = a041._a;
                this._o = o;
            }
            return this._p ? c_._d : pd_._J;
        }
        return pd_._J;
    }
    
    @Override
    final String a439(final byte b, final String o) {
        final String a430 = jg_.a430(o);
        if (null != a430) {
            return a430;
        }
        if (!o.equals(this._o)) {
            final vk_ a431 = vk_.a041(o);
            if (null == a431 || null != a431._g) {
                return null;
            }
            this._p = a431._a;
            this._o = o;
        }
        if (!this._p) {
            return fp_.create_username_unavailable;
        }
        if (b < 44) {
            return null;
        }
        return ng_.create_username_available;
    }
    
    kh_(final rm_ rm_) {
        super(rm_);
        this._p = false;
    }
    
    static {
        kh_._q = new long[256];
        for (int i = 0; i < 256; ++i) {
            long n = i;
            for (int j = 0; j < 8; ++j) {
                if ((0x1L & n) == 0x1L) {
                    n = (n >>> 1 ^ 0xC96C5795D7870F42L);
                }
                else {
                    n >>>= 1;
                }
            }
            kh_._q[i] = n;
        }
    }
}
