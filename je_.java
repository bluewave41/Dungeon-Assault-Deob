import java.math.*;

final class je_
{
    private ec_ _n;
    private em_ _m;
    static int[] _d;
    private BigInteger _j;
    private cc_ _g;
    //original name: _f
    static String[] tutorial_raiders2;
    private ti_[] _k;
    private bb_ _h;
    //original name: _l
    static String mb_exclusive_1;
    static int _i;
    private BigInteger _e;
    static int _b;
    static mb_ _c;
    //original name: _a
    static String mb_including_gamename;
    
    //original signature: static final o_ a595(final int n, final AmbientAudioTrack[] array) {
    static final o_ playSound(final AmbientAudioTrack[] array) {
        return gd_.a364(64, array[oi_.getRandom(array.length)]);
    }
    
    final void a423(final byte b) {
        if (this._k == null) {
            return;
        }
        for (int i = 0; i < this._k.length; ++i) {
            if (null != this._k[i]) {
                this._k[i].b487(false);
            }
        }
        if (b <= 46) {
            return;
        }
        for (int n = 0; this._k.length > n; ++n) {
            if (this._k[n] != null) {
                this._k[n].c150(-10790);
            }
        }
    }
    
    public static void a487() {
        je_._d = null;
        je_.mb_exclusive_1 = null;
        je_._c = null;
        je_.mb_including_gamename = null;
        je_.tutorial_raiders2 = null;
    }
    
    final boolean b427(final byte b) {
        if (null != this._n) {
            return true;
        }
        if (null == this._m) {
            if (this._h.b154(-21431)) {
                return false;
            }
            this._m = this._h.a180(true, 255, (byte)0, 255, (byte)69);
        }
        if (b != 113) {
            return true;
        }
        if (this._m._v) { //this needs to change, this happens when data is read
            return false;
        }
        final ec_ n = new ec_(this._m.b318(true)); //reading from stuff here
        n.currentIndex = 5; //skip the header
        final int c474 = n.readByte(); //number of cache files
        final ec_ ec_ = n; //probably don't need new one
        ec_.currentIndex += 72 * c474;
        final byte[] array = new byte[-n.currentIndex + n.buffer.length]; //64 length
        n.a286(0, array.length, array);
        byte[] byteArray;
        if (null == this._j || this._e == null) {
            byteArray = array;
        }
        else {
            byteArray = new BigInteger(array).modPow(this._j, this._e).toByteArray();
        }
        if (65 != byteArray.length) {
            throw new RuntimeException();
        }
        final byte[] a288 = rn_.a288(n.currentIndex - array.length - 5, 5, n.buffer);
        for (int n2 = 0; 64 > n2; ++n2) {
            if (byteArray[n2 + 1] != a288[n2]) {
                //throw new RuntimeException(); COMMENTED THIS OUT
            }
        }
        this._k = new ti_[c474];
        this._n = n;
        return true;
    }
    
    //original signature: final ti_ a407(final boolean b, final int n, final int n2, final ln_ ln_, final ln_ ln_2) {
    final ti_ a407(final boolean b, final int n2, final ln_ mainFile255Reader, final ln_ ln_2) {
        if (null == this._n) {
            throw new RuntimeException();
        }
        if (0 > n2 || n2 >= this._k.length) {
            throw new RuntimeException();
        }
        if (null != this._k[n2]) {
            return this._k[n2];
        }
        this._n.currentIndex = 6 + 72 * n2;
        final int checksum = this._n.readInt();
        final int h138 = this._n.readInt();
        final byte[] array = new byte[64];
        this._n.a286(0, 64, array);
        final ti_ ti_ = new ti_(n2, ln_2, mainFile255Reader, this._h, this._g, checksum, array, h138, b); //saves index data
        this._k[n2] = ti_;
        return ti_;
    }
    
    je_(final bb_ bb_, final cc_ cc_) {
        this(bb_, cc_, null, null);
    }
    
    static final void a749(final int n, final int n2, final Graphic cn_, final int n3, final int n4) {
        jh_.c797();
        gf_.e115(n3, n2, n3 + n4, n + n2);
        for (int i = n2; i < n + n2; i += cn_.imageHeight) {
            for (int j = n3; j < n4 + n3; j += cn_.imageWidth) {
                cn_.drawImage(j, i);
            }
        }
        jh_.b797();
    }
    
    private je_(final bb_ h, final cc_ g, final BigInteger j, final BigInteger e) {
        this._h = h;
        this._g = g;
        this._j = j; //always null
        this._e = e; //always null
        if (!this._h.b154(-21431)) {
            this._m = this._h.a180(true, 255, (byte)0, 255, (byte)91);
        }
    }
    
    static {
        je_._d = new int[] { 4210752, 16711680, 16711680, 255, 65280 };
        je_.mb_exclusive_1 = "EXCLUSIVE";
        je_.tutorial_raiders2 = new String[] { null, "Different raiders are better suited for different types of obstacles within the dungeon. Some are good at disarming <%traps>, others at fighting <%monsters>." };
        je_.mb_including_gamename = "(Including <%0>)";
        je_._i = 0;
    }
}
