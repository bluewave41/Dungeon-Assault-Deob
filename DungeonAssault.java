import java.util.*;
import java.applet.*;
import java.awt.*;

public final class DungeonAssault extends in_
{
	//original name: _H
    static String text_trap;
    //original name: _I
    static Graphic piece_spy;
    //original name: _G
    static String text_title_hint;
    //original name: _J
    static String beastman;
    public static int _K;
    
    public static void h423() {
        DungeonAssault.text_title_hint = null;
        DungeonAssault.beastman = null;
        DungeonAssault.piece_spy = null;
        DungeonAssault.text_trap = null;
    }
    
    private final void c813(final boolean b, final byte b2) {
        if (fm_._a != 0) {
            if (fm_._a != 1) {
                if (bn_._n == fm_._a) {
                    if (!tl_._l) {
                        vk_.a423();
                        gd_.a778(g_._Hb, 0, sa_._f, false);
                        ll_.debugMode |= (nh_._k >= 2);
                        if (tl_._d) {
                            tl_._d = false;
                            a_.a743(false);
                            if (cm_._R != null) {
                                i_._A.a238(cm_._R, (byte)51, false);
                            }
                        }
                        if (fc_.isZeroOrGreater(dc_._z)) {
                            af_.a423();
                        }
                    }
                    fm_._a = 3;
                }
                else {
                    --WarningMessage._t;
                    if (WarningMessage._t == 0) {
                        fm_._a = 0;
                    }
                }
            }
            else {
                ++WarningMessage._t;
                if (WarningMessage._t == 16) {
                    if (!tl_._d) {
                        bj_.i150(81);
                    }
                    else {
                        dn_.b487(false);
                    }
                    gm_.playerInformation = null;
                    fm_._a = bn_._n;
                }
            }
        }
        else {
            if (!b) {
                if (co_._G != null) {
                    ++bd_._f;
                    if (bd_._f == 64) {
                        af_.a423();
                    }
                }
                else if (mn_._b != -1) {
                    if (fc_.isZeroOrGreater(mn_._b)) {
                        bf_._f[mn_._b].c487(true);
                    }
                }
                else if (ik_._e != null) {
                    ik_._e.c487(true);
                    while (ha_.b427()) {
                        ik_._e.f797();
                    }
                }
            }
            if (null != wl_._a.e024() && ++ke_._e == 335) {
                wl_._a.b081();
                sl_._b = null;
                pa_._a = null;
                ri_._g = null;
            }
        }
        if (ik_._e != null) {
            if (-1 != mn_._b) {
                ik_._e.a540(false);
            }
        }
        if (b2 != -69) {
            this.c813(true, (byte)(-64));
        }
        if (dc_._z == -2) {
            final pj_ pj_ = new pj_();
            pj_._v = uk_.generateDungeonPath(new Random());
            for (int n = 0; 49 > n; ++n) {
                if (0 == oi_.getRandom(5)) {
                    if (pj_.dungeonLayout[n].roomType == 0) {
                        pj_.dungeonLayout[n] = new Room(ji_.getRandom(37, 4));
                    }
                }
            }
            final int renown = (null != gm_.playerInformation) ? gm_.playerInformation.renown : 10000;
            pj_.renown = renown;
            pj_.renownDividedBy10 = renown / 10;
            pj_.raidMembers[0] = new RaidMember(0, 25);
            pj_.raidMembers[1] = new RaidMember(1, 27);
            pj_.raidMembers[2] = new RaidMember(2, 18);
            pj_.raidMembers[3] = new RaidMember(3, 19);
            pj_.a540(4);
            ik_._e = new go_(false, pj_);
            gd_.a778(ve_.a491() ? 12 : 0, 0, -1, cm_._Q);
        }
        if (-3 == dc_._z) {
            final pj_ pj_2 = new pj_();
            if (tl_._l || gm_.playerInformation._q != -1) {
                final Random random = new Random();
                pj_2._v = uk_.generateDungeonPath(random); //path
                //pj_2.dungeonLayout = da_.getRandomTrapLayout(pj_2._v, random);
                if (tl_._l) {
                    gm_.playerInformation = new PlayerInformation();
                    gm_.playerInformation.dungeonLayout = pj_2.dungeonLayout;
                    gm_.playerInformation._k = pj_2._v;
                }
            }
            else {
                pj_2._v = new DungeonPath(gm_.playerInformation._k);
                pj_2.dungeonLayout = gm_.playerInformation.dungeonLayout;
            }
            //tutorial stuff
            pj_2.renownDividedBy10 = 1000;
            pj_2.raidMembers[0] = new RaidMember(0, 28);
            pj_2.raidMembers[1] = new RaidMember(1, 23);
            pj_2.raidMembers[2] = new RaidMember(2, 4);
            pj_2.raidMembers[3] = new RaidMember(3, 2);
            
            pj_2.a540(4);
            ha_.d150(1);
            ik_._e = new go_(false, pj_2);
            gd_.a778(ve_.a491() ? 12 : 0, 0, -1, cm_._Q);
        }
    }
    
