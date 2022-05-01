final class gm_
{
	//original name: _a
    static String fatal_trap;
    //original name: _e
    static String tip_nails;
    static int _c;
    static String _b;
    //original name: _d
    static PlayerInformation playerInformation;
    
    static final byte[] a728(final String s, final boolean b) {
        if (b) {
            a728(null, true);
        }
        return d_._d.a826("", s);
    }
    
    public static void a150() {
        gm_.fatal_trap = null;
        gm_.tip_nails = null;
        gm_._b = null;
        gm_.playerInformation = null;
    }
    
    static {
        gm_.fatal_trap = "This trap is lethal.";
        gm_.tip_nails = "<col=FF0000>Defence -1</col>";
    }
}
