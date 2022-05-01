final class jj_
{
	//original name: _b
    static Graphic stat_defence;
    static String _d;
    static int _c;
    //original name: _a
    static String razor_construct;
    
    public static void a423() {
        jj_.razor_construct = null;
        jj_._d = null;
        jj_.stat_defence = null;
    }
    
    static final void b423() {
        eg_.a537(rl_._h);
    }
    
    static final void a669(final int n, int j, int i, int n2, int n3) {
        if (gf_._j > j) {
            n3 -= gf_._j - j;
            j = gf_._j;
        }
        if (gf_._f > i) {
            n2 -= gf_._f - i;
            i = gf_._f;
        }
        if (gf_._h < j + n3) {
            n3 = -j + gf_._h;
        }
        if (n2 + i > gf_._e) {
            n2 = gf_._e - i;
        }
        if (n3 <= 0 || 0 >= n2) {
            return;
        }
        int n4 = j + i * gf_._i;
        final int n5 = -n3 + gf_._i;
        int n6;
        int n7;
        int n8;
        for (i = -n2; i < 0; ++i) {
            for (j = -n3; 0 > j; ++j) {
                n6 = gf_._b[n4];
                if ((0xFF00 & n6) >> 8 > n && (0xFF & n6 >> 16) <= (0xFF & n6 >> 8)) {
                    n7 = ((n6 & 0xFF0000) >> 15) - 60;
                    if (n7 > 255) {
                        n7 = 255;
                    }
                    n8 = (n6 & 0xFF00);
                    gf_._b[n4] = mp_.or(0x1F & n6 >> 3, mp_.or(n7 << 16, 0xFF00 & (n8 >> 1) - (n8 >> 5)));
                }
                ++n4;
            }
            n4 += n5;
        }
    }
    
    static {
        jj_._d = null;
        jj_.razor_construct = "Razor Construct";
    }
}
