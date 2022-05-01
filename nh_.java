final class nh_
{
	//original name: _i
    static String text_orbs_active_x;
    private boolean _d;
    //original name: _a
    static String desc_none;
    private qa_ _f;
    private Object[] _j;
    //original name: _c
    private Object[][] individualCacheFiles;
    private int _g;
    static boolean _e;
    private tm_ _h;
    //original name: _b
    static String text_guardian_detected_alerted;
    static int _k;
    
    final boolean a213(final boolean b, String lowerCase) {
        if (!this.a154()) {
            return false;
        }
        if (b) {
            return true;
        }
        lowerCase = lowerCase.toLowerCase();
        return this.a544(b, this._h._a.a080(to_.hashString(lowerCase)));
    }
    
    private final synchronized void d093(final int n, final int n2) {
        if (!this._d) {
            this._j[n] = kj_.a534(false, this._f.a104(n, -7249));
        }
        else {
            this._j[n] = this._f.a104(n, -7249);
        }
        if (n2 != -23889) {
            this.a544(false, -26);
        }
    }
    
    //original signature: final synchronized boolean a154(final int n) {
    final synchronized boolean a154() {
        if (this._h == null) {
            this._h = this._f.a010(26538);
            if (this._h == null) {
                return false;
            }
            this._j = new Object[this._h._l];
            this.individualCacheFiles = new Object[this._h._l][];
        }
        return true;
    }
    
    static final void c487() {
        cd_.registerScreen = new RegisterScreen();
        ta_._a.b340(1, cd_.registerScreen);
    }
    
    static final void a541(final nh_ nh_, final mb_ mb_, final int n) {
        hh_._b = eg_.c137() * n / 1000;
        Trap.a572(nh_);
        kd_.a253(nh_);
        ob_.a572(nh_);
        GUIButton.e423((byte)65);
        hn_.d423();
        nl_._d = -hh_._b + 0;
    }
    
    //original signature: final int b080(final int n, final int n2) {
    final int b080(final int n) {
        if (!this.e097(-1, n)) {
            return 0;
        }
        return this._h._i[n];
    }
    
    //original signature: public static void a487(final boolean b) {
    public static void cleanup() {
        nh_.text_orbs_active_x = null;
        nh_.desc_none = null;
        nh_.text_guardian_detected_alerted = null;
    }
    
    final boolean c896(String lowerCase, final int n) {
        if (!this.a154()) {
            return false;
        }
        lowerCase = lowerCase.toLowerCase();
        return n <= this._h._a.a080(to_.hashString(lowerCase));
    }
    
    //original signature: final int b913(String lowerCase, final int n) {
    final int b913(String lowerCase) {
        if (!this.a154()) {
            return 0;
        }
        lowerCase = lowerCase.toLowerCase();
        return this.c080(-124, this._h._a.a080(to_.hashString(lowerCase)));
    }
    
    //original signature: private final synchronized byte[] a538(final int[] array, final int n, final byte b, final int n2) {
    private final synchronized byte[] a538(final int[] array, final int n, final int n2) {
        if (!this.a603(n2, n)) {
            return null;
        }
        byte[] a044 = null;
        if (this.individualCacheFiles[n] == null || this.individualCacheFiles[n][n2] == null) {
            if (!this.a972(array, n2, n)) {
                this.d093(n, -23889);
                if (!this.a972(array, n2, n)) {
                    return null;
                }
            }
        }
        if (this.individualCacheFiles[n] != null) {
            if (null != this.individualCacheFiles[n][n2]) {
                a044 = dn_.a044(this.individualCacheFiles[n][n2], false);
                if (null == a044) {
                    throw new RuntimeException("");
                }
            }
            if (null != a044) {
                if (this._g != 1) {
                    if (2 == this._g) {
                        this.individualCacheFiles[n] = null;
                    }
                }
                else {
                    this.individualCacheFiles[n][n2] = null;
                    if (this._h._i[n] == 1) {
                        this.individualCacheFiles[n] = null;
                    }
                }
            }
            return a044;
        }
        throw new RuntimeException("");
    }
    
    final boolean b671(String lowerCase, String lowerCase2, final byte b) {
        if (!this.a154()) {
            return false;
        }
        lowerCase2 = lowerCase2.toLowerCase();
        if (b != -82) {
            this.b671(null, null, (byte)88);
        }
        lowerCase = lowerCase.toLowerCase();
        final int a080 = this._h._a.a080(to_.hashString(lowerCase2));
        return a080 >= 0 && 0 <= this._h._n[a080].a080(to_.hashString(lowerCase));
    }
    
    //original signature: final synchronized boolean a330(final int n, final int n2, final int n3) {
    final synchronized boolean a330(final int n, final int n3) {
        if (!this.a603(n, n3)) {
            return false;
        }
        if (this.individualCacheFiles[n3] != null && this.individualCacheFiles[n3][n] != null) {
            return true;
        }
        if (null != this._j[n3]) {
            return true;
        }
        this.d093(n3, -23889);
        return null != this._j[n3];
    }
    
    final synchronized boolean a544(final boolean b, final int n) {
        if (!this.e097(-1, n)) {
            return false;
        }
        if (null != this._j[n]) {
            return true;
        }
        this.d093(n, -23889);
        return !b && null != this._j[n];
    }
    
    final boolean a822(final int n, String lowerCase, String lowerCase2) {
        if (!this.a154()) {
            return false;
        }
        if (n != -13703) {
            this.a026(110, null, 85);
        }
        lowerCase2 = lowerCase2.toLowerCase();
        lowerCase = lowerCase.toLowerCase();
        final int a080 = this._h._a.a080(to_.hashString(lowerCase2));
        return this.e097(n + 13702, a080) && this.a330(this._h._n[a080].a080(to_.hashString(lowerCase)), a080);
    }
    
    //original signature: final synchronized byte[] a826(String lowerCase, String lowerCase2, final byte b) {
    final synchronized byte[] a826(String lowerCase, String lowerCase2) {
        if (!this.a154()) {
            return null;
        }
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int a080 = this._h._a.a080(to_.hashString(lowerCase));
        if (!this.e097(-1, a080)) {
            return null;
        }
        return this.b337(a080, this._h._n[a080].a080(to_.hashString(lowerCase2)));
    }
    
    //original signature: final synchronized int b137(final int n) {
    final synchronized int b137() {
        if (!this.a154()) {
            return 0;
        }
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < this._j.length; ++i) {
            if (0 < this._h._k[i]) {
                n2 += 100;
                n3 += this.c080(-126, i);
            }
        }
        if (n2 == 0) {
            return 100;
        }
        return 100 * n3 / n2;
    }
    
    final int a913(String lowerCase, final int n) {
        if (!this.a154()) {
            return -1;
        }
        lowerCase = lowerCase.toLowerCase();
        final int a080 = this._h._a.a080(to_.hashString(lowerCase));
        if (this.e097(n ^ 0xFFFFFC17, a080)) {
            if (n != 1000) {
                c487();
            }
            return a080;
        }
        return -1;
    }
    
    final synchronized int c080(final int n, final int n2) {
        if (!this.e097(-1, n2)) {
            return 0;
        }
        if (this._j[n2] != null) {
            return 100;
        }
        return this._f.b080(n2, 27318);
    }
    
    //original signature: private final synchronized boolean a972(final int[] array, final int n, final int n2, final int n3) {
    private final synchronized boolean a972(final int[] array, final int n, final int n2) {
        if (!this.e097(-1, n2)) {
            return false;
        }
        if (this._j[n2] == null) { //array of 33
            return false;
        }
        final int i = this._h._k[n2]; //these are read from the masterindex
        final int[] array2 = this._h._m[n2]; //only 3 and 21 of this are set
        if (null == this.individualCacheFiles[n2]) {
            this.individualCacheFiles[n2] = new Object[this._h._i[n2]];
        }
        final Object[] array3 = this.individualCacheFiles[n2];
        boolean b = true;
        for (int n4 = 0; i > n4; ++n4) {
            int n5;
            if (array2 != null) {
                n5 = array2[n4];
            }
            else {
                n5 = n4;
            }
            if (array3[n5] == null) {
                b = false;
                break;
            }
        }
        if (!b) {
            byte[] array4;
            if (array != null && (0 != array[0] || array[1] != 0 || 0 != array[2] || array[3] != 0)) {
                array4 = dn_.a044(this._j[n2], true);
                final ec_ ec_ = new ec_(array4);
                ec_.a332(ec_.buffer.length, array, 5);
            }
            else {
                array4 = dn_.a044(this._j[n2], false); //gzip response
            }
            final byte[] cacheArchive = lc_.a266(array4); //all the ungziped data
            if (this._d) {
                this._j[n2] = null;
            }
            if (i <= 1) {
                int n6;
                if (null == array2) {
                    n6 = 0;
                }
                else {
                    n6 = array2[0];
                }
                if (0 == this._g) {
                    array3[n6] = kj_.a534(false, cacheArchive);
                }
                else {
                    array3[n6] = cacheArchive;
                }
            }
            else if (this._g != 2) {
                int length = cacheArchive.length; //length of data
                final int groupCount = cacheArchive[--length] & 0xFF; //group count?
                final int n7 = length - i * groupCount * 4;
                final ec_ cacheArchiveBuffer = new ec_(cacheArchive);
                final int[] array5 = new int[i]; //i = number of files in this
                cacheArchiveBuffer.currentIndex = n7;
                for (int n8 = 0; groupCount > n8; ++n8) {
                    int n9 = 0;
                    for (int n10 = 0; i > n10; ++n10) {
                        n9 += cacheArchiveBuffer.readInt();
                        final int[] array6 = array5;
                        final int n11 = n10;
                        array6[n11] += n9;
                    }
                }
                final byte[][] array7 = new byte[i][]; //this at some point gets split files?
                for (int n12 = 0; i > n12; ++n12) {
                    array7[n12] = new byte[array5[n12]];
                    array5[n12] = 0;
                }
                cacheArchiveBuffer.currentIndex = n7;
                int n13 = 0;
                for (int k = 0; k < groupCount; ++k) {
                    int n14 = 0;
                    for (int n15 = 0; i > n15; ++n15) {
                        n14 += cacheArchiveBuffer.readInt();
                        cj_.a278(cacheArchive, n13, array7[n15], array5[n15], n14);
                        n13 += n14;
                        final int[] array8 = array5;
                        final int n16 = n15;
                        array8[n16] += n14;
                    }
                }
                for (int l = 0; l < i; ++l) {
                    int n17;
                    if (null != array2) {
                        n17 = array2[l];
                    }
                    else {
                        n17 = l;
                    }
                    if (0 == this._g) {
                        array3[n17] = kj_.a534(false, array7[l]);
                    }
                    else {
                        array3[n17] = array7[l];
                    }
                }
            }
            else {
                int length2 = cacheArchive.length;
                final int n18 = cacheArchive[--length2] & 0xFF;
                final int n19 = length2 - 4 * (n18 * i);
                final ec_ ec_3 = new ec_(cacheArchive);
                int n20 = 0;
                ec_3.currentIndex = n19;
                int n21 = 0;
                for (int n22 = 0; n18 > n22; ++n22) {
                    int n23 = 0;
                    for (int n24 = 0; i > n24; ++n24) {
                        n23 += ec_3.readInt();
                        int n25;
                        if (null != array2) {
                            n25 = array2[n24];
                        }
                        else {
                            n25 = n24;
                        }
                        if (n25 == n) {
                            n21 = n25;
                            n20 += n23;
                        }
                    }
                }
                if (n20 == 0) {
                    return true;
                }
                final byte[] array9 = new byte[n20];
                ec_3.currentIndex = n19;
                int n26 = 0;
                int n27 = 0;
                for (int n28 = 0; n28 < n18; ++n28) {
                    int n29 = 0;
                    for (int n30 = 0; n30 < i; ++n30) {
                        n29 += ec_3.readInt();
                        int n31;
                        if (null != array2) {
                            n31 = array2[n30];
                        }
                        else {
                            n31 = n30;
                        }
                        if (n == n31) {
                            cj_.a278(cacheArchive, n27, array9, n26, n29);
                            n26 += n29;
                        }
                        n27 += n29;
                    }
                }
                array3[n21] = array9;
            }
            return true;
        }
        return true;
    }
    
    //original signature: final byte[] b337(final int n, final int n2, final int n3) {
    final byte[] b337(final int n2, final int n3) {
        return this.a538(null, n2, n3);
    }
    
    //original signature: final int b474(final boolean b) {
    final int b474() {
        if (this.a154()) {
            return this._h._i.length;
        }
        return -1;
    }
    
    private final synchronized boolean e097(final int n, final int n2) {
        if (!this.a154()) {
            return false;
        }
        if (~n2 <= n && n2 < this._h._i.length && this._h._i[n2] != 0) {
            return true;
        }
        return false;
    }
    
    final synchronized boolean a427(final byte b) {
        if (!this.a154()) {
            return false;
        }
        boolean b2 = true;
        for (int n = 0; this._h._j.length > n; ++n) {
            final int n2 = this._h._j[n];
            if (null == this._j[n2]) {
                this.d093(n2, b ^ 0xFFFFA294);
                if (this._j[n2] == null) {
                    b2 = false;
                }
            }
        }
        if (b != 59) {
            this.a104(((int[])this._j[5])[0], -79);
        }
        return b2;
    }
    
    final synchronized byte[] a104(final int n, final int n2) {
        if (!this.a154()) {
            return null;
        }
        if (1 == this._h._i.length) {
            return this.b337(0, n2);
        }
        if (!this.e097(-1, n2)) {
            return null;
        }
        if (1 != this._h._i[n2]) {
            if (n != -6635) {
                this._j[3] = this._j[3];
            }
            throw new RuntimeException();
        }
        return this.b337(n2, 0);
    }
    
    nh_(final qa_ f, final boolean d, final int g) {
        this._h = null;
        if (0 <= g && 2 >= g) {
            this._f = f;
            this._d = d;
            this._g = g;
            return;
        }
        throw new IllegalArgumentException("");
    }
    
    //original signature: private final synchronized boolean a603(final int n, final int n2, final byte b) {
    private final synchronized boolean a603(final int n, final int n2) {
        if (!this.a154()) {
            return false;
        }
        if (n2 >= 0 && 0 <= n && this._h._i.length > n2 && this._h._i[n2] > n) {
            return true;
        }
        return false;
    }
    
    final int a026(final int n, String lowerCase, final int n2) {
        if (n != 0) {
            return 42;
        }
        if (!this.e097(-1, n2)) {
            return -1;
        }
        lowerCase = lowerCase.toLowerCase();
        final int a080 = this._h._n[n2].a080(to_.hashString(lowerCase));
        if (!this.a603(a080, n2)) {
            return -1;
        }
        return a080;
    }
    
    static {
        nh_.text_orbs_active_x = "<%0> active";
        nh_.desc_none = "There is nothing in this room to trouble a party of raiders.";
        nh_.text_guardian_detected_alerted = "Raider was detected by guardian, which alerted the monsters of the dungeon.";
    }
}
