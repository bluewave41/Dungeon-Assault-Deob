import java.util.*;

final class tk_
{
    int[] _n;
    private Graphic[] _p;
    int[] _z;
    int[] _m;
    int[] _s;
    boolean[] _i;
    int[] _x;
    int[] _e;
    int[] _h;
    int[] _c;
    int _g;
    private se_ _o;
    static pp_ _k;
    //original name: _b
    static String tip_demon_lord;
    int[] _y;
    int[] _a;
    int[] _u;
    int[] _A;
    boolean[] _B;
    private Graphic[] _l;
    int[] _j;
    int[] _f;
    private String[] _t;
    int[] _q;
    int[] _d;
    int _w;
    int _r;
    static String _v;
    
    final void a487(final boolean b) {
        if (!b) {
            return;
        }
        ++this._w;
    }
    
    static final void a423() {
        tn_.a150(-1);
        he_._s = true;
        qc_._t = true;
        lg_._w.h150(1);
        gh_.a676(ha_.connectionlost_reconnecting, false);
    }
    
    private final int a634(final Graphic[] p7, final Graphic[] l, final int[] array, final se_ o, final int n, final String[] t, final int n2) {
        final int length = l.length;
        this._z = new int[length];
        this._d = new int[length];
        this._i = new boolean[length];
        this._q = new int[length];
        this._y = new int[length];
        this._p = p7;
        this._w = 0;
        this._B = new boolean[length];
        this._m = new int[length];
        this._j = new int[length];
        this._o = o;
        this._a = new int[length];
        this._A = new int[length];
        this._u = new int[length];
        this._t = t;
        this._l = l;
        this._e = new int[length];
        this._n = new int[length];
        this._f = new int[length];
        this._x = new int[length];
        this._c = new int[length];
        this._s = new int[length];
        this._h = new int[length];
        final Random random = new Random(416516L);
        int n3 = 0;
        for (int i = 0; i < length; ++i) {
            final int n4 = l[i].imageWidth << 4;
            final int n5 = l[i].imageHeight << 4;
            final int n6 = n4 / 2;
            final int n7 = n5 / 2;
            this._c[i] = -1024 + uj_.getRandom(random, 2048);
            this._n[i] = 6000 + uj_.getRandom(random, 2048);
            this._A[i] = -n6 / 2;
            this._y[i] = -n7 / 2;
            this._j[i] = -(n6 * this._n[i]) >> 12;
            this._q[i] = -(n7 * this._n[i]) >> 12;
            this._h[i] = -1024 + uj_.getRandom(random, 2048);
            this._s[i] = uj_.getRandom(random, 2048) + 6000;
            this._e[i] = -n6 / 4;
            this._m[i] = -n7 / 4;
            this._f[i] = -(n6 * this._n[i]) >> 12;
            this._x[i] = -(this._n[i] * n7 >> 12) + 2000;
            this._z[i] = n3;
            n3 += array[i];
            this._d[i] = n3 + n;
            this._i[i] = (this._B[i] = false);
            this._u[i] = (this._a[i] = 0);
        }
        return this._d[length - 1];
    }
    
    public static void b423(final byte b) {
        tk_._v = null;
        tk_._k = null;
        if (b != 10) {
            return;
        }
        tk_.tip_demon_lord = null;
    }
    
    static final void a115(final int a, final int c, final int p3) {
        sm_._c = c;
        om_._a = a;
        he_._p = p3;
    }
    
    final void a150(final int n) {
        int i = 0;
        if (n > -1) {
            this._w = -24;
        }
        while (i < this._l.length) {
            if (this._w >= this._z[i]) {
                if (this._d[i] >= this._w) {
                    final int n2 = this._w - this._z[i];
                    final int n3 = this._d[i] - this._z[i];
                    final double n4 = n2 / (double)n3;
                    if (12 > bc_._a) {
                        this._l[i].a669((int)to_.a088(this._A[i], this._e[i], n4), (int)to_.a088(this._y[i], this._m[i], n4), (int)to_.a088(this._j[i], this._f[i], n4), (int)to_.a088(this._q[i], this._x[i], n4), (int)to_.a088(this._c[i], this._h[i], n4), (int)to_.a088(this._n[i], this._s[i], n4));
                    }
                    else {
                        this._l[i].b669((int)to_.a088(this._A[i], this._e[i], n4), (int)to_.a088(this._y[i], this._m[i], n4), (int)to_.a088(this._j[i], this._f[i], n4), (int)to_.a088(this._q[i], this._x[i], n4), (int)to_.a088(this._c[i], this._h[i], n4), (int)to_.a088(this._n[i], this._s[i], n4));
                    }
                    gf_.b050(0, 0, gf_._i, this._r, 0);
                    gf_.b050(0, gf_._c - this._r, gf_._i, this._r, 0);
                    if (this._o != null) {
                        if (this._t[i] != null) {
                            final int n5 = this._o._E + this._o._H;
                            final int b913 = this._o.b913(this._t[i], 616);
                            final int c913 = this._o.c913(this._t[i], 616);
                            if (this._p != null) {
                                sn_.a311(116, ((c913 < 2) ? n5 : 100) + 2, this._p, 4, 460 - ((c913 < 2) ? 0 : n5) - this._o._H, b913 + 22);
                            }
                            this._o.a385(this._t[i], 12, 415, 616, 60, 16777215, 0, 1, 1, n5);
                        }
                    }
                    if (25 > n2 && this._B[i]) {
                        gf_.b669(0, 0, gf_._i, gf_._c, this._a[i], 256 - n2 * 10);
                    }
                    final int n6 = -n2 + n3;
                    if (25 > n6) {
                        if (this._i[i]) {
                            gf_.b669(0, 0, gf_._i, gf_._c, this._u[i], 256 - 10 * n6);
                        }
                    }
                }
            }
            ++i;
        }
    }
    
    tk_(final Graphic[] array, final int[] array2, final int n, final se_ se_, final String[] array3, final Graphic[] array4) {
        this._g = this.a634(array4, array, array2, se_, n, array3, 2048);
    }
    
    static {
        tk_.tip_demon_lord = "<col=FF0000>Lethal</col>. Can cause party to flee in terror.";
    }
}
