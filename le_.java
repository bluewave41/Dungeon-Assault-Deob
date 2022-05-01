final class le_
{
	//original name: _a
    static String text_stake;
    //original name: _d
    static Graphic piece_ork_shaman;
    //original name: _f
    static Graphic menu_moss_top_left;
    //original name: _c
    static String[] tutorial_monster3;
    //original name: _b
    static gn_[][] tutorialStrings;
    //original name: _g
    static pp_ renownTableMenuButton;
    //original name: _e
    static String ability_armoured_message;
    
    //original signature: static final boolean a398(final String s, final String s2, final int n) {
    static final boolean a398(final String s, final String s2) {
        final String a715 = jm_.lowerCaseReplaceSpaceWithUnderscore(s);
        final String a716 = jm_.lowerCaseReplaceSpaceWithUnderscore(s2);
        return (a715 == null && null == a716) || (a715 != null && a716 != null && a715.equals(a716));
    }
    
    public static void a150() {
        le_.renownTableMenuButton = null;
        le_.menu_moss_top_left = null;
        le_.ability_armoured_message = null;
        le_.tutorial_monster3 = null;
        le_.text_stake = null;
        le_.tutorialStrings = null;
        le_.piece_ork_shaman = null;
    }
    
    static {
        le_.text_stake = "<%0> of your Renown will be lost if you fail to reach the hoard room in a raid.";
        le_.ability_armoured_message = "The heavy armour of the <%0> deflects the blow!";
        le_.tutorial_monster3 = new String[] { null, "There are a number of different strategies a raider can employ against a monster, displayed in the bottom-right, below the room's statistics. For now, we'll use <%advance>.<br><br><%command>Click the shield icon - <%advance> - to begin combat.</col>" };
    }
}
