final class vd_
{
	//original name: _c
    static String text_achievements;
    //original name: _d
    static String endgame;
    static int _a;
    //original name: _b
    static String text_disarm_trap_coloured;
    
    public static void a423() {
        vd_.text_disarm_trap_coloured = null;
        vd_.text_achievements = null;
        vd_.endgame = null;
    }
    
    //original signature: static final void a669(int i, final int n, final int n2, final int n3, int n4, final int n5) {
    static final void a669(int screenWidth, final int n, final int n3, int xPosition, final int yPosition) {
        final int d = MusicTrack.cracked_bar_endcap.imageWidth;
        if (2 == n3) {
            screenWidth -= d;
            xPosition += d;
        }
        jh_.c797();
        if (2 == n) {
            screenWidth -= d;
        }
        gf_.e115(xPosition, yPosition, xPosition + screenWidth, 8 + yPosition);
        int n6 = 0;
        while (screenWidth > n6) {
            bk_.cracked_bar.drawImage(n6 + xPosition, yPosition);
            n6 += bk_.cracked_bar.imageWidth;
        }
        jh_.b797();
        if (n3 == 2) {
            MusicTrack.cracked_bar_endcap.j093(-d + xPosition, yPosition);
        }
        if (2 == n) {
            MusicTrack.cracked_bar_endcap.h093(screenWidth + xPosition, yPosition);
        }
        if (n3 == 1) {
            for (int n7 = 0; 8 > n7; ++n7) {
                qe_.b050(xPosition + n7, yPosition, 8, 0, -(24 * n7) + 192);
            }
        }
        if (n == 1) {
            for (int j = 0; j < 8; ++j) {
                qe_.b050(screenWidth + (xPosition - (1 + j)), yPosition, 8, 0, 192 - 24 * j);
            }
        }
    }
    
    static {
        vd_.text_achievements = "ACHIEVEMENTS";
        vd_._a = 94;
        vd_.endgame = "End Game";
        vd_.text_disarm_trap_coloured = "<col=8B1717>Disarm</col>";
    }
}
