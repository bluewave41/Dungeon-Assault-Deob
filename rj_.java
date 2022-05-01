import java.net.*;
import java.io.*;

abstract class rj_ extends ne_
{
	//original name: _j
    static String[] ability_armoured_brief;
    int _v;
    //original name _w
    boolean isActive;
    rj_ _r;
    int _m;
    en_ _n;
    int _t;
    //original name: _o
    static boolean isWindowInFocus;
    int _p;
    //original name: _y
    static String login_username_tooltip;
    //original name: _x
    int imageHeight;
    //original name: _s
    static Graphic _members_benefits_prices;
    //original name: _q
    int imageWidth;
    //original name: _k
    static Graphic youarehere;
    Object _u;
    int _i;
    
    static final byte[] a534(final wj_ wj_, final int n, byte[] array) {
        final int i = wj_.j080(-106, n);
        if (i != 0) {
            if (null == array || array.length != i) {
                array = new byte[i];
            }
            final int j080 = wj_.j080(-122, 3);
            final byte b = (byte)wj_.j080(119, 8);
            if (0 < j080) {
                for (int k = 0; k < i; ++k) {
                    array[k] = (byte)(b + wj_.j080(-73, j080));
                }
            }
            else {
                for (int n2 = 0; i > n2; ++n2) {
                    array[n2] = b;
                }
            }
            return array;
        }
        return null;
    }
    
    final boolean a683(final byte b, int n, int n2) {
        if (!this.isActive) {
            return false;
        }
        n2 -= this._t;
        n -= this._i;
        return b < 32 || (0 <= n2 && n >= 0 && this.imageWidth > n2 && this.imageHeight > n);
    }
    
    //probably garbage function
    void b423(final byte b) {
        if (b != 30) {
            this.d326(-28, 91, -122);
        }
        this.a487(false);
    }
    
    final void d150(final int n) {
        this.b326(n, n ^ 0x1FFB, 0);
    }
    
    final void a150(final int n) {
        if (n < 60) {
            this._v = -29;
        }
        this.a599(0, 0, (byte)124);
    }
    
    //original signature: void a183(final boolean b, final int n, final int n2) {
    void a183(final boolean b, final int imageWidth, final int imageHeight) {
        this.c326(2, imageHeight, imageWidth);
    }
    
    final void b599(final int n, final int n2, final byte b) {
        if (n == this._t && n2 == this._i) {
            return;
        }
        if (0x0 != (0x2 & this._v)) {
            this._i += this.imageHeight;
        }
        if (0x0 != (0x1 & this._v)) {
            this._t += this.imageWidth;
        }
        this.e326(-this._i + n2, n - this._t, 108);
        if (0x0 != (this._v & 0x2)) {
            this._i -= this.imageHeight;
        }
        if (0x0 != (this._v & 0x1)) {
            this._t -= this.imageWidth;
        }
        if (b != 4) {
            this._p = 44;
        }
    }
    
    void b326(final int n, final int n2, final int n3) {
        if (n2 != 8187) {
            this._p = 99;
        }
    }
    
    static final tj_ a168(final byte[] array) {
        if (null == array) {
            return null;
        }
        final tj_ tj_ = new tj_(array, hg_._t, fe_._g, jc_._f, jn_._k, uo_._b, ub_._q);
        sb_.a150();
        return tj_;
    }
    
    void d326(final int n, final int n2, final int n3) {
        if (n2 != 128) {
            this.imageWidth = 96;
        }
    }
    
    void a599(final int n, final int n2, final byte b) {
    }
    
    //n is useless parameter
    void a093(final int n, final int n2) {
        if (null != this._r) {
            this._r.a093(1, n2);
        }
    }
    
    void a789(final int n, final byte b, final int n2) {
        if (b > -59) {
            this._p = -18;
        }
    }
    
    void e326(final int n, final int n2, final int n3) {
        this._i += n;
        if (n3 <= 69) {
            this._p = -102;
        }
        this._t += n2;
    }
    
    //original signature: private final void c326(final int n, final int x, final int q) {
    private final void c326(final int n, final int imageHeight, final int imageWidth) {
        if (0x0 != (n & this._v)) {
            this._i += -imageHeight + this.imageHeight;
        }
        if (0x0 != (0x1 & this._v)) {
            this._t += -imageWidth + this.imageWidth;
        }
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
    }
    
    public static void b487() {
        rj_.login_username_tooltip = null;
        rj_.ability_armoured_brief = null;
        rj_.youarehere = null;
        rj_._members_benefits_prices = null;
    }
    
    static final Graphic a373() {
        final Graphic cn_ = new Graphic(11, 11);
        jh_.a303(cn_);
        for (int n = 0; 5 > n; ++n) {
            gf_.b115(n, 3 + n, 11 - 2 * n, 65793);
        }
        jh_.b797();
        return cn_;
    }
    
    //original signature: static final boolean a897(final byte b, final boolean b2) {
    static final boolean writeOpcode12(final boolean b2) {
        if (kf_._m == null) {
            kf_._m = sc_._q.a288(an_.gamePort1, ii_.codeBaseHost);
        }
        if (0 != kf_._m._c) {
            qm_.time = (MusicTrack.time = kd_.getTime());
            if (kf_._m._c != 1) {
                pd_._A = tp_._B;
            }
            else {
            	//this try here writes opcode 12
                try {
                    sp_._c = new rk_((Socket)kf_._m._f, sc_._q);
                    Trap._B.currentIndex = 0;
                    ra_._c.currentIndex = 0;
                    pd_._A = no_._c;
                    final int c;
                    oc_._E = (wl_._f = (c = (b2 ? -2 : -1)));
                    rd_._C = c;
                    
                    RegisterScreen.createOpcode12(mh_.serverNum, Trap._B, kn_.gameId, rd_.lang);
                    op_.writeToServer(0, -1);
                }
                catch (IOException ex) {
                    pd_._A = tp_._B;
                }
            }
            kf_._m = null;
            return true;
        }
        return false;
    }
    
    rj_ a759(final int n, final int n2, final int n3) {
        if (this.a683((byte)114, n2, n3)) {
            return this;
        }
        if (n > -10) {
            return null;
        }
        return null;
    }
    
    rj_(final int n, final int n2, final int n3, final int n4, final int n5) {
        this(n, n2, n5);
        this.c326(2, n4, n3);
    }
    
    private rj_(final int t, final int i, final int v) {
        this.imageWidth = 0;
        this._i = i;
        this.isActive = true;
        this.imageHeight = 0;
        this._t = t;
        this._u = null;
        this._v = v;
        rl_._h.b865(this, false);
    }
    
    static {
        rj_.ability_armoured_brief = new String[] { "Armoured", "Ignores first failed roll in each combat." };
        rj_.login_username_tooltip = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
