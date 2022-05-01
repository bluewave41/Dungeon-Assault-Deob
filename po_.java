final class po_
{
    private int _e;
    private int _f;
    private int[] _d;
    private int _c;
    private int _b;
    private int _g;
    private int _a;
    
    final void a623(final float[] array, final int n, final boolean b) {
        for (int i = 0; i < n; ++i) {
            array[i] = 0.0f;
        }
        if (b) {
            return;
        }
        final int c = jp_._x[this._a]._c;
        final int n2 = (this._b - this._f) / this._g;
        final int[] array2 = new int[n2];
        for (int j = 0; j < 8; ++j) {
            int k = 0;
            while (k < n2) {
                if (j == 0) {
                    int b2 = jp_._x[this._a].b784();
                    for (int l = c - 1; l >= 0; --l) {
                        if (k + l < n2) {
                            array2[k + l] = b2 % this._c;
                        }
                        b2 /= this._c;
                    }
                }
                for (int n3 = 0; n3 < c; ++n3) {
                    final int n4 = this._d[array2[k] * 8 + j];
                    if (n4 >= 0) {
                        final int n5 = this._f + k * this._g;
                        final km_ km_ = jp_._x[n4];
                        if (this._e == 0) {
                            for (int n6 = this._g / km_._c, n7 = 0; n7 < n6; ++n7) {
                                final float[] c2 = km_.c932();
                                for (int n8 = 0; n8 < km_._c; ++n8) {
                                    final int n9 = n5 + n7 + n8 * n6;
                                    array[n9] += c2[n8];
                                }
                            }
                        }
                        else {
                            int n10 = 0;
                            while (n10 < this._g) {
                                final float[] c3 = km_.c932();
                                for (int n11 = 0; n11 < km_._c; ++n11) {
                                    final int n12 = n5 + n10;
                                    array[n12] += c3[n11];
                                    ++n10;
                                }
                            }
                        }
                    }
                    if (++k >= n2) {
                        break;
                    }
                }
            }
        }
    }
    
    po_() {
        this._e = jp_.a137(16);
        this._f = jp_.a137(24);
        this._b = jp_.a137(24);
        this._g = jp_.a137(24) + 1;
        this._c = jp_.a137(6) + 1;
        this._a = jp_.a137(8);
        final int[] array = new int[this._c];
        for (int i = 0; i < this._c; ++i) {
            int a137 = 0;
            final int a138 = jp_.a137(3);
            if (jp_.b784() != 0) {
                a137 = jp_.a137(5);
            }
            array[i] = (a137 << 3 | a138);
        }
        this._d = new int[this._c * 8];
        for (int j = 0; j < this._c * 8; ++j) {
            this._d[j] = (((array[j >> 3] & 1 << (j & 0x7)) != 0x0) ? jp_.a137(8) : -1);
        }
    }
}
