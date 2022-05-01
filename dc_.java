final class dc_
{
    int _b;
    int _P;
    int[][] _B;
    static int _l;
    int _u;
    int _a;
    byte[] _d;
    int[] _w;
    int _M;
    int _t;
    byte[] _g;
    byte[] _G;
    byte[][] _r;
    //original name: _q
    static AmbientAudioTrack[] da_door_open;
    int[] _s;
    //original name: _k
    static String on;
    int[][] _f;
    byte[] _C;
    int _o;
    static int[] _p;
    int _h;
    byte _O;
    int _A;
    int _N;
    //original name: _x
    static Graphic scrollbar_bottom;
    int _L;
    int _F;
    int _j;
    int[][] _D;
    int[] _i;
    int[] _m;
    byte[] _y;
    boolean[] _E;
    //original name: _e
    static se_ benefits_large_font;
    byte[] _J;
    int _I;
    static int _z;
    int _c;
    //original name: _H
    static String orc_blademaster;
    //original name: _v
    static String cancel;
    boolean[] _n;
    
    public static void a423(final byte b) {
        dc_._p = null;
        dc_.on = null;
        dc_.orc_blademaster = null;
        dc_.da_door_open = null;
        dc_.scrollbar_bottom = null;
        dc_.cancel = null;
        dc_.benefits_large_font = null;
        if (b <= 76) {
            getTitle();
        }
    }
    
    //original signature: static final String a738(final int n) {
    static final String getTitle() {
        if (tc_.playerTitle == null) {
            return "";
        }
        return tc_.playerTitle;
    }
    
    dc_() {
        this._s = new int[256];
        this._f = new int[6][258];
        this._D = new int[6][258];
        this._C = new byte[256];
        this._r = new byte[6][258];
        this._B = new int[6][258];
        this._y = new byte[4096];
        this._h = 0;
        this._a = 0;
        this._g = new byte[18002];
        this._J = new byte[18002];
        this._w = new int[6];
        this._i = new int[257];
        this._m = new int[16];
        this._n = new boolean[16];
        this._E = new boolean[256];
    }
    
    static {
        dc_.on = "ON";
        dc_._p = new int[] { 1, 2, 3, 5, 10, 25 };
        dc_.orc_blademaster = "Orc Blademaster";
        dc_.cancel = "Cancel";
    }
}
