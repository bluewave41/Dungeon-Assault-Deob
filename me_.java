final class me_
{
	//original name: _g
    static Room[] dungeonLayout;
    private boolean _b;
    private String _d;
    private boolean _h;
    //original name: _e
    static String login_email;
    static int _f;
    //original name: _c
    static String returntogame;
    //original name: _a
    static String create_alert_namechars;
    
    //original signature: final boolean a427(final byte b) {
    final boolean getB() {
        return this._b;
    }
    
    public static void a150(final int n) {
        if (n != 36) {
            a150(95);
        }
        me_.login_email = null;
        me_.dungeonLayout = null;
        me_.create_alert_namechars = null;
        me_.returntogame = null;
    }
    
    static final void a652(final int n, final int n2, final byte b, final int n3) {
        if (a_._o.a370(n3) && !al_.dungeonPath.a370(n2)) {
            jb_._Sb[n2] = n;
            al_.dungeonPath.a093(n2);
            if (b <= 65) {
                me_.create_alert_namechars = null;
            }
            hf_._ob.a865(new a_(n2));
        }
    }
    
    //original signature: final boolean b154(final int n) {
    final boolean getH() {
        return this._h;
    }
    
    //original signature: final void a877(final boolean b, final boolean b2) {
    final void a877(final boolean b) {
        this._h = true;
        this._b = b;
    }
    
    me_(final String d) {
        this._h = false;
        this._b = false;
        this._d = d;
    }
    
    static final Graphic a028(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = gl_.topDownOrIsometric ? 36 : 32;
        if (n != 32) {
            return null;
        }
        final Graphic cn_ = new Graphic(n6, n6);
        jh_.a303(cn_);
        gf_.b050(n4, n3, -n4 - (n2 - n6), -n3 + (-n5 + n6), 16777215);
        jh_.b797();
        return cn_;
    }
    
    //original signature: final String c738(final int n) {
    final String c738() {
        return this._d;
    }
    
    static {
        me_.login_email = "Email: ";
        me_.returntogame = "Return to game";
        me_.create_alert_namechars = "Names can only contain letters, numbers, spaces and underscores";
    }
}
