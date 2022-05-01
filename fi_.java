import java.awt.*;

final class fi_ extends qe_
{
	//original name: _t
    static String text_disarmed;
    //original name: _r
    static en_[] raiderStatBars;
    private HeaderLabelText[] _w;
    private Graphic _v;
    private kl_ _z;
    private HeaderLabelText _A;
    private Graphic _C;
    static nh_ _u;
    private rh_ _s;
    private int _B;
    private int _y;
    //original name: _x
    static String notyetachieved;
    private rh_ _D;
    
    private final int a353(final int n, final byte b) {
        int y = 120;
        if (b != -93) {
            return -30;
        }
        if (nk_._Fb[n] == 27) {
            y = of_.menu_button.imageWidth;
        }
        return y + this.a543((byte)(-4), n);
    }
    
    //original signature: static final Canvas d602() {
    static final Canvas getCanvas() {
        return (cm_._R == null) ? c_.canvas : cm_._R;
    }
    
    private final int a527(final boolean b, final int n) {
        if (b) {
            return -14;
        }
        final int n2 = nk_._Fb[n];
        if (25 == n2 || 24 == n2 || n2 == 26) {
            return 260;
        }
        if (n2 == 27) {
            return 340;
        }
        return 439;
    }
    
    //original signature: private final int a776(final int n, final byte b, final int n2) {
    private final int a776(final int n, final int n2) {
        for (int i = 0; i < nk_._Fb.length; ++i) {
            final int a527 = this.a527(false, i);
            if (nl_.a370(i) && n2 >= this.a543((byte)(-4), i) && n2 < this.a353(i, (byte)(-93)) && n >= a527 && n < 30 + a527) {
                return i;
            }
        }
        return -1;
    }
    
    private final void a183(final boolean b, final int n, final int n2) {
        final String a661 = this.a661(-13, nk_._Fb[n]);
        final int b2 = ne_.roman20.b926(a661);
        final int a662 = this.a543((byte)(-4), n);
        final int a663 = this.a353(n, (byte)(-93));
        final int a664 = this.a527(false, n);
        final int n3 = a663 - (-a662 + b2) >> 1;
        final int[] array = b ? ml_._b : cm_._M;
        if (null == this._w[n] || a661 != this._w[n].text || this._w[n].possibleColors != array) {
            this._w[n] = new HeaderLabelText(ne_.roman20, a661, array);
        }
        of_.menu_button.drawImage(640 - of_.menu_button.imageWidth >> 1, a664 - 4);
        this._w[n].b326(a664, n3);
        if (b) {
            if (n != this._y) {
                this.b093(n, -118);
            }
            this._v.b326(n3, a664, 64);
            int n4 = (int)((1.0 + te_.a132(mo_._a)) * 128.0);
            if (0 > n4) {
                n4 = 0;
            }
            if (256 < n4) {
                n4 = 256;
            }
            this._C.b326(n3, a664, n4);
        }
        if (n2 != 0) {
            this.a487(true);
        }
    }
    
    @Override
    final void c487(final boolean b) {
        super.c487(b);
        if (!kh_._s || !b) {
            while (ha_.b427()) {
                if (mm_._t == 13) {
                    gd_.a778(hl_._f, 0, hl_._f, false);
                }
                else {
                    this.f797();
                    if (-1 == nk_._Jb._b) {
                        continue;
                    }
                    this.b183(false, 240, nk_._Jb._b);
                }
            }
            nk_._Jb.a326(-7734, this.a776(hm_.mouseY, lc_.mouseX), this.a776(Animation.mouseY, hj_.mouseX));
            if (-1 != nk_._Jb._b) {
                this.b183(true, 240, nk_._Jb._b);
            }
        }
    }
    
    @Override
    final void c797() {
        super.c797();
    }
    
