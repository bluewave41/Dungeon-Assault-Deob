final class oh_ implements ca_
{
	//original name: _a
    static String fs_unavailable_try_signed_applet;
    static md_ _j;
    private se_ _m;
    private int _g;
    static int _s;
    private int _p;
    private int _f;
    private int _c;
    private int _k;
    private int _d;
    private int _e;
    //original name: _o
    static String text_recently_raided_by;
    private int _h;
    private int _l;
    //original name: _q
    static String hidden_pit;
    private int _i;
    //original name: _b
    static String reloadgame;
    private int _r;
    static int _t;
    //original name: _n
    static String login_justplay_tooltip;
    
    static final void a093(final int n, final int n2) {
        al_.dungeonPath.clearDungeonPath();
        al_.dungeonPath.a093(24);
        jb_._Sb[24] = -1;
        if (n2 != 7) {
            oh_.reloadgame = null;
        }
        hf_._ob.b150(-4);
        hf_._ob.a865(new a_(24));
        while (!hf_._ob.a427()) {
            final int j = ((a_)hf_._ob.b081())._j;
            if (me_.dungeonLayout[j].trap.roomType == n) {
                al_.dungeonPath.b093(j, n2 + 24);
            }
            else {
                if (j % 7 > 0) {
                    me_.a652(j, j - 1, (byte)69, j - 1 - j / 7);
                }
                if (j % 7 < 6) {
                    me_.a652(j, j + 1, (byte)114, -(j / 7) + j);
                }
                if (j > 6) {
                    me_.a652(j, j - 7, (byte)71, j - 7 + 42);
                }
                if (42 <= j) {
                    continue;
                }
                me_.a652(j, 7 + j, (byte)115, j + 42);
            }
        }
    }
    
    public static void a150() {
        oh_._j = null;
        oh_.fs_unavailable_try_signed_applet = null;
        oh_.hidden_pit = null;
        oh_.reloadgame = null;
        oh_.login_justplay_tooltip = null;
        oh_.text_recently_raided_by = null;
    }
    
    static final me_ a321(final String s) {
        return new me_(s);
    }
    
    static final void a423() {
        if (null != m_._e && 20 <= gn_._h) {
            if (m_._e != un_._e) {
                of_._f = m_._e.b373((byte)(-114));
                if (of_._f != null) {
                    uo_._a = dd_.a510(8, of_._f);
                }
            }
            if (null != of_._f) {
                final int y = of_._f.imageWidth;
                final int v = of_._f.imageHeight;
                int s = hj_.mouseX;
                if (y + s > 640) {
                    s -= y;
                }
                int n = Animation.mouseY - v;
                if (0 > n) {
                    n += 30 + v;
                }
                gf_.b669(s - 8, n - 8, of_._f.imageWidth + 16, of_._f.imageHeight + 16, 16777215, 16);
                gf_.b669(s - 4, n - 4, 8 + of_._f.imageWidth, of_._f.imageHeight + 8, 0, 64);
                bp_.a131(n, uo_._a, s);
                of_._f.drawImage(s, n);
            }
        }
    }
    
    @Override
    public final void a623(final byte b, final lm_ lm_, final int n, final int n2, boolean b2) {
        final GUICheckbox rb_ = (GUICheckbox)((lm_ instanceof GUICheckbox) ? lm_ : null);
        if (rb_ != null) {
            b2 &= rb_._B;
        }
        int n3 = 5592405;
        if (b2) {
            n3 = 16777215;
        }
        gf_.b050(lm_.xAxisOffset + n, lm_.yAxisOffset + n2, lm_.componentWidth, lm_.componentHeight, this._g);
        if (b != 34) {
            a331(32, '\ufff4');
        }
        final int n4 = n + lm_.xAxisOffset + this._d;
        final int n5 = n2 + (lm_.yAxisOffset + this._h);
        gf_.a050(n4, n5, this._l, this._e, 5592405);
        gf_.b050(n4, n5, this._l, this._e, n3);
        if (rb_._E) {
            gf_.c050(n4, n5, this._l + n4, this._e + n5, 1);
            gf_.c050(n4 + this._l, n5, n4, n5 + this._e, 1);
        }
        if (null != this._m) {
            final int n6 = this._k + this._l + this._d;
            this._m.a385(lm_.buttonText, lm_.xAxisOffset + n + n6, this._f + (lm_.yAxisOffset + n2), -n6 - (this._k - lm_.componentWidth), -(this._k << 1) + lm_.componentHeight, this._p, this._i, this._c, this._r, 0);
        }
    }
    
    //original signature: static final cn_ a825(final nh_ nh_, final String s, final String s2) {
    static final Graphic a825(final nh_ nh_, final String folderName, final String assetName) {
        final int a913 = nh_.a913(folderName, 1000);
        return jf_.a182(nh_.a026(0, assetName, a913), nh_, a913);
    }
    
    static final boolean a331(final int n, final char c) {
        if ((c <= '\0' || '\u0080' <= c) && (' ' > c || '\u00ff' < c)) {
            if ('\0' != c) {
                final char[] d = mh_._d;
                for (int i = 0; i < d.length; ++i) {
                    if (c == d[i]) {
                        return true;
                    }
                }
            }
            return n != -161;
        }
        return true;
    }
    
    oh_(final se_ m, final int k, final int f, final int p10, final int i, final int d, final int h, final int e, final int l, final int g) {
        this._c = 1;
        this._r = 1;
        this._k = k;
        this._h = h;
        this._p = p10;
        this._g = g;
        this._e = e;
        this._d = d;
        this._i = i;
        this._f = f;
        this._m = m;
        this._l = l;
    }
    
    static {
        oh_.fs_unavailable_try_signed_applet = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        oh_.text_recently_raided_by = "Recently raided by: ";
        oh_.hidden_pit = "Hidden Pit";
        oh_.reloadgame = "Reload game";
        oh_._j = new md_();
        oh_.login_justplay_tooltip = "Play the game without logging in just yet";
    }
}
