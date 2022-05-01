final class sn_
{
	//original name: _c
    static Graphic[] torches;
    static String[] _a;
    static pp_ _b;
    
    static final void a984(final String s) {
        System.out.println("Error: " + eg_.a793(s, "%0a", "\n", true));
    }
    
    public static void a150() {
        sn_._b = null;
        sn_.torches = null;
        sn_._a = null;
    }
    
    static final void a311(final int n, final int n2, final Graphic[] array, final int n3, final int n4, final int n5) {
        if (null == array) {
            return;
        }
        if (0 < n5 && n2 > 0) {
            final int n6 = (array[3] != null) ? array[3].imageWidth2 : 0;
            final int n7 = (null != array[5]) ? array[5].imageWidth2 : 0;
            final int n8 = (null != array[1]) ? array[1].imageHeight2 : 0;
            final int n9 = (array[7] == null) ? 0 : array[7].imageHeight2;
            final int n10 = n3 + n5;
            final int n11 = n4 + n2;
            final int n12 = n6 + n3;
            final int i = n10 - n7;
            final int n13 = n8 + n4;
            final int j = n11 - n9;
            int n14 = n12;
            int n15 = i;
            if (n14 > n15) {
                n15 = (n14 = n3 + n5 * n6 / (n7 + n6));
            }
            int n16 = n13;
            int n17 = j;
            gf_.a331(fc_._g);
            if (n17 < n16) {
                n17 = (n16 = n4 + n8 * n2 / (n8 + n9));
            }
            if (null != array[0]) {
                gf_.a115(n3, n4, n14, n16);
                array[0].drawImage(n3, n4);
                gf_.b331(fc_._g);
            }
            if (null != array[2]) {
                gf_.a115(n15, n4, n10, n16);
                array[2].drawImage(i, n4);
                gf_.b331(fc_._g);
            }
            if (array[6] != null) {
                gf_.a115(n3, n17, n14, n11);
                array[6].drawImage(n3, j);
                gf_.b331(fc_._g);
            }
            if (array[8] != null) {
                gf_.a115(n15, n17, n10, n11);
                array[8].drawImage(i, j);
                gf_.b331(fc_._g);
            }
            if (array[1] != null && array[1].imageWidth2 != 0) {
                gf_.a115(n14, n4, n15, n16);
                for (int n18 = n12; i > n18; n18 += array[1].imageWidth2) {
                    array[1].drawImage(n18, n4);
                }
                gf_.b331(fc_._g);
            }
            if (null != array[7]) {
                if (0 != array[7].imageWidth2) {
                    gf_.a115(n14, n17, n15, n11);
                    for (int n19 = n12; i > n19; n19 += array[7].imageWidth2) {
                        array[7].drawImage(n19, j);
                    }
                    gf_.b331(fc_._g);
                }
            }
            if (array[3] != null && 0 != array[3].imageHeight2) {
                gf_.a115(n3, n16, n14, n17);
                for (int n20 = n13; j > n20; n20 += array[3].imageHeight2) {
                    array[3].drawImage(n3, n20);
                }
                gf_.b331(fc_._g);
            }
            if (null != array[5]) {
                if (0 != array[5].imageHeight2) {
                    gf_.a115(n15, n16, n10, n17);
                    for (int k = n13; k < j; k += array[5].imageHeight2) {
                        array[5].drawImage(i, k);
                    }
                    gf_.b331(fc_._g);
                }
            }
            if (array[4] != null && array[4].imageWidth2 != 0 && 0 != array[4].imageHeight2) {
                gf_.a115(n14, n16, n15, n17);
                for (int l = n13; l < j; l += array[4].imageHeight2) {
                    for (int n21 = n12; i > n21; n21 += array[4].imageWidth2) {
                        array[4].drawImage(n21, l);
                    }
                }
                gf_.b331(fc_._g);
            }
        }
    }
    
    static final void a093(final int n, final int f) {
        if (n <= 2) {
            return;
        }
        ki_._f = f;
    }
}
