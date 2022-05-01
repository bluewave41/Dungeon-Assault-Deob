final class wi_ extends sj_
{
    private boolean _sb;
    private String _jb;
    private uc_ _ub;
    private String _ib;
    static rj_ _ob;
    //original name: _mb
    static String entrance;
    //original name: _rb
    static String giant_snake;
    //original name: _nb
    static String text_ability_used;
    static int _kb;
    //original name: _lb
    static String desc_stone_golem;
    //original name: _qb
    static String text_stole_gold;
    private boolean _pb;
    //original name: _tb
    static volatile int mouseX;
    
    static final int c313(final int n, final int n2, final int n3) {
        int n4 = 0;
        if (n2 != 2113632) {
            wi_.mouseX = -43;
        }
        int c = en_._c;
        while (uc_._K.length > n4) {
            final int n5 = dd_._A[n4];
            if (n5 >= 0) {
                final int a218 = GUICheckbox.a218(uc_._K[n4]);
                final int n6 = -(a218 >> 1) + tm_._e;
                final int n7 = c + lc_._j;
                if (ec_.a366(n7, (i_._o << 1) + cd_._e, n3, (an_._w << 1) + a218, -an_._w + n6, n, n2 - 2113557)) {
                    return n5;
                }
                c = n7 + (cd_._e + (lc_._j + (i_._o << 1)));
            }
            else {
                c += gb_._a;
            }
            ++n4;
        }
        return -1;
    }
    
    public static void i423(final byte b) {
        if (b > -44) {
            wi_.giant_snake = null;
        }
        wi_.desc_stone_golem = null;
        wi_.entrance = null;
        wi_.giant_snake = null;
        wi_.text_stole_gold = null;
        wi_._ob = null;
        wi_.text_ability_used = null;
    }
    
    @Override
    final void a663(final int n, final int n2, final boolean b) {
        super.a663(n, n2, b);
        hc_._f.c191(this._jb, n2 + (super.componentWidth >> 1), n + 103, 16777215, -1);
        if (null != this._ib) {
            gf_.b115(20 + n2, 120 + (n - 7), 260, 8421504);
            hc_._f.a385(this._ib, n2 + 20, n + 128, 260, 100, 16777215, -1, 1, 0, hc_._f._H);
        }
    }
    
    final void j423(final byte b) {
        if (b != -115) {
            i423((byte)54);
        }
        this._pb = true;
        this._ub._R = false;
    }
    
    wi_(final ji_ ji_, final String ib) {
        super(ji_, 300, 120);
        this._ib = ib;
        if (this._ib != null) {
            this.b326(120, 150 + hc_._f.a490(this._ib, 260, hc_._f._H), 300);
        }
        this._ub = new uc_(13, 50, 274, 30, 15, 2113632, 4210752);
        this._pb = false;
        this._sb = false;
        this._ub._R = true;
        this.b485(this._ub);
    }
    
    final void a189(final boolean sb, final String jb, final float n, final byte b) {
        if (!sb != !this._sb) {
            if (!(this._sb = sb)) {
                this._ub.b789(4210752, (byte)94, 2113632);
                if (this._pb) {
                    this._ub._R = false;
                }
            }
            else {
                this._ub.b789(4210752, (byte)94, 8405024);
                this._ub._R = true;
            }
        }
        this._jb = jb;
        this._ub._S = (int)(n / 100.0f * 65536.0f);
    }
    
    static {
        wi_.entrance = "Entrance";
        wi_.text_ability_used = "Ability used";
        wi_.giant_snake = "Giant Snake";
        wi_.desc_stone_golem = "A humanoid construct made of stone; its one instruction is to crush the bodies of any raiders that cross its path.<br><br>This monster requires 2 successful strikes from the same raider to defeat.";
        wi_.text_stole_gold = "You successfully stole <%0> gold!";
        wi_.mouseX = -1;
    }
}
