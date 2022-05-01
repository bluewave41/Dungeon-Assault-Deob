import java.applet.*;

final class sl_
{
    static int _d;
    static Graphic[] _c;
    //original name: _a
    static String logging_in;
    static rh_ _b;
    
    public static void a150() {
        sl_.logging_in = null;
        sl_._b = null;
        sl_._c = null;
    }
    
    static final void a812(final Applet applet) {
        ne_.roman20 = ah_.a770(gh_._c, 200, "", "roman20", uc_._I);
        la_.roman12 = ah_.a770(gh_._c, 200, "", "roman12", uc_._I);
        f_._a = oh_.a825(uc_._I, "basic", "unachieved");
        PlayerInformation._o = oh_.a825(uc_._I, "basic", "orbcoin");
        nj_.a812(gh_._c, uc_._I);
        cp_.a406(applet);
    }
    
    static final boolean b154(final int n) {
        if (n != 15000) {
            b154(126);
        }
        rm_._P = true;
        ab_._a = kd_.getTime() + 15000L;
        return 11 == kh_._n;
    }
    
    static {
        sl_.logging_in = "Logging in...";
    }
}
