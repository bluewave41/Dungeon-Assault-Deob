final class gf_
{
    static int[] _l;
    static int _e;
    static int _i;
    static int[] _g;
    private static int[] _k;
    static int _f;
    static int _h;
    private static int[] _a;
    private static int[] _d;
    static int _j;
    static int _c;
    static int[] _b;
    
    public static void c797() {
        gf_._b = null;
        gf_._g = null;
        gf_._l = null;
        gf_._k = null;
        gf_._a = null;
        gf_._d = null;
    }
    
    private static final void a412(int i, final int[] array, int n, final int n2, int j, final int n3) {
        while (j < 0) {
            for (n = i + n2 - 7; i < n; ++i, array[i] = (array[i] & 0xFEFEFE) >> 1, ++i, array[i] = (array[i] & 0xFEFEFE) >> 1, ++i, array[i] = (array[i] & 0xFEFEFE) >> 1, ++i, array[i] = (array[i] & 0xFEFEFE) >> 1, ++i, array[i] = (array[i] & 0xFEFEFE) >> 1, ++i, array[i] = (array[i] & 0xFEFEFE) >> 1, ++i, array[i] = (array[i] & 0xFEFEFE) >> 1, ++i) {
                array[i] = (array[i] & 0xFEFEFE) >> 1;
            }
            for (n += 7; i < n; ++i) {
                array[i] = (array[i] & 0xFEFEFE) >> 1;
            }
            i += n3;
            ++j;
        }
    }
    
    static final void c669(int j, int f, int n, int n2, final int n3, final int n4) {
        int n5 = 0;
        final int n6 = 65536 / n2;
        if (j < gf_._j) {
            n -= gf_._j - j;
            j = gf_._j;
        }
        if (f < gf_._f) {
            n5 += (gf_._f - f) * n6;
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (j + n > gf_._h) {
            n = gf_._h - j;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        final int n7 = gf_._i - n;
        int n8 = j + f * gf_._i;
        for (int i = -n2; i < 0; ++i) {
            final int n9 = 65536 - n5 >> 8;
            final int n10 = n5 >> 8;
            final int n11 = ((n3 & 0xFF00FF) * n9 + (n4 & 0xFF00FF) * n10 & 0xFF00FF00) + ((n3 & 0xFF00) * n9 + (n4 & 0xFF00) * n10 & 0xFF0000) >>> 8;
            for (int k = -n; k < 0; ++k) {
                gf_._b[n8++] = n11;
            }
            n8 += n7;
            n5 += n6;
        }
    }
    
    static final void b797() {
        gf_._j = 0;
        gf_._f = 0;
        gf_._h = gf_._i;
        gf_._e = gf_._c;
        d797();
    }
    
    static final void b907(final int n, final int n2, final int n3, final int n4, final int[] array) {
        final int n5 = n3 * n3;
        int j = n - n3 >> 4;
        int h = n + n3 + 15 >> 4;
        int f = n2 - n3 >> 4;
        int e = n2 + n3 + 15 >> 4;
        if (j < gf_._j) {
            j = gf_._j;
        }
        if (h > gf_._h) {
            h = gf_._h;
        }
        if (f < gf_._f) {
            f = gf_._f;
        }
        if (e > gf_._e) {
            e = gf_._e;
        }
        final int n6 = (j << 4) - n;
        final int n7 = n6 * n6;
        final int n8 = (j + 1 << 4) - n;
        final int n9 = n8 * n8;
        final int n10 = (j + 2 << 4) - n;
        final int n11 = n10 * n10;
        final int n12 = n9 - n7;
        final int n13 = n11 - n9 - n12;
        final int n14 = (f << 4) - n2;
        final int n15 = n14 * n14;
        final int n16 = (f + 1 << 4) - n2;
        final int n17 = n16 * n16;
        final int n18 = (f + 2 << 4) - n2;
        final int n19 = n18 * n18;
        final int n20 = n17 - n15;
        a555(0, 0, 0, 0, 0, n13, n5, j + f * gf_._i, gf_._b, n4, array, gf_._i + j - h, n12, j - h, n15 + n7, n20, n19 - n17 - n20, f - e);
    }
    
    static final void c115(final int n, int f, int n2, final int n3) {
        if (n < gf_._j || n >= gf_._h) {
            return;
        }
        if (f < gf_._f) {
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        for (int n4 = n + f * gf_._i, i = 0; i < n2; ++i, n4 += gf_._i) {
            gf_._b[n4] = n3;
        }
    }
    
    static final void e115(int j, int f, int i, int c) {
        if (j < 0) {
            j = 0;
        }
        if (f < 0) {
            f = 0;
        }
        if (i > gf_._i) {
            i = gf_._i;
        }
        if (c > gf_._c) {
            c = gf_._c;
        }
        gf_._j = j;
        gf_._f = f;
        gf_._h = i;
        gf_._e = c;
        d797();
    }
    
    static final void a797() {
        int i;
        int n;
        for (i = 0, n = gf_._i * gf_._c - 7; i < n; gf_._b[i++] = 0, gf_._b[i++] = 0, gf_._b[i++] = 0, gf_._b[i++] = 0, gf_._b[i++] = 0, gf_._b[i++] = 0, gf_._b[i++] = 0, gf_._b[i++] = 0) {}
        for (n += 7; i < n; gf_._b[i++] = 0) {}
    }
    
    static final void d115(int j, int f, int n, int n2) {
        if (j < gf_._j) {
            n -= gf_._j - j;
            j = gf_._j;
        }
        if (j + n > gf_._h) {
            n = gf_._h - j;
        }
        if (f < gf_._f) {
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        int n3 = j + f * gf_._i;
        if (n <= 0 || n2 <= 0) {
            return;
        }
        for (int i = 0; i < n2; ++i) {
            for (int k = 0; k < n; ++k) {
                final int n4 = gf_._b[n3];
                final int n5 = ((n4 & 0xFF) + (n4 >> 15 & 0x1FE)) / 3 + (n4 >> 8 & 0xFF) >> 1;
                gf_._b[n3++] = (n5 << 16) + (n5 << 8) + n5;
            }
            n3 += gf_._i - n;
        }
    }
    
    private static final void a600(final int[] array, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n8 = 16384 / (2 * n3 + 1);
        int n9 = 1 + n3 - n5 - n4;
        if (0 < n9) {
            n9 = 0;
        }
        int n10 = gf_._i - n4 - n5 - n3;
        if (0 < n10) {
            n10 = 0;
        }
        int n11 = 0;
        int i = n4 + n3 + 1;
        if (gf_._i < i) {
            n11 = i - gf_._i;
            i = gf_._i;
        }
        for (int j = -n7; j < 0; ++j) {
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            int n15 = n2 - n3;
            int n16 = n15 - (n3 << 1) - 1;
            int k = n4 - n3;
            if (k < 0) {
                n15 -= k;
                n16 -= k;
                k = 0;
            }
            int n17 = i - k;
            while (k < i) {
                n = array[n15];
                n12 += (n >> 16 & 0xFF);
                n13 += (n >> 8 & 0xFF);
                n14 += (n & 0xFF);
                ++n15;
                ++n16;
                ++k;
            }
            int n18 = n16 + n11;
            array[n2++] = (n12 / n17 << 16) + (n13 / n17 << 8) + n14 / n17;
            int l;
            for (l = 1 - n5; l < n9; ++l) {
                ++n18;
                if (n4 + n5 + l + n3 < gf_._h) {
                    n = array[n15];
                    ++n15;
                    n12 += (n >> 16 & 0xFF);
                    n13 += (n >> 8 & 0xFF);
                    n14 += (n & 0xFF);
                    ++n17;
                }
                array[n2++] = (n12 / n17 << 16) + (n13 / n17 << 8) + n14 / n17;
            }
            while (l < n10) {
                n = array[n18++];
                int n19 = n12 - (n >> 16 & 0xFF);
                if (n19 < 0) {
                    n19 = 0;
                }
                int n20 = n13 - (n >> 8 & 0xFF);
                if (n20 < 0) {
                    n20 = 0;
                }
                int n21 = n14 - (n & 0xFF);
                if (n21 < 0) {
                    n21 = 0;
                }
                n = array[n15];
                ++n15;
                n12 = n19 + (n >> 16 & 0xFF);
                n13 = n20 + (n >> 8 & 0xFF);
                n14 = n21 + (n & 0xFF);
                int n22 = n12 * n8 >> 14;
                int n23 = n13 * n8 >> 14;
                int n24 = n14 * n8 >> 14;
                if (n22 > 255) {
                    n22 = 255;
                }
                if (n23 > 255) {
                    n23 = 255;
                }
                if (n24 > 255) {
                    n24 = 255;
                }
                array[n2++] = (n22 << 16) + (n23 << 8) + n24;
                ++l;
            }
            while (l < 0) {
                n = array[n18++];
                n12 -= (n >> 16 & 0xFF);
                n13 -= (n >> 8 & 0xFF);
                n14 -= (n & 0xFF);
                --n17;
                int n25 = n12 / n17;
                int n26 = n13 / n17;
                int n27 = n14 / n17;
                if (n25 < 0) {
                    n25 = 0;
                }
                else if (n25 > 255) {
                    n25 = 255;
                }
                if (n26 < 0) {
                    n26 = 0;
                }
                else if (n26 > 255) {
                    n26 = 255;
                }
                if (n27 < 0) {
                    n27 = 0;
                }
                else if (n27 > 255) {
                    n27 = 255;
                }
                array[n2++] = (n25 << 16) + (n26 << 8) + n27;
                ++l;
            }
            n2 += n6;
        }
    }
    
    static final void b050(int j, int f, int n, int n2, final int n3) {
        if (j < gf_._j) {
            n -= gf_._j - j;
            j = gf_._j;
        }
        if (f < gf_._f) {
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (j + n > gf_._h) {
            n = gf_._h - j;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        final int n4 = gf_._i - n;
        int n5 = j + f * gf_._i;
        for (int i = -n2; i < 0; ++i) {
            for (int k = -n; k < 0; ++k) {
                gf_._b[n5++] = n3;
            }
            n5 += n4;
        }
    }
    
    private static final void d797() {
        gf_._g = null;
        gf_._l = null;
    }
    
    static final void b331(final int[] array) {
        gf_._j = array[0];
        gf_._f = array[1];
        gf_._h = array[2];
        gf_._e = array[3];
        d797();
    }
    
    static final void a326(final int n, final int n2, final int n3) {
        if (n < gf_._j || n2 < gf_._f || n >= gf_._h || n2 >= gf_._e) {
            return;
        }
        gf_._b[n + n2 * gf_._i] = n3;
    }
    
    private static final void a621(final int[] array, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (gf_._k == null || gf_._k.length < n8) {
            gf_._k = new int[n8];
            gf_._a = new int[n8];
            gf_._d = new int[n8];
        }
        final int[] k = gf_._k;
        final int[] a = gf_._a;
        final int[] d = gf_._d;
        cj_.a397(k, 0, n8);
        cj_.a397(a, 0, n8);
        cj_.a397(d, 0, n8);
        final int n9 = 16384 / (2 * n3 + 1);
        int i = n4 - n3;
        if (i < 0) {
            i = 0;
        }
        int n10 = n7 + i * gf_._i;
        int n11 = n4 + n3;
        int n12 = 0;
        if (n11 >= gf_._c) {
            n12 = n11 - gf_._c + 1;
            n11 = gf_._c - 1;
        }
        int n13 = n11 - i + 1;
        while (i <= n11) {
            for (int j = 0; j < n8; ++j) {
                n = array[n10++];
                final int[] array2 = k;
                final int n14 = j;
                array2[n14] += (n >> 16 & 0xFF);
                final int[] array3 = a;
                final int n15 = j;
                array3[n15] += (n >> 8 & 0xFF);
                final int[] array4 = d;
                final int n16 = j;
                array4[n16] += (n & 0xFF);
            }
            n10 += n6;
            ++i;
        }
        int n17 = n10 + n12 * gf_._i;
        for (int l = 0; l < n8; ++l) {
            array[n2++] = (k[l] / n13 << 16) + (a[l] / n13 << 8) + d[l] / n13;
        }
        n2 += n6;
        int n18 = 1 - n5;
        int n19 = 1 + n3 - n5 - n4;
        if (0 < n19) {
            n19 = 0;
        }
        int n20 = n7 + (n4 - n3) * gf_._i;
        if (n18 < n19) {
            n20 += (n19 - n18) * gf_._i;
        }
        while (n18 < n19) {
            if (n18 + n4 + n5 + n3 < gf_._e) {
                for (int n21 = 0; n21 < n8; ++n21) {
                    n = array[n17++];
                    final int[] array5 = k;
                    final int n22 = n21;
                    array5[n22] += (n >> 16 & 0xFF);
                    final int[] array6 = a;
                    final int n23 = n21;
                    array6[n23] += (n >> 8 & 0xFF);
                    final int[] array7 = d;
                    final int n24 = n21;
                    array7[n24] += (n & 0xFF);
                }
                n17 += n6;
                ++n13;
            }
            else {
                n17 += gf_._i;
            }
            for (int n25 = 0; n25 < n8; ++n25) {
                array[n2++] = (k[n25] / n13 << 16) + (a[n25] / n13 << 8) + d[n25] / n13;
            }
            n2 += n6;
            ++n18;
        }
        int n26 = gf_._c - n4 - n5 - n3;
        if (0 < n26) {
            n26 = 0;
        }
        while (n18 < n26) {
            for (int n27 = 0; n27 < n8; ++n27) {
                n = array[n20++];
                final int n28 = k[n27] - (n >> 16 & 0xFF);
                k[n27] = ((n28 < 0) ? 0 : n28);
                final int n29 = a[n27] - (n >> 8 & 0xFF);
                a[n27] = ((n29 < 0) ? 0 : n29);
                final int n30 = d[n27] - (n & 0xFF);
                d[n27] = ((n30 < 0) ? 0 : n30);
            }
            n20 += n6;
            for (int n31 = 0; n31 < n8; ++n31) {
                n = array[n17++];
                final int[] array8 = k;
                final int n32 = n31;
                array8[n32] += (n >> 16 & 0xFF);
                final int[] array9 = a;
                final int n33 = n31;
                array9[n33] += (n >> 8 & 0xFF);
                final int[] array10 = d;
                final int n34 = n31;
                array10[n34] += (n & 0xFF);
            }
            n17 += n6;
            for (int n35 = 0; n35 < n8; ++n35) {
                int n36 = k[n35] * n9 >> 14;
                int n37 = a[n35] * n9 >> 14;
                int n38 = d[n35] * n9 >> 14;
                if (n36 > 255) {
                    n36 = 255;
                }
                if (n37 > 255) {
                    n37 = 255;
                }
                if (n38 > 255) {
                    n38 = 255;
                }
                array[n2++] = (n36 << 16) + (n37 << 8) + n38;
            }
            n2 += n6;
            ++n18;
        }
        while (n18 < 0) {
            for (int n39 = 0; n39 < n8; ++n39) {
                n = array[n20++];
                final int[] array11 = k;
                final int n40 = n39;
                array11[n40] -= (n >> 16 & 0xFF);
                final int[] array12 = a;
                final int n41 = n39;
                array12[n41] -= (n >> 8 & 0xFF);
                final int[] array13 = d;
                final int n42 = n39;
                array13[n42] -= (n & 0xFF);
            }
            n20 += n6;
            --n13;
            for (int n43 = 0; n43 < n8; ++n43) {
                int n44 = k[n43] / n13;
                int n45 = a[n43] / n13;
                int n46 = d[n43] / n13;
                if (n44 < 0) {
                    n44 = 0;
                }
                else if (n44 > 255) {
                    n44 = 255;
                }
                if (n45 < 0) {
                    n45 = 0;
                }
                else if (n45 > 255) {
                    n45 = 255;
                }
                if (n46 < 0) {
                    n46 = 0;
                }
                else if (n46 > 255) {
                    n46 = 255;
                }
                array[n2++] = (n44 << 16) + (n45 << 8) + n46;
            }
            n2 += n6;
            ++n18;
        }
    }
    
    static final void b669(int j, int f, int n, int n2, int n3, final int n4) {
        if (j < gf_._j) {
            n -= gf_._j - j;
            j = gf_._j;
        }
        if (f < gf_._f) {
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (j + n > gf_._h) {
            n = gf_._h - j;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        n3 = ((n3 & 0xFF00FF) * n4 >> 8 & 0xFF00FF) + ((n3 & 0xFF00) * n4 >> 8 & 0xFF00);
        final int n5 = 256 - n4;
        final int n6 = gf_._i - n;
        int n7 = j + f * gf_._i;
        for (int i = 0; i < n2; ++i) {
            for (int k = -n; k < 0; ++k) {
                final int n8 = gf_._b[n7];
                gf_._b[n7++] = n3 + (((n8 & 0xFF00FF) * n5 >> 8 & 0xFF00FF) + ((n8 & 0xFF00) * n5 >> 8 & 0xFF00));
            }
            n7 += n6;
        }
    }
    
    static final void g050(final int n, int n2, int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return;
        }
        if (n5 == 256) {
            f115(n, n2, n3, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        final int n6 = 256 - n5;
        final int n7 = (n4 >> 16 & 0xFF) * n5;
        final int n8 = (n4 >> 8 & 0xFF) * n5;
        final int n9 = (n4 & 0xFF) * n5;
        int f = n2 - n3;
        if (f < gf_._f) {
            f = gf_._f;
        }
        int e = n2 + n3 + 1;
        if (e > gf_._e) {
            e = gf_._e;
        }
        int i = f;
        final int n10 = n3 * n3;
        int n11 = 0;
        int n12 = n2 - i;
        int n13 = n12 * n12;
        int n14 = n13 - n12;
        if (n2 > e) {
            n2 = e;
        }
        while (i < n2) {
            while (n14 <= n10 || n13 <= n10) {
                n13 += n11 + n11;
                n14 += n11 + ++n11;
            }
            int j = n - n11 + 1;
            if (j < gf_._j) {
                j = gf_._j;
            }
            int h = n + n11;
            if (h > gf_._h) {
                h = gf_._h;
            }
            int n15 = j + i * gf_._i;
            for (int k = j; k < h; ++k) {
                gf_._b[n15++] = (n7 + (gf_._b[n15] >> 16 & 0xFF) * n6 >> 8 << 16) + (n8 + (gf_._b[n15] >> 8 & 0xFF) * n6 >> 8 << 8) + (n9 + (gf_._b[n15] & 0xFF) * n6 >> 8);
            }
            ++i;
            n13 -= n12 + --n12;
            n14 -= n12 + n12;
        }
        int n16 = n3;
        int n17 = -n12;
        final int n18 = n17 * n17 + n10;
        for (int n19 = n18 - n16, n20 = n18 - n17; i < e; ++i, n20 += n17 + n17, n19 += n17 + ++n17) {
            while (n20 > n10 && n19 > n10) {
                n20 -= n16 + --n16;
                n19 -= n16 + n16;
            }
            int l = n - n16;
            if (l < gf_._j) {
                l = gf_._j;
            }
            int n21 = n + n16;
            if (n21 > gf_._h - 1) {
                n21 = gf_._h - 1;
            }
            int n22 = l + i * gf_._i;
            for (int n23 = l; n23 <= n21; ++n23) {
                gf_._b[n22++] = (n7 + (gf_._b[n22] >> 16 & 0xFF) * n6 >> 8 << 16) + (n8 + (gf_._b[n22] >> 8 & 0xFF) * n6 >> 8 << 8) + (n9 + (gf_._b[n22] & 0xFF) * n6 >> 8);
            }
        }
    }
    
    static final void b115(int j, final int n, int n2, final int n3) {
        if (n < gf_._f || n >= gf_._e) {
            return;
        }
        if (j < gf_._j) {
            n2 -= gf_._j - j;
            j = gf_._j;
        }
        if (j + n2 > gf_._h) {
            n2 = gf_._h - j;
        }
        final int n4 = j + n * gf_._i;
        for (int i = 0; i < n2; ++i) {
            gf_._b[n4 + i] = n3;
        }
    }
    
    static final void a331(final int[] array) {
        array[0] = gf_._j;
        array[1] = gf_._f;
        array[2] = gf_._h;
        array[3] = gf_._e;
    }
    
    static final void e669(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        d050(n, n2, n3, n5, n6);
        d050(n, n2 + n4 - 1, n3, n5, n6);
        if (n4 >= 3) {
            f050(n, n2 + 1, n4 - 2, n5, n6);
            f050(n + n3 - 1, n2 + 1, n4 - 2, n5, n6);
        }
    }
    
    static final void d050(int j, final int n, int n2, final int n3, final int n4) {
        if (n < gf_._f || n >= gf_._e) {
            return;
        }
        if (j < gf_._j) {
            n2 -= gf_._j - j;
            j = gf_._j;
        }
        if (j + n2 > gf_._h) {
            n2 = gf_._h - j;
        }
        final int n5 = 256 - n4;
        final int n6 = (n3 >> 16 & 0xFF) * n4;
        final int n7 = (n3 >> 8 & 0xFF) * n4;
        final int n8 = (n3 & 0xFF) * n4;
        int n9 = j + n * gf_._i;
        for (int i = 0; i < n2; ++i) {
            gf_._b[n9++] = (n6 + (gf_._b[n9] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (gf_._b[n9] >> 8 & 0xFF) * n5 >> 8 << 8) + (n8 + (gf_._b[n9] & 0xFF) * n5 >> 8);
        }
    }
    
    static final void a370(final int n, final int n2, final int n3, final int n4, int n5, int n6, final int n7) {
        if (n7 == 256) {
            a669(n, n2, n3, n4, n5, n6);
            return;
        }
        if (n5 == 0) {
            b669(n, n2, n3, n4, n6, n7);
            return;
        }
        final int n8 = 256 - n7;
        n6 = ((n6 & 0xFF00FF) * n7 >> 8 & 0xFF00FF) + ((n6 & 0xFF00) * n7 >> 8 & 0xFF00);
        if (n5 < 0) {
            n5 = -n5;
        }
        final int n9 = n + n5;
        int n10 = n2 + n5;
        int f = n2;
        if (f < gf_._f) {
            f = gf_._f;
        }
        int e = n2 + n4;
        if (e > gf_._e) {
            e = gf_._e;
        }
        final int n11 = n3 - n5 - n5 - 1;
        int i = f;
        final int n12 = n5 * n5;
        int n13 = 0;
        int n14 = n10 - i;
        int n15 = n14 * n14;
        int n16 = n15 - n14;
        if (n10 > e) {
            n10 = e;
        }
        while (i < n10) {
            while (n16 <= n12 || n15 <= n12) {
                n15 += n13 + n13;
                n16 += n13 + ++n13;
            }
            int j = n9 - n13 + 1;
            if (j < gf_._j) {
                j = gf_._j;
            }
            int h = n9 + n11 + n13;
            if (h > gf_._h) {
                h = gf_._h;
            }
            int n17 = j + i * gf_._i;
            for (int k = j; k < h; ++k) {
                final int n18 = gf_._b[n17];
                gf_._b[n17++] = n6 + (((n18 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n18 & 0xFF00) * n8 >> 8 & 0xFF00));
            }
            ++i;
            n15 -= n14 + --n14;
            n16 -= n14 + n14;
        }
        int l = n;
        if (l < gf_._j) {
            l = gf_._j;
        }
        int h2 = n + n3;
        if (h2 > gf_._h) {
            h2 = gf_._h;
        }
        int n19 = l + i * gf_._i;
        final int n20 = gf_._i + l - h2;
        int e2 = n2 + n4 - n5 - 1;
        if (e2 > gf_._e) {
            e2 = gf_._e;
        }
        while (i < e2) {
            for (int n21 = l; n21 < h2; ++n21) {
                final int n22 = gf_._b[n19];
                gf_._b[n19++] = n6 + (((n22 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n22 & 0xFF00) * n8 >> 8 & 0xFF00));
            }
            ++i;
            n19 += n20;
        }
        int n23 = 0;
        int n24 = n5;
        final int n25 = n23 * n23 + n12;
        for (int n26 = n25 - n24, n27 = n25 - n23; i < e; ++i, n27 += n23 + n23, n26 += n23 + ++n23) {
            while (n27 > n12 && n26 > n12) {
                n27 -= n24 + --n24;
                n26 -= n24 + n24;
            }
            int m = n9 - n24;
            if (m < gf_._j) {
                m = gf_._j;
            }
            int n28 = n9 + n11 + n24;
            if (n28 > gf_._h - 1) {
                n28 = gf_._h - 1;
            }
            int n29 = m + i * gf_._i;
            for (int n30 = m; n30 <= n28; ++n30) {
                final int n31 = gf_._b[n29];
                gf_._b[n29++] = n6 + (((n31 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n31 & 0xFF00) * n8 >> 8 & 0xFF00));
            }
        }
    }
    
    static final void g115(int j, int f, int n, int n2) {
        if (j < gf_._j) {
            n -= gf_._j - j;
            j = gf_._j;
        }
        if (f < gf_._f) {
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (j + n > gf_._h) {
            n = gf_._h - j;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        a412(j + f * gf_._i, gf_._b, 0, n, -n2, gf_._i - n);
    }
    
    //original signature: static final void d669(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
    static final void d669(final int n, final int n2, final int n3, final int n4, final int imageWidth, final int imageHeight) {
        a600(gf_._b, 0, n3 + n4 * gf_._i, n, n3, imageWidth, gf_._i - imageWidth, imageHeight);
        a621(gf_._b, 0, n3 + n4 * gf_._i, n2, n4, imageHeight, gf_._i - imageWidth, n3, imageWidth);
    }
    
    static final void h115(final int n, final int n2, int n3, final int n4) {
        if (n3 == 0) {
            a326(n, n2, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        if (gf_._h <= gf_._j || gf_._e <= gf_._f) {
            return;
        }
        if (n + n3 < gf_._j || n - n3 >= gf_._h || n2 + n3 < gf_._f || n2 - n3 >= gf_._e) {
            return;
        }
        int n6;
        int n5 = n6 = n + n2 * gf_._i;
        int n7 = n5 - n3 * gf_._i;
        int n8 = n5 + n3 * gf_._i;
        int n9 = n3;
        int n10 = 0;
        n3 *= n3;
        int n11 = n3 - n9;
        if (n - n9 < gf_._j || n + n9 >= gf_._h || n2 - n9 < gf_._f || n2 + n9 >= gf_._e) {
            if (n - n9 >= gf_._j && n2 >= gf_._f && n2 < gf_._e) {
                gf_._b[n5 - n9] = n4;
            }
            if (n + n9 < gf_._h && n2 >= gf_._f && n2 < gf_._e) {
                gf_._b[n5 + n9] = n4;
            }
            if (n2 - n9 >= gf_._f && n >= gf_._j && n < gf_._h) {
                gf_._b[n7] = n4;
            }
            if (n2 + n9 < gf_._e && n >= gf_._j && n < gf_._h) {
                gf_._b[n8] = n4;
            }
            while (true) {
                n11 += n10 + ++n10;
                n5 -= gf_._i;
                n6 += gf_._i;
                if (n11 > n3) {
                    n11 -= --n9 + n9;
                    n7 += gf_._i;
                    n8 -= gf_._i;
                }
                if (n9 < n10) {
                    break;
                }
                if (n2 - n9 >= gf_._f && n2 - n9 < gf_._e) {
                    if (n - n10 >= gf_._j && n - n10 < gf_._h) {
                        gf_._b[n7 - n10] = n4;
                    }
                    if (n + n10 >= gf_._j && n + n10 < gf_._h) {
                        gf_._b[n7 + n10] = n4;
                    }
                }
                if (n2 - n10 >= gf_._f && n2 - n10 < gf_._e) {
                    if (n - n9 >= gf_._j && n - n9 < gf_._h) {
                        gf_._b[n5 - n9] = n4;
                    }
                    if (n + n9 >= gf_._j && n + n9 < gf_._h) {
                        gf_._b[n5 + n9] = n4;
                    }
                }
                if (n2 + n10 >= gf_._f && n2 + n10 < gf_._e) {
                    if (n - n9 >= gf_._j && n - n9 < gf_._h) {
                        gf_._b[n6 - n9] = n4;
                    }
                    if (n + n9 >= gf_._j && n + n9 < gf_._h) {
                        gf_._b[n6 + n9] = n4;
                    }
                }
                if (n2 + n9 < gf_._f || n2 + n9 >= gf_._e) {
                    continue;
                }
                if (n - n10 >= gf_._j && n - n10 < gf_._h) {
                    gf_._b[n8 - n10] = n4;
                }
                if (n + n10 < gf_._j || n + n10 >= gf_._h) {
                    continue;
                }
                gf_._b[n8 + n10] = n4;
            }
        }
        else {
            gf_._b[n5 - n9] = n4;
            gf_._b[n5 + n9] = n4;
            gf_._b[n7] = n4;
            gf_._b[n8] = n4;
            while (true) {
                n11 += n10 + ++n10;
                n5 -= gf_._i;
                n6 += gf_._i;
                if (n11 > n3) {
                    n11 -= --n9 + n9;
                    n7 += gf_._i;
                    n8 -= gf_._i;
                }
                if (n9 < n10) {
                    break;
                }
                gf_._b[n7 - n10] = n4;
                gf_._b[n7 + n10] = n4;
                gf_._b[n5 - n9] = n4;
                gf_._b[n5 + n9] = n4;
                gf_._b[n6 - n9] = n4;
                gf_._b[n6 + n9] = n4;
                gf_._b[n8 - n10] = n4;
                gf_._b[n8 + n10] = n4;
            }
        }
    }
    
    static final void f115(final int n, int n2, int n3, final int n4) {
        if (n3 == 0) {
            a326(n, n2, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        int f = n2 - n3;
        if (f < gf_._f) {
            f = gf_._f;
        }
        int e = n2 + n3 + 1;
        if (e > gf_._e) {
            e = gf_._e;
        }
        int i = f;
        final int n5 = n3 * n3;
        int n6 = 0;
        int n7 = n2 - i;
        int n8 = n7 * n7;
        int n9 = n8 - n7;
        if (n2 > e) {
            n2 = e;
        }
        while (i < n2) {
            while (n9 <= n5 || n8 <= n5) {
                n8 += n6 + n6;
                n9 += n6 + ++n6;
            }
            int j = n - n6 + 1;
            if (j < gf_._j) {
                j = gf_._j;
            }
            int h = n + n6;
            if (h > gf_._h) {
                h = gf_._h;
            }
            int n10 = j + i * gf_._i;
            for (int k = j; k < h; ++k) {
                gf_._b[n10++] = n4;
            }
            ++i;
            n8 -= n7 + --n7;
            n9 -= n7 + n7;
        }
        int n11 = n3;
        int n12 = i - n2;
        final int n13 = n12 * n12 + n5;
        for (int n14 = n13 - n11, n15 = n13 - n12; i < e; ++i, n15 += n12 + n12, n14 += n12 + ++n12) {
            while (n15 > n5 && n14 > n5) {
                n15 -= n11 + --n11;
                n14 -= n11 + n11;
            }
            int l = n - n11;
            if (l < gf_._j) {
                l = gf_._j;
            }
            int n16 = n + n11;
            if (n16 > gf_._h - 1) {
                n16 = gf_._h - 1;
            }
            int n17 = l + i * gf_._i;
            for (int n18 = l; n18 <= n16; ++n18) {
                gf_._b[n17++] = n4;
            }
        }
    }
    
    static final void a397(final int[] b, final int i, final int c) {
        gf_._b = b;
        e115(0, 0, gf_._i = i, gf_._c = c);
    }
    
    static final void e050(final int n, final int n2, final int n3, final int n4, final int n5) {
        b115(n, n2, n3, n5);
        b115(n, n2 + n4 - 1, n3, n5);
        c115(n, n2, n4, n5);
        c115(n + n3 - 1, n2, n4, n5);
    }
    
    private static final void a555(int n, int n2, int n3, int n4, int n5, final int n6, final int n7, int n8, final int[] array, final int n9, final int[] array2, final int n10, final int n11, final int n12, int n13, int n14, final int n15, int i) {
        while (i < 0) {
            n4 = n13;
            n5 = n11;
            for (int j = n12; j < 0; ++j) {
                if (n4 < n7) {
                    n = array2[(n7 - n4) * n9 / n7];
                    n2 = array[n8];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array[n8] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                ++n8;
                n4 += n5;
                n5 += n6;
            }
            n8 += n10;
            n13 += n14;
            n14 += n15;
            ++i;
        }
    }
    
    static final void a669(final int n, final int n2, final int n3, final int n4, int n5, final int n6) {
        if (n5 == 0) {
            b050(n, n2, n3, n4, n6);
            return;
        }
        if (n5 < 0) {
            n5 = -n5;
        }
        final int n7 = n + n5;
        int n8 = n2 + n5;
        int f = n2;
        if (f < gf_._f) {
            f = gf_._f;
        }
        int e = n2 + n4;
        if (e > gf_._e) {
            e = gf_._e;
        }
        final int n9 = n3 - n5 - n5 - 1;
        int i = f;
        final int n10 = n5 * n5;
        int n11 = 0;
        int n12 = n8 - i;
        int n13 = n12 * n12;
        int n14 = n13 - n12;
        if (n8 > e) {
            n8 = e;
        }
        while (i < n8) {
            while (n14 <= n10 || n13 <= n10) {
                n13 += n11 + n11;
                n14 += n11 + ++n11;
            }
            int j = n7 - n11 + 1;
            if (j < gf_._j) {
                j = gf_._j;
            }
            int h = n7 + n9 + n11;
            if (h > gf_._h) {
                h = gf_._h;
            }
            int n15 = j + i * gf_._i;
            for (int k = j; k < h; ++k) {
                gf_._b[n15++] = n6;
            }
            ++i;
            n13 -= n12 + --n12;
            n14 -= n12 + n12;
        }
        int l = n;
        if (l < gf_._j) {
            l = gf_._j;
        }
        int h2 = n + n3;
        if (h2 > gf_._h) {
            h2 = gf_._h;
        }
        int n16 = l + i * gf_._i;
        final int n17 = gf_._i + l - h2;
        int e2 = n2 + n4 - n5 - 1;
        if (e2 > gf_._e) {
            e2 = gf_._e;
        }
        while (i < e2) {
            for (int n18 = l; n18 < h2; ++n18) {
                gf_._b[n16++] = n6;
            }
            ++i;
            n16 += n17;
        }
        int n19 = 0;
        int n20 = n5;
        final int n21 = n19 * n19 + n10;
        for (int n22 = n21 - n20, n23 = n21 - n19; i < e; ++i, n23 += n19 + n19, n22 += n19 + ++n19) {
            while (n23 > n10 && n22 > n10) {
                n23 -= n20 + --n20;
                n22 -= n20 + n20;
            }
            int m = n7 - n20;
            if (m < gf_._j) {
                m = gf_._j;
            }
            int n24 = n7 + n9 + n20;
            if (n24 > gf_._h - 1) {
                n24 = gf_._h - 1;
            }
            int n25 = m + i * gf_._i;
            for (int n26 = m; n26 <= n24; ++n26) {
                gf_._b[n25++] = n6;
            }
        }
    }
    
    static final void a050(final int n, final int n2, final int n3, final int n4, final int n5) {
        for (int i = 0; i < 4; ++i) {
            final int n6 = 128 - (i << 5);
            d050(n + i, n2 + n4 + i, n3, n5, n6);
            f050(n + n3 + i, n2 + i, n4 + 1, n5, n6);
        }
    }
    
    private static final void f050(final int n, int f, int n2, final int n3, final int n4) {
        if (n < gf_._j || n >= gf_._h) {
            return;
        }
        if (f < gf_._f) {
            n2 -= gf_._f - f;
            f = gf_._f;
        }
        if (f + n2 > gf_._e) {
            n2 = gf_._e - f;
        }
        final int n5 = 256 - n4;
        final int n6 = (n3 >> 16 & 0xFF) * n4;
        final int n7 = (n3 >> 8 & 0xFF) * n4;
        final int n8 = (n3 & 0xFF) * n4;
        int n9 = n + f * gf_._i;
        for (int i = 0; i < n2; ++i) {
            gf_._b[n9] = (n6 + (gf_._b[n9] >> 16 & 0xFF) * n5 >> 8 << 16) + (n7 + (gf_._b[n9] >> 8 & 0xFF) * n5 >> 8 << 8) + (n8 + (gf_._b[n9] & 0xFF) * n5 >> 8);
            n9 += gf_._i;
        }
    }
    
    static final void a907(final int n, final int n2, final int n3, final int n4, final int[] array) {
        final int n5 = n3 * n3;
        int f = n2 - n3 >> 4;
        int e = n2 + n3 + 15 >> 4;
        if (f < gf_._f) {
            f = gf_._f;
        }
        if (e > gf_._e) {
            e = gf_._e;
        }
        final int n6 = (f << 4) - n2;
        int n7 = n6 * n6;
        final int n8 = (f + 1 << 4) - n2;
        final int n9 = n8 * n8;
        final int n10 = (f + 2 << 4) - n2;
        final int n11 = n10 * n10;
        int n12 = n9 - n7;
        final int n13 = n11 - n9 - n12;
        int n14 = f * gf_._i;
        final int i = gf_._i;
        for (int j = f - e; j < 0; ++j) {
            int k = n - n3 >> 4;
            int l = n + n3 + 15 >> 4;
            if (k < gf_._j) {
                k = gf_._j;
            }
            if (l > gf_._h) {
                l = gf_._h;
            }
            int n16;
            int n15 = n16 = n + 15 >> 4;
            while (k < n15) {
                final int n17 = k + n15 >> 1;
                final int n18 = (n17 << 4) - n;
                if (n7 + n18 * n18 < n5) {
                    n15 = n17;
                }
                else {
                    k = n17 + 1;
                }
            }
            while (l > n16) {
                final int n19 = n16 + l >> 1;
                final int n20 = (n19 << 4) - n;
                if (n7 + n20 * n20 < n5) {
                    n16 = n19 + 1;
                }
                else {
                    l = n19;
                }
            }
            final int n21 = (k << 4) - n;
            final int n22 = n21 * n21;
            final int n23 = (k + 1 << 4) - n;
            final int n24 = n23 * n23;
            final int n25 = (k + 2 << 4) - n;
            final int n26 = n25 * n25;
            final int n27 = n24 - n22;
            final int n28 = n26 - n24 - n27;
            final int n29 = (l - 1 << 4) - n;
            final int n30 = n29 * n29;
            final int n31 = (l - 2 << 4) - n;
            final int n32 = n31 * n31 - n30;
            if (a398(0, 0, 0, 0, 0, n28, n5, n14 + k, k - l, gf_._b, n4, array, 1, n27, n7 + n22)) {
                a398(0, 0, 0, 0, 0, n28, n5, n14 + l - 1, k - l, gf_._b, n4, array, -1, n32, n7 + n30);
            }
            n14 += i;
            n7 += n12;
            n12 += n13;
        }
    }
    
    private static final boolean a398(int n, int n2, int n3, int n4, int n5, final int n6, final int n7, int n8, int i, final int[] array, final int n9, final int[] array2, final int n10, final int n11, final int n12) {
        n4 = n12;
        n5 = n11;
        while (i < 0) {
            n2 = (n7 - n4) * n9 / n7;
            if (n2 >= array2.length) {
                return true;
            }
            n = array2[n2];
            n2 = array[n8];
            n3 = n + n2;
            n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
            n2 = (n & 0x1000100) + (n3 - n & 0x10000);
            array[n8] = (n3 - n2 | n2 - (n2 >>> 8));
            n8 += n10;
            n4 += n5;
            n5 += n6;
            ++i;
        }
        return false;
    }
    
    static final void a115(final int j, final int f, final int h, final int e) {
        if (gf_._j < j) {
            gf_._j = j;
        }
        if (gf_._f < f) {
            gf_._f = f;
        }
        if (gf_._h > h) {
            gf_._h = h;
        }
        if (gf_._e > e) {
            gf_._e = e;
        }
        d797();
    }
    
    static final void c050(int i, int j, int n, int n2, final int n3) {
        n -= i;
        n2 -= j;
        if (n2 == 0) {
            if (n >= 0) {
                b115(i, j, n + 1, n3);
            }
            else {
                b115(i + n, j, -n + 1, n3);
            }
            return;
        }
        if (n == 0) {
            if (n2 >= 0) {
                c115(i, j, n2 + 1, n3);
            }
            else {
                c115(i, j + n2, -n2 + 1, n3);
            }
            return;
        }
        if (n + n2 < 0) {
            i += n;
            n = -n;
            j += n2;
            n2 = -n2;
        }
        if (n > n2) {
            j <<= 16;
            j += 32768;
            n2 <<= 16;
            final int n4 = (int)Math.floor(n2 / (double)n + 0.5);
            n += i;
            if (i < gf_._j) {
                j += n4 * (gf_._j - i);
                i = gf_._j;
            }
            if (n >= gf_._h) {
                n = gf_._h - 1;
            }
            while (i <= n) {
                final int n5 = j >> 16;
                if (n5 >= gf_._f && n5 < gf_._e) {
                    gf_._b[i + n5 * gf_._i] = n3;
                }
                j += n4;
                ++i;
            }
        }
        else {
            i <<= 16;
            i += 32768;
            n <<= 16;
            final int n6 = (int)Math.floor(n / (double)n2 + 0.5);
            n2 += j;
            if (j < gf_._f) {
                i += n6 * (gf_._f - j);
                j = gf_._f;
            }
            if (n2 >= gf_._e) {
                n2 = gf_._e - 1;
            }
            while (j <= n2) {
                final int n7 = i >> 16;
                if (n7 >= gf_._j && n7 < gf_._h) {
                    gf_._b[n7 + j * gf_._i] = n3;
                }
                i += n6;
                ++j;
            }
        }
    }
    
    static {
        gf_._e = 0;
        gf_._h = 0;
        gf_._j = 0;
        gf_._f = 0;
    }
}
