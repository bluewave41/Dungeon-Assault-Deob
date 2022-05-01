final class oa_ implements ca_
{
    private int _f;
    //original name: _g
    static String[] ability_boostsneak;
    private se_ _b;
    //original name: _i
    static String northman_ranger;
    private int _a;
    //original name: _d
    static String[] members_expansion_benefits;
    static int[] _e;
    //original name: _h
    static String text_confirm_changes;
    //original name: _c
    static String[] mustlogin_alternate;
    
    @Override
    public final void a623(final byte b, final lm_ lm_, final int n, final int n2, final boolean b2) {
        final int n3 = (lm_._u) ? 3249872 : 2188450;
        if (b != 34) {
            a423();
        }
        this._b.a385("<u=" + Integer.toString(n3, 16) + ">" + lm_.buttonText + "</u>", lm_.xAxisOffset + n, lm_.yAxisOffset + n2, lm_.componentWidth, lm_.componentHeight, n3, -1, this._a, this._f, this._b._H + this._b._E);
    }
    
    public static void a423() {
        oa_.ability_boostsneak = null;
        oa_.northman_ranger = null;
        oa_._e = null;
        oa_.text_confirm_changes = null;
        oa_.members_expansion_benefits = null;
        oa_.mustlogin_alternate = null;
    }
    
    public oa_() {
        this._b = lp_._C;
        this._a = 1;
        this._f = 1;
    }
    
    oa_(final se_ b, final int a, final int f) {
        this._b = b;
        this._f = f;
        this._a = a;
    }
    
    static {
        oa_.ability_boostsneak = new String[] { "Gift of the Trees", "The <%0> channels the power of the great forests that were once her home to double the <%sneak> of a raider in the next room. (Single use)" };
        oa_._e = new int[] { 5, 4 };
        oa_.northman_ranger = "Ranger of the North";
        oa_.members_expansion_benefits = new String[] { "All other member expansions", "Loads more Achievements", "Full community features" };
        oa_.text_confirm_changes = "Confirm changes?";
        oa_.mustlogin_alternate = new String[] { null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue." };
    }
}
