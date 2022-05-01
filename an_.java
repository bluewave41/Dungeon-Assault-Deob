final class an_ extends hh_
{
	//original name: _C
    static String orb_brilliance_desc;
    //original name: _D
    static String instructions_traproom;
    static int _w;
    //original name: _y
    static String text_inst_trap;
    private pi_[] _B;
    //original name: _F
    static String[] ability_firststrike;
    //original name: _E
    static int gamePort1;
    private pi_ _A;
    //original name: _x
    static String desc_vampire_lord;
    //original name: _z
    static String create_displayname_hint;
    
    final pi_ a970(final int n, final byte b) {
        if (b > -81) {
            this.a536(65, null, -101);
        }
        return this._B[n] = new pi_();
    }
    
    final void a587(final byte b, final Graphic d) {
        final pi_[] b2 = this._B;
        if (b != 47) {
            return;
        }
        for (int n = 0; b2.length > n; ++n) {
            final pi_ pi_ = b2[n];
            if (null != pi_) {
                pi_._d = d;
            }
        }
    }
    
    static final String a537(final int n, final int n2, String s) {
        s = ((null != s) ? s : ng_.title_dtdtdt);
        return ln_.a173(n2, ib_.a022(n, s));
    }
    
    public static void c150(final int n) {
        an_.text_inst_trap = null;
        an_.create_displayname_hint = null;
        if (n != -13023) {
            an_.text_inst_trap = null;
        }
        an_.desc_vampire_lord = null;
        an_.orb_brilliance_desc = null;
        an_.ability_firststrike = null;
        an_.instructions_traproom = null;
    }
    
    an_(final an_ an_, final boolean b) {
        this();
        an_.a580(0, this, b);
    }
    
    //original signature: static final void a581(final int b, final int k, final int t, final String d, final int j, final int i, final int a, final qg_ f) {
    static final void a581(final int serverNum, final int gamePort2, final int gamePort1,
    		final String codeBaseHost, final int lang, final int crc, final int a, final qg_ f) {
        of_.codeBaseHost = codeBaseHost;
        ri_.serverNum = serverNum;
        ng_.crc = crc;
        lk_.gamePort1 = gamePort1;
        kn_._f = f;
        bf_.gamePort2 = gamePort2;
        j_.lang = lang;
        pj_.gameId = 32;
        RaidMember._a = new tp_();
        na_._y = new cc_(f);
        bl_._r = new je_(RaidMember._a, na_._y);
    }
    
    @Override
    public final void a623(final byte b, final lm_ lm_, final int n, final int n2, boolean b2) {
        final GUIButton ck_ = (GUIButton)((lm_ instanceof GUIButton) ? lm_ : null);
        d_.a713(lm_.xAxisOffset + n, lm_.componentHeight + (lm_.yAxisOffset + n2), lm_.componentWidth + n + lm_.xAxisOffset, lm_.yAxisOffset + n2);
        if (null != ck_) {
            b2 &= ck_._B;
        }
        final pi_ pi_ = this._B[0];
        this._A.b150(0);
        pi_.a021(lm_, (byte)100, this._A, n2, this, n);
        if (null != ck_) {
            if (ck_._E) {
                final pi_ pi_2 = this._B[1];
                if (null != pi_2) {
                    pi_2.a021(lm_, (byte)100, this._A, n2, this, n);
                }
            }
            if (ck_._u) {
                final pi_ pi_3 = this._B[3];
                if (0 == ck_._y || null == pi_3) {
                    final pi_ pi_4 = this._B[2];
                    if (null != pi_4) {
                        pi_4.a021(lm_, (byte)100, this._A, n2, this, n);
                    }
                }
                else {
                    pi_3.a021(lm_, (byte)100, this._A, n2, this, n);
                }
            }
        }
        if (!b2) {
            final pi_ pi_6 = this._B[4];
            if (null != pi_6) {
                pi_6.a021(lm_, (byte)100, this._A, n2, this, n);
            }
        }
        this._A.a802(0, lm_, n2, n, this);
        ti_.c487(true);
        if (b != 34) {
            this.a536(117, null, 121);
        }
    }
    
    final void a536(final int n, final Graphic[] e, final int n2) {
        if (this._B[n] == null) {
            this._B[n] = new pi_();
        }
        this._B[n]._e = e;
    }
    
    final void a503(final Graphic[] e, final int n) {
        final pi_[] b = this._B;
        for (int i = n; i < b.length; ++i) {
            final pi_ pi_ = b[i];
            if (null != pi_) {
                pi_._e = e;
            }
        }
    }
    
    private final void a580(final int n, final an_ an_, final boolean b) {
        if (n != 0) {
            c150(98);
        }
        super.a446((byte)127, an_);
        if (!b) {
            cj_.a030(this._B, 0, an_._B, 0, 6);
        }
        else {
            for (int n2 = 0; 6 > n2; ++n2) {
                final pi_ pi_ = this._B[n2];
                if (null != pi_) {
                    final pi_ pi_2 = an_._B[n2];
                    pi_.a269(true, (null == pi_2) ? (an_._B[n2] = new pi_()) : pi_2);
                }
                else {
                    an_._B[n2] = null;
                }
            }
        }
    }
    
    public an_() {
        this._B = new pi_[6];
        this._A = new pi_();
        (this._B[0] = new pi_()).b150(0);
    }
    
    static {
        an_.orb_brilliance_desc = "You gain an additional 1 Renown per hour.";
        an_.instructions_traproom = "When entering a trap room, the only choice is to continue. The trap must first attempt to detect a raider by rolling it's Detect against a raider's Sneak. If the raider is detected, they must then attempt to Dodge (against the trap's Snare). If the raider fails both rolls, the trap is triggered.";
        an_.text_inst_trap = "TRAP";
        an_.ability_firststrike = new String[] { "First Strike", "The <%0> has a penchant for wildly charging into combat; such is the speed of his attack, he is guaranteed the first strike even against the most watchful of adversaries." };
        an_.create_displayname_hint = "Player names can be up to 12 letters, numbers and underscores";
        an_.desc_vampire_lord = "Vampires have an eternal thirst for raider blood; they're strong, fast and very hard to kill.<br><br>Each time this monster kills, its <%attack> and <%defence> increase by 1.";
    }
}
