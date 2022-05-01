import java.applet.*;
import java.net.*;

final class fk_ extends kl_
{
    private Graphic _m;
    private Graphic _u;
    private Graphic _n;
    private pp_ _p;
    private int _t;
    static tb_ _v;
    //original name: _s
    static String invaliduserorpass;
    private int _q;
    private pp_ _o;
    //original name: _r
    static String create_password;
    private String _w;
    
    final void a067(final PlayerInformation lb_, final int n) {
        if (n != 83) {
            return;
        }
        for (int n2 = 0; 8 > n2; ++n2) {
            final RaidMember hb_ = gm_.playerInformation.stableMembers[n2];
            if (hb_ == null || 255 == hb_._p) {
                if (null != qd_._c) {
                    if (qd_._c[n2]) {
                        qd_._c[n2] = false;
                        --sd_._J;
                    }
                }
            }
            if (hb_ != null) {
                if (hb_._p == 255) {
                    hb_._b = new wd_(k_._c);
                }
                else {
                    hb_._b = new wd_(hb_.raider.idleAnimation);
                }
            }
        }
        this.b423();
    }
    
    private final void d423(final byte b) {
        if (b > -104) {
            this._u = null;
        }
        for (int n = 0; 2 > n; ++n) {
            for (int i = 0; i < 4; ++i) {
                final int n2 = 199 + 83 * i;
                final int n3 = 57 + n * 86;
                gf_.b050(n2, n3, 72, 72, 65793);
                rp_.a857(4, 64, (byte)108, 4 + n2, 64, kc_._V, n3 + 4);
            }
        }
        for (int n4 = 0; 4 > n4; ++n4) {
            final int n5 = n4 * 130 + 37;
            final int n6 = 227;
            gf_.b050(n5, n6, 96, 96, 65793);
            rp_.a857(4, 88, (byte)108, 4 + n5, 88, kc_._S, n6 + 4);
        }
    }
    
    public static void d150() {
        fk_.invaliduserorpass = null;
        fk_._v = null;
        fk_.create_password = null;
    }
    
    static final void a261(final MusicTrack musicTrack) {
        if (musicTrack == null) {
            lo_.a789(116, true, null, 64, 0);
            return;
        }
        lo_.a789(85, true, musicTrack._b, 64, musicTrack._f);
    }
    
    @Override
    final void b150(final int n) {
        final int n2 = 20;
        boolean b = true;
        for (int n3 = -hf_.menu_chain.imageHeight + n2; -hf_.menu_chain.imageHeight < n3; n3 -= hf_.menu_chain.imageHeight) {
            final int n4 = 70;
            final int n5 = 545;
            if (b) {
                hf_.menu_chain.drawImage(n4, n3);
                hf_.menu_chain.drawImage(n5, n3);
            }
            else {
                hf_.menu_chain.g093(n4, n3);
                hf_.menu_chain.g093(n5, n3);
            }
            b = !b;
        }
        gf_.e115(0, 0, 640, am_.menu_chain_frame.imageHeight2 + n2 - 12);
        am_.menu_chain_frame.drawImage(-(am_.menu_chain_frame.imageWidth2 / 2) + 320, n2);
        gf_.b797();
        lf_.menu_chain_line.c093(321 - lf_.menu_chain_line.imageWidth2 / 2, 60 + n2);
        lf_.menu_chain_ext.drawImage(320 - lf_.menu_chain_ext.imageWidth2 / 2, am_.menu_chain_frame.imageHeight2 + (n2 - 28));
        gf_.b669(37 + super._k, 57 + super._j, 155, 158, 65793, 64);
        super.b150(-64);
        this.e150(-64);
        RaidMember hb_ = null;
        if (-1 != this._q) {
            hb_ = gm_.playerInformation.stableMembers[this._q];
        }
        qe_.a305(50 + super._k, super._j + 136, hb_, 0);
        if (hb_ != null) {
            db_.roman12bold.a385(hb_.raider.name.toUpperCase(), 45 + super._k, super._j + 62, 139, 58, 16777215, -1, 1, 1, db_.roman12bold._H);
        }
    }
    
