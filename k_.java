import java.text.*;
import java.util.*;

final class k_
{
    static ef_ _e;
    //original name: _f
    static AmbientAudioTrack da_ambience_running_water_loop_1000ms;
    k_ _d;
    String _g;
    static Animation _c;
    String _i;
    //original name: _b
    static String selectedRenownTableEntry;
    static c_ _h;
    //original name: _a
    static String[] tutorial_stable3;
    
    k_(final String g, final String i, final k_ d) {
        this._g = g;
        this._d = d;
        this._i = i;
    }
    
    static final String a460(final byte b, final int n, final int n2, final int n3) {
        if (b != -122) {
            a460((byte)65, -82, -76, 109);
        }
        return DateFormat.getDateTimeInstance(n2, n).format(new Date(60000L * (n3 + 16912800L)));
    }
    
    public static void a487() {
        k_.da_ambience_running_water_loop_1000ms = null;
        k_.tutorial_stable3 = null;
        k_._h = null;
        k_._c = null;
        k_._e = null;
        k_.selectedRenownTableEntry = null;
    }
    
    static {
        k_._e = new ef_();
        k_.tutorial_stable3 = new String[] { null, "Remember that you will need a varied set of raiders: some with good <%sneak> and <%dodge> levels to handle <%traps>, and some with good <%attack> and <%defence> levels to deal with <%monsters>.<br><br><%command>Recruit a party of raiders, then save your stable and exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>" };
    }
}
