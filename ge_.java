final class ge_ extends qb_
{
    private float _w;
    private int[] _z;
    private float _r;
    private we_[] _s;
    private float _p;
    //original name: _y
    private IndexedBuffer[] indexedBuffers;
    private float _n;
    private we_[] _x;
    //original name: _u
    private IndexedBuffer[] indexedBuffers2;
    private float _v;
    private float _m;
    private qb_ _t;
    private float _o;
    private float _q;
    private float _A;
    
    @Override
    final int return8() {
        return 8;
    }
    
    final synchronized void d267(final float r) {
        this._r = r;
        this._p = 1.0f - (float)Math.pow(0.5, 1000000.0 / (this._r * vn_._t));
    }
    
    final synchronized void b267(final float n) {
        this._n = n;
    }
    
    final synchronized void c267(final float w) {
        this._w = w;
        this._v = (float)(this._q * Math.sqrt((1.0f + this._w) * 0.5));
        this._m = (float)(this._q * Math.sqrt((1.0f - this._w) * 0.5));
    }
    
    @Override
    final synchronized void a150(final int n) {
        if (this._t != null) {
            this._t.a150(n);
        }
    }
    
    final synchronized void a267(final float q) {
        this._q = q;
        this._v = (float)(this._q * Math.sqrt((1.0f + this._w) * 0.5));
        this._m = (float)(this._q * Math.sqrt((1.0f - this._w) * 0.5));
    }
    
    @Override
    final synchronized void b397(final int[] array, int i, int n) {
        this.e797();
        n += i;
        while (i < n) {
            int n2 = n - i;
            if (n2 > 256) {
                n2 = 256;
            }
            if (this._t != null) {
                this._t.b397(this._z, 0, n2);
            }
            int j = 0;
            for (int k = 0; k < 8; ++k) {
                j = a345(j, this._x[k]._c, this._x[k]._a, n2);
            }
            for (int l = 0; l < 4; ++l) {
                j = a345(j, this.indexedBuffers[l].data, this.indexedBuffers[l].index, n2);
            }
            if (vn_._g) {
                for (int n3 = 0; n3 < 8; ++n3) {
                    j = a345(j, this._s[n3]._c, this._s[n3]._a, n2);
                }
                for (int n4 = 0; n4 < 4; ++n4) {
                    j = a345(j, this.indexedBuffers2[n4].data, this.indexedBuffers2[n4].index, n2);
                }
                n2 <<= 1;
                i <<= 1;
            }
            for (int n5 = 0; n5 < n2; ++n5) {
                int n6 = this._z[n5];
                if (n6 > 0) {
                    n6 = -n6;
                }
                if (n6 < j) {
                    j = n6;
                }
            }
            int n7 = 0;
            while (j <= -4096) {
                ++n7;
                j >>= 1;
            }
            final int n8 = (int)(this._A * 4096.0f);
            final int n9 = (int)(this._p * 4096.0f);
            final int n10 = (int)(this._n * 4096.0f);
            final int n11 = (int)(this._o * 65536.0f);
            if (vn_._g) {
                final int n12 = (int)(this._v * 4096.0f);
                final int n13 = (int)(this._m * 4096.0f);
                int n14 = 0;
                while (n14 < n2) {
                    final int n15 = this._z[n14++] >> n7;
                    final int n16 = this._z[n14++] >> n7;
                    final int n17 = (n15 + n16) * n11 >> 17;
                    int n18 = 0;
                    for (int n19 = 0; n19 < 8; ++n19) {
                        final we_ we_ = this._x[n19];
                        final int n20 = we_._c[we_._a] >> n7;
                        final int n21 = we_._b >> n7;
                        final int n22 = n21 + ((n20 - n21) * n9 + 2048 >> 12);
                        we_._b = n22 << n7;
                        we_._c[we_._a] = n17 + (n22 * n8 + 2048 >> 12) << n7;
                        if (++we_._a >= we_._c.length) {
                            we_._a = 0;
                        }
                        n18 += n20;
                    }
                    for (int n23 = 0; n23 < 4; ++n23) {
                        final IndexedBuffer el_ = this.indexedBuffers[n23];
                        final int n24 = el_.data[el_.index] >> n7;
                        n18 = n24 - n18;
                        el_.data[el_.index] = n17 + (n24 * 2048 + 2048 >> 12) << n7;
                        if (++el_.index >= el_.data.length) {
                            el_.index = 0;
                        }
                    }
                    int n25 = 0;
                    for (int n26 = 0; n26 < 8; ++n26) {
                        final we_ we_2 = this._s[n26];
                        final int n27 = we_2._c[we_2._a] >> n7;
                        final int n28 = we_2._b >> n7;
                        final int n29 = n28 + ((n27 - n28) * n9 + 2048 >> 12);
                        we_2._b = n29 << n7;
                        we_2._c[we_2._a] = n17 + (n29 * n8 + 2048 >> 12) << n7;
                        if (++we_2._a >= we_2._c.length) {
                            we_2._a = 0;
                        }
                        n25 += n27;
                    }
                    for (int n30 = 0; n30 < 4; ++n30) {
                        final IndexedBuffer el_2 = this.indexedBuffers2[n30];
                        final int n31 = el_2.data[el_2.index] >> n7;
                        n25 = n31 - n25;
                        el_2.data[el_2.index] = n17 + (n31 * 2048 + 2048 >> 12) << n7;
                        if (++el_2.index >= el_2.data.length) {
                            el_2.index = 0;
                        }
                    }
                    if (n7 > 12) {
                        final int n32 = i++;
                        array[n32] += n18 * n12 + n25 * n13 + n15 * n10 << n7 - 12;
                        final int n33 = i++;
                        array[n33] += n25 * n12 + n18 * n13 + n16 * n10 << n7 - 12;
                    }
                    else {
                        final int n34 = i++;
                        array[n34] += n18 * n12 + n25 * n13 + n15 * n10 >> 12 - n7;
                        final int n35 = i++;
                        array[n35] += n25 * n12 + n18 * n13 + n16 * n10 >> 12 - n7;
                    }
                }
                i >>= 1;
            }
            else {
                final int n36 = (int)(this._q * 4096.0f);
                for (int n37 = 0; n37 < n2; ++n37) {
                    final int n38 = this._z[n37] >> n7;
                    final int n39 = n38 * n11 >> 16;
                    int n40 = 0;
                    for (int n41 = 0; n41 < 8; ++n41) {
                        final we_ we_3 = this._x[n41];
                        final int n42 = we_3._c[we_3._a] >> n7;
                        final int n43 = we_3._b >> n7;
                        final int n44 = n43 + ((n42 - n43) * n9 + 2048 >> 12);
                        we_3._b = n44 << n7;
                        we_3._c[we_3._a] = n39 + (n44 * n8 + 2048 >> 12) << n7;
                        if (++we_3._a >= we_3._c.length) {
                            we_3._a = 0;
                        }
                        n40 += n42;
                    }
                    for (int n45 = 0; n45 < 4; ++n45) {
                        final IndexedBuffer el_3 = this.indexedBuffers[n45];
                        final int n46 = el_3.data[el_3.index] >> n7;
                        n40 = n46 - n40;
                        el_3.data[el_3.index] = n39 + (n46 * 2048 + 2048 >> 12) << n7;
                        if (++el_3.index >= el_3.data.length) {
                            el_3.index = 0;
                        }
                    }
                    if (n7 > 12) {
                        final int n47 = i++;
                        array[n47] += n40 * n36 + n38 * n10 << n7 - 12;
                    }
                    else {
                        final int n48 = i++;
                        array[n48] += n40 * n36 + n38 * n10 >> 12 - n7;
                    }
                }
            }
            if (this._t != null) {
                cj_.a397(this._z, 0, n2);
            }
        }
    }
    
    @Override
    final qb_ c207() {
        return null;
    }
    
    final synchronized void e267(final float a) {
        this._A = a;
    }
    
    @Override
    final qb_ d207() {
        return this._t;
    }
    
    private final void e797() {
        if (vn_._g) {
            if (this._s == null) {
                for (int i = 0; i < 8; ++i) {
                    this._x[i].a797();
                }
                for (int j = 0; j < 4; ++j) {
                    this.indexedBuffers[j].clear();
                }
                (this._s = new we_[8])[0] = new we_(1139 * vn_._t / 44100);
                this._s[1] = new we_(1211 * vn_._t / 44100);
                this._s[2] = new we_(1300 * vn_._t / 44100);
                this._s[3] = new we_(1379 * vn_._t / 44100);
                this._s[4] = new we_(1445 * vn_._t / 44100);
                this._s[5] = new we_(1514 * vn_._t / 44100);
                this._s[6] = new we_(1580 * vn_._t / 44100);
                this._s[7] = new we_(1640 * vn_._t / 44100);
                (this.indexedBuffers2 = new IndexedBuffer[4])[0] = new IndexedBuffer(579 * vn_._t / 44100); //sample rates?
                this.indexedBuffers2[1] = new IndexedBuffer(464 * vn_._t / 44100);
                this.indexedBuffers2[2] = new IndexedBuffer(364 * vn_._t / 44100);
                this.indexedBuffers2[3] = new IndexedBuffer(248 * vn_._t / 44100);
                this._z = new int[512];
            }
        }
        else if (this._s != null) {
            for (int k = 0; k < 8; ++k) {
                this._x[k].a797();
            }
            for (int l = 0; l < 4; ++l) {
                this.indexedBuffers[l].clear();
            }
            this._s = null;
            this.indexedBuffers2 = null;
            this._z = new int[256];
        }
    }
    
    private static final int a345(int n, final int[] array, int n2, int length) {
        if (length > array.length) {
            length = array.length;
        }
        for (int i = 0; i < length; ++i) {
            int n3 = array[n2];
            if (n3 > 0) {
                n3 = -n3;
            }
            if (n3 < n) {
                n = n3;
            }
            if (++n2 == array.length) {
                n2 = 0;
            }
        }
        return n;
    }
    
    ge_(final qb_ t) {
        (this._x = new we_[8])[0] = new we_(1116 * vn_._t / 44100);
        this._x[1] = new we_(1188 * vn_._t / 44100);
        this._x[2] = new we_(1277 * vn_._t / 44100);
        this._x[3] = new we_(1356 * vn_._t / 44100);
        this._x[4] = new we_(1422 * vn_._t / 44100);
        this._x[5] = new we_(1491 * vn_._t / 44100);
        this._x[6] = new we_(1557 * vn_._t / 44100);
        this._x[7] = new we_(1617 * vn_._t / 44100);
        (this.indexedBuffers = new IndexedBuffer[4])[0] = new IndexedBuffer(556 * vn_._t / 44100);
        this.indexedBuffers[1] = new IndexedBuffer(441 * vn_._t / 44100);
        this.indexedBuffers[2] = new IndexedBuffer(341 * vn_._t / 44100);
        this.indexedBuffers[3] = new IndexedBuffer(225 * vn_._t / 44100);
        if (!vn_._g) {
            this._z = new int[256];
        }
        this.e797();
        this.f267(0.045f);
        this.a267(1.0f);
        this.e267(0.84f);
        this.b267(1.0f);
        this.d267(7000.0f);
        this.c267(1.0f);
        this._t = t;
    }
    
    final synchronized void f267(final float o) {
        this._o = o;
    }
}
