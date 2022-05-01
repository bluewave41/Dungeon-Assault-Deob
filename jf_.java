final class jf_ extends en_
{
	//original name: _e
    static String[] ability_immortal_brief;
    //original name: _f
    static Graphic piece_spider;
    //original name: _g
    static long[] times;
    private RaidMemberStatusIcon _d;
    
    //original signature: public static void a487(final boolean b) {
    public static void a487() {
        jf_.piece_spider = null;
        jf_.ability_immortal_brief = null;
        jf_.times = null;
    }
    
    //original signature: private final cn_ c373(final byte b) {
    private final Graphic c373() {
        jh_.c797();
        final int n = 4 + this._d.icon.imageWidth + la_.roman12.b926(this._d.text);
        int v = la_.roman12._H + la_.roman12._E;
        if (this._d.icon.imageHeight > v) {
            v = this._d.icon.imageHeight;
        }
        final Graphic cn_ = new Graphic(n, v);
        cn_.e797();
        this._d.icon.c326(0, la_.roman12._H - this._d.icon.imageHeight >> 1, this._d._a);
        la_.roman12.b191(GUIButton._H.a803(this._d.text, (byte)(-48)), 4 + this._d.icon.imageWidth, la_.roman12._H, this._d._a, -1);
        jh_.b797();
        return cn_;
    }
    
    //original signature: static final cn_ a182(final int n, final nh_ nh_, final int n2, final byte b) {
    static final Graphic a182(final int n, final nh_ nh_, final int n2) {
        if (!kk_.a283(nh_, 1, n2, n)) {
            return null;
        }
        return IsaacCipher.a373();
    }
    
    @Override
    final void a185(final int n, final sa_ sa_) {
        final Graphic c373 = this.c373();
        sa_.a098(c373, n, false, -5, sa_._y - c373.imageHeight >> 1);
    }
    
    @Override
    final Graphic b373(final byte b) {
        return this.c373();
    }
    
    jf_(final RaidMemberStatusIcon d) {
        this._d = d;
    }
    
    static {
        jf_.ability_immortal_brief = new String[] { "Immortality", "Deaths are treated as incapacitation." };
        jf_.times = new long[32];
    }
}
