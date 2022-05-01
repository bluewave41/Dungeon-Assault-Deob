class kl_
{
	//original name: _e
    static String text_renown_gained;
    boolean _d;
    //original name: _b
    static String text_modifier_glamour;
    int _j;
    md_ _f;
    private ph_ _g;
    //original name: _c
    static String[] subscription_cost_monthly;
    int _k;
    int imageWidth;
    static gd_ _h;
    int imageHeight;
    ph_ _l;
    
    //original signature: private final void c487(final boolean b) {
    private final void c487() {
        qe_.a716(this._g, this._k, this._j, this.imageWidth, this.imageHeight);
        this._g.h093(this._k, this._j);
        for (rj_ rj_ = (rj_)this._f.e024(); null != rj_; rj_ = (rj_)this._f.a024(4)) {
            rj_.d150(0);
        }
    }
    
    kl_(final int n, final int n2, final int n3, final int n4) {
        this();
        this.a050(n2, n3, n, n4);
    }
    
    //original signature: final void a050(final int j, final int a, final int k, final int n, final int i) {
    final void a050(final int j, final int imageWidth, final int k, final int imageHeight) {
        this.imageHeight = imageHeight;
        this._j = j;
        this.imageWidth = imageWidth;
        this._k = k;
        this.b423();
        nm_._ib = new int[this.imageHeight * this.imageWidth];
        this._g = new ph_(new Graphic(this.imageWidth, this.imageHeight), new Graphic(this.imageWidth, this.imageHeight));
    }
    //original signature: void b423(final byte b) {
    void b423() {
        final int[] array = new int[64];
        for (int n = 0; 64 > n; ++n) {
            array[n] = mp_.or(Integer.MIN_VALUE, 65793 * (24 + n));
        }
        final Graphic a983 = te_.a983(this.imageWidth, this.imageHeight, array, 16, 8, 0.125);
        final int[] b2 = te_.b285(this.imageWidth, this.imageHeight, 0.125);
        final Graphic cn_ = new Graphic(0, 0);
        cn_.imageHeight = this.imageHeight;
        cn_._B = b2;
        cn_.imageWidth = this.imageWidth;
        jh_.a276(this._l = new ph_(a983, cn_));
        ke_.a115(0, this.imageHeight, 0);
        ke_.a115(this.imageWidth - 8, this.imageHeight, 0);
        vd_.a669(this.imageWidth - 16, 1, 1, 8, 0);
        vd_.a669(this.imageWidth - 16, 1, 1, 8, this.imageHeight - 8);
        qe_.a229(8, 8, this.imageWidth - 16, this.imageHeight - 16, 224, 32, 7, 128);
        jh_.b797();
    }
    
    void a487(final boolean b) {
        eg_.a537(this._f);
        if (b) {
            kl_.subscription_cost_monthly = null;
        }
    }
    
    public static void a150() {
        kl_.text_modifier_glamour = null;
        kl_.subscription_cost_monthly = null;
        kl_.text_renown_gained = null;
        kl_._h = null;
    }
    
    //original signature: void c150(final int n) {
    void c150() {
        for (rj_ rj_ = (rj_)this._f.e024(); null != rj_; rj_ = (rj_)this._f.a024(4)) {
            rj_.b423((byte)30);
        }
    }
    
    kl_(final int n, final int n2) {
        this();
        this.a326(n, n2);
    }
    
    void c423(final byte b) {}
    
    //original signature: final void a326(final int n, final int n2, final int n3) {
    final void a326(final int n, final int n3) {
        this.a050(-n3 + 480 >> 1, n, 640 - n >> 1, n3);
    }
    
    final void a423(final byte b) {
        jh_.a276(this._g);
        if (b > -12) {
            this._g = null;
        }
        this._l.drawImage(0, 0);
        for (rj_ rj_ = (rj_)this._f.e024(); null != rj_; rj_ = (rj_)this._f.a024(4)) {
            rj_.a599(-this._k, -this._j, (byte)(-96));
        }
        jh_.b797();
    }
    
    void b150(final int n) {
        this.c487();
    }
    
    void b487(final boolean b) {
        if (b) {
            this._g = null;
        }
    }
    
    //original signature: static final String a755(final CharSequence charSequence) {
    static final String returnParameter(final CharSequence charSequence) {
        String a748 = uj_.decodeBase37EncodedString(ci_.encodeBase37(charSequence));
        if (null == a748) {
            a748 = "";
        }
        return a748;
    }
    
    public kl_() {
        this._f = new md_();
        this._d = false;
    }
    
    static {
        kl_.text_renown_gained = "Renown gained: ";
        kl_.subscription_cost_monthly = new String[] { "£3.20", "\u20ac4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00" };
        kl_.text_modifier_glamour = "Glamour";
    }
}
