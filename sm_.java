import java.net.*;
import java.io.*;
import java.applet.*;

final class sm_
{
	//original name: _f
    static String create_alert_invalidage;
    //original name: _e
    static String text_woke_dragon;
    static Graphic _g;
    int _d;
    //original name: _b
    static String desc_hell_beast;
    //original name: _a
    static String hidden_darts;
    static int _c;
    
    static final void a741(final Throwable t, final int n, final String s) {
        try {
            String s2 = "";
            if (null != t) {
                s2 = hc_.a505(t);
            }
            if (null != s) {
                if (t != null) {
                    s2 += " | ";
                }
                s2 += s;
            }
            sn_.a984(s2);
            final String a793 = eg_.a793(eg_.a793(eg_.a793(eg_.a793(s2, ":", "%3a", true), "@", "%40", true), "&", "%26", true), "#", "%23", true);
            if (null == ci_._q) {
                return;
            }
            final pn_ a794 = kf_._o.a734(new URL(ci_._q.getCodeBase(), "clienterror.ws?c=" + wj_.crc + "&u=" + ((pe_._o == null) ? ("" + ne_._g) : pe_._o) + "&v1=" + qg_.javaVendor + "&v2=" + qg_.javaVersion + "&e=" + a793));
            while (a794._c == 0) {
                pj_.a054(0, 1L);
            }
            if (1 == a794._c) {
                final DataInputStream dataInputStream = (DataInputStream)a794._f;
                dataInputStream.read();
                dataInputStream.close();
            }
        }
        catch (Exception ex) {}
    }
    
    static final boolean a988(final String s) {
        return null == s || s.length() < 5 || s.length() > 20;
    }
    
    public static void a423(final byte b) {
        sm_.hidden_darts = null;
        sm_.text_woke_dragon = null;
        if (b != -118) {
            a423((byte)34);
        }
        sm_.desc_hell_beast = null;
        sm_._g = null;
        sm_.create_alert_invalidage = null;
    }
    
    static final void a715(final Applet applet, final String b) {
        pa_._b = b;
        try {
            String s = applet.getParameter("cookieprefix") + "session=" + b + "; version=1; path=/; domain=" + applet.getParameter("cookiehost");
            if (b.length() == 0) {
                s += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            }
            ee_.eval("document.cookie=\"" + s + "\"", applet);
        }
        catch (Throwable t) {}
        lm_.a812((byte)(-106), applet);
    }
    
    static {
        sm_.create_alert_invalidage = "Please enter your age in years";
        sm_.hidden_darts = "Hidden Darts";
        sm_.desc_hell_beast = "A very large, wolf-like creature with burning red eyes.";
        sm_.text_woke_dragon = "You woke the sleeping dragon!";
    }
}
