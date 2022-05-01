final class pp_ extends rj_
{
    static md_ _K;
    static String[] _F;
    //original name: _I
    static String goback;
    private Graphic _B;
    private Graphic _z;
    boolean _D;
    static int _J;
    private Graphic _C;
    //original name: _E
    static String[] tutorial_rooms1;
    private Graphic _A;
    private boolean _G;
    
    final void a994(final Graphic cn_, final Graphic c, final Graphic z, final Graphic a, final int n) {
        this.a238(-66, cn_);
        this._C = c;
        if (n <= 15) {
            pp_.tutorial_rooms1 = null;
        }
        this._A = a;
        this._z = z;
    }
    
    @Override
    final void b326(final int n, final int n2, final int n3) {
        if (n2 != 8187) {
            return;
        }
        if (this._D) {
            if (super.isActive) {
                int n4 = ((this != wi_._ob) ? super._p : mo_._a) - super._m >> 2;
                if (n4 > 64) {
                    n4 = 64;
                }
                final int n5 = n4 + (super._p - mo_._a);
                if (this._G || this == wi_._ob || n5 > 0) {
                    int n6;
                    if (wi_._ob == this) {
                        n6 = n4;
                        this._z.drawImage(super._t + n, n3 + super._i);
                    }
                    else {
                        this._B.drawImage(super._t + n, n3 + super._i);
                        n6 = n5;
                        this._z.d326(n + super._t, n3 + super._i, 4 * n6);
                    }
                    int n7 = (int)((te_.c503(mo_._a, this.hashCode(), 0.015625) + 2.0) * n6);
                    if (0 > n7) {
                        n7 = 0;
                    }
                    this._C.b326(super._t + n, super._i + n3, n7);
                }
                else {
                    this._B.drawImage(n + super._t, n3 + super._i);
                }
            }
            else {
                this._A.drawImage(n + super._t, super._i + n3);
            }
        }
    }
    
    private pp_(final Graphic b, final Graphic a, final Graphic z, final Graphic c, final int n, final int n2, final int n3) {
        super(n, n2, b.imageWidth, b.imageHeight, n3);
        this._D = true;
        this._z = z;
        this._A = a;
        this._B = b;
        this._C = c;
    }
    
    @Override
    final void a183(final boolean b, final int n, final int n2) {
        if (b) {
            this._C = null;
        }
        throw new RuntimeException("Unsupported");
    }
    
    pp_(final Graphic cn_, final Graphic cn_2, final Graphic cn_3, final Graphic cn_4, final int n, final int n2) {
        this(cn_, cn_2, cn_3, cn_4, n, n2, 0);
    }
    
    private final void a238(final int n, final Graphic cn_) {
        this._z = cn_;
        this._B = cn_;
        if (n != -66) {
            this._D = true;
        }
        super.a183(false, this._B.imageWidth, this._B.imageHeight);
    }
    
    public static void e150() {
        pp_._F = null;
        pp_.tutorial_rooms1 = null;
        pp_._K = null;
        pp_.goback = null;
    }
    
    //original signature: static final boolean a331(final char c) {
    static final boolean isCharacterOrDigit(final char c) {
        return ('0' <= c && c <= '9') || ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z');
    }
    
    static {
        pp_._F = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        pp_.goback = "Go Back";
        pp_.tutorial_rooms1 = new String[] { "Rooms", "Rooms you have not yet visited are dark. Your raiders will light torches in each new room as they enter." };
        pp_._J = -1;
    }
}
