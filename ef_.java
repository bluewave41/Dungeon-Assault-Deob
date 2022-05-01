final class ef_
{
	//original name: _e
    static Graphic piece_ogre;
    //original name: _f
    static String text_cost_colon;
    static boolean _h;
    //original name: _c
    static String fs_accept_afteraccept;
    //original name: _g
    static String achievements;
    //original name: _b
    static String fs_accept_countdown_sing;
    //original name: _a
    static String create;
    //original name: _d
    static AmbientAudioTrack da_hoardroom_angry_dragon;
    
    private final boolean a154(final int n) {
        if (n >= -62) {
            a639(92, -86, null, 64, null);
        }
        return rp_._d == this || k_._e == this || this == qa_._c;
    }
    
    static final tj_ a639(final int n, final int n2, final nh_ nh_, final int n3, final nh_ nh_2) {
        if (!kk_.a283(nh_, 1, n2, n3)) {
            return null;
        }
        return rj_.a168(nh_2.b337(n2, n3));
    }
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    static final boolean b154() {
        return sp_._c != null && pd_._A.a154(-86);
    }
    
    static final String a545(final int n, final int n2, final CharSequence[] array, final int n3) {
        if (n3 == 0) {
            return "";
        }
        if (n3 != 1) {
            final int i = n3 + n;
            int n4 = 0;
            for (int n5 = n; i > n5; ++n5) {
                final CharSequence charSequence = array[n5];
                if (charSequence == null) {
                    n4 += 4;
                }
                else {
                    n4 += charSequence.length();
                }
            }
            final StringBuilder sb = new StringBuilder(n4);
            for (int n6 = n; i > n6; ++n6) {
                final CharSequence charSequence2 = array[n6];
                if (null != charSequence2) {
                    sb.append(charSequence2);
                }
                else {
                    sb.append("null");
                }
            }
            return sb.toString();
        }
        final CharSequence charSequence3 = array[n];
        if (charSequence3 == null) {
            return "null";
        }
        return charSequence3.toString();
    }
    
    public static void a423() {
        ef_.fs_accept_afteraccept = null;
        ef_.achievements = null;
        ef_.fs_accept_countdown_sing = null;
        ef_.da_hoardroom_angry_dragon = null;
        ef_.piece_ogre = null;
        ef_.text_cost_colon = null;
        ef_.create = null;
    }
    
    static {
        ef_.text_cost_colon = "COST:";
        ef_.fs_accept_countdown_sing = "If you do nothing the game will revert to normal view in <%0> second.";
        ef_.achievements = "Achievements";
        ef_.create = "Create";
        ef_.fs_accept_afteraccept = "to keep fullscreen or";
    }
}
