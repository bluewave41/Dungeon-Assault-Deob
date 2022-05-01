import java.net.*;
import java.applet.*;
import java.awt.*;

abstract class in_ extends kg_
{
	//original name: _r
    private int serverNum;
    //original name: _p
    String codeBaseHost;
    //original name: _q
    private int affId;
    static og_ _C;
    //original name: _z
    private int gamePort1;
    //original name: _u
    private boolean isHostJagex;
    //original name: _F
    private int gamePort2;
    static boolean _E;
    //original name: _x
    private int lang;
    //original name: _s
    private boolean isMember;
    //original name: _A
    private long instanceId;
    static pp_ _y;
    private boolean _v;
    //original name: _w
    private int crc;
    //original name: _D
    static Graphic piece_witch;
    static int[] _B;
    //original name: _t
    static String desc_saurus_slink;
    
    //original signature: private final void a048(final String s, final int n, final boolean b, final int n2, final int n3) {
    private final void a048() {
        try {
            if (!this.checkHost()) {
                return;
            }
            this.codeBaseHost = this.getCodeBase().getHost();
            final String lowerCase = this.codeBaseHost.toLowerCase();
            this.isHostJagex = (lowerCase.equals("jagex.com") || lowerCase.endsWith(".jagex.com"));
            this.gamePort1 = Integer.parseInt(this.getParameter("gameport1"));
            this.gamePort2 = Integer.parseInt(this.getParameter("gameport2"));
            final String serverNum = this.getParameter("servernum");
            if (serverNum != null) {
                this.serverNum = Integer.parseInt(serverNum);
            }
            this.crc = Integer.parseInt(this.getParameter("gamecrc"));
            this.instanceId = Long.parseLong(this.getParameter("instanceid"));
            this.isMember = this.getParameter("member").equals("yes");
            final String lang = this.getParameter("lang");
            if (lang != null) {
                this.lang = Integer.parseInt(lang);
            }
            if (this.lang >= 5) {
                this.lang = 0;
            }
            final String affid = this.getParameter("affid");
            if (null != affid) {
                this.affId = Integer.parseInt(affid);
            }
            f_.isSimpleMode = Boolean.valueOf(this.getParameter("simplemode"));
            this.a248(this.crc);
        }
        catch (Exception ex) {
            sm_.a741(ex, 1, null);
            this.throwErrror("crash");
        }
    }
    
    //original signature: final void g423(final byte b) {
    final void g423() {
        if (vk_.a154()) {
            this.a954(null != cm_._R, false);
        }
        else if (dk_._c >= 10) {
            if (l_.a491()) {
                if (kh_._n == 0) {
                    this.a954(false, false);
                }
                else {
                    td_.a093();
                }
            }
            else {
                dh_.b150();
            }
        }
    }
    
    public static void e150(final int n) {
        in_._C = null;
        in_.desc_saurus_slink = null;
        in_.piece_witch = null;
        in_._y = null;
        in_._B = null;
        if (n != -1) {
            e150(-36);
        }
    }
    
    static final int a080(int n) {
        n = (0x55555555 & n >>> 1) + (n & 0x55555555);
        n = (n >>> 2 & 0xB3333333) + (n & 0x33333333);
        n = (n + (n >>> 4) & 0xF0F0F0F);
        n += n >>> 8;
        n += n >>> 16;
        return 0xFF & n;
    }
    
    //original signature: final int b880(final byte b, final boolean b2) {
    final int b880(final boolean b2) {
        return this.a954(b2, true);
    }
    
    //original signature: final void a356(final boolean b, final int n, final int p8, final int m, final int h, final int a, final int n2, final int a2) {
    final void a356() {
        final Frame frame = new Frame("Jagex");
        frame.pack();
        frame.dispose();
        this.setBackground(Color.black);
        ae_.createConnectingToServerStrings(hc_.lang = this.lang);
        dj_.a134(this.instanceId, this.gamePort1, this.codeBaseHost, this.crc, hc_.lang, this.gamePort2, this.serverNum, this.isMember, i_._A);
        an_.a581(this.serverNum, this.gamePort2, this.gamePort1, this.codeBaseHost, hc_.lang, this.crc, 32, i_._A);
        uf_.a150(47);
        bn_._j = pm_.a864();
        uk_.a762(c_.canvas);
        mh_._a = 0;
        s_._a = 1;
        bh_._P = 8;
        pm_._m = 2;
        sp_._h = 17;
        this.e423((byte)68);
        ch_.a423();
    }
    
