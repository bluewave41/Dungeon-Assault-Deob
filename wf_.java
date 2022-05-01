abstract class wf_ extends ll_
{
	//original name: _v
    static String stone_golem;
    //original name: _y
    static String text_title_requirements_mastery_x;
    static int _x;
    static int _C;
    int _A;
    //original name: _D
    static String text_hint_sacrifice_raider;
    //original name: _z
    static String[] ability_redistribute_brief;
    //original name: _B
    static String create_displayname;
    //original name: _w
    static pp_ renownTableRaidButton;
    
    abstract boolean c427(final byte p0);
    
    abstract Object d092(final int p0);
    
    public static void d423(final byte b) {
        wf_.renownTableRaidButton = null;
        if (b != -28) {
            d423((byte)(-46));
        }
        wf_.stone_golem = null;
        wf_.create_displayname = null;
        wf_.ability_redistribute_brief = null;
        wf_.text_hint_sacrifice_raider = null;
        wf_.text_title_requirements_mastery_x = null;
    }
    
    wf_(final int a) {
        this._A = a;
    }
    
    static {
        wf_.text_title_requirements_mastery_x = "You must have charged <%0> Orbs of Mastery in total to earn the title of <%1>.";
        wf_.ability_redistribute_brief = new String[] { "Dark Arts", "Readjust <%attack>/<%defence> balance. (Single use)" };
        wf_.create_displayname = "Player Name: ";
        wf_.stone_golem = "Stone Golem";
        wf_.text_hint_sacrifice_raider = "Select a raider to sacrifice";
    }
}
