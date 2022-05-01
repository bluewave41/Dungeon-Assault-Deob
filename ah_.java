final class ah_
{
	//original name: _a
    static String text_guardian_trapped_alerted;
    static oi_ _b;
    static String[] _c;
    
    static final void a183(final int n, final int n2) {
        if (nl_._d < 0) {
            return;
        }
        final int n3 = n - 135;
        final int n4 = n2 - 35;
        int n5 = 256;
        if (75 > nl_._d) {
            n5 = (nl_._d << 8) / 75;
        }
        if (nl_._d > 200) {
            n5 = (-nl_._d + 250 << 8) / 50;
        }
        lm_.a901(hc_._a);
        re_.b797();
        gf_.a797();
        id_.a150(439027688);
        if (256 > n5) {
            gf_.b669(0, 0, gf_._i, gf_._c, 0, 256 - n5);
        }
        ti_.c487(true);
        if (150 <= nl_._d) {
            dm_._g.d326(15 + n3, n4 + 10, n5);
        }
        else {
            hc_._a.a093(n3, n4);
        }
        final int n6 = nl_._d - 125;
        if (n6 > 0) {
            if (n6 < 50) {
                if (20 > n6) {
                    ie_._l.b326(n3, n4, n6 * 256 / 20);
                }
                else if (30 > n6) {
                    ie_._l.b326(n3, n4, 256);
                }
                else {
                    ie_._l.b326(n3, n4, (-(n6 * 256) + 12800) / 20);
                }
            }
        }
        final int n7 = nl_._d - 140;
        if (n7 > 0) {
            int n8 = 256;
            if (n7 < 20) {
                n8 = n7 * 256 / 20;
            }
            PlayerInformation._C.d326(n3 + 15, 10 + n4, n8 * n5 >> 8);
        }
    }
    
    static final boolean a098(final CharSequence charSequence, final int n, final boolean b) {
        if (n < 2 || n > 36) {
            throw new IllegalArgumentException("" + n);
        }
        boolean b2 = false;
        boolean b3 = false;
        int n2 = 0;
        for (int length = charSequence.length(), i = 0; i < length; ++i) {
            int char1 = charSequence.charAt(i);
            if (i == 0) {
                if (char1 == 45) {
                    b2 = true;
                    continue;
                }
                if (char1 == 43 && b) {
                    continue;
                }
            }
            if (48 <= char1 && char1 <= 57) {
                char1 -= 48;
            }
            else if (65 > char1 || char1 > 90) {
                if (char1 < 97 || char1 > 122) {
                    return false;
                }
                char1 -= 87;
            }
            else {
                char1 -= 55;
            }
            if (char1 >= n) {
                return false;
            }
            if (b2) {
                char1 = -char1;
            }
            final int n3 = n * n2 + char1;
            if (n3 / n != n2) {
                return false;
            }
            b3 = true;
            n2 = n3;
        }
        return b3;
    }
    
    static final FontStyle a770(final nh_ nh_, final int n, final String s, final String s2, final nh_ nh_2) {
        final int a913 = nh_2.a913(s2, 1000);
        if (n != 200) {
            a770(null, 14, null, null, null);
        }
        return hh_.a921(nh_, nh_2, a913, nh_2.a026(0, s, a913));
    }
    
    public static void a150() {
        ah_.text_guardian_trapped_alerted = null;
        ah_._b = null;
        ah_._c = null;
    }
    
    static final void a540(final int n) {
        ri_._g = ec_._j[n].a125();
        final String s = ce_.achievement_names[n];
        final int n2 = 40 + ne_.roman20.b926(s);
        final Graphic a = new Graphic(n2, 32);
        jh_.c797();
        a.e797();
        ri_._g.c115(0, 0, 32, 32);
        ne_.roman20.b191(s, 40, ne_.roman20._H + 32 >> 1, 16777215, -1);
        a.d150(16777215);
        a.e797();
        ri_._g.b050(0, 0, 32, 32, 0);
        ne_.roman20.b191(s, 40, 32 + ne_.roman20._H >> 1, 0, -1);
        jh_.b797();
        ke_._e = 0;
        pa_._a = a;
        sl_._b = new rh_(12 + (n2 >> 1), 32, 8 + n2, 32, 16711680, 768, 224);
    }
    
    static {
        ah_.text_guardian_trapped_alerted = "Raider was trapped by guardian, which alerted the monsters of the dungeon.";
        ah_._c = new String[255];
    }
}
