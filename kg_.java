/*
 * Decompiled with CFR 0.151.
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class kg_
extends Applet
implements Runnable,
FocusListener,
WindowListener {
	//original name: _d
    static long time;
    boolean _i = false;
    //original name: _a
    static Graphic small_button;
    static nh_ _b;
    //original name: _e
    static String[] tutorial_end_justplay;
    static int _f;
    //original name: _m
    static String text_dead;
    //original name: _k
    static String text_disarm_guardian_tooltip;
    public static boolean _j;
    public static boolean _g;
    public static int _h;
    public static int _n;
    public static boolean _c;
    public static boolean _o;
    public static int _l;

    @Override
    public final void windowClosing(WindowEvent windowEvent) {
        this.destroy();
    }

    //original signature: final boolean b154(int n) {
    final boolean checkHost() {
        String string = this.getDocumentBase().getHost().toLowerCase();
        if(string.length() != 0) { //patch checkhost method
        	return true;
        }
        if (string.equals("jagex.com") || string.endsWith(".jagex.com")) {
            return true;
        }
        if (string.equals("funorb.com") || string.endsWith(".funorb.com")) {
            return true;
        }
        if (string.endsWith("127.0.0.1")) {
            return true;
        }
        while (string.length() > 0 && '0' <= string.charAt(string.length() - 1) && '9' >= string.charAt(string.length() - 1)) {
            string = string.substring(0, string.length() - 1);
        }
        if (string.endsWith("192.168.1.")) {
            return true;
        }
        this.throwErrror("invalidhost");
        return false;
    }

    @Override
    public final void windowDeiconified(WindowEvent windowEvent) {
    }

    abstract void c487(boolean var1);

    abstract void b487(boolean var1);

    @Override
    public final URL getCodeBase() {
        if (ad_.frame != null) {
            return null;
        }
        if (rc_.applet != null && rc_.applet != this) {
            return rc_.applet.getCodeBase();
        }
        return super.getCodeBase();
    }

    @Override
    public final void stop() {
        if (ba_._c != this || cc_._c) {
            return;
        }
        nj_._e = 4000L + kd_.getTime();
    }

    @Override
    public final void update(Graphics graphics) {
        this.paint(graphics);
    }

    @Override
    public abstract void init();

    @Override
    public final void destroy() {
        if (ba_._c != this || cc_._c) {
            return;
        }
        nj_._e = kd_.getTime();
        pj_.a054(0, 5000L);
        kf_._o = null;
        this.shutdown(false);
    }

    @Override
    public final void run() {
        block16: {
            try {
                int n;
                Object object;
                Object object2;
                if (qg_.javaVendor != null && (((String)(object2 = qg_.javaVendor.toLowerCase())).indexOf("sun") != -1 || ((String)object2).indexOf("apple") != -1)) {
                    object = qg_.javaVersion;
                    if (((String)object).equals("1.1") || ((String)object).startsWith("1.1.") || ((String)object).equals("1.2") || ((String)object).startsWith("1.2.") || ((String)object).equals("1.3") || ((String)object).startsWith("1.3.") || ((String)object).equals("1.4") || ((String)object).startsWith("1.4.") || ((String)object).equals("1.5") || ((String)object).startsWith("1.5.") || ((String)object).equals("1.6.0")) {
                        this.throwErrror("wrongjava");
                        break block16;
                    }
                    if (((String)object).startsWith("1.6.0_")) {
                        for (n = 6; n < ((String)object).length() && qm_.a331(57, ((String)object).charAt(n)); ++n) {
                        }
                        String string = ((String)object).substring(6, n);
                        if (sj_.a454(string) && 10 > mm_.a978(string, true, 10)) {
                            this.throwErrror("wrongjava");
                            break block16;
                        }
                    }
                }
                if (qg_.javaVersion != null && qg_.javaVersion.startsWith("1.")) {
                    int n2 = 0;
                    for (int i = 2; i < qg_.javaVersion.length() && 48 <= (n = qg_.javaVersion.charAt(i)) && n <= 57; ++i) {
                        n2 = n2 * 10 + (n - 48);
                    }
                    if (5 <= n2) {
                        ia_._O = true;
                    }
                }
                object2 = ba_._c;
                if (null != rc_.applet) {
                    object2 = rc_.applet;
                }
                if ((object = qg_._g) != null) {
                    try {
                        ((Method)object).invoke(object2, Boolean.TRUE);
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                eg_.b150(116);
                this.d423((byte)114);
                k_._h = bn_.a788(c_.canvas, up_.componentWidth, eg_.componentHeight);
                this.a423((byte)-80);
                o_._o = fd_.b653();
                while (0L == nj_._e || nj_._e > kd_.getTime()) { //main drawing loop
                    nk_._Kb = o_._o.a871(hk_._e, -108);
                    for (int i = 0; i < nk_._Kb; ++i) {
                        this.c150();
                    }
                    this.c423();
                    ho_.handleEventQueue(i_._A, c_.canvas);
                }
            }
            catch (Throwable throwable) {
                sm_.a741(throwable, 1, null);
                this.throwErrror("crash");
            }
        }
        this.shutdown(true);
    }

    public static final void provideLoaderApplet(Applet applet) {
        rc_.applet = applet;
    }

    @Override
    public final void windowIconified(WindowEvent windowEvent) {
    }
    //original signature: final void a407(byte by, String string) {
    final void throwErrror(String errorMessage) {
        if (this._i) {
            return;
        }
        this._i = true;
        System.out.println("error_game_" + errorMessage);
        try {
            ee_.a460(m_.getApplet(), "loggedout");
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + errorMessage + ".ws"), "_top");
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public final void focusLost(FocusEvent focusEvent) {
        rn_.isWindowInFocus = false;
    }

    @Override
    public final void windowOpened(WindowEvent windowEvent) {
    }

    @Override
    public final AppletContext getAppletContext() {
        if (null != ad_.frame) {
            return null;
        }
        if (rc_.applet != null && rc_.applet != this) {
            return rc_.applet.getAppletContext();
        }
        return super.getAppletContext();
    }

    final synchronized void d423(byte by) {
        if (c_.canvas != null) {
            c_.canvas.removeFocusListener(this);
            c_.canvas.getParent().setBackground(Color.black);
            c_.canvas.getParent().remove(c_.canvas);
        }
        Container container = null != hh_.frame ? hh_.frame : (ad_.frame != null ? ad_.frame : (rc_.applet != null ? rc_.applet : ba_._c));
        container.setLayout(null);
        c_.canvas = new ql_(this);
        container.add(c_.canvas);
        c_.canvas.setSize(up_.componentWidth, eg_.componentHeight);
        c_.canvas.setVisible(true);
        if (ad_.frame == container) {
            Insets insets = ad_.frame.getInsets();
            c_.canvas.setLocation(aj_.componentX + insets.left, GUICheckbox.componentY + insets.top);
        } else {
            c_.canvas.setLocation(aj_.componentX, GUICheckbox.componentY);
        }
        c_.canvas.addFocusListener(this);
        c_.canvas.requestFocus();
        rj_.isWindowInFocus = true;
        rn_.isWindowInFocus = true;
        im_._d = true;
        ve_._a = false;
        if (by < 111) {
            return;
        }
        pj_.time = kd_.getTime();
    }

    abstract void a150(int var1);

    @Override
    public final void start() {
        if (this != ba_._c || cc_._c) {
            return;
        }
        nj_._e = 0L;
    }

    @Override
    public final synchronized void paint(Graphics graphics) {
        Rectangle rectangle;
        if (ba_._c != this || cc_._c) {
            return;
        }
        im_._d = true;
        if (ia_._O && -pj_.time + kd_.getTime() > 1000L && ((rectangle = graphics.getClipBounds()) == null || rectangle.width >= sf_._h && rectangle.height >= sl_._d)) {
            ve_._a = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    //original signature: private final void c150(int n) {
    private final void c150() {
        long time = kd_.getTime();
        long l2 = jf_.times[jl_._d];
        jf_.times[jl_._d] = time;
        if (0L == l2 || l2 < time) {
            // empty if block
        }
        jl_._d = 1 + jl_._d & 0x1F;
        kg_ kg_2 = this;
        synchronized (kg_2) {
            rj_.isWindowInFocus = rn_.isWindowInFocus;
        }
        this.a150(-100);
    }

    abstract void b423(byte var1);

    @Override
    public final void focusGained(FocusEvent focusEvent) {
        rn_.isWindowInFocus = true;
        im_._d = true;
    }

    @Override
    public final void windowActivated(WindowEvent windowEvent) {
    }

    @Override
    public final void windowClosed(WindowEvent windowEvent) {
    }

    @Override
    public final String getParameter(String string) {
        if (null != ad_.frame) {
            return null;
        }
        if (null != rc_.applet && rc_.applet != this) {
            return rc_.applet.getParameter(string);
        }
        return super.getParameter(string);
    }

    //original signature: private final void c423(byte by) {
    private final void c423() {
        long time = kd_.getTime();
        long l2 = id_.times[np_._K];
        id_.times[np_._K] = time;
        if (l2 != 0L && time > l2) {
            int n = (int)(time - l2);
            bc_._a = (32000 + (n >> 1)) / n;
        }
        np_._K = 0x1F & np_._K + 1;
        if (sb_._b++ > 50) {
            im_._d = true;
            sb_._b -= 50;
            c_.canvas.setSize(up_.componentWidth, eg_.componentHeight);
            c_.canvas.setVisible(true);
            if (null != ad_.frame && null == hh_.frame) {
                Insets insets = ad_.frame.getInsets();
                c_.canvas.setLocation(insets.left + aj_.componentX, GUICheckbox.componentY + insets.top); //window offsets?
            } else {
                c_.canvas.setLocation(aj_.componentX, GUICheckbox.componentY);
            }
        }
        this.b423((byte)38);
    }

    protected kg_() {
    }

    @Override
    public final void windowDeactivated(WindowEvent windowEvent) {
    }

    abstract void a423(byte var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    //original signature: private final void a893(byte by, boolean bl) {
    private final void shutdown(boolean bl) {
        kg_ kg_2 = this;
        synchronized (kg_2) {
            if (cc_._c) {
                return;
            }
            cc_._c = true;
        }
        if (null != rc_.applet) {
            rc_.applet.destroy();
        }
        try {
            this.c487(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (c_.canvas != null) {
            try {
                c_.canvas.removeFocusListener(this);
                c_.canvas.getParent().remove(c_.canvas);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (i_._A != null) {
            try {
                i_._A.a423();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.b487(false);
        if (ad_.frame != null) {
            try {
                System.exit(0);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        System.out.println("Shutdown complete - clean:" + bl);
    }

    public static void a487() {
        small_button = null;
        tutorial_end_justplay = null;
        _b = null;
        text_disarm_guardian_tooltip = null;
        text_dead = null;
    }

    @Override
    public final URL getDocumentBase() {
        if (null != ad_.frame) {
            return null;
        }
        if (null != rc_.applet && rc_.applet != this) {
            return rc_.applet.getDocumentBase();
        }
        return super.getDocumentBase();
    }

    //original signature: final void a248(int n, byte by, String string, int n2, int n3, int n4, int n5) {
    final void a248(int crc) {
        try {
            if (null != ba_._c) {
                if (3 <= ++ql_._b) {
                    this.throwErrror("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            sl_._d = eg_.componentHeight = 480;
            GUICheckbox.componentY = 0;
            sf_._h = up_.componentWidth = 640;
            wj_.crc = crc;
            ba_._c = this;
            aj_.componentX = 0;
            ci_._q = m_.getApplet();
            kf_._o = i_._A = new qg_();
            pn_ pn_2 = i_._A.a508(1, this);
            while (pn_2._c == 0) {
                pj_.a054(0, 10L);
            }
        }
        catch (Throwable throwable) {
            sm_.a741(throwable, 1, null);
            this.throwErrror("crash");
        }
    }

    static {
        tutorial_end_justplay = new String[]{"Dragons of Renown", "<%highlight>You've reached the end of the Just Play tutorial. To continue, and battle in the realm of Dungaria, please log in or create an account.<br><br><%command>Exit this page and return to the main menu."};
        text_disarm_guardian_tooltip = "Order your raider to disarm the guardian. <br><br>If the raider is detected by the guardian, nearby monsters will be alerted.<br><br>Requires: <col=21634A>Dodge</col>, <col=00A7D2>Sneak</col>";
        text_dead = "Dead";
    }
}

