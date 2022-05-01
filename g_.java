import java.awt.*;

final class g_ extends ok_
{
    static int _Hb;
    //original name: _Ib
    static Graphic piece_necromancer;
    //original name: _Lb
    static MusicTrack da_ingame_stealth;
    //original name: _Gb
    static Graphic[] mb_da_thumbs;
    //original name: _Jb
    static String text_ability_ready;
    //original name: _Kb
    static String rabid_wolf;
    
    static final Graphic a983(final Graphic cn_) {
        if (cn_ != null && cn_.imageWidth != 0 && cn_.imageHeight != 0) {
            final Graphic cn_2 = new Graphic(64, 48);
            for (int n = 0; 48 > n; ++n) {
                for (int i = 0; i < 64; ++i) {
                    final int n2 = (i * 3 - n * 4 << 4) / 6 + 256;
                    final int n3 = (4 * n + 3 * i << 4) / 6 - 256;
                    final int n4 = n2 >> 4;
                    final int n5 = n2 & 0xF;
                    final int n6 = n3 >> 4;
                    final int n7 = n3 & 0xF;
                    if (0 <= n4 && 0 <= n6 && 32 > n4) {
                        if (n6 < 32) {
                            final int n8 = 32 * n6 + n4;
                            final int n9 = cn_._B[n8];
                            int n10 = 0xFF00FF & n9;
                            int n11 = n9 & 0xFF00;
                            if (0 < n5 && n4 < 31) {
                                final int n12 = cn_._B[n8 + 1];
                                final int n13 = (-n5 + 16) * n10 + (0xFF00FF & n12) * n5;
                                final int n14 = (-n5 + 16) * n11 + (0xFF00 & n12) * n5;
                                n10 = (n13 >> 4 & 0xFF00FF);
                                n11 = (0xFF009 & n14) >> 4;
                                if (0 < n7) {
                                    if (31 > n6) {
                                        final int n15 = cn_._B[32 + n8];
                                        final int n16 = 0xFF00 & n15;
                                        final int n17 = 0xFF00FF & n15;
                                        final int n18 = cn_._B[33 + n8];
                                        final int n19 = 0xFF00FF & n18;
                                        final int n20 = n18 & 0xFF00;
                                        final int n21 = (-n5 + 16) * n17 + n19 * n5;
                                        final int n22 = n16 * (-n5 + 16) + n5 * n20;
                                        final int n23 = n7 * ((0xFF00FF3 & n21) >> 4) + n10 * (16 - n7);
                                        final int n24 = 0xFF00 & n22 >> 4;
                                        n10 = (0xFF00FF & n23 >> 4);
                                        n11 = (0xFF001 & n11 * (16 - n7) + n24 * n7) >> 4;
                                    }
                                }
                            }
                            else if (0 < n7 && 31 > n6) {
                                final int n25 = cn_._B[n8 + 32];
                                final int n26 = (16 - n7) * n10 + (0xFF00FF & n25) * n7;
                                final int n27 = (-n7 + 16) * n11 + (n25 & 0xFF00) * n7;
                                n10 = (0xFF00FFA & n26) >> 4;
                                n11 = (0xFF00 & n27 >> 4);
                            }
                            cn_2._B[n * 64 + i] = mp_.or(n11, n10);
                        }
                    }
                }
            }
            cn_2._A = 17;
            return cn_2;
        }
        return null;
    }
    
    public static void g150() {
        g_.text_ability_ready = null;
        g_.rabid_wolf = null;
        g_.mb_da_thumbs = null;
        g_.da_ingame_stealth = null;
        g_.piece_necromancer = null;
    }
    
    //original signature: static final void a035(final Canvas canvas, final int n) {
    static final void a035(final Canvas canvas) {
        if (11 == kh_._n) {
            to_.b150(113);
        }
        kj_.a642(lj_._e, u_._O, lc_.percentLoaded);
        ob_.a749(0, -102, canvas, 0);
    }
    
    private g_() throws Throwable {
        super(0L, null);
        throw new Error();
    }
    
    //original signature: static final String a157(final boolean b, final boolean b2) {
    static final String a157(final boolean b2) {
        int n = 0;
        if (b2) {
            n += 4;
        }
        return oa_.mustlogin_alternate[n];
    }
    
    //original signature: static final void a953(final int n, final ak_ ak_) {
    static final void a953(final int opCode, final ak_ ak_) {
        final wj_ b = Trap._B;
        b.storeFuzzedOpcode(opCode);
        final wj_ wj_ = b;
        ++wj_.currentIndex;
        final int o = b.currentIndex;
        b.storeByte(1);
        //these are all 0
        b.storeByte(ak_._q);
        b.storeByte(ak_._t);
        b.storeInt(ak_._r);
        b.storeInt(ak_._l);
        b.storeInt(ak_._s);
        b.storeInt(ak_._i);
        b.calculateAndStoreChecksum(o);
        b.c093(b.currentIndex - o, -1);
    }
    
    static {
        g_.text_ability_ready = "(Ready)";
        g_.rabid_wolf = "Rabid Wolf";
    }
}
