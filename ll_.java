import java.util.*;

class ll_ extends ne_
{
	//original signature: _k
    static boolean debugMode;
    static md_ _i;
    //original name: _j
    static String[] tutorial_strategies4;
    static nh_ _r;
    //original name: _s
    static String magical_guardian_room;
    ll_ _n;
    //original name: _m
    static String[] menuOptions;
    static vk_ _p;
    //original name: _u
    static String crusher;
    ll_ _l;
    long _o;
    //original name: _q
    static Graphic piece_darkelf;
    //original name: _t
    static String[] ability_ferocity;
    
    static final void a078(int n, final byte[] array, int n2, final int[] array2) {
        for (int n3 = 0; gg_._a.length > n3; ++n3) {
            n = gg_._a[n3];
            int n4 = n3 << 4;
            while (n-- != 0) {
                n2 = hf_._yb[n4++];
                hf_._yb[array2[array[n2]]++] = n2;
            }
        }
    }
    
    static final void a150() {
        rf_._K = new fm_(GUIButton._H);
        (le_.tutorialStrings = new gn_[25][])[0] = lc_.a603(new String[][] { bh_.tutorial_welcome1, nf_.tutorial_welcome2 });
        le_.tutorialStrings[1] = lc_.a603(new String[][] { rl_.tutorial_raiding1, co_.tutorial_raiding2 });
        le_.tutorialStrings[2] = lc_.a603(new String[][] { DungeonBuilder.tutorial_raiders1, je_.tutorial_raiders2, og_.tutorial_raiders3, Raider.tutorial_raiders4 });
        le_.tutorialStrings[3] = lc_.a603(new String[][] { pp_.tutorial_rooms1, np_.tutorial_rooms2 });
        le_.tutorialStrings[4] = lc_.a603(new String[][] { eg_.tutorial_firstroom1a, lp_.tutorial_firstroom2, PlayerInformation.tutorial_monster2, le_.tutorial_monster3 });
        le_.tutorialStrings[5] = lc_.a603(new String[][] { bn_.tutorial_firstroom1b, lp_.tutorial_firstroom2, ka_.tutorial_trap2 });
        le_.tutorialStrings[6] = lc_.a603(new String[][] { rl_.tutorial_monster1, PlayerInformation.tutorial_monster2, le_.tutorial_monster3 });
        le_.tutorialStrings[7] = lc_.a603(new String[][] { tp_.tutorial_strategies1, lp_.tutorial_strategies2, nl_.tutorial_strategies3, ll_.tutorial_strategies4 });
        le_.tutorialStrings[8] = lc_.a603(new String[][] { bb_.tutorial_trap1, ka_.tutorial_trap2 });
        le_.tutorialStrings[9] = lc_.a603(new String[][] { Animation.tutorial_guardian1, bk_.tutorial_guardian2 });
        le_.tutorialStrings[10] = lc_.a603(new String[][] { hj_.tutorial_victory });
        le_.tutorialStrings[11] = lc_.a603(new String[][] { ek_.tutorial_defeat });
        le_.tutorialStrings[12] = lc_.a603(new String[][] { rm_.tutorial_defeat_repeated });
        le_.tutorialStrings[13] = lc_.a603(new String[][] { wl_.tutorial_death });
        le_.tutorialStrings[14] = lc_.a603(new String[][] { ha_.tutorial_hoardroom });
        le_.tutorialStrings[15] = lc_.a603(new String[][] { qa_.tutorial_abilities });
        le_.tutorialStrings[16] = lc_.a603(new String[][] { tl_.tutorial_modifiers });
        le_.tutorialStrings[17] = lc_.a603(new String[][] { ug_.tutorial_raid_complete });
        le_.tutorialStrings[18] = lc_.a603(new String[][] { qh_.tutorial_construction1, dg_.tutorial_construction2 });
        le_.tutorialStrings[19] = lc_.a603(new String[][] { tg_.tutorial_placeroom1, uo_.tutorial_placeroom2 });
        le_.tutorialStrings[20] = lc_.a603(new String[][] { hh_.tutorial_stable1, fj_.tutorial_stable2, k_.tutorial_stable3 });
        le_.tutorialStrings[21] = lc_.a603(new String[][] { rn_.tutorial_stable_noraider });
        le_.tutorialStrings[22] = lc_.a603(new String[][] { kg_.tutorial_end_justplay });
        le_.tutorialStrings[23] = lc_.a603(new String[][] { vf_.tutorial_dragonsofrenown1, qd_.tutorial_dragonsofrenown2, rk_.tutorial_dragonsofrenown3, un_.tutorial_dragonsofrenown4 });
        le_.tutorialStrings[24] = lc_.a603(new String[][] { tp_.tutorial_selectraiders });
        if (kd_.tutorialStringIndex > 25) {
            kd_.tutorialStringIndex = 0;
        }
        uo_.currentTutorialString = le_.tutorialStrings[kd_.tutorialStringIndex];
        if (fc_._d > uo_.currentTutorialString.length) {
            fc_._d = 0;
        }
        og_.a188(false, 0, uo_.currentTutorialString[fc_._d]);
    }
    
