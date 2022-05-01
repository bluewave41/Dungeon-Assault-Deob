import java.util.*;

abstract class l_
{
	//original name: _a
    static Calendar calendar;
    //original name: _f
    static String text_raiders_died_none;
    tg_[] _e;
    //original name: _c
    static String text_title_requirements_achievement;
    //original name: _b
    static int gamePort2;
    //original name: _d
    static String text_menu;
    
    final int a586(final int n, final int n2, final byte b) {
        if (null == this._e || 0 == this._e.length || n2 < this._e[0]._m) {
            return -1;
        }
        if (this._e[this._e.length - 1]._c < n2) {
            return -1;
        }
        if (this._e.length == 1) {
            return this._e[0].a543((byte)(-117), n);
        }
        int n3 = 0;
        if (b > -111) {
            l_.calendar = null;
        }
        int i = 0;
        while (i < this._e.length) {
            final tg_ tg_ = this._e[i];
            if (tg_._m <= n2 && n2 <= tg_._c) {
                final int a543 = tg_.a543((byte)(-92), n);
                if (a543 == -1) {
                    return -1;
                }
                return n3 + a543;
            }
            else {
                n3 += tg_._k.length - 1;
                ++i;
            }
        }
        return -1;
    }
    
    final int c137(final int n) {
        int n2 = -1;
        if (this._e != null) {
            final tg_[] e = this._e;
            for (int n3 = 0; e.length > n3; ++n3) {
                final tg_ tg_ = e[n3];
                if (tg_ != null) {
                    final int a410 = tg_.a410((byte)(-90));
                    if (n2 < a410) {
                        n2 = a410;
                    }
                }
            }
        }
        return n2;
    }
    
    static final fa_ a472(final ni_ ni_) {
        final fa_ fa_ = new fa_(ni_, ni_);
        ud_._v.a865(fa_);
        wa_._j.b501(ni_);
        return fa_;
    }
    
    static final vk_ a307(final boolean f) {
        final vk_ vk_ = new vk_(true);
        vk_._f = f;
        return vk_;
    }
    
    final int a655(final String s, final int n, final int n2, final int n3) {
        int n4 = 0;
        int n5 = 0;
        for (int length = s.length(), i = n; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 != '<') {
                if ('>' == char1) {
                    n5 = 0;
                }
                else if (n5 == 0 && char1 == ' ') {
                    ++n4;
                }
            }
            else {
                n5 = 1;
            }
        }
        if (0 < n4) {
            return (-n2 + n3 << 8) / n4;
        }
        return 0;
    }
    
    final int a543(final byte b, int n) {
        final tg_[] e = this._e;
        for (int i = 0; i < e.length; ++i) {
            final tg_ tg_ = e[i];
            if (tg_._k.length > n) {
                return tg_._k[n];
            }
            n -= tg_._k.length - 1;
        }
        return 0;
    }
    
    final int a080(final int n, int n2) {
        for (int i = n; i < this._e.length; ++i) {
            final tg_ tg_ = this._e[i];
            if (n2 < tg_._k.length) {
                return i;
            }
            n2 -= tg_._k.length - 1;
        }
        return this._e.length;
    }
    
    static final void b487() {
        if (bk_._b != null) {
            try {
                bk_._b.setK(0L);
                bk_._b.a539(ra_._c.currentIndex, -79, 24, ra_._c.buffer);
            }
            catch (Exception ex) {}
        }
        final wj_ c = ra_._c;
        c.currentIndex += 24;
    }
    
    public static void a423() {
        l_.text_title_requirements_achievement = null;
        l_.text_raiders_died_none = null;
        l_.text_menu = null;
        l_.calendar = null;
    }
    
    static final void a150(final int n) {
        if (n != -1) {
            a150(116);
        }
        if (10 == kh_._n) {
            tk_.a423();
            kh_._n = 11;
        }
        u_._O = true;
    }
    
    //original signature: static final hl_ a566(final String s, final long n, final boolean b, final String s2) {
    static final hl_ a566(final String username, final long n, final String password) {
        if (n == 0L && password != null) {
            return new vl_(password, username);
        }
        return new ch_(n, username);
    }
    
    static final int d137(final int n) {
        if (n != 4570) {
            return -92;
        }
        boolean b = false;
        while (ha_.b427()) {
            Raider._h.d150(n - 4570);
            if (!Raider._h.c154(n - 4670)) {
                continue;
            }
            b = true;
        }
        Raider._h.a326(-7734, wi_.c313(hm_.mouseY, n ^ 0x2051BA, lc_.mouseX), wi_.c313(Animation.mouseY, 2113632, hj_.mouseX));
        if (Raider._h.c154(n - 4689)) {
            b = true;
        }
        int n2 = 0;
        if (b) {
            if (0 <= Raider._h._b) {
                n2 = op_._c[Raider._h._b];
                if (n2 == 2) {
                    vk_.a423();
                }
            }
        }
        return n2;
    }
    
    final int b137(final int n) {
        if (n != 263) {
            return -25;
        }
        return (null == this._e || this._e.length <= 0) ? 0 : (this._e[this._e.length - 1]._c - this._e[0]._m);
    }
    
    //original signature: static final void a702(final boolean b, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int[][] array, final int n9, final boolean b2, final int n10) {
    static final void createTrap(final boolean isMonster, final int attack, final int defence, final int trapId, final int detect, final int roomType, final int unknown2, final int cost,
    		final int[][] abilities, final int renown, final boolean isFatal, final int snare) {
        gh_.traps[trapId] = new Trap(trapId, roomType, cost, renown, unknown2, attack, defence, snare, detect, isMonster, isFatal, abilities);
    }
    
    static final boolean a491() {
        return nl_._d > 250;
    }
    
    static {
        l_.text_raiders_died_none = "All of your raiders escaped.";
        l_.text_title_requirements_achievement = "You must gain the <%0> Achievement to earn the title of <%1>.";
        l_.calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        l_.text_menu = "MENU";
    }
}
