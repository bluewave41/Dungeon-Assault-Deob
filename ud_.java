import java.awt.*;
import java.awt.event.*;

final class ud_ extends qe_
{
    static Graphic[] _s;
    static md_ _v;
    static Graphic _r;
    static int _x;
    static ed_ _t;
    static int[] _w;
    //original name: _y
    static Graphic scrollbar_bottom;
    //original name: _u
    static String text_save_and_exit;
    
    private final int[] a165(final int[] array, final boolean b) {
        final int[] array2 = new int[array.length];
        if (b) {
            this.c487(true);
        }
        for (int n = 0; array.length > n; ++n) {
            array2[n] = -(array[n] / 4) + 320 << 4;
        }
        return array2;
    }
    
    ud_() {
        final String skipText = ii_.skip.toUpperCase();
        final FontStyle c = ne_.roman20;
        rf_._O = new ob_(0L, null, null, null, jm_.button_152, "");
        rf_._O._D = 10;
        rf_._O._gb = 630 - rf_._O._Tb._L.imageWidth;
        rf_._O._ic._fb = 16777215;
        rf_._O._ic._y = c;
        rf_._O._ic._lb = 1;
        final ob_ o = rf_._O;
        final ok_ tb = rf_._O._Tb;
        final ok_ ic = rf_._O._ic;
        final int v = rf_._O._Tb._L.imageHeight;
        ic._B = v;
        tb._B = v;
        o._B = v;
        final ob_ o2 = rf_._O;
        final ok_ tb2 = rf_._O._Tb;
        final ok_ ic2 = rf_._O._ic;
        final int y = rf_._O._Tb._L.imageWidth;
        ic2._ob = y;
        tb2._ob = y;
        o2._ob = y;
        ub_._i = new HeaderLabelText(ne_.roman20, skipText, ag_._c);
        ok_._Y = new HeaderLabelText(ne_.roman20, skipText, ml_._b);
        ro_._B = false;
    }
    
    private final void a540(final boolean b, final int n) {
        ia_._K._w = 0;
        lk_.f150(n - 4080);
        gd_.a778(0, n ^ n, 0, b);
        cm_.a494(1.6f, 0.92f, n - 11884, 0.1f, 25.0f);
    }
    
    private final int[] a385(final boolean b, final int[] array) {
        if (b) {
            return null;
        }
        final int[] array2 = new int[array.length];
        for (int n = 0; array.length > n; ++n) {
            array2[n] = 240 - array[n] / 4 << 4;
        }
        return array2;
    }
    
    @Override
    final void b487(final boolean b) {
        fk_.a261(null);
        sf_._g = 256;
        ub_._p = 0;
    }
    
    public static void a423() {
        ud_.scrollbar_bottom = null;
        ud_._w = null;
        ud_._t = null;
        ud_._v = null;
        ud_._r = null;
        ud_.text_save_and_exit = null;
        ud_._s = null;
    }
    
    @Override
    final void a487(final boolean b) {
        if (b) {
            if (ia_._K == null) {
                gf_.a797();
            }
            else if (ia_._K._w > ia_._K._g) {
                gf_.a797();
                sg_._b.drawImage(-sg_._b.imageWidth + 640 >> 1, -sg_._b.imageHeight + 480 >> 1);
                if (sf_._g != 0) {
                    gf_.b669(0, 0, 640, 480, 0, sf_._g);
                }
                rf_._O.b540(false, 84);
                (rf_._O._hb ? ok_._Y : ub_._i).b326(rf_._O._D, rf_._O._gb + rf_._O._ob / 2 - ok_._Y._i / 2);
            }
            else {
                ia_._K.a150(-101);
                rf_._O.b540(false, 125);
                (rf_._O._hb ? ok_._Y : ub_._i).b326(rf_._O._D, -(ok_._Y._i / 2) + (rf_._O._ob / 2 + rf_._O._gb));
            }
        }
    }
    
