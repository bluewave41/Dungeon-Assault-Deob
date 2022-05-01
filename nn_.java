final class nn_ extends ne_
{
    static String _k;
    gd_ _l;
    private md_ _m;
    private boolean _i;
    static int[] _j;
    
    //original signature: final void a423(final byte b) {
    final void a423() {
        for (ie_ ie_ = (ie_)this._m.e024(); ie_ != null; ie_ = (ie_)this._m.a024(4)) {
            ie_._m._p = mo_._a;
            ie_._m._m = mo_._a - 256;
            if (ie_._m._B) {
                ie_._m._L = mo_._a;
            }
            ie_._m._B = false;
        }
        this._l = null;
    }
    
    nn_(final boolean i) {
        this._m = new md_();
        this._i = i;
    }
    
    final void a780(final gd_ l, final int n) {
        ie_ ie_ = (ie_)this._m.e024();
        if (n != -256) {
            this._l = null;
        }
        while (null != ie_) {
            ie_._m._m = mo_._a - 256;
            ie_._m._p = mo_._a;
            if (ie_._m != l) {
                if (ie_._m._B) {
                    ie_._m._B = false;
                    ie_._m._L = mo_._a;
                }
            }
            ie_ = (ie_)this._m.a024(4);
        }
        l._C = mo_._a;
        l._B = true;
        this._l = l;
    }
    
    private final void b780(final gd_ gd_, final int n) {
        if (this == gd_._M) {
            if (n != 29339) {
                nn_._k = null;
            }
            for (ie_ ie_ = (ie_)this._m.e024(); ie_ != null; ie_ = (ie_)this._m.a024(4)) {
                if (ie_._m == gd_) {
                    ie_.a487(false);
                }
            }
            gd_._M = null;
            return;
        }
        throw new RuntimeException();
    }
    
    //original signature: final void a507(final gd_ gd_, final byte b) {
    final void a507(final gd_ gd_) {
        if (gd_._M != null) {
            gd_._M.b780(gd_, 29339);
        }
        gd_._M = this;
        for (ie_ ie_ = (ie_)this._m.e024(); null != ie_; ie_ = (ie_)this._m.a024(4)) {
            if (gd_ == ie_._m) {
                return;
            }
        }
        this._m.a865(new ie_(gd_));
    }
    
    public static void b423(final byte b) {
        nn_._k = null;
        nn_._j = null;
        if (b != -80) {
            b423((byte)94);
        }
    }
    
    final void a761(final byte b, final gd_ gd_) {
        if (!this._i) {
            return;
        }
        for (ie_ ie_ = (ie_)this._m.e024(); null != ie_; ie_ = (ie_)this._m.a024(4)) {
            ie_._m._m = mo_._a - 256;
            ie_._m._p = mo_._a;
        }
        gd_._L = mo_._a;
        if (gd_ == this._l) {
            this._l = null;
        }
        gd_._B = false;
    }
}
