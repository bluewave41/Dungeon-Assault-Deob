import java.awt.*;

final class ga_ extends ip_
{
	//original name: _o
    static Graphic[] introImages;
    private be_ _q;
    private String _m;
    static Graphic _r;
    private boolean _s;
    
    public static void d423() {
        ga_._r = null;
        ga_.introImages = null;
    }
    
    @Override
    final String a439(final byte b, final String s) {
        if (this._q.a212(s, 65) == pd_._J) {
            return this._q.a439((byte)96, s);
        }
        if (this.a212(s, 60) == pd_._J) {
            return pj_.create_alert_email_unavailable;
        }
        if (b < 44) {
            this.a439((byte)49, null);
        }
        return sh_.create_emailvalid;
    }
    
    @Override
    final od_ a212(final String m, final int n) {
        if (this._q.a212(m, 104) == pd_._J) {
            return pd_._J;
        }
        if (!m.equals(this._m)) {
            final me_ a149 = gk_.a149(m);
            if (!a149.getH()) {
                return oc_._A;
            }
            this._m = m;
            this._s = a149.getB();
        }
        return this._s ? c_._d : pd_._J;
    }
    
    static final Frame a503(final qg_ qg_, final int n, int b, final int n2, final int n3) {
        if (!qg_.a154(50)) {
            return null;
        }
        if (b == 0) {
            final ki_[] a899 = kc_.a899(qg_, 10);
            if (null == a899) {
                return null;
            }
            int n4 = 0;
            for (int n5 = 0; a899.length > n5; ++n5) {
                if (n == a899[n5]._g && a899[n5]._d == n3 && (n2 == 0 || a899[n5]._a == n2)) {
                    if (n4 == 0 || a899[n5]._b > b) {
                        b = a899[n5]._b;
                        n4 = 1;
                    }
                }
            }
            if (n4 == 0) {
                return null;
            }
        }
        final pn_ a900 = qg_.a240(n2, n, b, n3);
        while (0 == a900._c) {
            pj_.a054(0, 10L);
        }
        final Frame frame = (Frame)a900._f;
        if (frame == null) {
            return null;
        }
        if (2 == a900._c) {
            ng_.a139(qg_, frame);
            return null;
        }
        return frame;
    }
    
    ga_(final rm_ rm_, final rm_ rm_2) {
        super(rm_);
        this._m = "";
        this._s = false;
        this._q = new be_(rm_, rm_2);
    }
}
