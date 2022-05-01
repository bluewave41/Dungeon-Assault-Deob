final class ie_ extends ne_
{
    gd_ _m;
    static int[] _k;
    static Graphic _l;
    //original name: _i
    static Graphic piece_enchantress;
    //original name: _n
    static String unknown;
    //original name: _j
    static String[] instructions_subtitles_text;
    
    ie_(final gd_ m) {
        this._m = m;
    }
    
    static final void a150() {
        i_ i_ = (i_)cd_._g.c024(0);
        if (null == i_) {
            i_ = new i_();
        }
        i_.a211(gf_._c, gf_._e, gf_._j, gf_._f, gf_._h, gf_._i, false, gf_._b);
        id_._e.a865(i_);
    }
    
    public static void d150() {
        ie_.instructions_subtitles_text = null;
        ie_.piece_enchantress = null;
        ie_.unknown = null;
        ie_._k = null;
        ie_._l = null;
    }
    
    static {
        ie_._k = new int[8192];
        ie_._l = new Graphic(270, 70);
        ie_.unknown = "Unknown";
        ie_.instructions_subtitles_text = new String[] { "Introduction", "Story", "Renown", "Raiders", "Dungeon Rooms", "Finding Dungeons", "Raiding Dungeons", "Building Dungeons" };
    }
}
