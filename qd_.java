final class qd_
{
	//original name: _d
    static Graphic piece_saurus_spawn;
    static boolean[] _c;
    //original name: _a
    static String creatingyouraccount;
    //original name: _e
    static String[] tutorial_dragonsofrenown2;
    //original name: _b
    static String create_alert_passcontainsname;
    
    static final ad_ a483(final int n) {
        final ad_[] b265 = ad_.b265();
        for (int i = 0; i < b265.length; ++i) {
            if (n == b265[i]._b) {
                return b265[i];
            }
        }
        return null;
    }
    
    //original signature: static final nh_ a854(final boolean b, final boolean b2, final int n, final byte b3, final int n2) {
    static final nh_ a854(final int n) {
        return uo_.a385(false, 1, true, n);
    }
    
    public static void a487() {
        qd_.creatingyouraccount = null;
        qd_.tutorial_dragonsofrenown2 = null;
        qd_._c = null;
        qd_.piece_saurus_spawn = null;
        qd_.create_alert_passcontainsname = null;
    }
    
    //original signature: static final int a313(final int n, final int n2, final int n3) {
    static final int a313(final int n, final int n3) {
        final int n4 = tg_._f[n3][n];
        if (!ke_.a097(n4)) {
            return tg_._j[n3];
        }
        return 380;
    }
    
    static {
        qd_.creatingyouraccount = "Creating your account";
        qd_.create_alert_passcontainsname = "This password contains your Player Name, and would be easy to guess";
        qd_.tutorial_dragonsofrenown2 = new String[] { null, "This is the <%highlight>Dragons of Renown</col> table. It shows a list of all the players in the realm of Dungaria, sorted by their Renown. You can choose to start a raid against any of these players.<br><br><%command>Scroll through the list and examine your potential targets.</col>" };
    }
}
