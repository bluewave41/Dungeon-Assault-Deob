final class fh_
{
    int _j;
    private int _h;
    private int _b;
    private int[] _g;
    private int[] _k;
    int _d;
    private int _i;
    int _c;
    private int _f;
    private int _a;
    private int _e;
    
    final int a137(final int n) {
        if (this._i >= this._a) {
            this._h = this._g[this._e++] << 15;
            if (this._e >= this._b) {
                this._e = this._b - 1;
            }
            this._a = (int)(this._k[this._e] / 65536.0 * n);
            if (this._a > this._i) {
                this._f = ((this._g[this._e] << 15) - this._h) / (this._a - this._i);
            }
        }
        this._h += this._f;
        ++this._i;
        return this._h - this._f >> 15;
    }
    
    final void a962(final ec_ ec_) {
        this._b = ec_.readByte();
        this._k = new int[this._b];
        this._g = new int[this._b];
        for (int i = 0; i < this._b; ++i) {
            this._k[i] = ec_.readShort();
            this._g[i] = ec_.readShort();
        }
    }
    
    fh_() {
        this._b = 2;
        this._k = new int[2];
        this._g = new int[2];
        this._k[0] = 0;
        this._k[1] = 65535;
        this._g[0] = 0;
        this._g[1] = 65535;
    }
    
    final void b962(final ec_ ec_) {
        this._d = ec_.readByte();
        this._c = ec_.readInt();
        this._j = ec_.readInt();
        this.a962(ec_);
    }
    
    final void a797() {
        this._a = 0;
        this._e = 0;
        this._f = 0;
        this._h = 0;
        this._i = 0;
    }
}
