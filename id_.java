import java.util.*;

final class id_ implements Iterator
{
    private ll_ _a;
    //original name: _k
    static String text_inst_monster;
    //original name: _b
    static long[] times;
    private dh_ _d;
    static rj_ _l;
    //original name: _c
    static String create_alert_doublespace;
    //original name: _g
    static String fs_timeout;
    static md_ _e;
    static int[] _j;
    //original name: _f
    static String waitingfor_music;
    static Graphic[] _m;
    static nh_ _i;
    private ll_ _h;
    
    @Override
    public final Object next() {
        ll_ h = this._h;
        if (this._d._d == h) {
            h = null;
            this._h = null;
        }
        else {
            this._h = h._n;
        }
        return this._a = h;
    }
    
    @Override
    public final void remove() {
        if (null != this._a) {
            this._a.b423();
            this._a = null;
            return;
        }
        throw new IllegalStateException();
    }
    
    //original signature: static long a833(final long n, final long n2) {
    static long or(final long n, final long n2) {
        return n | n2;
    }
    
    static final void a150(final int n) {
        sd_._F = new int[] { 0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536 };
        final int i = ih_._w.length;
        final int[] array = new int[i];
        for (int n2 = 0; i > n2; ++n2) {
            final qh_ qh_ = ih_._w[n2];
            qh_.a423((byte)(-123));
            bk_.a093(7, n2);
            final int n3 = qh_._i + qh_._H >> 1;
            final int n4 = qh_._p + qh_._M >> 1;
            final int n5 = qh_._a + qh_._b >> 1;
            final int n6 = sd_._F[9] >> 2;
            final int n7 = sd_._F[10] >> 2;
            final int n8 = sd_._F[11] >> 2;
            array[n2] = (n7 * pj_._e[10] + n6 * pj_._e[9] + pj_._e[11] * n8 >> 14) * n5 + (n3 * (n8 * pj_._e[5] + (n6 * pj_._e[3] + pj_._e[4] * n7) >> 14) + n4 * (pj_._e[8] * n8 + n7 * pj_._e[7] + pj_._e[6] * n6 >> 14)) >> 16;
        }
        final int n9 = sd_._F[9] >> 8;
        final int n10 = sd_._F[10] >> 8;
        final int n11 = sd_._F[11] >> 8;
        final int n12 = nl_._d << 4;
        int n13 = 0;
        int n14 = oj_.a353(n12) >> 8;
        int n15 = jg_.a080(8191, n12) >> 8;
        if (n != 439027688) {
            a524(-29, null);
        }
        if (-1 != hj_.mouseX && Animation.mouseY != -1) {
            n14 = -Animation.mouseY + 240;
            n15 = -128;
            n13 = hj_.mouseX - 320;
        }
        final double n16 = 256.0 / Math.sqrt(n14 * n14 + (n13 * n13 + n15 * n15));
        final int n17 = (int)(n13 * n16);
        final int n18 = (int)(n14 * n16);
        final int n19 = (int)(n15 * n16);
        final int n20 = n17 - n9;
        final int n21 = -n10 + n18;
        final int n22 = n19 - n11;
        final double n23 = 256.0 / Math.sqrt(n21 * n21 + n20 * n20 + n22 * n22);
        final int n24 = (int)(n22 * n23);
        final int n25 = (int)(n20 * n23);
        final int n26 = (int)(n21 * n23);
        for (int n27 = 0; ih_._w.length > n27; ++n27) {
            int n28 = 0;
            for (int j = 1; j < ih_._w.length; ++j) {
                if (array[n28] < array[j]) {
                    n28 = j;
                }
            }
            array[n28] = Integer.MIN_VALUE;
            final qh_ qh_2 = ih_._w[n28];
            bk_.a093(7, n28);
            for (int n29 = 0; 3 > n29; ++n29) {
                final int[] e = pj_._e;
                final int n30 = n29;
                e[n30] += lk_._R[n27][n29];
            }
            pb_.a560(true, 0, sd_._F, false, qh_2, pj_._e);
            ad_.a934(n26, n18, n17, n24, -106, n25, n19, qh_2);
        }
    }
    
    public static void a423() {
        id_._e = null;
        id_.fs_timeout = null;
        id_.create_alert_doublespace = null;
        id_.times = null;
        id_._m = null;
        id_._i = null;
        id_.text_inst_monster = null;
        id_._l = null;
        id_.waitingfor_music = null;
        id_._j = null;
    }
    
    @Override
    public final boolean hasNext() {
        return this._h != this._d._d;
    }
    
    static final ab_ a524(final int n, final String s) {
        final int i = s.length();
        if (n != -49) {
            a150(51);
        }
        for (int n2 = 0; i > n2; ++n2) {
            final char char1 = s.charAt(n2);
            if (char1 < '0' || char1 > '9') {
                return null;
            }
        }
        return np_._E;
    }
    
    static final void a728(int n, int n2, final int n3, final int n4, final int[] array, int n5, final int n6, final int[] array2, final int n7) {
        for (int n8 = -n3; 0 > n8; ++n8) {
            for (int n9 = -n6; 0 > n9; ++n9) {
                n2 = array[n5++];
                if (0 != n2 && n2 != 255) {
                    final int n10 = array2[n];
                    final int n11 = 0xFF & n2;
                    array2[n++] = mp_.or(nb_.and(nb_.and(65280, n10) * n11 >> 8, 65280), mp_.or(nb_.and(nb_.and(16711935, n10) * n11 >> 8, 16711935), nb_.and(n10, -16777216)));
                }
                else {
                    ++n;
                }
            }
            n += n7;
            n5 += n4;
        }
    }
    
    id_(final dh_ d) {
        this._a = null;
        this._d = d;
        this._h = this._d._d._n;
        this._a = null;
    }
    
    static {
        id_.text_inst_monster = "MONSTER";
        id_.create_alert_doublespace = "Names cannot contain consecutive spaces";
        id_.fs_timeout = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        id_.times = new long[32];
        id_._j = new int[0];
        id_._e = new md_();
        id_.waitingfor_music = "Waiting for music";
    }
}
