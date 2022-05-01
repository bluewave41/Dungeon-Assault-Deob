final class fp_
{
	//original name: _b
    static Graphic piece_dryhad;
    //original name: _e
    static String text_charge_minitip;
    static int[] _c;
    //original name: _a
    static String create_username_unavailable;
    //original name: _d
    static HeaderLabelText dungeonAssaultHeaderLabel;
    
    public static void a150() {
        fp_.create_username_unavailable = null;
        fp_.dungeonAssaultHeaderLabel = null;
        fp_.text_charge_minitip = null;
        fp_._c = null;
        fp_.piece_dryhad = null;
    }
    
    static final int a410() {
        bl_._r.a423((byte)62);
        if (!RaidMember._a.b427((byte)60)) {
            return bk_.a137();
        }
        return 0;
    }
    
    static {
        fp_.text_charge_minitip = "<col=8B1717>Charge</col> - <%col_attack>+1 Attack</col>, <%col_defence>-1 Defence</col>";
        fp_.create_username_unavailable = "That name is not available";
    }
}
