final class fn_ extends ne_
{
    int _n;
    int _r;
    //original name: _j
    static String desc_nails;
    int[] _p;
    //original name: _o
    static Graphic piece_minotaur;
    //original name: _q
    static String text_acv_riches;
    int _k;
    int _s;
    int _m;
    int _i;
    int _l;
    
    static final Graphic a316() {
        final Graphic graphic = new Graphic(11, 11);
        jh_.a303(graphic);
        for (int n = 0; 6 > n; ++n) {
            gf_.c115(n, -n + 5, 2 * n + 1, 65793);
        }
        for (int i = 6; i < 11; ++i) {
            gf_.c115(i, 4, 3, 65793);
        }
        jh_.b797();
        return graphic;
    }
    
    //original signature: public static void d150(final int n) {
    public static void d150() {
        fn_.text_acv_riches = null;
        fn_.desc_nails = null;
        fn_.piece_minotaur = null;
    }
    
    private fn_() throws Throwable {
        throw new Error();
    }
    
    static {
        fn_.desc_nails = "The path between the nails on the floor of this room is difficult and treacherous. A misstep could cause severe injury.<br><br>Trapped raiders permanently lose 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        fn_.text_acv_riches = "You have earned a total of <%0> Treasure";
    }
}