    @Override
    final void a487(final boolean b) {
        this._q = -1;
        super.a487(b);
        this._q = this.b313(hj_.mouseX, 27403, Animation.mouseY);
        if (hh_._s != this._p) {
            if (hh_._s == this._o) {
                if (0 < sd_._J && sd_._J <= 4) {
                    final RaidMember[] a = gm_.playerInformation.stableMembers;
                    for (int n = 0; a.length > n; ++n) {
                        final RaidMember hb_ = a[n];
                        if (hb_ != null) {
                            if (qd_._c[hb_.position]) {
                                hb_._b.a942(hb_.raider.victoryAnimation);
                                if (hb_.raider.revealTrack != null) {
                                    gd_.a364(64, hb_.raider.revealTrack);
                                }
                            }
                        }
                    }
                    mc_.a623(this._w, this._t, !b, qd_._c);
                }
            }
            else if (no_.isMetaDown != 0) {
                final int b2 = this.b313(lc_.mouseX, 27403, hm_.mouseY);
                if (-1 != b2) {
                    final RaidMember hb_2 = gm_.playerInformation.stableMembers[b2];
                    if (hb_2 != null && 255 != hb_2._p) {
                        if (qd_._c[b2]) {
                            --sd_._J;
                            qd_._c[b2] = false;
                            hb_2._b.a942(hb_2.raider.defeatAnimation);
                        }
                        else if (4 > sd_._J) {
                            ++sd_._J;
                            qd_._c[b2] = true;
                            if (hb_2._b._n == hb_2._b.idleAnimation) {
                                hb_2._b.a942(hb_2.raider.selectAnimation);
                                if (hb_2.raider.revealTrack != null) {
                                    gd_.a364(64, hb_2.raider.revealTrack);
                                }
                            }
                        }
                    }
                }
                this._o.isActive = (0 < sd_._J && 4 >= sd_._J);
            }
        }
        else {
            this.a813(true, (byte)22);
        }
    }
    
    @Override
    final void b487(final boolean b) {
        if (b) {
            return;
        }
        if (mm_._t == 13) {
            this.a813(false, (byte)22);
        }
        else {
            super.b487(b);
        }
    }
    
    private final int b313(final int n, final int n2, final int n3) {
        int n4 = 0;
        int n5 = 0;
        if (n2 != 27403) {
            this.d423((byte)(-91));
        }
        while (2 > n5) {
            for (int n6 = 0; 4 > n6; ++n6, ++n4) {
                final int n7 = 199 + super._k + 83 * n6;
                final int n8 = 86 * n5 + (57 + super._j);
                if (n7 <= n && n8 <= n3 && n7 + 72 > n && n3 < 72 + n8) {
                    return n4;
                }
                if (n4 == 7) {
                    break;
                }
            }
            ++n5;
        }
        int n9 = super._k + 37;
        final int n10 = 227 + super._j;
        for (int n11 = 0; 8 > n11; ++n11) {
            if (qd_._c[n11]) {
                if (n >= n9 && n3 >= n10 && 96 + n9 > n && n3 < n10 + 96) {
                    return n11;
                }
                n9 += 130;
            }
        }
        return -1;
    }
    
    static final void a587(final int n, final Applet applet) {
        try {
            if (n != 84) {
                fk_.invaliduserorpass = null;
            }
            final String file = applet.getDocumentBase().getFile();
            final int index = file.indexOf(63);
            String string = "reload.ws";
            if (0 <= index) {
                string += file.substring(index);
            }
            applet.getAppletContext().showDocument(j_.a550(new URL(applet.getCodeBase(), string), applet), "_self");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private final void e150(final int n) {
        if (n > -57) {
            this.a813(false, (byte)(-23));
        }
        int n2 = 0;
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 4; ++j, ++n2) {
                final int n3 = 83 * j + super._k + 199;
                final int n4 = 86 * i + (super._j + 57);
                if (gm_.playerInformation.stableMembers[n2] != null) {
                    gm_.playerInformation.stableMembers[n2]._b.a697(60, n4 + 6, (byte)102, n3 + 6, 60);
                    qe_.a608(72 + (n3 - 4), n4 + 72 - 4, 3, gm_.playerInformation.stableMembers[n2], 0);
                    int n5 = (int)(64.0 * (te_.c503(mo_._a, 10273 * n2, 0.015625) + 2.0));
                    if (n5 < 0) {
                        n5 = 0;
                    }
                    if (qd_._c[n2]) {
                        this._u.b326(n3, n4, n5);
                    }
                    if (this._q == n2) {
                        this._m.b326(n3, n4, 64);
                        this._n.b326(n3, n4, n5);
                    }
                }
            }
        }
        int n6 = super._k + 37;
        final int n7 = 227 + super._j;
        for (int k = 0; k < 8; ++k) {
            if (qd_._c[k]) {
                if (null != gm_.playerInformation.stableMembers[k]) {
                    gm_.playerInformation.stableMembers[k]._b.a697(84, 6 + n7, (byte)102, 6 + n6, 84);
                    qe_.a608(n6 + 96 - 4, n7 + 96 - 4, 3, gm_.playerInformation.stableMembers[k], 0);
                    n6 += 130;
                }
            }
        }
    }
    
