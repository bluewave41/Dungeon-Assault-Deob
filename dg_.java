final class dg_ extends da_
{
    static int[][] _L;
    private int _J;
    private int _I;
    //original name: _G
    static String text_charging_hint_x;
    //original name: _O
    static String[] tutorial_construction2;
    private int _F;
    private String _K;
    private boolean _N;
    //original name: _P
    static String loading_music;
    private se_ _M;
    
    //register screen
    dg_(final int n, final int n2, final int n3, final int n4, final lm_ d, final boolean n5, final int j, final int f, final se_ m, final int i, final String k) {
        super(n, n2, n3, n4, null, null);
        this._N = n5;
        super._D = d;
        this._I = i;
        this._J = j;
        this._M = m;
        this._K = k;
        this._F = f;
        int n6 = this._M.a490(k, this._J - this._F, this._M._H) + this._F * 2;
        if (n6 <= n4) {
            n6 = n4;
        }
        else {
            this.b050(0, n3, n2, n, n6);
        }
        super._D.b050(0, -this._J + (n3 - this._F * 3), this._F + (n6 - n4 >> 1), this._N ? 0 : (this._J + this._F * 2), n4 - 2 * this._F);
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n2 + super.xAxisOffset;
        final int n6 = super.yAxisOffset + n4;
        super.a115(n, n2, 0, n4);
        if (n != n3) {
            return;
        }
        this._M.a385(this._K, this._F + ((this._N ? (-(2 * this._F) + (-this._J + super.componentWidth)) : 0) + n5), n6 + this._F, -this._F + this._J, super.componentHeight - this._F * 2, this._I, -1, this._N ? 0 : 2, 1, this._M._H);
    }
    
    @Override
    final String c983(final byte b) {
        final boolean u = super._D._u;
        super._D._u = super._u;
        final String c983 = super._D.c983((byte)25);
        super._D._u = u;
        if (b < 3) {
            this.a115(127, 20, 104, -29);
        }
        return c983;
    }
    
    public static void b487() {
        dg_.tutorial_construction2 = null;
        dg_.text_charging_hint_x = null;
        dg_.loading_music = null;
        dg_._L = null;
    }
    
    static {
        dg_.tutorial_construction2 = new String[] { null, "The rooms you can place are shown in the panel on the left. <%highlight>More types of room will become available as you gain Renown</col>. Click a room to select it and review its statistics and description. You can then place the room by <col=FF0000>left-clicking somewhere in your dungeon</col>. Placing a room on top of an existing one will cause it to be replaced - you will receive some of the room's original cost in return.<br><br><%command>Select a room from the left and place it in your dungeon.</col>" };
        dg_.loading_music = "Loading music";
        dg_.text_charging_hint_x = "You are charging <%0> Orbs of Mastery!";
    }
}
