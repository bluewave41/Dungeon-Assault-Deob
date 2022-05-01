import java.awt.*;

final class ia_ extends ii_ implements vg_
{
	//original name: _T
    private GUIButton justPlayButton;
    static boolean _O;
    static int[] _S;
    static int _X;
    //original name: _N
    static String ability_ferocity_message;
    static nh_ _U;
    //original name: _R
    static Graphic piece_beastman;
    static nh_ _W;
    //original name: _Z
    private GUIButton goBackButton;
    static tk_ _K;
    //original name: _Y
    static String text_raid;
    //original name: _Q
    static Graphic benefits_headline;
    static int _M;
    static int[] _P;
    //original name: _V
    private GUIButton createAnAccountButton;
    
    public ia_() {
        super(0, 0, 476, 225, null);
        this.createAnAccountButton = new GUIButton(CacheIndex.create_createanaccount, null);
        this.goBackButton = new GUIButton(pp_.goback, null);
        this.justPlayButton = new GUIButton(kd_.justplay, null);
        final na_ o = new na_();
        this.createAnAccountButton._o = o;
        this.goBackButton._o = o;
        this.justPlayButton._o = o;
        final int n = 4;
        final int n2 = 326;
        final int n3 = -n + n2 >> 1;
        this.goBackButton.b050(0, n3, -n + (super.componentHeight - 48), -n2 + super.componentWidth >> 1, 30);
        this.justPlayButton.b050(0, n3, super.componentHeight - n - 48, (super.componentWidth - n2 >> 1) - (-n3 - n), 30);
        this.createAnAccountButton.b050(0, n2, super.componentHeight - 78 - 2 * n, super.componentWidth - n2 >> 1, 30);
        this.goBackButton._n = this;
        this.createAnAccountButton._n = this;
        this.justPlayButton._n = this;
        this.createAnAccountButton.tooltip = hj_.login_create_tooltip;
        this.justPlayButton.tooltip = oh_.login_justplay_tooltip;
        this.b485(this.goBackButton);
        this.b485(this.createAnAccountButton);
        this.b485(this.justPlayButton);
    }
    
    @Override
    public final void a475(final GUIButton ck_, final byte b, final int n, final int n2, final int n3) {
        if (b != 98) {
            this.a401(null, '\uff80', -77, (byte)92);
        }
        if (this.goBackButton == ck_) {
            rc_.b150(112);
        }
        else if (this.createAnAccountButton == ck_) {
            nh_.c487();
        }
        else if (ck_ == this.justPlayButton) {
            kd_.a150(b ^ 0x66);
        }
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        lp_._C.a385(he_.create_welcome, n2 + super.xAxisOffset + 20, 20 + (n4 + super.yAxisOffset), super.componentWidth - 40, super.componentHeight - 50, 16777215, -1, 1, 0, lp_._C._H);
        super.a115(n, n2, n3, n4);
    }
    
    //original signature: static final cn_ a059(final String s, final int n, final String s2, final int n2, final int n3, final String s3, final nh_ nh_) {
    static final Graphic a059(final String unitName, final int n, final String animationName, final int n3, final String s3, final nh_ nh_) {
        final byte[] a640 = pi_.loadAsset(animationName, s3, unitName, n3, n, nh_);
        if (null != a640) {
            final Graphic cn_ = new Graphic(a640, fi_.getCanvas());
            for (int n4 = 0; cn_._B.length > n4; ++n4) {
                cn_._B[n4] = nb_.and(cn_._B[n4], 16777215);
            }
            return cn_;
        }
        return null;
    }
    
    //original signature: public static void b487(final boolean b) {
    public static void b487() {
        ia_.text_raid = null;
        ia_._W = null;
        ia_._K = null;
        ia_.ability_ferocity_message = null;
        ia_._S = null;
        ia_._U = null;
        ia_.benefits_headline = null;
        ia_._P = null;
        ia_.piece_beastman = null;
    }
    
    static final String a282(final int i, final se_ se_, String substring) {
        if (i >= se_.b926(substring)) {
            return substring;
        }
        final String s = "...";
        do {
            substring = substring.substring(0, substring.length() - 1);
        } while (i < se_.b926(substring + s));
        return substring + s;
    }
    
    @Override
    final boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (super.a401(lm_, c, n, (byte)126)) {
            return true;
        }
        if (98 != n) {
            if (b < 55) {
                ia_._U = null;
            }
            return 99 == n && this.a489((byte)(-5), lm_);
        }
        return this.a059(lm_);
    }
    
    static {
        ia_._S = new int[4];
        ia_.text_raid = "RAID";
        ia_._O = false;
        ia_.ability_ferocity_message = "The <%0> lets loose his first attack with ferocious rage!";
        ia_._M = 0;
        ia_._X = 0;
        ia_._P = new int[8];
        final int[] p = ia_._P;
        p[0] = mp_.or(p[0], 131072);
        final int[] p2 = ia_._P;
        p2[1] = mp_.or(p2[1], 8);
    }
}
