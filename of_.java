import java.math.*;

final class of_
{
    int _c;
    //original name: _j
    static Graphic menu_button;
    int _b;
    static fd_ _p;
    static Graphic[] _q;
    int _e;
    static int _l;
    byte[] _o;
    int _h;
    int _i;
    static Graphic _f;
    int _m;
    byte[] _n;
    //original name: _d
    static String codeBaseHost;
    static boolean _k;
    static r_ _g;
    int _a;
    
    //original signature: static final void a673(final ec_ ec_, final BigInteger bigInteger, final BigInteger bigInteger2, final ec_ ec_2) {
    static final void encryptBlock(final ec_ ec_, final BigInteger publicKey, final BigInteger publicKeyExponent, final ec_ ec_2) {
        cb_.encryptBlock(publicKey, ec_2.currentIndex, ec_2.buffer, ec_, publicKeyExponent);
    }
    
    //original signature: static final void a150(final int n) {
    static final void a150() {
        jh_.c797();
        if (im_._e == null) {
            im_._e = new Graphic(268, 268);
            im_._e._w = -8;
            im_._e._A = -8;
        }
        im_._e.e797();
        gf_.a797();
        int n2 = 0;
        for (int n3 = 0; 7 > n3; ++n3) {
            for (int i = 0; i < 7; ++i) {
                jm_.a115(12 + n3 * 36, n2, 3, 36 * i + 12);
                ++n2;
            }
        }
        gf_.d669(2, 2, 0, 0, im_._e.imageWidth, im_._e.imageHeight);
        jh_.b797();
    }
    
    public static void a423() {
        of_._q = null;
        of_.menu_button = null;
        of_._p = null;
        of_._g = null;
        of_._f = null;
        of_.codeBaseHost = null;
    }
    
    static {
        of_._p = new fd_(0);
        of_._g = new r_();
    }
}
