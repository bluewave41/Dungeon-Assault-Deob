import java.io.*;

final class wl_ extends IOException
{
	//original name: _d
    static Graphic stat_dodge;
    static int[] _e;
    static int _f;
    //original name: _c
    static String[] tutorial_death;
    static md_ _a;
    //original name: _b
    static String text_acv_habit;
    
    public static void a150(final int n) {
        wl_.text_acv_habit = null;
        wl_._e = null;
        wl_.tutorial_death = null;
        if (n <= 68) {
            a150(-114);
        }
        wl_.stat_dodge = null;
        wl_._a = null;
    }
    
    wl_(final String s) {
        super(s);
    }
    
    static {
        wl_.tutorial_death = new String[] { "Death", "<%highlight>Your raider has perished!</col> Some more advanced traps and monsters, such as <%lastroom>, as well as the dragon in the hoard room, are capable of killing raiders outright. You will need to hire a new raider." };
        wl_.text_acv_habit = "You must raid by <%0> to preserve your streak which started on <%1>";
        wl_._f = -1;
        wl_._a = new md_();
    }
}
