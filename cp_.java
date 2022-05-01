import java.applet.*;

final class cp_ extends gd_
{
	//original name: _T
    static String login_username_email;
    static boolean _U;
    //original name: _P
    static String desc_poison_gas;
    //original name: _S
    Trap trap;
    static String[] _Q;
    //original name: _O
    static String giant_rats;
    
    @Override
    final void b326(final int n, final int n2, final int n3) {
        if (n2 != 8187) {
            return;
        }
        final int n4 = n + (super._t - 3);
        final int n5 = n3 + super._i - 3;
        final int n6 = 5 + (super.imageWidth + n4);
        final int n7 = 5 + n5 + super.imageHeight;
        if (n4 <= gf_._h && gf_._e >= n5 && gf_._j <= n6 && n7 >= gf_._f) {
            gf_.b669(n4, n5, super.imageWidth + 5, super.imageHeight + 5, 0, 128);
            super.b326(n, n2 + 0, n3);
            final Graphic a571 = this.trap.idleAnimation.a571(40, 0, 40);
            final int n8 = super.imageHeight + n5 - 42;
            final int n9 = n4 + 5;
            if (null == a571) {
                gf_.b050(n9, n8, 32, 32, 0);
            }
            else {
                a571.c093(n9, n8);
            }
        }
    }
    
    //original signature: cp_(final int n, final int n2, final Trap s) {
    cp_(final int n, final int n2, final Trap trap) {
        super(n, n2, 0, 0, 0);
        this.trap = trap;
        final int c = this.trap.cost;
        final String[] a782 = jn_.a782(this.trap.name, new int[] { 140, 88 }, -108, db_.roman12bold);
        final int n3 = db_.roman12bold._H * a782.length + la_.roman12._H + 42;
        final boolean b = 0 >= pb_.isMember && (this.trap.requirements & 0x1) != 0x0;
        final boolean b2 = 0 == gm_.playerInformation._e && (this.trap.requirements & 0x2) != 0x0;
        final boolean b3 = b | b2;
        final Graphic cn_ = new Graphic(140, n3);
        final Graphic cn_2 = new Graphic(140, n3);
        final Graphic cn_3 = new Graphic(140, n3);
        jh_.a303(cn_);
        gf_.a797();
        int n4 = 0;
        for (int i = 0; i < a782.length; ++i) {
            n4 += la_.roman12._H;
            la_.roman12.b191(a782[i], (i == 0) ? 0 : la_.roman12._H, n4, b3 ? 8421504 : 16760832, -1);
        }
        int n5 = n4 + (la_.roman12._H + 2);
        if (b) {
            la_.roman12.b191(dn_.text_members_only, 52, n5, 16711680, -1);
        }
        else if (b2) {
            la_.roman12.b191(be_.text_orbmode, 52, n5, 16711680, -1);
        }
        else {
            la_.roman12.b191(jk_.replacePlaceholders(new String[] { Integer.toString(c / 10) }, n_.text_x_renown), 52, n5, 12632256, -1);
        }
        n5 += 4;
        cn_2.e797();
        final int n6 = n3 - 5 - 40;
        gf_.a797();
        cn_.e326(0, 0, 16744448);
        al_.a695(52, n5, this.trap, 16744448);
        rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, n6);
        cn_3.e797();
        gf_.a797();
        cn_.e326(0, 0, 12690143);
        al_.a695(52, n5, this.trap, 10449103);
        rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, n6);
        cn_.e797();
        al_.a695(52, n5, this.trap, 12632256);
        rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, n6);
        jh_.b797();
        this.a037(cn_2, cn_, GUICheckbox.a551(16, cn_2, 16711680, (byte)(-75)), cn_3, (byte)126, GUICheckbox.a551(16, cn_2, 255, (byte)(-95)));
        super._n = new bd_(this.trap);
        if (b3) {
            super.isActive = false;
        }
    }
    
    static final void a406(final Applet applet) {
        mj_.overxgames = applet.getParameter("overxgames");
        if (null == mj_.overxgames) {
            mj_.overxgames = "0";
        }
        dh_.overxachievements = applet.getParameter("overxachievements");
        if (dh_.overxachievements == null) {
            dh_.overxachievements = "0";
        }
        final String currency = applet.getParameter("currency");
        if (null != currency && sj_.a454(currency)) {
            wo_.currency = mm_.a978(currency, true, 10);
        }
        else {
            wo_.currency = 2;
        }
        uj_._d = 16777215;
        lj_._u = 0;
        ld_._c = 0;
        en_.text_benefits_images = new Graphic[qk_.text_benefits.length];
        for (int i = 0; i < qk_.text_benefits.length; ++i) {
            en_.text_benefits_images[i] = new Graphic(317, 34);
        }
        ec_.text_benefits = qk_.text_benefits;
    }
    
    static final int f313(final int n, final int n2) {
        final int n3 = n2 >>> 31;
        return (n3 + n2) / n - n3;
    }
    
    public static void c423(final byte b) {
        cp_.giant_rats = null;
        cp_._Q = null;
        cp_.desc_poison_gas = null;
        if (b != -66) {
            cp_._U = false;
        }
        cp_.login_username_email = null;
    }
    
    static final void f150(final int n) {
        if (fm_.a427()) {
            na_._D.a421(am_._e, bp_._d, true);
            na_._D.b487();
            while (ha_.b427()) {
                na_._D.a564(n + 30335, mm_._t, ob_._Yb);
            }
            if (n != -30208) {
                c423((byte)49);
            }
            return;
        }
        if (cm_._R != null && cm_._R._g) {
            ib_.a150();
            na_._D.a336(new nm_(na_._D, of_._g), -1);
        }
    }
    
    static {
        cp_.desc_poison_gas = "If the trap here is triggered, the room will almost instantly fill with a gangrenous-looking poison gas.";
        cp_._U = false;
        cp_.giant_rats = "Giant Rats";
        cp_.login_username_email = "Login: ";
    }
}