    @Override
    final void c423(final byte b) {
        super.c423((byte)44);
        final RaidMember[] a = gm_.playerInformation.stableMembers;
        for (int i = 0; i < a.length; ++i) {
            final RaidMember hb_ = a[i];
            if (null != hb_) {
                hb_._b.a556((byte)109, 20);
            }
        }
    }
    
    private final void a813(final boolean b, final byte b2) {
        if (b2 != 22) {
            this.b487(true);
        }
        super._d = true;
    }
    
    @Override
    final void b423() {
        final int[] array = new int[64];
        for (int n = 0; 64 > n; ++n) {
            array[n] = mp_.or(Integer.MIN_VALUE, (n + 24) * 65793);
        }
        jh_.a276(super._l = new ph_(new Graphic(super.imageWidth, super.imageHeight), new Graphic(super.imageWidth, super.imageHeight)));
        da_.a563(pi_.text_raider_selection, cm_._M, super.imageWidth >> 1, (ne_.roman20._H + 36 >> 1) + 7, ne_.roman20);
        this.d423((byte)(-123));
        gf_.b050(44, 64, 141, 53, 65793);
        rp_.a857(4, 133, (byte)108, 48, 45, kc_._S, 68);
        jh_.b797();
    }
    
    fk_(final String w, final int t) {
        super(40, 40, 560, 380);
        this._t = t;
        this._w = w;
        this._p = tn_.a226(140, -jm_.button_152.imageHeight + super._j - 20 + super.imageHeight, ne_.roman20, jm_.button_152, -112, be_.text_cancel.toUpperCase());
        this._o = tn_.a226(-jm_.button_152.imageWidth + 500, -jm_.button_152.imageHeight + super._j + (super.imageHeight - 20), ne_.roman20, jm_.button_152, -73, lk_.text_commit);
        super._f.a865(this._p);
        super._f.a865(this._o);
        this.a067(null, 83);
        this._m = mf_.a971(10449103, 72, 6, 72);
        this._n = mf_.a971(255, 72, 12, 72);
        this._u = mf_.a971(16711680, 72, 12, 72);
        qd_._c = new boolean[8];
        this._o.isActive = false;
        sd_._J = 0;
        new rh_(58, 394, 80, 160, 16711680, 768, 249);
        new rh_(580, 394, 80, 160, 16711680, 768, 249);
        qh_.a726(this._o, 24);
    }
    
    static final Graphic a575(final Graphic cn_, final int n, final int n2) {
        final Graphic d125 = cn_.d125();
        final int n3 = n2 & 0xFF00FF;
        final int n4 = 0xFF00 & n2;
        for (int n5 = 0; d125._B.length > n5; ++n5) {
            final int n6 = d125._B[n5];
            final int n7 = (0x3F & n6 >> 2) + (n6 >> 18 & 0x3F) + (0x7F & n6 >> 9);
            int n8 = (0xFF0000 & n4 * n7) | (0xFF00FF00 & n7 * n3);
            if (n8 == 0 && n6 != 0) {
                n8 = 65793;
            }
            d125._B[n5] = n8 >>> 8;
        }
        jh_.a303(d125);
        cn_.d326(-cn_._w, -cn_._A, -n + 256);
        jh_.b797();
        return d125;
    }
    
    static {
        fk_.invaliduserorpass = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        fk_.create_password = "Password: ";
    }
}
