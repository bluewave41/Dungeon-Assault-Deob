final class wk_
{
    static String[] _a;
    private int _d;
    private int _e;
    float _j;
    private bl_[] _i;
    static int _g;
    static int _h;
    String _b;
    
    //original signature: final boolean a491(final boolean b) {
    final boolean a491() {
        while (this._e > this._d) {
            final bl_ bl_ = this._i[this._d];
            if (!bl_._q.a154()) {
                this.a375((byte)12, 0, bl_);
                return false;
            }
            if (0 <= bl_._m && !bl_._q.a544(false, bl_._m)) {
                this.a375((byte)12, bl_._q.c080(-123, bl_._m), bl_);
                return false;
            }
            if (bl_._h != null && !bl_._q.a213(false, bl_._h)) {
                this.a375((byte)12, bl_._q.b913(bl_._h), bl_);
                return false;
            }
            if (bl_._m < 0 && bl_._h == null && null != bl_.loadingText && !bl_._q.a427((byte)59)) {
                this.a375((byte)12, bl_._q.b137(), bl_);
                return false;
            }
            ++this._d;
        }
        return true;
    }
    
    static final void a455(final int n, final String s, final se_ se_, final int n2, final int[] array, final int n3) {
        if (n3 != 31139) {
            return;
        }
        final HeaderLabelText tf_ = new HeaderLabelText(se_, s, array);
        tf_.b326(-se_._H + n2, -tf_._i + n);
    }
    
    private final void a375(final byte b, final int n, final bl_ bl_) {
        this._j = 75 * (this._d + 1 + n / 100.0f) / (this._e + 1);
        if (b != 12) {
            a455(-109, null, null, 89, null, -3);
        }
        if (n == 0) {
            this._b = bl_.waitingForText;
        }
        else {
            this._b = bl_.loadingText + " - " + n + "%";
        }
    }
    
    public static void b487() {
        wk_._a = null;
    }
    
    static final void a150() {
        sn_.a093(66, 17);
    }
    
    static final Graphic[] a528(final Graphic[] array, final int n) {
        final Graphic[] array2 = new Graphic[array.length];
        for (int n2 = n; array.length > n2; ++n2) {
            array2[n2] = g_.a983(array[n2]);
        }
        return array2;
    }
    
    //original signature: static final int c474(final boolean b) {
    static final int c474() {
        lg_._w.a421(wo_._b, ci_._m, true);
        lg_._w.b487();
        while (ha_.b427()) {
            lg_._w.a564(126, mm_._t, ob_._Yb);
        }
        if (-1 != ki_._f) {
            final int f = ki_._f;
            sn_.a093(16, -1);
            return f;
        }
        if (cd_._b) {
            return 3;
        }
        if (wd_._d == ql_._f) {
            return 1;
        }
        if (!im_._b.getH()) {
            return 1;
        }
        if (ol_._i != ql_._f) {
            return -1;
        }
        return 2;
    }
    
    //original signature: private final void a151(final nh_ q, final String f, final String h, final boolean b, final int m, final String g) {
    private final void a151(final nh_ q, final String loadingText, final String h, final String waitingForText) {
        if (this._i.length <= this._e) {
            final bl_[] i = new bl_[this._e * 2];
            cj_.a030(this._i, 0, i, 0, this._e);
            this._i = i;
        }
        final bl_ bl_ = new bl_();
        bl_.waitingForText = waitingForText;
        bl_._h = h;
        bl_._m = -1;
        bl_.loadingText = loadingText;
        bl_._q = q;
        this._i[this._e++] = bl_;
    }
    
    //original signature: final void a971(final String s, final String s2, final String s3, final nh_ nh_, final int n) {
    final void a971(final String loadingText, final String s2, final String waitingForText, final nh_ nh_) {
        this.a151(nh_, loadingText, s2, waitingForText);
    }
    
    //original signature: final void a539(final String s, final int n, final String s2, final nh_ nh_) {
    final void a539(final String waitingForText, final String loadingText, final nh_ nh_) {
        this.a151(nh_, loadingText, null, waitingForText);
    }
    
    //original signature: static final int a080(final int n, final int n2) {
    static final int a080(final int n) {
        int n3 = 0;
        if (0x0 != (n & 0x7)) {
            n3 = -(n & 0x7) + 8;
        }
        return n3 + n;
    }
    
    //original signature: wk_(final int c) {
    wk_() {
        this._i = new bl_[16];
    }
}