    @Override
    final void a150(final int n) {
        ib_.b410(); //does nothing
        mn_.a410(); //does nothing
        if (ef_._h) {
            if (kj_._n != 0) {
                if (5 * kh_.cursor.length / 2 > kj_._n || 0 == la_.isMetaDown) {
                    if (++kj_._n >= 5 * kh_.cursor.length) {
                        kj_._n = 0;
                    }
                }
            }
            if (0 != no_.isMetaDown) {
                kj_._n = 1;
            }
            if (!ao_.a427()) {
                if (c_.canvas != gi_.canvas || RenownTableEntry._e) {
                    i_._A.a238(c_.canvas, (byte)116, false);
                    RenownTableEntry._e = false;
                    gi_.canvas = c_.canvas;
                }
            }
            else if (!RenownTableEntry._e) {
                i_._A.a238(c_.canvas, (byte)61, true);
                RenownTableEntry._e = true;
            }
        }
        go_.b423((byte)14);
        if (cm_._R != null) {
            if (cm_._R._g) {
                ib_.a150();
                hh_.a423();
            }
        }
        this.a813(cm_._R != null, (byte)(-74));
        if (ld_._i) {
            bo_.h150();
            ld_._i = false;
        }
        ++mo_._a;
        if (ao_.a427()) {
            this.g423();
            if (ao_.a427()) {
                return;
            }
        }
        if (n >= -89) {
            this.c813(false, (byte)(-112));
        }
        if (!ef_._h) {
            td_.a093();
            if (this.h154(0)) {
                ef_._h = true;
            }
        }
        else if (!hc_.b154()) {
            nb_.a150();
        }
        else if (nk_._Hb) {
            up_.c423();
            if (fm_._a != 0) {
                this.c813(false, (byte)(-69));
            }
            else {
                final int b137 = mf_.b137(12210);
                if (b137 != 2) {
                    if (b137 != 3) {
                        if (4 == b137) {
                            tl_._d = true;
                            ik_.a503(ve_.pleaselogin_member, 0);
                        }
                    }
                    else {
                        tl_._d = false;
                        a_.a743(true);
                        if (cm_._R != null) {
                            i_._A.a238(cm_._R, (byte)86, false);
                        }
                    }
                }
                else {
                    ib_.a150();
                }
                this.c813(true, (byte)(-69));
            }
        }
        else if (sl_.b154(15000)) {
            final int b138 = this.b880(null != cm_._R);
            if (b138 == 1 || 2 == b138) {
                if (null != cm_._R) {
                    ib_.a150();
                }
                if (b138 == 2) {
                    eg_.a812(m_.getApplet());
                }
            }
            this.c813(true, (byte)(-69));
        }
        else if (ue_.b427()) {
            if (fm_._a != 0) {
                this.c813(false, (byte)(-69));
            }
            else {
                if (1 == l_.d137(4570)) {
                    ik_.a503(bh_.pleaselogin, 0);
                }
                this.c813(true, (byte)(-69));
            }
        }
        else {
            this.c813(false, (byte)(-69));
        }
        if (!tl_._l) {
            while (true) {
                final ak_ ak_ = (ak_)ll_._i.b081();
                if (null == ak_) {
                    break;
                }
                vb_.a405(4, ak_);
            }
        }
        while (RenownTableEntry.a708(uo_._c)) {
            if (54 != hc_.loginStatusCode) {
                if (55 != hc_.loginStatusCode) {
                    if (56 == hc_.loginStatusCode || 57 == hc_.loginStatusCode) { //read renown table entries
                        final int f137 = ra_._c.readTribyte(-123);
                        final int f138 = ra_._c.readTribyte(-124);
                        final int size = ra_._c.readByte();
                        
                        final RenownTableEntry[] array = new RenownTableEntry[size];
                        for (int n2 = 0; size > n2; ++n2) {
                            array[n2] = mm_.a282(ra_._c);
                        }
                        ja_.a418(f137, f138, hc_.loginStatusCode == 57, array);
                    }
                    else if (58 == hc_.loginStatusCode) { //renown table error
                        hm_.renownTableError(); //sets things to null
                    }
                    else if (hc_.loginStatusCode != 61) {
                        if (hc_.loginStatusCode != 62) {
                            if (hc_.loginStatusCode == 72) { //72
                                if (nf_._A) {
                                    af_.a423();
                                    if (nf_._A) {
                                        nf_._A = false;
                                        ik_._e.a430(17158, false);
                                        gh_._f = true;
                                    }
                                }
                                kh_._s = false;
                            }
                            else {
                                if (nf_._A && null != ik_._e && ik_._e.handleRaidOpcodes()) {
                                    continue;
                                }
                                this.d487();
                            }
                        }
                        else { //62
                            af_.a423();
                            final pj_ pj_ = new pj_(ra_._c, true);
                            if (null == ik_._e || ik_._e._Y._f != pj_._f) {
                                ik_._e = new go_(true, pj_);
                            }
                            else {
                                ik_._e = new go_(true, pj_, ik_._e);
                            }
                            gd_.a778(dc_._z, 0, -1, false);
                            kh_._s = false;
                            nf_._A = true;
                        }
                    }
                    else { //61
                        final String a738 = ra_._c.readString();
                        final int k137 = ra_._c.readShort();
                        final int c474 = ra_._c.readByte();
                        final int h137 = ra_._c.readInt();
                        final boolean b139 = ra_._c.readByte() == 1;
                        if (2 != dc_._z) {
                            continue;
                        }
                        ((bg_)bf_._f[2]).a545(b139, c474, h137, k137, a738);
                    }
                }
                else { //55
                    final PlayerInformation d = gm_.playerInformation;
                    gm_.playerInformation = new PlayerInformation(ra_._c);
                    if (mn_._b == 4 || dc_._z == 4) {
                        jk_.j423();
                    }
                    if (5 == mn_._b || 5 == dc_._z) {
                        u_.a041(d);
                    }
                    if (2 == mn_._b || 2 == dc_._z) {
                        sh_.a041(27886, d);
                    }
                    if (mn_._b != 3 && dc_._z != 3) {
                        continue;
                    }
                    hi_.b150(1);
                }
            }
            else { //54
                final int[] b140 = new int[8];
                final int[] array2 = new int[8];
                final wj_ c475 = ra_._c;
                
                int numberOfIntsToRead = c475.readByte(); //at most 8
                for (int j = 0; j < numberOfIntsToRead; ++j) {
                    b140[j] = c475.readInt();
                }
                
                if (MusicTrack._d) { //something with achievements?
                    final int[] array3 = array2;
                    final int[] c477 = gj_._c;
                    
                    for (int n3 = 0; 8 > n3; ++n3) {
                        array3[n3] = array3[n3] & ~c477[n3];
                    }
                    
                    for (int l = 0; l < ce_.achievement_names.length; ++l) {
                        if (vl_.a873(l, -67, array2)) {
                            wl_._a.a865(new a_(l));
                        }
                    }
                }
                final int[] c478 = gj_._c;
                final int[] array4 = array2;
                
                for (int n4 = 0; 8 > n4; ++n4) {
                    c478[n4] = c478[n4] | array4[n4];
                }
                
                final int[] e = bp_._e;
                final int[] array5 = array2;
                
                for (int n5 = 0; n5 < 8; ++n5) {
                    e[n5] = e[n5] | array5[n5];
                }
                rf_._S = true;
            }
        }
        op_.writeToServer(0, 0);
        if (dm_.c154(81)) {
            final int f139 = this.f410((byte)101);
            if (f139 == 0 || f139 == 1) {
                if (!tl_._l) {
                    gm_.playerInformation = null;
                }
                if (f139 == 0) {
                    if (nf_._A) {
                        gh_._f = true;
                        gd_.a778(0, 0, 0, false);
                    }
                    kh_._s = false;
                }
                else {
                    kh_._s = true;
                }
            }
            boolean b141 = false;
            if (2 == f139) {
                b141 = true;
            }
            if (kh_._s) {
                b141 = true;
            }
            if (!dm_.c154(71)) {
                b141 = false;
            }
            if (b141) {
                l_.a150(-1);
            }
        }
    }
    
