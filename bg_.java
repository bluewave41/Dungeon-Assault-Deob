final class bg_ extends qe_
{
    private rh_ _w;
    private Graphic _u;
    static md_ _s;
    private rh_ _r;
    //original name: _x
    static String text_buy;
    private Graphic _v;
    //original name: _t
    static String loading;
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        super._e.drawImage(0, 0);
        gf_.e115(41, 48, 599, 416);
        for (int i = 41; i < 599; i += df_.main_center.imageWidth2) {
            df_.main_center.c093(i, 48);
        }
        gf_.b797();
        this.setupRenownTable(117, 122);
        this.a326(20, 84, 117);
        for (rj_ rj_ = (rj_)super._p.e024(); null != rj_; rj_ = (rj_)super._p.a024(4)) {
            rj_.a150(126);
        }
        oe_.interface_dragon.h093(24, 383);
        oe_.interface_dragon.j093(560, 383);
        if (null != super._b) {
            super._b.a423((byte)(-126));
        }
        e797();
        this._r.d797();
        this._w.d797();
        for (rj_ rj_2 = (rj_)super._p.e024(); rj_2 != null; rj_2 = (rj_)super._p.a024(4)) {
            rj_2.d150(0);
        }
        if (0 <= GUICheckbox._N) {
            if (ao_._o > GUICheckbox._N) {
                final int n = -vd_._a + GUICheckbox._N;
                if (0 <= n) {
                    if (n < 10) {
                        this.a992(432, GUICheckbox._N, 121 + n * 24, fb_.renownTableEntries[n]);
                    }
                }
            }
        }
        this.handleExtraRenownTableMessages(1);
        ih_.dragonsOfRenownHeaderLabel.drawHeaderLabel();
        if (null != super._b) {
            for (int n2 = 0; gf_._b.length > n2; ++n2) {
                gf_._b[n2] = nb_.and(gf_._b[n2], -50529028) >>> 2;
            }
            super._b.b150(111);
        }
        if (kn_.isTutorial) {
            ab_.a150();
        }
        oh_.a423();
    }
    
    @Override
    final void c487(final boolean b) {
        super.c487(b);
        if (!kh_._s && b) {
            while (ha_.b427()) {
                if (mm_._t != 13) {
                    super.f797();
                }
                else {
                    gd_.a778(g_._Hb, 0, g_._Hb, false);
                }
            }
            if (kn_.isTutorial) {
                bl_.a150(0);
            }
            if (super._b != null) {
                if (super._b._d) {
                    boolean r = false;
                    if (super._b instanceof ce_) {
                        final ce_ ce_ = (ce_)super._b;
                        if (ce_._u != null) {
                            ri_.a900(ce_._u.toString(), -109);
                        }
                    }
                    else if (!(super._b instanceof WarningMessage)) {
                        if (super._b instanceof fk_) {}
                    }
                    else {
                        r = ((WarningMessage)super._b)._r;
                    }
                    super._b.c150();
                    super._b = null;
                    if (r) {
                        super._b = new fk_(hj_._Q, li_._j);
                    }
                }
            }
            this.a150(5458);
        }
    }
    
    @Override
    final void b487(final boolean b) {
        super.b487(b);
        jh_.a276(super._e);
        c_.a842(0);
        c_.a842(40);
        jc_.a669(432, 33, 48, 1, 2, 1);
        jc_.a669(432, 599, 48, 1, 2, 1);
        jc_.a669(32, 164, 8, 1, 2, 1);
        jc_.a669(32, 468, 8, 1, 2, 1);
        vd_.a669(558, 1, 1, 41, 416);
        this.a326(40, 70, 117);
        jh_.b797();
        fk_.a261(wj_.da_highscores);
        ao_._o = 0;
        if (fb_.renownTableEntries == null) {
            fb_.renownTableEntries = new RenownTableEntry[10];
        }
        bj_.renownTableError = false;
        if (tl_._l) {
            oi_.f423((byte)100);
        }
        else {
            ri_.a900(tc_.playerTitle, -113);
        }
        this._r = new rh_(58, 394, 80, 160, 255, 197376, 240);
        this._w = new rh_(580, 394, 80, 160, 255, 197376, 240);
        this.a423((byte)(-111));
        this.a556(0);
        if (!tl_._l) {
            gh_.a093(23);
        }
        else {
            gh_.a093(22);
        }
        vl_.a366(1, (byte)(-49));
    }
    
    private final void a992(final int n, final int n2, int n3, final RenownTableEntry di_) {
        if (null == di_) {
            return;
        }
        if (null == this._u) {
            this.a628(di_, n ^ 0x1CD);
        }
        n3 += 24 - la_.roman12._H >> 1;
        this._u.b326(72, n3, 64);
        int n4 = (int)((te_.a132(mo_._a) + 1.0) * 128.0);
        if (n != 432) {
            this.a405(124, (byte)59, null, 121);
        }
        if (0 > n4) {
            n4 = 0;
        }
        if (n4 > 256) {
            n4 = 256;
        }
        this._v.b326(72, n3, n4);
    }
    
    //original signature: private final int a760(final int n, final boolean b, final int n2) {
    private final int a760(final int mouseX, final int mouseY) {
        if (mouseX < 72 || 551 <= mouseX) {
            return -1;
        }
        final int n3 = (mouseY - 121) / 24;
        if (0 <= n3 && 10 > n3) {
            return n3;
        }
        return -1;
    }
    
    private final void a448(final int n, int n2, final int n3, final RenownTableEntry di_, int n4, final int n5) {
        final int a368 = this.a368(di_);
        n4 -= ((a368 == 0) ? 0 : (10 + a368 * 5));
        final String a369 = ta_.a319(la_.roman12, di_._j, n4, di_.name, 115);
        n2 -= (la_.roman12.b926(a369) >> 1) + 5;
        for (int i = 0; i < a368; ++i) {
            fb_._f.a093(n2, n5 - 10);
            n2 += 5;
        }
        if (n3 <= 4) {
            this.a348(-30, -105, null, 82);
        }
        n2 += 15;
        la_.roman12.b191(a369, n2, n5, n, -1);
    }
    
    //original signature: private final int b313(final int n, final int n2, final int n3) {
    private final int b313(final int mouseY, final int mouseX) {
        final int a760 = this.a760(mouseX, mouseY);
        if (a760 != -1) {
            return vd_._a + a760;
        }
        return -1;
    }
    
    private final void a423(final byte b) {
        this.b797();
        le_.renownTableMenuButton = tn_.a226(-jm_.button_152.imageWidth + 164 >> 1, 8 + (32 - jm_.button_152.imageHeight >> 1), ne_.roman20, jm_.button_152, -62, l_.text_menu);
        wf_.renownTableRaidButton = tn_.a226(580 - jm_.button_152.imageWidth, (-jm_.button_152.imageHeight + 56 >> 1) + 424, ne_.roman20, jm_.button_152, -52, ia_.text_raid);
        ic_.renownTableSearchButton = tn_.a226(60, (-jm_.button_152.imageHeight + 56 >> 1) + 424, ne_.roman20, jm_.button_152, -61, RaidMember.text_search.toUpperCase());
        
        wf_.renownTableRaidButton.isActive = false;
        ic_.renownTableSearchButton.isActive = !tl_._l;
        
        int n = ao_._o - 10;
        if (n < 0) {
            n = 0;
        }
        hi_._c = new pd_(552, 84, 0, 295, n, vd_._a);
        super._p.a865(le_.renownTableMenuButton);
        super._p.a865(wf_.renownTableRaidButton);
        super._p.a865(ic_.renownTableSearchButton);
        super._p.a865(hi_._c);
    }
    
    private final void a326(final int n, final int n2, final int n3) {
        final int n4 = n2 + ((db_.roman12bold._H + n >> 1) + 2);
        if (n3 != 117) {
            return;
        }
        for (int i = 0; i < GUICheckbox.renowntable_column_text.length; ++i) {
            final String renownColumnString = GUICheckbox.renowntable_column_text[i].toUpperCase();
            final int n5 = s_._b[i + 1] + s_._b[i] >> 1;
            int b926 = db_.roman12bold.b926(renownColumnString);
            if (i == 1 || 3 == i) {
                b926 -= 18;
            }
            int n6 = n5 - (b926 >> 1);
            if (2 == i) {
                n6 -= 2;
            }
            db_.roman12bold.b191(renownColumnString, n6, n4, 16629550, -1);
            if (i != 0) {
                ue_.modifier_icons[0].drawImage(n6 - 18, n4 - 12);
            }
            if (3 == i) {
                ue_.modifier_icons[1].drawImage(n6 - 18, n4 - 12);
            }
        }
    }
    
    private final void a492(int n, int n2, final int n3, final byte b, final int n4, final RenownTableEntry di_, final int n5) {
        final int a368 = this.a368(di_);
        n2 -= ((a368 != 0) ? (10 + 5 * a368) : 0);
        if (b < 122) {
            return;
        }
        final String a369 = u_.a975(la_.roman12, di_.name, di_._j, n3, n2);
        n -= (la_.roman12.b926(a369) >> 1) + 5;
        for (int i = 0; i < a368; ++i) {
            fb_._f.a093(n, n4 - 10);
            n += 5;
        }
        n += 15;
        la_.roman12.b191(a369, n, n4, n5, -1);
    }
    
    //original signature: private final void a093(final int n, final int n2) {
    private final void setupRenownTable(final int n, final int n2) {
        am_.menu_chain_frame.drawImage(41, 48);
        for (int n3 = 0; 4 > n3; ++n3) {
            qe_.b370(s_._b[n3], 85, s_._b[1 + n3] - s_._b[n3] - 2, 25, 0, 48, 128);
            qe_.b370(s_._b[n3], 112, -2 - s_._b[n3] + s_._b[1 + n3], 256, 0, 48, 128);
        }
        if (bj_.renownTableError) {
            la_.roman12.c191(Trap.renowntable_error, 320, 240, 16777215, -1);
        }
        else {
            int n4 = 4 + n;
            for (int i = (ao_._o <= 10 + vd_._a) ? (-vd_._a + ao_._o) : 10, n5 = 0; i > n5; ++n5) {
                final int n6 = vd_._a + n5;
                if (n6 != qc_._y) {
                    this.a405(n6, (byte)(-79), fb_.renownTableEntries[n5], n4);
                }
                n4 += 24;
            }
            if (qc_._y >= 0) {
                if (qc_._y < ao_._o) {
                    final int n7 = qc_._y - vd_._a;
                    if (0 <= n7 && n7 < 10) {
                        this.a348(4 + (n + n7 * 24), 48, fb_.renownTableEntries[n7], qc_._y);
                    }
                }
            }
        }
        if (n2 < 44) {
            return;
        }
        qe_.a229(66, 76, 507, 306, 256, 32, 8, 128);
    }
    
    private final void a348(int n, final int n2, final RenownTableEntry di_, final int n3) {
        final int[] array = new int[32];
        n += 2;
        for (int n5 = 0; 32 > n5; ++n5) {
            array[n5] = 65793 * (32 + n5 * 1);
        }
        for (int n6 = 3; 24 > n6; ++n6) {
            gf_.d050(66, n + n6, 490, 1285 * (-n6 + 24) + (14614528 - 131072 * n6), 128);
        }
        gf_.b115(66, 2 + n, 490, 7895160);
        gf_.b115(66, 24 + n, 490, 6771538);
        if (n2 != 48) {
            this.a545(false, 22, 111, 82, null);
        }
        n -= 2;
        n += la_.roman12._H + 24 >> 1;
        if (null == di_) {
            la_.roman12.c191(nl_.text_please_wait, 232, n, 16777215, -1);
        }
        else {
            la_.roman12.c191(Integer.toString(di_._b + 1), 93, n, 16777215, -1);
            this.a492(232, 230, 16777215, (byte)126, n, di_, 8421616);
            la_.roman12.c191(gh_.a382(di_.renown), 385, n, 16777215, -1);
            if (di_.lastRaidedBy.equals("")) {
                la_.roman12.c191("-", 485, n, 16777215, -1);
            }
            else {
                final String a975 = u_.a975(la_.roman12, di_.lastRaidedBy, -1, 16777215, 106);
                final int n7 = 430;
                Graphic cn_;
                if (0 >= di_._f) {
                    if (0 <= di_._f) {
                        cn_ = ue_.modifier_icons[8];
                    }
                    else {
                        cn_ = ue_.modifier_icons[1];
                    }
                }
                else {
                    cn_ = ue_.modifier_icons[0];
                }
                cn_.drawImage(n7, n - la_.roman12._H);
                la_.roman12.b191(a975, n7 + 20, n, 8421616, -1);
            }
        }
    }
    
    //original signature: final void a545(final boolean b, final int n, final int n2, final int n3, final int j, final String q) {
    final void a545(final boolean b, final int n, final int n3, final int j, final String q) {
        hj_._Q = q;
        li_._j = j;
        if (!b) {
            if (0 != n) {
                int n4 = 25 * n;
                if (100 < n4) {
                    n4 = 100;
                }
                super._b = new WarningMessage(ia_.text_raid, jk_.replacePlaceholders(new String[] { n4 + "%", jk_.a661(127, n3) }, no_.text_recently_raided), 0);
            }
            else {
                super._b = new fk_(q, j);
            }
        }
        else {
            super._b = new WarningMessage(ia_.text_raid, kc_.text_raid_fatal, 0);
        }
    }
    
    //original signature: private final int a368(final RenownTableEntry di_, final byte b) {
    private final int a368(final RenownTableEntry entry) {
        if (entry.bountyAmount == 0) {
            return 0;
        }
        final int n = (20 * entry.bountyAmount - 1) / (gm_.playerInformation.renown + 1);
        return (3 >= n) ? n : 3;
    }
    
    //original signature: private final void c150(final int n) {
    private final void handleExtraRenownTableMessages(final int n) {
        RenownTableEntry entry = null;
        if (0 <= qc_._y && ao_._o > qc_._y) {
            final int n2 = -vd_._a + qc_._y;
            if (n2 >= 0 && 10 > n2 && fb_.renownTableEntries[n2] != null && !Animation.a213(fb_.renownTableEntries[n2]._i)) {
                entry = fb_.renownTableEntries[n2];
            }
        }
        final int renownDivide40 = gm_.playerInformation.renown / 40;
        String s;
        if (entry == null) {
            s = Room.text_renowntable_hint;
        }
        else {
            final double a780 = ek_.a780(0, gm_.playerInformation.renown, entry.renown);
            if (0 >= entry.bountyAmount) {
                if (0.0 < a780) {
                    s = jk_.replacePlaceholders(new String[] { gh_.a382((int)(a780 * 1000.0)), gh_.a382(renownDivide40) }, vl_.text_protection);
                }
                else {
                    s = jk_.replacePlaceholders(new String[] { gh_.a382(renownDivide40) }, le_.text_stake);
                }
            }
            else if (a780 > 0.0) {
                s = jk_.replacePlaceholders(new String[] { gh_.a382(entry.bountyAmount), gh_.a382((int)(1000.0 * a780)), gh_.a382(renownDivide40) }, ra_.text_bounty_protection);
            }
            else {
                s = jk_.replacePlaceholders(new String[] { gh_.a382(entry.bountyAmount) }, mi_.text_bounty);
            }
        }
        db_.roman12bold.a385(s, 215, 430, 210, 45, 16777215, -1, n, 1, db_.roman12bold._H);
    }
    
    private final void a628(final RenownTableEntry di_, final int n) {
        if (null == di_) {
            this._u = null;
            this._v = null;
            return;
        }
        final FontStyle gp_ = (di_._b == qc_._y) ? la_.roman12 : la_.roman12;
        final Graphic cn_ = new Graphic(479, gp_._E + gp_._H);
        jh_.a303(cn_);
        gp_.c191(Integer.toString(di_._b + 1), 21, la_.roman12._H, 12690143, -1);
        this.a448(12690143, 160, 120, di_, 230, la_.roman12._H);
        gp_.c191(gh_.a382(di_.renown), 313, la_.roman12._H, 12690143, -1);
        if (di_.lastRaidedBy.equals("")) {
            gp_.c191("-", 413, la_.roman12._H, 12690143, -1);
        }
        else {
            final String a975 = u_.a975(gp_, di_.lastRaidedBy, -1, 12690143, 106);
            final int n2 = 358;
            Graphic cn_2;
            if (di_._f <= 0) {
                if (di_._f >= 0) {
                    cn_2 = ue_.modifier_icons[8];
                }
                else {
                    cn_2 = ue_.modifier_icons[1];
                }
            }
            else {
                cn_2 = ue_.modifier_icons[0];
            }
            cn_2.drawImage(n2, 0);
            gp_.b191(a975, n2 + 20, gp_._H, 12690143, -1);
        }
        if (n <= 117) {
            return;
        }
        jh_.b797();
        this._u = GUICheckbox.a551(8, cn_, 12690143, (byte)(-38));
        this._v = GUICheckbox.a551(16, cn_, 255, (byte)(-74));
    }
    
    //original signature: static final nh_ a707(final boolean b, final int n, final boolean b2) {
    static final nh_ a707(final boolean b, final int n) {
        return uo_.a385(true, 1, false, n);
    }
    
    public static void b150(final int n) {
        bg_.text_buy = null;
        bg_.loading = null;
        bg_._s = null;
        if (n != 41) {
            b150(-1);
        }
    }
    
    //original signature: private final void a556(final byte b, final int n) {
    private final void a556(final int n) {
        if (vd_._a == n) {
            return;
        }
        final RenownTableEntry[] d = new RenownTableEntry[10];
        int n2 = 0;
        int n3 = vd_._a - n;
        int n4 = 10;
        if (0 > n3) {
            n4 += n3;
            n2 -= n3;
            n3 = 0;
        }
        if (n3 + n4 > 10) {
            n4 = 10 - n3;
        }
        for (int i = 0; i < n4; ++i) {
            d[n3++] = fb_.renownTableEntries[n2++];
        }
        fb_.renownTableEntries = d;
        og_._f = n;
        vd_._a = n;
        if (hi_._c != null) {
            hi_._c._z = vd_._a;
            if (hi_._c._z > hi_._c._C) {
                hi_._c._z = hi_._c._C;
            }
        }
    }
    
    private final void a405(final int n, final byte b, final RenownTableEntry di_, int n2) {
        final int n3 = (n != GUICheckbox._N) ? 16777215 : 16760960;
        final int n4 = 3446736;
        n2 += db_.roman12bold._H + 24 >> 1;
        if (b > -37) {
            this.a423((byte)111);
        }
        if (di_ != null) {
            la_.roman12.c191(Integer.toString(1 + di_._b), 93, n2, n3, -1);
            this.a492(232, 230, n3, (byte)125, n2, di_, n4);
            la_.roman12.c191(gh_.a382(di_.renown), 385, n2, n3, -1);
            if (0 >= di_.lastRaidedBy.length()) {
                la_.roman12.c191("-", 485, n2, n3, -1);
            }
            else {
                final String a975 = u_.a975(la_.roman12, di_.lastRaidedBy, -1, n3, 106);
                la_.roman12.b926(a975);
                final int n5 = 430;
                Graphic cn_;
                if (di_._f <= 0) {
                    if (0 > di_._f) {
                        cn_ = ue_.modifier_icons[1];
                    }
                    else {
                        cn_ = ue_.modifier_icons[8];
                    }
                }
                else {
                    cn_ = ue_.modifier_icons[0];
                }
                cn_.drawImage(n5, n2 - la_.roman12._H);
                la_.roman12.b191(a975, 20 + n5, n2, n4, -1);
            }
        }
        else {
            la_.roman12.c191(Integer.toString(1 + n), 93, n2, n3, -1);
            la_.roman12.c191(nl_.text_please_wait, 232, n2, n3, -1);
        }
    }
    
    private final void a150(final int n) {
        if (kn_.isTutorial) {
            if (od_.a427()) {
                return;
            }
        }
        if (!super.d801()) {
            if (vd_._a != hi_._c._z) {
                this.a556(hi_._c._z);
                oi_.f423((byte)100);
            }
            final int b313 = this.b313(Animation.mouseY, hj_.mouseX);
            int b314 = -1;
            if (no_.isMetaDown == 1) {
                b314 = this.b313(hm_.mouseY, lc_.mouseX);
            }
            if (hh_._s != le_.renownTableMenuButton) {
                if (hh_._s == wf_.renownTableRaidButton) { //click start raid button
                    if (tl_._l) {
                        throw new RuntimeException((String)null);
                    }
                    if (Animation.a213(k_.selectedRenownTableEntry)) {
                        throw new RuntimeException((String)null);
                    }
                    if (null == gm_.playerInformation) {
                        throw new RuntimeException((String)null);
                    }
                    if (!gm_.playerInformation.isDungeonActivated) {
                        Trap._B.storeFuzzedOpcode(58);
                    }
                    Trap.startRaid(k_.selectedRenownTableEntry, 0);
                }
                else if (ic_.renownTableSearchButton == hh_._s) {
                    if (!tl_._l) {
                        super._b = new ce_(tc_.playerTitle.toLowerCase());
                    }
                }
            }
            else {
                gd_.a778(dc_._z, 0, 0, true);
            }
            if (b313 != -1) {
                if (GUICheckbox._N != b313) {
                    this.a628(fb_.renownTableEntries[b313 - vd_._a], 120);
                }
                GUICheckbox._N = b313;
            }
            if (b314 != -1) {
                qc_._y = b314;
                if (GUICheckbox._N == qc_._y) {
                    this.a628(fb_.renownTableEntries[-vd_._a + GUICheckbox._N], 125);
                }
                gg_.activateRenownTableRaidButton();
            }
            if (-1 != b313 && 0 != pj_._r) {
                hi_._c.a093(1, pj_._r);
            }
            if (n != 5458) {
                this.a628(null, -127);
            }
        }
    }
    
    static {
        bg_.text_buy = "Buy";
        bg_._s = new md_();
        bg_.loading = "Loading...";
    }
}
