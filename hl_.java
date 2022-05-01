abstract class hl_
{
	//original name: _h
    static Graphic piece_goblin_cleaver;
    static lh_ _a;
    static gd_ _b;
    static volatile int _g;
    static ad_ _c;
    static int[] _e;
    //original name: _d
    static String tip_tripwire_bell;
    static int _f;
    static tl_ _i;
    //original name: _k
    static String text_search_tip;
    //original name: _j
    static String desc_hidden_nails;
    
    static final void a857(final int n, final al_ al_) {
        final wj_ b = Trap._B;
        b.storeFuzzedOpcode(n);
        b.storeByte(5);
        b.storeByte(0);
        b.storeShort(al_._k);
        b.storeByte(al_._l);
        b.storeByte(al_._p);
    }
    
    static final int a148(final CharSequence charSequence, final int n) {
        return mm_.a978(charSequence, true, n);
    }
    
    public static void a150() {
        hl_._b = null;
        hl_.tip_tripwire_bell = null;
        hl_._a = null;
        hl_._i = null;
        hl_._c = null;
        hl_._e = null;
        hl_.text_search_tip = null;
        hl_.desc_hidden_nails = null;
        hl_.piece_goblin_cleaver = null;
    }
    
    abstract void a330(final ec_ p0);
    
    abstract fd_ b743(final int p0);
    
    static final void a487() {
        lg_._w.h150(1);
        if (hg_._r == null) {
            hg_._r = new wi_(lg_._w, ub_.unreadTicketsText);
        }
        lg_._w.a336(hg_._r, -1);
    }
    
    static {
        hl_._g = 0;
        hl_._c = new ad_(0, 1);
        hl_.text_search_tip = "Enter the name of the player you wish to find in the Dragons of Renown table";
        hl_._e = new int[] { 45, 210, 490, 630, 850, 1010, 1305, 1475, 1665 };
        hl_.desc_hidden_nails = "The pit in this room may be shallow, but it's full of metal nails waiting to shred a careless raider.<br><br>Trapped raiders permanently lose 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        hl_.tip_tripwire_bell = "<%col_detect>Detect +1 to all monsters.</col>";
    }
}
