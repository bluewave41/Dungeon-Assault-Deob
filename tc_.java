final class tc_ extends qb_
{
    private vh_ _z;
    ug_ _A;
    private int _p;
    static int[] _w;
    private int[] _s;
    private vh_ _o;
    private boolean _n;
    private int _r;
    //original name: _u
    static String playerTitle;
    private int[] _y;
    private vh_ _x;
    private boolean _q;
    private ug_ _C;
    static int[] _m;
    ug_ _B;
    private int _t;
    private int _v;
    
    public static void a423(final byte b) {
        tc_._m = null;
        if (b >= -12) {
            return;
        }
        tc_._w = null;
        tc_.playerTitle = null;
    }
    
    //original signature: private final void a785(final ug_ ug_, final int n, final int n2, final int n3) {
    private final void a785(final ug_ ug_, final int n) {
        ug_.a599(n, -1);
        ug_.b093();
    }
    
    @Override
    final qb_ c207() {
        return null;
    }
    
    @Override
    final qb_ d207() {
        return null;
    }
    
    @Override
    final void b397(final int[] array, int n, final int n2) {
        if (0 >= this._t) {
            this.a150(n2);
            return;
        }
        if (this._n) {
            if (this._p <= 0 || this._A.b427((byte)(-126))) {
                if (this._p < 0) {
                    if (!this._B.b427((byte)(-123))) {
                        this._x = null;
                        this._p = -this._p;
                        this._n = false;
                    }
                }
            }
            else {
                this._o = null;
                this._n = false;
                this._p = -this._p;
            }
        }
        final int n3 = (this._v >> 12) * this._t / 256;
        final int n4 = this._t - n3;
        if (this._p != 0) {
            this._v += this._p * n2;
            if (1048576 <= this._v) {
                this._v = 1048576;
                if (!this._n) {
                    this._p = 0;
                    if (!this._q) {
                        if (null != this._x) {
                            this._B.d150();
                        }
                        this._x = null;
                    }
                }
            }
            else if (this._v <= 0) {
                this._v = 0;
                if (!this._n) {
                    this._p = 0;
                    if (!this._q) {
                        if (this._o != null) {
                            this._A.d150();
                        }
                        this._o = null;
                    }
                }
            }
        }
        final int n5 = vn_._g ? (n2 << 1) : n2;
        if (256 > this._r) {
            if (this._o != null || null != this._x) {
                if (256 != n3) {
                    if (n4 == 256) {
                        this._B.b397(array, n, n2);
                    }
                    else {
                        if (this._s == null || this._s.length < n5) {
                            this._s = new int[n5];
                            this._y = new int[n5];
                        }
                        else {
                            cj_.a397(this._s, 0, n5);
                            cj_.a397(this._y, 0, n5);
                        }
                        this._A.b397(this._s, 0, n2);
                        this._B.b397(this._y, 0, n2);
                        final int n6 = vn_._g ? (n <<= 1) : n;
                        for (int i = 0; i < n5; ++i) {
                            final int n7 = i + n6;
                            array[n7] += n3 * this._s[i] + this._y[i] * n4 >> 8;
                        }
                    }
                }
                else {
                    this._A.b397(array, n, n2);
                }
            }
        }
        if (null != this._z) {
            if (this._r != 0) {
                if (this._s == null || this._s.length < n5) {
                    this._y = new int[n5];
                    this._s = new int[n5];
                }
                else {
                    cj_.a397(this._s, 0, n5);
                }
                this._C.b397(this._s, 0, n2);
                final int n8 = vn_._g ? (n <<= 1) : n;
                final int n9 = this._t * this._r / 256;
                final int n10 = this._t - n9;
                for (int j = 0; j < n5; ++j) {
                    array[n8 + j] = n9 * this._s[j] + array[n8 + j] * n10 >> 8;
                }
            }
        }
    }
    
    //original signature: final synchronized void a188(final int n, final int n2, final int n3, final vh_ vh_, final int n4, final boolean n5) {
    final synchronized void a188(final int n3, final vh_ vh_, final int n4, final boolean n5) {
        if (this._n && n5) {
            if (this._p <= 0) {
                if (this._x != null) {
                    this._B.d150();
                }
                this._x = vh_;
                if (vh_ != null) {
                    this._B.a787(vh_, 20938, false);
                    this.a785(this._B, n4);
                }
            }
            else {
                if (null != this._o) {
                    this._A.d150();
                }
                this._o = vh_;
                if (null != vh_) {
                    this._A.a787(vh_, 20938, false);
                    this.a785(this._A, n4);
                }
            }
            return;
        }
        this._n = n5;
        if (this._o == vh_) {
            this._p = n3;
            this.a785(this._A, n4);
            return;
        }
        if (this._x == vh_) {
            this._p = -n3;
            this.a785(this._B, n4);
            return;
        }
        if (this._o == null || (this._x != null && this._v < 524288)) {
            if (null != this._o) {
                this._A.d150();
            }
            if (null != (this._o = vh_)) {
                this._A.a787(vh_, 20938, !n5);
                this.a785(this._A, n4);
            }
            this._p = n3;
        }
        else {
            if (this._x != null) {
                this._B.d150();
            }
            this._x = vh_;
            if (vh_ != null) {
                this._B.a787(vh_, 20938, !n5);
                this.a785(this._B, n4);
            }
            this._p = -n3;
        }
    }
    
    final synchronized void a093(final int t, final int n) {
        if (n != 256) {
            this.c207();
        }
        this._t = t;
    }
    
    private final void a905(final boolean b, final ug_ a, final ug_ b2) {
        this._B = b2;
        this._v = 1048576;
        if (!b) {
            a423((byte)14);
        }
        this._A = a;
    }
    
	@Override
    final synchronized int return8() {
        return 2;
    }
    
    @Override
    final synchronized void a150(final int n) {
        if (0 < this._v && this._o != null) {
            this._A.a150(n);
        }
        if (this._v < 1048576) {
            if (null != this._x) {
                this._B.a150(n);
            }
        }
        if (0 < this._r) {
            if (this._z != null) {
                this._C.a150(n);
            }
        }
        if (this._n) {
            if (0 < this._p && !this._A.b427((byte)(-127))) {
                this._o = null;
                this._n = false;
                this._p = -this._p;
            }
            else if (this._p < 0 && !this._B.b427((byte)(-121))) {
                this._x = null;
                this._p = -this._p;
                this._n = false;
            }
        }
        if (this._p != 0) {
            this._v += n * this._p;
            if (1048576 <= this._v) {
                this._v = 1048576;
                if (!this._n) {
                    this._p = 0;
                    if (!this._q) {
                        if (this._x != null) {
                            this._B.d150();
                        }
                        this._x = null;
                    }
                }
            }
            else if (0 >= this._v) {
                this._v = 0;
                if (!this._n) {
                    this._p = 0;
                    if (!this._q) {
                        if (this._o != null) {
                            this._A.d150();
                        }
                        this._o = null;
                    }
                }
            }
        }
    }
    
    //original signature: final void b423(final byte b) {
    final void b423() {
        if (null != this._o) {
            this._A.d150();
        }
        if (null != this._x) {
            this._B.d150();
        }
        this._o = null;
        this._x = null;
    }
    
    //original signature: static final void a366(final int n, final byte b) {
    static final void a366(final int n) {
        for (pm_ pm_ = (pm_)li_._a.e024(); pm_ != null; pm_ = (pm_)li_._a.a024(4)) {
            ro_.createOpcode7(pm_);
        }
    }
    
    public tc_() {
        this._q = false;
        this._r = 0;
        this._t = 256;
        final ug_ ug_ = new ug_();
        this.a905(true, ug_, new ug_(ug_));
    }
    
    static {
        tc_._m = new int[8192];
    }
}
