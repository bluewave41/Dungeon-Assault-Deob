final class jd_ extends ne_
{
    static double _j;
    int _k;
    int _m;
    static boolean _l;
    //original name: _o
    static MusicTrack da_intro;
    //original name: _n
    static String desc_dryad;
    //original name: _i
    static String text_hint_ability_glamour;
    
    static final void b487() {
        if (ql_._d <= 32) {
            um_.a430(0);
        }
        else {
            int n = ql_._d % 32;
            if (n == 0) {
                n = 32;
            }
            um_.a430(-n + ql_._d);
        }
    }
    
    private jd_() throws Throwable {
        throw new Error();
    }
    
    public static void a150(final int n) {
        jd_.da_intro = null;
        jd_.text_hint_ability_glamour = null;
        jd_.desc_dryad = null;
        if (n != 1) {
            a150(-38);
        }
    }
    
    static {
        jd_._l = false;
        jd_._j = Math.atan2(1.0, 0.0);
        jd_.desc_dryad = "Dryads are tree nymphs, specifically of oak trees; these creatures of trees and wood can move swiftly and unnoticed through dungeons.";
        jd_.text_hint_ability_glamour = "Select a raider to cast a Glamour upon";
    }
}
