import java.awt.*;
import java.awt.event.*;

final class lj_ implements cl_
{
    static String _e;
    private int _s;
    private int _t;
    //original name: _o
    static Graphic piece_ork_mace;
    static int _u;
    private pj_ _h;
    //original name: _p
    static String text_raider_wins;
    private int[][] _w;
    private DungeonPath _k;
    private Graphic _f;
    private int _q;
    static volatile boolean _g;
    //original name: _j
    static String orb_majesty_desc;
    static int _m;
    private DungeonPath _i;
    private int _l;
    private Graphic _c;
    private rh_[][] _v;
    private Graphic _b;
    static int _r;
    private int[] _a;
    private int[] _n;
    private Graphic _d;
    
    @Override
    public final void a487(final boolean b) {
        if (!b) {
            this._c = null;
        }
        if (this._t > 0) {
            final int n = (this._t << 8) / 80;
            final int b2 = this._h._B;
            final int n2 = b2 / 7;
            final int n3 = b2 % 7;
            this._b.b326(-224 - (-((n3 + n2) * 32) - this._q), 24 * (n2 - n3) + (168 + this._l) - 24, n);
        }
    }
    
    //original signature: static final void a249(final Component component) {
    static final void addListeners(final Component component) {
        component.setFocusTraversalKeysEnabled(false);
        component.addKeyListener(in_._C);
        component.addFocusListener(in_._C);
    }
    
    private final void a068(final int n, final int n2, final int n3, final int n4, final ph_ ph_) {
        if (n2 <= 2) {
            return;
        }
        this.a241(ph_._a, -32, n4, n3, n);
        ph_.d093(n3, n);
    }
    
    @Override
    public final void c150(final int n) {
        int i = 0;
        if (n != -30876) {
            this.a527(false, 55);
        }
        while (i < 49) {
            if (this._h._p.a370(i)) {
                final int[] n2 = this._n;
                final int n3 = i;
                n2[n3] += 4;
            }
            if (this._n[i] > 256) {
                this._n[i] = 256;
                if ((0x3 & mo_._a) == 0x0 && null != this._v[i]) {
                    final rh_[] array = this._v[i];
                    for (int n4 = 0; array.length > n4; ++n4) {
                        final rh_ rh_2;
                        final rh_ rh_ = rh_2 = array[n4];
                        --rh_2._a;
                        if (235 > rh_._a) {
                            rh_._a = 235;
                        }
                    }
                }
            }
            ++i;
        }
        if (this._s != -1 && this._s + 160 > mo_._a) {
            final int n5 = mo_._a - this._s;
            final int n6 = (16 > n5) ? (n5 * 16) : ((72 > n5) ? 256 : (-(2 * n5) + 400));
            final int length = je_._d.length;
            final int[] array2 = new int[length];
            final int[] array3 = new int[length];
            for (int j = 0; j < length; ++j) {
                array2[j] = hj_.a185(12582912, n6, je_._d[j]);
                array3[j] = hj_.a185(65793, n6, RegisterScreen._P[j]);
            }
            for (int n7 = 0; 49 > n7; ++n7) {
                if (null != this._v[n7]) {
                    final rh_[] array4 = this._v[n7];
                    for (int k = 0; k < array4.length; ++k) {
                        final rh_ rh_3 = array4[k];
                        rh_3._e = array2[this._a[n7]];
                        rh_3._h = array3[this._a[n7]];
                        if (n5 < 120) {
                            rh_3._a = 256;
                        }
                    }
                }
            }
        }
        else {
            for (int n8 = 0; 49 > n8; ++n8) {
                if (this._v[n8] != null) {
                    final rh_[] array5 = this._v[n8];
                    for (int l = 0; l < array5.length; ++l) {
                        final rh_ rh_4 = array5[l];
                        rh_4._e = je_._d[this._a[n8]];
                        rh_4._h = RegisterScreen._P[this._a[n8]];
                    }
                }
            }
        }
        if (0 < this._t) {
            --this._t;
        }
    }
    
    @Override
    public final void a183(final boolean b, final int n, final int n2) {
        if (0 < n2 || b) {
            if (n2 % 30 >= 15) {
                ec_.a021(this._l, this._q - 224, this._f, 16711680, 256);
            }
            else {
                this._f.b326(this._q - 224, this._l, 256);
            }
        }
        if (n != -1723) {
            this._l = -37;
        }
    }
    
