final class ja_
{
	//original name: _d
    static String[] ability_circumvent;
    private int[] _e;
    private int[] _c;
    //original name: _b
    static Graphic[] room_icons_2d;
    //original name: _a
    static String music_colon;
    
    public static void a487(final boolean b) {
        ja_.music_colon = null;
        if (b) {
            ja_.room_icons_2d = null;
        }
        ja_.ability_circumvent = null;
        ja_.room_icons_2d = null;
    }
    
    final int a205(final byte[] array, final byte[] array2, final byte b, final int n, int n2, int n3) {
        if (b != -88) {
            this.a205(null, null, (byte)93, -112, -52, -44);
        }
        if (0 != n3) {
            n3 += n2;
            int n4 = 0;
            int n5 = n;
            while (true) {
                final byte b2 = array[n5];
                if (b2 >= 0) {
                    ++n4;
                }
                else {
                    n4 = this._e[n4];
                }
                final int n6;
                if ((n6 = this._e[n4]) < 0) {
                    array2[n2++] = (byte)~n6;
                    if (n2 >= n3) {
                        break;
                    }
                    n4 = 0;
                }
                if ((b2 & 0x40) == 0x0) {
                    ++n4;
                }
                else {
                    n4 = this._e[n4];
                }
                final int n7;
                if ((n7 = this._e[n4]) < 0) {
                    array2[n2++] = (byte)~n7;
                    if (n2 >= n3) {
                        break;
                    }
                    n4 = 0;
                }
                if ((b2 & 0x20) != 0x0) {
                    n4 = this._e[n4];
                }
                else {
                    ++n4;
                }
                final int n8;
                if ((n8 = this._e[n4]) < 0) {
                    array2[n2++] = (byte)~n8;
                    if (n3 <= n2) {
                        break;
                    }
                    n4 = 0;
                }
                if (0x0 == (0x10 & b2)) {
                    ++n4;
                }
                else {
                    n4 = this._e[n4];
                }
                final int n9;
                if (0 > (n9 = this._e[n4])) {
                    array2[n2++] = (byte)~n9;
                    if (n3 <= n2) {
                        break;
                    }
                    n4 = 0;
                }
                if (0x0 == (b2 & 0x8)) {
                    ++n4;
                }
                else {
                    n4 = this._e[n4];
                }
                final int n10;
                if ((n10 = this._e[n4]) < 0) {
                    array2[n2++] = (byte)~n10;
                    if (n2 >= n3) {
                        break;
                    }
                    n4 = 0;
                }
                if ((b2 & 0x4) == 0x0) {
                    ++n4;
                }
                else {
                    n4 = this._e[n4];
                }
                final int n11;
                if ((n11 = this._e[n4]) < 0) {
                    array2[n2++] = (byte)~n11;
                    if (n2 >= n3) {
                        break;
                    }
                    n4 = 0;
                }
                if (0x0 != (b2 & 0x2)) {
                    n4 = this._e[n4];
                }
                else {
                    ++n4;
                }
                final int n12;
                if (0 > (n12 = this._e[n4])) {
                    array2[n2++] = (byte)~n12;
                    if (n2 >= n3) {
                        break;
                    }
                    n4 = 0;
                }
                if (0x0 != (b2 & 0x1)) {
                    n4 = this._e[n4];
                }
                else {
                    ++n4;
                }
                final int n13;
                if (0 > (n13 = this._e[n4])) {
                    array2[n2++] = (byte)~n13;
                    if (n2 >= n3) {
                        break;
                    }
                    n4 = 0;
                }
                ++n5;
            }
            return -n + (1 + n5);
        }
        return 0;
    }
    
    ja_(final byte[] array) {
        final int i = array.length;
        this._c = new int[i];
        this._e = new int[8];
        final int[] array2 = new int[33];
        int n = 0;
        for (int n2 = 0; i > n2; ++n2) {
            final byte b = array[n2];
            if (b != 0) {
                final int n3 = 1 << 32 - b;
                final int n4 = array2[b];
                this._c[n2] = n4;
                int n5;
                if ((n3 & n4) != 0x0) {
                    n5 = array2[b - 1];
                }
                else {
                    n5 = (n4 | n3);
                    for (int j = b - 1; j >= 1; --j) {
                        final int n6 = array2[j];
                        if (n6 != n4) {
                            break;
                        }
                        final int n7 = 1 << -j + 32;
                        if (0x0 != (n7 & n6)) {
                            array2[j] = array2[j - 1];
                            break;
                        }
                        array2[j] = mp_.or(n6, n7);
                    }
                }
                array2[b] = n5;
                for (int k = b + 1; k <= 32; ++k) {
                    if (array2[k] == n4) {
                        array2[k] = n5;
                    }
                }
                int n8 = 0;
                for (byte b2 = 0; b2 < b; ++b2) {
                    if ((Integer.MIN_VALUE >>> b2 & n4) == 0x0) {
                        ++n8;
                    }
                    else {
                        if (0 == this._e[n8]) {
                            this._e[n8] = n;
                        }
                        n8 = this._e[n8];
                    }
                    if (this._e.length <= n8) {
                        final int[] e = new int[2 * this._e.length];
                        for (int l = 0; l < this._e.length; ++l) {
                            e[l] = this._e[l];
                        }
                        this._e = e;
                    }
                }
                if (n <= n8) {
                    n = 1 + n8;
                }
                this._e[n8] = ~n2;
            }
        }
    }
    
    //original signature: static final void a418(final int o, final int z, final byte b, final boolean b2, final di_[] array) {
    //something with renown table
    static final void a418(final int o, final int z, final boolean isLoginStatus57, final RenownTableEntry[] array) {
        bj_.renownTableError = false;
        ao_._o = o;
        hi_._c.b093(ao_._o - 10);
        if (9 < hi_._c._H) {
            hi_._c._H = 9;
        }
        if (fb_.renownTableEntries == null) {
            fb_.renownTableEntries = new RenownTableEntry[10];
        }
        if (hi_._c._D > 9) {
            hi_._c._D = 9;
        }
        if (!isLoginStatus57) {
            int n = 0;
            if (og_._f > z) {
                n = -z + og_._f;
            }
            int length = array.length;
            if (array.length + z > fb_.renownTableEntries.length + og_._f) {
                length = fb_.renownTableEntries.length + (og_._f - z);
            }
            for (int i = n; i < length; ++i) {
                array[i]._b = i + z;
                fb_.renownTableEntries[i + z - og_._f] = array[i];
            }
        }
        else {
            boolean b3 = false;
            if (null == ip_._j) {
                return;
            }
            final pd_ c = hi_._c;
            og_._f = z;
            vd_._a = z;
            c._z = z;
            for (int n2 = 0; array.length > n2; ++n2) {
                array[n2]._b = z + n2;
                fb_.renownTableEntries[n2] = array[n2];
                if (le_.a398(ip_._j, fb_.renownTableEntries[n2]._i)) {
                    qc_._y = n2 + vd_._a;
                    b3 = true;
                }
            }
            if (!b3) {
                qc_._y = -1;
            }
            gg_.activateRenownTableRaidButton();
        }
    }
    
    static {
        ja_.ability_circumvent = new String[] { "Circumvent", "Equally adept with the arts of mechanics and deception, the trusty toolkit of the <%0> is enough to disable any obstacle. (Single use)" };
        ja_.music_colon = "Music: ";
    }
}
