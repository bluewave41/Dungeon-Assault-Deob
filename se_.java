abstract class se_ extends ll_
{
    private lo_[] _x;
    private int[] _z;
    private int[] _G;
    private int[] _M;
    private int[] _Q;
    private byte[] _v;
    int _H;
    int _E;
    int _N;
    //original name: _J
    private static StringBuilder stringBuilder;
    private int[] _P;
    private int[] _D;
    private static int _L;
    private static int _K;
    int _R;
    private static int _y;
    private static int _F;
    private static int _C;
    private static int _B;
    private static String[] _A;
    private static int _I;
    private static int _S;
    private static int _w;
    private static int _O;
    
    final int c913(final String s, final int n) {
        return this.a899(s, new int[] { n }, se_._A);
    }
    
    abstract void a033(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final boolean p6);
    
    final void a068(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        this.a326(n3, n4, n5);
        this.b503(s, n, n2);
    }
    
    private static final int a150(final byte[][] array, final byte[][] array2, final int[] array3, final int[] array4, final int[] array5, final int n, final int n2) {
        final int n3 = array3[n];
        final int n4 = n3 + array5[n];
        final int n5 = array3[n2];
        final int n6 = n5 + array5[n2];
        int n7 = n3;
        if (n5 > n3) {
            n7 = n5;
        }
        int n8;
        if (n6 < (n8 = n4)) {
            n8 = n6;
        }
        int n9 = array4[n];
        if (array4[n2] < n9) {
            n9 = array4[n2];
        }
        final byte[] array6 = array2[n];
        final byte[] array7 = array[n2];
        int n10 = n7 - n3;
        int n11 = n7 - n5;
        for (int i = n7; i < n8; ++i) {
            final int n12 = array6[n10++] + array7[n11++];
            if (n12 < n9) {
                n9 = n12;
            }
        }
        return -n9;
    }
    
    //original signature: final int b926(final String s) {
    final int b926(final String buttonText) {
        if (buttonText == null) {
            return 0;
        }
        int n = -1;
        int n2 = 0;
        int n3 = 0;
        for (int length = buttonText.length(), i = 0; i < length; ++i) {
            char char1 = buttonText.charAt(i);
            if (char1 == '<') {
                n = i;
            }
            else {
                if (char1 == '>' && n != -1) {
                    final String lowerCase = buttonText.substring(n + 1, i).toLowerCase();
                    n = -1;
                    if (lowerCase.equals("lt")) {
                        char1 = '<';
                    }
                    else if (lowerCase.equals("gt")) {
                        char1 = '>';
                    }
                    else if (lowerCase.equals("nbsp")) {
                        char1 = ' ';
                    }
                    else if (lowerCase.equals("shy")) {
                        char1 = '\u00ad';
                    }
                    else if (lowerCase.equals("times")) {
                        char1 = '\u00d7';
                    }
                    else if (lowerCase.equals("euro")) {
                        char1 = '\u20ac';
                    }
                    else if (lowerCase.equals("copy")) {
                        char1 = '©';
                    }
                    else if (lowerCase.equals("reg")) {
                        char1 = '®';
                    }
                    else {
                        if (lowerCase.startsWith("img=")) {
                            try {
                                n3 += this._x[mm_.a978(lowerCase.substring(4), true, 10)]._d;
                                n2 = 0;
                            }
                            catch (Exception ex) {}
                        }
                        continue;
                    }
                }
                if (n == -1) {
                    final char c = (char)(RaidMember.a770(char1) & 0xFF);
                    n3 += this._M[c];
                    if (this._v != null && n2 != 0) {
                        n3 += this._v[(n2 << 8) + c];
                    }
                    n2 = c;
                }
            }
        }
        return n3;
    }
    
    final void c068(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        this.a326(n3, n4, n5);
        this.b503(s, n - this.b926(s), n2);
    }
    
    private final void a604(final byte[] array) {
        this._M = new int[256];
        if (array.length == 257) {
            for (int i = 0; i < this._M.length; ++i) {
                this._M[i] = (array[i] & 0xFF);
            }
            this._R = (array[256] & 0xFF);
        }
        else {
            int n = 0;
            for (int j = 0; j < 256; ++j) {
                this._M[j] = (array[n++] & 0xFF);
            }
            final int[] array2 = new int[256];
            final int[] array3 = new int[256];
            for (int k = 0; k < 256; ++k) {
                array2[k] = (array[n++] & 0xFF);
            }
            for (int l = 0; l < 256; ++l) {
                array3[l] = (array[n++] & 0xFF);
            }
            final byte[][] array4 = new byte[256][];
            for (int n2 = 0; n2 < 256; ++n2) {
                array4[n2] = new byte[array2[n2]];
                byte b = 0;
                for (int n3 = 0; n3 < array4[n2].length; ++n3) {
                    b += array[n++];
                    array4[n2][n3] = b;
                }
            }
            final byte[][] array5 = new byte[256][];
            for (int n4 = 0; n4 < 256; ++n4) {
                array5[n4] = new byte[array2[n4]];
                byte b2 = 0;
                for (int n5 = 0; n5 < array5[n4].length; ++n5) {
                    b2 += array[n++];
                    array5[n4][n5] = b2;
                }
            }
            this._v = new byte[65536];
            for (int n6 = 0; n6 < 256; ++n6) {
                if (n6 != 32) {
                    if (n6 != 160) {
                        for (int n7 = 0; n7 < 256; ++n7) {
                            if (n7 != 32) {
                                if (n7 != 160) {
                                    this._v[(n6 << 8) + n7] = (byte)a150(array4, array5, array3, this._M, array2, n6, n7);
                                }
                            }
                        }
                    }
                }
            }
            this._R = array3[32] + array2[32];
        }
    }
    
    private final void a913(final String s) {
        try {
            if (s.startsWith("col=")) {
                se_._O = hl_.a148(s.substring(4), 16);
            }
            else if (s.equals("/col")) {
                se_._O = se_._B;
            }
            else if (s.startsWith("trans=")) {
                se_._F = mm_.a978(s.substring(6), true, 10);
            }
            else if (s.equals("/trans")) {
                se_._F = se_._y;
            }
            else if (s.startsWith("str=")) {
                se_._w = hl_.a148(s.substring(4), 16);
            }
            else if (s.equals("str")) {
                se_._w = 8388608;
            }
            else if (s.equals("/str")) {
                se_._w = -1;
            }
            else if (s.startsWith("u=")) {
                se_._S = hl_.a148(s.substring(2), 16);
            }
            else if (s.equals("u")) {
                se_._S = 0;
            }
            else if (s.equals("/u")) {
                se_._S = -1;
            }
            else if (s.startsWith("shad=")) {
                se_._L = hl_.a148(s.substring(5), 16);
            }
            else if (s.equals("shad")) {
                se_._L = 0;
            }
            else if (s.equals("/shad")) {
                se_._L = se_._I;
            }
            else if (s.equals("br")) {
                this.a326(se_._B, se_._I, se_._y);
            }
        }
        catch (Exception ex) {}
    }
    
    private final void a900(final String s, final int n) {
        int n2 = 0;
        boolean b = false;
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '<') {
                b = true;
            }
            else if (char1 == '>') {
                b = false;
            }
            else if (!b && char1 == ' ') {
                ++n2;
            }
        }
        if (n2 > 0) {
            se_._C = (n - this.b926(s) << 8) / n2;
        }
    }
    
    private final void b503(final String s, int n, int n2) {
        n2 -= this._R;
        int n3 = -1;
        int n4 = 0;
        for (int length = s.length(), i = 0; i < length; ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n3 = i;
            }
            else {
                if (char1 == '>' && n3 != -1) {
                    final String lowerCase = s.substring(n3 + 1, i).toLowerCase();
                    n3 = -1;
                    if (lowerCase.equals("lt")) {
                        char1 = '<';
                    }
                    else if (lowerCase.equals("gt")) {
                        char1 = '>';
                    }
                    else if (lowerCase.equals("nbsp")) {
                        char1 = ' ';
                    }
                    else if (lowerCase.equals("shy")) {
                        char1 = '\u00ad';
                    }
                    else if (lowerCase.equals("times")) {
                        char1 = '\u00d7';
                    }
                    else if (lowerCase.equals("euro")) {
                        char1 = '\u20ac';
                    }
                    else if (lowerCase.equals("copy")) {
                        char1 = '©';
                    }
                    else if (lowerCase.equals("reg")) {
                        char1 = '®';
                    }
                    else {
                        if (lowerCase.startsWith("img=")) {
                            try {
                                final int a034 = mm_.a978(lowerCase.substring(4), true, 10);
                                final lo_ lo_ = this._x[a034];
                                final int n5 = (this._D != null) ? this._D[a034] : lo_._g;
                                if (se_._F == 256) {
                                    lo_.a093(n, n2 + this._R - n5);
                                }
                                else {
                                    lo_.a326(n, n2 + this._R - n5, se_._F);
                                }
                                n += lo_._d;
                                n4 = 0;
                            }
                            catch (Exception ex) {}
                            continue;
                        }
                        this.a913(lowerCase);
                        continue;
                    }
                }
                if (n3 == -1) {
                    final char c = (char)(RaidMember.a770(char1) & 0xFF);
                    if (this._v != null && n4 != 0) {
                        n += this._v[(n4 << 8) + c];
                    }
                    final int n6 = this._G[c];
                    final int n7 = this._Q[c];
                    final int n8 = n;
                    if (c != ' ') {
                        if (se_._F == 256) {
                            if (se_._L != -1) {
                                this.a033(c, n + this._P[c] + 1, n2 + this._z[c] + 1, n6, n7, se_._L, true);
                            }
                            this.a033(c, n + this._P[c], n2 + this._z[c], n6, n7, se_._O, false);
                        }
                        else {
                            if (se_._L != -1) {
                                this.a566(c, n + this._P[c] + 1, n2 + this._z[c] + 1, n6, n7, se_._L, se_._F, true);
                            }
                            this.a566(c, n + this._P[c], n2 + this._z[c], n6, n7, se_._O, se_._F, false);
                        }
                    }
                    else if (se_._C > 0) {
                        se_._K += se_._C;
                        n += se_._K >> 8;
                        se_._K &= 0xFF;
                    }
                    n += this._M[c];
                    if (se_._w != -1) {
                        gf_.b115(n8, n2 + (int)(this._R * 0.7), n - n8, se_._w);
                    }
                    if (se_._S != -1) {
                        gf_.b115(n8, n2 + this._R + 1, n - n8, se_._S);
                    }
                    n4 = c;
                }
            }
        }
    }
    
    private final void a326(final int n, final int n2, final int n3) {
        se_._w = -1;
        se_._S = -1;
        se_._I = n2;
        se_._L = n2;
        se_._B = n;
        se_._O = n;
        se_._y = n3;
        se_._F = n3;
        se_._C = 0;
        se_._K = 0;
    }
    
    abstract void a566(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final boolean p7);
    
    final int a899(final String s, final int[] array, final String[] array2) {
        if (s == null) {
            return 0;
        }
        am_.a541(se_.stringBuilder, ' ', 0);
        int n = 0;
        int length = 0;
        int n2 = -1;
        byte b = 0;
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        int n6 = 0;
        for (int length2 = s.length(), i = 0; i < length2; ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n4 = i;
            }
            else {
                if (char1 == '>' && n4 != -1) {
                    final String lowerCase = s.substring(n4 + 1, i).toLowerCase();
                    n4 = -1;
                    se_.stringBuilder.append('<');
                    se_.stringBuilder.append(lowerCase);
                    se_.stringBuilder.append('>');
                    if (lowerCase.equals("br")) {
                        array2[n6] = se_.stringBuilder.toString().substring(length, se_.stringBuilder.length());
                        ++n6;
                        length = se_.stringBuilder.length();
                        n = 0;
                        n2 = -1;
                        n5 = 0;
                    }
                    else if (lowerCase.equals("lt")) {
                        n += this.a371('<');
                        if (this._v != null && n5 != 0) {
                            n += this._v[(n5 << 8) + 60];
                        }
                        n5 = 60;
                    }
                    else if (lowerCase.equals("gt")) {
                        n += this.a371('>');
                        if (this._v != null && n5 != 0) {
                            n += this._v[(n5 << 8) + 62];
                        }
                        n5 = 62;
                    }
                    else if (lowerCase.equals("nbsp")) {
                        n += this.a371(' ');
                        if (this._v != null && n5 != 0) {
                            n += this._v[(n5 << 8) + 160];
                        }
                        n5 = 160;
                    }
                    else if (lowerCase.equals("shy")) {
                        n += this.a371('\u00ad');
                        if (this._v != null && n5 != 0) {
                            n += this._v[(n5 << 8) + 173];
                        }
                        n5 = 173;
                    }
                    else if (lowerCase.equals("times")) {
                        n += this.a371('\u00d7');
                        if (this._v != null && n5 != 0) {
                            n += this._v[(n5 << 8) + 215];
                        }
                        n5 = 215;
                    }
                    else if (lowerCase.equals("euro")) {
                        n += this.a371('\u20ac');
                        if (this._v != null && n5 != 0) {
                            n += this._v[(n5 << 8) + 128];
                        }
                        n5 = 8364;
                    }
                    else if (lowerCase.equals("copy")) {
                        n += this.a371('©');
                        if (this._v != null && n5 != 0) {
                            n += this._v[(n5 << 8) + 169];
                        }
                        n5 = 169;
                    }
                    else if (lowerCase.equals("reg")) {
                        n += this.a371('®');
                        if (this._v != null && n5 != 0) {
                            n += this._v[(n5 << 8) + 174];
                        }
                        n5 = 174;
                    }
                    else if (lowerCase.startsWith("img=")) {
                        try {
                            n += this._x[mm_.a978(lowerCase.substring(4), true, 10)]._d;
                            n5 = 0;
                        }
                        catch (Exception ex) {}
                    }
                    char1 = '\0';
                }
                if (n4 == -1) {
                    if (char1 != '\0') {
                        se_.stringBuilder.append(char1);
                        char1 = (char)(RaidMember.a770(char1) & 0xFF);
                        n += this._M[char1];
                        if (this._v != null && n5 != 0) {
                            n += this._v[(n5 << 8) + char1];
                        }
                        n5 = char1;
                    }
                    if (char1 == ' ') {
                        n2 = se_.stringBuilder.length();
                        b = (byte)n;
                        n3 = 1;
                    }
                    if (array != null && n > array[(n6 < array.length) ? n6 : (array.length - 1)] && n2 >= 0) {
                        array2[n6] = se_.stringBuilder.toString().substring(length, n2 - n3);
                        ++n6;
                        length = n2;
                        n2 = -1;
                        n -= b;
                        n5 = 0;
                    }
                    if (char1 == '-') {
                        n2 = se_.stringBuilder.length();
                        b = (byte)n;
                        n3 = 0;
                    }
                }
            }
        }
        if (se_.stringBuilder.length() > length) {
            array2[n6] = se_.stringBuilder.toString().substring(length, se_.stringBuilder.length());
            ++n6;
        }
        return n6;
    }
    
    final int a490(final String s, final int n, int r) {
        if (r == 0) {
            r = this._R;
        }
        return this._H + (this.a899(s, new int[] { n }, se_._A) - 1) * r + this._E;
    }
    
    final void c191(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        this.a093(n3, n4);
        this.b503(s, n - this.b926(s) / 2, n2);
    }
    
    final int a385(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        return this.a450(s, n, n2, n3, n4, n5, n6, 256, n7, n8, n9);
    }
    
    final int a371(final char c) {
        return this._M[RaidMember.a770(c) & 0xFF];
    }
    
    final int b913(final String s, final int n) {
        final int a899 = this.a899(s, new int[] { n }, se_._A);
        int n2 = 0;
        for (int i = 0; i < a899; ++i) {
            final int b926 = this.b926(se_._A[i]);
            if (b926 > n2) {
                n2 = b926;
            }
        }
        return n2;
    }
    
    final int a450(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, int n9, int r) {
        if (s == null) {
            return 0;
        }
        this.a326(n5, n6, n7);
        if (r == 0) {
            r = this._R;
        }
        int[] array = { n3 };
        if (n4 < this._H + this._E + r && n4 < r + r) {
            array = null;
        }
        final int a899 = this.a899(s, array, se_._A);
        if (n9 == 3 && a899 == 1) {
            n9 = 1;
        }
        int n10;
        if (n9 == 0) {
            n10 = n2 + this._H;
        }
        else if (n9 == 1) {
            n10 = n2 + this._H + (n4 - this._H - this._E - (a899 - 1) * r) / 2;
        }
        else if (n9 == 2) {
            n10 = n2 + n4 - this._E - (a899 - 1) * r;
        }
        else {
            int n11 = (n4 - this._H - this._E - (a899 - 1) * r) / (a899 + 1);
            if (n11 < 0) {
                n11 = 0;
            }
            n10 = n2 + this._H + n11;
            r += n11;
        }
        for (int i = 0; i < a899; ++i) {
            if (n8 == 0) {
                this.b503(se_._A[i], n, n10);
            }
            else if (n8 == 1) {
                this.b503(se_._A[i], n + (n3 - this.b926(se_._A[i])) / 2, n10);
            }
            else if (n8 == 2) {
                this.b503(se_._A[i], n + n3 - this.b926(se_._A[i]), n10);
            }
            else if (i == a899 - 1) {
                this.b503(se_._A[i], n, n10);
            }
            else {
                this.a900(se_._A[i], n3);
                this.b503(se_._A[i], n, n10);
                se_._C = 0;
            }
            n10 += r;
        }
        return a899;
    }
    
    final void b068(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        this.a326(n3, n4, n5);
        this.b503(s, n - this.b926(s) / 2, n2);
    }
    
    final void b191(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        this.a093(n3, n4);
        this.b503(s, n, n2);
    }
    
    final void a191(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        this.a093(n3, n4);
        this.b503(s, n - this.b926(s), n2);
    }
    
    final void a478(final lo_[] x, final int[] d) {
        if (d != null && d.length != x.length) {
            throw new IllegalArgumentException();
        }
        this._x = x;
        this._D = d;
    }
    
    public static void a797() {
        se_.stringBuilder = null;
        se_._A = null;
    }
    
    private final void a093(final int n, final int n2) {
        se_._w = -1;
        se_._S = -1;
        se_._I = n2;
        se_._L = n2;
        se_._B = n;
        se_._O = n;
        se_._y = 256;
        se_._F = 256;
        se_._C = 0;
        se_._K = 0;
    }
    
    se_(final byte[] array, final int[] p5, final int[] z, final int[] g, final int[] q) {
        this._R = 0;
        this._P = p5;
        this._z = z;
        this._G = g;
        this._Q = q;
        this.a604(array);
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        for (int i = 0; i < 256; ++i) {
            if (this._z[i] < n && this._Q[i] != 0) {
                n = this._z[i];
            }
            if (this._z[i] + this._Q[i] > n2) {
                n2 = this._z[i] + this._Q[i];
            }
        }
        this._H = this._R - n;
        this._E = n2 - this._R;
        this._N = this._R - this._z[88];
    }
    
    static {
        se_.stringBuilder = new StringBuilder(100);
        se_._L = -1;
        se_._K = 0;
        se_._y = 256;
        se_._C = 0;
        se_._A = new String[100];
        se_._I = -1;
        se_._F = 256;
        se_._B = 0;
        se_._w = -1;
        se_._S = -1;
        se_._O = 0;
    }
}
