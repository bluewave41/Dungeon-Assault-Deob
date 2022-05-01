//original name: p_
import java.awt.*;

final class DungeonBuilder extends qe_
{
    private gd_ _L;
    private nn_ _M;
    private HeaderLabelText _E;
    private gd_ _C;
    private gd_ _A;
    private int _z;
    private gd_ _w;
    //original name: _K
    static String pleasewait_dotdotdot;
    private int _F;
    private cl_ _u;
    private gd_ _P;
    private boolean _s;
    static int[] _x;
    private gd_ _y;
    private gd_ _t;
    private pp_ _Q;
    private cp_[] _v;
    private pp_ _O;
    private cp_[] _D;
    private nn_ _R;
    //original name: _J
    static String[] tutorial_raiders1;
    static Graphic[] _G;
    private rh_ _N;
    private rh_ _I;
    //original name: _r
    static String text_raids;
    private wd_ _H;
    
    private static final Graphic[] a528(final Graphic[] array, final int n) {
        final Graphic[] array2 = new Graphic[array.length];
        jh_.c797();
        for (int n2 = 0; array.length > n2; ++n2) {
            final Graphic cn_ = array[n2];
            if (cn_ != null) {
                final Graphic cn_2 = new Graphic(27 * cn_.imageWidth2 / 16, cn_.imageHeight2 * 20 / 12);
                cn_2.e797();
                cn_.c115(-(cn_._w * 27) / 16, -(cn_._A * 27) / 16, cn_2.imageWidth2, cn_2.imageHeight2);
                final Graphic cn_3 = cn_2;
                final Graphic cn_4 = new Graphic(cn_3.imageWidth2 / 2, cn_3.imageHeight2 / 2);
                cn_4.e797();
                cn_3.e115(cn_4.imageWidth2 / 2, cn_4.imageHeight2 / 2, 0, 2048);
                cn_4._A = cn_3._A * 27 >> 5;
                final Graphic cn_5 = cn_4;
                cn_4.c797();
                array2[n2] = cn_5;
            }
        }
        jh_.b797();
        if (n != 400) {
            return null;
        }
        return array2;
    }
    
    private final void a823(final gd_ gd_, final String s, final byte b, final String s2, final String s3) {
        if (b < 109) {
            this.a423((byte)(-82));
        }
        jh_.c797();
        final int n = 130;
        final int n2 = db_.roman12bold._H + db_.roman12bold._E;
        final Graphic cn_ = new Graphic(n, n2);
        cn_.e797();
        db_.roman12bold.b191(s3, 0, db_.roman12bold._H, 12632256, -1);
        db_.roman12bold.a191(s2, n, db_.roman12bold._H, 12632256, -1);
        final Graphic cn_2 = new Graphic(n, n2);
        cn_2.e797();
        db_.roman12bold.b191(s3, 0, db_.roman12bold._H, 12690143, -1);
        db_.roman12bold.a191(s2, n, db_.roman12bold._H, 12690143, -1);
        final String s4 = gd_._B ? s : s2;
        final Graphic cn_3 = new Graphic(n, n2);
        cn_3.e797();
        db_.roman12bold.b191(s3, 0, db_.roman12bold._H, 16744448, -1);
        db_.roman12bold.a191(s4, n, db_.roman12bold._H, 16744448, -1);
        jh_.b797();
        gd_.a037(cn_3, cn_, GUICheckbox.a551(8, cn_3, 16711680, (byte)78), cn_2, (byte)126, GUICheckbox.a551(8, cn_2, 255, (byte)(-13)));
    }
    
    private final gd_ a836(final String s, final String s2, final int n, final int n2, final int n3, final String s3) {
        jh_.c797();
        final int n4 = 130;
        final int n5 = db_.roman12bold._E + db_.roman12bold._H;
        final Graphic cn_ = new Graphic(n4, n5);
        cn_.e797();
        db_.roman12bold.b191(s2, 0, db_.roman12bold._H, 12632256, -1);
        db_.roman12bold.a191(s, n4, db_.roman12bold._H, 12632256, n2);
        final Graphic cn_2 = new Graphic(n4, n5);
        cn_2.e797();
        db_.roman12bold.b191(s2, 0, db_.roman12bold._H, 12690143, -1);
        db_.roman12bold.a191(s, n4, db_.roman12bold._H, 12690143, -1);
        final Graphic cn_3 = new Graphic(n4, n5);
        cn_3.e797();
        db_.roman12bold.b191(s2, 0, db_.roman12bold._H, 16744448, -1);
        db_.roman12bold.a191(s3, n4, db_.roman12bold._H, 16744448, -1);
        jh_.b797();
        return new gd_(cn_, cn_2, GUICheckbox.a551(8, cn_2, 255, (byte)92), cn_3, GUICheckbox.a551(8, cn_3, 16711680, (byte)(-8)), n, (-n5 + 30 >> 1) + n3);
    }
    
