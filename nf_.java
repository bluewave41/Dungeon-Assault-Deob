final class nf_ extends ll_
{
    int[] _D;
    //original name: _w
    static String tip_bottomless_pit;
    static int _y;
    static boolean _A;
    //original name: _C
    static String[] tutorial_welcome2;
    private String[] _z;
    static q_[] _v;
    private int[][] _B;
    //original name: _x
    static String text_sneak;
    private int[] _E;
    
    public static void e423() {
        nf_.tip_bottomless_pit = null;
        nf_.tutorial_welcome2 = null;
        nf_._v = null;
        nf_.text_sneak = null;
    }
    
    static final void d150(final int kb) {
        o_._o.b150(-92);
        for (int i = 0; i < 32; ++i) {
            id_.times[i] = 0L;
        }
        for (int j = 0; j < 32; ++j) {
            jf_.times[j] = 0L;
        }
        nk_._Kb = kb;
    }
    
    //original signature: final String c983(final byte b) {
    final String c983() {
        final StringBuilder sb = new StringBuilder(80);
        if (this._z == null) {
            return "";
        }
        sb.append(this._z[0]);
        for (int n = 1; this._z.length > n; ++n) {
            sb.append("...");
            sb.append(this._z[n]);
        }
        return sb.toString();
    }
    
    final void a603(final ec_ ec_, final int n) {
        if (n != -1) {
            return;
        }
        while (true) {
            final int c474 = ec_.readByte();
            if (c474 == 0) {
                break;
            }
            this.a994(ec_, 32768, c474);
        }
    }
    
    final void d423(final byte b) {
        if (b > -4) {
            nf_.tip_bottomless_pit = null;
        }
        if (this._D != null) {
            for (int i = 0; i < this._D.length; ++i) {
                this._D[i] = mp_.or(this._D[i], 32768);
            }
        }
    }
    
    static final int[] a197(final DungeonPath wm_, final int n) {
        int i = 0;
        if (0 != n % 7 && wm_.a370(-(n / 7) + (n - 1))) {
            ia_._S[i++] = n - 1;
        }
        if (n > 6 && wm_.a370(n + 35)) {
            ia_._S[i++] = n - 7;
        }
        if (n % 7 != 6) {
            if (wm_.a370(n - n / 7)) {
                ia_._S[i++] = 1 + n;
            }
        }
        if (42 > n) {
            if (wm_.a370(n + 42)) {
                ia_._S[i++] = n + 7;
            }
        }
        final int[] array = new int[i];
        for (int n2 = 0; i > n2; ++n2) {
            array[n2] = ia_._S[n2];
        }
        return array;
    }
    
    private final void a994(final ec_ ec_, final int n, final int n2) {
        if (n2 != 1) {
            if (2 != n2) {
                if (3 == n2) {
                    final int c474 = ec_.readByte();
                    this._E = new int[c474];
                    this._B = new int[c474][];
                    for (int i = 0; i < c474; ++i) {
                        final int k137 = ec_.readShort();
                        final ad_ a483 = qd_.a483(k137);
                        if (a483 != null) {
                            this._E[i] = k137;
                            this._B[i] = new int[a483._a];
                            for (int j = 0; j < a483._a; ++j) {
                                this._B[i][j] = ec_.readShort();
                            }
                        }
                    }
                }
                else if (n2 == 4) {}
            }
            else {
                final int l = ec_.readByte();
                this._D = new int[l];
                for (int n3 = 0; l > n3; ++n3) {
                    this._D[n3] = ec_.readShort();
                }
            }
        }
        else {
            this._z = ih_.split('<', ec_.d738());
        }
        if (n != 32768) {
            this.d423((byte)59);
        }
    }
    
    static final void a096(int n, String s) {
        he_._s = false;
        cd_._b = false;
        if (a_._n != null) {
            if (a_._n._T) {
                if (n == 8) {
                    n = 2;
                    if (qc_._t) {
                        s = d_.invalidpass;
                    }
                    else {
                        s = fk_.invaliduserorpass;
                    }
                    wo_._e.a984(co_.username);
                }
                boolean b = true;
                if (10 == n) {
                    rp_.a423();
                    b = false;
                }
                if (b) {
                    if (he_._s) {
                        s = jk_.replacePlaceholders(new String[] { s }, oi_.connectionlost_withreason);
                    }
                    if (jd_._l) {
                        s = kk_.pleasetryagain;
                    }
                    a_._n.a013(26889, s, n);
                }
                if (256 != n && 10 != n && !qc_._t) {
                    wo_._e.i150(22377);
                }
            }
        }
    }
    
    static final String a408(final CharSequence[] array) {
        return ef_.a545(0, 39, array, array.length);
    }
    
    static {
        nf_.tutorial_welcome2 = new String[] { "Raiding", "Raiding a Dungeon.<br><br>At the centre of each dungeon is the <%highlight>hoard room</col>, where your rival Dragon sleeps upon his treasures. The dungeon can be entered at any of the four corner tiles.<br><br><%command>Select one of the highlighted entrances to begin your assault.</col>" };
        nf_.tip_bottomless_pit = "<col=FF0000>Lethal</col>, even if abilities would prevent death.";
        nf_.text_sneak = "Sneak";
        nf_._y = -1;
    }
}
