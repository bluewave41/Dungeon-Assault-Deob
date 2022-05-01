final class ri_
{
    private static int[] _a;
    static Graphic _g;
    //original name: _c
    static String text_raider_attacks;
    static ab_ _e;
    //original name: _d
    static Graphic[] walls;
    //original name: _b
    static int serverNum;
    static String _f;
    
    static final hh_ a754() {
        if (null == ne_._b) {
            ne_._b = new hh_(ta_._e, 20, 0, 0, 0, 11579568, -1, 0, 0, ta_._e._H, -1, Integer.MAX_VALUE, true);
        }
        return ne_._b;
    }
    
    static final void a392(final String s, final String[] array, final int n) {
        wd_._d = dh_._b;
        if (n != 255) {
            if (n >= 100 && n <= 105) {
                ok_.a009(array);
                ll_._p = em_.a953(array);
            }
            else {
                ll_._p = DungeonBuilder.a853(n, s);
            }
        }
        else {
            ll_._p = l_.a307(wk_._g < 13);
            ok_.a009(null);
        }
    }
    
    public static void a150() {
        ri_._f = null;
        ri_._a = null;
        ri_.walls = null;
        ri_._g = null;
        ri_._e = null;
        ri_.text_raider_attacks = null;
    }
    
    static final void a900(final String s, final int n) {
        jn_._c = true;
        ip_._j = s.trim();
        oh_._s = 10;
        if (n >= -64) {
            a034((byte)(-116), null);
        }
        jm_.a150(-17573);
    }
    
    //never called
    static final int a034(final byte b, final CharSequence charSequence) {
        if (b <= 10) {
            a900(null, 93);
        }
        return mm_.a978(charSequence, true, 10);
    }
    
    //this could be cleaned up
    static {
        ri_.text_raider_attacks = "Raider attacks.";
        ri_._a = new int[8];
        final int[] a = ri_._a;
        a[0] = mp_.or(a[0], 67108864);
        final int[] a2 = ri_._a;
        a2[0] = mp_.or(a2[0], 134217728);
        final int[] a3 = ri_._a;
        a3[1] = mp_.or(a3[1], 4);
        final int[] a4 = ri_._a;
        a4[1] = mp_.or(a4[1], 16);
        final int[] a5 = ri_._a;
        a5[1] = mp_.or(a5[1], 32);
        final int[] a6 = ri_._a;
        a6[1] = mp_.or(a6[1], 128);
        final int[] a7 = ri_._a;
        a7[1] = mp_.or(a7[1], 256);
        final int[] a8 = ri_._a;
        a8[1] = mp_.or(a8[1], 512);
        ri_._e = new ab_();
    }
}
