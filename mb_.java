final class mb_ extends qb_
{
    private md_ _o;
    private md_ _n;
    private int _m;
    private int _p;
    
    private final void c397(final int[] array, final int n, final int n2) {
        for (qb_ qb_ = (qb_)this._o.e024(); qb_ != null; qb_ = (qb_)this._o.a024(4)) {
            qb_.a397(array, n, n2);
        }
    }
    
    private final void e797() {
        if (this._m > 0) {
            for (kb_ kb_ = (kb_)this._n.e024(); kb_ != null; kb_ = (kb_)this._n.a024(4)) {
                final kb_ kb_2 = kb_;
                kb_2._i -= this._m;
            }
            this._p -= this._m;
            this._m = 0;
        }
    }
    
    private final void a989(ne_ e, final kb_ kb_) {
        while (e != this._n._c && ((kb_)e)._i <= kb_._i) {
            e = e._e;
        }
        so_.a985((byte)89, e, kb_);
        this._p = ((kb_)this._n._c._e)._i;
    }
    
    /*@Override
    final int a784() {
        return 0;
    }*/
    
    @Override
    final qb_ c207() {
        return (qb_)this._o.a024(4);
    }
    
    @Override
    final synchronized void a150(int n) {
        while (this._p >= 0) {
            if (this._m + n < this._p) {
                this._m += n;
                this.d150(n);
                return;
            }
            final int n2 = this._p - this._m;
            this.d150(n2);
            n -= n2;
            this._m += n2;
            this.e797();
            final kb_ kb_ = (kb_)this._n.e024();
            synchronized (kb_) {
                final int a598 = kb_.a598(this);
                if (a598 < 0) {
                    kb_._i = 0;
                    this.a627(kb_);
                }
                else {
                    kb_._i = a598;
                    this.a989(kb_._e, kb_);
                }
            }
            if (n == 0) {
                return;
            }
        }
        this.d150(n);
    }
    
    final synchronized void a501(final qb_ qb_) {
        qb_.a487(false);
    }
    
    final synchronized void b501(final qb_ qb_) {
        this._o.b865(qb_, false);
    }
    
    private final void a627(final kb_ kb_) {
        kb_.a487(false);
        kb_.a797();
        final ne_ e = this._n._c._e;
        if (e == this._n._c) {
            this._p = -1;
        }
        else {
            this._p = ((kb_)e)._i;
        }
    }
    
    @Override
    final synchronized void b397(final int[] array, int n, int n2) {
        while (this._p >= 0) {
            if (this._m + n2 < this._p) {
                this._m += n2;
                this.c397(array, n, n2);
                return;
            }
            final int n3 = this._p - this._m;
            this.c397(array, n, n3);
            n += n3;
            n2 -= n3;
            this._m += n3;
            this.e797();
            final kb_ kb_ = (kb_)this._n.e024();
            synchronized (kb_) {
                final int a598 = kb_.a598(this);
                if (a598 < 0) {
                    kb_._i = 0;
                    this.a627(kb_);
                }
                else {
                    kb_._i = a598;
                    this.a989(kb_._e, kb_);
                }
            }
            if (n2 == 0) {
                return;
            }
        }
        this.c397(array, n, n2);
    }
    
    private final void d150(final int n) {
        for (qb_ qb_ = (qb_)this._o.e024(); qb_ != null; qb_ = (qb_)this._o.a024(4)) {
            qb_.a150(n);
        }
    }
    
    @Override
    final qb_ d207() {
        return (qb_)this._o.e024();
    }
    
    public mb_() {
        this._o = new md_();
        this._n = new md_();
        this._m = 0;
        this._p = -1;
    }
}
