final class qk_
{
	//original name: _b
    static String[] text_benefits;
    private Graphic[] _a;
    //original name: _c
    static String waitingfor_graphics;
    static boolean[] _e;
    //original name: _d
    static String text_attack;
    
    final void a050(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n4 != 112) {
            qk_._e = null;
        }
        sn_.a311(-87, n2, this._a, n5, n, n3);
    }
    
    public static void a423() {
        qk_._e = null;
        qk_.text_attack = null;
        qk_.text_benefits = null;
        qk_.waitingfor_graphics = null;
    }
    
    qk_(final Graphic[] a) {
        this._a = a;
    }
    
    static {
        qk_.waitingfor_graphics = "Waiting for graphics";
        qk_._e = new boolean[112];
        qk_.text_benefits = new String[] { "More raiders...", "...more defenders...", "...wreak havock on your enemies...", "...and send your friends running." };
        qk_.text_attack = "Attack";
    }
}
