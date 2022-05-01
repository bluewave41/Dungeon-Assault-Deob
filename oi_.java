import java.util.*;
import java.io.*;

final class oi_ extends da_
{
    private boolean _I;
    private boolean _H;
    private int _L;
    private int _O;
    private int _K;
    private int _N;
    static ec_ _J;
    static md_ _F;
    //original name: _G
    static String connectionlost_withreason;
    //original name: _M
    static String text_save_and_exit_brief;
    
    @Override
    final StringBuilder a481(final int n, final Hashtable hashtable, final StringBuilder sb, final byte b) {
        if (this.a597(hashtable, n, 87, sb)) {
            this.a801(n, sb, hashtable, 1);
            this.a350(true, sb, n, hashtable);
            sb.append(" revert=").append(this._I);
            if (Integer.MAX_VALUE != this._L) {
                if (Integer.MAX_VALUE != this._N) {
                    sb.append(" to ").append(this._L).append(',').append(this._N);
                }
            }
        }
        if (b > -76) {
            return null;
        }
        return sb;
    }
    
    @Override
    final void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        if ((super._D instanceof GUIButton && !((GUIButton)super._D)._B) || super._y != 1) {
            if (this._I) {
                if (this._L != super.xAxisOffset) {
                    final int n3 = this._L - super.xAxisOffset;
                    super.xAxisOffset += ((Math.abs(n3) > 2) ? (n3 >> 1) : ((n3 > 0) ? 1 : -1));
                }
                if (this._N != super.yAxisOffset) {
                    final int n4 = this._N - super.yAxisOffset;
                    super.yAxisOffset += ((Math.abs(n4) > 2) ? (n4 >> 1) : ((0 >= n4) ? -1 : 1));
                }
            }
        }
        else {
            final int q = -n + (-this._K + hj_.mouseX);
            final int v = -n2 - this._O + Animation.mouseY;
            if (super.xAxisOffset != q || v != super.yAxisOffset) {
                super.xAxisOffset = q;
                super.yAxisOffset = v;
                if (super._n instanceof vi_) {
                    ((vi_)super._n).a260((byte)(-49), this, n2, n);
                }
            }
        }
        super.a319(n, n2, lm_, b);
    }
    
    //original signature: static final int b080(final int n, final int n2) {
    static final int getRandom(final int max) {
        return uj_.getRandom(ld_.random, max);
    }
    
    private oi_(final int n, final int n2, final int n3, final int n4, final ca_ ca_, final pg_ pg_, final lm_ d, final boolean i, final boolean h) {
        super(n, n2, n3, n4, ca_, pg_);
        this._L = Integer.MAX_VALUE;
        this._N = Integer.MAX_VALUE;
        super._D = d;
        this._H = h;
        this._I = i;
    }
    
    @Override
    final boolean a946(final lm_ lm_, final int y, final int n, final int n2, final int n3, final byte b, final int n4) {
        final boolean a946 = super.a946(lm_, y, n, n2, n3, (byte)(-2), n4);
        if (a946 && this._H) {
            return true;
        }
        if (this.a046(n3, n2, n4, -1, n)) {
            if (1 == y) {
                this._O = n + (-super.yAxisOffset - n4);
                ah_._b = this;
                this._K = -n2 + n3 - super.xAxisOffset;
            }
            super._y = y;
            return true;
        }
        return a946;
    }
    
    @Override
    final void e423(final byte b) {
        super.e423((byte)(-42));
        super._D.b050(0, super.componentWidth, 0, 0, super.componentHeight);
        if (b >= -4) {
            return;
        }
        this._L = super.xAxisOffset;
        this._N = super.yAxisOffset;
    }
    
    static final Graphic[] a428(final int n, final int n2, final nh_ nh_) {
        if (kk_.a283(nh_, 1, n, n2)) {
            return fo_.a033(0);
        }
        return null;
    }
    
    static final void f423(final byte b) {
        oh_._s = 10;
        jn_._c = false;
        ke_._b = vd_._a;
        if (b != 100) {
            return;
        }
        jm_.a150(b ^ 0xFFFFBB3F);
    }
    
    //original signature: static final boolean a097(final int n, final int n2) {
    
    //IMPORTANT LOGIN STUFF
    //waiting for data to be sent after login
    static final boolean readServerData(final int numberOfBytesToRead) {
        if (ra_._c.currentIndex >= numberOfBytesToRead) {
            return true;
        }
        if (null != sp_._c) {
            try {
                int numberOfAvailableBytes = sp_._c.getNumberOfAvailableBytes();
                if (0 < numberOfAvailableBytes) {
                    if (-ra_._c.currentIndex + numberOfBytesToRead < numberOfAvailableBytes) {
                        numberOfAvailableBytes = -ra_._c.currentIndex + numberOfBytesToRead;
                    }
                    sp_._c.readDataIntoArray(ra_._c.buffer, false, numberOfAvailableBytes, ra_._c.currentIndex);
                    qm_.time = kd_.getTime();
                    final wj_ c = ra_._c;
                    c.currentIndex += numberOfAvailableBytes;
                    if (numberOfBytesToRead <= ra_._c.currentIndex) {
                        ra_._c.currentIndex = 0;
                        return true;
                    }
                    return false;
                }
                else {
                    if (numberOfAvailableBytes < 0 || b_.a138() > 30000L) {
                        tl_.a150(-77);
                    }
                }
            }
            catch (IOException ex) {
                tl_.a150(127);
            }
            return false;
        }
        return false;
    }
    
    @Override
    final void a277(final int n, final boolean b, final int n2, final lm_ lm_, final int n3, final int n4) {
        if (!b) {
            this._K = 60;
        }
        super.a277(n, b, n2, lm_, n3, n4);
        super._y = 0;
    }
    
    public static void h150() {
        oi_.text_save_and_exit_brief = null;
        oi_._F = null;
        oi_._J = null;
        oi_.connectionlost_withreason = null;
    }
    
    static {
        oi_._J = new ec_(1048576);
        oi_.connectionlost_withreason = "Connection lost. <%0>";
        oi_._F = null;
        oi_.text_save_and_exit_brief = "Save and exit";
    }
}
