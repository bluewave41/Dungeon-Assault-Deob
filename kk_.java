final class kk_ extends ne_
{
    of_[] _n;
    //original name: _l
    static FontStyle smallfont;
    //original name: _s
    static String text_renown_x;
    byte[] _p;
    private int[] _q;
    //original name: _i
    static String pit_demon;
    va_[] _k;
    int _j;
    short[] _r;
    byte[] _m;
    //original name: _t
    static String pleasetryagain;
    byte[] _o;
    
    static final boolean d154() {
        return sl_.b154(15000);
    }
    
    final boolean a920(final byte b, final lc_ lc_, final int[] array, final byte[] array2) {
        boolean b2 = true;
        if (b != 45) {
            return true;
        }
        int n = 0;
        va_ va_ = null;
        for (int n2 = 0; 128 > n2; ++n2) {
            if (array2 == null || 0 != array2[n2]) {
                int n3 = this._q[n2];
                if (n3 != 0) {
                    if (n != n3) {
                        n = n3;
                        --n3;
                        if ((0x1 & n3) != 0x0) {
                            va_ = lc_.a152(array, (byte)(-97), n3 >> 2);
                        }
                        else {
                            va_ = lc_.a319(array, n3 >> 2);
                        }
                        if (null == va_) {
                            b2 = false;
                        }
                    }
                    if (va_ != null) {
                        this._k[n2] = va_;
                        this._q[n2] = 0;
                    }
                }
            }
        }
        return b2;
    }
    
    final void a423(final byte b) {
        this._q = null;
        if (b != -97) {
            a150(95);
        }
    }
    
    public static void a150(final int n) {
        kk_.pit_demon = null;
        kk_.pleasetryagain = null;
        kk_.text_renown_x = null;
        if (n != 0) {
            kk_.text_renown_x = null;
        }
        kk_.smallfont = null;
    }
    
    static final String a015(final String s, final String s2, final String s3) {
        final int length = s.length();
        final int length2 = s2.length();
        final int length3 = s3.length();
        if (length2 != 0) {
            int n = length;
            final int n2 = length3 - length2;
            if (n2 != 0) {
                int n3 = 0;
                while (true) {
                    final int index = s.indexOf(s2, n3);
                    if (0 > index) {
                        break;
                    }
                    n += n2;
                    n3 = index + length2;
                }
            }
            final StringBuilder sb = new StringBuilder(n);
            int n4 = 0;
            while (true) {
                final int index2 = s.indexOf(s2, n4);
                if (0 > index2) {
                    break;
                }
                sb.append(s.substring(n4, index2));
                sb.append(s3);
                n4 = index2 + length2;
            }
            sb.append(s.substring(n4));
            return sb.toString();
        }
        throw new IllegalArgumentException("Key cannot have zero length");
    }
    
    static final tj_ a005(final nh_ nh_, final nh_ nh_2, final String s, final int n, final String s2) {
        final int a913 = nh_2.a913(s2, n + 1000);
        return ef_.a639(n + 61, a913, nh_2, nh_2.a026(n, s, a913), nh_);
    }
    
    static final boolean a283(final nh_ nh_, final int n, final int n2, final int n3) {
        final byte[] b337 = nh_.b337(n2, n3);
        if (null == b337) {
            return false;
        }
        tn_.a837(b337);
        if (n != 1) {
            a283(null, -46, 0, -57);
        }
        return true;
    }
    
    kk_(final byte[] array) {
        this._o = new byte[128];
        this._q = new int[128];
        this._k = new va_[128];
        this._n = new of_[128];
        this._r = new short[128];
        this._m = new byte[128];
        this._p = new byte[128];
        ec_ ec_;
        int n;
        for (ec_ = new ec_(array), n = 0; ec_.buffer[ec_.currentIndex + n] != 0; ++n) {}
        final byte[] array2 = new byte[n];
        for (int i = 0; i < n; ++i) {
            array2[i] = ec_.readUnsignedByte();
        }
        ++n;
        final ec_ ec_2 = ec_;
        ++ec_2.currentIndex;
        int o = ec_.currentIndex;
        final ec_ ec_3 = ec_;
        ec_3.currentIndex += n;
        int j;
        for (j = 0; ec_.buffer[ec_.currentIndex + j] != 0; ++j) {}
        final byte[] array3 = new byte[j];
        for (int n2 = 0; j > n2; ++n2) {
            array3[n2] = ec_.readUnsignedByte();
        }
        final ec_ ec_4 = ec_;
        ++ec_4.currentIndex;
        ++j;
        int o2 = ec_.currentIndex;
        final ec_ ec_5 = ec_;
        ec_5.currentIndex += j;
        int n3;
        for (n3 = 0; ec_.buffer[ec_.currentIndex + n3] != 0; ++n3) {}
        final byte[] array4 = new byte[n3];
        for (int k = 0; k < n3; ++k) {
            array4[k] = ec_.readUnsignedByte();
        }
        final ec_ ec_6 = ec_;
        ++ec_6.currentIndex;
        final byte[] array5 = new byte[++n3];
        int l;
        if (n3 <= 1) {
            l = n3;
        }
        else {
            array5[1] = 1;
            l = 2;
            int n4 = 1;
            for (int n5 = 2; n5 < n3; ++n5) {
                int c474 = ec_.readByte();
                if (c474 == 0) {
                    n4 = l++;
                }
                else {
                    if (n4 >= c474) {
                        --c474;
                    }
                    n4 = c474;
                }
                array5[n5] = (byte)n4;
            }
        }
        final of_[] array6 = new of_[l];
        for (int n6 = 0; n6 < array6.length; ++n6) {
            final of_[] array7 = array6;
            final int n7 = n6;
            final of_ of_ = new of_();
            array7[n7] = of_;
            final of_ of_2 = of_;
            final int c475 = ec_.readByte();
            if (c475 > 0) {
                of_2._n = new byte[c475 * 2];
            }
            final int c476 = ec_.readByte();
            if (c476 > 0) {
                (of_2._o = new byte[c476 * 2 + 2])[1] = 64;
            }
        }
        final int c477 = ec_.readByte();
        final byte[] array8 = (byte[])((c477 <= 0) ? null : new byte[c477 * 2]);
        final int c478 = ec_.readByte();
        final byte[] array9 = (byte[])((0 < c478) ? new byte[2 * c478] : null);
        int n8;
        for (n8 = 0; 0 != ec_.buffer[n8 + ec_.currentIndex]; ++n8) {}
        final byte[] array10 = new byte[n8];
        for (int n9 = 0; n8 > n9; ++n9) {
            array10[n9] = ec_.readUnsignedByte();
        }
        ++n8;
        final ec_ ec_7 = ec_;
        ++ec_7.currentIndex;
        int n10 = 0;
        for (int n11 = 0; n11 < 128; ++n11) {
            n10 += ec_.readByte();
            this._r[n11] = (short)n10;
        }
        int n12 = 0;
        for (int n13 = 0; n13 < 128; ++n13) {
            n12 += ec_.readByte();
            final short[] r = this._r;
            final int n14 = n13;
            r[n14] += (short)(n12 << 8);
        }
        int n15 = 0;
        int n16 = 0;
        int e137 = 0;
        for (int n17 = 0; 128 > n17; ++n17) {
            if (n15 == 0) {
                if (n16 >= array10.length) {
                    n15 = -1;
                }
                else {
                    n15 = array10[n16++];
                }
                e137 = ec_.e137();
            }
            final short[] r2 = this._r;
            final int n18 = n17;
            r2[n18] += (short)(nb_.and(e137 - 1, 2) << 14);
            this._q[n17] = e137;
            --n15;
        }
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        for (int n22 = 0; n22 < 128; ++n22) {
            if (0 != this._q[n22]) {
                if (n20 == 0) {
                    n21 = ec_.buffer[o++] - 1;
                    if (n19 < array2.length) {
                        n20 = array2[n19++];
                    }
                    else {
                        n20 = -1;
                    }
                }
                --n20;
                this._o[n22] = (byte)n21;
            }
        }
        int n23 = 0;
        int n24 = 0;
        int n25 = 0;
        for (int n26 = 0; 128 > n26; ++n26) {
            if (this._q[n26] != 0) {
                if (n24 == 0) {
                    n25 = ec_.buffer[o2++] + 16 << 2;
                    if (array3.length <= n23) {
                        n24 = -1;
                    }
                    else {
                        n24 = array3[n23++];
                    }
                }
                this._p[n26] = (byte)n25;
                --n24;
            }
        }
        int n27 = 0;
        int n28 = 0;
        of_ of_3 = null;
        for (int n29 = 0; n29 < 128; ++n29) {
            if (0 != this._q[n29]) {
                if (n28 == 0) {
                    of_3 = array6[array5[n27]];
                    if (n27 >= array4.length) {
                        n28 = -1;
                    }
                    else {
                        n28 = array4[n27++];
                    }
                }
                this._n[n29] = of_3;
                --n28;
            }
        }
        int n30 = 0;
        int n31 = 0;
        int n32 = 0;
        for (int n33 = 0; n33 < 128; ++n33) {
            if (n31 == 0) {
                if (array10.length <= n30) {
                    n31 = -1;
                }
                else {
                    n31 = array10[n30++];
                }
                if (0 < this._q[n33]) {
                    n32 = ec_.readByte() + 1;
                }
            }
            --n31;
            this._m[n33] = (byte)n32;
        }
        this._j = 1 + ec_.readByte();
        for (final of_ of_4 : array6) {
            if (of_4._n != null) {
                for (int n35 = 1; of_4._n.length > n35; n35 += 2) {
                    of_4._n[n35] = ec_.readUnsignedByte();
                }
            }
            if (of_4._o != null) {
                for (int n36 = 3; of_4._o.length - 2 > n36; n36 += 2) {
                    of_4._o[n36] = ec_.readUnsignedByte();
                }
            }
        }
        if (array8 != null) {
            for (int n37 = 1; n37 < array8.length; n37 += 2) {
                array8[n37] = ec_.readUnsignedByte();
            }
        }
        if (null != array9) {
            for (int n38 = 1; array9.length > n38; n38 += 2) {
                array9[n38] = ec_.readUnsignedByte();
            }
        }
        for (final of_ of_5 : array6) {
            if (of_5._o != null) {
                int n40 = 0;
                for (int n41 = 2; n41 < of_5._o.length; n41 += 2) {
                    n40 = ec_.readByte() + n40 + 1;
                    of_5._o[n41] = (byte)n40;
                }
            }
        }
        for (final of_ of_6 : array6) {
            if (of_6._n != null) {
                int n43 = 0;
                for (int n44 = 2; n44 < of_6._n.length; n44 += 2) {
                    n43 = 1 + (n43 + ec_.readByte());
                    of_6._n[n44] = (byte)n43;
                }
            }
        }
        if (array8 != null) {
            int c479 = ec_.readByte();
            array8[0] = (byte)c479;
            for (int n45 = 2; n45 < array8.length; n45 += 2) {
                c479 = ec_.readByte() + (1 + c479);
                array8[n45] = (byte)c479;
            }
            byte b = array8[0];
            byte b2 = array8[1];
            for (byte b3 = 0; b3 < b; ++b3) {
                this._m[b3] = (byte)(32 + this._m[b3] * b2 >> 6);
            }
            byte b4;
            byte b5;
            for (int n46 = 2; array8.length > n46; n46 += 2, b2 = b5, b = b4) {
                b4 = array8[n46];
                b5 = array8[n46 + 1];
                int n47 = (-b + b4) / 2 + b2 * (-b + b4);
                for (byte b6 = b; b4 > b6; ++b6) {
                    final int f313 = cp_.f313(-b + b4, n47);
                    n47 += b5 - b2;
                    this._m[b6] = (byte)(f313 * this._m[b6] + 32 >> 6);
                }
            }
            for (int n48 = b; n48 < 128; ++n48) {
                this._m[n48] = (byte)(32 + this._m[n48] * b2 >> 6);
            }
        }
        if (null != array9) {
            int c480 = ec_.readByte();
            array9[0] = (byte)c480;
            for (int n49 = 2; n49 < array9.length; n49 += 2) {
                c480 = 1 + c480 + ec_.readByte();
                array9[n49] = (byte)c480;
            }
            byte b7 = array9[0];
            int n50 = array9[1] << 1;
            for (byte b8 = 0; b8 < b7; ++b8) {
                int n51 = (this._p[b8] & 0xFF) + n50;
                if (0 > n51) {
                    n51 = 0;
                }
                if (128 < n51) {
                    n51 = 128;
                }
                this._p[b8] = (byte)n51;
            }
            for (int n52 = 2; n52 < array9.length; n52 += 2) {
                final byte b9 = array9[n52];
                final int n53 = array9[n52 + 1] << 1;
                int n54 = (b9 - b7) / 2 + n50 * (-b7 + b9);
                for (byte b10 = b7; b9 > b10; ++b10) {
                    int n55 = (0xFF & this._p[b10]) + cp_.f313(b9 - b7, n54);
                    if (0 > n55) {
                        n55 = 0;
                    }
                    if (128 < n55) {
                        n55 = 128;
                    }
                    this._p[b10] = (byte)n55;
                    n54 += -n50 + n53;
                }
                n50 = n53;
                b7 = b9;
            }
            for (int n56 = b7; n56 < 128; ++n56) {
                int n57 = n50 + (this._p[n56] & 0xFF);
                if (0 > n57) {
                    n57 = 0;
                }
                if (128 < n57) {
                    n57 = 128;
                }
                this._p[n56] = (byte)n57;
            }
        }
        for (int n58 = 0; l > n58; ++n58) {
            array6[n58]._c = ec_.readByte();
        }
        for (final of_ of_7 : array6) {
            if (null != of_7._n) {
                of_7._e = ec_.readByte();
            }
            if (null != of_7._o) {
                of_7._m = ec_.readByte();
            }
            if (of_7._c > 0) {
                of_7._b = ec_.readByte();
            }
        }
        for (int n60 = 0; l > n60; ++n60) {
            array6[n60]._i = ec_.readByte();
        }
        for (final of_ of_8 : array6) {
            if (of_8._i > 0) {
                of_8._h = ec_.readByte();
            }
        }
        for (final of_ of_9 : array6) {
            if (0 < of_9._h) {
                of_9._a = ec_.readByte();
            }
        }
    }
    
    static {
        kk_.text_renown_x = "Renown: <col=DB0100><%0></col>";
        kk_.pit_demon = "Pit Demon";
        kk_.pleasetryagain = "Please try again in a few minutes.";
    }
}
