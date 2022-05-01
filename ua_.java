import java.awt.*;

final class ua_
{
    static ph_[] _b;
    //original name: _a
    static volatile int isMetaDown; //2 if meta is down
    //original name: _c
    static String[] ability_fickle_brief;
    //original name: _d
    static String cave_troll;
    
    static final boolean a141(final boolean b, final CharSequence charSequence) {
        if (!mk_.a827(b, charSequence)) {
            return false;
        }
        for (int n = 0; charSequence.length() > n; ++n) {
            if (!rp_.a624(charSequence.charAt(n))) {
                return false;
            }
        }
        return true;
    }
    
    //original signature: static final Container a332(final int n) {
    static final Container a332() {
        if (ad_.frame != null) {
            return ad_.frame;
        }
        return m_.getApplet();
    }
    
    //original signature: public static void a423() {
    public static void cleanup() {
        ua_.cave_troll = null;
        ua_.ability_fickle_brief = null;
        ua_._b = null;
    }
    
    static {
        ua_.isMetaDown = 0;
        ua_.ability_fickle_brief = new String[] { "Fickle", "Leaves stable if fail any raid." };
        ua_.cave_troll = "Cave Troll";
    }
}
