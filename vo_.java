final class vo_ extends ip_
{
	//original name: _m
    static String text_useskill;
    //original name: _q
    static String login_no_displayname;
    private rm_ _n;
    //original name: _o
    static String text_disarm_trap_minitip;
    static int _r;
    private rm_ _p;
    
    static final void a050(final int n, final int n2, final int n3, final int n4) {
        je_.a749(n, n2, bf_.smoke, n4, n3);
        int n5 = n4 + gf_._i * n2;
        final int n6 = -n3 + gf_._i;
        for (int n7 = -n; 0 > n7; ++n7) {
            for (int i = -n3; i < 0; ++i) {
                gf_._b[n5] = mp_.or(gf_._b[n5], Integer.MIN_VALUE);
                ++n5;
            }
            n5 += n6;
        }
        qe_.b370(n4, n2, n3, n, 2105376, 192, 80);
        for (int j = 0; j < 4; ++j) {
            qe_.a370(n4 + j, n2 + j, n3 - j * 2, n - 2 * j, 16777215, -(j * 16) + 64, 80 - j * 20);
        }
    }
    
    @Override
    final String a439(final byte b, final String s) {
        if (b <= 44) {
            this._n = null;
        }
        final String lowerCase = this._n.buttonText.toLowerCase();
        final String lowerCase2 = s.toLowerCase();
        if (lowerCase2.length() == 0) {
            return null;
        }
        final String s2 = lowerCase2;
        if (sm_.a988(s2)) {
            return fm_.create_alert_passlength;
        }
        if (dj_.a988(6623, s2)) {
            return ad_.create_alert_passchars;
        }
        if (j_.a623(s2)) {
            return RenownTableEntry.create_alert_passrepeated;
        }
        if (this.a623(s, (byte)(-106))) {
            return tp_.create_alert_passcontainsemail;
        }
        if (lowerCase.length() <= 0) {
            return dl_.create_passwordvalid;
        }
        if (gk_.a398(lowerCase, s2)) {
            return qd_.create_alert_passcontainsname;
        }
        if (gl_.a014(lowerCase, 0, s2)) {
            return mf_.create_alert_passcontainsname_partial;
        }
        if (uo_.a689(lowerCase, s2)) {
            return qd_.create_alert_passcontainsname;
        }
        return fm_.create_alert_passlength;
    }
    
    vo_(final rm_ rm_, final rm_ n, final rm_ p3) {
        super(rm_);
        this._p = p3;
        this._n = n;
    }
    
    @Override
    final od_ a212(final String s, final int n) {
        final String lowerCase = this._n.buttonText.toLowerCase();
        final String lowerCase2 = s.toLowerCase();
        if (0 == lowerCase2.length()) {
            return pd_._J;
        }
        if (!DungeonPath.a671(lowerCase, lowerCase2, (byte)(-83))) {
            return pd_._J;
        }
        if (!this.a623(s, (byte)(-117))) {
            return c_._d;
        }
        return pd_._J;
    }
    
    public static void e150(final int n) {
        vo_.login_no_displayname = null;
        vo_.text_useskill = null;
        vo_.text_disarm_trap_minitip = null;
        if (n != 1) {
            e150(-81);
        }
    }
    
    private final boolean a623(final String s, final byte b) {
        if (b >= -95) {
            vo_._r = -102;
        }
        final String lowerCase = this._p.buttonText.toLowerCase();
        final String lowerCase2 = s.toLowerCase();
        if (0 < lowerCase.length() && lowerCase2.length() > 0) {
            final int lastIndex = lowerCase.lastIndexOf("@");
            if (0 <= lastIndex && lastIndex < lowerCase.length() - 1) {
                final String substring = lowerCase.substring(0, lastIndex);
                final String substring2 = lowerCase.substring(lastIndex + 1);
                if (lowerCase2.indexOf(substring) >= 0) {
                    return true;
                }
                if (0 <= lowerCase2.indexOf(substring2)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    static {
        vo_.login_no_displayname = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        vo_.text_useskill = "<col=178B8B>Use skill - <%0></col>";
        vo_.text_disarm_trap_minitip = "<col=8B1717>Disarm</col>";
    }
}
