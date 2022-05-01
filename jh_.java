final class jh_
{
    static Graphic _l;
    static int[] _d;
    static int[] _f;
    private static int[] _j;
    private static int _b;
    private static int[][] _e;
    private static int[] _c;
    private static int[][] _h;
    private static int[] _g;
    private static int[] _a;
    private static int[] _i;
    private static int[] _k;
    
    public static void a797() {
        jh_._l = null;
        jh_._d = null;
        jh_._f = null;
        jh_._e = null;
        jh_._h = null;
        jh_._j = null;
        jh_._c = null;
        jh_._i = null;
        jh_._a = null;
        jh_._g = null;
        jh_._k = null;
    }
    
    static final void b797() {
        --jh_._b;
        gf_.a397(jh_._e[jh_._b], jh_._g[jh_._b], jh_._k[jh_._b]);
        gf_._j = jh_._j[jh_._b];
        gf_._h = jh_._i[jh_._b];
        gf_._f = jh_._c[jh_._b];
        gf_._e = jh_._a[jh_._b];
        jh_._f = jh_._h[jh_._b];
        jh_._l._B = jh_._h[jh_._b];
        jh_._l.imageWidth = jh_._g[jh_._b];
        jh_._l.imageHeight = jh_._k[jh_._b];
    }
    
    static final void a276(final ph_ ph_) {
        c797();
        b276(ph_);
    }
    
    private static final void b276(final ph_ ph_) {
        a839(ph_._a, ph_._c);
    }
    
    static final void c797() {
        jh_._e[jh_._b] = gf_._b;
        jh_._h[jh_._b] = jh_._f;
        jh_._j[jh_._b] = gf_._j;
        jh_._i[jh_._b] = gf_._h;
        jh_._c[jh_._b] = gf_._f;
        jh_._a[jh_._b] = gf_._e;
        jh_._g[jh_._b] = gf_._i;
        jh_._k[jh_._b] = gf_._c;
        ++jh_._b;
    }
    
    static final void a303(final Graphic cn_) {
        c797();
        cn_.e797();
    }
    
    private static final void a839(final Graphic cn_, final int[] array) {
        cn_.e797();
        jh_._f = array;
        jh_._l._B = array;
        jh_._l.imageWidth = cn_.imageWidth;
        jh_._l.imageHeight = cn_.imageHeight;
    }
    
    static {
        jh_._l = new Graphic(640, 480);
        jh_._d = jh_._l._B;
        jh_._f = jh_._d;
        jh_._j = new int[4];
        jh_._b = 0;
        jh_._a = new int[4];
        jh_._i = new int[4];
        jh_._c = new int[4];
        jh_._h = new int[4][];
        jh_._g = new int[4];
        jh_._e = new int[4][];
        jh_._k = new int[4];
    }
}
