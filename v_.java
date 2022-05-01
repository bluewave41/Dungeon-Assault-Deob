final class v_
{
    private int _b;
    private int _a;
    private wg_[] _c;
    
    static final v_ a141(final nh_ nh_, final int n, final int n2) {
        final byte[] b337 = nh_.b337(n, n2);
        if (b337 == null) {
            return null;
        }
        return new v_(new ec_(b337));
    }
    
    final va_ a981() {
        return new va_(this.b928(), 22050 * this._a / 1000, 22050 * this._b / 1000);
    }
    
    private final byte[] b928() {
        int n = 0;
        for (int i = 0; i < 10; ++i) {
            if (this._c[i] != null && this._c[i]._s + this._c[i]._o > n) {
                n = this._c[i]._s + this._c[i]._o;
            }
        }
        if (n == 0) {
            return new byte[0];
        }
        final byte[] array = new byte[22050 * n / 1000];
        for (int j = 0; j < 10; ++j) {
            if (this._c[j] != null) {
                final int n2 = this._c[j]._s * 22050 / 1000;
                final int n3 = this._c[j]._o * 22050 / 1000;
                final int[] a111 = this._c[j].a111(n2, this._c[j]._s);
                for (int k = 0; k < n2; ++k) {
                    int n4 = array[k + n3] + (a111[k] >> 8);
                    if ((n4 + 128 & 0xFFFFFF00) != 0x0) {
                        n4 = (n4 >> 31 ^ 0x7F);
                    }
                    array[k + n3] = (byte)n4;
                }
            }
        }
        return array;
    }
    
    private v_(final ec_ ec_) {
        this._c = new wg_[10];
        for (int i = 0; i < 10; ++i) {
            if (ec_.readByte() != 0) {
                --ec_.currentIndex;
                (this._c[i] = new wg_()).a962(ec_);
            }
        }
        this._a = ec_.readShort();
        this._b = ec_.readShort();
    }
}