    private final void b423(final byte b) {
        if (b != 26) {
            return;
        }
        this._v = new cp_[gh_.traps.length];
        int n = 0;
        for (int i = 0; i < gh_.traps.length; ++i) {
            final Trap trap = gh_.traps[i];
            if (trap != null) {
                if (-1 != trap.requirements) {
                    if (0 != trap.roomType && trap.name != null && trap.renown <= gm_.playerInformation.highestRenown) {
                        final cp_ cp_ = new cp_(10, n, trap);
                        n += cp_.imageHeight + 10;
                        this._v[i] = cp_;
                        this._R.a507(cp_);
                    }
                }
            }
        }
    }
    
    private final void a652(final int n, final int n2, final byte b, final int n3) {
        if (b < 126) {
            return;
        }
        int n4 = gm_.playerInformation.dungeonLayout[n3].roomType;
        if (qj_.dungeonLayout[n3] != null) {
            n4 = qj_.dungeonLayout[n3].roomType;
        }
        if (n4 != 0) {
            this.a041(n2, 124, n3, -dm_._a[n4].imageHeight + 56 + n, dm_._a[n4]);
            if (2 == gh_.traps[n4].roomType) {
                final Graphic trapPiece = jb_.getTrapPiece(n4);
                if (null != trapPiece) {
                    final int n5 = trapPiece.imageWidth2 * 5 >> 3;
                    final int n6 = trapPiece.imageHeight2 * 5 >> 3;
                    trapPiece.c115(n2 + (-n5 + 48 >> 1), 40 + n - n6, n5, n6);
                }
            }
        }
        else {
            int n7 = 0;
            if (0 != n3 % 7 && gm_.playerInformation._k.a370(n3 - 1 - n3 / 7)) {
                n7 |= 0x1;
            }
            if (n3 % 7 != 6) {
                if (gm_.playerInformation._k.a370(n3 - n3 / 7)) {
                    n7 |= 0x2;
                }
            }
            if (n3 > 6) {
                if (gm_.playerInformation._k.a370(n3 + 35)) {
                    n7 |= 0x4;
                }
            }
            if (42 > n3 && gm_.playerInformation._k.a370(n3 + 42)) {
                n7 |= 0x8;
            }
            id_._m[n7].drawImage(n2, n + 12);
        }
    }
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        super._e.drawImage(0, 0);
        Room ai_ = null;
        if (-1 != this._F) {
            ai_ = qj_.dungeonLayout[this._F];
            if (null == ai_) {
                ai_ = gm_.playerInformation.dungeonLayout[this._F];
            }
        }
        Trap ac_ = null;
        if (ai_ != null) {
            ac_ = ai_.trap;
        }
        else if (this._R._l != null) {
            ac_ = ((cp_)this._R._l).trap;
        }
        qe_.a738(200, 65, ac_);
        if (null != ai_) {
            qe_.a484(488, 54, ai_);
        }
        else {
            qe_.a204(488, 54, this._H, kc_._V);
        }
        this.a183(false, 484, 327);
        for (rj_ rj_ = (rj_)super._p.e024(); rj_ != null; rj_ = (rj_)super._p.a024(4)) {
            rj_.a150(68);
        }
        ad_.interface_crescent.h093(187, 48);
        ad_.interface_crescent.i093(187, -ad_.interface_crescent.imageHeight + 40);
        ad_.interface_crescent.f093(604 - ad_.interface_crescent.imageWidth, 40 - ad_.interface_crescent.imageHeight);
        oe_.interface_dragon.h093(171, 382);
        oe_.interface_dragon.j093(580, 99);
        if (gl_.topDownOrIsometric) {
            this._u.b423((byte)(-55));
        }
        else {
            this.a326(8, 80, 394);
        }
        if (null != super._b) {
            super._b.a423((byte)(-91));
        }
        e797();
        super._q.a423((byte)(-61));
        if (!gl_.topDownOrIsometric) {
            final int n = (int)((1.0 + Math.cos(mo_._a / 20.0f)) * 128.0);
            DungeonPath._c.b326(205, 83, 256);
            DungeonPath._c.b326(205, 83, n);
            if (this._w._B) {
                ec_.a021(95, 205, im_._e, 16744448, 192);
            }
        }
        else {
            final int n2 = (int)(128.0 * (1.0 + Math.cos(mo_._a / 20.0f)));
            DungeonPath._c.b326(-(im_._e.imageWidth >> 1) + 356, -(im_._e.imageHeight >> 1) + 267, 256);
            DungeonPath._c.b326(356 - (im_._e.imageWidth >> 1), 267 - (im_._e.imageHeight >> 1), n2);
            if (this._w._B) {
                ec_.a021(-(im_._e.imageHeight >> 1) + 265, -(im_._e.imageWidth >> 1) + 354, im_._e, 16744448, 96);
            }
        }
        for (rj_ rj_2 = (rj_)super._p.e024(); null != rj_2; rj_2 = (rj_)super._p.a024(4)) {
            rj_2.d150(0);
        }
        if (this._F != -1) {
            if (null != this._R._l) {
                int c = 0;
                if (qj_.dungeonLayout[this._F] == null) {
                    if (null != gm_.playerInformation.dungeonLayout[this._F]) {
                        c = gm_.playerInformation.dungeonLayout[this._F].trap.cost >> 1;
                    }
                }
                else {
                    c = qj_.dungeonLayout[this._F].trap.cost;
                }
                if (c != 0) {
                    final int n3 = this._F / 7;
                    final int n4 = this._F % 7;
                    int n5 = 421 - (189 - (n4 + n3) * 27);
                    int n6 = 80 + 20 * (-n4 + (n3 + 7));
                    if (gl_.topDownOrIsometric) {
                        final gg_ b2 = this._u.b624(this._F, -15390);
                        n5 = b2._f - 1;
                        n6 = 7 + b2._b;
                    }
                    if (t_._a != c) {
                        final String string = "+" + c / 10;
                        jh_.a303(jn_._a = new Graphic(db_.roman12bold.b926(string), db_.roman12bold._E + db_.roman12bold._H));
                        db_.roman12bold.b191(string, 0, db_.roman12bold._H, 16744512, -1);
                        jh_.b797();
                        dm_._f = dd_.a510(12, jn_._a);
                        final int[] b3 = dm_._f._B;
                        for (int i = 0; i < b3.length; ++i) {
                            b3[i] = nb_.and(b3[i], 255);
                            if (0 == b3[i]) {
                                b3[i] = 1;
                            }
                        }
                        t_._a = c;
                    }
                    final int n7 = n5 - (jn_._a.imageWidth >> 1);
                    final int n8 = -jn_._a.imageHeight + n6;
                    bp_.a131(n8, dm_._f, n7);
                    jn_._a.drawImage(n7, n8);
                }
            }
        }
        this._N.d797();
        this._I.d797();
        if (null != super._b) {
            for (int j = 0; j < gf_._b.length; ++j) {
                gf_._b[j] = nb_.and(gf_._b[j] >>> 2, 1061109567);
            }
            super._b.b150(112);
        }
        if (kn_.isTutorial) {
            ab_.a150();
        }
        oh_.a423();
    }
    
    static final void a467(final nh_ nh_, final nh_ nh_2, final nh_ nh_3) {
        gn_.frame_top = kn_.a922(nh_3, "commonui", "frame_top");
        RenownTableEntry.frame_bottom = kn_.a922(nh_3, "commonui", "frame_bottom");
        bl_.jagex_logo_grey = oh_.a825(nh_3, "commonui", "jagex_logo_grey");
        na_._C = kn_.a922(nh_3, "commonui", "button");
        sl_._c = da_.a632("commonui", "validation", 0, nh_3);
        ta_._e = kk_.a005(nh_2, nh_3, "arezzo12", 0, "commonui");
        lp_._C = kk_.a005(nh_2, nh_3, "arezzo14", 0, "commonui");
        hc_._f = kk_.a005(nh_2, nh_3, "arezzo14bold", 0, "commonui");
        final Graphic cn_ = new Graphic(nh_.a826("button.gif", ""), c_.canvas);
        pa_.a872(nh_3, "commonui", "dropdown");
        final q_[] a466 = qa_.a466("screen_options", "commonui", nh_3);
        d_._c = new q_[4];
        nf_._v = new q_[4];
        wo_._a = new q_[4];
        final q_[][] array = { d_._c, nf_._v, wo_._a };
        final int[][] array2 = new int[4][];
        array2[0] = a466[0]._i;
        for (int n = 1; array2.length > n; ++n) {
            array2[n] = array2[0].clone();
        }
        final byte b = a466[0]._j[0];
        array2[2][b] = 16777215;
        array2[1][b] = 2394342;
        array2[3][b] = 4767999;
        for (int i = 0; i < 3; ++i) {
            final q_[] array3 = array[i];
            for (int j = 0; j < array3.length; ++j) {
                array3[j] = pi_.a648(1, a466[i], array2[j]);
            }
        }
        final int v = cn_.imageHeight;
        ie_.a150();
        cn_.e797();
        gf_.d115(0, 0, gf_._i, gf_._c);
        final Graphic cn_2 = new Graphic(v, v);
        cn_2.e797();
        cn_.c093(0, 0);
        final Graphic cn_3 = new Graphic(v, v);
        cn_3.e797();
        cn_.c093(-cn_.imageWidth + v, 0);
        final Graphic cn_4 = new Graphic(cn_.imageWidth - v * 2, v);
        cn_4.e797();
        cn_.c093(-v, 0);
        ti_.c487(true);
        na_._C = new Graphic[] { cn_2, cn_4, cn_3 };
    }
    
    static final vk_ a853(final int d, final String g) {
        final vk_ vk_ = new vk_(false);
        vk_._g = g;
        vk_._d = d;
        return vk_;
    }
    
    private final void a183(final boolean b, final int n, final int n2) {
        int n3 = n2 + (8 + la_.roman12._H);
        db_.roman12bold.b191(pb_.text_treasure_colon, 7 + n, n3, 16777215, -1);
        db_.roman12bold.a191(Integer.toString(gm_.playerInformation.unspentTreasureAmount / 10), 133 + n, n3, 16777215, -1);
        final int n4 = (0 >= jj_._c) ? 0 : (jj_._c / 10);
        n3 += 37;
        if (b) {
            return;
        }
        final int n5 = (gm_.playerInformation.unspentTreasureAmount < jj_._c) ? 16711680 : 16777215;
        db_.roman12bold.b191(ef_.text_cost_colon, 7 + n, n3, n5, -1);
        db_.roman12bold.a191(Integer.toString(n4), n + 133, n3, n5, -1);
    }
    
    private final void d150() {
        this._F = -1;
        if (kn_.isTutorial) {
            if (od_.a427()) {
                return;
            }
        }
        if (!super.d801()) {
            this._F = this.b313(hj_.mouseX, Animation.mouseY, 162);
            if (this._F != -1) {
                Room room = qj_.dungeonLayout[this._F];
                if (room == null) {
                    room = gm_.playerInformation.dungeonLayout[this._F];
                }
                if (room != null) {
                    if (room != rd_._x) {
                        hh_._r = new bd_(room.trap);
                        rd_._x = room;
                    }
                    uj_.a872(hh_._r);
                }
            }
            if (this._Q == hh_._s) {
                this.c150(115);
                this.a813(true, (byte)(-27));
            }
            else if (this._O != hh_._s) {
                if (this._L != hh_._s) {
                    if (hh_._s == this._A) {
                        this.a556((byte)(-47), 0);
                    }
                    else if (this._C != hh_._s) {
                        if (hh_._s == this._y) {
                            this.a556((byte)(-88), 4);
                        }
                        else if (this._P != hh_._s) {
                            if (hh_._s == this._w || this._t == hh_._s) {
                                this.a423((byte)(-121));
                            }
                            else if (!(hh_._s instanceof cp_)) {
                                if (0 != no_.isMetaDown) {
                                    final int b313 = this.b313(lc_.mouseX, hm_.mouseY, 162);
                                    if (b313 != -1 && b313 != 0 && b313 != 6 && b313 != 24 && 42 != b313) {
                                        if (b313 != 48) {
                                            if (no_.isMetaDown != 1) {
                                                if (2 == no_.isMetaDown) {
                                                    if (null != qj_.dungeonLayout[b313]) {
                                                        jj_._c -= qj_.dungeonLayout[b313].trap.cost;
                                                        if (gm_.playerInformation.dungeonLayout[b313] != null) {
                                                            jj_._c += gm_.playerInformation.dungeonLayout[b313].trap.cost >> 1;
                                                        }
                                                    }
                                                    qj_.dungeonLayout[b313] = null;
                                                    this._H = null;
                                                }
                                            }
                                            else if (this._R._l != null) {
                                                final Trap s = ((cp_)this._R._l).trap;
                                                if (qj_.dungeonLayout[b313] == null || s != qj_.dungeonLayout[b313].trap) {
                                                    if (null != qj_.dungeonLayout[b313]) {
                                                        jj_._c -= qj_.dungeonLayout[b313].trap.cost;
                                                    }
                                                    else if (gm_.playerInformation.dungeonLayout[b313] != null) {
                                                        jj_._c -= gm_.playerInformation.dungeonLayout[b313].trap.cost >> 1;
                                                    }
                                                    qj_.dungeonLayout[b313] = new Room(s.trapId);
                                                    if (null == qj_.dungeonLayout[b313]._c || qj_.dungeonLayout[b313]._c.idleAnimation != s.idleAnimation) {
                                                        qj_.dungeonLayout[b313]._c = new wd_(s.idleAnimation);
                                                    }
                                                    jj_._c += s.cost;
                                                    qh_.a726(this._Q, 19);
                                                    if (s.victoryAnimation != qj_.dungeonLayout[b313]._c._n) {
                                                        if (null != s.victoryAnimation) {
                                                            qj_.dungeonLayout[b313]._c.a721(rf_._M, s.victoryAnimation);
                                                        }
                                                        if (s._a != null) {
                                                            gd_.a364(64, s._a);
                                                        }
                                                    }
                                                }
                                            }
                                            jk_.j423();
                                            this.c423((byte)(-118));
                                        }
                                    }
                                }
                            }
                            else {
                                final Trap s2 = ((cp_)hh_._s).trap;
                                this._H = new wd_(s2.idleAnimation);
                                if (null != s2.victoryAnimation) {
                                    this._H.a721(rf_._M, s2.victoryAnimation);
                                }
                            }
                        }
                        else {
                            this.a556((byte)(-52), 3);
                        }
                    }
                    else {
                        this.a556((byte)(-82), 2);
                    }
                }
                else {
                    this.a556((byte)(-50), 1);
                }
            }
            else {
                this.d423((byte)(-76));
                this.a813(true, (byte)(-11));
            }
        }
    }
    
    private final void a556(final byte b, final int z) {
        final int[] array = new int[gh_.traps.length];
        if (0 == z) {
            for (int i = 0; i < array.length; ++i) {
                if (null != gh_.traps[i]) {
                    array[i] = gh_.traps[i].cost;
                }
            }
        }
        else if (z == 1) {
            for (int n = 0; array.length > n; ++n) {
                if (gh_.traps[n] != null) {
                    array[n] = gh_.traps[n].attack;
                }
            }
        }
        else if (z != 2) {
            if (3 == z) {
                for (int j = 0; j < array.length; ++j) {
                    if (gh_.traps[j] != null) {
                        array[j] = gh_.traps[j].snare;
                    }
                }
            }
            else if (4 == z) {
                for (int n2 = 0; array.length > n2; ++n2) {
                    if (gh_.traps[n2] != null) {
                        array[n2] = gh_.traps[n2].detect;
                    }
                }
            }
        }
        else {
            for (int n3 = 0; array.length > n3; ++n3) {
                if (null != gh_.traps[n3]) {
                    array[n3] = gh_.traps[n3].defence;
                }
            }
        }
        if (this._z != z) {
            this._s = false;
        }
        else {
            this._s = !this._s;
        }
        this._z = z;
        if (!this._s) {
            for (int k = 0; k < array.length; ++k) {
                array[k] = -array[k];
            }
        }
        if (this._v != null) {
            ik_.a019(this._D = this._v.clone(), array);
        }
        if (b >= -42) {
            this._R = null;
        }
        hf_._nb._J = null;
        hf_._nb.e487();
        int n4 = 0;
        final cp_[] d = this._D;
        for (int l = 0; l < d.length; ++l) {
            final cp_ cp_ = d[l];
            if (cp_ != null) {
                cp_.b599(10, n4, (byte)4);
                n4 += 8 + cp_.imageHeight;
                hf_._nb.a720(cp_, (byte)(-48));
            }
        }
    }
    
    @Override
    final void c487(final boolean b) {
        super.c487(b);
        if (kh_._s || !b) {
            return;
        }
        while (ha_.b427()) {
            if (mm_._t == 13) {
                this.a813(false, (byte)(-94));
            }
            else {
                super.f797();
            }
        }
        if (null != super._b && super._b._d) {
            if (!((lf_)super._b)._u) {
                this.d423((byte)(-76));
            }
            else {
                this.c150(65);
            }
            super._b.c150();
            super._b = null;
            this.a813(true, (byte)(-11));
        }
        this.d150();
        if (kn_.isTutorial) {
            bl_.a150(0);
        }
        if (this._H != null) {
            this._H.a556((byte)109, 20);
        }
        final Room[] l = gm_.playerInformation.dungeonLayout;
        for (int i = 0; i < l.length; ++i) {
            final Room ai_ = l[i];
            if (null != ai_) {
                ai_._c.a556((byte)109, 20);
            }
        }
        final Room[] c = qj_.dungeonLayout;
        for (int j = 0; j < c.length; ++j) {
            final Room ai_2 = c[j];
            if (ai_2 != null) {
                ai_2._c.a556((byte)109, 20);
            }
        }
    }
    
    public static void d487(final boolean b) {
        DungeonBuilder.text_raids = null;
        DungeonBuilder._G = null;
        DungeonBuilder.pleasewait_dotdotdot = null;
        DungeonBuilder._x = null;
        DungeonBuilder.tutorial_raiders1 = null;
        if (!b) {
            DungeonBuilder.pleasewait_dotdotdot = null;
        }
    }
    
    private final void c423(final byte b) {
        this._Q.isActive = (gm_.playerInformation.unspentTreasureAmount >= jj_._c);
    }
    
    //original signature: private final int b313(int n, int n2, final int n3) {
    private final int b313(int mouseX, int mouseY, final int n3) {
        if (this._u != null) {
            return this._u.b313(mouseX, 19091, mouseY);
        }
        mouseY -= 98;
        mouseX -= 394;
        final int n4 = ((189 + mouseX) * 3 + 560 - mouseY * 4) / 162;
        final int n5 = (3 * mouseX + mouseY * 4) / n3;
        if (n4 >= 0 && 0 <= n5 && n4 < 7 && n5 < 7) {
            return 7 * n5 + n4;
        }
        return -1;
    }
    
    private final void d423(final byte b) {
        for (int i = 0; i < 49; ++i) {
            qj_.dungeonLayout[i] = null;
        }
        jj_._c = 0;
        if (b != -76) {
            this.b150(-63);
        }
        this.c423((byte)34);
    }
    
    private final void a813(final boolean b, final byte b2) {
        int n = 0;
        if (b2 > -3) {
            this.c423((byte)76);
        }
        while (49 > n && null == qj_.dungeonLayout[n]) {
            ++n;
        }
        if (n != 49) {
            String s = wj_.text_confirm_changes_dungeon;
            if (!gm_.playerInformation.isDungeonActivated) {
                s += dh_.text_warning_activate_dungeon;
            }
            super._b = new lf_(oa_.text_confirm_changes, s);
            return;
        }
        if (!tl_._l) {
            if (!gm_.playerInformation.isDungeonActivated) {
                Trap._B.storeFuzzedOpcode(58);
            }
        }
        if (kn_.isTutorial) {
            gd_.a778(g_._Hb, 0, 5, b);
            return;
        }
        gd_.a778(g_._Hb, 0, g_._Hb, b);
    }
    
    private final void a423(final byte b) {
        this.a823(this._w, dc_.on, (byte)125, ob_.off, mm_.text_plan);
        this.a823(this._t, dc_.on, (byte)122, ob_.off, AmbientAudioTrack.text_3dview);
        if (b > -65) {
            this.c797();
        }
        if (gl_.topDownOrIsometric == this._t._B) {
            gl_.topDownOrIsometric = !this._t._B;
            this.a150(14);
        }
    }
    
    private final void b150(final int n) {
        rl_._d = a528(ri_.walls, 400);
        dm_._a = a528(i_.room_icons, 400);
        id_._m = a528(mc_.room_floors, n - 2398);
        final int n2 = 390;
        final int n3 = 300;
        bd_._g = new Graphic(n2, n3);
        if (n != 2798) {
            this._N = null;
        }
        jh_.a303(bd_._g);
        nb_._d.a115(0, 0, n2, n3);
        jh_.b797();
    }
    
    //dungeon builder screen
    private final void e150(final int n) {
        this.b797();
        this._R = new nn_(true);
        this._M = new nn_(false);
        hf_._nb = new ed_(8, 90, 180, 382);
        this._Q = tn_.a226(16, 12, ne_.roman20, jm_.button_152, n ^ 0xFFFFB8BB, lk_.text_commit);
        this._O = tn_.a226(472, 12, ne_.roman20, jm_.button_152, n ^ 0xFFFFB8B8, be_.text_cancel.toUpperCase());
        this._A = sj_.a921(24, 87, 66, uj_.stat_renown, this._M);
        this._L = sj_.a921(55, 96, 66, gd_.stat_attack, this._M);
        this._C = sj_.a921(86, 110, 66, jj_.stat_defence, this._M);
        this._P = sj_.a921(117, 87, 66, tb_.stat_snare, this._M);
        this._y = sj_.a921(148, 91, 66, kd_.stat_detect, this._M);
        super._p.a865(hf_._nb);
        super._p.a865(this._Q);
        super._p.a865(this._O);
        super._p.a865(this._A);
        super._p.a865(this._L);
        super._p.a865(this._C);
        super._p.a865(this._P);
        super._p.a865(this._y);
        this._A._n = new Tooltip(jk_.replacePlaceholders(new String[] { tn_.text_cost }, tp_.text_sort_rooms_by));
        this._L._n = new Tooltip(jk_.replacePlaceholders(new String[] { qk_.text_attack }, tp_.text_sort_rooms_by));
        this._C._n = new Tooltip(jk_.replacePlaceholders(new String[] { dj_.text_defence }, tp_.text_sort_rooms_by));
        this._P._n = new Tooltip(jk_.replacePlaceholders(new String[] { rk_.text_snare }, tp_.text_sort_rooms_by));
        this._y._n = new Tooltip(jk_.replacePlaceholders(new String[] { eg_.text_detect }, tp_.text_sort_rooms_by));
        this._O._n = new Tooltip(null, pm_.text_exit_without_saving, nk_.text_exit_without_saving_brief);
        this._Q._n = new Tooltip(null, ud_.text_save_and_exit, oi_.text_save_and_exit_brief);
        this.b423((byte)26);
        this._z = 0;
        this._s = false;
        this._M.a780(this._A, -256);
        this.a556((byte)(-124), 0);
        this._w = this.a836(ob_.off, mm_.text_plan, 491, n ^ 0xFFFFB8C0, 438, dc_.on);
        this._w._B = true;
        super._p.a865(this._w);
        this._t = this.a836(ob_.off, AmbientAudioTrack.text_3dview, 491, -1, 401, dc_.on);
        this._t._B = !gl_.topDownOrIsometric;
        super._p.a865(this._t);
        if (n != 18239) {
            return;
        }
        (super._q = new sa_(186, 401, 288, 71)).a050(true, f_.text_dungeon_builder, (byte)91, MusicTrack.text_dungeon_builder_hint, 16777215);
    }
    
    private final void a150(final int n) {
        (ol_._a = new Graphic[4])[0] = me_.a028(32, n, 14, 0, 14);
        ol_._a[1] = me_.a028(32, 14, 0, 14, 14);
        ol_._a[2] = me_.a028(md_.xor(n, 46), 0, 14, 14, 14);
        ol_._a[3] = me_.a028(32, 14, 14, 14, 0);
        if (!gl_.topDownOrIsometric) {
            ol_._a = a528(wk_.a528(ol_._a, n - 14), 400);
        }
        if (gl_.topDownOrIsometric) {
            this._u = new sf_(null, 350, 261);
        }
        else {
            this._u = null;
        }
        jk_.j423();
    }
    
    @Override
    final void c797() {
        im_._e = null;
        rl_._d = null;
        dm_._a = null;
        rd_._x = null;
        jn_._a = null;
        dm_._f = null;
        ol_._a = null;
        DungeonPath._c = null;
        bd_._g = null;
        id_._m = null;
        hh_._r = null;
        bn_._f = null;
        super.c797();
        System.gc();
    }
    
    private final void c150(final int n) {
        if (n < 56) {
            this.a326(-105, -4, 26);
        }
        if (gm_.playerInformation.unspentTreasureAmount >= jj_._c) {
            if (!tl_._l) {
                Trap._B.storeFuzzedOpcode(57);
                for (int i = 0; i < 49; ++i) {
                    if (i != 0 && 6 != i && 24 != i && i != 42) {
                        if (48 != i) {
                            if (null != qj_.dungeonLayout[i]) {
                                Trap._B.storeByte(qj_.dungeonLayout[i].roomType);
                            }
                            else {
                                Trap._B.storeByte(0);
                            }
                        }
                    }
                }
            }
            if (jj_._c > 0) {
                final PlayerInformation d = gm_.playerInformation;
                d.unspentTreasureAmount -= jj_._c;
            }
            for (int n2 = 0; 49 > n2; ++n2) {
                if (n2 != 0 && n2 != 6 && 24 != n2 && n2 != 42) {
                    if (n2 != 48) {
                        if (null != qj_.dungeonLayout[n2]) {
                            gm_.playerInformation.dungeonLayout[n2] = new Room(qj_.dungeonLayout[n2].roomType);
                            gm_.playerInformation.dungeonLayout[n2]._c = qj_.dungeonLayout[n2]._c;
                            qj_.dungeonLayout[n2] = null;
                        }
                    }
                }
            }
            jj_._c = 0;
            this.c423((byte)(-91));
        }
    }
    
    private final void a041(final int n, final int n2, final int n3, final int n4, final Graphic cn_) {
        int n5 = 256;
        if (0 == gm_.playerInformation.dungeonLayout[n3].roomType) {
            n5 = 128;
        }
        final int n6 = 10066329;
        final int n7 = n5 * (192 + ((n6 & 0xFF0000) >> 18)) / 255;
        final int n8 = (((n6 & 0xFF00) >> 10) + 192) * n5 / 255;
        final int n9 = (((n6 & 0xFF) >> 2) + 192) * n5 / 255;
        int n10 = 0;
        int n11 = (cn_._A + n4) * gf_._i + (n + cn_._w);
        final int n12 = -cn_.imageWidth + gf_._i;
        int i = -cn_.imageHeight;
        if (n2 <= 54) {
            this.a823(null, null, (byte)(-123), null, null);
        }
        while (i < 0) {
            for (int n13 = -cn_.imageWidth; 0 > n13; ++n13) {
                final int n14 = cn_._B[n10];
                if (n14 != 0) {
                    gf_._b[n11] = (((n14 & 0xFF0000) * n7 & 0xFF000000) | ((n14 & 0xFF00) * n8 & 0xFF0000) | ((n14 & 0xFF) * n9 & 0xFF00)) >>> 8;
                }
                ++n11;
                ++n10;
            }
            n11 += n12;
            ++i;
        }
    }
    
    private final void a326(final int n, final int n2, final int n3) {
        bd_._g.drawImage(-(bd_._g.imageWidth >> 1) + n3 + 2, n2 + 12);
        final PlayerInformation d = gm_.playerInformation;
        if (n != 8) {
            DungeonBuilder._x = null;
        }
        for (int i = 0; i <= 140; ++i) {
            gf_.b115(-(i * 4 / 3) + n3, i + 18 + n2, i * 8 / 3, 0);
            gf_.b115(n3 - i * 4 / 3, -i + 280 + n2 + 18, i * 8 / 3, 0);
        }
        for (int j = 0; j < 7; ++j) {
            int n4 = n3 - (1 + j) * 27;
            final int n5 = 20 * j + n2;
            for (int n6 = 6 - j, k = 0; k < 1 + j; ++k, n6 += 8) {
                if (k == 0) {
                    if (n6 != 0 && n6 != 6) {
                        this.a041(n4, 92, n6, n5 + 4, rl_._d[5]);
                    }
                }
                else {
                    final boolean a370 = d._k.a370(35 + n6);
                    int n7 = 5;
                    if (a370) {
                        n7 = (false ? 1 : 3);
                    }
                    this.a041(n4, 97, n6, 4 + n5, rl_._d[n7]);
                }
                if (j == k) {
                    if (n6 != 6) {
                        if (n6 != 48) {
                            this.a041(27 + n4, 119, n6, n5 + 4, rl_._d[4]);
                        }
                    }
                }
                else {
                    final boolean a371 = d._k.a370(n6 - n6 / 7);
                    int n8 = 4;
                    if (a371) {
                        n8 = (false ? 0 : 2);
                    }
                    this.a041(27 + n4, 110, n6, 4 + n5, rl_._d[n8]);
                }
                this.a652(n5, n4, (byte)127, n6);
                n4 += 54;
            }
        }
        for (int n9 = 7; 13 > n9; ++n9) {
            int n10 = -((13 - n9) * 27) + n3;
            final int n11 = n2 + n9 * 20;
            int n12 = 7 * n9 - 42;
            for (int n13 = 0; 13 - n9 > n13; ++n13) {
                final boolean a372 = d._k.a370(n12 + 35);
                int n14 = 5;
                if (a372) {
                    n14 = (false ? 1 : 3);
                }
                this.a041(n10, 57, n12, 4 + n11, rl_._d[n14]);
                final boolean a373 = d._k.a370(n12 - n12 / 7);
                int n15 = 4;
                if (a373) {
                    n15 = (false ? 0 : 2);
                }
                this.a041(27 + n10, 124, n12, n11 + 4, rl_._d[n15]);
                this.a652(n11, n10, (byte)127, n12);
                if (n13 == 0 && n12 != 0 && 42 != n12) {
                    rl_._d[4].drawImage(n10, 20 + (4 + n11));
                }
                if (-n9 + 12 == n13 && 42 != n12 && n12 != 48) {
                    rl_._d[5].drawImage(27 + n10, 24 + n11);
                }
                n12 += 8;
                n10 += 54;
            }
        }
    }
    
    @Override
    final void b487(final boolean b) {
        super.b487(b);
        fk_.a261(lf_.da_title3);
        qe_.a268(super._e, 188, 48, 605, 400, 394, 220);
        jh_.a276(super._e);
        qe_.b370(8, 46, 180, 427, 16777215, 32, 128);
        Raider.a086(false, 388, 15, true, 80);
        Raider.a086(false, 426, 617, true, 46);
        qe_.a229(8, 47, 172, 425, 256, 32, 8, 128);
        qe_.a229(8, 8, 172, 32, 256, 64, 4, 128);
        qe_.a229(460, 8, 172, 32, 256, 64, 4, 128);
        qe_.a229(188, 8, 264, 32, 256, 64, 4, 128);
        this._E.b326(12, 320 - (this._E._i >> 1));
        ke_.a115(0, 480, 0);
        ke_.a115(180, 480, 0);
        ke_.a115(605, 480, 48);
        jc_.a669(32, 452, 8, 1, 2, 1);
        ke_.a115(-be_._o.imageWidth + 640, 480, 0);
        c_.a842(0);
        c_.a842(40);
        c_.a842(-bk_.cracked_bar.imageHeight + 480);
        qe_.a115(14, 55, 161, 36);
        qe_.b370(188, 55, 418, 83, 8421504, 128, 128);
        qe_.a229(188, 55, 418, 83, 256, 64, 4, 32);
        qe_.a669(188, 55, 418, 11184810, 255, 128);
        qe_.a669(188, 137, 418, 11184810, 255, 128);
        qe_.b370(186, 400, 418, 87, 8421504, 32, 64);
        qe_.a669(186, 399, 418, 0, 255, 128);
        qe_.a669(186, 400, 418, 11184810, 255, 128);
        qe_.a229(186, 402, 420, 70, 256, 64, 4, 32);
        qe_.a115(484, 327, 144, 30);
        qe_.a115(484, 364, 144, 30);
        qe_.a115(484, 401, 144, 30);
        qe_.a115(484, 438, 144, 30);
        jh_.b797();
        this.b150(2798);
        jj_._c = 0;
        qj_.dungeonLayout = new Room[49];
        t_._a = -1;
        bl_.a423();
        this.e150(18239);
        this.a150(14);
        this._H = null;
        this._N = new rh_(204, 394, 80, 160, 16711680, 768, 249);
        this._I = new rh_(600, 111, 80, 160, 16711680, 768, 249);
        qh_.a726(this._v[15], 18);
    }
    
    DungeonBuilder() {
        this._E = new HeaderLabelText(ne_.roman20, f_.text_dungeon_builder, cm_._M);
    }
    
    static {
        DungeonBuilder.pleasewait_dotdotdot = "Please wait...";
        DungeonBuilder._x = new int[8192];
        DungeonBuilder.tutorial_raiders1 = new String[] { null, "Each <%raider> has four skills - <%attack>, <%defence>, <%dodge> and <%sneak> - displayed as bars above your party selection. Some raiders also possess a special ability." };
        DungeonBuilder.text_raids = "Raids: ";
    }
}
