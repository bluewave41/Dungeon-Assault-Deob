final class ph_
{
    Graphic _a;
    int[] _c;
    //original name: _d
    int imageWidth;
    //original name: _b
    int imageHeight;
    
    private final void e093(int j, int f) {
        j += this._a._w;
        f += this._a._A;
        int n = j + f * gf_._i;
        int n2 = 0;
        int b = this.imageHeight;
        int d = this.imageWidth;
        int n3 = gf_._i - d;
        int n4 = 0;
        if (f < gf_._f) {
            final int n5 = gf_._f - f;
            b -= n5;
            f = gf_._f;
            n2 += n5 * d;
            n += n5 * gf_._i;
        }
        if (f + b > gf_._e) {
            b -= f + b - gf_._e;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            d -= n6;
            j = gf_._j;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (j + d > gf_._h) {
            final int n7 = j + d - gf_._h;
            d -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (d <= 0 || b <= 0) {
            return;
        }
        a415(jh_._f, this._c, n2, n, d, b, n3, n4);
    }
    
    private final void g093(int j, int f) {
        j += this._a._w;
        f += this._a.imageHeight2 - this._a.imageHeight - this._a._A;
        int n = j + (f + this.imageHeight - 1) * gf_._i;
        int n2 = 0;
        int b = this.imageHeight;
        int d = this.imageWidth;
        int n3 = -gf_._i - d;
        int n4 = 0;
        if (f < gf_._f) {
            b -= gf_._f - f;
            f = gf_._f;
        }
        if (f + b > gf_._e) {
            final int n5 = f + b - gf_._e;
            b -= n5;
            n -= n5 * gf_._i;
            n2 += n5 * d;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            d -= n6;
            j = gf_._j;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (j + d > gf_._h) {
            final int n7 = j + d - gf_._h;
            d -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (d <= 0 || b <= 0) {
            return;
        }
        a663(jh_._f, this._c, 0, n2, n, 65280, d, b, n3, n4);
    }
    
    final void h093(final int n, final int n2) {
        this._a.drawImage(n, n2);
        this.d093(n, n2);
    }
    
    static final ph_ a343(final nh_ nh_, final String s, String string) {
        final Graphic a825 = oh_.a825(nh_, s, string);
        string += "_normals";
        if (nh_.b671(string, s, (byte)(-82))) {
            return new ph_(a825, oh_.a825(nh_, s, string));
        }
        return new ph_(a825, a389(a825));
    }
    
    final void f093(final int n, final int n2) {
        this._a.b093(n, n2);
        this.c093(n, n2);
    }
    
    private static final void a415(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6) {
        final int n7 = -(n3 >> 2);
        n3 = -(n3 & 0x3);
        for (int i = -n4; i < 0; ++i) {
            for (int j = n7; j < 0; ++j) {
                array[n2++] = array2[n++];
                array[n2++] = array2[n++];
                array[n2++] = array2[n++];
                array[n2++] = array2[n++];
            }
            for (int k = n3; k < 0; ++k) {
                array[n2++] = array2[n++];
            }
            n2 += n5;
            n += n6;
        }
    }
    
    final void i093(final int n, final int n2) {
        this._a.g093(n, n2);
        this.g093(n, n2);
    }
    
    private final void c093(int j, int f) {
        j += this._a._w;
        f += this._a.imageHeight2 - this.imageHeight - this._a._A;
        int n = j + (f + this.imageHeight - 1) * gf_._i;
        int n2 = this.imageWidth - 1;
        int b = this.imageHeight;
        int d = this.imageWidth;
        int n3 = -gf_._i - d;
        int n4 = d + d;
        if (f < gf_._f) {
            b -= gf_._f - f;
            f = gf_._f;
        }
        if (f + b > gf_._e) {
            final int n5 = f + b - gf_._e;
            b -= n5;
            n -= n5 * gf_._i;
            n2 += n5 * d;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            d -= n6;
            j = gf_._j;
            n2 -= n6;
            n += n6;
            n4 -= n6;
            n3 += n6;
        }
        if (j + d > gf_._h) {
            final int n7 = j + d - gf_._h;
            d -= n7;
            n4 -= n7;
            n3 += n7;
        }
        if (d <= 0 || b <= 0) {
            return;
        }
        b663(jh_._f, this._c, 0, n2, n, 16776960, d, b, n3, n4);
    }
    
    final void d093(int j, int f) {
        j += this._a._w;
        f += this._a._A;
        int n = j + f * gf_._i;
        int n2 = 0;
        int b = this.imageHeight;
        int d = this.imageWidth;
        int n3 = gf_._i - d;
        int n4 = 0;
        if (f < gf_._f) {
            final int n5 = gf_._f - f;
            b -= n5;
            f = gf_._f;
            n2 += n5 * d;
            n += n5 * gf_._i;
        }
        if (f + b > gf_._e) {
            b -= f + b - gf_._e;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            d -= n6;
            j = gf_._j;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (j + d > gf_._h) {
            final int n7 = j + d - gf_._h;
            d -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (d <= 0 || b <= 0) {
            return;
        }
        a663(jh_._f, this._c, 0, n2, n, 0, d, b, n3, n4);
    }
    
    private final void a093(int j, int f) {
        j += this._a.imageWidth2 - this._a.imageWidth - this._a._w;
        f += this._a._A;
        int n = j + f * gf_._i;
        int n2 = this._a.imageWidth - 1;
        int v = this._a.imageHeight;
        int y = this._a.imageWidth;
        int n3 = gf_._i - y;
        int n4 = y + y;
        if (f < gf_._f) {
            final int n5 = gf_._f - f;
            v -= n5;
            f = gf_._f;
            n2 += n5 * y;
            n += n5 * gf_._i;
        }
        if (f + v > gf_._e) {
            v -= f + v - gf_._e;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            y -= n6;
            j = gf_._j;
            n2 -= n6;
            n += n6;
            n4 -= n6;
            n3 += n6;
        }
        if (j + y > gf_._h) {
            final int n7 = j + y - gf_._h;
            y -= n7;
            n4 -= n7;
            n3 += n7;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        b663(jh_._f, this._c, 0, n2, n, 16711680, y, v, n3, n4);
    }
    
    //original signature: final void b093(final int n, final int n2) {
    final void drawImage(final int n, final int n2) {
        this._a.c093(n, n2);
        this.e093(n, n2);
    }
    
    private static final int[] a389(final Graphic cn_) {
        final int[] array = new int[cn_.imageWidth * cn_.imageHeight];
        int n = 0;
        for (int i = 0; i < cn_.imageHeight; ++i) {
            int j = 0;
            int n2 = -1;
            while (j < cn_.imageWidth) {
                if (cn_._B[n] == 0) {
                    if (n2 != -1) {
                        n = i * cn_.imageWidth + n2;
                        for (int k = n2; k < j; ++k) {
                            array[n] = ((byte)(64 - 128 * (k - n2) / (j - n2)) << 16 | 0x10);
                            ++n;
                        }
                    }
                    n2 = -1;
                }
                else {
                    final int[] b = cn_._B;
                    final int n3 = n;
                    b[n3] |= Integer.MIN_VALUE;
                    if (n2 == -1) {
                        n2 = j;
                    }
                }
                ++j;
                ++n;
            }
            if (n2 != -1) {
                n = i * cn_.imageWidth + n2;
                for (int l = n2; l < j; ++l) {
                    array[n] = ((byte)(64 - 128 * (l - n2) / (j - n2)) << 16 | 0x10);
                    ++n;
                }
            }
        }
        for (int n4 = 0; n4 < cn_.imageWidth; ++n4) {
            int n5 = 0;
            int n6 = -1;
            for (int n7 = n4; n5 < cn_.imageHeight; ++n5, n7 += cn_.imageWidth) {
                if (cn_._B[n7] == 0) {
                    if (n6 != -1) {
                        n7 = n6 * cn_.imageWidth + n4;
                        for (int n8 = n6; n8 < n5; ++n8) {
                            final int n9 = 64 - 128 * (n8 - n6) / (n5 - n6);
                            final int[] array2 = array;
                            final int n10 = n7;
                            array2[n10] |= (byte)n9 << 8;
                            n7 += cn_.imageWidth;
                        }
                    }
                    n6 = -1;
                }
                else if (n6 == -1) {
                    n6 = n5;
                }
            }
            if (n6 != -1) {
                int n11 = n6 * cn_.imageWidth + n4;
                for (int n12 = n6; n12 < n5; ++n12) {
                    final int n13 = 64 - 128 * (n12 - n6) / (n5 - n6);
                    final int[] array3 = array;
                    final int n14 = n11;
                    array3[n14] |= (byte)n13 << 8;
                    n11 += cn_.imageWidth;
                }
            }
        }
        return array;
    }
    
    ph_(final Graphic a, final Graphic cn_) {
        this._a = a;
        this._c = cn_._B;
        this.imageWidth = a.imageWidth;
        this.imageHeight = a.imageHeight;
    }
    
    ph_(final Graphic a, final int[] c) {
        this._a = a;
        this._c = c;
        this.imageWidth = a.imageWidth;
        this.imageHeight = a.imageHeight;
    }
    
    private static final void a663(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, int n5, final int n6, final int n7, final int n8) {
        final int n9 = -(n5 >> 2);
        n5 = -(n5 & 0x3);
        for (int i = -n6; i < 0; ++i) {
            for (int j = n9; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
            }
            for (int k = n5; k < 0; ++k) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
            }
            n3 += n7;
            n2 += n8;
        }
    }
    
    final void j093(final int n, final int n2) {
        this._a.f093(n, n2);
        this.a093(n, n2);
    }
    
    private static final void b663(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, int n5, final int n6, final int n7, final int n8) {
        final int n9 = -(n5 >> 2);
        n5 = -(n5 & 0x3);
        for (int i = -n6; i < 0; ++i) {
            for (int j = n9; j < 0; ++j) {
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
            }
            for (int k = n5; k < 0; ++k) {
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = (n ^ n4);
                }
                else {
                    ++n3;
                }
            }
            n3 += n7;
            n2 += n8;
        }
    }
}
