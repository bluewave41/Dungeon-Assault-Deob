final class ub_ extends ne_
{
    static vn_ _n;
    static byte[][] _q;
    //original name: _k
    static String playtutorial;
    static od_ _s;
    //original name: _m
    static String tip_razor_construct;
    static int _p;
    static HeaderLabelText _i;
    //original name: _r
    static String tutorial_justplay_warning;
    //original name: _o
    static String unreadTicketsText;
    //original name: _j
    static Graphic piece_merc;
    //original name: _l
    static String goblin_cleaver;
    
    //original signature: public static void a423() {
    public static void cleanup() {
        ub_._q = null;
        ub_.unreadTicketsText = null;
        ub_.tutorial_justplay_warning = null;
        ub_.tip_razor_construct = null;
        ub_._s = null;
        ub_._i = null;
        ub_.playtutorial = null;
        ub_._n = null;
        ub_.goblin_cleaver = null;
        ub_.piece_merc = null;
    }
    
    static final int a543(final int n) {
        return (n == 0) ? 0 : ((n != 1) ? ((n == 2) ? 6 : 9) : 3);
    }
    
    private ub_() throws Throwable {
        throw new Error();
    }
    
    static {
        ub_.playtutorial = "Play Tutorial";
        ub_.tip_razor_construct = "<col=FF0000>Defence -2</col>";
        ub_._s = new od_();
        ub_.unreadTicketsText = null;
        ub_.tutorial_justplay_warning = "To get the maximum benefit from the Dungeon Assault tutorial, we recommend that you <col=FFC080>log in or register</col> before starting.<br><br>You can continue without logging in, but you will need to repeat sections of the tutorial later before playing Dungeon Assault.";
        ub_._p = 0;
        ub_.goblin_cleaver = "Goblin Cleaver";
    }
}
