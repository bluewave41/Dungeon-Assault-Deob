final class fc_ extends en_
{
    static int[] _g;
    //original name: _f
    private RaidMember raidMember;
    //original name: _e
    static String text_monster_failed_to_trap;
    //original name: _h
    static String desc_priest;
    static volatile int _m;
    static int _d;
    //original name: _k
    private Raider raider;
    private pj_ _i;
    //original name: _l
    static String loginm2;
    //original name: _j
    static String fs_button_tryagain;
    
    private final Graphic a251(final int n, final int n2) {
        jh_.c797();
        final String[] a782 = jn_.a782(this.raider.description, new int[] { n2 }, -102, la_.roman12);
        String[] a783 = null;
        String[] a784 = null;
        final String[][] array = new String[this.raider.passiveAbilities.length][];
        final String[][] array2 = new String[this.raider.passiveAbilities.length][];
        int n3 = la_.roman12._E + (a782.length + 2) * la_.roman12._H;
        final int h = la_.roman12._H;
        final boolean b = null != this._i && this._i.b121(0, this.raidMember);
        final boolean b2 = null != this._i && this.raidMember == this._i.activeRaidMember;
        final RaidMemberStatusIcon[] array3 = (RaidMemberStatusIcon[])((null != this.raidMember) ? this.raidMember._i : null);
        if (array3 != null) {
            n3 += db_.roman12bold._H * (1 + array3.length);
        }
        if (this.raider.activeAbility != -1) {
            final String a785 = jk_.replacePlaceholders(new String[] { this.raider.name.toUpperCase() }, "<col=178B8B><%0></col>");
            final String[] d = this.raider.abilityTexts;
            final String a786 = jk_.replacePlaceholders(new String[] { d[0] }, lc_.text_active_ability);
            final String a787 = GUIButton._H.a803(jk_.replacePlaceholders(new String[] { a785 }, d[1]), (byte)(-48));
            a783 = jn_.a782(a786, new int[] { n2 }, -118, la_.roman12);
            a784 = jn_.a782(a787, new int[] { n2 }, -75, la_.roman12);
            n3 += la_.roman12._H * (a784.length + (a783.length + 2));
            if (b) {
                n3 += db_.roman12bold._H;
            }
        }
        for (int n4 = 0; this.raider.passiveAbilities.length > n4; ++n4) {
            final String a788 = jk_.replacePlaceholders(new String[] { this.raider.name.toUpperCase() }, "<col=FF8000><%0></col>");
            final String[] array4 = this.raider.passiveAbilityTexts[n4];
            final String a789 = jk_.replacePlaceholders(new String[] { array4[0] }, rm_.text_passive_ability);
            final String a790 = GUIButton._H.a803(jk_.replacePlaceholders(new String[] { a788 }, array4[1]), (byte)(-48));
            array[n4] = jn_.a782(a789, new int[] { n2 }, -80, la_.roman12);
            array2[n4] = jn_.a782(a790, new int[] { n2 }, md_.xor(n, -16777100), la_.roman12);
            n3 += (2 + array[n4].length + array2[n4].length) * la_.roman12._H;
        }
        if (b2) {
            n3 += 2 * db_.roman12bold._H;
        }
        final Graphic cn_ = new Graphic(n2, n3);
        cn_.e797();
        db_.roman12bold.c191(this.raider.name.toUpperCase(), n2 >> 1, h, n, -1);
        int n5 = h + la_.roman12._H * 2;
        final String[] array5 = a782;
        for (int n6 = 0; array5.length > n6; ++n6) {
            la_.roman12.c191(array5[n6], n2 >> 1, n5, 16777215, -1);
            n5 += la_.roman12._H;
        }
        if (null != array3) {
            n5 += la_.roman12._H;
            final RaidMemberStatusIcon[] array6 = array3;
            for (int n7 = 0; array6.length > n7; ++n7) {
                final RaidMemberStatusIcon wb_ = array6[n7];
                final int n8 = db_.roman12bold.b926(wb_.text) + 24;
                wb_.icon.c326(n2 - n8 >> 1, -(-wb_.icon.imageHeight + 3 * la_.roman12._H >> 1) + n5, wb_._a);
                db_.roman12bold.b191(wb_.text, (-n8 + n2 >> 1) + 24, n5, wb_._a, -1);
                n5 += la_.roman12._H;
            }
        }
        if (b2) {
            final int n9 = n5 + db_.roman12bold._H;
            db_.roman12bold.c191(od_.text_activeraider, n2 >> 1, n9, 16744448, -1);
            n5 = n9 + db_.roman12bold._H;
        }
        if (-1 != this.raider.activeAbility) {
            final String[] array7 = a783;
            for (int i = 0; i < array7.length; ++i) {
                final String s = array7[i];
                n5 += la_.roman12._H;
                db_.roman12bold.c191(s, n2 >> 1, n5, 1543051, -1);
            }
            if (b) {
                n5 += db_.roman12bold._H;
                db_.roman12bold.c191(g_.text_ability_ready, n2 >> 1, n5, 1543051, -1);
            }
            n5 += 2 * db_.roman12bold._H;
            final String[] array8 = a784;
            for (int n10 = 0; array8.length > n10; ++n10) {
                la_.roman12.c191(array8[n10], n2 >> 1, n5, 16777215, -1);
                n5 += la_.roman12._H;
            }
        }
        for (int j = 0; j < this.raider.passiveAbilities.length; ++j) {
            final String[] array9 = array[j];
            for (int n11 = 0; array9.length > n11; ++n11) {
                final String s2 = array9[n11];
                n5 += db_.roman12bold._H;
                db_.roman12bold.c191(s2, n2 >> 1, n5, 16744448, -1);
            }
            n5 += 2 * db_.roman12bold._H;
            final String[] array10 = array2[j];
            for (int k = 0; k < array10.length; ++k) {
                la_.roman12.c191(array10[k], n2 >> 1, n5, 16777215, -1);
                n5 += la_.roman12._H;
            }
        }
        jh_.b797();
        return cn_;
    }
    
    //original signature: static final boolean a370(final int n) {
    static final boolean isZeroOrGreater(final int n) {
        //return 0 <= n;
    	return n >= 0;
    }
    
    @Override
    final void a185(final int n, final sa_ sa_) {
        final Graphic a251 = this.a251(16777215, sa_._b - 40);
        if (n != 0) {
            return;
        }
        sa_.a098(a251, a251.imageHeight + 8, false, 110, -la_.roman12._H + sa_._y >> 1);
    }
    
    @Override
    final Graphic b373(final byte b) {
        jh_.c797();
        String[] a782 = null;
        final String[][] array = new String[this.raider.passiveAbilities.length][];
        int n = db_.roman12bold._E + db_.roman12bold._H;
        int h = db_.roman12bold._H;
        if (-1 != this.raider.activeAbility) {
            final String a783 = jk_.replacePlaceholders(new String[] { this.raider.name.toUpperCase() }, "<col=178B8B><%0></col>");
            final String[] c = this.raider.briefAbilityTexts;
            a782 = jn_.a782("<col=178B8B>" + c[0] + "</col> - " + GUIButton._H.a803(jk_.replacePlaceholders(new String[] { a783 }, c[1]), (byte)(-48)), new int[] { 200 }, -94, db_.roman12bold);
            n += db_.roman12bold._H * (1 + a782.length);
        }
        for (int i = 0; i < this.raider.passiveAbilities.length; ++i) {
            final String a784 = jk_.replacePlaceholders(new String[] { this.raider.name.toUpperCase() }, "<col=FF8000><%0></col>");
            final String[] array2 = this.raider.briefPassiveAbilityTexts[i];
            array[i] = jn_.a782("<col=FF8000>" + array2[0] + "</col> - " + GUIButton._H.a803(jk_.replacePlaceholders(new String[] { a784 }, array2[1]), (byte)(-48)), new int[] { 200 }, -95, db_.roman12bold);
            n += db_.roman12bold._H * (1 + array[i].length);
        }
        final Graphic cn_ = new Graphic(200, n);
        cn_.e797();
        db_.roman12bold.c191(this.raider.name, 100, h, 16777215, -1);
        if (-1 != this.raider.activeAbility) {
            h += db_.roman12bold._H;
            final String[] array3 = a782;
            for (int j = 0; j < array3.length; ++j) {
                final String s = array3[j];
                h += la_.roman12._H;
                db_.roman12bold.c191(s, 100, h, 16777215, -1);
            }
        }
        for (int n2 = 0; this.raider.passiveAbilities.length > n2; ++n2) {
            h += db_.roman12bold._H;
            final String[] array4 = array[n2];
            for (int k = 0; k < array4.length; ++k) {
                final String s2 = array4[k];
                h += db_.roman12bold._H;
                db_.roman12bold.c191(s2, 100, h, 16777215, -1);
            }
        }
        jh_.b797();
        return cn_;
    }
    
    public static void b150() {
        fc_.desc_priest = null;
        fc_.loginm2 = null;
        fc_.text_monster_failed_to_trap = null;
        fc_._g = null;
        fc_.fs_button_tryagain = null;
    }
    
    //original signature: static final void a540(final qk_ qk_, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final qk_ qk_2, final int n11, final int n12, final int n13, final se_ se_, final qk_ qk_3, final int n14, final se_ se_2, final int n15) {
    static final void a540(final qk_ qk_, final qk_ qk_2, final qk_ qk_3) {
        PlayerInformation.a583(ne_.roman20, ne_.roman20);
        mi_.a050(ne_.roman20._N, ne_.roman20._N + ne_.roman20._E, ne_.roman20._N, ne_.roman20._N + ne_.roman20._E);
        DungeonPath.a679();
        bk_.a750(qk_2, qk_);
        mn_.a051(0, qk_3, 0);
        tk_.a115(om_._a, sm_._c, he_._p);
    }
    
    //original signature: fc_(final pj_ i, final RaidMember f) {
    fc_(final pj_ i, final RaidMember raidMember) {
        this.raidMember = raidMember;
        this._i = i;
        this.raider = this.raidMember.raider;
    }
    
    //original signature: fc_(final Raider k) {
    fc_(final Raider raider) {
        this.raider = raider;
        this._i = null;
        this.raidMember = null;
    }
    
    static {
        fc_._g = new int[4];
        fc_.text_monster_failed_to_trap = "The monster failed to trap your raider.";
        fc_.desc_priest = "Serving one of the humans' innumerable dark gods, the priest brings a broad set of skills to any raiding party.";
        fc_._m = 0;
        fc_.fs_button_tryagain = "Try again";
        fc_.loginm2 = "Error connecting to server. Please try using a different server.";
    }
}
