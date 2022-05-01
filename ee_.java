import java.applet.*;
import netscape.javascript.*;

final class ee_
{
    static final Object a460(final Applet applet, final String s) throws Throwable {
        return JSObject.getWindow(applet).call(s, (Object[])null);
    }
    
    //original signature: static final void a946(final String s, final Applet applet) throws Throwable {
    static final void eval(final String s, final Applet applet) throws Throwable {
        JSObject.getWindow(applet).eval(s);
    }
    
    static final Object a008(final String s, final Applet applet, final int n, final Object[] array) throws Throwable {
        if (n != 15647) {
            return array[0];
        }
        return JSObject.getWindow(applet).call(s, array);
    }
}
