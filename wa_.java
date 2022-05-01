final class wa_
{
    private ne_ _i;
    private ne_[] _h;
    //original name: _e
    static String create_account_success;
    private int _n;
    private ne_ _d;
    private int _g;
    //original name: _f
    static String text_no_raids;
    //original name: _c
    static int mouseX;
    static ec_ _b;
    static mb_ _j;
    static boolean _a;
    static int[] _m;
    static int _l;
    
    static final void a374(final int n, final int n2, final int n3, final Graphic cn_, final int n4, final int n5) {
        cn_.drawImage(n4, n5);
        db_.roman12bold.b191(Integer.toString(n), 20 + n4, (cn_.imageHeight + la_.roman12._H >> 1) + n5, n3, n2);
    }
    
    final ne_ a722(final long n, final int n2) {
        if (n2 != 8) {
            wa_._b = null;
        }
        final ne_ ne_ = this._h[(int)((long)(this._n - 1) & n)];
        this._d = ne_._e;
        while (this._d != ne_) {
            if (this._d._h == n) {
                final ne_ d = this._d;
                this._d = this._d._e;
                return d;
            }
            this._d = this._d._e;
        }
        return this._d = null;
    }
    
    final ne_ a457(final boolean b) {
        if (!b) {
            wa_._l = -108;
        }
        this._g = 0;
        return this.a024(4318);
    }
    
    public static void c150() {
        wa_._b = null;
        wa_._m = null;
        wa_._j = null;
        wa_.text_no_raids = null;
        wa_.create_account_success = null;
    }
    
    static final void a238(final Graphic b) {
        ol_._b = b;
    }
    
    //never called
    static final int[] b878(final int n) {
        if (n != -1) {
            b878(20);
        }
        return new int[8];
    }
    
    final ne_ a024(final int n) {
        if (0 < this._g && this._h[this._g - 1] != this._i) {
            final ne_ i = this._i;
            this._i = i._e;
            return i;
        }
        if (n != 4318) {
            return null;
        }
        while (this._g < this._n) {
            final ne_ e = this._h[this._g++]._e;
            if (this._h[this._g - 1] == e) {
                continue;
            }
            this._i = e._e;
            return e;
        }
        return null;
    }
    
    final void a102(final ne_ ne_, final int n, final long h) {
        if (null != ne_._a) {
            ne_.a487(false);
        }
        final ne_ e = this._h[(int)(h & (long)(this._n - 1))];
        ne_._a = e._a;
        ne_._e = e;
        ne_._a._e = ne_;
        if (n != 12460) {
            wa_.create_account_success = null;
        }
        ne_._e._a = ne_;
        ne_._h = h;
    }
    
    wa_(final int n) {
        this._g = 0;
        this._h = new ne_[n];
        this._n = n;
        for (int i = 0; i < n; ++i) {
            final ne_[] h = this._h;
            final int n2 = i;
            final ne_ ne_ = new ne_();
            h[n2] = ne_;
            final ne_ ne_2 = ne_;
            ne_2._a = ne_2;
            ne_2._e = ne_2;
        }
    }
    
    static {
        wa_.create_account_success = "Account created successfully!";
        wa_.text_no_raids = "You have never raided a dungeon.";
        wa_.mouseX = -1;
    }
}
