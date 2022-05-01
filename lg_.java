import java.util.*;

final class lg_
{
    private int _c;
    //original name _o
    private Random random;
    //original name: _s
    static String fatal_brief;
    private int[] _i;
    private int[] _k;
    private int[] _g;
    private int[] _q;
    private int _y;
    int _j;
    private int _f;
    static ad_ _n;
    private int[] _p;
    //original name: _d
    static String[] ability_sacrifice_green;
    private int _b;
    static mj_[] _x;
    private int _a;
    private int _B;
    //original name: _r
    static String desc_necromancer;
    //original name: _e
    static String tip_rabid_wolf;
    int _t;
    private int _z;
    //original name: _u
    static Graphic benefits_menu_text;
    static String _m;
    q_ _v;
    //original name: _l
    static String fs_button_accept;
    private int _A;
    static ji_ _w;
    //original name: _h
    static String text_raider_recruitment;
    
    final void a430(int n, final boolean b) {
        for (int i = this._g.length - 1; i >= 0; --i) {
            if (this._k[i] > 0) {
                final int[] k = this._k;
                final int n2 = i;
                --k[n2];
                final int[] g = this._g;
                final int n3 = i;
                g[n3] += this._q[i];
                final int[] j = this._i;
                final int n4 = i;
                j[n4] += this._p[i];
                final int[] q = this._q;
                final int n5 = i;
                q[n5] += this._c;
                final int[] p2 = this._p;
                final int n6 = i;
                p2[n6] += this._a;
            }
            else if (0 <= --n) {
                this._g[i] = this._t + uj_.getRandom(this.random, this._f);
                this._i[i] = this._j + uj_.getRandom(this.random, this._B);
                this._q[i] = this._b + uj_.getRandom(this.random, this._y);
                this._p[i] = this._A + uj_.getRandom(this.random, this._z);
                this._k[i] = 50;
            }
        }
        if (b) {
            a494(54, -127, 107, -64, -29, null);
        }
    }
    
    static final char a537(final byte b) {
        int n = b & 0xFF;
        if (n != 0) {
            if (128 <= n) {
                if (n < 160) {
                    int n2 = mh_._d[n - 128];
                    if (n2 == 0) {
                        n2 = 63;
                    }
                    n = n2;
                }
            }
            return (char)n;
        }
        throw new IllegalArgumentException("" + Integer.toString(n, 16));
    }
    
    final void b150(final int n) {
        final int h = this._v._h;
        final int e = this._v._e;
        this._v.b797();
        final byte[] j = this._v._j;
        if (n != 486513968) {
            this.random = null;
        }
        for (int n2 = this._g.length - 1; 0 <= n2; --n2) {
            if (this._k[n2] > 0) {
                final int n3 = this._g[n2] >> 16;
                final int n4 = this._i[n2] >> 16;
                if (n3 >= 0 && h > n3 && n4 >= 0) {
                    if (e > n4) {
                        final int n5 = n3 + h * n4;
                        int n6 = (this._k[n2] >> 2) + j[n5];
                        if (255 < n6) {
                            n6 = 255;
                        }
                        j[n5] = (byte)n6;
                    }
                }
            }
        }
    }
    
    static final void a150() {
        final jd_ jd_ = (jd_)ta_._f.e024(); //useless
        if (jd_ != null) {
            final wj_ c = ra_._c;
            c.readInt(); //waste 4 ints
            c.readInt();
            c.readInt();
            c.readInt();
            jd_.a487(false); //useless
            return;
        }
        tl_.a150(-63);
    }
    
    public static void a487(final boolean b) {
        lg_._n = null;
        lg_._w = null;
        lg_.text_raider_recruitment = null;
        lg_.fs_button_accept = null;
        lg_.fatal_brief = null;
        lg_.tip_rabid_wolf = null;
        lg_.desc_necromancer = null;
        lg_._x = null;
        lg_.ability_sacrifice_green = null;
        lg_.benefits_menu_text = null;
        lg_._m = null;
        if (!b) {
            lg_.fs_button_accept = null;
        }
    }
    
