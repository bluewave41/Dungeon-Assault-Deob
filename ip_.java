abstract class ip_ extends m_ implements jo_
{
    static String _j;
    static int[] _l;
    //original name: _i
    static String tocustomersupport;
    private rm_ _h;
    //original name: _k
    static String text_outcome;
    
    abstract od_ a212(final String p0, final int p1);
    
    static final ab_ a524(final int n, final String s) {
        final int i = s.length();
        if (i == 0) {
            return ri_._e;
        }
        if (i > 63) {
            return ta_._d;
        }
        for (int n2 = n; i > n2; ++n2) {
            final char char1 = s.charAt(n2);
            if ('-' != char1) {
                if (qj_._b.indexOf(char1) == -1) {
                    return np_._E;
                }
            }
            else if (n2 == 0 || n2 == i - 1) {
                return np_._E;
            }
        }
        return null;
    }
    
    public static void c423() {
        ip_.tocustomersupport = null;
        ip_._l = null;
        ip_._j = null;
        ip_.text_outcome = null;
    }
    
    @Override
    public final void a157(final rm_ rm_, final byte b) {
        if (b >= -117) {
            ip_._j = null;
        }
    }
    
    @Override
    public final boolean a154(final int n) {
        return null == this._h.buttonText || 0 == this._h.buttonText.length();
    }
    
    abstract String a439(final byte p0, final String p1);
    
    @Override
    final od_ b527(final boolean b) {
        if (b) {
            this.b527(true);
        }
        return this.a212(this._h.buttonText, -92);
    }
    
    @Override
    final String c738(final int n) {
        if (n != 63) {
            ip_._j = null;
        }
        return this.a439((byte)48, this._h.buttonText);
    }
    
    ip_(final rm_ h) {
        this._h = h;
    }
    
    @Override
    public final void a430(final rm_ rm_, final int n) {
        this.b150(2899);
        if (n != 10000536) {
            ip_.tocustomersupport = null;
        }
    }
    
    static {
        ip_._l = new int[8192];
        ip_.tocustomersupport = "To Customer Support";
        ip_.text_outcome = "<col=DB0100><%0></col> attempted, <col=DB0100><%1></col> successful";
    }
}
