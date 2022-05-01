final class WarningMessage extends kl_
{
    boolean _r;
    private pp_ _n;
    //original name: _o
    static Graphic stat_sneak;
    int _u;
    //original name: _q
    static String desc_zealot;
    private String _p;
    private String _m;
    private pp_ _s;
    static int _t;
    
    WarningMessage(final String s, final String s2, final int n) {
        this(s, s2, mp_.yes.toUpperCase(), um_.no.toUpperCase(), n);
    }
    
    public static void e150() {
        WarningMessage.stat_sneak = null;
        WarningMessage.desc_zealot = null;
    }
    
    static final void a984(final String s) {
        Room.a900(s);
        gh_.a676(sl_.logging_in, false);
    }
    
    static final void d150() {
        final wj_ c = ra_._c;
        final int c2 = c.readByte();
        if (c2 == 0) {
            final int[] b878 = new int[8];
            final wj_ wj_ = c;
            for (int i = wj_.readByte(), n = 0; i > n; ++n) {
                b878[n] = wj_.readInt();
            }
            final pe_ pe_ = (pe_)sf_._c.e024();
            if (pe_ == null) {
                tl_.a150(111);
                return;
            }
            pe_.a487(false);
        }
        else if (c2 != 0) {
            final ak_ ak_ = (ak_)oh_._j.e024();
            if (ak_ == null) {
                tl_.a150(-110);
                return;
            }
            ak_.a487(false);
        }
        else if (c2 == 2) {
            final pe_ pe_2 = (pe_)sf_._c.e024();
            if (null == pe_2) {
                tl_.a150(-43);
                return;
            }
            //wa_.b878(-1); returns new int[8]
            pe_2.a487(false);
        }
        else {
            sm_.a741(null, 1, "A1: " + sj_.l738());
            tl_.a150(-16);
        }
    }
    
    @Override
    final void b150(final int n) {
        super.b150(-81);
        final int n2 = 60 + super._j;
        la_.roman12.a385(this._m, 40 + super._k, n2, super.imageWidth - 80, super.imageHeight - 16 + (super._j - n2 - (jm_.button_152.imageHeight >> 1)), 16777215, -1, 1, 1, la_.roman12._H);
    }
    
    @Override
    final void b423() {
        final int[] array = new int[64];
        for (int n = 0; 64 > n; ++n) {
            array[n] = mp_.or((24 + n) * 65793, Integer.MIN_VALUE);
        }
        final Graphic a983 = te_.a983(super.imageWidth - 32, super.imageHeight - 28, array, 16, 8, 0.125);
        final int[] b2 = te_.b285(super.imageWidth - 32, super.imageHeight - 28, 0.125);
        final Graphic cn_ = new Graphic(0, 0);
        cn_.imageWidth = super.imageWidth - 32;
        cn_.imageHeight = super.imageHeight - 28;
        cn_._B = b2;
        final ph_ ph_ = new ph_(a983, cn_);
        jh_.a276(super._l = new ph_(new Graphic(super.imageWidth, super.imageHeight), new Graphic(super.imageWidth, super.imageHeight)));
        ph_.drawImage(16, 16);
        qe_.a229(23, 13, super.imageWidth - 46, super.imageHeight - 34, 256, 32, 8, 128);
        jc_.a669(super.imageHeight - 26, 16, 14, 1, 2, 1);
        jc_.a669(super.imageHeight - 26, super.imageWidth - 24, 14, 1, 2, 1);
        vd_.a669(super.imageWidth - 16, 2, 2, 8, 0);
        vd_.a669(super.imageWidth, 2, 2, 0, 6);
        vd_.a669(super.imageWidth, 2, 2, 0, 54);
        vd_.a669(super.imageWidth - 16, 2, 2, 8, super.imageHeight - 16);
        vd_.a669(super.imageWidth, 2, 2, 0, super.imageHeight - 22);
        jc_.a669(40, 80, 14, 1, 2, 1);
        jc_.a669(40, super.imageWidth - 88, 14, 1, 2, 1);
        oe_.interface_dragon.h093(8, 21);
        oe_.interface_dragon.j093(super.imageWidth - 63, 21);
        ad_.interface_crescent.i093(23, super.imageHeight - 38);
        ad_.interface_crescent.f093(super.imageWidth - 39, super.imageHeight - 38);
        da_.a563(this._p, cm_._M, super.imageWidth >> 1, (36 + ne_.roman20._H >> 1) + 14, ne_.roman20);
        jh_.b797();
    }
    
    //original signature: WarningMessage(final String p5, final String m, final String s, final String s2, final int u) {
    WarningMessage(final String p5, final String m, final String yes, final String no, final int u) {
        this._p = p5;
        this._u = u;
        this._m = m;
        this.a326(450, 78 + (jm_.button_152.imageHeight + oj_.a170(this._m, new int[] { 300 }, la_.roman12) * la_.roman12._H));
        super._d = false;
        this._n = tn_.a226(-jm_.button_152.imageWidth + ((super.imageWidth >> 1) - 10) + super._k, super.imageHeight + (super._j - 16) - (jm_.button_152.imageHeight >> 1), ne_.roman20, jm_.button_152, -67, yes);
        this._s = tn_.a226(super._k - (-(super.imageWidth >> 1) - 10), -(jm_.button_152.imageHeight >> 1) - 16 + (super._j + super.imageHeight), ne_.roman20, jm_.button_152, -93, no);
        super._f.a865(this._n);
        super._f.a865(this._s);
    }
    
    @Override
    final void a487(final boolean b) {
        if (b) {
            WarningMessage.stat_sneak = null;
        }
        super.a487(b);
        if (hh_._s != null) {
            super._d = true;
            this._r = (this._n == hh_._s);
        }
    }
    
    static {
        WarningMessage.desc_zealot = "Swinging his morningstar wildly, the zealot has been fighting constantly for his cause so long he is no longer sure what it was.";
        WarningMessage._t = 0;
    }
}
