final class tj_ extends se_
{
    private byte[][] _T;
    
    private static final void a038(final int[] array, final byte[] array2, final int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                final int n9 = (0xFF & array2[n2++]) * n8 >> 8;
                if (n9 != 0) {
                    final int n10 = ((n & 0xFF00FF) * n9 & 0xFF00FF00) + ((n & 0xFF00) * n9 & 0xFF0000) >> 8;
                    final int n11 = 256 - n9;
                    final int n12 = array[n3];
                    array[n3++] = (((n12 & 0xFF00FF) * n11 & 0xFF00FF00) + ((n12 & 0xFF00) * n11 & 0xFF0000) >> 8) + n10;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
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
        if (b) {
            FontStyle.a038(gf_._b, this._T[n], n4, n9, n6, n2, n3, n7, n8, n5);
        }
        else {
            a038(gf_._b, this._T[n], n4, n9, n6, n2, n3, n7, n8, n5);
        }
    }
    
    tj_(final byte[] array, final int[] array2, final int[] array3, final int[] array4, final int[] array5, final int[] array6, final byte[][] array7) {
        super(array, array2, array3, array4, array5);
        this._T = new byte[256][];
        this._T = a675(array6, array7);
    }
    
    private static final byte[][] a675(final int[] array, final byte[][] array2) {
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i];
            array[i] = ((n >> 15 & 0x1FE) + (n & 0xFF)) / 3 + (n >> 8 & 0xFF) >> 1;
        }
        for (int j = 0; j < array2.length; ++j) {
            final byte[] array3 = array2[j];
            for (int k = 0; k < array3.length; ++k) {
                final byte b = array3[k];
                if (b != 0) {
                    array3[k] = (byte)array[b];
                }
            }
        }
        return array2;
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
        if (b) {
            FontStyle.a111(gf_._b, this._T[n], n4, n8, n5, n2, n3, n6, n7);
        }
        else {
            a111(gf_._b, this._T[n], n4, n8, n5, n2, n3, n6, n7);
        }
    }
    
    private static final void a111(final int[] array, final byte[] array2, final int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7) {
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                final int n8 = 0xFF & array2[n2++];
                if (n8 != 0) {
                    final int n9 = ((n & 0xFF00FF) * n8 & 0xFF00FF00) + ((n & 0xFF00) * n8 & 0xFF0000) >> 8;
                    final int n10 = 256 - n8;
                    final int n11 = array[n3];
                    array[n3++] = (((n11 & 0xFF00FF) * n10 & 0xFF00FF00) + ((n11 & 0xFF00) * n10 & 0xFF0000) >> 8) + n9;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
}
