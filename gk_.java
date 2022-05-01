final class gk_ extends ii_ implements mg_, vg_
{
	//original name: _O
    static String back;
    //original name: _M
    private GUIButton okButton;
    gi_ _P;
    //original name: _N
    private GUIButton cancelButton;
    //original name: _K
    static String text_profile;
    private GUIInput _R;
    static boolean[] _Q;
    static gn_ _L;
    
    private final boolean a056(final qn_ qn_, final int n) {
        final dp_ a293 = qn_.a293(-84);
        return a293 == null || c_._d == a293.a151((byte)(-95));
    }
    
    @Override
    public final void a150(final int n) {
        ((kh_)this._R.a293(-98)).e487(true);
        if (n < 121) {
            this.okButton = null;
        }
    }
    
    static final int a080(int n) {
        n = (--n | n >>> 1);
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
    }
    
    @Override
    final void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        super.a319(n, n2, lm_, b);
        this.okButton._B = this.i154(124);
    }
    
    @Override
    final boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (b < 55) {
            a366(62, (byte)25);
        }
        if (super.a401(lm_, c, n, (byte)98)) {
            return true;
        }
        if (98 != n) {
            return n == 99 && this.a489((byte)(-5), lm_);
        }
        return this.a059(lm_);
    }
    
    static final me_ a149(final String s) {
        if (im_._b.getH()) {
            if (!s.equals(im_._b.c738())) {
                im_._b = oh_.a321(s);
            }
        }
        return im_._b;
    }
    
    //original signature: private final int a063(final String s, final int n, final lm_ lm_, final String s2, final int n2, final int n3) {
    private final int a063(final lm_ lm_, final int n3) {
        return this.a670(lm_, n3);
    }
    
    //original signature: static final Room a775(final ec_ ec_) {
    static final Room createRoom(final ec_ buffer) {
    	final Room room = new Room(buffer.readByte());
        final int c474 = buffer.readByte();
        room.attack1 = c474;
        room.attack2 = c474;
        
        final int c475 = buffer.readByte();
        room.defence1 = c475;
        room.defence2 = c475;
        
        final int c476 = buffer.readByte();
        room.snare1 = c476;
        room.snare2 = c476;
        

        final int c477 = buffer.readByte();
        room.detect1 = c477;
        room.detect2 = c477;
        
        return room;
    }
    
    @Override
    public final void a407(final byte b, final String s) {
        if (b >= -26) {
            this._R = null;
        }
        this._R.capInputLength(s, false);
    }
    
    public static void b487(final boolean b) {
        gk_._L = null;
        if (b) {
            gk_.text_profile = null;
        }
        gk_._Q = null;
        gk_.text_profile = null;
        gk_.back = null;
    }
    
    //original signature: private final int a670(final String s, final int n, final int n2, final String s2, final lm_ lm_, final int n3, final int n4) {
    private final int a670(final lm_ lm_, final int n4) {
        final dg_ dg_ = new dg_(20, n4, 290, 25, lm_, false, 120, 3, lp_._C, 16777215, wf_.create_displayname);
        this.b485(dg_);
        final tn_ tn_ = new tn_(((qn_)lm_).a293(-120), an_.create_displayname_hint, 126, n4 + dg_.componentHeight, 195, 35);
        ((ii_)(tn_._n = this)).b485((lm_)tn_);
        return tn_.componentHeight + dg_.componentHeight;
    }
    
    public gk_() {
        super(0, 0, 496, 0, null);
        this._R = new GUIInput("", null, 12);
        final lm_ lm_ = new lm_(vo_.login_no_displayname, new hh_(ta_._e, 0, 0, 0, 0, 16777215, -1, 3, 0, lp_._C._H, -1, Integer.MAX_VALUE, true), null);
        this.okButton = new GUIButton(m_.ok, null);
        this.cancelButton = new GUIButton(dc_.cancel, null);
        this._R.tooltip = un_.create_displayname_tooltip;
        this._R.a981(new kh_(this._R));
        this.okButton._B = false;
        this.okButton._o = new na_();
        this.cancelButton._o = new oa_();
        this._R._o = new mc_();
        int n = 20;
        final int n2 = 4;
        final int n3 = 200;
        lm_.b050(0, 270, n, 20, 50);
        this.b485(lm_);
        n += 50;
        final int n4 = n + (5 + this.a063(this._R, n));
        this.okButton.b050(0, n3, n4, 496 - n3 >> 1, 40);
        this.cancelButton.b050(0, 60, n4 + 15, 3 + n2, 40);
        this.cancelButton._n = this;
        ((ii_)(this.okButton._n = this)).b485((lm_)this.okButton);
        this.b485(this.cancelButton);
        (this._P = new gi_(this)).b050(0, super.componentWidth - this._R.xAxisOffset + (-this._R.componentWidth - 60), 20, 60 + this._R.componentWidth + this._R.xAxisOffset, 150);
        this.b485(this._P);
        this.b050(0, 496, 0, 0, 55 + (n4 + n2));
    }
    
    private final void f423(final byte b) {
        if (b != -43) {
            return;
        }
        if (this.i154(126)) {
            WarningMessage.a984(this._R.buttonText);
        }
    }
    
    static final void a560(final int n, final Raider h_, final int n2, final int n3) {
        sd_.a294(n, gd_.stat_attack, n2, h_.attack, n3);
        sd_.a294(40 + n, jj_.stat_defence, n2, h_.defence, n3);
        sd_.a294(n, wl_.stat_dodge, n2, h_.dodge, n3 + 18);
        sd_.a294(n + 40, WarningMessage.stat_sneak, n2, h_.sneak, n3 + 18);
    }
    
    static final void a366(final int n, final byte b) {
        try {
            ee_.a008("resizing", m_.getApplet(), b + 15643, new Object[] { new Integer(n) });
        }
        catch (Throwable t) {}
        if (b != 4) {
            a149(null);
        }
    }
    
    @Override
    public final void a475(final GUIButton ck_, final byte b, final int n, final int n2, final int n3) {
        if (b != 98) {
            this.a319(-18, 59, null, false);
        }
        if (ck_ != this.cancelButton) {
            if (ck_ == this.okButton) {
                this.f423((byte)(-43));
            }
        }
        else {
            rc_.b150(b ^ 0x4);
        }
    }
    
    static final boolean a398(final String s, final String s2) {
        final String a439 = sh_.reverseString(s);
        return -1 != s2.indexOf(s) || s2.indexOf(a439) != -1 || s2.startsWith(s) || s2.startsWith(a439) || s2.endsWith(s) || s2.endsWith(a439);
    }
    
    private final boolean i154(final int n) {
        return this.a056(this._R, -70) && n > 123;
    }
    
    static {
        gk_.back = "Back";
        gk_.text_profile = "PROFILE";
    }
}
