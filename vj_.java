final class vj_
{
    private int[] _a;
    static String _c;
    private int _e;
    //original name: _i
    static String text_title_requirements_age_x;
    private int[] _g;
    static int[] _d;
    private int _h;
    private int _j;
    private int _b;
    private int _f;
    
    static final bo_ a060(final String s, final int n) {
        if (lh_._p != null) {
            if (n < 41) {
                a060(null, -65);
            }
            String a715 = jm_.lowerCaseReplaceSpaceWithUnderscore(s);
            if (null == a715) {
                a715 = s;
            }
            for (bo_ bo_ = (bo_)lh_._p.a312((byte)26, a715.hashCode()); bo_ != null; bo_ = (bo_)lh_._p.c786((byte)72)) {
                String s2 = jm_.lowerCaseReplaceSpaceWithUnderscore(bo_._Hb);
                if (null == s2) {
                    s2 = bo_._Hb;
                }
                if (s2.equals(a715)) {
                    return bo_;
                }
            }
            return null;
        }
        return null;
    }
    
    public static void a150() {
        vj_.text_title_requirements_age_x = null;
        vj_._c = null;
        vj_._d = null;
    }
    
    final void a540(final boolean b, int n) {
        if (!b) {
            return;
        }
        n *= 9;
        final int[] b2 = gf_._b;
        final int i = gf_._i;
        final int n2 = n + 9;
        int n3 = this._j + this._e * i;
        final int n4 = -this._b + i;
        int n5 = 0;
        for (int j = 0; j < this._f; ++j) {
            for (int k = 0; k < this._b; ++k) {
                final int n6 = this._a[n5];
                if (n < n6) {
                    if (n6 > n2) {
                        b2[n3] = this._g[n5];
                    }
                    else {
                        b2[n3] = ok_._X[-n + n6];
                    }
                }
                ++n5;
                ++n3;
            }
            n3 += n4;
        }
    }
    
    static final void a679(final int m, final int q) {
        vl_.mouseY = m;
        mm_.mouseX = q;
    }
    
    vj_(final int j, final int e, final int b, final int f, final int h) {
        this._f = f;
        this._h = h;
        this._j = j;
        this._e = e;
        this._b = b;
        this._g = new int[this._b * this._f];
        this._a = new int[this._f * this._b];
        final int a004 = uj_.getRandom(md_.random, 640);
        final int a5 = uj_.getRandom(md_.random, 640);
        final int a6 = uj_.getRandom(md_.random, 480);
        final int a7 = uj_.getRandom(md_.random, 480);
        final int[] array = new int[this._b];
        final int[] array2 = new int[this._f];
        for (int i = 1; i < this._b; ++i) {
            array[i] = (int)(30.0 * Math.sin(5.0 * (i * 3.141592653589793 / this._b)) + 10.0 * Math.cos(i * 3.141592653589793 / this._b * 9.0)) / 3;
        }
        for (int n = 1; this._f > n; ++n) {
            array2[n] = (int)(Math.sin(6.0 * (n * 3.141592653589793 / this._f)) * 40.0 + 15.0 * Math.cos(3.141592653589793 * n / this._f * 14.0)) / 3;
        }
        for (int k = 0; k < this._b; ++k) {
            for (int n2 = 0; this._f > n2; ++n2) {
                final int n3 = (int)Math.sqrt((-a004 + k) * (-a004 + k) + (-a6 + n2) * (-a6 + n2));
                final int n4 = (int)Math.sqrt((-a7 + n2) * (n2 - a7) + (-a5 + k) * (k - a5));
                final int n5 = (array[k] + ((n3 < n4) ? n3 : n4) + array2[n2]) * this._h * 9 / 640;
                this._g[k + this._b * n2] = gf_._b[k + this._j + (n2 + this._e) * gf_._i];
                this._a[this._b * n2 + k] = n5;
            }
        }
    }
    
    static {
        vj_._c = null;
        vj_.text_title_requirements_age_x = "You must have had your dungeon reset by an Orb of Mastery <%0> times to earn the title of <%1>.";
        vj_._d = new int[8192];
    }
}