    private final int a527(final boolean b, final int n) {
        int n2 = 0;
        if (n % 7 != 0) {
            if (this._i.a370(-(n / 7) + (n - 1))) {
                n2 |= 0x1;
            }
        }
        if (n % 7 != 6 && this._i.a370(-(n / 7) + n)) {
            n2 |= 0x2;
        }
        if (b) {
            this.b150(-31);
        }
        if (n > 6) {
            if (this._i.a370(n + 35)) {
                n2 |= 0x4;
            }
        }
        if (42 > n && this._i.a370(n + 42)) {
            n2 |= 0x8;
        }
        return n2;
    }
    
    public static void d150() {
        lj_.orb_majesty_desc = null;
        lj_.text_raider_wins = null;
        lj_.piece_ork_mace = null;
        lj_._e = null;
    }
    
    private final void a669(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final Graphic b251 = fm_.getPieceForRaider(n4);
        if (null != b251) {
            if (n3 != n2) {
                final int n7 = b251.imageWidth2 * n3 >> 8;
                final int n8 = n3 * b251.imageHeight2 >> 8;
                if (n5 == 256) {
                    b251.c115(-(n7 >> 1) + n, n6 - n8, n7, n8);
                }
                else {
                    b251.d050(n - (n7 >> 1), -n8 + n6, n7, n8, n5);
                }
            }
            else if (n5 != 256) {
                b251.d326(-(b251.imageWidth2 >> 1) + n, n6 - b251.imageHeight2, n5);
            }
            else {
                b251.drawImage(n - (b251.imageWidth2 >> 1), -b251.imageHeight2 + n6);
            }
        }
    }
    
    private final void b050(final int n, final int n2, final int n3, final int n4, final int n5) {
        int a = this._h.dungeonLayout[n2].roomType;
        if (!this._h._p.a370(n2)) {
            if (24 != n2) {
                a = 0;
            }
        }
        i_.room_icons[a].e326(n5, n + 1, n4);
    }
    
    @Override
    public final void b150(final int n) {
        jh_.c797();
        if (null == this._c) {
            this._c = new Graphic(448, 356);
            this._f = new Graphic(480, 388);
            this._f._w = -16;
            this._f._A = -16;
        }
        this._c.e797();
        gf_.a797();
        for (int n2 = 0; 7 > n2; ++n2) {
            int n3 = 32 * (6 - n2);
            final int n4 = n2 * 24;
            int n5 = -n2 + 6;
            for (int i = 0; i < 1 + n2; ++i, n3 += 64) {
                int n6 = 16777215;
                if (!this._h._m.a370(n5) || this._h._j.a370(n5)) {
                    n6 = 0;
                }
                if (n5 != 0 && 6 != n5) {
                    ri_.walls[5].e326(n3, n4, n6);
                }
                if (6 != n5 && 48 != n5) {
                    ri_.walls[4].e326(32 + n3, n4, n6);
                }
                this.b050(n4, n5, -75, n6, n3);
                n5 += 8;
            }
        }
        for (int n7 = 7; 13 > n7; ++n7) {
            int n8 = 32 * (n7 - 6);
            final int n9 = n7 * 24;
            int n10 = n7 * 7 - 42;
            for (int j = 0; j < 13 - n7; ++j, n8 += 64) {
                int n11 = 16777215;
                if (!this._h._m.a370(n10) || this._h._j.a370(n10)) {
                    n11 = 0;
                }
                ri_.walls[5].e326(n8, n9, n11);
                ri_.walls[4].e326(n8 + 32, n9, n11);
                this.b050(n9, n10, 115, n11, n8);
                if (j == 0 && n10 != 0 && 42 != n10) {
                    ri_.walls[5].e326(n8 + 32, 24 + n9, 0);
                }
                if (j == 12 - n7 && 42 != n10) {
                    if (48 != n10) {
                        ri_.walls[4].e326(n8, n9 + 24, 0);
                    }
                }
                n10 += 8;
            }
        }
        if (n != -20827) {
            this._w = null;
        }
        this._f.e797();
        gf_.a797();
        this._c.e326(16, 16, 16744448);
        gf_.d669(8, 8, 0, 0, this._f.imageWidth, this._f.imageHeight);
        this._c.e326(16, 16, 0);
        jh_.b797();
    }
    
