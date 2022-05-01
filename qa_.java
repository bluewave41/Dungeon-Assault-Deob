abstract class qa_
{
	//original name: _d
    static String text_flee_coloured;
    static ef_ _c;
    static int[][] _a;
    //original name: _e
    static String[] tutorial_abilities;
    //original name: _b
    static String ticketing_gotowebsite;
    
    abstract byte[] a104(final int p0, final int p1);
    
    abstract int b080(final int p0, final int p1);
    
    static final q_[] a466(final String s, final String s2, final nh_ nh_) {
        final int a913 = nh_.a913(s2, 1000);
        return rf_.a007(nh_.a026(0, s, a913), (byte)(-71), nh_, a913);
    }
    
    abstract tm_ a010(final int p0);
    
    public static void b150() {
        qa_.text_flee_coloured = null;
        qa_._a = null;
        qa_.ticketing_gotowebsite = null;
        qa_._c = null;
        qa_.tutorial_abilities = null;
    }
    
    static {
        qa_.text_flee_coloured = "<col=8B8B2E>Flee</col>";
        qa_._c = new ef_();
        qa_.ticketing_gotowebsite = "Visit the Account Management section on the main site to view.";
        qa_.tutorial_abilities = new String[] { "Special Abilities", "Some raiders, such as <%raidertype> possess a <%col_useskill>special ability</col>. You can find out what they are by reviewing the raider's description. When the raider's portrait in the party display is surrounded by a <%highlight>blue glow</col>, the ability is ready to use.<br><br><%command>Click the blue star symbol</col> at the bottom-right of the screen to employ it. Most abilities can only be used at specific times, and most can only be used once per raid.</col>" };
    }
}
