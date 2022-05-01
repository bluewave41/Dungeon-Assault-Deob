final class lf_ extends kl_
{
    private String _r;
    //original name: _x
    static Graphic menu_chain_ext;
    static u_[] _y;
    private pp_ _o;
    //original name: _v
    static String ogre_thug;
    private pp_ _s;
    //original name: _p
    static String berserker;
    //original name: _w
    static MusicTrack da_title3;
    boolean _u;
    //original name: _n
    static Graphic menu_chain_line;
    private String _t;
    //original name: _m
    static String fatal_guardian;
    //original name: _q
    static String create_optin_news;
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        if (hh_._s != null) {
            this._u = (hh_._s == this._o);
            super._d = true;
        }
    }
    
    public static void d150() {
        lf_.da_title3 = null;
        lf_.ogre_thug = null;
        lf_.berserker = null;
        lf_.create_optin_news = null;
        lf_._y = null;
        lf_.fatal_guardian = null;
        lf_.menu_chain_line = null;
        lf_.menu_chain_ext = null;
    }
    
    lf_(final String s, final String s2) {
        this(s, s2, 300);
    }
    
    @Override
    final void b150(final int n) {
        super.b150(-91);
        final int n2 = super._k + (super.imageWidth >> 1);
        final int n3 = super._j + 10;
        ne_.roman20.c191(this._t, n2, ne_.roman20._H + n3, 16777215, -1);
        final int n4 = n3 + ne_.roman20._H;
        la_.roman12.a385(this._r, 20 + super._k, n4, super.imageWidth - 40, -(jm_.button_152.imageHeight * 2) + (-24 - n4) + (super.imageHeight + super._j), 16777215, -1, 1, 1, la_.roman12._H);
    }
    
    private lf_(final String t, final String r, final int n) {
        this._t = t;
        this._r = r;
        this.a326(n, 88 - (-(2 * jm_.button_152.imageHeight) - oj_.a170(this._r, new int[] { 300 }, la_.roman12) * la_.roman12._H));
        super._d = false;
        this._o = tn_.a226(super._k + (-jm_.button_152.imageWidth + super.imageWidth >> 1), super.imageHeight + (super._j - 24 - jm_.button_152.imageHeight * 2), ne_.roman20, jm_.button_152, -81, mp_.yes);
        this._s = tn_.a226(super._k + (-jm_.button_152.imageWidth + super.imageWidth >> 1), super._j - 16 - (-super.imageHeight + jm_.button_152.imageHeight), ne_.roman20, jm_.button_152, -111, um_.no);
        super._f.a865(this._o);
        super._f.a865(this._s);
    }
    
    //original signature: static final void d423(final byte b) {
    static final void d423() {
        final wj_ c = ra_._c;
        final int c2 = c.readByte();
        if (c2 == 0) {
            if (null == lh_._p) {
                lh_._p = new tb_(128);
                kp_._e = 0;
            }
            final boolean b2 = 1 == c.readByte();
            final String d738 = c.d738();
            if (b2) {
                c.d738();
            }
            bo_ bo_ = vj_.a060(d738, 49);
            final String d739 = c.d738();
            String a715 = jm_.lowerCaseReplaceSpaceWithUnderscore(d738);
            if (a715 == null) {
                a715 = d738;
            }
            if (bo_ == null) {
                bo_ = vj_.a060(d739, 116);
                if (bo_ != null) {
                    lh_._p.a627(bo_, a715.hashCode(), -106);
                }
            }
            if (bo_ == null) {
                bo_ = new bo_();
                lh_._p.a627(bo_, a715.hashCode(), -66);
                bo_._Ib = kp_._e++;
                fm_._b.a865(bo_);
            }
            bo_._Hb = d738;
            return;
        }
        if (c2 != 0) {
            if (fk_._v == null) {
                fk_._v = new tb_(128);
                o_._m = 0;
            }
            String nb = c.d738();
            if (nb.equals("")) {
                nb = null;
            }
            final String d740 = c.d738();
            final String d741 = c.d738();
            bo_ bo_2 = ll_.a997(d740, (byte)(-47));
            if (null == bo_2) {
                bo_2 = ll_.a997(d741, (byte)(-47));
                if (null != bo_2) {
                    fk_._v.a627(bo_2, jm_.lowerCaseReplaceSpaceWithUnderscore(d740).hashCode(), -86);
                }
            }
            if (null == bo_2) {
                bo_2 = new bo_();
                fk_._v.a627(bo_2, jm_.lowerCaseReplaceSpaceWithUnderscore(d740).hashCode(), -64);
                bo_2._Ib = o_._m++;
                jm_._f.a865(bo_2);
            }
            if (nb != null) {
                nb = nb.intern();
            }
            bo_2._Nb = nb;
            bo_2._Hb = d740;
            bo_2.a487(false);
            bo_ bo_3;
            for (bo_3 = (bo_)jm_._f.e024(); bo_3 != null && eg_.a102(bo_2, 200, bo_3); bo_3 = (bo_)jm_._f.a024(4)) {}
            if (bo_3 == null) {
                jm_._f.a865(bo_2);
            }
            else {
                so_.a985((byte)55, bo_3, bo_2);
            }
            return;
        }
        if (c2 == 2) {
            if (ke_._d == 1) {
                ke_._d = 2;
            }
            return;
        }
        if (3 == c2) {
            if (ke_._d == 2) {
                ke_._d = 1;
            }
            return;
        }
        if (4 != c2) {
            sm_.a741(null, 1, "F1: " + sj_.l738());
            tl_.a150(-72);
            return;
        }
        ke_._d = 1;
        gm_._b = c.d738().intern();
        r_.a556(c.readByte());
    }
    
    static {
        lf_.ogre_thug = "Ogre Thug";
        lf_.berserker = "Berserker";
        lf_.create_optin_news = "Please send me news and updates (I can unsubscribe at any time)";
        lf_.fatal_guardian = "This guardian is lethal.";
    }
}
