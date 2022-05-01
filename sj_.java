abstract class sj_ extends rf_
{
    private int _ab;
    private int _gb;
    private int _Z;
    static ad_ _hb;
    private int _X;
    private int _Y;
    static int _bb;
    private int _fb;
    static int[] _db;
    //original name: _V
    static String idlemessage20min;
    //original signature: _cb
    static String[] connectingToUpdateServerTranslatedStrings;
    //original name: _W
    static String text_my_profile;
    //original name: _eb
    static String desc_pit_demon;
    
    static final gd_ a921(final int n, final int n2, final int n3, final Graphic cn_, final nn_ nn_) {
        if (n2 <= 82) {
            sj_._hb = null;
        }
        final Graphic a575 = fk_.a575(cn_, 192, 12690143);
        final Graphic a576 = GUICheckbox.a551(16, a575, 255, (byte)(-53));
        final Graphic a577 = fk_.a575(cn_, 192, 16744448);
        final gd_ gd_ = new gd_(cn_, a575, a576, a577, GUICheckbox.a551(16, a577, 16711680, (byte)92), n, n3);
        nn_.a507(gd_);
        return gd_;
    }
    
    sj_(final ji_ ji_, final int n, final int n2) {
        super(ji_, n, n2);
        this._ab = 0;
        this._Z = 0;
    }
    
    final void b115(final int x, final int z, final int gb, final int n) {
        if (0 >= z) {
            this.b326(-15, gb, x);
            return;
        }
        this._Y = super.componentHeight;
        this._fb = super.componentWidth;
        this._X = x;
        this._gb = gb;
        this._ab = 0;
        this._Z = z;
        if (n != 22284) {
            this.h423((byte)(-56));
        }
    }
    
    void k150(final int n) {
        if (n != 0) {
            a887(-37, 39, -112, 81, null, null);
        }
    }
    
    public static void g423() {
        sj_._hb = null;
        sj_.text_my_profile = null;
        sj_._db = null;
        sj_.desc_pit_demon = null;
        sj_.idlemessage20min = null;
        sj_.connectingToUpdateServerTranslatedStrings = null;
    }
    
    //original signature: static final String l738(final int n) {
    static final String l738() {
        String s = "(" + wl_._f + " " + oc_._E + " " + rd_._C + ") " + hc_.loginStatusCode;
        if (0 < nj_._b) {
            s += ":";
            for (int i = 0; i < nj_._b; ++i) {
                final String string = s + ' ';
                final int n2 = 0xFF & ra_._c.buffer[i];
                int n3 = n2 >> 4;
                int n4 = n2 & 0xF;
                if (n3 >= 10) {
                    n3 += 55;
                }
                else {
                    n3 += 48;
                }
                if (n4 < 10) {
                    n4 += 48;
                }
                else {
                    n4 += 55;
                }
                s = string + (char)n3 + (char)n4;
            }
        }
        return s;
    }
    
    static final pp_ a595(final Graphic cn_, final int n) {
        jh_.c797();
        final Graphic cn_2 = new Graphic(cn_.imageWidth, cn_.imageHeight);
        final Graphic cn_3 = new Graphic(cn_.imageWidth, cn_.imageHeight);
        cn_2.e797();
        cn_.e326(0, 0, 16744448);
        cn_3.e797();
        cn_.e326(0, 0, 8421504);
        jh_.b797();
        final Graphic a551 = GUICheckbox.a551(8, cn_2, 255, (byte)(-116));
        if (n <= 4) {
            sj_._hb = null;
        }
        return new pp_(cn_, cn_3, cn_2, a551, 0, 30);
    }
    
    void h423(final byte b) {
        if (this._Z > 0) {
            this.b326(119, this._gb, this._X);
            this.k150(this._Z = 0);
        }
    }
    
    @Override
    boolean i154(final int n) {
        this.h423((byte)(-61));
        if (n != 462) {
            this.h423((byte)(-64));
        }
        return super.i154(n + 0);
    }
    
    @Override
    boolean f427(final byte b) {
        if (b != -90) {
            this.i154(-114);
        }
        if (0 < this._Z) {
            int x = this._X;
            int gb = this._gb;
            if (this._Z <= ++this._ab) {
                this.k150(this._Z = 0);
            }
            else {
                final int n = this._ab * (2 * this._Z - this._ab);
                final int n2 = this._Z * this._Z;
                x = (-this._fb + this._X) * n / n2 + this._fb;
                gb = (this._gb - this._Y) * n / n2 + this._Y;
            }
            this.b326(15, gb, x);
        }
        return super.f427((byte)(-90));
    }
    
    static final void a887(final int n, final int n2, final int n3, final int n4, final String s, final String s2) {
        final Trap trap = gh_.traps[n2];
        if (null != trap) {
            if (n4 != 32) {
                a595(null, 111);
            }
            trap._a = ((null == s) ? null : hd_.a492(n3, "da_monster_" + s));
            trap._p = ((null != s2) ? hd_.a492(n, "da_monster_" + s2) : null);
        }
    }
    
    //original signature: static final boolean a454(final CharSequence charSequence, final int n) {
    static final boolean a454(final CharSequence charSequence) {
        return ah_.a098(charSequence, 10, true);
    }
    
    @Override
    //this is where logo frame is drawn
    void a663(final int n, final int n2, final boolean b) {
        gf_.c669(6 + n2, n + 35, super.componentWidth - 12, super.componentHeight - 40, 2105376, 0);
        final int n3 = 211;
        final int i = 35;
        final int n4 = 194;
        int n5 = 0;
        int n6 = n;
        while (i > n5) {
            if (n6 >= gf_._f) {
                if (gf_._e > n6) {
                    final int n7 = n3 + (-n3 + n4) * n5 / i;
                    int n8 = 0;
                    int x = super.componentWidth;
                    if (n5 <= 20) {
                        while (20 >= n8) {
                            final int n9 = (-n5 + 20) * (-n5 + 20) + (20 - n8) * (20 - n8);
                            if (462 >= n9) {
                                if (420 > n9) {
                                    break;
                                }
                                final int n10 = n7 * (462 - n9) / 42;
                                gf_._b[n6 * gf_._i + (n2 + n8)] = (n10 | (n10 << 8 | n10 << 16));
                            }
                            ++n8;
                        }
                    }
                    if (20 >= n5) {
                        int n11 = x;
                        x -= 21;
                        for (int j = 0; j <= 20; ++j, ++x) {
                            final int n12 = (20 - n5) * (20 - n5) + j * j;
                            if (462 < n12) {
                                break;
                            }
                            if (n12 >= 420) {
                                final int n13 = n7 * (-n12 + 462) / 42;
                                gf_._b[gf_._i * n6 + n2 + x] = (n13 | (n13 << 16 | n13 << 8));
                            }
                            else {
                                n11 = x + 1;
                            }
                        }
                        x = n11;
                    }
                    gf_.b115(n2 + n8, n6, x - n8, n7 | (n7 << 8 | n7 << 16));
                }
            }
            ++n6;
            ++n5;
        }
        final int n14 = 169;
        final int k = 22;
        final int n15 = 194;
        for (int n16 = 0, n17 = 35 + n; k > n16; ++n16, ++n17) {
            final int n18 = (-n15 + n14) * n16 / k + n15;
            final int n19 = n18 | (n18 << 8 | n18 << 16);
            gf_.b115(n2, n17, 6, n19);
            gf_.b115(super.componentWidth + (n2 - 6), n17, 6, n19);
        }
        bl_.jagex_logo_grey.drawImage(super.componentWidth + n2 - 90, n + 10);
        jm_.a660(n2 + 5, super.componentWidth - 10, gn_.frame_top, 0, 35 + n);
        jm_.a660(n2, super.componentWidth, RenownTableEntry.frame_bottom, 0, super.componentHeight + n - 22);
        final int n20 = 127;
        final int l = super.componentHeight - 79;
        final int n21 = 169;
        int n22 = 0;
        int n23 = n + 57;
        if (b) {
            this.h423((byte)25);
        }
        while (l > n22) {
            final int n24 = n21 + n22 * (-n21 + n20) / l;
            final int n25 = n24 | (n24 << 16 | n24 << 8);
            gf_.b115(n2, n23, 6, n25);
            gf_.b115(n2 + super.componentWidth - 6, n23, 6, n25);
            ++n22;
            ++n23;
        }
    }
    
    static {
        sj_._bb = 64;
        sj_._hb = new ad_(14, 1);
        sj_.text_my_profile = "Dungeon and Stable";
        sj_.connectingToUpdateServerTranslatedStrings = new String[] { "Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise \u00e0 jour", "Conectando ao servidor de atualiza\u00e7\u00e3o", "Met updateserver verbinden", "Connecting to update server (untranslated)" };
        sj_.desc_pit_demon = "While demon lords are still a raider's worst nightmare, pit demons are still very, very bad dreams.";
        sj_.idlemessage20min = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
