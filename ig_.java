final class ig_
{
    static String[] _b;
    static int _a;
    
    static final void a430(final boolean b) {
        im_._b.a877(b);
    }
    
    static final void a722(final String[] array) {
        int a148 = -1;
        for (int n = 0; array.length > n; ++n) {
            final String s = array[n];
            if (-1 != a148) {
                array[n] = jk_.replacePlaceholders(new String[] { Integer.toString(a148, 16) }, "<col=<%0>>") + s;
            }
            final int a149 = en_.a031(s, "<col=");
            final int a150 = en_.a031(s, "</col>");
            if (a149 <= a150) {
                if (a150 != -1) {
                    a148 = -1;
                }
            }
            else {
                final int index = s.indexOf(62, a149);
                if (index != -1) {
                    a148 = hl_.a148(s.substring(5 + a149, index), 16);
                }
            }
        }
    }
    
    static final void c150() {
        if (oo_._d <= 32) {
            sf_.d093(0);
        }
        else {
            int n = oo_._d % 32;
            if (n == 0) {
                n = 32;
            }
            sf_.d093(-n + oo_._d);
        }
    }
    
    public static void a150() {
        ig_._b = null;
    }
    
    static final int b137() {
        if (null != dd_._E && dd_._E.isActive) {
            return (of_._l + 20 - 452) * dd_._E._F / dd_._E.renownDividedBy10;
        }
        return 0;
    }
}