    @Override
    public final void a423(final byte b) {
        this._s = mo_._a;
    }
    
    @Override
    public final int b313(int n, final int n2, int n3) {
        if (n2 != 19091) {
            this._s = 60;
        }
        n3 -= this._l;
        n -= this._q;
        final int n4 = (3 * n - (4 * (n3 - 168) - 672)) / 192;
        final int n5 = (n3 * 4 + n * 3) / 192;
        if (n4 >= 0 && n5 >= 0 && n4 < 7 && n5 < 7) {
            return n5 * 7 + n4;
        }
        return -1;
    }
    
    @Override
    public final gg_ b624(final int n, final int n2) {
        final int n3 = n % 7;
        final int n4 = n / 7;
        if (n2 != -15390) {
            this.a669(-20, -18, 83, -99, 20, -65);
        }
        return new gg_(32 * (n3 + n4) + this._q - 192, 168 + (24 * (n4 - n3) + this._l));
    }
    
    private final void a241(final Graphic cn_, final int n, final int n2, final int n3, final int n4) {
        if (n != -32) {
            this.b050(-31, -114, 86, -38, -41);
        }
        int n7;
        int n8;
        int n9;
        if (null == this._h) {
            int n5 = 256;
            final int n6 = 10066329;
            if (gm_.playerInformation.dungeonLayout[n2].roomType == 0) {
                n5 = 128;
            }
            n7 = n5 * (192 + ((0xFF0000 & n6) >> 18)) / 255;
            n8 = n5 * (192 + (0x3F & n6 >> 10)) / 255;
            n9 = n5 * ((n6 >> 2 & 0x3F) + 192) / 255;
        }
        else if (!this._h._p.a370(n2)) {
            if (24 == n2) {
                n7 = 96;
                n9 = 0;
                n8 = 48;
            }
            else {
                n7 = 0;
                n8 = 0;
                n9 = 0;
                final int[] a464 = this._h.a464((byte)120, n2);
                int n10 = 0;
                final int[] array = a464;
                for (int n11 = 0; array.length > n11; ++n11) {
                    final int n12 = array[n11];
                    if (this._h._p.a370(n12)) {
                        final int a465 = this.a543((byte)(-103), n12);
                        final int n13 = je_._d[this._a[n12]];
                        n7 += (192 + ((0xFF0000 & n13) >> 18)) * a465 / 255;
                        n8 += (192 + (n13 >> 10 & 0x3F)) * a465 / 255;
                        n9 += (192 + ((n13 & 0xFF) >> 2)) * a465 / 255;
                        ++n10;
                    }
                }
                if (n10 > 0) {
                    final int n14 = 4 * n10;
                    n8 /= n14;
                    n7 /= n14;
                    n9 /= n14;
                }
                n8 += 16;
                n7 += 16;
                n9 += 16;
            }
        }
        else {
            final int a466 = this.a543((byte)(-72), n2);
            final int n15 = je_._d[this._a[n2]];
            n9 = (192 + ((0xFF & n15) >> 2)) * a466 / 255;
            n7 = (192 + ((n15 & 0xFF0000) >> 18)) * a466 / 255;
            n8 = a466 * ((n15 >> 10 & 0x3F) + 192) / 255;
            if (this._s != -1) {
                final int n16 = mo_._a - this._s;
                if (n16 < 200) {
                    final int n17 = (16 > n16) ? (n16 * 16) : ((72 <= n16) ? (-(2 * n16) + 400) : 256);
                    n9 = n9 * (256 - n17) >>> 8;
                    n8 = (-n17 + 256) * n8 >>> 8;
                    n7 = (n17 >> 1) + ((-n17 + 256) * n7 >>> 8);
                }
            }
        }
        int n18 = 0;
        int n19 = n3 + cn_._w + gf_._i * (cn_._A + n4);
        final int n20 = -cn_.imageWidth + gf_._i;
        for (int i = -cn_.imageHeight; i < 0; ++i) {
            for (int n21 = -cn_.imageWidth; 0 > n21; ++n21, ++n18) {
                final int n22 = cn_._B[n18];
                if (n22 != 0) {
                    gf_._b[n19] = mp_.or(((0xFF00 & (0xFF & n22) * n9) | ((0xFF0000 & (n22 & 0xFF00) * n8) | ((n22 & 0xFF0000) * n7 & 0xFF000000))) >>> 8, -16777216);
                }
                ++n19;
            }
            n19 += n20;
        }
    }
    
