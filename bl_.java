import java.util.*;

final class bl_
{
	//original name: _f
    String loadingText;
    //original name: _g
    String waitingForText;
    int _m;
    static int[] _n;
    static boolean _k;
    //original name: _j
    static Graphic members_benefits_borders;
    //original name: _i
    static Random random;
    nh_ _q;
    String _h;
    //original name: _b
    static String text_limit_reached_long;
    //original name: _d
    static Graphic[] wall_icons_2d;
    //original name: _s
    static Graphic scroll_tile;
    static int _p;
    //original name: _o
    static Graphic scrollbar_top;
    static rj_ _l;
    //original name: _e
    static Graphic jagex_logo_grey;
    static int _c;
    static je_ _r;
    //original name: _a
    static String next;
    static nh_ _t;
    
    public static void d423() {
        bl_.scrollbar_top = null;
        bl_.text_limit_reached_long = null;
        bl_.scroll_tile = null;
        bl_._n = null;
        bl_.random = null;
        bl_.jagex_logo_grey = null;
        bl_._r = null;
        bl_.next = null;
        bl_._t = null;
        bl_.members_benefits_borders = null;
        bl_.wall_icons_2d = null;
        bl_._l = null;
    }
    
    //original signature: static final void c423() {
    static final void unpackGraphics() {
        kk_.smallfont = ah_.a770(np_._A, 200, "smallfont", "", hj_._Z);
        db_.roman12bold = ah_.a770(np_._A, 200, "roman12bold", "", hj_._Z);
        df_.main_center = rc_.a324("", sb_._a, "main_center");
        dm_._d = new Graphic[3];
        qi_._f = new Graphic[3];
        for (int i = 0; i < 3; ++i) {
            dm_._d[i] = rc_.a324("", sb_._a, "main_left_0" + (i + 1));
        }
        for (int j = 0; j < 3; ++j) {
            qi_._f[j] = rc_.a324("", sb_._a, "main_right_0" + (j + 1));
        }
        tm_.menu_block = oh_.a825(hj_._Z, "", "menu_block");
        of_.menu_button = oh_.a825(hj_._Z, "", "menu_button");
        le_.menu_moss_top_left = oh_.a825(hj_._Z, "", "menu_moss_top_left");
        Tooltip.menu_moss_top_right = oh_.a825(hj_._Z, "", "menu_moss_top_right");
        wj_.menu_moss_1 = oh_.a825(hj_._Z, "", "menu_moss_1");
        oj_.menu_moss_2 = oh_.a825(hj_._Z, "", "menu_moss_2");
        oh_.a825(hj_._Z, "", "menu_moss_bottom");
        am_.menu_chain_frame = oh_.a825(hj_._Z, "", "menu_chain_frame");
        lf_.menu_chain_ext = oh_.a825(hj_._Z, "", "menu_chain_ext");
        lf_.menu_chain_line = oh_.a825(hj_._Z, "", "menu_chain_line");
        hf_.menu_chain = oh_.a825(hj_._Z, "", "menu_chain");
        kh_.cursor = kn_.a922(hj_._Z, "", "cursor");
        jg_._c = new Graphic[kh_.cursor.length];
        for (int n = 0; kh_.cursor.length > n; ++n) {
            jg_._c[n] = GUICheckbox.a551(8, kh_.cursor[n], 16711680, (byte)124);
        }
        bf_.smoke = oh_.a825(hj_._Z, "", "smoke");
        bo_.scrollbar_top = oh_.a825(hj_._Z, "", "scrollbar_top");
        ud_.scrollbar_bottom = oh_.a825(hj_._Z, "", "scrollbar_bottom");
        qh_.scrollbar_slider = oh_.a825(hj_._Z, "", "scrollbar_slider");
        (tn_.scrollbar_top = bo_.scrollbar_top.d125()).f797();
        (dc_.scrollbar_bottom = ud_.scrollbar_bottom.d125()).f797();
        (ml_.scrollbar_slider = qh_.scrollbar_slider.d125()).f797();
        hm_.scrollbar_top = dd_.a510(4, bo_.scrollbar_top);
        FooterCenterHint.scrollbar_bottom = dd_.a510(4, ud_.scrollbar_bottom);
        ji_.scrollbar_slider = dd_.a510(4, qh_.scrollbar_slider);
        bl_.scrollbar_top = dd_.a510(4, tn_.scrollbar_top);
        go_.scrollbar_bottom = dd_.a510(4, dc_.scrollbar_bottom);
        im_.scrollbar_slider = dd_.a510(4, ml_.scrollbar_slider);
        
        final Graphic cracked_bar = oh_.a825(hj_._Z, "", "cracked_bar");
        final Graphic d125 = cracked_bar.d125();
        d125.g797();
        final Graphic cracked_bar_endcap = oh_.a825(hj_._Z, "", "cracked_bar_endcap");
        final Graphic d126 = cracked_bar_endcap.d125();
        d126.g797();
        
        ad_.interface_crescent = ph_.a343(hj_._Z, "", "interface_crescent");
        oe_.interface_dragon = ph_.a343(hj_._Z, "", "interface_dragon");
        pi_.interface_lattice = oh_.a825(hj_._Z, "", "interface_lattice");
        jm_.button_152 = oh_.a825(hj_._Z, "", "button_152");
        oh_.a825(hj_._Z, "", "button_252");
        gh_.strategy_buttons = kn_.a922(hj_._Z, "", "strategy_buttons");
        jh_.c797();
        
        final int crackedBarWidth = cracked_bar.imageWidth;
        final int crackedBarHeight = cracked_bar.imageHeight;
        for (int n2 = 0; crackedBarWidth * crackedBarHeight > n2; ++n2) {
            cracked_bar._B[n2] = mp_.or(cracked_bar._B[n2], Integer.MIN_VALUE);
        }
        final Graphic cn_ = new Graphic(crackedBarWidth, crackedBarHeight);
        cn_.e797();
        gf_.b050(0, 0, crackedBarWidth, 2, 16416);
        gf_.b050(0, 2, crackedBarWidth, crackedBarHeight - 4, 96);
        gf_.b050(0, crackedBarHeight - 2, crackedBarWidth, 2, 49184);
        bk_.cracked_bar = new ph_(cracked_bar, cn_);
        final int y2 = d125.imageWidth;
        final int v2 = d125.imageHeight;
        for (int k = 0; k < y2 * v2; ++k) {
            d125._B[k] = mp_.or(d125._B[k], Integer.MIN_VALUE);
        }
        final Graphic cn_2 = new Graphic(y2, v2);
        cn_2.e797();
        gf_.b050(0, 0, 2, v2, 4194336);
        gf_.b050(2, 0, y2 - 4, v2, 96);
        gf_.b050(y2 - 2, 0, 2, v2, 12582944);
        be_._o = new ph_(d125, cn_2);
        final int crackedBarEndcapHeight = cracked_bar_endcap.imageHeight;
        final int crackedBarEndcapWidth = cracked_bar_endcap.imageWidth;
        for (int n3 = 0; crackedBarEndcapHeight * crackedBarEndcapWidth > n3; ++n3) {
            cracked_bar_endcap._B[n3] = mp_.or(cracked_bar_endcap._B[n3], Integer.MIN_VALUE);
        }
        final Graphic cn_3 = new Graphic(crackedBarEndcapWidth, crackedBarEndcapHeight);
        cn_3.e797();
        gf_.b050(0, 0, crackedBarEndcapWidth, 2, 16416);
        gf_.b050(0, 2, crackedBarEndcapWidth, crackedBarEndcapHeight - 4, 96);
        gf_.b050(0, crackedBarEndcapHeight - 2, crackedBarEndcapWidth, 2, 49184);
        for (int l = 0; l < crackedBarEndcapWidth * crackedBarEndcapHeight; ++l) {
            if (cracked_bar_endcap._B[l] == Integer.MIN_VALUE) {
                cracked_bar_endcap._B[l] = 0;
                cn_3._B[l] = 0;
            }
        }
        MusicTrack.cracked_bar_endcap = new ph_(cracked_bar_endcap, cn_3);
        final int v4 = d126.imageHeight;
        final int y4 = d126.imageWidth;
        for (int n4 = 0; n4 < v4 * y4; ++n4) {
            d126._B[n4] = mp_.or(d126._B[n4], Integer.MIN_VALUE);
        }
        final Graphic cn_4 = new Graphic(y4, v4);
        cn_4.e797();
        gf_.b050(0, 0, 2, v4, 4194336);
        gf_.b050(2, 0, y4 - 4, v4, 96);
        gf_.b050(y4 - 2, 0, 2, v4, 12582944);
        for (int n5 = 0; n5 < v4 * y4; ++n5) {
            if (Integer.MIN_VALUE == d126._B[n5]) {
                d126._B[n5] = 0;
                cn_4._B[n5] = 0;
            }
        }
        Trap._w = new ph_(d126, cn_4);
        ec_._j = qa_.a466("achievements_large", "", hj_._Z);
        md_.a238(97, f_._a);
        md_.a238(98, PlayerInformation._o);
        (AmbientAudioTrack._f = new Graphic(32, 32)).e797();
        PlayerInformation._o.a115(0, 0, 32, 32);
        jh_.b797();
        PlayerInformation._o = null;
        nb_._d = oh_.a825(hj_._Z, "", "base");
        final Graphic[] a827 = kn_.a922(hj_._Z, "", "room_icons");
        ja_.room_icons_2d = kn_.a922(hj_._Z, "", "room_icons_2d");
        bl_.wall_icons_2d = kn_.a922(hj_._Z, "", "wall_icons_2d");
        ri_.walls = kn_.a922(hj_._Z, "", "walls");
        mc_.room_floors = kn_.a922(hj_._Z, "", "room_floors");
        final Graphic[] w = mc_.room_floors;
        for (int n6 = 0; n6 < w.length; ++n6) {
            w[n6]._A = 18;
        }
        i_.room_icons = wk_.a528(a827, 0);
        final Graphic a828 = oh_.a825(hj_._Z, "", "room_monster");
        for (int n7 = 0; n7 < 38; ++n7) {
            if (null != gh_.traps[n7] && gh_.traps[n7].roomType == 2) {
                i_.room_icons[n7] = a828;
            }
        }
        i_.room_icons[0] = mc_.room_floors[0];
        i_.room_icons[2] = oh_.a825(hj_._Z, "", "room_gold");
        i_.room_icons[4] = oh_.a825(hj_._Z, "", "room_pit");
        i_.room_icons[5] = oh_.a825(hj_._Z, "", "room_snakes");
        i_.room_icons[6] = oh_.a825(hj_._Z, "", "room_nails");
        i_.room_icons[7] = oh_.a825(hj_._Z, "", "room_hiddenpit");
        i_.room_icons[8] = oh_.a825(hj_._Z, "", "room_teleport");
        i_.room_icons[9] = oh_.a825(hj_._Z, "", "room_hiddennails");
        i_.room_icons[10] = oh_.a825(hj_._Z, "", "room_pit");
        i_.room_icons[11] = oh_.a825(hj_._Z, "", "room_crusher");
        i_.room_icons[12] = oh_.a825(hj_._Z, "", "room_crossbow");
        i_.room_icons[14] = oh_.a825(hj_._Z, "", "room_gas");
        i_.room_icons[36] = oh_.a825(hj_._Z, "", "room_hallofglass");
        sn_.torches = kn_.a922(hj_._Z, "", "torches");
        RegisterScreen.i150();
        mf_.doormasks = kn_.a922(hj_._Z, "", "doormasks");
        jh_.c797();
        ua_._b = new ph_[6];
        for (int n8 = 0; n8 < 6; ++n8) {
            final Graphic cn_5 = ri_.walls[n8];
            for (int n9 = 0; cn_5._B.length > n9; ++n9) {
                if (cn_5._B[n9] != 0) {
                    cn_5._B[n9] = mp_.or(cn_5._B[n9], Integer.MIN_VALUE);
                }
            }
            final Graphic cn_6 = new Graphic(cn_5.imageWidth, cn_5.imageHeight);
            cn_6.e797();
            cn_5.e326(0, 0, ((0x1 & n8) != 0x0) ? 13684768 : 3199008);
            ua_._b[n8] = new ph_(cn_5, cn_6);
        }
        jh_.b797();
        jc_.piece_baeserker = oh_.a825(hj_._Z, "pieces", "piece_baeserker");
        f_.piece_banshee = oh_.a825(hj_._Z, "pieces", "piece_banshee");
        qm_.piece_bat = oh_.a825(hj_._Z, "pieces", "piece_bat");
        ia_.piece_beastman = oh_.a825(hj_._Z, "pieces", "piece_beastman");
        ld_.piece_blackknight = oh_.a825(hj_._Z, "pieces", "piece_blackknight");
        GUIButton.piece_blade_construct = oh_.a825(hj_._Z, "pieces", "piece_blade_construct");
        ll_.piece_darkelf = oh_.a825(hj_._Z, "pieces", "piece_darkelf");
        PlayerInformation.piece_demon = oh_.a825(hj_._Z, "pieces", "piece_demon");
        fp_.piece_dryhad = oh_.a825(hj_._Z, "pieces", "piece_dryhad");
        bj_.piece_dwarf = oh_.a825(hj_._Z, "pieces", "piece_dwarf");
        ie_.piece_enchantress = oh_.a825(hj_._Z, "pieces", "piece_enchantress");
        hl_.piece_goblin_cleaver = oh_.a825(hj_._Z, "pieces", "piece_goblin_cleaver");
        tn_.piece_goblin_club = oh_.a825(hj_._Z, "pieces", "piece_goblin_club");
        jl_.piece_goblin_scout = oh_.a825(hj_._Z, "pieces", "piece_goblin_scout");
        bn_.piece_hellbeast = oh_.a825(hj_._Z, "pieces", "piece_hellbeast");
        fl_.piece_imp = oh_.a825(hj_._Z, "pieces", "piece_imp");
        ub_.piece_merc = oh_.a825(hj_._Z, "pieces", "piece_merc");
        fn_.piece_minotaur = oh_.a825(hj_._Z, "pieces", "piece_minotaur");
        g_.piece_necromancer = oh_.a825(hj_._Z, "pieces", "piece_necromancer");
        df_.piece_northman = oh_.a825(hj_._Z, "pieces", "piece_northman");
        ef_.piece_ogre = oh_.a825(hj_._Z, "pieces", "piece_ogre");
        kf_.piece_ork_blademaster = oh_.a825(hj_._Z, "pieces", "piece_ork_blademaster");
        lj_.piece_ork_mace = oh_.a825(hj_._Z, "pieces", "piece_ork_mace");
        le_.piece_ork_shaman = oh_.a825(hj_._Z, "pieces", "piece_ork_shaman");
        oo_.piece_pitdemon = oh_.a825(hj_._Z, "pieces", "piece_pitdemon");
        cg_.piece_priest = oh_.a825(hj_._Z, "pieces", "piece_priest");
        lm_.piece_rat = oh_.a825(hj_._Z, "pieces", "piece_rat");
        ii_.piece_rotworm = oh_.a825(hj_._Z, "pieces", "piece_rotworm");
        sp_.piece_saurus_imp = oh_.a825(hj_._Z, "pieces", "piece_saurus_imp");
        qd_.piece_saurus_spawn = oh_.a825(hj_._Z, "pieces", "piece_saurus_spawn");
        na_.piece_saurus_warrior = oh_.a825(hj_._Z, "pieces", "piece_saurus_warrior");
        dk_.piece_skeleton = oh_.a825(hj_._Z, "pieces", "piece_skeleton");
        n_.piece_snake = oh_.a825(hj_._Z, "pieces", "piece_snake");
        hh_.piece_spectre = oh_.a825(hj_._Z, "pieces", "piece_spectre");
        jf_.piece_spider = oh_.a825(hj_._Z, "pieces", "piece_spider");
        DungeonAssault.piece_spy = oh_.a825(hj_._Z, "pieces", "piece_spy");
        m_.piece_thief = oh_.a825(hj_._Z, "pieces", "piece_thief");
        sp_.piece_troglodyte = oh_.a825(hj_._Z, "pieces", "piece_troglodyte");
        gd_.piece_troll = oh_.a825(hj_._Z, "pieces", "piece_troll");
        Raider.piece_vampire = oh_.a825(hj_._Z, "pieces", "piece_vampire");
        in_.piece_witch = oh_.a825(hj_._Z, "pieces", "piece_witch");
        up_.piece_zealot = oh_.a825(hj_._Z, "pieces", "piece_zealot");
        gd_.stat_attack = oh_.a825(hj_._Z, "", "stat_attack");
        jj_.stat_defence = oh_.a825(hj_._Z, "", "stat_defence");
        wl_.stat_dodge = oh_.a825(hj_._Z, "", "stat_dodge");
        WarningMessage.stat_sneak = oh_.a825(hj_._Z, "", "stat_sneak");
        tb_.stat_snare = oh_.a825(hj_._Z, "", "stat_snare");
        kd_.stat_detect = oh_.a825(hj_._Z, "", "stat_detect");
        uj_.stat_renown = oh_.a825(hj_._Z, "", "stat_renown");
        ue_.modifier_icons = kn_.a922(hj_._Z, "", "modifier_icons");
        oh_.a825(hj_._Z, "", "dead_icon");
        rj_.youarehere = oh_.a825(hj_._Z, "", "youarehere");
        fj_.spy_icon = kn_.a922(hj_._Z, "", "spy_icon");
        bf_.sac_icon = kn_.a922(hj_._Z, "", "sac_icon");
        kh_.revive_icon = oh_.a825(hj_._Z, "", "revive_icon");
        hj_.menu_locked = oh_.a825(hj_._Z, "", "menu_locked");
        n_.ingot = pa_.a872(hj_._Z, "", "ingot");
        tb_._a = n_.ingot.d869();
        fb_._f = n_.ingot.c869();
        
        for (int n10 = 0; n10 < 2; ++n10) {
            if ((0x1 & fb_._f._g) != 0x0) {
                final q_ f = fb_._f;
                ++f._g;
            }
            if ((fb_._f._d & 0x1) != 0x0) {
                final q_ f2 = fb_._f;
                ++f2._d;
            }
            final q_ f3 = fb_._f;
            f3._g /= 2;
            final q_ f4 = fb_._f;
            f4._d /= 2;
            final byte[] m = new byte[fb_._f._d * fb_._f._g];
            int n11 = 0;
            for (int n12 = 0; n12 < fb_._f._e; ++n12) {
                for (int n13 = 0; fb_._f._h > n13; ++n13) {
                    m[(fb_._f._b + n13 >> 1) + (n12 + fb_._f._a >> 1) * fb_._f._d] = fb_._f._j[n11++];
                }
            }
            fb_._f._j = m;
            fb_._f._e = fb_._f._g;
            fb_._f._h = fb_._f._d;
            fb_._f._a = 0;
            fb_._f._b = 0;
        }
        la_.roman12.a478(new q_[] { fb_._f, rf_.a102(10) }, new int[] { 9, 10 });
        fl_._i = fn_.a316();
        DungeonPath._h = fl_._i.b125();
        dh_._a = rj_.a373();
        sm_._g = CacheIndex.a749();
        fo_._a = wo_.a028(5, 6, 5, 16744448);
        (CacheIndex._a = fo_._a.d125()).g797();
        (i_._v = CacheIndex._a.d125()).g797();
        (qi_._i = i_._v.d125()).g797();
        
        qe_.setRaiderAndTrapStats(gd_.stat_attack, jj_.stat_defence, wl_.stat_dodge, WarningMessage.stat_sneak, tb_.stat_snare, kd_.stat_detect);
        
        ao_.scroll_top = oh_.a825(hj_._Z, "", "scroll_top");
        rn_.scroll_bottom = oh_.a825(hj_._Z, "", "scroll_bottom");
        bl_.scroll_tile = oh_.a825(hj_._Z, "", "scroll_tile");
        (li_.scrollBars = new Graphic[9])[0] = oh_.a825(hj_._Z, "", "scroll_top_left");
        li_.scrollBars[1] = oh_.a825(hj_._Z, "", "scroll_top_centre");
        li_.scrollBars[2] = oh_.a825(hj_._Z, "", "scroll_top_right");
        li_.scrollBars[3] = oh_.a825(hj_._Z, "", "scroll_centre_left");
        (li_.scrollBars[4] = new Graphic(li_.scrollBars[0].imageWidth, li_.scrollBars[0].imageHeight)).e797();
        gf_.b050(0, 0, gf_._i, gf_._c, 13619075);
        k_._h.a487();
        li_.scrollBars[5] = oh_.a825(hj_._Z, "", "scroll_centre_right");
        li_.scrollBars[6] = oh_.a825(hj_._Z, "", "scroll_bottom_left");
        li_.scrollBars[7] = oh_.a825(hj_._Z, "", "scroll_bottom_centre");
        li_.scrollBars[8] = oh_.a825(hj_._Z, "", "scroll_bottom_right");
        kg_.small_button = oh_.a825(hj_._Z, "", "small_button");
        jn_._n = new lg_(327680, 1310720, 327680, 327680, 65536, 32768, 49152, 24576, 0, -4096, 100, 50);
        final int[] i2 = new int[256];
        for (int n14 = 0; n14 < 64; ++n14) {
            i2[n14] = 262144 * n14;
        }
        for (int n15 = 64; n15 < 192; ++n15) {
            i2[n15] = -32768 + 512 * n15 + 16711680;
        }
        for (int n16 = 192; n16 < 256; ++n16) {
            i2[n16] = 16776960 + (n16 - 192) * 4;
        }
        jn_._n._v._i = i2;
        fp_.dungeonAssaultHeaderLabel = new HeaderLabelText(ne_.roman20, tp_.text_dungeon_assault, cm_._M);
        na_.instructionsHeaderLabel = new HeaderLabelText(ne_.roman20, bn_.text_instructions, cm_._M);
        cg_.achievementsHeaderLabel = new HeaderLabelText(ne_.roman20, vd_.text_achievements, cm_._M);
        ih_.dragonsOfRenownHeaderLabel = new HeaderLabelText(ne_.roman20, c_.text_dragons_of_renown.toUpperCase(), cm_._M);
        bf_.profileHeaderLabel = new HeaderLabelText(ne_.roman20, gk_.text_profile, cm_._M);
        kd_._e = new HeaderLabelText[ie_.instructions_subtitles_text.length];
        for (int n17 = 0; n17 < ie_.instructions_subtitles_text.length; ++n17) {
            kd_._e[n17] = new HeaderLabelText(db_.roman12bold, ie_.instructions_subtitles_text[n17], cm_._M);
        }
        new Graphic(gf_._i, gf_._c);
    }
    
