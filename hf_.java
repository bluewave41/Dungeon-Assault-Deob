abstract class hf_ extends sj_
{
    static nh_ _pb;
    private int _jb;
    private lm_ _xb;
    private int _lb;
    //original name: _ub
    static String login_username;
    static md_ _ob;
    //original name: _sb
    static int unreadTickets;
    private int _qb;
    private int _tb;
    private sd_ _rb;
    private fb_ _kb;
    static ad_ _wb;
    static ed_ _nb;
    static Animation _ib;
    //original name: _Ab
    static Graphic menu_chain;
    private int _vb;
    static int[] _yb;
    //original name: _zb
    static String create_alert_namelength;
    static pp_ _mb;
    
    private final void b063(final lm_ lm_, final byte b) {
        if (this._rb != null) {
            this._rb.a487(false);
        }
        if (lm_ != null) {
            lm_.b050(0, lm_.componentWidth, this._tb + 6, 6, lm_.componentHeight);
            this._rb = new sd_(lm_);
        }
        else {
            this._rb = new sd_();
        }
        this.b485(this._rb);
        this._xb = null;
    }
    
    hf_(final ji_ ji_, final lm_ lm_, final int tb, final int n, final int vb) {
        super(ji_, 12 + lm_.componentWidth, lm_.componentHeight + (tb + 12));
        this._qb = n;
        this._jb = n;
        this._tb = tb;
        this._vb = vb;
        this.b063(lm_, (byte)98);
    }
    
    static final void i423() {
        if (null != in_._C) {
            synchronized (in_._C) {
                in_._C = null;
            }
        }
    }
    
    @Override
    final boolean i154(final int n) {
        this.h423((byte)99);
        return n != 462 || super.i154(n ^ 0x0);
    }
    
    @Override
    boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (b < 55) {
            this._rb = null;
        }
        if (super.a401(lm_, c, n, (byte)124)) {
            return true;
        }
        if (this._rb != null) {
            if (98 == n) {
                this._rb.a336(34, lm_);
            }
            if (n == 99) {
                this._rb.a336(34, lm_);
            }
        }
        return false;
    }
    
    @Override
    final void h423(final byte b) {
        if (this._kb != null) {
            if (this._kb != lp_._o) {
                this.b326(-30, this._xb.componentHeight + (12 + this._tb), this._xb.componentWidth + 12);
                this.b063(this._xb, (byte)(-74));
            }
            this._rb._H = 256;
            this._kb = null;
        }
        super.h423((byte)(-89));
    }
    
    @Override
    final void k150(final int h) {
        if (hi_._b != this._kb) {
            this._lb = 0;
            this._kb = lp_._o;
            this.b063(this._xb, (byte)100);
            this._rb._H = h;
            this._xb = null;
        }
    }
    
    void b340(final int n, final lm_ xb) {
        this._xb = xb;
        if (ec_._i != this._kb) {
            if (hi_._b != this._kb) {
                this._kb = hi_._b;
                this._lb = 0;
            }
        }
        else {
            this.b115(12 + this._xb.componentWidth, this._vb, this._xb.componentHeight + this._tb + 12, 22284);
            this._lb = 0;
        }
        if (n != 1) {
            this._xb = null;
        }
    }
    
    public static void m150() {
        hf_._pb = null;
        hf_.menu_chain = null;
        hf_.create_alert_namelength = null;
        hf_._wb = null;
        hf_._mb = null;
        hf_._yb = null;
        hf_._nb = null;
        hf_.login_username = null;
        hf_._ob = null;
        hf_._ib = null;
    }
    
    @Override
    boolean f427(final byte b) {
        if (this._kb != null) {
            if (this._kb != hi_._b) {
                if (lp_._o == this._kb) {
                    if (++this._lb != this._qb) {
                        this._rb._H = (this._lb << 8) / this._qb;
                    }
                    else {
                        this._kb = null;
                        this._rb._H = 256;
                    }
                }
            }
            else if (++this._lb == this._jb) {
                this._kb = ec_._i;
                this.b115(12 + this._xb.componentWidth, this._vb, this._tb + 12 + this._xb.componentHeight, b ^ 0xFFFFA8AA);
                this._lb = 0;
                this._rb._H = 0;
            }
            else {
                this._rb._H = 256 - (this._lb << 8) / this._jb;
            }
        }
        return b == -90 && super.f427((byte)(-90));
    }
    
    static {
        hf_.login_username = "Username: ";
        hf_._ob = new md_();
        hf_.create_alert_namelength = "Names should contain a maximum of 12 characters";
        hf_._yb = new int[16384];
        hf_._wb = new ad_(13, 0);
    }
}