    @Override
    final void c487(final boolean b) {
        if (!b) {
            return;
        }
        rf_._O.a430(-2, true);
        if (0 != rf_._O._G) {
            this.a540(true, 4096);
            return;
        }
        while (ha_.b427()) {
            if (13 != mm_._t) {
                continue;
            }
            this.a540(false, 4096);
            return;
        }
        if (!ro_._B) {
            rm_.r150();
            if (ro_._B) {
                this.d487(true);
            }
        }
        ia_._K.a487(true);
        if (ia_._K._w >= ia_._K._g) {
            if (++ub_._p < 150) {
                sf_._g -= 8;
                if (sf_._g < 0) {
                    sf_._g = 0;
                }
            }
            else {
                sf_._g += 8;
                if (sf_._g >= 256) {
                    cm_.a494(0.0f, 0.0f, -7788, 0.1f, 0.0f);
                    this.a540(false, 4096);
                }
            }
            return;
        }
        for (int i = 0; i < sj_._db.length; ++i) {
            if (sj_._db[i] == ia_._K._w && i < u_.introTracks.length) {
                gd_.a364(64, u_.introTracks[i]);
            }
        }
    }
    
    private final void d487(final boolean b) {
        ia_._K = new tk_(ga_.introImages, new int[] { sj_._db[1], sj_._db[2] - sj_._db[1], -sj_._db[2] + sj_._db[3], sj_._db[4] - sj_._db[3], -sj_._db[4] + sj_._db[5], -sj_._db[5] + sj_._db[6], sj_._db[7] - sj_._db[6], sj_._db[8] - sj_._db[7], 1870 - sj_._db[8] }, 0, ne_.roman20, qh_.intro_captions, null);
        ia_._K._i = new boolean[] { b, true, true, true, false, true, true, true, true };
        ia_._K._a[8] = 16777215;
        ia_._K._u[7] = 16777215;
        ia_._K._B = new boolean[] { true, true, true, true, true, false, true, true, true };
        ia_._K._r = 64;
        for (int n = 0; ia_._K._n.length > n; ++n) {
            ia_._K._n[n] = 5120;
            ia_._K._s[n] = 4096;
            ia_._K._c[n] = (ia_._K._h[n] = 0);
            ia_._K._j[n] = 3840;
            ia_._K._f[n] = 5120;
            ia_._K._q[n] = 2880;
            ia_._K._x[n] = 3840;
            ia_._K._A[n] = (ia_._K._e[n] = 5120);
            ia_._K._y[n] = (ia_._K._m[n] = 3840);
        }
        ia_._K._y[8] = 2560;
        ia_._K._m[8] = 3200;
        ia_._K._j = this.a165(new int[] { -160, 160, 0, 42, ia_._K._j[4], ia_._K._j[5], -120, -18, -18 }, false);
        ia_._K._q = this.a385(false, new int[] { -120, -120, -120, -9, ia_._K._q[4], ia_._K._q[5], -70, 2, 2 });
        for (int n2 = 0; ia_._K._n.length > n2; ++n2) {
            ia_._K._n[n2] = 5120;
            ia_._K._s[n2] = 4096;
        }
        final int[] n3 = ia_._K._n;
        final int[] n4 = ia_._K._n;
        ia_._K._s[4] = (ia_._K._s[5] = 4096);
        n3[4] = (n4[5] = 4096);
        final int[] c = ia_._K._c;
        final int[] c2 = ia_._K._c;
        final int[] h = ia_._K._h;
        c2[5] = (ia_._K._h[5] = 0);
        c[4] = (h[4] = 0);
        final int n5 = 600 * (-ia_._K._z[4] + ia_._K._d[4]) / (ia_._K._d[5] - ia_._K._z[4]);
        ia_._K._j[4] = 0;
        ia_._K._f[4] = (ia_._K._j[5] = -n5 << 4);
        ia_._K._f[5] = -9600;
        final int[] q = ia_._K._q;
        final int[] q2 = ia_._K._q;
        ia_._K._x[5] = 3840;
        q2[5] = (ia_._K._x[4] = 3840);
        ia_._K._w = 0;
        q[4] = 3840;
        cm_.a494(0.0f, 0.0f, -7788, 0.1f, 0.0f);
        t_.a124(1048576, jd_.da_intro, false);
    }
    
    //original signature: static final void a522(final Component component, final int m) {
    static final void removeListeners(final Component component) {
        component.removeKeyListener(in_._C);
        component.removeFocusListener(in_._C);
        ia_._M = -1;
    }
    
    static {
        ud_._v = new md_();
        ud_.text_save_and_exit = "Save the changes to your dungeon and return to the main menu";
    }
}
