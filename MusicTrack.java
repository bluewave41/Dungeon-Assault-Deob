//original name: wh_
final class MusicTrack
{
	//original name: _c
    static String text_dungeon_builder_hint;
    //original name: _g
    static ph_ cracked_bar_endcap;
    static boolean _d;
    //original name: _e
    static long time;
    static int _a;
    vh_ _b;
    int _f;
    
    static final void a150() {
        if (null != ub_._n) {
            ub_._n.c797();
        }
        if (null != hm_._n) {
            hm_._n.c797();
        }
    }
    
    public static void b150() {
        MusicTrack.text_dungeon_builder_hint = null;
        MusicTrack.cracked_bar_endcap = null;
    }
    
    MusicTrack(final vh_ b, final int f) {
        this._f = f;
        this._b = b;
    }
    
    static final FontStyle a804(final byte[] array) {
        if (array == null) {
            return null;
        }
        final FontStyle gp_ = new FontStyle(array, hg_._t, fe_._g, jc_._f, jn_._k, ub_._q);
        sb_.a150();
        return gp_;
    }
    
    static {
        MusicTrack._a = 96;
        MusicTrack.text_dungeon_builder_hint = "Select rooms to place from the panel on the left";
    }
}
