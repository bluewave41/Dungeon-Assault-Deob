import java.net.*;
import java.io.*;

final class bk_ implements Runnable
{
    volatile vn_[] _g;
    static hd_ _b;
    //original name: _f
    static String[] tutorial_guardian2;
    //original name: _c
    static String create_email_confirm_tooltip;
    //original name: _e
    static ph_ cracked_bar;
    qg_ _h;
    volatile boolean _d;
    volatile boolean _a;
    
    //original signature:  public static void a487(final boolean b) {
    public static void a487() {
        bk_.create_email_confirm_tooltip = null;
        bk_._b = null;
        bk_.cracked_bar = null;
        bk_.tutorial_guardian2 = null;
    }
    
    //original signature: static final String b738(final int n) {
    static final String b738() {
        if (!ti_._f && no_._a >= lp_._z && lp_._z + 250 > no_._a) {
            return vj_._c;
        }
        return null;
    }
    
    //original signature: static final int a137(final int n) {
    static final int a137() {
        if (4 <= RaidMember._a._h) {
            if (-1 == RaidMember._a._c) {
                return 3;
            }
            if (RaidMember._a._c != -2) {
                return 1;
            }
            return 4;
        }
        else {
            try {
                if (ba_._f == 0) {
                    qi_._e = kn_._f.a288(lk_.gamePort1, of_.codeBaseHost);
                    ++ba_._f;
                }
                if (ba_._f == 1) {
                    if (qi_._e._c == 2) {
                        return dl_.a080(-5, -1);
                    }
                    if (qi_._e._c == 1) {
                        ++ba_._f;
                    }
                }
                if (ba_._f == 2) {
                    pe_._l = new rk_((Socket)qi_._e._f, kn_._f);
                    final ec_ ec_ = new ec_(13);
                    RegisterScreen.createOpcode12(ri_.serverNum, ec_, pj_.gameId, j_.lang);
                    ec_.storeByte(15);
                    ec_.storeInt(ng_.crc);
                    pe_._l.b120(ec_.buffer, 13);
                    ++ba_._f;
                    ce_._s = kd_.getTime() + 30000L;
                }
                if (ba_._f == 3) {
                    if (0 < pe_._l.getNumberOfAvailableBytes()) {
                        final int a410 = pe_._l.readFirstByteOfPacket();
                        if (a410 != 0) { //checking first byte of received data
                            return dl_.a080(-5, a410);
                        }
                        ++ba_._f;
                    }
                    else if (kd_.getTime() > ce_._s) {
                        return dl_.a080(-5, -2);
                    }
                }
                if (ba_._f == 4) {
                    RaidMember._a.a993(pe_._l, kn_._c); //kn_._c is never changed
                    pe_._l = null;
                    ba_._f = 0;
                    qi_._e = null;
                    return 0;
                }
                return -1;
            }
            catch (IOException ex) {
                return dl_.a080(-5, -3);
            }
        }
    }
    
    static final void a093(final int n, final int n2) {
        int n3 = 0;
        final int d = nl_._d;
        if (d >= 5) {
            if (105 <= d) {
                if (d < 120) {
                    final int n4 = -d + 120;
                    n3 = -(n4 * (n4 * 8192) / 3300) + 8192;
                }
            }
            else {
                n3 = (d * 16384 - 40960) / 220;
            }
        }
        else {
            n3 = 8192 * (d * d) / 1100;
        }
        int n5 = 1;
        int n6 = 0;
        if (n2 == 1) {
            n6 = 1;
        }
        if (n2 == 3) {
            n5 = -1;
        }
        if (4 == n2) {
            n5 = 1;
            n6 = 1;
        }
        if (5 == n2) {
            n5 = -1;
            n6 = 1;
        }
        if (n2 == 6) {
            n5 = 1;
            n6 = -1;
        }
        if (n2 == n || n2 == 8) {
            n6 = -1;
            n5 = -1;
        }
        if (n2 == 11) {
            n5 = -1;
        }
        if (12 == n2) {
            n6 = -1;
            n5 = -1;
        }
        if (n2 == 13) {
            n6 = -1;
            n5 = 1;
        }
        if (14 == n2) {
            n5 = -1;
            n6 = 1;
        }
        if (n2 == 15) {
            n6 = 1;
            n5 = 1;
        }
        pj_._e = vf_.a867(n6 * n3, n3 * n5);
    }
    
    @Override
    public final void run() {
        this._d = true;
        try {
            while (!this._a) {
                for (int i = 0; i < 2; ++i) {
                    final vn_ vn_ = this._g[i];
                    if (vn_ != null) {
                        vn_.a797();
                    }
                }
                pj_.a054(0, 10L);
                ho_.handleEventQueue(this._h, null);
            }
        }
        catch (Exception ex) {
            sm_.a741(ex, 1, null);
        }
        finally {
            this._d = false;
        }
    }
    
    //original signature: static final void a750(final qk_ g, final int q, final int t, final int j, final qk_ d) {
    static final void a750(final qk_ g, final qk_ d) {
        ci_._j = 2;
        oh_._t = 8;
        om_._d = d;
        gd_._G = g;
        Raider._q = 8;
    }
    
    bk_() {
        this._g = new vn_[2];
        this._a = false;
        this._d = false;
    }
    
    static {
        bk_.create_email_confirm_tooltip = "Type your email address again to make sure it's correct";
        bk_.tutorial_guardian2 = new String[] { null, "<%guardians> require a raider either to <%dodge> (testing against the room's <%snare>), or, more commonly, <%sneak> (against the room's <%detect>)" };
    }
}
