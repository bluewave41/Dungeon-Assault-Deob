import java.awt.*;
import java.applet.*;

final class pd_ extends rj_
{
    int _H;
    private int _F;
    static od_ _J;
    int _D;
    int _C;
    int _z;
    static String _E;
    //original name: _B
    static String sound_colon;
    static ef_ _A;
    //original name: _G
    static String giant_spider;
    
    @Override
    final void a093(final int n, final int n2) {
        this._z += this._H * n2;
        if (this._C < this._z) {
            this._z = this._C;
        }
        if (n != 1) {
            this.a789(-97, (byte)28, -122);
        }
        if (0 > this._z) {
            this._z = 0;
        }
    }
    
    public static void c423() {
        pd_.sound_colon = null;
        pd_.giant_spider = null;
        pd_._A = null;
        pd_._E = null;
        pd_._J = null;
    }
    
    @Override
    final void d326(final int n, final int n2, final int n3) {
        if (0 == this._F) {
            return;
        }
        int z = this.a417(n3, true);
        if (z > this._C) {
            z = this._C;
        }
        if (0 > z) {
            z = 0;
        }
        this._z = z;
        if (n2 != 128) {
            c603(57, 88);
        }
    }
    
    //original signature: final void b093(final int n, final int n2) {
    final void b093(final int n2) {
        this.a115(n2 >> 5, n2, n2 >> 4);
    }
    
    //original signature: static final boolean c603(final int n, final int n2) {
    static final boolean c603(final int mouseY, final int mouseX) {
        return vf_._w - 16 <= mouseX && 16 + (vf_._w + 200) > mouseX && mouseY >= qc_._w - 32 && 32 + (wi_._kb + qc_._w) > mouseY;
    }
    
    //original signature: private final void a115(final int n, final int n2, final int c, final int n3) {
    private final void a115(final int n, final int c, final int n3) {
        this._H = ((n <= 0) ? 1 : n);
        this._D = ((n3 > 0) ? n3 : 1);
        this._C = c;
    }
    
    static final void a035(final Canvas canvas) {
        ud_.removeListeners(canvas);
        gn_.removeListeners(canvas);
        if (bn_._j != null) {
            bn_._j.a177(false, canvas);
        }
    }
    
    static final void a587(final int n, final Applet applet) {
        sm_.a715(applet, "");
        if (n != 5189) {
            c603(66, -39);
        }
        fk_.a587(n ^ 0x1411, applet);
    }
    
    @Override
    final void a183(final boolean b, final int n, int n2) {
        if (67 > n2) {
            n2 = 47;
        }
        super.a183(b, n, n2);
        this._F = n2 - 20;
    }
    
    @Override
    final void b326(final int n, final int n2, final int n3) {
        final int n4 = n + super._t;
        final int n5 = super._i + n3;
        bp_.a131(n5, hm_.scrollbar_top, n4);
        bp_.a131(this._F + n5 + 10, FooterCenterHint.scrollbar_bottom, n4);
        for (int i = 0; i < 7; ++i) {
            te_.b812(i + (6 + n4), n5 + 11, this._F - 2, kc_._M);
        }
        for (int j = 0; j < 3; ++j) {
            qe_.b050(-j + n4 + 5, 11 + n5, this._F - 2, 0, 192 - j * 64);
            qe_.b050(j + (13 + n4), n5 + 11, this._F - 2, 0, (3 - j) * 64);
        }
        for (int n6 = 1; this._F - 1 > n6; ++n6) {
            qe_.a050(n4 + 7, n5 + 10 + n6, 5, 0, -(n6 * 80 / this._F) + 144);
        }
        bo_.scrollbar_top.drawImage(n4, n5);
        if (n2 != 8187) {
            return;
        }
        ud_.scrollbar_bottom.drawImage(n4, this._F + n5 + 10);
        if (this._F >= 2 * qh_.scrollbar_slider.imageHeight) {
            final int n7 = (0 != this._C) ? (this._z * (this._F - 46) / this._C) : 0;
            bp_.a131(n7 + (10 + n5), ji_.scrollbar_slider, 4 + n4);
            qh_.scrollbar_slider.drawImage(n4 + 4, n7 + 10 + n5);
        }
        else {
            final int n8 = (0 != this._C) ? (this._z * (this._F - 23) / this._C) : 0;
            gf_.e115(n4 + 4, n8 + n5 + 5, qh_.scrollbar_slider.imageWidth + (4 + n4), qh_.scrollbar_slider.imageHeight / 2 + (n8 + 10) + (n5 + 5));
            bp_.a131(10 + n5 + n8, ji_.scrollbar_slider, n4 + 4);
            bp_.a131(n5 - (-10 - n8) - 23, ji_.scrollbar_slider, 4 + n4);
            gf_.b797();
            qh_.scrollbar_slider.c115(n4 + 4, n8 + n5 + 10, qh_.scrollbar_slider.imageWidth, qh_.scrollbar_slider.imageHeight / 2);
        }
    }
    
    pd_(final int n, final int n2, final int n3, final int n4, final int n5, final int z) {
        super(n, n2, 19, n4, n3);
        this._z = z;
        this._F = n4 - 20;
        this.b093(n5);
    }
    
    @Override
    final void a789(final int n, final byte b, final int n2) {
        if (b > -59) {
            return;
        }
        if (this._F != 0) {
            final int a417 = this.a417(n, true);
            if (a417 <= this._z) {
                if (a417 < this._z) {
                    this._z -= this._D;
                }
            }
            else {
                this._z += this._D;
            }
            if (this._C < this._z) {
                this._z = this._C;
            }
            if (this._z < 0) {
                this._z = 0;
            }
        }
    }
    
    private final int a417(final int n, final boolean b) {
        if (!b) {
            this.b326(34, -43, 108);
        }
        int n2;
        if (qh_.scrollbar_slider.imageHeight * 2 > this._F) {
            n2 = (n - 16) * this._C / (this._F - 23);
        }
        else {
            n2 = this._C * (n - 33) / (this._F - 46);
        }
        return n2;
    }
    
    static {
        pd_._J = new od_();
        pd_.giant_spider = "Giant Spider";
        pd_.sound_colon = "Sound: ";
    }
}
