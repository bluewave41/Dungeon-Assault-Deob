//original name: di_
final class RenownTableEntry
{
	//original name: _g
    String name;
    //original signature: _h
    int bountyAmount;
    //original name: _a
    int renown;
    //original name: _c
    String lastRaidedBy;
    String _i;
    static boolean _e;
    int _f;
    int _j;
    //original name: _k
    static String create_alert_passrepeated;
    int _b;
    static int _d;
    //original name: _l
    static Graphic[] frame_bottom;
    
    //original signature: static final boolean a708(final int[] array, final int n) {
    static final boolean a708(final int[] array) {
        if (pd_._A != qa_._c) {
            return false;
        }
        while (true) {
            if (0 > pp_._J) {
                ra_._c.currentIndex = 0;
                if (!oi_.readServerData(1)) {
                    return false;
                }
                pp_._J = ra_._c.m137();
                ra_._c.currentIndex = 0;
                nj_._b = array[pp_._J];
            }
            if (!kh_.d427()) {
                return false;
            }
            wl_._f = oc_._E;
			oc_._E = rd_._C;
			rd_._C = hc_.loginStatusCode;
			hc_.loginStatusCode = pp_._J;
			pp_._J = -1;
			return true;
        }
    }
    
    final void a603(final ec_ ec_, final int n) {
        this._i = ec_.readString();
        this.name = ec_.readString();
        this.lastRaidedBy = ec_.readString();
        ec_.readString();
        this._j = rm_.getNextByte(ec_);
        rm_.getNextByte(ec_);
        rm_.getNextByte(ec_);
        this.renown = ec_.readTribyte(-102);
        this._f = ec_.readTribyte(-126);
        this.bountyAmount = ec_.readTribyte(-117);
    }
    
    public static void a423() {
        RenownTableEntry.frame_bottom = null;
        RenownTableEntry.create_alert_passrepeated = null;
    }
    
    static {
        RenownTableEntry._e = true;
        RenownTableEntry.create_alert_passrepeated = "This password contains repeated characters, and would be easy to guess";
    }
}