    static final void a924(final int n, final String s, final int n2) {
        final Trap ac_ = gh_.traps[n2];
        if (ac_ == null) {
            return;
        }
        final Trap ac_2 = ac_;
        final Trap ac_3 = ac_;
        final AmbientAudioTrack a492 = hd_.a492(n, "da_trap_" + s);
        ac_3._a = a492;
        ac_2._x = a492;
    }
    
    static final void a494(final int n, final int n2, final int n3, int f, int i, final Graphic cn_) {
        final int n4 = (-n3 + n << 8) / cn_.imageWidth2;
        f += cn_._A;
        if (n2 != 65280) {
            a487(false);
        }
        int n5 = n4 * cn_._w + (n3 << 8);
        i += cn_._w;
        int n6 = i + f * gf_._i;
        int n7 = 0;
        int v = cn_.imageHeight;
        int y = cn_.imageWidth;
        int n8 = -y + gf_._i;
        int n9 = 0;
        if (f < gf_._f) {
            final int n10 = gf_._f - f;
            f = gf_._f;
            n6 += gf_._i * n10;
            v -= n10;
            n7 += n10 * y;
        }
        if (f + v > gf_._e) {
            v -= -gf_._e + f + v;
        }
        if (gf_._j > i) {
            final int n11 = gf_._j - i;
            n8 += n11;
            i = gf_._j;
            n5 += n4 * n11;
            n9 += n11;
            n6 += n11;
            n7 += n11;
            y -= n11;
        }
        if (gf_._h < i + y) {
            final int n12 = -gf_._h + (i + y);
            n9 += n12;
            n8 += n12;
            y -= n12;
        }
        if (y > 0 && v > 0) {
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            for (f = -v; 0 > f; ++f) {
                n13 = n5;
                for (i = -y; i < 0; ++i) {
                    n14 = n13 >> 8;
                    n15 = -n14 + 256;
                    n13 += n4;
                    if (0 > n14) {
                        ++n6;
                        ++n7;
                    }
                    else {
                        n16 = cn_._B[n7++];
                        if (n16 != 0) {
                            if (255 < n14) {
                                gf_._b[n6] = n16;
                            }
                            else {
                                n17 = gf_._b[n6];
                                gf_._b[n6] = (nb_.and(16711772, nb_.and(n16, 65280) * n14 + nb_.and(65280, n17) * n15) >> 8) + (0xFF00FF & n14 * (0xFF00FF & n16) + n15 * (n17 & 0xFF00FF) >> 8);
                            }
                        }
                        ++n6;
                    }
                }
                n6 += n8;
                n7 += n9;
            }
        }
    }
    
    lg_(final int t, final int j, final int f, final int b, final int b2, final int a, final int y, final int z, final int c, final int a2, final int n, final int n2) {
        this._B = b;
        this._k = new int[10000];
        this._f = f;
        this._c = c;
        this._p = new int[10000];
        this._t = t;
        this._g = new int[10000];
        this._q = new int[10000];
        this._z = z;
        this._i = new int[10000];
        this._y = y;
        this._a = a2;
        this._A = a;
        this._b = b2;
        this._j = j;
        this.random = new Random(100L);
        this._v = new q_(n, n2, 256);
    }
    
    static {
        lg_.fatal_brief = "<col=FF0000>Lethal</col>";
        lg_._n = new ad_(15, 0);
        lg_._x = new mj_[255];
        lg_.desc_necromancer = "Found openly only in the courts of some of the more power-hungry human nobles, the dark spells of the necromancer grant her the ability to tackle a variety of situations.";
        lg_.tip_rabid_wolf = "<%col_detect>Detect +2</col> in adjacent rooms.";
        lg_.ability_sacrifice_green = new String[] { "Offering", "In a desperate barter with the spirits of his tribal elders, should the <%0> be about to die or be otherwise incapacitated, he can send another orc or goblin into the afterlife and gain another chance at life. (Multiple use)" };
        lg_.fs_button_accept = "Accept";
        for (int n = 0; lg_._x.length > n; ++n) {
            lg_._x[n] = new mj_();
        }
        lg_.text_raider_recruitment = "RAIDER RECRUITMENT";
    }
}
