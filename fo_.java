final class fo_
{
    static int[] _c;
    static nn_ _d;
    static int _b;
    static Graphic _a;
    
    public static void a423() {
        fo_._c = null;
        fo_._d = null;
        fo_._a = null;
    }
    
    static final Graphic[] a033(final int n) {
        final Graphic[] array = new Graphic[dk_._d];
        for (int i = n; i < dk_._d; ++i) {
            final int n2 = jn_._k[i] * jc_._f[i];
            final byte[] array2 = ub_._q[i];
            final int[] array3 = new int[n2];
            for (int j = 0; j < n2; ++j) {
                array3[j] = uo_._b[nb_.and(255, array2[j])];
            }
            array[i] = new Graphic(ce_._x, tb_._i, hg_._t[i], fe_._g[i], jc_._f[i], jn_._k[i], array3);
        }
        sb_.a150();
        return array;
    }
    
    static final void a093(final int n) {
        int n2;
        int n3;
        if (n < 42) {
            n2 = 7 * (n / 6) + n % 6;
            n3 = 1 + n2;
        }
        else {
            n2 = -42 + n;
            n3 = n2 + 7;
        }
        final int n4 = ue_._j[n2];
        final int n5 = ue_._j[n3];
        if (n5 != n4) {
            bo_._Jb.a093(n);
            lm_.a789(n5, n4);
        }
    }
    
    static {
        fo_._c = GUICheckbox.b330(16777215, 8421504, 64);
    }
}
