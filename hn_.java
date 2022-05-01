final class hn_ extends kl_
{
    private pp_ _m;
    private String _p;
    private pp_ _r;
    boolean _s;
    private int _q;
    int _o;
    int _n;
    
    hn_(final String p4, final int n, final int q, final int o) {
        super(300, 174);
        this._o = o;
        this._p = p4;
        this._n = n;
        this._q = q;
        this._m = tn_.a226((-jm_.button_152.imageWidth + super.imageWidth >> 1) + super._k, -(2 * jm_.button_152.imageHeight) + (super.imageHeight + super._j) - 24, ne_.roman20, jm_.button_152, -39, "Accept");
        this._r = tn_.a226((super.imageWidth - jm_.button_152.imageWidth >> 1) + super._k, super.imageHeight + (super._j - jm_.button_152.imageHeight) - 16, ne_.roman20, jm_.button_152, -70, "Cancel");
        super._f.a865(this._m);
        super._f.a865(this._r);
    }
    
    //original signature: static final void d423(final byte b) {
    static final void d423() {
        final Graphic cn_ = new Graphic(540, 140);
        lm_.a901(cn_);
        re_.b797();
        gf_.a797();
        nl_._d = 0;
        id_.a150(439027688);
        final Graphic d125 = cn_.d125();
        for (int i = 0; i < 15; ++i) {
            d125.e326(-2, -2, 16777215);
            gf_.d669(4, 4, 0, 0, 540, 140);
        }
        ie_._l.e797();
        cn_.a093(0, 0);
        ti_.c487(true);
    }
    
    private final int a666(final byte b, int n, int n2) {
        final int n3 = super._j + 50;
        n -= super._k + 32;
        n2 -= n3;
        if (-10 <= n2 && n2 < 14 && n >= -10 && n < 10 + (super.imageWidth - 64)) {
            int n4 = ((super.imageWidth >> 1) - (32 - (this._n - 2) * n)) / (super.imageWidth - 64) + 1;
            if (n4 < 1) {
                n4 = 1;
            }
            if (this._n - 1 < n4) {
                n4 = this._n - 1;
            }
            return n4;
        }
        return -1;
    }
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        if (null != hh_._s) {
            this._s = (hh_._s == this._m);
            super._d = true;
        }
        if (1 == no_.isMetaDown) {
            final int a666 = this.a666((byte)113, lc_.mouseX, hm_.mouseY);
            if (-1 != a666) {
                this._o = a666;
            }
        }
    }
    
    @Override
    final void b150(final int n) {
        super.b150(117);
        final int n2 = (super.imageWidth >> 1) + super._k;
        final int n3 = 10 + super._j;
        ne_.roman20.c191(this._p, n2, n3 + ne_.roman20._H, 16777215, -1);
        final int n4 = n3 + (10 + ne_.roman20._H);
        final int n5 = 50 + super._j;
        qe_.b370(super._k + 32, n5, super.imageWidth - 64, 4, 0, 128, 128);
        for (int n6 = 0; this._n - 1 > n6; ++n6) {
            final int n7 = n6 * (super.imageWidth - 64) / (this._n - 2) + (32 + super._k);
            for (int n8 = 0; 4 > n8; ++n8) {
                gf_.c115(-n8 + n7, n5 - (2 - n8), 8 - n8 * 2, 16711680);
                gf_.c115(n7 - (-1 - n8), n8 - 2 + n5, -(2 * n8) + 8, 16744576);
            }
        }
        final int n9 = super._k + (32 + (this._q - 1) * (super.imageWidth - 64) / (this._n - 2));
        for (int i = 0; i < 8; ++i) {
            gf_.b115(-i + n9, i + n5 - 6, 2, 8421504);
            gf_.b115(i + n9, i - 6 + n5, 2, 8421504);
            gf_.b115(-i + n9, n5 + 9 - i, 2, 8421504);
            gf_.b115(i + n9, 9 + n5 - i, 2, 8421504);
        }
        final int n10 = super._k + (32 + (super.imageWidth - 64) * (this._o - 1) / (this._n - 2));
        for (int n11 = 0; 8 > n11; ++n11) {
            gf_.b115(n10 - n11, n11 + (n5 - 6), 2, 16744576);
            gf_.b115(n10 + n11, n11 + (n5 - 6), 2, 16711680);
            gf_.b115(n10 - n11, -n11 + (9 + n5), 2, 16744576);
            gf_.b115(n11 + n10, -n11 + n5 + 9, 2, 16711680);
        }
        final int a666 = this.a666((byte)55, hj_.mouseX, Animation.mouseY);
        if (a666 != this._o - 1) {
            if (-1 != a666) {
                final int n12 = 32 + (super._k + (super.imageWidth - 64) * (a666 - 1) / (this._n - 2));
                for (int j = 0; j < 8; ++j) {
                    gf_.b115(-j + n12, n5 + (-6 + j), 2, 16776960);
                    gf_.b115(j + n12, n5 - 6 + j, 2, 16776960);
                    gf_.b115(n12 - j, 9 + n5 - j, 2, 16776960);
                    gf_.b115(j + n12, -j + (n5 + 9), 2, 16776960);
                }
            }
        }
        qe_.raiderStats[0].drawImage(n2 - 50, n5 + 20);
        ne_.roman20.b191(Integer.toString(this._o), n2 - 30, n5 + 36, 16711680, -1);
        qe_.raiderStats[1].drawImage(n2, n5 + 20);
        ne_.roman20.b191(Integer.toString(this._n - this._o), 20 + n2, 36 + n5, 65280, -1);
        ue_.modifier_icons[1].drawImage(super._k + 20, 24 + super._j);
        ue_.modifier_icons[0].drawImage(super.imageWidth + super._k - 36, super._j + 24);
    }
}
