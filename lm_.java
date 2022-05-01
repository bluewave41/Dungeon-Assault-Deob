import java.io.*;
import java.applet.*;
import java.util.*;

class lm_ extends ne_
{
    int _y;
    static byte[][] _l;
    boolean _u;
    pg_ _n;
    //original name: _r
    static String dryad;
    //original name: _w
    String buttonText;
    int _A;
    int _j;
    //original name: _v
    int yAxisOffset;
    static int _k;
    static int[] _m;
    //original name: _s
    int componentWidth;
    l_ _t;
    //original name: _p
    static String create_password_confirm_tooltip;
    ca_ _o;
    //original name: _q
    int xAxisOffset;
    //original name: _s
    int componentHeight;
    //original name: _z
    static Graphic piece_rat;
    //original name: _i
    String tooltip;
    
    static final void b423() {
        if (RaidMember._a != null) {
            RaidMember._a.a150(-1016);
        }
        if (null != na_._y) {
            na_._y.a150(-65);
        }
        if (null != sa_._x) {
            try {
                sa_._x.c423((byte)(-118));
            }
            catch (IOException ex) {}
        }
        if (null != AmbientAudioTrack._c) {
            for (int n = 0; AmbientAudioTrack._c.length > n; ++n) {
                if (null != AmbientAudioTrack._c[n]) {
                    try {
                        AmbientAudioTrack._c[n].c423((byte)(-42));
                    }
                    catch (IOException ex2) {}
                }
            }
        }
    }
    
    void b050(final int n, final int x, final int v, final int q, final int s) {
        this.componentHeight = s;
        this.yAxisOffset = v;
        this.componentWidth = x;
        if (n != 0) {
            return;
        }
        this.xAxisOffset = q;
    }
    
    static final void a812(final byte b, final Applet applet) {
        try {
            final String file = j_.a550(applet.getCodeBase(), applet).getFile();
            ee_.a008("updatelinks", applet, b ^ 0xFFFFC289, new Object[] { "home", file + "home.ws" });
            if (b != -106) {
                a890(true, null, 27L, null, null);
            }
            ee_.a008("updatelinks", applet, 15647, new Object[] { "gamelist", file + "togamelist.ws" });
            ee_.a008("updatelinks", applet, 15647, new Object[] { "serverlist", file + "toserverlist.ws" });
            ee_.a008("updatelinks", applet, 15647, new Object[] { "options", file + "options.ws" });
            ee_.a008("updatelinks", applet, 15647, new Object[] { "terms", file + "terms.ws" });
            ee_.a008("updatelinks", applet, 15647, new Object[] { "privacy", file + "privacy.ws" });
        }
        catch (Throwable t) {}
    }
    
    boolean a276(final int n, final int n2, final int n3, final int n4, final int n5, final lm_ lm_, final byte b) {
        if (b != -84) {
            this._j = -54;
        }
        return false;
    }
    
    static final void a789(final int n, final int n2) {
        for (int n3 = 0; 49 > n3; ++n3) {
            if (ue_._j[n3] == n) {
                ue_._j[n3] = n2;
            }
        }
    }
    
    StringBuilder a481(final int n, final Hashtable hashtable, final StringBuilder sb, final byte b) {
        if (b >= -76) {
            this._t = null;
        }
        if (this.a597(hashtable, n, -113, sb)) {
            this.a801(n, sb, hashtable, 1);
        }
        return sb;
    }
    
    boolean a336(final int n, final lm_ lm_) {
        if (n != 34) {
            this.xAxisOffset = 81;
        }
        return false;
    }
    
    final void f150(final int n) {
        this.b050(0, this.componentWidth, this.yAxisOffset, this.xAxisOffset, this.componentHeight);
        if (n != 12591) {
            this._y = 64;
        }
    }
    
    static final void a890(final boolean b, final String s, final long n, final Applet applet, final String s2) {
        try {
            final String parameter = applet.getParameter("cookiehost");
            if (b) {
                lm_._k = 1;
            }
            final String string = s + "=" + s2 + "; version=1; path=/; domain=" + parameter;
            String s3;
            if (n >= 0L) {
                s3 = string + "; Expires=" + go_.a748(kd_.getTime() + n * 1000L) + "; Max-Age=" + n;
            }
            else {
                s3 = string + "; Discard;";
            }
            ee_.eval("document.cookie=\"" + s3 + "\"", applet);
        }
        catch (Throwable t) {}
    }
    
    //original signature: final void a326(final int n, final int n2, final int n3) {
    final void a326(final int n, final int n2) {
        for (int i = 0, n4 = 0; i >= n4; ++n4) {
            this.a115(n4, n2, 0, n);
        }
        final String b738 = bk_.b738();
        if (null != b738) {
            hl_._a.a668(b738, fl_.mouseY, wa_.mouseX);
        }
    }
    
    @Override
    public final String toString() {
        return this.a481(0, new Hashtable(), new StringBuilder(), (byte)(-89)).toString();
    }
    
    lm_(final String s, final pg_ pg_) {
        this(s, hl_._a._m, pg_);
    }
    
    final boolean a597(final Hashtable hashtable, final int n, final int n2, final StringBuilder sb) {
        if (hashtable.containsKey(this)) {
            sb.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
        }
        hashtable.put(this, this);
        return true;
    }
    
    void a115(final int n, final int n2, final int n3, final int n4) {
        if (n3 != 0) {
            a901(null);
        }
        if (n == 0 && null != this._o) {
            this._o.a623((byte)34, this, n2, n4, true);
        }
    }
    
    public static void d423() {
        lm_.create_password_confirm_tooltip = null;
        lm_._l = null;
        lm_._m = null;
        lm_.piece_rat = null;
        lm_.dryad = null;
    }
    
