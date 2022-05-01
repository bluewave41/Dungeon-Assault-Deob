final class lk_ extends gd_
{
    static int _S;
    //original name: _T
    static int gamePort1;
    //original name: _Q
    static String create_email_tooltip;
    static int[][] _R;
    int _O;
    //original name: _P
    static String text_commit;
    
    static final void a627(final String d) {
        jj_._d = d;
        sn_.a093(93, 12);
    }
    
    @Override
    final void b326(final int n, final int n2, final int n3) {
        if (n2 != 8187) {
            return;
        }
        wd_._l[this._O].a668(20 + (super._i + n3), 30 + (n + super._t), true, 30);
        super.b326(n, n2 ^ 0x0, n3);
    }
    
    lk_(final int n, final int n2, final int n3, final int n4, final int o) {
        super(n, n2, n3, n4, 0);
        this._O = o;
        this.g150(255);
    }
    
    public static void h150() {
        lk_.create_email_tooltip = null;
        lk_._R = null;
        lk_.text_commit = null;
    }
    
    final void g150(final int n) {
        final int n2 = gm_.playerInformation._J[this._O];
        final int n3 = gm_.playerInformation._F[this._O];
        String s = null;
        if (n2 != 0) {
            s = jk_.replacePlaceholders(new String[] { Integer.toString(n2) }, nh_.text_orbs_active_x);
            if (n3 != 0) {
                s = s + ", " + jk_.replacePlaceholders(new String[] { Integer.toString(n3) }, to_.text_orbs_charging_x);
            }
            if (ve_.a491() && hm_._m[this._O]) {
                if (n2 >= 5) {
                    s = s + ", " + qh_.text_limit_reached;
                }
            }
        }
        else if (n3 != 0) {
            s = jk_.replacePlaceholders(new String[] { Integer.toString(n3) }, to_.text_orbs_charging_x);
        }
        final String s2 = li_.orbNames[this._O];
        int b926 = db_.roman12bold.b926(s2);
        int n4 = db_.roman12bold._H + la_.roman12._E;
        if (null != s) {
            final int b927 = db_.roman12bold.b926(s);
            if (b927 > b926) {
                b926 = b927;
            }
            n4 += db_.roman12bold._H;
        }
        super._K = new Graphic(b926, n4);
        super._H = new Graphic(b926, n4);
        super._z = new Graphic(b926, n4);
        jh_.c797();
        super._K.e797();
        db_.roman12bold.b191(s2, 0, la_.roman12._H, 12632256, -1);
        if (null != s) {
            db_.roman12bold.b191(s, 0, la_.roman12._H * 2, 8421504, -1);
        }
        super._H.e797();
        gf_.a797();
        super._K.e326(0, 0, 16744448);
        super._z.e797();
        gf_.a797();
        super._K.e326(0, 0, 12690143);
        jh_.b797();
        super._K._A = super.imageHeight - n4 >> 1;
        super._K._w = 60;
        super._H._w = 60;
        super._H._A = super.imageHeight - n4 >> 1;
        super._z._w = 60;
        super._z._A = super.imageHeight - n4 >> 1;
        super._I = GUICheckbox.a551(16, super._z, n, (byte)(-33));
        super._N = GUICheckbox.a551(16, super._H, 16711680, (byte)(-18));
    }
    
    //original signature: static final String a278(final String s, final nh_ nh_, final String s2) {
    static final String a278(final String loadingTextString, final nh_ nh_, final String waitingForTextString) {
        if (!nh_.a154()) {
            return waitingForTextString;
        }
        return loadingTextString + " - " + nh_.b137() + "%";
    }
    
    static final void f150(final int n) {
        ia_._K = null;
        sg_._b = null;
        ga_.introImages = null;
        ro_._B = false;
        if (n != 16) {
            lk_._S = 2;
        }
        System.gc();
    }
    
    @Override
    final void a599(final int n, final int n2, final byte b) {
        final int n3 = super._t + n;
        final int n4 = n2 + super._i;
        for (int n5 = 0; 10 > n5; ++n5) {
            gf_.g050(30 + n3, 20 + n4, 20 + n5, 0, 16);
        }
    }
    
    static {
        lk_.text_commit = "CONFIRM";
        lk_._S = 0;
        lk_.create_email_tooltip = "Your email address is used to identify this account";
    }
}
