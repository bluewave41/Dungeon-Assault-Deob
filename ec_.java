import java.math.*;

class ec_ extends ne_
{
	//original name: _o
    int currentIndex;
    //original name: _r
    static String waitingForTextString;
    //original name: _l
    static String[] text_benefits;
    static fb_ _i;
    //original name: _q
    static String basilisk;
    static q_[] _j;
    static pp_ _n;
    static int _p;
    //original name: _m
    byte[] buffer;
    static nh_ _k;
    
    static final void a021(int f, int j, final Graphic cn_, final int n, final int n2) {
        f += cn_._A;
        j += cn_._w;
        int n3 = j + gf_._i * f;
        int n4 = 0;
        int v = cn_.imageHeight;
        int y = cn_.imageWidth;
        int n5 = gf_._i - y;
        int n6 = 0;
        if (gf_._f > f) {
            final int n7 = -f + gf_._f;
            n4 += n7 * y;
            n3 += n7 * gf_._i;
            f = gf_._f;
            v -= n7;
        }
        if (gf_._j > j) {
            final int n8 = gf_._j - j;
            n3 += n8;
            y -= n8;
            n5 += n8;
            n4 += n8;
            j = gf_._j;
            n6 += n8;
        }
        if (gf_._e < f + v) {
            v -= v + (f - gf_._e);
        }
        if (gf_._h < y + j) {
            final int n9 = -gf_._h + j + y;
            n5 += n9;
            n6 += n9;
            y -= n9;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        if (n2 != 256) {
            qj_.a485(n, 0, 0, n4, cn_._B, n5, n2, n6, 0, 0, 0, gf_._b, y, n3, v);
        }
        else {
            he_.a651(gf_._b, 0, v, y, n, 0, n5, n3, n4, n6, 0, 0, 0, cn_._B);
        }
    }
    
    //original signature: final void i093(final int n, final int n2) {
    final void storeShort(final int n) {
        this.buffer[this.currentIndex++] = (byte)(n >> 8);
        this.buffer[this.currentIndex++] = (byte)n;
    }
    
    //original signature: private static final int a165(final int n, final int n2, final byte[] array, final int n3, final int n4, final CharSequence charSequence) {
    private static final int a165(final int stringLength, final byte[] array, final int currentIndex,
    		final CharSequence charSequence) {
        final int length = stringLength;
        int i = 0;
        while (length > i) {
            final char char1 = charSequence.charAt(i);
            if (('\0' >= char1 || char1 >= '\u0080') && (' ' > char1 || char1 > '\u00ff')) {
                if (char1 != '\u20ac') {
                    if (char1 != '\u201a') {
                        if ('\u0192' == char1) {
                            array[i + currentIndex] = -125;
                        }
                        else if ('\u201e' != char1) {
                            if (char1 != '\u2026') {
                                if (char1 == '\u2020') {
                                    array[i + currentIndex] = -122;
                                }
                                else if (char1 == '\u2021') {
                                    array[i + currentIndex] = -121;
                                }
                                else if (char1 != '\u02c6') {
                                    if ('\u2030' != char1) {
                                        if (char1 != '\u0160') {
                                            if ('\u2039' == char1) {
                                                array[currentIndex + i] = -117;
                                            }
                                            else if (char1 != '\u0152') {
                                                if (char1 != '\u017d') {
                                                    if (char1 == '\u2018') {
                                                        array[currentIndex + i] = -111;
                                                    }
                                                    else if (char1 != '\u2019') {
                                                        if (char1 != '\u201c') {
                                                            if (char1 == '\u201d') {
                                                                array[currentIndex + i] = -108;
                                                            }
                                                            else if ('\u2022' == char1) {
                                                                array[currentIndex + i] = -107;
                                                            }
                                                            else if (char1 != '\u2013') {
                                                                if (char1 == '\u2014') {
                                                                    array[currentIndex + i] = -105;
                                                                }
                                                                else if ('\u02dc' == char1) {
                                                                    array[i + currentIndex] = -104;
                                                                }
                                                                else if ('\u2122' != char1) {
                                                                    if (char1 == '\u0161') {
                                                                        array[currentIndex + i] = -102;
                                                                    }
                                                                    else if ('\u203a' != char1) {
                                                                        if (char1 != '\u0153') {
                                                                            if (char1 != '\u017e') {
                                                                                if ('\u0178' != char1) {
                                                                                    array[i + currentIndex] = 63;
                                                                                }
                                                                                else {
                                                                                    array[currentIndex + i] = -97;
                                                                                }
                                                                            }
                                                                            else {
                                                                                array[i + currentIndex] = -98;
                                                                            }
                                                                        }
                                                                        else {
                                                                            array[currentIndex + i] = -100;
                                                                        }
                                                                    }
                                                                    else {
                                                                        array[currentIndex + i] = -101;
                                                                    }
                                                                }
                                                                else {
                                                                    array[i + currentIndex] = -103;
                                                                }
                                                            }
                                                            else {
                                                                array[i + currentIndex] = -106;
                                                            }
                                                        }
                                                        else {
                                                            array[i + currentIndex] = -109;
                                                        }
                                                    }
                                                    else {
                                                        array[currentIndex + i] = -110;
                                                    }
                                                }
                                                else {
                                                    array[i + currentIndex] = -114;
                                                }
                                            }
                                            else {
                                                array[i + currentIndex] = -116;
                                            }
                                        }
                                        else {
                                            array[currentIndex + i] = -118;
                                        }
                                    }
                                    else {
                                        array[i + currentIndex] = -119;
                                    }
                                }
                                else {
                                    array[currentIndex + i] = -120;
                                }
                            }
                            else {
                                array[currentIndex + i] = -123;
                            }
                        }
                        else {
                            array[i + currentIndex] = -124;
                        }
                    }
                    else {
                        array[i + currentIndex] = -126;
                    }
                }
                else {
                    array[currentIndex + i] = -128;
                }
            }
            else {
                array[currentIndex + i] = (byte)char1;
            }
            ++i;
        }
        return length;
    }
    
    //original signature: final void a093(final int n, final int n2) {
    final void storeByte(final int n2) {
        this.buffer[this.currentIndex++] = (byte)n2;
    }
    
    //original signature: final void a884(final long n, final int n2) {
    final void storeLong5Byte(final long n) {
        this.buffer[this.currentIndex++] = (byte)(n >> 32);
        this.buffer[this.currentIndex++] = (byte)(n >> 24);
        this.buffer[this.currentIndex++] = (byte)(n >> 16);
        this.buffer[this.currentIndex++] = (byte)(n >> 8);
        this.buffer[this.currentIndex++] = (byte)n;
    }
    
    //original signature: final void a041(final int[] array, final boolean b) {
    final void a041(final int[] randomInts) {
        final int i = this.currentIndex / 8;
        this.currentIndex = 0;
        int n = 0;
        while (i > n) {
            int h137 = this.readInt();
            int h138 = this.readInt();
            int n2 = 0;
            final int n3 = -1640531527;
            int n4 = 32;
            while (n4-- > 0) {
                h137 += (h138 + (h138 << 4 ^ h138 >>> 5) ^ randomInts[0x3 & n2] + n2);
                n2 += n3;
                h138 += (h137 + (h137 >>> 5 ^ h137 << 4) ^ randomInts[0x43E00003 & n2 >>> 11] + n2);
            }
            this.currentIndex -= 8;
            this.storeInt(h137);
            this.storeInt(h138);
            ++n;
        }
    }
    
    //original signature: final void a627(final String s, final byte b) {
    final void encodeRSString(final String s) {
        long n = 0L;
        long n2 = 0L;
        final int length = s.length();
        for (int i = 19; i >= 0; --i) {
            n *= 38L;
            if (length > i) {
                final char char1 = s.charAt(i);
                if (char1 >= 'A' && 'Z' >= char1) {
                    n += char1 - '?';
                }
                else if ('a' <= char1 && 'z' >= char1) {
                    n += '\u0002' + char1 - 97;
                }
                else if (char1 < '0' || '9' < char1) {
                    ++n;
                }
                else {
                    n += '\u001c' + char1 - 48;
                }
            }
            if (i == 10) {
                n2 = n;
                n = 0L;
            }
        }
        this.storeLong7Byte(n);
        this.storeLong7Byte(n2);
    }
    
    //original signature: private final void a157(final long n, final byte b) {
    private final void storeLong7Byte(final long n) {
        this.buffer[this.currentIndex++] = (byte)(n >> 48);
        this.buffer[this.currentIndex++] = (byte)(n >> 40);
        this.buffer[this.currentIndex++] = (byte)(n >> 32);
        this.buffer[this.currentIndex++] = (byte)(n >> 24);
        this.buffer[this.currentIndex++] = (byte)(n >> 16);
        this.buffer[this.currentIndex++] = (byte)(n >> 8);
        this.buffer[this.currentIndex++] = (byte)n;
    }
    
    //original signature: final void g093(final int n, final int n2) {
    final void g093(final int n2) {
        while (this.currentIndex < n2) {
            this.buffer[this.currentIndex++] = 0;
        }
    }
    
    static final q_ g102(final int n) {
        final q_ q_ = new q_(ce_._x, tb_._i, hg_._t[0], fe_._g[0], jc_._f[n], jn_._k[0], ub_._q[0], uo_._b);
        sb_.a150();
        return q_;
    }
    
    final long b411(final byte b) {
        return (((long)this.readTribyte(-112) & 0xFFFFFFFFL) << 32) + (0xFFFFFFFFL & (long)this.readInt());
    }
    
    //original signature: final void a054(final int n, final long n2) {
    final void storeLong8Byte(final long n2) {
        this.buffer[this.currentIndex++] = (byte)(n2 >> 56);
        this.buffer[this.currentIndex++] = (byte)(n2 >> 48);
        this.buffer[this.currentIndex++] = (byte)(n2 >> 40);
        this.buffer[this.currentIndex++] = (byte)(n2 >> 32);
        this.buffer[this.currentIndex++] = (byte)(n2 >> 24);
        this.buffer[this.currentIndex++] = (byte)(n2 >> 16);
        this.buffer[this.currentIndex++] = (byte)(n2 >> 8);
        this.buffer[this.currentIndex++] = (byte)n2;
    }
    
    public static void i150() {
        ec_._n = null;
        ec_._k = null;
        ec_.waitingForTextString = null;
        ec_.text_benefits = null;
        ec_._i = null;
        ec_.basilisk = null;
        ec_._j = null;
    }
    
    //original signature: final int readInt(final int n) {
    final int readInt() {
        this.currentIndex += 4;
        return (this.buffer[this.currentIndex - 2] << 8 & 0xFF00) + ((this.buffer[this.currentIndex - 3] & 0xFF) << 16) + ((this.buffer[this.currentIndex - 4] << 24 & 0xFF000000) + (this.buffer[this.currentIndex - 1] & 0xFF));
    }
    
    //original signature: final int e410(final byte b) {
    //unsigned?
    final int readTribyte() {
        this.currentIndex += 3;
        int n = (this.buffer[this.currentIndex - 1] & 0xFF) + ((this.buffer[this.currentIndex - 3] & 0xFF) << 16) + ((this.buffer[this.currentIndex - 2] & 0xFF) << 8);
        if (n > 8388607) {
            n -= 16777216;
        }
        return n;
    }
    
    final void f093(final int n, final int n2) {
        if (n < ~n2 && n2 >= -64) {
            this.storeByte(64 + n2);
            return;
        }
        if (n2 < 16384 && -16384 <= n2) {
            this.storeShort(n2 + 49152);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    //original signature: final String a738(final int n) {
    final String readString() {
        if (this.buffer[this.currentIndex++] != 0) {
            throw new IllegalStateException("");
        }
        final int o = this.currentIndex;
        while (this.buffer[this.currentIndex++] != 0) {}
        final int n2 = this.currentIndex - o - 1;
        if (n2 == 0) {
            return "";
        }
        return mk_.a046(this.buffer, n2, o);
    }
    
    //original signature: final void a286(final byte b, final int n, final int n2, final byte[] array) {
    final void a286(final int n, final int n2, final byte[] array) {
        for (int n3 = n; n + n2 > n3; ++n3) {
            array[n3] = this.buffer[this.currentIndex++];
        }
    }
    
    static final void a302(final nh_ d, final boolean b) {
        d_._d = d;
        final byte[] a728 = gm_.a728("text_game_name", false);
        if (a728 != null) {
            ba_.text_game_name = dj_.a064(a728, b);
        }
        final byte[] a729 = gm_.a728("text_benefits,0", false);
        if (a729 != null) {
            qk_.text_benefits[0] = dj_.a064(a729, false);
        }
        final byte[] a730 = gm_.a728("text_benefits,1", false);
        if (null != a730) {
            qk_.text_benefits[1] = dj_.a064(a730, b);
        }
        final byte[] a731 = gm_.a728("text_benefits,2", false);
        if (a731 != null) {
            qk_.text_benefits[2] = dj_.a064(a731, false);
        }
        final byte[] a732 = gm_.a728("text_benefits,3", false);
        if (null != a732) {
            qk_.text_benefits[3] = dj_.a064(a732, false);
        }
        final byte[] a733 = gm_.a728("achievement_names,0", false);
        if (null != a733) {
            ce_.achievement_names[0] = dj_.a064(a733, false);
        }
        final byte[] a734 = gm_.a728("achievement_names,1", b);
        if (a734 != null) {
            ce_.achievement_names[1] = dj_.a064(a734, false);
        }
        final byte[] a735 = gm_.a728("achievement_names,2", false);
        if (a735 != null) {
            ce_.achievement_names[2] = dj_.a064(a735, false);
        }
        final byte[] a736 = gm_.a728("achievement_names,3", false);
        if (a736 != null) {
            ce_.achievement_names[3] = dj_.a064(a736, b);
        }
        final byte[] a737 = gm_.a728("achievement_names,4", b);
        if (a737 != null) {
            ce_.achievement_names[4] = dj_.a064(a737, false);
        }
        final byte[] a738 = gm_.a728("achievement_names,5", b);
        if (null != a738) {
            ce_.achievement_names[5] = dj_.a064(a738, false);
        }
        final byte[] a739 = gm_.a728("achievement_names,6", false);
        if (null != a739) {
            ce_.achievement_names[6] = dj_.a064(a739, false);
        }
        final byte[] a740 = gm_.a728("achievement_names,7", false);
        if (a740 != null) {
            ce_.achievement_names[7] = dj_.a064(a740, b);
        }
        final byte[] a741 = gm_.a728("achievement_names,8", false);
        if (a741 != null) {
            ce_.achievement_names[8] = dj_.a064(a741, b);
        }
        final byte[] a742 = gm_.a728("achievement_names,9", false);
        if (a742 != null) {
            ce_.achievement_names[9] = dj_.a064(a742, false);
        }
        final byte[] a743 = gm_.a728("achievement_names,10", b);
        if (a743 != null) {
            ce_.achievement_names[10] = dj_.a064(a743, false);
        }
        final byte[] a744 = gm_.a728("achievement_names,11", b);
        if (a744 != null) {
            ce_.achievement_names[11] = dj_.a064(a744, false);
        }
        final byte[] a745 = gm_.a728("achievement_names,12", false);
        if (null != a745) {
            ce_.achievement_names[12] = dj_.a064(a745, false);
        }
        final byte[] a746 = gm_.a728("achievement_names,13", false);
        if (a746 != null) {
            ce_.achievement_names[13] = dj_.a064(a746, false);
        }
        final byte[] a747 = gm_.a728("achievement_names,14", false);
        if (null != a747) {
            ce_.achievement_names[14] = dj_.a064(a747, false);
        }
        final byte[] a748 = gm_.a728("achievement_names,15", false);
        if (null != a748) {
            ce_.achievement_names[15] = dj_.a064(a748, false);
        }
        final byte[] a749 = gm_.a728("achievement_names,16", false);
        if (null != a749) {
            ce_.achievement_names[16] = dj_.a064(a749, b);
        }
        final byte[] a750 = gm_.a728("achievement_names,17", false);
        if (a750 != null) {
            ce_.achievement_names[17] = dj_.a064(a750, false);
        }
        final byte[] a751 = gm_.a728("achievement_names,18", b);
        if (null != a751) {
            ce_.achievement_names[18] = dj_.a064(a751, b);
        }
        final byte[] a752 = gm_.a728("achievement_names,19", false);
        if (a752 != null) {
            ce_.achievement_names[19] = dj_.a064(a752, b);
        }
        final byte[] a753 = gm_.a728("achievement_names,20", false);
        if (a753 != null) {
            ce_.achievement_names[20] = dj_.a064(a753, false);
        }
        final byte[] a754 = gm_.a728("achievement_names,21", false);
        if (null != a754) {
            ce_.achievement_names[21] = dj_.a064(a754, false);
        }
        final byte[] a755 = gm_.a728("achievement_names,22", false);
        if (a755 != null) {
            ce_.achievement_names[22] = dj_.a064(a755, false);
        }
        final byte[] a756 = gm_.a728("achievement_names,23", false);
        if (null != a756) {
            ce_.achievement_names[23] = dj_.a064(a756, b);
        }
        final byte[] a757 = gm_.a728("achievement_names,24", false);
        if (null != a757) {
            ce_.achievement_names[24] = dj_.a064(a757, false);
        }
        final byte[] a758 = gm_.a728("achievement_names,25", false);
        if (null != a758) {
            ce_.achievement_names[25] = dj_.a064(a758, false);
        }
        final byte[] a759 = gm_.a728("achievement_names,26", false);
        if (null != a759) {
            ce_.achievement_names[26] = dj_.a064(a759, false);
        }
        final byte[] a760 = gm_.a728("achievement_names,27", b);
        if (a760 != null) {
            ce_.achievement_names[27] = dj_.a064(a760, false);
        }
        final byte[] a761 = gm_.a728("achievement_names,28", false);
        if (null != a761) {
            ce_.achievement_names[28] = dj_.a064(a761, false);
        }
        final byte[] a762 = gm_.a728("achievement_names,29", false);
        if (null != a762) {
            ce_.achievement_names[29] = dj_.a064(a762, false);
        }
        final byte[] a763 = gm_.a728("achievement_names,30", b);
        if (a763 != null) {
            ce_.achievement_names[30] = dj_.a064(a763, false);
        }
        final byte[] a764 = gm_.a728("achievement_names,31", b);
        if (a764 != null) {
            ce_.achievement_names[31] = dj_.a064(a764, false);
        }
        final byte[] a765 = gm_.a728("achievement_names,32", false);
        if (null != a765) {
            ce_.achievement_names[32] = dj_.a064(a765, false);
        }
        final byte[] a766 = gm_.a728("achievement_names,33", false);
        if (a766 != null) {
            ce_.achievement_names[33] = dj_.a064(a766, false);
        }
        final byte[] a767 = gm_.a728("achievement_names,34", false);
        if (a767 != null) {
            ce_.achievement_names[34] = dj_.a064(a767, false);
        }
        final byte[] a768 = gm_.a728("achievement_names,35", b);
        if (a768 != null) {
            ce_.achievement_names[35] = dj_.a064(a768, false);
        }
        final byte[] a769 = gm_.a728("achievement_names,36", false);
        if (a769 != null) {
            ce_.achievement_names[36] = dj_.a064(a769, false);
        }
        final byte[] a770 = gm_.a728("achievement_names,37", false);
        if (null != a770) {
            ce_.achievement_names[37] = dj_.a064(a770, false);
        }
        final byte[] a771 = gm_.a728("achievement_names,38", b);
        if (null != a771) {
            ce_.achievement_names[38] = dj_.a064(a771, false);
        }
        final byte[] a772 = gm_.a728("achievement_names,39", b);
        if (a772 != null) {
            ce_.achievement_names[39] = dj_.a064(a772, b);
        }
        final byte[] a773 = gm_.a728("achievement_names,40", b);
        if (null != a773) {
            ce_.achievement_names[40] = dj_.a064(a773, false);
        }
        final byte[] a774 = gm_.a728("achievement_names,41", false);
        if (a774 != null) {
            ce_.achievement_names[41] = dj_.a064(a774, false);
        }
        final byte[] a775 = gm_.a728("achievement_names,42", false);
        if (a775 != null) {
            ce_.achievement_names[42] = dj_.a064(a775, b);
        }
        final byte[] a776 = gm_.a728("achievement_names,43", false);
        if (null != a776) {
            ce_.achievement_names[43] = dj_.a064(a776, false);
        }
        final byte[] a777 = gm_.a728("achievement_names,44", false);
        if (a777 != null) {
            ce_.achievement_names[44] = dj_.a064(a777, b);
        }
        final byte[] a778 = gm_.a728("achievement_names,45", b);
        if (null != a778) {
            ce_.achievement_names[45] = dj_.a064(a778, b);
        }
        final byte[] a779 = gm_.a728("achievement_criteria,0", false);
        if (a779 != null) {
            bb_.achievement_criteria[0] = dj_.a064(a779, false);
        }
        final byte[] a780 = gm_.a728("achievement_criteria,1", false);
        if (null != a780) {
            bb_.achievement_criteria[1] = dj_.a064(a780, false);
        }
        final byte[] a781 = gm_.a728("achievement_criteria,2", false);
        if (null != a781) {
            bb_.achievement_criteria[2] = dj_.a064(a781, false);
        }
        final byte[] a782 = gm_.a728("achievement_criteria,3", false);
        if (a782 != null) {
            bb_.achievement_criteria[3] = dj_.a064(a782, false);
        }
        final byte[] a783 = gm_.a728("achievement_criteria,4", b);
        if (null != a783) {
            bb_.achievement_criteria[4] = dj_.a064(a783, b);
        }
        final byte[] a784 = gm_.a728("achievement_criteria,5", b);
        if (a784 != null) {
            bb_.achievement_criteria[5] = dj_.a064(a784, false);
        }
        final byte[] a785 = gm_.a728("achievement_criteria,6", false);
        if (null != a785) {
            bb_.achievement_criteria[6] = dj_.a064(a785, false);
        }
        final byte[] a786 = gm_.a728("achievement_criteria,7", false);
        if (a786 != null) {
            bb_.achievement_criteria[7] = dj_.a064(a786, b);
        }
        final byte[] a787 = gm_.a728("achievement_criteria,8", false);
        if (a787 != null) {
            bb_.achievement_criteria[8] = dj_.a064(a787, b);
        }
        final byte[] a788 = gm_.a728("achievement_criteria,9", false);
        if (a788 != null) {
            bb_.achievement_criteria[9] = dj_.a064(a788, false);
        }
        final byte[] a789 = gm_.a728("achievement_criteria,10", b);
        if (null != a789) {
            bb_.achievement_criteria[10] = dj_.a064(a789, false);
        }
        final byte[] a790 = gm_.a728("achievement_criteria,11", b);
        if (a790 != null) {
            bb_.achievement_criteria[11] = dj_.a064(a790, b);
        }
        final byte[] a791 = gm_.a728("achievement_criteria,12", false);
        if (null != a791) {
            bb_.achievement_criteria[12] = dj_.a064(a791, false);
        }
        final byte[] a792 = gm_.a728("achievement_criteria,13", false);
        if (null != a792) {
            bb_.achievement_criteria[13] = dj_.a064(a792, b);
        }
        final byte[] a793 = gm_.a728("achievement_criteria,14", b);
        if (null != a793) {
            bb_.achievement_criteria[14] = dj_.a064(a793, false);
        }
        final byte[] a794 = gm_.a728("achievement_criteria,15", false);
        if (null != a794) {
            bb_.achievement_criteria[15] = dj_.a064(a794, b);
        }
        final byte[] a795 = gm_.a728("achievement_criteria,16", false);
        if (a795 != null) {
            bb_.achievement_criteria[16] = dj_.a064(a795, b);
        }
        final byte[] a796 = gm_.a728("achievement_criteria,17", false);
        if (a796 != null) {
            bb_.achievement_criteria[17] = dj_.a064(a796, false);
        }
        final byte[] a797 = gm_.a728("achievement_criteria,18", false);
        if (null != a797) {
            bb_.achievement_criteria[18] = dj_.a064(a797, false);
        }
        final byte[] a798 = gm_.a728("achievement_criteria,19", false);
        if (a798 != null) {
            bb_.achievement_criteria[19] = dj_.a064(a798, false);
        }
        final byte[] a799 = gm_.a728("achievement_criteria,20", false);
        if (null != a799) {
            bb_.achievement_criteria[20] = dj_.a064(a799, false);
        }
        final byte[] a800 = gm_.a728("achievement_criteria,21", false);
        if (null != a800) {
            bb_.achievement_criteria[21] = dj_.a064(a800, false);
        }
        final byte[] a801 = gm_.a728("achievement_criteria,22", false);
        if (a801 != null) {
            bb_.achievement_criteria[22] = dj_.a064(a801, false);
        }
        final byte[] a802 = gm_.a728("achievement_criteria,23", false);
        if (a802 != null) {
            bb_.achievement_criteria[23] = dj_.a064(a802, b);
        }
        final byte[] a803 = gm_.a728("achievement_criteria,24", false);
        if (null != a803) {
            bb_.achievement_criteria[24] = dj_.a064(a803, false);
        }
        final byte[] a804 = gm_.a728("achievement_criteria,25", b);
        if (null != a804) {
            bb_.achievement_criteria[25] = dj_.a064(a804, false);
        }
        final byte[] a805 = gm_.a728("achievement_criteria,26", false);
        if (a805 != null) {
            bb_.achievement_criteria[26] = dj_.a064(a805, false);
        }
        final byte[] a806 = gm_.a728("achievement_criteria,27", false);
        if (a806 != null) {
            bb_.achievement_criteria[27] = dj_.a064(a806, false);
        }
        final byte[] a807 = gm_.a728("achievement_criteria,28", false);
        if (a807 != null) {
            bb_.achievement_criteria[28] = dj_.a064(a807, false);
        }
        final byte[] a808 = gm_.a728("achievement_criteria,29", b);
        if (null != a808) {
            bb_.achievement_criteria[29] = dj_.a064(a808, false);
        }
        final byte[] a809 = gm_.a728("achievement_criteria,30", false);
        if (a809 != null) {
            bb_.achievement_criteria[30] = dj_.a064(a809, b);
        }
        final byte[] a810 = gm_.a728("achievement_criteria,31", false);
        if (a810 != null) {
            bb_.achievement_criteria[31] = dj_.a064(a810, false);
        }
        final byte[] a811 = gm_.a728("achievement_criteria,32", false);
        if (null != a811) {
            bb_.achievement_criteria[32] = dj_.a064(a811, false);
        }
        final byte[] a812 = gm_.a728("achievement_criteria,33", false);
        if (a812 != null) {
            bb_.achievement_criteria[33] = dj_.a064(a812, false);
        }
        final byte[] a813 = gm_.a728("achievement_criteria,34", false);
        if (null != a813) {
            bb_.achievement_criteria[34] = dj_.a064(a813, false);
        }
        final byte[] a814 = gm_.a728("achievement_criteria,35", false);
        if (a814 != null) {
            bb_.achievement_criteria[35] = dj_.a064(a814, false);
        }
        final byte[] a815 = gm_.a728("achievement_criteria,36", false);
        if (a815 != null) {
            bb_.achievement_criteria[36] = dj_.a064(a815, false);
        }
        final byte[] a816 = gm_.a728("achievement_criteria,37", false);
        if (null != a816) {
            bb_.achievement_criteria[37] = dj_.a064(a816, false);
        }
        final byte[] a817 = gm_.a728("achievement_criteria,38", false);
        if (a817 != null) {
            bb_.achievement_criteria[38] = dj_.a064(a817, false);
        }
        final byte[] a818 = gm_.a728("achievement_criteria,39", false);
        if (a818 != null) {
            bb_.achievement_criteria[39] = dj_.a064(a818, false);
        }
        final byte[] a819 = gm_.a728("achievement_criteria,40", false);
        if (a819 != null) {
            bb_.achievement_criteria[40] = dj_.a064(a819, b);
        }
        final byte[] a820 = gm_.a728("achievement_criteria,41", false);
        if (a820 != null) {
            bb_.achievement_criteria[41] = dj_.a064(a820, false);
        }
        final byte[] a821 = gm_.a728("achievement_criteria,42", false);
        if (null != a821) {
            bb_.achievement_criteria[42] = dj_.a064(a821, false);
        }
        final byte[] a822 = gm_.a728("achievement_criteria,43", false);
        if (null != a822) {
            bb_.achievement_criteria[43] = dj_.a064(a822, false);
        }
        final byte[] a823 = gm_.a728("achievement_criteria,44", false);
        if (a823 != null) {
            bb_.achievement_criteria[44] = dj_.a064(a823, false);
        }
        final byte[] a824 = gm_.a728("achievement_criteria,45", b);
        if (null != a824) {
            bb_.achievement_criteria[45] = dj_.a064(a824, false);
        }
        final byte[] a825 = gm_.a728("intro_captions,0", false);
        if (a825 != null) {
            qh_.intro_captions[0] = dj_.a064(a825, false);
        }
        final byte[] a826 = gm_.a728("intro_captions,1", false);
        if (null != a826) {
            qh_.intro_captions[1] = dj_.a064(a826, b);
        }
        final byte[] a827 = gm_.a728("intro_captions,2", false);
        if (null != a827) {
            qh_.intro_captions[2] = dj_.a064(a827, b);
        }
        final byte[] a828 = gm_.a728("intro_captions,3", b);
        if (null != a828) {
            qh_.intro_captions[3] = dj_.a064(a828, false);
        }
        final byte[] a829 = gm_.a728("intro_captions,4", false);
        if (null != a829) {
            qh_.intro_captions[4] = dj_.a064(a829, false);
        }
        final byte[] a830 = gm_.a728("intro_captions,5", false);
        if (a830 != null) {
            qh_.intro_captions[5] = dj_.a064(a830, false);
        }
        final byte[] a831 = gm_.a728("intro_captions,6", false);
        if (a831 != null) {
            qh_.intro_captions[6] = dj_.a064(a831, false);
        }
        final byte[] a832 = gm_.a728("intro_captions,7", b);
        if (a832 != null) {
            qh_.intro_captions[7] = dj_.a064(a832, false);
        }
        final byte[] a833 = gm_.a728("intro_captions,8", false);
        if (a833 != null) {
            qh_.intro_captions[8] = dj_.a064(a833, b);
        }
        final byte[] a834 = gm_.a728("instructions_pages,0", false);
        if (a834 != null) {
            en_.instructions_pages[0] = dj_.a064(a834, b);
        }
        final byte[] a835 = gm_.a728("instructions_pages,1", b);
        if (null != a835) {
            en_.instructions_pages[1] = dj_.a064(a835, false);
        }
        final byte[] a836 = gm_.a728("instructions_pages,2", b);
        if (null != a836) {
            en_.instructions_pages[2] = dj_.a064(a836, false);
        }
        final byte[] a837 = gm_.a728("instructions_pages,3", false);
        if (a837 != null) {
            en_.instructions_pages[3] = dj_.a064(a837, false);
        }
        final byte[] a838 = gm_.a728("instructions_pages,4", false);
        if (null != a838) {
            en_.instructions_pages[4] = dj_.a064(a838, false);
        }
        final byte[] a839 = gm_.a728("instructions_pages,5", false);
        if (a839 != null) {
            en_.instructions_pages[5] = dj_.a064(a839, false);
        }
        final byte[] a840 = gm_.a728("instructions_pages,6", false);
        if (a840 != null) {
            en_.instructions_pages[6] = dj_.a064(a840, b);
        }
        final byte[] a841 = gm_.a728("instructions_pages,7", b);
        if (a841 != null) {
            en_.instructions_pages[7] = dj_.a064(a841, false);
        }
        final byte[] a842 = gm_.a728("instructions_monsterroom", false);
        if (a842 != null) {
            uj_.instructions_monsterroom = dj_.a064(a842, false);
        }
        final byte[] a843 = gm_.a728("instructions_traproom", false);
        if (null != a843) {
            an_.instructions_traproom = dj_.a064(a843, b);
        }
        final byte[] a844 = gm_.a728("instructions_guardianroom", false);
        if (a844 != null) {
            sg_.instructions_guardianroom = dj_.a064(a844, false);
        }
        final byte[] a845 = gm_.a728("instructions_subtitles_text,0", false);
        if (null != a845) {
            ie_.instructions_subtitles_text[0] = dj_.a064(a845, false);
        }
        final byte[] a846 = gm_.a728("instructions_subtitles_text,1", false);
        if (null != a846) {
            ie_.instructions_subtitles_text[1] = dj_.a064(a846, false);
        }
        final byte[] a847 = gm_.a728("instructions_subtitles_text,2", false);
        if (a847 != null) {
            ie_.instructions_subtitles_text[2] = dj_.a064(a847, b);
        }
        final byte[] a848 = gm_.a728("instructions_subtitles_text,3", b);
        if (null != a848) {
            ie_.instructions_subtitles_text[3] = dj_.a064(a848, false);
        }
        final byte[] a849 = gm_.a728("instructions_subtitles_text,4", false);
        if (a849 != null) {
            ie_.instructions_subtitles_text[4] = dj_.a064(a849, false);
        }
        final byte[] a850 = gm_.a728("instructions_subtitles_text,5", false);
        if (a850 != null) {
            ie_.instructions_subtitles_text[5] = dj_.a064(a850, false);
        }
        final byte[] a851 = gm_.a728("instructions_subtitles_text,6", b);
        if (null != a851) {
            ie_.instructions_subtitles_text[6] = dj_.a064(a851, false);
        }
        final byte[] a852 = gm_.a728("instructions_subtitles_text,7", false);
        if (a852 != null) {
            ie_.instructions_subtitles_text[7] = dj_.a064(a852, false);
        }
        final byte[] a853 = gm_.a728("tutorial_welcome1,0", false);
        if (a853 != null) {
            bh_.tutorial_welcome1[0] = dj_.a064(a853, false);
        }
        final byte[] a854 = gm_.a728("tutorial_welcome1,1", false);
        if (a854 != null) {
            bh_.tutorial_welcome1[1] = dj_.a064(a854, b);
        }
        final byte[] a855 = gm_.a728("tutorial_welcome2,0", b);
        if (null != a855) {
            nf_.tutorial_welcome2[0] = dj_.a064(a855, false);
        }
        final byte[] a856 = gm_.a728("tutorial_welcome2,1", false);
        if (null != a856) {
            nf_.tutorial_welcome2[1] = dj_.a064(a856, false);
        }
        final byte[] a857 = gm_.a728("tutorial_raiding1,1", b);
        if (null != a857) {
            rl_.tutorial_raiding1[1] = dj_.a064(a857, false);
        }
        final byte[] a858 = gm_.a728("tutorial_raiding2,0", b);
        if (null != a858) {
            co_.tutorial_raiding2[0] = dj_.a064(a858, b);
        }
        final byte[] a859 = gm_.a728("tutorial_raiding2,1", false);
        if (a859 != null) {
            co_.tutorial_raiding2[1] = dj_.a064(a859, false);
        }
        final byte[] a860 = gm_.a728("tutorial_raiders1,1", false);
        if (a860 != null) {
            DungeonBuilder.tutorial_raiders1[1] = dj_.a064(a860, b);
        }
        final byte[] a861 = gm_.a728("tutorial_raiders2,1", b);
        if (null != a861) {
            je_.tutorial_raiders2[1] = dj_.a064(a861, false);
        }
        final byte[] a862 = gm_.a728("tutorial_raiders3,1", b);
        if (a862 != null) {
            og_.tutorial_raiders3[1] = dj_.a064(a862, false);
        }
        final byte[] a863 = gm_.a728("tutorial_raiders4,0", false);
        if (null != a863) {
            Raider.tutorial_raiders4[0] = dj_.a064(a863, b);
        }
        final byte[] a864 = gm_.a728("tutorial_raiders4,1", false);
        if (a864 != null) {
            Raider.tutorial_raiders4[1] = dj_.a064(a864, b);
        }
        final byte[] a865 = gm_.a728("tutorial_rooms1,0", b);
        if (null != a865) {
            pp_.tutorial_rooms1[0] = dj_.a064(a865, false);
        }
        final byte[] a866 = gm_.a728("tutorial_rooms1,1", b);
        if (null != a866) {
            pp_.tutorial_rooms1[1] = dj_.a064(a866, b);
        }
        final byte[] a867 = gm_.a728("tutorial_rooms2,1", b);
        if (a867 != null) {
            np_.tutorial_rooms2[1] = dj_.a064(a867, false);
        }
        final byte[] a868 = gm_.a728("tutorial_firstroom1a,0", b);
        if (a868 != null) {
            eg_.tutorial_firstroom1a[0] = dj_.a064(a868, b);
        }
        final byte[] a869 = gm_.a728("tutorial_firstroom1a,1", b);
        if (null != a869) {
            eg_.tutorial_firstroom1a[1] = dj_.a064(a869, false);
        }
        final byte[] a870 = gm_.a728("tutorial_firstroom1b,0", false);
        if (null != a870) {
            bn_.tutorial_firstroom1b[0] = dj_.a064(a870, b);
        }
        final byte[] a871 = gm_.a728("tutorial_firstroom1b,1", false);
        if (a871 != null) {
            bn_.tutorial_firstroom1b[1] = dj_.a064(a871, false);
        }
        final byte[] a872 = gm_.a728("tutorial_firstroom2,1", false);
        if (a872 != null) {
            lp_.tutorial_firstroom2[1] = dj_.a064(a872, false);
        }
        final byte[] a873 = gm_.a728("tutorial_monster1,0", b);
        if (a873 != null) {
            rl_.tutorial_monster1[0] = dj_.a064(a873, false);
        }
        final byte[] a874 = gm_.a728("tutorial_monster1,1", false);
        if (null != a874) {
            rl_.tutorial_monster1[1] = dj_.a064(a874, false);
        }
        final byte[] a875 = gm_.a728("tutorial_monster2,1", false);
        if (a875 != null) {
            PlayerInformation.tutorial_monster2[1] = dj_.a064(a875, false);
        }
        final byte[] a876 = gm_.a728("tutorial_monster3,1", false);
        if (a876 != null) {
            le_.tutorial_monster3[1] = dj_.a064(a876, b);
        }
        final byte[] a877 = gm_.a728("tutorial_strategies1,0", b);
        if (null != a877) {
            tp_.tutorial_strategies1[0] = dj_.a064(a877, false);
        }
        final byte[] a878 = gm_.a728("tutorial_strategies1,1", false);
        if (null != a878) {
            tp_.tutorial_strategies1[1] = dj_.a064(a878, false);
        }
        final byte[] a879 = gm_.a728("tutorial_strategies2,1", false);
        if (a879 != null) {
            lp_.tutorial_strategies2[1] = dj_.a064(a879, b);
        }
        final byte[] a880 = gm_.a728("tutorial_strategies3,1", false);
        if (null != a880) {
            nl_.tutorial_strategies3[1] = dj_.a064(a880, false);
        }
        final byte[] a881 = gm_.a728("tutorial_strategies4,1", false);
        if (null != a881) {
            ll_.tutorial_strategies4[1] = dj_.a064(a881, b);
        }
        final byte[] a882 = gm_.a728("tutorial_trap1,0", false);
        if (null != a882) {
            bb_.tutorial_trap1[0] = dj_.a064(a882, false);
        }
        final byte[] a883 = gm_.a728("tutorial_trap1,1", false);
        if (a883 != null) {
            bb_.tutorial_trap1[1] = dj_.a064(a883, b);
        }
        final byte[] a884 = gm_.a728("tutorial_trap2,1", false);
        if (null != a884) {
            ka_.tutorial_trap2[1] = dj_.a064(a884, false);
        }
        final byte[] a885 = gm_.a728("tutorial_guardian1,0", false);
        if (a885 != null) {
            Animation.tutorial_guardian1[0] = dj_.a064(a885, false);
        }
        final byte[] a886 = gm_.a728("tutorial_guardian1,1", false);
        if (null != a886) {
            Animation.tutorial_guardian1[1] = dj_.a064(a886, b);
        }
        final byte[] a887 = gm_.a728("tutorial_guardian2,1", b);
        if (a887 != null) {
            bk_.tutorial_guardian2[1] = dj_.a064(a887, b);
        }
        final byte[] a888 = gm_.a728("tutorial_victory,0", false);
        if (a888 != null) {
            hj_.tutorial_victory[0] = dj_.a064(a888, b);
        }
        final byte[] a889 = gm_.a728("tutorial_victory,1", false);
        if (a889 != null) {
            hj_.tutorial_victory[1] = dj_.a064(a889, false);
        }
        final byte[] a890 = gm_.a728("tutorial_defeat,0", false);
        if (a890 != null) {
            ek_.tutorial_defeat[0] = dj_.a064(a890, b);
        }
        final byte[] a891 = gm_.a728("tutorial_defeat,1", b);
        if (null != a891) {
            ek_.tutorial_defeat[1] = dj_.a064(a891, b);
        }
        final byte[] a892 = gm_.a728("tutorial_defeat_repeated,0", b);
        if (null != a892) {
            rm_.tutorial_defeat_repeated[0] = dj_.a064(a892, b);
        }
        final byte[] a893 = gm_.a728("tutorial_defeat_repeated,1", b);
        if (null != a893) {
            rm_.tutorial_defeat_repeated[1] = dj_.a064(a893, false);
        }
        final byte[] a894 = gm_.a728("tutorial_death,0", false);
        if (null != a894) {
            wl_.tutorial_death[0] = dj_.a064(a894, false);
        }
        final byte[] a895 = gm_.a728("tutorial_death,1", b);
        if (a895 != null) {
            wl_.tutorial_death[1] = dj_.a064(a895, false);
        }
        final byte[] a896 = gm_.a728("tutorial_hoardroom,0", false);
        if (null != a896) {
            ha_.tutorial_hoardroom[0] = dj_.a064(a896, false);
        }
        final byte[] a897 = gm_.a728("tutorial_hoardroom,1", false);
        if (null != a897) {
            ha_.tutorial_hoardroom[1] = dj_.a064(a897, false);
        }
        final byte[] a898 = gm_.a728("tutorial_abilities,0", false);
        if (null != a898) {
            qa_.tutorial_abilities[0] = dj_.a064(a898, false);
        }
        final byte[] a899 = gm_.a728("tutorial_abilities,1", false);
        if (a899 != null) {
            qa_.tutorial_abilities[1] = dj_.a064(a899, b);
        }
        final byte[] a900 = gm_.a728("tutorial_modifiers,0", b);
        if (a900 != null) {
            tl_.tutorial_modifiers[0] = dj_.a064(a900, false);
        }
        final byte[] a901 = gm_.a728("tutorial_modifiers,1", b);
        if (a901 != null) {
            tl_.tutorial_modifiers[1] = dj_.a064(a901, false);
        }
        final byte[] a902 = gm_.a728("tutorial_raid_complete,0", false);
        if (null != a902) {
            ug_.tutorial_raid_complete[0] = dj_.a064(a902, b);
        }
        final byte[] a903 = gm_.a728("tutorial_raid_complete,1", false);
        if (a903 != null) {
            ug_.tutorial_raid_complete[1] = dj_.a064(a903, false);
        }
        final byte[] a904 = gm_.a728("tutorial_construction1,0", b);
        if (a904 != null) {
            qh_.tutorial_construction1[0] = dj_.a064(a904, false);
        }
        final byte[] a905 = gm_.a728("tutorial_construction1,1", false);
        if (null != a905) {
            qh_.tutorial_construction1[1] = dj_.a064(a905, false);
        }
        final byte[] a906 = gm_.a728("tutorial_construction2,1", false);
        if (null != a906) {
            dg_.tutorial_construction2[1] = dj_.a064(a906, b);
        }
        final byte[] a907 = gm_.a728("tutorial_placeroom1,1", false);
        if (a907 != null) {
            tg_.tutorial_placeroom1[1] = dj_.a064(a907, false);
        }
        final byte[] a908 = gm_.a728("tutorial_placeroom2,1", b);
        if (null != a908) {
            uo_.tutorial_placeroom2[1] = dj_.a064(a908, false);
        }
        final byte[] a909 = gm_.a728("tutorial_stable1,0", false);
        if (null != a909) {
            hh_.tutorial_stable1[0] = dj_.a064(a909, false);
        }
        final byte[] a910 = gm_.a728("tutorial_stable1,1", false);
        if (null != a910) {
            hh_.tutorial_stable1[1] = dj_.a064(a910, b);
        }
        final byte[] a911 = gm_.a728("tutorial_stable2,1", false);
        if (null != a911) {
            fj_.tutorial_stable2[1] = dj_.a064(a911, false);
        }
        final byte[] a912 = gm_.a728("tutorial_stable3,1", false);
        if (null != a912) {
            k_.tutorial_stable3[1] = dj_.a064(a912, false);
        }
        final byte[] a913 = gm_.a728("tutorial_stable_noraider,1", false);
        if (a913 != null) {
            rn_.tutorial_stable_noraider[1] = dj_.a064(a913, false);
        }
        final byte[] a914 = gm_.a728("tutorial_end_justplay,0", b);
        if (null != a914) {
            kg_.tutorial_end_justplay[0] = dj_.a064(a914, false);
        }
        final byte[] a915 = gm_.a728("tutorial_end_justplay,1", false);
        if (a915 != null) {
            kg_.tutorial_end_justplay[1] = dj_.a064(a915, false);
        }
        final byte[] a916 = gm_.a728("tutorial_dragonsofrenown1,0", false);
        if (a916 != null) {
            vf_.tutorial_dragonsofrenown1[0] = dj_.a064(a916, false);
        }
        final byte[] a917 = gm_.a728("tutorial_dragonsofrenown1,1", b);
        if (a917 != null) {
            vf_.tutorial_dragonsofrenown1[1] = dj_.a064(a917, false);
        }
        final byte[] a918 = gm_.a728("tutorial_dragonsofrenown2,1", false);
        if (a918 != null) {
            qd_.tutorial_dragonsofrenown2[1] = dj_.a064(a918, b);
        }
        final byte[] a919 = gm_.a728("tutorial_dragonsofrenown3,1", false);
        if (a919 != null) {
            rk_.tutorial_dragonsofrenown3[1] = dj_.a064(a919, false);
        }
        final byte[] a920 = gm_.a728("tutorial_dragonsofrenown4,1", false);
        if (null != a920) {
            un_.tutorial_dragonsofrenown4[1] = dj_.a064(a920, false);
        }
        final byte[] a921 = gm_.a728("tutorial_selectraiders,1", b);
        if (a921 != null) {
            tp_.tutorial_selectraiders[1] = dj_.a064(a921, b);
        }
        final byte[] a922 = gm_.a728("tutorial_justplay_warning", b);
        if (null != a922) {
            ub_.tutorial_justplay_warning = dj_.a064(a922, false);
        }
        final byte[] a923 = gm_.a728("goblin_runt", b);
        if (null != a923) {
            d_.goblin_runt = dj_.a064(a923, b);
        }
        final byte[] a924 = gm_.a728("saurus_spawn", false);
        if (null != a924) {
            ng_.saurus_spawn = dj_.a064(a924, false);
        }
        final byte[] a925 = gm_.a728("goblin_cleaver", false);
        if (null != a925) {
            ub_.goblin_cleaver = dj_.a064(a925, false);
        }
        final byte[] a926 = gm_.a728("orc_warrior", false);
        if (null != a926) {
            gj_.orc_warrior = dj_.a064(a926, false);
        }
        final byte[] a927 = gm_.a728("witch", false);
        if (a927 != null) {
            ml_.witch = dj_.a064(a927, false);
        }
        final byte[] a928 = gm_.a728("beastman", b);
        if (null != a928) {
            DungeonAssault.beastman = dj_.a064(a928, b);
        }
        final byte[] a929 = gm_.a728("saurus_slink", false);
        if (a929 != null) {
            fb_.saurus_slink = dj_.a064(a929, b);
        }
        final byte[] a930 = gm_.a728("mercenary_knight", false);
        if (a930 != null) {
            jl_.mercenary_knight = dj_.a064(a930, false);
        }
        final byte[] a931 = gm_.a728("priest", false);
        if (null != a931) {
            jk_.priest = dj_.a064(a931, false);
        }
        final byte[] a932 = gm_.a728("orc_blademaster", false);
        if (null != a932) {
            dc_.orc_blademaster = dj_.a064(a932, false);
        }
        final byte[] a933 = gm_.a728("goblin_scout", false);
        if (null != a933) {
            dn_.goblin_scout = dj_.a064(a933, false);
        }
        final byte[] a934 = gm_.a728("necromancer", false);
        if (null != a934) {
            df_.necromancer = dj_.a064(a934, b);
        }
        final byte[] a935 = gm_.a728("ogre_thug", false);
        if (a935 != null) {
            lf_.ogre_thug = dj_.a064(a935, false);
        }
        final byte[] a936 = gm_.a728("enchantress", false);
        if (null != a936) {
            ok_.enchantress = dj_.a064(a936, false);
        }
        final byte[] a937 = gm_.a728("saurus_warrior", false);
        if (null != a937) {
            sd_.saurus_warrior = dj_.a064(a937, false);
        }
        final byte[] a938 = gm_.a728("orc_shaman", false);
        if (null != a938) {
            ik_.orc_shaman = dj_.a064(a938, false);
        }
        final byte[] a939 = gm_.a728("cave_troll", false);
        if (a939 != null) {
            ua_.cave_troll = dj_.a064(a939, false);
        }
        final byte[] a940 = gm_.a728("northman_ranger", false);
        if (a940 != null) {
            oa_.northman_ranger = dj_.a064(a940, false);
        }
        final byte[] a941 = gm_.a728("dwarf_renegade", false);
        if (null != a941) {
            ae_.dwarf_renegade = dj_.a064(a941, false);
        }
        final byte[] a942 = gm_.a728("thief", false);
        if (null != a942) {
            o_.thief = dj_.a064(a942, false);
        }
        final byte[] a943 = gm_.a728("zealot", false);
        if (a943 != null) {
            bo_.zealot = dj_.a064(a943, b);
        }
        final byte[] a944 = gm_.a728("dark_elf_assassin", false);
        if (a944 != null) {
            op_.dark_elf_assassin = dj_.a064(a944, false);
        }
        final byte[] a945 = gm_.a728("berserker", false);
        if (null != a945) {
            lf_.berserker = dj_.a064(a945, false);
        }
        final byte[] a946 = gm_.a728("ogre_brute", false);
        if (a946 != null) {
            sp_.ogre_brute = dj_.a064(a946, false);
        }
        final byte[] a947 = gm_.a728("spy", false);
        if (a947 != null) {
            hp_.spy = dj_.a064(a947, b);
        }
        final byte[] a948 = gm_.a728("shapeshifter", false);
        if (null != a948) {
            mp_.shapeshifter = dj_.a064(a948, false);
        }
        final byte[] a949 = gm_.a728("black_knight", b);
        if (a949 != null) {
            ro_.black_knight = dj_.a064(a949, false);
        }
        final byte[] a950 = gm_.a728("minotaur", false);
        if (a950 != null) {
            uf_.minotaur = dj_.a064(a950, b);
        }
        final byte[] a951 = gm_.a728("warlock", false);
        if (null != a951) {
            kf_.warlock = dj_.a064(a951, b);
        }
        final byte[] a952 = gm_.a728("death_knight", b);
        if (a952 != null) {
            Tooltip.death_knight = dj_.a064(a952, b);
        }
        final byte[] a953 = gm_.a728("chaos_champion", false);
        if (a953 != null) {
            ih_.chaos_champion = dj_.a064(a953, b);
        }
        final byte[] a954 = gm_.a728("centaur", false);
        if (a954 != null) {
            gh_.centaur = dj_.a064(a954, b);
        }
        final byte[] a955 = gm_.a728("daemonette", false);
        if (a955 != null) {
            sg_.daemonette = dj_.a064(a955, false);
        }
        final byte[] a956 = gm_.a728("dryad", false);
        if (null != a956) {
            lm_.dryad = dj_.a064(a956, false);
        }
        final byte[] a957 = gm_.a728("none", false);
        if (null != a957) {
            ic_.none = dj_.a064(a957, false);
        }
        final byte[] a958 = gm_.a728("unknown", false);
        if (a958 != null) {
            ie_.unknown = dj_.a064(a958, b);
        }
        final byte[] a959 = gm_.a728("hoard", false);
        if (null != a959) {
            cm_.hoard = dj_.a064(a959, false);
        }
        final byte[] a960 = gm_.a728("entrance", b);
        if (null != a960) {
            wi_.entrance = dj_.a064(a960, b);
        }
        final byte[] a961 = gm_.a728("pit", false);
        if (a961 != null) {
            go_.pit = dj_.a064(a961, false);
        }
        final byte[] a962 = gm_.a728("snakes", b);
        if (a962 != null) {
            ce_.snakes = dj_.a064(a962, false);
        }
        final byte[] a963 = gm_.a728("nails", false);
        if (a963 != null) {
            i_.nails = dj_.a064(a963, false);
        }
        final byte[] a964 = gm_.a728("hidden_pit", false);
        if (null != a964) {
            oh_.hidden_pit = dj_.a064(a964, b);
        }
        final byte[] a965 = gm_.a728("teleport", b);
        if (a965 != null) {
            ld_.teleport = dj_.a064(a965, false);
        }
        final byte[] a966 = gm_.a728("hidden_nails", b);
        if (null != a966) {
            nm_.hidden_nails = dj_.a064(a966, false);
        }
        final byte[] a967 = gm_.a728("bottomless_pit", false);
        if (null != a967) {
            dd_.bottomless_pit = dj_.a064(a967, false);
        }
        final byte[] a968 = gm_.a728("crusher", false);
        if (null != a968) {
            ll_.crusher = dj_.a064(a968, false);
        }
        final byte[] a969 = gm_.a728("hidden_darts", false);
        if (a969 != null) {
            sm_.hidden_darts = dj_.a064(a969, false);
        }
        final byte[] a970 = gm_.a728("whirling_blades", false);
        if (null != a970) {
            fg_.whirling_blades = dj_.a064(a970, false);
        }
        final byte[] a971 = gm_.a728("poison_gas", false);
        if (null != a971) {
            ea_.poison_gas = dj_.a064(a971, b);
        }
        final byte[] a972 = gm_.a728("giant_rats", false);
        if (null != a972) {
            cp_.giant_rats = dj_.a064(a972, b);
        }
        final byte[] a973 = gm_.a728("rot_worms", false);
        if (null != a973) {
            cb_.rot_worms = dj_.a064(a973, false);
        }
        final byte[] a974 = gm_.a728("troglodytes", false);
        if (null != a974) {
            jb_.troglodytes = dj_.a064(a974, false);
        }
        final byte[] a975 = gm_.a728("giant_snake", false);
        if (a975 != null) {
            wi_.giant_snake = dj_.a064(a975, false);
        }
        final byte[] a976 = gm_.a728("giant_spider", false);
        if (null != a976) {
            pd_.giant_spider = dj_.a064(a976, b);
        }
        final byte[] a977 = gm_.a728("skeleton_sentinels", false);
        if (a977 != null) {
            hg_.skeleton_sentinels = dj_.a064(a977, b);
        }
        final byte[] a978 = gm_.a728("corrosive_slime", false);
        if (null != a978) {
            gi_.corrosive_slime = dj_.a064(a978, false);
        }
        final byte[] a979 = gm_.a728("razor_construct", b);
        if (a979 != null) {
            jj_.razor_construct = dj_.a064(a979, false);
        }
        final byte[] a980 = gm_.a728("rabid_wolf", b);
        if (a980 != null) {
            g_.rabid_wolf = dj_.a064(a980, b);
        }
        final byte[] a981 = gm_.a728("vampire_bats", false);
        if (a981 != null) {
            sf_.vampire_bats = dj_.a064(a981, false);
        }
        final byte[] a982 = gm_.a728("imp", b);
        if (a982 != null) {
            jb_.imp = dj_.a064(a982, false);
        }
        final byte[] a983 = gm_.a728("stone_golem", false);
        if (a983 != null) {
            wf_.stone_golem = dj_.a064(a983, false);
        }
        final byte[] a984 = gm_.a728("spectre", false);
        if (null != a984) {
            ih_.spectre = dj_.a064(a984, false);
        }
        final byte[] a985 = gm_.a728("banshee", false);
        if (a985 != null) {
            cc_.banshee = dj_.a064(a985, b);
        }
        final byte[] a986 = gm_.a728("raging_beast", b);
        if (null != a986) {
            RaidMember.raging_beast = dj_.a064(a986, b);
        }
        final byte[] a987 = gm_.a728("basilisk", b);
        if (null != a987) {
            ec_.basilisk = dj_.a064(a987, b);
        }
        final byte[] a988 = gm_.a728("pit_demon", false);
        if (null != a988) {
            kk_.pit_demon = dj_.a064(a988, b);
        }
        final byte[] a989 = gm_.a728("vampire_lord", false);
        if (null != a989) {
            ea_.vampire_lord = dj_.a064(a989, false);
        }
        final byte[] a990 = gm_.a728("hell_beast", false);
        if (a990 != null) {
            kf_.hell_beast = dj_.a064(a990, b);
        }
        final byte[] a991 = gm_.a728("demon_lord", false);
        if (a991 != null) {
            gj_.demon_lord = dj_.a064(a991, false);
        }
        final byte[] a992 = gm_.a728("tripwire_bell", b);
        if (a992 != null) {
            mi_.tripwire_bell = dj_.a064(a992, b);
        }
        final byte[] a993 = gm_.a728("hall_of_glass", b);
        if (null != a993) {
            nj_.hall_of_glass = dj_.a064(a993, false);
        }
        final byte[] a994 = gm_.a728("magical_guardian_room", false);
        if (null != a994) {
            ll_.magical_guardian_room = dj_.a064(a994, false);
        }
        final byte[] a995 = gm_.a728("desc_goblin_runt", false);
        if (a995 != null) {
            nm_.desc_goblin_runt = dj_.a064(a995, false);
        }
        final byte[] a996 = gm_.a728("desc_saurus_spawn", false);
        if (a996 != null) {
            a_.desc_saurus_spawn = dj_.a064(a996, false);
        }
        final byte[] a997 = gm_.a728("desc_goblin_cleaver", false);
        if (null != a997) {
            mm_.desc_goblin_cleaver = dj_.a064(a997, false);
        }
        final byte[] a998 = gm_.a728("desc_orc_warrior", false);
        if (a998 != null) {
            fm_.desc_orc_warrior = dj_.a064(a998, false);
        }
        final byte[] a999 = gm_.a728("desc_witch", b);
        if (a999 != null) {
            fj_.desc_witch = dj_.a064(a999, false);
        }
        final byte[] a1000 = gm_.a728("desc_beastman", false);
        if (null != a1000) {
            gh_.desc_beastman = dj_.a064(a1000, false);
        }
        final byte[] a1001 = gm_.a728("desc_saurus_slink", false);
        if (a1001 != null) {
            in_.desc_saurus_slink = dj_.a064(a1001, b);
        }
        final byte[] a1002 = gm_.a728("desc_mercenary_knight", false);
        if (null != a1002) {
            hj_.desc_mercenary_knight = dj_.a064(a1002, b);
        }
        final byte[] a1003 = gm_.a728("desc_priest", false);
        if (null != a1003) {
            fc_.desc_priest = dj_.a064(a1003, false);
        }
        final byte[] a1004 = gm_.a728("desc_orc_blademaster", b);
        if (a1004 != null) {
            tb_.desc_orc_blademaster = dj_.a064(a1004, false);
        }
        final byte[] a1005 = gm_.a728("desc_goblin_scout", false);
        if (null != a1005) {
            uc_.desc_goblin_scout = dj_.a064(a1005, b);
        }
        final byte[] a1006 = gm_.a728("desc_necromancer", false);
        if (a1006 != null) {
            lg_.desc_necromancer = dj_.a064(a1006, false);
        }
        final byte[] a1007 = gm_.a728("desc_ogre_thug", false);
        if (null != a1007) {
            ba_.desc_ogre_thug = dj_.a064(a1007, b);
        }
        final byte[] a1008 = gm_.a728("desc_enchantress", false);
        if (a1008 != null) {
            a_.desc_enchantress = dj_.a064(a1008, false);
        }
        final byte[] a1009 = gm_.a728("desc_saurus_warrior", false);
        if (null != a1009) {
            df_.desc_saurus_warrior = dj_.a064(a1009, false);
        }
        final byte[] a1010 = gm_.a728("desc_orc_shaman", false);
        if (a1010 != null) {
            ik_.desc_orc_shaman = dj_.a064(a1010, false);
        }
        final byte[] a1011 = gm_.a728("desc_cave_troll", b);
        if (null != a1011) {
            Raider.desc_cave_troll = dj_.a064(a1011, false);
        }
        final byte[] a1012 = gm_.a728("desc_northman_ranger", false);
        if (a1012 != null) {
            oe_.desc_northman_ranger = dj_.a064(a1012, false);
        }
        final byte[] a1013 = gm_.a728("desc_dwarf_renegade", false);
        if (a1013 != null) {
            ta_.desc_dwarf_renegade = dj_.a064(a1013, false);
        }
        final byte[] a1014 = gm_.a728("desc_thief", false);
        if (a1014 != null) {
            Room.desc_thief = dj_.a064(a1014, b);
        }
        final byte[] a1015 = gm_.a728("desc_zealot", false);
        if (a1015 != null) {
            WarningMessage.desc_zealot = dj_.a064(a1015, false);
        }
        final byte[] a1016 = gm_.a728("desc_dark_elf_assassin", false);
        if (a1016 != null) {
            he_.desc_dark_elf_assassin = dj_.a064(a1016, false);
        }
        final byte[] a1017 = gm_.a728("desc_berserker", b);
        if (a1017 != null) {
            gh_.desc_berserker = dj_.a064(a1017, false);
        }
        final byte[] a1018 = gm_.a728("desc_ogre_brute", false);
        if (a1018 != null) {
            dk_.desc_ogre_brute = dj_.a064(a1018, false);
        }
        final byte[] a1019 = gm_.a728("desc_spy", false);
        if (a1019 != null) {
            hc_.desc_spy = dj_.a064(a1019, b);
        }
        final byte[] a1020 = gm_.a728("desc_shapeshifter", b);
        if (a1020 != null) {
            eb_.desc_shapeshifter = dj_.a064(a1020, false);
        }
        final byte[] a1021 = gm_.a728("desc_black_knight", false);
        if (a1021 != null) {
            ql_.desc_black_knight = dj_.a064(a1021, false);
        }
        final byte[] a1022 = gm_.a728("desc_minotaur", false);
        if (a1022 != null) {
            jm_.desc_minotaur = dj_.a064(a1022, b);
        }
        final byte[] a1023 = gm_.a728("desc_warlock", false);
        if (null != a1023) {
            qi_.desc_warlock = dj_.a064(a1023, false);
        }
        final byte[] a1024 = gm_.a728("desc_death_knight", false);
        if (null != a1024) {
            kj_.desc_death_knight = dj_.a064(a1024, false);
        }
        final byte[] a1025 = gm_.a728("desc_chaos_champion", false);
        if (null != a1025) {
            no_.desc_chaos_champion = dj_.a064(a1025, b);
        }
        final byte[] a1026 = gm_.a728("desc_centaur", false);
        if (null != a1026) {
            oo_.desc_centaur = dj_.a064(a1026, false);
        }
        final byte[] a1027 = gm_.a728("desc_daemonette", b);
        if (a1027 != null) {
            vk_.desc_daemonette = dj_.a064(a1027, false);
        }
        final byte[] a1028 = gm_.a728("desc_dryad", b);
        if (a1028 != null) {
            jd_.desc_dryad = dj_.a064(a1028, false);
        }
        final byte[] a1029 = gm_.a728("desc_none", false);
        if (a1029 != null) {
            nh_.desc_none = dj_.a064(a1029, b);
        }
        final byte[] a1030 = gm_.a728("desc_unknown", false);
        if (a1030 != null) {
            s_.desc_unknown = dj_.a064(a1030, false);
        }
        final byte[] a1031 = gm_.a728("desc_pit", false);
        if (null != a1031) {
            um_.desc_pit = dj_.a064(a1031, false);
        }
        final byte[] a1032 = gm_.a728("desc_snakes", false);
        if (a1032 != null) {
            fj_.desc_snakes = dj_.a064(a1032, false);
        }
        final byte[] a1033 = gm_.a728("desc_nails", false);
        if (null != a1033) {
            fn_.desc_nails = dj_.a064(a1033, false);
        }
        final byte[] a1034 = gm_.a728("desc_hidden_pit", false);
        if (a1034 != null) {
            bh_.desc_hidden_pit = dj_.a064(a1034, false);
        }
        final byte[] a1035 = gm_.a728("desc_teleport", false);
        if (a1035 != null) {
            to_.desc_teleport = dj_.a064(a1035, false);
        }
        final byte[] a1036 = gm_.a728("desc_hidden_nails", b);
        if (a1036 != null) {
            hl_.desc_hidden_nails = dj_.a064(a1036, false);
        }
        final byte[] a1037 = gm_.a728("desc_bottomless_pit", b);
        if (a1037 != null) {
            fa_.desc_bottomless_pit = dj_.a064(a1037, b);
        }
        final byte[] a1038 = gm_.a728("desc_crusher", false);
        if (a1038 != null) {
            dm_.desc_crusher = dj_.a064(a1038, false);
        }
        final byte[] a1039 = gm_.a728("desc_hidden_darts", false);
        if (a1039 != null) {
            Tooltip.desc_hidden_darts = dj_.a064(a1039, false);
        }
        final byte[] a1040 = gm_.a728("desc_whirling_blades", false);
        if (a1040 != null) {
            nb_.desc_whirling_blades = dj_.a064(a1040, false);
        }
        final byte[] a1041 = gm_.a728("desc_poison_gas", b);
        if (a1041 != null) {
            cp_.desc_poison_gas = dj_.a064(a1041, false);
        }
        final byte[] a1042 = gm_.a728("desc_giant_rats", false);
        if (null != a1042) {
            il_.desc_giant_rats = dj_.a064(a1042, false);
        }
        final byte[] a1043 = gm_.a728("desc_rot_worms", false);
        if (null != a1043) {
            ul_.desc_rot_worms = dj_.a064(a1043, false);
        }
        final byte[] a1044 = gm_.a728("desc_troglodytes", false);
        if (a1044 != null) {
            rn_.desc_troglodytes = dj_.a064(a1044, b);
        }
        final byte[] a1045 = gm_.a728("desc_giant_snake", false);
        if (a1045 != null) {
            ke_.desc_giant_snake = dj_.a064(a1045, false);
        }
        final byte[] a1046 = gm_.a728("desc_giant_spider", false);
        if (a1046 != null) {
            li_.desc_giant_spider = dj_.a064(a1046, false);
        }
        final byte[] a1047 = gm_.a728("desc_skeleton_sentinels", false);
        if (null != a1047) {
            tn_.desc_skeleton_sentinels = dj_.a064(a1047, false);
        }
        final byte[] a1048 = gm_.a728("desc_corrosive_slime", false);
        if (null != a1048) {
            bc_.desc_corrosive_slime = dj_.a064(a1048, false);
        }
        final byte[] a1049 = gm_.a728("desc_razor_construct", b);
        if (null != a1049) {
            qh_.desc_razor_construct = dj_.a064(a1049, false);
        }
        final byte[] a1050 = gm_.a728("desc_rabid_wolf", false);
        if (a1050 != null) {
            f_.desc_rabid_wolf = dj_.a064(a1050, b);
        }
        final byte[] a1051 = gm_.a728("desc_vampire_bats", false);
        if (a1051 != null) {
            ed_.desc_vampire_bats = dj_.a064(a1051, false);
        }
        final byte[] a1052 = gm_.a728("desc_imp", b);
        if (a1052 != null) {
            ti_.desc_imp = dj_.a064(a1052, false);
        }
        final byte[] a1053 = gm_.a728("desc_stone_golem", false);
        if (a1053 != null) {
            wi_.desc_stone_golem = dj_.a064(a1053, false);
        }
        final byte[] a1054 = gm_.a728("desc_spectre", b);
        if (a1054 != null) {
            om_.desc_spectre = dj_.a064(a1054, false);
        }
        final byte[] a1055 = gm_.a728("desc_banshee", false);
        if (a1055 != null) {
            mj_.desc_banshee = dj_.a064(a1055, false);
        }
        final byte[] a1056 = gm_.a728("desc_raging_beast", b);
        if (a1056 != null) {
            pe_.desc_raging_beast = dj_.a064(a1056, false);
        }
        final byte[] a1057 = gm_.a728("desc_basilisk", b);
        if (a1057 != null) {
            jm_.desc_basilisk = dj_.a064(a1057, false);
        }
        final byte[] a1058 = gm_.a728("desc_pit_demon", false);
        if (a1058 != null) {
            sj_.desc_pit_demon = dj_.a064(a1058, false);
        }
        final byte[] a1059 = gm_.a728("desc_vampire_lord", false);
        if (null != a1059) {
            an_.desc_vampire_lord = dj_.a064(a1059, false);
        }
        final byte[] a1060 = gm_.a728("desc_hell_beast", false);
        if (null != a1060) {
            sm_.desc_hell_beast = dj_.a064(a1060, false);
        }
        final byte[] a1061 = gm_.a728("desc_demon_lord", b);
        if (null != a1061) {
            fg_.desc_demon_lord = dj_.a064(a1061, b);
        }
        final byte[] a1062 = gm_.a728("desc_tripwire_bell", b);
        if (null != a1062) {
            jb_.desc_tripwire_bell = dj_.a064(a1062, false);
        }
        final byte[] a1063 = gm_.a728("desc_hall_of_glass", false);
        if (null != a1063) {
            tg_.desc_hall_of_glass = dj_.a064(a1063, b);
        }
        final byte[] a1064 = gm_.a728("desc_magical_guardian_room", false);
        if (null != a1064) {
            ic_.desc_magical_guardian_room = dj_.a064(a1064, b);
        }
        final byte[] a1065 = gm_.a728("tip_nails", false);
        if (null != a1065) {
            gm_.tip_nails = dj_.a064(a1065, false);
        }
        final byte[] a1066 = gm_.a728("tip_teleport", false);
        if (a1066 != null) {
            ek_.tip_teleport = dj_.a064(a1066, false);
        }
        final byte[] a1067 = gm_.a728("tip_hidden_nails", b);
        if (null != a1067) {
            dl_.tip_hidden_nails = dj_.a064(a1067, false);
        }
        final byte[] a1068 = gm_.a728("tip_bottomless_pit", b);
        if (a1068 != null) {
            nf_.tip_bottomless_pit = dj_.a064(a1068, b);
        }
        final byte[] a1069 = gm_.a728("tip_lethal", b);
        if (a1069 != null) {
            dj_.a064(a1069, false);
        }
        final byte[] a1070 = gm_.a728("tip_hidden_darts", false);
        if (a1070 != null) {
            fb_.tip_hidden_darts = dj_.a064(a1070, false);
        }
        final byte[] a1071 = gm_.a728("tip_whirling_blades", false);
        if (null != a1071) {
            ho_.tip_whirling_blades = dj_.a064(a1071, false);
        }
        final byte[] a1072 = gm_.a728("tip_rot_worms", false);
        if (null != a1072) {
            vc_.tip_rot_worms = dj_.a064(a1072, false);
        }
        final byte[] a1073 = gm_.a728("tip_skeleton_sentinels", b);
        if (a1073 != null) {
            PlayerInformation.tip_skeleton_sentinels = dj_.a064(a1073, false);
        }
        final byte[] a1074 = gm_.a728("tip_corrosive_slime", false);
        if (a1074 != null) {
            fm_.tip_corrosive_slime = dj_.a064(a1074, false);
        }
        final byte[] a1075 = gm_.a728("tip_razor_construct", false);
        if (a1075 != null) {
            ub_.tip_razor_construct = dj_.a064(a1075, false);
        }
        final byte[] a1076 = gm_.a728("tip_rabid_wolf", false);
        if (a1076 != null) {
            lg_.tip_rabid_wolf = dj_.a064(a1076, false);
        }
        final byte[] a1077 = gm_.a728("tip_vampire_bats", false);
        if (a1077 != null) {
            df_.tip_vampire_bats = dj_.a064(a1077, b);
        }
        final byte[] a1078 = gm_.a728("tip_stone_golem", false);
        if (null != a1078) {
            ko_.tip_stone_golem = dj_.a064(a1078, false);
        }
        final byte[] a1079 = gm_.a728("tip_spectre", b);
        if (null != a1079) {
            qm_.tip_spectre = dj_.a064(a1079, false);
        }
        final byte[] a1080 = gm_.a728("tip_banshee", b);
        if (a1080 != null) {
            eb_.tip_banshee = dj_.a064(a1080, b);
        }
        final byte[] a1081 = gm_.a728("tip_vampire_lord", false);
        if (a1081 != null) {
            Room.tip_vampire_lord = dj_.a064(a1081, false);
        }
        final byte[] a1082 = gm_.a728("tip_demon_lord", b);
        if (a1082 != null) {
            tk_.tip_demon_lord = dj_.a064(a1082, false);
        }
        final byte[] a1083 = gm_.a728("tip_tripwire_bell", false);
        if (a1083 != null) {
            hl_.tip_tripwire_bell = dj_.a064(a1083, false);
        }
        final byte[] a1084 = gm_.a728("tip_hall_of_glass", b);
        if (a1084 != null) {
            eg_.tip_hall_of_glass = dj_.a064(a1084, false);
        }
        final byte[] a1085 = gm_.a728("tip_magical_guardian_room", false);
        if (a1085 != null) {
            ii_.tip_magical_guardian_room = dj_.a064(a1085, b);
        }
        final byte[] a1086 = gm_.a728("ability_pitimmunity,0", false);
        if (a1086 != null) {
            ao_.ability_pitimmunity[0] = dj_.a064(a1086, b);
        }
        final byte[] a1087 = gm_.a728("ability_pitimmunity,1", false);
        if (null != a1087) {
            ao_.ability_pitimmunity[1] = dj_.a064(a1087, false);
        }
        final byte[] a1088 = gm_.a728("ability_boostdef,0", b);
        if (a1088 != null) {
            bo_.ability_boostdef[0] = dj_.a064(a1088, false);
        }
        final byte[] a1089 = gm_.a728("ability_boostdef,1", false);
        if (a1089 != null) {
            bo_.ability_boostdef[1] = dj_.a064(a1089, false);
        }
        final byte[] a1090 = gm_.a728("ability_boostsneak,0", false);
        if (null != a1090) {
            oa_.ability_boostsneak[0] = dj_.a064(a1090, false);
        }
        final byte[] a1091 = gm_.a728("ability_boostsneak,1", false);
        if (null != a1091) {
            oa_.ability_boostsneak[1] = dj_.a064(a1091, false);
        }
        final byte[] a1092 = gm_.a728("ability_tough,0", b);
        if (null != a1092) {
            vc_.ability_tough[0] = dj_.a064(a1092, false);
        }
        final byte[] a1093 = gm_.a728("ability_tough,1", false);
        if (a1093 != null) {
            vc_.ability_tough[1] = dj_.a064(a1093, b);
        }
        final byte[] a1094 = gm_.a728("ability_retreat,0", false);
        if (a1094 != null) {
            up_.ability_retreat[0] = dj_.a064(a1094, false);
        }
        final byte[] a1095 = gm_.a728("ability_retreat,1", b);
        if (a1095 != null) {
            up_.ability_retreat[1] = dj_.a064(a1095, false);
        }
        final byte[] a1096 = gm_.a728("ability_sacrifice_green,0", false);
        if (a1096 != null) {
            lg_.ability_sacrifice_green[0] = dj_.a064(a1096, false);
        }
        final byte[] a1097 = gm_.a728("ability_sacrifice_green,1", false);
        if (null != a1097) {
            lg_.ability_sacrifice_green[1] = dj_.a064(a1097, false);
        }
        final byte[] a1098 = gm_.a728("ability_thief,0", b);
        if (null != a1098) {
            qj_.ability_thief[0] = dj_.a064(a1098, false);
        }
        final byte[] a1099 = gm_.a728("ability_thief,1", false);
        if (a1099 != null) {
            qj_.ability_thief[1] = dj_.a064(a1099, b);
        }
        final byte[] a1100 = gm_.a728("ability_summon,0", b);
        if (a1100 != null) {
            jm_.ability_summon[0] = dj_.a064(a1100, false);
        }
        final byte[] a1101 = gm_.a728("ability_summon,1", false);
        if (a1101 != null) {
            jm_.ability_summon[1] = dj_.a064(a1101, false);
        }
        final byte[] a1102 = gm_.a728("ability_revive,0", b);
        if (a1102 != null) {
            hh_.ability_revive[0] = dj_.a064(a1102, false);
        }
        final byte[] a1103 = gm_.a728("ability_revive,1", false);
        if (null != a1103) {
            hh_.ability_revive[1] = dj_.a064(a1103, false);
        }
        final byte[] a1104 = gm_.a728("ability_circumvent,0", false);
        if (a1104 != null) {
            ja_.ability_circumvent[0] = dj_.a064(a1104, false);
        }
        final byte[] a1105 = gm_.a728("ability_circumvent,1", false);
        if (null != a1105) {
            ja_.ability_circumvent[1] = dj_.a064(a1105, false);
        }
        final byte[] a1106 = gm_.a728("ability_scout,0", false);
        if (a1106 != null) {
            li_.ability_scout[0] = dj_.a064(a1106, false);
        }
        final byte[] a1107 = gm_.a728("ability_scout,1", false);
        if (null != a1107) {
            li_.ability_scout[1] = dj_.a064(a1107, b);
        }
        final byte[] a1108 = gm_.a728("ability_spy,0", false);
        if (null != a1108) {
            sp_.ability_spy[0] = dj_.a064(a1108, false);
        }
        final byte[] a1109 = gm_.a728("ability_spy,1", false);
        if (a1109 != null) {
            sp_.ability_spy[1] = dj_.a064(a1109, b);
        }
        final byte[] a1110 = gm_.a728("ability_glamour,0", false);
        if (null != a1110) {
            hj_.ability_glamour[0] = dj_.a064(a1110, b);
        }
        final byte[] a1111 = gm_.a728("ability_glamour,1", false);
        if (null != a1111) {
            hj_.ability_glamour[1] = dj_.a064(a1111, false);
        }
        final byte[] a1112 = gm_.a728("ability_intimidate,0", b);
        if (null != a1112) {
            rf_.ability_intimidate[0] = dj_.a064(a1112, false);
        }
        final byte[] a1113 = gm_.a728("ability_intimidate,1", b);
        if (null != a1113) {
            rf_.ability_intimidate[1] = dj_.a064(a1113, false);
        }
        final byte[] a1114 = gm_.a728("ability_ferocity,0", false);
        if (a1114 != null) {
            ll_.ability_ferocity[0] = dj_.a064(a1114, false);
        }
        final byte[] a1115 = gm_.a728("ability_ferocity,1", false);
        if (null != a1115) {
            ll_.ability_ferocity[1] = dj_.a064(a1115, false);
        }
        final byte[] a1116 = gm_.a728("ability_firststrike,0", b);
        if (null != a1116) {
            an_.ability_firststrike[0] = dj_.a064(a1116, b);
        }
        final byte[] a1117 = gm_.a728("ability_firststrike,1", false);
        if (null != a1117) {
            an_.ability_firststrike[1] = dj_.a064(a1117, false);
        }
        final byte[] a1118 = gm_.a728("ability_fragility,0", false);
        if (a1118 != null) {
            ob_.ability_fragility[0] = dj_.a064(a1118, false);
        }
        final byte[] a1119 = gm_.a728("ability_fragility,1", false);
        if (a1119 != null) {
            ob_.ability_fragility[1] = dj_.a064(a1119, false);
        }
        final byte[] a1120 = gm_.a728("ability_armoured,0", false);
        if (a1120 != null) {
            np_.ability_armoured[0] = dj_.a064(a1120, b);
        }
        final byte[] a1121 = gm_.a728("ability_armoured,1", b);
        if (a1121 != null) {
            np_.ability_armoured[1] = dj_.a064(a1121, false);
        }
        final byte[] a1122 = gm_.a728("ability_fireimmunity,0", false);
        if (null != a1122) {
            CacheIndex.ability_fireimmunity[0] = dj_.a064(a1122, false);
        }
        final byte[] a1123 = gm_.a728("ability_fireimmunity,1", false);
        if (a1123 != null) {
            CacheIndex.ability_fireimmunity[1] = dj_.a064(a1123, false);
        }
        final byte[] a1124 = gm_.a728("ability_immortal,0", false);
        if (a1124 != null) {
            vb_.ability_immortal[0] = dj_.a064(a1124, false);
        }
        final byte[] a1125 = gm_.a728("ability_immortal,1", false);
        if (null != a1125) {
            vb_.ability_immortal[1] = dj_.a064(a1125, false);
        }
        final byte[] a1126 = gm_.a728("ability_chaos_champion,0", false);
        if (null != a1126) {
            ob_.ability_chaos_champion[0] = dj_.a064(a1126, false);
        }
        final byte[] a1127 = gm_.a728("ability_chaos_champion,1", false);
        if (a1127 != null) {
            ob_.ability_chaos_champion[1] = dj_.a064(a1127, false);
        }
        final byte[] a1128 = gm_.a728("ability_fickle,0", b);
        if (null != a1128) {
            pm_.ability_fickle[0] = dj_.a064(a1128, b);
        }
        final byte[] a1129 = gm_.a728("ability_fickle,1", false);
        if (null != a1129) {
            pm_.ability_fickle[1] = dj_.a064(a1129, false);
        }
        final byte[] a1130 = gm_.a728("ability_redistribute,0", false);
        if (a1130 != null) {
            j_.ability_redistribute[0] = dj_.a064(a1130, false);
        }
        final byte[] a1131 = gm_.a728("ability_redistribute,1", b);
        if (a1131 != null) {
            j_.ability_redistribute[1] = dj_.a064(a1131, b);
        }
        final byte[] a1132 = gm_.a728("ability_pitimmunity_brief,0", b);
        if (null != a1132) {
            ne_.ability_pitimmunity_brief[0] = dj_.a064(a1132, false);
        }
        final byte[] a1133 = gm_.a728("ability_pitimmunity_brief,1", false);
        if (null != a1133) {
            ne_.ability_pitimmunity_brief[1] = dj_.a064(a1133, false);
        }
        final byte[] a1134 = gm_.a728("ability_boostdef_brief,0", false);
        if (a1134 != null) {
            ha_.ability_boostdef_brief[0] = dj_.a064(a1134, false);
        }
        final byte[] a1135 = gm_.a728("ability_boostdef_brief,1", false);
        if (a1135 != null) {
            ha_.ability_boostdef_brief[1] = dj_.a064(a1135, b);
        }
        final byte[] a1136 = gm_.a728("ability_boostsneak_brief,0", false);
        if (a1136 != null) {
            rp_.ability_boostsneak_brief[0] = dj_.a064(a1136, b);
        }
        final byte[] a1137 = gm_.a728("ability_boostsneak_brief,1", false);
        if (a1137 != null) {
            rp_.ability_boostsneak_brief[1] = dj_.a064(a1137, false);
        }
        final byte[] a1138 = gm_.a728("ability_tough_brief,0", false);
        if (a1138 != null) {
            rk_.ability_tough_brief[0] = dj_.a064(a1138, b);
        }
        final byte[] a1139 = gm_.a728("ability_tough_brief,1", false);
        if (null != a1139) {
            rk_.ability_tough_brief[1] = dj_.a064(a1139, b);
        }
        final byte[] a1140 = gm_.a728("ability_retreat_brief,0", false);
        if (a1140 != null) {
            bj_.ability_retreat_brief[0] = dj_.a064(a1140, false);
        }
        final byte[] a1141 = gm_.a728("ability_retreat_brief,1", false);
        if (null != a1141) {
            bj_.ability_retreat_brief[1] = dj_.a064(a1141, b);
        }
        final byte[] a1142 = gm_.a728("ability_sacrifice_green_brief,0", false);
        if (a1142 != null) {
            bb_.ability_sacrifice_green_brief[0] = dj_.a064(a1142, false);
        }
        final byte[] a1143 = gm_.a728("ability_sacrifice_green_brief,1", false);
        if (null != a1143) {
            bb_.ability_sacrifice_green_brief[1] = dj_.a064(a1143, false);
        }
        final byte[] a1144 = gm_.a728("ability_thief_brief,0", false);
        if (a1144 != null) {
            al_.ability_thief_brief[0] = dj_.a064(a1144, b);
        }
        final byte[] a1145 = gm_.a728("ability_thief_brief,1", false);
        if (null != a1145) {
            al_.ability_thief_brief[1] = dj_.a064(a1145, false);
        }
        final byte[] a1146 = gm_.a728("ability_summon_brief,0", false);
        if (a1146 != null) {
            hk_.ability_thief_brief[0] = dj_.a064(a1146, false);
        }
        final byte[] a1147 = gm_.a728("ability_summon_brief,1", false);
        if (a1147 != null) {
            hk_.ability_thief_brief[1] = dj_.a064(a1147, false);
        }
        final byte[] a1148 = gm_.a728("ability_revive_brief,0", b);
        if (null != a1148) {
            rp_.ability_revive_brief[0] = dj_.a064(a1148, false);
        }
        final byte[] a1149 = gm_.a728("ability_revive_brief,1", b);
        if (a1149 != null) {
            rp_.ability_revive_brief[1] = dj_.a064(a1149, false);
        }
        final byte[] a1150 = gm_.a728("ability_circumvent_brief,0", false);
        if (a1150 != null) {
            um_.ability_circumvent_brief[0] = dj_.a064(a1150, false);
        }
        final byte[] a1151 = gm_.a728("ability_circumvent_brief,1", false);
        if (a1151 != null) {
            um_.ability_circumvent_brief[1] = dj_.a064(a1151, false);
        }
        final byte[] a1152 = gm_.a728("ability_scout_brief,0", false);
        if (a1152 != null) {
            gi_.ability_scout_brief[0] = dj_.a064(a1152, b);
        }
        final byte[] a1153 = gm_.a728("ability_scout_brief,1", false);
        if (a1153 != null) {
            gi_.ability_scout_brief[1] = dj_.a064(a1153, false);
        }
        final byte[] a1154 = gm_.a728("ability_spy_brief,0", false);
        if (null != a1154) {
            fe_.ability_spy_brief[0] = dj_.a064(a1154, b);
        }
        final byte[] a1155 = gm_.a728("ability_spy_brief,1", false);
        if (null != a1155) {
            fe_.ability_spy_brief[1] = dj_.a064(a1155, false);
        }
        final byte[] a1156 = gm_.a728("ability_glamour_brief,0", false);
        if (null != a1156) {
            gl_.ability_glamour_brief[0] = dj_.a064(a1156, false);
        }
        final byte[] a1157 = gm_.a728("ability_glamour_brief,1", false);
        if (null != a1157) {
            gl_.ability_glamour_brief[1] = dj_.a064(a1157, false);
        }
        final byte[] a1158 = gm_.a728("ability_intimidate_brief,0", false);
        if (a1158 != null) {
            uf_.ability_intimidate_brief[0] = dj_.a064(a1158, b);
        }
        final byte[] a1159 = gm_.a728("ability_intimidate_brief,1", b);
        if (null != a1159) {
            uf_.ability_intimidate_brief[1] = dj_.a064(a1159, false);
        }
        final byte[] a1160 = gm_.a728("ability_ferocity_brief,0", b);
        if (null != a1160) {
            mi_.ability_ferocity_brief[0] = dj_.a064(a1160, false);
        }
        final byte[] a1161 = gm_.a728("ability_ferocity_brief,1", false);
        if (a1161 != null) {
            mi_.ability_ferocity_brief[1] = dj_.a064(a1161, false);
        }
        final byte[] a1162 = gm_.a728("ability_firststrike_brief,0", false);
        if (null != a1162) {
            dm_.ability_firststrike_brief[0] = dj_.a064(a1162, false);
        }
        final byte[] a1163 = gm_.a728("ability_firststrike_brief,1", b);
        if (a1163 != null) {
            dm_.ability_firststrike_brief[1] = dj_.a064(a1163, false);
        }
        final byte[] a1164 = gm_.a728("ability_fragility_brief,0", b);
        if (a1164 != null) {
            to_.ability_fragility_brief[0] = dj_.a064(a1164, false);
        }
        final byte[] a1165 = gm_.a728("ability_fragility_brief,1", false);
        if (a1165 != null) {
            to_.ability_fragility_brief[1] = dj_.a064(a1165, false);
        }
        final byte[] a1166 = gm_.a728("ability_armoured_brief,0", false);
        if (null != a1166) {
            rj_.ability_armoured_brief[0] = dj_.a064(a1166, false);
        }
        final byte[] a1167 = gm_.a728("ability_armoured_brief,1", false);
        if (null != a1167) {
            rj_.ability_armoured_brief[1] = dj_.a064(a1167, false);
        }
        final byte[] a1168 = gm_.a728("ability_fireimmunity_brief,0", false);
        if (null != a1168) {
            dn_.ability_fireimmunity_brief[0] = dj_.a064(a1168, false);
        }
        final byte[] a1169 = gm_.a728("ability_fireimmunity_brief,1", false);
        if (null != a1169) {
            dn_.ability_fireimmunity_brief[1] = dj_.a064(a1169, false);
        }
        final byte[] a1170 = gm_.a728("ability_immortal_brief,0", false);
        if (a1170 != null) {
            jf_.ability_immortal_brief[0] = dj_.a064(a1170, false);
        }
        final byte[] a1171 = gm_.a728("ability_immortal_brief,1", false);
        if (null != a1171) {
            jf_.ability_immortal_brief[1] = dj_.a064(a1171, false);
        }
        final byte[] a1172 = gm_.a728("ability_chaos_champion_brief,0", b);
        if (a1172 != null) {
            bh_.ability_chaos_champion_brief[0] = dj_.a064(a1172, b);
        }
        final byte[] a1173 = gm_.a728("ability_chaos_champion_brief,1", false);
        if (null != a1173) {
            bh_.ability_chaos_champion_brief[1] = dj_.a064(a1173, false);
        }
        final byte[] a1174 = gm_.a728("ability_fickle_brief,0", b);
        if (null != a1174) {
            ua_.ability_fickle_brief[0] = dj_.a064(a1174, false);
        }
        final byte[] a1175 = gm_.a728("ability_fickle_brief,1", false);
        if (a1175 != null) {
            ua_.ability_fickle_brief[1] = dj_.a064(a1175, false);
        }
        final byte[] a1176 = gm_.a728("ability_redistribute_brief,0", false);
        if (null != a1176) {
            wf_.ability_redistribute_brief[0] = dj_.a064(a1176, b);
        }
        final byte[] a1177 = gm_.a728("ability_redistribute_brief,1", b);
        if (a1177 != null) {
            wf_.ability_redistribute_brief[1] = dj_.a064(a1177, false);
        }
        final byte[] a1178 = gm_.a728("ability_ferocity_message", false);
        if (a1178 != null) {
            ia_.ability_ferocity_message = dj_.a064(a1178, false);
        }
        final byte[] a1179 = gm_.a728("ability_armoured_message", false);
        if (null != a1179) {
            le_.ability_armoured_message = dj_.a064(a1179, false);
        }
        final byte[] a1180 = gm_.a728("ability_room_armoured_message", false);
        if (null != a1180) {
            qi_.ability_room_armoured_message = dj_.a064(a1180, b);
        }
        final byte[] a1181 = gm_.a728("fatal_monster", b);
        if (a1181 != null) {
            GUICheckbox.fatal_monster = dj_.a064(a1181, false);
        }
        final byte[] a1182 = gm_.a728("fatal_trap", false);
        if (null != a1182) {
            gm_.fatal_trap = dj_.a064(a1182, false);
        }
        final byte[] a1183 = gm_.a728("fatal_guardian", b);
        if (a1183 != null) {
            lf_.fatal_guardian = dj_.a064(a1183, false);
        }
        final byte[] a1184 = gm_.a728("fatal_brief", false);
        if (null != a1184) {
            lg_.fatal_brief = dj_.a064(a1184, b);
        }
        final byte[] a1185 = gm_.a728("orb_preservation", false);
        if (null != a1185) {
            ek_.orb_preservation = dj_.a064(a1185, b);
        }
        final byte[] a1186 = gm_.a728("orb_majesty", b);
        if (null != a1186) {
            tp_.orb_majesty = dj_.a064(a1186, b);
        }
        final byte[] a1187 = gm_.a728("orb_brilliance", false);
        if (a1187 != null) {
            df_.orb_brilliance = dj_.a064(a1187, b);
        }
        final byte[] a1188 = gm_.a728("orb_war", false);
        if (null != a1188) {
            tg_.orb_war = dj_.a064(a1188, b);
        }
        final byte[] a1189 = gm_.a728("orb_preservation_desc", false);
        if (a1189 != null) {
            da_.orb_preservation_desc = dj_.a064(a1189, false);
        }
        final byte[] a1190 = gm_.a728("orb_majesty_desc", false);
        if (a1190 != null) {
            lj_.orb_majesty_desc = dj_.a064(a1190, false);
        }
        final byte[] a1191 = gm_.a728("orb_brilliance_desc", false);
        if (null != a1191) {
            an_.orb_brilliance_desc = dj_.a064(a1191, b);
        }
        final byte[] a1192 = gm_.a728("orb_war_desc", false);
        if (null != a1192) {
            bj_.orb_war_desc = dj_.a064(a1192, false);
        }
        final byte[] a1193 = gm_.a728("titles_age_male,0", false);
        if (null != a1193) {
            od_.titles_age_male[0] = dj_.a064(a1193, false);
        }
        final byte[] a1194 = gm_.a728("titles_age_male,1", false);
        if (null != a1194) {
            od_.titles_age_male[1] = dj_.a064(a1194, false);
        }
        final byte[] a1195 = gm_.a728("titles_age_male,2", false);
        if (null != a1195) {
            od_.titles_age_male[2] = dj_.a064(a1195, b);
        }
        final byte[] a1196 = gm_.a728("titles_age_male,3", false);
        if (null != a1196) {
            od_.titles_age_male[3] = dj_.a064(a1196, false);
        }
        final byte[] a1197 = gm_.a728("titles_age_male,4", b);
        if (a1197 != null) {
            od_.titles_age_male[4] = dj_.a064(a1197, false);
        }
        final byte[] a1198 = gm_.a728("titles_age_male,5", false);
        if (null != a1198) {
            od_.titles_age_male[5] = dj_.a064(a1198, false);
        }
        final byte[] a1199 = gm_.a728("titles_age_female,0", false);
        if (null != a1199) {
            ek_.titles_age_female[0] = dj_.a064(a1199, false);
        }
        final byte[] a1200 = gm_.a728("titles_age_female,1", b);
        if (a1200 != null) {
            ek_.titles_age_female[1] = dj_.a064(a1200, false);
        }
        final byte[] a1201 = gm_.a728("titles_age_female,2", false);
        if (null != a1201) {
            ek_.titles_age_female[2] = dj_.a064(a1201, b);
        }
        final byte[] a1202 = gm_.a728("titles_age_female,3", false);
        if (a1202 != null) {
            ek_.titles_age_female[3] = dj_.a064(a1202, false);
        }
        final byte[] a1203 = gm_.a728("titles_age_female,4", false);
        if (a1203 != null) {
            ek_.titles_age_female[4] = dj_.a064(a1203, false);
        }
        final byte[] a1204 = gm_.a728("titles_age_female,5", false);
        if (null != a1204) {
            ek_.titles_age_female[5] = dj_.a064(a1204, false);
        }
        final byte[] a1205 = gm_.a728("titles_mastery_male,0", b);
        if (null != a1205) {
            j_.titles_mastery_male[0] = dj_.a064(a1205, false);
        }
        final byte[] a1206 = gm_.a728("titles_mastery_male,1", false);
        if (a1206 != null) {
            j_.titles_mastery_male[1] = dj_.a064(a1206, false);
        }
        final byte[] a1207 = gm_.a728("titles_mastery_male,2", b);
        if (null != a1207) {
            j_.titles_mastery_male[2] = dj_.a064(a1207, false);
        }
        final byte[] a1208 = gm_.a728("titles_mastery_male,3", false);
        if (a1208 != null) {
            j_.titles_mastery_male[3] = dj_.a064(a1208, b);
        }
        final byte[] a1209 = gm_.a728("titles_mastery_male,4", b);
        if (a1209 != null) {
            j_.titles_mastery_male[4] = dj_.a064(a1209, false);
        }
        final byte[] a1210 = gm_.a728("titles_mastery_male,5", false);
        if (a1210 != null) {
            j_.titles_mastery_male[5] = dj_.a064(a1210, false);
        }
        final byte[] a1211 = gm_.a728("titles_mastery_male,6", false);
        if (null != a1211) {
            j_.titles_mastery_male[6] = dj_.a064(a1211, false);
        }
        final byte[] a1212 = gm_.a728("titles_mastery_male,7", false);
        if (a1212 != null) {
            j_.titles_mastery_male[7] = dj_.a064(a1212, false);
        }
        final byte[] a1213 = gm_.a728("titles_mastery_female,0", false);
        if (null != a1213) {
            IsaacCipher.titles_mastery_female[0] = dj_.a064(a1213, false);
        }
        final byte[] a1214 = gm_.a728("titles_mastery_female,1", false);
        if (a1214 != null) {
            IsaacCipher.titles_mastery_female[1] = dj_.a064(a1214, false);
        }
        final byte[] a1215 = gm_.a728("titles_mastery_female,2", b);
        if (a1215 != null) {
            IsaacCipher.titles_mastery_female[2] = dj_.a064(a1215, false);
        }
        final byte[] a1216 = gm_.a728("titles_mastery_female,3", b);
        if (null != a1216) {
            IsaacCipher.titles_mastery_female[3] = dj_.a064(a1216, false);
        }
        final byte[] a1217 = gm_.a728("titles_mastery_female,4", b);
        if (a1217 != null) {
            IsaacCipher.titles_mastery_female[4] = dj_.a064(a1217, false);
        }
        final byte[] a1218 = gm_.a728("titles_mastery_female,5", false);
        if (null != a1218) {
            IsaacCipher.titles_mastery_female[5] = dj_.a064(a1218, false);
        }
        final byte[] a1219 = gm_.a728("titles_mastery_female,6", false);
        if (a1219 != null) {
            IsaacCipher.titles_mastery_female[6] = dj_.a064(a1219, b);
        }
        final byte[] a1220 = gm_.a728("titles_mastery_female,7", false);
        if (a1220 != null) {
            IsaacCipher.titles_mastery_female[7] = dj_.a064(a1220, false);
        }
        final byte[] a1221 = gm_.a728("titles_aggression_male,0", b);
        if (a1221 != null) {
            hd_.titles_aggression_male[0] = dj_.a064(a1221, b);
        }
        final byte[] a1222 = gm_.a728("titles_aggression_male,1", false);
        if (null != a1222) {
            hd_.titles_aggression_male[1] = dj_.a064(a1222, false);
        }
        final byte[] a1223 = gm_.a728("titles_aggression_male,2", false);
        if (null != a1223) {
            hd_.titles_aggression_male[2] = dj_.a064(a1223, b);
        }
        final byte[] a1224 = gm_.a728("titles_aggression_male,3", false);
        if (a1224 != null) {
            hd_.titles_aggression_male[3] = dj_.a064(a1224, false);
        }
        final byte[] a1225 = gm_.a728("titles_aggression_male,4", b);
        if (a1225 != null) {
            hd_.titles_aggression_male[4] = dj_.a064(a1225, false);
        }
        final byte[] a1226 = gm_.a728("titles_aggression_male,5", false);
        if (a1226 != null) {
            hd_.titles_aggression_male[5] = dj_.a064(a1226, false);
        }
        final byte[] a1227 = gm_.a728("titles_aggression_male,6", false);
        if (a1227 != null) {
            hd_.titles_aggression_male[6] = dj_.a064(a1227, b);
        }
        final byte[] a1228 = gm_.a728("titles_aggression_male,7", false);
        if (null != a1228) {
            hd_.titles_aggression_male[7] = dj_.a064(a1228, false);
        }
        final byte[] a1229 = gm_.a728("titles_aggression_male,8", false);
        if (null != a1229) {
            hd_.titles_aggression_male[8] = dj_.a064(a1229, b);
        }
        final byte[] a1230 = gm_.a728("titles_aggression_female,0", false);
        if (a1230 != null) {
            ki_.titles_aggression_female[0] = dj_.a064(a1230, b);
        }
        final byte[] a1231 = gm_.a728("titles_aggression_female,1", false);
        if (null != a1231) {
            ki_.titles_aggression_female[1] = dj_.a064(a1231, false);
        }
        final byte[] a1232 = gm_.a728("titles_aggression_female,2", false);
        if (a1232 != null) {
            ki_.titles_aggression_female[2] = dj_.a064(a1232, false);
        }
        final byte[] a1233 = gm_.a728("titles_aggression_female,3", false);
        if (a1233 != null) {
            ki_.titles_aggression_female[3] = dj_.a064(a1233, false);
        }
        final byte[] a1234 = gm_.a728("titles_aggression_female,4", b);
        if (a1234 != null) {
            ki_.titles_aggression_female[4] = dj_.a064(a1234, b);
        }
        final byte[] a1235 = gm_.a728("titles_aggression_female,5", false);
        if (a1235 != null) {
            ki_.titles_aggression_female[5] = dj_.a064(a1235, false);
        }
        final byte[] a1236 = gm_.a728("titles_aggression_female,6", false);
        if (null != a1236) {
            ki_.titles_aggression_female[6] = dj_.a064(a1236, false);
        }
        final byte[] a1237 = gm_.a728("titles_aggression_female,7", b);
        if (a1237 != null) {
            ki_.titles_aggression_female[7] = dj_.a064(a1237, false);
        }
        final byte[] a1238 = gm_.a728("titles_aggression_female,8", false);
        if (null != a1238) {
            ki_.titles_aggression_female[8] = dj_.a064(a1238, false);
        }
        final byte[] a1239 = gm_.a728("titles_achievements_male,0", false);
        if (null != a1239) {
            nj_.titles_achievements_male[0] = dj_.a064(a1239, false);
        }
        final byte[] a1240 = gm_.a728("titles_achievements_male,1", false);
        if (null != a1240) {
            nj_.titles_achievements_male[1] = dj_.a064(a1240, false);
        }
        final byte[] a1241 = gm_.a728("titles_achievements_male,2", false);
        if (null != a1241) {
            nj_.titles_achievements_male[2] = dj_.a064(a1241, false);
        }
        final byte[] a1242 = gm_.a728("titles_achievements_male,3", false);
        if (null != a1242) {
            nj_.titles_achievements_male[3] = dj_.a064(a1242, false);
        }
        final byte[] a1243 = gm_.a728("titles_achievements_male,4", false);
        if (null != a1243) {
            nj_.titles_achievements_male[4] = dj_.a064(a1243, false);
        }
        final byte[] a1244 = gm_.a728("titles_achievements_female,0", false);
        if (a1244 != null) {
            lh_.titles_achievements_female[0] = dj_.a064(a1244, false);
        }
        final byte[] a1245 = gm_.a728("titles_achievements_female,1", false);
        if (a1245 != null) {
            lh_.titles_achievements_female[1] = dj_.a064(a1245, b);
        }
        final byte[] a1246 = gm_.a728("titles_achievements_female,2", false);
        if (a1246 != null) {
            lh_.titles_achievements_female[2] = dj_.a064(a1246, false);
        }
        final byte[] a1247 = gm_.a728("titles_achievements_female,3", false);
        if (null != a1247) {
            lh_.titles_achievements_female[3] = dj_.a064(a1247, b);
        }
        final byte[] a1248 = gm_.a728("titles_achievements_female,4", false);
        if (null != a1248) {
            lh_.titles_achievements_female[4] = dj_.a064(a1248, b);
        }
        final byte[] a1249 = gm_.a728("titles_external_male,0", b);
        if (a1249 != null) {
            DungeonPath.titles_external_male[0] = dj_.a064(a1249, false);
        }
        final byte[] a1250 = gm_.a728("titles_external_male,1", false);
        if (a1250 != null) {
            DungeonPath.titles_external_male[1] = dj_.a064(a1250, false);
        }
        final byte[] a1251 = gm_.a728("titles_external_male,2", b);
        if (a1251 != null) {
            DungeonPath.titles_external_male[2] = dj_.a064(a1251, false);
        }
        final byte[] a1252 = gm_.a728("titles_external_male,3", false);
        if (a1252 != null) {
            DungeonPath.titles_external_male[3] = dj_.a064(a1252, false);
        }
        final byte[] a1253 = gm_.a728("titles_external_male,4", false);
        if (null != a1253) {
            DungeonPath.titles_external_male[4] = dj_.a064(a1253, false);
        }
        final byte[] a1254 = gm_.a728("titles_external_male,5", b);
        if (a1254 != null) {
            DungeonPath.titles_external_male[5] = dj_.a064(a1254, false);
        }
        final byte[] a1255 = gm_.a728("titles_external_male,6", false);
        if (null != a1255) {
            DungeonPath.titles_external_male[6] = dj_.a064(a1255, b);
        }
        final byte[] a1256 = gm_.a728("titles_external_male,7", false);
        if (a1256 != null) {
            DungeonPath.titles_external_male[7] = dj_.a064(a1256, b);
        }
        final byte[] a1257 = gm_.a728("titles_external_male,8", false);
        if (null != a1257) {
            DungeonPath.titles_external_male[8] = dj_.a064(a1257, false);
        }
        final byte[] a1258 = gm_.a728("titles_external_male,9", false);
        if (a1258 != null) {
            DungeonPath.titles_external_male[9] = dj_.a064(a1258, false);
        }
        final byte[] a1259 = gm_.a728("titles_external_female,0", b);
        if (a1259 != null) {
            DungeonPath.titles_external_female[0] = dj_.a064(a1259, false);
        }
        final byte[] a1260 = gm_.a728("titles_external_female,1", false);
        if (null != a1260) {
            DungeonPath.titles_external_female[1] = dj_.a064(a1260, false);
        }
        final byte[] a1261 = gm_.a728("titles_external_female,2", false);
        if (a1261 != null) {
            DungeonPath.titles_external_female[2] = dj_.a064(a1261, b);
        }
        final byte[] a1262 = gm_.a728("titles_external_female,3", false);
        if (null != a1262) {
            DungeonPath.titles_external_female[3] = dj_.a064(a1262, false);
        }
        final byte[] a1263 = gm_.a728("titles_external_female,4", false);
        if (a1263 != null) {
            DungeonPath.titles_external_female[4] = dj_.a064(a1263, false);
        }
        final byte[] a1264 = gm_.a728("titles_external_female,5", false);
        if (null != a1264) {
            DungeonPath.titles_external_female[5] = dj_.a064(a1264, false);
        }
        final byte[] a1265 = gm_.a728("titles_external_female,6", false);
        if (a1265 != null) {
            DungeonPath.titles_external_female[6] = dj_.a064(a1265, b);
        }
        final byte[] a1266 = gm_.a728("titles_external_female,7", false);
        if (null != a1266) {
            DungeonPath.titles_external_female[7] = dj_.a064(a1266, false);
        }
        final byte[] a1267 = gm_.a728("titles_external_female,8", false);
        if (null != a1267) {
            DungeonPath.titles_external_female[8] = dj_.a064(a1267, false);
        }
        final byte[] a1268 = gm_.a728("titles_external_female,9", false);
        if (null != a1268) {
            DungeonPath.titles_external_female[9] = dj_.a064(a1268, false);
        }
        final byte[] a1269 = gm_.a728("titles_external_game,0", false);
        if (a1269 != null) {
            ab_.titles_external_game[0] = dj_.a064(a1269, b);
        }
        final byte[] a1270 = gm_.a728("titles_external_game,1", false);
        if (null != a1270) {
            ab_.titles_external_game[1] = dj_.a064(a1270, false);
        }
        final byte[] a1271 = gm_.a728("titles_external_game,2", b);
        if (null != a1271) {
            ab_.titles_external_game[2] = dj_.a064(a1271, false);
        }
        final byte[] a1272 = gm_.a728("titles_external_game,3", false);
        if (a1272 != null) {
            ab_.titles_external_game[3] = dj_.a064(a1272, false);
        }
        final byte[] a1273 = gm_.a728("titles_external_game,4", false);
        if (null != a1273) {
            ab_.titles_external_game[4] = dj_.a064(a1273, false);
        }
        final byte[] a1274 = gm_.a728("titles_external_game,5", false);
        if (a1274 != null) {
            ab_.titles_external_game[5] = dj_.a064(a1274, false);
        }
        final byte[] a1275 = gm_.a728("titles_external_game,6", false);
        if (a1275 != null) {
            ab_.titles_external_game[6] = dj_.a064(a1275, false);
        }
        final byte[] a1276 = gm_.a728("titles_external_game,7", b);
        if (a1276 != null) {
            ab_.titles_external_game[7] = dj_.a064(a1276, b);
        }
        final byte[] a1277 = gm_.a728("titles_external_game,8", false);
        if (a1277 != null) {
            ab_.titles_external_game[8] = dj_.a064(a1277, false);
        }
        final byte[] a1278 = gm_.a728("titles_external_game,9", false);
        if (null != a1278) {
            ab_.titles_external_game[9] = dj_.a064(a1278, false);
        }
        final byte[] a1279 = gm_.a728("titles_external_achievement,0", false);
        if (null != a1279) {
            ka_.titles_external_achievement[0] = dj_.a064(a1279, false);
        }
        final byte[] a1280 = gm_.a728("titles_external_achievement,1", false);
        if (a1280 != null) {
            ka_.titles_external_achievement[1] = dj_.a064(a1280, false);
        }
        final byte[] a1281 = gm_.a728("titles_external_achievement,2", false);
        if (a1281 != null) {
            ka_.titles_external_achievement[2] = dj_.a064(a1281, false);
        }
        final byte[] a1282 = gm_.a728("titles_external_achievement,3", b);
        if (a1282 != null) {
            ka_.titles_external_achievement[3] = dj_.a064(a1282, b);
        }
        final byte[] a1283 = gm_.a728("titles_external_achievement,4", false);
        if (null != a1283) {
            ka_.titles_external_achievement[4] = dj_.a064(a1283, false);
        }
        final byte[] a1284 = gm_.a728("titles_external_achievement,5", false);
        if (null != a1284) {
            ka_.titles_external_achievement[5] = dj_.a064(a1284, false);
        }
        final byte[] a1285 = gm_.a728("titles_external_achievement,6", false);
        if (null != a1285) {
            ka_.titles_external_achievement[6] = dj_.a064(a1285, false);
        }
        final byte[] a1286 = gm_.a728("titles_external_achievement,7", b);
        if (a1286 != null) {
            ka_.titles_external_achievement[7] = dj_.a064(a1286, false);
        }
        final byte[] a1287 = gm_.a728("titles_external_achievement,8", false);
        if (a1287 != null) {
            ka_.titles_external_achievement[8] = dj_.a064(a1287, false);
        }
        final byte[] a1288 = gm_.a728("titles_external_achievement,9", false);
        if (a1288 != null) {
            ka_.titles_external_achievement[9] = dj_.a064(a1288, b);
        }
        final byte[] a1289 = gm_.a728("titles_purchased,0", b);
        if (null != a1289) {
            ce_.titles_purchased[0] = dj_.a064(a1289, false);
        }
        final byte[] a1290 = gm_.a728("titles_purchased,1", b);
        if (a1290 != null) {
            ce_.titles_purchased[1] = dj_.a064(a1290, false);
        }
        final byte[] a1291 = gm_.a728("titles_purchased,2", b);
        if (a1291 != null) {
            ce_.titles_purchased[2] = dj_.a064(a1291, false);
        }
        final byte[] a1292 = gm_.a728("titles_purchased,3", false);
        if (null != a1292) {
            ce_.titles_purchased[3] = dj_.a064(a1292, false);
        }
        final byte[] a1293 = gm_.a728("titles_purchased,4", false);
        if (null != a1293) {
            ce_.titles_purchased[4] = dj_.a064(a1293, false);
        }
        final byte[] a1294 = gm_.a728("titles_purchased,5", b);
        if (a1294 != null) {
            ce_.titles_purchased[5] = dj_.a064(a1294, false);
        }
        final byte[] a1295 = gm_.a728("titles_purchased,6", false);
        if (a1295 != null) {
            ce_.titles_purchased[6] = dj_.a064(a1295, false);
        }
        final byte[] a1296 = gm_.a728("titles_purchased,7", false);
        if (a1296 != null) {
            ce_.titles_purchased[7] = dj_.a064(a1296, false);
        }
        final byte[] a1297 = gm_.a728("titles_purchased,8", false);
        if (a1297 != null) {
            ce_.titles_purchased[8] = dj_.a064(a1297, false);
        }
        final byte[] a1298 = gm_.a728("titles_purchased,9", false);
        if (a1298 != null) {
            ce_.titles_purchased[9] = dj_.a064(a1298, b);
        }
        final byte[] a1299 = gm_.a728("titles_purchased,10", false);
        if (null != a1299) {
            ce_.titles_purchased[10] = dj_.a064(a1299, false);
        }
        final byte[] a1300 = gm_.a728("titles_purchased,11", b);
        if (a1300 != null) {
            ce_.titles_purchased[11] = dj_.a064(a1300, false);
        }
        final byte[] a1301 = gm_.a728("titles_purchased,12", false);
        if (null != a1301) {
            ce_.titles_purchased[12] = dj_.a064(a1301, false);
        }
        final byte[] a1302 = gm_.a728("titles_purchased,13", false);
        if (a1302 != null) {
            ce_.titles_purchased[13] = dj_.a064(a1302, false);
        }
        final byte[] a1303 = gm_.a728("titles_purchased,14", false);
        if (a1303 != null) {
            ce_.titles_purchased[14] = dj_.a064(a1303, false);
        }
        final byte[] a1304 = gm_.a728("titles_purchased,15", false);
        if (a1304 != null) {
            ce_.titles_purchased[15] = dj_.a064(a1304, false);
        }
        final byte[] a1305 = gm_.a728("text_initiate_raid", b);
        if (a1305 != null) {
            t_.text_initiate_raid = dj_.a064(a1305, false);
        }
        final byte[] a1306 = gm_.a728("text_dragons_of_renown", false);
        if (null != a1306) {
            c_.text_dragons_of_renown = dj_.a064(a1306, b);
        }
        final byte[] a1307 = gm_.a728("text_my_profile", false);
        if (null != a1307) {
            sj_.text_my_profile = dj_.a064(a1307, false);
        }
        final byte[] a1308 = gm_.a728("text_construction", false);
        if (null != a1308) {
            uc_.text_construction = dj_.a064(a1308, false);
        }
        final byte[] a1309 = gm_.a728("text_stable", false);
        if (null != a1309) {
            rl_.text_stable = dj_.a064(a1309, false);
        }
        final byte[] a1310 = gm_.a728("text_result", false);
        if (null != a1310) {
            bb_.text_result = dj_.a064(a1310, false);
        }
        final byte[] a1311 = gm_.a728("text_continue", false);
        if (a1311 != null) {
            hj_.text_continue = dj_.a064(a1311, b);
        }
        final byte[] a1312 = gm_.a728("text_dungeon_assault", false);
        if (a1312 != null) {
            tp_.text_dungeon_assault = dj_.a064(a1312, false);
        }
        final byte[] a1313 = gm_.a728("text_instructions", b);
        if (a1313 != null) {
            bn_.text_instructions = dj_.a064(a1313, false);
        }
        final byte[] a1314 = gm_.a728("text_achievements", false);
        if (null != a1314) {
            vd_.text_achievements = dj_.a064(a1314, false);
        }
        final byte[] a1315 = gm_.a728("text_profile", b);
        if (a1315 != null) {
            gk_.text_profile = dj_.a064(a1315, false);
        }
        final byte[] a1316 = gm_.a728("text_dungeon_builder", b);
        if (a1316 != null) {
            f_.text_dungeon_builder = dj_.a064(a1316, false);
        }
        final byte[] a1317 = gm_.a728("text_cost_colon", false);
        if (a1317 != null) {
            ef_.text_cost_colon = dj_.a064(a1317, false);
        }
        final byte[] a1318 = gm_.a728("text_treasure_colon", b);
        if (a1318 != null) {
            pb_.text_treasure_colon = dj_.a064(a1318, false);
        }
        final byte[] a1319 = gm_.a728("text_menu", b);
        if (null != a1319) {
            l_.text_menu = dj_.a064(a1319, false);
        }
        final byte[] a1320 = gm_.a728("text_rooms", false);
        if (a1320 != null) {
            dj_.a064(a1320, false);
        }
        final byte[] a1321 = gm_.a728("text_commit", b);
        if (null != a1321) {
            lk_.text_commit = dj_.a064(a1321, false);
        }
        final byte[] a1322 = gm_.a728("text_cancel", false);
        if (a1322 != null) {
            be_.text_cancel = dj_.a064(a1322, b);
        }
        final byte[] a1323 = gm_.a728("text_members_only", false);
        if (a1323 != null) {
            dn_.text_members_only = dj_.a064(a1323, false);
        }
        final byte[] a1324 = gm_.a728("text_orbmode", false);
        if (a1324 != null) {
            be_.text_orbmode = dj_.a064(a1324, false);
        }
        final byte[] a1325 = gm_.a728("text_x_renown", false);
        if (null != a1325) {
            n_.text_x_renown = dj_.a064(a1325, b);
        }
        final byte[] a1326 = gm_.a728("text_exit", false);
        if (null != a1326) {
            r_.text_exit = dj_.a064(a1326, b);
        }
        final byte[] a1327 = gm_.a728("text_raid", b);
        if (a1327 != null) {
            ia_.text_raid = dj_.a064(a1327, false);
        }
        final byte[] a1328 = gm_.a728("text_search", b);
        if (a1328 != null) {
            RaidMember.text_search = dj_.a064(a1328, false);
        }
        final byte[] a1329 = gm_.a728("text_search_tip", false);
        if (a1329 != null) {
            hl_.text_search_tip = dj_.a064(a1329, b);
        }
        final byte[] a1330 = gm_.a728("text_recently_raided", false);
        if (null != a1330) {
            no_.text_recently_raided = dj_.a064(a1330, b);
        }
        final byte[] a1331 = gm_.a728("text_dismiss", false);
        if (null != a1331) {
            dj_.a064(a1331, false);
        }
        final byte[] a1332 = gm_.a728("text_revive", b);
        if (null != a1332) {
            sa_.text_revive = dj_.a064(a1332, b);
        }
        final byte[] a1333 = gm_.a728("text_heal", false);
        if (a1333 != null) {
            ae_.text_heal = dj_.a064(a1333, false);
        }
        final byte[] a1334 = gm_.a728("text_raid_fatal", false);
        if (null != a1334) {
            kc_.text_raid_fatal = dj_.a064(a1334, b);
        }
        final byte[] a1335 = gm_.a728("text_recruit", false);
        if (null != a1335) {
            dj_.a064(a1335, false);
        }
        final byte[] a1336 = gm_.a728("text_raider_recruitment", false);
        if (a1336 != null) {
            lg_.text_raider_recruitment = dj_.a064(a1336, b);
        }
        final byte[] a1337 = gm_.a728("text_raider_selection", b);
        if (null != a1337) {
            pi_.text_raider_selection = dj_.a064(a1337, false);
        }
        final byte[] a1338 = gm_.a728("text_inst_trap", b);
        if (a1338 != null) {
            an_.text_inst_trap = dj_.a064(a1338, false);
        }
        final byte[] a1339 = gm_.a728("text_inst_monster", false);
        if (null != a1339) {
            id_.text_inst_monster = dj_.a064(a1339, false);
        }
        final byte[] a1340 = gm_.a728("text_inst_guardian", false);
        if (null != a1340) {
            og_.text_inst_guardian = dj_.a064(a1340, b);
        }
        final byte[] a1341 = gm_.a728("text_renowntable_hint", false);
        if (a1341 != null) {
            Room.text_renowntable_hint = dj_.a064(a1341, false);
        }
        final byte[] a1342 = gm_.a728("text_stake", b);
        if (null != a1342) {
            le_.text_stake = dj_.a064(a1342, false);
        }
        final byte[] a1343 = gm_.a728("text_protection", false);
        if (null != a1343) {
            vl_.text_protection = dj_.a064(a1343, false);
        }
        final byte[] a1344 = gm_.a728("text_bounty", b);
        if (null != a1344) {
            mi_.text_bounty = dj_.a064(a1344, false);
        }
        final byte[] a1345 = gm_.a728("text_bounty_protection", false);
        if (null != a1345) {
            ra_.text_bounty_protection = dj_.a064(a1345, b);
        }
        final byte[] a1346 = gm_.a728("text_bounty_claimed", b);
        if (a1346 != null) {
            DungeonPath.text_bounty_claimed = dj_.a064(a1346, false);
        }
        final byte[] a1347 = gm_.a728("text_please_wait", false);
        if (null != a1347) {
            nl_.text_please_wait = dj_.a064(a1347, false);
        }
        final byte[] a1348 = gm_.a728("text_gold_stolen", b);
        if (null != a1348) {
            Animation.text_gold_stolen = dj_.a064(a1348, b);
        }
        final byte[] a1349 = gm_.a728("text_renown_lost", false);
        if (a1349 != null) {
            jc_.text_renown_lost = dj_.a064(a1349, b);
        }
        final byte[] a1350 = gm_.a728("text_spendable_renown", b);
        if (a1350 != null) {
            nm_.text_spendable_renown = dj_.a064(a1350, false);
        }
        final byte[] a1351 = gm_.a728("text_renown_gained", false);
        if (a1351 != null) {
            kl_.text_renown_gained = dj_.a064(a1351, false);
        }
        final byte[] a1352 = gm_.a728("text_risk_of_waking", false);
        if (null != a1352) {
            li_.text_risk_of_waking = dj_.a064(a1352, false);
        }
        final byte[] a1353 = gm_.a728("text_too_heavy", false);
        if (null != a1353) {
            oo_.text_too_heavy = dj_.a064(a1353, false);
        }
        final byte[] a1354 = gm_.a728("text_steal_gold", false);
        if (a1354 != null) {
            ab_.text_steal_gold = dj_.a064(a1354, b);
        }
        final byte[] a1355 = gm_.a728("text_claim_bounty", b);
        if (null != a1355) {
            dj_.a064(a1355, b);
        }
        final byte[] a1356 = gm_.a728("text_hoard_room", b);
        if (null != a1356) {
            ak_.text_hoard_room = dj_.a064(a1356, false);
        }
        final byte[] a1357 = gm_.a728("text_accept", b);
        if (a1357 != null) {
            pe_.text_accept = dj_.a064(a1357, false);
        }
        final byte[] a1358 = gm_.a728("text_close", false);
        if (null != a1358) {
            HeaderLabelText.text_close = dj_.a064(a1358, b);
        }
        final byte[] a1359 = gm_.a728("text_orbs_of_mastery", false);
        if (a1359 != null) {
            ag_.text_orbs_of_mastery = dj_.a064(a1359, false);
        }
        final byte[] a1360 = gm_.a728("text_renown_and_raids", false);
        if (null != a1360) {
            uj_.text_renown_and_raids = dj_.a064(a1360, b);
        }
        final byte[] a1361 = gm_.a728("text_cost_x", false);
        if (null != a1361) {
            ho_.text_cost_x = dj_.a064(a1361, false);
        }
        final byte[] a1362 = gm_.a728("text_plan", false);
        if (a1362 != null) {
            mm_.text_plan = dj_.a064(a1362, false);
        }
        final byte[] a1363 = gm_.a728("text_3dview", false);
        if (null != a1363) {
            AmbientAudioTrack.text_3dview = dj_.a064(a1363, false);
        }
        final byte[] a1364 = gm_.a728("text_viewstyle", b);
        if (a1364 != null) {
            uf_.text_viewstyle = dj_.a064(a1364, b);
        }
        final byte[] a1365 = gm_.a728("text_isometric", false);
        if (a1365 != null) {
            ql_.text_isometric = dj_.a064(a1365, b);
        }
        final byte[] a1366 = gm_.a728("text_topdown", false);
        if (a1366 != null) {
            go_.text_topdown = dj_.a064(a1366, false);
        }
        final byte[] a1367 = gm_.a728("text_buy", false);
        if (null != a1367) {
            bg_.text_buy = dj_.a064(a1367, false);
        }
        final byte[] a1368 = gm_.a728("text_orb_warning", false);
        if (a1368 != null) {
            oj_.text_orb_warning = dj_.a064(a1368, b);
        }
        final byte[] a1369 = gm_.a728("text_charging_hint_none", false);
        if (a1369 != null) {
            ng_.text_charging_hint_none = dj_.a064(a1369, false);
        }
        final byte[] a1370 = gm_.a728("text_charging_hint_x", false);
        if (a1370 != null) {
            dg_.text_charging_hint_x = dj_.a064(a1370, false);
        }
        final byte[] a1371 = gm_.a728("c", false);
        if (null != a1371) {
            oc_.text_charging_hint_x = dj_.a064(a1371, b);
        }
        final byte[] a1372 = gm_.a728("text_dungeon_reset", false);
        if (null != a1372) {
            fl_.text_dungeon_reset = dj_.a064(a1372, false);
        }
        final byte[] a1373 = gm_.a728("text_orbs_active_x", b);
        if (null != a1373) {
            nh_.text_orbs_active_x = dj_.a064(a1373, b);
        }
        final byte[] a1374 = gm_.a728("text_orbs_charging_x", false);
        if (null != a1374) {
            to_.text_orbs_charging_x = dj_.a064(a1374, false);
        }
        final byte[] a1375 = gm_.a728("text_limit_reached", false);
        if (null != a1375) {
            qh_.text_limit_reached = dj_.a064(a1375, false);
        }
        final byte[] a1376 = gm_.a728("text_limit_reached_long", false);
        if (a1376 != null) {
            bl_.text_limit_reached_long = dj_.a064(a1376, b);
        }
        final byte[] a1377 = gm_.a728("text_stole_gold", b);
        if (a1377 != null) {
            wi_.text_stole_gold = dj_.a064(a1377, false);
        }
        final byte[] a1378 = gm_.a728("text_woke_dragon", false);
        if (a1378 != null) {
            sm_.text_woke_dragon = dj_.a064(a1378, false);
        }
        final byte[] a1379 = gm_.a728("text_raiders_died_none", false);
        if (null != a1379) {
            l_.text_raiders_died_none = dj_.a064(a1379, false);
        }
        final byte[] a1380 = gm_.a728("text_raiders_died_one", b);
        if (a1380 != null) {
            rp_.text_raiders_died_one = dj_.a064(a1380, false);
        }
        final byte[] a1381 = gm_.a728("text_raiders_died_x", false);
        if (a1381 != null) {
            od_.text_raiders_died_x = dj_.a064(a1381, b);
        }
        final byte[] a1382 = gm_.a728("text_status_postcombat", b);
        if (null != a1382) {
            co_.text_status_postcombat = dj_.a064(a1382, b);
        }
        final byte[] a1383 = gm_.a728("text_status_pregame", false);
        if (null != a1383) {
            bj_.text_status_pregame = dj_.a064(a1383, false);
        }
        final byte[] a1384 = gm_.a728("text_flee_tooltip", false);
        if (a1384 != null) {
            eb_.text_flee_tooltip = dj_.a064(a1384, false);
        }
        final byte[] a1385 = gm_.a728("text_advance_tooltip", false);
        if (a1385 != null) {
            hm_.text_advance_tooltip = dj_.a064(a1385, b);
        }
        final byte[] a1386 = gm_.a728("text_charge_tooltip", false);
        if (null != a1386) {
            mo_.text_charge_tooltip = dj_.a064(a1386, false);
        }
        final byte[] a1387 = gm_.a728("text_disarm_trap_tooltip", false);
        if (a1387 != null) {
            Room.text_disarm_trap_tooltip = dj_.a064(a1387, false);
        }
        final byte[] a1388 = gm_.a728("text_disarm_guardian_tooltip", false);
        if (a1388 != null) {
            kg_.text_disarm_guardian_tooltip = dj_.a064(a1388, b);
        }
        final byte[] a1389 = gm_.a728("text_sneak_past_tooltip", false);
        if (null != a1389) {
            a_.text_sneak_past_tooltip = dj_.a064(a1389, false);
        }
        final byte[] a1390 = gm_.a728("text_continue_tooltip", false);
        if (a1390 != null) {
            pb_.text_continue_tooltip = dj_.a064(a1390, false);
        }
        final byte[] a1391 = gm_.a728("text_flee_coloured", false);
        if (null != a1391) {
            qa_.text_flee_coloured = dj_.a064(a1391, false);
        }
        final byte[] a1392 = gm_.a728("text_advance_coloured", false);
        if (a1392 != null) {
            dn_.text_advance_coloured = dj_.a064(a1392, false);
        }
        final byte[] a1393 = gm_.a728("text_charge_coloured", b);
        if (null != a1393) {
            lh_.text_charge_coloured = dj_.a064(a1393, false);
        }
        final byte[] a1394 = gm_.a728("text_disarm_trap_coloured", false);
        if (null != a1394) {
            vd_.text_disarm_trap_coloured = dj_.a064(a1394, b);
        }
        final byte[] a1395 = gm_.a728("text_disarm_guardian_coloured", false);
        if (null != a1395) {
            u_.text_disarm_guardian_coloured = dj_.a064(a1395, false);
        }
        final byte[] a1396 = gm_.a728("text_useskill_coloured", false);
        if (a1396 != null) {
            dj_.a064(a1396, false);
        }
        final byte[] a1397 = gm_.a728("text_flee_minitip", false);
        if (null != a1397) {
            jc_.text_flee_minitip = dj_.a064(a1397, false);
        }
        final byte[] a1398 = gm_.a728("text_advance_minitip", b);
        if (null != a1398) {
            gi_.text_advance_minitip = dj_.a064(a1398, false);
        }
        final byte[] a1399 = gm_.a728("text_charge_minitip", false);
        if (a1399 != null) {
            fp_.text_charge_minitip = dj_.a064(a1399, b);
        }
        final byte[] a1400 = gm_.a728("text_disarm_trap_minitip", b);
        if (null != a1400) {
            vo_.text_disarm_trap_minitip = dj_.a064(a1400, false);
        }
        final byte[] a1401 = gm_.a728("text_disarm_guardian_minitip", b);
        if (a1401 != null) {
            GUICheckbox.text_disarm_guardian_minitip = dj_.a064(a1401, false);
        }
        final byte[] a1402 = gm_.a728("text_useskill_minitip", false);
        if (null != a1402) {
            dj_.a064(a1402, b);
        }
        final byte[] a1403 = gm_.a728("text_guardian_detected_alerted", false);
        if (a1403 != null) {
            nh_.text_guardian_detected_alerted = dj_.a064(a1403, false);
        }
        final byte[] a1404 = gm_.a728("text_raider_snuck_past_guardian", b);
        if (null != a1404) {
            c_.text_raider_snuck_past_guardian = dj_.a064(a1404, false);
        }
        final byte[] a1405 = gm_.a728("text_guardian_trapped_alerted", b);
        if (a1405 != null) {
            ah_.text_guardian_trapped_alerted = dj_.a064(a1405, b);
        }
        final byte[] a1406 = gm_.a728("text_raider_avoided_guardian", false);
        if (null != a1406) {
            np_.text_raider_avoided_guardian = dj_.a064(a1406, b);
        }
        final byte[] a1407 = gm_.a728("text_monster_wins", b);
        if (a1407 != null) {
            Raider.text_monster_wins = dj_.a064(a1407, false);
        }
        final byte[] a1408 = gm_.a728("text_monster_attacks", false);
        if (a1408 != null) {
            u_.text_monster_attacks = dj_.a064(a1408, false);
        }
        final byte[] a1409 = gm_.a728("text_raider_wins", b);
        if (null != a1409) {
            lj_.text_raider_wins = dj_.a064(a1409, false);
        }
        final byte[] a1410 = gm_.a728("text_raider_escapes", b);
        if (null != a1410) {
            cm_.text_raider_escapes = dj_.a064(a1410, b);
        }
        final byte[] a1411 = gm_.a728("text_raider_attacks", false);
        if (a1411 != null) {
            ri_.text_raider_attacks = dj_.a064(a1411, b);
        }
        final byte[] a1412 = gm_.a728("text_raider_dodges", false);
        if (a1412 != null) {
            al_.text_raider_dodges = dj_.a064(a1412, false);
        }
        final byte[] a1413 = gm_.a728("text_success", false);
        if (a1413 != null) {
            Trap.text_success = dj_.a064(a1413, false);
        }
        final byte[] a1414 = gm_.a728("text_failure", b);
        if (a1414 != null) {
            lp_.text_failure = dj_.a064(a1414, b);
        }
        final byte[] a1415 = gm_.a728("text_party_sneaks_past", false);
        if (a1415 != null) {
            qj_.text_party_sneaks_past = dj_.a064(a1415, false);
        }
        final byte[] a1416 = gm_.a728("text_monster_failed_to_trap", false);
        if (null != a1416) {
            fc_.text_monster_failed_to_trap = dj_.a064(a1416, b);
        }
        final byte[] a1417 = gm_.a728("text_raider_detected", b);
        if (a1417 != null) {
            uo_.text_raider_detected = dj_.a064(a1417, b);
        }
        final byte[] a1418 = gm_.a728("text_raider_avoided_detection", b);
        if (a1418 != null) {
            mo_.text_raider_avoided_detection = dj_.a064(a1418, false);
        }
        final byte[] a1419 = gm_.a728("text_raiders_flee_in_terror", false);
        if (a1419 != null) {
            ep_.text_raiders_flee_in_terror = dj_.a064(a1419, false);
        }
        final byte[] a1420 = gm_.a728("text_raider_trapped_incap", false);
        if (null != a1420) {
            bp_.text_raider_trapped_incap = dj_.a064(a1420, false);
        }
        final byte[] a1421 = gm_.a728("text_raider_trapped_killed", b);
        if (null != a1421) {
            vb_.text_raider_trapped_killed = dj_.a064(a1421, false);
        }
        final byte[] a1422 = gm_.a728("text_raider_avoided_trap", false);
        if (null != a1422) {
            ba_.text_raider_avoided_trap = dj_.a064(a1422, false);
        }
        final byte[] a1423 = gm_.a728("text_raider_disarmed_trap", b);
        if (null != a1423) {
            ch_.text_raider_disarmed_trap = dj_.a064(a1423, b);
        }
        final byte[] a1424 = gm_.a728("text_status_precombat", b);
        if (a1424 != null) {
            rn_.text_status_precombat = dj_.a064(a1424, false);
        }
        final byte[] a1425 = gm_.a728("text_hint_select_room", false);
        if (null != a1425) {
            pi_.text_hint_select_room = dj_.a064(a1425, false);
        }
        final byte[] a1426 = gm_.a728("text_hint_select_raider", b);
        if (a1426 != null) {
            ho_.text_hint_select_raider = dj_.a064(a1426, false);
        }
        final byte[] a1427 = gm_.a728("text_party_defeated", false);
        if (null != a1427) {
            al_.text_party_defeated = dj_.a064(a1427, false);
        }
        final byte[] a1428 = gm_.a728("text_hoardroom_hint", false);
        if (null != a1428) {
            um_.text_hoardroom_hint = dj_.a064(a1428, false);
        }
        final byte[] a1429 = gm_.a728("text_cost", false);
        if (a1429 != null) {
            tn_.text_cost = dj_.a064(a1429, false);
        }
        final byte[] a1430 = gm_.a728("text_attack", false);
        if (null != a1430) {
            qk_.text_attack = dj_.a064(a1430, false);
        }
        final byte[] a1431 = gm_.a728("text_defence", false);
        if (null != a1431) {
            dj_.text_defence = dj_.a064(a1431, false);
        }
        final byte[] a1432 = gm_.a728("text_dodge", false);
        if (a1432 != null) {
            pm_.text_dodge = dj_.a064(a1432, false);
        }
        final byte[] a1433 = gm_.a728("text_sneak", b);
        if (a1433 != null) {
            nf_.text_sneak = dj_.a064(a1433, false);
        }
        final byte[] a1434 = gm_.a728("text_snare", false);
        if (null != a1434) {
            rk_.text_snare = dj_.a064(a1434, false);
        }
        final byte[] a1435 = gm_.a728("text_detect", b);
        if (null != a1435) {
            eg_.text_detect = dj_.a064(a1435, false);
        }
        final byte[] a1436 = gm_.a728("text_sort_raiders_by", false);
        if (a1436 != null) {
            ib_.text_sort_raiders_by = dj_.a064(a1436, false);
        }
        final byte[] a1437 = gm_.a728("text_sort_rooms_by", false);
        if (null != a1437) {
            tp_.text_sort_rooms_by = dj_.a064(a1437, false);
        }
        final byte[] a1438 = gm_.a728("text_modifier_stat_increased", false);
        if (a1438 != null) {
            so_.text_modifier_stat_increased = dj_.a064(a1438, false);
        }
        final byte[] a1439 = gm_.a728("text_modifier_stat_decreased", b);
        if (null != a1439) {
            vc_.text_modifier_stat_decreased = dj_.a064(a1439, false);
        }
        final byte[] a1440 = gm_.a728("text_modifier_glamour", false);
        if (a1440 != null) {
            kl_.text_modifier_glamour = dj_.a064(a1440, b);
        }
        final byte[] a1441 = gm_.a728("text_dead", false);
        if (null != a1441) {
            kg_.text_dead = dj_.a064(a1441, b);
        }
        final byte[] a1442 = gm_.a728("text_incapacitated", false);
        if (a1442 != null) {
            gl_.text_incapacitated = dj_.a064(a1442, false);
        }
        final byte[] a1443 = gm_.a728("text_ability_used", false);
        if (null != a1443) {
            wi_.text_ability_used = dj_.a064(a1443, b);
        }
        final byte[] a1444 = gm_.a728("text_disarmed", false);
        if (a1444 != null) {
            fi_.text_disarmed = dj_.a064(a1444, false);
        }
        final byte[] a1445 = gm_.a728("text_defeated", b);
        if (a1445 != null) {
            ii_.text_defeated = dj_.a064(a1445, b);
        }
        final byte[] a1446 = gm_.a728("text_modifier_blinded", false);
        if (null != a1446) {
            dm_.text_modifier_blinded = dj_.a064(a1446, b);
        }
        final byte[] a1447 = gm_.a728("text_passive_ability", b);
        if (null != a1447) {
            rm_.text_passive_ability = dj_.a064(a1447, false);
        }
        final byte[] a1448 = gm_.a728("text_ability_ready", b);
        if (null != a1448) {
            g_.text_ability_ready = dj_.a064(a1448, b);
        }
        final byte[] a1449 = gm_.a728("text_active_ability", b);
        if (null != a1449) {
            lc_.text_active_ability = dj_.a064(a1449, b);
        }
        final byte[] a1450 = gm_.a728("text_activeraider", b);
        if (a1450 != null) {
            od_.text_activeraider = dj_.a064(a1450, b);
        }
        final byte[] a1451 = gm_.a728("text_useskill", false);
        if (a1451 != null) {
            vo_.text_useskill = dj_.a064(a1451, false);
        }
        final byte[] a1452 = gm_.a728("text_raider", b);
        if (null != a1452) {
            gg_.text_raider = dj_.a064(a1452, false);
        }
        final byte[] a1453 = gm_.a728("text_monster", false);
        if (a1453 != null) {
            af_.text_monster = dj_.a064(a1453, b);
        }
        final byte[] a1454 = gm_.a728("text_trap", false);
        if (a1454 != null) {
            DungeonAssault.text_trap = dj_.a064(a1454, false);
        }
        final byte[] a1455 = gm_.a728("text_guardian", false);
        if (a1455 != null) {
            ki_.text_guardian = dj_.a064(a1455, false);
        }
        final byte[] a1456 = gm_.a728("text_raiders", false);
        if (null != a1456) {
            ak_.text_raiders = dj_.a064(a1456, b);
        }
        final byte[] a1457 = gm_.a728("text_monsters", b);
        if (null != a1457) {
            wo_.text_monsters = dj_.a064(a1457, false);
        }
        final byte[] a1458 = gm_.a728("text_traps", false);
        if (a1458 != null) {
            dh_.text_traps = dj_.a064(a1458, b);
        }
        final byte[] a1459 = gm_.a728("text_guardians", false);
        if (a1459 != null) {
            DungeonPath.text_guardians = dj_.a064(a1459, false);
        }
        final byte[] a1460 = gm_.a728("text_no_defences", false);
        if (a1460 != null) {
            GUIInput.text_no_defences = dj_.a064(a1460, b);
        }
        final byte[] a1461 = gm_.a728("text_defences", false);
        if (null != a1461) {
            GUICheckbox.text_defences = dj_.a064(a1461, b);
        }
        final byte[] a1462 = gm_.a728("text_no_raids", false);
        if (a1462 != null) {
            wa_.text_no_raids = dj_.a064(a1462, false);
        }
        final byte[] a1463 = gm_.a728("text_outcome", false);
        if (null != a1463) {
            ip_.text_outcome = dj_.a064(a1463, b);
        }
        final byte[] a1464 = gm_.a728("text_raids", false);
        if (null != a1464) {
            DungeonBuilder.text_raids = dj_.a064(a1464, false);
        }
        final byte[] a1465 = gm_.a728("text_income_rate", false);
        if (a1465 != null) {
            la_.text_income_rate = dj_.a064(a1465, false);
        }
        final byte[] a1466 = gm_.a728("text_unspent_x", false);
        if (null != a1466) {
            bp_.text_unspent_x = dj_.a064(a1466, b);
        }
        final byte[] a1467 = gm_.a728("text_highest_x", false);
        if (a1467 != null) {
            mm_.text_highest_x = dj_.a064(a1467, b);
        }
        final byte[] a1468 = gm_.a728("text_renown_x", false);
        if (null != a1468) {
            kk_.text_renown_x = dj_.a064(a1468, b);
        }
        final byte[] a1469 = gm_.a728("text_confirm_changes", false);
        if (null != a1469) {
            oa_.text_confirm_changes = dj_.a064(a1469, false);
        }
        final byte[] a1470 = gm_.a728("text_confirm_changes_dungeon", false);
        if (a1470 != null) {
            wj_.text_confirm_changes_dungeon = dj_.a064(a1470, false);
        }
        final byte[] a1471 = gm_.a728("text_confirm_changes_stable", false);
        if (a1471 != null) {
            pb_.text_confirm_changes_stable = dj_.a064(a1471, false);
        }
        final byte[] a1472 = gm_.a728("text_save_and_exit", b);
        if (null != a1472) {
            ud_.text_save_and_exit = dj_.a064(a1472, b);
        }
        final byte[] a1473 = gm_.a728("text_exit_without_saving", false);
        if (a1473 != null) {
            pm_.text_exit_without_saving = dj_.a064(a1473, false);
        }
        final byte[] a1474 = gm_.a728("text_save_and_exit_brief", false);
        if (a1474 != null) {
            oi_.text_save_and_exit_brief = dj_.a064(a1474, b);
        }
        final byte[] a1475 = gm_.a728("text_exit_without_saving_brief", false);
        if (a1475 != null) {
            nk_.text_exit_without_saving_brief = dj_.a064(a1475, false);
        }
        final byte[] a1476 = gm_.a728("text_warning_activate_dungeon", false);
        if (a1476 != null) {
            dh_.text_warning_activate_dungeon = dj_.a064(a1476, false);
        }
        final byte[] a1477 = gm_.a728("text_dungeon_builder_hint", false);
        if (a1477 != null) {
            MusicTrack.text_dungeon_builder_hint = dj_.a064(a1477, false);
        }
        final byte[] a1478 = gm_.a728("text_activate_dungeon_dialog_title", false);
        if (a1478 != null) {
            dj_.a064(a1478, false);
        }
        final byte[] a1479 = gm_.a728("text_activate_dungeon_dialog_body", b);
        if (null != a1479) {
            dj_.a064(a1479, false);
        }
        final byte[] a1480 = gm_.a728("text_raider_recruitment_hint", b);
        if (a1480 != null) {
            a_.text_raider_recruitment_hint = dj_.a064(a1480, b);
        }
        final byte[] a1481 = gm_.a728("text_dismiss_tooltip", false);
        if (null != a1481) {
            dj_.a064(a1481, false);
        }
        final byte[] a1482 = gm_.a728("text_revive_tooltip", b);
        if (null != a1482) {
            Tooltip.text_revive_tooltip = dj_.a064(a1482, false);
        }
        final byte[] a1483 = gm_.a728("text_heal_tooltip", false);
        if (null != a1483) {
            t_.text_heal_tooltip = dj_.a064(a1483, b);
        }
        final byte[] a1484 = gm_.a728("text_recruit_tooltip", false);
        if (null != a1484) {
            dj_.a064(a1484, false);
        }
        final byte[] a1485 = gm_.a728("text_title_heading", b);
        if (null != a1485) {
            fd_.text_title_heading = dj_.a064(a1485, false);
        }
        final byte[] a1486 = gm_.a728("text_title_requirements_age_x", false);
        if (null != a1486) {
            vj_.text_title_requirements_age_x = dj_.a064(a1486, false);
        }
        final byte[] a1487 = gm_.a728("text_title_requirements_age_one", b);
        if (a1487 != null) {
            be_.text_title_requirements_age_one = dj_.a064(a1487, false);
        }
        final byte[] a1488 = gm_.a728("text_title_requirements_mastery_x", false);
        if (null != a1488) {
            wf_.text_title_requirements_mastery_x = dj_.a064(a1488, false);
        }
        final byte[] a1489 = gm_.a728("text_title_requirements_mastery_one", false);
        if (null != a1489) {
            tl_.text_title_requirements_mastery_one = dj_.a064(a1489, false);
        }
        final byte[] a1490 = gm_.a728("text_title_requirements_aggression", false);
        if (a1490 != null) {
            Trap.text_title_requirements_aggression = dj_.a064(a1490, false);
        }
        final byte[] a1491 = gm_.a728("text_title_requirements_achievement", false);
        if (a1491 != null) {
            l_.text_title_requirements_achievement = dj_.a064(a1491, b);
        }
        final byte[] a1492 = gm_.a728("text_title_requirements_external", false);
        if (a1492 != null) {
            uk_.text_title_requirements_external = dj_.a064(a1492, false);
        }
        final byte[] a1493 = gm_.a728("text_title_requirements_unknown", false);
        if (a1493 != null) {
            dk_.text_title_requirements_unknown = dj_.a064(a1493, false);
        }
        final byte[] a1494 = gm_.a728("text_title_hint", b);
        if (a1494 != null) {
            DungeonAssault.text_title_hint = dj_.a064(a1494, b);
        }
        final byte[] a1495 = gm_.a728("text_recently_raided_by", false);
        if (null != a1495) {
            oh_.text_recently_raided_by = dj_.a064(a1495, false);
        }
        final byte[] a1496 = gm_.a728("text_hint_redistribute", false);
        if (null != a1496) {
            eb_.text_hint_redistribute = dj_.a064(a1496, false);
        }
        final byte[] a1497 = gm_.a728("text_hint_spy", false);
        if (a1497 != null) {
            li_.text_hint_spy = dj_.a064(a1497, false);
        }
        final byte[] a1498 = gm_.a728("text_hint_sacrifice_raider", false);
        if (null != a1498) {
            wf_.text_hint_sacrifice_raider = dj_.a064(a1498, false);
        }
        final byte[] a1499 = gm_.a728("text_hint_sacrifice_greenskin", b);
        if (a1499 != null) {
            ta_.text_hint_sacrifice_greenskin = dj_.a064(a1499, false);
        }
        final byte[] a1500 = gm_.a728("text_hint_sacrifice_goblin", b);
        if (a1500 != null) {
            em_.text_hint_sacrifice_goblin = dj_.a064(a1500, false);
        }
        final byte[] a1501 = gm_.a728("text_hint_scout_room", false);
        if (a1501 != null) {
            rl_.text_hint_scout_room = dj_.a064(a1501, false);
        }
        final byte[] a1502 = gm_.a728("text_hint_revive", false);
        if (a1502 != null) {
            mo_.text_hint_revive = dj_.a064(a1502, false);
        }
        final byte[] a1503 = gm_.a728("text_hint_ability_glamour", false);
        if (null != a1503) {
            jd_.text_hint_ability_glamour = dj_.a064(a1503, false);
        }
        final byte[] a1504 = gm_.a728("text_hint_ability_boostsneak", b);
        if (null != a1504) {
            bb_.text_hint_ability_boostsneak = dj_.a064(a1504, b);
        }
        final byte[] a1505 = gm_.a728("text_hint_ability_boostdef", b);
        if (a1505 != null) {
            pe_.text_hint_ability_boostdef = dj_.a064(a1505, false);
        }
        final byte[] a1506 = gm_.a728("text_acv_hunter_singleton", false);
        if (a1506 != null) {
            i_.text_acv_hunter_singleton = dj_.a064(a1506, false);
        }
        final byte[] a1507 = gm_.a728("text_acv_hunter", false);
        if (a1507 != null) {
            ji_.text_acv_hunter = dj_.a064(a1507, false);
        }
        final byte[] a1508 = gm_.a728("text_acv_riches", false);
        if (null != a1508) {
            fn_.text_acv_riches = dj_.a064(a1508, false);
        }
        final byte[] a1509 = gm_.a728("text_acv_habit", b);
        if (a1509 != null) {
            wl_.text_acv_habit = dj_.a064(a1509, false);
        }
        final byte[] a1510 = gm_.a728("title_dtdtdt", b);
        if (a1510 != null) {
            ng_.title_dtdtdt = dj_.a064(a1510, false);
        }
        final byte[] a1511 = gm_.a728("renowntable_column_text,0", false);
        if (null != a1511) {
            GUICheckbox.renowntable_column_text[0] = dj_.a064(a1511, false);
        }
        final byte[] a1512 = gm_.a728("renowntable_column_text,1", false);
        if (null != a1512) {
            GUICheckbox.renowntable_column_text[1] = dj_.a064(a1512, false);
        }
        final byte[] a1513 = gm_.a728("renowntable_column_text,2", b);
        if (a1513 != null) {
            GUICheckbox.renowntable_column_text[2] = dj_.a064(a1513, false);
        }
        final byte[] a1514 = gm_.a728("renowntable_column_text,3", false);
        if (null != a1514) {
            GUICheckbox.renowntable_column_text[3] = dj_.a064(a1514, false);
        }
        final byte[] a1515 = gm_.a728("renowntable_error", false);
        if (a1515 != null) {
            Trap.renowntable_error = dj_.a064(a1515, false);
        }
        final byte[] a1516 = gm_.a728("achievement_title", false);
        if (a1516 != null) {
            f_.achievement_title = dj_.a064(a1516, false);
        }
        d_._d = null;
    }
    
    final void d093(final int n, final int n2) {
        this.buffer[-n2 + this.currentIndex - 4] = (byte)(n2 >> 24);
        this.buffer[this.currentIndex + (-n2 - 3)] = (byte)(n2 >> 16);
        this.buffer[-n2 + (this.currentIndex - 2)] = (byte)(n2 >> 8);
        this.buffer[-n2 + this.currentIndex - n] = (byte)n2;
    }
    
    //original signature: final int d410(final byte b) {
    final int d410() {
        if (128 <= (this.buffer[this.currentIndex] & 0xFF)) {
            return this.readShort() - 32768;
        }
        return this.readByte();
    }
    
    //original signature: final int f137(final int n) {
    final int readTribyte(final int n) {
        this.currentIndex += 3;
        return ((this.buffer[this.currentIndex - 3] & 0xFF) << 16) + (((this.buffer[this.currentIndex - 2] & 0xFF) << 8) + (0xFF & this.buffer[this.currentIndex - 1]));
    }
    
    static final boolean a366(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        return n7 < 54 || (n5 <= n3 && n5 + n4 > n3 && n6 >= n && n + n2 > n6);
    }
    
    //original signature: final void b093(final int n, final int n2) {
    final void writeNewSize(final int n, final int n2) {
        this.buffer[-n + this.currentIndex - 2] = (byte)(n >> 8);
        this.buffer[-n + this.currentIndex - n2] = (byte)n;
    }
    
    //original signature: final void b627(final String s, final byte b) {
    final void b627(final String s) {
        if (0 <= s.indexOf(0)) {
            throw new IllegalArgumentException("");
        }
        this.currentIndex += a165(s.length(), this.buffer, this.currentIndex, s);
        this.buffer[this.currentIndex++] = 0;
    }
    
    //original signature: final void a494(final BigInteger bigInteger, final int n, final BigInteger bigInteger2) {
    final void RSAEncrypt(final BigInteger publicKey, final BigInteger publicKeyExponent) {
        final int o = this.currentIndex;
        this.currentIndex = 0;
        final byte[] array = new byte[o];
        this.a286(0, o, array);
        final BigInteger modPow = new BigInteger(array).modPow(publicKeyExponent, publicKey);
        final byte[] byteArray = modPow.toByteArray();
        this.currentIndex = 0;
        this.storeShort(byteArray.length);
        this.storeArray(byteArray, byteArray.length);
    }
    
    //original signature: final int l137(final int n) {
    final int l137() {
        final int n2 = this.buffer[this.currentIndex] & 0xFF;
        if (128 > n2) {
            return this.readByte() - 64;
        }
        return this.readShort() - 49152;
    }
    
    //original signature: final String b791(final boolean b) {
    final String b791() {
        if (this.buffer[this.currentIndex] == 0) {
            ++this.currentIndex;
            return null;
        }
        return this.d738();
    }
    
    final void c093(final int n, final int n2) {
        this.buffer[n2 - n + this.currentIndex] = (byte)n;
    }
    
    //original signature: final int k137(final int n) {
    final int readShort() {
        this.currentIndex += 2;
        return ((0xFF & this.buffer[this.currentIndex - 2]) << 8) + (0xFF & this.buffer[this.currentIndex - 1]);
    }
    
    //original signature: final void e093(final int n, final int n2) {
    final void e093(final int n2) {
        if (0x0 != (n2 & 0xFFFFFF80)) {
            if (0x0 != (n2 & 0xFFFFC000)) {
                if (0x0 != (n2 & 0xFFE00000)) {
                    if ((n2 & 0xF0000000) != 0x0) {
                        this.storeByte(0x80 | n2 >>> 28);
                    }
                    this.storeByte(n2 >>> 21 | 0x80);
                }
                this.storeByte((n2 | 0x201371) >>> 14);
            }
            this.storeByte(0x80 | n2 >>> 7);
        }
        this.storeByte(n2 & 0x7F);
    }
    
    //original signature: final void a332(final int n, final int[] array, final int o, final int n2) {
    final void a332(final int n, final int[] array, final int o) {
        final int o2 = this.currentIndex;
        this.currentIndex = o;
        for (int n3 = (n - o) / 8, i = 0; i < n3; ++i) {
            int h137 = this.readInt();
            int h138 = this.readInt();
            int n4 = -957401312;
            final int n5 = -1640531527;
            int n6 = 32;
            while (0 < n6--) {
                h138 -= (n4 + array[(0x1D53 & n4) >>> 11] ^ h137 + (h137 >>> 5 ^ h137 << 4));
                n4 -= n5;
                h137 -= (array[0x3 & n4] + n4 ^ (h138 << 4 ^ h138 >>> 5) + h138);
            }
            this.currentIndex -= 8;
            this.storeInt(h137);
            this.storeInt(h138);
        }
        this.currentIndex = o2;
    }
    
    //original signature: final void a556(final byte b, final int n) {
    final void storeInt(final int n) {
        this.buffer[this.currentIndex++] = (byte)(n >> 24);
        this.buffer[this.currentIndex++] = (byte)(n >> 16);
        this.buffer[this.currentIndex++] = (byte)(n >> 8);
        this.buffer[this.currentIndex++] = (byte)n;
    }
    
    //original signature: final String d738(final int n) {
    final String d738() {
        final int o = this.currentIndex;
        while (this.buffer[this.currentIndex++] != 0) {} //loop until we're at a 0
        final int n2 = -o + this.currentIndex - 1;
        if (n2 == 0) {
            return "";
        }
        return mk_.a046(this.buffer, n2, o);
    }
    
    //original signature: final int c543(final byte b, final int n) {
    final int calculateAndStoreChecksum(final int n) {
        final int a552 = fm_.calculateChecksum(this.currentIndex, n, this.buffer);
        this.storeInt(a552);
        return a552;
    }
    
    //original signature: final long c411(final byte b) {
    final long c411() {
        return ((0xFFFFFFFFL & (long)this.readInt()) << 32) + ((long)this.readInt() & 0xFFFFFFFFL);
    }
    
    //original signature: final int j137(final int n) {
    final int j137() {
        if (0 > this.buffer[this.currentIndex]) {
            return Integer.MAX_VALUE & this.readInt();
        }
        return this.readShort();
    }
    
    //original signature: final byte a403(final byte b) {
    final byte readUnsignedByte() {
        return this.buffer[this.currentIndex++];
    }
    
    //original signature: final int readByte(final boolean b) {
    final int readByte() {
        return 0xFF & this.buffer[this.currentIndex++];
    }
    
    //original signature: static final int[] h111(final int n, final int n2) {
    static final int[] h111(final int n) {
        final int[] array = new int[ib_._k];
        for (int i = 0; i < ib_._k; ++i) {
            array[i] = Integer.MAX_VALUE;
        }
        array[n] = 0;
        final md_ md_ = new md_();
        md_.a865(new a_(n));
        while (!md_.a427()) {
            final int j = ((a_)md_.b081())._j;
            final int n3 = 1 + array[j];
            if (j % ib_._j > 0) {
                dm_.a731(md_, array, n3, j - 1, j + (-1 - j / ib_._j));
            }
            if (ib_._j - 1 > j % ib_._j) {
                dm_.a731(md_, array, n3, 1 + j, j - j / ib_._j);
            }
            if (j >= ib_._j) {
                dm_.a731(md_, array, n3, j - ib_._j, (ib_._l >> 1) + j - ib_._j);
            }
            if (ib_._k - ib_._j > j) {
                dm_.a731(md_, array, n3, ib_._j + j, j + (ib_._l >> 1));
            }
        }
        return array;
    }
    
    //original signature: final void b556(final byte b, final int n) {
    final void storeTribyte(final int n) {
        this.buffer[this.currentIndex++] = (byte)(n >> 16);
        this.buffer[this.currentIndex++] = (byte)(n >> 8);
        this.buffer[this.currentIndex++] = (byte)n;
    }
    
    //original signature: final int e137(final int n) {
    final int e137() {
        byte b = this.buffer[this.currentIndex++];
        int n2 = 0;
        while (0 > b) {
            n2 = ((0x7F & b) | n2) << 7;
            b = this.buffer[this.currentIndex++];
        }
        return n2 | b;
    }
    
    //original signature: final boolean d491(final boolean b) {
    final boolean compareChecksums() {
        this.currentIndex -= 4;
        return fm_.calculateChecksum(this.currentIndex, 0, this.buffer) == this.readInt();
    }
    
    //original signature: final void a984(final int n, final String s) {
    final void a984(final String s) {
        if (s.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.buffer[this.currentIndex++] = 0;
        this.currentIndex += a165(s.length(), this.buffer, this.currentIndex, s);
        this.buffer[this.currentIndex++] = 0;
    }
    
    ec_(final int n) {
        this.currentIndex = 0;
        this.buffer = kn_.a551(n);
    }
    
    //original signature: final void a263(final byte[] array, final int n, final int n2, final int n3) {
    final void storeArray(final byte[] array, final int numberOfBytes) {
        for (int i = 0; numberOfBytes > i; ++i) {
            this.buffer[this.currentIndex++] = array[i];
        }
    }
    
    //original signature: ec_(final byte[] m) {
    ec_(final byte[] byteArray) {
        this.buffer = byteArray;
        this.currentIndex = 0;
    }
    
    static {
        ec_.basilisk = "Basilisk";
        ec_._i = new fb_();
    }
}
