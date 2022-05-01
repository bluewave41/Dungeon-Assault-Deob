final class ej_
{
    private static dc_ _a;
    
    static final int a265(final byte[] g, int a, final byte[] d, final int n, final int h) {
        synchronized (ej_._a) {
            ej_._a._d = d;
            ej_._a._h = h;
            ej_._a._G = g;
            ej_._a._a = 0;
            ej_._a._A = a;
            ej_._a._F = 0;
            ej_._a._j = 0;
            ej_._a._N = 0;
            ej_._a._P = 0;
            e483(ej_._a);
            a -= ej_._a._A;
            ej_._a._d = null;
            ej_._a._G = null;
            return a;
        }
    }
    
    private static final void d483(final dc_ dc_) {
        byte o = dc_._O;
        int b = dc_._b;
        int i = dc_._L;
        int c = dc_._c;
        final int[] w = hj_._W;
        int t = dc_._t;
        final byte[] g = dc_._G;
        int a = dc_._a;
        final int a2;
        int j = a2 = dc_._A;
        final int n = dc_._u + 1;
    Label_0370:
        while (true) {
            Label_0123: {
                if (b > 0) {
                    while (j != 0) {
                        if (b == 1) {
                            if (j == 0) {
                                b = 1;
                                break;
                            }
                            g[a] = o;
                            ++a;
                            --j;
                            break Label_0123;
                        }
                        else {
                            g[a] = o;
                            --b;
                            ++a;
                            --j;
                        }
                    }
                    break;
                }
            }
            while (i != n) {
                o = (byte)c;
                final int n2 = w[t];
                final byte b2 = (byte)n2;
                t = n2 >> 8;
                ++i;
                if (b2 != c) {
                    c = b2;
                    if (j == 0) {
                        b = 1;
                        break Label_0370;
                    }
                    g[a] = o;
                    ++a;
                    --j;
                }
                else if (i == n) {
                    if (j == 0) {
                        b = 1;
                        break Label_0370;
                    }
                    g[a] = o;
                    ++a;
                    --j;
                }
                else {
                    b = 2;
                    final int n3 = w[t];
                    final byte b3 = (byte)n3;
                    t = n3 >> 8;
                    if (++i == n) {
                        continue Label_0370;
                    }
                    if (b3 != c) {
                        c = b3;
                        continue Label_0370;
                    }
                    b = 3;
                    final int n4 = w[t];
                    final byte b4 = (byte)n4;
                    t = n4 >> 8;
                    if (++i == n) {
                        continue Label_0370;
                    }
                    if (b4 != c) {
                        c = b4;
                        continue Label_0370;
                    }
                    final int n5 = w[t];
                    final byte b5 = (byte)n5;
                    final int n6 = n5 >> 8;
                    ++i;
                    b = (b5 & 0xFF) + 4;
                    final int n7 = w[n6];
                    c = (byte)n7;
                    t = n7 >> 8;
                    ++i;
                    continue Label_0370;
                }
            }
            b = 0;
            break;
        }
        final int p = dc_._P;
        dc_._P += a2 - j;
        if (dc_._P < p) {}
        dc_._O = o;
        dc_._b = b;
        dc_._L = i;
        dc_._c = c;
        hj_._W = w;
        dc_._t = t;
        dc_._G = g;
        dc_._a = a;
        dc_._A = j;
    }
    
    public static void a797() {
        ej_._a = null;
    }
    
    final private static void e483(dc_ a) {
        a._o = 1;
        if (hj_._W == null) {
            hj_._W = new int[a._o * 100000];
        }
        boolean b = true;
        while(b) {
            if ((int)ej_.a503(a) == 23) {
                return;
            }
            ej_.a503(a);
            ej_.a503(a);
            ej_.a503(a);
            ej_.a503(a);
            ej_.a503(a);
            ej_.a503(a);
            ej_.a503(a);
            ej_.a503(a);
            ej_.a503(a);
            ej_.c503(a);
            a._I = 0;
            int i = ej_.a503(a);
            a._I = a._I << 8 | i & 255;
            int i0 = ej_.a503(a);
            a._I = a._I << 8 | i0 & 255;
            int i1 = ej_.a503(a);
            a._I = a._I << 8 | i1 & 255;
            int i2 = 0;
            for(; i2 < 16; i2 = i2 + 1) {
                if ((int)ej_.c503(a) != 1) {
                    a._n[i2] = false;
                } else {
                    a._n[i2] = true;
                }
            }
            int i3 = 0;
            for(; i3 < 256; i3 = i3 + 1) {
                a._E[i3] = false;
            }
            int i4 = 0;
            for(; i4 < 16; i4 = i4 + 1) {
                if (a._n[i4]) {
                    int i5 = 0;
                    for(; i5 < 16; i5 = i5 + 1) {
                        if ((int)ej_.c503(a) == 1) {
                            a._E[i4 * 16 + i5] = true;
                        }
                    }
                }
            }
            ej_.b483(a);
            int i6 = a._M + 2;
            int i7 = ej_.a431(3, a);
            int i8 = ej_.a431(15, a);
            int i9 = 0;
            for(; i9 < i8; i9 = i9 + 1) {
                int i10 = 0;
                while((int)ej_.c503(a) != 0) {
                    i10 = i10 + 1;
                }
                a._g[i9] = (byte)(int)(byte)i10;
            }
            byte[] a0 = new byte[6];
            int i11 = 0;
            for(; i11 < i7; i11 = (byte)(i11 + 1)) {
                a0[i11] = (byte)i11;
            }
            int i12 = 0;
            for(; i12 < i8; i12 = i12 + 1) {
                int i13 = a._g[i12];
                int i14 = a0[i13];
                for(; i13 > 0; i13 = (byte)(i13 - 1)) {
                    a0[i13] = (byte)(int)a0[i13 - 1];
                }
                a0[0] = (byte)i14;
                a._J[i12] = (byte)i14;
            }
            int i15 = 0;
            for(; i15 < i7; i15 = i15 + 1) {
                int i16 = ej_.a431(5, a);
                int i17 = 0;
                for(; i17 < i6; i17 = i17 + 1) {
                    while((int)ej_.c503(a) != 0) {
                        i16 = ((int)ej_.c503(a) != 0) ? i16 + -1 : i16 + 1;
                    }
                    a._r[i15][i17] = (byte)(int)(byte)i16;
                }
            }
            int i18 = 0;
            for(; i18 < i7; i18 = i18 + 1) {
                int i19 = 32;
                int i20 = 0;
                int i21 = 0;
                for(; i21 < i6; i21 = i21 + 1) {
                    if ((int)a._r[i18][i21] > i20) {
                        i20 = a._r[i18][i21];
                    }
                    if ((int)a._r[i18][i21] < i19) {
                        i19 = a._r[i18][i21];
                    }
                }
                ej_.a701(a._f[i18], a._B[i18], a._D[i18], a._r[i18], i19, i20, i6);
                a._w[i18] = i19;
            }
            int i22 = a._M + 1;
            int i23 = 0;
            for(; i23 <= 255; i23 = i23 + 1) {
                a._s[i23] = 0;
            }
            int i24 = 15;
            int i25 = 4095;
            for(; i24 >= 0; i24 = i24 + -1) {
                int i26 = 15;
                for(; i26 >= 0; i26 = i26 + -1) {
                    a._y[i25] = (byte)(int)(byte)(i24 * 16 + i26);
                    i25 = i25 + -1;
                }
                a._m[i24] = i25 + 1;
            }
            int i27 = a._J[0];
            int i28 = a._w[i27];
            int[] a1 = a._f[i27];
            int[] a2 = a._D[i27];
            int[] a3 = a._B[i27];
            int i29 = ej_.a431(i28, a);
            int i30 = i28;
            while(i29 > a1[i30]) {
                i30 = i30 + 1;
                i29 = i29 << 1 | (int)ej_.c503(a);
            }
            int i31 = a2[i29 - a3[i30]];
            int i32 = 0;
            int i33 = 49;
            int i34 = 0;
            label1: while(i31 != i22) {
                {
                    if (i31 != 0 && i31 != 1) {
                        int i35 = 0;
                        int i36 = i31 - 1;
                        if (i36 >= 16) {
                            int i37 = i36 / 16;
                            int i38 = i36 % 16;
                            int i39 = a._m[i37] + i38;
                            i35 = a._y[i39];
                            for(; i39 > a._m[i37]; i39 = i39 + -1) {
                                a._y[i39] = (byte)(int)a._y[i39 - 1];
                            }
                            int[] a4 = a._m;
                            a4[i37] = a4[i37] + 1;
                            for(; i37 > 0; i37 = i37 + -1) {
                                int[] a5 = a._m;
                                a5[i37] = a5[i37] - 1;
                                a._y[a._m[i37]] = (byte)(int)a._y[a._m[i37 - 1] + 16 - 1];
                            }
                            int[] a6 = a._m;
                            a6[0] = a6[0] - 1;
                            a._y[a._m[0]] = (byte)i35;
                            if (a._m[0] == 0) {
                                int i40 = 15;
                                int i41 = 4095;
                                for(; i40 >= 0; i40 = i40 + -1) {
                                    int i42 = 15;
                                    for(; i42 >= 0; i42 = i42 + -1) {
                                        a._y[i41] = (byte)(int)a._y[a._m[i40] + i42];
                                        i41 = i41 + -1;
                                    }
                                    a._m[i40] = i41 + 1;
                                }
                            }
                        } else {
                            int i43 = a._m[0];
                            i35 = a._y[i43 + i36];
                            for(; i36 > 3; i36 = i36 + -4) {
                                int i44 = i43 + i36;
                                a._y[i44] = (byte)(int)a._y[i44 - 1];
                                a._y[i44 - 1] = (byte)(int)a._y[i44 - 2];
                                a._y[i44 - 2] = (byte)(int)a._y[i44 - 3];
                                a._y[i44 - 3] = (byte)(int)a._y[i44 - 4];
                            }
                            for(; i36 > 0; i36 = i36 + -1) {
                                a._y[i43 + i36] = (byte)(int)a._y[i43 + i36 - 1];
                            }
                            a._y[i43] = (byte)i35;
                        }
                        int[] a7 = a._s;
                        int i45 = (int)a._C[i35 & 255] & 255;
                        a7[i45] = a7[i45] + 1;
                        hj_._W[i34] = (int)a._C[i35 & 255] & 255;
                        i34 = i34 + 1;
                        if (i33 == 0) {
                            i32 = i32 + 1;
                            int i46 = a._J[i32];
                            i28 = a._w[i46];
                            a1 = a._f[i46];
                            a2 = a._D[i46];
                            a3 = a._B[i46];
                            i33 = 50;
                        }
                        i33 = i33 + -1;
                        int i47 = ej_.a431(i28, a);
                        int i48 = i28;
                        while(i47 > a1[i48]) {
                            i48 = i48 + 1;
                            i47 = i47 << 1 | (int)ej_.c503(a);
                        }
                        i31 = a2[i47 - a3[i48]];
                        continue label1;
                    }
                    int i49 = -1;
                    int i50 = 1;
                    label0: while(true) {
                        if (i31 != 0) {
                            if (i31 == 1) {
                                i49 = i49 + 2 * i50;
                            }
                        } else {
                            i49 = i49 + 1 * i50;
                        }
                        i50 = i50 * 2;
                        if (i33 == 0) {
                            i32 = i32 + 1;
                            int i51 = a._J[i32];
                            i28 = a._w[i51];
                            a1 = a._f[i51];
                            a2 = a._D[i51];
                            a3 = a._B[i51];
                            i33 = 50;
                        }
                        i33 = i33 + -1;
                        int i52 = ej_.a431(i28, a);
                        int i53 = i28;
                        while(i52 > a1[i53]) {
                            i53 = i53 + 1;
                            i52 = i52 << 1 | (int)ej_.c503(a);
                        }
                        i31 = a2[i52 - a3[i53]];
                        {
                            if (i31 == 0) {
                                continue label0;
                            }
                            if (i31 == 1) {
                                continue label0;
                            }
                            int i54 = i49 + 1;
                            int i55 = a._C[(int)a._y[a._m[0]] & 255];
                            int[] a8 = a._s;
                            int i56 = i55 & 255;
                            a8[i56] = a8[i56] + i54;
                            for(; i54 > 0; i54 = i54 + -1) {
                                hj_._W[i34] = i55 & 255;
                                i34 = i34 + 1;
                            }
                            break;
                        }
                    }
                }
            }
            a._b = 0;
            a._O = (byte)0;
            a._i[0] = 0;
            int i57 = 1;
            for(; i57 <= 256; i57 = i57 + 1) {
                a._i[i57] = a._s[i57 - 1];
            }
            int i58 = 1;
            for(; i58 <= 256; i58 = i58 + 1) {
                int[] a9 = a._i;
                a9[i58] = a9[i58] + a._i[i58 - 1];
            }
            int i59 = 0;
            for(; i59 < i34; i59 = i59 + 1) {
                int i60 = (byte)(hj_._W[i59] & 255);
                int[] a10 = hj_._W;
                int i61 = a._i[i60 & 255];
                a10[i61] = a10[i61] | i59 << 8;
                int[] a11 = a._i;
                int i62 = i60 & 255;
                a11[i62] = a11[i62] + 1;
            }
            a._t = hj_._W[a._I] >> 8;
            a._L = 0;
            a._t = hj_._W[a._t];
            a._c = (int)(byte)(a._t & 255);
            a._t = a._t >> 8;
            a._L = a._L + 1;
            a._u = i34;
            ej_.d483(a);
            {
                if (a._L == a._u + 1 && a._b == 0) {
                    b = true;
                    continue;
                }
                b = false;
            }
        }
    }
    
    private static final byte c503(final dc_ dc_) {
        return (byte)a431(1, dc_);
    }
    
    private static final void a701(final int[] array, final int[] array2, final int[] array3, final byte[] array4, final int n, final int n2, final int n3) {
        int n4 = 0;
        for (int i = n; i <= n2; ++i) {
            for (int j = 0; j < n3; ++j) {
                if (array4[j] == i) {
                    array3[n4] = j;
                    ++n4;
                }
            }
        }
        for (int k = 0; k < 23; ++k) {
            array2[k] = 0;
        }
        for (int l = 0; l < n3; ++l) {
            final int n5 = array4[l] + 1;
            ++array2[n5];
        }
        for (int n6 = 1; n6 < 23; ++n6) {
            final int n7 = n6;
            array2[n7] += array2[n6 - 1];
        }
        for (int n8 = 0; n8 < 23; ++n8) {
            array[n8] = 0;
        }
        int n9 = 0;
        for (int n10 = n; n10 <= n2; ++n10) {
            final int n11 = n9 + (array2[n10 + 1] - array2[n10]);
            array[n10] = n11 - 1;
            n9 = n11 << 1;
        }
        for (int n12 = n + 1; n12 <= n2; ++n12) {
            array2[n12] = (array[n12 - 1] + 1 << 1) - array2[n12];
        }
    }
    
    private static final byte a503(final dc_ dc_) {
        return (byte)a431(8, dc_);
    }
    
    private static final void b483(final dc_ dc_) {
        dc_._M = 0;
        for (int i = 0; i < 256; ++i) {
            if (dc_._E[i]) {
                dc_._C[dc_._M] = (byte)i;
                ++dc_._M;
            }
        }
    }
    
    private static final int a431(final int n, final dc_ dc_) {
        while (dc_._F < n) {
            dc_._j = (dc_._j << 8 | (dc_._d[dc_._h] & 0xFF));
            dc_._F += 8;
            ++dc_._h;
            ++dc_._N;
            if (dc_._N == 0) {
                continue;
            }
        }
        final int n2 = dc_._j >> dc_._F - n & (1 << n) - 1;
        dc_._F -= n;
        return n2;
    }
    
    static {
        ej_._a = new dc_();
    }
}