    @Override
    public final void a326(final int n, final int n2, final int n3) {
        jh_.c797();
        if (this._d == null) {
            this._d = new Graphic(64, 68);
            this._b = new Graphic(96, 100);
            this._b._w = -16;
            this._b._A = -16;
        }
        this._d.e797();
        gf_.a797();
        final int n4 = 0;
        final int n5 = 0;
        ri_.walls[5].e326(n4, n5, 16777215);
        ri_.walls[4].e326(n4 + 32, n5, 16777215);
        this.b050(n5, n3, -127, 16777215, n4);
        this._b.e797();
        gf_.a797();
        this._d.e326(16, 16, n2);
        gf_.d669(16, 16, 0, 0, this._b.imageWidth, this._b.imageHeight);
        this._d.e326(16, 16, 0);
        jh_.b797();
        this._t = 80;
        if (n != -9398) {
            this.a050(-70, -121, 96, 85, 77);
        }
    }
    
    private final void a172(final byte b, final int n, final int n2, final int n3) {
        int n4 = 0;
        final RaidMember[] array = new RaidMember[4];
        for (int n5 = 0; 4 > n5; ++n5) {
            if (this._h.raidMembers[n5] != null && (0x6 & this._h.raidMembers[n5].status) == 0x0) {
                array[n4++] = this._h.raidMembers[n5];
            }
        }
        if (n4 != 0) {
            if (n4 == 0) {
                if (2 != n4) {
                    if (n4 == 3) {
                        this.a669(n + 20, 256, 128, array[0].raiderId, n2, n3 + 37);
                        this.a669(44 + n, 256, 128, array[1].raiderId, n2, n3 + 37);
                        this.a669(n + 32, 256, 128, array[2].raiderId, n2, 48 + n3);
                    }
                    else {
                        this.a669(n + 32, 256, 96, array[0].raiderId, n2, 31 + n3);
                        this.a669(n + 16, 256, 96, array[1].raiderId, n2, n3 + 41);
                        this.a669(48 + n, 256, 96, array[2].raiderId, n2, 41 + n3);
                        this.a669(32 + n, 256, 96, array[3].raiderId, n2, 51 + n3);
                    }
                }
                else {
                    this.a669(22 + n, 256, 144, array[0].raiderId, n2, 45 + n3);
                    this.a669(42 + n, 256, 144, array[1].raiderId, n2, n3 + 45);
                }
            }
            else {
                this.a669(n + 32, 256, 192, array[0].raiderId, n2, n3 + 45);
            }
        }
    }
    
