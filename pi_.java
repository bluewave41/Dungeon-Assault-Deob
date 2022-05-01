final class pi_
{
    private boolean _a;
    //original name: _g
    static String text_hint_select_room;
    //original name: _i
    static String text_raider_selection;
    private int _h;
    Graphic _d;
    private int _k;
    //original name: _b
    static Graphic interface_lattice;
    private int _c;
    private int _j;
    Graphic[] _e;
    private int _f;
    
    final void a802(final int n, final lm_ lm_, final int n2, final int n3, final an_ an_) {
        sn_.a311(n ^ 0x74, lm_.componentHeight, this._e, lm_.xAxisOffset + n3, lm_.yAxisOffset + n2, lm_.componentWidth);
        if (this._d != null) {
            int n4 = n3 + (lm_.xAxisOffset + this._j);
            int n5 = this._k + (n2 + lm_.yAxisOffset);
            if (1 == an_._f) {
                n4 += (lm_.componentWidth - this._d.imageWidth2) / 2;
            }
            if (2 == an_._f) {
                n4 += lm_.componentWidth - this._d.imageWidth2;
            }
            if (1 == an_._d) {
                n5 += (-this._d.imageHeight2 + lm_.componentHeight) / 2;
            }
            if (2 == an_._d) {
                n5 += lm_.componentHeight - this._d.imageHeight2;
            }
            this._d.drawImage(n4, n5);
        }
        final String buttonText = an_.getButtonText(lm_, -444136767);
        if (buttonText != null && null != an_._u && 0 <= this._f) {
            an_._u.a450(buttonText, an_._l + lm_.xAxisOffset + (n3 + ((Integer.MIN_VALUE == this._j) ? 0 : this._j)), ((this._k == Integer.MIN_VALUE) ? 0 : this._k) + (an_._e + (lm_.yAxisOffset + n2)), lm_.componentWidth + (-an_._l - an_._v), -an_._i + lm_.componentHeight - an_._e, this._f, this._h, (Integer.MIN_VALUE != this._c) ? this._c : 256, an_._f, an_._d, an_._a);
        }
        if (n != 0) {
            this.a269(false, null);
        }
    }
    
    static final boolean c154() {
        return ql_._f == wd_._d;
    }
    
    final pi_ a913(final int n, final int f) {
        if (n != -7695) {
            this.a021(null, (byte)80, null, -58, null, -78);
        }
        this._f = f;
        return this;
    }
    
    final pi_ d913(final int h, final int n) {
        this._h = h;
        if (n != 216) {
            this.a269(true, null);
        }
        return this;
    }
    
    static final void a861(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5) {
        tg_._f[n2] = array;
        tg_._b[n2] = n;
        tg_._j[n2] = n4;
        tg_._h[n2] = n5;
        tg_._d[n2] = n3;
    }
    
    final pi_ a316(final Graphic[] e, final boolean b) {
        if (!b) {
            a207((byte)123);
        }
        this._e = e;
        return this;
    }
    
    static final vk_ a207(final byte b) {
        if (sp_._e == ol_._i) {
            throw new IllegalStateException();
        }
        if (b != 80) {
            pi_.text_hint_select_room = null;
        }
        if (ol_._i == dh_._b) {
            ol_._i = sp_._e;
            return mh_._b;
        }
        return null;
    }
    
    final void a269(final boolean b, final pi_ pi_) {
        pi_._e = this._e;
        pi_._d = this._d;
        if (!b) {
            return;
        }
        pi_._a = this._a;
        pi_._k = this._k;
        pi_._f = this._f;
        pi_._h = this._h;
        pi_._c = this._c;
        pi_._j = this._j;
    }
    
    //original signature: static final void a959(final int n, final String s, final int[] array, final int n2, final se_ se_, final int n3) {
    static final void a959(final String s, final int[] array, final int n2, final se_ se_, final int n3) {
        final HeaderLabelText tf_ = new HeaderLabelText(se_, s, array);
        tf_.b326(-se_._H + n3, n2);
    }
    
    final pi_ c913(final int k, final int n) {
        this._k = k;
        if (n != -33) {
            this.a269(true, null);
        }
        return this;
    }
    
    static final q_ a648(final int n, final q_ q_, final int[] i) {
        if (n != 1) {
            a150(-117);
        }
        final q_ q_2 = new q_(0, 0, 0);
        q_2._d = q_._d;
        q_2._e = q_._e;
        q_2._i = i;
        q_2._a = q_._a;
        q_2._g = q_._g;
        q_2._h = q_._h;
        q_2._j = q_._j;
        q_2._b = q_._b;
        return q_2;
    }
    
    final void b150(final int k) {
        this._d = null;
        this._k = k;
        this._e = null;
        this._f = 0;
        this._h = -1;
        this._j = 0;
        this._c = 256;
    }
    
    final pi_ b913(final int j, final int n) {
        this._j = j;
        return this;
    }
    
    //original signature: static final byte[] a640(final String s, final int n, final String s2, final String s3, final int n2, final int n3, final nh_ nh_) {
    static final byte[] loadAsset(final String animationName, final String s2, final String unitName, final int n2, final int n3, final nh_ nh_) {
        if (!nh_.a213(false, unitName)) {
            return null;
        }
        final byte[] a826 = nh_.a826(unitName + "/" + animationName, s2);
        if (a826 != null) {
            oi_._J.currentIndex = 0;
            oi_._J.storeByte(255);
            oi_._J.storeByte(216);
            oi_._J.storeByte(255);
            oi_._J.storeByte(224);
            oi_._J.storeShort(16);
            oi_._J.storeByte(74);
            oi_._J.storeByte(70);
            oi_._J.storeByte(73);
            oi_._J.storeByte(70);
            oi_._J.storeByte(0);
            oi_._J.storeShort(258);
            oi_._J.storeByte(0);
            oi_._J.storeShort(1);
            oi_._J.storeShort(1);
            oi_._J.storeByte(0);
            oi_._J.storeByte(0);
            oi_._J.storeByte(255);
            oi_._J.storeByte(219);
            final byte[][] array = new byte[4][];
            int n4 = 2;
            for (int n5 = 0; 4 > n5; ++n5) {
                final String string = "qt" + n5;
                if (nh_.b671(string, unitName, (byte)(-82))) {
                    array[n5] = nh_.a826(unitName, string);
                    n4 += array[n5].length;
                }
            }
            oi_._J.storeShort(n4);
            for (int j = 0; j < 4; ++j) {
                if (array[j] != null) {
                    oi_._J.storeArray(array[j], array[j].length);
                }
            }
            oi_._J.storeByte(255);
            oi_._J.storeByte(192);
            oi_._J.storeShort(17);
            oi_._J.storeByte(8);
            oi_._J.storeShort(n2);
            oi_._J.storeShort(n3);
            oi_._J.storeByte(3);
            oi_._J.storeByte(1);
            oi_._J.storeByte(34);
            oi_._J.storeByte(0);
            oi_._J.storeByte(2);
            oi_._J.storeByte(17);
            oi_._J.storeByte(1);
            oi_._J.storeByte(3);
            oi_._J.storeByte(17);
            oi_._J.storeByte(1);
            oi_._J.storeByte(255);
            oi_._J.storeByte(196);
            final byte[][] array2 = new byte[32][];
            int n6 = 2;
            for (int k = 0; k < 32; ++k) {
                final String string2 = "ht" + k;
                if (nh_.b671(string2, unitName, (byte)(-82))) {
                    array2[k] = nh_.a826(unitName, string2);
                    n6 += array2[k].length;
                }
            }
            oi_._J.storeShort(n6);
            for (int l = 0; l < 32; ++l) {
                if (array2[l] != null) {
                    oi_._J.storeArray(array2[l], array2[l].length);
                }
            }
            oi_._J.storeByte(255);
            oi_._J.storeByte(218);
            oi_._J.storeShort(12);
            oi_._J.storeByte(3);
            oi_._J.storeByte(1);
            oi_._J.storeByte(0);
            oi_._J.storeByte(2);
            oi_._J.storeByte(17);
            oi_._J.storeByte(3);
            oi_._J.storeByte(17);
            oi_._J.storeByte(0);
            oi_._J.storeByte(63);
            oi_._J.storeByte(0);
            for (int n7 = 0; n7 < a826.length; ++n7) {
                final byte b = a826[n7];
                oi_._J.storeByte(b);
                if (0xFF == (0xFF & b)) {
                    oi_._J.storeByte(0);
                }
            }
            oi_._J.storeByte(255);
            oi_._J.storeByte(217);
            final byte[] array3 = new byte[oi_._J.currentIndex];
            cj_.a278(oi_._J.buffer, 0, array3, 0, oi_._J.currentIndex);
            return array3;
        }
        return null;
    }
    
    final void a021(final lm_ lm_, final byte b, final pi_ pi_, final int n, final an_ an_, final int n2) {
        if (this._a) {
            pi_.a802(0, lm_, n, n2, an_);
            pi_.b150(0);
        }
        if (this._e != null) {
            pi_._e = this._e;
        }
        if (this._c != Integer.MIN_VALUE) {
            pi_._c = this._c;
        }
        if (this._j != Integer.MIN_VALUE) {
            pi_._j = this._j;
        }
        if (-1 <= this._h) {
            pi_._h = this._h;
        }
        if (b != 100) {
            a648(-106, null, null);
        }
        if (this._k != Integer.MIN_VALUE) {
            pi_._k = this._k;
        }
        if (-1 <= this._f) {
            pi_._f = this._f;
        }
        if (null != this._d) {
            pi_._d = this._d;
        }
    }
    
    public static void a150(final int n) {
        pi_.text_hint_select_room = null;
        pi_.interface_lattice = null;
        pi_.text_raider_selection = null;
        if (n != 11877) {
            pi_.text_raider_selection = null;
        }
    }
    
    final pi_ a479(final byte b, final boolean a) {
        this._a = a;
        if (b >= -34) {
            this.a913(10, 73);
        }
        return this;
    }
    
    pi_() {
        this._a = false;
        this._h = -2;
        this._d = null;
        this._j = Integer.MIN_VALUE;
        this._c = Integer.MIN_VALUE;
        this._k = Integer.MIN_VALUE;
        this._e = null;
        this._f = -2;
    }
    
    static {
        pi_.text_hint_select_room = "Pick an adjacent room, or select another party leader.";
        pi_.text_raider_selection = "SELECT RAIDERS";
    }
}
