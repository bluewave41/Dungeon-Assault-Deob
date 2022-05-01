final class fg_ extends gj_
{
	//original name: _f
    static String desc_demon_lord;
    //original name: _o
    static String whirling_blades;
    //original name: _m
    static String waitingfor_extradata;
    private int _n;
    //original name: _l
    private long nanoTime2;
    //original name: _h
    private long nanoTime;
    private long _k;
    //original name: _g
    static String fs_unavailable;
    private long[] _j;
    static int[] _d;
    private int _e;
    
    static final void a044(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15) {
        if (n4 >= n3) {
            if (n4 >= n) {
                if (n3 >= n) {
                    sg_.a876(gf_._b, n5, n8, n4, n11, n14, n13, n3, n, n6, n7, n9, n2, n15, n10, n12);
                }
                else {
                    sg_.a876(gf_._b, n5, n9, n4, n2, n15, n13, n, n3, n7, n6, n8, n11, n14, n10, n12);
                }
            }
            else {
                sg_.a876(gf_._b, n8, n9, n, n13, n12, n2, n4, n3, n7, n10, n5, n11, n14, n6, n15);
            }
        }
        else if (n > n3) {
            sg_.a876(gf_._b, n8, n5, n, n11, n14, n2, n3, n4, n10, n7, n9, n13, n12, n6, n15);
        }
        else if (n > n4) {
            sg_.a876(gf_._b, n9, n5, n3, n2, n15, n11, n, n4, n10, n6, n8, n13, n12, n7, n14);
        }
        else {
            sg_.a876(gf_._b, n9, n8, n3, n13, n12, n11, n4, n, n6, n10, n5, n2, n15, n7, n14);
        }
    }
    
    @Override
    final int b871(final long n, final int n2) {
        if (n2 != 2048) {
            fg_.waitingfor_extradata = null;
        }
        if (this.nanoTime < this.nanoTime2) {
            this._k += this.nanoTime2 - this.nanoTime;
            this.nanoTime += -this.nanoTime + this.nanoTime2;
            this.nanoTime2 += n;
            return 1;
        }
        int n3 = 0;
        do {
            this.nanoTime2 += n;
        } while (++n3 < 10 && this.nanoTime2 < this.nanoTime);
        if (this.nanoTime > this.nanoTime2) {
            this.nanoTime2 = this.nanoTime;
        }
        return n3;
    }
    
    @Override
    final long a138(final int n) {
        this.nanoTime += this.c138(0);
        if (this.nanoTime < this.nanoTime2) {
            return (this.nanoTime2 - this.nanoTime) / 1000000L;
        }
        return 0L;
    }
    
    public static void d150(final int n) {
        fg_.waitingfor_extradata = null;
        if (n > -96) {
            return;
        }
        fg_._d = null;
        fg_.whirling_blades = null;
        fg_.fs_unavailable = null;
        fg_.desc_demon_lord = null;
    }
    
    @Override
    final void b150(final int n) {
        this._k = 0L;
        if (n >= -86) {
            d150(110);
        }
        if (this.nanoTime < this.nanoTime2) {
            this.nanoTime += -this.nanoTime + this.nanoTime2;
        }
    }
    
    private final long c138(final int n) {
        final long nanoTime = System.nanoTime();
        final long n2 = -this._k + nanoTime;
        this._k = nanoTime;
        if (-5000000000L < n2 && n2 < 5000000000L) {
            this._j[this._e] = n2;
            if (1 > this._n) {
                ++this._n;
            }
            this._e = (1 + this._e) % 10;
        }
        long n3 = n;
        for (int n4 = 1; this._n >= n4; ++n4) {
            n3 += this._j[(10 + (this._e - n4)) % 10];
        }
        return n3 / this._n;
    }
    
    fg_() {
        this.nanoTime = 0L;
        this._n = 1;
        this._k = 0L;
        this.nanoTime2 = 0L;
        this._j = new long[10];
        this._e = 0;
        this.nanoTime = System.nanoTime();
        this.nanoTime2 = System.nanoTime();
    }
    
    static {
        fg_.desc_demon_lord = "This huge, black-skinned, winged demon's claws and muscly build make it a raider's worst nightmare.<br><br>If this monster's <%attack> is at least twice as high as the <%defence> of the raider it encounters, the entire party will flee in terror!";
        fg_.whirling_blades = "Whirling Blades";
        fg_.fs_unavailable = "Unfortunately your configuration doesn't support fullscreen mode.";
        fg_.waitingfor_extradata = "Waiting for extra data";
        fg_._d = new int[8192];
    }
}
