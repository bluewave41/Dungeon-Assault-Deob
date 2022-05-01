import java.applet.*;

final class gb_
{
    static int[] _e;
    private nh_ _d;
    static int _a;
    private nh_ _b;
    private eg_ _c;
    
    final nf_ a928(final int n, final int n2) {
        final nf_ nf_ = (nf_)this._c.a532(-70, n);
        if (nf_ != null) {
            return nf_;
        }
        byte[] array;
        if (n < 32768) {
            array = this._b.b337(1, n);
        }
        else {
            array = this._d.b337(1, n & 0x7FFF);
        }
        if (n2 != -19256) {
            return null;
        }
        final nf_ nf_2 = new nf_();
        if (null != array) {
            nf_2.a603(new ec_(array), n2 + 19255);
        }
        if (32768 <= n) {
            nf_2.d423((byte)(-74));
        }
        this._c.a577(true, nf_2, n);
        return nf_2;
    }
    
    //original signature: static final ba_ a403(final Applet applet, final int n) {
    static final ba_ a403(final Applet applet) {
        final String lastLoginMethod = en_.getLastLoginMethod("jagex-last-login-method", applet);
        if (lastLoginMethod == null) {
            return rl_._j;
        }
        final ba_[] b428 = jg_.b428();
        for (int i = 0; i < b428.length; ++i) {
            final ba_ ba_ = b428[i];
            if (ba_.a896(lastLoginMethod)) {
                return ba_;
            }
        }
        return rl_._j;
    }
    
    public static void a150() {
        gb_._e = null;
    }
    
    private gb_() throws Throwable {
        throw new Error();
    }
    
    static {
        gb_._e = new int[] { 10 };
    }
}
