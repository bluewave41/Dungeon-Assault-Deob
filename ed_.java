import java.lang.reflect.*;
import java.io.*;

final class ed_ extends np_
{
    private pd_ _T;
    //original name: _R
    static String desc_vampire_bats;
    private int _S;
    static int _P;
    private int[] _B;
    private Graphic _U;
    private int _H;
    private Graphic _Q;
    private int _O;
    private int _V;
    //original name: _W
    static String login_gameupdated;
    
    static final ab_ a524(final String s) {
        final int length = s.length();
        if (length == 0) {
            return ri_._e;
        }
        if (255 < length) {
            return ta_._d;
        }
        final String[] a640 = ih_.split('.', s);
        if (a640.length < 2) {
            return ri_._e;
        }
        final String[] array = a640;
        for (int i = 0; i < array.length; ++i) {
            final ab_ a641 = ip_.a524(0, array[i]);
            if (null != a641) {
                return a641;
            }
        }
        return id_.a524(-49, a640[a640.length - 1]);
    }
    
    @Override
    final void a599(final int n, final int n2, final byte b) {
        if (super._N) {
            this.e150(76);
            this._U = fa_.a727(super._i + n2, 7, n + super._t, super.imageWidth, this._U);
            this._Q = fa_.a727(super._i - (-n2 - super.imageHeight) - 7, 7, n + super._t, super.imageWidth, this._Q);
            super.a599(n, n2, (byte)(-87));
            if (this._T.isActive) {
                this._T.a599(n, n2, (byte)122);
            }
        }
    }
    
    @Override
    final void a183(final boolean b, final int n, final int n2) {
        this._T.e326(0, n - super.imageWidth, 105);
        this._T.a183(b, 8, n2 - 4);
        super.a183(false, n, n2);
    }
    
    private final void e423(final byte b) {
        this._T = new pd_(super._t - 8 + super.imageWidth, super._i + 8, 5, super.imageHeight - 16, 65536, 0);
        if (b >= -30) {
            ed_.desc_vampire_bats = null;
        }
        this._S = 0;
    }
    
    private final int d474(final boolean b) {
        if (null != super._J) {
            int n = Integer.MAX_VALUE;
            int n2 = 0;
            for (rj_ rj_ = (rj_)super._J.e024(); null != rj_; rj_ = (rj_)super._J.a024(4)) {
                final int n3 = -super._i + rj_._i;
                final int n4 = -super._i + rj_.imageHeight + rj_._i;
                if (n3 < n) {
                    n = n3;
                }
                if (n2 < n4) {
                    n2 = n4;
                }
            }
            if (!b) {
            }
            return -n + n2;
        }
        return 0;
    }
    
    final void e150(final int n) {
        final int h = this.d474(true) + 15;
        if (this._S != this._T._z || this._H != h || this._V != super.imageHeight) {
            final int n2 = h - super.imageHeight;
            if (0 >= n2) {
                this._T.isActive = false;
                if (null != super._J) {
                    for (rj_ rj_ = (rj_)super._J.e024(); rj_ != null; rj_ = (rj_)super._J.a024(4)) {
                        rj_.e326(this._O, 0, 77);
                    }
                }
                this._O = 0;
            }
            else {
                this._T.isActive = true;
                final int n3 = -(this._T._z * n2 / this._T._C) + this._O;
                if (super._J != null) {
                    for (rj_ rj_2 = (rj_)super._J.e024(); null != rj_2; rj_2 = (rj_)super._J.a024(4)) {
                        rj_2.e326(n3, 0, 101);
                    }
                }
                this._O -= n3;
            }
            this._S = this._T._z;
            if (0 < n2) {
                final int d = this._T._C * 32 / n2;
                if (this._T._D < d) {
                    this._T._D = d;
                }
                if (this._T._H < d >> 1) {
                    this._T._H = d >> 1;
                }
            }
            this._V = super.imageHeight;
            this._H = h;
        }
        if (n < 32) {
            this._T = null;
        }
    }
    
    @Override
    final void e326(final int n, final int n2, final int n3) {
        this._T.e326(n, n2, 75);
        if (n3 <= 69) {
            return;
        }
        super.e326(n, n2, 121);
    }
    
