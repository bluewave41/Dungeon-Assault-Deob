import java.awt.*;

final class td_
{
	//original name: _b
    static String create_password_hint;
    static boolean _c;
    static String _d;
    static Font _a;
    
    public static void a150() {
        td_._a = null;
        td_.create_password_hint = null;
        td_._d = null;
    }
    
    //original signature: static final void a093(final int n, final int n2) {
    static final void a093() {
        wk_.c474();
    }
    
    //original signature: static final boolean a742(final String d, final boolean e, final boolean b, final String i, final rg_ rg_, final int g, final String m) {
    static final boolean a742(final String d, final boolean e, final String i, final RegisterScreen rg_, final int g, final String m) {
        if (ol_._i == sp_._e) {
            final jb_ jb_ = new jb_(lg_._w, rg_);
            lg_._w.a336(jb_, -1);
            if (rg_.i427()) {
                jb_.r150(102);
            }
            else {
                td_._d = d;
                mh_._b = null;
                in_._E = e;
                wk_._g = g;
                he_._m = m;
                ol_._i = ql_._f;
                ho_._i = i;
            }
            return true;
        }
        return false;
    }
    
    static {
        td_.create_password_hint = "Passwords must be between 5 and 20 letters and numbers";
        td_._c = false;
    }
}
