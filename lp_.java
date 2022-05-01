final class lp_ extends ne_
{
    int _p;
    static fb_ _o;
    int _J;
    int _E;
    int _r;
    va_ _I;
    int _w;
    int _u;
    int _k;
    int _j;
    int _G;
    of_ _A;
    int _m;
    int _y;
    //original name: _n
    static String text_failure;
    int _l;
    int _s;
    int _H;
    int _D;
    static int _z;
    int _t;
    ni_ _v;
    kk_ _x;
    //original name: _q
    static String[] tutorial_firstroom2;
    int _i;
    static se_ _C;
    static int[] _B;
    //original name: _F
    static String[] tutorial_strategies2;
    
    //original signature: final void b487(final boolean b) {
    final void b487() {
        this._A = null;
        this._x = null;
        this._I = null;
        this._v = null;
    }
    
    //original signature: static final void a178(final String i, final boolean b, final String c) {
    static final void a178(final String password, final boolean b, final String username) {
        ek_.password = password; //username
        co_.username = username; //password
        gh_.a676(sl_.logging_in, b);
    }
    
    public static void a423() {
        lp_.tutorial_firstroom2 = null;
        lp_._B = null;
        lp_._C = null;
        lp_.tutorial_strategies2 = null;
        lp_._o = null;
        lp_.text_failure = null;
    }
    
    //original signature: static final void a314(final int n, final int n2, final int n3, final int n4, final int n5, final Graphic[] array, final int n6, final se_ se_, final int n7, final int n8, final int n9, final int n10, final Graphic[] array2, final int n11, final int n12, final int n13, final Graphic[] array3, final int n14, final se_ se_2, final int n15, final int n16) {
    static final void a314() {
        fc_.a540(new qk_(null), new qk_(null), new qk_(null));
    }
    
    static final int a760(int n, int n2) {
        int n3 = 0;
        while (0 < n) {
            n3 = (n3 << 1 | (n2 & 0x1));
            n2 >>>= 1;
            --n;
        }
        return n3;
    }
    
    static {
        lp_.text_failure = "FAILURE";
        lp_._o = new fb_();
        lp_._z = 50;
        lp_.tutorial_firstroom2 = new String[] { null, "Events in the dungeon are resolved by checking your raider's skills against those of the room. Raider <%attack> is matched against room <%defence>; <%defence> against <%attack>; <%dodge> against <%snare>; and <%sneak> against <%detect>. The chance of your raider winning depends on its skill level in relation to the room's." };
        lp_._B = new int[8192];
        lp_.tutorial_strategies2 = new String[] { null, "A <%raider> will surprise the monster if its <%sneak> roll beats the room's <%detect>." };
    }
}
