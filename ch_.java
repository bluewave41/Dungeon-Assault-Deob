class ch_ extends hl_
{
    private long _m;
    static sm_[] _n;
    //original name: _l
    static String text_raider_disarmed_trap;
    //original name: _o
    private String username;
    
    @Override
    fd_ b743(final int n) {
        return ug_._w;
    }
    
    @Override
    //original signature: final void a330(final ec_ ec_, final byte b) {
    final void a330(final ec_ ec_) {
        ec_.storeLong8Byte(this._m);
        ec_.encodeRSString(this.username);
    }
    
    public static void c150() {
        ch_.text_raider_disarmed_trap = null;
        ch_._n = null;
    }
    
    static final void a423() {
    }
    
    static final void a541(final byte b, final fn_ fn_, final int n) {
        final wj_ b2 = Trap._B;
        b2.storeFuzzedOpcode(n);
        final wj_ wj_ = b2;
        ++wj_.currentIndex;
        final int o = b2.currentIndex;
        if (b != -16) {
            ch_.text_raider_disarmed_trap = null;
        }
        b2.storeByte(1);
        b2.storeShort(fn_._r);
        b2.storeShort(fn_._s);
        b2.storeShort(fn_._l);
        b2.storeInt(fn_._i);
        b2.storeInt(fn_._n);
        b2.storeInt(fn_._m);
        b2.storeInt(fn_._k);
        b2.storeByte(fn_._p.length);
        for (int i = 0; i < fn_._p.length; ++i) {
            b2.storeInt(fn_._p[i]);
        }
        b2.calculateAndStoreChecksum(o);
        b2.c093(b2.currentIndex - o, -1);
    }
    
    //original signature: ch_(final long m, final String o) {
    ch_(final long m, final String username) {
        this.username = username;
        this._m = m;
    }
    
    static {
        ch_.text_raider_disarmed_trap = "Your raider snuck past trap and disarmed it.";
    }
}
