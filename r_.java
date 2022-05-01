final class r_
{
    static int _c;
    static int[] _b;
    //original name: _a
    static String text_exit;
    
    static final boolean a254(final boolean b, final int n, final int n2) {
        if (!b) {
            if (ci_._n[n] < ci_._n[n2]) {
                return true;
            }
            if (ci_._n[n] > ci_._n[n2]) {
                return false;
            }
            if (i_._t[n] < i_._t[n2]) {
                return true;
            }
            if (i_._t[n] > i_._t[n2]) {
                return false;
            }
        }
        else {
            if (i_._t[n] < i_._t[n2]) {
                return true;
            }
            if (i_._t[n] > i_._t[n2]) {
                return false;
            }
            if (ci_._n[n] < ci_._n[n2]) {
                return true;
            }
            if (ci_._n[n2] < ci_._n[n]) {
                return false;
            }
        }
        final int n3 = tc_._w[n] + mf_._d[n] + wa_._m[n];
        final int n4 = mf_._d[n2] - (-wa_._m[n2] - tc_._w[n2]);
        return n4 > n3 || (n3 <= n4 && n < n2);
    }
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    static final void a556(final int n) {
        lm_._k = (n & 0x36) >> 4;
        mp_._d = (0xC & n) >> 2;
        if (2 < lm_._k) {
            lm_._k = 2;
        }
        uk_._c = (n & 0x3);
        if (2 < mp_._d) {
            mp_._d = 2;
        }
        if (2 < uk_._c) {
            uk_._c = 2;
        }
    }
    
    public static void a150() {
        r_.text_exit = null;
        r_._b = null;
    }
    
    static {
        r_._c = 4;
        r_.text_exit = "EXIT";
    }
}
