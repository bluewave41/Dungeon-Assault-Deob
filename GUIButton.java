import java.util.*;

class GUIButton extends lm_
{
    private boolean _C;
    boolean _B;
    //original name: _G
    static Graphic piece_blade_construct;
    static fm_ _H;
    //original name: _D
    static String error_js5crc;
    boolean _E;
    private boolean _F;
    
    @Override
    final StringBuilder a481(final int n, final Hashtable hashtable, final StringBuilder sb, final byte b) {
        if (this.a597(hashtable, n, 108, sb)) {
            this.a801(n, sb, hashtable, 1);
            if (this._E) {
                sb.append(" active");
            }
            if (!this._B) {
                sb.append(" disabled");
            }
        }
        if (b > -76) {
            e423((byte)58);
        }
        return sb;
    }
    
    //original signature: ck_(final String s, final ca_ ca_, final pg_ pg_) {
    GUIButton(final String textString, final ca_ ca_, final pg_ pg_) {
        super(textString, ca_, pg_);
        this._C = true;
        this._B = true;
        this._F = false;
    }
    
    @Override
    final void e150(final int n) {
        if (this._F) {
            this._F = false;
            if (null != super._n) {
                if (super._n instanceof io_) {
                    ((io_)super._n).a002(this._F, 124, this);
                }
            }
        }
        if (n <= 1) {
            a018(null, null);
        }
    }
    
    @Override
    boolean a336(final int n, final lm_ lm_) {
        if (n != 34) {
            this._E = true;
        }
        if (!this._B || !this._C) {
            return false;
        }
        lm_.e150(53);
        this._F = true;
        if (super._n != null) {
            if (super._n instanceof io_) {
                ((io_)super._n).a002(this._F, -71, this);
            }
        }
        return true;
    }
    
    @Override
    boolean a946(final lm_ lm_, final int y, final int n, final int n2, final int n3, final byte b, final int n4) {
        if (this._B && this.a046(n3, n2, n4, -1, n)) {
            this.a336(34, lm_);
            super._y = y;
            if (super._n != null) {
                if (super._n instanceof si_) {
                    ((si_)super._n).a394(n, this, n2, -100, y, n4, n3);
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        super.a319(n, n2, lm_, b);
        if (super._y != 0) {
            if (la_.isMetaDown != super._y) {
                if (this.a046(hj_.mouseX, n, n2, -1, Animation.mouseY) && 0 == la_.isMetaDown) {
                    this.b115(-n2 + Animation.mouseY, super._y, 1, -n + hj_.mouseX);
                }
                this.a277(n2, true, Animation.mouseY, lm_, n, hj_.mouseX);
            }
        }
    }
    
    //original signature: ck_(final String s, final pg_ pg_) {
    GUIButton(final String textString, final pg_ pg_) {
        this(textString, hl_._a._o, pg_);
    }
    
    @Override
    boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (this.returnFalse() && (n == 84 || n == 83)) {
            this.b115(-1, 1, 1, -1);
            return true;
        }
        if (b <= 55) {
            this.b115(56, -107, -73, -111);
        }
        return false;
    }
    
    static final void e423(final byte b) {
        re_.b797();
        jk_._Bb = new int[260];
        lh_._t = 11;
        if (b != 65) {
            return;
        }
        for (int i = 0; i < 256; ++i) {
            jk_._Bb[i] = (int)(Math.pow(i / 256.0f, 15.0) * 255.0);
        }
        for (int j = 256; j < jk_._Bb.length; ++j) {
            jk_._Bb[j] = 255;
        }
    }
    
    @Override
    final void a277(final int n, final boolean b, final int n2, final lm_ lm_, final int n3, final int n4) {
        if (super._n != null && super._n instanceof si_) {
            ((si_)super._n).a368((byte)42, n2, n, n3, this, n4);
        }
        if (!b) {
            return;
        }
        super._y = 0;
    }
    
    @Override
    //maybe this doesnt return false?
    final boolean returnFalse() {
        return this._F;
    }
    
    //original signature: static final void a018(final String s, final int n, final String s2) {
    static final void a018(final String password, final String username) {
        lp_.a178(password, false, username);
    }
    
    public static void b487(final boolean b) {
    	GUIButton.error_js5crc = null;
        if (!b) {
            g154(50);
        }
        GUIButton.piece_blade_construct = null;
        GUIButton._H = null;
    }
    
    void b115(final int n, final int n2, final int n3, final int n4) {
        if (n3 != 1) {
            this._C = false;
        }
        if (super._n != null && super._n instanceof vg_) {
            ((vg_)super._n).a475(this, (byte)98, n2, n, n4);
        }
    }
    
    static final boolean g154(final int n) {
        return n != -1 || nk_._Ib != null || td_._c;
    }
    
    protected GUIButton() {
        this._C = true;
        this._B = true;
        this._F = false;
        super._o = hl_._a._d;
    }
    
    static {
    	GUIButton.error_js5crc = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
