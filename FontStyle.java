final class FontStyle extends se_
{
    private byte[][] _T;
    
    FontStyle(final byte[] array, final int[] array2, final int[] array3, final int[] array4, final int[] array5, final byte[][] t) {
        super(array, array2, array3, array4, array5);
        this._T = new byte[256][];
        this._T = t;
    }
    
    @Override
    final void a033(final int n, int j, int f, int n2, int n3, final int n4, final boolean b) {
        int n5 = j + f * gf_._i;
        int n6 = gf_._i - n2;
        int n7 = 0;
        int n8 = 0;
        if (f < gf_._f) {
            final int n9 = gf_._f - f;
            n3 -= n9;
            f = gf_._f;
            n8 += n9 * n2;
            n5 += n9 * gf_._i;
        }
        if (f + n3 > gf_._e) {
            n3 -= f + n3 - gf_._e;
        }
        if (j < gf_._j) {
            final int n10 = gf_._j - j;
            n2 -= n10;
            j = gf_._j;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (j + n2 > gf_._h) {
            final int n11 = j + n2 - gf_._h;
            n2 -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n2 <= 0 || n3 <= 0) {
            return;
        }
        if (gf_._g != null) {
            a493(gf_._b, this._T[n], j, f, n2, n3, n4, n8, n5, n6, n7, gf_._g, gf_._l);
        }
        else {
            a111(gf_._b, this._T[n], n4, n8, n5, n2, n3, n6, n7);
        }
    }
    
    @Override
    final void a566(final int n, int j, int f, int n2, int n3, final int n4, final int n5, final boolean b) {
        int n6 = j + f * gf_._i;
        int n7 = gf_._i - n2;
        int n8 = 0;
        int n9 = 0;
        if (f < gf_._f) {
            final int n10 = gf_._f - f;
            n3 -= n10;
            f = gf_._f;
            n9 += n10 * n2;
            n6 += n10 * gf_._i;
        }
        if (f + n3 > gf_._e) {
            n3 -= f + n3 - gf_._e;
        }
        if (j < gf_._j) {
            final int n11 = gf_._j - j;
            n2 -= n11;
            j = gf_._j;
            n9 += n11;
            n6 += n11;
            n8 += n11;
            n7 += n11;
        }
        if (j + n2 > gf_._h) {
            final int n12 = j + n2 - gf_._h;
            n2 -= n12;
            n8 += n12;
            n7 += n12;
        }
        if (n2 <= 0 || n3 <= 0) {
            return;
        }
        a038(gf_._b, this._T[n], n4, n9, n6, n2, n3, n7, n8, n5);
    }
    
    static final void a038(final int[] array, final byte[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, int n8) {
        n = ((n & 0xFF00FF) * n8 & 0xFF00FF00) + ((n & 0xFF00) * n8 & 0xFF0000) >> 8;
        n8 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    final int n9 = array[n3];
                    array[n3++] = (((n9 & 0xFF00FF) * n8 & 0xFF00FF00) + ((n9 & 0xFF00) * n8 & 0xFF0000) >> 8) + n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    static final void a111(final int[] array, final byte[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    private static final void a493(final int[] array, final byte[] array2, final int n, final int n2, final int n3, final int n4, final int n5, int n6, int n7, final int n8, final int n9, final int[] array3, final int[] array4) {
        final int n10 = n - gf_._j;
        int i = 0;
        while (i < (i = n2 - gf_._f) + n4) {
            final int n11 = array3[i];
            int n12 = array4[i];
            int n13 = n3;
            Label_0245: {
                if (n10 > n11) {
                    final int n14 = n10 - n11;
                    if (n14 >= n12) {
                        n6 += n3 + n9;
                        n7 += n3 + n8;
                        break Label_0245;
                    }
                    n12 -= n14;
                }
                else {
                    final int n15 = n11 - n10;
                    if (n15 >= n3) {
                        n6 += n3 + n9;
                        n7 += n3 + n8;
                        break Label_0245;
                    }
                    n6 += n15;
                    n13 -= n15;
                    n7 += n15;
                }
                int n16 = 0;
                if (n13 < n12) {
                    n12 = n13;
                }
                else {
                    n16 = n13 - n12;
                }
                for (int j = -n12; j < 0; ++j) {
                    if (array2[n6++] != 0) {
                        gf_._b[n7++] = n5;
                    }
                    else {
                        ++n7;
                    }
                }
                n6 += n16 + n9;
                n7 += n16 + n8;
            }
            ++i;
        }
    }
}
