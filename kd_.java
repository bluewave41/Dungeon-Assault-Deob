import java.math.*;

final class kd_
{
	//original name: _d
    static BigInteger publicKey;
    static HeaderLabelText[] _e;
    //original name: _a
    static String fullscreen;
    //original name: _f
    static Graphic stat_detect;
    //original name: _b
    static String justplay;
    //original name: _c
    static int tutorialStringIndex;
    static int[] _g;
    
    static final void a229(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (n4 < n7) {
            if (n7 < n6) {
                ue_.a657(n4, gf_._b, n5, n6, n, n7, n2, n3);
            }
            else if (n4 < n6) {
                ue_.a657(n4, gf_._b, n5, n7, n3, n6, n2, n);
            }
            else {
                ue_.a657(n6, gf_._b, n5, n7, n2, n4, n3, n);
            }
        }
        else if (n4 >= n6) {
            if (n6 <= n7) {
                ue_.a657(n6, gf_._b, n5, n4, n, n7, n3, n2);
            }
            else {
                ue_.a657(n7, gf_._b, n5, n4, n3, n6, n, n2);
            }
        }
        else {
            ue_.a657(n7, gf_._b, n5, n6, n2, n4, n, n3);
        }
    }
    
    static final void a150(final int n) {
        hl_.a487();
        sn_.a093(n ^ 0x3D, n);
    }
    
    static final void a253(final nh_ nh_) {
        final wj_ wj_ = new wj_(nh_.a826("logo.fo3d", ""));
        final int i = wj_.readByte();
        wj_.e487();
        ch_._n = lo_.a413(wj_, (byte)(-128));
        ih_._w = new qh_[i];
        lk_._R = new int[i][];
        for (int n = 0; i > n; ++n) {
            ih_._w[n] = df_.a013(wj_);
        }
        wj_.f423((byte)32);
        for (int j = 0; j < i; ++j) {
            final qh_ qh_ = ih_._w[j];
            qh_.a483(1, false, 6, 6, 6);
            qh_.a423((byte)(-127));
            final int[] array = { qh_._H + qh_._i >> 1, qh_._p + qh_._M >> 1, qh_._a + qh_._b >> 1 };
            lk_._R[j] = array;
            qh_.a115(0, -array[0], -array[2], -array[1]);
        }
    }
    