    private final void a115(final int n, final int n2, final int n3, final int n4) {
        if (n4 != -25) {
            lj_._u = -46;
        }
        int n5;
        boolean a370;
        if (null == this._h) {
            Room ai_ = gm_.playerInformation.dungeonLayout[n3];
            if (qj_.dungeonLayout[n3] != null) {
                ai_ = qj_.dungeonLayout[n3];
            }
            n5 = ai_.roomType;
            a370 = true;
        }
        else {
            n5 = this._h.dungeonLayout[n3].roomType;
            a370 = this._h._p.a370(n3);
        }
        if (!a370 && n3 != 24) {
            this.a241(i_.room_icons[0], -32, n3, n, n2 + 1);
            if (6 < n3) {
                final int n6 = n3 - 7;
                if (this._h._p.a370(n6) && this._i.a370(n6 + 42)) {
                    ec_.a021(18 + n2, n, mf_.doormasks[0], (je_._d[this._a[n6]] >> 1 & 0x7F7F7F) + 8421504, this.a543((byte)(-11), n6) >> 2);
                }
            }
            if (6 != n3 % 7) {
                final int n7 = 1 + n3;
                if (this._h._p.a370(n7) && this._i.a370(n3 - n3 / 7)) {
                    ec_.a021(n2 + 18, n, mf_.doormasks[1], 8421504 + (0x7F7F7F & je_._d[this._a[n7]] >> 1), this.a543((byte)(-8), n7) >> 2);
                }
            }
            if (n3 < 42) {
                final int n8 = 7 + n3;
                if (this._h._p.a370(n8)) {
                    if (this._i.a370(n3 + 42)) {
                        ec_.a021(n2 + 18, n, mf_.doormasks[2], (0x7F7F7F & je_._d[this._a[n8]] >> 1) + 8421504, this.a543((byte)(-67), n8) >> 2);
                    }
                }
            }
            if (0 != n3 % 7) {
                final int n9 = n3 - 1;
                if (this._h._p.a370(n9)) {
                    if (this._i.a370(n9 - n9 / 7)) {
                        ec_.a021(18 + n2, n, mf_.doormasks[3], ((je_._d[this._a[n9]] & 0xFEFEFE) >> 1) + 8421504, this.a543((byte)(-36), n9) >> 2);
                    }
                }
            }
        }
        else {
            if (!a370) {
                if (n5 != 0) {
                    i_.room_icons[n5].drawImage(n, n2 + 1);
                }
                else {
                    mc_.room_floors[this._h.d080(n3, 30813)].drawImage(n, 1 + n2);
                }
            }
            else {
                if (n5 == 0) {
                    this.a241(mc_.room_floors[this.a527(false, n3)], -32, n3, n, n2 - 7);
                }
                else {
                    this.a241(i_.room_icons[n5], -32, n3, n, n2 + 1);
                    if (2 == gh_.traps[n5].roomType) {
                        if (this._h == null || !this._h._j.a370(n3)) {
                            final Graphic a371 = jb_.getTrapPiece(n5);
                            if (a371 != null) {
                                if (null == this._h) {
                                    if (null != a371) {
                                        final int n10 = a371.imageWidth2 * 5 >> 3;
                                        final int n11 = a371.imageHeight2 * 5 >> 3;
                                        a371.c115(n + (-n10 + 48 >> 1), 40 + (n2 - n11), n10, n11);
                                    }
                                }
                                else {
                                    a371.drawImage(-(a371.imageWidth >> 1) + (n + 32), -a371.imageHeight + (24 + (21 + n2)));
                                }
                            }
                        }
                    }
                }
                if (this._h != null) {
                    if (this._v[n3] != null) {
                        final int[] array = this._w[n3];
                        for (int i = 0; i < array.length; ++i) {
                            sn_.torches[array[i]].drawImage(n, n2);
                        }
                        final rh_[] array2 = this._v[n3];
                        for (int n12 = 0; array2.length > n12; ++n12) {
                            array2[n12].e797();
                        }
                    }
                    if (n3 > 6) {
                        final int n13 = n3 - 7;
                        if (this._h._p.a370(n13) && this._i.a370(n13 + 42)) {
                            ec_.a021(18 + n2, n, mf_.doormasks[0], 8421504 + ((0xFEFEFE & je_._d[this._a[n13]]) >> 1), this.a543((byte)(-39), n13) >> 2);
                        }
                    }
                    if (6 != n3 % 7) {
                        final int n14 = n3 + 1;
                        if (this._h._p.a370(n14) && this._i.a370(-(n3 / 7) + n3)) {
                            ec_.a021(n2 + 18, n, mf_.doormasks[1], ((je_._d[this._a[n14]] & 0xFEFEFE) >> 1) + 8421504, this.a543((byte)(-57), n14) >> 2);
                        }
                    }
                    if (42 > n3) {
                        final int n15 = 7 + n3;
                        if (this._h._p.a370(n15) && this._i.a370(n3 + 42)) {
                            ec_.a021(n2 + 18, n, mf_.doormasks[2], 8421504 + ((je_._d[this._a[n15]] & 0xFEFEFE) >> 1), this.a543((byte)(-56), n15) >> 2);
                        }
                    }
                    if (n3 % 7 != 0) {
                        final int n16 = n3 - 1;
                        if (this._h._p.a370(n16)) {
                            if (this._i.a370(n16 - n16 / 7)) {
                                ec_.a021(18 + n2, n, mf_.doormasks[3], 8421504 + (0x7F7F7F & je_._d[this._a[n16]] >> 1), this.a543((byte)(-52), n16) >> 2);
                            }
                        }
                    }
                }
            }
            if (this._h != null) {
                if (this._h._q == n3) {
                    this.a172((byte)56, n, 256, n2);
                }
                else if (n3 == this._h._B) {
                    if (2 != gh_.traps[n5].roomType) {
                        final Graphic b251 = fm_.getPieceForRaider(this._h.activeRaidMember.raiderId);
                        if (null != b251) {
                            b251.d326((64 - b251.imageWidth >> 1) + n, -b251.imageHeight + n2 + 45, 80);
                        }
                        this.a172((byte)(-107), n, 80, n2);
                    }
                }
            }
        }
    }
    
