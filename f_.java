final class f_
{
    static Graphic _a;
    //original name: _c
    static String text_dungeon_builder;
    //original name: _f
    static Graphic piece_banshee;
    //original name: _e
    static String desc_rabid_wolf;
    //original name: _b
    static String achievement_title;
    //original name: _d
    static boolean isSimpleMode;
    
    //original signature: public static void a487(final boolean b) {
    public static void a487() {
        f_.piece_banshee = null;
        f_.desc_rabid_wolf = null;
        f_.achievement_title = null;
        f_._a = null;
        f_.text_dungeon_builder = null;
    }
    
    static final boolean a427() {
        return !im_._b.getH();
    }
    
    //original name: static final int a313(final int n, final int n2, final int n3) {
    static final int a313(final int n, final int n2) {
        if (null == nl_.benefits_button_frame) {
            return -1;
        }
        if (wk_._h <= n && n < wk_._h + nl_.benefits_button_frame.imageWidth && n2 >= fo_._b && fo_._b + nl_.benefits_button_frame.imageHeight > n2) {
            return 0;
        }
        if (n >= rm_._T && n < nl_.benefits_button_frame.imageWidth + rm_._T && n2 >= mi_._f && nl_.benefits_button_frame.imageHeight + mi_._f > n2) {
            return 1;
        }
        return -1;
    }
    
    static final void a366(final int n) {
        for (jd_ jd_ = (jd_)ta_._f.e024(); jd_ != null; jd_ = (jd_)ta_._f.a024(4)) {
            o_.a218(n, jd_);
        }
    }
    
    static {
        f_.achievement_title = "<%0>: <col=<%1>><%2></col>";
        f_.text_dungeon_builder = "DUNGEON BUILDER";
        f_.desc_rabid_wolf = "A large, snarling wolf; it's grey fur is matted with blood.<br><br>If this monster detects a raider, its howl will alert monsters in adjacent rooms, increasing their <%detect> by 2.";
    }
}