    @Override
    final void a423(final byte b) {
        this.a356();
        final tc_ tc_ = new tc_();
        tc_._A.c679((byte)7, 128, 9);
        tc_._B.c679((byte)(-120), 128, 9);
        af_.a224(true, tc_, 22050, 22050, c_.canvas, 2048, i_._A);
        cm_.a494(1.6f, 0.92f, -7788, 0.1f, 25.0f);
        he_._p = 16711680;
        dc_._l = 128;
        ui_._b = 4473924;
        il_._a = 255;
        om_._a = 16777215;
        sm_._c = 16776960;
        j_.createRaiders();
        kd_.createTraps();
        this.b813(true, (byte)(-67));
        uo_._c[70] = 0;
        uo_._c[55] = 704;
        uo_._c[57] = -2;
        uo_._c[66] = 2;
        uo_._c[54] = -1;
        uo_._c[67] = 9;
        uo_._c[62] = -2;
        uo_._c[59] = 8;
        uo_._c[56] = -2;
        uo_._c[72] = 0;
        uo_._c[65] = -1;
        kj_._n = 0;
        uo_._c[58] = 0;
        uo_._c[61] = -1;
        uo_._c[68] = 3;
        uo_._c[63] = 10;
        if (b > -15) {
            return;
        }
        ll_.debugMode = (2 <= nh_._k);
    }
    
