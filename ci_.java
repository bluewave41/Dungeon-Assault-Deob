import java.applet.*;

final class ci_ extends ne_
{
    int _k;
    int _r;
    static int[] _s;
    static int[] _n;
    static int _j;
    static Applet _q;
    ci_ _o;
    int _l;
    static int _m;
    int _p;
    int _i;
    
    //original signature: static final va_ a846(final String s, final int n) {
    static final va_ a846(final String s) {
        if (ll_._r.b671(s, "", (byte)(-82))) {
            return ha_._k.a251(s, (byte)126, "");
        }
        if (!ia_._W.b671(s, "", (byte)(-82))) {
            return null;
        }
        return ha_._k.a848(s, "", 37316);
    }
    
    static final void a423() {
        int c = jm_._c;
        int n = 0;
        if (kh_._t == 2) {
            n = (int)((-(-kg_.time + kd_.getTime()) + 10999L) / 1000L);
            if (0 > n) {
                n = 0;
            }
        }
        for (int i = 0; i < go_._A.length; ++i) {
            final int n2 = to_._c[i];
            int n3;
            if (0 <= n2) {
                if (d_._g._b != n2) {
                    n3 = sm_._c;
                }
                else {
                    n3 = he_._p;
                }
            }
            else {
                n3 = om_._a;
            }
            String string = go_._A[i];
            if (2 == kh_._t && n == 1) {
                final int n4 = (sn_._a.length >= mo_._g.length) ? sn_._a.length : mo_._g.length;
                final int n5 = (fd_._b.length > cp_._Q.length) ? fd_._b.length : cp_._Q.length;
                if (6 <= i && 6 + n4 > i) {
                    string = ((-n4 + sn_._a.length + (i - 6) >= 0) ? sn_._a[-n4 + (i - 6 + sn_._a.length)] : "");
                }
                if (i >= n4 + 7) {
                    if (n5 + n4 + 7 > i) {
                        string = ((i - 7 - n4 < cp_._Q.length) ? cp_._Q[-n4 + (i - 7)] : "");
                    }
                }
            }
            if (n2 == -2) {
                string = Integer.toString(n);
            }
            final int a571 = og_.a571(n2 >= 0, string);
            final int n6 = -(a571 >> 1) + vo_._r;
            if (0 <= n2) {
                final qk_ qk_ = (d_._g._b != n2) ? gd_._G : om_._d;
                final int n7 = c + ci_._j;
                if (null != qk_) {
                    qk_.a050(n7, (Raider._q << 1) + mj_._g, (oh_._t << 1) + a571, 112, n6 - oh_._t);
                }
                c = n7 + Raider._q;
            }
            if (n2 >= 0) {
                i_._x.b191(string, n6, i_._n + c, n3, -1);
                c += ci_._j + Raider._q + mj_._g;
            }
            else {
                n_._c.b191(string, n6, li_._g + c, n3, -1);
                c += ag_._a;
            }
        }
    }
    
    //original signature: static final long a438(final CharSequence charSequence, final int n) {
    static final long encodeBase37(final CharSequence charSequence) {
        long n2 = 0L;
        final int i = charSequence.length();
        int n3 = 0;
        while (i > n3) {
            n2 *= 37L;
            final char char1 = charSequence.charAt(n3);
            if ('A' <= char1 && char1 <= 'Z') {
                n2 += char1 + '\u0001' - 65;
            }
            else if (char1 < 'a' || 'z' < char1) {
                if ('0' <= char1) {
                    if ('9' >= char1) {
                        n2 += char1 - '\u0015';
                    }
                }
            }
            else {
                n2 += '\u0001' + char1 - 97;
            }
            if (177917621779460413L <= n2) {
                break;
            }
            ++n3;
        }
        while (n2 % 37L == 0L && 0L != n2) {
            n2 /= 37L;
        }
        return n2;
    }
    
    public static void a150(final int n) {
        ci_._n = null;
        ci_._s = null;
        ci_._q = null;
        if (n <= 5) {
            ci_._j = -10;
        }
    }
    
    ci_(final int r, final int k, final int l, final int i, final int p5) {
        this._k = k;
        this._r = r;
        this._l = l;
        this._p = p5;
        this._i = i;
    }
    
    static {
        ci_._s = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    }
}
