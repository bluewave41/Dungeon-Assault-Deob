final class rn_
{
	//original name: _g
    static String[] tutorial_stable_noraider;
    //original name: _c
    static Graphic scroll_bottom;
    //original name: _d
    static String text_status_precombat;
    //original name: _f
    static String desc_troglodytes;
    static int _a;
    //original name: _e
    static String benefits_price;
    //original name: _b
    static volatile boolean isWindowInFocus;
    
    public static void b150() {
        rn_.tutorial_stable_noraider = null;
        rn_.text_status_precombat = null;
        rn_.scroll_bottom = null;
        rn_.desc_troglodytes = null;
        rn_.benefits_price = null;
    }
    
    static final byte[] a288(final int n, final int n2, final byte[] array) {
        byte[] array2;
        if (0 < n2) {
            array2 = new byte[n];
            for (int i = 0; i < n; ++i) {
                array2[i] = array[n2 + i];
            }
        }
        else {
            array2 = array;
        }
        final ol_ ol_ = new ol_();
        ol_.b150();
        ol_.a453(n * 8, array2);
        final byte[] array3 = new byte[64];
        ol_.a331((byte)(-88), array3, 0);
        return array3;
    }
    
    static {
        rn_.tutorial_stable_noraider = new String[] { null, "You need to recruit some raiders in order to raid another dungeon.<br><br><%command>Recruit a party of raiders, then exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>" };
        rn_.text_status_precombat = "Use special abilities before combat begins.";
        rn_.benefits_price = "From only <%0>/month";
        rn_.desc_troglodytes = "Troglodytes may well be less evolved creatures and not too bright, but that doesn't stop their clubs from crushing raiders' bones.";
        rn_.isWindowInFocus = true;
    }
}
