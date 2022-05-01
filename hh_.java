import java.awt.*;

class hh_ implements ca_, th_
{
    int _e;
    static int _p;
    //original name: _o
    static Graphic piece_spectre;
    //original name: _n
    static String[] tutorial_stable1;
    int _d;
    int _f;
    static en_ _r;
    int _i;
    static rj_ _s;
    private boolean _m;
    int _g;
    //original name: _k
    static Frame frame;
    private int _q;
    int _l;
    int _j;
    se_ _u;
    int _v;
    int _t;
    int _a;
    static int _b;
    static boolean _c;
    //original name: _h
    static String[] ability_revive;
    
    @Override
    public final int a349(final lm_ lm_, final int n) {
        this.b865(-2, lm_);
        if (n != 8) {
            return -1;
        }
        return lm_._t.b137(263) + this._e + this._i;
    }
    
    public static void b150() {
        hh_._r = null;
        hh_.tutorial_stable1 = null;
        hh_.ability_revive = null;
        hh_.piece_spectre = null;
        hh_.frame = null;
        hh_._s = null;
    }
    
    hh_(final se_ se_, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this(se_, n, n, n2, n2, n3, n4, n5, n6, n7, -1, Integer.MAX_VALUE, false);
    }
    
    static final int a080(final int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (n2 <= 0) {
            int n3 = 2;
            if (n2 < -65536) {
                n2 >>= 16;
                n3 += 16;
            }
            if (n2 < -256) {
                n2 >>= 8;
                n3 += 8;
            }
            if (n != 1) {
                a080(-47, -9);
            }
            if (-16 > n2) {
                n2 >>= 4;
                n3 += 4;
            }
            if (n2 < -4) {
                n2 >>= 2;
                n3 += 2;
            }
            if (n2 < -2) {
                ++n3;
                n2 >>= 1;
            }
            return n3;
        }
        int n4 = 1;
        if (n2 > 65535) {
            n2 >>= 16;
            n4 += 16;
        }
        if (n2 > 255) {
            n2 >>= 8;
            n4 += 8;
        }
        if (15 < n2) {
            n4 += 4;
            n2 >>= 4;
        }
        if (n2 > 3) {
            n2 >>= 2;
            n4 += 2;
        }
        if (1 < n2) {
            n2 >>= 1;
            ++n4;
        }
        return n4;
    }
    
    static final void a423() {
        if (nk_._Hb) {
            ae_.a183(false, 4);
        }
    }
    
    //original signature: private final int a231(final int n, final lm_ lm_, final int n2, final int n3) {
    private final int a231(final int n, final lm_ lm_, final int n2) {
        return lm_._A + (lm_.yAxisOffset + n2) + (this._e + n);
    }
    
    static final FontStyle a921(final nh_ nh_, final nh_ nh_2, final int n, final int n2) {
        if (!kk_.a283(nh_2, 1, n, n2)) {
            return null;
        }
        return MusicTrack.a804(nh_.b337(n, n2));
    }
    
    //original signature: private final int a669(final int n, final int n2, final lm_ lm_, final int n3) {
    private final int a669(final int n, final int n2, final lm_ lm_) {
        return n2 + lm_.xAxisOffset + n - (-this._l - lm_._j);
    }
    
    //original signature: String b424(final lm_ lm_, final int n) {
    String getButtonText(final lm_ lm_, final int n) {
        return lm_.buttonText;
    }
    
    @Override
    public final int a605(final int n, final int n2, final int n3, final int n4, final lm_ lm_, final int n5) {
        if (n != 16) {
            a921(null, null, 60, -28);
        }
        this.b865(-2, lm_);
        return lm_._t.a586(n3 - this.a437(lm_, (byte)93, n4), -this.a387((byte)(-85), n2, lm_) + n5, (byte)(-118));
    }
    
    private final int d353(final int n, final lm_ lm_) {
        return -this._i + (-this._e + lm_.componentHeight);
    }
    
    @Override
    public final int a437(final lm_ lm_, final byte b, final int n) {
        return this.a669(n, 0, lm_);
    }
    
    @Override
    public void a623(final byte b, final lm_ lm_, final int n, final int n2, final boolean b2) {
        if (this._u != null) {
            this.a089(lm_, n, (byte)111, n2);
            if (b != 34) {
                this._j = 71;
            }
        }
    }
    
    private final void a941(final byte b, final int n, final int n2, final int n3, final int n4, final lm_ lm_, final int n5, final int n6) {
        d_.a713(lm_.xAxisOffset + n3, n6 + (lm_.yAxisOffset + lm_.componentHeight), lm_.xAxisOffset + n3 + lm_.componentWidth, lm_.yAxisOffset + n6);
        final int c353 = this.c353(4, lm_);
        final int d353 = this.d353(-106, lm_);
        if (!this._m) {
            final int d354 = this._d;
            int h;
            if (d354 != 0) {
                if (d354 != 2) {
                    //if (d354 != 3 && d354) {}
                    h = (-this._u._E + d353 - this._u._H >> 1) + this._u._H;
                }
                else {
                    h = d353 - this._u._E;
                }
            }
            else {
                h = this._u._H;
            }
            final int f = this._f;
            if (f != 1 && f != 3) { //this might be 0
                if (f != 1) {
                    if (f == 2) {
                        this._u.a191(this.getButtonText(lm_, -444136767), this.a669(n3, n5, lm_) + c353, this.a231(n4, lm_, n6) + h, n2, n);
                    }
                }
                else {
                    this._u.c191(this.getButtonText(lm_, -444136767), (c353 >> 1) + this.a669(n3, n5, lm_), this.a231(n4, lm_, n6) + h, n2, n);
                }
            }
            else {
                this._u.b191(this.getButtonText(lm_, -444136767), this.a669(n3, n5, lm_), this.a231(n4, lm_, n6) + h, n2, n);
            }
        }
        else {
            this._u.a385(this.getButtonText(lm_, -444136767), this.a669(n3, n5, lm_), this.a231(n4, lm_, n6), c353, d353, n2, n, this._f, this._d, this._a);
        }
        ti_.c487(true);
    }
    
