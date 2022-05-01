final class RaidMember
{
	//original name: _n
    Raider raider;
    //original name: _c
    int raiderId;
    int _p;
    //original name: _l
    static String text_search;
    static int[] _m;
    RaidMemberStatusIcon[] _i;
    //original name: _o
    //enum candidate
    int status; //1 = ability used, 2 = incapacitated, 4 = dead
    wd_ _b;
    //original name: _j
    int position;
    //original name: _e
    int attack;
    //original name: _k
    int sneak;
    //original name: _g
    int defence;
    int _d;
    //original name: _f
    int dodge;
    //original name: _h
    static String raging_beast;
    static bb_ _a;
    
    public static void a423(final byte b) {
        RaidMember._a = null;
        if (b != 3) {
            a423((byte)75);
        }
        RaidMember.raging_beast = null;
        RaidMember.text_search = null;
        RaidMember._m = null;
    }
    
    static final int[] a464(final int n) {
        int n2 = n;
        int n3 = 0;
        while (-1 != (n2 = jb_._Sb[n2])) {
            ++n3;
        }
        final int[] array = new int[n3];
        for (int n4 = n; -1 != jb_._Sb[n4]; n4 = jb_._Sb[n4]) {
            array[--n3] = n4;
        }
        return array;
    }
    
    final void a487(final boolean b) {
        this.status &= 0xFFFFFFFD;
        this._p = 255;
        this.status |= 0x4;
        if (b) {
            a423((byte)103);
        }
    }
    
    static final void a245(final ec_ ec_, final qg_ qg_, final int n) {
        final oe_ oe_ = new oe_();
        oe_._q = ec_.readByte();
        oe_._j = ec_.readInt();
        oe_._o = new pn_[oe_._q];
        oe_._l = new int[oe_._q];
        oe_._k = new byte[oe_._q][][];
        oe_._s = new pn_[oe_._q];
        oe_._r = new int[oe_._q];
        oe_._n = new int[oe_._q];
        for (int i = 0; i < oe_._q; ++i) {
            try {
                final int c474 = ec_.readByte();
                if (c474 != 0 && c474 != 1 && 2 != c474) {
                    if (c474 == 3 || 4 == c474) {
                        final String d738 = ec_.d738();
                        final String d739 = ec_.d738();
                        final int j = ec_.readByte();
                        final String[] array = new String[j];
                        for (int k = 0; k < j; ++k) {
                            array[k] = ec_.d738();
                        }
                        final byte[][] array2 = new byte[j][];
                        if (3 == c474) {
                            for (int n2 = 0; j > n2; ++n2) {
                                final int h137 = ec_.readInt();
                                ec_.a286(0, h137, array2[n2] = new byte[h137]);
                            }
                        }
                        oe_._n[i] = c474;
                        final Class[] array3 = new Class[j];
                        for (int n3 = 0; j > n3; ++n3) {
                            array3[n3] = al_.a078(array[n3]);
                        }
                        oe_._o[i] = qg_.a594(array3, al_.a078(d738), -1, d739);
                        oe_._k[i] = array2;
                    }
                }
                else {
                    final String d740 = ec_.d738();
                    final String d741 = ec_.d738();
                    int h138 = 0;
                    if (c474 == 1) {
                        h138 = ec_.readInt();
                    }
                    oe_._n[i] = c474;
                    oe_._l[i] = h138;
                    oe_._s[i] = qg_.a534(65535, al_.a078(d740), d741);
                }
            }
            catch (ClassNotFoundException ex) {
                oe_._r[i] = -1;
            }
            catch (SecurityException ex2) {
                oe_._r[i] = -2;
            }
            catch (NullPointerException ex3) {
                oe_._r[i] = -3;
            }
            catch (Exception ex4) {
                oe_._r[i] = -4;
            }
            catch (Throwable t) {
                oe_._r[i] = -5;
            }
        }
        fe_._k.a865(oe_);
    }
    
    static final byte a770(final char c) {
        byte b;
        if (('\0' < c && c < '\u0080') || (c >= ' ' && '\u00ff' >= c)) {
            b = (byte)c;
        }
        else if ('\u20ac' != c) {
            if ('\u201a' != c) {
                if ('\u0192' != c) {
                    if (c != '\u201e') {
                        if (c == '\u2026') {
                            b = -123;
                        }
                        else if (c != '\u2020') {
                            if ('\u2021' == c) {
                                b = -121;
                            }
                            else if (c != '\u02c6') {
                                if ('\u2030' != c) {
                                    if (c != '\u0160') {
                                        if (c == '\u2039') {
                                            b = -117;
                                        }
                                        else if (c != '\u0152') {
                                            if ('\u017d' == c) {
                                                b = -114;
                                            }
                                            else if (c == '\u2018') {
                                                b = -111;
                                            }
                                            else if ('\u2019' != c) {
                                                if (c != '\u201c') {
                                                    if (c == '\u201d') {
                                                        b = -108;
                                                    }
                                                    else if ('\u2022' != c) {
                                                        if (c == '\u2013') {
                                                            b = -106;
                                                        }
                                                        else if ('\u2014' != c) {
                                                            if (c == '\u02dc') {
                                                                b = -104;
                                                            }
                                                            else if ('\u2122' == c) {
                                                                b = -103;
                                                            }
                                                            else if ('\u0161' == c) {
                                                                b = -102;
                                                            }
                                                            else if (c != '\u203a') {
                                                                if (c != '\u0153') {
                                                                    if (c != '\u017e') {
                                                                        if (c == '\u0178') {
                                                                            b = -97;
                                                                        }
                                                                        else {
                                                                            b = 63;
                                                                        }
                                                                    }
                                                                    else {
                                                                        b = -98;
                                                                    }
                                                                }
                                                                else {
                                                                    b = -100;
                                                                }
                                                            }
                                                            else {
                                                                b = -101;
                                                            }
                                                        }
                                                        else {
                                                            b = -105;
                                                        }
                                                    }
                                                    else {
                                                        b = -107;
                                                    }
                                                }
                                                else {
                                                    b = -109;
                                                }
                                            }
                                            else {
                                                b = -110;
                                            }
                                        }
                                        else {
                                            b = -116;
                                        }
                                    }
                                    else {
                                        b = -118;
                                    }
                                }
                                else {
                                    b = -119;
                                }
                            }
                            else {
                                b = -120;
                            }
                        }
                        else {
                            b = -122;
                        }
                    }
                    else {
                        b = -124;
                    }
                }
                else {
                    b = -125;
                }
            }
            else {
                b = -126;
            }
        }
        else {
            b = -128;
        }
        return b;
    }
    
    final void a150(final int p) {
        this.status |= 0x2;
        this._p = p;
    }
    
    //original signature: hb_(final int j, final int c) {
    RaidMember(final int position, final int raiderId) {
        this.position = position;
        this.raiderId = raiderId;
        this.raider = hp_.raiders[this.raiderId];
        this._p = 0;
        this.status = 0;
        if (this.raider != null) {
            this.sneak = this.raider.sneak;
            this.defence = this.raider.defence;
            this.attack = this.raider.attack;
            this.dodge = this.raider.dodge;
        }
    }
    
    static {
        RaidMember.text_search = "Search";
        RaidMember.raging_beast = "Raging Beast";
        RaidMember._m = new int[] { 1, 2, 3, 5, 10, 15, 25, 50 };
    }
}
