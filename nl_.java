import java.awt.*;

abstract class nl_
{
	//original name: _g
    static Graphic benefits_button_frame;
    static pp_ _a;
    //original name: _f
    static String[] tutorial_strategies3;
    //original name: _b
    static String[] mustlogin4;
    static md_ _e;
    //original name: _c
    static String text_please_wait;
    static int _d;
    
    public static void a423() {
        nl_.benefits_button_frame = null;
        nl_.tutorial_strategies3 = null;
        nl_.text_please_wait = null;
        nl_.mustlogin4 = null;
        nl_._a = null;
        nl_._e = null;
    }
    
    abstract void a649(final byte p0, final Component p1);
    
    static final boolean a370(final int n) {
        final int n2 = nk_._Fb[n];
        if (n2 == 18) {
            return 0 < mo_.instructionPageIndex;
        }
        if (n2 == 19) {
            return mo_.instructionPageIndex < en_.instructions_pages.length - 1;
        }
        if (n2 != 26 && 25 != n2 && n2 != 24) {
            return 27 != n2 || (6 == mo_.instructionPageIndex && kn_._e);
        }
        return 6 == mo_.instructionPageIndex;
    }
    
    abstract void a177(final boolean p0, final Component p1);
    
    abstract int a137();
    
    static {
        nl_.tutorial_strategies3 = new String[] { null, "Also, there are different strategies that can be employed in combat. All <%raiders> can either <%advance>, <%charge>, or attempt to <%flee>.<br><br><%advance> orders your raider to enter a room normally.<br><br><%col_charge>Charging</col> is a more aggressive attack: one point of the raider's <%defence> is transferred to <%attack>." };
        nl_.mustlogin4 = new String[] { null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue." };
        nl_.text_please_wait = "Please Wait";
    }
}
