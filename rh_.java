final class rh_
{
    int _g;
    private Graphic _d;
    //original name: _c
    private int imageWidth;
    int _a;
    int _h;
    int _b;
    int _e;
    //original name: _f
    private int imageHeight;
    
    final void b797() {
        this.c797();
    }
    
    final void a601(final Graphic cn_, int i, int j) {
        int n = (int)(32.0 * (1.0 + te_.a132(mo_._a << 4)));
        if (n < 0) {
            n = 0;
        }
        if (n > 64) {
            n = 64;
        }
        i += cn_._w;
        j += cn_._A;
        int n2 = i + j * this.imageWidth;
        int n3 = 0;
        int v = cn_.imageHeight;
        int y = cn_.imageWidth;
        int n4 = this.imageWidth - y;
        int n5 = 0;
        if (j < 0) {
            v += j;
            n3 -= j * y;
            n2 -= j * this.imageWidth;
            j = 0;
        }
        if (j + v > this.imageHeight) {
            v -= j + v - this.imageHeight;
        }
        if (i < 0) {
            y += i;
            n3 -= i;
            n2 -= i;
            n5 -= i;
            n4 -= i;
            i = 0;
        }
        if (i + y > this.imageWidth) {
            final int n6 = i + y - this.imageWidth;
            y -= n6;
            n5 += n6;
            n4 += n6;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        for (j = -v; j < 0; ++j, n2 += n4, n3 += n5) {
            for (i = -y; i < 0; ++i, ++n2, ++n3) {
                if (cn_._B[n3] != 0) {
                    this._d._B[n2] = this._e + oi_.getRandom(n + 1) * this._h;
                }
            }
        }
        this.c797();
    }
    
    final void e797() {
        int n = (int)(32.0 * (1.0 + te_.a132(mo_._a << 4)));
        if (n < 0) {
            n = 0;
        }
        if (n > 64) {
            n = 64;
        }
        for (int i = 0; i < 2; ++i) {
            this._d._B[this.imageWidth * this.imageHeight - this.imageWidth - (this.imageWidth >> 1) - 1 + i] = this._e + oi_.getRandom(n + 1) * this._h;
            this._d._B[this.imageWidth * this.imageHeight - (this.imageWidth >> 1) - 1 + i] = this._e + oi_.getRandom(n + 1) * this._h;
        }
        this.c797();
    }
    
    private final void c797() {
        final int[] b = this._d._B;
        final int y = this._d.imageWidth;
        final int v = this._d.imageHeight;
        int n = y + 1;
        for (int i = 2 - v; i < 0; ++i) {
            int n2 = b[n - 1];
            int n3 = b[n];
            int n4 = b[n + 1];
            for (int j = 2 - y; j < 0; ++j) {
                final int n5 = b[n - y];
                b[n - y] = ((n5 & 0xFF00) + (n2 & 0xFF00) + (n3 & 0xFF00) + (n4 & 0xFF00) >> 2 & 0xFF00) + ((n5 & 0xFF00FF) + (n2 & 0xFF00FF) + (n3 & 0xFF00FF) + (n4 & 0xFF00FF) >> 2 & 0xFF00FF);
                ++n;
                n2 = n3;
                n3 = n4;
                n4 = b[n + 1];
            }
            n += 2;
        }
        for (int k = b.length - 1; k >= 0; --k) {
            final int n6 = b[k];
            b[k] = (((n6 & 0xFF00FF) * this._a & 0xFF00FF00) | ((n6 & 0xFF00) * this._a & 0xFF0000)) >>> 8;
        }
        this._d.b326(this._g - (this.imageWidth >> 1), this._b - this.imageHeight, 256);
        this._d.b326(this._g - (this.imageWidth >> 1), this._b - this.imageHeight, 256);
    }
    
    final void d797() {
        int n = (int)(32.0 * (1.0 + te_.a132(mo_._a << 4)));
        if (n < 0) {
            n = 0;
        }
        if (n > 64) {
            n = 64;
        }
        for (int i = 0; i < 3; ++i) {
            this._d._B[this.imageWidth * this.imageHeight - this.imageWidth - (this.imageWidth >> 1) - 1 + i] = this._e + oi_.getRandom(n + 1) * this._h;
        }
        this.c797();
    }
    
    final void a797() {
        this._d.b326(this._g - (this.imageWidth >> 1), this._b - this.imageHeight, 256);
        this._d.b326(this._g - (this.imageWidth >> 1), this._b - this.imageHeight, 256);
    }
    
    //original signature: rh_(final int g, final int b, final int c, final int f, final int e, final int h, final int a) {
    rh_(final int g, final int b, final int imageWidth, final int imageHeight, final int e, final int h, final int a) {
        this._g = g;
        this._b = b;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this._d = new Graphic(this.imageWidth, this.imageHeight);
        this._e = e;
        this._h = h;
        this._a = a;
    }
}
