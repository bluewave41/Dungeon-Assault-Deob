final class rl_
{
    static Graphic[] _d;
    //original name: _c
    static String text_hint_scout_room;
    //original name: _i
    static String[] tutorial_monster1;
    static ba_ _j;
    //original name: _a
    static String text_stable;
    //original name: _k
    static String loading_soundeffects;
    static md_ _h;
    //original name: _g
    static String[] mustlogin3;
    //original name: _e
    static String[] tutorial_raiding1;
    
    public static void a423() {
        rl_.tutorial_raiding1 = null;
        rl_.loading_soundeffects = null;
        rl_._j = null;
        rl_.text_hint_scout_room = null;
        rl_._d = null;
        rl_.text_stable = null;
        rl_.tutorial_monster1 = null;
        rl_._h = null;
        rl_.mustlogin3 = null;
    }
    
    static {
        rl_.tutorial_monster1 = new String[] { "Monster", "<%highlight>You have encountered a Monster in this room!</col> <%monsters>, such as <%lastroom>, will usually have high <%attack> and <%defence>." };
        rl_.text_stable = "My Stable";
        rl_.text_hint_scout_room = "Select an adjacent room to scout";
        rl_.loading_soundeffects = "Loading sound effects";
        rl_._j = new ba_("");
        rl_.mustlogin3 = new String[] { null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click" };
        rl_._h = new md_();
        rl_.tutorial_raiding1 = new String[] { null, "Your goal when attacking a dungeon is to reach the hoard room, and steal as much gold as you can without waking the rival dragon." };
    }
}
