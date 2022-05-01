import java.applet.*;
import java.net.*;

final class pa_
{
    static String _b;
    static rj_ _c;
    static Graphic _a;
    
    static final void a587(final int n, final Applet applet) {
        try {
            final URL url = new URL(applet.getCodeBase(), "toserverlist.ws");
            if (n <= 64) {
                return;
            }
            applet.getAppletContext().showDocument(j_.a550(url, applet), "_top");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void a150() {
        pa_._b = null;
        pa_._c = null;
        pa_._a = null;
    }
    
    static final q_ a872(final nh_ nh_, final String s, final String s2) {
        final int a913 = nh_.a913(s, 1000);
        return fl_.a549(-1, nh_, nh_.a026(0, s2, a913), a913);
    }
}