    @Override
    public final void init() {
        this.a013();
    }
    
    @Override
    final void b487(final boolean b) {
        h423();
        a_.a150();
        md_.h150(-4);
        tc_.a423((byte)(-86));
        rl_.a423();
        vj_.a150();
        nb_.a423();
        td_.a150();
        qe_.a797();
        te_.a797();
        gh_.a150();
        og_.a150();
        sb_.a423((byte)(-88));
        fo_.a423();
        t_.a150();
        jh_.a797();
        in_.e150(-1);
        b_.b150();
        kg_.a487();
        tl_.a423();
        mh_.a150();
        nl_.a423();
        gf_.c797();
        nh_.cleanup();
        se_.a797();
        ig_.a150();
        dm_.b150();
        ec_.i150();
        kd_.a423();
        sp_.a487();
        ml_.a423();
        ri_.a150();
        sn_.a150();
        ib_.d150();
        ta_.a150();
        to_.cleanup();
        kp_.b150();
        cg_.a423();
        la_.c423();
        op_.a423();
        mp_.a423();
        sl_.a150();
        gj_.a423();
        c_.a150();
        wk_.b487();
        ek_.a423();
        bn_.a423();
        go_.f150(10);
        PlayerInformation.a423();
        hi_.a150();
        ea_.a150();
        ke_.a150();
        n_.a150();
        RaidMember.a423((byte)3);
        Room.a423();
        jc_.a150();
        ua_.cleanup();
        ne_.b150();
        qj_.a150();
        bc_.a150();
        lc_.a487();
        ja_.a487(false);
        lg_.a487(true);
        Animation.a150();
        sg_.a423();
        f_.a487();
        fp_.a150();
        pp_.e150();
        gd_.e150();
        nn_.b423((byte)(-80));
        kl_.a150();
        rj_.b487();
        sa_.b487();
        ug_.e150();
        wa_.c150();
        lp_.a423();
        vm_.d797();
        hg_.d150();
        vn_.e797();
        cb_.a150();
        ae_.a423();
        ko_.d150();
        qk_.a423();
        uf_.b150();
        gm_.a150();
        pj_.e150(126);
        mo_.a150();
        ul_.a487();
        jg_.a423();
        hd_.b423();
        uj_.a150();
        cd_.a150();
        vc_.cleanup();
        mi_.c150();
        fd_.a423();
        hl_.a150();
        rk_.a487(true);
        wj_.n150();
        qc_.a150();
        dd_.c423();
        en_.a150();
        d_.a150();
        DungeonBuilder.d487(true);
        ed_.f423();
        ih_.e150();
        bg_.b150(41);
        pd_.c423();
        le_.a150();
        RenownTableEntry.a423();
        db_.c423();
        wo_.a423();
        jm_.a423();
        ud_.a423();
        tk_.b423((byte)10);
        ob_.g150();
        fi_.a423((byte)(-106));
        CacheIndex.b423();
        qd_.a487();
        ji_.f423((byte)(-98));
        jb_.p150();
        wi_.i423((byte)(-97));
        jk_.n150();
        nk_.n150(2121792);
        RegisterScreen.h423();
        ia_.b487();
        dn_.f423();
        gk_.b487(false);
        lh_.a150();
        so_.a423((byte)95);
        df_.a150();
        fj_.a423();
        IsaacCipher.c150(-103);
        hj_.f150();
        lo_.a150();
        ll_.a423((byte)92);
        rd_.b487(true);
        s_.cleanup();
        pa_.a150();
        ka_.a423();
        bk_.a487();
        il_.a423();
        bb_.a423();
        cc_.b150();
        je_.a487();
        tm_.cleanup();
        uk_.a150();
        qa_.b150();
        ld_.a487();
        hc_.a150();
        nm_.n150();
        vd_.a423();
        hh_.b150();
        re_.c797();
        jp_.a797();
        sm_.a423((byte)(-118));
        qh_.b423((byte)75);
        jj_.a423();
        rn_.b150();
        om_.a150();
        mn_.b423();
        jl_.a423();
        li_.a487();
        ok_.f150(-16218);
        tb_.b423();
        ql_.b423();
        ik_.a150(0);
        ra_.a423();
        un_.a423();
        ej_.a797();
        dc_.a423((byte)108);
        oe_.a150();
        kn_.a150();
        nj_.a423();
        oh_.a150();
        an_.c150(-13023);
        jn_.a150();
        im_.a150();
        l_.a423();
        lm_.d423();
        GUIButton.b487(true);
        da_.a150();
        sj_.g423();
        rf_.b487(false);
        ii_.e423();
        dj_.a423((byte)113);
        am_.a150();
        nd_.b797();
        vb_.a423();
        nf_.e423();
        hk_.a150();
        gb_.a150();
        eg_.d150(-23658);
        hp_.a150();
        no_.a423();
        um_.a487();
        wl_.a150(98);
        fg_.d150(-102);
        kf_.b487();
        ag_.a150();
        ki_.a423((byte)(-35));
        sf_.c423();
        lj_.d150();
        ro_.f423();
        oj_.a423((byte)(-29));
        uo_.a150();
        gl_.c423();
        oc_.e150(4296);
        dl_.a150();
        tp_.h150(35);
        up_.a487();
        em_.c487(true);
        ln_.b150();
        co_.e150();
        ti_.a487();
        sh_.a487();
        vf_.d150();
        dg_.b487();
        GUIInput.i423();
        rm_.m150();
        hf_.m150();
        uc_.c487(false);
        gi_.f423();
        bh_.f423();
        ng_.f423();
        tn_.cleanup();
        GUICheckbox.a150(4935);
        ip_.c423();
        mf_.a150();
        cm_.j150();
        mk_.b487();
        wg_.a797();
        kk_.a150(0);
        of_.a423();
        ah_.a150();
        np_.c423();
        fk_.d150();
        j_.g423();
        eb_.f423((byte)86);
        ol_.a423();
        fe_.b423((byte)(-34));
        ep_.a150();
        bp_.a150();
        oi_.h150();
        bj_.h150(31029);
        ad_.a150();
        qi_.a487();
        dh_.a150();
        wf_.d423((byte)(-28));
        pb_.e423();
        ha_.c150();
        rc_.a423();
        rp_.b423();
        g_.g150();
        oo_.a150(13054);
        bi_.a797();
        ho_.a150();
        id_.a423();
        fa_.a150();
        DungeonPath.a423();
        gg_.a150();
        hm_.d150();
        HeaderLabelText.a150();
        k_.a487();
        fm_.a487();
        AmbientAudioTrack.a150(30);
        o_.d150();
        MusicTrack.b150();
        na_.c150(-91);
        oa_.a423();
        mc_.c150();
        ic_.d150();
        dk_.a423();
        sd_.b487(false);
        al_.a423();
        fn_.d150();
        mj_.a150();
        bo_.c423();
        pm_.a150();
        bl_.d423();
        jd_.a150(1);
        Raider.a423((byte)16);
        Trap.a150();
        af_.a150();
        vk_.b423();
        wd_.a150(115);
        fl_.a423();
        gn_.a150(194);
        ie_.d150();
        lf_.d150();
        WarningMessage.e150();
        ce_.d423();
        bf_.a423((byte)85);
        me_.a150(36);
        ef_.a423();
        ao_.d150();
        ba_.a423();
        ch_.c150();
        sc_.b423((byte)(-94));
        vl_.a423();
        Tooltip.c423();
        FooterCenterHint.b150();
        jf_.a487();
        fc_.b150();
        bd_.cleanup();
        cp_.c423((byte)(-66));
        u_.c423();
        lk_.h150();
        kc_.a150();
        pe_.a150(9);
        ak_.a150();
        ve_.a150(-125);
        r_.a150();
        i_.a423();
        kj_.a150();
        mm_.a150();
        ub_.cleanup();
        ue_.a423();
        pi_.a150(11877);
        tg_.a150(400);
        kh_.e423();
        vo_.e150(1);
        qm_.d487();
        ga_.d423();
        he_.d423();
        be_.e150();
        fb_.a150();
        ci_.a150(116);
        od_.b423();
        m_.d150(-1);
        ab_.b150(1781937827);
        super.codeBaseHost = null;
    }
    