    //original signature: static final void b423() {
    static final void setupUnreadTickets() {
        cd_._b = false;
        ub_.unreadTicketsText = null;
        if (qc_._t) {
            a_._n.o150(4210752);
        }
        else {
            final int unreadTickets = hf_.unreadTickets;
            if (0 < unreadTickets) {
                if (unreadTickets == 1) {
                    ub_.unreadTicketsText = fb_.ticketing_oneunread;
                }
                else {
                    ub_.unreadTicketsText = jk_.replacePlaceholders(new String[] { Integer.toString(unreadTickets) }, hm_.ticketing_xunread);
                }
                ub_.unreadTicketsText = nf_.a408(new CharSequence[] { ub_.unreadTicketsText, "<br>", qa_.ticketing_gotowebsite });
            }
            a_._n.j423((byte)79);
            hl_.a487();
        }
    }
    
    static final void a150(final int n) {
        if (hh_._s == id_._l) {
            id_._l = null;
        }
        if (0 <= ce_._p && ++ce_._p >= 50) {
            jn_._l = gk_._L;
            ce_._p = -1;
            ui_._a = hc_._b;
        }
        wi_._kb = fa_.a666(ui_._a, hc_._b);
        vf_._w = ((gk_._L != null) ? (hh_._p - 100) : 620);
        qc_._w = ((null == gk_._L) ? (480 - wi_._kb >> 1) : (ed_._P - (wi_._kb >> 1)));
        if (-1 != ce_._p) {
            final int n2 = (jn_._l != null) ? (hh_._p - 100) : 620;
            final int n3 = (jn_._l == null) ? (480 - wi_._kb >> 1) : (-(wi_._kb >> 1) + ed_._P);
            vf_._w = fa_.a666(n2, vf_._w);
            qc_._w = fa_.a666(n3, qc_._w);
        }
        ti_._A.b599(204 + vf_._w, qc_._w - 28, (byte)4);
        tk_._k.b599(vf_._w - 7, 20 + qc_._w + wi_._kb, (byte)4);
        ec_._n.b599(7 + (vf_._w + 200), qc_._w + (wi_._kb + 22), (byte)4);
        ti_._A.isActive = (null != gk_._L);
        tk_._k.isActive = (n < fc_._d);
        ec_._n.isActive = (fc_._d < uo_.currentTutorialString.length - 1);
    }
    
