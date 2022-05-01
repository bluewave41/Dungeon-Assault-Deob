final class Raider
{
	//original name: _a
    AmbientAudioTrack specialTrack;
    //original name: _u
    Animation selectAnimation;
    //original name: _r
    int defence;
    //original name: _t
    Animation victoryAnimation;
    //original name: _y
    static String[] tutorial_raiders4;
    //original name: _o
    int sneak;
    //original name: _l
    Animation _deathAnimation;
    //original name: _i
    static String text_monster_wins;
    //original name: _z
    int unknown1;
    //original name: _c
    int renown;
    //original name: _s
    int activeAbility;
    static ae_ _h;
    //original name: _E
    static Graphic piece_vampire;
    //original name: _F
    String name;
    //original name: _A
    int[] passiveAbilities;
    static int _j;
    //original name: _B
    int cost;
    //original name: _w
    int raiderId;
    //original name: _b
    int dodge;
    //original name: _x
    int unknown2;
    //original name: _m
    int attack;
    static Graphic _f;
    //original name: _G
    String description;
    //original name: _C
    String[] briefAbilityTexts;
    //original name: _d
    String[] abilityTexts;
    //original name: _g
    AmbientAudioTrack defeatTrack;
    //original name: _k
    String[][] briefPassiveAbilityTexts;
    //original name: _p
    AmbientAudioTrack revealTrack;
    //original name: _n
    static String desc_cave_troll;
    //original name: _e
    Animation idleAnimation;
    static int _q;
    //original name: _v
    Animation defeatAnimation;
    //original name: _D
    String[][] passiveAbilityTexts;
    
    static final void a086(final boolean b, final int n, final int n2, final boolean b2, final int n3) {
        final int latticeWidth = pi_.interface_lattice.imageWidth;
        jh_.c797();
        gf_.e115(n2, n3, latticeWidth + n2, n3 + n);
        for (int i = 0; i < n; i += pi_.interface_lattice.imageHeight) {
            pi_.interface_lattice.c093(n2, i + n3);
        }
        if (!b2) {
            return;
        }
        if (b) {
            for (int n4 = 0; 8 > n4; ++n4) {
                final int n5 = 192 - 24 * n4;
                gf_.d050(n2, n3 + n4, latticeWidth, 0, n5);
                gf_.d050(n2, n3 + (n - 1 - n4), latticeWidth, 0, n5);
            }
        }
        jh_.b797();
    }
    
    //original signature: final boolean a097(final int n, final int n2) {
    final boolean hasAbility(final int n) {
        if (this.activeAbility != n) {
            for (int n3 = 0; this.passiveAbilities.length > n3; ++n3) {
                if (this.passiveAbilities[n3] == n) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    static final int a137(final int n) {
        if (~dk_._c > n) {
            return 0;
        }
        if (hc_.lang == 0) {
            if (!fi_._u.a154()) {
                return 20;
            }
            if (!fi_._u.a213(false, "commonui")) {
                return 40;
            }
            if (!kg_._b.a154()) {
                return 50;
            }
            if (!kg_._b.a213(false, "commonui")) {
                return 60;
            }
            if (!ib_._b.a154()) {
                return 70;
            }
            if (!ib_._b.a427((byte)59)) {
                return 80;
            }
        }
        else {
            if (null != ia_._U) {
                if (!ia_._U.a154()) {
                    return 14;
                }
                if (!ia_._U.c896("", n + 3)) {
                    return 29;
                }
                if (!ia_._U.a213(false, "")) {
                    return 29;
                }
            }
            if (!fi_._u.a154()) {
                return 43;
            }
            if (!fi_._u.a213(false, "commonui")) {
                return 57;
            }
            if (!kg_._b.a154()) {
                return 71;
            }
            if (!kg_._b.a213(false, "commonui")) {
                return 80;
            }
            if (!ib_._b.a154()) {
                return 82;
            }
            if (!ib_._b.a427((byte)59)) {
                return 86;
            }
        }
        return 100;
    }
    
    public static void a423(final byte b) {
        Raider._f = null;
        Raider._h = null;
        Raider.desc_cave_troll = null;
        Raider.text_monster_wins = null;
        Raider.tutorial_raiders4 = null;
        Raider.piece_vampire = null;
        if (b != 16) {
            a086(true, 65, -49, false, 20);
        }
    }
    
    static final void a039(final int n, final nh_ nh_, final nh_ nh_2, final boolean b, final nh_ nh_3) {
        (im_._b = oh_.a321("")).a877(false);
        DungeonBuilder.a467(nh_2, nh_3, nh_);
        if (n != 8171) {
            a423((byte)32);
        }
        qj_.a423();
        wd_._d = sp_._e;
        ol_._i = sp_._e;
    }
    
    //hp_.raiders[raiderId] = new Raider(raiderId, unknown1, cost, renown, unknown2, attack, defence, dodge, sneak, abilities);
    //original signature: Raider(final int w, final int z, final int b, final int c, final int x, final int m, final int r, final int b2, final int o, final int[] array) {
    Raider(final int raiderId, final int unknown1, final int cost, final int renown, final int unknown2, final int attack, final int defence, final int dodge,
    		final int sneak, final int[] abilities) {
        this.cost = cost;
        this.attack = attack;
        this.dodge = dodge;
        this.raiderId = raiderId;
        this.unknown1 = unknown1;
        this.unknown2 = unknown2;
        this.sneak = sneak;
        this.renown = renown;
        this.defence = defence;
        this.activeAbility = -1;
        int passiveAbilityCount = 0;
        for (int i = 0; i < abilities.length; ++i) {
            final int s = abilities[i];
            if (0 == ob_._cc[s]) {
                ++passiveAbilityCount;
            }
            else {
                if (this.activeAbility != -1) {
                    throw new RuntimeException("Multiple active abilities declared for: " + this.raiderId);
                }
                this.activeAbility = s;
            }
        }
        this.passiveAbilities = new int[passiveAbilityCount];
        int n2 = 0;
        for (int n3 = 0; abilities.length > n3; ++n3) {
            final int n4 = abilities[n3];
            if (0 == ob_._cc[n4]) {
                this.passiveAbilities[n2++] = n4;
            }
        }
    }
    
    static {
        Raider.tutorial_raiders4 = new String[] { "Moving", "To move through the dungeon, simply <col=FF0000>left-click on an unexplored room</col>. Rooms are connected by doors. Rooms that are accessible from the party's current location are <%highlight>outlined with an orange glow</col>.<br><br><%command>Enter a new room now.</col>" };
        Raider.text_monster_wins = "Monster wins!";
        Raider.desc_cave_troll = "Trolls are found throughout the swamps, making their homes in dank caves. Slow and lumbering, they are nevertheless devastating in combat and nearly impossible to kill.";
        Raider._h = new ae_(1);
    }
}