    //original signature: final void b423(final byte b) {
    final void b423() {
        if (this._l != null) {
            this._l._n = this._n;
            this._n._l = this._l;
            this._l = null;
            this._n = null;
        }
    }
    
    public static void a423(final byte b) {
        ll_._i = null;
        ll_.ability_ferocity = null;
        ll_._p = null;
        ll_._r = null;
        ll_.tutorial_strategies4 = null;
        if (b != 92) {
            a997(null, (byte)100);
        }
        ll_.crusher = null;
        ll_.piece_darkelf = null;
        ll_.magical_guardian_room = null;
        ll_.menuOptions = null;
    }
    
    static final void a050(final int n, final int n2, final int n3, final int n4, final int n5) {
        gf_.b115(n2, n5, n3 + 1, 10000536);
        gf_.b115(n2, n4 + n5, 1 + n3, 12105912);
        int n6 = 1;
        int i = n4;
        if (n != 2) {
            ll_.magical_guardian_room = null;
        }
        if (gf_._f > n6 + n5) {
            n6 = -n5 + gf_._f;
        }
        if (i + n5 > gf_._e) {
            i = -n5 + gf_._e;
        }
        for (int n7 = n6; i > n7; ++n7) {
            final int n8 = 152 + n7 * 48 / n4;
            final int n9 = n8 | (n8 << 8 | n8 << 16);
            gf_._b[n2 + (n5 + n7) * gf_._i] = n9;
            gf_._b[(n7 + n5) * gf_._i + (n2 + n3)] = n9;
        }
    }
    
    static final boolean a045(final Random random, final int[] array, final int[] array2) {
        return mo_.a244(array, array2[uj_.getRandom(random, array2.length)], random);
    }
    
    static final bo_ a997(final String s, final byte b) {
        if (fk_._v == null || null == s || s.length() == 0) {
            return null;
        }
        final String a715 = jm_.lowerCaseReplaceSpaceWithUnderscore(s);
        if (a715 != null) {
            for (bo_ bo_ = (bo_)fk_._v.a312((byte)125, a715.hashCode()); bo_ != null; bo_ = (bo_)fk_._v.c786((byte)5)) {
                if (jm_.lowerCaseReplaceSpaceWithUnderscore(bo_._Hb).equals(a715)) {
                    return bo_;
                }
            }
            if (b != -47) {
                a423((byte)52);
            }
            return null;
        }
        return null;
    }
    
    protected ll_() {
    }
    
    static {
        ll_.magical_guardian_room = "Magical Guardian";
        ll_.crusher = "Crusher";
        ll_.tutorial_strategies4 = new String[] { null, "Another option is to <%flee>. If the raider survives at least one combat round, they may be able to escape the room (if they win a <%dodge> roll against the room's <%snare>), allowing you to send a different raider in to face it, or to seek a different route entirely.<br><br><%command>Select one of these strategies now.</col>" };
        ll_._i = new md_();
        ll_.ability_ferocity = new String[] { "Ferocity", "The <%0> is able to channel his fury into a violent flurry of blows; during the first round of each combat, his <%attack> is doubled." };
    }
}