    String c983(final byte b) {
        return this._u ? this.tooltip : null;
    }
    
    final boolean a564(final int n, final int n2, final char c) {
    	//almost certainly returns false
        return (false && this.a401(this, c, n2, (byte)63)) || (n2 == 80 && this.a336(34, this));
    }
    
    final void a801(final int n, StringBuilder sb, final Hashtable hashtable, final int n2) {
        sb.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.xAxisOffset).append(",").append(this.yAxisOffset).append(" ").append(this.componentWidth).append("x").append(this.componentHeight);
        if (this.buttonText != null) {
            sb.append(" text=\"").append(this.buttonText).append('\"');
        }
        if (this._u) {
            sb.append(" mouseover");
        }
        if (this._o != null) {
            sb.append(" renderer=");
            if (!(this._o instanceof lm_)) {
                sb.append(this._o);
            }
            else {
                sb = this.a481(1 + n, hashtable, sb, (byte)(-99));
            }
        }
        if (n2 != 1) {
            return;
        }
        if (this._n != null) {
            sb.append(" listener=");
            if (!(this._n instanceof lm_)) {
                sb.append(this._n);
            }
            else {
                sb = this.a481(1 + n, hashtable, sb, (byte)(-81));
            }
        }
    }
    
    boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (b < 55) {
            this._t = null;
        }
        return false;
    }
    
    void a277(final int n, final boolean b, final int n2, final lm_ lm_, final int n3, final int n4) {
        this._y = 0;
        if (!b) {
            this.tooltip = null;
        }
    }
    
    //original signature: final boolean a046(final int n, final int n2, final int n3, final int n4, final int n5) {
    final boolean a046(final int mouseX, final int n2, final int n3, final int n4, final int mouseY) {
        return n4 == -1 && mouseX >= this.xAxisOffset + n2 && n3 + this.yAxisOffset <= mouseY && n2 + this.xAxisOffset + this.componentWidth > mouseX && mouseY < this.yAxisOffset + n3 + this.componentHeight;
    }
    
    //if (!this.a946(this, no_.isMetaDown, hm_.mouseY, n2, lc_.mouseX, (byte)0, n)) {
    boolean a946(final lm_ lm_, final int y, final int n, final int n2, final int n3, final byte b, final int n4) {
        if (this.a046(n3, n2, n4, -1, n)) {
            this._y = y;
        }
        return false;
    }
    
    //never called
    int d137(final int n) {
        return 0;
    }
    
    static final void a901(final Graphic cn_) {
        ie_.a150();
        gf_.a397(cn_._B, cn_.imageWidth2, cn_.imageHeight2);
    }
    
    void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        final boolean a046 = this.a046(hj_.mouseX, n, n2, -1, Animation.mouseY);
        if (!b) {
            return;
        }
        if (a046 != this._u) {
            this._u = a046;
            if (null != this._n) {
                if (this._n instanceof de_) {
                    ((de_)this._n).a343(true, this, a046);
                }
            }
        }
    }
    
    void e150(final int n) {
        if (n < 1) {
            this.toString();
        }
    }
    
    //original signature: final boolean a421(final int n, final byte b, final int n2, boolean b2) {
    final boolean a421(final int n, final int n2, boolean b2) {
        this.a319(n2, n, this, true);
        if (!b2) {
        }
        else {
            if (0 != pj_._r) {
            }
            if (0 != no_.isMetaDown) {
                if (!this.a946(this, no_.isMetaDown, hm_.mouseY, n2, lc_.mouseX, (byte)0, n)) {
                }
                else {
                    b2 = false;
                }
            }
            if (0 == la_.isMetaDown) {
                if (oe_.isMetaDown != 0) {
                    this.a277(n, true, Animation.mouseY, this, n2, hj_.mouseX);
                    final oi_ b3 = ah_._b;
                    if (b3 != null) {
                        if (b3._n instanceof qo_) {
                            ((qo_)b3._n).a045(null, b3, false);
                        }
                        ah_._b = null;
                    }
                }
            }
        }
        oe_.isMetaDown = la_.isMetaDown;
        nk_.a627(this.c983((byte)34), (byte)23);
        return b2;
    }
    
    protected lm_() {
        this._A = 0;
        this._j = 0;
    }
    
    //original signature: boolean a427(final byte b) {
    //always returns false
    boolean returnFalse() {
        return false;
    }
    
    //original signature: lm_(final String w, final ca_ o, final pg_ n) {
    lm_(final String buttonText, final ca_ o, final pg_ n) {
        this._A = 0;
        this._j = 0;
        this._n = n;
        this._o = o;
        this.buttonText = buttonText; //button text
        if (this._o instanceof th_) {
            final th_ th_ = (th_)this._o;
            this.componentWidth = th_.a353(82, this);
            this.componentHeight = th_.a349(this, 8);
        }
    }
    
    //original signature: lm_(final int q, final int v, final int x, final int s, final ca_ o, final pg_ n) {
    //super(n, n2, componentWidth, componentHeight, ca_, null);
    lm_(final int xAxisOffset, final int yAxisOffset, final int componentWidth, final int componentHeight,
    		final ca_ o, final pg_ n) {
        this._A = 0;
        this._j = 0;
        this.componentHeight = componentHeight;
        this.componentWidth = componentWidth;
        this._o = o;
        this._n = n;
        this.yAxisOffset = yAxisOffset;
        this.xAxisOffset = xAxisOffset;
    }
    
    static {
        lm_.dryad = "Dryad";
        lm_._l = new byte[50][];
        lm_.create_password_confirm_tooltip = "Type your password again to make sure it's correct";
        lm_._m = new int[8192];
    }
}
