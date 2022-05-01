final class q_ extends lo_
{
    byte[] _j;
    int[] _i;
    
    final void a115(int n, int n2, int n3, int n4) {
        final int h = super._h;
        final int e = super._e;
        int n5 = 0;
        int n6 = 0;
        final int d = super._d;
        final int g = super._g;
        final int n7 = (d << 16) / n3;
        final int n8 = (g << 16) / n4;
        if (super._b > 0) {
            final int n9 = ((super._b << 16) + n7 - 1) / n7;
            n += n9;
            n5 += n9 * n7 - (super._b << 16);
        }
        if (super._a > 0) {
            final int n10 = ((super._a << 16) + n8 - 1) / n8;
            n2 += n10;
            n6 += n10 * n8 - (super._a << 16);
        }
        if (h < d) {
            n3 = ((h << 16) - n5 + n7 - 1) / n7;
        }
        if (e < g) {
            n4 = ((e << 16) - n6 + n8 - 1) / n8;
        }
        int n11 = n + n2 * gf_._i;
        int n12 = gf_._i - n3;
        if (n2 + n4 > gf_._e) {
            n4 -= n2 + n4 - gf_._e;
        }
        if (n2 < gf_._f) {
            final int n13 = gf_._f - n2;
            n4 -= n13;
            n11 += n13 * gf_._i;
            n6 += n8 * n13;
        }
        if (n + n3 > gf_._h) {
            final int n14 = n + n3 - gf_._h;
            n3 -= n14;
            n12 += n14;
        }
        if (n < gf_._j) {
            final int n15 = gf_._j - n;
            n3 -= n15;
            n11 += n15;
            n5 += n7 * n15;
            n12 += n15;
        }
        a955(gf_._b, this._j, this._i, n5, n6, n11, n12, n3, n4, n7, n8, h);
    }
    
    final void b093(int j, int f) {
        j += super._d - super._h - super._b;
        f += super._a;
        int n = j + f * gf_._i;
        int n2 = super._h - 1;
        int e = super._e;
        int h = super._h;
        int n3 = gf_._i - h;
        int n4 = h + h;
        if (f < gf_._f) {
            final int n5 = gf_._f - f;
            e -= n5;
            f = gf_._f;
            n2 += n5 * h;
            n += n5 * gf_._i;
        }
        if (f + e > gf_._e) {
            e -= f + e - gf_._e;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            h -= n6;
            j = gf_._j;
            n2 -= n6;
            n += n6;
            n4 -= n6;
            n3 += n6;
        }
        if (j + h > gf_._h) {
            final int n7 = j + h - gf_._h;
            h -= n7;
            n4 -= n7;
            n3 += n7;
        }
        if (h <= 0 || e <= 0) {
            return;
        }
        a723(gf_._b, this._j, this._i, 0, n2, n, h, e, n3, n4);
    }
    
    @Override
    final void a093(int j, int f) {
        j += super._b;
        f += super._a;
        int n = j + f * gf_._i;
        int n2 = 0;
        int e = super._e;
        int h = super._h;
        int n3 = gf_._i - h;
        int n4 = 0;
        if (f < gf_._f) {
            final int n5 = gf_._f - f;
            e -= n5;
            f = gf_._f;
            n2 += n5 * h;
            n += n5 * gf_._i;
        }
        if (f + e > gf_._e) {
            e -= f + e - gf_._e;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            h -= n6;
            j = gf_._j;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (j + h > gf_._h) {
            final int n7 = j + h - gf_._h;
            h -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (h <= 0 || e <= 0) {
            return;
        }
        c723(gf_._b, this._j, this._i, 0, n2, n, h, e, n3, n4);
    }
    
    private static final void c723(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = array3[n & 0xFF];
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = array3[n & 0xFF];
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = array3[n & 0xFF];
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = array3[n & 0xFF];
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = array3[n & 0xFF];
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
    final void a326(int j, int f, final int n) {
        j += super._b;
        f += super._a;
        int n2 = j + f * gf_._i;
        int n3 = 0;
        int e = super._e;
        int h = super._h;
        int n4 = gf_._i - h;
        int n5 = 0;
        if (f < gf_._f) {
            final int n6 = gf_._f - f;
            e -= n6;
            f = gf_._f;
            n3 += n6 * h;
            n2 += n6 * gf_._i;
        }
        if (f + e > gf_._e) {
            e -= f + e - gf_._e;
        }
        if (j < gf_._j) {
            final int n7 = gf_._j - j;
            h -= n7;
            j = gf_._j;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (j + h > gf_._h) {
            final int n8 = j + h - gf_._h;
            h -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (h <= 0 || e <= 0) {
            return;
        }
        b723(gf_._b, this._j, this._i, n3, n2, h, e, n4, n5, n);
    }
    
    final Graphic a125() {
        final int n = super._h * super._e;
        final int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = this._i[this._j[i] & 0xFF];
        }
        return new Graphic(super._d, super._g, super._b, super._a, super._h, super._e, array);
    }
    
    final q_ c869() {
        final q_ q_ = new q_(super._h, super._e, this._i.length);
        q_._d = super._d;
        q_._g = super._g;
        q_._b = super._b;
        q_._a = super._a;
        for (int length = this._j.length, i = 0; i < length; ++i) {
            q_._j[i] = this._j[i];
        }
        for (int length2 = this._i.length, j = 0; j < length2; ++j) {
            q_._i[j] = this._i[j];
        }
        return q_;
    }
    
    private static final void a955(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        final int n10 = n;
        for (int i = -n6; i < 0; ++i) {
            final int n11 = (n2 >> 16) * n9;
            for (int j = -n5; j < 0; ++j) {
                final byte b = array2[(n >> 16) + n11];
                if (b != 0) {
                    array[n3++] = array3[b & 0xFF];
                }
                else {
                    ++n3;
                }
                n += n7;
            }
            n2 += n8;
            n = n10;
            n3 += n4;
        }
    }
    
    //something related to graphics
    final q_ d869() {
        final q_ q_ = new q_(super._h, super._e, this._i.length);
        q_._d = super._d;
        q_._g = super._g;
        q_._b = super._d - super._h - super._b;
        q_._a = super._a;
        for (int length = this._i.length, i = 0; i < length; ++i) {
            q_._i[i] = this._i[i];
        }
        for (int j = 0; j < super._e; ++j) {
            for (int k = 0; k < super._h; ++k) {
                q_._j[j * super._h + k] = this._j[j * super._h + super._h - 1 - k];
            }
        }
        return q_;
    }
    
    private static final void a723(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                n = array3[array2[n2--] & 0xFF];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array3[array2[n2--] & 0xFF];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array3[array2[n2--] & 0xFF];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array3[array2[n2--] & 0xFF];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                n = array3[array2[n2--] & 0xFF];
                if (n != 0) {
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
    
    private static final void b723(final int[] array, final byte[] array2, final int[] array3, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n8 = 256 - n7;
        for (int i = -n4; i < 0; ++i) {
            for (int j = -n3; j < 0; ++j) {
                final byte b = array2[n++];
                if (b != 0) {
                    final int n9 = array3[b & 0xFF];
                    final int n10 = array[n2];
                    array[n2++] = ((n9 & 0xFF00FF) * n7 + (n10 & 0xFF00FF) * n8 & 0xFF00FF00) + ((n9 & 0xFF00) * n7 + (n10 & 0xFF00) * n8 & 0xFF0000) >> 8;
                }
                else {
                    ++n2;
                }
            }
            n2 += n5;
            n += n6;
        }
    }
    
    final void b797() {
        int i;
        int n;
        for (i = 0, n = this._j.length - 7; i < n; this._j[i++] = 0, this._j[i++] = 0, this._j[i++] = 0, this._j[i++] = 0, this._j[i++] = 0, this._j[i++] = 0, this._j[i++] = 0, this._j[i++] = 0) {}
        for (n += 7; i < n; this._j[i++] = 0) {}
    }
    
    q_(final int d, final int g, final int b, final int a, final int h, final int e, final byte[] j, final int[] i) {
        super._d = d;
        super._g = g;
        super._b = b;
        super._a = a;
        super._h = h;
        super._e = e;
        this._j = j;
        this._i = i;
    }
    
    q_(final int n, final int n2, final int n3) {
        super._h = n;
        super._d = n;
        super._e = n2;
        super._g = n2;
        super._a = 0;
        super._b = 0;
        this._j = new byte[n * n2];
        this._i = new int[n3];
    }
}
