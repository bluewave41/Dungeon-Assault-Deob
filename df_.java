final class df_
{
	//original name: _g
    static String necromancer;
    //original name: _c
    static Graphic main_center;
    //original name: _e
    static Graphic piece_northman;
    //original name: _a
    static String changedisplayname;
    //original name: _b
    static String tip_vampire_bats;
    //original name: _d
    static String orb_brilliance;
    //original name: _f
    static String desc_saurus_warrior;
    
    static final void b150() {
        for (int n = 0; 49 > n; ++n) {
            final Room room = qj_.dungeonLayout[n];
            if (room != null) {
                room._f = qe_.a928(room, false, false, 0);
            }
            final Room room2 = gm_.playerInformation.dungeonLayout[n];
            if (room2 != null) {
                room2._f = qe_.a928(room2, false, false, 0);
            }
        }
    }
    
    static final int a410() {
        return (int)(kd_.getTime() / 60000L - 16912800L);
    }
    
    static final qh_ a013(final wj_ wj_) {
        final int j080 = wj_.j080(114, 8);
        if (0 < j080) {
            throw new IllegalStateException("" + j080);
        }
        final boolean a234 = jl_.a234(wj_);
        final boolean a235 = jl_.a234(wj_);
        final qh_ qh_ = new qh_();
        qh_._B = (short)wj_.j080(-101, 16);
        qh_._L = aj_.a042(wj_, qh_._L, (byte)31, 16);
        qh_._S = aj_.a042(wj_, qh_._S, (byte)31, 16);
        qh_._z = aj_.a042(wj_, qh_._z, (byte)31, 16);
        qh_._h = (short)wj_.j080(-43, 16);
        qh_._A = aj_.a042(wj_, qh_._A, (byte)31, 16);
        qh_._x = aj_.a042(wj_, qh_._x, (byte)31, 16);
        qh_._N = aj_.a042(wj_, qh_._N, (byte)31, 16);
        if (a234) {
            qh_._c = (short)wj_.j080(-79, 16);
            qh_._d = aj_.a042(wj_, qh_._d, (byte)31, 16);
            qh_._P = aj_.a042(wj_, qh_._P, (byte)31, 16);
            qh_._v = aj_.a042(wj_, qh_._v, (byte)31, 16);
            qh_._e = aj_.a042(wj_, qh_._e, (byte)31, 16);
            qh_._s = aj_.a042(wj_, qh_._s, (byte)31, 16);
            qh_._F = aj_.a042(wj_, qh_._F, (byte)31, 16);
        }
        if (a235) {
            wj_.j080(-97, 16);
            qh_._t = aj_.a042(wj_, qh_._t, (byte)31, 16);
            qh_._Q = aj_.a042(wj_, qh_._Q, (byte)31, 16);
            qh_._I = aj_.a042(wj_, qh_._I, (byte)31, 16);
            qh_._n = aj_.a042(wj_, qh_._n, (byte)31, 16);
            qh_._C = aj_.a042(wj_, qh_._C, (byte)31, 16);
        }
        if (jl_.a234(wj_)) {
            qh_._o = aj_.a042(wj_, qh_._o, (byte)31, 16);
        }
        if (jl_.a234(wj_)) {
            qh_._y = rj_.a534(wj_, 16, qh_._y);
            int n = 0;
            for (int i = 0; i < qh_._y.length; ++i) {
                if (n < (0xFF & qh_._y[i])) {
                    n = (qh_._y[i] & 0xFF);
                }
            }
            if (n != 0) {
                qh_._w = (byte)(1 + n);
            }
            else {
                qh_._y = null;
            }
        }
        return qh_;
    }
    
    static final void a951(final ja_ g) {
        qh_._G = g;
    }
    
    public static void a150() {
        df_.orb_brilliance = null;
        df_.tip_vampire_bats = null;
        df_.necromancer = null;
        df_.desc_saurus_warrior = null;
        df_.piece_northman = null;
        df_.main_center = null;
        df_.changedisplayname = null;
    }
    
    static {
        df_.necromancer = "Necromancer";
        df_.tip_vampire_bats = "<col=FF0000>Attack -1, Defence -1</col>";
        df_.orb_brilliance = "Orb of Brilliance";
        df_.changedisplayname = "Change display name";
        df_.desc_saurus_warrior = "The larger and better trained saurus warriors are far superior in combat than their smaller brethren, using their innate agility to ensure success against all foes.";
    }
}
