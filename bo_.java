final class bo_ extends ok_
{
	//original name: _Lb
    static Animation dragonEyeOpen;
    String _Nb;
    //original name: _Mb
    static String zealot;
    String _Hb;
    //original name: _Kb
    static Graphic scrollbar_top;
    static DungeonPath _Jb;
    int _Ib;
    //original name: _Gb
    static String[] ability_boostdef;
    
    static final void a286(final int n, final gn_ gn_, final int n2, final int n3) {
        if (gn_ != null) {
            int n4 = n2;
            if (null != gn_._b) {
                ne_.roman20.a385(gn_._b, n3 + 3, n4, 194, 0, 0, -1, 1, 0, ne_.roman20._H);
                n4 += gn_._g;
                n4 += 7;
                gf_.b115(n3, n4, 200, 0);
                n4 += 5;
            }
            final String[] a782 = jn_.a782(gn_._f, new int[] { 194 }, -65, la_.roman12);
            int n5 = n4 + (n + la_.roman12._H);
            final String[] array = a782;
            for (int i = 0; i < array.length; ++i) {
                la_.roman12.b191(array[i], n3 + 3, n5, 0, -1);
                n5 += la_.roman12._H;
            }
        }
    }
    
    bo_() {
        super(0L, null);
    }
    
    static final void h150() {
        if (ec_._k != null) {
            ec_.a302(ec_._k, false);
            ec_._k = null;
            nf_.d150(0);
        }
        id_._i = mk_.a923(3);
        mi_._e = mk_.a923(4);
        hj_._Z = bg_.a707(true, 9);
        np_._A = mk_.a923(10);
        kf_._p = bg_.a707(true, 11);
        sb_._a = bg_.a707(true, 12);
        ia_._W = mk_.a923(13);
        ll_._r = mk_.a923(14);
        tl_._k = mk_.a923(15);
        bl_._t = mk_.a923(16);
        (be_._s = new wk_()).a971(sa_.loading_graphics, "basic", qk_.waitingfor_graphics, uc_._I);
        be_._s.a971(sa_.loading_graphics, "lobby", qk_.waitingfor_graphics, uc_._I);
        be_._s.a971(sa_.loading_graphics, "lobby", qk_.waitingfor_graphics, gh_._c);
        be_._s.a539(qk_.waitingfor_graphics, sa_.loading_graphics, hj_._Z);
        be_._s.a539(qk_.waitingfor_graphics, sa_.loading_graphics, sb_._a);
        be_._s.a539(uc_.waitingfor_animations, nb_.loading_animations, kf_._p);
        be_._s.a971(mp_.loading_fonts, "roman20", rf_.waitingfor_fonts, uc_._I);
        be_._s.a971(mp_.loading_fonts, "roman20", rf_.waitingfor_fonts, gh_._c);
        be_._s.a971(mp_.loading_fonts, "roman12", rf_.waitingfor_fonts, uc_._I);
        be_._s.a971(mp_.loading_fonts, "roman12", rf_.waitingfor_fonts, gh_._c);
        be_._s.a539(rf_.waitingfor_fonts, mp_.loading_fonts, np_._A);
        be_._s.a539(wo_.waitingfor_soundeffects, rl_.loading_soundeffects, ia_._W);
        be_._s.a539(wo_.waitingfor_soundeffects, rl_.loading_soundeffects, ll_._r);
        be_._s.a539(id_.waitingfor_music, dg_.loading_music, tl_._k);
        be_._s.a539(id_.waitingfor_music, dg_.loading_music, bl_._t);
        be_._s.a539(fg_.waitingfor_extradata, kj_.loading_extradata, id_._i);
        be_._s.a539(fg_.waitingfor_extradata, kj_.loading_extradata, mi_._e);
    }
    
    public static void c423() {
        bo_.dragonEyeOpen = null;
        bo_.zealot = null;
        bo_.scrollbar_top = null;
        bo_.ability_boostdef = null;
        bo_._Jb = null;
    }
    
    static final void g150() {
        mc_.a934(8, gb_._e);
        if (!ve_.a491()) {
            mc_.a934(1, in_._B);
        }
    }
    
    static {
        bo_.zealot = "Zealot";
        bo_.ability_boostdef = new String[] { "Harden Raider", "The <%0> imbues another raider with the resilience of oak, doubling their <%defence> in the next room. (Single use)" };
    }
}
