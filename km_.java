final class km_
{
    private float[][] _d;
    private int[] _f;
    private int _e;
    int _c;
    private int[] _b;
    private int[] _a;
    
    private static final int a080(final int n, final int n2) {
        int n3;
        for (n3 = (int)Math.pow(n, 1.0 / n2) + 1; bf_.a586(n2, n3) > n; --n3) {}
        return n3;
    }
    
    private final void a797() {
        final int[] array = new int[this._e];
        final int[] array2 = new int[33];
        for (int i = 0; i < this._e; ++i) {
            final int n = this._b[i];
            if (n != 0) {
                final int n2 = 1 << 32 - n;
                final int n3 = array2[n];
                array[i] = n3;
                int n4;
                if ((n3 & n2) != 0x0) {
                    n4 = array2[n - 1];
                }
                else {
                    n4 = (n3 | n2);
                    for (int j = n - 1; j >= 1; --j) {
                        final int n5 = array2[j];
                        if (n5 != n3) {
                            break;
                        }
                        final int n6 = 1 << 32 - j;
                        if ((n5 & n6) != 0x0) {
                            array2[j] = array2[j - 1];
                            break;
                        }
                        array2[j] = (n5 | n6);
                    }
                }
                array2[n] = n4;
                for (int k = n + 1; k <= 32; ++k) {
                    if (array2[k] == n3) {
                        array2[k] = n4;
                    }
                }
            }
        }
        this._a = new int[8];
        int n7 = 0;
        for (int l = 0; l < this._e; ++l) {
            final int n8 = this._b[l];
            if (n8 != 0) {
                final int n9 = array[l];
                int n10 = 0;
                for (int n11 = 0; n11 < n8; ++n11) {
                    if ((n9 & Integer.MIN_VALUE >>> n11) != 0x0) {
                        if (this._a[n10] == 0) {
                            this._a[n10] = n7;
                        }
                        n10 = this._a[n10];
                    }
                    else {
                        ++n10;
                    }
                    if (n10 >= this._a.length) {
                        final int[] a = new int[this._a.length * 2];
                        for (int n12 = 0; n12 < this._a.length; ++n12) {
                            a[n12] = this._a[n12];
                        }
                        this._a = a;
                    }
                }
                this._a[n10] = ~l;
                if (n10 >= n7) {
                    n7 = n10 + 1;
                }
            }
        }
    }
    
    final float[] c932() {
        return this._d[this.b784()];
    }
    
    final int b784() {
        int n;
        for (n = 0; this._a[n] >= 0; n = ((jp_.b784() != 0) ? this._a[n] : (n + 1))) {}
        return ~this._a[n];
    }
    
    km_() {
        jp_.a137(24);
        this._c = jp_.a137(16);
        this._e = jp_.a137(24);
        this._b = new int[this._e];
        if (jp_.b784() != 0) {
            int i = 0;
            int n = jp_.a137(5) + 1;
            while (i < this._e) {
                for (int a137 = jp_.a137(ue_.a080(this._e - i)), j = 0; j < a137; ++j) {
                    this._b[i++] = n;
                }
                ++n;
            }
        }
        else {
            final boolean b = jp_.b784() != 0;
            for (int k = 0; k < this._e; ++k) {
                if (b && jp_.b784() == 0) {
                    this._b[k] = 0;
                }
                else {
                    this._b[k] = jp_.a137(5) + 1;
                }
            }
        }
        this.a797();
        final int a138 = jp_.a137(4);
        if (a138 > 0) {
            final float d134 = jp_.d134(jp_.a137(32));
            final float d135 = jp_.d134(jp_.a137(32));
            final int n2 = jp_.a137(4) + 1;
            final boolean b2 = jp_.b784() != 0;
            int a139;
            if (a138 == 1) {
                a139 = a080(this._e, this._c);
            }
            else {
                a139 = this._e * this._c;
            }
            this._f = new int[a139];
            for (int l = 0; l < a139; ++l) {
                this._f[l] = jp_.a137(n2);
            }
            this._d = new float[this._e][this._c];
            if (a138 == 1) {
                for (int n3 = 0; n3 < this._e; ++n3) {
                    float n4 = 0.0f;
                    int n5 = 1;
                    for (int n6 = 0; n6 < this._c; ++n6) {
                        final float n7 = this._f[n3 / n5 % a139] * d135 + d134 + n4;
                        this._d[n3][n6] = n7;
                        if (b2) {
                            n4 = n7;
                        }
                        n5 *= a139;
                    }
                }
            }
            else {
                for (int n8 = 0; n8 < this._e; ++n8) {
                    float n9 = 0.0f;
                    int n10 = n8 * this._c;
                    for (int n11 = 0; n11 < this._c; ++n11) {
                        final float n12 = this._f[n10] * d135 + d134 + n9;
                        this._d[n8][n11] = n12;
                        if (b2) {
                            n9 = n12;
                        }
                        ++n10;
                    }
                }
            }
        }
    }
}