    final int f410(final byte b) {
        final int g137 = this.g137(11);
        if (b < 86) {
            this.g137(-68);
        }
        if (g137 == 0 || g137 == 1) {
            if (pj_._w[1]) {
                f_.a366(2);
            }
            if (pj_._w[2]) {
                fl_.a556(3);
            }
            if (pj_._w[3]) {
                ep_.a556();
            }
            if (pj_._w[4]) {
                ko_.a540(5);
            }
            if (pj_._w[5]) {
                ol_.a093(8, 6);
            }
            if (pj_._w[6]) {
                tc_.a366(7);
            }
            if (pj_._w[8]) {
                hj_.g150();
            }
        }
        return g137;
    }
    
    private final void e423(final byte b) {
        uo_._c[2] = -2;
        uo_._c[13] = -1;
        uo_._c[5] = -1;
        uo_._c[7] = -1;
        uo_._c[11] = -1;
        uo_._c[10] = -1;
        uo_._c[12] = -1;
        uo_._c[16] = -1;
        uo_._c[1] = 16;
        uo_._c[9] = -1;
        uo_._c[18] = 1;
        if (b != 68) {
            this.instanceId = -61L;
        }
        uo_._c[17] = -1;
        uo_._c[8] = -2;
        uo_._c[6] = -2;
        uo_._c[3] = -1;
        uo_._c[4] = -1;
    }
    
    static final void a050(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = n3 + n;
        final int n7 = n4 + n2;
        final int n8 = (gf_._j < n) ? n : gf_._j;
        final int n9 = (n4 <= gf_._f) ? gf_._f : n4;
        final int n10 = (gf_._h <= n6) ? gf_._h : n6;
        final int n11 = (n7 < gf_._e) ? n7 : gf_._e;
        if (gf_._j <= n) {
            if (gf_._h > n) {
                int n12 = n9 * gf_._i + n;
                int n13 = n11 + (1 - n9) >> 1;
                while (0 <= --n13) {
                    gf_._b[n12] = 16777215;
                    n12 += 2 * gf_._i;
                }
            }
        }
        if (n5 != 1) {
            return;
        }
        if (gf_._f <= n4 && gf_._e > n7) {
            int n14 = n4 * gf_._i + n8;
            int n15 = -n8 + 1 + n10 >> 1;
            while (--n15 >= 0) {
                gf_._b[n14] = 16777215;
                n14 += 2;
            }
        }
        if (gf_._j <= n6 && n6 < gf_._h) {
            int n16 = (n9 + (0x1 & n6 - n)) * gf_._i + n6;
            int n17 = n11 + 1 - n9 >> 1;
            while (--n17 >= 0) {
                gf_._b[n16] = 16777215;
                n16 += 2 * gf_._i;
            }
        }
        if (gf_._f <= n4 && gf_._e > n7) {
            int n18 = n8 + n7 * gf_._i + (-n4 + n7 & 0x1);
            int n19 = -n8 + (n10 + 1) >> 1;
            while (--n19 >= 0) {
                gf_._b[n18] = 16777215;
                n18 += 2;
            }
        }
    }
    
    //original signature: final void d487(final boolean b) {
    final void d487() {
        final int c = hc_.loginStatusCode;
        if (c >= 64 || !pj_._w[c]) {
            sm_.a741(null, 1, "MGS2: " + sj_.l738());
            tl_.a150(-48);
            return;
        }
        if (c != 0) {
            if (c == 1) {
                lg_.a150();
            }
            else if (c != 2) {
                if (3 == c) {
                    WarningMessage.d150();
                }
                else if (c == 4) {
                    hd_.a487(false);
                }
                else if (5 == c) {
                    rm_.q150(-5705);
                }
                else if (6 != c) {
                    if (7 == c) {
                        this.f150(8);
                    }
                    else if (8 == c) {
                        RaidMember.a245(ra_._c, i_._A, nj_._b);
                    }
                    else if (c == 16) {
                        ih_.a423((byte)59);
                    }
                    else if (11 == c || 12 == c) {
                        jm_.a315(d_.a627(c == 12), (byte)116);
                    }
                    else if (c != 13) {
                        if (17 == c) {
                            this.d150(-28859);
                        }
                        else if (18 == c) {
                            rc_.c150();
                        }
                        else {
                            sm_.a741(null, 1, "MGS1: " + sj_.l738());
                            tl_.a150(124);
                        }
                    }
                    else {
                        lf_.d423();
                    }
                }
                else {
                    bf_.b150();
                }
            }
            else {
                ui_.a150();
            }
        }
    }
    
