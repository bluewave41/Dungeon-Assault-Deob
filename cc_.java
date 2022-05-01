final class cc_ implements Runnable
{
    static md_ _i;
    private up_ _h;
    static int _d;
    //original name: _e
    static String[] titles;
    //original name: _g
    private Thread thread;
    static boolean _c;
    int _f;
    private boolean _b;
    //original name: _a
    static String banshee;
    
    final co_ a504(final ln_ k, final int n, final int n2, final byte[] d) {
        final co_ co_ = new co_();
        co_._K = k;
        co_._o = n2;
        co_._L = 2;
        co_._D = d;
        co_._B = false;
        if (n != 15958) {
            return null;
        }
        this.a378((byte)48, co_);
        return co_;
    }
    
    final co_ a822(final byte b, final ln_ k, final int n) {
        final co_ co_ = new co_();
        co_._o = n;
        co_._B = false;
        co_._L = 3;
        if (b >= -27) {
            return null;
        }
        co_._K = k;
        this.a378((byte)21, co_);
        return co_;
    }
    
    //never called
    static final String a928(final char c, final int n) {
        final char[] array = new char[n];
        for (int i = 0; i < n; ++i) {
            array[i] = c;
        }
        return new String(array);
    }
    
    public static void b150() {
        cc_.banshee = null;
        cc_.titles = null;
        cc_._i = null;
    }
    //this one
    private final void a378(final byte b, final co_ co_) {
        synchronized (this._h) {
            this._h.a857(co_);
            ++this._f;
            this._h.notifyAll();
            if (b <= 1) {
                cc_.titles = null;
            }
        }
    }
    
    final void a150(final int n) {
        this._b = true;
        synchronized (this._h) {
            this._h.notifyAll();
        }
        try {
            this.thread.join();
            if (n >= -49) {
                cc_._i = null;
            }
        }
        catch (InterruptedException ex) {}
        this.thread = null;
    }
    
    //original signature: final co_ a945(final ln_ ln_, final int n, final int n2) {
    final co_ a945(final ln_ ln_, final int n) {
        final co_ co_ = new co_();
        co_._L = 1;
        synchronized (this._h) {
            for (co_ co_2 = (co_)this._h.c729(); co_2 != null; co_2 = (co_)this._h.a786((byte)72)) {
                if (n == co_2._o && ln_ == co_2._K && co_2._L == 2) {
                    co_._v = false;
                    co_._D = co_2._D;
                    return co_;
                }
            }
        }
        co_._D = ln_.a104(n, 44); //index file segment in main dat
        co_._B = true;
        co_._v = false;
        return co_;
    }
    
    @Override
    public final void run() {
        while (!this._b) {
            final co_ co_;
            synchronized (this._h) {
                co_ = (co_)this._h.a729(120);
                if (co_ == null) {
                    try {
                        this._h.wait();
                    }
                    catch (InterruptedException ex2) {}
                    continue;
                }
                --this._f;
            }
            try {
                if (co_._L != 2) {
                    if (3 == co_._L) {
                        co_._D = co_._K.a104((int)co_._o, 112);
                    }
                }
                else {
                    co_._K.a267(co_._D, (int)co_._o, co_._D.length, -29447);
                }
            }
            catch (Exception ex) {
                sm_.a741(ex, 1, null);
            }
            co_._v = false;
        }
    }
    
    cc_(final qg_ qg_) {
        this._h = new up_();
        this._f = 0;
        this._b = false;
        final pn_ a508 = qg_.a508(5, this);
        while (a508._c == 0) {
            pj_.a054(0, 10L);
        }
        if (a508._c != 2) {
            this.thread = (Thread)a508._f;
            return;
        }
        throw new RuntimeException();
    }
    
    static {
        cc_._d = 0;
        cc_._i = new md_();
        cc_._c = false;
        cc_.banshee = "Banshee";
    }
}
