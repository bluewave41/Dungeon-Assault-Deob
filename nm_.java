final class nm_ extends sj_ implements vg_
{
    private GUIButton _kb;
    //original name: _lb
    static String desc_goblin_runt;
    //original name: _jb
    static String text_spendable_renown;
    static int[] _ib;
    //original name: _mb
    static String hidden_nails;
    
    @Override
    public final void a475(final GUIButton ck_, final byte b, final int n, final int n2, final int n3) {
        if (b != 98) {
            nm_.hidden_nails = null;
        }
        if (ck_ == this._kb) {
            this.m150(110);
        }
    }
    
    private final void m150(final int n) {
        if (!super._T) {
            return;
        }
        super._T = false;
    }
    
    private final GUIButton a389(final int n, final pg_ pg_, final String s) {
        final GUIButton ck_ = new GUIButton(s, pg_);
        ck_._o = new na_();
        final int n2 = super.componentHeight - 6;
        if (n != 26414) {
            this._kb = null;
        }
        super.componentHeight += 38;
        ck_.b050(0, super.componentWidth - 14 - 16, n2, 15, 30);
        this.b485(ck_);
        this.f150(12591);
        return ck_;
    }
    
    nm_(final ji_ ji_, final r_ r_) {
        super(ji_, 200, 150);
        String s = null;
        if (r_ != gl_._Gb) {
            if (r_ != of_._g) {
                if (r_ == mc_._x) {
                    super.componentHeight += 30;
                    s = id_.fs_timeout;
                }
            }
            else {
                s = jg_.fs_focus;
                super.componentHeight += 10;
                if (Animation.b154()) {
                    super.componentHeight += 20;
                    s = ti_.fs_focus_or_resolution;
                }
            }
        }
        else {
            s = oh_.fs_unavailable_try_signed_applet;
        }
        final lm_ lm_ = new lm_(s, null);
        lm_.componentHeight = 80;
        lm_.componentWidth = super.componentWidth;
        lm_.yAxisOffset = 50;
        lm_.xAxisOffset = 0;
        lm_._o = new hh_(ta_._e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        this.b485(lm_);
        this._kb = this.a389(26414, this, sp_.fs_button_close);
    }
    
    public static void n150() {
        nm_.desc_goblin_runt = null;
        nm_.text_spendable_renown = null;
        nm_._ib = null;
        nm_.hidden_nails = null;
    }
    
    static {
        nm_.desc_goblin_runt = "A pathetic wretch; the runt's sole redeeming feature is its expendability, so common is its kind in the realm of Dungaria that it can be easily replaced.";
        nm_.text_spendable_renown = "Treasure: ";
        nm_.hidden_nails = "Hidden Nails";
    }
}
