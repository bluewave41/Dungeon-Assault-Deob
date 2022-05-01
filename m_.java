import java.applet.*;

abstract class m_ implements dp_
{
    static md_ _a;
    private long _b;
    //original name: _f
    static String create_unable;
    static ad_ _d;
    static en_ _e;
    //original name: _g
    static String ok;
    //original name: _c
    static Graphic piece_thief;
    
    @Override
    public final String a791(final boolean b) {
        if (this.a154(96)) {
            return null;
        }
        if (!b) {
            this._b = 122L;
        }
        if (350L + this._b <= kd_.getTime()) {
            return this.c738(63);
        }
        return null;
    }
    
    static final void a430(final int n, final boolean b) {
        bl_._c = 0;
        if (n < 82) {
            m_._d = null;
        }
        me_._f = 0;
        wf_._x = am_._g;
        jc_._e = 0;
        (o_._i = new ae_(2)).a691(b, -1, f_.a313(hj_.mouseX, Animation.mouseY));
    }
    
    @Override
    public final od_ a151(final byte b) {
        if (this.a154(-51)) {
            return hd_._g;
        }
        if (350L + this._b <= kd_.getTime()) {
            if (b > -91) {
                getApplet();
            }
            return this.b527(false);
        }
        return ub_._s;
    }
    
    public static void d150(final int n) {
        m_._a = null;
        if (n != -1) {
            m_._a = null;
        }
        m_.ok = null;
        m_._d = null;
        m_.create_unable = null;
        m_.piece_thief = null;
        m_._e = null;
    }
    
    @Override
    public final void b150(final int n) {
        this._b = kd_.getTime();
        if (n != 2899) {
            d150(6);
        }
    }
    
    static final void b423() {
        if (224 > oo_._d) {
            sf_.d093(-(oo_._d % 32) + (32 + oo_._d));
        }
        else {
            sf_.d093(256);
        }
    }
    
    abstract String c738(final int p0);
    
    //original signature: static final Applet c372(final boolean b) {
    static final Applet getApplet() {
        if (null != rc_.applet) {
            return rc_.applet;
        }
        return ba_._c;
    }
    
    abstract od_ b527(final boolean p0);
    
    static {
        m_._a = new md_();
        m_.create_unable = "Unfortunately we are unable to create an account for you at this time.";
        m_.ok = "OK";
        m_._d = new ad_(4, 1);
    }
}