    private final boolean h154(final int n) {
        he_.e150();
        if (HeaderLabelText.a595(this)) {
            Room.a150(-78);
            for (int n2 = 0; 14 > n2; ++n2) {
                if (n2 != 4) {
                    if (n2 != 5) {
                        if (n2 != 2) {
                            if (3 == n2) {
                                bf_._f[n2] = new db_();
                            }
                            else if (n2 != 13) {
                                if (n2 != 7) {
                                    bf_._f[n2] = new qc_(n2);
                                }
                                else {
                                    bf_._f[n2] = new fi_();
                                }
                            }
                            else {
                                bf_._f[n2] = new ud_();
                            }
                        }
                        else {
                            bf_._f[n2] = new bg_();
                        }
                    }
                    else {
                        bf_._f[n2] = new ih_();
                    }
                }
                else {
                    bf_._f[n2] = new DungeonBuilder();
                }
            }
            mn_._b = 13;
            dc_._z = 13;
            bf_._f[13].b487(false);
            if (tl_._l) {
                gm_.playerInformation = null;
            }
            ag_.a093(50);
            nf_.d150(0);
            i_._A.a238(c_.canvas, (byte)25, false);
            gi_.canvas = c_.canvas;
            ll_.a150();
            ll_.debugMode = (nh_._k >= 2);
            return true;
        }
        return false;
    }
    
