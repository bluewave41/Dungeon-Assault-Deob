final class ae_
{
	//original name: _k
    private int isMetaDown2;
    static String[] _a;
    //original name: _h
    static String create_agreeterms;
    private int _d;
    int _i;
    int _b;
    private int _j;
    private boolean _f;
    //original name: _g
    private int isMetaDown;
    //original name: _c
    static String dwarf_renegade;
    //original name: _e
    static String text_heal;
    
    final void d150(final int n) {
        this._d = 0;
        this.isMetaDown2 = 0;
        if (0 == this.isMetaDown) {
            if (mm_._t == 98) {
                if (0 >= this._b) {
                    this._b = this._i;
                }
                --this._b;
                this._f = false;
            }
        }
        if (this.isMetaDown == 0) {
            this._d = mm_._t;
        }
        if (n == this.isMetaDown && 99 == mm_._t) {
            ++this._b;
            if (this._b >= this._i) {
                this._b = 0;
            }
            this._f = false;
        }
    }
    
    final boolean b154(final int n) {
        if (n != -1) {
            this.isMetaDown2 = -104;
        }
        return this._d == 102;
    }
    
    public static void a423() {
        ae_.create_agreeterms = null;
        ae_.text_heal = null;
        ae_.dwarf_renegade = null;
        ae_._a = null;
    }
    
    //original signature: static final void a093(final int n, final int n2) {
    static final void createConnectingToServerStrings(final int lang) {
        to_.connectingToUpdateServerString = sj_.connectingToUpdateServerTranslatedStrings[lang];
        ec_.waitingForTextString = lc_.waitingForTextTranslatedStrings[lang];
        ki_.loadingTextString = qh_.loadingTextTranslatedStrings[lang];
    }
    
    final void a366(final int b, final byte b2) {
        this._d = 0;
        this.isMetaDown2 = 0;
        if (this.isMetaDown == 0 && 96 == mm_._t) {
            if (this._b <= 0) {
                this._b = this._i;
            }
            this._f = false;
            --this._b;
        }
        if (0 == this.isMetaDown) {
            this._d = mm_._t;
        }
        if (0 == this.isMetaDown && mm_._t == 97) {
            ++this._b;
            if (this._i <= this._b) {
                this._b = 0;
            }
            this._f = false;
        }
        if (b2 != -107) {
            return;
        }
        if (0 == this.isMetaDown) {
            if (98 == mm_._t || 99 == mm_._t) {
                if (0 > this._b) {
                    this._b = b;
                }
                this._f = false;
            }
        }
    }
    
    //original signature: final boolean b427(final byte b) {
    final boolean b427() {
        return this.isMetaDown != 0;
    }
    
    //original signature: final boolean c427(final byte b) {
    final boolean c427() {
        return this._d == 97;
    }
    
    //original signature: final boolean a154(final int n) {
    final boolean a154() {
        return this._d == 96;
    }
    
    //original signature: final void a691(final boolean b, final boolean f, final int b2, final int b3) {
    final void a691(final boolean f, final int b2, final int b3) {
        this._f = f;
        this.isMetaDown = 0;
        if (this._f) {
            this._b = b3;
        }
        else {
            this._b = b2;
        }
    }
    
    //original signature: final boolean a491(final boolean b) {
    final boolean a491() {
        return 103 == this._d;
    }
    
    final void b093(final int b, final int n) {
        if (n != 3) {
            ae_.text_heal = null;
        }
        if (0 == this.isMetaDown) {
            this._b = b;
            this._f = false;
        }
    }
    
    //original signature: static final void a183(final boolean b, final int t, final int n) {
    static final void a183(final boolean b, final int t) {
        nk_._Hb = true;
        kh_._t = t;
        if (kh_._t == 0) {
            final int i = og_.a451(n_._c, qj_._e, wa_._l, ql_.fs_nonmember);
            final int n2 = i + 3;
            go_._A = new String[n2];
            to_._c = new int[n2];
            for (int j = 0; j < n2; ++j) {
                to_._c[j] = -1;
            }
            n_._g = new int[2];
            for (int n3 = 0; i > n3; ++n3) {
                go_._A[n3] = qj_._e[n3];
            }
            go_._A[n2 - 3] = "";
            go_._A[n2 - 2] = mn_.fs_button_members;
            to_._c[n2 - 2] = 0;
            n_._g[0] = 4;
            go_._A[n2 - 1] = sp_.fs_button_close;
            to_._c[n2 - 1] = 1;
            n_._g[1] = 5;
        }
        else if (1 != kh_._t) {
            if (2 == kh_._t) {
                final int k = og_.a451(n_._c, qj_._e, wa_._l, jk_.replacePlaceholders(new String[] { "<br><%0><br>" }, ef_.fs_accept_countdown_sing));
                int n4 = -1;
                for (int n5 = 0; k > n5; ++n5) {
                    if ("<%0>".equals(qj_._e[n5])) {
                        n4 = n5;
                        break;
                    }
                }
                if (n4 == -1) {
                    throw new IllegalStateException();
                }
                sn_._a = new String[n4];
                cj_.a030(qj_._e, 0, sn_._a, 0, n4);
                cp_._Q = new String[-n4 + k - 1];
                cj_.a030(qj_._e, n4 + 1, cp_._Q, 0, k - n4 - 1);
                int n6 = -1;
                final int a451 = og_.a451(n_._c, qj_._e, wa_._l, jk_.replacePlaceholders(new String[] { "<br><%0><br>" }, bn_.fs_accept_countdown_pl));
                for (int l = 0; l < a451; ++l) {
                    if ("<%0>".equals(qj_._e[l])) {
                        n6 = l;
                        break;
                    }
                }
                if (n6 == -1) {
                    throw new IllegalStateException();
                }
                mo_._g = new String[n6];
                cj_.a030(qj_._e, 0, mo_._g, 0, n6);
                fd_._b = new String[-1 - n6 + a451];
                cj_.a030(qj_._e, n6 + 1, fd_._b, 0, a451 - 1 - n6);
                final int n7 = (sn_._a.length >= mo_._g.length) ? sn_._a.length : mo_._g.length;
                final int n8 = (cp_._Q.length >= fd_._b.length) ? cp_._Q.length : fd_._b.length;
                final int n9 = n8 + (7 + n7);
                go_._A = new String[n9];
                to_._c = new int[n9];
                for (int n10 = 0; n9 > n10; ++n10) {
                    to_._c[n10] = -1;
                }
                to_._c[1] = 0;
                go_._A[0] = mj_.fs_accept_beforeaccept;
                n_._g = new int[2];
                go_._A[1] = lg_.fs_button_accept;
                go_._A[5] = "";
                n_._g[0] = 5;
                go_._A[2] = ef_.fs_accept_afteraccept;
                to_._c[3] = 1;
                go_._A[3] = jg_.fs_button_cancel;
                n_._g[1] = 2;
                go_._A[4] = CacheIndex.fs_accept_aftercancel;
                for (int n11 = 0; n11 < n7; ++n11) {
                    go_._A[n11 + 6] = ((0 > mo_._g.length + (n11 - n7)) ? "" : mo_._g[mo_._g.length + n11 - n7]);
                }
                go_._A[6 + n7] = null;
                to_._c[6 + n7] = -2;
                for (int n12 = 0; n8 > n12; ++n12) {
                    go_._A[7 - (-n7 - n12)] = ((fd_._b.length > n12) ? fd_._b[n12] : "");
                }
                kg_.time = kd_.getTime();
            }
            else if (kh_._t == 3) {
                int n13;
                if (!i_._A._j) {
                    n13 = og_.a451(n_._c, qj_._e, wa_._l, oh_.fs_unavailable_try_signed_applet);
                }
                else {
                    n13 = og_.a451(n_._c, qj_._e, wa_._l, fg_.fs_unavailable);
                }
                final int n14 = 2 + n13;
                go_._A = new String[n14];
                to_._c = new int[n14];
                for (int n15 = 0; n15 < n14; ++n15) {
                    to_._c[n15] = -1;
                }
                n_._g = new int[1];
                for (int n16 = 0; n13 > n16; ++n16) {
                    go_._A[n16] = qj_._e[n16];
                }
                go_._A[n14 - 2] = "";
                go_._A[n14 - 1] = sp_.fs_button_close;
                to_._c[n14 - 1] = 0;
                n_._g[0] = 5;
            }
            else if (kh_._t == 4) {
                final int a452 = og_.a451(n_._c, qj_._e, wa_._l, jg_.fs_focus);
                final int n17 = a452 + 2;
                to_._c = new int[n17];
                go_._A = new String[n17];
                for (int n18 = 0; n18 < n17; ++n18) {
                    to_._c[n18] = -1;
                }
                n_._g = new int[1];
                for (int n19 = 0; n19 < a452; ++n19) {
                    go_._A[n19] = qj_._e[n19];
                }
                go_._A[n17 - 2] = "";
                go_._A[n17 - 1] = sp_.fs_button_close;
                to_._c[n17 - 1] = 0;
                n_._g[0] = 5;
            }
            else {
                if (5 != kh_._t) {
                    throw new IllegalArgumentException();
                }
                final int a453 = og_.a451(n_._c, qj_._e, wa_._l, id_.fs_timeout);
                final int n20 = 3 + a453;
                to_._c = new int[n20];
                go_._A = new String[n20];
                for (int n21 = 0; n20 > n21; ++n21) {
                    to_._c[n21] = -1;
                }
                n_._g = new int[2];
                for (int n22 = 0; a453 > n22; ++n22) {
                    go_._A[n22] = qj_._e[n22];
                }
                go_._A[n20 - 3] = "";
                go_._A[n20 - 2] = fc_.fs_button_tryagain;
                to_._c[n20 - 2] = 0;
                n_._g[0] = 3;
                go_._A[n20 - 1] = sp_.fs_button_close;
                to_._c[n20 - 1] = 1;
                n_._g[1] = 5;
            }
        }
        else {
            final int a454 = og_.a451(n_._c, qj_._e, wa_._l, ql_.fs_nonmember);
            final int n23 = a454 + 2;
            to_._c = new int[n23];
            go_._A = new String[n23];
            for (int n24 = 0; n23 > n24; ++n24) {
                to_._c[n24] = -1;
            }
            n_._g = new int[1];
            for (int n25 = 0; n25 < a454; ++n25) {
                go_._A[n25] = qj_._e[n25];
            }
            go_._A[n23 - 2] = "";
            go_._A[n23 - 1] = sp_.fs_button_close;
            to_._c[n23 - 1] = 0;
            n_._g[0] = 5;
        }
        d_._g._i = n_._g.length;
        int n26 = 0;
        int n27 = 0;
        while (n27 < go_._A.length) {
            final int a455 = og_.a571(to_._c[n27] >= 0, go_._A[n27]);
            if (a455 > n26) {
                n26 = a455;
            }
            ++n27;
        }
        if (kh_._t == 2) {
            final String[] a456 = sn_._a;
            for (int n28 = 0; a456.length > n28; ++n28) {
                final int a457 = og_.a571(false, a456[n28]);
                if (a457 > n26) {
                    n26 = a457;
                }
            }
            final String[] q = cp_._Q;
            for (int n29 = 0; n29 < q.length; ++n29) {
                final int a458 = og_.a571(false, q[n29]);
                if (n26 < a458) {
                    n26 = a458;
                }
            }
        }
        d_._e = vo_._r - (-n26 + (n26 >> 1));
        jn_._d = (ci_._j + Raider._q << 1) * d_._g._i;
        bf_._b = -(n26 >> 1) + vo_._r;
        for (int n30 = 0; go_._A.length > n30; ++n30) {
            jn_._d += ((to_._c[n30] >= 0) ? mj_._g : ag_._a);
        }
        jm_._c = -(jn_._d >> 1) + bl_._p;
        dg_._L = new int[go_._A.length][];
        int n31 = 0;
        int c = jm_._c;
        while (go_._A.length > n31) {
            if (0 > to_._c[n31]) {
                c += ag_._a;
            }
            else {
                final int a459 = og_.a571(true, go_._A[n31]);
                final int n32 = -(a459 >> 1) + vo_._r;
                final int n33 = c + ci_._j;
                (dg_._L[n31] = new int[4])[0] = -oh_._t + n32;
                dg_._L[n31][1] = n33;
                dg_._L[n31][2] = a459 + (oh_._t << 1);
                c = n33 + (mj_._g + ((Raider._q << 1) + ci_._j));
                dg_._L[n31][3] = (Raider._q << 1) + mj_._g;
            }
            ++n31;
        }
        if (kh_._t != 2) {
            d_._g.a691(b, 0, ab_.a313(hj_.mouseX, Animation.mouseY));
        }
        else {
            d_._g.a691(b, -1, -1);
        }
    }
    
    final void e150(final int n) {
        this._d = 0;
        if (n < 88) {
            this.isMetaDown = -80;
        }
        this.isMetaDown2 = 0;
        if (this.isMetaDown == 0) {
            this._d = mm_._t;
        }
    }
    
    final void a326(final int n, final int b, final int b2) {
        if (b2 >= this._i) {
            throw new IllegalArgumentException();
        }
        if (n != -7734) {
            this._f = true;
        }
        if (this._i <= b) {
            throw new IllegalArgumentException();
        }
        this._d = 0;
        this.isMetaDown2 = 0;
        if (0 != no_.isMetaDown) {
            this.isMetaDown = no_.isMetaDown;
            this._f = true;
            this._b = b;
            this.isMetaDown2 = no_.isMetaDown;
            this._j = 20;
        }
        if (this.isMetaDown != 0) {
            if (la_.isMetaDown != 0) {
                if (0 >= this._j) {
                    this._j = r_._c;
                }
                --this._j;
            }
        }
        if (no_.isMetaDown == 0 && la_.isMetaDown == 0) {
            this.isMetaDown = 0;
        }
        if (this.isMetaDown == 0 && (this._f || cp_._U)) {
            if (b2 >= 0) {
                if (this._b != b2) {}
                this._f = true;
                this._b = b2;
            }
            else if (this._f) {
                this._b = -1;
            }
        }
    }
    
    final boolean c154(final int n) {
        return this.isMetaDown2 != 0 || 84 == this._d || 83 == this._d;
    }
    
    ae_(final int i) {
        this._b = 0;
        this._f = false;
        this._i = i;
    }
    
    static {
        ae_.create_agreeterms = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        ae_.dwarf_renegade = "Dwarf Renegade";
        ae_.text_heal = "HEAL";
    }
}
