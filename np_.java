import java.applet.*;

class np_ extends rj_
{
	//original name: _G
    static String text_raider_avoided_guardian;
    //original name: _z
    static String[] ability_armoured;
    static rj_ _M;
    static ab_ _E;
    static nh_ _A;
    private int[] _L;
    static boolean _D;
    boolean _N;
    static int[] _I;
    static Graphic _F;
    md_ _J;
    //original name: _C
    static String[] tutorial_rooms2;
    static int _K;
    
    @Override
    void a599(final int n, final int n2, final byte b) {
        if (this._N) {
            if (null == this._L) {
                this._L = new int[4];
            }
            gf_.a331(this._L);
            gf_.a115(n + super._t, n2 + super._i, super.imageWidth + super._t + n, n2 + super.imageHeight + super._i);
            if (null != this._J) {
                for (rj_ rj_ = (rj_)this._J.e024(); rj_ != null; rj_ = (rj_)this._J.a024(4)) {
                    rj_.a599(n, n2, (byte)122);
                }
            }
            gf_.b331(this._L);
        }
    }
    
    static final void a812(final byte b, final Applet applet) {
        mm_._k = true;
        final String s = "tuhstatbut";
        final String s2 = "rvnadlm";
        if (b >= -121) {
            return;
        }
        lm_.a890(false, s, -1L, applet, s2);
    }
    
    static final String b661(final int n) {
        return k_.a460((byte)(-122), 3, 3, n);
    }
    
    static final void d423() {
        gg_.a693(null, he_._m);
    }
    
    @Override
    void b423(final byte b) {
        if (null != this._J) {
            for (rj_ rj_ = (rj_)this._J.e024(); rj_ != null; rj_ = (rj_)this._J.a024(4)) {
                rj_.b423((byte)30);
            }
        }
        super.b423(b);
    }
    
    void a720(final rj_ rj_, final byte b) {
        if (b > -27) {
            np_._I = null;
        }
        int t = super._t;
        if (0x0 != (0x1 & rj_._v)) {
            t += super.imageWidth;
        }
        int i = super._i;
        if (0x0 != (rj_._v & 0x2)) {
            i += super.imageHeight;
        }
        rj_.e326(i, t, 100);
        if (null == this._J) {
            this._J = new md_();
        }
        this._J.b865(rj_, false);
        rj_._r = this;
    }
    
    np_(final int n, final int n2, final int n3, final int n4) {
        super(n, n2, n3, n4, 0);
        this._N = true;
    }
    
    public static void c423() {
        np_.text_raider_avoided_guardian = null;
        np_._I = null;
        np_.ability_armoured = null;
        np_._F = null;
        np_._E = null;
        np_._A = null;
        np_._M = null;
        np_.tutorial_rooms2 = null;
    }
    
    @Override
    void e326(final int n, final int n2, final int n3) {
        if (n2 == 0 && 0 == n) {
            return;
        }
        if (null != this._J) {
            for (rj_ rj_ = (rj_)this._J.e024(); null != rj_; rj_ = (rj_)this._J.a024(4)) {
                rj_.e326(n, n2, 75);
            }
        }
        if (n3 < 69) {
            this.b326(-70, -8, 121);
        }
        super._i += n;
        super._t += n2;
    }
    
    @Override
    void a183(boolean bl, int n, int n2) {
        int n3 = n - this.imageWidth;
        int n4 = n2 - this.imageHeight;
        if (bl) {
            _A = null;
        }
        if (this._J != null) {
            rj_ rj_2 = (rj_)this._J.e024();
            while (null != rj_2) {
                if ((rj_2._v & 4) != 0) {
                    rj_2.e326(0, n3, 111);
                }
                if (0 != (8 & rj_2._v)) {
                    rj_2.e326(n4, 0, 92);
                }
                rj_2 = (rj_)this._J.a024(4);
            }
        }
        int n5 = 0 == (this._v & 1) ? 0 : -n3;
        int n6 = (2 & this._v) != 0 ? -n4 : 0;
        this.e326(n6, n5, 115);
        this.imageWidth = n;
        this.imageHeight = n2;
    }
    
    @Override
    void b326(final int n, final int n2, final int n3) {
        if (!this._N) {
            return;
        }
        if (this._L == null) {
            this._L = new int[4];
        }
        gf_.a331(this._L);
        gf_.a115(super._t + n, n3 + super._i, n + (super.imageWidth + super._t), super._i + super.imageHeight + n3);
        if (n2 != 8187) {
            this.a759(-49, 0, 87);
        }
        if (null != this._J) {
            for (rj_ rj_ = (rj_)this._J.e024(); rj_ != null; rj_ = (rj_)this._J.a024(4)) {
                rj_.b326(n, 8187, n3);
            }
        }
        gf_.b331(this._L);
    }
    
    @Override
    rj_ a759(final int n, final int n2, final int n3) {
        if (!this.a683((byte)117, n2, n3)) {
            return null;
        }
        if (n >= -10) {
            a812((byte)33, null);
        }
        if (this._J != null) {
            for (rj_ rj_ = (rj_)this._J.e024(); null != rj_; rj_ = (rj_)this._J.a024(4)) {
                final rj_ a759;
                if ((a759 = rj_.a759(-31, n2, n3)) != null) {
                    return a759;
                }
            }
        }
        return this;
    }
    
    static {
        np_.text_raider_avoided_guardian = "Raider avoided guardian and disarmed it.";
        np_.ability_armoured = new String[] { "Armoured", "The heavy plate armour worn by the <%0> negates the first blow he recieves each combat." };
        np_.tutorial_rooms2 = new String[] { null, "Each dungeon room may contain a <%monster>, a <%trap>, or a <%guardian>. These different types of rooms will be explained as you encounter them.<br><br><%command>Continue exploring the dungeon. Move your party towards the hoard room.</col>" };
        np_._D = false;
        np_._I = new int[6];
        np_._E = new ab_();
    }
}
