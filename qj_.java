import java.applet.*;

final class qj_
{
	//original name: _c
    static Room[] dungeonLayout;
    //original name: _a
    static String create_password_confirm;
    static String _b;
    //original name: _f
    static String[] ability_thief;
    static String[] _e;
    //original name: _d
    static String text_party_sneaks_past;
    
    public static void a150() {
        qj_._b = null;
        qj_.create_password_confirm = null;
        qj_.dungeonLayout = null;
        qj_.text_party_sneaks_past = null;
        qj_._e = null;
        qj_.ability_thief = null;
    }
    
    static final void a423() {
        hl_._a = ea_.b853();
        lg_._w = new ji_();
        na_.a520(true, 2591221, true);
    }
    
    //original signature: static final void a326(final Applet applet, final byte b) {
    static final void a326(final Applet applet) {
        final String username = applet.getParameter("username");
        if (username == null || ci_.encodeBase37(username) == 0L) {
            return;
        }
    }
    
    static final void a485(final int n, int n2, int n3, int n4, final int[] array, final int n5, final int n6, final int n7, int i, int n8, int j, final int[] array2, final int n9, int n10, final int n11) {
        final int n12 = n & 0xFF00FF;
        final int n13 = 0xFF00 & n;
        for (j = -n11; j < 0; ++j) {
            for (i = -n9; i < 0; ++i) {
                n3 = array[n4++];
                if (0 != n3) {
                    n3 >>= 16;
                    n3 = ((n12 * n3 & 0xFF00FF00) | (0xFF0000 & n13 * n3)) >>> 8;
                    n8 = (n3 & 0xFF00FF) * n6;
                    n3 = (-n8 + n3 * n6 & 0xFF0000) + (0xFF00FF00 & n8) >>> 8;
                    n8 = array2[n10];
                    n2 = n3 + n8;
                    n3 = (0xFF00FF & n3) + (0xFF00FF & n8);
                    n8 = (0x10000 & -n3 + n2) + (0x1000100 & n3);
                    array2[n10++] = mp_.or(n8 - (n8 >>> 8), -n8 + n2);
                }
                else {
                    ++n10;
                }
            }
            n10 += n5;
            n4 += n7;
        }
    }
    
    static {
        qj_.create_password_confirm = "Confirm Password: ";
        qj_._b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        qj_.ability_thief = new String[] { "Thievery", "Drawing on a lifetime of experience, the <%0> can coordinate great acts of larceny. With his skills to assist, the likelihood of waking the dungeon's master when stealing its gold is reduced." };
        qj_.text_party_sneaks_past = "Your party sneaks past the monster.";
        qj_._e = new String[16];
    }
}
