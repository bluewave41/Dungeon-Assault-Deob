final class be_ extends ip_
{
	//original name: _m
    static String text_title_requirements_age_one;
    //original name: _r
    static String text_cancel;
    static hl_ _n;
    private rm_ _p;
    //original name: _q
    static String text_orbmode;
    static ph_ _o;
    static wk_ _s;
    
    @Override
    final String a439(final byte b, final String s) {
        if (b < 44) {
            this.a212(null, -75);
        }
        if (this._p instanceof qn_) {
            final dp_ a293 = ((qn_)this._p).a293(-79);
            if (a293 != null) {
                if (a293.a151((byte)(-117)) == c_._d && !s.equals(this._p.buttonText)) {
                    return ep_.create_alert_mismatch;
                }
                return a293.a791(true);
            }
        }
        if (!s.equals(this._p.buttonText)) {
            return ep_.create_alert_mismatch;
        }
        return null;
    }
    
    @Override
    final od_ a212(final String s, final int n) {
        if (this._p instanceof qn_) {
            final dp_ a293 = ((qn_)this._p).a293(-122);
            if (null != a293 && a293.a151((byte)(-99)) != c_._d) {
                return pd_._J;
            }
        }
        return s.equals(this._p.buttonText) ? c_._d : pd_._J;
    }
    
    public static void e150() {
        be_.text_orbmode = null;
        be_._s = null;
        be_.text_title_requirements_age_one = null;
        be_._n = null;
        be_._o = null;
        be_.text_cancel = null;
    }
    
    be_(final rm_ rm_, final rm_ p2) {
        super(rm_);
        this._p = p2;
    }
    
    static {
        be_._n = null;
        be_.text_title_requirements_age_one = "You must have had your dungeon reset by an Orb of Mastery once to earn the title of <%1>.";
        be_.text_orbmode = "CHARGE ORB";
        be_.text_cancel = "Cancel";
    }
}
