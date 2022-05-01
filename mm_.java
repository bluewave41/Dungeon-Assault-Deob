final class mm_ extends ne_
{
    int _r;
    static int _t;
    //original name: _q
    static int mouseX;
    int _i;
    //original name: _s
    static String text_plan;
    int _n;
    //original name: _m
    static String desc_goblin_cleaver;
    int _l;
    int _o;
    static boolean _k;
    //original name: _j
    static String text_highest_x;
    int _p;
    
    static final RenownTableEntry a282(final ec_ ec_) {
        final RenownTableEntry di_ = new RenownTableEntry();
        di_.a603(ec_, -1);
        return di_;
    }
    
    public static void a150() {
        mm_.desc_goblin_cleaver = null;
        mm_.text_highest_x = null;
        mm_.text_plan = null;
    }
    
    private mm_() throws Throwable {
        throw new Error();
    }
    
    static final int a978(final CharSequence charSequence, final boolean b, final int n) {
        if (2 > n || 36 < n) {
            throw new IllegalArgumentException("" + n);
        }
        boolean b2 = false;
        boolean b3 = false;
        int n2 = 0;
        for (int i = charSequence.length(), n3 = 0; i > n3; ++n3) {
            int char1 = charSequence.charAt(n3);
            if (n3 == 0) {
                if (45 == char1) {
                    b2 = true;
                    continue;
                }
                if (char1 == 43 && b) {
                    continue;
                }
            }
            if (char1 >= 48 && char1 <= 57) {
                char1 -= 48;
            }
            else if (char1 < 65 || char1 > 90) {
                if (char1 < 97 || 122 < char1) {
                    throw new NumberFormatException();
                }
                char1 -= 87;
            }
            else {
                char1 -= 55;
            }
            if (char1 >= n) {
                throw new NumberFormatException();
            }
            if (b2) {
                char1 = -char1;
            }
            final int n4 = char1 + n2 * n;
            if (n4 / n != n2) {
                throw new NumberFormatException();
            }
            b3 = true;
            n2 = n4;
        }
        if (b3) {
            return n2;
        }
        throw new NumberFormatException();
    }
    
    static {
        mm_.desc_goblin_cleaver = "Venturing down from the northern mountains in search of food and combat, the goblin cleaver's wooden shield and hatchet will give a dungeon's lesser denziens cause to think.";
        mm_.text_plan = "PLAN: ";
        mm_.text_highest_x = "Highest: <col=DB0100><%0></col>";
        mm_.mouseX = -1;
    }
}
