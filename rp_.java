import java.security.*;

final class rp_
{
    static ef_ _d;
    static byte[][] _c;
    //original name: _b
    static String[] ability_boostsneak_brief;
    //original name: _a
    static String text_raiders_died_one;
    //original name: _g
    static SecureRandom secureRandom;
    //original name: _f
    static String[] ability_revive_brief;
    //original name: _h
    static String mb_caption_title;
    static int[] _e;
    
    static final boolean a624(final char c) {
        return !Character.isISOControl(c) && (pp_.isCharacterOrDigit(c) || c == '-' || c == ' ' || c == ' ' || c == '_');
    }
    
    static final void a857(final int n, int n2, final byte b, int n3, int n4, final int[][] array, int n5) {
        jh_.a303(jh_._l);
        if (b != 108) {
            return;
        }
        for (int i = 0; i < array.length / n + 1; ++i) {
            gf_.b115(-i + n3 - 1, n5 - (1 + i), n2 + 2 * i + 2, 59416);
            gf_.c115(n3 + (-i - 1), n5 - i, n4 + i * 2, 15204376);
            gf_.b115(n3 - i - 1, n4 + (n5 + i), 2 + (n2 + i * 2), 6168);
            gf_.c115(i + n3 + n2, -i + n5, 2 * i + n4, 1572888);
        }
        jh_.b797();
        for (int j = 0; j < array.length; j += n, --n5, n4 += 2, --n3, n2 += 2) {
            te_.a812(n3 - 1, n5 - 1, 2 + n2, array[j]);
            te_.b812(n3 - 1, n5, n4, array[j]);
            te_.a812(n3 - 1, n5 + n4, 2 + n2, array[j]);
            te_.b812(n2 + n3, n5, n4, array[j]);
        }
    }
    
    static final void a423() {
        if (null != a_._n) {
            a_._n.j423((byte)73);
        }
        pj_._c = new gk_();
        ta_._a.b340(1, pj_._c);
    }
    
    //original signature: static final boolean a097(final int n, final int n2) {
    static final boolean a097(final int n2) {
        if (n2 == 3 || n2 == 4) {
            return null != gm_.playerInformation && gm_.playerInformation._K != 0;
        }
        if (n2 == 22) {
            return gm_.playerInformation.highestRenown >= ak_._o[0] && !of_._k;
        }
        return 23 != n2 || of_._k;
    }
    
    static final byte[] a281(final String s, final int n) {
        if (n < 39) {
            a857(-93, 97, (byte)(-14), 21, 98, null, 14);
        }
        return bb_._b.a826("", s);
    }
    
    public static void b423() {
        rp_.secureRandom = null;
        rp_.mb_caption_title = null;
        rp_._d = null;
        rp_.ability_revive_brief = null;
        rp_._c = null;
        rp_.text_raiders_died_one = null;
        rp_.ability_boostsneak_brief = null;
        rp_._e = null;
    }
    
    static {
        rp_._d = new ef_();
        rp_._c = new byte[250][];
        rp_.ability_boostsneak_brief = new String[] { "Gift of the Trees", "Double target <%sneak> in the next room. (Single use)" };
        rp_.text_raiders_died_one = "Your <col=FF8000><%0></col> was caught and eaten.";
        rp_.ability_revive_brief = new String[] { "Revive", "Return a killed raider to your stable. (Single use)" };
        rp_.mb_caption_title = "Members' Benefits";
        rp_._e = new int[4];
    }
}
