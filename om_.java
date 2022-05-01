import java.math.*;
import java.applet.*;

final class om_
{
    static qk_ _d;
    static int _a;
    //original name: _b
    static AmbientAudioTrack da_ambience_burning_torches_loop_4000ms;
    //original name: _c
    static BigInteger publicKeyExponent;
    //original name: _e
    static String desc_spectre;
    
    static final cd_ a059(final boolean b) {
        if (!b) {
            b154();
        }
        return new cd_(co_.e983(), f_.a427());
    }
    
    //original signature: static final boolean a595(final Applet applet, final int n) {
    //inelligible to create account
    static final boolean a595(final Applet applet) {
        if (!mm_._k) {
            try {
                final String s = "tuhstatbut";
                final String[] a640 = ih_.split(';', (String)ee_.a460(applet, "getcookies"));
                for (int n2 = 0; a640.length > n2; ++n2) {
                    final int index = a640[n2].indexOf('=');
                    if (0 <= index && a640[n2].substring(0, index).trim().equals(s)) {
                        return true;
                    }
                }
            }
            catch (Throwable t) {}
            return null != applet.getParameter("tuhstatbut");
        }
        return true;
    }
    
    public static void a150() {
        om_.publicKeyExponent = null;
        om_.desc_spectre = null;
        om_.da_ambience_burning_torches_loop_4000ms = null;
        om_._d = null;
    }
    
    static final boolean b154() {
        if (bl_.members_benefits_borders != null) {
            return true;
        }
        if (hj_._Z.a213(false, "benefits")) {
            bl_.members_benefits_borders = oh_.a825(hj_._Z, "benefits", "members_benefits_borders");
            rj_._members_benefits_prices = oh_.a825(hj_._Z, "benefits", "members_benefits_price");
            sh_.members_benefits_logo = oh_.a825(hj_._Z, "benefits", "members_benefits_logo");
            (g_.mb_da_thumbs = new Graphic[4])[0] = rc_.a324("", sb_._a, "mb_da_thumbs_01.jpg");
            g_.mb_da_thumbs[1] = rc_.a324("", sb_._a, "mb_da_thumbs_02.jpg");
            g_.mb_da_thumbs[2] = rc_.a324("", sb_._a, "mb_da_thumbs_06.jpg");
            g_.mb_da_thumbs[3] = rc_.a324("", sb_._a, "mb_da_thumbs_05.jpg");
            for (int i = g_.mb_da_thumbs.length - 1; i >= 0; --i) {
                g_.mb_da_thumbs[i].h797();
            }
            bp_.a883(bl_.members_benefits_borders, (byte)51, ba_.text_game_name);
            eg_.a987(rj_._members_benefits_prices, ne_.roman20);
            ib_.a555(g_.mb_da_thumbs);
            wa_.a238(sh_.members_benefits_logo);
            return true;
        }
        return false;
    }
    
    static {
        //om_._c = new BigInteger("94985066165976915983695808507103319846654268921925408641703409923983097369857");
        om_.publicKeyExponent = new BigInteger("65537");
    	om_.desc_spectre = "This incorporeal entity is imbued with dark magic; its glowing red eyes wait to drink in the souls of raiders.<br><br>Defeated raiders permanently lose 2 <%attack>.";
    }
}
