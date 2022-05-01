final class to_
{
	//original name: _b
    static String[] ability_fragility_brief;
    //original name: _a
    static String text_orbs_charging_x;
    static ab_ _e;
    //original name: _f
    static String desc_teleport;
    static byte[][] _d;
    //original name: _g
    static String connectingToUpdateServerString;
    static int[] _c;
    
    static final double a088(final int n, final int n2, final double n3) {
        return n * (1.0 - n3) + n3 * n2;
    }
    
    //original signature: public static void a150() {
    public static void cleanup() {
        to_._e = null;
        to_.desc_teleport = null;
        to_.ability_fragility_brief = null;
        to_.text_orbs_charging_x = null;
        to_.connectingToUpdateServerString = null;
        to_._c = null;
        to_._d = null;
    }
    
    //original signature: static final int a789(final int n, final CharSequence charSequence) {
    static final int hashString(final CharSequence charSequence) {
        final int i = charSequence.length();
        int n2 = 0;
        int n3 = 0;
        while (i > n3) {
            n2 = RaidMember.a770(charSequence.charAt(n3)) + (-n2 + (n2 << 5));
            ++n3;
        }
        return n2;
    }
    
    //original signature: static final void a124(final int n, final int n2, final int n3, final int n4, final String s, final int n5) {
    static final void a124(final int n, final int n3, final int n4, final String unitName, final int unitId) {
        kn_.loadRaiderVoices(n3, unitName + "_defeat", unitId, n4, n, unitName + "_special", unitName + "_reveal");
    }
    
    static final rj_ a777(final int n, final int n2, final md_ md_, final int n3) {
        if (md_ == null) {
            return null;
        }
        rj_ rj_ = (rj_)md_.e024();
        if (n3 != 0) {
            return null;
        }
        while (rj_ != null) {
            final rj_ a759;
            if (null != (a759 = rj_.a759(n3 - 115, n2, n))) {
                return a759;
            }
            rj_ = (rj_)md_.a024(4);
        }
        return null;
    }
    
    static final void b150(final int n) {
        if (n <= 57) {
            b150(-76);
        }
    }
    
    static {
        to_.ability_fragility_brief = new String[] { "Fragility", "Dies when incapacitated." };
        to_.text_orbs_charging_x = "<col=FF0000><%0> charging</col>";
        to_.desc_teleport = "A ring of mystic runes glow faintly around the perimeter of this room. The first unwise raider to cross this room might be teleported out of the dungeon.<br><br>This trap will only trigger once per raid.";
        to_._e = new ab_();
        to_._d = new byte[1000][];
    }
}
