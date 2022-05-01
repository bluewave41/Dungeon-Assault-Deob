final class ih_ extends qe_
{
    private Graphic _I;
    private Graphic _z;
    private HeaderLabelText _B;
    private boolean _E;
    private Graphic _A;
    private Graphic _u;
    static int[] _r;
    //original name: _s
    static String spectre;
    private int _C;
    static int[] _J;
    private int _t;
    static qh_[] _w;
    private int _G;
    //original name: _x
    static HeaderLabelText dragonsOfRenownHeaderLabel;
    private rh_ _D;
    //original name: _v
    static String chaos_champion;
    private wd_ _F;
    private rh_ _y;
    
    private final int a313(final int n, final int n2, final int n3) {
        int n4 = 0;
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 4; ++j, ++n4) {
                int n5 = j * 102 + 195;
                final int n6 = 104 * i + 60;
                if (i == 2) {
                    n5 += 51;
                }
                if (n5 <= n3 && n2 >= n6 && n3 < 96 + n5 && n6 + 96 > n2) {
                    return n4;
                }
                if (n4 == 7) {
                    break;
                }
            }
        }
        if (n != -1) {
            return 95;
        }
        return -1;
    }
    
    @Override
    final void c797() {
        this._A = null;
        this._u = null;
        j_._Q = null;
        ld_._e = null;
        this._z = null;
        this._I = null;
        System.gc();
    }
    
    private final void d487(final boolean b) {
        if (gm_.playerInformation.unspentTreasureAmount >= Trap._s) {
            if (!tl_._l) {
                Trap._B.storeFuzzedOpcode(56);
                for (int i = 0; i < 8; ++i) {
                    if (um_.stableMembers[i] != gm_.playerInformation.stableMembers[i]) {
                        if (um_.stableMembers[i] != null) {
                            Trap._B.storeByte(um_.stableMembers[i].raiderId);
                        }
                        else {
                            Trap._B.storeByte(0);
                        }
                    }
                    else {
                        Trap._B.storeByte(-1);
                    }
                }
            }
            for (int n = 0; 8 > n; ++n) {
                gm_.playerInformation.stableMembers[n] = um_.stableMembers[n];
            }
            final PlayerInformation d = gm_.playerInformation;
            d.unspentTreasureAmount -= Trap._s;
            this.d150(1793);
        }
        if (!b) {
            ih_._r = null;
        }
        ho_.b423();
    }
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        super._e.drawImage(0, 0);
        this.b150(-123);
        RaidMember hb_ = null;
        if (-1 != this._t && null != um_.stableMembers[this._t]) {
            hb_ = um_.stableMembers[this._t];
        }
        else if (this._C != -1 && um_.stableMembers[this._C] != null) {
            hb_ = um_.stableMembers[this._C];
        }
        Raider h_ = null;
        if (hb_ != null) {
            h_ = hb_.raider;
        }
        else if (op_._d._l != null) {
            h_ = ((u_)op_._d._l)._Q;
        }
        if (null == hb_) {
            qe_.a204(216, 275, this._F, kc_._S);
        }
        else {
            qe_.a594(216, 275, hb_);
        }
        if (hb_ != null) {
            qe_.a305(339, 289, hb_, 0);
        }
        else {
            qe_.a420(339, 289, h_);
        }
        this.b326(286, 144, 476);
        for (rj_ rj_ = (rj_)super._p.e024(); rj_ != null; rj_ = (rj_)super._p.a024(4)) {
            rj_.a150(93);
        }
        ad_.interface_crescent.h093(188, 48);
        ad_.interface_crescent.i093(188, -ad_.interface_crescent.imageHeight + 40);
        ad_.interface_crescent.i093(460, -ad_.interface_crescent.imageHeight + 40);
        ad_.interface_crescent.f093(-ad_.interface_crescent.imageWidth - be_._o.imageWidth + 460, -ad_.interface_crescent.imageHeight + 40);
        oe_.interface_dragon.h093(171, 360);
        oe_.interface_dragon.j093(-oe_.interface_dragon.imageWidth + 620, 360);
        if (null != super._b) {
            super._b.a423((byte)(-101));
        }
        e797();
        super._q.a423((byte)(-40));
        for (rj_ rj_2 = (rj_)super._p.e024(); rj_2 != null; rj_2 = (rj_)super._p.a024(4)) {
            rj_2.d150(0);
        }
        this.g150(0);
        this._y.d797();
        this._D.d797();
        if (super._b != null) {
            for (int n = 0; gf_._b.length > n; ++n) {
                gf_._b[n] = nb_.and(-50529028, gf_._b[n]) >>> 2;
            }
            super._b.b150(108);
        }
        if (kn_.isTutorial) {
            ab_.a150();
        }
        if (null != op_._d._l) {
            final Raider q = ((u_)op_._d._l)._Q;
            final int s = hj_.mouseX;
            final int n2 = Animation.mouseY - 40;
            rp_.a857(8, 40, (byte)108, s, 40, kc_._S, n2);
            final Graphic cn_ = (null == q.idleAnimation) ? null : q.idleAnimation.a571(40, 0, 40);
            if (cn_ != null) {
                cn_.d326(s, n2, 128);
            }
            else {
                gf_.b669(s, n2, 40, 40, 0, 128);
            }
        }
        oh_.a423();
    }
    
    //original signature: static final String[] a640(final int n, final char c, final String s) {
    static final String[] split(final char c, final String s) {
        final int occurences = rm_.countOccurencesOfCharacter(s, c);
        final String[] array = new String[1 + occurences];
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < occurences; ++i) {
            int n4;
            for (n4 = n3; c != s.charAt(n4); ++n4) {}
            array[n2++] = s.substring(n3, n4);
            n3 = n4 + 1;
        }
        array[occurences] = s.substring(n3);
        return array;
    }
    
    private final void f150(final int n) {
        this._t = -1;
        if (kn_.isTutorial) {
            if (od_.a427()) {
                return;
            }
        }
        if (n != -24900) {
            this.c487(true);
        }
        if (!super.d801()) {
            this._t = this.a313(-1, Animation.mouseY, hj_.mouseX);
            if (-1 != this._t && null != um_.stableMembers[this._t]) {
                final RaidMember e = um_.stableMembers[this._t];
                if (ld_._e != e) {
                    j_._Q = new fc_(null, e);
                    ld_._e = e;
                }
                final RaidMemberStatusIcon[] i = e._i;
                en_ en_ = j_._Q;
                if (null != i) {
                    final int n2 = this._t / 4;
                    int n3 = 102 * (0x3 & this._t) + 195;
                    int n4 = 60 + n2 * 104;
                    n4 += 78;
                    final int n5 = 7;
                    n3 += 78;
                    int n6 = n3;
                    int n7 = n4;
                    int j = 0;
                    while (j < i.length) {
                        final RaidMemberStatusIcon wb_ = i[j];
                        if (jg_.a643(n6, 12, 12, n7)) {
                            en_ = wb_.a047();
                        }
                        n6 -= 16;
                        if (++j % n5 != 0) {
                            continue;
                        }
                        n7 -= 16;
                        n6 = n3;
                    }
                }
                uj_.a872(en_);
            }
            if (hh_._s == sn_._b) {
                this.d487(true);
                this.a893((byte)(-92), true);
            }
            else if (hh_._s != nl_._a) {
                if (in_._y == hh_._s) {
                    final RaidMember hb_ = (-1 != this._C) ? um_.stableMembers[this._C] : null;
                    if (hb_ != null) {
                        um_.stableMembers[this._C] = new RaidMember(this._C, hb_.raiderId);
                        um_.stableMembers[this._C]._b = new wd_(hb_.raider.idleAnimation);
                        ho_.b423();
                        this.a556((byte)(-112), -1);
                    }
                }
                else if (hh_._s != null && hh_._s instanceof u_) {
                    final Raider q = ((u_)hh_._s)._Q;
                    this.a556((byte)(-112), -1);
                    if (null == this._F || q.victoryAnimation != this._F._n) {
                        this._F = new wd_(q.idleAnimation, q.victoryAnimation, rf_._M);
                        if (null != q.revealTrack) {
                            gd_.a364(64, q.revealTrack);
                        }
                    }
                }
                else if (hh_._s != hl_._b) {
                    if (hh_._s != hi_._a) {
                        if (hh_._s == kl_._h) {
                            this.a093(2, n ^ 0xFFFF9EBC);
                        }
                        else if (cd_._d != hh_._s) {
                            if (hh_._s != am_._f) {
                                if (no_.isMetaDown == 1) {
                                    final int a313 = this.a313(-1, hm_.mouseY, lc_.mouseX);
                                    if (-1 != a313) {
                                        if (op_._d._l != null) {
                                            final Raider q2 = ((u_)op_._d._l)._Q;
                                            um_.stableMembers[a313] = new RaidMember(a313, q2.raiderId);
                                            um_.stableMembers[a313]._b = new wd_(q2.idleAnimation);
                                            ho_.b423();
                                            op_._d.a423();
                                        }
                                        else if (um_.stableMembers[a313] != null) {
                                            op_._d.a423();
                                            this._F = null;
                                            this.a556((byte)(-112), a313);
                                            final RaidMember hb_2 = um_.stableMembers[this._C];
                                            final Raider n8 = hb_2.raider;
                                            if (null != hb_2) {
                                                if (hb_2._p != 255) {
                                                    if (n8.selectAnimation != hb_2._b._n) {
                                                        hb_2._b.a942(n8.selectAnimation); //plays animation
                                                        if (hb_2.raider.revealTrack != null) {
                                                            gd_.a364(n ^ 0xFFFF9EFC, n8.revealTrack);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                else if (2 == no_.isMetaDown) {
                                    final int a314 = this.a313(-1, hm_.mouseY, lc_.mouseX);
                                    if (a314 != -1) {
                                        um_.stableMembers[a314] = gm_.playerInformation.stableMembers[a314];
                                        if (null != um_.stableMembers[a314] && um_.stableMembers[a314]._b == null) {
                                            um_.stableMembers[a314]._b = new wd_(um_.stableMembers[a314].raider.idleAnimation);
                                        }
                                        ho_.b423();
                                    }
                                    this._F = null;
                                    this.a556((byte)(-112), -1);
                                    op_._d.a423();
                                }
                            }
                            else {
                                this.a093(6, 0);
                            }
                        }
                        else {
                            this.a093(5, 0);
                        }
                    }
                    else {
                        this.a093(1, 0);
                    }
                }
                else {
                    this.a093(0, 0);
                }
            }
            else {
                this.d150(n + 26693);
                this.a893((byte)(-125), true);
            }
        }
    }
    
    @Override
    final void b487(final boolean b) {
        super.b487(b);
        fk_.a261(lf_.da_title3);
        bl_.a423();
        qe_.b716(super._e, 188, 48, 605, 279);
        qe_.b716(super._e, 188, 364, 605, 378);
        qe_.b716(super._e, 188, 401, 605, 407);
        jh_.a276(super._e);
        //te_.a812(188, 280, 423, kc_._M);
        //te_.a812(188, 362, 423, kc_._M);
        //te_.a812(188, 378, 423, kc_._M);
        //te_.a812(188, 399, 423, kc_._M);
        //te_.a812(188, 408, 423, kc_._M);
        //qe_.a229(188, 281, 433, 80, 256, 32, 8, 128);
        //qe_.a229(188, 379, 433, 20, 256, 32, 8, 128);
        //qe_.a229(8, 8, 172, 32, 256, 64, 4, 128);
        //qe_.a229(188, 8, 264, 32, 256, 64, 4, 128);
        //qe_.a229(460, 8, 172, 32, 256, 64, 4, 128);
        this._B.b326(12, 640 - this._B._i >> 1);
        //Raider.a086(false, 425, 618, true, bk_.cracked_bar.imageHeight + 40);
        //ke_.a115(180, 480, 0);
        //ke_.a115(605, 480, bk_.cracked_bar.imageHeight + 40);
        //ke_.a115(640 - be_._o.imageWidth, 480, 0);
        //ke_.a115(0, 480, 0);
        //c_.a842(0);
        //c_.a842(40);
        //jc_.a669(32, 460 - be_._o.imageWidth, 8, 1, 2, 1);
        //c_.a842(480 - bk_.cracked_bar.imageHeight);
        //qe_.b370(be_._o.imageWidth, 40 + bk_.cracked_bar.imageHeight, 170, 425, 16777215, 32, 128);
        //Raider.a086(false, 425, 20, true, bk_.cracked_bar.imageHeight + 40);
        //qe_.a229(8, 47, 172, 425, 256, 32, 8, 128);
        //qe_.a115(14, 55, 161, 36);
        jh_.b797();
        this.c150(65); //texts
        u_.a041(null); //draw raider boxes?
        this._F = null;
        this._A = mf_.a971(10449103, 96, 6, 96);
        this._u = mf_.a971(255, 96, 12, 96);
        this._z = mf_.a971(16711680, 96, 12, 96);
        this._I = mf_.a971(8454143, 96, 12, 96);
        this._y = new rh_(205, 371, 80, 160, 16711680, 768, 249);
        this._D = new rh_(-oe_.interface_dragon.imageWidth + 640, 371, 80, 160, 16711680, 768, 249);
        qh_.a726(lf_._y[1], 20);
    }
    
    static final void a423(final byte b) {
        tc_.playerTitle = ra_._c.d738();
        nn_._k = jm_.lowerCaseReplaceSpaceWithUnderscore(tc_.playerTitle);
    }
    
    private final void b326(final int n, final int n2, final int n3) {
        qe_.a115(n3, n, n2, 30);
        qe_.a115(n3, 40 + n, 144, 30);
        int n4 = 8 + n + la_.roman12._H;
        db_.roman12bold.b191(pb_.text_treasure_colon, n3 + 7, n4, 16777215, -1);
        db_.roman12bold.a191(Integer.toString(gm_.playerInformation.unspentTreasureAmount / 10), 133 + n3, n4, 16777215, -1);
        n4 += 40;
        final int n5 = (Trap._s > gm_.playerInformation.unspentTreasureAmount) ? 16711680 : 16777215;
        db_.roman12bold.b191(ef_.text_cost_colon, 7 + n3, n4, n5, -1);
        int n6 = Trap._s / 10;
        if (Trap._s % 10 != 0) {
            ++n6;
        }
        db_.roman12bold.a191(Integer.toString(n6), n3 + 133, n4, n5, -1);
    }
    
    private final void c150(final int n) {
        this.b797();
        op_._d = new nn_(true);
        wd_._f = new nn_(false);
        ud_._t = new ed_(8, 90, 180, 382);
        sn_._b = tn_.a226(16, 12, ne_.roman20, jm_.button_152, -107, lk_.text_commit);
        nl_._a = tn_.a226(472, 12, ne_.roman20, jm_.button_152, -76, be_.text_cancel.toUpperCase());
        in_._y = tn_.a226((164 - jm_.button_152.imageWidth >> 1) + 340, 376, ne_.roman20, jm_.button_152, -100, sa_.text_revive);
        hl_._b = sj_.a921(22, n ^ 0x26, 65, uj_.stat_renown, wd_._f);
        hi_._a = sj_.a921(55, 109, 65, gd_.stat_attack, wd_._f);
        kl_._h = sj_.a921(86, 104, 65, jj_.stat_defence, wd_._f);
        cd_._d = sj_.a921(117, 87, 65, wl_.stat_dodge, wd_._f);
        am_._f = sj_.a921(148, n + 54, n, WarningMessage.stat_sneak, wd_._f);
        super._p.a865(ud_._t);
        super._p.a865(sn_._b);
        super._p.a865(nl_._a);
        super._p.a865(in_._y);
        super._p.a865(hl_._b);
        super._p.a865(hi_._a);
        super._p.a865(kl_._h);
        super._p.a865(cd_._d);
        super._p.a865(am_._f);
        this.a150(-122);
        this._G = 0;
        this._E = false;
        wd_._f.a780(hl_._b, -256);
        this.a093(0, 0);
        (super._q = new sa_(262, 412, 280, 56)).a050(true, lg_.text_raider_recruitment, (byte)91, a_.text_raider_recruitment_hint, 16777215);
        hl_._b._n = new Tooltip(jk_.replacePlaceholders(new String[] { tn_.text_cost }, ib_.text_sort_raiders_by));
        hi_._a._n = new Tooltip(jk_.replacePlaceholders(new String[] { qk_.text_attack }, ib_.text_sort_raiders_by));
        kl_._h._n = new Tooltip(jk_.replacePlaceholders(new String[] { dj_.text_defence }, ib_.text_sort_raiders_by));
        cd_._d._n = new Tooltip(jk_.replacePlaceholders(new String[] { pm_.text_dodge }, ib_.text_sort_raiders_by));
        am_._f._n = new Tooltip(jk_.replacePlaceholders(new String[] { nf_.text_sneak }, ib_.text_sort_raiders_by));
        nl_._a._n = new Tooltip(null, pm_.text_exit_without_saving, nk_.text_exit_without_saving_brief);
        sn_._b._n = new Tooltip(null, ud_.text_save_and_exit, oi_.text_save_and_exit_brief);
        this.a556((byte)(-112), -1);
    }
    
    private final void g150(final int n) {
        int n2 = n;
        for (int n3 = 0; 2 > n3; ++n3) {
            for (int i = 0; i < 4; ++i) {
                final int n4 = 195 + 102 * i;
                final int n5 = 104 * n3 + 60;
                if (null != um_.stableMembers[n2]) {
                    um_.stableMembers[n2]._b.a697(86, n5 + 5, (byte)102, 5 + n4, 86);
                    qe_.a608(n4 + 96, 96 + n5, 3, um_.stableMembers[n2], 0);
                }
                int n6 = (int)((te_.c503(mo_._a, n2 * 10273, 0.015625) + 2.0) * 64.0);
                if (n6 < 0) {
                    n6 = 0;
                }
                if (this._C == n2) {
                    this._z.b326(n4, n5, n6);
                }
                else if (n2 == this._t) {
                    this._A.b326(n4, n5, 64);
                    this._u.b326(n4, n5, n6);
                }
                else if (um_.stableMembers[n2] != gm_.playerInformation.stableMembers[n2]) {
                    this._I.b326(n4, n5, (int)((1.0 + Math.cos(mo_._a / 20.0f)) * 64.0) + 128);
                }
                if (n2 == 7) {
                    break;
                }
                ++n2;
            }
        }
    }
    
    private final void a893(final byte b, final boolean b2) {
        int n;
        for (n = 0; 8 > n && um_.stableMembers[n] == gm_.playerInformation.stableMembers[n]; ++n) {}
        if (n != 8) {
            super._b = new lf_(oa_.text_confirm_changes, pb_.text_confirm_changes_stable);
            return;
        }
        if (!kn_.isTutorial || gm_.playerInformation._K != 0) {
            gd_.a778(g_._Hb, 0, g_._Hb, b2);
            return;
        }
        int n2;
        for (n2 = 0; n2 < 8 && null == gm_.playerInformation.stableMembers[n2]; ++n2) {}
        if (8 != n2) {
            gd_.a778(g_._Hb, 0, 2, b2);
            return;
        }
        fm_.a093(21);
    }
    
    public static void e150() {
        ih_.spectre = null;
        ih_.dragonsOfRenownHeaderLabel = null;
        ih_._J = null;
        ih_.chaos_champion = null;
        ih_._r = null;
        ih_._w = null;
    }
    
    private final void a093(final int g, final int n) {
        final int[] array = new int[hp_.raiders.length];
        if (g != 0) {
            if (g == 1) {
                for (int n2 = 0; array.length > n2; ++n2) {
                    if (hp_.raiders[n2] != null) {
                        array[n2] = hp_.raiders[n2].attack;
                    }
                }
            }
            else if (2 != g) {
                if (g == 5) {
                    for (int i = 0; i < array.length; ++i) {
                        if (hp_.raiders[i] != null) {
                            array[i] = hp_.raiders[i].dodge;
                        }
                    }
                }
                else if (6 == g) {
                    for (int n3 = 0; array.length > n3; ++n3) {
                        if (null != hp_.raiders[n3]) {
                            array[n3] = hp_.raiders[n3].sneak;
                        }
                    }
                }
            }
            else {
                for (int n4 = 0; array.length > n4; ++n4) {
                    if (hp_.raiders[n4] != null) {
                        array[n4] = hp_.raiders[n4].defence;
                    }
                }
            }
        }
        else {
            for (int j = 0; j < array.length; ++j) {
                if (null != hp_.raiders[j]) {
                    array[j] = hp_.raiders[j].cost;
                }
            }
        }
        if (this._G == g) {
            this._E = !this._E;
        }
        else {
            this._E = false;
        }
        this._G = g;
        if (!this._E) {
            for (int n5 = 0; array.length > n5; ++n5) {
                array[n5] = -array[n5];
            }
        }
        if (lf_._y != null) {
            ik_.a019(qm_._r = lf_._y.clone(), array);
        }
        ud_._t._J = null;
        ud_._t.e487();
        int n6 = n;
        final u_[] r = qm_._r;
        for (int n7 = 0; r.length > n7; ++n7) {
            final u_ u_ = r[n7];
            if (u_ != null) {
                u_.b599(10, n6, (byte)4);
                n6 += 8 + u_.imageHeight;
                ud_._t.a720(u_, (byte)(-78));
            }
        }
    }
    
    private final void d150(final int n) {
        if (n != 1793) {
            this._t = 120;
        }
        for (int n2 = 0; 8 > n2; ++n2) {
            um_.stableMembers[n2] = gm_.playerInformation.stableMembers[n2];
            if (null != um_.stableMembers[n2]) {
                um_.stableMembers[n2]._b = new wd_((um_.stableMembers[n2]._p != 255) ? um_.stableMembers[n2].raider.idleAnimation : k_._c);
            }
        }
        ho_.b423();
    }
    
    private final void b150(final int n) {
        if (n >= -100) {
            ih_._w = null;
        }
        int n2 = 0;
        for (int n3 = 0; 2 > n3; ++n3) {
            for (int n4 = 0; 4 > n4; ++n4, ++n2) {
                final int n5 = 195 + 102 * n4;
                final int n6 = 60 + 104 * n3;
                gf_.e050(n5, n6, 96, 96, 0);
                gf_.b050(n5 + 4, 4 + n6, 88, 88, 0);
                rp_.a857(4, 88, (byte)108, n5 + 4, 88, kc_._S, 4 + n6);
                if (7 == n2) {
                    break;
                }
            }
        }
    }
    
    private final void a556(final byte b, final int c) {
        this._C = c;
        if (b != -112) {
            return;
        }
        RaidMember hb_ = null;
        if (-1 != this._C) {
            hb_ = um_.stableMembers[this._C];
        }
        if (hb_ != null) {
            final Raider raider = hb_.raider;
            if (255 == hb_._p) {
                mi_.a300(in_._y, sa_.text_revive, ne_.roman20, jm_.button_152);
                in_._y._n = new Tooltip(null, jk_.replacePlaceholders(new String[] { raider.name.toUpperCase(), gh_.a382(gj_.a498(raider)) }, Tooltip.text_revive_tooltip), null);
                in_._y.isActive = true;
            }
            else if (raider.attack > hb_.attack || hb_.defence < raider.defence || hb_.dodge < raider.dodge || hb_.sneak < raider.sneak) {
                mi_.a300(in_._y, ae_.text_heal, ne_.roman20, jm_.button_152);
                in_._y._n = new Tooltip(null, jk_.replacePlaceholders(new String[] { raider.name.toUpperCase(), gh_.a382(gj_.a498(raider)) }, t_.text_heal_tooltip), null);
                in_._y.isActive = true;
            }
            else {
                mi_.a300(in_._y, sa_.text_revive, ne_.roman20, jm_.button_152);
                in_._y.isActive = false;
            }
        }
        else {
            mi_.a300(in_._y, sa_.text_revive, ne_.roman20, jm_.button_152);
            in_._y.isActive = false;
        }
    }
    
    private final void a150(final int n) {
        if (n > -119) {
            this.b326(-128, -72, -101);
        }
        lf_._y = new u_[hp_.raiders.length];
        int n2 = 0;
        for (int i = 0; hp_.raiders.length > i; ++i) {
            final Raider raider = hp_.raiders[i];
            if (raider != null && raider.unknown2 != -1 && raider.name != null && raider.renown <= gm_.playerInformation.highestRenown) {
                final u_ u_ = new u_(10, n2, raider);
                n2 += 10 + u_.imageHeight;
                lf_._y[i] = u_;
                u_._n = new fc_(raider);
                op_._d.a507(u_);
            }
        }
    }
    
    @Override
    final void c487(final boolean b) {
        super.c487(b);
        if (!kh_._s && b) {
            while (ha_.b427()) {
                if (13 != mm_._t) {
                    super.f797();
                }
                else {
                    this.a893((byte)(-61), false);
                }
            }
            this.f150(-24900);
            if (super._b != null && super._b._d) {
                if (!((lf_)super._b)._u) {
                    this.d150(1793);
                }
                else {
                    this.d487(true);
                }
                super._b.c150();
                super._b = null;
                gd_.a778(g_._Hb, 0, g_._Hb, false);
            }
            if (kn_.isTutorial) {
                bl_.a150(0);
            }
            final RaidMember[] i = um_.stableMembers;
            for (int n = 0; i.length > n; ++n) {
                final RaidMember hb_ = i[n];
                if (hb_ != null) {
                    hb_._b.a556((byte)109, 20);
                }
            }
            if (this._F != null) {
                this._F.a556((byte)109, 20);
            }
        }
    }
    
    ih_() {
        this._B = new HeaderLabelText(ne_.roman20, lg_.text_raider_recruitment, cm_._M);
        new HeaderLabelText(db_.roman12bold, ak_.text_raiders.toUpperCase(), cm_._M);
    }
    
    static {
        ih_._J = new int[256];
        ih_._r = new int[128];
        ih_.spectre = "Spectre";
        for (int i = 0; i < 256; ++i) {
            int n = i;
            for (int j = 0; j < 8; ++j) {
                if ((n & 0x1) != 0x1) {
                    n >>>= 1;
                }
                else {
                    n = (0xEDB88320 ^ n >>> 1);
                }
            }
            ih_._J[i] = n;
        }
        ih_.chaos_champion = "Chaos Champion";
    }
}
