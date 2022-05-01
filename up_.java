final class up_
{
	//original name: _d
    static int componentWidth;
    private ll_ _a;
    //original name: _c
    static String[] ability_retreat;
    private ll_ _e;
    //original name: _b
    static Graphic piece_zealot;
    
    //original signature: final ll_ c729(final int n) {
    final ll_ c729() {
        final ll_ n2 = this._a._n;
        if (n2 != this._a) {
            this._e = n2._n;
            return n2;
        }
        return this._e = null;
    }
    
    static final void c423() {
        jn_._n.a430(100, false);
        if (hj_.mouseX != -1) {
            qe_._l = Animation.mouseY << 16;
            qe_._f = hj_.mouseX << 16;
        }
        final int n = -qe_._n + qe_._f;
        final int n2 = qe_._l - qe_._c;
        final int n3 = ug_.a527(true, (n2 >> 12) * (n2 >> 12) + (n >> 12) * (n >> 12)) >> 6;
        if (0 <= n3) {
            if (n3 != 0) {
                final int n4 = n2 / n3;
                qe_._a += n / n3;
                qe_._j += n4;
                qe_._j = 14 * qe_._j >> 4;
                qe_._a = qe_._a * 14 >> 4;
            }
            qe_._n += (int)(1048576.0 * te_.a132(mo_._a));
            qe_._c += (int)(te_.a132(mo_._a ^ 0xBCC67) * 1048576.0);
            qe_._c += qe_._j;
            qe_._n += qe_._a;
            return;
        }
        throw new RuntimeException();
    }
    
    final ll_ a729(final int n) {
        final ll_ n2 = this._a._n;
        if (n2 == this._a) {
            return null;
        }
        n2.b423();
        return n2;
    }
    
    final ll_ a786(final byte b) {
        final ll_ e = this._e;
        if (e == this._a) {
            return this._e = null;
        }
        this._e = e._n;
        if (b <= 47) {
            up_.ability_retreat = null;
        }
        return e;
    }
    
    static final void b150() {
        lp_.a178(td_._d, true, he_._m);
        jd_._l = true;
    }
    
    //original signature: final void a857(final ll_ ll_, final int n) {
    final void a857(final ll_ ll_) {
        if (null != ll_._l) {
            ll_.b423();
        }
        ll_._n = this._a;
        ll_._l = this._a._l;
        ll_._l._n = ll_;
        ll_._n._l = ll_;
    }
    
    public static void a487() {
        up_.ability_retreat = null;
        up_.piece_zealot = null;
    }
    
    final int b410(final byte b) {
        if (b != 53) {
            this.b410((byte)10);
        }
        int n = 0;
        for (ll_ ll_ = this._a._n; this._a != ll_; ll_ = ll_._n) {
            ++n;
        }
        return n;
    }
    
    public up_() {
        this._a = new ll_();
        this._a._n = this._a;
        this._a._l = this._a;
    }
    
    static {
        up_.ability_retreat = new String[] { "Retreat", "Exercising the better part of valour, the <%0> is able to leave any room without triggering any trap or engaging any monster. (Single use)" };
    }
}
