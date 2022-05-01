final class od_
{
	//original name: _c
    static String text_raiders_died_x;
    //original name: _a
    static String text_activeraider;
    //original name: _b
    static String[] titles_age_male;
    
    static final boolean a427() {
        if (null == gk_._L && null == jn_._l && no_.isMetaDown != 0) {
            if (pd_.c603(hm_.mouseY, lc_.mouseX)) {
                og_.a188(false, 0, uo_.currentTutorialString[fc_._d]);
                return true;
            }
            return false;
        }
        else {
            if (la_.isMetaDown == 0 || ii_._G == -1) {
                ii_._G = -1;
                a_.mouseY = -1;
            }
            else {
                final int n = -ii_._G + hj_.mouseX;
                final int n2 = Animation.mouseY - a_.mouseY;
                hh_._p += n;
                ed_._P += n2;
                if (hh_._p < 0) {
                    hh_._p = 0;
                }
                if (640 < hh_._p) {
                    hh_._p = 640;
                }
                if (ed_._P < 0) {
                    ed_._P = 0;
                }
                ii_._G = hj_.mouseX;
                if (480 < ed_._P) {
                    ed_._P = 480;
                }
                a_.mouseY = Animation.mouseY;
            }
            if (pd_.c603(Animation.mouseY, hj_.mouseX)) {
                if (no_.isMetaDown != 0 && -1 == ii_._G) {
                    ii_._G = lc_.mouseX;
                    a_.mouseY = hm_.mouseY;
                }
                eg_.a537(pp_._K);
                if (ec_._n == hh_._s) {
                    if (++fc_._d >= uo_.currentTutorialString.length) {
                        fc_._d = 0;
                    }
                    og_.a188(false, 0, uo_.currentTutorialString[fc_._d]);
                }
                else if (tk_._k == hh_._s) {
                    if (0 > --fc_._d) {
                        fc_._d = uo_.currentTutorialString.length - 1;
                    }
                    og_.a188(true, 0, uo_.currentTutorialString[fc_._d]);
                }
                else if (ti_._A == hh_._s) {
                    og_.a188(false, 0, null);
                }
                return true;
            }
            return false;
        }
    }
    
    public static void b423() {
        od_.text_raiders_died_x = null;
        od_.titles_age_male = null;
        od_.text_activeraider = null;
    }
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    public od_() {
    }
    
    static {
        od_.text_activeraider = "This is the active raider.";
        od_.text_raiders_died_x = "<col=FF8000><%0></col> of your raiders were caught and eaten.";
        od_.titles_age_male = new String[] { "<%0> the Warrior", "<%0> the Veteran", "<%0> the Elder", "<%0> the Venerated", "<%0> the Ancient", "<%0> the Immortal" };
    }
}
