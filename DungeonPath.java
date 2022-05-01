//original name: wm_
final class DungeonPath
{
	//original name: _d
    static String[] titles_external_female;
    //original name: _j
    static String text_guardians;
    //original name: _e
    static String text_bounty_claimed;
    //original name: _g
    static volatile int isMetaDown; //2 if meta is down
    //original name: _f
    int[] dungeonPath;
    static int _b;
    static Graphic _c;
    static Graphic _h;
    //original name: _i
    static String[] titles_external_male;
    static boolean change = false;
    
    //original signature: final boolean a370(final int n, final byte b) {
    //has room been explored?
    final boolean a370(final int roomNumber) {
        return (this.dungeonPath[roomNumber >> 5] & 1 << (roomNumber & 31)) != 0;
    }
    
    final DungeonPath a775(final byte b, DungeonPath wm_) {
        DungeonPath wm_2 = this;
        if (b != -53) {
            return null;
        }
        if (wm_.dungeonPath.length < wm_2.dungeonPath.length) {
            wm_2 = wm_;
            wm_ = this;
        }
        final DungeonPath wm_3 = new DungeonPath(32 * wm_.dungeonPath.length);
        int n;
        for (n = 0; wm_2.dungeonPath.length > n; ++n) {
            wm_3.dungeonPath[n] = wm_.dungeonPath[n] & wm_2.dungeonPath[n];
        }
        while (wm_.dungeonPath.length > n) {
            wm_3.dungeonPath[n] = wm_.dungeonPath[n];
            ++n;
        }
        return wm_3;
    }
    
    static final boolean a671(final String s, final String s2, final byte b) {
        return !dj_.a988(b + 6706, s2) && !j_.a623(s2) && !sm_.a988(s2) && (s.length() == 0 || (!gk_.a398(s, s2) && !gl_.a014(s, b ^ 0xFFFFFFAD, s2) && !uo_.a689(s, s2) && (b == -83 || true)));
    }
    
    //original signature: static final void a679(final int r, final int p2) {
    static final void a679() {
        vo_._r = 320;
        bl_._p = 240;
    }
    
    DungeonPath(final int n) {
        this.dungeonPath = new int[n + 31 >> 5];
    }
    
    //original signature: final void a093(final int n, final int n2) {
    final void a093(final int n) {
    	int parsed = Math.floorDiv(n, 32);
        this.dungeonPath[parsed] = mp_.or(this.dungeonPath[parsed], 1 << (31 & n));
    }
    
    /*Copy constructor*/
    //original signature: DungeonPath(final DungeonPath wm_) {
    DungeonPath(final DungeonPath path) {
        final int length = path.dungeonPath.length;
        this.dungeonPath = new int[length];
        for (int i = 0; i < length; ++i) {
            this.dungeonPath[i] = path.dungeonPath[i];
        }
    }
    
    public static void a423() {
        DungeonPath._c = null;
        DungeonPath._h = null;
        DungeonPath.text_guardians = null;
        DungeonPath.titles_external_male = null;
        DungeonPath.text_bounty_claimed = null;
        DungeonPath.titles_external_female = null;
    }
    
    //original signature: final void a150(final int n) {
    final void clearDungeonPath() {
        for (int n2 = 0; this.dungeonPath.length > n2; ++n2) {
            this.dungeonPath[n2] = 0;
        }
    }
    
    final void b093(final int n, final int n2) {
        if (n2 != 31) {
            DungeonPath.text_guardians = null;
        }
        this.dungeonPath[n >> 5] = nb_.and(this.dungeonPath[n >> 5], ~(1 << nb_.and(31, n)));
    }
    
    static {
        DungeonPath.titles_external_female = new String[] { "<%0> of the 6M crew", "<%0>, Ultima", "<%0>, Monarch of the Gem", "<%0>, Scourge Elite", "<%0>, the Relentless", "<%0>, Solar Champion", "<%0>, the Reckless", "<%0>, Mistress of Magic", "Archmage <%0>", "<%0>, the Corrupted" };
        DungeonPath.text_bounty_claimed = "You claim a bounty of <%0> Treasure for reaching the hoard room.";
        DungeonPath.text_guardians = "Guardians";
        DungeonPath.isMetaDown = 0;
        DungeonPath.titles_external_male = new String[] { "<%0> of the 6M crew", "<%0>, Ultima", "<%0>, Monarch of the Gem", "<%0>, Scourge Elite", "<%0>, the Relentless", "<%0>, Solar Champion", "<%0>, the Reckless", "<%0>, Master of Magic", "Archmage <%0>", "<%0>, the Corrupted" };
    }
}
