import java.applet.*;
import java.net.*;

final class sf_ implements cl_
{
    static int _h;
    //original name: _e
    static String error_js5io;
    static int[] _b;
    private DungeonPath _f;
    static md_ _c;
    private int _a;
    //original name: _i
    static String vampire_bats;
    private int _d;
    static int _g;
    private pj_ _j;
    
    static final void d150() {
        int n = gg_._a[0];
        for (int n2 = 1; gg_._a.length > n2; ++n2) {
            final int n3 = gg_._a[n2];
            cj_.a382(hf_._yb, n2 << 4, hf_._yb, n, n3);
            n += n3;
        }
    }
    
    @Override
    public final int b313(int n, final int n2, int n3) {
        final int y = bl_.wall_icons_2d[3].imageWidth;
        n -= this._a + y;
        final int n4 = y + 32;
        n3 -= y + this._d;
        final int n5 = n / n4;
        final int n6 = n3 / n4;
        if (n2 != 19091) {
            sf_.error_js5io = null;
        }
        if (0 <= n && n3 >= 0 && 7 > n5 && 7 > n6) {
            return n5 + 7 * n6;
        }
        return -1;
    }
    
    @Override
    public final void a093(final int n, final int n2) {
        if (n != 15122) {
            this.a093(-109, -25);
        }
    }
    
    @Override
    public final void a150(final int n) {
        if (n != 2985) {
            this.a487(true);
        }
    }
    
    @Override
    public final gg_ b624(final int n, final int n2) {
        final int y = bl_.wall_icons_2d[3].imageWidth;
        final int n3 = 32 + y;
        final int n4 = n % 7;
        final int n5 = n / 7;
        if (n2 != -15390) {
            this._a = 43;
        }
        return new gg_(n4 * n3 + (this._a + y) + 16, n5 * n3 + y + (this._d + 16));
    }
    
