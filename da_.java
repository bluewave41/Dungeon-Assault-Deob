import java.util.*;

abstract class da_ extends lm_ implements aa_
{
    lm_ _D;
    static int _C;
    static int _B;
    //original name: _E
    static String orb_preservation_desc;
    
    @Override
    void a115(final int n, final int n2, final int n3, final int n4) {
        if (n3 == n) {
            if (null != super._o) {
                super._o.a623((byte)34, this, n2, n4, true);
            }
        }
        if (this._D != null) {
            this._D.a115(n, super.xAxisOffset + n2, 0, super.yAxisOffset + n4);
        }
    }
    
    @Override
    void a277(final int n, final boolean b, final int n2, final lm_ lm_, final int n3, final int n4) {
        if (null != this._D) {
            this._D.a277(super.yAxisOffset + n, true, n2, lm_, n3 + super.xAxisOffset, n4);
        }
        if (!b) {
            da_._B = 25;
        }
    }
    
    final void a350(final boolean b, final StringBuilder sb, final int n, final Hashtable hashtable) {
        sb.append('\n');
        for (int i = 0; i <= n; ++i) {
            sb.append(' ');
        }
        if (this._D == null) {
            sb.append("null");
        }
        else {
            this._D.a481(1 + n, hashtable, sb, (byte)(-110));
        }
        if (!b) {
            this._D = null;
        }
    }
    
    @Override
    //original signature: String c983(final byte b) {
    String c983(final byte b) {
        final String c983 = super.c983((byte)38);
        if (null != this._D) {
            final String c984 = this._D.c983((byte)41);
            if (c984 != null) {
                return c984;
            }
        }
        return c983;
    }
    
    @Override
    boolean a946(final lm_ lm_, final int n, final int n2, final int n3, final int n4, final byte b, final int n5) {
        return null != this._D && this._D.a946(lm_, n, n2, super.xAxisOffset + n3, n4, (byte)(-117), super.yAxisOffset + n5);
    }
    
    private final boolean a059(final lm_ lm_, final byte b) {
        return b > 35 && this._D != null && this._D.a336(34, lm_);
    }
    
    @Override
    final int d137(final int n) {
        return (null == this._D) ? 0 : 0;
    }
    
    //original signature: private final boolean b336(final int n, final lm_ lm_) {
    private final boolean b336(final lm_ lm_) {
        return null != this._D && this._D.a336(34, lm_);
    }
    
    lm_ returnNull(final int n) {
        final lm_ d = this._D;
        if (n != 1) {
            this.a946(null, 22, -91, -111, -54, (byte)90, 48);
        }
        return null;
    }
    
    @Override
    final boolean a336(final int n, final lm_ lm_) {
        return n != 34 || (null != this._D && this._D.a336(34, lm_));
    }
    
    @Override
    void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        super.a319(n, n2, lm_, b);
        if (this._D != null) {
            this._D.a319(n + super.xAxisOffset, n2 + super.yAxisOffset, lm_, true);
        }
    }
    
    @Override
    final void e150(final int n) {
        if (n < 1) {
            da_._B = -12;
        }
        if (null != this._D) {
            this._D.e150(33);
        }
    }
    
    da_(final int n, final int n2, final int n3, final int n4, final ca_ ca_, final pg_ pg_) {
        super(n, n2, n3, n4, ca_, pg_);
    }
    
    @Override
    final boolean returnFalse() {
        return this.returnNull(1) != null;
    }
    
    //original signature: static final void a563(final String s, final int[] array, final int n, final int n2, final int n3, final se_ se_) {
    static final void a563(final String s, final int[] array, final int n, final int n3, final se_ se_) {
        final HeaderLabelText tf_ = new HeaderLabelText(se_, s, array);
        tf_.b326(-se_._H + n3, n - (tf_._i >> 1));
    }
    
    @Override
    final boolean a276(final int n, final int n2, final int n3, final int n4, final int n5, final lm_ lm_, final byte b) {
        if (b != -84) {
            getRandomTrapLayout(null, null);
        }
        return false;
        //this can never be true
        //return null != this._D && false && this._D.a276(n, n2, n3, n4, n5, lm_, (byte)(-84));
    }
    
    @Override
    StringBuilder a481(final int n, final Hashtable hashtable, final StringBuilder sb, final byte b) {
        if (this.a597(hashtable, n, -66, sb)) {
            this.a801(n, sb, hashtable, 1);
            this.a350(true, sb, n, hashtable);
        }
        return sb;
    }
    
    @Override
    final boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (80 != n) {
            if (b <= 55) {
                this.a946(null, -62, -81, -47, 98, (byte)(-16), -14);
            }
            return false;
        }
        return qk_._e[81] ? this.b336(lm_) : this.a059(lm_, (byte)36);
    }
    
    //original signature: static final Room[] a734(final wm_ o, final byte b, final Random random) {
    static final Room[] getRandomTrapLayout(final DungeonPath o, final Random random) {
        me_.dungeonLayout = new Room[49];
        a_._o = o;
        for (int n = 0; 49 > n; ++n) {
            me_.dungeonLayout[n] = new Room(0);
        }
        
        me_.dungeonLayout[0] = new Room(3);
        me_.dungeonLayout[6] = new Room(3);
        me_.dungeonLayout[24] = new Room(2);
        me_.dungeonLayout[42] = new Room(3);
        me_.dungeonLayout[48] = new Room(3);
        
        mp_.a308(random, il_._d, -127, 0, 2);
        mp_.a308(random, il_._d, -127, 6, 2);
        mp_.a308(random, il_._d, -127, 42, 2);
        mp_.a308(random, il_._d, -128, 48, 2);
        mp_.a308(random, oa_._e, -128, 0, 1);
        mp_.a308(random, oa_._e, -127, 6, 1);
        mp_.a308(random, oa_._e, -128, 42, 1);
        mp_.a308(random, oa_._e, -128, 48, 1);
    Label_0363:
        for (int i = 0; i < 49; ++i) {
            if (uj_.getRandom(random, 5) == 0) {
                if (me_.dungeonLayout[i].roomType == 0) {
                    final int[] a197 = nf_.a197(a_._o, i);
                    for (int j = 0; j < a197.length; ++j) {
                        final int n2 = a197[j];
                        if (n2 == 0 || 6 == n2 || n2 == 42 || 48 == n2) { //corner
                            continue Label_0363;
                        }
                    }
                    int[] array;
                    if (uj_.getRandom(random, 2) == 0) {
                        array = il_._d;
                    }
                    else {
                        array = oa_._e;
                    }
                    me_.dungeonLayout[i] = new Room(array[uj_.getRandom(random, array.length)]);
                }
            }
        }
        return me_.dungeonLayout;
    }
    
    //original signature: public static void a150(final int n) {
    public static void a150() {
        da_.orb_preservation_desc = null;
    }
    
    @Override
    final void b050(final int n, final int n2, final int n3, final int n4, final int n5) {
        super.b050(n + n, n2, n3, n4, n5);
        this.e423((byte)(-95));
    }
    
    static final Graphic[] a632(final String s, final String s2, final int n, final nh_ nh_) {
        final int a913 = nh_.a913(s, 1000);
        return li_.a298(a913, nh_.a026(n, s2, a913), nh_, 4);
    }
    
    //original signature:  void e423(final byte b) {
    void e423(final byte b) {
        if (null != this._D) {
            this._D.f150(12591);
        }
    }
    
    static {
        da_.orb_preservation_desc = "The amount of Treasure lost by resets is decreased by 5%";
    }
}