    private final void d150(final int n) {
        if (n != -28859) {
            this.f410((byte)39);
        }
        final boolean b = 0x0 != (ra_._c.readByte() & 0x1);
        final int n2 = nj_._b - 1;
        final byte[] array = new byte[n2];
        ra_._c.a596(0, (byte)95, n2, array);
        oe_.a188(b, m_.getApplet(), dj_.a064(array, false));
    }
    
    //original signature: private final int a954(final boolean b, final boolean b2, final boolean b3) {
    private final int a954(final boolean b2, final boolean b3) {
        final int a681 = o_.a681();
        if (a681 == 0) {
            throw new IllegalStateException();
        }
        if (a681 == 1) { //== 1
            final int a682 = qh_.a602(ln_.a683((byte)(-120)), om_.a059(true));
            if (-1 != a682) {
                ri_.a392(tp_._v, mf_._c, a682);
                mf_._c = null;
                tp_._v = null;
            }
            final Boolean a683 = fb_.a252();
            if (a683 != null) {
                ig_.a430(a683);
            }
        }
        if (a681 == 2) {
            final int a684 = qm_.a581(this.affId, wk_._g, in_._E, em_.getPassword(), vl_.getUsername(), co_.e983());
            if (-1 != a684) {
                gj_.a324(a684, mf_._c, tp_._v);
                tp_._v = null;
                mf_._c = null;
            }
        }
        if (3 == a681) {
            if (gm_._c != -1 && 0 != gm_._c) {
                gm_._c = -1;
                en_.a423();
            }
            if (!b3) {
                final int loginStatusCode = bh_.a312(this.isHostJagex, em_.getPassword(), this.affId, false, vl_.getUsername());
                if (loginStatusCode != -1) {
                    if (loginStatusCode != 0) {
                        nf_.a096(loginStatusCode, tp_._v); //credential errors
                        tp_._v = null;
                    }
                    else {
                        ne_._g = hg_._s;
                        bl_.setupUnreadTickets();
                        kh_._n = 10;
                        tl_._l = false;
                    }
                }
            }
            else {
                hh_._c = false;
            }
        }
        if (4 == a681) {
            if (ld_.isMember) {
                pd_.a587(5189, m_.getApplet());
            }
            else {
                tl_._l = true;
                kh_._n = 10;
            }
        }
        if (5 == a681) {
            eg_.a812(m_.getApplet());
        }
        if (6 == a681) {
            if (oj_._b) {
                kh_._n = 10;
            }
        }
        if (a681 == 7) {
            pa_.a587(123, m_.getApplet());
        }
        if (8 == a681) {
            pd_.a587(5189, m_.getApplet());
        }
        if (9 == a681) {
            jl_.a262(m_.getApplet());
        }
        if (10 == a681) {
            Trap._B.storeFuzzedOpcode(17);
        }
        if (a681 == 11) {
            fk_.a587(84, m_.getApplet());
        }
        if (a681 == 12) {
            oe_.a808(jj_._d, m_.getApplet());
        }
        if (13 == a681) {
            try {
                if (null == hl_._i) {
                    hl_._i = new tl_(i_._A, new URL(this.getCodeBase(), "countrylist.ws"), 5000);
                }
                if (hl_._i.d154(34)) {
                    final ec_ c735 = hl_._i.c735(3);
                    if (c735 != null) {
                        RegisterScreen.a984(15, mk_.a046(c735.buffer, c735.currentIndex, 0));
                    }
                    else {
                        RegisterScreen.a984(15, null);
                    }
                    hl_._i = null;
                }
            }
            catch (Exception ex) {
                sm_.a741(ex, 1, "S1");
                RegisterScreen.a984(15, null);
                hl_._i = null;
            }
        }
        if (a681 == 15) {
            kh_._n = 10;
        }
        if (16 == a681) {
            return 1;
        }
        if (17 == a681) {
            return 2;
        }
        return 0;
    }
    