    lj_(final go_ go_, final int n, final int n2) {
        this(n, n2);
        this._h = go_._Y;
        this._i = this._h._v;
        this._a = new int[49];
        this._n = new int[49];
        this._w = new int[49][];
        this._v = new rh_[49][];
        this._k = new DungeonPath(84);
        this._s = -1;
        this.a093(15122, 0);
        this.a093(15122, 6);
        this.a093(15122, 42);
        this.a093(15122, 48);
        this.c423((byte)125);
        this.b150(-20827);
    }
    
    @Override
    public final void a150(final int n) {
        if (n != 2985) {
            return;
        }
        this._t = 0;
    }
    
    private final void a050(final int n, final int n2, final int n3, final int n4, final int n5) {
        this._w[n2][n] = n5;
        final int n6 = 1 + this._q + (32 * (n2 / 7 + n2 % 7) - 224 + ud_._w[n5]);
        final int n7 = r_._b[n5] - 21 + (168 + 24 * (-(n2 % 7) + n2 / 7)) + this._l;
        this._a[n2] = n4;
        this._v[n2][n] = new rh_(n6, n7, 20, 40, je_._d[n4], RegisterScreen._P[n4], 256);
    }
    
    @Override
    public final void b423(final byte b) {
        nb_._d.drawImage(13 + (this._q + 79 - 320), this._l + 13);
        for (int n = 0; 168 >= n; ++n) {
            gf_.b115(-(n * 4 / 3) + this._q, n + (18 + this._l), 8 * n / 3, 0);
            gf_.b115(-(4 * n / 3) + this._q, -n + 336 + 18 + this._l, 8 * n / 3, 0);
        }
        if (b != -55) {
            this._n = null;
        }
        for (int n2 = 0; 7 > n2; ++n2) {
            int n3 = -(32 * (1 + n2)) + this._q;
            final int n4 = n2 * 24 + this._l;
            for (int n5 = -n2 + 6, n6 = 0; 1 + n2 > n6; ++n6, n3 += 64, n5 += 8) {
                final boolean b2 = null == this._h || this._h._p.a370(n5);
                if (n6 == 0) {
                    if (n5 != 0) {
                        if (n5 != 6) {
                            this.a068(n4, 9, n3, n5, ua_._b[5]);
                        }
                    }
                }
                else {
                    final int n7 = n5 - 7;
                    final boolean b3 = b2 || this._h._p.a370(n7);
                    int n8 = 5;
                    if (b3) {
                        if (this._i.a370(42 + n7)) {
                            n8 = ((this._h == null || ((this._h._j.a370(n5) || this._h._B == n5) && (this._h._j.a370(n7) || n7 == this._h._B))) ? 1 : 3);
                        }
                    }
                    this.a068(n4, b ^ 0xFFFFFFE1, n3, n5, ua_._b[n8]);
                }
                if (n2 == n6) {
                    if (n5 != 6) {
                        if (n5 != 48) {
                            this.a068(n4, 121, 32 + n3, n5, ua_._b[4]);
                        }
                    }
                }
                else {
                    final int n9 = n5 + 1;
                    final boolean b4 = b2 || this._h._p.a370(n9);
                    int n10 = 4;
                    if (b4) {
                        if (this._i.a370(-(n5 / 7) + n5)) {
                            n10 = ((this._h == null || ((this._h._j.a370(n5) || n5 == this._h._B) && (this._h._j.a370(n9) || n9 == this._h._B))) ? 0 : 2);
                        }
                    }
                    this.a068(n4, b + 85, 32 + n3, n5, ua_._b[n10]);
                }
                this.a115(n3, n4, n5, -25);
            }
        }
        for (int i = 7; i < 13; ++i) {
            int n11 = -(32 * (-i + 13)) + this._q;
            final int n12 = i * 24 + this._l;
            for (int n13 = 7 * i - 42, n14 = 0; 13 - i > n14; ++n14, n13 += 8) {
                final boolean b5 = this._h == null || this._h._p.a370(n13);
                final int n15 = n13 - 7;
                final boolean b6 = b5 || this._h._p.a370(n15);
                int n16 = 5;
                if (b6) {
                    if (this._i.a370(42 + n15)) {
                        n16 = ((this._h == null || ((this._h._j.a370(n13) || n13 == this._h._B) && (this._h._j.a370(n15) || this._h._B == n15))) ? 1 : 3);
                    }
                }
                final int n17 = n13 + 1;
                this.a068(n12, 5, n11, n13, ua_._b[n16]);
                int n18 = 4;
                if (b5 || this._h._p.a370(n17)) {
                    if (this._i.a370(-(n13 / 7) + n13)) {
                        n18 = ((null == this._h || ((this._h._j.a370(n13) || n13 == this._h._B) && (this._h._j.a370(n17) || n17 == this._h._B))) ? 0 : 2);
                    }
                }
                this.a068(n12, 115, n11 + 32, n13, ua_._b[n18]);
                this.a115(n11, n12, n13, -25);
                if (n14 == 0 && n13 != 0) {
                    if (42 != n13) {
                        ua_._b[4].h093(n11, n12 + 24);
                    }
                }
                if (n14 == 12 - i && n13 != 42 && 48 != n13) {
                    ua_._b[5].h093(32 + n11, n12 + 24);
                }
                n11 += 64;
            }
        }
    }
    
