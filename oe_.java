import java.applet.*;
import java.net.*;

final class oe_ extends ne_
{
    pn_[] _s;
    //original name: _p
    static String desc_northman_ranger;
    //original name: _m
    static ph_ interface_dragon;
    byte[][][] _k;
    //original name: _i
    static int isMetaDown;
    pn_[] _o;
    int[] _n;
    int _q; //some form of index
    int[] _r;
    int _j;
    int[] _l;
    
    static final void a188(final boolean b, final Applet applet, final String s) {
        if (qg_.lowercaseOsName.startsWith("win")) {
            if (ji_.a896(s)) {
                return;
            }
        }
        try {
            applet.getAppletContext().showDocument(new URL(s), "_blank");
        }
        catch (MalformedURLException ex) {
            sm_.a741(null, 1, "MGR1: " + s);
        }
    }
    
    public static void a150() {
        oe_.interface_dragon = null;
        oe_.desc_northman_ranger = null;
    }
    
    static final void a808(final String s, final Applet applet) {
        try {
            a188(true, applet, j_.a550(new URL(applet.getCodeBase(), s), applet).toString());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    static {
        oe_.isMetaDown = 0;
        oe_.desc_northman_ranger = "Employed by the human cities to thin out the population of orcs and goblins in the wilderness, rangers have a well-rounded set of skills and are deadly with a bow.";
    }
}
