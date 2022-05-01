abstract class qe_
{
    static int _a;
    static int _j;
    static int _n;
    static int _l;
    //original name: _i
    static Graphic[] raiderStats;
    ph_ _e;
    private static int _d;
    private static RaidMemberStatusIcon[] _k;
    sa_ _q;
    static int _f;
    private static int[][] _g;
    static int _c;
    md_ _p;
    private static int[][] _h;
    kl_ _b;
    //original name: _o
    private static Graphic[] trapStats;
    private static int[] _m;
    
    final void b797() {
        if (this._p != null) {
            for (rj_ rj_ = (rj_)this._p.e024(); rj_ != null; rj_ = (rj_)this._p.a024(4)) {
                rj_.b423((byte)30);
            }
        }
        this._p = new md_();
    }
    
    static final void a050(int j, final int n, int n2, final int n3, final int n4) {
        if (n < gf_._f || n >= gf_._e) {
            return;
        }
        if (j < gf_._j) {
            n2 -= gf_._j - j;
            j = gf_._j;
        }
        if (j + n2 > gf_._h) {
            n2 = gf_._h - j;
        }
        final int n5 = 256 - n4;
        final int n6 = (n3 >> 16 & 0xFF) * n4;
        final int n7 = (n3 >> 8 & 0xFF) * n4;
        final int n8 = (n3 & 0xFF) * n4;
        int n9 = j + n * gf_._i;
        for (int i = 0; i < n2; ++i) {
            gf_._b[n9++] = ((gf_._b[n9] & 0xFF000000) | (n6 + (gf_._b[n9] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (gf_._b[n9] >> 8 & 0xFF) * n5 >> 8 << 8) + (n8 + (gf_._b[n9] & 0xFF) * n5 >> 8));
        }
    }
    
    private static final void a903(final int[] array, final int[] array2, int n, int n2, int n3, int i) {
        while (i >= 0) {
            final int n4 = array[i] >>> 25 & 0xFF;
            if (n4 != 0) {
                n = array2[i];
                n = 256 - (n4 * (256 - n) >> 8);
                n2 = array[i];
                n3 = (n2 & 0xFF00);
                n2 &= 0xFF00FF;
                n2 *= n;
                n3 *= n;
                n2 &= 0xFF00FF00;
                n3 &= 0xFF0000;
                array[i] = ((n2 | n3) >>> 8 | 0x10101);
            }
            --i;
        }
    }
    
    static final void a420(final int n, final int n2, final Raider h_) {
        if (h_ != null) {
            b899(n, n2, qe_.raiderStats, qe_._h, new int[] { h_.attack, h_.defence, h_.dodge, h_.sneak });
        }
        else {
            b899(n, n2, qe_.raiderStats, qe_._h, new int[] { 0, 0, 0, 0 });
        }
    }
    
    static final void a669(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n2 < gf_._f || n2 >= gf_._e) {
            return;
        }
        if (n < gf_._j) {
            n3 -= gf_._j - n;
            n = gf_._j;
        }
        if (n + n3 > gf_._h) {
            n3 = gf_._h - n;
        }
        int n7 = 256 - n5;
        int n8 = (n4 >> 16 & 0xFF) * n5;
        int n9 = (n4 >> 8 & 0xFF) * n5;
        int n10 = (n4 & 0xFF) * n5;
        n6 <<= 24;
        int n11 = n + n2 * gf_._i;
        for (int i = 0; i < n3; ++i) {
            int n12 = (gf_._b[n11] >> 16 & 0xFF) * n7;
            int n13 = (gf_._b[n11] >> 8 & 0xFF) * n7;
            int n14 = (gf_._b[n11] & 0xFF) * n7;
            int n15 = (n8 + n12 >> 8 << 16) + (n9 + n13 >> 8 << 8) + (n10 + n14 >> 8);
            gf_._b[n11++] = n6 | n15;
        }
    }
    
    //original signature: static final wb_[] a814(final RaidMember hb_, final int n) {
    static final RaidMemberStatusIcon[] a814(final RaidMember raidMember, final int n) {
        final int a213 = a213(raidMember, n, qe_._k);
        if (a213 == 0) {
            return null;
        }
        final RaidMemberStatusIcon[] array = new RaidMemberStatusIcon[a213];
        cj_.a030(qe_._k, 0, array, 0, a213);
        return array;
    }
    
    static final void a296(final int n, final int n2, final int n3, final RaidMemberStatusIcon[] array, final int n4) {
        int n5 = n - 18;
        int n6 = n2 - 18;
        int i = 0;
        while (i < n4) {
            final RaidMemberStatusIcon wb_ = array[i];
            wb_.icon.c326(n5, n6, wb_._a);
            n5 -= 16;
            if (++i % n3 == 0) {
                n5 = n - 18;
                n6 -= 16;
            }
        }
    }
    
    static final void b716(final ph_ ph_, final int n, final int n2, final int n3, final int n4) {
        for (int i = n2; i < n4; ++i) {
            int n5 = i * 640 + n;
            for (int j = n; j < n3; ++j) {
                final int n6 = 64 + (ph_._a._B[n5] & 0xFF);
                ph_._a._B[n5] = (0xFF000000 | 6 * n6 >> 2 << 16 | n6 << 8 | n6 >> 1);
                ++n5;
            }
        }
    }
    
    static final void a370(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        a669(n, n2, n3, n5, n6, n7);
        a669(n, n2 + n4 - 1, n3, n5, n6, n7);
        if (n4 >= 3) {
            b669(n, n2 + 1, n4 - 2, n5, n6, n7);
            b669(n + n3 - 1, n2 + 1, n4 - 2, n5, n6, n7);
        }
    }
    
    static final void a268(final ph_ ph_, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        for (int n7 = n2 * ph_.imageWidth + n, n8 = ph_.imageWidth - (n3 - n), i = n2; i < n4; ++i, n7 += n8) {
            for (int j = n; j < n3; ++j, ++n7) {
                int n9 = (int)(256.0 / (1.0 + ((i - n6) * (i - n6) / 480 + (j - n5) * (j - n5) / 640) * 16.0 / 640.0));
                n9 -= 64;
                if (n9 < 0) {
                    n9 = 0;
                }
                final int n10 = ph_._a._B[n7] & 0xFF;
                ph_._a._B[n7] = (0xFF000000 | (n10 >> 2) + ((((2097184 + (16711680 * n9 >>> 8 & 0xFF00FF)) * (256 - n10) & 0xFF00FF00) | ((8192 + (24576 * n9 >>> 8 & 0xFF00)) * (256 - n10) & 0xFF0000)) >>> 8));
            }
        }
    }
    
    private static final RaidMemberStatusIcon a769(final int n, final int n2, final String s, final Graphic cn_) {
        if (n < n2) {
            return new RaidMemberStatusIcon(jk_.replacePlaceholders(new String[] { s, Integer.toString(n2 - n) }, vc_.text_modifier_stat_decreased), cn_, 16711680);
        }
        if (n > n2) {
            return new RaidMemberStatusIcon(jk_.replacePlaceholders(new String[] { s, Integer.toString(n - n2) }, so_.text_modifier_stat_increased), cn_, 65280);
        }
        return null;
    }
    
    void c797() {
        this._e = null;
        if (this._b != null) {
            this._b.c150();
        }
        if (this._p != null) {
            for (rj_ rj_ = (rj_)this._p.e024(); rj_ != null; rj_ = (rj_)this._p.a024(4)) {
                rj_.b423((byte)30);
            }
        }
        this._b = null;
        this._p = null;
    }
    
    static final void a608(final int n, final int n2, final int n3, final RaidMember hb_, final int n4) {
        a296(n, n2, n3, qe_._k, a213(hb_, n4, qe_._k));
    }
    
    //original signature: private static final int a213(final RaidMember hb_, final int n, final wb_[] array) {
    private static final int a213(final RaidMember raidMember, final int n, final RaidMemberStatusIcon[] array) {
        int n2 = 0;
        final int e = raidMember.attack;
        int g = raidMember.defence;
        final int f = raidMember.dodge;
        int k = raidMember.sneak;
        if ((raidMember._d & 0x1) != 0x0) {
            g <<= 1;
        }
        if ((raidMember._d & 0x2) != 0x0) {
            k <<= 1;
        }
        int n3 = k - n;
        if (n3 < 0) {
            n3 = 0;
        }
        final RaidMemberStatusIcon a769 = a769(e, raidMember.raider.attack, qk_.text_attack, ue_.modifier_icons[0]);
        if (a769 != null) {
            array[n2++] = a769;
        }
        final RaidMemberStatusIcon a770 = a769(g, raidMember.raider.defence, dj_.text_defence, ue_.modifier_icons[1]);
        if (a770 != null) {
            array[n2++] = a770;
        }
        final RaidMemberStatusIcon a771 = a769(f, raidMember.raider.dodge, pm_.text_dodge, ue_.modifier_icons[2]);
        if (a771 != null) {
            array[n2++] = a771;
        }
        final RaidMemberStatusIcon a772 = a769(n3, raidMember.raider.sneak, nf_.text_sneak, ue_.modifier_icons[3]);
        if (a772 != null) {
            array[n2++] = a772;
        }
        if ((raidMember._d & 0x4) != 0x0) {
            array[n2++] = new RaidMemberStatusIcon(kl_.text_modifier_glamour, ue_.modifier_icons[6], 16744703);
        }
        if ((raidMember.status & 0x4) != 0x0) {
            array[n2++] = new RaidMemberStatusIcon(kg_.text_dead, ue_.modifier_icons[5], 16711680);
        }
        if ((raidMember.status & 0x2) != 0x0) {
            array[n2++] = new RaidMemberStatusIcon(gl_.text_incapacitated, ue_.modifier_icons[4], 16776960);
        }
        if ((raidMember.status & 0x1) != 0x0) {
            array[n2++] = new RaidMemberStatusIcon(wi_.text_ability_used, ue_.modifier_icons[6], 8438015);
        }
        return n2;
    }
    
    private static final void b669(final int n, int f, int n2, final int n3, final int n4, int n5) {
        if (n < gf_._j || n >= gf_._h) {
            return;
        }
        if (f < gf_._f) {
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        final int n6 = 256 - n4;
        final int n7 = (n3 >> 16 & 0xFF) * n4;
        final int n8 = (n3 >> 8 & 0xFF) * n4;
        final int n9 = (n3 & 0xFF) * n4;
        n5 <<= 24;
        int n10 = n + f * gf_._i;
        for (int i = 0; i < n2; ++i) {
            gf_._b[n10] = (n5 | (n7 + (gf_._b[n10] >> 16 & 0xFF) * n6 >> 8 << 16) + (n8 + (gf_._b[n10] >> 8 & 0xFF) * n6 >> 8 << 8) + (n9 + (gf_._b[n10] & 0xFF) * n6 >> 8));
            n10 += gf_._i;
        }
    }
    
    final boolean d801() {
        if (this._b != null) {
            this._b.a487(false);
            return true;
        }
        eg_.a537(this._p);
        return false;
    }
    
    //qe_.a653(gd_.stat_attack, jj_.stat_defence, wl_.stat_dodge, WarningMessage.stat_sneak, tb_.stat_snare, kd_.stat_detect);
    //original signature: static final void a653(final Graphic cn_, final Graphic cn_2, final Graphic cn_3, final Graphic cn_4, final Graphic cn_5, final Graphic cn_6) {
    static final void setRaiderAndTrapStats(final Graphic attackStat, final Graphic defenceStat, final Graphic dodgeStat, final Graphic sneakStat,
    		final Graphic snareStat, final Graphic detectStat) {
        qe_.trapStats = new Graphic[] { attackStat, defenceStat, snareStat, detectStat };
        qe_.raiderStats = new Graphic[] { attackStat, defenceStat, dodgeStat, sneakStat };
    }
    
    static final void a716(final ph_ ph_, final int n, final int n2, final int n3, final int n4) {
        int n5 = 0;
        int n6 = n2 - (qe_._c >> 16);
        int n7 = n - (qe_._n >> 16);
        int i = -(n4 >> 1);
        final int n8 = -(n3 >> 1);
        final int n9 = qe_._d & 0x3;
        if (n9 == 1 || n9 == 3) {
            n5 += n3;
            ++n6;
        }
        if (n9 == 1 || n9 == 2) {
            ++n5;
            ++n7;
        }
        int n10 = 10000 + n6 * n6 + n7 * n7;
        int n11 = 160 + (int)(64.0 * (1.0 + te_.a132(mo_._a)));
        if (n11 > 256) {
            n11 = 256;
        }
        final int[] c = ph_._c;
        while (i < 0) {
            byte b = (byte)n7;
            for (int n12 = n10, j = n8; j < 0; ++j, n12 += b + 1 << 2, b += 2) {
                final int a417 = dd_.a417(n12);
                final int n13 = c[n5];
                int n14 = 64 + 5 * ((b * (byte)(n13 >> 16) + n6 * (byte)(n13 >> 8) + 100 * (byte)n13) * a417 * n11 >> 24);
                if (n14 < 64) {
                    n14 = 64;
                }
                nm_._ib[n5] = n14;
                n5 += 2;
            }
            ++i;
            n10 += n6 + 1 << 2;
            n6 += 2;
            n5 += n3;
        }
        a903(ph_._a._B, nm_._ib, 0, 0, 0, n3 * n4 - 1);
    }
    
    static final void a738(final int n, final int n2, final Trap ac_) {
        if (ac_ != null) {
            b899(n, n2, qe_.trapStats, qe_._g, new int[] { ac_.attack, ac_.defence, ac_.snare, ac_.detect });
        }
        else {
            b899(n, n2, qe_.trapStats, qe_._g, new int[] { 0, 0, 0, 0 });
        }
    }
    
    void f797() {
        if (ll_.debugMode && mm_._t == 1) {
            ld_._b = !ld_._b;
        }
        if (this._b != null) {
            this._b.b487(false);
        }
    }
    
    public static void a797() {
        qe_._m = null;
        qe_._g = null;
        qe_._h = null;
        qe_._k = null;
        qe_.trapStats = null;
        qe_.raiderStats = null;
    }
    
    void b487(final boolean b) {
        final int[] array = new int[64];
        for (int i = 0; i < 64; ++i) {
            array[i] = (Integer.MIN_VALUE | 65793 * (24 + i));
        }
        final Graphic cn_ = new Graphic(640, 480);
        jh_.a303(cn_);
        for (int j = 0; j < 480; j += bf_.smoke.imageHeight) {
            for (int k = 0; k < 640; k += bf_.smoke.imageWidth) {
                bf_.smoke.c093(k, j);
            }
        }
        int n = 0;
        for (int l = 0; l < 480; ++l) {
            for (int n2 = 0; n2 < 640; ++n2, ++n) {
                gf_._b[n] = (0xFF000000 | (gf_._b[n] & 0xFCFCFC) >>> 2);
            }
        }
        jh_.b797();
        this._e = new ph_(cn_, te_.b285(640, 480, 0.125));
        qe_._m = new int[307200];
        for (int n3 = 0; n3 < 307200; ++n3) {
            qe_._m[n3] = 64;
        }
    }
    
    //original signature: static final void a484(final int n, final int n2, final Room ai_) {
    static final void a484(final int n, final int n2, final Room room) {
        gf_.b050(n - 4, n2 - 4, 120, 120, 0);
        rp_.a857(4, 112, (byte)108, n, 112, kc_._V, n2);
        if (room != null) {
            if (room._c != null) {
                room._c.a697(108, n2 + 2, (byte)102, n + 2, 108);
            }
            if (room._f != null) {
                a296(n + 112, n2 + 112, 7, room._f, room._f.length);
            }
        }
    }
    
    static final RaidMemberStatusIcon[] a928(final Room ai_, final boolean b, final boolean b2, final int n) {
        final int a427 = a427(ai_, b, b2, n, qe_._k);
        final RaidMemberStatusIcon[] array = new RaidMemberStatusIcon[a427];
        cj_.a030(qe_._k, 0, array, 0, a427);
        return array;
    }
    
    void c487(final boolean b) {
        if (hj_.mouseX != -1) {
            qe_._f = hj_.mouseX << 16;
            qe_._l = Animation.mouseY << 16;
        }
        final int n = qe_._f - qe_._n;
        final int n2 = qe_._l - qe_._c;
        final int n3 = ug_.a527(true, (n >> 12) * (n >> 12) + (n2 >> 12) * (n2 >> 12)) >> 6;
        if (n3 < 0) {
            throw new RuntimeException();
        }
        if (n3 != 0) {
            final int n4 = n / n3;
            final int n5 = n2 / n3;
            qe_._a += n4;
            qe_._j += n5;
            qe_._a = qe_._a * 14 >> 4;
            qe_._j = qe_._j * 14 >> 4;
        }
        qe_._n += (int)(1048576.0 * te_.a132(mo_._a));
        qe_._c += (int)(1048576.0 * te_.a132(mo_._a ^ 0xBCC67));
        qe_._n += qe_._a;
        qe_._c += qe_._j;
        if (this._b != null) {
            this._b.c423((byte)72);
        }
        if (this._q != null) {
            hm_.a531(this._q, -21);
            this._q.a487(false);
        }
        else {
            hm_.a531(null, -21);
        }
    }
    
    static final void b050(final int n, int f, int n2, final int n3, final int n4) {
        if (n < gf_._j || n >= gf_._h) {
            return;
        }
        if (f < gf_._f) {
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        final int n5 = 256 - n4;
        final int n6 = (n3 >> 16 & 0xFF) * n4;
        final int n7 = (n3 >> 8 & 0xFF) * n4;
        final int n8 = (n3 & 0xFF) * n4;
        int n9 = n + f * gf_._i;
        for (int i = 0; i < n2; ++i) {
            gf_._b[n9] = ((gf_._b[n9] & 0xFF000000) | (n6 + (gf_._b[n9] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (gf_._b[n9] >> 8 & 0xFF) * n5 >> 8 << 8) + (n8 + (gf_._b[n9] & 0xFF) * n5 >> 8));
            n9 += gf_._i;
        }
    }
    
    static final void a115(final int n, final int n2, final int n3, final int n4) {
        gf_.b050(n - 1, n2 - 1, n3 + 2, n4 + 2, 0);
        ob_.a697(n, n2, n4, n3);
        a229(n + 2, n2 + 2, n3 - 4, n4 - 4, 256, 64, 4, 128);
        rp_.a857(5, n3 - 4, (byte)108, n + 2, n4 - 4, kc_._S, n2 + 2);
    }
    
    static final void a204(final int n, final int n2, final wd_ wd_, final int[][] array) {
        gf_.b050(n - 4, n2 - 4, 120, 120, 0);
        rp_.a857(4, 112, (byte)108, n, 112, array, n2);
        if (wd_ != null) {
            wd_.a697(108, n2 + 2, (byte)102, n + 2, 108);
        }
    }
    
    static final void a509(final int n, final int n2, final Room ai_, final boolean b, final int n3) {
        if (ai_ != null) {
            int p5 = ai_.attack2;
            int g = ai_.defence2;
            final int r = ai_.snare2;
            final int q = ai_.detect2;
            if (b) {
                p5 = p5 + 1 >> 1;
                g = g + 1 >> 1;
            }
            int n4 = p5 - n3;
            if (n4 < 0) {
                n4 = 0;
            }
            a899(n, n2, qe_.trapStats, qe_._g, new int[] { n4, g, r, q });
        }
        else {
            a899(n, n2, qe_.trapStats, qe_._g, new int[] { 0, 0, 0, 0 });
        }
    }
    
    static final void a229(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        for (int i = 0; i < n7; ++i) {
            final int n9 = n5 - n6 * i;
            final int n10 = n8 * i / n7;
            a669(n, n2 + i, n3, 0, n9, n10);
            a669(n, n2 + n4 - 1 - i, n3, 0, n9, n10);
            b669(n + i, n2, n4, 0, n9, n10);
            b669(n + n3 - 1 - i, n2, n4, 0, n9, n10);
        }
    }
    
    void a487(final boolean b) {
    }
    
    private static final int a427(final Room ai_, final boolean b, final boolean b2, final int n, final RaidMemberStatusIcon[] array) {
        int n2 = 0;
        int p5 = ai_.attack2;
        int g = ai_.defence2;
        final int r = ai_.snare2;
        final int q = ai_.detect2;
        if (b2) {
            p5 = p5 + 1 >> 1;
            g = g + 1 >> 1;
        }
        int n3 = p5 - n;
        if (n3 < 0) {
            n3 = 0;
        }
        final RaidMemberStatusIcon a769 = a769(n3, ai_.trap.attack, qk_.text_attack, ue_.modifier_icons[0]);
        if (a769 != null) {
            array[n2++] = a769;
        }
        final RaidMemberStatusIcon a770 = a769(g, ai_.trap.defence, dj_.text_defence, ue_.modifier_icons[1]);
        if (a770 != null) {
            array[n2++] = a770;
        }
        final RaidMemberStatusIcon a771 = a769(r, ai_.trap.snare, rk_.text_snare, ue_.modifier_icons[7]);
        if (a771 != null) {
            array[n2++] = a771;
        }
        final RaidMemberStatusIcon a772 = a769(q, ai_.trap.detect, eg_.text_detect, ue_.modifier_icons[8]);
        if (a772 != null) {
            array[n2++] = a772;
        }
        if (b2) {
            array[n2++] = new RaidMemberStatusIcon(dm_.text_modifier_blinded, ue_.modifier_icons[6], 16744703);
        }
        if (b) {
            final int g2 = ai_.trap.roomType;
            if (g2 == 2) {
                array[n2++] = new RaidMemberStatusIcon(ii_.text_defeated, ue_.modifier_icons[4], 16777215);
            }
            else if (g2 == 1 || g2 == 3) {
                array[n2++] = new RaidMemberStatusIcon(fi_.text_disarmed, ue_.modifier_icons[4], 16777215);
            }
        }
        return n2;
    }
    
    static final void a594(final int n, final int n2, final RaidMember hb_) {
        gf_.b050(n - 4, n2 - 4, 120, 120, 0);
        rp_.a857(4, 112, (byte)108, n, 112, kc_._S, n2);
        if (hb_ != null) {
            hb_._b.a697(108, n2 + 2, (byte)102, n + 2, 108);
            if (hb_._i != null) {
                a296(n + 112, n2 + 112, 7, hb_._i, hb_._i.length);
            }
        }
        else {
            gf_.b050(n + 2, n2 + 2, 108, 108, 0);
        }
    }
    
    private static final void b494(final int n, final int n2, final int n3, int n4, final int n5, final Graphic cn_, int n6, int n7) {
        b229(n, n2, 16, 16, 128, 64, 2, 192);
        cn_.c093(n, n2);
        if (n4 > n5) {
            n4 = n5;
        }
        final int n8 = 1 + n4 * (n3 - 1) / n5;
        jm_.a050(4, n + 26, n3, n2 + 6);
        final int n9 = n6 & 0xFF00FF;
        final int n10 = n6 & 0xFF00;
        final int n11 = n7 & 0xFF00FF;
        final int n12 = n7 & 0xFF00;
        for (int i = 0; i < n8; ++i) {
            final int n13 = (i << 8) / n3;
            final int n14 = 256 - n13;
            n6 = (n9 * n14 + n11 * n13 & 0xFF00FF00);
            n7 = (n10 * n14 + n12 * n13 & 0xFF0000);
            gf_.c115(n + 26 + i, n2 + 6, 4, (n6 | n7) >>> 8);
        }
    }
    
    private static final void a899(final int n, final int n2, final Graphic[] array, final int[][] array2, final int[] array3) {
        for (int i = 0; i < array3.length; ++i) {
            a494(n, n2 + 16 * i, 96, array3[i], 10, array[i], array2[i][0], array2[i][1]);
        }
    }
    
    private static final void a494(final int n, final int n2, final int n3, int n4, final int n5, final Graphic cn_, int n6, int n7) {
        b229(n - 16, n2, 16, 16, 128, 64, 2, 192);
        cn_.c093(n - 16, n2);
        if (n4 > n5) {
            n4 = n5;
        }
        final int n8 = 1 + n4 * (n3 - 1) / n5;
        jm_.a050(4, n - 26 - n3, n3, n2 + 6);
        final int n9 = n6 & 0xFF00FF;
        final int n10 = n6 & 0xFF00;
        final int n11 = n7 & 0xFF00FF;
        final int n12 = n7 & 0xFF00;
        for (int i = 0; i < n8; ++i) {
            final int n13 = (i << 8) / n3;
            final int n14 = 256 - n13;
            n6 = (n9 * n14 + n11 * n13 & 0xFF00FF00);
            n7 = (n10 * n14 + n12 * n13 & 0xFF0000);
            gf_.c115(n - 27 - i, n2 + 6, 4, (n6 | n7) >>> 8);
        }
    }
    
    static final void e797() {
        int n = 0;
        final int[] d = jh_._d;
        int n2 = -(qe_._c >> 16);
        int n3 = -(qe_._n >> 16);
        int i = -240;
        final int n4 = -320;
        final int n5 = ++qe_._d & 0x3;
        if (n5 == 1 || n5 == 3) {
            n += 640;
            ++n2;
        }
        if (n5 == 1 || n5 == 2) {
            ++n;
            ++n3;
        }
        int n6 = 10000 + n2 * n2 + n3 * n3;
        int n7 = 160 + (int)(64.0 * (1.0 + te_.a132(mo_._a)));
        if (n7 > 256) {
            n7 = 256;
        }
        while (i < 0) {
            byte b = (byte)n3;
            for (int n8 = n6, j = n4; j < 0; ++j, n8 += b + 1 << 2, b += 2) {
                final int a417 = dd_.a417(n8);
                final int n9 = d[n];
                int n10 = 64 + 5 * ((b * (byte)(n9 >> 16) + n2 * (byte)(n9 >> 8) + 100 * (byte)n9) * a417 * n7 >> 24);
                if (n10 < 64) {
                    n10 = 64;
                }
                qe_._m[n] = n10;
                n += 2;
            }
            ++i;
            n6 += n2 + 1 << 2;
            n2 += 2;
            n += 640;
        }
        a903(gf_._b, qe_._m, 0, 0, 0, 307200 - 1);
    }
    
    private static final void b899(final int n, final int n2, final Graphic[] array, final int[][] array2, final int[] array3) {
        for (int i = 0; i < array3.length; ++i) {
            b494(n, n2 + 16 * i, 96, array3[i], 10, array[i], array2[i][0], array2[i][1]);
        }
    }
    
    static final void a305(final int n, final int n2, final RaidMember hb_, final int n3) {
        if (hb_ != null) {
            final int e = hb_.attack;
            int g = hb_.defence;
            final int f = hb_.dodge;
            int k = hb_.sneak;
            if ((hb_._d & 0x1) != 0x0) {
                g <<= 1;
            }
            if ((hb_._d & 0x2) != 0x0) {
                k <<= 1;
            }
            int n4 = k - n3;
            if (n4 < 0) {
                n4 = 0;
            }
            b899(n, n2, qe_.raiderStats, qe_._h, new int[] { e, g, f, n4 });
        }
        else {
            b899(n, n2, qe_.raiderStats, qe_._h, new int[] { 0, 0, 0, 0 });
        }
    }
    
    static final void b370(int j, int f, int n, int n2, int n3, final int n4, int n5) {
        if (j < gf_._j) {
            n -= gf_._j - j;
            j = gf_._j;
        }
        if (f < gf_._f) {
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (j + n > gf_._h) {
            n = gf_._h - j;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        n3 = ((n3 & 0xFF00FF) * n4 >> 8 & 0xFF00FF) + ((n3 & 0xFF00) * n4 >> 8 & 0xFF00);
        n5 <<= 24;
        final int n6 = 256 - n4;
        final int n7 = gf_._i - n;
        int n8 = j + f * gf_._i;
        for (int i = 0; i < n2; ++i) {
            for (int k = -n; k < 0; ++k) {
                final int n9 = gf_._b[n8];
                gf_._b[n8++] = (n5 | n3 + (((n9 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((n9 & 0xFF00) * n6 >> 8 & 0xFF00)));
            }
            n8 += n7;
        }
    }
    
    static final void b229(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        for (int i = 0; i < n7; ++i) {
            a370(n - 1 - i, n2 - 1 - i, n3 + 2 + 2 * i, n4 + 2 + 2 * i, 0, n5 - n6 * i, n8);
        }
    }
    
    protected qe_() {
    }
    
    static {
        qe_._k = new RaidMemberStatusIcon[32];
        qe_._g = new int[][] { { 16716800, 16756480 }, { 685312, 5826816 }, { 10449103, 12690143 }, { 8086330, 12428684 } };
        qe_._h = new int[][] { { 16716800, 16756480 }, { 685312, 5826816 }, { 2188106, 7054732 }, { 42962, 62200 } };
    }
}
