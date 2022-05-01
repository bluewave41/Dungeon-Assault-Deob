final class jg_
{
    static ef_ _a;
    //original name: _d
    static String fs_button_cancel;
    static Graphic[] _c;
    //original name: _b
    static String fs_focus;
    //original name: _e
    static String discard;
    
    static final String a430(final CharSequence charSequence) {
        return ug_.a776(charSequence);
    }
    
    static final int a080(final int n, int n2) {
        n2 &= n;
        if (n2 < 4096) {
            return (n2 < 2048) ? jb_._Tb[2048 - n2] : (-jb_._Tb[n2 - 2048]);
        }
        return (n2 >= 6144) ? jb_._Tb[n2 - 6144] : (-jb_._Tb[-n2 + 6144]);
    }
    
    static final ba_[] b428() {
        return new ba_[] { ba_._e, gg_._c, rl_._j };
    }
    
    static final boolean a643(final int n, final int n2, final int n3, final int n4) {
        return n <= hj_.mouseX && hj_.mouseX < n3 + n && n4 <= Animation.mouseY && n2 + n4 > Animation.mouseY;
    }
    
    public static void a423() {
        jg_.fs_focus = null;
        jg_.fs_button_cancel = null;
        jg_._c = null;
        jg_.discard = null;
        jg_._a = null;
    }
    
    static {
        jg_._a = new ef_();
        jg_.fs_button_cancel = "Cancel";
        jg_.fs_focus = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        jg_.discard = "Discard";
    }
}