    private final void f150(final int n) {
        if (n != 8) {
            return;
        }
        sm_.a715(m_.getApplet(), eg_.a738());
    }
    
    //original signature: final void a013(final int n, final String s, final int n2) {
    final void a013() {
        this.a048();
    }
    
    protected in_() {
    }
    
    final void a813(final boolean b, final byte b2) {
        if (null != il_._c) {
            if (cm_._R == null) {
                final Dimension size = ua_.a332().getSize();
                il_._c.a773(size.height, true, size.width);
            }
            il_._c.e150(6731);
        }
        bp_.b150(94);
        ke_.b150(b2 + 74);
        if (b2 != -74) {
            this.affId = -128;
        }
        if (!ao_.a427()) {
            if (kh_._n != 11) {
                cp_.f150(-30208);
            }
        }
        if (bn_._j != null) {
            pj_._r = bn_._j.a137(); //sk
        }
        if (dh_.a427()) {
            final int n = 1200 * eg_.c137();
            if (this._v || (hl_._g > n && n < fc_._m)) {
                this._v = false;
                tl_.a150(122);
                l_.a150(b2 + 73);
                nf_.a096(2, sj_.idlemessage20min);
                ql_.a423();
                hh_._c = true;
                ab_._a = 15000L + kd_.getTime();
            }
        }
        if (gm_._c == -1 || gm_._c == 0) {
            final boolean b3 = gm_._c == -1;
            gm_._c = fp_.a410();
            if (b3 && 0 == gm_._c && 11 == kh_._n) {
                if (!dm_.c154(b2 - 7)) {
                    bl_.setupUnreadTickets();
                }
            }
            if (gm_._c != -1 && 0 != gm_._c) {
                ab_._a = 15000L + kd_.getTime();
            }
        }
        if (-1 != gm_._c && 0 != gm_._c) {
            if (10 > dk_._c) {
                if (3 != gm_._c) {
                    if (gm_._c != 4) {
                        if (2 == gm_._c) {
                            this.throwErrror("js5connect_full");
                        }
                        else if (gm_._c == 5) {
                            this.throwErrror("outofdate");
                        }
                        else {
                            this.throwErrror("js5connect");
                        }
                    }
                    else {
                        this.throwErrror("js5io");
                    }
                }
                else {
                    this.throwErrror("js5crc");
                }
            }
            else if (10 <= kh_._n) {
                l_.a150(b2 + 73);
                if (3 == gm_._c) {
                    nf_.a096(256, GUIButton.error_js5crc);
                }
                else if (gm_._c != 4) {
                    if (gm_._c != 2) {
                        if (gm_._c == 5) {
                            nf_.a096(5, ed_.login_gameupdated);
                        }
                        else {
                            nf_.a096(256, b_.error_js5connect);
                        }
                    }
                    else {
                        nf_.a096(256, ul_.error_js5connect_full);
                    }
                }
                else {
                    nf_.a096(256, sf_.error_js5io);
                }
                hh_._c = true;
            }
        }
        if ((-1 != gm_._c && 0 != gm_._c) || dm_.c154(b2 - 43)) {
            if (kd_.getTime() >= ab_._a) {
                hh_._c = false;
                if (-1 != gm_._c && 0 != gm_._c) {
                    gm_._c = -1;
                    en_.a423();
                }
            }
        }
        if (0 == gm_._c) {
            if (!dm_.c154(-125)) {
                u_._O = false;
            }
        }
        if (0 == dk_._c) {
            if (ln_.a154()) { //this is the first step
                dk_._c = 1;
            }
        }
        if (dk_._c == 1) {
            if (hc_.lang != 0) {
                ia_._U = mk_.a923(mh_._a);
            }
            fi_._u = qd_.a854(s_._a);
            kg_._b = qd_.a854(pm_._m);
            ib_._b = qd_.a854(sp_._h);
            dk_._c = 2;
            gh_._c = kg_._b;
            uc_._I = fi_._u;
        }
        if (dk_._c == 2) {
            if (null != ia_._U) {
                if (ia_._U.a154()) {
                    if (!ia_._U.c896("", b2 ^ 0xFFFFFFB6)) {
                        ia_._U = null;
                    }
                    else if (ia_._U.a213(false, "")) {
                        ng_.a253(b2 ^ 0x6986, ia_._U);
                        ia_._U = null;
                        nf_.d150(0);
                    }
                }
            }
            if (ia_._U == null) {
                dk_._c = 3;
            }
        }
        if (dk_._c == 3) {
            if (ql_.a726(kg_._b, ib_._b, fi_._u)) {
                if (fl_.a249(ib_._b)) {
                    jm_.a487();
                    am_.b150();
                    lj_._e = bg_.loading;
                    oj_._b = false;
                    Raider.a039(b2 ^ 0xFFFFE05D, fi_._u, ib_._b, ld_.isMember, kg_._b);
                    if (np_._D || null != mi_._d) {
                        hd_.a164(8192, !np_._D, mi_._d, !np_._D);
                    }
                    if (f_.isSimpleMode) {
                        kd_.a150(4);
                    }
                    if (je_._c == null) {
                        je_._c = wa_._j;
                        tb_._g = ab_.a410();
                    }
                    nh_.a541(ib_._b, je_._c, tb_._g);
                    ib_._b = null;
                    fi_._u = null;
                    kg_._b = null;
                    qj_.a326(this);
                    nf_.d150(0);
                    dk_._c = 10;
                }
            }
        }
        if (dk_._c == 10) {
            if (hc_.lang != 0) {
                ec_._k = mk_.a923(bh_._P);
            }
            dk_._c = 11;
        }
        if (11 == dk_._c) {
            if (null == ec_._k || (ec_._k.a154() && ec_._k.a427((byte)59))) {
                ld_._i = true;
                dk_._c = 12;
            }
            else {
                tp_.a132(0.0f, lk_.a278(ki_.loadingTextString, ec_._k, ec_.waitingForTextString));
            }
        }
        if (dk_._c == 12) {
            if (!ld_._i) {
                dk_._c = 13;
            }
        }
        if (dk_._c == 13) {
            boolean a491 = true;
            if (be_._s != null) {
                a491 = be_._s.a491();
                tp_.a132(be_._s._j, be_._s._b);
            }
            if (a491) {
                dk_._c = 20;
            }
        }
        if (!b && ve_._a) {
            pd_.a035(c_.canvas);
            this.d423((byte)121);
            uk_.a762(c_.canvas);
        }
        if (pj_._w[8]) {
            ta_.b150();
        }
    }
    
