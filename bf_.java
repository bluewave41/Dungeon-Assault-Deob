final class bf_
{
    private int[] _n;
    //original name: _k
    static int gamePort2;
    private int[] _j;
    private int[] _a;
    static qe_[] _f;
    private int[] _l;
    static ge_ _h;
    private int _g;
    static int _b;
    //original name: _d
    static Graphic smoke;
    static String _o;
    private int[] _c;
    private int[] _i;
    //original name: _m
    static HeaderLabelText profileHeaderLabel;
    //original name: _e
    static Graphic[] sac_icon;
    
    private final void a093(final int n, final int n2) {
        this._l = new int[200];
        if (n2 != 31) {
            return;
        }
        this._a = new int[200];
        this._g = 0;
        this._j = new int[200];
        this._c = new int[200];
        final int n3 = n & 0xFF00FF;
        final int n4 = n & 0xFF00;
        this._i = new int[64];
        for (int n5 = 0; 64 > n5; ++n5) {
            this._i[n5] = (((n5 << 2) * n3 & 0xFF00FF00) | (0xFF0000 & (n5 << 2) * n4)) >> 8;
        }
        final int n6 = n & 0xFF00;
        final int n7 = n & 0xFF00FF;
        this._n = new int[32];
        for (int i = 0; i < 16; ++i) {
            this._n[31 - i] = (this._n[i] = ((i * n6 & 0xFF000) | (0xFF00FF0 & n7 * i)) >> 4);
        }
    }
    
    static final void a966(final String s, final tg_ tg_, final int n, final se_ se_) {
        int n2 = 0;
        int n3 = -1;
        for (int n4 = 1; s.length() > n4; ++n4) {
            final char char1 = s.charAt(n4);
            if (char1 == '<') {
                n3 = tg_._k[0] + ((n2 >> 8) + se_.b926(s.substring(0, n4)));
            }
            if (-1 == n3) {
                if (char1 == ' ') {
                    n2 += n;
                }
                tg_._k[n4] = tg_._k[0] + ((n2 >> 8) + se_.b926(s.substring(0, 1 + n4))) - se_.a371(char1);
            }
            else {
                tg_._k[n4] = n3;
            }
            if ('>' == char1) {
                n3 = -1;
            }
        }
    }
    
    //original signature: static final void a540(final boolean b) {
    static final void drawBorder(final boolean b) {
        gf_.a331(kd_._g);
        gf_.e115(41, 48, 599, 416);
        if (!b) {
            for (int n = 41; 599 > n; n += df_.main_center.imageWidth2) {
                df_.main_center.c093(n, 48);
            }
        }
        else {
            final int b2 = oi_.getRandom(3);
            final int b3 = oi_.getRandom(3);
            dm_._d[b2].c093(41, 48);
            qi_._f[b3].c093(-qi_._f[0].imageWidth + 599, 48);
            df_.main_center.c093(41 + dm_._d[b2].imageWidth, 48);
        }
        //top pieces
        gf_.b331(kd_._g);
        c_.a842(0);
        c_.a842(40);
        
        //side pieces?
        jc_.a669(432, 33, 48, 1, 2, 1);
        jc_.a669(432, 599, 48, 1, 2, 1);
        
        //top bars
        jc_.a669(32, 164, 8, 1, 2, 1);
        jc_.a669(32, 468, 8, 1, 2, 1);
        
        //bottom bar?
        vd_.a669(558, 1, 1, 41, 416);
        
        ad_.interface_crescent.h093(41, 48);
        ad_.interface_crescent.j093(-ad_.interface_crescent.imageWidth + 599, 48);
        ad_.interface_crescent.f093(164 - ad_.interface_crescent.imageWidth, 40 - ad_.interface_crescent.imageHeight);
        ad_.interface_crescent.i093(172, -ad_.interface_crescent.imageHeight + 40);
        ad_.interface_crescent.f093(-ad_.interface_crescent.imageWidth + 468, -ad_.interface_crescent.imageHeight + 40);
        ad_.interface_crescent.i093(476, -ad_.interface_crescent.imageHeight + 40);
    }
    
    final void a668(final int n, final int n2, final boolean b, final int n3) {
        gf_.f115(n2, n, n3 >> 1, 0);
        gf_.h115(n2, n, n3 >> 1, this._i[63]);
        int n4 = 0;
        if (!b) {
            return;
        }
        while (200 > n4) {
            final int n5 = ((this._l[n4] >> 4) * (this._l[n4] >> 4) + (this._a[n4] >> 4) * (this._a[n4] >> 4)) / 3;
            if (0 < n5) {
                int n6 = n5 >> 4;
                final int n7 = (int)(this._l[n4] * n3 / Math.sqrt(3 * n5));
                if (n6 > 63) {
                    n6 = 63;
                }
                gf_.b907((n7 >> 1) + (n2 << 4), ((int)(n3 * this._a[n4] / Math.sqrt(n5 * 3)) >> 1) + (n << 4), n5 * n3 >> 10, n6, this._i);
            }
            ++n4;
        }
        gf_.g050(n2, n, n3 >> 1, 0, 50);
        gf_.a907(n2 << 4, n << 4, n3 + 2 << 4 >> 1, 192, this._n);
        gf_.a907(n2 << 4, n << 4, 2 + n3 << 3, 192, this._n);
        gf_.a907(n2 << 4, n << 4, n3 + 2 << 3, 192, this._n);
        gf_.a907(n2 << 4, n << 4, 2 + n3 << 3, 192, this._n);
    }
    
    public static void a423(final byte b) {
        bf_._o = null;
        bf_._f = null;
        if (b != 85) {
            return;
        }
        bf_.profileHeaderLabel = null;
        bf_.smoke = null;
        bf_.sac_icon = null;
        bf_._h = null;
    }
    
    //original signature: static final void b150(final int n) {
    static final void b150() {
        final wj_ c = ra_._c;
        final int c2 = c.readByte();
        pm_ pm_;
        for (pm_ = (pm_)li_._a.e024(); null != pm_ && pm_._j != c2; pm_ = (pm_)li_._a.a024(4)) {}
        if (null != pm_) {
            final int i = c.readByte();
            if (i != 0) {
                ah_._c[0] = tc_.playerTitle;
                final int j = pm_._i;
                for (int n2 = 1; i > n2; ++n2) {
                    ah_._c[n2] = c.d738();
                }
                hg_.a326(31751, j, i);
                for (int n3 = 0; i > n3; ++n3) {
                    dj_.a330(c, (byte)123);
                    if (n3 == 0) {
                        oc_.a802(n3, dh_._g, cm_._P, fm_._g, ln_._e);
                    }
                    else {
                        oc_.a802(n3, dh_._g, cm_._P, fm_._g, ln_._e);
                    }
                }
                kj_.a093(j, 0);
                final String[][] array = new String[2][j];
                final int[][] array2 = new int[2][j * 4];
                final int k = lc_._d;
                int n4 = 0;
                int n5 = 0;
                while (k > n4) {
                    final int n6 = ol_._k[n4];
                    array[0][n5] = ah_._c[n6];
                    array2[0][n5 * 4] = i_._t[n6];
                    array2[0][1 + n5 * 4] = mf_._d[n6];
                    array2[0][2 + n5 * 4] = wa_._m[n6];
                    array2[0][4 * n5 + 3] = tc_._w[n6];
                    if (Animation.a213(ah_._c[n6]) && wa_._m[n6] + mf_._d[n6] + tc_._w[n6] == 0) {
                        array[0][n5] = null;
                        --n5;
                    }
                    ++n5;
                    ++n4;
                }
                for (int l = 0, n7 = 0; l < k; ++l, ++n7) {
                    final int n8 = ol_._k[l + j];
                    array[1][n7] = ah_._c[n8];
                    array2[1][n7 * 4] = i_._t[n8];
                    array2[1][4 * n7 + 1] = mf_._d[n8];
                    array2[1][4 * n7 + 2] = wa_._m[n8];
                    array2[1][n7 * 4 + 3] = tc_._w[n8];
                    if (Animation.a213(ah_._c[n8])) {
                        if (tc_._w[n8] + wa_._m[n8] + mf_._d[n8] == 0) {
                            array[1][n7] = null;
                            --n7;
                        }
                    }
                }
            }
            pm_.a487(false);
            return;
        }
        tl_.a150(-32);
    }
    
    final void a150(final int n) {
        if (n > -84) {
            return;
        }
        for (int i = 0; i < 200; ++i) {
            if (this._l[i] < this._c[i]) {
                final int[] l = this._l;
                final int n2 = i;
                l[n2] += 6;
            }
            if (this._c[i] < this._l[i]) {
                final int[] j = this._l;
                final int n3 = i;
                j[n3] -= 3;
            }
            if (this._j[i] > this._a[i]) {
                final int[] a = this._a;
                final int n4 = i;
                a[n4] += 3;
            }
            if (this._a[i] > this._j[i]) {
                final int[] a2 = this._a;
                final int n5 = i;
                a2[n5] -= 6;
            }
        }
        final int n6 = 864 + oi_.getRandom(160);
        final double n7 = 0.01 * oi_.getRandom(21400);
        this._c[this._g] = (int)(n6 * Math.sin(n7));
        this._j[this._g] = (int)(n6 * Math.cos(n7));
        ++this._g;
        if (this._g >= 200) {
            this._g = 0;
        }
    }
    
    static final int a586(int i, int n) {
        int n2 = 1;
        while (i > 1) {
            if ((0x1 & i) != 0x0) {
                n2 *= n;
            }
            i >>= 1;
            n *= n;
        }
        if (i == 1) {
            return n2 * n;
        }
        return n2;
    }
    
    static final void a311(final int n, final int n2, final int n3, final int n4, final String s) {
        kn_.loadRaiderVoices(n3, s + "_defeat", n2, n, 96, s + "_special", s + "_reveal");
        if (n4 != -18228) {
            a423((byte)(-43));
        }
    }
    
    bf_(final int n) {
        this.a093(n, 31);
        for (int i = 0; i < 100; ++i) {
            this.a150(-105);
        }
    }
    
    static {
        bf_._f = new qe_[14];
    }
}
