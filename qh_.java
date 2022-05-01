final class qh_
{
    int _M;
    //original name: _q
    static Graphic scrollbar_slider;
    int[] _k;
    int[] _O;
    int[] _g;
    int[] _l;
    short[] _v;
    private boolean _f;
    int[] _m;
    short[] _e;
    byte[] _y;
    short[] _t;
    //original name: _D
    static String desc_razor_construct;
    int _p;
    short[] _F;
    short _B;
    short[] _N;
    //original name: _J
    static String[] intro_captions;
    short[] _n;
    int _H;
    short[] _s;
    short[] _o;
    short[] _A;
    short[] _x;
    int[] _u;
    short[] _Q;
    //original name: _R
    static String[] loadingTextTranslatedStrings;
    short[] _P;
    short[] _d;
    short[] _I;
    short _h;
    //original name: _E
    static String[] tutorial_construction1;
    int _i;
    int _b;
    int[] _K;
    short[] _C;
    static ja_ _G;
    int _a;
    //original name: _j
    static String text_limit_reached;
    short[] _z;
    byte _w;
    short[] _S;
    int[] _r;
    short[] _L;
    int[] _T;
    short _c;
    
    final void a483(final int n, final boolean b, final int n2, final int n3, final int n4) {
        for (short n5 = 0; this._B > n5; ++n5) {
            this._L[n5] = (short)(this._L[n5] * n4 / n);
            this._S[n5] = (short)(this._S[n5] * n2 / n);
            this._z[n5] = (short)(n3 * this._z[n5] / n);
        }
        if (b) {
            return;
        }
        this.b150(32767);
    }
    
    //original signature: static final void a726(final int n, final rj_ rj_, int n2) {
    static final void a726(final rj_ rj_, int n2) {
        if (!kn_.isTutorial) {
            return;
        }
        if (6 != n2) {
            if (8 == n2) {
                if (la_._f) {
                    la_._f = false;
                    n2 = 5;
                    o_.dungeonPath.a093(8);
                }
            }
            else if (n2 == 11) {
                if (o_.dungeonPath.a370(11)) {
                    ba_.a787(rj_, (byte)52, 12);
                    return;
                }
            }
        }
        else {
            if (la_._f) {
                la_._f = false;
                n2 = 4;
                o_.dungeonPath.a093(6);
            }
            else if (lk_._S > 0) {
                n2 = 7;
            }
            ++lk_._S;
        }
        if (!o_.dungeonPath.a370(n2)) {
            o_.dungeonPath.a093(n2);
            ba_.a787(rj_, (byte)90, n2); //reached hoard room
        }
    }
    
    private final void b150(final int n) {
        if (n != 32767) {
            this._Q = null;
        }
        this._f = false;
    }
    
    static final void a150(final int n) {
        gf_.e050(243, 197, 369, 143, 16777215);
        gf_.b050(244, 198, 367, 141, 0);
        if (n != 245) {
            qh_.loadingTextTranslatedStrings = null;
        }
        if (null == of_._q) {
            if (null != tg_.benefits_small_font) {
                tg_.benefits_small_font.a385(bg_.loading, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
        }
        final Graphic cn_ = of_._q[me_._f];
        if (cn_ != null) {
            cn_.drawImage(245, 199);
        }
        else if (tg_.benefits_small_font != null) {
            tg_.benefits_small_font.a385(bg_.loading, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
        }
        if (wf_._x < am_._g) {
            final Graphic cn_2 = of_._q[Room._n];
            if (cn_2 != null) {
                final int n2 = wf_._x * (cn_2.imageWidth2 + 60) / am_._g - 30;
                if (oo_._a) {
                    lg_.a494(-256 * n2 / 30, n + 65035, (-n2 + cn_2.imageWidth2) * 256 / 30, 199, 245, cn_2);
                }
                else {
                    lg_.a494((cn_2.imageWidth2 - n2) * 256 / 30, 65280, n2 * -256 / 30, 199, 245, cn_2);
                }
            }
        }
        if (tg_.benefits_small_font != null) {
            String s = null;
            for (int i = 0; i < of_._q.length; ++i) {
                final Graphic cn_3 = of_._q[i];
                if (null != cn_3) {
                    if (365 != cn_3.imageWidth2 || cn_3.imageHeight2 != 139) {
                        if (s != null) {
                            s = s + ", " + i;
                        }
                        else {
                            s = Integer.toString(i);
                        }
                    }
                }
            }
            if (null != s) {
                tg_.benefits_small_font.a385("Screenshot(s) " + s + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            }
        }
    }
    
    final void a115(final int n, final int n2, final int n3, final int n4) {
        for (int n5 = n; this._B > n5; ++n5) {
            final short[] l = this._L;
            final short n6 = (short)n5;
            l[n6] += (short)n2;
            final short[] s = this._S;
            final short n7 = (short)n5;
            s[n7] += (short)n4;
            final short[] z = this._z;
            final short n8 = (short)n5;
            z[n8] += (short)n3;
        }
        this.b150(32767);
    }
    
    final void a423(final byte b) {
        if (!this._f) {
            this._f = true;
            int h = 32767;
            int p = 32767;
            int a = 32767;
            int i = -32768;
            int m = -32768;
            int b2 = -32768;
            for (short n = 0; this._B > n; ++n) {
                final short n2 = this._L[n];
                final short n3 = this._S[n];
                final short n4 = this._z[n];
                if (n3 > m) {
                    m = n3;
                }
                if (n2 > i) {
                    i = n2;
                }
                if (n3 < p) {
                    p = n3;
                }
                if (h > n2) {
                    h = n2;
                }
                if (a > n4) {
                    a = n4;
                }
                if (b2 < n4) {
                    b2 = n4;
                }
            }
            if (b > -116) {
                this.a483(-99, true, -5, 127, 16);
            }
            this._M = m;
            this._b = b2;
            this._H = h;
            this._i = i;
            this._p = p;
            this._a = a;
        }
    }
    
    //original signature: static final int a602(final boolean b, final cd_ cd_, final cd_ cd_2) {
    static final int a602(final cd_ cd_, final cd_ cd_2) {
        return op_.a489(cd_, 0, 0, cd_2, null, -115, false);
    }
    
    //original signature: static final int a287(final byte[] array, final int n) {
    static final int calculateChecksum(final byte[] array, final int n) {
        return fm_.calculateChecksum(n, 0, array);
    }
    
    public static void b423(final byte b) {
        if (b != 75) {
            return;
        }
        qh_.tutorial_construction1 = null;
        qh_.desc_razor_construct = null;
        qh_.text_limit_reached = null;
        qh_.scrollbar_slider = null;
        qh_._G = null;
        qh_.intro_captions = null;
        qh_.loadingTextTranslatedStrings = null;
    }
    
    qh_() {
        this._f = false;
        this._w = 0;
    }
    
    static {
        qh_.desc_razor_construct = "The brass construction in this room is humanoid in design, but has razor-sharp blades in place of arms.<br><br>Defeated raiders permanently lose 2 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        qh_.loadingTextTranslatedStrings = new String[] { "Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto" };
        qh_.intro_captions = new String[] { "The land of Dungaria, home of the dragon.", "Once it was a battlefield, where dragons did wage war upon each other for pride and dominance.", "The world itself was in danger of destruction.", "Now the ancient dragons sleep in their subterranean lairs...", "...but still they battle, still they fight.", "Through the life and death of others, they seek gold and renown!", "Take upon yourself the mantle of dragonhood.", "Defend your hoard. Send forth your raiders. Battle your rivals...", "Become the Dragon King!" };
        qh_.tutorial_construction1 = new String[] { "Construction", "To prevent other players stealing your Treasure (and diminishing your Renown), you can place additional <%traps> and <%monsters> in your dungeon. Placing new dungeon rooms requires you to spend <%highlight>Treasure</highlight>. The total amount of <%highlight>Treasure</col> you have to spend is located at the <%highlight>bottom-right of this screen</col>." };
        qh_.text_limit_reached = "<col=FF0000>limit reached</col>";
    }
}
