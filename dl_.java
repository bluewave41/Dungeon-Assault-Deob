final class dl_
{
	//original name: _c
    static String tip_hidden_nails;
    static int _b;
    //original name: _a
    static String create_passwordvalid;
    
    static final kk_ a204(final int n, final nh_ nh_) {
        final byte[] a104 = nh_.a104(-6635, n);
        if (a104 != null) {
            return new kk_(a104);
        }
        return null;
    }
    
    public static void a150() {
        dl_.create_passwordvalid = null;
        dl_.tip_hidden_nails = null;
    }
    
    static final int a080(final int n, final int n2) {
        ba_._f = 0;
        qi_._e = null;
        pe_._l = null;
        final int gamePort1 = lk_.gamePort1;
        lk_.gamePort1 = bf_.gamePort2;
        if (n2 != 51) {
            if (n2 != 50) {
                RaidMember._a._c = 1;
            }
            else {
                RaidMember._a._c = 5;
            }
        }
        else {
            RaidMember._a._c = 2;
        }
        final bb_ a = RaidMember._a;
        ++a._h;
        bf_.gamePort2 = gamePort1;
        if (2 <= RaidMember._a._h && 51 == n2) {
            return 2;
        }
        if (2 <= RaidMember._a._h && 50 == n2) {
            return 5;
        }
        if (~RaidMember._a._h <= n) {
            return 1;
        }
        return -1;
    }
    
    static {
        dl_.tip_hidden_nails = "<col=FF0000>Defence -1</col>";
        dl_._b = 0;
        dl_.create_passwordvalid = "Password is valid";
    }
}
