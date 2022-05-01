final class qm_ extends ip_
{
    static md_ _q;
    //original name: _p
    static String tip_spectre;
    //original name: _m
    static Graphic piece_bat;
    //original name: _o
    static long time;
    //original name: _n
    static AmbientAudioTrack da_gold_stealing;
    static u_[] _r;
    
    @Override
    final String a439(final byte b, final String s) {
        if (b < 44) {
            return null;
        }
        if (this.a212(s, 52) != pd_._J) {
            return sh_.create_emailvalid;
        }
        return uj_.create_alert_invalidemail;
    }
    
    static final boolean a331(final int n, final char c) {
        if (n != 57) {
            a331(-9, '\uffc5');
        }
        return '0' <= c && c <= '9';
    }
    
    public static void d487() {
        qm_._q = null;
        qm_.piece_bat = null;
        qm_._r = null;
        qm_.tip_spectre = null;
        qm_.da_gold_stealing = null;
    }
    
    @Override
    final od_ a212(final String s, final int n) {
        if (null == kc_.a263(s, true)) {
            return c_._d;
        }
        return pd_._J;
    }
    
    qm_(final rm_ rm_) {
        super(rm_);
    }
    
    //original signature: static final int a581(final int n, final int n2, final boolean b, final String s, final String s2, final int n3, final String s3) {
    static final int a581(final int affId, final int n2, final boolean b, final String password, final String username, final String s3) {
        return op_.a489(new cd_(username), affId, n2, new cd_(s3), password, -58, b);
    }
    
    static {
        qm_.tip_spectre = "<col=FF0000>Attack -2</col>";
        qm_._q = new md_();
    }
}
