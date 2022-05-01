final class hj_ extends gd_
{
    static String _Q;
    //original name: _U
    static String login_create_tooltip;
    //original name: _O
    static String[] tutorial_victory;
    static int[] _W;
    static nh_ _Z;
    private pj_ _R;
    //original name: _T
    static Graphic menu_locked;
    RaidMember _V;
    //original name: _S
    static int mouseX;
    boolean _Y;
    //original name: _X
    static String text_continue;
    //original name: _ab
    static String desc_mercenary_knight;
    //original name: _P
    static String[] ability_glamour;
    
    @Override
    final void b326(final int n, final int n2, final int n3) {
        if (!super._F) {
            return;
        }
        final int n4 = n + super._t;
        final int n5 = super._i + n3;
        if (this._R.b121(0, this._V)) {
            this.a075(n4, n5, super._z, (byte)105);
        }
        if (this._R.activeRaidMember == this._V && (0x6 & this._V.status) == 0x0) {
            this.a075(n4, n5, super._H, (byte)112);
        }
        if (wi_._ob == this) {
            if (this._Y) {
                this.a075(n4, n5, super._I, (byte)(-12));
            }
        }
        if (n2 != 8187) {
            this.a075(-8, 106, null, (byte)40);
        }
        final int[] array = new int[4];
        gf_.a331(array);
        gf_.e115(n4 + 5, 5 + n5, 40 + n4 - 5, 40 + n5 - 5);
        if (k_._c == this._V._b._n) {
            this._V._b.a697(40, n5, (byte)102, n4, 40);
        }
        else {
            this._V._b.a697(60, n5, (byte)102, n4 - 10, 60);
        }
        gf_.b331(array);
        if (this._V._i != null) {
            qe_.a296(n4 + 38, 40 + n5 - 2, 2, this._V._i, this._V._i.length);
        }
    }
    
    @Override
    final void a599(final int n, final int n2, final byte b) {
        if (!super._F) {
            return;
        }
        final int n3 = super._t + n;
        final int n4 = n2 + super._i;
        if (0x0 == (0x4 & this._V.status)) {
            if (0x0 != (0x2 & this._V.status)) {
                gf_.b669(n3 + 5, 5 + n4, super.imageWidth - 10, super.imageHeight - 10, 16776960, 64);
            }
        }
        else {
            gf_.b669(n3 + 5, n4 + 5, super.imageWidth - 10, super.imageHeight - 10, 16711680, 64);
        }
        gf_.e050(n3, n4, 40, 40, 0);
        gf_.e050(4 + n3, 4 + n4, 32, 32, 0);
        rp_.a857(6, 32, (byte)108, 4 + n3, 32, kc_._S, 4 + n4);
    }
    
    static final Graphic[] a936(final int n, final int n2, final int n3, final int n4) {
        return ba_.a089(n, 3, n3, n4, 1, 1, n2, 1);
    }
    
    public static void f150() {
        hj_.desc_mercenary_knight = null;
        hj_._Z = null;
        hj_.login_create_tooltip = null;
        hj_._W = null;
        hj_.tutorial_victory = null;
        hj_.text_continue = null;
        hj_.menu_locked = null;
        hj_.ability_glamour = null;
        hj_._Q = null;
    }
    
    static final void g150() {
        fe_._k = new md_();
    }
    
    hj_(final pj_ r, final RaidMember v, final int n, final int n2) {
        super(n, n2, 40, 40, 0);
        this._V = v;
        this._R = r;
        final int n3 = 20;
        final int n4 = 2 * n3 + 40;
        final int n5 = 40 + n3 * 2;
        jh_.c797();
        super._I = this.a028(n4, n3, 16777088, 3, n5);
        super._z = this.a028(n4, n3, 8421631, 3, n5);
        super._H = this.a028(n4, n3, 16744448, 3, n5);
        jh_.b797();
        this._Y = true;
        super._n = new fc_(this._R, this._V);
    }
    
    static final int a185(int n, final int n2, int n3) {
        final int n4 = 0xFF00FF & n3;
        n3 &= 0xFF00;
        final int n5 = n & 0xFF00FF;
        n &= 0xFF00;
        final int n6 = n5 * n2;
        n3 *= -n2 + 256;
        final int n7 = n4 * (-n2 + 256);
        n *= n2;
        final int n8 = n7 & 0xFF00FF00;
        final int n9 = n6 & 0xFF00FF00;
        n3 &= 0xFF0000;
        n &= 0xFF0000;
        return (n + n3 | n8 + n9) >>> 8;
    }
    
    private final Graphic a028(final int i, final int n, int n2, final int n3, final int n4) {
        final Graphic cn_ = new Graphic(i, n4);
        cn_._w = -n;
        cn_._A = -n;
        final int n5 = n2 & 0xFF00FF;
        jh_.a303(cn_);
        final int n6 = n2 & 0xFF00;
        for (int j = 0; j < n4; ++j) {
            for (int n7 = 0; i > n7; ++n7) {
                int n8 = (int)(512.0f * (-(float)Math.sqrt(((j - (n4 >> 1)) * (j - (n4 >> 1)) + (-(i >> 1) + n7) * (n7 - (i >> 1))) / (float)(i * i / 4)) + 1.0f));
                if (n8 >= 0) {
                    if (256 < n8) {
                        n8 = 256;
                    }
                    n2 = ((n6 * n8 & 0xFF0000) | (0xFF00FF00 & n5 * n8)) >>> 8;
                    cn_._B[i * j + n7] = n2;
                }
            }
        }
        jh_.b797();
        if (n3 != 3) {
            this.a075(38, 87, null, (byte)84);
        }
        return cn_;
    }
    
    private final void a075(final int n, final int n2, final Graphic cn_, final byte b) {
        int n3 = -(cn_.imageHeight >> 1);
        int n4 = 0;
        int y = cn_.imageWidth;
        int n5 = 0;
        if (0 > cn_._A + n2) {
            n5 -= n2 + cn_._A;
        }
        int v = cn_.imageHeight;
        if (cn_._w + (n + cn_.imageWidth) > 640) {
            y = 640 - n - cn_._w;
        }
        if (480 < n2 + cn_._A + cn_.imageHeight) {
            v = -n2 + 480 - cn_._A;
        }
        if (0 > n + cn_._w) {
            n4 -= n + cn_._w;
        }
        final int n6 = -y + n4;
        for (int i = n5; i < v; ++i) {
            int n7 = cn_._w + (n + (n4 + 640 * (n2 - (-i - cn_._A))));
            int n8 = n4 - (cn_.imageWidth >> 1);
            int n9 = i * cn_.imageWidth + n4;
            for (int n10 = n6; 0 > n10; ++n10) {
                final int n11 = (int)(128.0 * (1.0 + te_.c503(mo_._a + cn_.hashCode(), 11 * u_.a650(n8, n3) >> 6, 0.0078125)));
                if (n11 > 0) {
                    int n12 = cn_._B[n9];
                    if (n11 < 256) {
                        final int n13 = n11 * (0xFF00FF & n12);
                        n12 = (n13 & 0xFF00FF00) + (-n13 + n12 * n11 & 0xFF0000) >>> 8;
                    }
                    final int n14 = gf_._b[n7];
                    final int n15 = n12 + n14;
                    final int n16 = (0xFF00FF & n12) + (n14 & 0xFF00FF);
                    final int n17 = (0x1000100 & n16) + (0x10000 & -n16 + n15);
                    gf_._b[n7] = mp_.or(n15 - n17, n17 - (n17 >>> 8));
                }
                ++n8;
                ++n9;
                ++n7;
            }
            ++n3;
        }
    }
    
    static {
        hj_.login_create_tooltip = "Create your own free Jagex account";
        hj_.mouseX = 0;
        hj_.tutorial_victory = new String[] { "Victory", "<%highlight>Your raider has sucessfully overcome <%lastroom></col>. After a room has been defeated, it will <%highlight>remain safe for the rest of the raid</col>. You can now move onwards, and change your party leader if you wish.<br><br><%command>Click on an accessible room (surrounded by an orange glow) to move on.</col>" };
        hj_.ability_glamour = new String[] { "Glamour", "With the powers of illusion at her command, the <%0> is able to enchant a raider, causing them to glow brilliantly; any monster the raider encounters in the next room will be blinded and fight at a severe disadvantage. (Single use)" };
        hj_.desc_mercenary_knight = "Tempted by the promise of gold from the cities and wars of the humans in the west, the mercenary knight is a master swordsman, but lacks the patience to deal with traps.";
        hj_.text_continue = "CONTINUE";
    }
}