    static final void a284(final Applet applet) {
        try {
            applet.getAppletContext().showDocument(j_.a550(new URL(applet.getCodeBase(), "subscribe.ws"), applet), "_top");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public final void a423(final byte b) {
    }
    
    @Override
    public final void a487(final boolean b) {
        if (!b) {
            this.b423((byte)(-123));
        }
    }
    
    public static void c423() {
        sf_.error_js5io = null;
        sf_.vampire_bats = null;
        sf_._c = null;
        sf_._b = null;
    }
    
    @Override
    public final void b423(final byte b) {
        final int y = bl_.wall_icons_2d[3].imageWidth;
        final int n = y + 32;
        final int n2 = y + 7 * n;
        gf_.b050(this._a - 4, this._d - 4, 8 + n2, n2 + 8, 0);
        rp_.a857(8, 2 + n2, (byte)108, this._a - 1, n2 + 2, kc_._S, this._d - 1);
        final DungeonPath wm_ = (this._j != null) ? this._j.b184((byte)(-6)) : this._f;
        int n3 = 0;
        if (b != -55) {
            this.b423((byte)36);
        }
        int n4 = this._a;
        int d = this._d;
        for (int i = 0; i < 7; ++i, d += n) {
            for (int n5 = 0; 7 > n5; ++n5, ++n3) {
                if (0 >= i) {
                    bl_.wall_icons_2d[0].drawImage(y + n4, d);
                }
                else {
                    int n6 = 0;
                    if (this._f.a370(35 + n3)) {
                        final int n7 = n3 - 7;
                        if (wm_.a370(35 + n3)) {
                            n6 = ((null == this._j || ((this._j._j.a370(n3) || this._j._B == n3) && (this._j._j.a370(n7) || n7 == this._j._B))) ? 1 : 2);
                        }
                    }
                    bl_.wall_icons_2d[n6].drawImage(y + n4, d);
                }
                if (0 >= n5) {
                    bl_.wall_icons_2d[3].drawImage(n4, y + d);
                }
                else {
                    int n8 = 3;
                    if (this._f.a370(-1 - n3 / 7 + n3)) {
                        final int n9 = n3 - 1;
                        if (wm_.a370(-(n3 / 7) + n3 - 1)) {
                            n8 = ((null == this._j || ((this._j._j.a370(n3) || this._j._B == n3) && (this._j._j.a370(n9) || this._j._B == n9))) ? 4 : 5);
                        }
                    }
                    bl_.wall_icons_2d[n8].drawImage(n4, d + y);
                }
                Room ai_;
                if (this._j != null) {
                    ai_ = this._j.dungeonLayout[n3];
                }
                else {
                    ai_ = qj_.dungeonLayout[n3];
                    if (ai_ == null) {
                        ai_ = gm_.playerInformation.dungeonLayout[n3];
                    }
                }
                int a = ai_.roomType;
                final boolean b2 = this._j == null || this._j._p.a370(n3);
                if (!b2 && 24 != n3) {
                    a = 1;
                }
                if (3 != a) {
                    final boolean b3 = null != this._j && this._j._j != null && this._j._j.a370(n3);
                    final int n10 = b2 ? this.c080(n3, b ^ 0xFFFFFFA9) : 0;
                    if (a == 1) {
                        ja_.room_icons_2d[1].drawImage(y + n4, y + d);
                    }
                    else if (a == 0) {
                        ja_.room_icons_2d[0].drawImage(n4 + y, d + y);
                        DungeonBuilder._G[n10].d326(n4 + y, y + d, 128);
                        qe_.b370(n4 + y, d + y, 32, 32, 0, 0, 0);
                    }
                    else {
                        ja_.room_icons_2d[a].drawImage(n4 + y, y + d);
                        if (n3 != 24) {
                            DungeonBuilder._G[n10].d326(y + n4, d + y, 64);
                        }
                        if (b3) {
                            sm_._g.d326((-sm_._g.imageWidth + 32 >> 1) + (y + n4), (32 - sm_._g.imageHeight >> 1) + (d + y), 128);
                        }
                    }
                }
                else if (n3 == 0) {
                    ja_.room_icons_2d[3].drawImage(y + n4, y + d);
                }
                else if (n3 != 6) {
                    if (n3 == 42) {
                        ja_.room_icons_2d[3].g093(y + n4, d + y);
                    }
                    else if (48 == n3) {
                        ja_.room_icons_2d[3].b093(n4 + y, d + y);
                    }
                }
                else {
                    ja_.room_icons_2d[3].f093(n4 + y, y + d);
                }
                if (this._j != null) {
                    if (n3 == this._j._q) {
                        rj_.youarehere.drawImage(n4 - (-2 - (n - rj_.youarehere.imageWidth2 >> 1)), 2 + (d + (-rj_.youarehere.imageHeight2 + n >> 1)));
                    }
                    else if (this._j._B == n3) {
                        rj_.youarehere.d326((n - rj_.youarehere.imageWidth2 >> 1) + 2 + n4, (n - rj_.youarehere.imageHeight2 >> 1) + (2 + d), 128);
                    }
                }
                n4 += n;
            }
            bl_.wall_icons_2d[3].drawImage(n4, d + y);
            n4 = this._a;
        }
        for (int n11 = 0; 7 > n11; ++n11, n4 += n) {
            bl_.wall_icons_2d[0].drawImage(n4 + y, d);
        }
        jh_.c797();
        gf_.e115(this._a, this._d, this._a + n2, this._d + n2);
        int n12 = this._a;
        for (int d2 = this._d, n13 = 0; 8 > n13; ++n13, n12 = this._a, d2 += n) {
            for (int j = 0; j < 8; ++j) {
                if ((n13 != 3 && n13 != 4) || (3 != j && 4 != j)) {
                    gf_.b050(n12 - 1, d2 - 1, 2 + y, 2 + y, 8421504);
                    gf_.b050(n12, d2, y, y, 16777215);
                }
                else {
                    gf_.b050(n12 - 2, d2 - 2, y + 4, y + 4, 8421504);
                    gf_.b050(n12 - 1, d2 - 1, 2 + y, y + 2, 16777215);
                }
                n12 += n;
            }
        }
        jh_.b797();
    }
    
    @Override
    public final void c150(final int n) {
        if (n != -30876) {
            d093(16);
        }
    }
    
    @Override
    public final void a326(final int n, final int n2, final int n3) {
        if (n != -9398) {
            sf_._g = -19;
        }
    }
    
    @Override
    public final void b150(final int n) {
        if (n != -20827) {
            this.a487(true);
        }
    }
    
    @Override
    public final void a183(final boolean b, final int n, final int n2) {
        if (null == this._j) {
            return;
        }
        if (n2 <= 0 && !b) {
            return;
        }
        final int n3 = (int)(0.5 + Math.cos(mo_._a / 5.0f) * 3.0);
        final DungeonPath a775 = this._j.b184((byte)(-128)).a775((byte)(-53), this._j._v);
        if (n != -1723) {
            return;
        }
        final int n4 = 36;
        final int n5 = 4;
        int n6 = 0;
        int n7 = n5 + this._a;
        int n8 = this._d + n5;
        for (int i = 0; i < 7; ++i) {
            for (int n9 = 0; 7 > n9; ++n9) {
                Label_0603: {
                    if (i > 0 && a775.a370(35 + n6)) {
                        final int n10 = n6 - 7;
                        if (!this._j._m.a370(n6) || !this._j._m.a370(n10)) {
                            break Label_0603;
                        }
                        final boolean b2 = this._j._j.a370(n6) || n6 == this._j._q;
                        final boolean b3 = this._j._j.a370(n10) || n10 == this._j._q;
                        if (!b2 || b3) {
                            if (!b2 && b3) {
                                i_._v.drawImage(n7 + (n4 - i_._v.imageWidth >> 1) - 1, (-i_._v.imageHeight - 4 >> 1) + (n3 + n8));
                            }
                        }
                        else {
                            fo_._a.drawImage((n4 - fo_._a.imageWidth >> 1) + (n7 - 1), (-fo_._a.imageHeight - 4 >> 1) - n3 + n8);
                        }
                    }
                    if (0 < n9) {
                        if (a775.a370(n6 - 1 - n6 / 7)) {
                            final int n11 = n6 - 1;
                            if (this._j._m.a370(n6)) {
                                if (this._j._m.a370(n11)) {
                                    final boolean b4 = this._j._j.a370(n6) || this._j._q == n6;
                                    final boolean b5 = this._j._j.a370(n11) || this._j._q == n11;
                                    if (b4 || !b5) {
                                        if (b4 && !b5) {
                                            qi_._i.drawImage(n7 + (-n3 + (-CacheIndex._a.imageWidth - 2 >> 1)), n8 - 1 + (-CacheIndex._a.imageHeight + n4 >> 1));
                                        }
                                    }
                                    else {
                                        CacheIndex._a.drawImage((-CacheIndex._a.imageWidth - 2 >> 1) + (n7 + n3), n8 + (-1 + (n4 - CacheIndex._a.imageHeight >> 1)));
                                    }
                                }
                            }
                        }
                    }
                }
                ++n6;
                n7 += n4;
            }
            n7 = n5 + this._a;
            n8 += n4;
        }
    }
    
    private final int c080(final int n, final int n2) {
        if (n2 <= 82) {
            return -82;
        }
        int n3 = 0;
        if (0 != n % 7 && this._f.a370(n - n / 7 - 1)) {
            n3 |= 0x1;
        }
        if (6 != n % 7) {
            if (this._f.a370(n - n / 7)) {
                n3 |= 0x2;
            }
        }
        if (6 < n && this._f.a370(n + 35)) {
            n3 |= 0x4;
        }
        if (n < 42) {
            if (this._f.a370(42 + n)) {
                n3 |= 0x8;
            }
        }
        return n3;
    }
    
    sf_(final go_ go_, final int n, final int n2) {
        final int y = bl_.wall_icons_2d[3].imageWidth;
        final int n3 = y + (32 + y) * 7;
        if (null == go_) {
            this._f = gm_.playerInformation._k;
            this._j = null;
        }
        else {
            this._j = go_._Y;
            this._f = this._j._v;
        }
        this._a = n - (n3 >> 1);
        this._d = n2 - (n3 >> 1);
        this.a093(15122, 0);
        this.a093(15122, 6);
        this.a093(15122, 42);
        this.a093(15122, 48);
        this.b150(-20827);
        jh_.c797();
        DungeonBuilder._G = new Graphic[16];
        for (int n4 = 0; 16 > n4; ++n4) {
            final Graphic cn_ = new Graphic(32, 32);
            cn_.e797();
            gf_.b050(0, 0, 32, 32, 65793);
            int n5 = 16777215;
            int n6 = 10;
            int n7 = -n6 + (32 - n6);
            for (int i = 0; i < 2; ++i) {
                gf_.b050(n6, n6, n7, n7, n5);
                if (0x0 != (n4 & 0x1)) {
                    gf_.b050(0, n6, n7 + n6, n7, n5);
                }
                if ((n4 & 0x2) != 0x0) {
                    gf_.b050(n6, n6, n7 + n6, n7, n5);
                }
                if ((0x4 & n4) != 0x0) {
                    gf_.b050(n6, 0, n7, n6 + n7, n5);
                }
                if (0x0 != (0x8 & n4)) {
                    gf_.b050(n6, n6, n7, n7 + n6, n5);
                }
                n5 = 0;
                n7 -= 2;
                ++n6;
            }
            DungeonBuilder._G[n4] = cn_;
        }
        jh_.b797();
    }
    
    static final void d093(final int d) {
        oo_._d = d;
        for (fa_ fa_ = (fa_)ud_._v.e024(); fa_ != null; fa_ = (fa_)ud_._v.a024(4)) {
            if (!fa_._o.c154(-71)) {
                fa_.a487(false);
            }
            else {
                fa_._n.h150(oo_._d * fa_._l + 128 >> 8);
            }
        }
        if (oi_._F != null) {
            for (fa_ fa_2 = (fa_)oi_._F.e024(); fa_2 != null; fa_2 = (fa_)oi_._F.a024(4)) {
                if (!fa_2._o.c154(-70)) {
                    fa_2.a487(false);
                }
                else {
                    fa_2._n.h150(128 + oo_._d * fa_2._l >> 8);
                }
            }
        }
    }
    
    static {
        sf_.error_js5io = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        sf_._g = 0;
        sf_._b = new int[] { 1052688, 1056800, 1056784, 4198416, 2105408, 4202560 };
        sf_.vampire_bats = "Vampire Bats";
        sf_._c = new md_();
    }
}
