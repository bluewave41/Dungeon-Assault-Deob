final class re_
{
    static int _h;
    private static int[] _a;
    static int[] _f;
    private static int[] _g;
    static int[] _e;
    private static int[] _c;
    static int _d;
    static int _i;
    static int _b;
    
    public static void c797() {
        re_._e = null;
        re_._g = null;
        re_._a = null;
        re_._f = null;
        re_._c = null;
    }
    
    static final void b797() {
        a115(gf_._j, gf_._f, gf_._h, gf_._e);
    }
    
    private static final void a797() {
        re_._d = re_._b / 2;
        re_._h = re_._i / 2;
    }
    
    private static final void a115(final int n, final int n2, final int n3, final int n4) {
        re_._b = n3 - n;
        re_._i = n4 - n2;
        a797();
        if (re_._e.length < re_._i) {
            re_._e = new int[gk_.a080(re_._i)];
        }
        int n5 = n2 * gf_._i + n;
        for (int i = 0; i < re_._i; ++i) {
            re_._e[i] = n5;
            n5 += gf_._i;
        }
    }
    
    static {
        re_._a = new int[2048];
        re_._f = new int[2048];
        re_._e = new int[1024];
        re_._c = new int[2048];
        re_._g = new int[512];
        for (int i = 1; i < 512; ++i) {
            re_._g[i] = 32768 / i;
        }
        for (int j = 1; j < 2048; ++j) {
            re_._a[j] = 65536 / j;
        }
        for (int k = 0; k < 2048; ++k) {
            re_._f[k] = (int)(65536.0 * Math.sin(k * 0.0030679615));
            re_._c[k] = (int)(65536.0 * Math.cos(k * 0.0030679615));
        }
    }
}
