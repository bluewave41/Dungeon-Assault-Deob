final class RegisterScreen extends ii_ implements pf_, vg_, mg_
{
    static int[] _P;
    //original name: _K
    private GUIInput registerCreatePasswordInput;
    gi_ _W;
    //original name: _U
    private GUIInput registerConfirmEmailInput;
    //original name: _V
    private GUIButton goBackButton;
    //original name: _S
    private GUIInput registerAgeInput;
    //original name: _M
    static Animation[] idleDragonAnimations;
    //original name: _T
    private GUICheckbox registerOptInBox;
    //original name: _R
    private GUIInput registerDisplayNameInput;
    //original name: _L
    private GUIInput registerConfirmPasswordInput;
    //original name: _O
    private GUIInput registerEmailInput;
    //original name: _N
    private GUIButton createButton;
    private bh_ _Q;
    
    static final boolean i427() {
        return om_.a595(m_.getApplet());
    }
    
    //original signature:  private final String j983(final byte b) {
    private final String getClosingColUnderlineTags(final byte b) {
        return "</col></u>";
    }
    
    private final int a499(final String s, final lm_ lm_, final int n, final String s2, final int n2, final int n3) {
        return this.a886(n3, lm_);
    }
    
    @Override
    public final void a475(final GUIButton ck_, final byte b, final int n, final int n2, final int n3) {
        if (this.goBackButton != ck_) {
            if (this.createButton == ck_) {
                this.f427((byte)(-124));
            }
        }
        else {
            li_.c150(b + 218);
        }
        if (b != 98) {
            this._W = null;
        }
    }
    
    public static void h423() {
        RegisterScreen.idleDragonAnimations = null;
        RegisterScreen._P = null;
    }
    
    //original signature: private final int a585(final int n, final String s, final lm_ lm_, final int n2, final int n3) {
    //calculating height?
    private final int a585(final lm_ lm_, final int n2) {
        final dg_ dg_ = new dg_(20, n2, 290, 25, lm_, false, 120, 3, lp_._C, 16777215, mp_.create_email);
        this.b485(dg_);
        return dg_.componentHeight;
    }
    
    //original signature: static final void a924(final int n, final ec_ ec_, final int n2, final int n3, final int n4) {
    static final void createOpcode12(final int serverNum, final ec_ buffer, final int gameId, final int lang) {
        buffer.storeByte(12);
        buffer.storeShort(17);
        buffer.storeShort(gameId);
        buffer.storeShort(serverNum);
        buffer.storeByte(lang);
    }
    
    @Override
    public final void a271(final int n, final bh_ bh_, final int n2, final int n3) {
        if (n == 0) {
            lk_.a627("terms.ws");
        }
        else if (n != 1) {
            if (n == 2) {
                lk_.a627("conduct.ws");
            }
        }
        else {
            lk_.a627("privacy.ws");
        }
        if (n2 != 126) {
            this.registerCreatePasswordInput = null;
        }
    }
    
    //original signature: private final int a103(final String s, final int n, final int n2, final lm_ lm_, final int n3) {
    private final int a103(final int n2, final lm_ lm_) {
        final dg_ dg_ = new dg_(20, n2, 290, 25, lm_, false, 120, 3, lp_._C, 16777215, fl_.create_age);
        this.b485(dg_);
        final ng_ ng_ = new ng_(((qn_)lm_).a293(-87));
        this.b485(ng_);
        ng_.b050(0, 15, dg_.yAxisOffset + (dg_.componentHeight - 15 >> 1), 3 + dg_.xAxisOffset + dg_.componentWidth, 15);
        return dg_.componentHeight;
    }
    
    //original signature: private final int a886(final int n, final int n2, final String s, final String s2, final int n3, final lm_ lm_, final int n4) {
    private final int a886(final int n2, final lm_ lm_) {
        final dg_ dg_ = new dg_(20, n2, 290, 25, lm_, false, 120, 3, lp_._C, 16777215, hp_.create_email_confirm);
        this.b485(dg_);
        final tn_ tn_ = new tn_(((qn_)lm_).a293(-83), "", 126, n2 + dg_.componentHeight, 220, 20);
        ((ii_)(tn_._n = this)).b485((lm_)tn_);
        return tn_.componentHeight + dg_.componentHeight;
    }
    
    private final boolean b491(final boolean b) {
        if (!b) {
            this.a271(31, null, -50, -67);
        }
        return this.a940(23786, this.registerDisplayNameInput) && this.a940(23786, this.registerEmailInput) && this.a940(23786, this.registerConfirmEmailInput) && this.a940(23786, this.registerCreatePasswordInput) && this.a940(23786, this.registerConfirmPasswordInput) && this.a940(23786, this.registerAgeInput);
    }
    
    private final boolean f427(final byte b) {
        if (!this.b491(true)) {
            return false;
        }
        int int1 = -1;
        if (b != -124) {
            this.registerOptInBox = null;
        }
        try {
            int1 = Integer.parseInt(this.registerAgeInput.buttonText);
        }
        catch (NumberFormatException ex) {}
        return td_.a742(this.registerCreatePasswordInput.buttonText, this.registerOptInBox._E, this.registerDisplayNameInput.buttonText, this, int1, this.registerEmailInput.buttonText);
    }
    
    //never called
    static final void a984(final int n, final String s) {}
    
    private final String g983(final byte b) {
        if (b > -17) {
            createOpcode12(76, null, -91, -13);
        }
        return "<u=2164A2><col=2164A2>";
    }
    
    @Override
    public final void a407(final byte b, final String s) {
        if (b > -26) {
            this.a103(-13, null);
        }
        this.registerDisplayNameInput.capInputLength(s, false);
    }
    
    static final void i150() {
        final int length = sn_.torches.length;
        r_._b = new int[length];
        ud_._w = new int[length];
        for (int i = 0; i < length; ++i) {
            final int[] b = sn_.torches[i]._B;
            final int y = sn_.torches[i].imageWidth;
            int n;
            for (n = b.length - 1; 0 <= n && 16776960 != b[n]; --n) {}
            b[n - 1] = (b[n] = 0);
            b[-1 - y + n] = (b[-y + n] = 0);
            ud_._w[i] = sn_.torches[i]._w + n / y - 1;
            r_._b[i] = n % y - 1 + sn_.torches[i]._A;
        }
    }
    
    @Override
    public final void a150(final int n) {
        ((kh_)this.registerDisplayNameInput.a293(-115)).e487(true);
        if (n <= 121) {
            this.g983((byte)69);
        }
    }
    
    //original signature:  public rg_() {
    public RegisterScreen() {
        super(0, 0, 496, 0, null);
        this.registerDisplayNameInput = new GUIInput("", null, 12);
        this.registerEmailInput = new GUIInput("", null, 100);
        this.registerConfirmEmailInput = new GUIInput("", null, 100);
        this.registerCreatePasswordInput = new GUIInput("", null, 20);
        this.registerConfirmPasswordInput = new GUIInput("", null, 20);
        this.registerAgeInput = new GUIInput("", null, 3);
        this.registerOptInBox = new GUICheckbox("", null, true);
        
        this.createButton = new GUIButton(ef_.create, null);
        this.goBackButton = new GUIButton(pp_.goback, null);
        
        this.registerDisplayNameInput.tooltip = un_.create_displayname_tooltip;
        this.registerEmailInput.tooltip = lk_.create_email_tooltip;
        this.registerConfirmEmailInput.tooltip = bk_.create_email_confirm_tooltip;
        this.registerCreatePasswordInput.tooltip = ce_.create_password_tooltip;
        this.registerConfirmPasswordInput.tooltip = lm_.create_password_confirm_tooltip;
        this.registerAgeInput.tooltip = vk_.create_age_tooltip;
        this.registerOptInBox.tooltip = sa_.create_optin_news_tooltip;
        
        /*What are these?*/
        this.registerDisplayNameInput.a981(new kh_(this.registerDisplayNameInput));
        this.registerEmailInput.a981(new qm_(this.registerEmailInput));
        this.registerConfirmEmailInput.a981(new ga_(this.registerConfirmEmailInput, this.registerEmailInput));
        this.registerCreatePasswordInput.a981(new vo_(this.registerCreatePasswordInput, this.registerDisplayNameInput, this.registerEmailInput));
        this.registerConfirmPasswordInput.a981(new be_(this.registerConfirmPasswordInput, this.registerCreatePasswordInput));
        this.registerAgeInput.a981(new he_(this.registerAgeInput));
        this.createButton._B = false;
        this.createButton._o = new na_();
        this.goBackButton._o = new oa_();
        this.registerDisplayNameInput._o = new mc_();
        
        final mc_ mc_ = new mc_();
        this.registerConfirmEmailInput._o = mc_;
        this.registerEmailInput._o = mc_;
        
        this.registerAgeInput._o = new mc_();
        this.registerOptInBox._o = new dk_();
        
        final ic_ ic_ = new ic_();
        this.registerConfirmPasswordInput._o = ic_;
        this.registerCreatePasswordInput._o = ic_;
        
        final String a841 = jk_.replacePlaceholders(new String[] { this.g983((byte)(-47)), this.getClosingColUnderlineTags((byte)(-115)) }, ae_.create_agreeterms);
        
        final int n = 20;
        final int n2 = n + this.a585(this.registerEmailInput, n);
        final int n3 = n2 + (this.a886(n2, this.registerConfirmEmailInput) + 5);
        final int n4 = n3 + this.a585(this.registerCreatePasswordInput, n3);
        final int n5 = n4 + (5 + this.a499(qj_.create_password_confirm, this.registerConfirmPasswordInput, -126, td_.create_password_hint, 170, n4));
        final int n6 = n5 + (5 + this.a499(wf_.create_displayname, this.registerDisplayNameInput, -123, an_.create_displayname_hint, 170, n5));
        final int n7 = n6 + this.a103(n6, this.registerAgeInput);
        
        final dg_ dg_ = new dg_(46, n7, super.componentWidth - 90, 25, this.registerOptInBox, true, super.componentWidth - 120, 5, ta_._e, 11579568, lf_.create_optin_news);
        this.b485(dg_);
        final int n8 = n7 + dg_.componentHeight;
        this._Q = new bh_(a841, new hh_(lp_._C, 0, 0, 0, 0, 16777215, -1, 0, 0, lp_._C._H, -1, Integer.MAX_VALUE, true));
        this._Q.tooltip = "";
        this._Q.a871(8, 0, kn_.openinpopupwindow);
        this._Q.a871(8, 1, kn_.openinpopupwindow);
        this._Q._n = this;
        this._Q.a762(46, (byte)(-70), super.componentWidth - 90, n8);
        final int n9 = n8 + (15 + this._Q.componentHeight);
        this.b485(this._Q);
        final int n10 = 4;
        final int n11 = 200;
        this.createButton.b050(0, n11, n9, -n11 + 496 >> 1, 40);
        this.goBackButton.b050(0, 60, n9 + 15, n10 + 3, 40);
        this.goBackButton._n = this;
        ((ii_)(this.createButton._n = this)).b485((lm_)this.createButton);
        this.b485(this.goBackButton);
        (this._W = new gi_(this)).b050(0, -this.registerDisplayNameInput.xAxisOffset + (super.componentWidth + (-this.registerDisplayNameInput.componentWidth - 60)), 20 + this.registerDisplayNameInput.yAxisOffset, this.registerDisplayNameInput.xAxisOffset + this.registerDisplayNameInput.componentWidth + 60, 150);
        this.b485(this._W);
        this.b050(0, 496, 0, 0, 55 + n9 + n10);
    }
    
    @Override
    final void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        super.a319(n, n2, lm_, b);
        this.createButton._B = this.b491(b);
    }
    
    @Override
    final boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (super.a401(lm_, c, n, (byte)112)) {
            return true;
        }
        if (98 == n) {
            return this.a059(lm_);
        }
        if (b < 55) {
            this.a940(108, null);
        }
        return 99 == n && this.a489((byte)(-5), lm_);
    }
    
    private final boolean a940(final int n, final qn_ qn_) {
        final dp_ a293 = qn_.a293(n - 23901);
        if (null == a293) {
            return true;
        }
        final od_ a294 = a293.a151((byte)(-93));
        if (n != 23786) {
            this.registerAgeInput = null;
        }
        return pd_._J != a294 && ub_._s != a294 && a294 != hd_._g;
    }
    
    static {
        RegisterScreen._P = new int[] { 197379, 768, 771, 197376, 196611 };
    }
}
