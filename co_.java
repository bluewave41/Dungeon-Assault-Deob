final class co_ extends vf_
{
    byte[] _D;
    ln_ _K;
    static md_ _I;
    int _L;
    static int _H;
    static vj_ _G;
    //original name: _E
    static String text_status_postcombat;
    //original name: _C
    static String username;
    static Graphic _F;
    //original name: _J
    static String[] tutorial_raiding2;
    
    //original name: static final String e983() {
    static final String e983() {
        if (ol_._i == ql_._f) {
            return he_._m;
        }
        if (!im_._b.getH()) {
            return im_._b.c738();
        }
        if (wd_._d == ql_._f) {
            return im_._b.c738();
        }
        return co_.username;
    }
    
    @Override
    final byte[] b318(final boolean b) {
        if (!b) {
            co_.text_status_postcombat = null;
        }
        if (super._v) {
            throw new RuntimeException();
        }
        return this._D;
    }
    
    public static void e150() {
        co_._I = null;
        co_.tutorial_raiding2 = null;
        co_._G = null;
        co_.username = null;
        co_._F = null;
        co_.text_status_postcombat = null;
    }
    
    @Override
    final int d410(final byte b) {
        if (b <= 98) {
            return -12;
        }
        if (!super._v) {
            return 100;
        }
        return 0;
    }
    
    static {
        co_._I = new md_();
        co_.text_status_postcombat = "Use postcombat abilities.";
        co_._G = null;
        co_.tutorial_raiding2 = new String[] { "Raiders", "You control a party of between one and four <%raiders>, displayed at the bottom-left of the screen.<br><br><%command>Select one of these raiders now.</col>" };
    }
}
