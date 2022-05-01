final class ni_ extends qb_
{
    private int _o;
    private int _s;
    private int _u;
    private int _y;
    private int _t;
    private int _v;
    private int _w;
    private int _r;
    private int _x;
    private int _z;
    private int _A;
    private int _q;
    private int _m;
    private int _p;
    private boolean _n;
    
    @Override
    final qb_ d207() {
        return null;
    }
    
    private static final int b072(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final ni_ ni_) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n6 - n) > n5) {
            n4 = n5;
        }
        ni_._m += ni_._v * (n4 - i);
        ni_._r += ni_._o * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n++] * n2, n2 += n3, n8 = i++, array2[n8] += array[n++] * n2, n2 += n3, n9 = i++, array2[n9] += array[n++] * n2, n2 += n3, n10 = i++, array2[n10] += array[n++] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n++] * n2, n2 += n3) {}
        ni_._p = n2 >> 2;
        ni_._u = n << 8;
        return i;
    }
    
    final synchronized void e150(final int z) {
        this._z = z;
    }
    
    final synchronized void a093(final int n, final int n2) {
        this.a326(n, n2, this.h784());
    }
    
    @Override
    final synchronized void a150(int s) {
        if (this._s > 0) {
            if (s >= this._s) {
                if (this._w == Integer.MIN_VALUE) {
                    this._w = 0;
                    this._r = 0;
                    this._m = 0;
                    this._p = 0;
                    this.a487(false);
                    s = this._s;
                }
                this._s = 0;
                this.g797();
            }
            else {
                this._p += this._x * s;
                this._m += this._v * s;
                this._r += this._o * s;
                this._s -= s;
            }
        }
        final va_ va_ = (va_)super._k;
        final int n = this._t << 8;
        final int n2 = this._y << 8;
        final int u = va_._k.length << 8;
        final int n3 = n2 - n;
        if (n3 <= 0) {
            this._z = 0;
        }
        if (this._u < 0) {
            if (this._q <= 0) {
                this.k797();
                this.a487(false);
                return;
            }
            this._u = 0;
        }
        if (this._u >= u) {
            if (this._q >= 0) {
                this.k797();
                this.a487(false);
                return;
            }
            this._u = u - 1;
        }
        this._u += this._q * s;
        if (this._z >= 0) {
            Label_0787: {
                if (this._z > 0) {
                    if (this._n) {
                        if (this._q < 0) {
                            if (this._u >= n) {
                                return;
                            }
                            this._u = n + n - 1 - this._u;
                            this._q = -this._q;
                            if (--this._z == 0) {
                                break Label_0787;
                            }
                        }
                        while (this._u >= n2) {
                            this._u = n2 + n2 - 1 - this._u;
                            this._q = -this._q;
                            if (--this._z == 0) {
                                break Label_0787;
                            }
                            if (this._u >= n) {
                                return;
                            }
                            this._u = n + n - 1 - this._u;
                            this._q = -this._q;
                            if (--this._z == 0) {
                                break Label_0787;
                            }
                        }
                        return;
                    }
                    if (this._q < 0) {
                        if (this._u >= n) {
                            return;
                        }
                        final int n4 = (n2 - 1 - this._u) / n3;
                        if (n4 >= this._z) {
                            this._u += n3 * this._z;
                            this._z = 0;
                            break Label_0787;
                        }
                        this._u += n3 * n4;
                        this._z -= n4;
                    }
                    else {
                        if (this._u < n2) {
                            return;
                        }
                        final int n5 = (this._u - n) / n3;
                        if (n5 >= this._z) {
                            this._u -= n3 * this._z;
                            this._z = 0;
                            break Label_0787;
                        }
                        this._u -= n3 * n5;
                        this._z -= n5;
                    }
                    return;
                }
            }
            if (this._q < 0) {
                if (this._u < 0) {
                    this._u = -1;
                    this.k797();
                    this.a487(false);
                }
            }
            else if (this._u >= u) {
                this._u = u;
                this.k797();
                this.a487(false);
            }
            return;
        }
        if (this._n) {
            if (this._q < 0) {
                if (this._u >= n) {
                    return;
                }
                this._u = n + n - 1 - this._u;
                this._q = -this._q;
            }
            while (this._u >= n2) {
                this._u = n2 + n2 - 1 - this._u;
                this._q = -this._q;
                if (this._u >= n) {
                    return;
                }
                this._u = n + n - 1 - this._u;
                this._q = -this._q;
            }
            return;
        }
        if (this._q < 0) {
            if (this._u >= n) {
                return;
            }
            this._u = n2 - 1 - (n2 - 1 - this._u) % n3;
        }
        else {
            if (this._u < n2) {
                return;
            }
            this._u = n + (this._u - n) % n3;
        }
    }
    
    @Override
    final qb_ c207() {
        return null;
    }
    
    private final void g797() {
        this._p = this._w;
        this._m = b080(this._w, this._A);
        this._r = d080(this._w, this._A);
    }
    
    private static final int b017(int n, int n2, final byte[] array, final int[] array2, int u, int i, final int n3, int n4, final int n5, final int n6, final ni_ ni_, final int n7, final int n8) {
        if (n7 == 0 || (n4 = i + (n6 + 256 - u + n7) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = u >> 8;
            n = array[n2 - 1];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2] - n) * (u & 0xFF)) * n3 >> 6;
            u += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - u + n7) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n = n8, n2 = n7; i < n4; n10 = i++, array2[n10] += ((n << 8) + (array[u >> 8] - n) * (u & 0xFF)) * n3 >> 6, u += n2) {}
        ni_._u = u;
        return i;
    }
    
    final synchronized void h150(final int n) {
        this.c093(n, this.h784());
    }
    
    final synchronized void b487(final boolean b) {
        this._q = (this._q ^ this._q >> 31) + (this._q >>> 31);
        if (b) {
            this._q = -this._q;
        }
    }
    
    private static final int d080(final int n, final int n2) {
        return (n2 < 0) ? (-n) : ((int)(n * Math.sqrt(n2 * 1.220703125E-4) + 0.5));
    }
    
    private final int a682(final int[] array, int n, final int n2, final int n3, final int n4) {
        while (this._s > 0) {
            int n5 = n + this._s;
            if (n5 > n3) {
                n5 = n3;
            }
            this._s += n;
            if (this._q == -256 && (this._u & 0xFF) == 0x0) {
                if (vn_._g) {
                    n = b561(0, ((va_)super._k)._k, array, this._u, n, this._m, this._r, this._v, this._o, 0, n5, n2, this);
                }
                else {
                    n = a072(((va_)super._k)._k, array, this._u, n, this._p, this._x, 0, n5, n2, this);
                }
            }
            else if (vn_._g) {
                n = b568(0, 0, ((va_)super._k)._k, array, this._u, n, this._m, this._r, this._v, this._o, 0, n5, n2, this, this._q, n4);
            }
            else {
                n = b824(0, 0, ((va_)super._k)._k, array, this._u, n, this._p, this._x, 0, n5, n2, this, this._q, n4);
            }
            this._s -= n;
            if (this._s != 0) {
                return n;
            }
            if (this.j801()) {
                return n3;
            }
        }
        if (this._q == -256 && (this._u & 0xFF) == 0x0) {
            if (vn_._g) {
                return b175(0, ((va_)super._k)._k, array, this._u, n, this._m, this._r, 0, n3, n2, this);
            }
            return a817(((va_)super._k)._k, array, this._u, n, this._p, 0, n3, n2, this);
        }
        else {
            if (vn_._g) {
                return c824(0, 0, ((va_)super._k)._k, array, this._u, n, this._m, this._r, 0, n3, n2, this, this._q, n4);
            }
            return b017(0, 0, ((va_)super._k)._k, array, this._u, n, this._p, 0, n3, n2, this, this._q, n4);
        }
    }
    
    private static final int a817(final byte[] array, final int[] array2, int n, int i, int n2, int n3, final int n4, int n5, final ni_ ni_) {
        n >>= 8;
        n5 >>= 8;
        n2 <<= 2;
        if ((n3 = i + n - (n5 - 1)) > n4) {
            n3 = n4;
        }
        int n6;
        int n7;
        int n8;
        int n9;
        for (n3 -= 3; i < n3; n6 = i++, array2[n6] += array[n--] * n2, n7 = i++, array2[n7] += array[n--] * n2, n8 = i++, array2[n8] += array[n--] * n2, n9 = i++, array2[n9] += array[n--] * n2) {}
        int n10;
        for (n3 += 3; i < n3; n10 = i++, array2[n10] += array[n--] * n2) {}
        ni_._u = n << 8;
        return i;
    }
    
    private static final int a561(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, int n6, int n7, final int n8, int n9, final ni_ ni_) {
        n2 >>= 8;
        n9 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        if ((n7 = i + n9 - n2) > n8) {
            n7 = n8;
        }
        ni_._p += ni_._x * (n7 - i);
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        for (i <<= 1, n7 <<= 1, n7 -= 6; i < n7; n10 = i++, array2[n10] += n * n3, n3 += n5, n11 = i++, array2[n11] += n * n4, n4 += n6, n = array[n2++], n12 = i++, array2[n12] += n * n3, n3 += n5, n13 = i++, array2[n13] += n * n4, n4 += n6, n = array[n2++], n14 = i++, array2[n14] += n * n3, n3 += n5, n15 = i++, array2[n15] += n * n4, n4 += n6, n = array[n2++], n16 = i++, array2[n16] += n * n3, n3 += n5, n17 = i++, array2[n17] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        int n18;
        int n19;
        for (n7 += 6; i < n7; n18 = i++, array2[n18] += n * n3, n3 += n5, n19 = i++, array2[n19] += n * n4, n4 += n6) {
            n = array[n2++];
        }
        ni_._m = n3 >> 2;
        ni_._r = n4 >> 2;
        ni_._u = n2 << 8;
        return i >> 1;
    }
    
    final synchronized int i784() {
        return (this._w == Integer.MIN_VALUE) ? 0 : this._w;
    }
    
    private static final int a568(int n, int n2, final byte[] array, final int[] array2, int u, int i, int m, int r, final int n3, final int n4, int n5, final int n6, final int n7, final ni_ ni_, final int n8, final int n9) {
        ni_._p -= ni_._x * i;
        if (n8 == 0 || (n5 = i + (n7 - u + n8 - 257) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * m >> 6, m += n3, n11 = i++, array2[n11] += n * r >> 6, r += n4, u += n8) {
            n2 = u >> 8;
            n = array[n2];
            n = (n << 8) + (array[n2 + 1] - n) * (u & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - u + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[u >> 8];
            n = (n << 8) + (n2 - n) * (u & 0xFF);
            final int n12 = i++;
            array2[n12] += n * m >> 6;
            m += n3;
            final int n13 = i++;
            array2[n13] += n * r >> 6;
            r += n4;
            u += n8;
        }
        i >>= 1;
        ni_._p += ni_._x * i;
        ni_._m = m;
        ni_._r = r;
        ni_._u = u;
        return i;
    }
    
    final synchronized boolean f801() {
        return this._u < 0 || this._u >= ((va_)super._k)._k.length << 8;
    }
    
    private final synchronized void c093(final int w, final int a) {
        this._w = w;
        this._A = a;
        this._s = 0;
        this.g797();
    }
    
    private static final int a824(int n, int n2, final byte[] array, final int[] array2, int u, int i, int p14, final int n3, int n4, final int n5, final int n6, final ni_ ni_, final int n7, final int n8) {
        ni_._m -= ni_._v * i;
        ni_._r -= ni_._o * i;
        if (n7 == 0 || (n4 = i + (n6 - u + n7 - 257) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = u >> 8;
            n = array[n2];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2 + 1] - n) * (u & 0xFF)) * p14 >> 6;
            p14 += n3;
            u += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - u + n7 - 1) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n2 = n8; i < n4; n10 = i++, array2[n10] += ((n << 8) + (n2 - n) * (u & 0xFF)) * p14 >> 6, p14 += n3, u += n7) {
            n = array[u >> 8];
        }
        ni_._m += ni_._v * i;
        ni_._r += ni_._o * i;
        ni_._p = p14;
        ni_._u = u;
        return i;
    }
    
    final synchronized void d150(final int n) {
        this.c093(n << 6, this.h784());
    }
    
    @Override
    final int b784() {
        final int n = this._p * 3 >> 6;
        int n2 = (n ^ n >> 31) + (n >>> 31);
        if (this._z == 0) {
            n2 -= n2 * this._u / (((va_)super._k)._k.length << 8);
        }
        else if (this._z >= 0) {
            n2 -= n2 * this._t / ((va_)super._k)._k.length;
        }
        return (n2 > 255) ? 255 : n2;
    }
    
    final synchronized void a326(int s, final int w, final int a) {
        if (s == 0) {
            this.c093(w, a);
            return;
        }
        final int b080 = b080(w, a);
        final int d080 = d080(w, a);
        if (this._m == b080 && this._r == d080) {
            this._s = 0;
            return;
        }
        int n = w - this._p;
        if (this._p - w > n) {
            n = this._p - w;
        }
        if (b080 - this._m > n) {
            n = b080 - this._m;
        }
        if (this._m - b080 > n) {
            n = this._m - b080;
        }
        if (d080 - this._r > n) {
            n = d080 - this._r;
        }
        if (this._r - d080 > n) {
            n = this._r - d080;
        }
        if (s > n) {
            s = n;
        }
        this._s = s;
        this._w = w;
        this._A = a;
        this._x = (w - this._p) / s;
        this._v = (b080 - this._m) / s;
        this._o = (d080 - this._r) / s;
    }
    
    private static final int b561(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, int n6, int n7, final int n8, int n9, final ni_ ni_) {
        n2 >>= 8;
        n9 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        n5 <<= 2;
        n6 <<= 2;
        if ((n7 = i + n2 - (n9 - 1)) > n8) {
            n7 = n8;
        }
        ni_._p += ni_._x * (n7 - i);
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        for (i <<= 1, n7 <<= 1, n7 -= 6; i < n7; n10 = i++, array2[n10] += n * n3, n3 += n5, n11 = i++, array2[n11] += n * n4, n4 += n6, n = array[n2--], n12 = i++, array2[n12] += n * n3, n3 += n5, n13 = i++, array2[n13] += n * n4, n4 += n6, n = array[n2--], n14 = i++, array2[n14] += n * n3, n3 += n5, n15 = i++, array2[n15] += n * n4, n4 += n6, n = array[n2--], n16 = i++, array2[n16] += n * n3, n3 += n5, n17 = i++, array2[n17] += n * n4, n4 += n6) {
            n = array[n2--];
        }
        int n18;
        int n19;
        for (n7 += 6; i < n7; n18 = i++, array2[n18] += n * n3, n3 += n5, n19 = i++, array2[n19] += n * n4, n4 += n6) {
            n = array[n2--];
        }
        ni_._m = n3 >> 2;
        ni_._r = n4 >> 2;
        ni_._u = n2 << 8;
        return i >> 1;
    }
    
    private static final int c824(int n, int n2, final byte[] array, final int[] array2, int u, int i, final int n3, final int n4, int n5, final int n6, final int n7, final ni_ ni_, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 + 256 - u + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, u += n8) {
            n2 = u >> 8;
            n = array[n2 - 1];
            n = (n << 8) + (array[n2] - n) * (u & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - u + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (array[u >> 8] - n2) * (u & 0xFF);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            u += n8;
        }
        ni_._u = u;
        return i >> 1;
    }
    
    final synchronized int h784() {
        return (this._A < 0) ? -1 : this._A;
    }
    
    private static final int b080(final int n, final int n2) {
        return (n2 < 0) ? n : ((int)(n * Math.sqrt((16384 - n2) * 1.220703125E-4) + 0.5));
    }
    
    private static final int b824(int n, int n2, final byte[] array, final int[] array2, int u, int i, int p14, final int n3, int n4, final int n5, final int n6, final ni_ ni_, final int n7, final int n8) {
        ni_._m -= ni_._v * i;
        ni_._r -= ni_._o * i;
        if (n7 == 0 || (n4 = i + (n6 + 256 - u + n7) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = u >> 8;
            n = array[n2 - 1];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2] - n) * (u & 0xFF)) * p14 >> 6;
            p14 += n3;
            u += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - u + n7) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n = n8, n2 = n7; i < n4; n10 = i++, array2[n10] += ((n << 8) + (array[u >> 8] - n) * (u & 0xFF)) * p14 >> 6, p14 += n3, u += n2) {}
        ni_._m += ni_._v * i;
        ni_._r += ni_._o * i;
        ni_._p = p14;
        ni_._u = u;
        return i;
    }
    
    private static final int a175(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final ni_ ni_) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = i + n7 - n2) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2++], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2++], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2++], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2++];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2++];
        }
        ni_._u = n2 << 8;
        return i >> 1;
    }
    
    private final void k797() {
        if (this._s != 0) {
            if (this._w == Integer.MIN_VALUE) {
                this._w = 0;
            }
            this._s = 0;
            this.g797();
        }
    }
    
    private static final int b817(final byte[] array, final int[] array2, int n, int i, int n2, int n3, final int n4, int n5, final ni_ ni_) {
        n >>= 8;
        n5 >>= 8;
        n2 <<= 2;
        if ((n3 = i + n5 - n) > n4) {
            n3 = n4;
        }
        int n6;
        int n7;
        int n8;
        int n9;
        for (n3 -= 3; i < n3; n6 = i++, array2[n6] += array[n++] * n2, n7 = i++, array2[n7] += array[n++] * n2, n8 = i++, array2[n8] += array[n++] * n2, n9 = i++, array2[n9] += array[n++] * n2) {}
        int n10;
        for (n3 += 3; i < n3; n10 = i++, array2[n10] += array[n++] * n2) {}
        ni_._u = n << 8;
        return i;
    }
    
    private final boolean j801() {
        int w = this._w;
        int d080;
        int b080;
        if (w == Integer.MIN_VALUE) {
            d080 = 0;
            b080 = 0;
            w = 0;
        }
        else {
            b080 = b080(w, this._A);
            d080 = d080(w, this._A);
        }
        if (this._p != w || this._m != b080 || this._r != d080) {
            if (this._p < w) {
                this._x = 1;
                this._s = w - this._p;
            }
            else if (this._p > w) {
                this._x = -1;
                this._s = this._p - w;
            }
            else {
                this._x = 0;
            }
            if (this._m < b080) {
                this._v = 1;
                if (this._s == 0 || this._s > b080 - this._m) {
                    this._s = b080 - this._m;
                }
            }
            else if (this._m > b080) {
                this._v = -1;
                if (this._s == 0 || this._s > this._m - b080) {
                    this._s = this._m - b080;
                }
            }
            else {
                this._v = 0;
            }
            if (this._r < d080) {
                this._o = 1;
                if (this._s == 0 || this._s > d080 - this._r) {
                    this._s = d080 - this._r;
                }
            }
            else if (this._r > d080) {
                this._o = -1;
                if (this._s == 0 || this._s > this._r - d080) {
                    this._s = this._r - d080;
                }
            }
            else {
                this._o = 0;
            }
            return false;
        }
        if (this._w == Integer.MIN_VALUE) {
            this._w = 0;
            this._r = 0;
            this._m = 0;
            this._p = 0;
            this.a487(false);
            return true;
        }
        this.g797();
        return false;
    }
    
    private static final int d824(int n, int n2, final byte[] array, final int[] array2, int u, int i, final int n3, final int n4, int n5, final int n6, final int n7, final ni_ ni_, final int n8, final int n9) {
        if (n8 == 0 || (n5 = i + (n7 - u + n8 - 257) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * n3 >> 6, n11 = i++, array2[n11] += n * n4 >> 6, u += n8) {
            n2 = u >> 8;
            n = array[n2];
            n = (n << 8) + (array[n2 + 1] - n) * (u & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - u + n8 - 1) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = array[u >> 8];
            n = (n << 8) + (n2 - n) * (u & 0xFF);
            final int n12 = i++;
            array2[n12] += n * n3 >> 6;
            final int n13 = i++;
            array2[n13] += n * n4 >> 6;
            u += n8;
        }
        ni_._u = u;
        return i >> 1;
    }
    
    final synchronized void f150(int s) {
        if (s == 0) {
            this.h150(0);
            this.a487(false);
            return;
        }
        if (this._m == 0 && this._r == 0) {
            this._s = 0;
            this._w = 0;
            this._p = 0;
            this.a487(false);
            return;
        }
        int n = -this._p;
        if (this._p > n) {
            n = this._p;
        }
        if (-this._m > n) {
            n = -this._m;
        }
        if (this._m > n) {
            n = this._m;
        }
        if (-this._r > n) {
            n = -this._r;
        }
        if (this._r > n) {
            n = this._r;
        }
        if (s > n) {
            s = n;
        }
        this._s = s;
        this._w = Integer.MIN_VALUE;
        this._x = -this._p / s;
        this._v = -this._m / s;
        this._o = -this._r / s;
    }
    
    final synchronized void g150(final int q) {
        if (this._q < 0) {
            this._q = -q;
        }
        else {
            this._q = q;
        }
    }
    
    private static final int b175(int n, final byte[] array, final int[] array2, int n2, int i, int n3, int n4, int n5, final int n6, int n7, final ni_ ni_) {
        n2 >>= 8;
        n7 >>= 8;
        n3 <<= 2;
        n4 <<= 2;
        if ((n5 = i + n2 - (n7 - 1)) > n6) {
            n5 = n6;
        }
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        for (i <<= 1, n5 <<= 1, n5 -= 6; i < n5; n8 = i++, array2[n8] += n * n3, n9 = i++, array2[n9] += n * n4, n = array[n2--], n10 = i++, array2[n10] += n * n3, n11 = i++, array2[n11] += n * n4, n = array[n2--], n12 = i++, array2[n12] += n * n3, n13 = i++, array2[n13] += n * n4, n = array[n2--], n14 = i++, array2[n14] += n * n3, n15 = i++, array2[n15] += n * n4) {
            n = array[n2--];
        }
        int n16;
        int n17;
        for (n5 += 6; i < n5; n16 = i++, array2[n16] += n * n3, n17 = i++, array2[n17] += n * n4) {
            n = array[n2--];
        }
        ni_._u = n2 << 8;
        return i >> 1;
    }
    
    static final ni_ a071(final va_ va_, final int n, final int n2) {
        if (va_._k == null || va_._k.length == 0) {
            return null;
        }
        return new ni_(va_, n, n2 << 6);
    }
    
    static final ni_ a456(final va_ va_, final int n, final int n2, final int n3) {
        if (va_._k == null || va_._k.length == 0) {
            return null;
        }
        return new ni_(va_, n, n2, n3);
    }
    
    final synchronized void i150(int u) {
        final int n = ((va_)super._k)._k.length << 8;
        if (u < -1) {
            u = -1;
        }
        if (u > n) {
            u = n;
        }
        this._u = u;
    }
    
    @Override
    final int return8() {
        if (this._w == 0 && this._s == 0) {
            return 0;
        }
        return 1;
    }
    
    @Override
    final synchronized void b397(final int[] array, final int n, int n2) {
        if (this._w == 0 && this._s == 0) {
            this.a150(n2);
            return;
        }
        final va_ va_ = (va_)super._k;
        final int n3 = this._t << 8;
        final int n4 = this._y << 8;
        final int u = va_._k.length << 8;
        final int n5 = n4 - n3;
        if (n5 <= 0) {
            this._z = 0;
        }
        int n6 = n;
        n2 += n;
        if (this._u < 0) {
            if (this._q <= 0) {
                this.k797();
                this.a487(false);
                return;
            }
            this._u = 0;
        }
        if (this._u >= u) {
            if (this._q >= 0) {
                this.k797();
                this.a487(false);
                return;
            }
            this._u = u - 1;
        }
        if (this._z >= 0) {
            Label_0931: {
                if (this._z > 0) {
                    if (this._n) {
                        if (this._q < 0) {
                            n6 = this.a682(array, n6, n3, n2, va_._k[this._t]);
                            if (this._u >= n3) {
                                return;
                            }
                            this._u = n3 + n3 - 1 - this._u;
                            this._q = -this._q;
                            if (--this._z == 0) {
                                break Label_0931;
                            }
                        }
                        do {
                            n6 = this.b682(array, n6, n4, n2, va_._k[this._y - 1]);
                            if (this._u < n4) {
                                return;
                            }
                            this._u = n4 + n4 - 1 - this._u;
                            this._q = -this._q;
                            if (--this._z == 0) {
                                break;
                            }
                            n6 = this.a682(array, n6, n3, n2, va_._k[this._t]);
                            if (this._u >= n3) {
                                return;
                            }
                            this._u = n3 + n3 - 1 - this._u;
                            this._q = -this._q;
                        } while (--this._z != 0);
                    }
                    else if (this._q < 0) {
                        while (true) {
                            n6 = this.a682(array, n6, n3, n2, va_._k[this._y - 1]);
                            if (this._u >= n3) {
                                return;
                            }
                            final int n7 = (n4 - 1 - this._u) / n5;
                            if (n7 >= this._z) {
                                this._u += n5 * this._z;
                                this._z = 0;
                                break;
                            }
                            this._u += n5 * n7;
                            this._z -= n7;
                        }
                    }
                    else {
                        while (true) {
                            n6 = this.b682(array, n6, n4, n2, va_._k[this._t]);
                            if (this._u < n4) {
                                return;
                            }
                            final int n8 = (this._u - n3) / n5;
                            if (n8 >= this._z) {
                                this._u -= n5 * this._z;
                                this._z = 0;
                                break;
                            }
                            this._u -= n5 * n8;
                            this._z -= n8;
                        }
                    }
                }
            }
            if (this._q < 0) {
                this.a682(array, n6, 0, n2, 0);
                if (this._u < 0) {
                    this._u = -1;
                    this.k797();
                    this.a487(false);
                }
            }
            else {
                this.b682(array, n6, u, n2, 0);
                if (this._u >= u) {
                    this._u = u;
                    this.k797();
                    this.a487(false);
                }
            }
            return;
        }
        if (this._n) {
            if (this._q < 0) {
                n6 = this.a682(array, n6, n3, n2, va_._k[this._t]);
                if (this._u >= n3) {
                    return;
                }
                this._u = n3 + n3 - 1 - this._u;
                this._q = -this._q;
            }
            while (true) {
                final int b682 = this.b682(array, n6, n4, n2, va_._k[this._y - 1]);
                if (this._u < n4) {
                    return;
                }
                this._u = n4 + n4 - 1 - this._u;
                this._q = -this._q;
                n6 = this.a682(array, b682, n3, n2, va_._k[this._t]);
                if (this._u >= n3) {
                    return;
                }
                this._u = n3 + n3 - 1 - this._u;
                this._q = -this._q;
            }
        }
        else {
            if (this._q < 0) {
                while (true) {
                    n6 = this.a682(array, n6, n3, n2, va_._k[this._y - 1]);
                    if (this._u >= n3) {
                        break;
                    }
                    this._u = n4 - 1 - (n4 - 1 - this._u) % n5;
                }
                return;
            }
            while (true) {
                n6 = this.b682(array, n6, n4, n2, va_._k[this._t]);
                if (this._u < n4) {
                    break;
                }
                this._u = n3 + (this._u - n3) % n5;
            }
        }
    }
    
    static final ni_ b071(final va_ va_, final int n, final int n2) {
        if (va_._k == null || va_._k.length == 0) {
            return null;
        }
        return new ni_(va_, (int)(va_._n * 256L * n / (100 * vn_._t)), n2 << 6);
    }
    
    final synchronized int l784() {
        return (this._q < 0) ? (-this._q) : this._q;
    }
    
    private static final int a072(final byte[] array, final int[] array2, int n, int i, int n2, int n3, int n4, final int n5, int n6, final ni_ ni_) {
        n >>= 8;
        n6 >>= 8;
        n2 <<= 2;
        n3 <<= 2;
        if ((n4 = i + n - (n6 - 1)) > n5) {
            n4 = n5;
        }
        ni_._m += ni_._v * (n4 - i);
        ni_._r += ni_._o * (n4 - i);
        int n7;
        int n8;
        int n9;
        int n10;
        for (n4 -= 3; i < n4; n7 = i++, array2[n7] += array[n--] * n2, n2 += n3, n8 = i++, array2[n8] += array[n--] * n2, n2 += n3, n9 = i++, array2[n9] += array[n--] * n2, n2 += n3, n10 = i++, array2[n10] += array[n--] * n2, n2 += n3) {}
        int n11;
        for (n4 += 3; i < n4; n11 = i++, array2[n11] += array[n--] * n2, n2 += n3) {}
        ni_._p = n2 >> 2;
        ni_._u = n << 8;
        return i;
    }
    
    private static final int a017(int n, int n2, final byte[] array, final int[] array2, int u, int i, final int n3, int n4, final int n5, final int n6, final ni_ ni_, final int n7, final int n8) {
        if (n7 == 0 || (n4 = i + (n6 - u + n7 - 257) / n7) > n5) {
            n4 = n5;
        }
        while (i < n4) {
            n2 = u >> 8;
            n = array[n2];
            final int n9 = i++;
            array2[n9] += ((n << 8) + (array[n2 + 1] - n) * (u & 0xFF)) * n3 >> 6;
            u += n7;
        }
        if (n7 == 0 || (n4 = i + (n6 - u + n7 - 1) / n7) > n5) {
            n4 = n5;
        }
        int n10;
        for (n2 = n8; i < n4; n10 = i++, array2[n10] += ((n << 8) + (n2 - n) * (u & 0xFF)) * n3 >> 6, u += n7) {
            n = array[u >> 8];
        }
        ni_._u = u;
        return i;
    }
    
    final synchronized boolean e801() {
        return this._s != 0;
    }
    
    private static final int b568(int n, int n2, final byte[] array, final int[] array2, int u, int i, int m, int r, final int n3, final int n4, int n5, final int n6, final int n7, final ni_ ni_, final int n8, final int n9) {
        ni_._p -= ni_._x * i;
        if (n8 == 0 || (n5 = i + (n7 + 256 - u + n8) / n8) > n6) {
            n5 = n6;
        }
        int n10;
        int n11;
        for (i <<= 1, n5 <<= 1; i < n5; n10 = i++, array2[n10] += n * m >> 6, m += n3, n11 = i++, array2[n11] += n * r >> 6, r += n4, u += n8) {
            n2 = u >> 8;
            n = array[n2 - 1];
            n = (n << 8) + (array[n2] - n) * (u & 0xFF);
        }
        if (n8 == 0 || (n5 = (i >> 1) + (n7 - u + n8) / n8) > n6) {
            n5 = n6;
        }
        n5 <<= 1;
        n2 = n9;
        while (i < n5) {
            n = (n2 << 8) + (array[u >> 8] - n2) * (u & 0xFF);
            final int n12 = i++;
            array2[n12] += n * m >> 6;
            m += n3;
            final int n13 = i++;
            array2[n13] += n * r >> 6;
            r += n4;
            u += n8;
        }
        i >>= 1;
        ni_._p += ni_._x * i;
        ni_._m = m;
        ni_._r = r;
        ni_._u = u;
        return i;
    }
    
    private final int b682(final int[] array, int n, final int n2, final int n3, final int n4) {
        while (this._s > 0) {
            int n5 = n + this._s;
            if (n5 > n3) {
                n5 = n3;
            }
            this._s += n;
            if (this._q == 256 && (this._u & 0xFF) == 0x0) {
                if (vn_._g) {
                    n = a561(0, ((va_)super._k)._k, array, this._u, n, this._m, this._r, this._v, this._o, 0, n5, n2, this);
                }
                else {
                    n = b072(((va_)super._k)._k, array, this._u, n, this._p, this._x, 0, n5, n2, this);
                }
            }
            else if (vn_._g) {
                n = a568(0, 0, ((va_)super._k)._k, array, this._u, n, this._m, this._r, this._v, this._o, 0, n5, n2, this, this._q, n4);
            }
            else {
                n = a824(0, 0, ((va_)super._k)._k, array, this._u, n, this._p, this._x, 0, n5, n2, this, this._q, n4);
            }
            this._s -= n;
            if (this._s != 0) {
                return n;
            }
            if (this.j801()) {
                return n3;
            }
        }
        if (this._q == 256 && (this._u & 0xFF) == 0x0) {
            if (vn_._g) {
                return a175(0, ((va_)super._k)._k, array, this._u, n, this._m, this._r, 0, n3, n2, this);
            }
            return b817(((va_)super._k)._k, array, this._u, n, this._p, 0, n3, n2, this);
        }
        else {
            if (vn_._g) {
                return d824(0, 0, ((va_)super._k)._k, array, this._u, n, this._m, this._r, 0, n3, n2, this, this._q, n4);
            }
            return a017(0, 0, ((va_)super._k)._k, array, this._u, n, this._p, 0, n3, n2, this, this._q, n4);
        }
    }
    
    private ni_(final va_ k, final int q, final int w) {
        super._k = k;
        this._t = k._l;
        this._y = k._m;
        this._n = k._j;
        this._q = q;
        this._w = w;
        this._A = 8192;
        this._u = 0;
        this.g797();
    }
    
    private ni_(final va_ k, final int q, final int w, final int a) {
        super._k = k;
        this._t = k._l;
        this._y = k._m;
        this._n = k._j;
        this._q = q;
        this._w = w;
        this._A = a;
        this._u = 0;
        this.g797();
    }
}
