final class cm_ extends ii_ implements pf_, vg_
{
	//original name: _N
    private GUIButton continueButton;
    static int _P;
    private bh_ _L;
    private jb_ _O;
    static ad_ _T;
    static boolean _Q;
    //original name: _S
    static String hoard;
    //original name: _K
    static String text_raider_escapes;
    static int[] _M;
    static ek_ _R;
    
    //original signature: private final String i738(final int n) {
    //never called
    private final String i738(final int n) {
        return "</col></u>";
    }
    
    @Override
    public final void a475(final GUIButton ck_, final byte b, final int n, final int n2, final int n3) {
        if (b != 98) {
            cm_.hoard = null;
        }
        if (this.continueButton == ck_) {
            up_.b150();
            this._O.j423((byte)98);
        }
    }
    
    //original signature: static final String a776(final boolean b, final CharSequence charSequence) {
    static final String a776(final CharSequence charSequence) {
        if (null == charSequence) {
            return hf_.create_alert_namelength;
        }
        final int length = charSequence.length();
        if (length < 1 || length > 12) {
            return hf_.create_alert_namelength;
        }
        final String a715 = jm_.lowerCaseReplaceSpaceWithUnderscore(charSequence);
        if (a715 == null || a715.length() < 1) {
            return hf_.create_alert_namelength;
        }
        if (jc_.a351(a715.charAt(0)) || jc_.a351(a715.charAt(a715.length() - 1))) {
            return jm_.create_alert_nameleadingspace;
        }
        int n = 0;
        for (int n2 = 0; charSequence.length() > n2; ++n2) {
            if (!jc_.a351(charSequence.charAt(n2))) {
                n = 0;
            }
            else {
                ++n;
            }
            if (2 <= n) {
                return id_.create_alert_doublespace;
            }
        }
        if (0 >= n) {
            return null;
        }
        return jm_.create_alert_nameleadingspace;
    }
    
    public static void j150() {
        cm_._M = null;
        cm_.hoard = null;
        cm_.text_raider_escapes = null;
        cm_._R = null;
        cm_._T = null;
    }
    
    static final void a494(final float n, final float n2, final int n3, final float n4, final float n5) {
        if (n3 != -7788) {
            cm_.hoard = null;
        }
        md_.a368(1.0f, n2, 1.0f, n, n4, n5);
    }
    
    //never called
    private final String a738(final int n) {
        if (n < 82) {
            cm_._R = null;
        }
        return "<u=2164A2><col=2164A2>";
    }
    
    @Override
    public final void a271(final int n, final bh_ bh_, final int n2, final int n3) {
        if (n2 != 126) {
            this.a271(113, null, 9, -25);
        }
        if (n != 0) {
            if (n != 1) {
                if (2 == n) {
                    lk_.a627("conduct.ws");
                }
            }
            else {
                lk_.a627("privacy.ws");
            }
        }
        else {
            lk_.a627("terms.ws");
        }
    }
    
    @Override
    final boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (super.a401(lm_, c, n, (byte)61)) {
            return true;
        }
        if (98 == n) {
            return this.a059(lm_);
        }
        if (99 == n) {
            return this.a489((byte)(-5), lm_);
        }
        if (b < 55) {
            this.a475(null, (byte)8, 78, 7, -119);
        }
        return false;
    }
    
    cm_(final jb_ o) {
        super(0, 0, 288, 0, null);
        this._O = o;
        this.continueButton = new GUIButton(gl_.cont, null);
        this.continueButton._o = new na_();
        final String a841 = jk_.replacePlaceholders(new String[] { "<u=2164A2><col=2164A2>", "</col></u>" }, nj_.create_u13terms);
        final int n = 20;
        this._L = new bh_(a841, new hh_(lp_._C, 0, 0, 0, 0, 16777215, -1, 3, 0, lp_._C._H, -1, Integer.MAX_VALUE, true));
        this._L.tooltip = "";
        this._L.a871(8, 0, kn_.openinpopupwindow);
        this._L.a871(8, 1, kn_.openinpopupwindow);
        this._L._n = this;
        this._L.componentWidth = super.componentWidth - 40;
        this._L.a762(26, (byte)(-71), super.componentWidth - 40, n);
        final int n2 = n + (15 + this._L.componentHeight);
        this.b485(this._L);
        final int n3 = 4;
        final int n4 = 200;
        this.continueButton.b050(0, n4, n2, -n4 + 300 >> 1, 40);
        ((ii_)(this.continueButton._n = this)).b485((lm_)this.continueButton);
        this.b050(0, 300, 0, 0, n3 + 55 + n2);
    }
    
    static {
        cm_._T = new ad_(10, 0);
        cm_.text_raider_escapes = "Raider escapes!";
        cm_.hoard = "Hoard";
        cm_._M = GUICheckbox.b330(12632256, 8421504, 64);
    }
}
