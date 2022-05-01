final class db_ extends qe_
{
    private rh_ _r;
    //original name: _u
    static String quittowebsite;
    private ae_ _w;
    private HeaderLabelText[] _s;
    private rh_ _t;
    //original name: _v
    static FontStyle roman12bold;
    
    private final void b150(final int n) {
        if (n > -20) {
            this.b423((byte)115);
        }
        db_.roman12bold.c191(fd_.text_title_heading, 213, 241, 16777215, -1);
        int n2 = gm_.playerInformation._w;
        if (null != fo_._d._l) {
            n2 = (int)fo_._d._l._u;
        }
        if (o_.a091(gj_._c, null, n2, gm_.playerInformation)) {
            la_.roman12.a385(jk_.replacePlaceholders(new String[] { pj_.a022(gm_.playerInformation._w, tc_.playerTitle) }, DungeonAssault.text_title_hint), 70, 338, 270, 180, 16760960, -1, 1, 0, la_.roman12._H + la_.roman12._E);
        }
        else {
            final String a022 = ib_.a022(16760960, pj_.a022(n2, tc_.playerTitle));
            String s = jk_.replacePlaceholders(new String[] { a022 }, dk_.text_title_requirements_unknown);
            final int n3 = 0x7F & n2;
            if (MusicTrack._a > n3) {
                if (n3 < 64) {
                    if (48 <= n3) {
                        final int n4 = -48 + n3;
                        if (bl_._n.length > n4) {
                            s = jk_.replacePlaceholders(new String[] { ib_.a022(16760960, ce_.achievement_names[bl_._n[n4]]), a022 }, l_.text_title_requirements_achievement);
                        }
                    }
                    else if (32 > n3) {
                        if (16 <= n3) {
                            final int n5 = -16 + n3;
                            if (n5 < RaidMember._m.length) {
                                final int n6 = RaidMember._m[n5];
                                final String a23 = ib_.a022(16760960, Integer.toString(n6));
                                if (n6 == 0) {
                                    s = jk_.replacePlaceholders(new String[] { a23, a022 }, wf_.text_title_requirements_mastery_x);
                                }
                                else {
                                    s = jk_.replacePlaceholders(new String[] { a23, a022 }, tl_.text_title_requirements_mastery_one);
                                }
                            }
                        }
                        else if (0 <= n3) {
                            final int n7 = n3;
                            if (n7 < dc_._p.length) {
                                final int n8 = dc_._p[n7];
                                final String a24 = ib_.a022(16760960, Integer.toString(n8));
                                if (n8 != 0) {
                                    s = jk_.replacePlaceholders(new String[] { a24, a022 }, be_.text_title_requirements_age_one);
                                }
                                else {
                                    s = jk_.replacePlaceholders(new String[] { a24, a022 }, vj_.text_title_requirements_age_x);
                                }
                            }
                        }
                    }
                    else {
                        final int n9 = n3 - 32;
                        if (n9 < ci_._s.length) {
                            s = jk_.replacePlaceholders(new String[] { ib_.a022(16760960, Integer.toString(ci_._s[n9])), a022 }, Trap.text_title_requirements_aggression);
                        }
                    }
                }
                else {
                    final int n10 = -64 + n3;
                    if (n10 < id_._j.length) {
                        s = jk_.replacePlaceholders(new String[] { ib_.a022(16760960, ka_.titles_external_achievement[n10]), ib_.a022(16760960, ab_.titles_external_game[n10]), a022 }, uk_.text_title_requirements_external);
                    }
                }
            }
            la_.roman12.a385(s, 75, 338, 260, 180, 8421504, -1, 1, 0, la_.roman12._E + la_.roman12._H);
        }
    }
    
    private final void a366(final int y, final byte b) {
        final String a661 = this.a661(tg_._f[3][y], 0);
        final Graphic cn_ = new Graphic(ne_.roman20.b926(a661), ne_.roman20._E + ne_.roman20._H);
        jh_.a303(cn_);
        ne_.roman20.b191(a661, 0, ne_.roman20._H, 16760960, -1);
        jh_.b797();
        if (b != -121) {
            c423();
        }
        ga_._r = GUICheckbox.a551(8, cn_, 16760960, (byte)109);
        co_._F = GUICheckbox.a551(16, cn_, 6307840, (byte)(-111));
        nf_._y = y;
    }
    
    //original signature: private final void a183(final boolean b, final int n, final int n2) {
    private final void a183(final boolean b, final int n) {
        final int n3 = tg_._f[3][n];
        final String a661 = this.a661(n3, 0);
        final int b2 = ne_.roman20.b926(a661);
        final int b3 = bh_.b650(n, 3);
        final int a662 = qd_.a313(n, 3);
        int a663 = o_.a776(3, n);
        final int n4 = -b2 + (b3 + a662) >> 1;
        if (!ke_.a097(n3)) {
            a663 += 4;
        }
        final boolean a664 = rp_.a097(n3);
        int[] c = b ? (a664 ? ml_._b : ug_._E) : (a664 ? ag_._c : HeaderLabelText._k);
        Label_0179: {
            if (!a664) {
                if (!of_._k) {
                    if (23 != n3) {
                        break Label_0179;
                    }
                }
                else if (n3 != 22) {
                    break Label_0179;
                }
                c = fo_._c;
            }
        }
        if (null == this._s[n] || this._s[n].text != a661 || this._s[n].possibleColors != c) {
            this._s[n] = new HeaderLabelText(ne_.roman20, a661, c);
        }
        this._s[n].b326(a663, n4);
        if (22 == n3) {
            if (ak_._o[0] > gm_.playerInformation.highestRenown) {
                hj_.menu_locked.drawImage(n4 - 20, ne_.roman20._H + a663 - 15);
            }
        }
        if (b) {
            if (n != nf_._y) {
                this.a366(n, (byte)(-121));
            }
            ga_._r.b326(n4, a663, 64);
            int n5 = (int)((1.0 + te_.a132(mo_._a)) * 128.0);
            if (n5 < 0) {
                n5 = 0;
            }
            if (n5 > 256) {
                n5 = 256;
            }
            co_._F.b326(n4, a663, n5);
        }
    }
    
    @Override
    final void c797() {
        super.c797();
        this._s = null;
    }
    
    @Override
    final void c487(final boolean b) {
        super.c487(b);
        final bf_[] l = wd_._l;
        for (int n = 0; l.length > n; ++n) {
            l[n].a150(-87);
        }
        if (!kh_._s || !b) {
            this.b423((byte)(-50));
            if (hh_._s != null) {
                if (hh_._s._u instanceof Integer) {
                    final int intValue = (int)hh_._s._u;
                    if (o_.a091(gj_._c, null, intValue, gm_.playerInformation)) {
                        gm_.playerInformation._w = intValue;
                        Trap._B.storeFuzzedOpcode(59);
                        Trap._B.storeByte(intValue);
                    }
                }
            }
            while (ha_.b427()) {
                this.f797();
            }
        }
        if (super._b != null && super._b._d) {
            if (super._b instanceof WarningMessage) {
                final WarningMessage pk_ = (WarningMessage)super._b;
                if (pk_._r) {
                    this.a556(pk_._u);
                }
            }
            super._b.c150();
            super._b = null;
        }
        if (null != mk_._j._l) {
            final int o = ((lk_)mk_._j._l)._O;
            final int n2 = gm_.playerInformation._J[o] + gm_.playerInformation._F[o];
            final int n3 = (n2 * 1 + 10) * fj_._g[o] / 10;
            final boolean b2 = ve_.a491() && 5 <= n2 && hm_._m[o];
            hf_._mb._D = og_._e._N;
            hf_._mb.isActive = (hf_._mb._D && !b2 && n3 <= gm_.playerInformation.unspentTreasureAmount);
        }
        else {
            hf_._mb.isActive = false;
            hf_._mb._D = false;
        }
    }
    
    private final String a661(final int n, final int n2) {
        if (n2 != 0) {
            this.d487(false);
        }
        String s = ll_.menuOptions[n];
        if (n == 10) {
            if (ec_._p == 0 || 0 == dc_._z || 12 == ec_._p || 12 == dc_._z || ec_._p == 1 || 1 == dc_._z) {
                s = ll_.menuOptions[9];
            }
        }
        return s;
    }
    
    private final void b093(final int n, final int n2) {
        final int n3 = tg_._f[3][n2];
        final int b650 = bh_.b650(n2, 3);
        final int a313 = qd_.a313(n2, 3);
        if (n < 60) {
            this.b423((byte)(-57));
        }
        int a314 = o_.a776(3, n2);
        if (ke_.a097(n3)) {
            gf_.e050(b650 - 4, a314 - 6, 8 + a313 - b650, 38, 0);
            qe_.b370(b650, a314 - 2, a313 - b650, 30, 8421504, 128, 128);
            rp_.a857(4, a313 - b650, (byte)108, b650, 30, kc_._S, a314 - 2);
            qe_.a229(b650, a314 - 2, a313 - b650, 30, 224, 64, 3, 128);
        }
        else {
            of_.menu_button.drawImage(-of_.menu_button.imageWidth + (b650 + a313) >> 1, a314);
            a314 += 4;
        }
    }
    
    private final void a423(final byte b) {
        final int n = 241;
        this.b797();
        final int n2 = 0;
        fo_._d = new nn_(true);
        Animation._o = new ed_(90, n + 7, 250, -n + 328);
        super._p.a865(Animation._o);
        int n3 = n2 + (this.a470(n2, -1, -111, true).imageHeight + 3);
        for (int n4 = 0; bl_._n.length > n4; ++n4) {
            final int n5 = 48 + n4;
            final boolean a091 = o_.a091(gj_._c, null, n5, gm_.playerInformation);
            n3 += 3 + this.a470(n3, n5, 32, a091).imageHeight;
            if (!bh_.getTitle(n5).equals(bh_.getTitle(n5 + 128))) {
                n3 += 3 + this.a470(n3, 128 + n5, -7, a091).imageHeight;
            }
        }
        int n6 = 0;
        if (b >= -65) {
            db_.quittowebsite = null;
        }
        while (dc_._p.length > n6) {
            final int n7 = n6;
            final boolean a92 = o_.a091(gj_._c, null, n7, gm_.playerInformation);
            n3 += this.a470(n3, n7, 2, a92).imageHeight + 3;
            if (!bh_.getTitle(n7).equals(bh_.getTitle(128 + n7))) {
                n3 += 3 + this.a470(n3, n7 + 128, 99, a92).imageHeight;
            }
            if (!a92) {
                break;
            }
            ++n6;
        }
        for (int n8 = 0; RaidMember._m.length > n8; ++n8) {
            final int n9 = 16 + n8;
            final boolean a93 = o_.a091(gj_._c, null, n9, gm_.playerInformation);
            n3 += this.a470(n3, n9, -117, a93).imageHeight + 3;
            if (!bh_.getTitle(n9).equals(bh_.getTitle(n9 + 128))) {
                n3 += this.a470(n3, 128 + n9, 47, a93).imageHeight + 3;
            }
            if (!a93) {
                break;
            }
        }
        for (int i = 0; i < ci_._s.length; ++i) {
            final int n10 = i + 32;
            final boolean a94 = o_.a091(gj_._c, null, n10, gm_.playerInformation);
            n3 += this.a470(n3, n10, -112, a94).imageHeight + 3;
            if (!bh_.getTitle(n10).equals(bh_.getTitle(128 + n10))) {
                n3 += this.a470(n3, n10 + 128, 18, a94).imageHeight + 3;
            }
            if (!a94) {
                break;
            }
        }
        for (int n11 = 0; id_._j.length > n11; ++n11) {
            final int n12 = 64 + n11;
            final boolean a95 = o_.a091(gj_._c, null, n12, gm_.playerInformation);
            n3 += 3 + this.a470(n3, n12, -121, a95).imageHeight;
            if (!bh_.getTitle(n12).equals(bh_.getTitle(128 + n12))) {
                n3 += 3 + this.a470(n3, 128 + n12, -111, a95).imageHeight;
            }
        }
        mk_._j = new nn_(true);
        og_._e = new ed_(90, 7 + n, 250, -n + 328);
        final ed_ e = og_._e;
        og_._e._N = false;
        e.isActive = false;
        super._p.a865(og_._e);
        hf_._mb = tn_.a226(-(kg_.small_button.imageWidth / 2) + (363 + (200 - ao_.scroll_top.imageWidth2 >> 1)) + ao_.scroll_top.imageWidth2 / 2, 337, db_.roman12bold, kg_.small_button, -81, bg_.text_buy.toUpperCase());
        final pp_ mb = hf_._mb;
        hf_._mb._D = false;
        mb.isActive = false;
        int n13 = 0;
        super._p.a865(hf_._mb);
        int n14 = 1;
        for (int j = 0; j < 6; ++j) {
            if (gm_.playerInformation.highestRenown >= ak_._o[j]) {
                if (AmbientAudioTrack._b[j]) {
                    final lk_ lk_ = new lk_(0, n13, 200, 40, j);
                    og_._e.a720(lk_, (byte)(-101));
                    n13 += 40;
                    mk_._j.a507(lk_);
                    if (n14 != 0) {
                        n14 = 0;
                        mk_._j.a780(lk_, -256);
                    }
                }
            }
        }
        og_._e.e150(49);
        og_._e.c093(8);
    }
    
    private final void b423(final byte b) {
        if (super.d801()) {
            return;
        }
        this._w.a326(-7734, this.a586(hm_.mouseY, lc_.mouseX, (byte)(-117)), this.a586(Animation.mouseY, hj_.mouseX, (byte)(-117)));
        if (b != -50) {
            this._w = null;
        }
        if (this._w._b != -1) {
            this.a663(this._w._b, true);
        }
        if (hh_._s == hf_._mb) {
            final int o = ((lk_)mk_._j._l)._O;
            if (0 == gm_.playerInformation._e) {
                super._b = new WarningMessage(ag_.text_orbs_of_mastery, oj_.text_orb_warning, o);
            }
            else {
                this.a556(o);
            }
        }
    }
    
    //original signature: private final void a556(final byte b, final int n) {
    private final void a556(final int n) {
        final int[] f = gm_.playerInformation._F;
        f[n]++;
        final PlayerInformation playerInformation = gm_.playerInformation;
        playerInformation._e++;
        final int n2 = gm_.playerInformation._F[n] + gm_.playerInformation._J[n];
        final int n3 = fj_._g[n] * (n2 * 1 + 10) / 10;
        playerInformation.unspentTreasureAmount -= n3;
        if (-1 != gm_.playerInformation._A) {
            gm_.playerInformation._A = 10080 + (int)(kd_.getTime() / 60000L - 16912800L);
        }
        Trap._B.storeFuzzedOpcode(73);
        Trap._B.storeByte(n);
        hi_.b150(1);
    }
    
    //original signature: private final void a150(final int n) {
    private final void a150() {
        final PlayerInformation d = gm_.playerInformation;
        int n3 = 130;
        final int n4 = kk_.smallfont._E + kk_.smallfont._H;
        gf_.b669(367, n3 - 16, 186, 70, 16777215, 40);
        db_.roman12bold.b191(jk_.replacePlaceholders(new String[] { gh_.a382(d.renown) }, kk_.text_renown_x), 370, n3, 0, -1);
        n3 += 16;
        db_.roman12bold.b191(jk_.replacePlaceholders(new String[] { gh_.a382(d.highestRenown) }, mm_.text_highest_x), 370, n3, 0, -1);
        n3 += 16;
        db_.roman12bold.b191(jk_.replacePlaceholders(new String[] { Integer.toString(d.unspentTreasureAmount / 10) }, bp_.text_unspent_x), 370, n3, 0, -1);
        n3 += 16;
        kk_.smallfont.b191(jk_.replacePlaceholders(new String[] { gh_.a382(60 * (int)(0.5 + Math.pow(2.0, -d.renown / 10000.0) * 250.0) / 60 + 10 * gm_.playerInformation._J[2]) }, la_.text_income_rate), 370, n3, 0, -1);
        final int n6 = 9;
        int n7 = n3 + (n6 + 16);
        String s;
        if (0 >= d.raidsAttempted) {
            s = wa_.text_no_raids;
        }
        else {
            s = jk_.replacePlaceholders(new String[] { Integer.toString(d.raidsAttempted), Integer.toString(d.raidsSuccessful), Integer.toString(d._D) }, ip_.text_outcome);
        }
        String s2;
        if (d.defencesAttempted <= 0) {
            s2 = jk_.replacePlaceholders(new String[] { Integer.toString(d.defencesAttempted), Integer.toString(d.defencesSuccessful), Integer.toString(d._I) }, GUIInput.text_no_defences);
        }
        else {
            s2 = jk_.replacePlaceholders(new String[] { Integer.toString(d.defencesAttempted), Integer.toString(d.defencesSuccessful), Integer.toString(d._I) }, ip_.text_outcome);
        }
        final int n8 = bl_.scroll_tile.imageWidth - 55;
        gf_.b669(367, n7 - 16, 186, 6 + (2 + kk_.smallfont.c913(s, n8) + kk_.smallfont.c913(s2, n8)) * 16, 16777215, 40);
        db_.roman12bold.b191(DungeonBuilder.text_raids, 370, n7, 0, -1);
        n7 += 16;
        int n9 = n7 + 16 * kk_.smallfont.a385(s, 10 + 370, -n4 + n7, n8, 100, 0, -1, 0, 0, n4);
        db_.roman12bold.b191(GUICheckbox.text_defences, 370, n9, 0, -1);
        n9 += 16;
        int n10 = n9 + (16 * kk_.smallfont.a385(s2, 370 + 10, -n4 + n9, n8, 100, 0, -1, 0, 0, n4) + n6);
        if (d._t[0] != -1L) {
            int n11 = 0;
            final int n12 = n10;
            for (int n13 = 0; 10 > n13 && -1L != d._t[n13]; ++n13) {
                ++n11;
                n10 += kk_.smallfont._H;
                if (n10 > 350) {
                    break;
                }
            }
            int n14 = n12;
            gf_.b669(367, n14 - 16, 186, 20 + kk_.smallfont._H * 6, 16777215, 40);
            db_.roman12bold.b191(oh_.text_recently_raided_by, 370, n14, 0, -1);
            n14 += 16;
            for (int n15 = 0; 10 > n15; ++n15) {
                final long n16 = d._t[n15];
                if (n16 == -1L) {
                    break;
                }
                kk_.smallfont.b191(uj_.decodeBase37EncodedString(n16), 380, n14, 14352640, -1);
                n14 += kk_.smallfont._H;
                if (n14 > 350) {
                    break;
                }
            }
        }
        this.b150(-121);
    }
    
    @Override
    final void b487(final boolean b) {
        super.b487(b);
        tg_._f[3] = nb_._e;
        this._w = new ae_(tg_._f[3].length);
        fk_.a261(lf_.da_title3);
        jh_.a276(super._e);
        bf_.drawBorder(false);
        final int[] array = new int[4];
        gf_.a331(array);
        gf_.e115(41, 48, 599, 416);
        am_.menu_chain_frame.drawImage(-(am_.menu_chain_frame.imageWidth2 / 2) + 320, 48);
        gf_.b331(array);
        jh_.b797();
        this._s = new HeaderLabelText[this._w._i];
        this.a423((byte)(-127));
        wd_._l = new bf_[6];
        for (int i = 0; i < 6; ++i) {
            wd_._l[i] = new bf_(sf_._b[i]);
        }
        this._r = new rh_(58, 394, 80, 160, 255, 197376, 240);
        this._t = new rh_(580, 394, 80, 160, 255, 197376, 240);
        mh_.b150(-1);
    }
    
    private final gd_ a470(final int n, final int n2, final int n3, final boolean b) {
        final int n4 = b ? 16777215 : 8421504;
        final int n5 = b ? 8421616 : 4210816;
        final int n6 = b ? 12690143 : 65793;
        final String a975 = u_.a975(db_.roman12bold, tc_.playerTitle, n2, n4, Animation._o.imageWidth - 25);
        final int b2 = db_.roman12bold.b926(a975);
        final int n7 = db_.roman12bold._H + la_.roman12._E;
        final Graphic cn_ = new Graphic(b2, n7);
        final Graphic cn_2 = new Graphic(b2, n7);
        final Graphic cn_3 = new Graphic(b2, n7);
        jh_.c797();
        cn_.e797();
        db_.roman12bold.b191(a975, 0, la_.roman12._H, n5, -1);
        cn_2.e797();
        gf_.a797();
        cn_.e326(0, 0, 16744448);
        cn_3.e797();
        gf_.a797();
        cn_.e326(0, 0, n6);
        jh_.b797();
        final gd_ gd_ = new gd_(cn_, cn_3, GUICheckbox.a551(16, cn_2, 255, (byte)81), cn_2, GUICheckbox.a551(16, cn_2, 16711680, (byte)(-44)), 0, n);
        gd_._u = new Integer(n2);
        Animation._o.a720(gd_, (byte)(-49));
        fo_._d.a507(gd_);
        if (gm_.playerInformation._w == n2) {
            fo_._d.a780(gd_, -256);
        }
        return gd_;
    }
    
    @Override
    final void a487(final boolean b) {
        super._e.drawImage(0, 0);
        for (int n = 0; this._w._i > n; ++n) {
            if (sg_.a330(3, 3, n)) {
                this.b093(83, n);
            }
        }
        final int[] array = new int[4];
        gf_.a331(array);
        gf_.e115(41, 48, 599, 416);
        le_.menu_moss_top_left.drawImage(50, 60);
        dh_.a115(32, 360, 220, 120);
        gf_.b331(array);
        gf_.b669(80, 250, 256, 85, 1118481, 128);
        gf_.e669(80, 250, 256, 85, 5592405, 128);
        for (rj_ rj_ = (rj_)super._p.e024(); rj_ != null; rj_ = (rj_)super._p.a024(4)) {
            rj_.a150(102);
        }
        if (null != super._b) {
            super._b.a423((byte)(-118));
        }
        oe_.interface_dragon.h093(24, 383);
        oe_.interface_dragon.j093(560, 383);
        e797();
        this._r.d797();
        this._t.d797();
        for (int n2 = 0; this._w._i > n2; ++n2) {
            if (sg_.a330(3, 3, n2)) {
                this.a183(this._w._b == n2, n2);
            }
        }
        if (of_._k) {
            this.d487(true);
        }
        else {
            this.a150();
        }
        for (rj_ rj_2 = (rj_)super._p.e024(); null != rj_2; rj_2 = (rj_)super._p.a024(4)) {
            rj_2.d150(0);
        }
        if (null != super._b) {
            super._b.b150(117);
        }
        bf_.profileHeaderLabel.drawHeaderLabel();
    }
    
    private final void d487(final boolean b) {
        final int n = 461;
        if (!b) {
            this._t = null;
        }
        final int n2 = 170;
        if (null != mk_._j._l) {
            gf_.b669(370, 110, 182, 124, 0, 208);
            final int o = ((lk_)mk_._j._l)._O;
            wd_._l[o].a668(n2, n, true, 100);
            db_.roman12bold.c191(li_.orbNames[o], n, n2 + 90, 0, -1);
            final int n3 = gm_.playerInformation._J[o] + gm_.playerInformation._F[o];
            if (!ve_.a491() || !hm_._m[o] || 5 > n3) {
                final int n4 = (10 + 1 * n3) * fj_._g[o] / 10;
                db_.roman12bold.c191(jk_.replacePlaceholders(new String[] { Integer.toString(n4 / 10) }, ho_.text_cost_x), n, 105 + n2, (n4 > gm_.playerInformation.unspentTreasureAmount) ? 16711680 : 0, -1);
                la_.roman12.a385(un_.orbDescriptions[o], n - 80, n2 + 120, 160, 100, 0, -1, 1, 0, la_.roman12._H);
            }
            else {
                la_.roman12.a385(bl_.text_limit_reached_long, n - 80, n2 + 120, 160, 100, 0, -1, 1, 0, la_.roman12._H);
            }
        }
        String s = ng_.text_charging_hint_none;
        int n5 = 16777215;
        if (0 < gm_.playerInformation._e) {
            if (1 >= gm_.playerInformation._e) {
                s = oc_.text_charging_hint_x;
            }
            else {
                s = jk_.replacePlaceholders(new String[] { Integer.toString(gm_.playerInformation._e) }, dg_.text_charging_hint_x);
            }
            n5 = 16711680;
            la_.roman12.a385(jk_.replacePlaceholders(new String[] { jk_.a661(120, gm_.playerInformation._A) }, fl_.text_dungeon_reset), 80, 338, 250, 180, n5, -1, 1, 0, db_.roman12bold._H);
        }
        la_.roman12.a385(s, 80, -la_.roman12._H + 211, 250, 45, n5, -1, 1, 2, db_.roman12bold._H);
    }
    
    //original signature: private final void a663(final int n, final int n2, final boolean b) {
    private final void a663(final int n, final boolean b) {
        final int n3 = tg_._f[3][n];
        if (this._w.c154(97) && sg_.a330(3, 3, n)) {
            if (rp_.a097(n3)) {
                hm_.a668(n3, n, b, -64);
            }
        }
    }
    
    @Override
    final void f797() {
        if (mm_._t == 13) {
            gd_.a778(ec_._p, 0, ec_._p, false);
            return;
        }
        if (ll_.debugMode && 1 == mm_._t) {
            ld_._b = !ld_._b;
        }
        if (null == super._b) {
            this._w.d150(0);
            if (this._w._b != -1) {
                this.a663(this._w._b, false);
            }
            return;
        }
        super._b.b487(false);
    }
    
    private final int a586(final int n, final int n2, final byte b) {
        for (int n3 = 0; tg_._f[3].length > n3; ++n3) {
            final int a776 = o_.a776(3, n3);
            if (sg_.a330(3, 3, n3) && n2 >= bh_.b650(n3, 3) && qd_.a313(n3, 3) > n2 && n >= a776 && n < a776 + 30) {
                return n3;
            }
        }
        return -1;
    }
    
    public static void c423() {
        db_.roman12bold = null;
        db_.quittowebsite = null;
    }
    
    static {
        db_.quittowebsite = "Quit to website";
    }
}
