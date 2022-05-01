final class pb_ extends wf_
{
	//original name: _G
    static int isMember;
    private Object _E;
    //original name: _H
    static String text_continue_tooltip;
    //original name: _F
    static String text_confirm_changes_stable;
    //original name: _I
    static String text_treasure_colon;
    
    public static void e423() {
        pb_.text_treasure_colon = null;
        pb_.text_continue_tooltip = null;
        pb_.text_confirm_changes_stable = null;
    }
    
    @Override
    final boolean c427(final byte b) {
        return b != 21;
    }
    
    static final void a560(final boolean b, final int n, final int[] array, final boolean b2, final qh_ qh_, final int[] array2) {
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MIN_VALUE;
        final int n4 = array[3] >> 2;
        final int n5 = array[4] >> 2;
        final int n6 = array[5] >> 2;
        final int n7 = array[6] >> 2;
        final int n8 = array[7] >> 2;
        final int n9 = array[8] >> 2;
        final int n10 = array[9] >> 2;
        final int n11 = array[10] >> 2;
        final int n12 = array[11] >> 2;
        final int n13 = n6 * array2[5] + n5 * array2[4] + array2[3] * n4 >> 14;
        final int n14 = array2[3] * n7 - (-(n8 * array2[4]) - array2[5] * n9) >> 14;
        final int n15 = n12 * array2[11] + (array2[9] * n10 + n11 * array2[10]) >> 14;
        final int n16 = n4 * array2[9] + (array2[10] * n5 + n6 * array2[11]) >> 14;
        final int n17 = n9 * array2[11] + n7 * array2[9] + array2[10] * n8 >> 14;
        final int n18 = array2[7] * n5 + (n4 * array2[6] + n6 * array2[8]) >> 14;
        final int n19 = n11 * array2[7] + (array2[6] * n10 + array2[8] * n12) >> 14;
        final int n20 = array2[8] * n9 + (n7 * array2[6] + n8 * array2[7]) >> 14;
        final int n21 = n12 * array2[5] + (array2[4] * n11 + n10 * array2[3]) >> 14;
        final int n22 = -array[0] + array2[0];
        final int n23 = array2[1] - array[1];
        final int n24 = array2[2] - array[2];
        final int n25 = n23 * array[4] + (array[3] * n22 + array[5] * n24) >> 16 - lh_._t;
        final int n26 = array[9] * n22 + n23 * array[10] + array[11] * n24 >> 16;
        final int n27 = array[8] * n24 + (n22 * array[6] + array[7] * n23) >> -lh_._t + 16;
        final int d = re_._d;
        final int h = re_._h;
        for (int i = n; i < qh_._B; ++i) {
            final short n28 = qh_._L[i];
            final short n29 = qh_._S[i];
            final short n30 = qh_._z[i];
            final int n31 = n25 + (n18 * n29 + (n13 * n28 + n30 * n16) >> -lh_._t + 16);
            final int n32 = n27 + (n30 * n17 + (n14 * n28 + n29 * n20) >> 16 - lh_._t);
            final int n33 = (n30 * n15 + (n19 * n29 + n28 * n21) >> 16) + n26;
            if (50 > n33) {
                ko_._v[i] = Integer.MIN_VALUE;
            }
            else {
                nj_._g[i] = d + n31 / n33;
                ra_._b[i] = n32 / n33 + h;
                if ((ko_._v[i] = n33) < n2) {
                    n2 = n33;
                }
                if (n3 < n33) {
                    n3 = n33;
                }
            }
        }
        if (null != qh_._k && null != qh_._g && null != qh_._O && qh_._r != null && null != qh_._m && null != qh_._T && qh_._u != null && null != qh_._K && null != qh_._l) {
            for (short n34 = 0; qh_._h > n34; ++n34) {
                final int n35 = qh_._k[n34];
                final int n36 = qh_._g[n34];
                final int n37 = qh_._O[n34];
                gi_._L[n34] = (n35 * n13 + n18 * n36 + n16 * n37 >> 16) + n25;
                lp_._B[n34] = n27 + (n14 * n35 + n36 * n20 + n17 * n37 >> 16);
                ok_._S[n34] = n26 + (n19 * n36 + n21 * n35 + n37 * n15 >> 16);
                final int n38 = qh_._r[n34];
                final int n39 = qh_._m[n34];
                final int n40 = qh_._T[n34];
                fg_._d[n34] = n25 + (n13 * n38 - (-(n18 * n39) - n16 * n40) >> 16);
                lm_._m[n34] = n27 + (n20 * n39 + n14 * n38 + n17 * n40 >> 16);
                tc_._m[n34] = (n15 * n40 + (n21 * n38 + n19 * n39) >> 16) + n26;
                final int n41 = qh_._u[n34];
                final int n42 = qh_._K[n34];
                final int n43 = qh_._l[n34];
                i_._l[n34] = n25 + (n13 * n41 + n18 * n42 + n16 * n43 >> 16);
                vj_._d[n34] = (n43 * n17 + n41 * n14 + n20 * n42 >> 16) + n27;
                fm_._h[n34] = (n21 * n41 + n19 * n42 + n43 * n15 >> 16) + n26;
            }
        }
        if (b) {
            final int n44 = array2[3];
            final int n45 = array2[4];
            final int n46 = array2[5];
            final int n47 = array2[6];
            final int n48 = array2[7];
            final int n49 = array2[8];
            final int n50 = array2[9];
            final int n51 = array2[10];
            final int n52 = array2[11];
            for (short n53 = 0; n53 < qh_._c && hk_._c.length > n53; ++n53) {
                final short n54 = qh_._d[n53];
                final short n55 = qh_._P[n53];
                final short n56 = qh_._v[n53];
                hk_._c[n53] = n56 * n50 + (n54 * n44 + n55 * n47) >> 16;
                DungeonBuilder._x[n53] = n45 * n54 - (-(n55 * n48) - n56 * n51) >> 16;
                hd_._j[n53] = n46 * n54 + n55 * n49 + n52 * n56 >> 16;
            }
        }
        b_.a525(n2, n3, b2, qh_);
    }
    
    @Override
    final Object d092(final int n) {
        if (n != 22698) {
            return null;
        }
        return this._E;
    }
    
    pb_(final Object e, final int n) {
        super(n);
        this._E = e;
    }
    
    static {
        pb_.text_confirm_changes_stable = "The changes you have made to your stable have not yet been saved. Would you like them to be saved now?";
        pb_.text_treasure_colon = "TREASURE:";
        pb_.text_continue_tooltip = "Continue";
    }
}
