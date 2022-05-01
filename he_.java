final class he_ extends ip_
{
	//original name: _r
    static String desc_dark_elf_assassin;
    static boolean _s;
    static int _p;
    //original name: _q
    static String create_welcome;
    //original name: _n
    static String unpacking_animations;
    static String _m;
    
    //original signature: static final void e150(final int n) {
    static final void e150() {
        if (ll_.menuOptions != null) {
            return;
        }
        (ll_.menuOptions = new String[29])[0] = o_.singleplayergame.toUpperCase();
        ll_.menuOptions[1] = t_.text_initiate_raid.toUpperCase();
        ll_.menuOptions[2] = me_.returntogame.toUpperCase();
        ll_.menuOptions[3] = t_.text_initiate_raid.toUpperCase();
        ll_.menuOptions[4] = sj_.text_my_profile.toUpperCase();
        ll_.menuOptions[5] = uc_.text_construction.toUpperCase();
        ll_.menuOptions[6] = rl_.text_stable.toUpperCase();
        ll_.menuOptions[7] = ue_.instructions.toUpperCase();
        ll_.menuOptions[8] = kd_.fullscreen.toUpperCase();
        ll_.menuOptions[9] = wo_.menu.toUpperCase();
        ll_.menuOptions[10] = null;
        ll_.menuOptions[11] = vd_.endgame.toUpperCase();
        ll_.menuOptions[12] = cd_.quit.toUpperCase();
        ll_.menuOptions[13] = pd_.sound_colon.toUpperCase();
        ll_.menuOptions[14] = ja_.music_colon.toUpperCase();
        ll_.menuOptions[15] = ef_.achievements.toUpperCase();
        ll_.menuOptions[16] = uo_.login.toUpperCase();
        ll_.menuOptions[17] = jg_.discard.toUpperCase();
        ll_.menuOptions[18] = PlayerInformation.previous.toUpperCase();
        ll_.menuOptions[19] = bl_.next.toUpperCase();
        ll_.menuOptions[20] = ub_.playtutorial.toUpperCase();
        ll_.menuOptions[21] = vf_.watchintroduction.toUpperCase();
        ll_.menuOptions[22] = ag_.text_orbs_of_mastery.toUpperCase();
        ll_.menuOptions[23] = uj_.text_renown_and_raids.toUpperCase();
        ll_.menuOptions[24] = id_.text_inst_monster.toUpperCase();
        ll_.menuOptions[26] = og_.text_inst_guardian.toUpperCase();
        ll_.menuOptions[25] = an_.text_inst_trap.toUpperCase();
        ll_.menuOptions[27] = hk_.close.toUpperCase();
        
        final String[][] abilityTexts = new String[28][];
        abilityTexts[0] = bo_.ability_boostdef;
        abilityTexts[1] = ao_.ability_pitimmunity;
        abilityTexts[2] = hh_.ability_revive;
        abilityTexts[3] = up_.ability_retreat;
        abilityTexts[4] = jm_.ability_summon;
        abilityTexts[8] = ll_.ability_ferocity;
        abilityTexts[10] = qj_.ability_thief;
        abilityTexts[11] = an_.ability_firststrike;
        abilityTexts[12] = ob_.ability_fragility;
        abilityTexts[13] = sp_.ability_spy;
        abilityTexts[14] = np_.ability_armoured;
        abilityTexts[15] = li_.ability_scout;
        abilityTexts[17] = vb_.ability_immortal;
        abilityTexts[18] = ob_.ability_chaos_champion;
        abilityTexts[19] = oa_.ability_boostsneak;
        abilityTexts[20] = vc_.ability_tough;
        abilityTexts[21] = lg_.ability_sacrifice_green;
        abilityTexts[22] = ja_.ability_circumvent;
        abilityTexts[24] = hj_.ability_glamour;
        abilityTexts[25] = rf_.ability_intimidate;
        abilityTexts[26] = CacheIndex.ability_fireimmunity;
        abilityTexts[27] = pm_.ability_fickle;
        abilityTexts[16] = j_.ability_redistribute;
        
        final String[][] briefAbilityTexts = new String[28][];
        briefAbilityTexts[0] = ha_.ability_boostdef_brief;
        briefAbilityTexts[1] = ne_.ability_pitimmunity_brief;
        briefAbilityTexts[2] = rp_.ability_revive_brief;
        briefAbilityTexts[3] = bj_.ability_retreat_brief;
        briefAbilityTexts[4] = hk_.ability_thief_brief;
        briefAbilityTexts[8] = mi_.ability_ferocity_brief;
        briefAbilityTexts[10] = al_.ability_thief_brief;
        briefAbilityTexts[11] = dm_.ability_firststrike_brief;
        briefAbilityTexts[12] = to_.ability_fragility_brief;
        briefAbilityTexts[13] = fe_.ability_spy_brief;
        briefAbilityTexts[14] = rj_.ability_armoured_brief;
        briefAbilityTexts[15] = gi_.ability_scout_brief;
        briefAbilityTexts[17] = jf_.ability_immortal_brief;
        briefAbilityTexts[18] = bh_.ability_chaos_champion_brief;
        briefAbilityTexts[19] = rp_.ability_boostsneak_brief;
        briefAbilityTexts[20] = rk_.ability_tough_brief;
        briefAbilityTexts[21] = bb_.ability_sacrifice_green_brief;
        briefAbilityTexts[22] = um_.ability_circumvent_brief;
        briefAbilityTexts[24] = gl_.ability_glamour_brief;
        briefAbilityTexts[25] = uf_.ability_intimidate_brief;
        briefAbilityTexts[26] = dn_.ability_fireimmunity_brief;
        briefAbilityTexts[27] = ua_.ability_fickle_brief;
        briefAbilityTexts[16] = wf_.ability_redistribute_brief;
        
        final Raider[] raiders = hp_.raiders;
        for (int n2 = 0; raiders.length > n2; ++n2) {
            final Raider raider = raiders[n2];
            if (null != raider) {
                if (raider.activeAbility != -1) {
                    raider.abilityTexts = abilityTexts[raider.activeAbility];
                    raider.briefAbilityTexts = briefAbilityTexts[raider.activeAbility];
                }
                final int i = raider.passiveAbilities.length;
                raider.briefPassiveAbilityTexts = new String[i][];
                raider.passiveAbilityTexts = new String[i][];
                for (int n3 = 0; i > n3; ++n3) {
                    raider.passiveAbilityTexts[n3] = abilityTexts[raider.passiveAbilities[n3]];
                    raider.briefPassiveAbilityTexts[n3] = briefAbilityTexts[raider.passiveAbilities[n3]];
                }
            }
        }
        final String a = d_.goblin_runt;
        final String lb = nm_.desc_goblin_runt;
        if (null != hp_.raiders[1]) {
            hp_.raiders[1].name = a;
            hp_.raiders[1].description = lb;
        }
        final String j = ng_.saurus_spawn;
        final String p = a_.desc_saurus_spawn;
        if (null != hp_.raiders[2]) {
            hp_.raiders[2].description = p;
            hp_.raiders[2].name = j;
        }
        final String l = ub_.goblin_cleaver;
        final String m = mm_.desc_goblin_cleaver;
        if (hp_.raiders[3] != null) {
            hp_.raiders[3].name = l;
            hp_.raiders[3].description = m;
        }
        final String a2 = gj_.orc_warrior;
        final String d = fm_.desc_orc_warrior;
        if (null != hp_.raiders[4]) {
            hp_.raiders[4].description = d;
            hp_.raiders[4].name = a2;
        }
        final String c = ml_.witch;
        final String c2 = fj_.desc_witch;
        if (null != hp_.raiders[5]) {
            hp_.raiders[5].name = c;
            hp_.raiders[5].description = c2;
        }
        final String k = DungeonAssault.beastman;
        final String j2 = gh_.desc_beastman;
        if (hp_.raiders[6] != null) {
            hp_.raiders[6].description = j2;
            hp_.raiders[6].name = k;
        }
        final String b2 = fb_.saurus_slink;
        final String t = in_.desc_saurus_slink;
        if (null != hp_.raiders[7]) {
            hp_.raiders[7].name = b2;
            hp_.raiders[7].description = t;
        }
        final String b3 = jl_.mercenary_knight;
        final String ab = hj_.desc_mercenary_knight;
        if (null != hp_.raiders[8]) {
            hp_.raiders[8].description = ab;
            hp_.raiders[8].name = b3;
        }
        final String cb = jk_.priest;
        final String h = fc_.desc_priest;
        if (hp_.raiders[9] != null) {
            hp_.raiders[9].description = h;
            hp_.raiders[9].name = cb;
        }
        final String h2 = dc_.orc_blademaster;
        final String h3 = tb_.desc_orc_blademaster;
        if (hp_.raiders[10] != null) {
            hp_.raiders[10].name = h2;
            hp_.raiders[10].description = h3;
        }
        final String w = dn_.goblin_scout;
        final String q = uc_.desc_goblin_scout;
        if (hp_.raiders[11] != null) {
            hp_.raiders[11].description = q;
            hp_.raiders[11].name = w;
        }
        final String g = df_.necromancer;
        final String r = lg_.desc_necromancer;
        if (hp_.raiders[12] != null) {
            hp_.raiders[12].description = r;
            hp_.raiders[12].name = g;
        }
        final String v = lf_.ogre_thug;
        final String a3 = ba_.desc_ogre_thug;
        if (null != hp_.raiders[13]) {
            hp_.raiders[13].name = v;
            hp_.raiders[13].description = a3;
        }
        final String jb = ok_.enchantress;
        final String l2 = a_.desc_enchantress;
        if (hp_.raiders[14] != null) {
            hp_.raiders[14].description = l2;
            hp_.raiders[14].name = jb;
        }
        final String i2 = sd_.saurus_warrior;
        final String f = df_.desc_saurus_warrior;
        if (null != hp_.raiders[15]) {
            hp_.raiders[15].name = i2;
            hp_.raiders[15].description = f;
        }
        final String d2 = ik_.orc_shaman;
        final String c3 = ik_.desc_orc_shaman;
        if (hp_.raiders[16] != null) {
            hp_.raiders[16].description = c3;
            hp_.raiders[16].name = d2;
        }
        final String d3 = ua_.cave_troll;
        final String n4 = Raider.desc_cave_troll;
        if (null != hp_.raiders[17]) {
            hp_.raiders[17].name = d3;
            hp_.raiders[17].description = n4;
        }
        final String i3 = oa_.northman_ranger;
        final String p2 = oe_.desc_northman_ranger;
        if (hp_.raiders[18] != null) {
            hp_.raiders[18].description = p2;
            hp_.raiders[18].name = i3;
        }
        final String c4 = ae_.dwarf_renegade;
        final String h4 = ta_.desc_dwarf_renegade;
        if (null != hp_.raiders[19]) {
            hp_.raiders[19].name = c4;
            hp_.raiders[19].description = h4;
        }
        final String l3 = o_.thief;
        final String k2 = Room.desc_thief;
        if (null != hp_.raiders[20]) {
            hp_.raiders[20].name = l3;
            hp_.raiders[20].description = k2;
        }
        final String mb = bo_.zealot;
        final String q2 = WarningMessage.desc_zealot;
        if (hp_.raiders[21] != null) {
            hp_.raiders[21].name = mb;
            hp_.raiders[21].description = q2;
        }
        final String b4 = op_.dark_elf_assassin;
        final String r2 = he_.desc_dark_elf_assassin;
        if (hp_.raiders[22] != null) {
            hp_.raiders[22].name = b4;
            hp_.raiders[22].description = r2;
        }
        final String p3 = lf_.berserker;
        final String b5 = gh_.desc_berserker;
        if (null != hp_.raiders[23]) {
            hp_.raiders[23].description = b5;
            hp_.raiders[23].name = p3;
        }
        final String f2 = sp_.ogre_brute;
        final String a4 = dk_.desc_ogre_brute;
        if (null != hp_.raiders[24]) {
            hp_.raiders[24].description = a4;
            hp_.raiders[24].name = f2;
        }
        final String d4 = hp_.spy;
        final String g2 = hc_.desc_spy;
        if (hp_.raiders[25] != null) {
            hp_.raiders[25].description = g2;
            hp_.raiders[25].name = d4;
        }
        final String g3 = mp_.shapeshifter;
        final String m2 = eb_.desc_shapeshifter;
        if (hp_.raiders[26] != null) {
            hp_.raiders[26].name = g3;
            hp_.raiders[26].description = m2;
        }
        final String m3 = ro_.black_knight;
        final String l4 = ql_.desc_black_knight;
        if (hp_.raiders[27] != null) {
            hp_.raiders[27].description = l4;
            hp_.raiders[27].name = m3;
        }
        final String c5 = uf_.minotaur;
        final String g4 = jm_.desc_minotaur;
        if (null != hp_.raiders[28]) {
            hp_.raiders[28].name = c5;
            hp_.raiders[28].description = g4;
        }
        final String i4 = kf_.warlock;
        final String c6 = qi_.desc_warlock;
        if (hp_.raiders[29] != null) {
            hp_.raiders[29].description = c6;
            hp_.raiders[29].name = i4;
        }
        final String k3 = Tooltip.death_knight;
        final String i5 = kj_.desc_death_knight;
        if (hp_.raiders[30] != null) {
            hp_.raiders[30].description = i5;
            hp_.raiders[30].name = k3;
        }
        final String v2 = ih_.chaos_champion;
        final String b6 = no_.desc_chaos_champion;
        if (null != hp_.raiders[31]) {
            hp_.raiders[31].name = v2;
            hp_.raiders[31].description = b6;
        }
        final String e = gh_.centaur;
        final String e2 = oo_.desc_centaur;
        if (null != hp_.raiders[32]) {
            hp_.raiders[32].description = e2;
            hp_.raiders[32].name = e;
        }
        final String f3 = sg_.daemonette;
        final String b7 = vk_.desc_daemonette;
        if (null != hp_.raiders[33]) {
            hp_.raiders[33].description = b7;
            hp_.raiders[33].name = f3;
        }
        final String r3 = lm_.dryad;
        final String n5 = jd_.desc_dryad;
        if (hp_.raiders[34] != null) {
            hp_.raiders[34].name = r3;
            hp_.raiders[34].description = n5;
        }
        final String a5 = ic_.none;
        final String a6 = nh_.desc_none;
        final String o = null;
        if (gh_.traps[0] != null) {
            gh_.traps[0].tip = o;
            gh_.traps[0].name = a5;
            gh_.traps[0].description = a6;
        }
        final String n6 = ie_.unknown;
        final String c7 = s_.desc_unknown;
        final String o2 = null;
        if (null != gh_.traps[1]) {
            gh_.traps[1].name = n6;
            gh_.traps[1].description = c7;
            gh_.traps[1].tip = o2;
        }
        final String s = cm_.hoard;
        final String t2 = null;
        final String o3 = null;
        if (null != gh_.traps[2]) {
            gh_.traps[2].tip = o3;
            gh_.traps[2].name = s;
            gh_.traps[2].description = t2;
        }
        final String mb2 = wi_.entrance;
        final String t3 = null;
        final String o4 = null;
        if (null != gh_.traps[3]) {
            gh_.traps[3].tip = o4;
            gh_.traps[3].description = t3;
            gh_.traps[3].name = mb2;
        }
        final String f4 = go_.pit;
        final String e3 = um_.desc_pit;
        final String o5 = null;
        if (gh_.traps[4] != null) {
            gh_.traps[4].tip = o5;
            gh_.traps[4].name = f4;
            gh_.traps[4].description = e3;
        }
        final String m4 = ce_.snakes;
        final String b8 = fj_.desc_snakes;
        final String o6 = null;
        if (null != gh_.traps[5]) {
            gh_.traps[5].name = m4;
            gh_.traps[5].tip = o6;
            gh_.traps[5].description = b8;
        }
        final String w2 = i_.nails;
        final String j3 = fn_.desc_nails;
        final String e4 = gm_.tip_nails;
        if (gh_.traps[6] != null) {
            gh_.traps[6].description = j3;
            gh_.traps[6].name = w2;
            gh_.traps[6].tip = e4;
        }
        final String q3 = oh_.hidden_pit;
        final String l5 = bh_.desc_hidden_pit;
        final String o7 = null;
        if (null != gh_.traps[7]) {
            gh_.traps[7].description = l5;
            gh_.traps[7].name = q3;
            gh_.traps[7].tip = o7;
        }
        final String h5 = ld_.teleport;
        final String f5 = to_.desc_teleport;
        final String a7 = ek_.tip_teleport;
        if (null != gh_.traps[8]) {
            gh_.traps[8].description = f5;
            gh_.traps[8].tip = a7;
            gh_.traps[8].name = h5;
        }
        final String mb3 = nm_.hidden_nails;
        final String j4 = hl_.desc_hidden_nails;
        final String c8 = dl_.tip_hidden_nails;
        if (gh_.traps[9] != null) {
            gh_.traps[9].description = j4;
            gh_.traps[9].name = mb3;
            gh_.traps[9].tip = c8;
        }
        final String z = dd_.bottomless_pit;
        final String k4 = fa_.desc_bottomless_pit;
        final String w3 = nf_.tip_bottomless_pit;
        if (gh_.traps[10] != null) {
            gh_.traps[10].name = z;
            gh_.traps[10].description = k4;
            gh_.traps[10].tip = w3;
        }
        final String u = ll_.crusher;
        final String b9 = dm_.desc_crusher;
        final String o8 = null;
        if (gh_.traps[11] != null) {
            gh_.traps[11].name = u;
            gh_.traps[11].tip = o8;
            gh_.traps[11].description = b9;
        }
        final String a8 = sm_.hidden_darts;
        final String i6 = Tooltip.desc_hidden_darts;
        final String e5 = fb_.tip_hidden_darts;
        if (null != gh_.traps[12]) {
            gh_.traps[12].name = a8;
            gh_.traps[12].description = i6;
            gh_.traps[12].tip = e5;
        }
        final String o9 = fg_.whirling_blades;
        final String c9 = nb_.desc_whirling_blades;
        final String e6 = ho_.tip_whirling_blades;
        if (null != gh_.traps[13]) {
            gh_.traps[13].tip = e6;
            gh_.traps[13].name = o9;
            gh_.traps[13].description = c9;
        }
        final String b10 = ea_.poison_gas;
        final String p4 = cp_.desc_poison_gas;
        final String o10 = null;
        if (null != gh_.traps[14]) {
            gh_.traps[14].tip = o10;
            gh_.traps[14].description = p4;
            gh_.traps[14].name = b10;
        }
        final String o11 = cp_.giant_rats;
        final String b11 = il_.desc_giant_rats;
        final String o12 = null;
        if (null != gh_.traps[15]) {
            gh_.traps[15].name = o11;
            gh_.traps[15].description = b11;
            gh_.traps[15].tip = o12;
        }
        final String c10 = cb_.rot_worms;
        final String a9 = ul_.desc_rot_worms;
        final String a10 = vc_.tip_rot_worms;
        if (gh_.traps[16] != null) {
            gh_.traps[16].tip = a10;
            gh_.traps[16].name = c10;
            gh_.traps[16].description = a9;
        }
        final String ub = jb_.troglodytes;
        final String f6 = rn_.desc_troglodytes;
        final String o13 = null;
        if (null != gh_.traps[17]) {
            gh_.traps[17].description = f6;
            gh_.traps[17].name = ub;
            gh_.traps[17].tip = o13;
        }
        final String rb = wi_.giant_snake;
        final String a11 = ke_.desc_giant_snake;
        final String o14 = null;
        if (gh_.traps[18] != null) {
            gh_.traps[18].description = a11;
            gh_.traps[18].name = rb;
            gh_.traps[18].tip = o14;
        }
        final String g5 = pd_.giant_spider;
        final String d5 = li_.desc_giant_spider;
        final String o15 = null;
        if (gh_.traps[19] != null) {
            gh_.traps[19].name = g5;
            gh_.traps[19].tip = o15;
            gh_.traps[19].description = d5;
        }
        final String p5 = hg_.skeleton_sentinels;
        final String y = tn_.desc_skeleton_sentinels;
        final String x = PlayerInformation.tip_skeleton_sentinels;
        if (null != gh_.traps[20]) {
            gh_.traps[20].description = y;
            gh_.traps[20].name = p5;
            gh_.traps[20].tip = x;
        }
        final String p6 = gi_.corrosive_slime;
        final String c11 = bc_.desc_corrosive_slime;
        final String l6 = fm_.tip_corrosive_slime;
        if (null != gh_.traps[21]) {
            gh_.traps[21].name = p6;
            gh_.traps[21].description = c11;
            gh_.traps[21].tip = l6;
        }
        final String a12 = jj_.razor_construct;
        final String d6 = qh_.desc_razor_construct;
        final String m5 = ub_.tip_razor_construct;
        if (null != gh_.traps[22]) {
            gh_.traps[22].name = a12;
            gh_.traps[22].tip = m5;
            gh_.traps[22].description = d6;
        }
        final String kb = g_.rabid_wolf;
        final String e7 = f_.desc_rabid_wolf;
        final String e8 = lg_.tip_rabid_wolf;
        if (null != gh_.traps[23]) {
            gh_.traps[23].description = e7;
            gh_.traps[23].name = kb;
            gh_.traps[23].tip = e8;
        }
        final String i7 = sf_.vampire_bats;
        final String r4 = ed_.desc_vampire_bats;
        final String b12 = df_.tip_vampire_bats;
        if (gh_.traps[24] != null) {
            gh_.traps[24].tip = b12;
            gh_.traps[24].name = i7;
            gh_.traps[24].description = r4;
        }
        final String vb = jb_.imp;
        final String n7 = ti_.desc_imp;
        final String o16 = null;
        if (null != gh_.traps[25]) {
            gh_.traps[25].name = vb;
            gh_.traps[25].tip = o16;
            gh_.traps[25].description = n7;
        }
        final String v3 = wf_.stone_golem;
        final String lb2 = wi_.desc_stone_golem;
        final String w4 = ko_.tip_stone_golem;
        if (gh_.traps[26] != null) {
            gh_.traps[26].name = v3;
            gh_.traps[26].description = lb2;
            gh_.traps[26].tip = w4;
        }
        final String s2 = ih_.spectre;
        final String e9 = om_.desc_spectre;
        final String p7 = qm_.tip_spectre;
        if (gh_.traps[27] != null) {
            gh_.traps[27].tip = p7;
            gh_.traps[27].name = s2;
            gh_.traps[27].description = e9;
        }
        final String a13 = cc_.banshee;
        final String c12 = mj_.desc_banshee;
        final String l7 = eb_.tip_banshee;
        if (gh_.traps[28] != null) {
            gh_.traps[28].description = c12;
            gh_.traps[28].name = a13;
            gh_.traps[28].tip = l7;
        }
        final String h6 = RaidMember.raging_beast;
        final String k5 = pe_.desc_raging_beast;
        final String o17 = null;
        if (gh_.traps[29] != null) {
            gh_.traps[29].tip = o17;
            gh_.traps[29].name = h6;
            gh_.traps[29].description = k5;
        }
        final String q4 = ec_.basilisk;
        final String d7 = jm_.desc_basilisk;
        final String o18 = null;
        if (gh_.traps[30] != null) {
            gh_.traps[30].description = d7;
            gh_.traps[30].name = q4;
            gh_.traps[30].tip = o18;
        }
        final String i8 = kk_.pit_demon;
        final String eb = sj_.desc_pit_demon;
        final String o19 = null;
        if (gh_.traps[31] != null) {
            gh_.traps[31].tip = o19;
            gh_.traps[31].name = i8;
            gh_.traps[31].description = eb;
        }
        final String a14 = ea_.vampire_lord;
        final String x2 = an_.desc_vampire_lord;
        final String b13 = Room.tip_vampire_lord;
        if (null != gh_.traps[32]) {
            gh_.traps[32].description = x2;
            gh_.traps[32].tip = b13;
            gh_.traps[32].name = a14;
        }
        final String q5 = kf_.hell_beast;
        final String b14 = sm_.desc_hell_beast;
        final String o20 = null;
        if (null != gh_.traps[33]) {
            gh_.traps[33].description = b14;
            gh_.traps[33].tip = o20;
            gh_.traps[33].name = q5;
        }
        final String b15 = gj_.demon_lord;
        final String f7 = fg_.desc_demon_lord;
        final String b16 = tk_.tip_demon_lord;
        if (null != gh_.traps[34]) {
            gh_.traps[34].tip = b16;
            gh_.traps[34].name = b15;
            gh_.traps[34].description = f7;
        }
        final String b17 = mi_.tripwire_bell;
        final String nb = jb_.desc_tripwire_bell;
        final String d8 = hl_.tip_tripwire_bell;
        if (null != gh_.traps[35]) {
            gh_.traps[35].description = nb;
            gh_.traps[35].tip = d8;
            gh_.traps[35].name = b17;
        }
        final String d9 = nj_.hall_of_glass;
        final String a15 = tg_.desc_hall_of_glass;
        final String g6 = eg_.tip_hall_of_glass;
        if (gh_.traps[36] != null) {
            gh_.traps[36].tip = g6;
            gh_.traps[36].name = d9;
            gh_.traps[36].description = a15;
        }
        final String s3 = ll_.magical_guardian_room;
        final String z2 = ic_.desc_magical_guardian_room;
        final String j5 = ii_.tip_magical_guardian_room;
        if (null != gh_.traps[37]) {
            gh_.traps[37].name = s3;
            gh_.traps[37].description = z2;
            gh_.traps[37].tip = j5;
        }
        li_.orbNames[3] = tg_.orb_war;
        li_.orbNames[0] = ek_.orb_preservation;
        li_.orbNames[2] = df_.orb_brilliance;
        li_.orbNames[1] = tp_.orb_majesty;
        
        un_.orbDescriptions[1] = lj_.orb_majesty_desc;
        un_.orbDescriptions[0] = da_.orb_preservation_desc;
        un_.orbDescriptions[3] = bj_.orb_war_desc;
        un_.orbDescriptions[2] = an_.orb_brilliance_desc;
        
        cc_.titles = new String[254];
        for (int n8 = 0; n8 < dc_._p.length; ++n8) {
            cc_.titles[n8] = od_.titles_age_male[n8];
            cc_.titles[n8 + 128] = ek_.titles_age_female[n8];
        }
        for (int n9 = 0; RaidMember._m.length > n9; ++n9) {
            cc_.titles[n9 + 16] = j_.titles_mastery_male[n9];
            cc_.titles[n9 + 144] = IsaacCipher.titles_mastery_female[n9];
        }
        for (int n10 = 0; n10 < ci_._s.length; ++n10) {
            cc_.titles[n10 + 32] = hd_.titles_aggression_male[n10];
            cc_.titles[n10 + 160] = ki_.titles_aggression_female[n10];
        }
        for (int n11 = 0; n11 < bl_._n.length; ++n11) {
            cc_.titles[n11 + 48] = nj_.titles_achievements_male[n11];
            cc_.titles[n11 + 176] = lh_.titles_achievements_female[n11];
        }
        for (int n12 = 0; n12 < id_._j.length; ++n12) {
            cc_.titles[n12 + 64] = DungeonPath.titles_external_male[n12];
            cc_.titles[n12 + 192] = DungeonPath.titles_external_female[n12];
        }
        (GUIButton._H = new fm_()).a018("<col=FF0000>" + qk_.text_attack + "</col>", -111, "attack");
        GUIButton._H.a018("<col=0A7500>" + dj_.text_defence + "</col>", 103, "defence");
        GUIButton._H.a018("<col=21634A>" + pm_.text_dodge + "</col>", -114, "dodge");
        GUIButton._H.a018("<col=00A7D2>" + nf_.text_sneak + "</col>", 59, "sneak");
        GUIButton._H.a018("<col=9F70CF>" + rk_.text_snare + "</col>", 93, "snare");
        GUIButton._H.a018("<col=7B633A>" + eg_.text_detect + "</col>", 116, "detect");
        GUIButton._H.a018(lh_.text_charge_coloured, -114, "charge");
        GUIButton._H.a018(dn_.text_advance_coloured, -96, "advance");
        GUIButton._H.a018(qa_.text_flee_coloured, 66, "flee");
        GUIButton._H.a018(vo_.text_useskill, 69, "useskill");
        GUIButton._H.a018("<img=1>", 104, "command");
        GUIButton._H.a018("<col=FF0000>", -117, "highlight");
        GUIButton._H.a018(b_.a772(gg_.text_raider, -1), -121, "raider");
        GUIButton._H.a018(b_.a772(af_.text_monster, -1), -107, "monster");
        GUIButton._H.a018(b_.a772(DungeonAssault.text_trap, -1), 74, "trap");
        GUIButton._H.a018(b_.a772(ki_.text_guardian, -1), -106, "guardian");
        GUIButton._H.a018(b_.a772(ak_.text_raiders, -1), 73, "raiders");
        GUIButton._H.a018(b_.a772(wo_.text_monsters, -1), 102, "monsters");
        GUIButton._H.a018(b_.a772(dh_.text_traps, -1), 98, "traps");
        GUIButton._H.a018(b_.a772(DungeonPath.text_guardians, -1), -115, "guardians");
        GUIButton._H.a018("<col=8B1717>", -103, "col_charge");
        GUIButton._H.a018("<col=2E5D17>", -106, "col_advance");
        GUIButton._H.a018("<col=8B8B2E>", -101, "col_flee");
        GUIButton._H.a018("<col=178B8B>", -113, "col_useskill");
        GUIButton._H.a018("<col=FF0000>", 93, "col_attack");
        GUIButton._H.a018("<col=0A7500>", 87, "col_defence");
        GUIButton._H.a018("<col=21634A>", -126, "col_dodge");
        GUIButton._H.a018("<col=00A7D2>", -117, "col_sneak");
        GUIButton._H.a018("<col=9F70CF>", 72, "col_snare");
        GUIButton._H.a018("<col=7B633A>", -122, "col_detect");
    }
    
    public static void d423() {
        he_.unpacking_animations = null;
        he_.create_welcome = null;
        he_.desc_dark_elf_assassin = null;
        he_._m = null;
    }
    
    //original signature: static final void a295(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final Graphic[] array, final int n8, final int n9, final Graphic[] array2, final se_ se_, final se_ se_2, final int n10, final boolean b) {
    static final void a295(final boolean b) {
        lp_.a314();
        ic_.a540(b);
    }
    
    @Override
    final od_ a212(final String s, final int n) {
        if (!sj_.a454(s)) {
            return pd_._J;
        }
        final int a034 = mm_.a978(s, true, 10);
        if (0 < a034 && a034 <= 130) {
            return c_._d;
        }
        return pd_._J;
    }
    
    he_(final rm_ rm_) {
        super(rm_);
    }
    
    @Override
    final String a439(final byte b, final String s) {
        if (this.a212(s, 86) == pd_._J) {
            return sm_.create_alert_invalidage;
        }
        return null;
    }
    
    static final void e423() {
        if (null != jb_._Qb && jb_._Qb.a154() && jb_._Qb.a213(false, "benefits") && null != hf_._pb && hf_._pb.a154()) {
            if (hf_._pb.a213(false, "benefits")) {
                ia_.benefits_headline = oh_.a825(jb_._Qb, "benefits", "headline");
                gn_.benefits_blurbpane = oh_.a825(jb_._Qb, "benefits", "blurbpane");
                tl_.benefits_button = oh_.a825(jb_._Qb, "benefits", "button");
                ep_.benefits_signup_text = oh_.a825(jb_._Qb, "benefits", "signup_text");
                lg_.benefits_menu_text = oh_.a825(jb_._Qb, "benefits", "menu_text");
                nl_.benefits_button_frame = oh_.a825(jb_._Qb, "benefits", "button_frame");
                ql_.benefits_arrow = oh_.a825(jb_._Qb, "benefits", "arrow");
                dc_.benefits_large_font = ah_.a770(hf_._pb, 200, "large_font", "benefits", jb_._Qb);
                tg_.benefits_small_font = ah_.a770(hf_._pb, 200, "small_font", "benefits", jb_._Qb);
                final int[] b = gf_._b;
                final int i = gf_._i;
                final int c = gf_._c;
                gf_.a331(rp_._e);
                final Graphic c2 = new Graphic(4 + ql_.benefits_arrow.imageWidth, ql_.benefits_arrow.imageHeight + 4);
                c2.e797();
                ql_.benefits_arrow.c326(2, 2, uj_._d);
                uc_.a923(1, 2, c2.imageWidth, c2, 0, c2.imageHeight, 0);
                ql_.benefits_arrow = c2;
                al_._j = ql_.benefits_arrow.b125();
                final Graphic cn_ = new Graphic(195, 221);
                final int n = cn_.imageWidth / 2;
                cn_.e797();
                dc_.benefits_large_font.c191(jk_.replacePlaceholders(new String[] { mj_.overxgames }, md_.mb_full_access_1), n, 40, 16777215, -1);
                tg_.benefits_small_font.c191(jk_.replacePlaceholders(new String[] { mj_.overxgames }, hm_.mb_full_access_2), n, 60, 16777215, -1);
                dc_.benefits_large_font.c191(jk_.replacePlaceholders(new String[] { dh_.overxachievements }, bh_.mb_achievement_count_1), n, 110, 16777215, -1);
                tg_.benefits_small_font.c191(jk_.replacePlaceholders(new String[] { dh_.overxachievements }, jm_.mb_achievement_count_2), n, 130, 16777215, -1);
                dc_.benefits_large_font.c191(je_.mb_exclusive_1, n, 180, 16777215, -1);
                tg_.benefits_small_font.c191(cg_.mb_exclusive_2, n, 200, 16777215, -1);
                uc_.a923(1, 3, cn_.imageWidth, cn_, 0, cn_.imageHeight, 0);
                gn_.benefits_blurbpane.e797();
                cn_.drawImage(18 - gn_.benefits_blurbpane._w, -gn_.benefits_blurbpane._A + 241);
                for (int j = 0; j < ec_.text_benefits.length; ++j) {
                    en_.text_benefits_images[j].e797();
                    tg_.benefits_small_font.a385(ec_.text_benefits[j], 3, 3, en_.text_benefits_images[j].imageWidth - 6, en_.text_benefits_images[j].imageHeight - 6, uj_._d, -1, 1, 1, tg_.benefits_small_font._H + tg_.benefits_small_font._E);
                    uc_.a923(1, 3, en_.text_benefits_images[j].imageWidth, en_.text_benefits_images[j], 0, en_.text_benefits_images[j].imageHeight, 0);
                }
                ec_.text_benefits = null;
                (ne_._d = ep_.benefits_signup_text.d125()).e797();
                jj_.a669(64, 0, 0, 2 * gf_._c / 3, gf_._i);
                gf_.a397(b, i, c);
                gf_.b331(rp_._e);
                jb_._Qb = null;
                mi_._f = 390 + (tl_.benefits_button.imageHeight - nl_.benefits_button_frame.imageHeight) / 2;
                rm_._T = 434 + (tl_.benefits_button.imageWidth - nl_.benefits_button_frame.imageWidth) / 2;
                fo_._b = (tl_.benefits_button.imageHeight - nl_.benefits_button_frame.imageHeight) / 2 + 390;
                wk_._h = (tl_.benefits_button.imageWidth - nl_.benefits_button_frame.imageWidth) / 2 + 231;
            }
        }
        if (rf_._Q == null) {
            return;
        }
        if (qc_._z != null && dc_.benefits_large_font != null) {
            final int[] b2 = gf_._b;
            final int k = gf_._i;
            final int c3 = gf_._c;
            gf_.a331(rp_._e);
            final String a841 = jk_.replacePlaceholders(new String[] { kl_.subscription_cost_monthly[wo_.currency] }, rn_.benefits_price);
            int b3 = dc_.benefits_large_font.b913(a841, DungeonPath._b);
            int a842 = dc_.benefits_large_font.a490(a841, DungeonPath._b, dc_.benefits_large_font._E + dc_.benefits_large_font._H);
            int n2 = (-b3 + DungeonPath._b) / 2 + lj_._m;
            int n3 = (-a842 + Tooltip._d) / 2 + cb_._b;
            b3 += 6;
            n2 -= 3;
            a842 += 6;
            if (0 > n2) {
                final int n4 = -n2;
                b3 += 2 * n4;
                final Graphic z = qc_._z;
                z.imageWidth2 += 2 * n4;
                lj_._m += n4;
                final Graphic z2 = qc_._z;
                z2._w += n4;
                n2 += n4;
                je_._b -= n4;
            }
            n3 -= 3;
            if (qc_._z.imageWidth2 < n2 + b3) {
                final int n5 = b3 + (n2 - qc_._z.imageWidth2);
                je_._b -= n5;
                final Graphic z3 = qc_._z;
                z3._w += n5;
                lj_._m += n5;
                final Graphic z4 = qc_._z;
                z4.imageWidth2 += n5 * 2;
            }
            if (n3 < 0) {
                final int n6 = -n3;
                a842 += 2 * n6;
                final Graphic z5 = qc_._z;
                z5.imageHeight2 += n6 * 2;
                ig_._a -= n6;
                final Graphic z6 = qc_._z;
                z6._A += n6;
                n3 += n6;
                cb_._b += n6;
            }
            if (n3 + a842 > qc_._z.imageHeight2) {
                final int n7 = n3 + (a842 - qc_._z.imageHeight2);
                ig_._a -= n7;
                final Graphic z7 = qc_._z;
                z7.imageHeight2 += 2 * n7;
                final Graphic z8 = qc_._z;
                z8._A += n7;
                cb_._b += n7;
            }
            qc_._z.a797();
            final Graphic cn_2 = new Graphic(qc_._z.imageWidth2, qc_._z.imageHeight2);
            cn_2.e797();
            dc_.benefits_large_font.a385(a841, lj_._m, cb_._b, DungeonPath._b, Tooltip._d, 16777215, -1, 1, 1, dc_.benefits_large_font._H + dc_.benefits_large_font._E);
            uc_.a923(1, 3, cn_2.imageWidth2, cn_2, 0, cn_2.imageHeight2, 0);
            qc_._z.e797();
            cn_2.drawImage(0, 0);
            (ud_._r = new Graphic(640, 480)).e797();
            qc_._z.e115((qc_._z.imageWidth2 >> 1) + je_._b, (qc_._z.imageHeight2 >> 1) + ig_._a, md_._f, 4096);
            qc_._z = null;
            ud_._r.c797();
            gf_.a397(b2, k, c3);
            gf_.b331(rp_._e);
        }
        if (lg_._m != null) {
            if (null != tg_.benefits_small_font) {
                final int[] b4 = gf_._b;
                final int l = gf_._i;
                final int c4 = gf_._c;
                gf_.a331(rp_._e);
                final Graphic cn_3 = new Graphic(412, 43);
                final String a843 = jk_.replacePlaceholders(new String[] { lg_._m }, je_.mb_including_gamename);
                lg_._m = null;
                cn_3.e797();
                tg_.benefits_small_font.a385(a843, 3, 3, cn_3.imageWidth - 6, cn_3.imageHeight - 6, 16777215, -1, 0, 1, tg_.benefits_small_font._H + tg_.benefits_small_font._E);
                uc_.a923(1, 3, cn_3.imageWidth, cn_3, 0, cn_3.imageHeight, 0);
                rf_._Q.e797();
                cn_3.drawImage(199 - rf_._Q._w, 83 - rf_._Q._A);
                gf_.a397(b4, l, c4);
                gf_.b331(rp_._e);
            }
        }
        if (ol_._b != null && tg_.benefits_small_font != null) {
            final int[] b5 = gf_._b;
            final int m = gf_._i;
            final int c5 = gf_._c;
            gf_.a331(rp_._e);
            final int n8 = 6 + tg_.benefits_small_font.b913(rp_.mb_caption_title, 640);
            final int n9 = -((20 + ol_._b.imageWidth2 + n8) / 2) + 427;
            final int n10 = ol_._b.imageWidth2 + (n9 + 20);
            rf_._Q.e797();
            tg_.benefits_small_font.b191(rp_.mb_caption_title, n10 - rf_._Q._w, tg_.benefits_small_font._H + 155 - (rf_._Q._A - tg_.benefits_small_font._E), 16777215, -1);
            uc_.a923(1, 3, n8, rf_._Q, -rf_._Q._w + (n10 - 4), 50, -rf_._Q._A + 155);
            ol_._b.drawImage(-rf_._Q._w + n9, -((-tg_.benefits_small_font._E - tg_.benefits_small_font._H + (ol_._b.imageHeight2 - 3)) / 2) + (155 - rf_._Q._A));
            gf_.a397(b5, m, c5);
            gf_.b331(rp_._e);
            ol_._b = null;
        }
        gf_.a331(rp_._e);
        gf_.a370(16, 16, 608, 112, 15, ld_._c, lj_._u);
        gf_.a370(231, 144, 393, 232, 15, ld_._c, lj_._u);
        if (null != ia_.benefits_headline) {
            ia_.benefits_headline.drawImage(0, 0);
        }
        if (gn_.benefits_blurbpane != null) {
            gn_.benefits_blurbpane.drawImage(0, 0);
        }
        rf_._Q.drawImage(0, 0);
        if (ud_._r != null) {
            ud_._r.drawImage(0, 0);
        }
        if (tl_.benefits_button != null && nl_.benefits_button_frame != null) {
            tl_.benefits_button.drawImage(231, 390);
            Graphic cn_4 = ep_.benefits_signup_text;
            if (o_._i._b == 0) {
                cn_4 = ne_._d;
            }
            cn_4.drawImage(0, 0);
            final int n11 = (la_.a353(jc_._e << ((o_._i._b != 0) ? 3 : 4)) * 40 >> 16) + 40;
            if (n11 > 0) {
                tl_.benefits_button.b326(230, 389, n11);
                tl_.benefits_button.b326(232, 389, n11);
                tl_.benefits_button.b326(232, 391, n11);
                tl_.benefits_button.b326(230, 391, n11);
                cn_4.b326(1, 1, n11);
                cn_4.b326(-1, 1, n11);
                cn_4.b326(1, -1, n11);
                cn_4.b326(-1, -1, n11);
            }
            AmbientAudioTrack.a548(o_._i._b == 0, wk_._h, fo_._b);
        }
        if (tl_.benefits_button != null) {
            if (null != nl_.benefits_button_frame) {
                tl_.benefits_button.drawImage(434, 390);
                lg_.benefits_menu_text.drawImage(0, 0);
                if (1 == o_._i._b) {
                    jj_.a669(64, 436, 392, 7 * tl_.benefits_button.imageHeight / 12, tl_.benefits_button.imageWidth - 4);
                }
                AmbientAudioTrack.a548(1 == o_._i._b, rm_._T, mi_._f);
            }
        }
        if (ql_.benefits_arrow != null) {
            final int n12 = -(ql_.benefits_arrow.imageHeight2 / 2) + 357;
            ql_.benefits_arrow.drawImage(-ql_.benefits_arrow.imageWidth2 + 269, n12);
            al_._j.drawImage(586, n12);
            if (n12 < Animation.mouseY && n12 + ql_.benefits_arrow.imageHeight > Animation.mouseY) {
                final int n13 = 40 + (la_.a353(jc_._e << 4) * 40 >> 16);
                if (0 < n13) {
                    if (hj_.mouseX > -ql_.benefits_arrow.imageWidth + 269 && 269 > hj_.mouseX) {
                        ql_.benefits_arrow.b326(269 - ql_.benefits_arrow.imageWidth2 - 1, n12 - 1, n13);
                        ql_.benefits_arrow.b326(-ql_.benefits_arrow.imageWidth2 + 269 + 1, n12 - 1, n13);
                        ql_.benefits_arrow.b326(-ql_.benefits_arrow.imageWidth2 + 269 - 1, 1 + n12, n13);
                        ql_.benefits_arrow.b326(269 - ql_.benefits_arrow.imageWidth2 + 1, 1 + n12, n13);
                    }
                    else if (586 < hj_.mouseX) {
                        if (ql_.benefits_arrow.imageWidth + 586 > hj_.mouseX) {
                            al_._j.b326(585, n12 - 1, n13);
                            al_._j.b326(587, n12 - 1, n13);
                            al_._j.b326(585, 1 + n12, n13);
                            al_._j.b326(587, n12 + 1, n13);
                        }
                    }
                }
            }
        }
        qh_.a150(245);
        en_.text_benefits_images[me_._f].drawImage(269, 340);
    }
    
    static final void a651(final int[] array, int i, final int n, final int n2, final int n3, int n4, final int n5, int n6, int n7, final int n8, int n9, int n10, int j, final int[] array2) {
        final int n11 = n3 & 0xFF00FF;
        final int n12 = n3 & 0xFF00;
        for (i = -n; i < 0; ++i) {
            for (j = -n2; j < 0; ++j) {
                n10 = array2[n7++];
                if (n10 == 0) {
                    ++n6;
                }
                else {
                    n10 >>= 16;
                    n4 = array[n6];
                    n10 = ((n12 * n10 & 0xFF0000) | (0xFF00FF00 & n10 * n11)) >>> 8;
                    n9 = n4 + n10;
                    n10 = (0xFF00FF & n4) + (0xFF00FF & n10);
                    n4 = (n10 & 0x1000100) + (0x10000 & -n10 + n9);
                    array[n6++] = mp_.or(-(n4 >>> 8) + n4, -n4 + n9);
                }
            }
            n6 += n5;
            n7 += n8;
        }
    }
    
    static {
        he_.desc_dark_elf_assassin = "The mysterious and sultry dark elf assassin knows that the quickest way to someone's heart is through their chest cavity. She has honed the art of assassination to perfection.";
        he_.unpacking_animations = "Unpacking animations";
        he_.create_welcome = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
