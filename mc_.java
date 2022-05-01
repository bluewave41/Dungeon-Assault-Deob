class mc_ extends hh_
{
    static r_ _x;
    //original name: _w
    static Graphic[] room_floors;
    
    @Override
    public final void a623(final byte b, final lm_ lm_, final int n, final int n2, final boolean b2) {
        if (b2) {
            ll_.a050(2, n + lm_.xAxisOffset, lm_.componentWidth, lm_.componentHeight, n2 + lm_.yAxisOffset);
        }
        super.a623(b, lm_, n, n2, b2);
    }
    
    mc_(final se_ se_, final int n) {
        super(se_, 4, 2, 2, 2, n, -1, 0, 1, se_._H, -1, Integer.MAX_VALUE, false);
    }
    
    public static void c150() {
        mc_._x = null;
        mc_.room_floors = null;
    }
    
    //original signature: mc_(final int n) {
    mc_() {
        this(lp_._C, 10000536);
    }
    
    static final void b093(final int n, final int n2) {
        am_._d = (n << 16) / n2;
        am_._g = 100 * n / 150;
        am_._c = n * 400 / 150;
    }
    
    static final void a934(final int n, final int[] array) {
        tg_._f[n] = array;
        bf_._f[n] = new qc_(n);
    }
    
    static final void a623(final String s, final int n, final boolean b, final boolean[] array) {
        if (tl_._l) {
            throw new RuntimeException((String)null);
        }
        if (Animation.a213(s)) {
            throw new RuntimeException((String)null);
        }
        if (null != gm_.playerInformation) {
            if (!gm_.playerInformation.isDungeonActivated) {
                Trap._B.storeFuzzedOpcode(58);
            }
            o_.a150();
            Trap._B.storeFuzzedOpcode(61);
            int n2 = 0;
            for (int i = 0; i < 8; ++i) {
                if (array[i]) {
                    n2 |= 1 << i;
                }
            }
            Trap._B.storeShort(n);
            Trap._B.storeByte(n2);
            return;
        }
        throw new RuntimeException((String)null);
    }
    
    static {
        mc_._x = new r_();
    }
}
