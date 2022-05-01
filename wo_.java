final class wo_
{
    static q_[] _a;
    static dn_ _e;
    //original name: _g
    static int currency;
    //original name: _f
    static String text_monsters;
    //original name: _h
    static String waitingfor_soundeffects;
    //original name: _d
    static String menu;
    static int _b;
    
    static final Graphic a028(final int n, final int i, final int n2, final int n3) {
        final int n4 = 2 * n2 - 1;
        final Graphic cn_ = new Graphic(n4, n2 + i);
        jh_.a303(cn_);
        for (int j = 0; j < n2; ++j) {
            gf_.b115(n2 - j - 1, j, 1 + 2 * j, n3);
        }
        final int n5 = -n + n4 >> 1;
        for (int n6 = 0; i > n6; ++n6) {
            gf_.b115(n5, n2 + n6, n, n3);
        }
        jh_.b797();
        return cn_;
    }
    
    public static void a423() {
        wo_.waitingfor_soundeffects = null;
        wo_.text_monsters = null;
        wo_.menu = null;
        wo_._e = null;
        wo_._a = null;
    }
    
    static {
        wo_.waitingfor_soundeffects = "Waiting for sound effects";
        wo_.text_monsters = "Monsters";
        wo_.menu = "Menu";
    }
}
