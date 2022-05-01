final class tn_ extends bh_
{
	//original name: _Y
    static String desc_skeleton_sentinels;
    //original name: _U
    static String text_cost;
    private String _Z;
    private Graphic _V;
    //original name: _W
    static Graphic scrollbar_top;
    private dp_ _T;
    //original name: _I
    static Graphic piece_goblin_club;
    private int _X;
    
    @Override
    final String c983(final byte b) {
        return null;
    }
    
    @Override
    final boolean a336(final int n, final lm_ lm_) {
        return false;
    }
    
    //original signature: static final String a439(final String s) {
    static final String capitalizeString(final String s) {
        final int length = s.length();
        final char[] array = new char[length];
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            char c;
            if (i != 0) {
                c = Character.toLowerCase(char1);
            }
            else {
                c = PlayerInformation.a328(char1);
            }
            array[i] = c;
        }
        return new String(array);
    }
    
    @Override
    final void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        ++this._X;
        super.a319(n, n2, lm_, b);
    }
    
    static final void a150(final int n) {
        cd_._b = false;
        qc_._t = false;
        sn_.a093(49, n);
        wd_._d = sp_._e;
        ol_._i = sp_._e;
    }
    
    static final pp_ a226(final int n, final int n2, final se_ se_, final Graphic cn_, final int n3, final String s) {
        jh_.c797();
        final int b926 = se_.b926(s);
        final int n4 = se_._E + se_._H;
        final Graphic cn_2 = new Graphic(b926, n4);
        cn_2.e797();
        se_.b191(s, 0, se_._H, 16760960, -1);
        if (n3 > -36) {
            a226(9, 109, null, null, 59, null);
        }
        final Graphic a983 = te_.a983(b926, n4, ag_._c, 32, 32, 0.125);
        for (int n5 = 0; a983._B.length > n5; ++n5) {
            if (0 == cn_2._B[n5]) {
                a983._B[n5] = 0;
            }
        }
        final Graphic a984 = GUICheckbox.a551(16, cn_2, 16776960, (byte)100);
        final int n6 = -cn_2.imageWidth + cn_.imageWidth >> 1;
        final int n7 = cn_.imageHeight - cn_2.imageHeight >> 1;
        final Graphic a985 = dd_.a510(4, a983);
        final Graphic d125 = cn_.d125();
        d125.e797();
        bp_.a131(n7, a985, n6);
        a983.drawImage(n6, n7);
        d125.h797();
        final Graphic d126 = d125.d125();
        d126.e797();
        gf_.b669(0, 0, cn_.imageWidth, cn_.imageHeight, 0, 160);
        d126.h797();
        final Graphic d127 = cn_.d125();
        d127.e797();
        GUICheckbox.a551(8, cn_2, 12690143, (byte)(-59)).b326(n6, n7, 32);
        cn_2.drawImage(n6, n7);
        final Graphic cn_3 = a984;
        cn_3._w += n6;
        final Graphic cn_4 = a984;
        cn_4._A += n7;
        jh_.b797();
        return new pp_(d125, d126, d127, a984, n, n2);
    }
    
    tn_(final dp_ t, final String z, final int n, final int n2, final int n3, final int n4) {
        super(z, ri_.a754());
        this._Z = z;
        this._T = t;
        this.b050(0, n3, n2, n, n4);
    }
    
    //original signature: public static void h423() {
    public static void cleanup() {
        tn_.desc_skeleton_sentinels = null;
        tn_.scrollbar_top = null;
        tn_.text_cost = null;
        tn_.piece_goblin_club = null;
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        final od_ a151 = this._T.a151((byte)(-116));
        String w;
        if (ub_._s == a151 || a151 == oc_._A) {
            w = kj_.checking;
        }
        else {
            w = this._T.a791(true);
            if (w == null) {
                w = this._Z;
            }
        }
        if (!w.equals(super.buttonText)) {
            super.buttonText = w;
            this.g423((byte)112);
        }
        super.a115(n, n2, n3, n4);
        final od_ a152 = this._T.a151((byte)(-110));
        final th_ th_ = (th_)super._o;
        final int n5 = super.xAxisOffset + n2;
        final int n6 = th_.a387((byte)64, n4, this) + (th_.b865(-2, this).b137(263) >> 1);
        if (ub_._s == a152 || oc_._A == a152) {
            final Graphic cn_ = sl_._c[0];
            final int n7 = cn_.imageWidth2 << 1;
            final int n8 = cn_.imageHeight2 << 1;
            if (this._V != null && n7 <= this._V.imageWidth && n8 <= this._V.imageHeight) {
                lm_.a901(this._V);
                gf_.a797();
            }
            else {
                lm_.a901(this._V = new Graphic(n7, n8));
            }
            cn_.b669(112, 144, cn_.imageWidth2 << 4, cn_.imageHeight2 << 4, -this._X << 10, 4096);
            ti_.c487(true);
            this._V.b326(n5 - (cn_.imageWidth2 >> 1), -cn_.imageHeight2 + n6, 256);
        }
        else if (a152 == pd_._J) {
            final Graphic cn_2 = sl_._c[2];
            cn_2.b326(n5, n6 - (cn_2.imageHeight >> 1), 256);
        }
        else if (a152 == c_._d) {
            final Graphic cn_3 = sl_._c[1];
            cn_3.b326(n5, n6 - (cn_3.imageHeight >> 1), 256);
        }
    }
    
    //original signature: static final void a837(final int n, final byte[] array) {
    static final void a837(final byte[] array) {
        final ec_ ec_ = new ec_(array);
        ec_.currentIndex = array.length - 2;
        dk_._d = ec_.readShort();
        
        jn_._k = new int[dk_._d];
        ub_._q = new byte[dk_._d][];
        gk_._Q = new boolean[dk_._d];
        hg_._t = new int[dk_._d];
        rf_._P = new byte[dk_._d][];
        jc_._f = new int[dk_._d];
        fe_._g = new int[dk_._d];
        
        ec_.currentIndex = array.length - dk_._d * 8 - 7;
        ce_._x = ec_.readShort();
        tb_._i = ec_.readShort();
        final int n2 = 1 + (0xFF & ec_.readByte());
        for (int n3 = 0; dk_._d > n3; ++n3) {
            hg_._t[n3] = ec_.readShort();
        }
        for (int n4 = 0; dk_._d > n4; ++n4) {
            fe_._g[n4] = ec_.readShort();
        }
        for (int n5 = 0; dk_._d > n5; ++n5) {
            jc_._f[n5] = ec_.readShort();
        }
        for (int i = 0; i < dk_._d; ++i) {
            jn_._k[i] = ec_.readShort();
        }
        ec_.currentIndex = -(3 * n2) + (array.length - 4 - 8 * dk_._d);
        uo_._b = new int[n2];
        for (int j = 1; j < n2; ++j) {
            uo_._b[j] = ec_.readTribyte(-114);
            if (uo_._b[j] == 0) {
                uo_._b[j] = 1;
            }
        }
        ec_.currentIndex = 0;
        for (int n6 = 0; dk_._d > n6; ++n6) {
            final int k = jc_._f[n6];
            final int l = jn_._k[n6];
            final int n7 = k * l;
            final byte[] array2 = new byte[n7];
            ub_._q[n6] = array2;
            final byte[] array3 = new byte[n7];
            rf_._P[n6] = array3;
            boolean b = false;
            final int c474 = ec_.readByte();
            if ((0x1 & c474) != 0x0) {
                for (int n8 = 0; k > n8; ++n8) {
                    for (int n9 = 0; l > n9; ++n9) {
                        array2[n8 + k * n9] = ec_.readUnsignedByte();
                    }
                }
                if ((c474 & 0x2) != 0x0) {
                    for (int n10 = 0; n10 < k; ++n10) {
                        for (int n11 = 0; n11 < l; ++n11) {
                            final byte[] array4 = array3;
                            final int n12 = k * n11 + n10;
                            final byte a403 = ec_.readUnsignedByte();
                            array4[n12] = a403;
                            b |= (a403 != -1);
                        }
                    }
                }
            }
            else {
                for (int n13 = 0; n7 > n13; ++n13) {
                    array2[n13] = ec_.readUnsignedByte();
                }
                if ((c474 & 0x2) != 0x0) {
                    for (int n14 = 0; n14 < n7; ++n14) {
                        final byte[] array5 = array3;
                        final int n15 = n14;
                        final byte a404 = ec_.readUnsignedByte();
                        array5[n15] = a404;
                        b |= (a404 != -1);
                    }
                }
            }
            gk_._Q[n6] = b;
        }
    }
    
    static {
        tn_.text_cost = "Cost";
        tn_.desc_skeleton_sentinels = "The reanimated corpses of previous failed raids; these four skeletons are well armed.<br><br>This monster will rise again when the party leaves the room, even if defeated.";
    }
}
