final class t_
{
    static ec_ _d;
    static int _a;
    //original name: _b
    static String text_initiate_raid;
    //original name: _c
    static String text_heal_tooltip;
    
    static final void a124(final int n, final MusicTrack wh_, final boolean b) {
        if (wh_ != null) {
            lo_.a789(86, b, wh_._b, n, wh_._f);
            return;
        }
        lo_.a789(86, b, null, n, 0);
    }
    
    static final void a540(final boolean b, final int n) {
        if (n != 0) {
            a540(true, 23);
        }
        na_.a520(b, n + 2591221, false);
    }
    
    public static void a150() {
        t_._d = null;
        t_.text_heal_tooltip = null;
        t_.text_initiate_raid = null;
    }
    
    static {
        t_.text_initiate_raid = "Dragons and Raids";
        t_.text_heal_tooltip = "Heal this <%0>, restoring their abilities to normal, at a cost of <%1> Treasure.";
    }
}
