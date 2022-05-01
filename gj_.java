abstract class gj_
{
    static int[] _c;
    //original name: _a
    static String orc_warrior;
    //original name: _b
    static String demon_lord;
    
    static final int a080(final int n) {
        if (0 > n) {
            if (-65536 > n) {
                return ib_._g[134217728 / -n] - 2048;
            }
            return -ib_._g[-n >> 5];
        }
        else {
            if (n > 65536) {
                return -ib_._g[134217728 / n] + 2048;
            }
            return ib_._g[n >> 5];
        }
    }
    
    static final void a324(final int n, final String[] array, final String s) {
        ol_._i = dh_._b;
        if (255 == n) {
            mh_._b = l_.a307(13 > wk_._g);
        }
        else if (100 > n || 105 < n) {
            mh_._b = DungeonBuilder.a853(n, s);
        }
        else {
            mh_._b = em_.a953(array);
        }
    }
    
    static final int a498(final Raider h_) {
        return ib_.a598(h_) >> 1;
    }
    
    abstract void b150(final int p0);

    //original signature: static final void a226(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
    static final void createRaider(final int[] abilities, final int unknown1, final int unknown2, final int raiderId, final int renown, final int attack, final int cost,
    		final int dodge, final int defence, final int sneak) {
        hp_.raiders[raiderId] = new Raider(raiderId, unknown1, cost, renown, unknown2, attack, defence, dodge, sneak, abilities);
    }
    
    abstract long a138(final int p0);
    
    final int a871(final long n, final int n2) {
        if (n2 > -54) {
            return -17;
        }
        final long a138 = this.a138(127);
        if (0L < a138) {
            pj_.a054(0, a138);
        }
        return this.b871(n, 2048);
    }
    
    abstract int b871(final long p0, final int p1);
    
    public static void a423() {
        gj_.orc_warrior = null;
        gj_._c = null;
        gj_.demon_lord = null;
    }
    
    static {
        gj_.orc_warrior = "Orc Warrior";
        gj_._c = new int[8];
        gj_.demon_lord = "Demon Lord";
    }
}