    @Override
    final void b487(final boolean b) {
        super.b487(b);
        int b2 = (nk_._Jb._i <= 0) ? -1 : 1;
        if (nk_._Jb._b != -1) {
            b2 = nk_._Jb._b;
        }
        nk_._Jb.a691(b, b2, this.a776(Animation.mouseY, hj_.mouseX));
        this._D = new rh_(58, 394, 80, 160, 255, 197376, 240);
        this._s = new rh_(580, 394, 80, 160, 255, 197376, 240);
        this._w = new HeaderLabelText[nk_._Jb._i];
        this._z = new kl_();
        jh_.a276(super._e);
        bf_.drawBorder(false);
        kn_._e = false;
        c_.a842(0);
        c_.a842(40);
        jc_.a669(432, 33, 48, 1, 2, 1);
        jc_.a669(432, 599, 48, 1, 2, 1);
        jc_.a669(32, 164, 8, 1, 2, 1);
        jc_.a669(32, 468, 8, 1, 2, 1);
        vd_.a669(558, 1, 1, 41, 416);
        ad_.interface_crescent.h093(41, 48);
        ad_.interface_crescent.j093(-ad_.interface_crescent.imageWidth + 599, 48);
        ad_.interface_crescent.f093(164 - ad_.interface_crescent.imageWidth, -ad_.interface_crescent.imageHeight + 40);
        ad_.interface_crescent.i093(172, 40 - ad_.interface_crescent.imageHeight);
        ad_.interface_crescent.f093(468 - ad_.interface_crescent.imageWidth, 40 - ad_.interface_crescent.imageHeight);
        ad_.interface_crescent.i093(476, -ad_.interface_crescent.imageHeight + 40);
        jh_.b797();
    }
    
    //original signature: private final int c080(final int n, final int n2) {
    //never called
    private final int c080() {
        return 30;
    }
    
    @Override
    //instructions menu
    final void a487(final boolean b) {
        super.a487(b);
        super._e.drawImage(0, 0); //clear screen? fire remnants appear otherwise
        am_.menu_chain_frame.drawImage(320 - am_.menu_chain_frame.imageWidth2 / 2, 48);
        
        for (int i = 0; i < nk_._Jb._i - 1; ++i) { //drawing button outlines
            if (nl_.a370(i)) {
                this.c183(i == nk_._Jb._b && !kn_._e, -33, i);
            }
        }
        
        //draw dragons
        oe_.interface_dragon.h093(24, 383);
        oe_.interface_dragon.j093(560, 383);
        
        if (!kn_._e) {
            e797();
        }
        
        //draw button text
        for (int j = 0; j < nk_._Jb._i - 1; ++j) {
            if (nl_.a370(j)) {
                this.a663(j, nk_._Jb._b == j && !kn_._e);
            }
        }
        
        //draw header
        na_.instructionsHeaderLabel.drawHeaderLabel();
        
        if (this._A == null || this._A.text != ie_.instructions_subtitles_text[mo_.instructionPageIndex]) {
            this._A = new HeaderLabelText(ne_.roman20, ie_.instructions_subtitles_text[mo_.instructionPageIndex], ag_._c);
        }
        this._A.b326(90, 87);
        
        this.a656(87, 3740, 200, en_.instructions_pages[mo_.instructionPageIndex], 446, 125);
        wk_.a455(552, bj_.a661(mo_.instructionPageIndex), ne_.roman20, 366, ag_._c, 31139);
        if (kn_._e) {
            this._z.a423((byte)(-64));
            final int n = nk_._Jb._i - 1;
            e797();
            this._z.b150(106);
            this.a183(nk_._Jb._b == n, n, 0);
            String s = null;
            String s2 = null;
            if (this._B != 2) {
                if (1 == this._B) {
                    s2 = tn_.capitalizeString(this.a661(-13, 25));
                    s = an_.instructions_traproom;
                }
                else if (this._B == 0) {
                    s2 = tn_.capitalizeString(this.a661(-13, 24));
                    s = uj_.instructions_monsterroom;
                }
            }
            else {
                s2 = tn_.capitalizeString(this.a661(-13, 26));
                s = sg_.instructions_guardianroom;
            }
            final int n2 = ne_.roman20._E + ne_.roman20._H;
            int n3;
            int n4;
            int n5;
            int n6;
            if (0 == this._B) {
                n3 = 119;
                n4 = 254;
                n5 = 77;
                n6 = 486;
            }
            else {
                n4 = 204;
                n3 = 169;
                n6 = 306;
                n5 = 167;
            }
            pi_.a959(s2, cm_._M, 30 + n5, ne_.roman20, n2 + n3);
            la_.roman12.a385(s, 30 + n5, n3 + (5 + n2), n6 - 60, n4 - 30, 16777215, -1, 0, 0, la_.roman12._H + la_.roman12._E);
        }
        oh_.a423();
        this._D.d797();
        this._s.d797();
    }
    
