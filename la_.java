final class la_
{
	//original name: _c
    static int crc;
    //original name: _b
    static FontStyle roman12;
    static boolean _f;
    //original name: _g
    static int isMetaDown;
    private int _h;
    static int[] _l;
    String _d;
    int[] _i;
    private long _a;
    int _o;
    private boolean _k;
    //original name: _j
    static String text_income_rate;
    int _n;
    private String _e;
    int _m;
    
    static final int a410() {
        return -bf_._b + d_._e;
    }
    
    static final int a353(final int n) {
        return re_._f[n & 0x7FF];
    }
    
    final int b410(final byte b) {
        if (this._k || (this._n == 2 && 0 < this._h)) {
            return 2;
        }
        if (this._a == rk_._l) {
            return 1;
        }
        if (ke_._d == 2 && mj_.a623(this._e)) {
            return 1;
        }
        if (b < 94) {
            this.b410((byte)(-110));
        }
        return 0;
    }
    
    static final int a137() {
        return 1;
    }
    
    public static void c423() {
        la_.text_income_rate = null;
        la_.roman12 = null;
        la_._l = null;
    }
    
    la_(final boolean b) {
        this._e = tk_._v;
        this._n = uk_._a;
        this._o = RenownTableEntry._d;
        this._h = wd_._j;
        if (b) {
            this._i = kp_._a;
        }
        else {
            this._i = null;
        }
        this._a = gg_._d;
        this._d = sa_._t;
        this._m = ce_._w;
        this._k = Trap._l;
    }
    
    static {
        la_.isMetaDown = 0;
        la_._l = new int[8192];
        la_._f = true;
        la_.text_income_rate = "Income rate: <col=DB0100><%0> per hour</col>";
    }
}
