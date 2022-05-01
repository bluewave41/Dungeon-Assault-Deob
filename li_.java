final class li_
{
    static md_ _a;
    //original name: _l
    static Graphic[] scrollBars;
    static int _j;
    static int _k;
    //original name: _b
    static String[] orbNames;
    static int _h;
    //original name: _d
    static String desc_giant_spider;
    //original name: _c
    static String text_hint_spy;
    static int _g;
    //original name: _e
    static String text_risk_of_waking;
    //original name: _i
    static String create_more_suggestions;
    //original name: _f
    static String[] ability_scout;
    
    static final void c150(final int n) {
        ta_._a.b340(1, new ia_());
        if (n != 316) {
            li_._j = 24;
        }
    }
    
    static final void a150() {
        np_.a812((byte)(-123), m_.getApplet());
    }
    
    public static void a487() {
        li_.text_risk_of_waking = null;
        li_.orbNames = null;
        li_.desc_giant_spider = null;
        li_.create_more_suggestions = null;
        li_.ability_scout = null;
        li_._a = null;
        li_.text_hint_spy = null;
        li_.scrollBars = null;
    }
    
    static final Graphic[] a298(final int n, final int n2, final nh_ nh_, final int n3) {
        if (!kk_.a283(nh_, n3 - 3, n, n2)) {
            return null;
        }
        if (n3 != 4) {
            return null;
        }
        return ib_.b033();
    }
    
    static final void b150() {
        jh_.c797();
        if (null == DungeonPath._c) {
            bn_._f = new Graphic(256, 256);
            DungeonPath._c = new Graphic(316, 316);
            DungeonPath._c._w = -16;
            DungeonPath._c._A = -16;
        }
        bn_._f.e797();
        gf_.a797();
        int n = 0;
        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 7; ++j) {
                if (null != qj_.dungeonLayout[n]) {
                    gf_.b050(j * 36 + 4, 4 + 36 * i, 32, 32, 16777215);
                }
                ++n;
            }
        }
        DungeonPath._c.e797();
        gf_.a797();
        bn_._f.e326(16, 16, 8454143);
        gf_.d669(8, 8, 0, 0, DungeonPath._c.imageWidth, DungeonPath._c.imageHeight);
        bn_._f.e326(16, 16, 0);
        gf_.d669(4, 4, 0, 0, DungeonPath._c.imageWidth, DungeonPath._c.imageHeight);
        jh_.b797();
    }
    
    static {
        li_._h = 3;
        li_.text_hint_spy = "Select two rooms to spy out";
        li_.desc_giant_spider = "Try not to get snared in this spider's webs; the gigantic tarantula is always alert; it likes nothing more than the sweet meat of a raider or two.";
        li_.orbNames = new String[6];
        li_.text_risk_of_waking = "Risk of waking dragon: ";
        li_._a = new md_();
        li_.create_more_suggestions = "More suggestions";
        li_.ability_scout = new String[] { "Scout", "A creature born to the labyrinth, the enhanced senses of the <%0> can sometimes be used to determine what lies beyond the next door. (Single use)" };
    }
}
