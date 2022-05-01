final class ui_
{
    static int _b;
    static int _a;
    
    //original signature: static final String a661(final int n, final int n2) {
    static final String a661(final int n) {
        String string = ll_.menuOptions[n];
        if (n == 10) {
            if (g_._Hb == 0 || 0 == dc_._z || g_._Hb == 12 || 12 == dc_._z || 1 == g_._Hb || dc_._z == 1) {
                string = ll_.menuOptions[9]; //menu
            }
        }
        if (28 == n) {
            string = uf_.text_viewstyle + (gl_.topDownOrIsometric ? go_.text_topdown : ql_.text_isometric);
        }
        return string;
    }
    
    //original signature: static final void a150(final int n) {
    static final void a150() {
        final wj_ c = ra_._c;
        final int c2 = c.readByte();
        if (c2 == 0) {
            int k137;
            al_ al_;
            for (k137 = c.readShort(), al_ = (al_)hg_._n.e024(); null != al_ && k137 != al_._k; al_ = (al_)hg_._n.a024(4)) {}
            if (null == al_) {
                tl_.a150(-68);
                return;
            }
            final int i = c.readByte();
            if (i != 0) {
                final int l = al_._l;
                lg_._x[0]._d = null;
                lg_._x[0]._e = false;
                lg_._x[0]._a = tc_.playerTitle;
                final int j = al_._p;
                for (int n2 = 1; i > n2; ++n2) {
                    lg_._x[n2]._a = c.d738();
                    lg_._x[n2]._e = false;
                    if (c.readByte() == 1) {
                        lg_._x[n2]._d = c.d738();
                    }
                    else {
                        lg_._x[n2]._d = null;
                    }
                }
                final String[][] array = new String[3][l];
                final String[][] array2 = new String[3][l];
                final long[][] array3 = new long[3][l];
                final int[][] array4 = new int[3][j * l];
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                int n6 = 0;
                int n7 = 0;
                int n8 = 0;
                final int c3 = c.readByte();
                if (c3 > 0) {
                    for (int n9 = 0; c3 > n9; ++n9) {
                        final int c4 = c.readByte();
                        final String a = lg_._x[c4]._a;
                        final long c5 = c.c411();
                        final int o = c.currentIndex;
                        if (n9 < l) {
                            array[0][n3] = a;
                            array2[0][n3] = lg_._x[c4]._d;
                            array3[0][n3] = c5;
                            ++n3;
                            for (int n10 = 0; j > n10; ++n10) {
                                array4[0][n6++] = c.readInt();
                            }
                        }
                        if (null != a) {
                            if (Animation.a213(a)) {
                                array[1][n4] = tc_.playerTitle;
                                array2[1][n4] = null;
                                array3[1][n4] = c5;
                                c.currentIndex = o;
                                ++n4;
                                for (int n11 = 0; j > n11; ++n11) {
                                    array4[1][n7++] = c.readInt();
                                }
                            }
                        }
                        if (n5 < l) {
                            if (!lg_._x[c4]._e) {
                                lg_._x[c4]._e = true;
                                array[2][n5] = a;
                                array2[2][n5] = lg_._x[c4]._d;
                                array3[2][n5] = c5;
                                c.currentIndex = o;
                                ++n5;
                                for (int n12 = 0; n12 < j; ++n12) {
                                    array4[2][n8++] = c.readInt();
                                }
                            }
                        }
                    }
                }
            }
            al_.a487(false);
        }
        else if (c2 != 1) {
            sm_.a741(null, 1, "HS1: " + sj_.l738());
            tl_.a150(-33);
        }
        else {
            final int k138 = c.readShort();
            c.c411();
            fn_ fn_;
            for (fn_ = (fn_)cb_._a.e024(); fn_ != null && k138 != fn_._r; fn_ = (fn_)cb_._a.a024(4)) {}
            if (null == fn_) {
                tl_.a150(-96);
                return;
            }
            fn_.a487(false);
        }
    }
}
