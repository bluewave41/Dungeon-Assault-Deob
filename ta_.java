final class ta_
{
    static ec_ _c;
    static Graphic _b;
    static ab_ _d;
    //original name: _h
    static String desc_dwarf_renegade;
    //original name: _g
    static String text_hint_sacrifice_greenskin;
    static se_ _e;
    static jk_ _a;
    static md_ _f;
    
    static final String a319(final se_ se_, final int n, final int n2, final String s, final int n3) {
        if (n3 <= 103) {
            return null;
        }
        return ia_.a282(n2, se_, pj_.a022(n, s));
    }
    
    public static void a150() {
        ta_._d = null;
        ta_._a = null;
        ta_._c = null;
        ta_._e = null;
        ta_.desc_dwarf_renegade = null;
        ta_._f = null;
        ta_._b = null;
        ta_.text_hint_sacrifice_greenskin = null;
    }
    
    static final void a268(final byte b, final int n, final kj_ kj_) {
        if (b != 11) {
            a319(null, -96, -112, null, -121);
        }
        final wj_ b2 = Trap._B;
        b2.storeFuzzedOpcode(n);
        b2.storeByte(2);
        b2.storeByte(0);
        b2.storeByte(kj_._j);
    }
    
    static final void b150() {
        final wj_ b = Trap._B;
        while (mo_.b154()) {
            b.storeFuzzedOpcode(8);
            final int n = ++b.currentIndex;
            ed_.a707(false, b);
            Trap._B.c093(b.currentIndex - n, -1);
        }
    }
    
    static {
        ta_._c = new ec_(256);
        ta_.desc_dwarf_renegade = "After a string of unfortunate accidents led to his exile from the mountain home of the dwarves, the dwarven renegade seeks somewhere else to indulge his passion for explosives.";
        ta_.text_hint_sacrifice_greenskin = "Select an orc or goblin to sacrifice";
        ta_._d = new ab_();
        ta_._f = new md_();
    }
}
