final class ue_ extends ne_
{
	//original name: _m
    static String instructions;
    byte[] _l;
    //original name: _i
    static Graphic[] modifier_icons;
    int _k;
    static int[] _j;
    
    static final boolean b427() {
        return d_._f;
    }
    
    static final void a150(final int n) {
        sn_.a093(97, 4);
    }
    
    static final int a080(int n) {
        int n2 = 0;
        if (0 > n || 65536 <= n) {
            n >>>= 16;
            n2 += 16;
        }
        if (n >= 256) {
            n >>>= 8;
            n2 += 8;
        }
        if (16 <= n) {
            n >>>= 4;
            n2 += 4;
        }
        if (4 <= n) {
            n2 += 2;
            n >>>= 2;
        }
        if (n >= 1) {
            ++n2;
            n >>>= 1;
        }
        return n2 + n;
    }
    
    public static void a423() {
        ue_._j = null;
        ue_.instructions = null;
        ue_.modifier_icons = null;
    }
    
    private ue_() throws Throwable {
        throw new Error();
    }
    
    static final void a657(int i, final int[] array, final int n, final int j, final int n2, final int n3, final int n4, final int n5) {
        if (j < 0 || re_._i <= i) {
            return;
        }
        if (n4 < 0 && 0 > n2 && n5 < 0) {
            return;
        }
        if (re_._b <= n4 && re_._b <= n2 && re_._b <= n5) {
            return;
        }
        final int n6 = -i + j;
        int n8;
        int n7;
        int n18;
        int n19;
        if (i != n3) {
            n7 = (n8 = n4 << 16);
            final int n9 = n3 - i;
            int n10 = (n5 - n4 << 16) / n6;
            int n11 = (-n4 + n2 << 16) / n9;
            boolean b;
            if (n11 < n10) {
                b = false;
            }
            else {
                final int n12 = n11;
                n11 = n10;
                n10 = n12;
                b = true;
            }
            Label_0392: {
                if (0 > i) {
                    if (0 > n3) {
                        i = n3 - i;
                        n7 += n10 * i;
                        n8 += i * n11;
                        i = n3;
                        break Label_0392;
                    }
                    i = -i;
                    n7 += i * n10;
                    n8 += n11 * i;
                    i = 0;
                }
                int n13 = re_._e[i];
                while (i < n3) {
                    final int n14 = n8 >> 16;
                    if (n14 < re_._b) {
                        int n15 = -(n8 >> 16) + (n7 >> 16);
                        if (n15 != 0) {
                            if (re_._b <= n14 + n15) {
                                n15 = re_._b - n14 - 1;
                            }
                            if (n14 < 0) {
                                sa_.a846((byte)45, n15 + n14, n13, n, array);
                            }
                            else {
                                sa_.a846((byte)45, n15, n14 + n13, n, array);
                            }
                        }
                        else if (0 <= n14) {
                            if (n14 < re_._b) {
                                sa_.a846((byte)45, n15, n13 + n14, n, array);
                            }
                        }
                    }
                    if (re_._i <= ++i) {
                        return;
                    }
                    n13 += gf_._i;
                    n8 += n11;
                    n7 += n10;
                }
            }
            final int n16 = j - n3;
            if (n16 != 0) {
                if (!b) {
                    n8 = n2 << 16;
                }
                else {
                    n7 = n2 << 16;
                }
                final int n17 = n5 << 16;
                n18 = (-n8 + n17) / n16;
                n19 = (-n7 + n17) / n16;
            }
            else {
                n18 = 0;
                n19 = 0;
            }
        }
        else {
            if (i == j) {
                n7 = n2 << 16;
                n18 = 0;
                n19 = 0;
                n8 = n4 << 16;
            }
            else {
                final int n20 = j - n3;
                if (n2 <= n4) {
                    n8 = n2 << 16;
                    n19 = (n5 - n4 << 16) / n6;
                    n7 = n4 << 16;
                    n18 = (n5 - n2 << 16) / n20;
                }
                else {
                    n18 = (n5 - n4 << 16) / n6;
                    n19 = (-n2 + n5 << 16) / n20;
                    n7 = n2 << 16;
                    n8 = n4 << 16;
                }
            }
            if (i < 0) {
                i = Math.min(-i, -i + n3);
                n8 += n18 * i;
                n7 += i * n19;
                i = 0;
            }
        }
        if (0 > i) {
            i = -i;
            n8 += n18 * i;
            n7 += n19 * i;
            i = 0;
        }
        int n21 = re_._e[i];
        while (j > i) {
            final int n22 = n8 >> 16;
            if (re_._b > n22) {
                int n23 = (n7 >> 16) - (n8 >> 16);
                if (n23 != 0) {
                    if (n23 + n22 >= re_._b) {
                        n23 = re_._b - n22 - 1;
                    }
                    if (0 > n22) {
                        sa_.a846((byte)45, n22 + n23, n21, n, array);
                    }
                    else {
                        sa_.a846((byte)45, n23, n22 + n21, n, array);
                    }
                }
                else if (0 <= n22 && n22 < re_._b) {
                    sa_.a846((byte)45, n23, n22 + n21, n, array);
                }
            }
            if (re_._i <= ++i) {
                return;
            }
            n8 += n18;
            n21 += gf_._i;
            n7 += n19;
        }
    }
    
    static {
        ue_.instructions = "Instructions";
    }
}
