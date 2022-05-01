abstract class vf_ extends ll_
{
    boolean _B;
    //original name: _y
    static String watchintroduction;
    //original name: _A
    static String[] tutorial_dragonsofrenown1;
    static int _w;
    volatile boolean _v;
    boolean _z;
    
    abstract byte[] b318(final boolean p0);
    
    static final int[] a867(final int n, final int n2) {
        final int a353 = oj_.a353(n2);
        final int a354 = jg_.a080(8191, n2);
        final int a355 = oj_.a353(n);
        final int a356 = jg_.a080(8191, n);
        return new int[] { 0, 0, 0, a356, 0, a355, (int)(a353 * (long)a355 >> 16), a354, -(int)(a356 * (long)a353 >> 16), -(int)(a355 * (long)a354 >> 16), a353, (int)(a354 * (long)a356 >> 16) };
    }
    
    //original signature: static final void c423() {
    static final void unpackAnimations() {
        if (null == kf_._p) {
            return;
        }
        ib_.unpackAnimations("goblin_club", 1);
        ib_.unpackAnimations("saurus_spawn", 2);
        ib_.unpackAnimations("goblin_cleaver", 3);
        ib_.unpackAnimations("orc_warrior", 4);
        ib_.unpackAnimations("witch", 5);
        ib_.unpackAnimations("beastman", 6);
        ib_.unpackAnimations("saurus_slink", 7);
        ib_.unpackAnimations("mercenary", 8);
        ib_.unpackAnimations("priest", 9);
        ib_.unpackAnimations("orc_blademaster", 10);
        ib_.unpackAnimations("goblin_scout", 11);
        ib_.unpackAnimations("necromancer", 12);
        ib_.unpackAnimations("ogre", 13);
        ib_.unpackAnimations("enchantress", 14);
        ib_.unpackAnimations("saurus_warrior", 15);
        ib_.unpackAnimations("orc_shaman", 16);
        ib_.unpackAnimations("troll", 17);
        ib_.unpackAnimations("northman", 18);
        ib_.unpackAnimations("dwarf_renegade", 19);
        ib_.unpackAnimations("thief", 20);
        ib_.unpackAnimations("zealot", 21);
        ib_.unpackAnimations("darkelf", 22);
        ib_.unpackAnimations("baerserker", 23);
        ib_.unpackAnimations("ogre", 24);
        ib_.unpackAnimations("spy", 25);
        ib_.unpackAnimations("blackknight", 27);
        ib_.unpackAnimations("minotaur", 28);
        ib_.unpackAnimations("necromancer", 29);
        ib_.unpackAnimations("blackknight", 30);
        ib_.unpackAnimations("chaos_champion", 31);
        ib_.unpackAnimations("demonette", 33);
        ib_.unpackAnimations("dryad", 34);
        o_.unpackAnimations("giantrats", 15);
        o_.unpackAnimations("rotworms", 16);
        o_.unpackAnimations("troglodytes", 17);
        o_.unpackAnimations("giantsnake", 18);
        o_.unpackAnimations("giantspider", 19);
        o_.unpackAnimations("skeleton", 20);
        ic_.unpackAnimations(21, "corrosive_slime");
        o_.unpackAnimations("razor_construct", 22);
        o_.unpackAnimations("vampirebats", 24);
        o_.unpackAnimations("imp", 25);
        o_.unpackAnimations("stone_golem", 26);
        o_.unpackAnimations("spectre", 27);
        o_.unpackAnimations("banshee", 28);
        o_.unpackAnimations("hellbeast", 29);
        o_.unpackAnimations("pitdemon", 31);
        o_.unpackAnimations("vampirelord", 32);
        o_.unpackAnimations("hellbeast", 33);
        o_.unpackAnimations("demonlord", 34);
        ic_.unpackAnimations(0, "empty_room");
        ic_.unpackAnimations(3, "empty_room");
        ic_.unpackAnimations(2, "empty_room");
        ic_.unpackAnimations(4, "bottomless_pit");
        ic_.unpackAnimations(5, "snakes");
        ic_.unpackAnimations(6, "nails");
        ic_.unpackAnimations(7, "hidden_pit");
        ic_.unpackAnimations(8, "teleport");
        ic_.unpackAnimations(9, "hidden_nails");
        ic_.unpackAnimations(10, "bottomless_pit");
        ic_.unpackAnimations(11, "crusher");
        ic_.unpackAnimations(12, "crossbow");
        ic_.unpackAnimations(14, "poison_gas");
        ic_.unpackAnimations(13, "whirling_blades");
        ic_.unpackAnimations(35, "tripwire_bell");
        ic_.unpackAnimations(36, "glass");
        k_._c = tp_.unpackAnimation(kf_._p, "laugh", "skull");
        hf_._ib = tp_.unpackAnimation(kf_._p, "tumble", "dice");
        
        RegisterScreen.idleDragonAnimations = new Animation[4];
        for (int i = 0; i < 4; ++i) {
            RegisterScreen.idleDragonAnimations[i] = tp_.unpackAnimation(kf_._p, "idle" + (1 + i), "dragon");
        }
        bo_.dragonEyeOpen = tp_.unpackAnimation(kf_._p, "eye_open", "dragon");
        ce_.dragonVictory = tp_.unpackAnimation(kf_._p, "victory", "dragon");
        kf_.dragonDefeat = tp_.unpackAnimation(kf_._p, "defeat", "dragon");
    }
    
    abstract int d410(final byte p0);
    
    public static void d150() {
        vf_.watchintroduction = null;
        vf_.tutorial_dragonsofrenown1 = null;
    }
    
    vf_() {
        this._v = true;
    }
    
    static {
        vf_.tutorial_dragonsofrenown1 = new String[] { "Dragons of Renown", "<%highlight>You're now approaching the end of the Dungeon Assault tutorial</col>. Having taken and fortified your dungeon, and recruited a party of raiders, you can now send them forth on your first real raid." };
        vf_.watchintroduction = "Watch Introduction";
    }
}