    private final void c183(final boolean b, final int n, final int n2) {
        final int a543 = this.a543((byte)(-4), n2);
        final int a544 = this.a353(n2, (byte)(-93));
        final int a545 = this.a527(false, n2);
        gf_.e050(a543 - 4, a545 - 6, 8 + (a544 - a543), 38, 0);
        qe_.b370(a543, a545 - 2, -a543 + a544, 30, 8421504, 128, 128);
        final int n3 = nk_._Fb[n2];
        if (n3 != 25 && n3 != 24 && 26 != n3) {
            rp_.a857(4, a544 - a543, (byte)108, a543, 30, kc_._S, a545 - 2);
        }
        else {
            rp_.a857(4, -a543 + a544, (byte)108, a543, 30, kc_._V, a545 - 2);
        }
        qe_.a229(a543, a545 - 2, a544 - a543, 30, 224, 64, 3, 128);
    }
    
    static final void a924(final int n, final String s, final int n2) {
        final Trap trap = gh_.traps[n2];
        if (null == null) {
            return;
        }
        final AmbientAudioTrack a492 = hd_.a492(n, "da_guardian_room_" + s);
        trap._a = a492;
        trap._x = a492;
    }
    
    private final void b093(final int y, final int n) {
        final String a661 = this.a661(-13, nk_._Fb[y]);
        final int b926 = ne_.roman20.b926(a661);
        final int n2 = ne_.roman20._E + ne_.roman20._H;
        if (n > -85) {
            return;
        }
        final Graphic cn_ = new Graphic(b926, n2);
        jh_.a303(cn_);
        ne_.roman20.b191(a661, 0, ne_.roman20._H, 16760960, -1);
        jh_.b797();
        this._v = GUICheckbox.a551(8, cn_, 16760960, (byte)77);
        this._C = GUICheckbox.a551(16, cn_, 6307840, (byte)(-105));
        this._y = y;
    }
    
    private final int a543(final byte b, int n) {
        if (b != -4) {
            this.a183(true, -67, -118);
        }
        final int n2 = nk_._Fb[n];
        if (n2 == 27) {
            return 640 - of_.menu_button.imageWidth >> 1;
        }
        if (n2 == 25 || 24 == n2 || n2 == 26) {
            n -= 3;
        }
        return 140 * n + 120;
    }
    
    @Override
    final void f797() {
        if (!nk_._Jb.b427()) {
            if (!kn_._e) {
                if (96 == mm_._t) {
                    int b = nk_._Jb._b;
                    do {
                        if (--b < 0) {
                            b = nk_._Jb._i - 1;
                        }
                    } while (!nl_.a370(b));
                    nk_._Jb.b093(b, 3);
                }
                if (mm_._t == 97) {
                    int b2 = nk_._Jb._b;
                    do {
                        ++b2;
                        if (nk_._Jb._i > b2) {
                            continue;
                        }
                        b2 = 0;
                    } while (!nl_.a370(b2));
                    nk_._Jb.b093(b2, 3);
                }
                if (6 == mo_.instructionPageIndex) {
                    if (98 == mm_._t) {
                        int b3 = nk_._Jb._b;
                        do {
                            b3 -= 3;
                            if (b3 < 0) {
                                b3 += nk_._Jb._i - 1;
                            }
                        } while (!nl_.a370(b3));
                        nk_._Jb.b093(b3, 3);
                    }
                    if (mm_._t == 99) {
                        int b4 = nk_._Jb._b;
                        do {
                            b4 += 3;
                            if (6 == b4) {
                                b4 = 0;
                            }
                            if (b4 >= nk_._Jb._i) {
                                b4 -= nk_._Jb._i - 1;
                            }
                        } while (!nl_.a370(b4));
                        nk_._Jb.b093(b4, 3);
                    }
                }
            }
        }
        nk_._Jb.e150(107);
        super.f797();
    }
    