    @Override
    public final void a093(final int n, final int n2) {
        if (null != this._w[n2]) {
            return;
        }
        final int[] b574 = this._h.b574(n2, (byte)(-36));
        int n3 = 0;
        final int[] array = b574;
        for (int i = 0; i < array.length; ++i) {
            if (!this._k.a370(array[i])) {
                ++n3;
            }
        }
        final int b575 = oi_.getRandom(5);
        if (n3 <= 0) {
            this._v[n2] = new rh_[0];
            this._w[n2] = new int[0];
        }
        else {
            this._v[n2] = new rh_[n3];
            this._w[n2] = new int[n3];
            int n4 = 0;
            final int[] array2 = b574;
            for (int j = 0; j < array2.length; ++j) {
                final int n5 = array2[j];
                if (!this._k.a370(n5)) {
                    this._k.a093(n5);
                    if (n5 == -(n2 / 7) + (n2 - 1)) {
                        this.a050(n4++, n2, 115, b575, 6);
                    }
                    if (n5 == n2 - n2 / 7) {
                        this.a050(n4++, n2, 98, b575, 3);
                    }
                    if (n2 + 35 == n5) {
                        this.a050(n4++, n2, 115, b575, 1);
                    }
                    if (n5 == n2 + 42) {
                        this.a050(n4++, n2, 100, b575, 4);
                    }
                }
            }
        }
    }
    
    private final void c423(final byte b) {
        for (int i = 0; i < 49; ++i) {
            if (i != 0 && 6 != i && 42 != i && 48 != i && this._h._p.a370(i)) {
                this.a093(15122, i);
            }
        }
        if (b <= 123) {
            this._c = null;
        }
    }
    
    private final int a543(final byte b, final int n) {
        final int n2 = this._n[n];
        int n3;
        if (n2 < 256) {
            n3 = (int)(256.0 * (1.0 - Math.exp(-n2 / 40.0))) + (int)((1.0 - Math.cos(n2 * 3.141592653589793 / 128.0)) * 64.0);
        }
        else {
            n3 = 256;
        }
        final int n4 = (int)(n3 + 48.0 * te_.c503(n, mo_._a, 0.03125));
        if (b > -1) {
            this._n = null;
        }
        int n5 = n4 >> 1;
        if (40 > n5) {
            n5 = 40;
        }
        return n5;
    }
    
    private lj_(final int q, final int n) {
        this._c = null;
        this._d = null;
        this._l = n - 168;
        this._q = q;
        this._i = gm_.playerInformation._k;
    }
    
    lj_(final go_ go_, final lj_ lj_) {
        this._c = null;
        this._d = null;
        this._q = lj_._q;
        this._l = lj_._l;
        this._h = go_._Y;
        this._a = lj_._a;
        this._n = lj_._n;
        this._v = lj_._v;
        this._w = lj_._w;
        this._k = lj_._k;
        this._s = -1;
        this._i = this._h._v;
        this.c423((byte)126);
        this.b150(-20827);
    }
    
    static {
        lj_._u = 100;
        lj_.text_raider_wins = "Raider wins!";
        lj_.orb_majesty_desc = "Your initial Renown after the next reset will be increased by 100.";
        lj_._r = 200;
        lj_._g = false;
    }
}
