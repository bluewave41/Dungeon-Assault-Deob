final class kn_
{
	//original name: _g
    static boolean isTutorial;
    static boolean _c;
    //original name: _b
    static int gameId;
    static boolean _e;
    static qg_ _f;
    //original name: _a
    static String retry;
    //original name: _d
    static String openinpopupwindow;
    
    static final synchronized byte[] a551(final int n) {
        if (n == 100 && tg_._g > 0) {
            final byte[] array = to_._d[--tg_._g];
            to_._d[tg_._g] = null;
            return array;
        }
        if (5000 == n && 0 < dj_._a) {
            final byte[] array2 = rp_._c[--dj_._a];
            rp_._c[dj_._a] = null;
            return array2;
        }
        if (n == 30000 && hm_._s > 0) {
            final byte[] array3 = lm_._l[--hm_._s];
            lm_._l[hm_._s] = null;
            return array3;
        }
        if (lo_._c != null) {
            for (int i = 0; i < fp_._c.length; ++i) {
                if (n == fp_._c[i] && 0 < vc_._c[i]) {
                    final byte[][] array4 = lo_._c[i];
                    final int[] c = vc_._c;
                    final int n2 = i;
                    final int n3 = c[n2] - 1;
                    c[n2] = n3;
                    final byte[] array5 = array4[n3];
                    lo_._c[i][vc_._c[i]] = null;
                    return array5;
                }
            }
        }
        return new byte[n];
    }
    
    public static void a150() {
        kn_.retry = null;
        kn_.openinpopupwindow = null;
        kn_._f = null;
    }
    
    //original signature: static final void a020(final int n, final String s, final int n2, final int n3, final int n4, final int n5, final String s2, final String s3) {
    static final void loadRaiderVoices(final int n, final String defeatName, final int unitId, final int n3, final int n5, final String specialName, final String revealName) {
        final Raider raider = hp_.raiders[unitId];
        if (raider != null) {
            raider.revealTrack = ((revealName != null) ? hd_.a492(n, "da_raider_" + revealName) : null);
            raider.defeatTrack = ((defeatName != null) ? hd_.a492(n3, "da_raider_" + defeatName) : null);
            raider.specialTrack = ((specialName != null) ? hd_.a492(n5, "da_raider_" + specialName) : null);
        }
    }
    
    static final Graphic[] a922(final nh_ nh_, final String s, final String s2) {
        final int a913 = nh_.a913(s, 1000);
        return oi_.a428(a913, nh_.a026(0, s2, a913), nh_);
    }
    
    static {
        kn_.retry = "Retry";
        kn_.openinpopupwindow = "Open in popup window";
    }
}