    @Override
    public final int a137(final int n) {
        if (n <= 11) {
            this.a137(85);
        }
        return this._u._E + this._u._H;
    }
    
    @Override
    public final void a923(final lm_ lm_, final int n, final int n2, final int n3, final int n4) {
        if (n3 != -1) {
            hh_.ability_revive = null;
        }
    }
    
    @Override
    public final int c353(final int n, final lm_ lm_) {
        if (n != 4) {
            this._l = -97;
        }
        return -this._v + (-this._l + lm_.componentWidth);
    }
    
    final void a446(final byte b, final hh_ hh_) {
        hh_._d = this._d;
        hh_._a = this._a;
        hh_._i = this._i;
        hh_._g = this._g;
        hh_._u = this._u;
        hh_._e = this._e;
        hh_._j = this._j;
        hh_._q = this._q;
        hh_._t = this._t;
        hh_._m = this._m;
        hh_._v = this._v;
        hh_._f = this._f;
        if (b <= 124) {
            return;
        }
        hh_._l = this._l;
    }
    
    private final void a089(final lm_ lm_, final int n, final byte b, final int n2) {
        this.a941((byte)(-64), this._q, this._g, n, 0, lm_, 0, n2);
        if (b < 91) {
            this.a089(null, -119, (byte)(-24), -82);
        }
    }
    
    @Override
    public final l_ b865(final int n, final lm_ lm_) {
        if (null == lm_._t) {
            lm_._t = new fe_();
        }
        if (n != -2) {
            hh_._b = -86;
        }
        if (!this._m) {
            this.a063(lm_, (byte)(-113));
        }
        else {
            ((fe_)lm_._t).a804(this.getButtonText(lm_, -444136767), 0, this._d, this.d353(n - 118, lm_), this._f, this.c353(n + 6, lm_), this._a, this._u);
        }
        return lm_._t;
    }
    
    private final void a063(final lm_ lm_, final byte b) {
        if (lm_._t == null) {
            lm_._t = new fe_();
        }
        final int c353 = this.c353(4, lm_);
        final int d353 = this.d353(68, lm_);
        final int d354 = this._d;
        int h;
        if (d354 == 0) {
            h = this._u._H;
        }
        else if (d354 != 2) {
            if (3 != d354 && d354 == 0) {}
            h = this._u._H + (-this._u._H + (d353 - this._u._E) >> 1);
        }
        else {
            h = d353 - this._u._E;
        }
        final int f = this._f;
        if (f != 0) {
            if (3 != f) {
                if (f != 1) {
                    if (2 != f) {
                        return;
                    }
                    if (!(lm_._t instanceof fe_)) {
                        return;
                    }
                    ((fe_)lm_._t).a950(c353, (byte)81, this.getButtonText(lm_, -444136767), this._u, h);
                    return;
                }
                else {
                    if (!(lm_._t instanceof fe_)) {
                        return;
                    }
                    ((fe_)lm_._t).a972(h, this.getButtonText(lm_, -444136767), this._u, (byte)(-78), c353 >> 1);
                    return;
                }
            }
        }
        if (lm_._t instanceof fe_) {
            ((fe_)lm_._t).a777(this.getButtonText(lm_, -444136767), -74, this._u, 0, h);
        }
    }
    
    @Override
    public final int a387(final byte b, final int n, final lm_ lm_) {
        return this.a231(0, lm_, n);
    }
    
    protected hh_() {
    }
    
    @Override
    public final void a308(final int n, final int n2, final int n3, final lm_ lm_, final int n4, final int n5) {
        if (n5 != n) {
        }
    }
    
    @Override
    public final int a353(final int n, final lm_ lm_) {
        this.b865(-2, lm_);
        if (n < 59) {
            return 78;
        }
        return lm_._t.c137(-76) + this._l + this._v;
    }
    
    hh_(final se_ u, final int l, final int v, final int e, final int i, final int g, final int q, final int f, final int d, final int a, final int j, final int t, final boolean m) {
        this._q = q;
        this._d = d;
        this._m = m;
        this._e = e;
        this._j = j;
        this._l = l;
        this._i = i;
        this._t = t;
        this._u = u;
        this._f = f;
        this._a = a;
        this._v = v;
        this._g = g;
    }
    
    static {
        hh_.tutorial_stable1 = new String[] { "Stable", "The stable shows the <%raiders> currently under your control. It can hold a <%highlight>maximum of eight raiders</col> at any one time. The raiders available for hire are displayed in the panel to the left. As with rooms, <%highlight>more will become available as you gain Renown</col>." };
        hh_._p = 320;
        hh_.ability_revive = new String[] { "Revive", "With great expenditure of effort and numerous dark invocations, the <%0> is able to call the spirit of a dead raider back from the next world. The raider will be teleported back to your stable. (Single use)" };
    }
}
