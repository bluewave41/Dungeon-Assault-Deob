final class ab_
{
	//original name: _b
    static String text_steal_gold;
    static long _a;
    static int _c;
    //original name: _d
    static String[] titles_external_game;
    
    //original signature: static final void a150(final int n) {
    static final void a150() {
        if (id_._l != null && fc_._d == uo_.currentTutorialString.length - 1) {
            if (id_._l != bl_._l) {
                Raider._f = mf_.a971(16744448, id_._l.imageHeight, 8, id_._l.imageWidth);
                bl_._l = id_._l;
            }
            final int n2 = 32 - mo_._a % 50 << 3;
            if (0 < n2) {
                Raider._f.b326(id_._l._t, id_._l._i, n2);
            }
        }
        dh_.a115(32, vf_._w, wi_._kb, qc_._w);
        gf_.a331(ib_._a);
        gf_.e115(vf_._w, qc_._w, vf_._w + 200, wi_._kb + qc_._w + 3);
        if (-1 != ce_._p) {
            if (bl_._k) {
                int a666 = fa_.a666(-(20 + hc_._b), 0);
                if (null == gk_._L) {
                    a666 = 0;
                }
                bo_.a286(5, gk_._L, a666 + qc_._w, vf_._w);
                bo_.a286(5, jn_._l, 20 + qc_._w - (-a666 - hc_._b), vf_._w);
            }
            else {
                int a667 = fa_.a666(0, -(20 + ui_._a));
                if (gk_._L == null) {
                    a667 = 0;
                }
                bo_.a286(5, jn_._l, a667 + qc_._w, vf_._w);
                bo_.a286(5, gk_._L, 20 + (qc_._w + a667 + ui_._a), vf_._w);
            }
        }
        else {
            bo_.a286(5, gk_._L, qc_._w, vf_._w);
        }
        gf_.b331(ib_._a);
        for (rj_ rj_ = (rj_)pp_._K.e024(); rj_ != null; rj_ = (rj_)pp_._K.a024(4)) {
            rj_.d150(0);
        }
    }
    
    //original signature: static final int a313(final int n, final int n2, final int n3) {
    static final int a313(final int mouseX, final int mouseY) {
        int n4 = 0;
        int c = jm_._c;
        while (go_._A.length > n4) {
            final int n5 = to_._c[n4];
            if (n5 < 0) {
                c += ag_._a;
            }
            else {
                final int a571 = og_.a571(true, go_._A[n4]);
                final int n6 = c + ci_._j;
                if (ec_.a366(n6, mj_._g + (Raider._q << 1), mouseX, (oh_._t << 1) + a571, -oh_._t + (vo_._r - (a571 >> 1)), mouseY, 100)) {
                    return n5;
                }
                c = n6 + (mj_._g + ci_._j + (Raider._q << 1));
            }
            ++n4;
        }
        return -1;
    }
    
    public static void b150(final int n) {
        if (n != 1781937827) {
            ab_._c = 85;
        }
        ab_.text_steal_gold = null;
        ab_.titles_external_game = null;
    }
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    static final int a410() {
        return kc_._U;
    }
    
    static {
        ab_.text_steal_gold = "Steal gold: ";
        ab_._c = 0;
        ab_.titles_external_game = new String[] { "Miner Disturbance", "Dr. Phlogiston Saves the Earth", "Crazy Crystals", "Hostile Spawn", "Pixelate", "Sol Knight", "Stellar Shard", "Wizard Run", "Arcanists", "Zombie Dawn" };
    }
}
