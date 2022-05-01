final class fe_ extends l_
{
    private boolean _q;
    private String _l;
    private int _j;
    static md_ _k;
    private int _m;
    private int _p;
    private int _h;
    private se_ _i;
    static int[] _g;
    //original name: _n
    static String[] ability_spy_brief;
    private int _o;
    
    final void a950(final int n, final byte b, final String l, final se_ i, final int n2) {
        if (l == null) {
            super._e = null;
            return;
        }
        if (i == this._i && this._q && 2 == this._h && this._l != null && this._l.equals(l)) {
            return;
        }
        this._l = l;
        this._q = true;
        this._i = i;
        this._h = 2;
        final tg_ a392 = this.a392(l, n2, i, 0);
        a392._k[0] = n - i.b926(l);
        a392._k[l.length()] = n;
        bf_.a966(l, a392, 0, i);
    }
    
    final void a777(final String l, final int n, final se_ i, final int n2, final int n3) {
        if (null == l) {
            super._e = null;
            return;
        }
        if (i == this._i && this._q && 0 == this._h && this._l != null && this._l.equals(l)) {
            return;
        }
        this._h = 0;
        this._i = i;
        this._q = true;
        this._l = l;
        if (n > -17) {
            return;
        }
        final tg_ a392 = this.a392(l, n3, i, 0);
        a392._k[0] = n2;
        a392._k[l.length()] = n2 + i.b926(l);
        bf_.a966(l, a392, 0, i);
    }
    
    public static void b423(final byte b) {
        if (b > -33) {
            b423((byte)(-23));
        }
        fe_.ability_spy_brief = null;
        fe_._g = null;
        fe_._k = null;
    }
    
    private final tg_ a392(final String s, final int n, final se_ se_, final int n2) {
        if (n2 != 0) {
            return null;
        }
        final tg_ tg_ = new tg_(n - se_._H, se_._E + n, s.length());
        super._e = new tg_[] { tg_ };
        return tg_;
    }
    
    final void a972(final int n, final String s, final se_ i, final byte b, final int n2) {
        if (s == null) {
            super._e = null;
            return;
        }
        if (i == this._i && this._q && 1 == this._h && null != this._l && this._l.equals(s)) {
            return;
        }
        this._h = 1;
        this._q = true;
        this._i = i;
        final tg_ a392 = this.a392(s, n, i, 0);
        final int b2 = i.b926(s);
        a392._k[0] = n2 - (b2 >> 1);
        a392._k[s.length()] = n2 + (b2 >> 1);
        bf_.a966(s, a392, 0, i);
    }
    
    final void a804(final String l, final int n, final int p8, final int m, final int h, final int j, int r, final se_ i) {
        if (0 == r) {
            r = i._R;
        }
        if (null == l) {
            super._e = null;
            return;
        }
        if (i == this._i && !this._q && h == this._h && this._p == p8 && this._o == r && m == this._m && this._j == j && null != this._l && this._l.equals(l)) {
            return;
        }
        this._p = p8;
        this._h = h;
        this._q = false;
        this._m = m;
        this._j = j;
        this._o = r;
        this._l = l;
        this._i = i;
        final String[] array = new String[i.c913(l, j) + 1];
        final int max = Math.max(1, i.a899(l, new int[] { j }, array));
        if (this._p == 3 && max == 1) {
            this._p = 1;
        }
        int h2;
        if (this._p != n) {
            if (1 != this._p) {
                if (2 == this._p) {
                    h2 = -i._E + this._m - max * this._o;
                }
                else {
                    int n2 = (this._m - this._o * max) / (max + 1);
                    if (0 > n2) {
                        n2 = 0;
                    }
                    this._o += n2;
                    h2 = i._H + n2;
                }
            }
            else {
                h2 = (-(this._o * max) + this._m >> 1) + i._H;
            }
        }
        else {
            h2 = i._H;
        }
        super._e = new tg_[max];
        for (int k = 0; k < max; ++k) {
            final String s = array[k];
            final tg_ tg_ = new tg_(-i._H + h2, h2 + i._E, (null != s) ? s.length() : 0);
            tg_._k[0] = 0;
            if (null != s) {
                tg_._k[s.length()] = i.b926(s);
                bf_.a966(s, tg_, (3 == h) ? this.a655(s, n + 0, i.b926(s), j) : 0, i);
            }
            h2 += r;
            super._e[k] = tg_;
        }
    }
    
    public fe_() {
    }
    
    static {
        fe_._k = new md_();
        fe_.ability_spy_brief = new String[] { "Reconnoitre", "Reveal two rooms at start of game. (Single use)" };
    }
}