    @Override
    final void b326(final int n, final int n2, final int n3) {
        if (super._N) {
            this.e150(66);
            super.b326(n, n2, n3);
            if (this._T.isActive) {
                this._T.b326(n, n2 + 0, n3);
            }
            final int n4 = n + super._t;
            final int n5 = super._i + n3;
            gf_.a331(this._B);
            if (this._U != null) {
                for (int n6 = 0; 7 > n6; ++n6) {
                    gf_.e115(n4, n6 + n5, n4 + super.imageWidth, n5 - (-n6 - 1));
                    this._U.d326(n4, n5, 32 * (-n6 + 7));
                }
            }
            if (this._Q != null) {
                for (int i = 0; i < 7; ++i) {
                    gf_.e115(n4, n5 + super.imageHeight - 7 + i, super.imageWidth + n4, n5 + super.imageHeight - 6 + i);
                    this._Q.d326(n4, n5 + super.imageHeight - 7, (i + 1) * 32);
                }
            }
            gf_.b331(this._B);
        }
    }
    
    @Override
    final void a093(final int n, final int n2) {
        this._T.a093(n, n2);
    }
    
    @Override
    final void a720(final rj_ rj_, final byte b) {
        rj_.e326(10 + this._O, 0, 79);
        if (b > -27) {
            a524(null);
        }
        super.a720(rj_, (byte)(-76));
    }
    
    public static void f423() {
        ed_.login_gameupdated = null;
        ed_.desc_vampire_bats = null;
    }
    
    //static final void loadRaiderVoices(final int n, final String defeatName, final int unitId, final int n3, final int n5, final String specialName, final String revealName) {
    //original signature: static final void a029(final String s, final int n, final int n2, final String s2, final int n3) {
    static final void a029(final String defeatName, final int n, final int unitId, final String revealName, final int n3) {
        kn_.loadRaiderVoices(n3, defeatName, unitId, n, 96, null, revealName);
    }
    
    //original signature: final void c093(final int n, final int n2) {
    final void c093(final int n2) {
        if (this._T.isActive) {
            final int n3 = this.d474(true) + 20 - super.imageHeight;
            this._T._z = this._T._C * n2 / n3;
            this.e150(77);
        }
    }
    
    //original signature: final void e487(final boolean b) {
    final void e487() {
        this._T._z = 0;
        this.e150(95);
    }
    