    static final void a423() {
        final Raider[] raiders = hp_.raiders;
        for (int n = 0; raiders.length > n; ++n) {
            final Raider raider = raiders[n];
            if (null != raider) {
                if (raider.idleAnimation != null) {
                    raider.idleAnimation.a423((byte)(-19));
                }
                if (raider.selectAnimation != null) {
                    raider.selectAnimation.a423((byte)(-19));
                }
                if (null != raider.victoryAnimation) {
                    raider.victoryAnimation.a423((byte)(-19));
                }
                if (null != raider.defeatAnimation) {
                    raider.defeatAnimation.a423((byte)(-19));
                }
                if (null != raider._deathAnimation) {
                    raider._deathAnimation.a423((byte)(-19));
                }
            }
        }
        final Trap[] i = gh_.traps;
        for (int n2 = 0; i.length > n2; ++n2) {
            final Trap ac_ = i[n2];
            if (ac_ != null) {
                if (ac_.idleAnimation != null) {
                    ac_.idleAnimation.a423((byte)(-19));
                }
                if (ac_.victoryAnimation != null) {
                    ac_.victoryAnimation.a423((byte)(-19));
                }
                if (ac_.defeatAnimation != null) {
                    ac_.defeatAnimation.a423((byte)(-19));
                }
            }
        }
        System.gc();
    }
    
    static final Graphic a091(final int n, final int n2) {
        final Graphic cn_ = new Graphic(n2, n2);
        for (int n3 = 0; cn_._B.length > n3; ++n3) {
            cn_._B[n3] = n;
        }
        return cn_;
    }
    
    static final Room a167(final boolean b, final ec_ ec_, final boolean b2) {
        if (b2) {
            a167(false, null, true);
        }
        final Room ai_ = new Room(ec_.readByte()); //tile?
        ai_.attack2 = ec_.readByte();
        ai_.defence2 = ec_.readByte();
        ai_.snare2 = ec_.readByte();
        ai_.detect2 = ec_.readByte();
        if (!b) {
            ai_.attack1 = ec_.readByte();
            ai_.defence1 = ec_.readByte();
            ai_.snare1 = ec_.readByte();
            ai_.detect1 = ec_.readByte();
        }
        return ai_;
    }
    
    static {
        bl_._n = new int[] { 6, 11, 12, 13, 7 };
        bl_.random = new Random();
        bl_.text_limit_reached_long = "<col=FF0000>Free players are limited to a maximum of 5 Orbs of this type.<%0></col>";
        bl_._c = 0;
        bl_.next = "Next";
    }
}
