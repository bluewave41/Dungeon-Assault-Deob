final class am_
{
    static int _e;
    static gd_ _f;
    static int _d;
    static int _c;
    static int _g;
    //original name: _a
    static Graphic menu_chain_frame;
    static ad_ _b;
    
    static final void b150() {}
    
    public static void a150() {
        am_.menu_chain_frame = null;
        am_._f = null;
        am_._b = null;
    }
    
    static final StringBuilder a541(final StringBuilder sb, final char c, final int i) {
        final int length = sb.length();
        sb.setLength(i);
        for (int n = length; i > n; ++n) {
            sb.setCharAt(n, c);
        }
        return sb;
    }
    
    static {
        mc_.b093(50, 150);
        am_._b = new ad_(1, 0);
    }
}
