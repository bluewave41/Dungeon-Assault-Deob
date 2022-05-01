import java.io.*;

final class jp_ extends ne_
{
    private int _G;
    private static float[] _E;
    private static int[] _l;
    private static po_[] _n;
    private int _m;
    private int _M;
    private static float[] _p;
    private static float[] _O;
    private static byte[] _s;
    private int _u;
    private static int _i;
    private boolean _v;
    private static boolean _y;
    private static boolean[] _N;
    private int _C;
    private float[] _t;
    private int _o;
    private static int[] _D;
    private static float[] _B;
    static km_[] _x;
    private static float[] _H;
    private static wc_[] _A;
    private byte[] _w;
    private byte[][] _L;
    private static float[] _j;
    private boolean _z;
    private static int _K;
    private static int _P;
    private int _r;
    private static int[] _I;
    private int _k;
    private static int _F;
    private static nd_[] _q;
    private static float[] _J;
    
    final va_ c981() {
        this._M = 0;
        this._t = new float[jp_._K];
        final byte[] array = new byte[this._m];
        int n = 0;
        for (int i = 0; i < this._L.length; ++i) {
            final float[] e875 = this.e875(i);
            if (e875 != null) {
                int length = e875.length;
                if (length > this._m - n) {
                    length = this._m - n;
                }
                for (int j = 0; j < length; ++j) {
                    int n2 = (int)(128.0f + e875[j] * 128.0f);
                    if ((n2 & 0xFFFFFF00) != 0x0) {
                        n2 = ~n2 >> 31;
                    }
                    array[n++] = (byte)(n2 - 128);
                }
            }
        }
        this._t = null;
        return new va_(this._C, array, this._r, this._G, this._z);
    }
    
