import java.awt.event.*;
import java.awt.*;

final class gh_
{
	//original name: _e
    static String centaur;
    //original name: _b
    static String desc_berserker;
    //original name: _i
    static Trap[] traps;
    static long[] _a;
    //original name: _g
    static Graphic[] strategy_buttons;
    static nh_ _c;
    static long[][] _h;
    static boolean _f;
    //original name: _j
    static String desc_beastman;
    //original name: _d
    static MusicTrack da_ingame_battle;
    
    public static void a150() {
        gh_.centaur = null;
        gh_.desc_berserker = null;
        gh_.da_ingame_battle = null;
        gh_.strategy_buttons = null;
        gh_.traps = null;
        gh_._c = null;
        gh_._h = null;
        gh_._a = null;
        gh_.desc_beastman = null;
    }
    
    //happens when we click login
    //original signature: static final void a676(final String s, final boolean l) {
    static final void a676(final String loggingInOrConnectionLost, final boolean l) {
        cd_._b = true;
        jd_._l = l;
        a_._n = new nk_(lg_._w, hc_._f, loggingInOrConnectionLost, qc_._t, jd_._l);
        lg_._w.a336(a_._n, -1);
    }
    
    static final String a382(final int n) {
        if (n >= 0) {
            return n / 10 + "." + n % 10;
        }
        return "-" + -n / 10 + "." + -n % 10;
    }
    
    static final ek_ a470(final int n, final int n2, final int n3, final qg_ qg_, final int n4) {
        final Frame a503 = ga_.a503(qg_, n4, n, n2, n3);
        if (a503 != null) {
            final ek_ ek_ = new ek_();
            (ek_._e = a503).add(ek_);
            ek_.setBounds(0, 0, n4, n3);
            ek_.addFocusListener(ek_);
            ek_.requestFocus();
            return ek_;
        }
        return null;
    }
    
    //original signature: static final void a093(final int n, final int n2) {
    static final void a093(final int n) {
        qh_.a726(null, n);
    }
    
    static {
        gh_.traps = new Trap[38];
        gh_.centaur = "Centaur";
        gh_.desc_berserker = "Hugely muscled man wearing only a loincloth and leather helm for protection, but wielding a ridiculously large hammer to compensate. The berserker enters a trance-like state when he engages foes in combat, giving him great strength, but leaving him vulnerable to skilled opponents.";
        gh_._a = new long[11];
        gh_._h = new long[8][256];
        for (int i = 0; i < 256; ++i) {
            final char char1 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".charAt(i / 2);
            final long n = (0x0 != (i & 0x1)) ? ('\u00ff' & char1) : ((long)(char1 >>> 8));
            long n2 = n << 1;
            if (256L <= n2) {
                n2 ^= 0x11DL;
            }
            long n3 = n2 << 1;
            if (n3 >= 256L) {
                n3 ^= 0x11DL;
            }
            final long n4 = n3 ^ n;
            long n5 = n3 << 1;
            if (256L <= n5) {
                n5 ^= 0x11DL;
            }
            gh_._h[0][i] = id_.or(n5 ^ n, id_.or(id_.or(n4 << 16, id_.or(id_.or(id_.or(n3 << 40, id_.or(n << 48, n << 56)), n << 32), n5 << 24)), n2 << 8));
            for (int j = 1; j < 8; ++j) {
                gh_._h[j][i] = id_.or(gh_._h[j - 1][i] >>> 8, gh_._h[j - 1][i] << 56);
            }
        }
        gh_._a[0] = 0L;
        for (int k = 1; k <= 10; ++k) {
            final int n6 = k * 8 - 8;
            gh_._a[k] = mn_.xor(eg_.and(255L, gh_._h[7][n6 + 7]), mn_.xor(mn_.xor(mn_.xor(eg_.and(4278190080L, gh_._h[4][n6 + 4]), mn_.xor(eg_.and(gh_._h[3][3 + n6], 1095216660480L), mn_.xor(mn_.xor(eg_.and(gh_._h[1][1 + n6], 71776119061217280L), eg_.and(-72057594037927936L, gh_._h[0][n6])), eg_.and(gh_._h[2][n6 + 2], 280375465082880L)))), eg_.and(16711680L, gh_._h[5][n6 + 5])), eg_.and(gh_._h[6][n6 + 6], 65280L)));
        }
        gh_.desc_beastman = "Horns, claws, hooves, spines and a long tongue; the beastman is formed of many animals and more dangerous than all of them put together.";
    }
}
