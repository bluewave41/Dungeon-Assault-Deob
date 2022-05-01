import java.math.*;
import java.security.*;

final class cb_
{
    static int _b;
    static md_ _a;
    //original name: _c
    static String rot_worms;
    
    //original signature: static final void a296(final BigInteger bigInteger, final int n, final byte[] array, final ec_ ec_, final int n2, final BigInteger bigInteger2, final int n3) {
    static final void encryptBlock(final BigInteger publicKey, final int n, final byte[] array, final ec_ ec_, final BigInteger publicKeyExponent) {
        final int a080 = wk_.a080(n);
        if (rp_.secureRandom == null) {
            rp_.secureRandom = new SecureRandom();
        }
        final int[] randomInts = new int[4];
        for (int i = 0; i < 4; ++i) {
            randomInts[i] = rp_.secureRandom.nextInt(); //create 4 random ints
        }
        if (null == wa_._b || wa_._b.buffer.length < a080) {
            wa_._b = new ec_(a080);
        }
        wa_._b.currentIndex = 0;
        wa_._b.storeArray(array, n);
        wa_._b.g093(a080);
        wa_._b.a041(randomInts);
        
        if (t_._d == null || t_._d.buffer.length < 100) {
            t_._d = new ec_(100);
        }
        t_._d.currentIndex = 0;
        t_._d.storeByte(10);
        for (int j = 0; j < 4; ++j) {
            t_._d.storeInt(randomInts[j]);
        }
        t_._d.storeShort(n);
        t_._d.RSAEncrypt(publicKey, publicKeyExponent);
        ec_.storeArray(t_._d.buffer, t_._d.currentIndex);
        ec_.storeArray(wa_._b.buffer, wa_._b.currentIndex);
    }
    
    public static void a150() {
        cb_._a = null;
        cb_.rot_worms = null;
    }
    
    static {
        cb_._a = new md_();
        cb_.rot_worms = "Rot Worms";
    }
}
