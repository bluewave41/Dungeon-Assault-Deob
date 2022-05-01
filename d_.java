final class d_
{
	//original name; _b
    static String invalidpass;
    static int _e;
    static q_[] _c;
    static nh_ _d;
    //original name: _a
    static String goblin_runt;
    static ae_ _g;
    static boolean _f;
    
    static final int a313(final int n, final int n2, final int n3) {
        if (n >= -72) {
            a313(48, -124, 86);
        }
        if (n2 < n3) {
            return 2048 - gj_.a080((n2 << 16) / n3);
        }
        return gj_.a080((n3 << 16) / n2);
    }
    
    static final la_ a627(final boolean b) {
        final wj_ c = ra_._c;
        final int c2 = c.readByte();
        uk_._a = (0x7F & c2);
        Trap._l = ((0x80 & c2) != 0x0);
        wd_._j = c.readByte();
        gg_._d = c.c411();
        if (2 == uk_._a) {
            RenownTableEntry._d = c.readShort();
            ce_._w = c.readTribyte(-114);
        }
        else {
            RenownTableEntry._d = 0;
            ce_._w = 0;
        }
        final boolean b2 = c.readByte() == 1;
        ri_._f = c.d738();
        if (b2) {
            tk_._v = c.d738();
        }
        else {
            tk_._v = ri_._f;
        }
        if (1 == uk_._a || uk_._a == 4) {
            c.readShort();
            c.d738();
        }
        if (b) {
            final int k137 = c.readShort();
            try {
                final nf_ a928 = fm_._f.a928(k137, -19256);
                sa_._t = a928.c983();
                kp_._a = (int[])(tk_._v.equals(tc_.playerTitle) ? null : a928._D);
            }
            catch (Exception ex) {
                sm_.a741(ex, 1, "CC1");
                kp_._a = null;
                sa_._t = null;
            }
        }
        else {
            sa_._t = sc_.a756(80, c);
            kp_._a = null;
        }
        return new la_(b);
    }
    
    static final void a713(final int n, final int n2, final int n3, final int n4) {
        ie_.a150();
        gf_.a115(n, n4, n3, n2);
    }
    
    public static void a150() {
        d_._g = null;
        d_._d = null;
        d_.goblin_runt = null;
        d_.invalidpass = null;
        d_._c = null;
    }
    
    static {
        d_.invalidpass = "Invalid password.";
        d_.goblin_runt = "Goblin Runt";
        d_._f = false;
        d_._g = new ae_(1);
    }
}
