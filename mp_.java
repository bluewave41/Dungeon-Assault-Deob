import java.util.*;

final class mp_
{
	//original name: _e
    static String yes;
    //original name: _b
    static String create_email;
    static se_ _a;
    //original name: _c
    static String loading_fonts;
    //original name: _f
    static String orbcoins_colon;
    //original nane: _g
    static String shapeshifter;
    static int _d;
    
    public static void a423() {
        mp_.yes = null;
        mp_.shapeshifter = null;
        mp_.create_email = null;
        mp_.loading_fonts = null;
        mp_._a = null;
        mp_.orbcoins_colon = null;
    }
    
    static final void a308(final Random random, final int[] array, final int n, final int n2, final int n3) {
        if (n > -126) {
            a308(null, null, -15, 56, 15);
        }
        for (int n4 = 0; 8 > n4; ++n4) {
            oh_.a093(n3, 7);
            if (!al_.dungeonPath.a370(n2)) {
                break;
            }
            if (!ll_.a045(random, RaidMember.a464(n2), array)) {
                break;
            }
        }
    }
    
    static final AmbientAudioTrack a473(final String s, final String s2, final int n) {
        return hd_.a492(n, s2 + "_" + s);
    }
    
    //original signature: static int a080(final int n, final int n2) {
    static int or(final int n, final int n2) {
        return n | n2;
    }
    
    static {
        mp_.create_email = "Email (Login):";
        mp_.loading_fonts = "Loading fonts";
        mp_.yes = "Yes";
        mp_.orbcoins_colon = "Orb coins: ";
        mp_.shapeshifter = "Shapeshifter";
    }
}