    @Override
    final void c487(final boolean b) {
        MusicTrack.a150();
        if (null != cm_._R) {
            ib_.a150();
        }
        kp_.a150(1);
        if (!b) {
            DungeonAssault.text_title_hint = null;
        }
    }
    
    @Override
    final void b423(final byte b) {
        final Canvas canvas = fi_.getCanvas();
        if (ao_.a427()) {
            mf_.a166(md_.f154(), canvas);
            return;
        }
        if (!ef_._h) {
            g_.a035(canvas);
            return;
        }
        if (b != 38) {
            this.c813(true, (byte)(-98));
        }
        if (hc_.b154()) {
            ++li_._k;
            if (fm_._a != bn_._n) {
                CacheIndex.a016(mn_._b);
                if (co_._G != null) {
                    co_._G.a540(true, bd_._f);
                    ++bd_._f;
                    if (bd_._f == 64) {
                        af_.a423();
                    }
                }
            }
            if (nk_._Hb) {
                gf_.g115(0, 0, gf_._i, gf_._c);
                fm_.a974(ea_.a202(), 15 + la_.a410(), 30 + og_.b137());
                ci_.a423();
            }
            if (sl_.b154(15000)) {
                fl_.a813(cm_._R != null || rj_.isWindowInFocus);
            }
            else if (ue_.b427() && !nk_._Hb) {
                gf_.g115(0, 0, gf_._i, gf_._c);
                rc_.a150();
            }
            if (fm_._a != 0) {
                final int n = WarningMessage._t * 256 / 16;
                if (0 < n) {
                    gf_.b669(0, 0, gf_._i, gf_._c, 0, n);
                }
            }
            final a_ a_ = (a_)wl_._a.e024();
            if (a_ != null) {
                if (null == sl_._b) {
                    ah_.a540(a_._j);
                }
                boolean b2 = false;
                if (40 <= ke_._e) {
                    if (80 <= ke_._e) {
                        if (230 > ke_._e) {
                            ec_._j[a_._j].a115(8, 0, 32, 32);
                        }
                        else if (ke_._e < 270) {
                            final int n2 = (-ke_._e + 270 << 8) / 40;
                            b2 = true;
                            ri_._g.d050(8, 0, 32, 32, n2);
                        }
                        else {
                            b2 = true;
                        }
                    }
                    else {
                        ri_._g.d050(8, 0, 32, 32, (ke_._e - 40 << 8) / 40);
                    }
                }
                if ((0x1 & li_._k) == 0x0) {
                    if (b2) {
                        sl_._b.b797();
                    }
                    else {
                        sl_._b.a601(pa_._a, 0, 0);
                    }
                }
                else {
                    sl_._b.a797();
                }
                if (40 <= ke_._e) {
                    if (80 > ke_._e) {
                        ne_.roman20.a068(ce_.achievement_names[a_._j], 48, 32 + ne_.roman20._H >> 1, 0, -1, (ke_._e - 40 << 8) / 40 >> 1);
                    }
                    else if (ke_._e >= 230) {
                        if (270 > ke_._e) {
                            ne_.roman20.a068(ce_.achievement_names[a_._j], 48, 32 + ne_.roman20._H >> 1, 0, -1, (-ke_._e + 270 << 8) / 40 >> 1);
                        }
                    }
                    else {
                        ne_.roman20.a068(ce_.achievement_names[a_._j], 48, 32 + ne_.roman20._H >> 1, 0, -1, 128);
                    }
                }
            }
            if (nh_._k >= 2 && ld_._b) {
                ne_.roman20.b191(Integer.toString(bc_._a), 20, 20, 16777215, 1);
                ne_.roman20.b191((int)(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory() >> 10) + "kb", 4, ne_.roman20._H * 2 + 8, 16777215, -1);
                ne_.roman20.b191(tc_.playerTitle, 20, 80, 16777215, 1);
            }
            final Graphic cn_ = kh_.cursor[kj_._n / 5];
            final Graphic cn_2 = jg_._c[kj_._n / 5];
            if (-1 != hj_.mouseX) {
                cn_2.b326(hj_.mouseX, Animation.mouseY, (int)((3.0 + Math.cos(mo_._a / 20.0f)) * 64.0));
                cn_.drawImage(hj_.mouseX, Animation.mouseY);
            }
            ob_.a749(0, -123, canvas, 0);
            return;
        }
        tp_.a132(100.0f, kj_.loading_extradata);
        g_.a035(canvas);
    }
    
    static {
        DungeonAssault.beastman = "Beastman";
        DungeonAssault.text_title_hint = "<col=E5A634>Your title, </col><%0><col=E5A634>, will appear in the Dragons of Renown table.";
        DungeonAssault.text_trap = "Trap";
    }
}
