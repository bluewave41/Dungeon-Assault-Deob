final class lh_
{
    private boolean _s;
    int _j;
    int _h;
    private int _a;
    ca_ _o;
    ca_ _d;
    int _k;
    static int _t;
    ca_ _q;
    ca_ _m;
    static tb_ _p;
    ca_ _c;
    int _l;
    //original name: _b
    static String text_charge_coloured;
    int _e;
    //original name: _r
    static String loginm3;
    se_ _f;
    int _g;
    //original name: _n
    static String[] titles_achievements_female;
    int _i;
    
    private final void a789(final int n, final byte b, final String s, final int n2) {
        final int n3 = this._e + this._g;
        final int n4 = this._h + this._l;
        int i = this._i;
        if (i == -1) {
            i = this._f._E + this._f._H;
        }
        final int n5 = gf_._i >> 2;
        int b2 = this._f.b926(s);
        int n6 = this._f._E + this._f._H;
        if (b2 > n5 || s.indexOf("<br>") != -1) {
            int n8;
            if (n5 < b2) {
                final int n7 = b2 / n5;
                n8 = n5 + (b2 % n5 + n7 - 1) / n7 * 2;
            }
            else {
                n8 = n5;
            }
            if (null == pe_._m) {
                pe_._m = new String[16];
            }
            final int j = this._f.a899(s, new int[] { n8 }, pe_._m);
            n6 += (j - 1) * i;
            b2 = 0;
            for (int n9 = 0; j > n9; ++n9) {
                final int b3 = this._f.b926(pe_._m[n9]);
                if (b3 > b2) {
                    b2 = b3;
                }
            }
        }
        int n10 = n;
        if (n10 - (-b2 - n3) > gf_._i) {
            n10 = -b2 + (gf_._i - n3);
        }
        int n11 = 32 + (-this._f._N + n2);
        if (gf_._c < n4 + (n11 + n6)) {
            n11 = -n4 - n6 + n2;
        }
        gf_.e050(n10, n11, b2 + n3, n4 + n6, this._k);
        if (b != -81) {
            return;
        }
        gf_.b050(n10 + 1, 1 + n11, n3 + b2 - 2, n4 + n6 - 2, this._j);
        this._f.a385(s, this._e + n10, n11 + this._l, b2, n6, this._a, -1, 0, 0, i);
    }
    
    final void a021(final int n, final se_ f) {
        final hh_ m = new hh_(f, 2, 2, 2236962, 1, 1, 1, f._H + (f._E + 2));
        m._g = 16777215;
        this._m = m;
        final an_ o = new an_();
        m.a446((byte)126, o);
        o._t = 11711154;
        this._i = -1;
        this._a = 15658734;
        this._f = f;
        this._j = 5592405;
        this._e = 3;
        this._g = 3;
        this._l = 3;
        this._h = 3;
        o._j = 15658734;
        this._k = 15658734;
        o.a970(0, (byte)(-115)).a913(-7695, 15658734).a316(bb_.a447(8947848, 7829367, 10066329), true);
        o.a970(1, (byte)(-90)).a316(bb_.a447(11184810, 13421772, 10066329), true);
        o.a970(3, (byte)(-97)).a316(bb_.a447(8947848, 10066329, 7829367), true).b913(1, -114).c913(1, -33);
        final Graphic[] array = new Graphic[9];
        final ei_ ei_ = new ei_(32, 32);
        for (int i = 0; i < ei_._B.length; ++i) {
            ei_._B[i] = 1077952576;
        }
        array[4] = ei_;
        o.a970(4, (byte)(-115)).a479((byte)(-110), true).a316(array, true);
        o.a970(5, (byte)(-86)).a316(hj_.a936(0, 65793, 0, 0), true).a479((byte)(-116), true).a913(-7695, -1);
        this._o = o;
        new an_(o, true)._f = 0;
        final an_ an_ = new an_(o, true);
        an_._f = 0;
        an_.a503(ek_.a229(8947848), 0);
        an_.a970(1, (byte)(-107)).a316(ek_.a229(11184810), true).a913(-7695, 2236962);
        this._q = new oh_(f, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        
        new jn_(f, 2, 2, 16777215, -1, 16777215, 16729156, 4473924); //this doesn't do anything does it
        new im_(f, 16777215, -1, 125269879, 4473924, 3, 268435455); //shouldn't do anything
        final an_ c = new an_();
        
        m.a446((byte)126, c);
        c.a970(0, (byte)(-99)).a316(bb_.a447(15658734, 10066329, 7829367), true).a913(-7695, 1118481).d913(-1, 216);
        c.a970(4, (byte)(-91)).a479((byte)(-111), true).a316(array, true);
        this._c = c;
        final Graphic[] array2 = { null, null, null, null, new Graphic(2, 1), null, null, null, null };
        final Graphic[] array3 = { null, null, null, null, new Graphic(1, 2), null, null, null, null };
        final Graphic cn_ = array3[4];
        final Graphic cn_2 = array2[4];
        final int[] array4 = { 6710886, 7829367 };
        cn_2._B = array4;
        cn_._B = array4;
        final an_ an_2 = new an_();
        final an_ an_3 = new an_();
        an_2.a536(0, array2, -116);
        an_3.a536(0, array3, -116);
        final Graphic cn_3 = new Graphic(7, 4);
        cn_3._B = new int[] { 8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772 };
        new an_(o, true).a587((byte)47, cn_3.d125());
        cn_3.g797();
        new an_(o, true).a587((byte)47, cn_3.d125());
        cn_3.g797();
        new an_(o, true).a587((byte)47, cn_3.d125());
        cn_3.g797();
        new an_(o, true).a587((byte)47, cn_3);
    }
    
    final void a370(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        gf_.b669(n2, n3, n, n7, n4, n6);
        if (n5 > -61) {
            this.a006(-30, 77, 78, 91, 100, false);
        }
    }
    
    //original signature: public static void a150(final int n) {
    public static void a150() {
        lh_.loginm3 = null;
        lh_.text_charge_coloured = null;
        lh_.titles_achievements_female = null;
        lh_._p = null;
    }
    
    final void a006(final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        gf_.c050(n4, n3, n, n2, n5);
        if (!b) {
            this._s = true;
        }
    }
    
    //original signature: private final void a960(final int n, final int n2, final int n3, final String s) {
    private final void a960(final int n, final int n2, final String s) {
        final int b926 = this._f.b926(s);
        final int n4 = this._f._N + this._f._E;
        int n5 = n2;
        if (6 + (n5 + b926) > gf_._i) {
            n5 = -b926 + (gf_._i - 6);
        }
        int n6 = 32 - this._f._N + n;
        if (6 + n4 + n6 > gf_._c) {
            n6 = gf_._c + (-n4 - 6);
        }
        gf_.e050(n5, n6, 6 + b926, 6 + n4, this._a);
        gf_.b050(n5 + 1, n6 + 1, b926 + 4, n4 + 4, this._j);
        this._f.b191(s, n5 + 3, this._f._N + n6 + 3, this._a, -1);
    }
    
    //original signature: final void a668(final String s, final int n, final int n2, final int n3) {
    final void a668(final String s, final int n2, final int n3) {
        if (!this._s) {
            this.a960(n2, n3, s);
        }
        else {
            this.a789(n3, (byte)(-81), s, n2);
        }
    }
    
    public lh_() {
        this._s = true;
    }
    
    static {
        lh_.text_charge_coloured = "<col=8B1717>Charge</col>";
        lh_.loginm3 = "Connection timed out. Please try using a different server.";
        lh_._t = 9;
        lh_.titles_achievements_female = new String[] { "<%0> the Feared", "<%0> the Stalwart", "<%0> the Vengeful", "<%0> the Tyrant", "<%0>, Mistress of the Game" };
    }
}
