final class ol_
{
    private long[] _f;
    private long[] _g;
    private long[] _j;
    static int[] _k;
    private byte[] _m;
    static af_ _i;
    private int _h;
    private long[] _c;
    private byte[] _l;
    private int _d;
    static Graphic[] _a;
    private long[] _e;
    static Graphic _b;
    
    final void a331(final byte b, final byte[] array, final int n) {
        this._m[this._h] = (byte)mp_.or(this._m[this._h], 128 >>> nb_.and(this._d, 7));
        ++this._h;
        if (this._h > 32) {
            while (this._h < 64) {
                this._m[this._h++] = 0;
            }
            this.a150(b + 96);
            this._h = 0;
        }
        while (this._h < 32) {
            this._m[this._h++] = 0;
        }
        cj_.a278(this._l, 0, this._m, 32, 32);
        this.a150(8);
        for (int i = 0, n2 = n; i < 8; ++i, n2 += 8) {
            final long n3 = this._g[i];
            array[n2] = (byte)(n3 >>> 56);
            array[1 + n2] = (byte)(n3 >>> 48);
            array[2 + n2] = (byte)(n3 >>> 40);
            array[n2 + 3] = (byte)(n3 >>> 32);
            array[n2 + 4] = (byte)(n3 >>> 24);
            array[n2 + 5] = (byte)(n3 >>> 16);
            array[n2 + 6] = (byte)(n3 >>> 8);
            array[n2 + 7] = (byte)n3;
        }
    }
    
    //original signature: final void b150(final int n) {
    final void b150() {
        for (int n = 0; n < 32; n++) {
            this._l[n] = 0;
        }
        this._d = 0;
        this._m[0] = 0;
        this._h = 0;
        for (int n3 = 0; n3 < 8; n3++) {
            this._g[n3] = 0L;
        }
    }
    
    private final void a150(final int n) {
        for (int n2 = 0, n3 = 0; 8 > n2; ++n2, n3 += 8) {
            this._j[n2] = mn_.xor(eg_.and(255L, this._m[7 + n3]), mn_.xor(eg_.and(this._m[6 + n3], 255L) << 8, mn_.xor(mn_.xor(eg_.and(255L, this._m[4 + n3]) << 24, mn_.xor(eg_.and(255L, this._m[n3 + 3]) << 32, mn_.xor(eg_.and((long)this._m[2 + n3] << 40, 280375465082880L), mn_.xor(eg_.and(255L, this._m[1 + n3]) << 48, (long)this._m[n3] << 56)))), eg_.and((long)this._m[5 + n3] << 16, 16711680L))));
        }
        for (int i = 0; i < 8; ++i) {
            final long[] f = this._f;
            final int n4 = i;
            final long n5 = this._j[i];
            final long[] c = this._c;
            final int n6 = i;
            final long n7 = this._g[i];
            c[n6] = n7;
            f[n4] = mn_.xor(n5, n7);
        }
        if (n != 8) {
            this._j = null;
        }
        for (int n8 = 1; 10 >= n8; ++n8) {
            for (int j = 0; j < 8; ++j) {
                this._e[j] = 0L;
                int k = 0;
                int n9 = 56;
                while (k < 8) {
                    this._e[j] = mn_.xor(this._e[j], gh_._h[k][nb_.and(255, (int)(this._c[nb_.and(7, j - k)] >>> n9))]);
                    n9 -= 8;
                    ++k;
                }
            }
            for (int l = 0; l < 8; ++l) {
                this._c[l] = this._e[l];
            }
            this._c[0] = mn_.xor(this._c[0], gh_._a[n8]);
            for (int n10 = 0; 8 > n10; ++n10) {
                this._e[n10] = this._c[n10];
                int n11 = 0;
                int n12 = 56;
                while (8 > n11) {
                    this._e[n10] = mn_.xor(this._e[n10], gh_._h[n11][nb_.and(255, (int)(this._f[nb_.and(7, n10 - n11)] >>> n12))]);
                    n12 -= 8;
                    ++n11;
                }
            }
            for (int n13 = 0; 8 > n13; ++n13) {
                this._f[n13] = this._e[n13];
            }
        }
        for (int n14 = 0; 8 > n14; ++n14) {
            this._g[n14] = mn_.xor(this._g[n14], mn_.xor(this._f[n14], this._j[n14]));
        }
    }
    
    public static void a423() {
        ol_._a = null;
        ol_._i = null;
        ol_._k = null;
        ol_._b = null;
    }
    
    //original signature: final void a453(long n, final int n2, final byte[] array) {
    final void a453(long n, final byte[] array) {
        int n3 = 0;
        final int n4 = 0x7 & -(0x7 & (int)n) + 8;
        final int n5 = 0x7 & this._d;
        long n6 = n;
        int i = 31;
        int n7 = 0;
        while (i >= 0) {
            final int n8 = n7 + (((int)n6 & 0xFF) + (0xFF & this._l[i]));
            this._l[i] = (byte)n8;
            n7 = n8 >>> 8;
            n6 >>>= 8;
            --i;
        }
        while (n > 8L) {
            final int n9 = (0xFF & array[n3] << n4) | (array[n3 + 1] & 0xFF) >>> -n4 + 8;
            if (0 > n9 || n9 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this._m[this._h] = (byte)mp_.or(this._m[this._h], n9 >>> n5);
            ++this._h;
            this._d += 8 - n5;
            if (512 == this._d) {
                this.a150(8);
                this._d = 0;
                this._h = 0;
            }
            this._m[this._h] = (byte)nb_.and(n9 << -n5 + 8, 255);
            n -= 8L;
            ++n3;
            this._d += n5;
        }
        int n10;
        if (n > 0L) {
            n10 = (array[n3] << n4 & 0xFF);
            this._m[this._h] = (byte)mp_.or(this._m[this._h], n10 >>> n5);
        }
        else {
            n10 = 0;
        }
        if (n + n5 >= 8L) {
            this._d += -n5 + 8;
            n -= 8 - n5;
            ++this._h;
            if (512 == this._d) {
                this.a150(8);
                this._h = 0;
                this._d = 0;
            }
            this._m[this._h] = (byte)nb_.and(255, n10 << -n5 + 8);
            this._d += (int)n;
        }
        else {
            this._d += (int)n;
        }
    }
    
    static final void a093(final int n, final int n2) {
        for (ue_ ue_ = (ue_)qm_._q.e024(); null != ue_; ue_ = (ue_)qm_._q.a024(n ^ 0xC)) {
            wd_.a013((byte)(-69), n2, ue_);
        }
        if (n != 8) {
            a423();
        }
        for (ne_ ne_ = bg_._s.e024(); ne_ != null; ne_ = bg_._s.a024(n ^ 0xC)) {
            hp_.a366(n2);
        }
    }
    
    ol_() {
        this._g = new long[8];
        this._f = new long[8];
        this._j = new long[8];
        this._d = 0;
        this._m = new byte[64];
        this._c = new long[8];
        this._l = new byte[32];
        this._e = new long[8];
        this._h = 0;
    }
}
