import java.util.*;

class gd_ extends rj_
{
    Graphic _K;
    nn_ _M;
    Graphic _H;
    int _C;
    //original name: _D
    static String warning_ifyouquit;
    //original name: _J
    static String connectionrestored;
    static qk_ _G;
    //original name: _A
    static Graphic piece_troll;
    Graphic _z;
    Graphic _I;
    int _L;
    boolean _F;
    //original name: _E
    static Graphic stat_attack;
    boolean _B;
    Graphic _N;
    
    private gd_(final Graphic k, final Graphic z, final Graphic i, final Graphic h, final Graphic n, final int n2, final int n3, final int n4) {
        super(n2, n3, k.imageWidth, k.imageHeight, n4);
        this._H = h;
        this._K = k;
        this._F = true;
        this._I = i;
        this._z = z;
        this._N = n;
    }
    
    @Override
    void b326(final int n, final int n2, final int n3) {
        if (!this._F) {
            return;
        }
        final int n4 = n + super._t;
        final int n5 = super._i + n3;
        if (super.isActive) {
            int n6 = (this._B ? mo_._a : this._L) - this._C >> 2;
            if (n6 > 64) {
                n6 = 64;
            }
            final int n7 = n6 - mo_._a + this._L;
            if (!this._B && 0 >= n7) {
                int n8 = -super._m + ((this == wi_._ob) ? mo_._a : super._p) >> 2;
                if (n8 > 64) {
                    n8 = 64;
                }
                final int n9 = n8 + (-mo_._a + super._p);
                if (this != wi_._ob && 0 >= n9) {
                    this._K.drawImage(n4, n5);
                }
                else {
                    int n10;
                    if (this == wi_._ob) {
                        this._z.drawImage(n4, n5);
                        n10 = n8;
                    }
                    else {
                        this._K.drawImage(n4, n3 + super._i);
                        n10 = n9;
                        this._z.d326(n4, n5, 4 * n10);
                    }
                    int n11 = (int)(n10 * (te_.c503(mo_._a, this.hashCode(), 0.125) + 2.0));
                    if (n11 < 0) {
                        n11 = 0;
                    }
                    this._I.b326(n4, n5, n11);
                }
            }
            else {
                this._H.drawImage(n4, n5);
                int n12;
                if (!this._B) {
                    this._K.drawImage(n4, n3 + super._i);
                    n12 = n7;
                    this._H.d326(n4, n5, 4 * n12);
                }
                else {
                    n12 = n6;
                }
                int n13 = (int)(n12 * (2.0 + te_.c503(mo_._a, this.hashCode(), 0.125)));
                if (n13 < 0) {
                    n13 = 0;
                }
                this._N.b326(n4, n5, n13);
            }
        }
        else {
            this._K.drawImage(n4, n5);
        }
        if (n2 != 8187) {
            a364(31, null);
        }
    }
    
    static final o_ a364(final int n, final AmbientAudioTrack cf_) {
        if (n != 64) {
            a364(119, null);
        }
        return new o_(cf_.a319(cf_._e, cf_._a), cf_._a);
    }
    
    static final void a778(int hb, int n, int n2, boolean b) {
    	/*if(n2 == -1) { //DEBUG: skip tutorial to show plan
    		hb = 0;
    		n = 0;
    		n2 = 4;
    		b = true;
    	}*/
        g_._Hb = hb;
        if (fc_.isZeroOrGreater(mn_._b)) {
            bf_._f[mn_._b].c797();
        }
        a364(64, mh_.da_menu_fire);
        te_.b797();
        co_._G = new vj_(0, n, 640, 480, 64);
        mn_._b = n2;
        dc_._z = n2;
        bd_._f = 0;
        if (!fc_.isZeroOrGreater(dc_._z)) {
            if (dc_._z == -1) {
                if (null != ik_._e) {
                    ik_._e.f423((byte)(-127));
                }
            }
        }
        else {
            System.gc();
            bf_._f[dc_._z].b487(b);
            if (12 == dc_._z) {
                m_.a430(n ^ 0x73, b);
            }
        }
    }
    
    //original signature: private final void a451(final boolean b, final cn_ cn_) {
    private final void a451(final Graphic cn_) {
        this._z = cn_;
        this._K = cn_;
        super.a183(false, this._K.imageWidth, this._K.imageHeight);
    }
    
    @Override
    final void a183(final boolean b, final int n, final int n2) {
        if (b) {
            this._F = true;
        }
        throw new RuntimeException("Unsupported");
    }
    
    static final int a518(final Random random) {
        final int a004 = uj_.getRandom(random, Raider._j);
        final int n = wl_._e[a004];
        wl_._e[a004] = wl_._e[--Raider._j];
        return n;
    }
    
    @Override
    final void a789(final int n, final byte b, final int n2) {
        if (b >= -59) {
            this._K = null;
        }
        super.a789(n, (byte)(-113), n2);
        if (this._B) {
            if (this._M != null) {
                this._M.a761((byte)(-86), this);
            }
            else {
                this._L = mo_._a;
                this._B = false;
            }
        }
        else if (null != this._M) {
            this._M.a780(this, -256);
        }
        else {
            this._C = mo_._a;
            this._B = true;
        }
    }
    
    gd_(final int n, final int n2, final int n3, final int n4, final int n5) {
        super(n, n2, n3, n4, n5);
        this._F = true;
    }
    
    gd_(final Graphic cn_, final Graphic cn_2, final Graphic cn_3, final Graphic cn_4, final Graphic cn_5, final int n, final int n2) {
        this(cn_, cn_2, cn_3, cn_4, cn_5, n, n2, 0);
    }
    
    public static void e150() {
        gd_.piece_troll = null;
        gd_.warning_ifyouquit = null;
        gd_.connectionrestored = null;
        gd_.stat_attack = null;
        gd_._G = null;
    }
    
    final void a037(final Graphic h, final Graphic cn_, final Graphic n, final Graphic z, final byte b, final Graphic i) {
        this.a451(cn_);
        this._H = h;
        this._z = z;
        this._N = n;
        if (b <= 101) {
            return;
        }
        this._I = i;
    }
    
    static {
        gd_.connectionrestored = "Connection restored.";
        gd_.warning_ifyouquit = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
