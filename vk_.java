final class vk_
{
    static int _e;
    String[] _c;
    int _d;
    boolean _a;
    String _g;
    //original name: _h
    static String create_age_tooltip;
    //original name: _b
    static String desc_daemonette;
    boolean _f;
    
    //never called
    static final b_ a353(final Throwable t, final String s) {
        b_ b_;
        if (!(t instanceof b_)) {
            b_ = new b_(t, s);
        }
        else {
            b_ = (b_)t;
            final StringBuilder sb = new StringBuilder();
            final b_ b_2 = b_;
            b_2._c = sb.append(b_2._c).append(' ').append(s).toString();
        }
        return b_;
    }
    
    static final boolean a154() {
        return 10 <= kh_._n && 13 <= dk_._c;
    }
    
    static final vk_ a041(final String o) {
        if (wd_._d == ql_._f) {
            return null;
        }
        if (wd_._d == dh_._b && o.equals(bf_._o)) {
            wd_._d = sp_._e;
            return ll_._p;
        }
        wd_._d = ql_._f;
        bf_._o = o;
        return ll_._p = null;
    }
    
    static final void a423() {
        d_._f = false;
    }
    
    public static void b423() {
        vk_.desc_daemonette = null;
        vk_.create_age_tooltip = null;
    }
    
    vk_(final boolean a) {
        this._a = a;
    }
    
    static {
        vk_.create_age_tooltip = "Type your age in years";
        vk_.desc_daemonette = "This female demon sports a manic smile and a sadistic look in her wide, wild eyes. She uses her sharp claws to rend flesh and takes pleasure in death.";
    }
}
