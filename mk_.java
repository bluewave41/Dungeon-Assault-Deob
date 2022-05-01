final class mk_ extends ne_
{
    static nn_ _j;
    byte[] _k;
    static int[] _i;
    
    static final String a046(final byte[] array, final int n, final int n2) {
        final char[] array2 = new char[n];
        int n3 = 0;
        for (int i = 0; i < n; ++i) {
            int n4 = 0xFF & array[i + n2];
            if (n4 != 0) {
                if (128 <= n4) {
                    if (160 > n4) {
                        int n5 = mh_._d[n4 - 128];
                        if (n5 == 0) {
                            n5 = 63;
                        }
                        n4 = n5;
                    }
                }
                array2[n3++] = (char)n4;
            }
        }
        return new String(array2, 0, n3);
    }
    
    public static void b487() {
        mk_._j = null;
        mk_._i = null;
    }
    
    mk_(final byte[] k) {
        this._k = k;
    }
    
    static final boolean a827(final boolean b, final CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        final int length = charSequence.length();
        if (1 > length || length > 12) {
            return false;
        }
        final String a715 = jm_.lowerCaseReplaceSpaceWithUnderscore(charSequence);
        if (null == a715 || 1 > a715.length()) {
            return false;
        }
        if (!jc_.a351(a715.charAt(0)) && !jc_.a351(a715.charAt(a715.length() - 1))) {
            int n = 0;
            for (int i = 0; i < charSequence.length(); ++i) {
                if (jc_.a351(charSequence.charAt(i))) {
                    ++n;
                }
                else {
                    n = 0;
                }
                if (n >= 2 && !b) {
                    return false;
                }
            }
            return n <= 0;
        }
        return false;
    }
    
    //original signature: static final nh_ a923(final int n, final byte b) {
    static final nh_ a923(final int n) {
        return uo_.a385(false, 1, true, n);
    }
    
    static {
        mk_._i = new int[4];
    }
}
