final class uc_ extends lm_
{
	//original name: _L
    static String waitingfor_animations;
    private int _O;
    boolean _R;
    static ph_ _E;
    static String[] _K;
    private Graphic _D;
    private int _H;
    int _S;
    private int _B;
    private Graphic _P;
    //original name: _Q
    static String desc_goblin_scout;
    //original name: _C
    static String text_construction;
    static nh_ _I;
    private int _J;
    private int _F;
    private Graphic[] _M;
    private int _G;
    private Graphic _T;
    
    private final Graphic b749(final boolean b) {
        final int n = super.componentHeight >> 1;
        final Graphic cn_ = new Graphic(n, super.componentHeight);
        lm_.a901(cn_);
        for (int i = 0; i < super.componentHeight; ++i) {
            for (int j = 0; j < n; ++j) {
                final double n2 = j * (double)j / ((super.componentHeight - i) * i);
                int n3 = 1;
                if (n2 < 1.0) {
                    final double sqrt = Math.sqrt(-n2 + 1.0);
                    n3 = ((sqrt >= 1.0) ? 255 : ((int)(sqrt * 255.0)));
                }
                gf_.a326(j, i, n3 << 8 | n3 | n3 << 16);
            }
        }
        ti_.c487(b);
        return cn_;
    }
    
    private final Graphic b468(final int n, final int n2, final int n3) {
        final Graphic cn_ = new Graphic(2 * this._B, super.componentHeight);
        lm_.a901(cn_);
        final int n4 = super.componentHeight >> 1;
        for (int i = 0; i < super.componentHeight; ++i) {
            final int n5 = (i >> 1) * (this._B * 2 - 1) % (this._B * 2);
            final int n6 = 0xFF00FF & n3;
            final int n7 = n3 & 0xFF00;
            final int n8 = i - n4;
            final int n9 = 128 + (int)(Math.sqrt(n4 * n4 - n8 * n8) / n4 * 128.0);
            final int n10 = (256 > n9) ? (((n9 * n7 & 0xFF0000) | (n9 * n6 & 0xFF00FF00)) >>> 8) : (n7 | n6);
            gf_.b115(n5, i, this._B, n10);
            gf_.b115(n5 - this._B * 2, i, this._B, n10);
            final int n11 = n & 0xFF00;
            final int n12 = 0xFF00FF & n;
            final int n13 = (n9 >= 256) ? (n11 | n12) : (((n9 * n11 & 0xFF0000) | (n12 * n9 & 0xFF00FF00)) >>> 8);
            gf_.b115(this._B + n5, i, this._B, n13);
            gf_.b115(n5 - this._B, i, this._B, n13);
        }
        ti_.c487(true);
        return cn_;
    }
    
    private final void a558(final int n, final int n2, final int n3, final Graphic cn_) {
        final int i = n3 + super.componentWidth;
        d_.a713(this._D.imageWidth + n3, super.componentHeight + n2, i - this._D.imageWidth, n2);
        for (int n4 = n3 - this._O; i > n4; n4 += cn_.imageWidth) {
            cn_.drawImage(n4, n2);
        }
        ti_.c487(true);
        if (gf_._j <= n3 + this._D.imageWidth) {
            lm_.a901(this._P);
            cn_.drawImage(-this._O, 0);
            cn_.drawImage(-this._O + 2 * this._B, 0);
            this._T.d093(0, 0);
            ti_.c487(true);
            this._P.drawImage(n3, n2);
        }
        if (gf_._h >= i - this._D.imageWidth) {
            lm_.a901(this._P);
            int j;
            for (j = super.componentWidth + (-this._D.imageWidth + this._O); j > this._B * 2; j -= this._B * 2) {}
            cn_.drawImage(-j, 0);
            cn_.drawImage(2 * this._B - j, 0);
            this._D.d093(0, 0);
            ti_.c487(true);
            this._P.drawImage(i - this._D.imageWidth, n2);
        }
    }
    
    static final boolean g154() {
        return so_._b != null;
    }
    
    @Override
    final void b050(final int n, final int n2, final int n3, final int n4, final int n5) {
        super.b050(n ^ n, n2, n3, n4, n5);
        this.a150(n ^ 0xE9F0D8A8);
    }
    
