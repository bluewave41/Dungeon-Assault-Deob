import java.util.*;

final class md_
{
    static int _f;
    //original name: _d
    static Random random;
    ne_ _c;
    //original name: _a
    static String mb_full_access_1;
    private ne_ _e;
    
    //original signature: static int b080(final int n, final int n2) {
    static int xor(final int n, final int n2) {
        return n ^ n2;
    }
    
    //original signature: final ne_ b081(final byte b) {
    final ne_ b081() {
        final ne_ e = this._c._e;
        if (e == this._c) {
            return null;
        }
        e.a487(false);
        return e;
    }
    
    final void b150(final int n) {
        while (true) {
            final ne_ e = this._c._e;
            if (e == this._c) {
                break;
            }
            e.a487(false);
        }
        if (n != -4) {
            this.b865(null, false);
        }
        this._e = null;
    }
    
    final ne_ g024(final int n) {
        final ne_ e = this._e;
        if (this._c != e) {
            this._e = e._a;
            if (n != 20) {
                this.a865(null);
            }
            return e;
        }
        return this._e = null;
    }
    
    static final void a093(final int e) {
        mo_.instructionPageIndex = e;
        if (nk_._Jb._b >= 0 && !nl_.a370(nk_._Jb._b)) {
            nk_._Jb._b = 1;
        }
    }
    
    //original signature: final boolean a427(final byte b) {
    final boolean a427() {
        return this._c._e == this._c;
    }
    
    static final void a368(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        if (null == bf_._h) {
            bf_._h = new ge_(wa_._j);
            hm_._n.a501(bf_._h);
        }
        bf_._h.f267(n5);
        bf_._h.e267(n2);
        bf_._h.d267(n6);
        bf_._h.a267(n4);
        bf_._h.b267(n);
        bf_._h.c267(n3);
    }
    
    static final boolean f154() {
        return null != cm_._R || rj_.isWindowInFocus;
    }
    
    public static void h150(final int n) {
        md_.mb_full_access_1 = null;
        md_.random = null;
        if (n != -4) {
            h150(69);
        }
    }
    
    //original signature: final void a865(final ne_ ne_, final boolean b) {
    final void a865(final ne_ ne_) {
        if (ne_._a != null) {
            ne_.a487(false);
        }
        ne_._a = this._c._a;
        ne_._e = this._c;
        ne_._a._e = ne_;
        ne_._e._a = ne_;
    }
    
    final ne_ a024(final int n) {
        if (n != 4) {
            a238(-3, null);
        }
        final ne_ e = this._e;
        if (e != this._c) {
            this._e = e._e;
            return e;
        }
        return this._e = null;
    }
    
    //original signature: final ne_ e024(final int n) {
    final ne_ e024() {
        final ne_ e = this._c._e;
        if (e == this._c) {
            return this._e = null;
        }
        this._e = e._e;
        return e;
    }
    
    final ne_ c024(final int n) {
        final ne_ a = this._c._a;
        if (n != 0) {
            this._c = null;
        }
        if (this._c != a) {
            a.a487(false);
            return a;
        }
        return null;
    }
    
    static final void a238(final int n, final Graphic cn_) {
        if (0x0 == (0x3 & (cn_._A | (cn_._w | (cn_.imageHeight | cn_.imageWidth))))) {
            return;
        }
        final int n2 = (0x3 & cn_._w) + cn_.imageWidth;
        final int y = -(0x3 & n2) + 4 + n2;
        final int n3 = (cn_._A & 0x3) + cn_.imageHeight;
        final int v = n3 - ((0x3 & n3) - 4);
        final int[] b = new int[v * y];
        int n4 = 0;
        int n5 = (0x3 & cn_._w) + y * (cn_._A & 0x3);
        int n6 = 0;
        if (n <= 42) {
            md_._f = -7;
        }
        while (cn_.imageHeight > n6) {
            for (int n7 = 0; cn_.imageWidth > n7; ++n7) {
                b[n5++] = cn_._B[n4++];
            }
            n5 += y - cn_.imageWidth;
            ++n6;
        }
        cn_.imageWidth = y;
        cn_._w &= 0xFFFFFFFC;
        cn_.imageHeight = v;
        cn_._A &= 0xFFFFFFFC;
        cn_._B = b;
    }
    
    final void b865(final ne_ ne_, final boolean b) {
        if (null != ne_._a) {
            ne_.a487(false);
        }
        if (b) {
            md_.mb_full_access_1 = null;
        }
        ne_._a = this._c;
        ne_._e = this._c._e;
        ne_._a._e = ne_;
        ne_._e._a = ne_;
    }
    
    final ne_ d024(final int n) {
        if (n != -14205) {
            md_.mb_full_access_1 = null;
        }
        final ne_ a = this._c._a;
        if (a != this._c) {
            this._e = a._a;
            return a;
        }
        return this._e = null;
    }
    
    public md_() {
        this._c = new ne_();
        this._c._e = this._c;
        this._c._a = this._c;
    }
    
    static {
        md_.mb_full_access_1 = "FULL ACCESS";
        md_.random = new Random(6L);
    }
}
