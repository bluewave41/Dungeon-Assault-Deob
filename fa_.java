final class fa_ extends ne_
{
	//original name: _k
    static String desc_bottomless_pit;
    //original name: _j
    static boolean unused;
    int _l;
    ne_ _o;
    //original name: _m
    static String achieved;
    static int _i;
    ni_ _n;
    
    static final int a666(final int n, final int n2) {
        if (-1 != ce_._p) {
            return (int)((-Math.cos(3.141592653589793 * (ce_._p / 50.0)) + 1.0) / 2.0 * (n2 - n)) + n;
        }
        return hc_._b;
    }
    
    static final Graphic a727(int n, int n2, int n3, int n4, Graphic cn_) {
        int w = 0;
        int a = 0;
        if (0 > n3) {
            w -= n3;
            n4 += n3;
            n3 = 0;
        }
        if (n < 0) {
            n2 += n;
            a -= n;
            n = 0;
        }
        if (gf_._i < n4 + n3) {
            n4 = gf_._i - n3;
        }
        if (n + n2 > gf_._c) {
            n2 = -n + gf_._c;
        }
        if (n4 >= 0 && 0 <= n2) {
            if (null == cn_ || cn_.imageWidth < n4 || cn_.imageHeight < n2) {
                cn_ = new Graphic(n4, n2);
            }
            final int n5 = -n4 + gf_._i;
            final int n6 = -n4 + cn_.imageWidth;
            int n7 = n3 + gf_._i * n;
            int n8 = -1;
            for (int n9 = -n2; 0 > n9; ++n9) {
                for (int n10 = -n4; 0 > n10; ++n10, ++n7) {
                    cn_._B[++n8] = gf_._b[n7];
                }
                n8 += n6;
                n7 += n5;
            }
            cn_._w = w;
            cn_._A = a;
            return cn_;
        }
        return null;
    }
    
    public static void a150() {
        fa_.desc_bottomless_pit = null;
        fa_.achieved = null;
    }
    
    final void a093(final int l, final int n) {
        this._l = l;
        this._n.h150(128 + oo_._d * l >> 8);
    }
    
    fa_(final ni_ n, final ne_ o) {
        this._n = n;
        this._l = n.i784();
        this._o = o;
        this._n.h150(oo_._d * this._l + 128 >> 8);
    }
    
    static {
        fa_.achieved = "Achieved";
        fa_.desc_bottomless_pit = "A vast pit occupies almost all of this room, except for a narrow ledge. There is no way to gauge its depth. A raider who falls here will continue falling for some time.<br><br>This trap will kill defeated raiders, even if they have abilities that would normally prevent death.";
    }
}
