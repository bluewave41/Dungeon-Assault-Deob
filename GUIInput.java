//original name: _uh_
final class GUIInput extends rm_ implements qn_
{
    private dp_ _W;
    private int _U;
    //original name: _V
    static String text_no_defences;
    
    public static void i423() {
        GUIInput.text_no_defences = null;
    }
    
    @Override
    final void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        super.a319(n, n2, lm_, b);
        this._U = -super.xAxisOffset + hj_.mouseX - n;
        if (!b) {
            this.a981(null);
        }
    }
    
    //original signature: final void a981(final dp_ w, final int n) {
    final void a981(final dp_ w) {
        this._W = w;
    }
    
    @Override
    public final dp_ a293(final int n) {
        if (n >= -74) {
            GUIInput.text_no_defences = null;
        }
        return this._W;
    }
    
    @Override
    final void n150(final int n) {
        super.n150(n);
        if (null != this._W) {
            this._W.b150(2899);
        }
    }
    
    @Override
    final String c983(final byte b) {
        if (b < 3) {
            this.n150(111);
        }
        if (super._u && super.tooltip != null) {
            vj_.a679(Animation.mouseY, -this._U + (super.componentWidth + hj_.mouseX));
            return super.tooltip;
        }
        return null;
    }
    
    //original signature: uh_(final String s, final pg_ pg_, final int n) {
    GUIInput(final String text, final pg_ pg_, final int maxLength) {
        super(text, pg_, maxLength);
    }
    
    static {
        GUIInput.text_no_defences = "You have not yet been raided.";
    }
}
