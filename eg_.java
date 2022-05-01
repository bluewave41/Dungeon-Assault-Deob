import java.lang.reflect.*;
import java.applet.*;
import java.net.*;

final class eg_
{
    private int _a;
    //original name: _f
    static String text_detect;
    //original name: _b
    static String[] tutorial_firstroom1a;
    private dh_ _c;
    private int _e;
    private qi_ _h;
    //original name: _g
    static String tip_hall_of_glass;
    //original name: _d
    static int componentHeight;
    
    final Object a532(final int n, final long n2) {
        final wf_ wf_ = (wf_)this._h.a808(1, n2);
        if (null == wf_) {
            return null;
        }
        if (n > -2) {
            return null;
        }
        final Object d092 = wf_.d092(22698);
        if (null != d092) {
            if (!wf_.c427((byte)21)) {
                this._c.a520(wf_, false);
                wf_._o = 0L;
            }
            else {
                final pb_ pb_ = new pb_(d092, wf_._A);
                this._h.a957(wf_._h, (byte)(-128), pb_);
                this._c.a520(pb_, false);
                pb_._o = 0L;
                wf_.a487(false);
                wf_.b423();
            }
            return d092;
        }
        wf_.a487(false);
        wf_.b423();
        this._e += wf_._A;
        return null;
    }
    
    static final String a738() {
        return ra_._c.d738();
    }
    
    static final int c137() {
        return (int)(1000000000L / hk_._e);
    }
    
    //original signature: static long a833(final long n, final long n2) {
    static long and(final long n, final long n2) {
        return n & n2;
    }
    
    static final void a987(final Graphic z, final se_ se_) {
        ig_._a = 2;
        Tooltip._d = 80;
        DungeonPath._b = 80;
        md_._f = -2400;
        cb_._b = 40;
        je_._b = 15;
        qc_._z = z;
        lj_._m = 40;
    }
    
    private final void a157(final long n, final byte b) {
        if (b != -110) {
            this._h = null;
        }
        this.a049((wf_)this._h.a808(1, n), (byte)85);
    }
    
    private final void a049(final wf_ wf_, final byte b) {
        if (null != wf_) {
            wf_.a487(false);
            wf_.b423();
            this._e += wf_._A;
        }
    }
    
    private eg_() throws Throwable {
        throw new Error();
    }
    
    public static void d150(final int n) {
        eg_.tutorial_firstroom1a = null;
        if (n != -23658) {
            return;
        }
        eg_.tip_hall_of_glass = null;
        eg_.text_detect = null;
    }
    
    static final String a793(String string, final String s, final String s2, final boolean b) {
        int i = string.indexOf(s);
        if (!b) {
            b150(-74);
        }
        while (i != -1) {
            string = string.substring(0, i) + s2 + string.substring(i + s.length());
            i = string.indexOf(s, s2.length() + i);
        }
        return string;
    }
    
    static final void b150(final int n) {
        try {
            final Method method = Runtime.class.getMethod("maxMemory", (Class<?>[])new Class[0]);
            if (null != method) {
                try {
                    sj_._bb = 1 + (int)((long)method.invoke(Runtime.getRuntime(), (Object[])null) / 1048576L);
                }
                catch (Throwable t) {}
            }
            if (n <= 74) {
                d150(92);
            }
        }
        catch (Exception ex) {}
    }
    
    static final void a812(final Applet applet) {
        try {
            applet.getAppletContext().showDocument(j_.a550(new URL(applet.getCodeBase(), "quit.ws"), applet), "_top");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    static final boolean a102(final bo_ bo_, final int n, final bo_ bo_2) {
        if (n != 200) {
            b150(47);
        }
        int n2 = -bo_2._Ib + bo_._Ib;
        if (bo_._Nb == gm_._b) {
            n2 -= 200;
        }
        else if (bo_._Nb == null) {
            n2 += 200;
        }
        if (bo_2._Nb != gm_._b) {
            if (bo_2._Nb == null) {
                n2 -= 200;
            }
        }
        else {
            n2 += 200;
        }
        return n2 > 0;
    }
    
    final void a577(final boolean b, final Object o, final long n) {
        this.a370(o, 1, (byte)(-123), n);
        if (!b) {
            a793(null, null, null, false);
        }
    }
    
    static final void a537(final md_ md_) {
        final rj_ a777 = to_.a777(hj_.mouseX, Animation.mouseY, md_, 0);
        if (wi_._ob != a777) {
            if (null != wi_._ob) {
                wi_._ob._p = mo_._a;
            }
            wi_._ob = a777;
            if (wi_._ob != null) {
                wi_._ob._m = mo_._a;
            }
        }
        if (1 != no_.isMetaDown) {
            if (la_.isMetaDown == 1) {
                ++um_._h;
                if (np_._M == null && (rn_._a - Animation.mouseY) * (rn_._a - Animation.mouseY) + (-hj_.mouseX + kp_._c) * (-hj_.mouseX + kp_._c) > 5 && 5 < um_._h) {
                    np_._M = pa_._c;
                }
                if (null != np_._M) {
                    np_._M.d326(-np_._M._t + hj_.mouseX, 128, -np_._M._i + Animation.mouseY);
                }
            }
            else {
                if (np_._M == null || 5 > um_._h) {
                    hh_._s = pa_._c;
                    if (null != hh_._s) {
                        hh_._s.a789(-hh_._s._i + Animation.mouseY, (byte)(-98), -hh_._s._t + hj_.mouseX);
                    }
                }
                else {
                    hh_._s = null;
                }
                np_._M = null;
                pa_._c = null;
            }
        }
        else {
            um_._h = 0;
            kp_._c = lc_.mouseX;
            rn_._a = hm_.mouseY;
            pa_._c = to_.a777(lc_.mouseX, hm_.mouseY, md_, 0);
        }
        if (pj_._r != 0 && null != wi_._ob) {
            wi_._ob.a093(1, pj_._r);
        }
    }
    
    private final void a370(final Object o, final int n, final byte b, final long n2) {
        if (this._a < n) {
            throw new IllegalStateException();
        }
        this.a157(n2, (byte)(-110));
        this._e -= n;
        if (b >= -28) {
            a793(null, null, null, true);
        }
        while (0 > this._e) {
            this.a049((wf_)this._c.b162(true), (byte)120);
        }
        final pb_ pb_ = new pb_(o, n);
        this._h.a957(n2, (byte)(-128), pb_);
        this._c.a520(pb_, false);
        pb_._o = 0L;
    }
    
    static {
        eg_.tutorial_firstroom1a = new String[] { "Monster", "<%highlight>You have encountered a Monster in this room!</col> The statistics of a room are displayed in the bottom-right, opposite your raider's. These statistics are slightly different from those of a raider: <%attack>, <%defence>, <%snare> and <%detect>. A <%monster>, such as <%lastroom>, will usually have high <%attack> and <%defence>." };
        eg_.tip_hall_of_glass = "<%col_detect>Detect +2 to all monsters.</col>";
        eg_.text_detect = "Detect";
    }
}
