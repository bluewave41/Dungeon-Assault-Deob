final class dd_ extends rj_
{
    static dd_ _E;
    //original name: _z
    static String bottomless_pit;
    static int[] _A;
    static int[] _C;
    //original name: _G
    int renownDividedBy10;
    int _F;
    private int _D;
    //original name: _B
    static MusicTrack da_defeat_monster;
    
    @Override
    final void a183(final boolean b, int n, final int n2) {
        if (67 > n) {
            n = 67;
        }
        super.a183(b, n, n2);
        this._D = n - 20;
    }
    
    //original signature: static final int a417(final int n, final boolean b) {
    static final int a417(final int n) {
        if (n >= 65536) {
            if (16777216 <= n) {
                if (n < 268435456) {
                    if (67108864 > n) {
                        return i_._u[n >> 18] >> 17;
                    }
                    return i_._u[n >> 20] >> 18;
                }
                else {
                    if (1073741824 > n) {
                        return i_._u[n >> 22] >> 19;
                    }
                    return i_._u[n >> 24] >> 20;
                }
            }
            else if (n >= 1048576) {
                if (n >= 4194304) {
                    return i_._u[n >> 16] >> 16;
                }
                return i_._u[n >> 14] >> 15;
            }
            else {
                if (262144 <= n) {
                    return i_._u[n >> 12] >> 14;
                }
                return i_._u[n >> 10] >> 13;
            }
        }
        else if (n >= 256) {
            if (4096 <= n) {
                if (16384 > n) {
                    return i_._u[n >> 6] >> 11;
                }
                return i_._u[n >> 8] >> 12;
            }
            else {
                if (1024 > n) {
                    return i_._u[n >> 2] >> 9;
                }
                return i_._u[n >> 4] >> 10;
            }
        }
        else {
            if (0 > n) {
                return -1;
            }
            return i_._u[n] >> 8;
        }
    }
    
    public static void c423() {
        dd_._A = null;
        dd_._C = null;
        dd_._E = null;
        dd_.bottomless_pit = null;
        dd_.da_defeat_monster = null;
    }
    
    @Override
    final void d326(final int n, final int n2, final int n3) {
        if (0 == this._D) {
            return;
        }
        int g = (n - 33) * this.renownDividedBy10 / (this._D - 46);
        if (g > this.renownDividedBy10) {
            g = this.renownDividedBy10;
        }
        if (n2 != 128) {
            this.a093(41, -14);
        }
        if (0 > g) {
            g = 0;
        }
        this._F = g;
    }
    
    @Override
    final void b326(final int n, final int n2, final int n3) {
        final int n4 = n + super._t;
        final int n5 = super._i + n3;
        bp_.a131(n5, bl_.scrollbar_top, n4);
        bp_.a131(this._D + n5 + 10, go_.scrollbar_bottom, n4);
        for (int i = 0; i < 7; ++i) {
            te_.a812(n4 + 11, i + n5 + 6, this._D - 2, kc_._M);
        }
        for (int j = 0; j < 3; ++j) {
            qe_.a050(11 + n4, n5 + 5 - j, this._D - 2, 0, 64 * (-j + 3));
            qe_.a050(11 + n4, n5 + 13 + j, this._D - 2, 0, (3 - j) * 64);
        }
        for (int n6 = 1; this._D - 1 > n6; ++n6) {
            qe_.b050(n6 + (10 + n4), n5 + 7, 5, 0, -(n6 * 80 / this._D) + 144);
        }
        final int n7 = (this.renownDividedBy10 == 0) ? 0 : ((this._D - 46) * this._F / this.renownDividedBy10);
        bp_.a131(4 + n5, im_.scrollbar_slider, n7 + (n4 + 10));
        tn_.scrollbar_top.drawImage(n4, n5);
        if (n2 != 8187) {
            dd_._C = null;
        }
        dc_.scrollbar_bottom.drawImage(this._D + n4 + 10, n5);
        ml_.scrollbar_slider.drawImage(n4 + (10 + n7), 4 + n5);
    }
    
    @Override
    final void a093(final int n, final int n2) {
        this._F += n2 * this.renownDividedBy10 >> 5;
        if (this._F > this.renownDividedBy10) {
            this._F = this.renownDividedBy10;
        }
        if (n != 1) {
            dd_.bottomless_pit = null;
        }
        if (0 > this._F) {
            this._F = 0;
        }
    }
    
    static final Graphic a510(final int i, final Graphic cn_) {
        final Graphic cn_2 = new Graphic(i * 2 + cn_.imageWidth, 2 * i + cn_.imageHeight);
        jh_.a303(cn_2);
        gf_.b050(0, 0, cn_2.imageWidth, cn_2.imageHeight, 16777215);
        for (int n = 0; i > n; ++n) {
            cn_.e326(i - cn_._w, i - cn_._A, 0);
            gf_.d669(1, 1, 0, 0, cn_2.imageWidth, cn_2.imageHeight);
        }
        cn_2.h797();
        cn_.e326(i - cn_._w, i - cn_._A, 0);
        jh_.b797();
        cn_2._w = cn_._w - i;
        cn_2._A = cn_._A - i;
        return cn_2;
    }
    
    @Override
    final void a789(final int n, final byte b, final int n2) {
        if (this._D != 0) {
            final int n3 = this.renownDividedBy10 * (n2 - 33) / (this._D - 46);
            if (this._F < n3) {
                this._F += this.renownDividedBy10 >> 4;
            }
            if (n3 < this._F) {
                this._F -= this.renownDividedBy10 >> 4;
            }
            if (this.renownDividedBy10 < this._F) {
                this._F = this.renownDividedBy10;
            }
            if (this._F < 0) {
                this._F = 0;
            }
            if (b > -59) {
                dd_._C = null;
            }
        }
    }
    
    //original signature: dd_(final int n, final int n2, final int n3, final int n4, final int g, final int f) {
    dd_(final int n, final int n2, final int n3, final int n4, final int renownDividedBy10, final int f) {
        super(n, n2, n4, 19, n3);
        this._F = f;
        this.renownDividedBy10 = renownDividedBy10;
        this._D = n4 - 20;
    }
    
    static {
        dd_.bottomless_pit = "Bottomless Pit";
        dd_._C = new int[] { 45, 187, 495, 660, 885, 1039, 1230, 1410, 1674 };
    }
}
