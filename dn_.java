final class dn_ extends ii_ implements jo_, vg_
{
	//original name: _N
    static String[] ability_fireimmunity_brief;
    private boolean _X;
    //original name: _P
    private boolean showCreateAccountButton;
    private GUIButton _K;
    //original name: _T
    static String text_members_only;
    //original name: _M
    private boolean showJustPlayButton;
    //original name: _W
    static String goblin_scout;
    private rm_ _O;
    //original name: _Q
    static long instanceId;
    //original name: _L
    static String text_advance_coloured;
    private GUIButton _U;
    //original name: _S
    private String title;
    //original name: _V
    private GUIButton createAnAccountButton;
    private rm_ _R;
    
    final void i150(final int n) {
        this._O.p150(72);
        this._R.p150(50);
        if (n != 22377) {
            b487(true);
        }
    }
    
    //original signature: final void a984(final int n, final String s) {
    final void a984(final String password) {
        this._O.capInputLength(password, false);
        this._R.p150(108);
    }
    
    @Override
    public final void a475(final GUIButton ck_, final byte b, final int n, final int n2, final int n3) {
        if (b != 98) {
            return;
        }
        if (this._U == ck_) {
            this.j150(-24327);
        }
        else if (this.createAnAccountButton == ck_) {
            nh_.c487();
        }
        else if (this._K == ck_) {
            if (!this._X) {
                if (this.showJustPlayButton) {
                    li_.c150(b + 218);
                }
                else {
                    ue_.a150(b - 178);
                }
            }
            else {
                wk_.a150();
            }
        }
    }
    
    //original signature: final String a738(final int n) {
    final String getButtonText() {
        if (this._O.buttonText != null) {
            return this._O.buttonText;
        }
        return "";
    }
    
    @Override
    final boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (b < 55) {
            this.getButtonText();
        }
        if (super.a401(lm_, c, n, (byte)61)) {
            return true;
        }
        if (n != 98) {
            return 99 == n && this.a489((byte)(-5), lm_);
        }
        return this.a059(lm_);
    }
    
    @Override
    public final void a157(final rm_ rm_, final byte b) {
        if (rm_ == this._O) {
            this._R.a336(34, this);
        }
        if (this._R == rm_) {
            this.j150(-24327);
        }
        if (b >= -117) {
            this._O = null;
        }
    }
    
    static final void b487(final boolean b) {
        if (!tl_._l) {
            throw new IllegalStateException();
        }
        oj_._b = true;
        t_.a540(b, 0);
        kh_._n = 0;
    }
    
    //original signature: static final byte[] a044(final Object o, final boolean b, final byte b2) {
    static final byte[] a044(final Object o, final boolean b) {
        if (o == null) {
            return null;
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            if (b) {
                return gg_.a553(array);
            }
            return array;
        }
        else {
            if (o instanceof un_) {
                return ((un_)o).b334((byte)60);
            }
            throw new IllegalArgumentException();
        }
    }
    
    private final void j150(final int n) {
        if (n != -24327) {
            return;
        }
        /*Since the inputs don't work properly currently this is being commented out.*/
        /*if (!n_.a427()) { //check if both username and password are set
            if (this._O._w.length() <= 0) {
                return;
            }
            if (this._R._w.length() <= 0) {
                return;
            }
        }*/
        //username password
        GUIButton.a018(this._R.buttonText, this._O.buttonText);
    }
    
    public static void f423() {
        dn_.text_advance_coloured = null;
        dn_.goblin_scout = null;
        dn_.ability_fireimmunity_brief = null;
        dn_.text_members_only = null;
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        if (this.title != null) {
            lp_._C.a385(this.title, 20 + super.xAxisOffset + n2, n4 + super.yAxisOffset + 15, super.componentWidth - 40, super.componentHeight, 16777215, -1, 1, 0, lp_._C._H);
        }
        if (null != this.createAnAccountButton) {
            gf_.b115(10 + n2, n4 + 134, super.componentWidth - 20, 4210752);
        }
        super.a115(n, n2, n3 ^ n3, n4);
    }
    
    //register screen?
    //original signature: dn_(final String s, final String s2, final boolean x, final boolean p5, final boolean m) {
    dn_(final String username, final String title, final boolean x, final boolean showCreateAccountButton,
    		final boolean showJustPlayButton) {
    	/* This sizes the login screen.
    	 * The first two parameters seem to do nothing (offsets somehow?)
    	 * The third and fourth are width and height
    	 */
        super(0, 0, 310, 190, null);
        this.showJustPlayButton = showJustPlayButton;
        this._X = x;
        this.title = title;
        this.showCreateAccountButton = showCreateAccountButton;
        if (this._X && (this.showCreateAccountButton || this.showJustPlayButton)) {
            throw new IllegalStateException();
        }
        
        this._O = new GUIInput(username, this, 100); //inputs?
        this._R = new GUIInput("", this, 20); //inputs?
        
        if (this._X) {
            this._U = new GUIButton(kn_.retry, null);
            this._K = new GUIButton(db_.quittowebsite, null);
            this._O._B = false;
        }
        else {
            this._U = new GUIButton(uo_.login, null);
            this._K = new GUIButton(this.showJustPlayButton ? kd_.justplay : gk_.back, null);
            if (this.showCreateAccountButton) {
                this.createAnAccountButton = new GUIButton(CacheIndex.create_createanaccount, this);
            }
        }
        this._O._o = new mc_();
        this._R._o = new ic_();
        final na_ o = new na_();
        
        this._U._o = o;
        if (null != this._K) {
            this._K._o = o;
        }
        if (this.createAnAccountButton != null) {
            this.createAnAccountButton._o = o;
        }
        this._O.tooltip = rj_.login_username_tooltip;
        if (this.createAnAccountButton != null) {
            this.createAnAccountButton.tooltip = hj_.login_create_tooltip;
        }
        if (this._X) {
            this._K.tooltip = gd_.warning_ifyouquit;
        }
        else if (!this.showJustPlayButton) {
            this._K._o = new oa_();
        }
        else {
            this._K.tooltip = oh_.login_justplay_tooltip;
            this._K._o = new oa_();
        }
        super.yAxisOffset = 15; //padding?
        final se_ c = lp_._C;
        if (this.title != null) {
            super.yAxisOffset += 5 + c.a490(this.title, super.componentWidth - 40, c._H);
        }
        String s3 = cp_.login_username_email;
        final ba_ a403 = gb_.a403(m_.getApplet());
        if (a403 != ba_._e) {
            if (gg_._c == a403) {
                s3 = hf_.login_username;
            }
        }
        else {
            s3 = me_.login_email;
        }
        final dg_ dg_;
        this.b485(dg_ = new dg_(10, super.yAxisOffset, super.componentWidth - 20, 25, this._O, false, 80, 3, c, 16777215, s3));
        super.yAxisOffset += dg_.componentHeight + 5;
        final dg_ dg_2;
        this.b485(dg_2 = new dg_(10, super.yAxisOffset, super.componentWidth - 20, 25, this._R, false, 80, 3, c, 16777215, fk_.create_password));
        this._U._n = this;
        super.yAxisOffset += dg_2.componentHeight + 5;
        if (null != this.createAnAccountButton) {
            this.createAnAccountButton._n = this;
        }
        if (this._K != null) {
            this._K._n = this;
        }
        if (this.createAnAccountButton == null) {
            this._U.b050(0, super.componentWidth - 16, super.yAxisOffset, 8, 30);
            super.yAxisOffset += 35;
        }
        else {
            this._U.b050(0, super.componentWidth - 95, super.yAxisOffset, 85, 30);
            super.yAxisOffset += 60;
        }
        if (null != this.createAnAccountButton) {
            this.createAnAccountButton.b050(0, super.componentWidth - 6 - 10, super.yAxisOffset, 8, 30);
            super.yAxisOffset += 35;
        }
        if (this._K != null) {
            if (this._X || this.showJustPlayButton) {
                this._K.b050(0, super.componentWidth - 6 - 10, super.yAxisOffset, 8, 30);
                super.yAxisOffset += 35;
            }
            else {
                this._K.b050(0, 40, super.yAxisOffset, 8, 20);
                super.yAxisOffset += 25;
            }
        }
        this.b050(0, super.componentWidth, 0, 0, super.yAxisOffset + 3);
        this.b485(this._U);
        if (null != this.createAnAccountButton) {
            this.b485(this.createAnAccountButton);
        }
        if (this._K != null) {
            this.b485(this._K);
        }
    }
    
    @Override
    public final void a430(final rm_ rm_, final int n) {
        if (n != 10000536) {
            this.a157(null, (byte)51);
        }
    }
    
    static {
        dn_.ability_fireimmunity_brief = new String[] { "Fire Immunity", "Immune to dragonfire." };
        dn_.goblin_scout = "Goblin Scout";
        dn_.text_members_only = "MEMBERS ONLY";
        dn_.text_advance_coloured = "<col=2E5D17>Advance</col>";
    }
}
