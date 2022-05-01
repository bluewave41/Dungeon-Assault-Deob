final class sc_ extends ch_
{
    static qg_ _q;
    //original name: _p
    static String create_suggestions;
    
    public static void b423(final byte b) {
        sc_._q = null;
        sc_.create_suggestions = null;
        if (b != -94) {
            b423((byte)(-6));
        }
    }
    
    @Override
    final fd_ b743(final int n) {
        return of_._p;
    }
    
    static final String a756(final int n, final ec_ ec_) {
        try {
            int d410 = ec_.d410();
            if (d410 > n) {
                d410 = n;
            }
            final byte[] array = new byte[d410];
            ec_.currentIndex += qh_._G.a205(ec_.buffer, array, (byte)(-88), ec_.currentIndex, 0, d410);
            return mk_.a046(array, d410, 0);
        }
        catch (Exception ex) {
            return "Cabbage";
        }
    }
    
    //never called?
    sc_(final long n, final String s) {
        super(n, s);
    }
    
    static {
        sc_.create_suggestions = "Suggested names: ";
    }
}
