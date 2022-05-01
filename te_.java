import java.util.*;

final class te_
{
    private static double[] _a;
    
    static final void a812(int j, final int n, int n2, final int[] array) {
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
        int n3 = n * gf_._i + j;
        while (--n2 >= 0) {
            int n4 = 16 + (int)(32.0 * c503(j + 102, n - 43, 0.125));
            if (n4 < 0) {
                n4 = 0;
            }
            if (n4 > 31) {
                n4 = 31;
            }
            gf_._b[n3] = array[n4];
            ++j;
            ++n3;
        }
    }
    
    static final int[] b285(final int n, final int n2, final double n3) {
        final int[] array = new int[n * n2];
        int n4 = 0;
        final double[][] a137 = a137(n, n2, n3);
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j, ++n4) {
                double n5 = ((j == n - 1) ? a137[n - 1][i] : a137[j + 1][i]) - ((j == 0) ? a137[0][i] : a137[j - 1][i]);
                if (j == 0 || j == n - 1) {
                    n5 *= 2.0;
                }
                double n6 = ((i == n2 - 1) ? a137[j][n2 - 1] : a137[j][i + 1]) - ((i == 0) ? a137[j][0] : a137[j][i - 1]);
                if (i == 0 || i == n2 - 1) {
                    n6 *= 2.0;
                }
                final ve_ ve_ = new ve_((int)(n5 * 65536.0), (int)(n6 * 65536.0), (int)(1.0 * 65536.0));
                ve_.b487(true);
                int n7 = ve_._d >> 10;
                int n8 = ve_._f >> 10;
                int n9 = ve_._b >> 10;
                if (n7 < -256) {
                    n7 = -256;
                }
                if (n7 > 255) {
                    n7 = 255;
                }
                if (n8 < -256) {
                    n8 = -256;
                }
                if (n8 > 255) {
                    n8 = 255;
                }
                if (n9 < -256) {
                    n9 = -256;
                }
                if (n9 > 255) {
                    n9 = 255;
                }
                array[n4] = (0xFF000000 | (n7 & 0xFF) << 16 | (n8 & 0xFF) << 8 | (n9 & 0xFF));
            }
        }
        return array;
    }
    
    public static void a797() {
        te_._a = null;
    }
    
    static final double c503(final int n, final int n2, double n3) {
        double n4 = 0.0;
        double n5 = 1.0;
        for (int i = 0; i < 8; ++i) {
            n4 += a315(n * n3, n2 * n3) * n5;
            n5 *= 0.5;
            n3 *= 2.0;
        }
        return n4;
    }
    
    private static final double a327(final double n) {
        final int n2 = (int)n;
        final double n3 = n - n2;
        final double b132 = b132(n2);
        return b132 + (b132(n2 + 1) - b132) * n3;
    }
    
    private static final double a938(final int n, final int n2, final int n3, double n4) {
        double n5 = 0.0;
        double n6 = 1.0;
        for (int i = 0; i < 8; ++i) {
            n5 += a943(n * n4, n2 * n4, n3 * n4) * n6;
            n6 *= 0.5;
            n4 *= 2.0;
        }
        return n5;
    }
    
    static final Graphic a824(final int n, final int n2, final int n3, final int[] array, final int n4, final int n5, final double n6) {
        final Graphic cn_ = new Graphic(n, n2);
        final int[] b = cn_._B;
        int n7 = 0;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                int n8 = n4 + (int)(n5 * a938(j, i, n3, n6));
                if (n8 < 0) {
                    n8 = 0;
                }
                if (n8 >= array.length) {
                    n8 = array.length - 1;
                }
                b[n7++] = array[n8];
            }
        }
        return cn_;
    }
    
    static final double a132(final int n) {
        double n2 = 0.0;
        double n3 = 1.0;
        for (int i = 0; i < 8; ++i) {
            n2 += a327(n * (double)(1 << i) * 0.015625) * n3;
            n3 *= 0.5;
        }
        return n2;
    }
    
    private static final double[][] a137(final int n, final int n2, final double n3) {
        final double[][] array = new double[n][n2];
        if (te_._a == null) {
            b797();
        }
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                array[j][i] = c503(j, i, n3);
            }
        }
        return array;
    }
    
    static final void b812(final int n, int f, int n2, final int[] array) {
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
        int n3 = f * gf_._i + n;
        while (--n2 >= 0) {
            int n4 = 16 + (int)(32.0 * c503(n + 102, f - 43, 0.125));
            if (n4 < 0) {
                n4 = 0;
            }
            if (n4 > 31) {
                n4 = 31;
            }
            gf_._b[n3] = array[n4];
            ++f;
            n3 += gf_._i;
        }
    }
    
    //original signature: static final Graphic a983(final int n, final int n2, final int[] array, final int n3, final int n4, final double n5) {
    static final Graphic a983(final int width, final int height, final int[] array, final int n3, final int n4, final double n5) {
        final Graphic cn_ = new Graphic(width, height);
        final int[] b = cn_._B;
        int n6 = 0;
        if (te_._a == null) {
            b797();
        }
        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                int n7 = n3 + (int)(n4 * c503(j, i, n5));
                if (n7 < 0) {
                    n7 = 0;
                }
                if (n7 >= array.length) {
                    n7 = array.length - 1;
                }
                b[n6++] = array[n7];
            }
        }
        return cn_;
    }
    
    private static final double b132(final int n) {
        return te_._a[n & 0x3FF];
    }
    
    static final void b797() {
        final int n = 1024;
        te_._a = new double[n];
        final Random random = new Random();
        for (int i = n - 1; i >= 0; --i) {
            te_._a[i] = 2.0 * random.nextDouble() - 1.0;
        }
    }
    
    private static final double a943(final double n, final double n2, final double n3) {
        final int n4 = (int)n;
        final int n5 = (int)n2;
        final int n6 = (int)n3;
        final double n7 = n - n4;
        final double n8 = n2 - n5;
        final double n9 = n3 - n6;
        final double a308 = a308(n4, n5, n6);
        final double a309 = a308(n4 + 1, n5, n6);
        final double a310 = a308(n4, n5 + 1, n6);
        final double a311 = a308(n4 + 1, n5 + 1, n6);
        final double a312 = a308(n4, n5, n6 + 1);
        final double a313 = a308(n4 + 1, n5, n6 + 1);
        final double a314 = a308(n4, n5 + 1, n6 + 1);
        final double a315 = a308(n4 + 1, n5 + 1, n6 + 1);
        final double n10 = a308 + (a309 - a308) * n7;
        final double n11 = a310 + (a311 - a310) * n7;
        final double n12 = a312 + (a313 - a312) * n7;
        final double n13 = a314 + (a315 - a314) * n7;
        final double n14 = n10 + (n11 - n10) * n8;
        return n14 + (n12 + (n13 - n12) * n8 - n14) * n9;
    }
    
    private static final double a308(final int n, final int n2, final int n3) {
        return te_._a[n + n2 * 47 + n3 * 19 & 0x3FF];
    }
    
    private static final double a315(final double n, final double n2) {
        final int n3 = (int)n;
        final double n4 = n - n3;
        final int n5 = (int)n2;
        final double n6 = n2 - n5;
        final double a075 = a075(n3, n5);
        final double a76 = a075(n3 + 1, n5);
        final double a77 = a075(n3, n5 + 1);
        final double a78 = a075(n3 + 1, n5 + 1);
        final double n7 = a075 + (a76 - a075) * n4;
        return n7 + (a77 + (a78 - a77) * n4 - n7) * n6;
    }
    
    private static final double a075(final int n, final int n2) {
        return te_._a[n + n2 * 47 & 0x3FF];
    }
}
