final class sd_ extends da_
{
    int _H;
    static ef_ _G;
    //original name: _I
    static String saurus_warrior;
    static int _J;
    static int[] _F;
    
    sd_(final lm_ d) {
        super(d.xAxisOffset, d.yAxisOffset, d.componentWidth, d.componentHeight, null, null);
        d.b050(0, super.componentWidth, 0, 0, super.componentHeight);
        this._H = 256;
        super._D = d;
    }
    
    static final void a294(final int n, final Graphic cn_, final int n2, final int n3, final int n4) {
        cn_.drawImage(n, n4);
        db_.roman12bold.b191(Integer.toString(n3), 20 + n, n4 + (la_.roman12._H + cn_.imageHeight >> 1), n2, -1);
    }
    
    public static void b487(final boolean b) {
        sd_._F = null;
        sd_._G = null;
        if (b) {
            b487(true);
        }
        sd_.saurus_warrior = null;
    }
    
    public sd_() {
        super(0, 0, 0, 0, null, null);
        this._H = 256;
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        if (0 != n) {
            return;
        }
        if (null == super._D) {
            return;
        }
        if (0 == this._H) {
            return;
        }
        if (this._H != 256) {
            final Graphic cn_ = new Graphic(super._D.componentWidth, super._D.componentHeight);
            lm_.a901(cn_);
            super._D.a115(n, 0, n3 ^ 0x0, n3);
            ti_.c487(true);
            cn_.d326(n2 + super.xAxisOffset, super.yAxisOffset + n4, this._H);
            return;
        }
        super._D.a115(n, super.xAxisOffset + n2, 0, super.yAxisOffset + n4);
    }
    
    static {
        sd_._G = new ef_();
        sd_.saurus_warrior = "Saurus Warrior";
        sd_._F = new int[12];
    }
}
