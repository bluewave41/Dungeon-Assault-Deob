final class bi_
{
    private int[] _g;
    private static float[][] _h;
    private static float _f;
    int[] _e;
    static int _d;
    private int[][][] _a;
    static int[][] _c;
    private int[][][] _b;
    
    final int a197(final int n, final float n2) {
        if (n == 0) {
            bi_._f = (float)Math.pow(0.1, (this._g[0] + (this._g[1] - this._g[0]) * n2) * 0.0030517578f / 20.0f);
            bi_._d = (int)(bi_._f * 65536.0f);
        }
        if (this._e[n] == 0) {
            return 0;
        }
        final float b427 = this.b427(n, 0, n2);
        bi_._h[n][0] = -2.0f * b427 * (float)Math.cos(this.a427(n, 0, n2));
        bi_._h[n][1] = b427 * b427;
        for (int i = 1; i < this._e[n]; ++i) {
            final float b428 = this.b427(n, i, n2);
            final float n3 = -2.0f * b428 * (float)Math.cos(this.a427(n, i, n2));
            final float n4 = b428 * b428;
            bi_._h[n][i * 2 + 1] = bi_._h[n][i * 2 - 1] * n4;
            bi_._h[n][i * 2] = bi_._h[n][i * 2 - 1] * n3 + bi_._h[n][i * 2 - 2] * n4;
            for (int j = i * 2 - 1; j >= 2; --j) {
                final float[] array = bi_._h[n];
                final int n5 = j;
                array[n5] += bi_._h[n][j - 1] * n3 + bi_._h[n][j - 2] * n4;
            }
            final float[] array2 = bi_._h[n];
            final int n6 = 1;
            array2[n6] += bi_._h[n][0] * n3 + n4;
            final float[] array3 = bi_._h[n];
            final int n7 = 0;
            array3[n7] += n3;
        }
        if (n == 0) {
            for (int k = 0; k < this._e[0] * 2; ++k) {
                final float[] array4 = bi_._h[0];
                final int n8 = k;
                array4[n8] *= bi_._f;
            }
        }
        for (int l = 0; l < this._e[n] * 2; ++l) {
            bi_._c[n][l] = (int)(bi_._h[n][l] * 65536.0f);
        }
        return this._e[n] * 2;
    }
    
    private final float b427(final int n, final int n2, final float n3) {
        return 1.0f - (float)Math.pow(10.0, -((this._a[n][0][n2] + n3 * (this._a[n][1][n2] - this._a[n][0][n2])) * 0.0015258789f) / 20.0f);
    }
    
    public static void a797() {
        bi_._h = null;
        bi_._c = null;
    }
    
    private static final float a251(final float n) {
        return 32.703197f * (float)Math.pow(2.0, n) * 3.1415927f / 11025.0f;
    }
    
    private final float a427(final int n, final int n2, final float n3) {
        return a251((this._b[n][0][n2] + n3 * (this._b[n][1][n2] - this._b[n][0][n2])) * 1.2207031E-4f);
    }
    
    final void a739(final ec_ ec_, final fh_ fh_) {
        final int c474 = ec_.readByte();
        this._e[0] = c474 >> 4;
        this._e[1] = (c474 & 0xF);
        if (c474 != 0) {
            this._g[0] = ec_.readShort();
            this._g[1] = ec_.readShort();
            final int c475 = ec_.readByte();
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < this._e[i]; ++j) {
                    this._b[i][0][j] = ec_.readShort();
                    this._a[i][0][j] = ec_.readShort();
                }
            }
            for (int k = 0; k < 2; ++k) {
                for (int l = 0; l < this._e[k]; ++l) {
                    if ((c475 & 1 << k * 4 << l) != 0x0) {
                        this._b[k][1][l] = ec_.readShort();
                        this._a[k][1][l] = ec_.readShort();
                    }
                    else {
                        this._b[k][1][l] = this._b[k][0][l];
                        this._a[k][1][l] = this._a[k][0][l];
                    }
                }
            }
            if (c475 != 0 || this._g[1] != this._g[0]) {
                fh_.a962(ec_);
            }
        }
        else {
            this._g[this._g[1] = 0] = 0;
        }
    }
    
    bi_() {
        this._g = new int[2];
        this._a = new int[2][2][4];
        this._e = new int[2];
        this._b = new int[2][2][4];
    }
    
    static {
        bi_._h = new float[2][8];
        bi_._c = new int[2][8];
    }
}