    //original signature: static final void b150(final int n) {
    static final void createTraps() {
        l_.createTrap(false, 0, 0, 0, 0, 0, 0, 0, new int[0][], 0, false, 0);
        l_.createTrap(false, 0, 0, 1, 0, 0, 0, 0, new int[0][], 0, false, 0);
        l_.createTrap(false, 0, 0, 2, 0, 0, 0, 0, new int[0][], 0, true, 0);
        l_.createTrap(false, 0, 0, 3, 0, 0, 0, 0, new int[0][], 0, false, 0);
        
        l_.createTrap(false, 0, 0, 5, 1, 1, 0, 100, new int[0][], 0, false, 1); //snakes
        l_.createTrap(true, 0, 0, 4, 4, 1, 0, 200, new int[][] { { TrapAbility.PIT.getValue() } }, 0, false, 1); //pit
        l_.createTrap(true, 0, 0, 6, 2, 1, 1, 300, new int[][] { { TrapAbility.MINUS_DEFENCE.getValue(), 1 } }, 3500, false, 2); //nails
        l_.createTrap(true, 0, 0, 7, 6, 1, 0, 500, new int[][] { { TrapAbility.PIT.getValue() } }, 7500, false, 3); //hidden pit
        l_.createTrap(false, 0, 0, 8, 3, 1, 1, 600, new int[][] { { TrapAbility.TELEPORT.getValue() } }, 11000, false, 4); //teleport
        l_.createTrap(true, 0, 0, 9, 4, 1, 0, 800, new int[][] { { TrapAbility.MINUS_DEFENCE.getValue(), 1 } }, 16000, false, 3); //hidden nails
        l_.createTrap(true, 0, 0, 11, 3, 1, 1, 1100, new int[0][], 20000, true, 7); //crusher
        l_.createTrap(true, 6, 8, 21, 5, 2, 1, 1400, new int[][] { { TrapAbility.CORROSIVE_SLIME.getValue() } }, 27500, false, 0); //corrosive slime
        l_.createTrap(true, 6, 0, 12, 6, 1, 0, 1500, new int[][] { { TrapAbility.HIDDEN_DARTS.getValue() } }, 32000, true, 4); //hidden darts
        l_.createTrap(true, 0, 0, 13, 7, 1, 1, 1800, new int[][] { { TrapAbility.MINUS_DEFENCE.getValue(), 3 } }, 39000, false, 7); //whirling blades
        l_.createTrap(false, 0, 0, 10, 8, 1, 2, 2200, new int[][] { { TrapAbility.PIT.getValue() }, { TrapAbility.BOTTOMLESS_PIT.getValue() } }, 55000, true, 4); //bottomless pit
        l_.createTrap(false, 0, 0, 14, 6, 1, 3, 2300, new int[0][], 65000, true, 8); //poisonous gas
        
        l_.createTrap(false, 0, 0, 35, 2, 3, 0, 100, new int[][] { { TrapAbility.RAISE_DETECT.getValue(), 1 } }, 0, false, 0); //tripwire bell
        l_.createTrap(false, 0, 0, 36, 0, 3, 1, 1100, new int[][] { { TrapAbility.DETECT_RAISE_2.getValue() }, { 8, 2 } }, 23000, false, 6); //hall of glass
        l_.createTrap(false, 0, 0, 37, 9, 3, -1, 2200, new int[][] { { 9, 3 } }, 60000, false, 0); //unused
        
        l_.createTrap(true, 1, 1, 15, 1, 2, 0, 100, new int[0][], 0, false, 1); //giant rats
        l_.createTrap(true, 1, 1, 16, 2, 2, 0, 200, new int[][] { { TrapAbility.MINUS_ATTACK.getValue(), 1 } }, 0, false, 0); //rot worms
        l_.createTrap(true, 2, 2, 17, 1, 2, 1, 300, new int[0][], 4500, false, 1); //troglodytes
        l_.createTrap(true, 2, 1, 25, 3, 2, 0, 350, new int[0][], 5500, false, 1); //imp
        l_.createTrap(true, 2, 3, 18, 1, 2, 0, 400, new int[0][], 6500, false, 1); //giant snake
        l_.createTrap(true, 2, 3, 24, 3, 2, 1, 500, new int[][] { { TrapAbility.MINUS_ATTACK.getValue(), 1 }, { TrapAbility.MINUS_DEFENCE.getValue(), 1 } }, 8500, false, 1); //vampire bats
        l_.createTrap(true, 2, 3, 19, 1, 2, 0, 600, new int[0][], 9500, false, 4); //giant spider
        l_.createTrap(true, 2, 4, 20, 3, 2, 0, 700, new int[][] { { TrapAbility.SKELETON_SENTINELS.getValue() } }, 11500, false, 0); //skeleton sentinels
        l_.createTrap(true, 5, 2, 23, 4, 2, -1, 800, new int[][] { { 5, 2 } }, 12500, false, 3); //unused
        l_.createTrap(true, 2, 2, 27, 5, 2, 0, 850, new int[][] { { TrapAbility.MINUS_ATTACK.getValue(), 2 } }, 14000, false, 2); //spectre
        l_.createTrap(true, 3, 5, 30, 1, 2, -1, 900, new int[0][], 18000, true, 4); //unused
        l_.createTrap(true, 5, 4, 28, 2, 2, 1, 1100, new int[][] { { TrapAbility.RAISE_DETECT_ADJACENT.getValue(), 2 }, { TrapAbility.MINUS_ATTACK.getValue(), 1 } }, 21500, false, 6); //banshee
        l_.createTrap(true, 6, 6, 31, 2, 2, 1, 1200, new int[0][], 24500, true, 0); //pit demon
        l_.createTrap(true, 6, 2, 29, 4, 2, -1, 1300, new int[0][], 26000, true, 6); //unused
        l_.createTrap(true, 4, 8, 26, 7, 2, 0, 1400, new int[][] { { TrapAbility.ARMORED.getValue() } }, 30000, false, 0); //stone golem
        l_.createTrap(true, 7, 7, 22, 1, 2, 1, 1800, new int[][] { { TrapAbility.MINUS_DEFENCE.getValue(), 2 } }, 35000, false, 1); //razor construct
        l_.createTrap(true, 5, 4, 32, 7, 2, 1, 1900, new int[][] { { TrapAbility.VAMPIRE_LORD.getValue() } }, 42000, true, 4); //vampire lord
        l_.createTrap(true, 9, 5, 33, 8, 2, 2, 2200, new int[0][], 62000, true, 5); //hell beast
        l_.createTrap(true, 10, 6, 34, 10, 2, 3, 3000, new int[][] { { TrapAbility.TERRORIZE.getValue() } }, 70000, true, 5); //demon lord
    }
    
    public static void a423() {
        kd_._g = null;
        kd_.publicKey = null;
        kd_._e = null;
        kd_.stat_detect = null;
        kd_.fullscreen = null;
        kd_.justplay = null;
    }
    
    //original signature: static final synchronized long c138(final int n) {
    static final synchronized long getTime() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < lo_._f) {
            fb_._c += -currentTimeMillis + lo_._f;
        }
        lo_._f = currentTimeMillis;
        return fb_._c + currentTimeMillis;
    }
    
    static {
        kd_.publicKey = new BigInteger("10645251973762891105751951777190971575153603860524007320193744916262453524506043904111741323441999463383430480626664676210959679707389748237308029239059217");
    	kd_.justplay = "Just play";
        kd_.fullscreen = "Fullscreen";
        kd_._g = new int[4];
    }
}