    private final float[] e875(final int n) {
        a167(this._L[n], 0);
        b784();
        final int a137 = a137(ue_.a080(jp_._I.length - 1));
        final boolean b = jp_._N[a137];
        final int m = b ? jp_._K : jp_._i;
        int n2 = 0;
        int n3 = 0;
        if (b) {
            n2 = ((b784() != 0) ? 1 : 0);
            n3 = ((b784() != 0) ? 1 : 0);
        }
        final int n4 = m >> 1;
        int n5;
        int n6;
        int n7;
        if (b && n2 == 0) {
            n5 = (m >> 2) - (jp_._i >> 2);
            n6 = (m >> 2) + (jp_._i >> 2);
            n7 = jp_._i >> 1;
        }
        else {
            n5 = 0;
            n6 = n4;
            n7 = m >> 1;
        }
        int n8;
        int n9;
        int n10;
        if (b && n3 == 0) {
            n8 = m - (m >> 2) - (jp_._i >> 2);
            n9 = m - (m >> 2) + (jp_._i >> 2);
            n10 = jp_._i >> 1;
        }
        else {
            n8 = n4;
            n9 = m;
            n10 = m >> 1;
        }
        final wc_ wc_ = jp_._A[jp_._I[a137]];
        final boolean b2;
        final boolean v = b2 = !jp_._q[wc_._a[wc_._d]].a801();
        for (int i = 0; i < wc_._c; ++i) {
            jp_._n[wc_._b[i]].a623(jp_._p, m >> 1, b2);
        }
        if (!v) {
            jp_._q[wc_._a[wc_._d]].a331(jp_._p, m >> 1);
        }
        if (v) {
            for (int j = m >> 1; j < m; ++j) {
                jp_._p[j] = 0.0f;
            }
        }
        else {
            final int n11 = m >> 1;
            final int n12 = m >> 2;
            final int n13 = m >> 3;
            final float[] p = jp_._p;
            for (int k = 0; k < n11; ++k) {
                final float[] array = p;
                final int n14 = k;
                array[n14] *= 0.5f;
            }
            for (int l = n11; l < m; ++l) {
                p[l] = -p[m - l - 1];
            }
            final float[] array2 = b ? jp_._O : jp_._j;
            final float[] array3 = b ? jp_._E : jp_._J;
            final float[] array4 = b ? jp_._H : jp_._B;
            final int[] array5 = b ? jp_._l : jp_._D;
            for (int n15 = 0; n15 < n12; ++n15) {
                final float n16 = p[4 * n15] - p[m - 4 * n15 - 1];
                final float n17 = p[4 * n15 + 2] - p[m - 4 * n15 - 3];
                final float n18 = array2[2 * n15];
                final float n19 = array2[2 * n15 + 1];
                p[m - 4 * n15 - 1] = n16 * n18 - n17 * n19;
                p[m - 4 * n15 - 3] = n16 * n19 + n17 * n18;
            }
            for (int n20 = 0; n20 < n13; ++n20) {
                final float n21 = p[n11 + 3 + 4 * n20];
                final float n22 = p[n11 + 1 + 4 * n20];
                final float n23 = p[4 * n20 + 3];
                final float n24 = p[4 * n20 + 1];
                p[n11 + 3 + 4 * n20] = n21 + n23;
                p[n11 + 1 + 4 * n20] = n22 + n24;
                final float n25 = array2[n11 - 4 - 4 * n20];
                final float n26 = array2[n11 - 3 - 4 * n20];
                p[4 * n20 + 3] = (n21 - n23) * n25 - (n22 - n24) * n26;
                p[4 * n20 + 1] = (n22 - n24) * n25 + (n21 - n23) * n26;
            }
            for (int a138 = ue_.a080(m - 1), n27 = 0; n27 < a138 - 3; ++n27) {
                final int n28 = m >> n27 + 2;
                final int n29 = 8 << n27;
                for (int n30 = 0; n30 < 2 << n27; ++n30) {
                    final int n31 = m - n28 * 2 * n30;
                    final int n32 = m - n28 * (2 * n30 + 1);
                    for (int n33 = 0; n33 < m >> n27 + 4; ++n33) {
                        final int n34 = 4 * n33;
                        final float n35 = p[n31 - 1 - n34];
                        final float n36 = p[n31 - 3 - n34];
                        final float n37 = p[n32 - 1 - n34];
                        final float n38 = p[n32 - 3 - n34];
                        p[n31 - 1 - n34] = n35 + n37;
                        p[n31 - 3 - n34] = n36 + n38;
                        final float n39 = array2[n33 * n29];
                        final float n40 = array2[n33 * n29 + 1];
                        p[n32 - 1 - n34] = (n35 - n37) * n39 - (n36 - n38) * n40;
                        p[n32 - 3 - n34] = (n36 - n38) * n39 + (n35 - n37) * n40;
                    }
                }
            }
            for (int n41 = 1; n41 < n13 - 1; ++n41) {
                final int n42 = array5[n41];
                if (n41 < n42) {
                    final int n43 = 8 * n41;
                    final int n44 = 8 * n42;
                    final float n45 = p[n43 + 1];
                    p[n43 + 1] = p[n44 + 1];
                    p[n44 + 1] = n45;
                    final float n46 = p[n43 + 3];
                    p[n43 + 3] = p[n44 + 3];
                    p[n44 + 3] = n46;
                    final float n47 = p[n43 + 5];
                    p[n43 + 5] = p[n44 + 5];
                    p[n44 + 5] = n47;
                    final float n48 = p[n43 + 7];
                    p[n43 + 7] = p[n44 + 7];
                    p[n44 + 7] = n48;
                }
            }
            for (int n49 = 0; n49 < n11; ++n49) {
                p[n49] = p[2 * n49 + 1];
            }
            for (int n50 = 0; n50 < n13; ++n50) {
                p[m - 1 - 2 * n50] = p[4 * n50];
                p[m - 2 - 2 * n50] = p[4 * n50 + 1];
                p[m - n12 - 1 - 2 * n50] = p[4 * n50 + 2];
                p[m - n12 - 2 - 2 * n50] = p[4 * n50 + 3];
            }
            for (int n51 = 0; n51 < n13; ++n51) {
                final float n52 = array4[2 * n51];
                final float n53 = array4[2 * n51 + 1];
                final float n54 = p[n11 + 2 * n51];
                final float n55 = p[n11 + 2 * n51 + 1];
                final float n56 = p[m - 2 - 2 * n51];
                final float n57 = p[m - 1 - 2 * n51];
                final float n58 = n53 * (n54 - n56) + n52 * (n55 + n57);
                p[n11 + 2 * n51] = (n54 + n56 + n58) * 0.5f;
                p[m - 2 - 2 * n51] = (n54 + n56 - n58) * 0.5f;
                final float n59 = n53 * (n55 + n57) - n52 * (n54 - n56);
                p[n11 + 2 * n51 + 1] = (n55 - n57 + n59) * 0.5f;
                p[m - 1 - 2 * n51] = (-n55 + n57 + n59) * 0.5f;
            }
            for (int n60 = 0; n60 < n12; ++n60) {
                p[n60] = p[2 * n60 + n11] * array3[2 * n60] + p[2 * n60 + 1 + n11] * array3[2 * n60 + 1];
                p[n11 - 1 - n60] = p[2 * n60 + n11] * array3[2 * n60 + 1] - p[2 * n60 + 1 + n11] * array3[2 * n60];
            }
            for (int n61 = 0; n61 < n12; ++n61) {
                p[m - n12 + n61] = -p[n61];
            }
            for (int n62 = 0; n62 < n12; ++n62) {
                p[n62] = p[n12 + n62];
            }
            for (int n63 = 0; n63 < n12; ++n63) {
                p[n12 + n63] = -p[n12 - n63 - 1];
            }
            for (int n64 = 0; n64 < n12; ++n64) {
                p[n11 + n64] = p[m - n64 - 1];
            }
            for (int n65 = n5; n65 < n6; ++n65) {
                final float n66 = (float)Math.sin((n65 - n5 + 0.5) / n7 * 0.5 * 3.141592653589793);
                final float[] p2 = jp_._p;
                final int n67 = n65;
                p2[n67] *= (float)Math.sin(1.5707963267948966 * n66 * n66);
            }
            for (int n68 = n8; n68 < n9; ++n68) {
                final float n69 = (float)Math.sin((n68 - n8 + 0.5) / n10 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                final float[] p3 = jp_._p;
                final int n70 = n68;
                p3[n70] *= (float)Math.sin(1.5707963267948966 * n69 * n69);
            }
        }
        float[] array6 = null;
        if (this._M > 0) {
            array6 = new float[this._M + m >> 2];
            if (!this._v) {
                for (int n71 = 0; n71 < this._o; ++n71) {
                    final int n72 = (this._M >> 1) + n71;
                    final float[] array7 = array6;
                    final int n73 = n71;
                    array7[n73] += this._t[n72];
                }
            }
            if (!v) {
                for (int n74 = n5; n74 < m >> 1; ++n74) {
                    final int n75 = array6.length - (m >> 1) + n74;
                    final float[] array8 = array6;
                    final int n76 = n75;
                    array8[n76] += jp_._p[n74];
                }
            }
        }
        final float[] t = this._t;
        this._t = jp_._p;
        jp_._p = t;
        this._M = m;
        this._o = n9 - (m >> 1);
        this._v = v;
        return array6;
    }
    
    static final jp_ a989(final nh_ nh_, final int n, final int n2) {
        if (!a314(nh_)) {
            nh_.a330(n2, n);
            return null;
        }
        final byte[] b337 = nh_.b337(n, n2);
        if (b337 == null) {
            return null;
        }
        jp_ jp_ = null;
        try {
            jp_ = new jp_(b337);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return jp_;
    }
    
    static final int b784() {
        final int n = jp_._s[jp_._P] >> jp_._F & 0x1;
        ++jp_._F;
        jp_._P += jp_._F >> 3;
        jp_._F &= 0x7;
        return n;
    }
    
    static final jp_ a825(final nh_ nh_, final String s, final String s2) {
        if (!a314(nh_)) {
            nh_.a822(-13703, s2, s);
            return null;
        }
        final byte[] a826 = nh_.a826(s, s2);
        if (a826 == null) {
            return null;
        }
        jp_ jp_ = null;
        try {
            jp_ = new jp_(a826);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return jp_;
    }
    
    private static final boolean a314(final nh_ nh_) {
        if (!jp_._y) {
            final byte[] b337 = nh_.b337(0, 0);
            if (b337 == null) {
                return false;
            }
            a604(b337);
        }
        return true;
    }
    
    public static void a797() {
        jp_._s = null;
        jp_._x = null;
        jp_._q = null;
        jp_._n = null;
        jp_._A = null;
        jp_._N = null;
        jp_._I = null;
        jp_._p = null;
        jp_._j = null;
        jp_._J = null;
        jp_._B = null;
        jp_._O = null;
        jp_._E = null;
        jp_._H = null;
        jp_._D = null;
        jp_._l = null;
    }
    
    static final float d134(final int n) {
        int n2 = n & 0x1FFFFF;
        final int n3 = n & Integer.MIN_VALUE;
        final int n4 = (n & 0x7FE00000) >> 21;
        if (n3 != 0) {
            n2 = -n2;
        }
        return (float)(n2 * Math.pow(2.0, n4 - 788));
    }
    
    static final int a137(int i) {
        int n = 0;
        int n2 = 0;
        while (i >= 8 - jp_._F) {
            final int n3 = 8 - jp_._F;
            n += (jp_._s[jp_._P] >> jp_._F & (1 << n3) - 1) << n2;
            jp_._F = 0;
            ++jp_._P;
            n2 += n3;
            i -= n3;
        }
        if (i > 0) {
            n += (jp_._s[jp_._P] >> jp_._F & (1 << i) - 1) << n2;
            jp_._F += i;
        }
        return n;
    }
    
    static final void a604(final byte[] array) {
        a167(array, 0);
        jp_._i = 1 << a137(4);
        jp_._K = 1 << a137(4);
        jp_._p = new float[jp_._K];
        for (int i = 0; i < 2; ++i) {
            final int n = (i != 0) ? jp_._K : jp_._i;
            final int n2 = n >> 1;
            final int n3 = n >> 2;
            final int n4 = n >> 3;
            final float[] array2 = new float[n2];
            for (int j = 0; j < n3; ++j) {
                array2[2 * j] = (float)Math.cos(4 * j * 3.141592653589793 / n);
                array2[2 * j + 1] = -(float)Math.sin(4 * j * 3.141592653589793 / n);
            }
            final float[] array3 = new float[n2];
            for (int k = 0; k < n3; ++k) {
                array3[2 * k] = (float)Math.cos((2 * k + 1) * 3.141592653589793 / (2 * n));
                array3[2 * k + 1] = (float)Math.sin((2 * k + 1) * 3.141592653589793 / (2 * n));
            }
            final float[] array4 = new float[n3];
            for (int l = 0; l < n4; ++l) {
                array4[2 * l] = (float)Math.cos((4 * l + 2) * 3.141592653589793 / n);
                array4[2 * l + 1] = -(float)Math.sin((4 * l + 2) * 3.141592653589793 / n);
            }
            final int[] array5 = new int[n4];
            final int a080 = ue_.a080(n4 - 1);
            for (int n5 = 0; n5 < n4; ++n5) {
                array5[n5] = lp_.a760(a080, n5);
            }
            if (i != 0) {
                jp_._O = array2;
                jp_._E = array3;
                jp_._H = array4;
                jp_._l = array5;
            }
            else {
                jp_._j = array2;
                jp_._J = array3;
                jp_._B = array4;
                jp_._D = array5;
            }
        }
        final int n6 = a137(8) + 1;
        jp_._x = new km_[n6];
        for (int n7 = 0; n7 < n6; ++n7) {
            jp_._x[n7] = new km_();
        }
        for (int n8 = a137(6) + 1, n9 = 0; n9 < n8; ++n9) {
            a137(16);
        }
        final int n10 = a137(6) + 1;
        jp_._q = new nd_[n10];
        for (int n11 = 0; n11 < n10; ++n11) {
            jp_._q[n11] = new nd_();
        }
        final int n12 = a137(6) + 1;
        jp_._n = new po_[n12];
        for (int n13 = 0; n13 < n12; ++n13) {
            jp_._n[n13] = new po_();
        }
        final int n14 = a137(6) + 1;
        jp_._A = new wc_[n14];
        for (int n15 = 0; n15 < n14; ++n15) {
            jp_._A[n15] = new wc_();
        }
        final int n16 = a137(6) + 1;
        jp_._N = new boolean[n16];
        jp_._I = new int[n16];
        for (int n17 = 0; n17 < n16; ++n17) {
            jp_._N[n17] = (b784() != 0);
            a137(16);
            a137(16);
            jp_._I[n17] = a137(8);
        }
        jp_._y = true;
    }
    
    private static final void a167(final byte[] s, final int p2) {
        jp_._s = s;
        jp_._P = p2;
        jp_._F = 0;
    }
    
    private final void b604(final byte[] array) throws IOException {
        final ec_ ec_ = new ec_(array);
        this._C = ec_.readInt();
        this._m = ec_.readInt();
        this._r = ec_.readInt();
        this._G = ec_.readInt();
        if (this._G < 0) {
            this._G ^= -1;
            this._z = true;
        }
        final int h137 = ec_.readInt();
        if (h137 < 0) {
            throw new IOException();
        }
        this._L = new byte[h137][];
        for (int i = 0; i < h137; ++i) {
            int n = 0;
            int c474;
            do {
                c474 = ec_.readByte();
                n += c474;
            } while (c474 >= 255);
            final byte[] array2 = new byte[n];
            ec_.a286(0, n, array2);
            this._L[i] = array2;
        }
    }
    
    final va_ a321(final int[] array) {
        if (array != null && array[0] <= 0) {
            return null;
        }
        if (this._w == null) {
            this._M = 0;
            this._t = new float[jp_._K];
            this._w = new byte[this._m];
            this._k = 0;
            this._u = 0;
        }
        while (this._u < this._L.length) {
            if (array != null && array[0] <= 0) {
                return null;
            }
            final float[] e875 = this.e875(this._u);
            if (e875 != null) {
                int k = this._k;
                int length = e875.length;
                if (length > this._m - k) {
                    length = this._m - k;
                }
                for (int i = 0; i < length; ++i) {
                    int n = (int)(128.0f + e875[i] * 128.0f);
                    if ((n & 0xFFFFFF00) != 0x0) {
                        n = ~n >> 31;
                    }
                    this._w[k++] = (byte)(n - 128);
                }
                if (array != null) {
                    final int n2 = 0;
                    array[n2] -= k - this._k;
                }
                this._k = k;
            }
            ++this._u;
        }
        this._t = null;
        final byte[] w = this._w;
        this._w = null;
        return new va_(this._C, w, this._r, this._G, this._z);
    }
    
    private jp_(final byte[] array) throws IOException {
        this.b604(array);
    }
    
    static {
        jp_._y = false;
    }
}
