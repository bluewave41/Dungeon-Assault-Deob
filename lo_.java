abstract class lo_
{
    static byte[][][] _c;
    int _a;
    int _h;
    int _e;
    int _b;
    int _d;
    int _g;
    static long _f;
    
    static final sm_[] a413(final wj_ wj_, final byte b) {
        if (wj_.j080(76, 8) > 0) {
            return null;
        }
        final int i = wj_.j080(-80, 12);
        final sm_[] array = new sm_[i];
        if (b >= -109) {
            a789(-66, true, null, -109, 2);
        }
        for (int n = 0; i > n; ++n) {
            if (!jl_.a234(wj_)) {
                array[n] = array[wj_.j080(-117, hh_.a080(1, n - 1))];
            }
            else {
                final sm_ sm_ = new sm_();
                wj_.j080(74, 24);
                wj_.j080(110, 24);
                sm_._d = wj_.j080(-66, 24);
                wj_.j080(-79, 9);
                wj_.j080(-75, 12);
                wj_.j080(83, 12);
                wj_.j080(-66, 12);
                array[n] = sm_;
            }
        }
        return array;
    }
    
    abstract void a093(final int p0, final int p1);
    
    static final void a352(int n, int n2, final int n3, int n4, final int n5, int n6, final int[] array, final int n7, int n8, final int n9) {
        while (0 <= --n) {
            final int n10 = n2;
            array[n10] = ((array[n10] & 0xFEFEFE) >> 1) - (-nb_.and(65280, n4 >> 9) + (-nb_.and(16711680, n6 >> 1) - nb_.and(n8 >> 17, 255)));
            ++n2;
            n8 += n3;
            n6 += n7;
            n4 += n9;
        }
        if (n5 != 0) {
            a352(-38, 98, 90, 94, -49, -128, null, -44, -86, 68);
        }
    }
    
    public static void a150() {
        lo_._c = null;
    }
    
    static final void a789(final int n, final boolean b, final vh_ vh_, final int n2, final int n3) {
        ek_._b.a188(n2, vh_, n3, !b);
        if (n < 65) {
            a413(null, (byte)71);
        }
    }
    
    abstract void a326(final int p0, final int p1, final int p2);
}