    private final int g137(int n) {
        if (n != 11) {
            return 24;
        }
        if (this._i) {
            return -1;
        }
        if (!dm_.c154(-118)) {
            return -1;
        }
        if (hh_._c) {
            return -1;
        }
        int n2 = bh_.a312(this.isHostJagex, em_.getPassword(), this.affId, true, vl_.getUsername());
        if (n2 == -1) {
            return -1;
        }
        if (0 == n2 || n2 == 1) {
            if (kh_._n == 11 && gm_._c == 0) {
                bl_.setupUnreadTickets();
            }
            return n2;
        }
        if (!rm_._P) {
            this.throwErrror("reconnect");
        }
        l_.a150(-1);
        nf_.a096(n2, tp_._v);
        hh_._c = true;
        ab_._a = 15000L + kd_.getTime();
        return n2;
    }
    
    final void b813(final boolean b, final byte b2) {
        pj_._w[16] = true;
        if (b2 >= -33) {
            this.gamePort2 = 36;
        }
        pj_._w[7] = true;
        pj_._w[18] = true;
        pj_._w[3] = true;
        pj_._w[8] = b;
        pj_._w[17] = true;
        pj_._w[0] = true;
    }
    
    static {
        in_._C = new og_();
        in_._B = new int[] { 2, 13, 14, 8, 28, 7, 11 };
        in_.desc_saurus_slink = "Nimble even by the standards of his dexterous race, the saurus slink can dodge traps and attacks with equal ease.";
    }
}
