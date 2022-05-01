final class ao_ extends ne_
{
    int _j;
    static int _k;
    long _l;
    //original name: _n
    static Graphic scroll_top;
    //original name: _i
    static String[] ability_pitimmunity;
    static int _o;
    byte[] _m;
    
    public static void d150() {
        ao_.scroll_top = null;
        ao_.ability_pitimmunity = null;
    }
    
    //never called
    ao_(final long l, final int j, final byte[] m) {
        this._m = m;
        this._l = l;
        this._j = j;
    }
    
    static final boolean a427() {
        return dk_._c < 20 || !vk_.a154();
    }
    
    static {
        ao_.ability_pitimmunity = new String[] { "Pit Immunity", "Such is the dexterity of the <%0> that he can traverse any pit without danger of failure." };
    }
}
