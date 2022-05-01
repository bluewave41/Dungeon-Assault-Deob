final class ro_ extends kl_
{
    private int _r;
    private int _A;
    private int _t;
    private wd_ _o;
    private go_ _p;
    static boolean _B;
    private int _z;
    private Graphic _v;
    private pp_ _s;
    private sa_ _w;
    private Graphic _q;
    //original name: _y
    private Animation idleDragonFrame;
    private int _x;
    private int _C;
    //original name: _m
    static String black_knight;
    private int _D;
    private dd_ _n;
    
    @Override
    final void b150(final int n) {
        super.b150(-125);
        final int n2 = (super.imageWidth - 200 >> 1) + super._k;
        final int n3 = super._j + 80;
        gf_.b050(n2 - 5, n3 - 5, 210, 210, 0);
        rp_.a857(4, 202, (byte)108, n2 - 1, 202, kc_._S, n3 - 1);
        this._o.a697(200, n3, (byte)102, n2, 200);
        if (this._w == null) {
            this.a587(super._k, super._j + super.imageHeight - 80, super.imageWidth, (byte)4, 80);
        }
        else {
            this._w.a423((byte)(-108));
        }
        if (5 != this._t && 0 != this._t) {
            if (4 != this._t) {
                this.a112((byte)(-111), super._k - 18, super.imageHeight - 60 + super._j, this._A, false);
                this.a112((byte)(-109), super.imageWidth + super._k - 66, super.imageHeight - 60 + super._j, this._A - 8, true);
            }
        }
        if (null != this._v) {
            final int n4 = (-this._v.imageWidth + 200 >> 1) + n2;
            final int n5 = 192 + (-this._v.imageHeight + n3);
            if (100 <= this._z) {
                this._q.b326(n4, n5, 256);
                this._v.drawImage(n4, n5);
            }
            else {
                final int n6 = (this._z << 8) / 100;
                this._q.b326(n4, n5, n6);
                this._v.d326(n4, n5, n6);
            }
        }
    }
    
    private final int e137(final int n) {
        final int f137 = this.f137(-2);
        if (f137 != 0) {
            if (n > -41) {
                this._x = -95;
            }
            return (int)(this._A * (long)this._D * (f137 * 2 - this._A) / (f137 * f137));
        }
        return 0;
    }
    
    private final void a112(final byte b, final int n, int n2, int n3, final boolean b2) {
        if (b >= -32) {
            this._A = 117;
        }
        if (b2) {
            if (n3 <= 0) {
                return;
            }
            this.a092(tb_._a, n2 - 24, (byte)9, n + 2, n3);
            n3 -= 16;
            if (0 >= n3) {
                return;
            }
            this.a092(tb_._a, n2 - 24 + 15, (byte)9, n + 22, n3);
            n3 -= 16;
            n2 -= 24;
        }
        while (0 < n3) {
            this.a092(n_.ingot, n2, (byte)9, n, n3);
            n3 -= 16;
            if (n3 <= 0) {
                return;
            }
            this.a092(n_.ingot, n2 - 15, (byte)9, n + 20, n3);
            n3 -= 16;
            if (n3 <= 0) {
                return;
            }
            this.a092(tb_._a, n2 - 24, (byte)9, n + 2, n3);
            n3 -= 16;
            if (n3 <= 0) {
                return;
            }
            this.a092(tb_._a, n2 + 15 - 24, (byte)9, 22 + n, n3);
            n2 -= 24;
            n3 -= 16;
        }
    }
    
    private final void a092(final q_ q_, final int n, final byte b, final int n2, final int n3) {
        if (1 != this._t && n3 < 20) {
            return;
        }
        if (b != 9) {
            this._s = null;
        }
        if (n3 >= 16) {
            if (n3 < 18) {
                q_.a093(n2, -n3 + 16 + n);
            }
            else if (n3 >= 20) {
                q_.a093(n2, n);
            }
            else {
                q_.a093(n2, n3 + (n - 20));
            }
        }
        else {
            q_.a326(n2, (n3 << 2) + n - 64, n3 << 4);
        }
    }
    
    final void d150(final int n) {
        this._t = 4;
        this._D = 0;
        if (null != this._n) {
            this._n.b423((byte)30);
        }
        this._n = null;
        this._s.b423((byte)30);
        this._s = tn_.a226(super._k + (-jm_.button_152.imageWidth + super.imageWidth >> 1), -jm_.button_152.imageHeight + super.imageHeight + super._j, ne_.roman20, jm_.button_152, -124, HeaderLabelText.text_close);
        super._f.a865(this._s);
        this.idleDragonFrame.a423((byte)(-19));
        System.gc();
        this._o.a721(1, bo_.dragonEyeOpen);
        this._A = 0;
        if (n != 2) {
            return;
        }
        this.a326(true, 16711680, al_.text_party_defeated);
    }
    
    public static void f423() {
        ro_.black_knight = null;
    }
    
    final void a556(final byte b, final int d) {
        this._C = 0;
        this._x = -1;
        this._t = 1;
        this._D = d;
        if (b != 101) {
            this._w = null;
        }
        if (this._n != null) {
            this._n.b423((byte)30);
        }
        this._n = null;
    }
    
    final void a599(final int c, final int d, final byte b) {
        this._D = d;
        this._t = 1;
        this._C = c;
        this._x = ((this.f137(-2) != 0) ? oi_.getRandom(this.f137(-2)) : 0);
        if (null != this._n) {
            this._n.b423((byte)30);
        }
        this._n = null;
    }
    
    @Override
    final void b423() {
        final int[] array = new int[64];
        for (int n = 0; 64 > n; ++n) {
            array[n] = mp_.or(Integer.MIN_VALUE, 1579032 + n * 65793);
        }
        final Graphic a983 = te_.a983(super.imageWidth - 32, super.imageHeight - 28, array, 16, 8, 0.125);
        final int[] b2 = te_.b285(super.imageWidth - 32, super.imageHeight - 28, 0.125);
        final Graphic cn_ = new Graphic(0, 0);
        cn_._B = b2;
        cn_.imageHeight = super.imageHeight - 28;
        cn_.imageWidth = super.imageWidth - 32;
        final ph_ ph_ = new ph_(a983, cn_);
        jh_.a276(super._l = new ph_(new Graphic(super.imageWidth, super.imageHeight), new Graphic(super.imageWidth, super.imageHeight)));
        ph_.drawImage(16, 16);
        qe_.a229(23, 13, super.imageWidth - 46, super.imageHeight - 34, 256, 32, 8, 128);
        jc_.a669(super.imageHeight - 26, 16, 14, 1, 2, 1);
        jc_.a669(super.imageHeight - 26, super.imageWidth - 24, 14, 1, 2, 1);
        vd_.a669(super.imageWidth - 16, 2, 2, 8, 0);
        vd_.a669(super.imageWidth, 2, 2, 0, 6);
        vd_.a669(super.imageWidth, 2, 2, 0, 54);
        vd_.a669(super.imageWidth - 16, 2, 2, 8, super.imageHeight - 16);
        vd_.a669(super.imageWidth, 2, 2, 0, super.imageHeight - 22);
        jc_.a669(40, 70, 14, 1, 2, 1);
        jc_.a669(40, super.imageWidth - 78, 14, 1, 2, 1);
        oe_.interface_dragon.h093(8, 21);
        oe_.interface_dragon.j093(super.imageWidth - 63, 21);
        ad_.interface_crescent.i093(23, super.imageHeight - 38);
        ad_.interface_crescent.f093(super.imageWidth - 39, super.imageHeight - 38);
        da_.a563(ak_.text_hoard_room, cm_._M, super.imageWidth >> 1, (36 + ne_.roman20._H >> 1) + 14, ne_.roman20);
        jh_.b797();
    }
    
    @Override
    final void c150() {
        super.c150();
        final Animation[] m = RegisterScreen.idleDragonAnimations;
        int n2 = 0;
        while (m.length > n2) {
            m[n2].a423((byte)(-19));
            ++n2;
        }
        bo_.dragonEyeOpen.a423((byte)(-19));
        ce_.dragonVictory.a423((byte)(-19));
        kf_.dragonDefeat.a423((byte)(-19));
    }
    
    ro_(final go_ p) {
        super(300, 420);
        this._t = 0;
        this._p = p;
        this._r = 16777215;
        this._D = 0;
        this._n = new dd_(40 + super._k, super.imageHeight + super._j - 118, 0, super.imageWidth - 80, this._p._Y.renownDividedBy10, this._D);
        t_.a124(64, gl_.da_stressing_music, true);
        this.idleDragonFrame = RegisterScreen.idleDragonAnimations[0];
        this._o = new wd_(this.idleDragonFrame);
        if (this._p._Y.claimedBountyAmount > 0) {
            this._s = tn_.a226(super._k + (-jm_.button_152.imageWidth + super.imageWidth >> 1), super._j + super.imageHeight - jm_.button_152.imageHeight, ne_.roman20, jm_.button_152, -47, hj_.text_continue);
            super._f.a865(this._s);
            this._t = 5;
        }
        else {
            this._s = tn_.a226((super.imageWidth - jm_.button_152.imageWidth >> 1) + super._k, -jm_.button_152.imageHeight + super._j + super.imageHeight, ne_.roman20, jm_.button_152, -75, pe_.text_accept);
            super._f.a865(this._s);
            super._f.a865(this._n);
            this._t = 0;
        }
    }
    
    private final int f137(final int n) {
        if (n != -2) {
            return -82;
        }
        return (int)(Math.log(this._D + 1) * 250.0 / Math.log(10.0));
    }
    
    private final void d423(final byte b) {
        this._s.b423((byte)30);
        this._s = tn_.a226((super.imageWidth - jm_.button_152.imageWidth >> 1) + super._k, -jm_.button_152.imageHeight + (super.imageHeight + super._j), ne_.roman20, jm_.button_152, -64, HeaderLabelText.text_close);
        if (b > -86) {
            this.b423();
        }
        super._f.a865(this._s);
        bo_.dragonEyeOpen.a423((byte)(-19));
        this._t = 3;
        this._s.isActive = true;
    }
    
    private final void a326(final boolean b, final int n, final String s) {
        if (this._w == null) {
            this._w = new sa_(60 + super._k, (la_.roman12._H >> 1) - 120 + (super.imageHeight + super._j), super.imageWidth - 120, 80);
            this._w._k = 0;
            final Graphic cn_ = new Graphic(super.imageWidth - 120, 80);
            jh_.a303(cn_);
            this.a587(-60, -(la_.roman12._H >> 1) + 40, super.imageWidth, (byte)4, 120);
            jh_.b797();
            this._w.a126(1929, true, cn_);
        }
        this._w.a050(b, null, (byte)91, s, n);
    }
    
    private final void a503(final String s, final int n, final int n2) {
        final int b926 = ne_.roman20.b926(s);
        final int n3 = ne_.roman20._E + ne_.roman20._H;
        if (n2 > -75) {
            return;
        }
        jh_.a303(this._v = new Graphic(b926, n3));
        ne_.roman20.b191(s, 0, ne_.roman20._H, n, -1);
        this._q = GUICheckbox.a551(16, this._v, n, (byte)86);
        this._v.d150(65793);
        jh_.b797();
    }
    
    @Override
    final void c423(final byte b) {
        super.c423((byte)(-97));
        this._o.a556((byte)109, 20);
        if (null != this._w) {
            this._w.a487(false);
        }
        if (this._v != null) {
            ++this._z;
        }
        if (this._t != 5) {
            if (this._t != 0) {
                if (this._t != 1) {
                    if (2 != this._t) {
                        if (4 == this._t) {
                            if (this._o._k == 1) {
                                this._o.a721(1, ce_.dragonVictory);
                                this.d423((byte)(-108));
                            }
                        }
                    }
                    else if (1 == this._o._k) {
                        this._o.a721(1, ce_.dragonVictory);
                        final int a080 = this._p.a080(1, this._C);
                        final int a81 = in_.a080(a080);
                        String s;
                        if (a080 == 0) {
                            s = l_.text_raiders_died_none;
                        }
                        else if (1 < a81) {
                            s = jk_.replacePlaceholders(new String[] { Integer.toString(a81) }, od_.text_raiders_died_x);
                        }
                        else {
                            String f = null;
                            for (int n = 0; 4 > n; ++n) {
                                if ((1 << n & a080) != 0x0) {
                                    f = this._p._Y.raidMembers[n].raider.name;
                                    break;
                                }
                            }
                            s = jk_.replacePlaceholders(new String[] { f.toUpperCase() }, rp_.text_raiders_died_one);
                        }
                        this.a326(true, 16711680, sm_.text_woke_dragon + "<br><br>" + s);
                        this.a503(lp_.text_failure, 8421504, -103);
                        this.d423((byte)(-88));
                    }
                }
                else {
                    ++this._A;
                    if (18 <= this._A) {
                        if (0x0 == (0x7 & this._A - 18)) {
                            je_.playSound(eb_.da_gold_bar);
                        }
                    }
                    if (-1 != this._x && this._A >= this._x) {
                        this.idleDragonFrame.a423((byte)(-19));
                        System.gc();
                        this._o.a721(1, bo_.dragonEyeOpen);
                        this._t = 2;
                        this._s.isActive = true;
                    }
                    else if (this._A >= this.f137(-2)) {
                        System.gc();
                        this._p.c423((byte)(-121));
                        this.a326(true, 16744448, jk_.replacePlaceholders(new String[] { Integer.toString(this.e137(-90)) }, wi_.text_stole_gold));
                        this.a503(Trap.text_success, 16744448, -84);
                        this.d423((byte)(-94));
                    }
                }
            }
            else {
                this._D = this._n._F;
                this.e423((byte)(-97));
            }
        }
    }
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        if (hh_._s == this._s) {
            if (5 == this._t) {
                super._f.a865(this._n);
                mi_.a300(this._s, pe_.text_accept, ne_.roman20, jm_.button_152);
                this._t = 0;
            }
            else if (0 == this._t) {
                this._n.isActive = false;
                this._s.isActive = false;
                this._p.b093(this._D);
            }
            else if (1 < this._t) {
                super._d = true;
            }
        }
    }
    
    private final void a587(final int n, final int n2, final int n3, final byte b, final int n4) {
        final int d = this._D;
        if (this._t != 5) {
            if (this._t == 0) {
                final int n5 = (3 * n3 >> 2) + n;
                db_.roman12bold.a191(ab_.text_steal_gold, n5, n2, this._r, -1);
                db_.roman12bold.b191(Integer.toString(this._D), n5, n2, this._r, -1);
                final int n6 = n2 + (2 + db_.roman12bold._H);
                db_.roman12bold.a191(li_.text_risk_of_waking, n5, n6, this._r, -1);
                db_.roman12bold.b191((int)(0.5 + 100.0 * this._p._Y.b308(gm_.playerInformation.renown, this._D, 82)) + "%", n5, n6, this._r, -1);
                final int n7 = n6 + (2 + db_.roman12bold._H);
                if (d > this._p._Y.c137(-82)) {
                    db_.roman12bold.a385(oo_.text_too_heavy, 30 + n, -db_.roman12bold._H + n7, n3 - 60, 30, this._r, -1, 1, 1, db_.roman12bold._H);
                }
                else if (0 <= d) {
                    db_.roman12bold.a191(kl_.text_renown_gained, n5, n7, this._r, -1);
                    db_.roman12bold.b191(gh_.a382(d), n5, n7, this._r, -1);
                    final int n8 = n7 + (2 + db_.roman12bold._H);
                    int b2 = (int)Math.ceil(d * Math.sqrt(gm_.playerInformation._b / (double)gm_.playerInformation._l));
                    if (b2 > gm_.playerInformation._b) {
                        b2 = gm_.playerInformation._b;
                    }
                    final int n9 = d - b2;
                    db_.roman12bold.a191(nm_.text_spendable_renown, n5, n8, this._r, -1);
                    db_.roman12bold.b191(gh_.a382(n9), n5, n8, this._r, -1);
                    final int n10 = n8 + (db_.roman12bold._H + 2);
                }
                else {
                    db_.roman12bold.a191(jc_.text_renown_lost, n5, n7, this._r, -1);
                    db_.roman12bold.b191(gh_.a382(-d), n5, n7, this._r, -1);
                    final int n11 = n7 + (2 + db_.roman12bold._H);
                }
            }
            else if (this._t != 4) {
                final int n12 = (n3 * 5 >> 3) + n;
                final int n13 = n2 + 10;
                db_.roman12bold.a191(Animation.text_gold_stolen, n12, n13, 16777215, -1);
                db_.roman12bold.b191(Integer.toString(this.e137(b - 60)), n12, n13, 16777215, -1);
            }
        }
        else {
            db_.roman12bold.a385(jk_.replacePlaceholders(new String[] { gh_.a382(this._p._Y.claimedBountyAmount) }, DungeonPath.text_bounty_claimed), 30 + n, n2 - 20, n3 - 60, 40, 16777215, -1, 1, 1, la_.roman12._H);
        }
        if (b != 4) {
            this.c423((byte)44);
        }
    }
    
    //original signature: static final void a585(final pm_ pm_, final int n, final int n2) {
    static final void createOpcode7(final pm_ pm_) {
        final wj_ b = Trap._B;
        b.storeFuzzedOpcode(7);
        b.storeByte(pm_._j);
        b.storeByte(pm_._i);
    }
    
    private final void e423(final byte b) {
        final double b2 = this._p._Y.b308(gm_.playerInformation.renown, this._D, 69);
        if (b > -52) {
            return;
        }
        this._r = ((1.0 <= b2) ? 16711680 : ((b2 >= 0.5) ? 16776960 : 16777215));
        this._s.isActive = (this._p._Y.b308(gm_.playerInformation.renown, 0, 53) == 1.0 || b2 < 1.0);
        if (this._D > this._p._Y.c137(-114)) {
            this._s.isActive = false;
            this._r = 16711680;
        }
        int n = (int)(b2 * 4.0);
        if (n > 3) {
            n = 3;
        }
        if (RegisterScreen.idleDragonAnimations[n] != this.idleDragonFrame) {
            this.idleDragonFrame = RegisterScreen.idleDragonAnimations[n];
            this._o = new wd_(this.idleDragonFrame);
        }
    }
    
    static {
        ro_._B = false;
        ro_.black_knight = "Black Knight";
    }
}
