final class bj_ extends da_
{
	//original name: _J
    static String orb_war_desc;
    //original name: _G
    static boolean renownTableError;
    //original name: _H
    static String[] ability_retreat_brief;
    //original name: _I
    static String text_status_pregame;
    static ef_ _K;
    //original name: _F
    static Graphic piece_dwarf;
    
    static final String a661(final int n) {
        return 1 + n + "/" + en_.instructions_pages.length;
    }
    
    private bj_(final int n, final int n2, final int n3, final int n4, final ca_ ca_, final pg_ pg_, final lm_ d) {
        super(n, n2, n3, n4, ca_, pg_);
        super._D = d;
    }
    
    @Override
    final void a277(final int n, final boolean b, final int n2, final lm_ lm_, final int n3, final int n4) {
        super.a277(n, b, n2, lm_, n3, n4);
        final oi_ b2 = ah_._b;
        if (b2 != null) {
            if (this.a046(n4, n3, n, -1, n2)) {
                if (!(super._n instanceof qo_)) {
                    if (b2._n instanceof qo_) {
                        ((qo_)b2._n).a045(this, b2, false);
                        ah_._b = null;
                    }
                }
                else {
                    ((qo_)super._n).a045(this, b2, false);
                    ah_._b = null;
                }
            }
        }
    }
    
    static final void i150(final int n) {
        if (tl_._l) {
            t_.a540(oj_._b = true, 0);
            if (n <= 71) {
                h150(-16);
            }
            kh_._n = 0;
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void h150(final int n) {
        bj_.orb_war_desc = null;
        if (n != 31029) {
            i150(54);
        }
        bj_._K = null;
        bj_.ability_retreat_brief = null;
        bj_.text_status_pregame = null;
        bj_.piece_dwarf = null;
    }
    
    static {
        bj_.orb_war_desc = "Raiders cost you 5 Treasure less to recruit.";
        bj_.text_status_pregame = "Waiting for game to start. Select an entrance or use special abilities.";
        bj_.ability_retreat_brief = new String[] { "Retreat", "Automatically retreat. (Single use)" };
        bj_._K = new ef_();
    }
}
