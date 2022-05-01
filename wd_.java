final class wd_
{
    static af_ _d;
    //original name: _i
    Animation idleAnimation;
    private int _c;
    static nn_ _f;
    static int _j;
    int _e;
    private int _a;
    private int _b;
    static bf_[] _l;
    private int _h;
    private Animation _g;
    Animation _n;
    int _k;
    private int _m;
    
    final void a556(final byte b, final int n) {
        if (b != 109) {
            return;
        }
        if (this._k == 1) {
            return;
        }
        if (this._k != li_._h) {
            this._c -= n;
            while (0 > this._c) {
                if (this.b154(0)) {
                    continue;
                }
            }
            return;
        }
        this._e -= n >> 2;
        if (0 >= this._e) {
            this._e = 0;
            this._k = 1;
        }
    }
    
    final void a697(final int n, final int n2, final byte b, final int n3, final int n4) {
        if (null == this._n) {
            gf_.b050(n3, n2, n, n4, 0);
            return;
        }
        if (this._e > 0) {
            this.a050(n2, n, n3, n4);
        }
        if (b != 102) {
            return;
        }
        if (256 > this._e) {
            gf_.b669(n3, n2, n, n4, 0, 256 - this._e);
        }
    }
    
    //original signature: final void a942(final int n, final Animation eh_) {
    final void a942(final Animation animation) {
        this.a721(rf_._M, animation);
    }
    
    private final void a423(final byte b) {
        if (this._n != null) {
            this._g = this._n;
            this._h = this._m + 1;
            if (b != 28) {
                wd_._f = null;
            }
            if (this._h >= this._n._c) {
                if (this._a != 0) {
                    if (this._a != rf_._M) {
                        this._g = null;
                        return;
                    }
                    this._h = 0;
                    this._g = this.idleAnimation;
                }
                else {
                    this._h = 0;
                }
            }
            return;
        }
        this._g = null;
    }
    
    static final void a013(final byte b, final int n, final ue_ ue_) {
        final wj_ b2 = Trap._B;
        b2.storeFuzzedOpcode(n);
        final wj_ wj_ = b2;
        ++wj_.currentIndex;
        final int o = b2.currentIndex;
        b2.storeByte(1);
        if (null != ue_._l) {
            b2.storeByte(ue_._l.length);
            b2.storeArray(ue_._l, ue_._l.length);
        }
        else {
            b2.storeByte(0);
        }
        b2.calculateAndStoreChecksum(o);
        final wj_ wj_2 = b2;
        wj_2.currentIndex -= 4;
        if (b >= -68) {
            a013((byte)(-67), -90, null);
        }
        ue_._k = b2.readInt();
        b2.c093(b2.currentIndex - o, -1);
    }
    
    //original signature: final void a721(final int a, final eh_ n, final int n2) {
    final void a721(final int a, final Animation animation) {
        this._a = a;
        this._e = 256;
        this._m = 0;
        this._n = animation;
        if (null == this._n) {
            this._k = 1;
        }
        else {
            this._b = this._n._j[0] * ji_.getRandom(320, 192) >>> 8;
            this._c = this._b;
            this._k = 0;
            this.a423((byte)28);
        }

    }
    
    private final boolean b154(final int n) {
        ++this._m;
        if (this._n._c <= this._m) {
            if (this._a == 0) {
                this._m = 0;
            }
            else {
                if (rf_._M != this._a) {
                    --this._m;
                    this._e = 256;
                    this._k = this._a;
                    return false;
                }
                this.a721(0, this.idleAnimation);
                return false;
            }
        }
        if (n != 0) {
            a150(-49);
        }
        this._b = this._n._j[this._m] * ji_.getRandom(320, 192) >>> 8;
        this._c += this._b;
        this.a423((byte)28);
        return true;
    }
    
    //original signature: wd_(final Animation i) {
    wd_(final Animation idleAnimation) {
        this.idleAnimation = idleAnimation;
        this.a721(0, this.idleAnimation);
        if (null != this.idleAnimation) {
            this.a556((byte)109, oi_.getRandom(this.idleAnimation._f));
        }
    }
    
    //original signature: private final void a050(final int n, final int n2, final int n3, final int n4, final int n5) {
    private final void a050(final int n, final int n3, final int n4, final int n5) {
        final Graphic a571 = this._n.a571(n3, this._m, n5);
        if (a571 != null) {
            a571.c093(n4, n); //this plays frame
            if (null != this._g && (this._n != this._g || this._h != this._m)) {
                final Graphic a572 = this._g.a571(n3, this._h, n5);
                if (null != a572) {
                    ob_.a578(a572, n4, -((this._c << 8) / this._b) + 256, n, true); //this plays frame
                }
            }
            return;
        }
        gf_.b050(n4, n, n3, n5, 0);
    }
    
    public static void a150(final int n) {
        wd_._f = null;
        wd_._d = null;
        wd_._l = null;
        if (n < 5) {
            a013((byte)(-55), -32, null);
        }
    }
    
    //original signature: wd_(final Animation i, final Animation eh_, final int n) {
    wd_(final Animation idleAnimation, final Animation victoryAnimation, final int n) {
        this.idleAnimation = idleAnimation;
        this.a721(n, victoryAnimation);
    }
}