    static final void a707(final boolean b, final wj_ wj_) {
        final oe_ oe_ = (oe_)fe_._k.e024();
        if (oe_ == null) {
            return;
        }
        boolean b2 = false;
        for (int i = 0; i < oe_._q; ++i) {
            if (null != oe_._s[i]) {
                if (2 == oe_._s[i]._c) {
                    oe_._r[i] = -5;
                }
                if (oe_._s[i]._c == 0) {
                    b2 = true;
                }
            }
            if (null != oe_._o[i]) {
                if (oe_._o[i]._c == 2) {
                    oe_._r[i] = -6;
                }
                if (oe_._o[i]._c == 0) {
                    b2 = true;
                }
            }
        }
        if (!b2) {
            final int o = wj_.currentIndex;
            wj_.storeInt(oe_._j);
            for (int n = 0; oe_._q > n; ++n) {
                if (0 != oe_._r[n]) {
                    wj_.storeByte(oe_._r[n]);
                }
                else {
                    try {
                        final int n2 = oe_._n[n];
                        if (n2 != 0) {
                            if (n2 != 0) {
                                ((Field)oe_._s[n]._f).setInt(null, oe_._l[n]);
                                wj_.storeByte(0);
                            }
                            else if (n2 == 2) {
                                final int modifiers = ((Field)oe_._s[n]._f).getModifiers();
                                wj_.storeByte(0);
                                wj_.storeInt(modifiers);
                            }
                        }
                        else {
                            final int int1 = ((Field)oe_._s[n]._f).getInt(null);
                            wj_.storeByte(0);
                            wj_.storeInt(int1);
                        }
                        if (n2 == 3) {
                            final Method method = (Method)oe_._o[n]._f;
                            final byte[][] array = oe_._k[n];
                            final Object[] array2 = new Object[array.length];
                            for (int j = 0; j < array.length; ++j) {
                                array2[j] = new ObjectInputStream(new ByteArrayInputStream(array[j])).readObject();
                            }
                            final Object invoke = method.invoke(null, array2);
                            if (null != invoke) {
                                if (!(invoke instanceof Number)) {
                                    if (!(invoke instanceof String)) {
                                        wj_.storeByte(4);
                                    }
                                    else {
                                        wj_.storeByte(2);
                                        wj_.b627((String)invoke);
                                    }
                                }
                                else {
                                    wj_.storeByte(1);
                                    wj_.storeLong8Byte(((Number)invoke).longValue());
                                }
                            }
                            else {
                                wj_.storeByte(0);
                            }
                        }
                        else if (n2 == 4) {
                            final int modifiers2 = ((Method)oe_._o[n]._f).getModifiers();
                            wj_.storeByte(0);
                            wj_.storeInt(modifiers2);
                        }
                    }
                    catch (ClassNotFoundException ex) {
                        wj_.storeByte(-10);
                    }
                    catch (InvalidClassException ex2) {
                        wj_.storeByte(-11);
                    }
                    catch (StreamCorruptedException ex3) {
                        wj_.storeByte(-12);
                    }
                    catch (OptionalDataException ex4) {
                        wj_.storeByte(-13);
                    }
                    catch (IllegalAccessException ex5) {
                        wj_.storeByte(-14);
                    }
                    catch (IllegalArgumentException ex6) {
                        wj_.storeByte(-15);
                    }
                    catch (InvocationTargetException ex7) {
                        wj_.storeByte(-16);
                    }
                    catch (SecurityException ex8) {
                        wj_.storeByte(-17);
                    }
                    catch (IOException ex9) {
                        wj_.storeByte(-18);
                    }
                    catch (NullPointerException ex10) {
                        wj_.storeByte(-19);
                    }
                    catch (Exception ex11) {
                        wj_.storeByte(-20);
                    }
                    catch (Throwable t) {
                        wj_.storeByte(-21);
                    }
                }
            }
            wj_.calculateAndStoreChecksum(o);
            oe_.a487(b);
        }
    }
    
    static final void a587(final int n, final int n2, final int n3, final int n4) {
        int roomType = gm_.playerInformation.dungeonLayout[n3].roomType;
        if (qj_.dungeonLayout[n3] != null) {
            roomType = qj_.dungeonLayout[n3].roomType;
        }
        if (gh_.traps[roomType].roomType == 2) {
            final Graphic a574 = jb_.getTrapPiece(roomType);
            if (a574 != null) {
                final int n6 = a574.imageWidth2 * 5 >> 3;
                final int n7 = 5 * a574.imageHeight2 >> 3;
                a574.b050(n2 + (-n6 + 48 >> 1), -n7 + (40 + n), n6, n7, n4);
            }
        }
        dm_._a[roomType].e326(n2, n + 1, n4);
    }
    
    @Override
    final rj_ a759(final int n, final int n2, final int n3) {
        if (n > -10) {
            this.e326(-111, 75, 17);
        }
        if (super.isActive) {
            if (this._T.isActive) {
                final rj_ a759 = this._T.a759(-19, n2, n3);
                if (null != a759) {
                    return a759;
                }
            }
        }
        return super.a759(-65, n2, n3);
    }
    
    ed_(final int n, final int n2, final int n3, final int n4) {
        super(n, n2, n3, n4);
        this._B = new int[4];
        this.e423((byte)(-40));
    }
    
    @Override
    final void b423(final byte b) {
        this._T.b423(b);
        super.b423((byte)30);
    }
    
    static {
        ed_.desc_vampire_bats = "Any raider setting foot inside this room will quickly be swarmed by a cloud of bloodsucking bats.<br><br>Defeated raiders permanently lose 1 <%attack> and 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        ed_._P = 240;
        ed_.login_gameupdated = "This game has been updated! Please reload this page.";
    }
}
