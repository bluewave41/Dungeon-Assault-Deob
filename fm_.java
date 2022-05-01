final class fm_
{
    static int _e;
    static md_ _b;
    private fm_ _c;
    static int[] _h;
    static gb_ _f;
    //original name: _l
    static String tip_corrosive_slime;
    //original name: _j
    static String create_alert_passlength;
    //original name: _d
    static String desc_orc_warrior;
    static int _a;
    static int _g;
    private k_ _k;
    
    //original signature: static final Graphic b251(final int n, final int n2) {
    static final Graphic getPieceForRaider(final int raiderId) {
        if (0 == raiderId) {
            return null;
        }
        if (1 == raiderId) {
            return tn_.piece_goblin_club;
        }
        if (2 == raiderId) {
            return qd_.piece_saurus_spawn;
        }
        if (3 == raiderId) {
            return hl_.piece_goblin_cleaver;
        }
        if (raiderId == 4) {
            return lj_.piece_ork_mace;
        }
        if (5 == raiderId) {
            return in_.piece_witch;
        }
        if (6 == raiderId) {
            return ia_.piece_beastman;
        }
        if (7 == raiderId) {
            return sp_.piece_saurus_imp;
        }
        if (8 == raiderId) {
            return ub_.piece_merc;
        }
        if (9 == raiderId) {
            return cg_.piece_priest;
        }
        if (10 == raiderId) {
            return kf_.piece_ork_blademaster;
        }
        if (11 == raiderId) {
            return jl_.piece_goblin_scout;
        }
        if (12 == raiderId) {
            return g_.piece_necromancer;
        }
        if (13 == raiderId) {
            return ef_.piece_ogre;
        }
        if (raiderId == 14) {
            return ie_.piece_enchantress;
        }
        if (raiderId == 15) {
            return na_.piece_saurus_warrior;
        }
        if (raiderId == 16) {
            return le_.piece_ork_shaman;
        }
        if (17 == raiderId) {
            return gd_.piece_troll;
        }
        if (18 == raiderId) {
            return df_.piece_northman;
        }
        if (19 == raiderId) {
            return bj_.piece_dwarf;
        }
        if (raiderId == 20) {
            return m_.piece_thief;
        }
        if (raiderId == 21) {
            return up_.piece_zealot;
        }
        if (raiderId == 22) {
            return ll_.piece_darkelf;
        }
        if (23 == raiderId) {
            return jc_.piece_baeserker;
        }
        if (24 == raiderId) {
            return ef_.piece_ogre;
        }
        if (25 == raiderId) {
            return DungeonAssault.piece_spy;
        }
        if (raiderId == 27) {
            return ld_.piece_blackknight;
        }
        if (raiderId == 28) {
            return fn_.piece_minotaur;
        }
        if (raiderId == 31) {
            return ld_.piece_blackknight;
        }
        if (33 == raiderId) {
            return oo_.piece_pitdemon;
        }
        if (raiderId == 34) {
            return fp_.piece_dryhad;
        }
        if (21 == raiderId) {
            return up_.piece_zealot;
        }
        return tn_.piece_goblin_club;
    }
    
    static final void a974(final int[][] array, final int n, final int n2) {
        if (null == uc_._E || n2 * n != uc_._E._c.length) {
            final int[] array2 = new int[64];
            for (int i = 0; i < 64; ++i) {
                array2[i] = mp_.or(65793 * (i + 24), Integer.MIN_VALUE);
            }
            uc_._E = new ph_(te_.a983(n, n2, array2, 16, 8, 0.125), te_.b285(n, n2, 0.125));
        }
        final int n3 = -(n / 2) + 320;
        final int n4 = -(n2 / 2) + 240;
        uc_._E.drawImage(n3, n4);
        gf_.b050(n3, n4, n, n2, 6637335);
        qe_.b370(n3, n4, n, n2, 8421504, 128, 128);
        final int n5 = be_._o.imageWidth / 2;
        final int n6 = bk_.cracked_bar.imageHeight / 2;
        vd_.a669(n, 1, 1, n3, n4 - n6);
        vd_.a669(n, 1, 1, n3, -n6 + n4 + n2);
        jc_.a669(n2, n3 - n5, n4, 1, 2, 1);
        jc_.a669(n2, n3 - (n5 - n), n4, 1, 2, 1);
        final int n7 = 37;
        final int n8 = 20;
        final int n9 = -n8 + n3;
        final int n10 = -n7 + n4;
        final int n11 = -oe_.interface_dragon.imageWidth + (n8 + n + n3);
        oe_.interface_dragon.h093(n9, n10);
        final int n12 = n4 - n7;
        oe_.interface_dragon.j093(n11, n12);
        jn_._n.b150(486513968);
        final int n13 = 14;
        final int n14 = 37;
        final int n15 = jn_._n._j >> 16;
        final int n16 = jn_._n._t >> 16;
        jn_._n._v.a093(n9 + n14 - n16, n13 + n10 - n15);
        jn_._n._v.b093(n11 + oe_.interface_dragon.imageWidth - jn_._n._v._h - n14 + n16, -n15 + (n13 + n12));
        if (array != null) {
            for (int n17 = 0; array.length > n17; ++n17) {
                if (array[n17] != null) {
                    int n18 = array[n17][0];
                    int n19 = array[n17][1];
                    int n20 = array[n17][2];
                    n20 -= 4;
                    n19 += 2;
                    int n21 = array[n17][3];
                    n18 += 2;
                    n21 -= 4;
                    gf_.e115(n18, n19, n20 + n18, n19 + n21);
                    en_.a775(n18, n20, 4 + n21, n19);
                    gf_.b797();
                    rp_.a857(4, n20, (byte)108, n18, n21, kc_._S, n19);
                }
            }
        }
        final qe_ qe_ = bf_._f[mn_._b];
        qe_.e797();
    }
    
    //original signature: static final boolean a599(final ec_ ec_) {
    static final boolean isNextByteZero(final ec_ ec_) {
        return 1 == ec_.readByte();
    }
    
    static final boolean a427() {
        return null != na_._D && na_._D.i149(32) != null;
    }
    
    //original signature: static final int a552(final int i, final int n, final byte[] array) {
    static final int calculateChecksum(final int i, final int n, final byte[] array) {
        int n2 = -1;
        for (int n3 = n; i > n3; ++n3) {
            n2 = (n2 >>> 8 ^ ih_._J[0xFF & (n2 ^ array[n3])]);
        }
        return ~n2;
    }
    
    //original signature: public static void a487(final boolean b) {
    public static void a487() {
        fm_._f = null;
        fm_.tip_corrosive_slime = null;
        fm_.desc_orc_warrior = null;
        fm_._b = null;
        fm_._h = null;
        fm_.create_alert_passlength = null;
    }
    
    //original signature: final String a772(final String s, final int n) {
    final String a772(final String s) {
        k_ k_ = this._k;
        while (k_ != null) {
            if (s.equals(k_._g)) {
                return k_._i;
            }
            k_ = k_._d;
        }
        if (null == this._c) {
            return null;
        }
        return this._c.a772(s);
    }
    
    final void a018(final String i, final int n, final String s) {
        for (k_ k_ = this._k; null != k_; k_ = k_._d) {
            if (s.equals(k_._g)) {
                k_._i = i;
                return;
            }
        }
        this._k = new k_(s, i, this._k);
    }
    
    final String a803(final String s, final byte b) {
        if (null != s) {
            final StringBuilder sb = new StringBuilder(s.length());
            if (b != -48) {
                getPieceForRaider(-72);
            }
            final String s2 = "<%";
            final String s3 = ">";
            int index2;
            for (int i = 0, length = s.length(); i < length; i = index2 + 1) {
                final int index = s.indexOf(s2, i);
                if (0 > index) {
                    sb.append(s.substring(i, length));
                    break;
                }
                sb.append(s.substring(i, index));
                final int n = index;
                index2 = s.indexOf(s3, n + 2);
                if (index2 < 0) {
                    sb.append(s.substring(n, length));
                    break;
                }
                final String a772 = this.a772(s.substring(2 + n, index2));
                if (a772 != null) {
                    sb.append(a772);
                }
            }
            return sb.toString();
        }
        return null;
    }
    
    static final void a093(final int n) {
        ba_.a787(null, (byte)59, n);
    }
    
    public fm_() {}
    
    fm_(final fm_ c) {
        this._c = c;
    }
    
    static {
        fm_.tip_corrosive_slime = "May avoid combat.";
        fm_.desc_orc_warrior = "The orc warrior's weapon and armour may be battered from his years of war, he remains a competent if unspectacular fighter.";
        fm_._a = 0;
        fm_._h = new int[8192];
        fm_.create_alert_passlength = "Passwords must be between 5 and 20 characters long";
    }
}
