final class ve_
{
    int _b;
    static ad_ _e;
    int _f;
    static volatile boolean _a;
    int _d;
    //original name: _c
    static String pleaselogin_member;
    
    static final boolean a491() {
        return tl_._l || pb_.isMember <= 0;
    }
    
    private final void a115(final int b, final int d, final int n, final int f) {
        this._d = d;
        this._f = f;
        this._b = b;
        if (n < 72) {
            ve_._e = null;
        }
    }
    
    final void b487(final boolean b) {
        if (!b) {
            return;
        }
        while (((Math.abs(this._d) | Math.abs(this._f) | Math.abs(this._b)) & 0xFFFF0000) != 0x0) {
            this._f >>= 1;
            this._d >>= 1;
            this._b >>= 1;
        }
        int n = this.c474(false) >> 1;
        int n2 = 15;
        while (65536 <= n) {
            --n2;
            n >>= 1;
        }
        this._d = (this._d << n2) / n;
        this._f = (this._f << n2) / n;
        this._b = (this._b << n2) / n;
        final int c474 = this.c474(false);
        if (c474 < 64512 || 66560 < c474) {
            throw new RuntimeException();
        }
    }
    
    public static void a150(final int n) {
        ve_._e = null;
        if (n >= -92) {
            a150(42);
        }
        ve_.pleaselogin_member = null;
    }
    
    //original signature: static final String a382(final int i, long n, final int n2) {
    static final String localizeNumericString(final int i, long n, final int lang) {
        char c = ',';
        char c2 = '.';
        if (lang == 0) {
            c2 = ',';
            c = '.';
        }
        if (2 == lang) {
            c2 = ' ';
        }
        boolean b = false;
        if (n < 0L) {
            n = -n;
            b = true;
        }
        final StringBuilder sb = new StringBuilder(26);
        if (i > 0) {
            for (int n3 = 0; i > n3; ++n3) {
                final int n4 = (int)n;
                n /= 10L;
                sb.append((char)(-(10 * (int)n) + (n4 + 48)));
            }
            sb.append(c);
        }
        int n5 = 0;
        while (true) {
            final int n6 = (int)n;
            n /= 10L;
            sb.append((char)(48 - (-n6 + 10 * (int)n)));
            if (n == 0L) {
                break;
            }
            ++n5;
            if (0 != n5 % 3) {
                continue;
            }
            sb.append(c2);
        }
        if (b) {
            sb.append('-');
        }
        return sb.reverse().toString();
    }
    
    private final int c474(final boolean b) {
        if (b) {
            this.a115(56, -92, 125, -12);
        }
        final int n = (this._b >> 2) * (this._b >> 2) + (this._f >> 2) * (this._f >> 2) + (this._d >> 2) * (this._d >> 2);
        if (n < 0) {
            throw new RuntimeException();
        }
        return ug_.a527(!b, n) << 2;
    }
    
    ve_(final int n, final int n2, final int n3) {
        this.a115(n3, n, 124, n2);
    }
    
    static {
        ve_._e = new ad_(11, 2);
        ve_._a = false;
        ve_.pleaselogin_member = "Please log in as a subscribing member to access this feature.";
    }
}
