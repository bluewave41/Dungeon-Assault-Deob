final class vm_
{
    private ec_ _a;
    private static byte[] _g;
    private long _b;
    int[] _d;
    private int[] _e;
    private int[] _i;
    private int _h;
    int _c;
    private int[] _f;
    
    final void e797() {
        this._a.currentIndex = -1;
    }
    
    final boolean g801() {
        return this._a.buffer != null;
    }
    
    final void d150(final int n) {
        this._a.currentIndex = this._f[n];
    }
    
    final void c797() {
        this._a.buffer = null;
        this._i = null;
        this._f = null;
        this._d = null;
        this._e = null;
    }
    
    private final int a080(final int n, final int n2) {
        if (n2 != 255) {
            final byte b = vm_._g[n2 - 128];
            int n3 = n2;
            if (b >= 1) {
                n3 |= this._a.readByte() << 8;
            }
            if (b >= 2) {
                n3 |= this._a.readByte() << 16;
            }
            return n3;
        }
        final int c474 = this._a.readByte();
        int e137 = this._a.e137();
        if (c474 == 47) {
            final ec_ a = this._a;
            a.currentIndex += e137;
            return 1;
        }
        if (c474 == 81) {
            final int f137 = this._a.readTribyte(-116);
            e137 -= 3;
            this._b += this._d[n] * (long)(this._h - f137);
            this._h = f137;
            final ec_ a2 = this._a;
            a2.currentIndex += e137;
            return 2;
        }
        final ec_ a3 = this._a;
        a3.currentIndex += e137;
        return 3;
    }
    
    final void b150(final int n) {
        final int e137 = this._a.e137();
        final int[] d = this._d;
        d[n] += e137;
    }
    
    final void a604(final byte[] m) {
        this._a.buffer = m;
        this._a.currentIndex = 10;
        final int k137 = this._a.readShort();
        this._c = this._a.readShort();
        this._h = 500000;
        this._i = new int[k137];
        int i = 0;
        while (i < k137) {
            final int h137 = this._a.readInt();
            final int h138 = this._a.readInt();
            if (h137 == 1297379947) {
                this._i[i] = this._a.currentIndex;
                ++i;
            }
            final ec_ a = this._a;
            a.currentIndex += h138;
        }
        this._b = 0L;
        this._f = new int[k137];
        for (int j = 0; j < k137; ++j) {
            this._f[j] = this._i[j];
        }
        this._d = new int[k137];
        this._e = new int[k137];
    }
    
    final int a784() {
        return this._f.length;
    }
    
    final int b784() {
        final int length = this._f.length;
        int n = -1;
        int n2 = Integer.MAX_VALUE;
        for (int i = 0; i < length; ++i) {
            if (this._f[i] >= 0) {
                if (this._d[i] < n2) {
                    n = i;
                    n2 = this._d[i];
                }
            }
        }
        return n;
    }
    
    final void a150(final int n) {
        this._f[n] = this._a.currentIndex;
    }
    
    final void a111(final long b) {
        this._b = b;
        for (int length = this._f.length, i = 0; i < length; ++i) {
            this._d[i] = 0;
            this._e[i] = 0;
            this._a.currentIndex = this._i[i];
            this.b150(i);
            this._f[i] = this._a.currentIndex;
        }
    }
    
    final int c137(final int n) {
        return this.f137(n);
    }
    
    private final int f137(final int n) {
        final byte b = this._a.buffer[this._a.currentIndex];
        int n2;
        if (b < 0) {
            n2 = (b & 0xFF);
            this._e[n] = n2;
            final ec_ a = this._a;
            ++a.currentIndex;
        }
        else {
            n2 = this._e[n];
        }
        if (n2 == 240 || n2 == 247) {
            final int e137 = this._a.e137();
            if (n2 == 247 && e137 > 0) {
                final int n3 = this._a.buffer[this._a.currentIndex] & 0xFF;
                if ((n3 >= 241 && n3 <= 243) || n3 == 246 || n3 == 248 || (n3 >= 250 && n3 <= 252) || n3 == 254) {
                    final ec_ a2 = this._a;
                    ++a2.currentIndex;
                    this._e[n] = n3;
                    return this.a080(n, n3);
                }
            }
            final ec_ a3 = this._a;
            a3.currentIndex += e137;
            return 0;
        }
        return this.a080(n, n2);
    }
    
    public static void d797() {
        vm_._g = null;
    }
    
    final long e138(final int n) {
        return this._b + n * (long)this._h;
    }
    
    final boolean f801() {
        for (int length = this._f.length, i = 0; i < length; ++i) {
            if (this._f[i] >= 0) {
                return false;
            }
        }
        return true;
    }
    
    vm_() {
        this._a = new ec_(null);
    }
    
    vm_(final byte[] array) {
        this._a = new ec_(null);
        this.a604(array);
    }
    
    static {
        vm_._g = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    }
}
