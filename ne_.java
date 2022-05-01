class ne_
{
    ne_ _a;
    static hh_ _b;
    ne_ _e;
    static long _g;
    //original name: _c
    static FontStyle roman20;
    long _h;
    //original name: _f
    static String[] ability_pitimmunity_brief;
    static Graphic _d;
    
    final void a487(final boolean b) {
        if (this._a == null) {
            return;
        }
        this._a._e = this._e;
        this._e._a = this._a;
        this._e = null;
        this._a = null;
        if (b) {
            ne_._d = null;
        }
    }
    
    final boolean c154(final int n) {
        if (null != this._a) {
            if (n >= -15) {
                ne_.ability_pitimmunity_brief = null;
            }
            return true;
        }
        return false;
    }
    
    public static void b150() {
        ne_._b = null;
        ne_._d = null;
        ne_.roman20 = null;
        ne_.ability_pitimmunity_brief = null;
    }
    
    public ne_() {}
    
    static {
        ne_.ability_pitimmunity_brief = new String[] { "Pit Immunity", "Success against all pit traps." };
    }
}
