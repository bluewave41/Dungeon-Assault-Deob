import java.awt.*;

final class jc_
{
	//original name: _d
    static Color color;
    //original name: _b
    static String text_flee_minitip;
    static int[] _f;
    //original name: _c
    static Graphic piece_baeserker;
    static int _e;
    //original name: _a
    static String text_renown_lost;
    
    static final void a669(int n, final int n2, int n3, final int n4, final int n5, final int n6) {
        final int d = MusicTrack.cracked_bar_endcap.imageWidth;
        if (n4 == n5) {
            n3 += d;
            n -= d;
        }
        jh_.c797();
        if (2 == n6) {
            n -= d;
        }
        gf_.e115(n2, n3, 8 + n2, n + n3);
        for (int i = 0; i < n; i += be_._o.imageHeight) {
            be_._o.drawImage(n2, n3 + i);
        }
        jh_.b797();
        if (2 == n4) {
            Trap._w.j093(n2, -d + n3);
        }
        if (n6 == 2) {
            Trap._w.h093(n2, n + n3);
        }
        if (1 == n4) {
            for (int n7 = 0; 8 > n7; ++n7) {
                gf_.d050(n2, n7 + n3, 8, 0, -(n7 * 24) + 192);
            }
        }
        if (1 == n6) {
            for (int n8 = 0; 8 > n8; ++n8) {
                gf_.d050(n2, n3 + (n - 1) - n8, 8, 0, 192 - n8 * 24);
            }
        }
    }
    
    static final boolean a351(final char c) {
        return c == ' ' || ' ' == c || c == '_' || c == '-';
    }
    
    public static void a150() {
        jc_._f = null;
        jc_.text_renown_lost = null;
        jc_.piece_baeserker = null;
        jc_.text_flee_minitip = null;
        jc_.color = null;
    }
    
    static {
        jc_.text_flee_minitip = "<col=8B8B2E>Flee</col> - Attempt to avoid combat";
        jc_.color = new Color(10040319);
        jc_._e = 0;
        jc_.text_renown_lost = "Renown lost: ";
    }
}
