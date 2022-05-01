import java.awt.*;

final class bn_
{
    private int _o;
    private int _a;
    private int _c;
    private int _s;
    private int _t;
    static int _n;
    private int _l;
    private int _u;
    private int _r;
    static nl_ _j;
    private int _e;
    //original name: _i
    static String fs_accept_countdown_pl;
    //original name: _m
    static String[] tutorial_firstroom1b;
    //original name: _h
    static Graphic piece_hellbeast;
    private int _p;
    private int _w;
    static Graphic _f;
    private float _y;
    private boolean _d;
    private int _v;
    private int _b;
    //original name: _q
    static String text_instructions;
    private bm_ _g;
    private int _x;
    private int _k;
    
    final void a150(final int n) {
        this._g.a599(this._e, this._t, (byte)(-107));
        if (n != 6733) {
            a788(null, -15, 123);
        }
    }
    
    final void e150(final int n) {
        if (n != 6731) {
            this.c150(-81);
        }
        if (cm_._R != null) {
            return;
        }
        if (pb_.isMember <= 0) {
            this._d = false;
        }
        if (!this._d) {
            if (this._x > up_.componentWidth) {
                aj_.componentX = (-up_.componentWidth + this._x) / 2;
            }
            else if (this._x > 0) {
                aj_.componentX = 0;
            }
            if (this._o != up_.componentWidth || eg_.componentHeight != this._v) {
                this._g.a599(this._v, this._o, (byte)(-118));
            }
            return;
        }
        if (0 < --this._c) {
            return;
        }
        this._c = this._k;
        if (this._b <= sj_._bb) {
            this.c150(103);
            return;
        }
        this._d = false;
    }
    
    final boolean b154(final int n) {
        return this._b <= sj_._bb && pb_.isMember > 0;
    }
    
    final void a773(final int a, final boolean b, final int x) {
        this._a = a;
        this._x = x;
        if (!b) {
            bn_._j = null;
        }
    }
    
    //original signature: static final c_ a788(final int n, final Component component, final int n2, final int n3) {
    static final c_ a788(final Component component, final int componentWidth, final int componentHeight) {
        try {
            final ij_ ij_ = ij_.class.newInstance();
            ij_.a345((byte)(-48), component, componentHeight, componentWidth);
            return ij_;
        }
        catch (Throwable t) {
            final kf_ kf_ = new kf_();
            kf_.a345((byte)72, component, componentHeight, componentWidth);
            return kf_;
        }
    }
    
    private final void c150(final int n) {
        int n2 = this._x;
        int n3 = this._a;
        if (this.b154(71)) {
            if (this._p >= n2) {
                if (n2 < this._s) {
                    n2 = this._s;
                }
            }
            else {
                n2 = this._p;
            }
            if (this._r >= n3) {
                if (this._l > n3) {
                    n3 = this._l;
                }
            }
            else {
                n3 = this._r;
            }
            if (0.0f < this._y) {
                final int n4 = (int)(this._y * n3 + 0.5f);
                if (n2 < n4) {
                    n3 = (int)(n2 / this._y);
                }
                else if (n4 < n2) {
                    n2 = n4;
                }
            }
            if (n2 != up_.componentWidth || eg_.componentHeight != n3) {
                this._g.a599(n3, n2, (byte)(-109));
            }
            if (0 < this._x) {
                aj_.componentX = (-up_.componentWidth + this._x) / 2;
            }
            return;
        }
        this._d = false;
    }
    
    public static void a423() {
        bn_.fs_accept_countdown_pl = null;
        bn_._f = null;
        bn_.tutorial_firstroom1b = null;
        bn_.piece_hellbeast = null;
        bn_.text_instructions = null;
        bn_._j = null;
    }
    
    private bn_() throws Throwable {
        throw new Error();
    }
    
    final ek_ d487(final int n) {
        this._e = eg_.componentHeight;
        this._t = up_.componentWidth;
        this._g.a599(this._w, this._u, (byte)(-86));
        if (n < 32) {
            return null;
        }
        ve_._a = false;
        final ek_ a470 = gh_.a470(0, 0, this._w, i_._A, this._u);
        if (a470 == null) {
            this.a150(6733);
        }
        return a470;
    }
    
    static {
        bn_._n = 2;
        bn_.fs_accept_countdown_pl = "If you do nothing the game will revert to normal view in <%0> seconds.";
        bn_.tutorial_firstroom1b = new String[] { "Trap", "<%highlight>This room contains a Trap!</col> The statistics of a room are displayed in the bottom-right, opposite your raider's. These statistics are slightly different from those of a raider: <%attack>, <%defence>, <%snare> and <%detect>. A <%trap>, such as <%lastroom>, will usually have high <%snare> and <%detect>, with low or no <%attack> or <%defence>." };
        bn_.text_instructions = "INSTRUCTIONS";
    }
}