    static final void a923(final int n, final int n2, int n3, final Graphic cn_, int j, int n4, int f) {
        if (gf_._j > j) {
            n3 -= -j + gf_._j;
            j = gf_._j;
        }
        if (gf_._f > f) {
            n4 -= -f + gf_._f;
            f = gf_._f;
        }
        if (n3 + j > gf_._h) {
            n3 = gf_._h - j;
        }
        if (f + n4 > gf_._e) {
            n4 = -f + gf_._e;
        }
        if (0 < n3 && n4 > 0) {
            final Graphic d125 = cn_.d125();
            final int[] b = gf_._b;
            final int i = gf_._i;
            final int c = gf_._c;
            final int[] array = new int[4];
            gf_.a331(array);
            cn_.e797();
            gf_.a115(array[0], array[1], array[2], array[3]);
            int n5 = cn_.imageWidth * f + j;
            final int n6 = -n3 + cn_.imageWidth;
            final int[] b2 = d125._B;
            for (int n7 = f; n4 + f > n7; ++n7) {
                for (int k = j; k < j + n3; ++k) {
                    Label_0333: {
                        if (0 != b2[n5]) {
                            if ((0 >= k || b2[n5 - 1] != 0) && (0 >= n7 || b2[-cn_.imageWidth + n5] != 0) && (cn_.imageWidth - 1 <= k || b2[n5 + 1] != 0)) {
                                if (n7 >= cn_.imageHeight - 1) {
                                    break Label_0333;
                                }
                                if (0 != b2[cn_.imageWidth + n5]) {
                                    break Label_0333;
                                }
                            }
                            gf_.f115(k, n7, n2, n);
                        }
                    }
                    ++n5;
                }
                n5 += n6;
            }
            d125.drawImage(-cn_._w, -cn_._A);
            gf_.a397(b, i, c);
            gf_.b331(array);
        }
    }
    
    public static void c487(final boolean b) {
        uc_.desc_goblin_scout = null;
        uc_._E = null;
        uc_._K = null;
        uc_.text_construction = null;
        uc_._I = null;
        if (b) {
            c487(true);
        }
        uc_.waitingfor_animations = null;
    }
    
    @Override
    final void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        if (!b) {
            g154();
        }
        if (this._R) {
            ++this._O;
            if (2 * this._B < this._O) {
                this._O -= 2 * this._B;
            }
        }
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        if (n != 0) {
            return;
        }
        final int n5 = super.xAxisOffset + n2;
        final int n6 = n4 + super.yAxisOffset;
        this.a558(n3 ^ 0xFFFFFF9F, n6, n5, this._M[n3]);
        if (65536 > this._S) {
            d_.a713(n5 + (super.componentWidth * this._S >> 16), n6 + super.componentHeight, super.componentWidth + n5, n6);
            this.a558(-99, n6, n5, this._M[1]);
            ti_.c487(true);
        }
    }
    
    uc_(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this(n, n2, n3, n4, n5, n6, n7, n6 >> 1 & 0x7F7F7F, 0x7F7F7F & n7 >> 1);
    }
    
    static final boolean a331(final int n, final char c) {
        return n != -854857176 || (c >= 'A' && 'Z' >= c) || ('a' <= c && c <= 'z');
    }
    
    final void b789(final int g, final byte b, final int f) {
        this._G = g;
        this._J = (f >> 1 & 0x7F7F7F);
        this._F = f;
        this._H = (0x7F7F7F & g >> 1);
        if (b != 94) {
            this._P = null;
        }
        this.a150(-370091864);
    }
    
    private uc_(final int n, final int n2, final int n3, final int n4, final int b, final int f, final int g, final int j, final int h) {
        this._G = g;
        this._H = h;
        this._B = b;
        this._F = f;
        this._J = j;
        this.b050(0, n3, n2, n, n4);
    }
    
    private final void a150(final int n) {
        if (n != -370091864) {
            uc_.desc_goblin_scout = null;
        }
        this._M = new Graphic[] { this.b468(this._G, -123, this._F), this.b468(this._H, -88, this._J) };
        this._D = this.b749(true);
        this._T = this._D.b125();
        this._P = new Graphic(super.componentHeight >> 1, super.componentHeight);
    }
    
    static {
        uc_.waitingfor_animations = "Waiting for animations";
        uc_.desc_goblin_scout = "Aged by goblin standards, the goblin scout didn't get that way through reckless bravery, but though cowardly, he can generally find a way out of any situation.";
        uc_.text_construction = "My Dungeon";
    }
}
