final class vc_
{
	//original name: _a
    static String tip_rot_worms;
    //original name: _b
    static String text_modifier_stat_decreased;
    static int[] _c;
    //original name: _d
    static String[] ability_tough;
    
    public static void cleanup() {
        vc_._c = null;
        vc_.ability_tough = null;
        vc_.text_modifier_stat_decreased = null;
        vc_.tip_rot_worms = null;
    }
    
    static {
        vc_.text_modifier_stat_decreased = "<%0> decreased by <%1>";
        vc_.tip_rot_worms = "<col=FF0000>Attack -1</col>";
        vc_.ability_tough = new String[] { "Toughness", "The <%0>, with the legendary resilience of his kind, is not easy to kill; what would be a mortal injury to other raiders instead just causes a permanent injury and loss of <%defence>." };
    }
}
