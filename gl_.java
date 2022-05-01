final class gl_ extends ok_
{
	//original name: _Jb
    static String cont;
    //original name: _Ib
    static MusicTrack da_stressing_music;
    static r_ _Gb;
    //original name: _Kb
    static String[] ability_glamour_brief;
    //original name: _Hb
    static String text_incapacitated;
    //original name: _Lb
    static boolean topDownOrIsometric;
    
    static final boolean a014(String a955, final int n, final String s) {
        if (n != 0) {
            return false;
        }
        a955 = tg_.replace('_', a955, "");
        final String a956 = sh_.reverseString(s);
        return a955.indexOf(s) != -1 || a955.indexOf(a956) != -1;
    }
    
    public static void c423() {
        gl_.cont = null;
        gl_.da_stressing_music = null;
        gl_._Gb = null;
        gl_.text_incapacitated = null;
        gl_.ability_glamour_brief = null;
    }
    
    private gl_() throws Throwable {
        super(0L, null);
        throw new Error();
    }
    
    static {
        gl_.cont = "Continue";
        gl_.topDownOrIsometric = false;
        gl_.text_incapacitated = "Incapacitated";
        gl_.ability_glamour_brief = new String[] { "Glamour", "Monster <%attack> and <%defence> halved in the next room. (Single use)" };
        gl_._Gb = new r_();
    }
}
