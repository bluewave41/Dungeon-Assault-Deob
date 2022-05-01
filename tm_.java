final class tm_
{
    int[][] _m;
    ra_ _a;
    //original name: _o
    int[] revisions;
    private int[][] _d;
    int[] _i;
    private int[] _c;
    int[] _k;
    private byte[] _r;
    //original name: _q
    int[] crcs;
    int[] _j;
    //original name: _h
    private int gameId;
    //original name: _b
    static MusicTrack da_raid_lose;
    int _s;
    static int _e;
    //original name: _p
    static Graphic menu_block;
    ra_[] _n;
    int _l;
    byte[][] _g;
    //original name: _f
    int checksum;
    
    
    //original signature: private final void a440(final byte[] array, final byte b) {
    private final void parseSomething(final byte[] indexArchive) { //parsing index file
        final ec_ ec_ = new ec_(lc_.a266(indexArchive)); //ungzip archive
        final int something = ec_.readByte();
        if (5 > something || 7 < something) {
            throw new RuntimeException();
        }
        if (6 <= something) {
            this._s = ec_.readInt();
        }
        else {
            this._s = 0;
        }
        final int c475 = ec_.readByte();
        final boolean named = (0x1 & c475) != 0x0;
        final boolean flag2 = 0x0 != (c475 & 0x2);
        if (something < 7) {
            this.gameId = ec_.readShort();
        }
        else {
            this.gameId = ec_.j137();
        }
        int n = 0;
        int n2 = -1;
        this._j = new int[this.gameId];
        if (7 <= something) { //this will be false always
            for (int n3 = 0; this.gameId > n3; ++n3) {
                n = (this._j[n3] = n + ec_.j137());
                if (n2 < this._j[n3]) {
                    n2 = this._j[n3];
                }
            }
        }
        else {
        	//creates an array with 0-32...
            for (int n4 = 0; this.gameId > n4; ++n4) {
                n = (this._j[n4] = n + ec_.readShort());
                if (this._j[n4] > n2) {
                    n2 = this._j[n4];
                }
            }
        }
        this._l = 1 + n2; //33
        this._m = new int[this._l][];
        if (flag2) { //ignore
            this._g = new byte[this._l][];
        }
        this.revisions = new int[this._l];
        this._i = new int[this._l];
        this.crcs = new int[this._l];
        this._k = new int[this._l];
        if (named) { //named
            this._c = new int[this._l];
            for (int i = 0; i < this._l; ++i) {
                this._c[i] = -1;
            }
            for (int n5 = 0; this.gameId > n5; ++n5) {
                this._c[this._j[n5]] = ec_.readInt();
            }
            this._a = new ra_(this._c);
        }
        for (int n6 = 0; this.gameId > n6; ++n6) {
            this.crcs[this._j[n6]] = ec_.readInt();
        }
        if (flag2) {
            for (int n7 = 0; this.gameId > n7; ++n7) {
                final byte[] array2 = new byte[64];
                ec_.a286(0, 64, array2);
                this._g[this._j[n7]] = array2;
            }
        }
        for (int j = 0; j < this.gameId; ++j) {
            this.revisions[this._j[j]] = ec_.readInt();
        }
        if (something < 7) {
            for (int k = 0; k < this.gameId; ++k) { //number of files
                this._k[this._j[k]] = ec_.readShort();
            }
            for (int n8 = 0; this.gameId > n8; ++n8) {
                final int n9 = this._j[n8]; // n8
                int n10 = 0;
                final int l = this._k[n9];
                this._m[n9] = new int[l];
                int n11 = -1;
                for (int n12 = 0; l > n12; ++n12) {
                    final int[] array3 = this._m[n9];
                    final int n13 = n12;
                    final int n14 = n10 += ec_.readShort();
                    array3[n13] = n14;
                    final int n15 = n14;
                    if (n11 < n15) {
                        n11 = n15;
                    }
                }
                this._i[n9] = 1 + n11;
                if (l == 1 + n11) {
                    this._m[n9] = null;
                }
            }
        }
        else {
            for (int n16 = 0; n16 < this.gameId; ++n16) {
                this._k[this._j[n16]] = ec_.j137();
            }
            for (int n17 = 0; n17 < this.gameId; ++n17) {
                final int n18 = this._j[n17];
                int n19 = 0;
                final int n20 = this._k[n18];
                int n21 = -1;
                this._m[n18] = new int[n20];
                for (int n22 = 0; n20 > n22; ++n22) {
                    final int[] array4 = this._m[n18];
                    final int n23 = n22;
                    final int n24 = n19 += ec_.j137();
                    array4[n23] = n24;
                    final int n25 = n24;
                    if (n21 < n25) {
                        n21 = n25;
                    }
                }
                this._i[n18] = 1 + n21;
                if (n20 == 1 + n21) {
                    this._m[n18] = null;
                }
            }
        }
        if (named) {
            this._d = new int[1 + n2][];
            this._n = new ra_[n2 + 1];
            for (int n26 = 0; n26 < this.gameId; ++n26) {
                final int n27 = this._j[n26];
                final int n28 = this._k[n27];
                this._d[n27] = new int[this._i[n27]];
                for (int n29 = 0; this._i[n27] > n29; ++n29) {
                    this._d[n27][n29] = -1;
                }
                for (int n30 = 0; n30 < n28; ++n30) {
                    int n31;
                    if (this._m[n27] == null) {
                        n31 = n30;
                    }
                    else {
                        n31 = this._m[n27][n30];
                    }
                    this._d[n27][n31] = ec_.readInt();
                }
                this._n[n27] = new ra_(this._d[n27]);
            }
        }
    }
    
    //original signature: public static void a150() {
    public static void cleanup() {
        tm_.menu_block = null;
        tm_.da_raid_lose = null;
    }
    
    //original signature: tm_(final byte[] array, final int n, final byte[] array2) {
    tm_(final byte[] array, final int checksum, final byte[] array2) {
        this.checksum = qh_.calculateChecksum(array, array.length);
        if (checksum != this.checksum) {
            throw new RuntimeException();
        }
        if (null != array2) {
            if (array2.length != 64) {
                throw new RuntimeException();
            }
            this._r = rn_.a288(array.length, 0, array);
            for (int i = 0; i < 64; ++i) {
                if (array2[i] != this._r[i]) {
                    throw new RuntimeException();
                }
            }
        }
        this.parseSomething(array);
    }
}
