final class lc_
{
	//original name: _k
    static String[] waitingForTextTranslatedStrings;
    //original name: _g
    static String text_active_ability;
    private nh_ _i;
    static int _j; //always 0?
    static int _d;
    //original name: _c
    static int mouseX;
    static int[] _h;
    //original name: _e
    static float percentLoaded;
    private wa_ _a;
    private nh_ _b;
    private wa_ _f;
    
    private final va_ a206(final int[] array, final int n, final int n2, final int n3) {
        final long n4 = (((0xC0000FFF & n2) << 4 | n2 >>> 12) ^ n3) | n2 << 16;
        if (n >= -8) {
            this.a152(null, (byte)(-121), -3);
        }
        final va_ va_ = (va_)this._f.a722(n4, 8);
        if (null != va_) {
            return va_;
        }
        if (array != null && 0 >= array[0]) {
            return null;
        }
        final v_ a141 = v_.a141(this._i, n2, n3);
        if (a141 != null) {
            final va_ a142 = a141.a981();
            this._f.a102(a142, 12460, n4);
            if (array != null) {
                final int n5 = 0;
                array[n5] -= a142._k.length;
            }
            return a142;
        }
        return null;
    }
    
    final va_ a251(final String s, final byte b, final String s2) {
        if (b <= 101) {
            return null;
        }
        return this.a058(null, s2, 48117, s);
    }
    
    final va_ a848(final String s, final String s2, final int n) {
        if (n != 37316) {
            lc_.text_active_ability = null;
        }
        return this.a527(s2, null, (byte)118, s);
    }
    
    //original signature: final va_ a319(final int[] array, final int n, final int n2) {
    final va_ a319(final int[] array, final int n) {
        if (1 == this._i.b474()) {
            return this.a206(array, -15, 0, n);
        }
        if (1 == this._i.b080(n)) {
            return this.a206(array, -76, n, 0);
        }
        throw new RuntimeException();
    }
    
    final va_ a152(final int[] array, final byte b, final int n) {
        if (1 == this._b.b474()) {
            return this.a958(-126, n, 0, array);
        }
        if (b >= -61) {
            this._f = null;
        }
        if (1 == this._b.b080(n)) {
            return this.a958(-123, 0, n, array);
        }
        throw new RuntimeException();
    }
    
    //original signature: static final int a776(int n, final int n2) {
    static final int a776(int mouseX, final int mouseY) {
        if (nj_._f != null && 94 < mouseX && 546 > mouseX && 90 <= mouseY) {
            if (mouseY <= 184) {
                mouseX += ig_.b137() - 94;
                for (hm_ hm_ = (hm_)nj_._f.e024(); hm_ != null; hm_ = (hm_)nj_._f.a024(4)) {
                    if (hm_._o <= mouseX && 32 + hm_._o >= mouseX && mouseY >= hm_._p && mouseY <= 32 + hm_._p) {
                        return hm_._i;
                    }
                }
            }
        }
        return -1;
    }
    
    static final byte[] a266(byte[] byArray) {
        ec_ ec_2 = new ec_(byArray);
        int n = ec_2.readByte();
        int n2 = ec_2.readInt();
        if (n2 < 0 || ql_._j != 0 && n2 > ql_._j) {
            throw new RuntimeException();
        }
        if (0 == n) {
            byte[] byArray2 = new byte[n2];
            ec_2.a286(0, n2, byArray2);
            return byArray2;
        }
        int n3 = ec_2.readInt();
        if (n3 < 0 || ql_._j != 0 && ql_._j < n3) {
            throw new RuntimeException();
        }
        byte[] byArray3 = new byte[n3];
        if (1 != n) {
            uk_ uk_2 = ek_._f;
            synchronized (uk_2) {
                ek_._f.a730(-109, byArray3, ec_2);
            }
        } else {
            ej_.a265(byArray3, n3, byArray, n2, 9);
        }
        return byArray3;
    }
    
    static final Graphic a608(final Graphic cn_, final int n, final int n2) {
        if (cn_ != null) {
            final Graphic cn_2 = new Graphic(n, n2);
            jh_.a303(cn_2);
            if (n >= cn_.imageWidth || cn_.imageHeight <= n2) {
                cn_.e115(n >> 1, n2 >> 1, 0, (n << 12) / cn_.imageWidth);
            }
            else {
                cn_.b115(0, 0, n, n2);
            }
            jh_.b797();
            return cn_2;
        }
        return null;
    }
    
    static final gn_[] a603(final String[][] array) {
        final int i = array.length;
        final gn_[] array2 = new gn_[i];
        for (int n = 0; i > n; ++n) {
            array2[n] = new gn_(array[n][0], array[n][1]);
        }
        return array2;
    }
    
    public static void a487() {
        lc_._h = null;
        lc_.waitingForTextTranslatedStrings = null;
        lc_.text_active_ability = null;
    }
    
    private final va_ a958(final int n, final int n2, final int n3, final int[] array) {
        final long n4 = 0x100000000L ^ (long)((n2 ^ (n3 >>> 12 | (n3 & 0xF0000FFF) << 4)) | n3 << 16);
        final va_ va_ = (va_)this._f.a722(n4, 8);
        if (null != va_) {
            return va_;
        }
        if (array != null && 0 >= array[0]) {
            return null;
        }
        jp_ a989 = (jp_)this._a.a722(n4, 8);
        if (n >= -101) {
            lc_.text_active_ability = null;
        }
        if (null == a989) {
            a989 = jp_.a989(this._b, n3, n2);
            if (null == a989) {
                return null;
            }
            this._a.a102(a989, 12460, n4);
        }
        final va_ a990 = a989.a321(array);
        if (null != a990) {
            a989.a487(false);
            this._f.a102(a990, 12460, n4);
            return a990;
        }
        return null;
    }
    
    private final va_ a527(final String s, final int[] array, final byte b, final String s2) {
        final int a913 = this._i.a913(s, 1000);
        if (a913 < 0) {
            return null;
        }
        final int a914 = this._i.a026(0, s2, a913);
        if (b < 85) {
            this.a152(null, (byte)102, -108);
        }
        if (a914 < 0) {
            return null;
        }
        return this.a206(array, -100, a913, a914);
    }
    
    private final va_ a058(final int[] array, final String s, final int n, final String s2) {
        final int a913 = this._b.a913(s, n ^ 0xB81D);
        if (a913 < 0) {
            return null;
        }
        if (n != 48117) {
            lc_.waitingForTextTranslatedStrings = null;
        }
        final int a914 = this._b.a026(0, s2, a913);
        if (0 <= a914) {
            return this.a958(-107, a914, a913, array);
        }
        return null;
    }
    
    lc_(final nh_ i, final nh_ b) {
        this._a = new wa_(256);
        this._f = new wa_(256);
        this._i = i;
        this._b = b;
    }
    
    static {
        lc_.waitingForTextTranslatedStrings = new String[] { "Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto" };
        lc_._h = new int[] { 0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408 };
        lc_.mouseX = 0;
        lc_.text_active_ability = "Active ability - <%0>";
    }
}
