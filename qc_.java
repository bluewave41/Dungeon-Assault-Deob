final class qc_ extends qe_
{
    private rh_ _r;
    static Graphic _z;
    private rh_ _v;
    private Graphic[] _s;
    static boolean _t;
    private int _B;
    static int _w;
    private Graphic[] _A;
    private ae_ _x;
    static int _y;
    private HeaderLabelText[] _u;
    
    //original signature: private final void a540(final boolean b, final int n) {
    private final void a540(final int n) {
        final int n2 = tg_._f[this._B][n];
        final int b2 = bh_.b650(n, this._B);
        final int a313 = qd_.a313(n, this._B);
        int a314 = o_.a776(this._B, n);
        final int a315 = 30;
        if (!ke_.a097(n2) && this._B != 3) {
            of_.menu_button.drawImage(640 - of_.menu_button.imageWidth >> 1, a314);
            a314 += 4;
        }
        else {
            gf_.e050(b2 - 4, a314 - 6, a313 + (-b2 + 8), a315 + 8, 0);
            qe_.b370(b2, a314 - 2, a313 - b2, a315, 8421504, 128, 128);
            rp_.a857(4, a313 - b2, (byte)108, b2, a315, kc_._S, a314 - 2);
            qe_.a229(b2, a314 - 2, a313 - b2, a315, 224, 64, 3, 128);
        }
        if (n2 == 13 || n2 == 14) {
            final int n3 = (a313 - (-b2 + (qi_._b + 120)) >> 1) + qi_._b;
            final int n4 = (n2 == 13) ? (oo_._d * 120 / 256) : (120 * ql_._d / 256);
            vd_.a669(120, 2, 2, n3, (a315 - bk_.cracked_bar.imageHeight) / 2 + a314);
            jc_.a669(a315 - 6, n4 + n3 - 1, a314 + 3, 2, 2, 2);
        }
    }
    
    @Override
    final void f797() {
        if (super._b != null) {
            super._b.b487(false);
            return;
        }
        if (!ll_.debugMode || !qk_._e[82] || mm_._t != 49) {
            this._x.d150(0);
        }
        else {
            gd_.a778(ve_.a491() ? 12 : 0, 0, -2, false);
        }
    }
    
    private final int a080(final int n, final int n2) {
        return o_.a776(this._B, n);
    }
    
    private final void c050(final int n, final int n2, final int n3, final int n4, final int n5) {
        gf_.b669(n4, n2, n5, n3, 1, n);
    }
    
    private final void c093(final int n, final int n2) {
        sf_.d093(n);
        final go_ e = ik_._e;
        if (e != null) {
            if (n2 != -2) {
                this._v = null;
            }
            e._D.d150(n);
            e._L.d150(n);
        }
    }
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        if (this._B != 12) {
            this.a423((byte)(-107));
            final int n = tg_._h[this._B];
            final int n2 = 640 - tm_.menu_block.imageWidth >> 1;
            for (int n3 = 0; this._x._i > n3; ++n3) {
                if (this.d097(n3, -7228)) {
                    this.a540(n3);
                }
            }
            if (8 == mn_._b || 9 == mn_._b) {
                am_.menu_chain_frame.drawImage(-(am_.menu_chain_frame.imageWidth2 / 2) + 320, 48);
            }
            else { //placing the moss textures
                le_.menu_moss_top_left.drawImage(4 + n2, n - 28);
                Tooltip.menu_moss_top_right.drawImage(n2 + 198, n - 28);
                wj_.menu_moss_1.drawImage(n2 + 214, (this._x._i - 3) * tg_._d[this._B] + (n - 5));
                oj_.menu_moss_2.drawImage(n2 + 4, 293 + n);
            }
            if (8 == this._B) { //achievements
                this.b540(false, -11931);
            }
            else if (9 == this._B) { //achievements
                this.b540(true, -11931);
            }
            else if (this._B != 10) {
                if (11 != this._B) {
                    if (0 == this._B) {
                        fp_.dungeonAssaultHeaderLabel.drawHeaderLabel();
                        if (ll_.debugMode) {
                            kk_.smallfont.c191("Press CTRL-S to start a random single player debug test game", 320, 44, 16777215, 0);
                        }
                    }
                }
                else {
                    ne_.roman20.a385(ul_._d, 80, 80, 480, 1000, 16777215, -1, 0, 0, ne_.roman20._R);
                }
            }
            else {
                this.b423((byte)59);
            }
            if (super._b != null) {
                super._b.a423((byte)(-61));
            }
            oe_.interface_dragon.h093(24, 383);  //main menu dragons
            oe_.interface_dragon.j093(560, 383); //main menu dragons
            if (nk_._Hb) {
                e797();
            }
            for (int n4 = 0; this._x._i > n4; ++n4) {
                if (this.d097(n4, -7228)) {
                    this.a126(n4, this._x._b == n4);
                }
            }
            if (8 != this._B) {
                if (this._B == 9) {
                    this.c540(true);
                }
            }
            else {
                this.c540(false);
            }
            if (super._b != null) {
                gf_.g115(0, 0, 640, 480);
                super._b.b150(-113);
            }
            oh_.a423();
            this._r.d797();
            this._v.d797();
            return;
        }
        gf_.a797();
        if (om_.b154()) {
            he_.e423();
        }
    }
    
    private final void a016(final byte b, final int n, final boolean b2) {
        final int n2 = tg_._f[this._B][n];
        if (b >= -101) {
            qc_._w = 68;
        }
        if (this._x.c154(31) && this.d097(n, -7228)) {
            if (rp_.a097(n2)) {
                hm_.a668(n2, n, b2, -28);
            }
        }
        final int n3 = n2;
        if (13 != n3) {
            if (14 == n3) {
                if (this._x.b154(-1)) {
                    um_.a430(0);
                }
                if (this._x.a491()) {
                    um_.a430(256);
                }
                if (this._x.b427()) {
                    final int n4 = 256 * (hj_.mouseX - (this.e080(n, 82) + (this.f080(76, n) + qi_._b) - 120 >> 1)) / 120;
                    if (n4 <= 0) {
                        um_.a430(0);
                    }
                    else if (n4 < 256) {
                        um_.a430(n4);
                    }
                    else {
                        um_.a430(256);
                    }
                }
                if (this._x.a154()) {
                    jd_.b487();
                }
                if (this._x.c427()) {
                    mi_.b150();
                }
            }
        }
        else {
            boolean b3 = false;
            if (this._x.b154(-1)) {
                if (oo_._d > 0) {
                    b3 = true;
                    this.c093(0, -2);
                }
            }
            if (this._x.a491()) {
                if (256 > oo_._d) {
                    b3 = true;
                    this.c093(256, -2);
                }
            }
            if (this._x.b427()) {
                final int n5 = 256 * (hj_.mouseX - (this.e080(n, 82) + this.f080(-77, n) - 120 + qi_._b >> 1)) / 120;
                if (n5 > 0) {
                    if (n5 < 256) {
                        this.c093(n5, -2);
                    }
                    else {
                        this.c093(256, -2);
                    }
                }
                else {
                    this.c093(0, -2);
                }
                b3 = true;
            }
            if (this._x.a154() && oo_._d > 0) {
                ig_.c150();
                b3 = true;
            }
            if (this._x.c427() && 256 > oo_._d) {
                m_.b423();
                b3 = true;
            }
            if (b3) {
                if (!this._x.b427() || mo_._a > ia_._X) {
                    final AmbientAudioTrack[] o = eb_.da_gold_bar;
                    final AmbientAudioTrack cf_ = o[oi_.getRandom(o.length)];
                    cf_.a319(cf_._e, cf_._a << 2);
                    ia_._X = 20 + mo_._a;
                }
            }
        }
    }
    
    private final Graphic a896(final int n, final q_ q_) {
        if (n != 120) {
            this.f797();
        }
        return this.a040(q_.a125(), 320);
    }
    
    private final int a760(final int n, final boolean b, final int n2) {
        for (int i = 0; i < tg_._f[this._B].length; ++i) {
            final int a080 = this.a080(i, 125);
            if (this.d097(i, -7228) && this.e080(i, 82) <= n2 && this.f080(97, i) > n2 && a080 <= n && n < a080 + 30) {
                return i;
            }
        }
        if (!b) {
            this.b540(true, -7);
        }
        return -1;
    }
    
    private final void a423(final byte b) {
        if (b > -91) {
            this.a016((byte)26, 60, true);
        }
        super._e.drawImage(0, 0);
    }
    
    private final boolean d097(final int n, final int n2) {
        return n2 == -7228 && sg_.a330(3, this._B, n);
    }
    
    private final void a556(final byte b, final int n) {
        final String a661 = ui_.a661(tg_._f[this._B][n]);
        final Graphic cn_ = new Graphic(ne_.roman20.b926(a661), ne_.roman20._H + ne_.roman20._E);
        jh_.a303(cn_);
        if (b != -125) {
            return;
        }
        ne_.roman20.b191(a661, 0, ne_.roman20._H, 16760960, -1);
        jh_.b797();
        this._A[n] = GUICheckbox.a551(8, cn_, 16760960, (byte)105);
        this._s[n] = GUICheckbox.a551(16, cn_, 6307840, (byte)(-124));
    }
    
    private final void b540(final boolean b, final int n) {
        this.c050(n ^ 0xFFFFD125, 90, 94, 82, 476);
        this.c050(64, 186, 180, 82, 142);
        if (n != -11931) {
            return;
        }
        this.c050(n + 11995, 186, 180, 226, 332);
        cg_.achievementsHeaderLabel.drawHeaderLabel();
    }
    
    @Override
    final void c797() {
        super.c797();
        um_._g = null;
        this._s = null;
        fj_._f = null;
        this._A = null;
        ud_._s = null;
        this._u = null;
        if (dd_._E != null) {
            dd_._E.b423((byte)30);
            dd_._E = null;
        }
        if (nj_._f != null) {
            nj_._f.b150(-4);
            nj_._f = null;
        }
        u_._P = -1;
        HeaderLabelText._j = null;
    }
    
    private final Graphic a040(final Graphic cn_, final int n) {
        jh_.c797();
        final Graphic cn_2 = new Graphic(cn_.imageWidth2 >> 1, cn_.imageHeight2 >> 1);
        cn_2.e797();
        cn_.b050(cn_.imageWidth2 >> 3, cn_.imageHeight2 >> 3, cn_.imageWidth2 >> 2, cn_.imageHeight2 >> 2, 16777215);
        if (n != 320) {
            this._A = null;
        }
        cn_2.d150(16777215);
        cn_2.e797();
        cn_.b050(cn_.imageWidth2 >> 3, cn_.imageHeight2 >> 3, cn_.imageWidth2 >> 2, cn_.imageHeight2 >> 2, 0);
        jh_.b797();
        return cn_2;
    }
    
    static final int a890(final int n, final int[] array) {
        int n2;
        int n3;
        if (n < ib_._d * (ib_._j - 1)) {
            n2 = n % (ib_._j - 1) + n / (ib_._j - 1) * ib_._j;
            n3 = n2 + 1;
        }
        else {
            n2 = n - (ib_._j - 1) * ib_._d;
            n3 = n2 + ib_._j;
        }
        return (array[n2] >= array[n3]) ? array[n3] : array[n2];
    }
    
    public static void a150() {
        qc_._z = null;
    }
    
    //original signature: private final int b080(final int n, final int n2) {
    //never called
    private final int return30() {
        return 30;
    }
    
    //original signature: private final void c540(final boolean b, final int n) {
    private final void c540(final boolean b) {
        if (nj_._f != null) {
            gf_.a331(kd_._g);
            gf_.e115(94, 90, 546, 184);
            final int b2 = ig_.b137();
            for (hm_ hm_ = (hm_)nj_._f.e024(); null != hm_; hm_ = (hm_)nj_._f.a024(4)) {
                Graphic cn_ = f_._a;
                if (hm_._r) {
                    if (hm_._i != u_._P) {
                        HeaderLabelText._j = ec_._j[hm_._i].a125();
                        u_._P = hm_._i;
                    }
                    cn_ = HeaderLabelText._j;
                }
                cn_.e093(94 + hm_._o - b2, hm_._p);
                Graphic cn_2;
                if (!hm_._r) {
                    cn_2 = ud_._s[46];
                }
                else {
                    cn_2 = ud_._s[hm_._i];
                }
                if (hm_._i == kg_._f) {
                    um_._g._g = -b2 + 94 + (16 + hm_._o);
                    um_._g._b = hm_._p + 32;
                    if (0x0 != (li_._k & 0x1)) {
                        um_._g.a797();
                    }
                    else {
                        um_._g.a601(cn_2, -12, 32);
                    }
                }
                if (ak_._n == hm_._i) {
                    fj_._f._b = 32 + hm_._p;
                    fj_._f._g = 94 - b2 + 16 + hm_._o;
                    if ((0x1 & li_._k) == 0x0) {
                        fj_._f.a601(cn_2, -12, 32);
                    }
                    else {
                        fj_._f.a797();
                    }
                }
            }
            gf_.b331(kd_._g);
        }
        if (null != dd_._E && dd_._E.isActive) {
            dd_._E.d150(0);
        }
        final int n2 = (kg_._f != -1) ? kg_._f : ak_._n;
        final int[] array = b ? bp_._e : gj_._c;
        if (n2 == -1) {
            la_.roman12.c191(ql_.mouseoveranicon, 392, 260, 16777215, -1);
            if (tl_._l) {
                db_.roman12bold.a385(ld_.createtouse, 239, 300, 306, 100, 16777215, -1, 1, 0, db_.roman12bold._H);
            }
        }
        else {
            final boolean a873 = vl_.a873(n2, -121, array);
            final int n3 = la_.roman12._E + la_.roman12._H;
            db_.roman12bold.b191(jk_.replacePlaceholders(new String[] { ce_.achievement_names[n2], Integer.toString(a873 ? 8454016 : 16744576, 16), a873 ? fa_.achieved : fi_.notyetachieved }, f_.achievement_title), 239, n3 + 195, 16777215, -1);
            final int n4 = 210;
            if (!a873) {
                f_._a.drawImage(89, n4);
            }
            else {
                ec_._j[n2].a093(89, n4);
            }
            int n5 = n4 + la_.roman12._H + la_.roman12._H;
            final StringBuilder sb = new StringBuilder(bb_.achievement_criteria[n2]);
            if (null != gm_.playerInformation) {
                if (!a873) {
                    String s = null;
                    if (n2 != 18) {
                        if (n2 == 41) {
                            s = jk_.replacePlaceholders(new String[] { ve_.localizeNumericString(1, gm_.playerInformation.totalEarnedTreasure, hc_.lang) }, fn_.text_acv_riches);
                        }
                        else if (n2 == 42) {
                            if (df_.a410() < gm_.playerInformation.raidByDate && gm_.playerInformation.raidByDate >= gm_.playerInformation.raidStreakStartDate) {
                                s = jk_.replacePlaceholders(new String[] { np_.b661(gm_.playerInformation.raidByDate), np_.b661(gm_.playerInformation.raidStreakStartDate) }, wl_.text_acv_habit);
                            }
                        }
                    }
                    else if (gm_.playerInformation.collectedBounties > 0) {
                        s = jk_.replacePlaceholders(new String[] { Integer.toString(gm_.playerInformation.collectedBounties) }, (gm_.playerInformation.collectedBounties != 1) ? ji_.text_acv_hunter : i_.text_acv_hunter_singleton);
                    }
                    if (null != s) {
                        sb.append("<br><br>");
                        sb.append(s);
                    }
                }
            }
            final String[] array2 = new String[16];
            for (int a874 = la_.roman12.a899(sb.toString(), new int[] { 306 }, array2), i = 0; i < a874; ++i) {
                la_.roman12.b191(array2[i], 239, n5, 16777215, -1);
                n5 += n3;
            }
            final int n6 = 355 - AmbientAudioTrack._f.imageHeight2;
            final int n7 = (2 * n6 + AmbientAudioTrack._f.imageHeight2) / 2 + ne_.roman20._E;
            gf_.b115(239, n6 - 6, 306, 8421504);
            la_.roman12.b191(op_.orbpoints_colon + sg_._c[n2], 239, n7, 16777215, -1);
            final int n8 = 120;
            la_.roman12.b191(mp_.orbcoins_colon, n8 + 239, n7, 16777215, -1);
            int n9 = 239 + n8 + la_.roman12.b926(mp_.orbcoins_colon);
            for (int n10 = 0; sg_._d[n2] > n10; ++n10) {
                AmbientAudioTrack._f.drawImage(n9, n6);
                n9 += AmbientAudioTrack._f.imageWidth / 3;
            }
        }
    }
    
    //original signature: private final void a126(final int n, final byte b, boolean b2) {
    private final void a126(final int n, boolean b2) {
        final int n2 = tg_._f[this._B][n];
        final String a661 = ui_.a661(n2); //button text
        int b3 = ne_.roman20.b926(a661);
        final int b4 = bh_.b650(n, this._B);
        final int a662 = qd_.a313(n, this._B);
        int a663 = o_.a776(this._B, n);
        if (n2 == 13 || n2 == 14) {
            b3 = 120 + qi_._b;
        }
        //kf_.a313(); returns 30
        final int n3 = -b3 + a662 + b4 >> 1;
        if (!ke_.a097(n2)) {
            if (this._B != 3) {
                a663 += 4;
            }
        }
        final boolean shouldMenuItemsBeUnlocked = rp_.a097(n2); //this controls the locked icons
        
        if (20 == n2 && -1 != this._x._b) {
            if (tg_._f[this._B].length > this._x._b) {
                b2 |= !rp_.a097(tg_._f[this._B][this._x._b]);
            }
        }
        final int[] array = b2 ? (shouldMenuItemsBeUnlocked ? ml_._b : ug_._E) : (shouldMenuItemsBeUnlocked ? ag_._c : HeaderLabelText._k);
        if (null == this._u[n] || (this._u[n].text != a661 && !this._u[n].text.equals(a661)) || this._u[n].possibleColors != array) {
            this._u[n] = new HeaderLabelText(ne_.roman20, a661, array);
            this._A[n] = null;
        }
        this._u[n].b326(a663, n3);
        if (!shouldMenuItemsBeUnlocked) { //lock the menu icons
            hj_.menu_locked.drawImage(n3 - 20, ne_.roman20._H + (a663 - 15));
        }
        if (b2) {
            if (null == this._A[n]) {
                this.a556((byte)(-125), n);
            }
            this._A[n].b326(n3, a663, 64);
            int n4 = (int)(128.0 * (1.0 + te_.a132(mo_._a)));
            if (0 > n4) {
                n4 = 0;
            }
            if (n4 > 256) {
                n4 = 256;
            }
            this._s[n].b326(n3, a663, n4);
        }
    }
    
    private final int f080(final int n, final int n2) {
        return qd_.a313(n2, this._B);
    }
    
    @Override
    final void b487(final boolean b) {
        super.b487(b);
        if (this._B == 0) {
            o_.a150();
            if (tl_._l) {
                gm_.playerInformation = null;
            }
        }
        fk_.a261(lf_.da_title3);
        int b2 = (0 >= this._x._i) ? -1 : 0;
        if (-1 != this._x._b) {
            b2 = this._x._b;
        }
        this._x.a691(b, b2, this.a760(Animation.mouseY, true, hj_.mouseX));
        kg_._f = -1;
        um_._g = null;
        fj_._f = null;
        ia_._X = mo_._a;
        ak_._n = -1;
        if (this._B == 8 || this._B == 9) {
            ud_._s = new Graphic[47];
            u_._P = -1;
            for (int i = 0; i < 46; ++i) {
                ud_._s[i] = this.a896(120, ec_._j[i]);
            }
            jh_.c797();
            final Graphic cn_ = new Graphic(64, 64);
            cn_.e797();
            gf_.h115(32, 31, 14, 16777215);
            ud_._s[46] = cn_;
            jh_.b797();
            final boolean b3 = 9 == this._B;
            final int[] array = b3 ? bp_._e : gj_._c;
            nj_._f = new md_();
            int n = 0;
            for (int j = 0; j < 46; ++j) {
                final boolean a873 = vl_.a873(j, -124, array);
                if (b3) {
                    if (a873) {
                        nj_._f.a865(new hm_(j, a873)); //does nothing?
                        ++n;
                    }
                }
                else if (!vl_.a873(j, -63, ia_._P) || a873) {
                    ++n;
                    nj_._f.a865(new hm_(j, a873)); //does nothing?
                }
            }
            final int n2 = (n < 8) ? n : ((1 + n) / 2);
            final boolean b4 = 0x0 != (n & 0x1);
            int n3;
            if (n2 > 11) {
                dd_._E = new dd_(82, 176, 0, 476, 65536, 0);
                n3 = 12;
            }
            else {
                n3 = (8 + (-(n2 * 40) + 452)) / 2;
            }
            of_._l = 0;
            int o = n3;
            int p = 100;
            int n4 = 0;
            int l = 0;
            hm_ hm_ = (hm_)nj_._f.e024();
            while (null != hm_) {
                hm_._o = o;
                hm_._p = p;
                l += 40;
                o += 40;
                if (l > of_._l) {
                    of_._l = l;
                }
                hm_ = (hm_)nj_._f.a024(4);
                if (++n4 != n2) {
                    continue;
                }
                l = 0;
                o = n3;
                if (b4) {
                    o += 20;
                    l += 20;
                }
                p += 40;
            }
        }
        this._r = new rh_(58, 394, 80, 160, 255, 197376, 240);
        this._v = new rh_(580, 394, 80, 160, 255, 197376, 240);
        this._s = new Graphic[this._x._i];
        this._u = new HeaderLabelText[this._x._i];
        this._A = new Graphic[this._x._i];
        jh_.a276(super._e);
        bf_.drawBorder(mn_._b != 8 && 9 != mn_._b);
        gf_.a331(kd_._g);
        gf_.e115(41, 48, 599, 416);
        if (mn_._b != 8 && 9 != mn_._b) {
            //tm_.menu_block.drawImage(640 - tm_.menu_block.imageWidth >> 1, 200);
        }
        gf_.b331(kd_._g);
        jh_.b797();
    }
    
    @Override
    final void c487(final boolean b) {
        super.c487(b);
        if (12 != this._B) {
            if (!kh_._s || !b) {
                while (ha_.b427()) {
                    if (mm_._t == 13) {
                        if (this._B != 1) {
                            if (10 == mn_._b || 0 == mn_._b) {
                                continue;
                            }
                            gd_.a778(g_._Hb, 0, g_._Hb, false);
                        }
                        else {
                            gd_.a778(ve_.a491() ? 12 : 0, 0, -1, false);
                        }
                    }
                    else {
                        this.f797();
                        if (this._x._b == -1) {
                            continue;
                        }
                        this.a016((byte)(-127), this._x._b, false);
                    }
                }
                if (!this.d801()) {
                    this._x.a326(-7734, this.a760(hm_.mouseY, true, lc_.mouseX), this.a760(Animation.mouseY, true, hj_.mouseX));
                    if (this._x._b != -1) {
                        this.a016((byte)(-112), this._x._b, true);
                    }
                }
            }
            if (null != super._b && super._b._d) {
                final boolean r = ((WarningMessage)super._b)._r;
                super._b.c150();
                super._b = null;
                if (r) {
                    tl_._d = false;
                    ik_.a503(ve_.pleaselogin_member, -3);
                }
                else {
                    gd_.a778(ve_.a491() ? 12 : 0, 0, -3, false);
                }
            }
            if (8 == this._B || this._B == 9 || 10 == mn_._b) {
                ra_.a150();
            }
            return;
        }
        final int a800 = hm_.a800(!kk_.d154(), (byte)(-20));
        if (a800 == 3) {
            if (null != cm_._R) {
                ib_.a150();
            }
            sf_.a284(m_.getApplet());
        }
        if (a800 != 0) {
            gd_.a778(dc_._z, 0, 0, false);
        }
        if (a800 == 2) {
            gd_.a778(dc_._z, 0, 0, true);
        }
    }
    
    private final void b423(final byte b) {
        final boolean a568 = en_.doesArrayContainNonZero(bp_._e);
        final String d = kp_.mustlogin_notloggedin;
        if (b <= 49) {
            this.a080(-114, 14);
        }
        ne_.roman20.a385(d + " " + tg_.replace('#', jk_.replacePlaceholders(new String[] { jg_.discard }, g_.a157(a568)), "<br><br>"), 80, 80, 480, 10 * ne_.roman20._R, 16777215, -1, 1, 0, ne_.roman20._R);
    }
    
    private final int e080(final int n, final int n2) {
        if (n2 != 82) {
            this._u = null;
        }
        return bh_.b650(n, this._B);
    }
    
    qc_(final int b) {
        this._B = b;
        this._x = new ae_(tg_._f[this._B].length);
    }
    
    static {
        qc_._y = -1;
    }
}
