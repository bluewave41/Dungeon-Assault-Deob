final class o_ extends ne_
{
	//original name: _l
    static String thief;
    //original name: _j
    static long sessionKey; //bounds?
    //original name: _n
    static DungeonPath dungeonPath;
    int _p;
    fa_ _k;
    static ae_ _i;
    //original name: _q
    static String singleplayergame;
    static int _m;
    static gj_ _o;
    
    static final void a218(final int n, final jd_ jd_) {
        final wj_ b = Trap._B;
        b.storeFuzzedOpcode(n);
        b.storeByte(jd_._m);
        b.storeShort(jd_._k);
    }
    
    public static void d150() {
        o_.dungeonPath = null;
        o_.thief = null;
        o_._o = null;
        o_._i = null;
        o_.singleplayergame = null;
    }
    
    static final boolean a017(final CharSequence charSequence) {
        return ua_.a141(false, charSequence);
    }
    
    //original signature: static final void a013(final int n, final String s, final int n2) {
    static final void unpackAnimations(final String trapName, final int trapId) {
        final Trap trap = gh_.traps[trapId];
        if (null != trap) {
            trap.idleAnimation = tp_.unpackAnimation(kf_._p, "idle", trapName);
            trap.victoryAnimation = tp_.unpackAnimation(kf_._p, "victory", trapName);
            trap.defeatAnimation = tp_.unpackAnimation(kf_._p, "defeat", trapName);
        }
    }
    
    //original signature: static final int a681(final int n, final boolean b, final int n2) {
    static final int a681() {
        return wk_.c474();
    }
    
    static final int a776(final int n, final int n2) {
        if (!ke_.a097(tg_._f[n][n2])) {
            return n2 * tg_._d[n] + tg_._h[n];
        }
        return 439;
    }
    
    static final boolean a091(final int[] array, final int[] array2, int n, final PlayerInformation lb_) {
        if (!mh_.a097(n)) {
            return false;
        }
        if (n == -1) {
            return true;
        }
        n &= 0x7F;
        if (MusicTrack._a <= n) {
            return false;
        }
        if (n >= 64) {
            return null != array2 && vl_.a873(n - 64, -109, array2);
        }
        if (48 <= n) {
            return vl_.a873(bl_._n[-48 + n], -93, array);
        }
        if (32 <= n) {
            return ci_._s[n - 32] <= lb_._z;
        }
        if (16 <= n) {
            int n2 = 0;
            for (int i = 0; i < 6; ++i) {
                n2 += lb_._J[i];
            }
            return n2 >= RaidMember._m[n - 16];
        }
        return 0 <= n && dc_._p[n] <= lb_._f;
    }
    
    o_(final fa_ k, final int p2) {
        this._p = p2;
        this._k = k;
    }
    
    static final void a270(final int n, int n2, final int[] array, int n3, final int[] array2, final int n4, final int n5, int n6, final int n7, final int n8) {
        final int n9 = -n5 + 256;
        for (int n10 = -n4; 0 > n10; ++n10) {
            for (int n11 = -n; 0 > n11; ++n11) {
                n2 = array2[n3++];
                final int n12 = array[n6];
                array[n6++] = mp_.or(nb_.and(n5 * nb_.and(65280, n2) + nb_.and(n12, 65280) * n9, 16711680), nb_.and(-16711936, nb_.and(16711935, n2) * n5 + nb_.and(16711935, n12) * n9)) >>> 8;
            }
            n6 += n7;
            n3 += n8;
        }
    }
    
    static final void a150() {
        kn_.isTutorial = false;
    }
    
    static {
        o_.thief = "Thief";
        o_.dungeonPath = new DungeonPath(25);
        o_.singleplayergame = "Single-player game";
    }
}
