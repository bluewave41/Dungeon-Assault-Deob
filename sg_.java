final class sg_
{
    static int[] _c;
    //original name: _f
    static String daemonette;
    static int[] _d;
    static Graphic _b;
    //original name: _a
    static String instructions_guardianroom;
    //original name: _e
    static String[] monthnames;
    
    static final boolean a330(final int n, final int n2, final int n3) {
        return n2 != n || tg_._f[3][n3] != 23 || ak_._o[0] <= gm_.playerInformation.highestRenown;
    }
    
    static final void a876(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int i, int j, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13) {
        if (n3 < 0 || re_._i <= j) {
            return;
        }
        if (n11 < 0 && n5 < 0 && 0 > n13) {
            return;
        }
        if (n11 >= re_._b && re_._b <= n5 && re_._b <= n13) {
            return;
        }
        final int n14 = -j + n3;
        int n16;
        int n15;
        int n18;
        int n17;
        int n20;
        int n19;
        int n22;
        int n21;
        int n40;
        int n41;
        int n42;
        int n43;
        int n44;
        int n45;
        int n46;
        int n47;
        if (j != i) {
            n15 = (n16 = n2 << 16);
            n17 = (n18 = n7 << 16);
            n19 = (n20 = n11 << 16);
            n21 = (n22 = n10 << 16);
            final int n23 = -j + i;
            int n24 = (-n11 + n5 << 16) / n23;
            int n25 = (n13 - n11 << 16) / n14;
            int n26;
            boolean b;
            int n28;
            int n29;
            int n30;
            int n31;
            int n32;
            if (n25 <= n24) {
                n26 = (n6 - n10 << 16) / n14;
                final int n27 = n24;
                n24 = n25;
                n25 = n27;
                b = true;
                n28 = (-n2 + n9 << 16) / n23;
                n29 = (n - n2 << 16) / n14;
                n30 = (-n7 + n8 << 16) / n23;
                n31 = (-n10 + n4 << 16) / n23;
                n32 = (n12 - n7 << 16) / n14;
            }
            else {
                n29 = (n9 - n2 << 16) / n23;
                b = false;
                n31 = (n6 - n10 << 16) / n14;
                n30 = (n12 - n7 << 16) / n14;
                n28 = (-n2 + n << 16) / n14;
                n26 = (n4 - n10 << 16) / n23;
                n32 = (-n7 + n8 << 16) / n23;
            }
            Label_0825: {
                if (0 > j) {
                    if (0 > i) {
                        j = -j + i;
                        n19 += j * n25;
                        n22 += n26 * j;
                        n16 += n29 * j;
                        n21 += n31 * j;
                        n18 += j * n32;
                        n20 += n24 * j;
                        n17 += n30 * j;
                        n15 += n28 * j;
                        j = i;
                        break Label_0825;
                    }
                    j = -j;
                    n20 += j * n24;
                    n16 += j * n29;
                    n21 += n31 * j;
                    n17 += j * n30;
                    n18 += n32 * j;
                    n15 += j * n28;
                    n22 += j * n26;
                    n19 += j * n25;
                    j = 0;
                }
                int n33 = re_._e[j];
                while (i > j) {
                    final int n34 = n20 >> 16;
                    if (n34 < re_._b) {
                        int n35 = (n19 >> 16) - (n20 >> 16);
                        if (n35 != 0) {
                            final int n36 = (-n18 + n17) / n35;
                            final int n37 = (-n16 + n15) / n35;
                            final int n38 = (n21 - n22) / n35;
                            if (n35 + n34 >= re_._b) {
                                n35 = re_._b - n34 - 1;
                            }
                            if (n34 >= 0) {
                                lo_.a352(n35, n33 + n34, n38, n16, 0, n18, array, n36, n22, n37);
                            }
                            else {
                                lo_.a352(n34 + n35, n33, n38, n16 - n37 * n34, 0, n18 - n36 * n34, array, n36, n22 - n34 * n38, n37);
                            }
                        }
                        else if (n34 >= 0) {
                            if (re_._b > n34) {
                                lo_.a352(n35, n34 + n33, 0, n16, 0, n18, array, 0, n22, 0);
                            }
                        }
                    }
                    if (++j >= re_._i) {
                        return;
                    }
                    n18 += n32;
                    n21 += n31;
                    n15 += n28;
                    n33 += gf_._i;
                    n22 += n26;
                    n17 += n30;
                    n19 += n25;
                    n20 += n24;
                    n16 += n29;
                }
            }
            final int n39 = -i + n3;
            if (n39 == 0) {
                n40 = 0;
                n41 = 0;
                n42 = 0;
                n43 = 0;
                n44 = 0;
                n45 = 0;
                n46 = 0;
                n47 = 0;
            }
            else {
                final int n48 = n13 << 16;
                final int n49 = n12 << 16;
                final int n50 = n << 16;
                final int n51 = n6 << 16;
                if (!b) {
                    n22 = n4 << 16;
                    n16 = n9 << 16;
                    n20 = n5 << 16;
                    n18 = n8 << 16;
                }
                else {
                    n19 = n5 << 16;
                    n17 = n8 << 16;
                    n21 = n4 << 16;
                    n15 = n9 << 16;
                }
                n41 = (n48 - n20) / n39;
                n40 = (n50 - n16) / n39;
                n44 = (n51 - n22) / n39;
                n46 = (n49 - n17) / n39;
                n45 = (n50 - n15) / n39;
                n43 = (-n19 + n48) / n39;
                n47 = (n51 - n21) / n39;
                n42 = (-n18 + n49) / n39;
            }
        }
        else {
            if (n3 == j) {
                n45 = 0;
                n15 = n9;
                n44 = 0;
                n40 = 0;
                n42 = 0;
                n46 = 0;
                n22 = n10;
                n47 = 0;
                n16 = n2;
                n19 = n5 << 16;
                n18 = n7;
                n20 = n11 << 16;
                n17 = n8;
                n21 = n4;
                n43 = 0;
                n41 = 0;
            }
            else {
                final int n52 = n3 - i;
                if (n5 > n11) {
                    n18 = n7 << 16;
                    n45 = (-n9 + n << 16) / n52;
                    n40 = (-n2 + n << 16) / n14;
                    n42 = (n12 - n7 << 16) / n14;
                    n21 = n4 << 16;
                    n41 = (n13 - n11 << 16) / n14;
                    n44 = (n6 - n10 << 16) / n14;
                    n16 = n2 << 16;
                    n22 = n10 << 16;
                    n15 = n9 << 16;
                    n17 = n8 << 16;
                    n43 = (n13 - n5 << 16) / n52;
                    n20 = n11 << 16;
                    n46 = (-n8 + n12 << 16) / n52;
                    n47 = (-n4 + n6 << 16) / n52;
                    n19 = n5 << 16;
                }
                else {
                    n21 = n10 << 16;
                    n46 = (n12 - n7 << 16) / n14;
                    n44 = (-n4 + n6 << 16) / n52;
                    n17 = n7 << 16;
                    n45 = (n - n2 << 16) / n14;
                    n18 = n8 << 16;
                    n43 = (-n11 + n13 << 16) / n14;
                    n42 = (n12 - n8 << 16) / n52;
                    n16 = n9 << 16;
                    n20 = n5 << 16;
                    n41 = (n13 - n5 << 16) / n52;
                    n19 = n11 << 16;
                    n22 = n4 << 16;
                    n47 = (-n10 + n6 << 16) / n14;
                    n15 = n2 << 16;
                    n40 = (n - n9 << 16) / n52;
                }
            }
            if (0 > j) {
                j = Math.min(-j, -j + i);
                n20 += n41 * j;
                n17 += n46 * j;
                n18 += j * n42;
                n22 += j * n44;
                n16 += j * n40;
                n15 += n45 * j;
                n21 += j * n47;
                n19 += n43 * j;
                j = 0;
            }
        }
        if (j < 0) {
            j = -j;
            n20 += j * n41;
            n18 += n42 * j;
            n21 += n47 * j;
            n16 += n40 * j;
            n17 += n46 * j;
            n19 += n43 * j;
            n15 += n45 * j;
            n22 += j * n44;
            j = 0;
        }
        int n53 = re_._e[j];
        while (j < n3) {
            final int n54 = n20 >> 16;
            if (re_._b > n54) {
                int n55 = (n19 >> 16) - (n20 >> 16);
                if (n55 == 0) {
                    if (0 <= n54) {
                        if (n54 < re_._b) {
                            lo_.a352(n55, n54 + n53, 0, n16, 0, n18, array, 0, n22, 0);
                        }
                    }
                }
                else {
                    final int n56 = (-n18 + n17) / n55;
                    final int n57 = (-n16 + n15) / n55;
                    final int n58 = (-n22 + n21) / n55;
                    if (n54 + n55 >= re_._b) {
                        n55 = -n54 + re_._b - 1;
                    }
                    if (0 > n54) {
                        lo_.a352(n55 + n54, n53, n58, n16 - n57 * n54, 0, -(n54 * n56) + n18, array, n56, n22 - n54 * n58, n57);
                    }
                    else {
                        lo_.a352(n55, n53 + n54, n58, n16, 0, n18, array, n56, n22, n57);
                    }
                }
            }
            if (++j >= re_._i) {
                return;
            }
            n22 += n44;
            n21 += n47;
            n18 += n42;
            n19 += n43;
            n53 += gf_._i;
            n20 += n41;
            n16 += n40;
            n17 += n46;
            n15 += n45;
        }
    }
    
    public static void a423() {
        sg_.instructions_guardianroom = null;
        sg_._c = null;
        sg_.daemonette = null;
        sg_._b = null;
        sg_.monthnames = null;
        sg_._d = null;
    }
    
    static {
        sg_._c = new int[46];
        sg_.daemonette = "Daemonette";
        sg_.instructions_guardianroom = "These work in the same way as trap rooms, but the consequences of a failed roll are that any monsters in the dungeon will be much harder to surprise when starting combat. Some guardians require a raider to make a successful Sneak roll (against the Guardian's Detect), while others require a Dodge roll (against the Guardian's Snare)";
        (sg_._d = new int[46])[0] = 1;
        sg_._c[0] = 100;
        sg_._d[1] = 1;
        sg_._c[1] = 100;
        sg_._d[2] = 1;
        sg_._c[2] = 100;
        sg_._d[3] = 1;
        sg_._c[3] = 100;
        sg_._d[4] = 2;
        sg_._d[5] = 2;
        sg_._c[4] = 200;
        sg_._c[5] = 200;
        sg_._d[6] = 3;
        sg_._c[6] = 300;
        sg_._d[7] = 2;
        sg_._d[8] = 1;
        sg_._c[7] = 200;
        sg_._c[8] = 100;
        sg_._d[9] = 1;
        sg_._c[9] = 100;
        sg_._d[10] = 2;
        sg_._d[11] = 2;
        sg_._c[10] = 200;
        sg_._d[12] = 2;
        sg_._c[11] = 200;
        sg_._c[12] = 200;
        sg_._d[13] = 3;
        sg_._d[14] = 3;
        sg_._c[13] = 300;
        sg_._d[15] = 1;
        sg_._c[14] = 300;
        sg_._c[15] = 100;
        sg_._d[16] = 1;
        sg_._c[16] = 100;
        sg_._d[17] = 1;
        sg_._d[18] = 3;
        sg_._c[17] = 100;
        sg_._d[19] = 1;
        sg_._c[18] = 300;
        sg_._d[20] = 1;
        sg_._c[19] = 100;
        sg_._d[21] = 1;
        sg_._c[20] = 100;
        sg_._d[22] = 10;
        sg_._c[21] = 100;
        sg_._d[23] = 5;
        sg_._c[22] = 1000;
        sg_._c[23] = 500;
        sg_._d[24] = 5;
        sg_._c[24] = 500;
        sg_._d[25] = 3;
        sg_._c[25] = 300;
        sg_._d[26] = 3;
        sg_._c[26] = 300;
        sg_._d[27] = 3;
        sg_._d[28] = 3;
        sg_._c[27] = 300;
        sg_._c[28] = 300;
        sg_._d[29] = 3;
        sg_._d[30] = 5;
        sg_._c[29] = 300;
        sg_._c[30] = 500;
        sg_._d[31] = 10;
        sg_._d[32] = 10;
        sg_._c[31] = 1000;
        sg_._c[32] = 1000;
        sg_._d[33] = 5;
        sg_._d[34] = 3;
        sg_._c[33] = 500;
        sg_._c[34] = 300;
        sg_._d[35] = 5;
        sg_._d[36] = 3;
        sg_._c[35] = 500;
        sg_._d[37] = 10;
        sg_._c[36] = 300;
        sg_._d[38] = 3;
        sg_._c[37] = 1000;
        sg_._c[38] = 300;
        sg_._d[39] = 5;
        sg_._c[39] = 500;
        sg_._d[40] = 5;
        sg_._c[40] = 500;
        sg_._d[41] = 10;
        sg_._d[42] = 10;
        sg_._c[41] = 1000;
        sg_._d[43] = 3;
        sg_._c[42] = 1000;
        sg_._c[43] = 300;
        sg_._d[44] = 5;
        sg_._d[45] = 10;
        sg_._c[44] = 500;
        sg_._c[45] = 1000;
        sg_.monthnames = new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    }
}
