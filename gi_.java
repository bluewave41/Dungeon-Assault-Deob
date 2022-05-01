import java.awt.*;

final class gi_ extends ii_ implements vg_
{
    private mg_ _N;
    static int[] _L;
    //original name: _K
    static String[] ability_scout_brief;
    //original name: _P
    static String corrosive_slime;
    //original name _M
    private String[] alternateNames;
    //original name: _R
    static Canvas canvas;
    private GUIButton[] _O;
    //original name: _Q
    static String text_advance_minitip;
    static uo_ _S;
    
    //alternate names
    final void a144(final byte b, final String[] array) {
        super._B.b150(-4);
        if (array == null || array.length == 0) {
            this.alternateNames = null;
            return;
        }
        final int numberOfNames = array.length;
        this.alternateNames = new String[numberOfNames];
        for (int j = 0; j < numberOfNames; ++j) {
            this.alternateNames[j] = kl_.returnParameter(array[j]).replace(' ', ' ');
        }
        final oa_ oa_ = new oa_(lp_._C, 0, 1);
        this._O = new GUIButton[numberOfNames + 1];
        for (int n = 0; numberOfNames > n; ++n) {
            this._O[n] = new GUIButton(this.alternateNames[n], this);
            this._O[n]._o = oa_;
            this._O[n].tooltip = ln_.create_select_alternative;
            this._O[n].b050(0, 80, n * 16 + 20, 0, 15);
            this.b485(this._O[n]);
        }
        this._O[numberOfNames] = new GUIButton(li_.create_more_suggestions, this);
        this._O[numberOfNames]._o = oa_;
        this._O[numberOfNames].b050(0, 100, 16 + (16 * numberOfNames + 20), 0, 15);
        this.b485(this._O[numberOfNames]);
    }
    
    public static void f423() {
        gi_.ability_scout_brief = null;
        gi_._S = null;
        gi_.corrosive_slime = null;
        gi_.canvas = null;
        gi_.text_advance_minitip = null;
        gi_._L = null;
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        super.a115(n, n2, n3, n4);
        if (n == 0) {
            final se_ c = lp_._C;
            if (null != this.alternateNames) {
                c.a385(sc_.create_suggestions, n2 + super.xAxisOffset, n4 + super.yAxisOffset, super.componentWidth, 20, 16777215, -1, 0, 0, c._E + c._H);
            }
        }
    }
    
    @Override
    public final void a475(final GUIButton ck_, final byte b, final int n, final int n2, final int n3) {
        if (b != 98) {
            this._O = null;
        }
        for (int n4 = 0; this.alternateNames.length > n4; ++n4) {
            if (ck_ == this._O[n4]) {
                this._N.a407((byte)(-67), this.alternateNames[n4]);
            }
        }
        if (ck_ == this._O[this.alternateNames.length]) {
            this._N.a150(125);
        }
    }
    
    gi_(final mg_ n) {
        super(0, 0, 0, 0, null);
        this._N = n;
    }
    
    @Override
    final boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (super.a401(lm_, c, n, (byte)125)) {
            return true;
        }
        if (98 == n) {
            return this.a059(lm_);
        }
        if (99 == n) {
            return this.a489((byte)(-5), lm_);
        }
        return b < 55 && false;
    }
    
    static {
        gi_.corrosive_slime = "Corrosive Slime";
        gi_.ability_scout_brief = new String[] { "Scout", "Scout next room. (Single use)" };
        gi_._L = new int[8192];
        gi_.text_advance_minitip = "<col=2E5D17>Advance</col> - Engage monster";
    }
}
