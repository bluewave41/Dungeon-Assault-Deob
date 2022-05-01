import java.applet.*;
import java.awt.*;

final class rc_
{
	//original name: _b
    static Applet applet;
    private static qk_ _a;
    
    public static void a423() {
        rc_._a = null;
        rc_.applet = null;
    }
    
    static final Graphic a324(final String s, final nh_ nh_, String string) {
        if (!nh_.b671(string, s, (byte)(-82))) {
            string += ".jpg";
        }
        final Graphic cn_ = new Graphic(nh_.a826(s, string), fi_.getCanvas());
        for (int i = 0; i < cn_._B.length; ++i) {
            cn_._B[i] = nb_.and(cn_._B[i], 16777215);
        }
        return cn_;
    }
    
    static final void b150(final int n) {
        if (n <= 79) {
            rc_._a = null;
        }
        gg_.a693(null, "");
    }
    
    static final void c150() {
        bh_._M = false;
        ra_._c.readByte();
    }
    
    static final void a150() {
        en_._c = -(fa_._i >> 1) + wf_._C;
        int c = en_._c;
        for (int n = 0; uc_._K.length > n; ++n) {
            final int n2 = dd_._A[n];
            int n3;
            if (n2 >= 0) {
                if (n2 != Raider._h._b) {
                    n3 = dc_._l;
                }
                else {
                    n3 = il_._a;
                }
            }
            else {
                n3 = ui_._b;
            }
            final String s = uc_._K[n];
            final int a218 = GUICheckbox.a218(s);
            final int n4 = -(a218 >> 1) + tm_._e;
            if (n2 >= 0) {
                final int n5 = c + lc_._j;
                final qk_ qk_ = (n2 == Raider._h._b) ? ug_._y : rc_._a;
                if (null != qk_) {
                    qk_.a050(n5, cd_._e + (i_._o << 1), a218 + (an_._w << 1), 112, n4 - an_._w);
                }
                c = n5 + i_._o;
            }
            if (n2 < 0) {
                hc_._e.b191(s, n4, c + da_._C, n3, -1);
                c += gb_._a;
            }
            else {
                mp_._a.b191(s, n4, vk_._e + c, n3, -1);
                c += cd_._e + (i_._o + lc_._j);
            }
        }
    }
}
