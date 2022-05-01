import java.net.*;
import java.io.*;

abstract class um_
{
    static int _h;
    //original name: _c
    static String text_hoardroom_hint;
    //original name: _i
    static RaidMember[] stableMembers;
    //original name: _f
    int port;
    //original name: _d
    static String no;
    //original name: _e
    static String desc_pit;
    //original name: _a
    String hostName;
    static rh_ _g;
    //original name: _b
    static String[] ability_circumvent_brief;
    
    //original signature: final Socket a693(final int n) throws IOException {
    final Socket getNewSocket() throws IOException {
        return new Socket(this.hostName, this.port);
    }
    
    static final void a430(final int d) {
        ql_._d = d;
        if (null != ob_._Xb) {
            ob_._Xb.c093(d, 24509);
        }
        if (ek_._b != null) {
            ek_._b.a093(d, 256);
        }
    }
    
    abstract Socket b693(final int p0) throws IOException;
    
    public static void a487() {
        um_.no = null;
        um_.desc_pit = null;
        um_._g = null;
        um_.stableMembers = null;
        um_.ability_circumvent_brief = null;
        um_.text_hoardroom_hint = null;
    }
    
    static {
        um_.desc_pit = "The pit in this room prevents raiders from easily crossing it.";
        um_.no = "No";
        um_.text_hoardroom_hint = "Risk of waking dragon is 10% + proportion of gold taken.";
        um_.ability_circumvent_brief = new String[] { "Circumvent", "Defeat any room. (Single use)" };
    }
}
