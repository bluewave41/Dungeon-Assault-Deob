final class IsaacCipher
{
    private int[] _b;
    //original name: _f
    static String[] titles_mastery_female;
    private int _c;
    private int _d;
    private int _e;
    private int[] _g;
    private int _a;
    
    //fuzzes opcode
    //original signature: final int a137(final int n) {
    //ISSAC CIPHER CODE, SETTING TO 0 TO DISABLE
    final int next() {
    	return 0; //DEBUG CODE
        /*if (this._a == 0) {
            this.generateMoreResults();
            this._a = 256;
        }
        final int[] b = this._b;
        final int a = this._a - 1;
        this._a = a;
        return b[a];*/
    }
    
    //original signature: private final void b423(final byte b) {
    //seeds issac cipher?
    private final void b423() {
        int n = -1640531527;
        int n2 = -1640531527;
        int n3 = -1640531527;
        int n4 = -1640531527;
        int n5 = -1640531527;
        int n6 = -1640531527;
        int n7 = -1640531527;
        int n8 = -1640531527;
        
        for (int n9 = 0; 4 > n9; ++n9) {
            final int n10 = n7 ^ n3 << 11;
            final int n11 = n + n10;
            final int n12 = n3 + n8 ^ n8 >>> 2;
            final int n13 = n8 + n11;
            final int n14 = n4 + n12;
            final int n15 = n13 ^ n11 << 8;
            final int n16 = n11 + n14;
            final int n17 = n6 + n15;
            n = (n16 ^ n14 >>> 16);
            final int n18 = n14 + n17;
            final int n19 = n2 + n;
            n4 = (n18 ^ n17 << 10);
            final int n20 = n5 + n4;
            n6 = (n17 + n19 ^ n19 >>> 4);
            final int n21 = n10 + n6;
            n2 = (n19 + n20 ^ n20 << 8);
            final int n22 = n20 + n21;
            n3 = n12 + n2;
            n5 = (n22 ^ n21 >>> 9);
            n8 = n15 + n5;
            n7 = n21 + n3;
        }
        for (int n23 = 0; 256 > n23; n23 += 8) {
            final int n24 = n5 + this._b[n23 + 7];
            final int n25 = n + this._b[3 + n23];
            final int n26 = n7 + this._b[n23];
            final int n27 = n8 + this._b[2 + n23];
            final int n28 = n6 + this._b[5 + n23];
            final int n29 = n3 + this._b[n23 + 1];
            final int n30 = n2 + this._b[n23 + 6];
            final int n31 = n4 + this._b[4 + n23];
            final int n32 = n26 ^ n29 << 11;
            final int n33 = n25 + n32;
            final int n34 = n29 + n27 ^ n27 >>> 2;
            final int n35 = n31 + n34;
            final int n36 = n27 + n33 ^ n33 << 8;
            final int n37 = n33 + n35;
            final int n38 = n28 + n36;
            n = (n37 ^ n35 >>> 16);
            final int n39 = n30 + n;
            n4 = (n35 + n38 ^ n38 << 10);
            final int n40 = n38 + n39;
            final int n41 = n24 + n4;
            n6 = (n40 ^ n39 >>> 4);
            final int n42 = n39 + n41;
            final int n43 = n32 + n6;
            n2 = (n42 ^ n41 << 8);
            final int n44 = n41 + n43;
            n3 = n34 + n2;
            n5 = (n44 ^ n43 >>> 9);
            n8 = n36 + n5;
            n7 = n43 + n3;
            this._g[n23] = n7;
            this._g[1 + n23] = n3;
            this._g[n23 + 2] = n8;
            this._g[n23 + 3] = n;
            this._g[4 + n23] = n4;
            this._g[5 + n23] = n6;
            this._g[6 + n23] = n2;
            this._g[n23 + 7] = n5;
        }
        for (int n45 = 0; 256 > n45; n45 += 8) {
            final int n46 = n + this._g[n45 + 3];
            final int n47 = n6 + this._g[5 + n45];
            final int n48 = n2 + this._g[6 + n45];
            final int n49 = n3 + this._g[n45 + 1];
            final int n50 = n7 + this._g[n45];
            final int n51 = n4 + this._g[4 + n45];
            final int n52 = n8 + this._g[2 + n45];
            final int n53 = n5 + this._g[n45 + 7];
            final int n54 = n50 ^ n49 << 11;
            final int n55 = n46 + n54;
            final int n56 = n49 + n52 ^ n52 >>> 2;
            final int n57 = n52 + n55;
            final int n58 = n51 + n56;
            final int n59 = n57 ^ n55 << 8;
            final int n60 = n55 + n58;
            final int n61 = n47 + n59;
            n = (n60 ^ n58 >>> 16);
            final int n62 = n48 + n;
            n4 = (n58 + n61 ^ n61 << 10);
            final int n63 = n61 + n62;
            final int n64 = n53 + n4;
            n6 = (n63 ^ n62 >>> 4);
            final int n65 = n54 + n6;
            n2 = (n62 + n64 ^ n64 << 8);
            n3 = n56 + n2;
            n5 = (n64 + n65 ^ n65 >>> 9);
            n8 = n59 + n5;
            n7 = n65 + n3;
            this._g[n45] = n7;
            this._g[1 + n45] = n3;
            this._g[n45 + 2] = n8;
            this._g[3 + n45] = n;
            this._g[4 + n45] = n4;
            this._g[5 + n45] = n6;
            this._g[n45 + 6] = n2;
            this._g[7 + n45] = n5;
        }
        this.generateMoreResults(); //calls fill _b function
        this._a = 256;
    }
    
    //original signature: private final void b150(final int n) {
    private final void generateMoreResults() {
        this._c += ++this._e;
        for (int n2 = 0; 256 > n2; ++n2) {
            final int n3 = this._g[n2];
            if (0x0 == (n2 & 0x2)) {
                if ((n2 & 0x1) == 0x0) {
                    this._d ^= this._d << 13;
                }
                else {
                    this._d ^= this._d >>> 6;
                }
            }
            else if (0x0 == (n2 & 0x1)) {
                this._d ^= this._d << 2;
            }
            else {
                this._d ^= this._d >>> 16;
            }
            this._d += this._g[n2 + 128 & 0xFF];
            this._b[n2] = (this._c = this._g[nb_.and(255, (this._g[n2] = this._g[nb_.and(n3 >> 2, 255)] + (this._d + this._c)) >> 8 >> 2)] + n3);
        }
    }
    
    static final Graphic a373() {
        final int n = jc_._f[0] * jn_._k[0];
        final byte[] array = ub_._q[0];
        final int[] array2 = new int[n];
        for (int i = 0; i < n; ++i) {
            array2[i] = uo_._b[nb_.and(255, array[i])];
        }
        final Graphic cn_ = new Graphic(ce_._x, tb_._i, hg_._t[0], fe_._g[0], jc_._f[0], jn_._k[0], array2);
        sb_.a150();
        return cn_;
    }
    
    public static void c150(final int n) {
        if (n >= -72) {
            return;
        }
        IsaacCipher.titles_mastery_female = null;
    }
    
    IsaacCipher(final int[] array) {
        this._b = new int[256];
        this._g = new int[256];
        for (int i = 0; i < array.length; ++i) {
            this._b[i] = array[i];
        }
        this.b423();
    }
    
    static {
        IsaacCipher.titles_mastery_female = new String[] { "<%0> of the Orb", "<%0> the Wise", "<%0> the Cunning", "<%0> the Potent", "<%0> the Mighty", "<%0>, Mistress of the Tower", "<%0> the Magnificent", "<%0> the Unbound" };
    }
}
