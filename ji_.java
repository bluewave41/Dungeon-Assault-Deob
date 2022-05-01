final class ji_ extends da_
{
    static int[] _F;
    //original name: _G
    static Graphic scrollbar_slider;
    //original name: _H
    static String text_acv_hunter;
    private md_ _I;
    
    final void a336(final lm_ lm_, final int n) {
        if (!(lm_ instanceof rf_)) {
            throw new IllegalArgumentException();
        }
        if (n != -1) {
            return;
        }
        final rf_ rf_ = (rf_)lm_;
        this._I.b865(rf_, false);
        rf_._T = true;
        rf_.a336(34, this);
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        if (super._o != null) {
            super._o.a623((byte)34, this, n2, n4, true);
        }
        final dj_ dj_ = new dj_(this._I);
        if (n3 != 0) {
            this._I = null;
        }
        for (lm_ lm_ = (lm_)dj_.b024(); null != lm_; lm_ = (lm_)dj_.d024()) {
            lm_.a115(n, n2 + super.xAxisOffset, 0, n4 + super.yAxisOffset);
        }
    }
    
    //original signature: static final int a760(final int n, final boolean b, final int n2) {
    static final int getRandom(final int n, final int n2) {
        return uj_.getRandom(ld_.random, 1 - n2 + n) + n2;
    }
    
    static final boolean a896(final String s) {
        try {
            if (!qg_.lowercaseOsName.startsWith("win")) {
                return false;
            }
            if (!s.startsWith("http://") && !s.startsWith("https://")) {
                return false;
            }
            final String s2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (int n = 0; s.length() > n; ++n) {
                if (-1 == s2.indexOf(s.charAt(n))) {
                    return false;
                }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + s + "\"");
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    //original signature: final void b487(final boolean b) {
    final void b487() {
        final dj_ dj_ = new dj_(this._I);
        for (rf_ rf_ = (rf_)dj_.a024(); null != rf_; rf_ = (rf_)dj_.c024()) {
            if (rf_.f427((byte)(-90))) {
                rf_.a487(false);
            }
        }
        super._D = this.i149(32);
    }
    
    public ji_() {
        super(0, 0, 640, 480, null, null);
        this._I = new md_();
    }
    
    //original signature: final void j150(final int n) {
    final void j150() {
        final dj_ dj_ = new dj_(this._I);
        for (rf_ rf_ = (rf_)dj_.a024(); null != rf_; rf_ = (rf_)dj_.c024()) {
            if (rf_.i154(462)) {
                rf_.a487(false);
            }
        }
    }
    
    @Override
    final lm_ returnNull(final int n) {
        final dj_ dj_ = new dj_(this._I);
        for (rf_ rf_ = (rf_)dj_.a024(); null != rf_; rf_ = (rf_)dj_.c024()) {
            if (rf_._T) {
                return rf_.returnNull();
            }
        }
        return null;
    }
    
    final void h150(final int n) {
        if (n != 1) {
            ji_._F = null;
        }
        final dj_ dj_ = new dj_(this._I);
        for (rf_ rf_ = (rf_)dj_.a024(); null != rf_; rf_ = (rf_)dj_.c024()) {
            rf_._T = false;
        }
        super._D = null;
    }
    
    public static void f423(final byte b) {
        ji_.text_acv_hunter = null;
        ji_.scrollbar_slider = null;
        if (b != -98) {
            f423((byte)(-89));
        }
        ji_._F = null;
    }
    
    final rf_ i149(final int n) {
        if (n != 32) {
            return null;
        }
        final dj_ dj_ = new dj_(this._I);
        for (rf_ rf_ = (rf_)dj_.a024(); null != rf_; rf_ = (rf_)dj_.c024()) {
            if (rf_._T) {
                return rf_;
            }
        }
        return null;
    }
    
    static {
        ji_._F = new int[32];
        for (int n = 0; 32 > n; ++n) {
            ji_._F[n] = 65793 * (n * 1 + 32);
        }
        ji_.text_acv_hunter = "You have collected <%0> consecutive bounties";
    }
}
