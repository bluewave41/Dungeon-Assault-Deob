final class pe_ extends ne_
{
    static fd_ _j;
    //original name: _k
    static String desc_raging_beast;
    //original name: _n
    static String text_accept;
    //original name: _i
    static String text_hint_ability_boostdef;
    static rk_ _l;
    static String _o;
    static String[] _m;
    
    public static void a150(final int n) {
        if (n != 9) {
            a150(39);
        }
        pe_.text_accept = null;
        pe_.text_hint_ability_boostdef = null;
        pe_._l = null;
        pe_._o = null;
        pe_._j = null;
        pe_._m = null;
        pe_.desc_raging_beast = null;
    }
    
    static final Graphic[] a289(final int n, final int n2, final int n3, final int n4) {
        final Graphic[] array2;
        final Graphic[] array = array2 = new Graphic[9];
        final int n5 = 0;
        final Graphic[] array3 = array;
        final int n6 = 1;
        final Graphic[] array4 = array;
        final int n7 = 2;
        final Graphic[] array5 = array;
        final int n8 = 3;
        final Graphic[] array6 = array;
        final int n9 = 6;
        final Graphic a091 = bl_.a091(n, n4);
        array6[n9] = a091;
        array4[n7] = (array5[n8] = a091);
        array2[n5] = (array3[n6] = a091);
        final Graphic[] array7 = array;
        final int n10 = 5;
        final Graphic[] array8 = array;
        final int n11 = 7;
        final Graphic[] array9 = array;
        final int n12 = 8;
        final Graphic a92 = bl_.a091(n3, n4);
        array9[n12] = a92;
        array7[n10] = (array8[n11] = a92);
        if (0 != n2) {
            array[4] = bl_.a091(n2, 64);
        }
        return array;
    }
    
    static final boolean a628(CharSequence charSequence, char c) {
        if (!il_.a778(c)) {
            return false;
        }
        if (null == charSequence) {
            return false;
        }
        int n = charSequence.length();
        if (12 <= n) {
            return false;
        }
        return !jc_.a351(c) || 0 != n;
    }
    
    private pe_() throws Throwable {
        throw new Error();
    }
    
    static {
        pe_.desc_raging_beast = "A large, wolf-like creature with brown-black hair and horns.";
        pe_._j = new fd_(3);
        pe_.text_accept = "ACCEPT";
        pe_.text_hint_ability_boostdef = "Select a raider to enchant with additional Defence";
    }
}
