import java.awt.*;

final class hm_ extends ne_
{
    static boolean[] _m;
    //original name: _l
    static String text_advance_tooltip;
    boolean _r;
    int _o;
    static vn_ _n;
    int _p;
    //original name: _k
    static int mouseY;
    int _i;
    //original name: _t
    static String mb_full_access_2;
    //original name: _j
    static String ticketing_xunread;
    //original name: _q
    static Graphic scrollbar_top;
    static int _s;
    
    static final void a668(final int n, final int n2, final boolean b, final int n3) {
        if (n != 2) {
            if (n != 4) {
                if (n != 9) {
                    if (n != 17) {
                        if (n != 5) {
                            if (n != 6) {
                                if (n != 15) {
                                    if (7 == n) {
                                        md_.a093(0);
                                        gd_.a778(dc_._z, 0, 7, b);
                                    }
                                    else if (n != 10) {
                                        if (3 != n) {
                                            if (13 != n) {
                                                if (14 != n) {
                                                    if (8 != n) {
                                                        if (11 != n) {
                                                            if (16 == n) {
                                                                if (10 != mn_._b) {
                                                                    if (mn_._b == 8) {
                                                                        ik_.a503(bh_.pleaselogin, mn_._b);
                                                                    }
                                                                }
                                                                else {
                                                                    ik_.a503(null, 9);
                                                                }
                                                            }
                                                            else if (n != 18) {
                                                                if (19 == n) {
                                                                    if (kd_._e.length - 1 > mo_.instructionPageIndex) {
                                                                        md_.a093(1 + mo_.instructionPageIndex);
                                                                    }
                                                                }
                                                                else if (n != 12) {
                                                                    if (20 == n) {
                                                                        if (tl_._l) {
                                                                            bf_._f[dc_._z]._b = new WarningMessage(ub_.playtutorial.toUpperCase(), ub_.tutorial_justplay_warning, uo_.login.toUpperCase(), hj_.text_continue, 0);
                                                                        }
                                                                        else {
                                                                            gd_.a778(ve_.a491() ? 12 : 0, 0, -3, false);
                                                                        }
                                                                    }
                                                                    else if (n != 21) {
                                                                        if (n != 22) {
                                                                            if (23 == n) {
                                                                                mh_.b150(-1);
                                                                            }
                                                                            else if (28 == n) {
                                                                                gl_.topDownOrIsometric = !gl_.topDownOrIsometric;
                                                                                if (null != ik_._e) {
                                                                                    ik_._e.a423((byte)113);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (ak_._o[0] <= gm_.playerInformation.highestRenown) {
                                                                            ka_.a150();
                                                                        }
                                                                    }
                                                                    else {
                                                                        gd_.a778(dc_._z, 0, 13, false);
                                                                    }
                                                                }
                                                                else {
                                                                    eg_.a812(m_.getApplet());
                                                                }
                                                            }
                                                            else if (0 < mo_.instructionPageIndex) {
                                                                md_.a093(mo_.instructionPageIndex - 1);
                                                            }
                                                        }
                                                        else if (null != ik_._e) {
                                                            af_.a423();
                                                            if (ik_._e != null) {
                                                                ik_._e.a430(17158, b);
                                                                gh_._f = true;
                                                            }
                                                        }
                                                    }
                                                    else if (null != cm_._R) {
                                                        ib_.a150();
                                                    }
                                                    else {
                                                        tl_._d = false;
                                                        a_.a743(b);
                                                        if (null != cm_._R) {
                                                            i_._A.a238(cm_._R, (byte)101, false);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            gd_.a778(dc_._z, 0, 2, b);
                                        }
                                    }
                                    else {
                                        gd_.a778(dc_._z, 0, g_._Hb, b);
                                    }
                                }
                                else {
                                    gd_.a778(dc_._z, 0, 8, b);
                                }
                            }
                            else {
                                gd_.a778(dc_._z, 0, 5, b);
                            }
                        }
                        else {
                            gd_.a778(dc_._z, 0, 4, b);
                        }
                    }
                    else {
                        gd_.a778(dc_._z, 0, 12, b);
                        wa_._a = true;
                    }
                }
                else {
                    gd_.a778(dc_._z, 0, 0, b);
                }
            }
            else {
                gd_.a778(dc_._z, 0, 3, b);
            }
        }
        else {
            gd_.a778(ve_.a491() ? 12 : 0, 0, -1, b);
        }
        if (n3 > -18) {
            hm_.text_advance_tooltip = null;
        }
    }
    
    public static void d150() {
        hm_._m = null;
        hm_._n = null;
        hm_.ticketing_xunread = null;
        hm_.text_advance_tooltip = null;
        hm_.scrollbar_top = null;
        hm_.mb_full_access_2 = null;
    }
    
    //original signature: static final void a150() {
    static final void renownTableError() {
        if (fb_.renownTableEntries != null) {
            for (int i = 0; i < fb_.renownTableEntries.length; ++i) {
                fb_.renownTableEntries[i] = null;
            }
        }
        bj_.renownTableError = true;
    }
    
    hm_(final int i, final boolean r) {
        this._r = r;
        this._i = i;
    }
    
    static final int a800(final boolean b, final byte b2) {
        bl_._c += 65536;
        while (mh_.a170(bl_._c, am_._d) >= 65536) {
            ++jc_._e;
            bl_._c -= am_._d;
        }
        int n = -1;
        if (null == of_._q) {
            if (en_.text_benefits_images != null) {
                n = en_.text_benefits_images.length;
            }
        }
        else {
            n = of_._q.length;
        }
        if (b2 != -20) {
            return -25;
        }
        if (-1 != n) {
            if (am_._c > wf_._x) {
                ++wf_._x;
                if (wf_._x > am_._g && (of_._q == null || null == of_._q[me_._f])) {
                    --wf_._x;
                }
                else if (wf_._x >= am_._c) {
                    if (null == of_._q[(me_._f + 1) % n]) {
                        --wf_._x;
                    }
                }
            }
            if (wf_._x >= am_._c) {
                Room._n = me_._f;
                wf_._x -= am_._c;
                if (!oo_._a) {
                    --me_._f;
                    if (0 > me_._f) {
                        me_._f += n;
                    }
                }
                else {
                    ++me_._f;
                    if (me_._f >= n) {
                        me_._f -= n;
                    }
                }
            }
            if (am_._g < wf_._x) {
                oo_._a = true;
            }
        }
        if (ql_.benefits_arrow != null) {
            final int n2 = 357 - ql_.benefits_arrow.imageHeight2 / 2;
            boolean b3 = false;
            if (0 != no_.isMetaDown && hm_.mouseY > n2) {
                if (hm_.mouseY < n2 + ql_.benefits_arrow.imageHeight) {
                    if (-ql_.benefits_arrow.imageWidth + 269 < lc_.mouseX && lc_.mouseX < 269) {
                        wf_._x = am_._c;
                        oo_._a = false;
                        b3 = true;
                    }
                    if (586 < lc_.mouseX) {
                        if (ql_.benefits_arrow.imageWidth + 586 > lc_.mouseX) {
                            oo_._a = true;
                            wf_._x = am_._c;
                            b3 = true;
                        }
                    }
                }
            }
            if (!b3 && wf_._x > am_._g && Animation.mouseY > n2) {
                if (ql_.benefits_arrow.imageHeight + n2 > Animation.mouseY) {
                    if (hj_.mouseX > 269 - ql_.benefits_arrow.imageWidth) {
                        if (269 > hj_.mouseX) {
                            wf_._x = am_._g;
                        }
                    }
                    if (586 < hj_.mouseX && hj_.mouseX < 586 + ql_.benefits_arrow.imageWidth) {
                        wf_._x = am_._g;
                    }
                }
            }
        }
        if (b) {
            o_._i.a326(b2 ^ 0x1E26, f_.a313(lc_.mouseX, hm_.mouseY), f_.a313(hj_.mouseX, Animation.mouseY));
            if (o_._i.c154(50)) {
                if (o_._i._b == 0) {
                    return 3;
                }
                if (o_._i._b == 1) {
                    return 2;
                }
            }
            while (ha_.b427()) {
                o_._i.a366(0, (byte)(-107));
                if (o_._i.c154(-76)) {
                    if (o_._i._b == 0) {
                        return 3;
                    }
                    if (o_._i._b == 1) {
                        return 1;
                    }
                }
                if (13 != mm_._t) {
                    continue;
                }
                return 1;
            }
        }
        return 0;
    }
    
    static final void a531(final sa_ sa_, final int n) {
        final rj_ ob = wi_._ob;
        if (ob != null) {
            if (ob._n != null) {
                uj_.a872(ob._n);
            }
        }
        if (m_._e != null && gn_._h == 20 && sa_ != null) {
            m_._e.a185(n + 21, sa_);
        }
        if (null == m_._e) {
            gn_._h = 0;
            m_._e = GUICheckbox._O;
        }
        else {
            if (GUICheckbox._O != m_._e) {
                m_._e = null;
                un_._e = null;
            }
            ++gn_._h;
        }
        if (n != -21) {
            hm_._m = null;
        }
        GUICheckbox._O = null;
    }
    
    static {
        hm_._m = new boolean[] { false, true, true, true, true, true };
        hm_.ticketing_xunread = "You have <%0> unread messages!";
        hm_.text_advance_tooltip = "Order your raider to engage the monster in combat. <br><br><col=2E5D17>Advancing</col> leaves your raider's skill levels unchanged.<br><br>Requires: <col=FF0000>Attack</col>, <col=0A7500>Defence</col>";
        hm_._s = 0;
        hm_.mb_full_access_2 = "to over <%0> great games";
        hm_.mouseY = 0;
    }
}
