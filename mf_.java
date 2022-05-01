import java.io.*;
import java.awt.*;

final class mf_
{
	//original name: _b
    static Graphic[] doormasks;
    static String[] _c;
    static int[] _d;
    //original name: _a
    static String create_alert_passcontainsname_partial;
    
    //original signature: static final void a897(final int n, final ec_ ec_) {
    //this always throws exception?
    static final void a897(final ec_ ec_) {
        final byte[] array = new byte[24];
        if (bk_._b != null) {
            try {
                bk_._b.setK(0L);
                bk_._b.a837(array);
                int n2;
                for (n2 = 0; n2 < 24 && array[n2] == 0; ++n2) {}
                if (24 <= n2) {
                    throw new IOException();
                }
            }
            catch (Exception ex) {
                for (int n3 = 0; 24 > n3; ++n3) {
                    array[n3] = -1;
                }
            }
        }
        ec_.storeArray(array, 24);
    }
    
    static final Graphic a971(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n4 + n3 * 2;
        final int n6 = n2 + 2 * n3;
        final Graphic cn_ = new Graphic(n5, n6);
        jh_.a303(cn_);
        final int n7 = 0xFF00FF & n;
        final int n8 = n & 0xFF00;
        for (int i = 0; i < n3; ++i) {
            final int n9 = (i << 8) / (n3 - 1);
            gf_.a669(i, i, -(2 * i) + n5, n6 - 2 * i, -i + n3, ((n9 * n8 & 0xFF0000) | (n9 * n7 & 0xFF00FF00)) >>> 8);
        }
        gf_.b050(n3, n3, n4, n2, 0);
        jh_.b797();
        cn_._A -= n3;
        cn_._w -= n3;
        return cn_;
    }
    
    static final int b137(final int n) {
        boolean b = false;
        boolean b2 = false;
        while (ha_.b427()) {
            d_._g.d150(0);
            if (d_._g.c154(-94)) {
                b = true;
            }
            if (mm_._t != 13) {
                continue;
            }
            b2 = true;
        }
        d_._g.a326(-7734, ab_.a313(lc_.mouseX, hm_.mouseY), ab_.a313(hj_.mouseX, Animation.mouseY));
        if (d_._g.c154(77)) {
            b = true;
        }
        if (n != 12210) {
            return 46;
        }
        int n2 = 0;
        if (b && 0 <= d_._g._b) {
            n2 = n_._g[d_._g._b];
            if (2 == n2 || 5 == n2) {
                jb_.q150();
            }
        }
        else if (b2) {
            if (2 != kh_._t) {
                jb_.q150();
            }
        }
        if (n2 == 0 && kh_._t == 2 && (int)((10999L - (-kg_.time + kd_.getTime())) / 1000L) <= 0) {
            n2 = 2;
            ae_.a183(true, 5);
        }
        return n2;
    }
    
    public static void a150() {
        mf_._d = null;
        mf_._c = null;
        mf_.doormasks = null;
        mf_.create_alert_passcontainsname_partial = null;
    }
    
    static final void a166(final boolean b, final Canvas canvas) {
        if (10 > dk_._c) {
            boolean b2 = false;
            if (im_._d) {
                im_._d = false;
                b2 = true;
            }
            hd_.a846(tl_.b738(-3), jc_.color, b2, Raider.a137(-3));
        }
        else if (!l_.a491()) {
            gf_.a797();
            ah_.a183(320, 240);
            ob_.a749(0, -97, canvas, 0);
        }
        else if (0 != kh_._n) {
            g_.a035(canvas);
        }
        else {
            mj_.a967(b, false);
            ob_.a749(0, -84, canvas, 0);
        }
    }
    
    static {
        mf_.create_alert_passcontainsname_partial = "This password is part of your Player Name, and would be easy to guess";
    }
}
