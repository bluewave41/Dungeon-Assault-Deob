import java.awt.*;

final class ad_
{
    int _a;
    //original name: _e
    static ph_ interface_crescent;
    //original name: _d
    static Frame frame;
    int _b;
    //original name: _c
    static String create_alert_passchars;
    
    static final ad_[] b265() {
        return new ad_[] { hl_._c, am_._b, tp_._y, m_._d, kj_._p, u_._U, og_._c, ib_._h, cm_._T, ve_._e, pm_._l, hf_._wb, sj_._hb, lg_._n };
    }
    
    static final void a028(final int n, final int n2, int n3, final int n4, final Graphic[] array) {
        if (null != array && n > 0) {
            final int e = array[0].imageWidth2;
            final int e2 = array[2].imageWidth2;
            final int e3 = array[1].imageWidth2;
            array[0].a326(n3, n2, n4);
            array[2].a326(-e2 + n3 + n, n2, n4);
            gf_.a331(mk_._i);
            gf_.a115(e + n3, n2, n + n3 - e2, array[1].imageHeight2 + n2);
            final int n5 = n3 + e;
            int i;
            for (i = n + (n3 - e2), n3 = n5; i > n3; n3 += e3) {
                array[1].a326(n3, n2, n4);
            }
            gf_.b331(mk_._i);
        }
    }
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    public static void a150() {
        ad_.interface_crescent = null;
        ad_.frame = null;
        ad_.create_alert_passchars = null;
    }
    
    //original signature: ad_(final int b, final int n, final int n2, final int a) {
    //a is always 0, 1 or 2
    ad_(final int b, final int a) {
        this._b = b;
        this._a = a;
    }
    
    static final void a934(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final qh_ qh_) {
        if (null == qh_._y || 1 >= qh_._w) {
            sf_.d150();
        }
        else {
            ll_.a078(0, qh_._y, 0, hk_._b);
        }
        final int[] array = new int[qh_._c];
        final int[] array2 = new int[qh_._c];
        final int[] c = hk_._c;
        final int[] x = DungeonBuilder._x;
        final int[] j = hd_._j;
        for (short n8 = 0; qh_._c > n8; ++n8) {
            int n9 = n7 * j[n8] + (n2 * x[n8] + c[n8] * n3) >> 8;
            if (n9 < 0) {
                n9 = -n9;
            }
            final int n10 = (n9 >= 0) ? ((n9 >= 128) ? 256 : (128 + n9)) : 128;
            final int n11 = j[n8] * n4 + n * x[n8] + c[n8] * n6 >> 8;
            final int n12 = jk_._Bb[(0 > n11) ? (-n11) : n11];
            array[n8] = (-n12 + 256) * n10 >>> 8;
            array2[n8] = n12;
        }
        for (int n13 = 0; ab_._c > n13; ++n13) {
            final int n14 = hf_._yb[n13];
            final short n15 = qh_._A[n14];
            final short n16 = qh_._x[n14];
            final short n17 = qh_._N[n14];
            final short n18 = (short)((qh_._e[n14] < hk_._c.length) ? qh_._e[n14] : -1);
            final short n19 = (short)((hk_._c.length > qh_._s[n14]) ? qh_._s[n14] : -1);
            final short n20 = (short)((qh_._F[n14] >= hk_._c.length) ? -1 : qh_._F[n14]);
            final sm_ sm_ = (ch_._n == null || null == qh_._o || qh_._o.length <= n14 || -1 == qh_._o[n14] || ch_._n.length <= qh_._o[n14]) ? null : ch_._n[qh_._o[n14]];
            final int n21 = nj_._g[n15];
            final int n22 = ra_._b[n15];
            final int n23 = nj_._g[n16];
            final int n24 = ra_._b[n16];
            final int n25 = nj_._g[n17];
            final int n26 = ra_._b[n17];
            if (n19 == n18 && n19 == n20) {
                final int n27 = array[n18];
                final int n28 = array2[n18];
                final int n29 = (sm_ == null) ? 8355711 : sm_._d;
                kd_.a229(n23, n21, n25, n22, 0x7F7F7F & (((n29 & 0xFF00FF) * n27 >>> 8 & 0xEAFF00FF) | ((n29 & 0xFF00) * n27 & 0xFF000C) >>> 8) + 65793 * n28 >> 1, n26, n24);
            }
            else {
                final int n30 = array[n18];
                final int n31 = array[n19];
                final int n32 = array[n20];
                final int n33 = array2[n18];
                final int n34 = array2[n19];
                final int n35 = array2[n20];
                final int n36 = (null == sm_) ? 8355711 : sm_._d;
                final int n37 = 0xFF00FF & n36;
                final int n38 = n36 & 0xFF00;
                final int n39 = (0x3DFF00FF & n37 * n30 >>> 8) | (n30 * n38 >>> 8 & 0xD00FF00);
                final int n40 = (0xCAFF00FF & n37 * n31 >>> 8) | (n31 * n38 & 0xFF004F) >>> 8;
                final int n41 = (n38 * n32 >>> 8 & 0xE600FF00) | (0xFF00FF63 & n32 * n37) >>> 8;
                final int n42 = n39 + n33 * 65793;
                final int n43 = n40 + 65793 * n34;
                final int n44 = n41 + n35 * 65793;
                fg_.a044(n26, n44 & 0xFF, n24, n22, 0xFF & n42 >> 8, n44 >> 16, n43 >> 16, n44 >> 8 & 0xFF, (n43 & 0xFFBA) >> 8, n42 >> 16, 0xFF & n43, n21, 0xFF & n42, n23, n25);
            }
        }
    }
    
    static {
        ad_.create_alert_passchars = "Passwords can only contain letters and numbers";
    }
}
