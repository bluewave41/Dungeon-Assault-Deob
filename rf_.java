abstract class rf_ extends ii_
{
    private ji_ _R;
    //original name: _L
    static String waitingfor_fonts;
    static fm_ _K;
    boolean _T;
    static int _M;
    static Graphic _Q;
    static ob_ _O;
    static byte[][] _P;
    private int _U;
    static boolean _S;
    //original name: _N
    static String[] ability_intimidate;
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        if (this._U == 0) {
            return;
        }
        if (256 > this._U) {
            if (np_._F == null || super.componentWidth > np_._F.imageWidth || np_._F.imageHeight < super.componentHeight) {
                np_._F = new Graphic(super.componentWidth, super.componentHeight);
            }
            lm_.a901(np_._F);
            gf_.a797();
            this.a663(0, 0, false);
            super.a115(n, -n2 - super.xAxisOffset, n3, -super.yAxisOffset - n4);
            ti_.c487(true);
            np_._F.d326(n2 + super.xAxisOffset, n4 + super.yAxisOffset, this._U);
            return;
        }
        if (n == 0) {
            this.a663(n4 + super.yAxisOffset, n2 + super.xAxisOffset, false);
            super.a115(n, n2, n3 ^ 0x0, n4);
        }
    }
    
    final void b326(final int n, final int n2, final int n3) {
        this.b050(0, n3, -n2 + 480 >> 1, -n3 + 640 >> 1, n2);
    }
    
    static final q_[] a007(final int n, final byte b, final nh_ nh_, final int n2) {
        if (!kk_.a283(nh_, 1, n2, n)) {
            return null;
        }
        if (b != -71) {
            return null;
        }
        return vl_.d461();
    }
    
    rf_(final ji_ r, final int n, final int n2) {
    	super(640 - n >> 1, -n2 + 480 >> 1, n, n2, null);
        this._R = r;
        this._U = 0;
        this._T = false;
    }
    
    static final q_ a102(final int n) {
        if (n != 10) {
            return null;
        }
        final q_ q_ = new q_(14, 11, 2);
        q_._i[1] = 65793;
        for (int i = 0; i < 6; ++i) {
            og_.a348(i * 2 + 1, 10 - i, q_, 5 - i, (byte)1);
        }
        for (int j = 6; j < 11; ++j) {
            og_.a348(3, -j + 10, q_, 4, (byte)1);
        }
        return q_;
    }
    
    public static void b487(final boolean b) {
        rf_._P = null;
        rf_.ability_intimidate = null;
        rf_._O = null;
        rf_.waitingfor_fonts = null;
        rf_._Q = null;
        rf_._K = null;
        if (b) {
            rf_._K = null;
        }
    }
    
    boolean f427(final byte b) {
        final int j137 = this.j137(78);
        if (b != -90) {
            this._R = null;
        }
        final int n = -this._U + j137;
        if (n > 0) {
            this._U += (8 + n - 1) / 8;
        }
        if (n < 0) {
            this._U += (n - 15) / 16;
        }
        return 0 == this._U && j137 == 0 && !this._T;
    }
    
    private final int j137(final int n) {
        if (n < 61) {
            a007(0, (byte)10, null, -24);
        }
        return this._T ? ((this._R.i149(32) != this) ? 0 : 256) : 0;
    }
    
    boolean i154(final int n) {
        if (n != 462) {
            a102(-12);
        }
        this._U = this.j137(98);
        return this._U == 0 && !this._T;
    }
    
    abstract void a663(final int p0, final int p1, final boolean p2);
    
    @Override
    //this one returns this?
    final lm_ returnNull() {
        final lm_ g698 = super.returnNull();
        if (g698 == null) {
            return this;
        }
        return g698;
    }
    
    static {
        rf_.waitingfor_fonts = "Waiting for fonts";
        rf_._M = 2;
        rf_.ability_intimidate = new String[] { "Intimidate", "The frenzied, violent babbling of the <%0> does not make it easy for your raiders to sneak around a dungeon, but any monster they do encounter will have their <%attack> reduced by fear." };
    }
}
