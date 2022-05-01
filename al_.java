final class al_ extends ne_
{
    int _l;
    static Graphic _j;
    //original name: _o
    static DungeonPath dungeonPath;
    int _p;
    //original name: _n
    static String text_party_defeated;
    //original name: _i
    static String[] ability_thief_brief;
    int _k;
    //original name: _m
    static String text_raider_dodges;
    
    static final Class a078(final String s) throws ClassNotFoundException {
        if (s.equals("B")) {
            return Byte.TYPE;
        }
        if (s.equals("I")) {
            return Integer.TYPE;
        }
        if (s.equals("S")) {
            return Short.TYPE;
        }
        if (s.equals("J")) {
            return Long.TYPE;
        }
        if (s.equals("Z")) {
            return Boolean.TYPE;
        }
        if (s.equals("F")) {
            return Float.TYPE;
        }
        if (s.equals("D")) {
            return Double.TYPE;
        }
        if (!s.equals("C")) {
            return Class.forName(s);
        }
        return Character.TYPE;
    }
    
    static final void a695(final int n, final int n2, final Trap ac_, final int n3) {
        wa_.a374(ac_.attack, -1, n3, gd_.stat_attack, n, n2);
        wa_.a374(ac_.defence, -1, n3, jj_.stat_defence, 40 + n, n2);
        wa_.a374(ac_.snare, -1, n3, tb_.stat_snare, n, 18 + n2);
        wa_.a374(ac_.detect, -1, n3, kd_.stat_detect, n + 40, 18 + n2);
    }
    
    public static void a423() {
        al_.text_party_defeated = null;
        al_._j = null;
        al_.dungeonPath = null;
        al_.ability_thief_brief = null;
        al_.text_raider_dodges = null;
    }
    
    private al_() throws Throwable {
        throw new Error();
    }
    
    static {
        al_.dungeonPath = new DungeonPath(49);
        al_.text_party_defeated = "Your party has been defeated";
        al_.ability_thief_brief = new String[] { "Thievery", "Reduced chance of waking dragon" };
        al_.text_raider_dodges = "Raider dodges.";
    }
}
