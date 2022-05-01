final class pm_ extends ne_
{
    int _i;
    int _j;
    static ad_ _l;
    //original name: _o
    static String text_exit_without_saving;
    //original name: _k
    static String[] ability_fickle;
    static int _m;
    //original name: _n
    static String text_dodge;
    
    public static void a150() {
        pm_.ability_fickle = null;
        pm_._l = null;
        pm_.text_dodge = null;
        pm_.text_exit_without_saving = null;
    }
    
    static final nl_ a864() {
        try {
            return sk_.class.newInstance();
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    private pm_() throws Throwable {
        throw new Error();
    }
    
    static {
        pm_._l = new ad_(12, 0);
        pm_.ability_fickle = new String[] { "Fickle", "The <%0> will allow himself to be bound only to the greatest souls. Should you prove your inadequacy by failing any raid, he will abandon you and advance the power of chaos with one of your more worthy rivals." };
        pm_.text_dodge = "Dodge";
        pm_.text_exit_without_saving = "Return to the main menu without saving changes";
    }
}
