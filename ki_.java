final class ki_
{
    int _b;
    //original name: _h
    static String[] titles_aggression_female;
    static int _f;
    //original name: _e
    static String text_guardian;
    int _g;
    int _a;
    int _d;
    //original name: _c
    static String loadingTextString;
    
    public static void a423(final byte b) {
        ki_.titles_aggression_female = null;
        ki_.loadingTextString = null;
        ki_.text_guardian = null;
        if (b != -35) {
            a423((byte)80);
        }
    }
    
    static final void a573(final int n, final int n2, final int n3, final String s, final int n4) {
        sj_.a887(n3, n2, n, 32, s + "_reveal", s + "_defeat");
        if (n4 != -1) {
            ki_._f = 66;
        }
    }
    
    static {
        ki_.text_guardian = "Guardian";
        ki_._f = -1;
        ki_.titles_aggression_female = new String[] { "<%0> the Fierce", "<%0> the Cruel", "<%0> the Fell", "<%0> the Terrible", "<%0> the Savage", "<%0> the Raging", "<%0>, Bringer of Wrath", "<%0>, Lady of Chaos", "<%0> the Undefeated" };
    }
}
