final class tb_
{
    private ll_ _e;
    static q_ _a;
    //original name: _c
    static Graphic stat_snare;
    static int _i;
    static int _g;
    private ll_[] _d;
    private int _f;
    //original name: _h
    static String desc_orc_blademaster;
    private long _b;
    
    final ll_ a312(final byte b, final long b2) {
        this._b = b2;
        final ll_ ll_ = this._d[(int)(b2 & (long)(this._f - 1))];
        this._e = ll_._n;
        while (ll_ != this._e) {
            if (this._e._o == b2) {
                final ll_ e = this._e;
                this._e = this._e._n;
                return e;
            }
            this._e = this._e._n;
        }
        return this._e = null;
    }
    
    static final void a423() {
        vj_._c = null;
        no_._a = 0;
        ti_._f = false;
        fl_.mouseY = -1;
        wa_.mouseX = -1;
    }
    
    final void a627(final ll_ ll_, final long o, final int n) {
        if (ll_._l != null) {
            ll_.b423();
        }
        final ll_ n2 = this._d[(int)(o & (long)(this._f - 1))];
        if (n >= -60) {
            return;
        }
        ll_._l = n2._l;
        ll_._n = n2;
        ll_._l._n = ll_;
        ll_._o = o;
        ll_._n._l = ll_;
    }
    
    final ll_ c786(final byte b) {
        if (null == this._e) {
            return null;
        }
        while (this._d[(int)(this._b & (long)(this._f - 1))] != this._e) {
            if (this._e._o == this._b) {
                final ll_ e = this._e;
                this._e = this._e._n;
                return e;
            }
            this._e = this._e._n;
        }
        if (b < 0) {
            return null;
        }
        return this._e = null;
    }
    
    public static void b423() {
        tb_.stat_snare = null;
        tb_.desc_orc_blademaster = null;
        tb_._a = null;
    }
    
    //original signature: static final void a540(final boolean b) {
    static final void a540() {
        if (null != ik_._e) {
            ik_._e.a487(true);
        }
    }
    
    tb_(final int f) {
        this._f = f;
        this._d = new ll_[f];
        for (int i = 0; i < f; ++i) {
            final ll_[] d = this._d;
            final int n = i;
            final ll_ ll_ = new ll_();
            d[n] = ll_;
            final ll_ ll_2 = ll_;
            ll_2._l = ll_2;
            ll_2._n = ll_2;
        }
    }
    
    static {
        tb_.desc_orc_blademaster = "A veteran of the constant border wars between the human nations and the orc clans, the orc blademaster's specialty is sudden and silent violence, though he is likely to come off second best in a prolonged fight.";
    }
}
