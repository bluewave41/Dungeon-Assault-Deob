final class oc_ extends kl_
{
    static int _E;
    go_ _w;
    private Room _F;
    static od_ _A;
    private boolean _s;
    private int _H;
    private int _r;
    int _q;
    boolean _t;
    private Graphic _m;
    private RaidMember _n;
    private String _D;
    private pp_ _z;
    private wd_ _p;
    int _B;
    private Graphic _y;
    private Graphic _o;
    private int _C;
    //original name: _v
    static String text_charging_hint_x;
    private boolean _u;
    private Graphic _I;
    private boolean _x;
    
    static final void a802(final int n, final int n2, final int n3, final int n4, final int n5) {
        kc_._Q[lc_._d] = n;
        ol_._k[lc_._d] = lc_._d;
        i_._t[lc_._d] = n5;
        if (n5 > ln_._d) {
            n_._d = n5;
        }
        if (n5 < ib_._e) {
            da_._B = n5;
        }
        mf_._d[lc_._d] = n2;
        wa_._m[lc_._d] = n3;
        tc_._w[lc_._d] = n4;
        final int n6 = n4 + n2 + n3;
        final int n7 = (n6 == 0) ? 0 : (1000 * n2 / n6);
        ci_._n[lc_._d] = n7;
        if (n7 < da_._B) {
            da_._B = n7;
        }
        ++lc_._d;
        if (n7 > n_._d) {
            n_._d = n7;
        }
    }
    
    @Override
    final void c423(final byte b) {
        super.c423((byte)(-113));
        ++this._C;
        if (this._C == 100) {
            this.d150(126);
        }
        if (this._C == 115) {
            this.d487(true);
        }
        this._p.a556((byte)109, 20);
    }
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        if (this._z == hh_._s) {
            if (100 > this._C) {
                this._C = 100;
                this.d150(127);
            }
            else if (this._C > 175) {
                super._d = true;
                if (null != this._n.raider.idleAnimation) {
                    this._n.raider.idleAnimation.a423((byte)(-19));
                }
                if (null != this._n.raider.victoryAnimation) {
                    this._n.raider.victoryAnimation.a423((byte)(-19));
                }
                if (null != this._n.raider.defeatAnimation) {
                    this._n.raider.defeatAnimation.a423((byte)(-19));
                }
                System.gc();
                this._w.a668(this._B, this._q, this._t);
            }
        }
    }
    
    public static void e150(final int n) {
        oc_.text_charging_hint_x = null;
        if (n != 4296) {
            e150(-11);
        }
        oc_._A = null;
    }
    
    private final void d150(final int n) {
        this._p.a721(1, this._x ? this._n.raider.victoryAnimation : this._n.raider.defeatAnimation);
        if (n <= 124) {
            return;
        }
        if (this._x) {
            t_.a124(1024, dd_.da_defeat_monster, false);
        }
        if (this._x) {
            qh_.a726(this._z, 10);
        }
        else if (this._F.trap.roomType != 3) {
            qh_.a726(this._z, 11);
        }
    }
    
    @Override
    final void b423() {
        final int[] array = new int[64];
        for (int i = 0; i < 64; ++i) {
            array[i] = mp_.or(Integer.MIN_VALUE, 1579032 + 65793 * i);
        }
        final Graphic a983 = te_.a983(super.imageWidth - 32, super.imageHeight - 28, array, 16, 8, 0.125);
        final int[] b2 = te_.b285(super.imageWidth - 32, super.imageHeight - 28, 0.125);
        final Graphic cn_ = new Graphic(0, 0);
        cn_.imageHeight = super.imageHeight - 28;
        cn_.imageWidth = super.imageWidth - 32;
        cn_._B = b2;
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
        jc_.a669(40, 80, 14, 1, 2, 1);
        jc_.a669(40, super.imageWidth - 88, 14, 1, 2, 1);
        oe_.interface_dragon.h093(8, 21);
        oe_.interface_dragon.j093(super.imageWidth - 63, 21);
        ad_.interface_crescent.i093(23, super.imageHeight - 38);
        ad_.interface_crescent.f093(super.imageWidth - 39, super.imageHeight - 38);
        da_.a563(bb_.text_result, cm_._M, super.imageWidth >> 1, 14 + (ne_.roman20._H + 36 >> 1), ne_.roman20);
        jh_.b797();
    }
    
    oc_(final RaidMember n, final Room f, final boolean x, final String d) {
        super(350, 400);
        this._F = f;
        this._D = d;
        this._n = n;
        this._x = x;
        this._C = 0;
        ub_.a543(this._r = oi_.getRandom(4));
        ub_.a543(this._H = oi_.getRandom(4));
        this._s = (0 == oi_.getRandom(2));
        this._u = (oi_.getRandom(2) == 0);
        this._p = new wd_(this._n.raider.idleAnimation);
        this._z = tn_.a226((super.imageWidth - jm_.button_152.imageWidth >> 1) + super._k, super.imageHeight + super._j - jm_.button_152.imageHeight, ne_.roman20, jm_.button_152, -75, hj_.text_continue);
        super._f.a865(this._z);
        final int n2 = super.imageWidth - 64;
        final String[] a782 = jn_.a782(this._D, new int[] { n2 }, -105, la_.roman12);
        final int n3 = a782.length * la_.roman12._H + la_.roman12._E;
        jh_.c797();
        (this._m = new Graphic(n2, n3)).e797();
        int h = la_.roman12._H;
        final String[] array = a782;
        for (int n4 = 0; array.length > n4; ++n4) {
            la_.roman12.c191(array[n4], n2 >> 1, h, 16777215, -1);
            h += la_.roman12._H;
        }
        (this._o = new Graphic(n2 + 4, 4 + n3)).e797();
        this._m.e326(2, 2, 12690143);
        gf_.d669(2, 2, 0, 0, 4 + n2, 4 + n3);
        final String s = this._x ? Trap.text_success : lp_.text_failure;
        final int n5 = this._x ? 16744448 : 8421504;
        (this._y = new Graphic(ne_.roman20.b926(s), ne_.roman20._E + ne_.roman20._H)).e797();
        ne_.roman20.b191(s, 0, ne_.roman20._H, n5, -1);
        this._I = GUICheckbox.a551(16, this._y, n5, (byte)100);
        this._y.d150(65793);
        jh_.b797();
        gd_.a364(64, bc_.da_dice_roll_dry);
    }
    
    private final void d487(final boolean b) {
        if (!b) {
            this.c423((byte)56);
        }
        if (this._x) {
            if (this._n.raider.revealTrack != null) {
                gd_.a364(64, this._n.raider.revealTrack);
            }
        }
        else if (this._n.raider.defeatTrack != null) {
            gd_.a364(64, this._n.raider.defeatTrack);
        }
    }
    
    @Override
    final void b150(final int n) {
        super.b150(105);
        final double n2 = Math.log(0.02) * -0.005;
        final double n3 = 0.5 / n2;
        int n4 = (int)(-0.5 + n3 * (1.0 - Math.exp(-n2 * this._C)) + this._r) % hf_._ib._c;
        if (this._s) {
            n4 = hf_._ib._c - n4 - 1;
        }
        final Graphic a571 = hf_._ib.a571(108, n4, 108);
        if (a571 != null) {
            a571.c093(10, 57);
        }
        int n5 = (int)(-0.5 + (1.0 - Math.exp(-n2 * this._C)) * n3 + this._H) % hf_._ib._c;
        if (this._u) {
            n5 = hf_._ib._c + (-1 - n5);
        }
        final Graphic a572 = hf_._ib.a571(108, n5, 108);
        if (null != a572) {
            a572.c093(518, 57);
        }
        final int[] array = new int[64];
        for (int n6 = 0; 64 > n6; ++n6) {
            array[n6] = mp_.or(65793 * (24 + n6), Integer.MIN_VALUE);
        }
        Graphic a573 = null;
        if (this._C < 250) {
            a573 = te_.a824(224, 224, this._C, array, 32, 24, 0.03125);
        }
        final int n7 = (super.imageWidth - 216 >> 1) + super._k;
        final int n8 = super._j + 80;
        final int n9 = super._k + (-this._o.imageWidth + super.imageWidth >> 1);
        final int n10 = 230 + (n8 + (60 - this._o.imageHeight >> 1));
        gf_.b050(n7 - 8, n8 - 8, 232, 232, 0);
        rp_.a857(4, 224, (byte)108, n7 - 4, 224, kc_._S, n8 - 4);
        if (this._C < 100) {
            this._p.a697(216, n8, (byte)102, n7, 216);
            a573.d326(n7 - 4, n8 - 4, 192);
        }
        else {
            this._p.a697(216, n8, (byte)102, n7, 216);
            if (this._C < 250) {
                a573.d326(n7 - 4, n8 - 4, 192 - 192 * (this._C - 100) / 150);
                final int n11 = (this._C - 100 << 8) / 150;
                final int n12 = n7 + (216 - this._y.imageWidth >> 1);
                final int n13 = n8 + (-this._y.imageHeight + 208);
                this._I.b326(n12, n13, n11);
                this._y.d326(n12, n13, n11);
            }
            else {
                final int n14 = n7 + (-this._y.imageWidth + 216 >> 1);
                final int n15 = n8 + 208 - this._y.imageHeight;
                this._I.b326(n14, n15, 256);
                this._y.drawImage(n14, n15);
            }
            if (175 <= this._C) {
                if (this._C < 250) {
                    this._o.b326(n9 - 2, n10 - 2, -((256 * (this._C - 100) - 19200) / 75) + 256);
                    this._m.b326(n9, n10, (this._C - 100 - 150 - 75) * 256 / 75);
                }
                else {
                    this._m.b326(n9, n10, 256);
                }
            }
            else {
                this._o.b326(n9 - 2, n10 - 2, (this._C * 256 - 25600) / 75);
            }
        }
    }
    
    static {
        oc_._E = -1;
        oc_._A = new od_();
        oc_.text_charging_hint_x = "You are charging 1 Orb of Mastery!";
    }
}
