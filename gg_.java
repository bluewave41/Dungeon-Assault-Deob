final class gg_
{
    static ba_ _c;
    static long _d;
    int _b;
    int _f;
    //original name: _e
    static String text_raider;
    static int[] _a;
    static int[] _g;
    
    //original signature: static final void a423(final byte b) {
    static final void activateRenownTableRaidButton() {
        k_.selectedRenownTableEntry = null;
        if (qc_._y >= 0) {
            if (qc_._y < ao_._o) {
                final int n = qc_._y - vd_._a;
                if (0 <= n && 10 > n && null != fb_.renownTableEntries[n]) {
                    if (!Animation.a213(fb_.renownTableEntries[n]._i)) {
                        k_.selectedRenownTableEntry = fb_.renownTableEntries[n]._i;
                    }
                }
            }
        }
        wf_.renownTableRaidButton.isActive = (k_.selectedRenownTableEntry != null);
    }
    
    public static void a150() {
        gg_.text_raider = null;
        gg_._c = null;
        gg_._a = null;
        gg_._g = null;
    }
    
    static final void a693(final String s, final String s2) {
        if (null != a_._n) {
            a_._n.j423((byte)51);
        }
        wo_._e = new dn_(s2, s, false, true, true);
        ta_._a.b340(1, wo_._e);
    }
    
    static final byte[] a553(final byte[] array) {
        final int length = array.length;
        final byte[] array2 = new byte[length];
        cj_.a278(array, 0, array2, 0, length);
        return array2;
    }
    
    static final void b150(final int n) {
        if (!qc_._t) {
            throw new IllegalStateException();
        }
        if (n != 0) {
            return;
        }
        if (a_._n != null) {
            a_._n.j423((byte)56);
        }
        wo_._e = new dn_(dm_.a738(n + 121), null, true, false, false);
        lg_._w.a336(ta_._a, -1);
        ta_._a.b340(1, wo_._e);
        ta_._a.h423((byte)59);
    }
    
    gg_(final int f, final int b) {
        this._b = b;
        this._f = f;
    }
    
    static {
        gg_.text_raider = "Raider";
        gg_._c = new ba_("usename");
        gg_._a = new int[1024];
        gg_._g = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    }
}
