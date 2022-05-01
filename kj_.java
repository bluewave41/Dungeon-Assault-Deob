final class kj_ extends ne_
{
    int[] _l;
    static ad_ _p;
    static int _n;
    //original name: _m
    static String loading_extradata;
    int _j;
    //original name: _k
    static String checking;
    //original name: _i
    static String desc_death_knight;
    //original name: _o
    static MusicTrack da_raid_win;
    
    static final Object a534(final boolean b, final byte[] array) {
        if (null == array) {
            return null;
        }
        if (136 < array.length) {
            final ep_ ep_ = new ep_();
            ep_.a167(array, 105);
            return ep_;
        }
        if (!b) {
            return array;
        }
        return gg_.a553(array);
    }
    
    static final void a093(final int d, final int n) {
        ii_.a490(ln_._d, (byte)93, ib_._e, n, d, lc_._d, true);
        for (int i = 0; i < lc_._d; ++i) {
            ol_._k[d + i] = i;
        }
        ii_.a490(n_._d, (byte)(-65), da_._B, d, d + d, lc_._d + d, false);
        if (d < lc_._d) {
            lc_._d = d;
        }
    }
    
    static final void a642(final String s, final boolean b, final float n) {
        if (null == hg_._r) {
            hg_._r = new wi_(lg_._w, ub_.unreadTicketsText);
            lg_._w.a336(hg_._r, -1);
        }
        hg_._r.a189(b, s, n, (byte)45);
        gf_.a797();
        un_.a813(true);
    }
    
    public static void a150() {
        kj_.loading_extradata = null;
        kj_._p = null;
        kj_.da_raid_win = null;
        kj_.checking = null;
        kj_.desc_death_knight = null;
    }
    
    private kj_() throws Throwable {
        throw new Error();
    }
    
    static {
        kj_._n = 0;
        kj_.loading_extradata = "Loading extra data";
        kj_._p = new ad_(6, 2);
        kj_.checking = "Checking";
        kj_.desc_death_knight = "A knight in very nasty-looking, black, skeletal armour, holding a shield with a skull on it and a magical sword. Through countless victorious battles, this raider has gained a mastery over death.";
    }
}
