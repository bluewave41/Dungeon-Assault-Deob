final class fb_
{
	//original name: _d
    static RenownTableEntry[] renownTableEntries;
    //original name: _b
    static String saurus_slink;
    static long _c;
    static q_ _f;
    //original name: _e
    static String tip_hidden_darts;
    //original name: _g
    static String ticketing_oneunread;
    //original name: _a
    static String DEFAULT_PLAYER_NAME;
    
    //never called
    static final mb_ b135() {
        return wa_._j;
    }
    
    static final Boolean a252() {
        final Boolean e = fj_._e;
        fj_._e = null;
        return e;
    }
    
    public static void a150() {
        fb_.DEFAULT_PLAYER_NAME = null;
        fb_._f = null;
        fb_.renownTableEntries = null;
        fb_.saurus_slink = null;
        fb_.ticketing_oneunread = null;
        fb_.tip_hidden_darts = null;
    }
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    static {
        fb_.saurus_slink = "Saurus Slink";
        fb_.tip_hidden_darts = "<col=FF0000>Lethal</col>, if raider fails a defence roll.";
        fb_.DEFAULT_PLAYER_NAME = "Player";
        fb_.ticketing_oneunread = "You have 1 unread message!";
    }
}