    public static void a423(final byte b) {
        fi_.notyetachieved = null;
        if (b > -99) {
            a423((byte)2);
        }
        fi_.raiderStatBars = null;
        fi_.text_disarmed = null;
        fi_._u = null;
    }
    
    private final void a656(final int n, final int n2, final int n3, final String s, final int n4, final int n5) {
        final String[] a782 = jn_.a782(s, new int[] { n4 }, n2 - 3847, la_.roman12);
        if (n2 != 3740) {
            return;
        }
        int n6 = la_.roman12._H + n5;
        final String[] array = a782;
        for (int n7 = 0; array.length > n7; ++n7) {
            final String s2 = array[n7];
            if (n4 * 3 >> 2 > la_.roman12.b926(s2)) {
                la_.roman12.b191(s2, n, n6, 16777215, -1);
            }
            else {
                la_.roman12.b191(s2, n, n6, 16777215, -1);
            }
            n6 += la_.roman12._E + la_.roman12._H;
        }
    }
    
    private final void b183(final boolean b, final int n, final int n2) {
        if (n != 240) {
            this.a527(false, 31);
        }
        final int n3 = nk_._Fb[n2];
        if (nk_._Jb.c154(n ^ 0xB0)) {
            if (nl_.a370(n2)) {
                if (n3 == 27) {
                    kn_._e = false;
                }
                if (!kn_._e) {
                    if (n3 != 25 && n3 != 24 && 26 != n3) {
                        hm_.a668(n3, n2, b, n ^ 0xFFFFFF23);
                    }
                    else {
                        if (26 == n3) {
                            this._B = 2;
                        }
                        else if (n3 != 25) {
                            if (24 == n3) {
                                this._B = 0;
                            }
                        }
                        else {
                            this._B = 1;
                        }
                        kn_._e = true;
                        if (!b) {
                            nk_._Jb._b = 6;
                        }
                        int n4;
                        int n5;
                        int n6;
                        int n7;
                        if (this._B == 0) {
                            n4 = 104;
                            n5 = 486;
                            n6 = 254;
                            n7 = 77;
                        }
                        else {
                            n7 = 167;
                            n4 = 154;
                            n5 = 306;
                            n6 = 204;
                        }
                        this._z.a050(n4, n5, n7, n6);
                    }
                }
            }
        }
    }
    
    //original signature: private final void a663(final int n, final int n2, final boolean b) {
    private final void a663(final int n2, final boolean b) {
        final String a661 = this.a661(-13, nk_._Fb[n2]);
        final int b2 = ne_.roman20.b926(a661);
        final int a662 = this.a543((byte)(-4), n2);
        final int a663 = this.a353(n2, (byte)(-93));
        final int a664 = this.a527(false, n2);
        final int n3 = -b2 + (a663 + a662) >> 1;
        final int[] array = b ? ml_._b : cm_._M;
        if (null == this._w[n2] || a661 != this._w[n2].text || this._w[n2].possibleColors != array) {
            this._w[n2] = new HeaderLabelText(ne_.roman20, a661, array);
        }
        this._w[n2].b326(a664, n3);
        if (b) {
            if (this._y != n2) {
                this.b093(n2, -114);
            }
            this._v.b326(n3, a664, 64);
            int n4 = (int)(128.0 * (1.0 + te_.a132(mo_._a)));
            if (n4 < 0) {
                n4 = 0;
            }
            if (256 < n4) {
                n4 = 256;
            }
            this._C.b326(n3, a664, n4);
        }
    }
    
    fi_() {
        this._y = -1;
    }
    
    private final String a661(final int n, final int n2) {
        String s = ll_.menuOptions[n2];
        if (10 == n2 && (0 == hl_._f || 0 == dc_._z || 12 == hl_._f || 12 == dc_._z || hl_._f == 1 || dc_._z == 1)) {
            s = ll_.menuOptions[9]; //menu
        }
        if (n != -13) {
            return null;
        }
        return s;
    }
    
    static {
        fi_.text_disarmed = "Disarmed";
        fi_.raiderStatBars = null;
        fi_.notyetachieved = "Not yet achieved";
    }
}
