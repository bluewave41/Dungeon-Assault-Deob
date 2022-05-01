final class ra_
{
	
	//original name: _d
    private int[] folderNameHashes;
    //original name: _a
    static String text_bounty_protection;
    static wj_ _c;
    static int[] _b;
    
    //original signature: final int a080(final int n, final int n2) {
    final int a080(final int hashedString) {
        final int n3 = (this.folderNameHashes.length >> 1) - 1;
        int n4 = n3 & hashedString;
        while (true) {
            final int n5 = this.folderNameHashes[1 + n4 + n4];
            if (-1 == n5) {
                return -1;
            }
            if (this.folderNameHashes[n4 + n4] == hashedString) {
                return n5;
            }
            n4 = (n3 & n4 + 1);
        }
    }
    
    public static void a423() {
        ra_._b = null;
        ra_.text_bounty_protection = null;
        ra_._c = null;
    }
    
    static final void a150() {
        jj_.b423();
        final int a776 = lc_.a776(hj_.mouseX, Animation.mouseY);
        if (a776 != ak_._n) {
            if ((ak_._n = a776) != -1) {
                fj_._f = new rh_(0, 0, 40, 80, 255, 197376, 224);
            }
            else {
                fj_._f = null;
            }
        }
        if (1 == no_.isMetaDown) {
            final int a777 = lc_.a776(lc_.mouseX, hm_.mouseY);
            if (a777 != kg_._f) {
                if (-1 != a777) {
                    kg_._f = a777;
                    um_._g = new rh_(0, 0, 40, 80, 16711680, 768, 224);
                }
            }
            else {
                um_._g = null;
                kg_._f = -1;
            }
        }
    }
    
    static final void c150() {
        jh_.c797();
        if (im_._e == null) {
            im_._e = new Graphic(394, 296);
            im_._e._A = -8;
            im_._e._w = -8;
        }
        im_._e.e797();
        gf_.a797();
        for (int i = 0; i < 7; ++i) {
            int n = -(i * 27) + 189 - 19;
            final int n2 = 20 * i + 8;
            for (int n3 = -i + 6, j = 0; j < 1 + i; ++j, n3 += 8, n += 54) {
                jm_.a115(n2, n3, 3, n);
            }
        }
        for (int k = 7; k < 13; ++k) {
            int n4 = 27 * (k - 6) + 8;
            final int n5 = k * 20 + 8;
            for (int n6 = k * 7 - 42, n7 = 0; 13 - k > n7; ++n7, n4 += 54, n6 += 8) {
                jm_.a115(n5, n6, 3, n4);
            }
        }
        gf_.d669(2, 2, 0, 0, im_._e.imageWidth, im_._e.imageHeight);
        jh_.b797();
    }
    
    ra_(final int[] array) {
        int i;
        for (i = 1; i <= array.length + (array.length >> 1); i <<= 1) {} //length *2
        this.folderNameHashes = new int[i + i];
        for (int j = 0; j < i + i; ++j) {
            this.folderNameHashes[j] = -1;
        }
        for (int n = 0; array.length > n; ++n) {
            int n2;
            for (n2 = (i - 1 & array[n]); this.folderNameHashes[n2 + (n2 + 1)] != -1; n2 = (i - 1 & 1 + n2)) {}
            this.folderNameHashes[n2 + n2] = array[n];
            this.folderNameHashes[n2 + (n2 + 1)] = n;
        }
    }
    
    //original signature: static final void b150(final int n) {
    static final void b150() {
        ha_._k = new lc_(ia_._W, ll_._r);
        hd_.a492(30, "menu_select");
        sa_.da_ambience_drip = sh_.a289("da_ambience_drip", new int[] { 110, 110, 110, 110, 140 });
        hp_.da_ambience_insect = sh_.a289("da_ambience_insect", new int[] { 256, 256, 168 });
        dc_.da_door_open = sh_.a289("da_door_open", new int[] { 110, 100 });
        om_.da_ambience_burning_torches_loop_4000ms = hd_.a492(140, "da_ambience_burning_torches_loop_4000ms");
        k_.da_ambience_running_water_loop_1000ms = hd_.a492(256, "da_ambience_running_water_loop_1000ms");
        mh_.da_menu_fire = hd_.a492(51, "da_menu_fire");
        qm_.da_gold_stealing = hd_.a492(256, "da_gold_stealing");
        eb_.da_gold_bar = sh_.a289("da_gold_bar", new int[] { 125, 125, 125, 125 });
        bc_.da_dice_roll_dry = hd_.a492(256, "da_dice_roll_dry");
        ef_.da_hoardroom_angry_dragon = hd_.a492(171, "da_hoardroom_angry_dragon");
        
        u_.introTracks = new AmbientAudioTrack[9];
        u_.introTracks[0] = hd_.a492(256, "01-the land of dungaria");
        u_.introTracks[1] = hd_.a492(256, "02-once it was a battlefield");
        u_.introTracks[2] = hd_.a492(256, "03-the world itself was in danger");
        u_.introTracks[3] = hd_.a492(256, "04-now the dragons sleep");
        u_.introTracks[4] = hd_.a492(256, "05-but still they battle");
        u_.introTracks[5] = hd_.a492(256, "06-thru the life and death of others");
        u_.introTracks[6] = hd_.a492(256, "07-take upon yourself");
        u_.introTracks[7] = hd_.a492(256, "08-defend your hoard");
        u_.introTracks[8] = hd_.a492(256, "09-become the dragon king");
        
        
        //ed_.a029
        //static final void a029(final String defeatName, final int n, final int unitId, final String revealName, final int n3) {
        //kn_.loadRaiderVoices(n3, defeatName, unitId, n, 96, null, revealName);
        
        ed_.a029("goblin_defeat", 139, 1, "goblin_runt_reveal", 136);
        bf_.a311(256, 2, 256, -18228, "saurus");
        ed_.a029("goblin_defeat", 139, 3, "goblin_cleaver_reveal", 125);
        bf_.a311(197, 4, 170, -18228, "ork");
        to_.a124(119, 136, 140, "witch", 5);
        bf_.a311(125, 6, 115, -18228, "beastman");
        kn_.loadRaiderVoices(256, "saurus_defeat", 7, 256, 256, "saurus_reveal", "saurus_reveal");
        bf_.a311(146, 8, 197, -18228, "mercenary_knight");
        to_.a124(150, 150, 146, "priest", 9);
        bf_.a311(170, 10, 197, -18228, "ork");
        kn_.loadRaiderVoices(140, "goblin_defeat", 11, 139, 138, "goblin_scout_special", "goblin_scout_reveal");
        to_.a124(120, 120, 159, "necromancer", 12);
        bf_.a311(200, 13, 200, -18228, "ogre");
        to_.a124(138, 214, 134, "enchantress", 14);
        bf_.a311(256, 15, 256, -18228, "saurus");
        ed_.a029("ork_defeat", 197, 16, "ork_reveal", 170);
        kn_.loadRaiderVoices(165, "troll_defeat", 17, 149, 165, "troll_reveal", "troll_reveal");
        to_.a124(160, 134, 130, "northman_ranger", 18);
        to_.a124(100, 146, 134, "dwarf_renegade", 19);
        bf_.a311(139, 20, 200, -18228, "thief");
        bf_.a311(171, 21, 156, -18228, "zealot");
        bf_.a311(156, 22, 125, 9 - 18237, "darkelf_assassin");
        bf_.a311(138, 23, 148, -18228, "baerserker");
        bf_.a311(200, 24, 200, -18228, "ogre");
        bf_.a311(200, 25, 155, -18228, "spy");
        to_.a124(138, 137, 135, "shapeshifter", 26);
        bf_.a311(150, 27, 164, -18228, "black_knight");
        bf_.a311(186, 28, 196, -18228, "minotaur");
        to_.a124(119, 136, 140, "warlock", 29);
        bf_.a311(172, 30, 173, -18228, "death_knight");
        bf_.a311(147, 31, 200, -18228, "chaos_champion");
        bf_.a311(74, 33, 73, -18228, "daemonette");
        to_.a124(190, 198, 197, "dryad", 34);
        ki_.a573(90, 15, 100, "giant_rats", -1);
        ki_.a573(125, 16, 76, "rot_worms", -1);
        ki_.a573(175, 17, 134, "troglodyte", -1);
        ki_.a573(110, 18, 110, "giant_snake", -1);
        ki_.a573(89, 19, 89, "giant_spider", -1);
        ki_.a573(201, 20, 102, "skeleton_sentinals", -1);
        ki_.a573(150, 21, 141, "corrosive_slime", -1);
        ki_.a573(100, 22, 83, "razor_construct", -1);
        ki_.a573(135, 23, 120, "rabid_wolf", -1);
        ki_.a573(112, 24, 109, "vampire_bat", -1);
        ki_.a573(180, 25, 91, "imp", -1);
        ki_.a573(200, 26, 120, "stone_golem", -1);
        ki_.a573(135, 27, 119, "spectre", -1);
        ki_.a573(42, 28, 57, "banshee", -1);
        ki_.a573(197, 29, 133, "raging_beast", -1);
        ki_.a573(147, 30, 143, "basilisk", -1);
        ki_.a573(99, 31, 125, "pit_demon", -1);
        ki_.a573(114, 32, 114, "vampire_lord", -1);
        ki_.a573(103, 33, 116, "hell_beast", -1);
        ki_.a573(97, 34, 100, "demon_lord", -1);
        fi_.a924(160, "tripwire_bell", 35);
        fi_.a924(60, "hallofglass", 36);
        fi_.a924(58, "magical_guardian", 37);
        lg_.a924(200, "hidden_pit", 4);
        lg_.a924(125, "snakes", 5);
        lg_.a924(178, "hidden_nails", 6);
        lg_.a924(200, "hidden_pit", 7);
        lg_.a924(145, "teleport", 8);
        lg_.a924(178, "hidden_nails", 9);
        lg_.a924(150, "bottomless_pit", 10);
        lg_.a924(194, "crusher", 11);
        lg_.a924(180, "crossbow", 12);
        lg_.a924(74, "whirling_blades", 13);
        lg_.a924(117, "poison_gas", 14);
    }
    
    static {
        ra_.text_bounty_protection = "There is a bounty on this dungeon of <%0> Treasure.<br>(Dragon wakes: +<%1>%)<br>(Renown gambled: <%2>)";
        ra_._b = new int[8192];
    }
}
