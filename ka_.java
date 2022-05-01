final class ka_
{
    private static int[] _a;
    static int _c;
    //original name: _b
    static String[] titles_external_achievement;
    //original name: _d
    static String[] tutorial_trap2;
    
    static final void a150() {
        nf_._y = -1;
        of_._k = true;
        final ed_ o = Animation._o;
        Animation._o._N = false;
        o.isActive = false;
        og_._e._N = true;
        og_._e.isActive = true;
    }
    
    public static void a423() {
        ka_._a = null;
        ka_.tutorial_trap2 = null;
        ka_.titles_external_achievement = null;
    }
    
    static {
        ka_._a = new int[98304];
        for (int i = 92682; i >= 46341; --i) {
            final long n = 1 + (i << 1);
            final long n2 = (i << 1) - 1;
            final int n3 = (int)((n2 * n2 >> 18) - 32768L);
            int n4 = (int)((n * n >> 18) - 32768L);
            if (n4 >= ka_._a.length) {
                n4 = ka_._a.length - 1;
            }
            for (int j = (n3 < 0) ? 0 : n3; j <= n4; ++j) {
                ka_._a[j] = i;
            }
        }
        ka_.tutorial_trap2 = new String[] { null, "When a raider encounters a trap, one of several things may happen. The raider may be able to <%highlight>disarm</col> the trap without triggering it - (if your raider's <%sneak> roll beats that of the room's <%detect>).<br><br>If they are unable to <%highlight>disarm</col> it, the trap will be triggered, but an agile <%raider> (that wins a <%dodge> roll against the <%trap>'s <%snare>) may be able to avoid injury. Otherwise, it will be subject to the effects of the trap.<br><br><%command>Click the shield icon (at the bottom-right) to attempt to disarm this trap.</command>" };
        ka_._c = 0;
        ka_.titles_external_achievement = new String[] { "6M Crew Member", "Victorius Ultima", "Crystal Monarch", "Starship Commando", "Relentless 2", "Mega Champion", "Insane Pilot", "Master of Magic", "Arch Mage", "Stench of Corruption" };
    }
}
