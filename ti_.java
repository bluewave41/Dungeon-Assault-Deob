final class ti_ extends qa_
{
    private ln_ _D; //cache file
    //original name: _v
    static String fs_focus_or_resolution;
    //original name: _w
    private int checksum;
    static pp_ _A;
    private int _p;
    private tm_ _y;
    private bb_ _t;
    private byte[] _s;
    //original name: _n
    static String desc_imp;
	static boolean _f;
    static boolean _i;
    static byte[] _q;
    private byte[] _h;
    private int _o;
    private wa_ _l;
    //original name: _g
    private ln_ mainFile255Reader;
    private vf_ _C;
    private cc_ _B;
    private boolean _r;
    private boolean _x;
    private md_ _j;
    private md_ _u;
    private int _z;
    private long _m;
    private boolean _k;
    
    private final vf_ a274(final byte b, final int n, final int n2) {
        if (b < 81) {
            this._k = false;
        }
        vf_ vf_ = (vf_)this._l.a722(n, 8);
        if (null != vf_ && 0 == n2 && !vf_._B && vf_._v) {
            vf_.a487(false);
            vf_ = null;
        }
        if (vf_ == null) {
            if (n2 != 0) {
                if (1 == n2) {
                    if (this._D == null) {
                        throw new RuntimeException();
                    }
                    vf_ = this._B.a822((byte)(-78), this._D, n);
                }
                else {
                    if (n2 != 2) {
                        throw new RuntimeException();
                    }
                    if (null == this._D) {
                        throw new RuntimeException();
                    }
                    if (this._h[n] != -1) {
                        throw new RuntimeException();
                    }
                    if (this._t.d154(20)) {
                        return null;
                    }
                    vf_ = this._t.a180(false, this._p, (byte)2, n, (byte)118);
                }
            }
            else if (this._D == null || this._h[n] == -1) {
                if (this._t.b154(-21431)) {
                    return null;
                }
                vf_ = this._t.a180(true, this._p, (byte)2, n, (byte)73);
            }
            else {
                vf_ = this._B.a945(this._D, n);
            }
            this._l.a102(vf_, 12460, n);
        }
        if (vf_._v) {
            return null;
        }
        final byte[] b2 = vf_.b318(true);
        if (!(vf_ instanceof co_)) {
            if (null == b2 || b2.length <= 2) {
                throw new RuntimeException();
            }
            jl_.crc32.reset();
            jl_.crc32.update(b2, 0, b2.length - 2);
            if ((int)jl_.crc32.getValue() != this._y.crcs[n]) {
                throw new RuntimeException();
            }
            if (null != this._y._g && null != this._y._g[n]) {
                final byte[] array = this._y._g[n];
                final byte[] a288 = rn_.a288(b2.length - 2, 0, b2);
                for (int n3 = 0; 64 > n3; ++n3) {
                    if (a288[n3] != array[n3]) {
                        throw new RuntimeException();
                    }
                }
            }
            this._t._h = 0;
            this._t._c = 0;
            b2[b2.length - 2] = (byte)(this._y.revisions[n] >>> 8);
            b2[b2.length - 1] = (byte)this._y.revisions[n];
            if (this._D != null) {
                this._B.a504(this._D, 15958, n, b2);
                if (1 != this._h[n]) {
                    this._h[n] = 1;
                }
            }
            if (!vf_._B) {
                vf_.a487(false);
            }
            return vf_;
        }
        else {
            try {
                if (b2 == null || b2.length <= 2) {
                    throw new RuntimeException();
                }
                jl_.crc32.reset();
                jl_.crc32.update(b2, 0, b2.length - 2);
                if (this._y.crcs[n] != (int)jl_.crc32.getValue()) { //crcs of each file
                    throw new RuntimeException();
                }
                if (null != this._y._g) {
                    if (null != this._y._g[n]) {
                        final byte[] array2 = this._y._g[n];
                        final byte[] a289 = rn_.a288(b2.length - 2, 0, b2);
                        for (int i = 0; i < 64; ++i) {
                            if (array2[i] != a289[i]) {
                                throw new RuntimeException();
                            }
                        }
                    }
                }
                if ((this._y.revisions[n] & 0xFFFF) == (b2[b2.length - 1] & 0xFF) + (b2[b2.length - 2] << 8 & 0xFF00)) {
                    if (1 != this._h[n]) {
                        if (0 != this._h[n]) {}
                        this._h[n] = 1;
                    }
                    if (!vf_._B) {
                        vf_.a487(false);
                    }
                    return vf_;
                }
                throw new RuntimeException();
            }
            catch (Exception ex) {
                this._h[n] = -1;
                vf_.a487(false);
                if (vf_._B && !this._t.b154(-21431)) {
                    this._l.a102(this._t.a180(true, this._p, (byte)2, n, (byte)77), 12460, n);
                }
                return null;
            }
        }
    }
    
    final void c150(final int n) {
        if (this._j != null) {
            if (null == this.a010(26538)) {
                return;
            }
            if (!this._x) {
                if (!this._r) {
                    this._j = null;
                }
                else {
                    boolean b = true;
                    for (ne_ ne_ = this._j.e024(); ne_ != null; ne_ = this._j.a024(4)) {
                        final int n2 = (int)ne_._h;
                        if (1 != this._h[n2]) {
                            this.a274((byte)107, n2, 2);
                        }
                        if (this._h[n2] == 1) {
                            ne_.a487(false);
                        }
                        else {
                            b = false;
                        }
                    }
                    while (this._z < this._y._k.length) {
                        if (0 != this._y._k[this._z]) {
                            if (this._t.d154(20)) {
                                b = false;
                                break;
                            }
                            if (1 != this._h[this._z]) {
                                this.a274((byte)112, this._z, 2);
                            }
                            if (1 != this._h[this._z]) {
                                final ne_ ne_2 = new ne_();
                                ne_2._h = this._z;
                                this._j.a865(ne_2);
                                b = false;
                            }
                            ++this._z;
                        }
                        else {
                            ++this._z;
                        }
                    }
                    if (b) {
                        this._r = false;
                        this._z = 0;
                    }
                }
            }
            else {
                boolean b2 = true;
                for (ne_ ne_3 = this._j.e024(); null != ne_3; ne_3 = this._j.a024(n ^ 0xFFFFD5DE)) {
                    final int n3 = (int)ne_3._h;
                    if (0 == this._h[n3]) {
                        this.a274((byte)127, n3, 1);
                    }
                    if (0 == this._h[n3]) {
                        b2 = false;
                    }
                    else {
                        ne_3.a487(false);
                    }
                }
                while (this._y._k.length > this._z) {
                    if (0 == this._y._k[this._z]) {
                        ++this._z;
                    }
                    else {
                        if (250 <= this._B._f) {
                            b2 = false;
                            break;
                        }
                        if (this._h[this._z] == 0) {
                            this.a274((byte)126, this._z, 1);
                        }
                        if (this._h[this._z] == 0) {
                            final ne_ ne_4 = new ne_();
                            ne_4._h = this._z;
                            b2 = false;
                            this._j.a865(ne_4);
                        }
                        ++this._z;
                    }
                }
                if (b2) {
                    this._z = 0;
                    this._x = false;
                }
            }
        }
        if (this._k) {
            if (kd_.getTime() >= this._m) {
                for (vf_ vf_ = (vf_)this._l.a457(true); vf_ != null; vf_ = (vf_)this._l.a024(n + 15108)) {
                    if (!vf_._v) {
                        if (vf_._z) {
                            if (!vf_._B) {
                                throw new RuntimeException();
                            }
                            vf_.a487(false);
                        }
                        else {
                            vf_._z = true;
                        }
                    }
                }
                this._m = kd_.getTime() + 1000L;
            }
        }
        if (n != -10790) {
            this._k = false;
        }
    }
    
    @Override
    final byte[] a104(final int n, final int n2) {
        final vf_ a274 = this.a274((byte)90, n, 0);
        if (null == a274) {
            return null;
        }
        if (n2 != -7249) {
            return null;
        }
        final byte[] b318 = a274.b318(true);
        a274.a487(false);
        return b318;
    }
    
    @Override
    final tm_ a010(final int n) {
        if (null != this._y) {
            return this._y;
        }
        if (this._C == null) {
            if (this._t.b154(-21431)) {
                return null;
            }
            this._C = this._t.a180(true, 255, (byte)0, this._p, (byte)79);
        }
        if (n != 26538) {
            return null;
        }
        if (!this._C._v) {
            final byte[] b318 = this._C.b318(true);
            if (!(this._C instanceof co_)) {
                if (b318 == null) {
                    throw new RuntimeException();
                }
                this._y = new tm_(b318, this.checksum, this._s);
                if (this.mainFile255Reader != null) {
                    this._B.a504(this.mainFile255Reader, n ^ 0x59FC, this._p, b318);
                }
            }
            else {
                if (b318 == null) {
                    throw new RuntimeException();
                }
                this._y = new tm_(b318, this.checksum, this._s);
                if (this._y._s != this._o) {
                    throw new RuntimeException();
                }
            }
            this._C = null;
            if (this._D != null) {
                this._h = new byte[this._y._l];
            }
            return this._y;
        }
        return null;
    }
    
    //original signature: final void d150(final int n) {
    final void d150() {
        if (this._D == null) {
            return;
        }
        this._r = true;
        if (null == this._j) {
            this._j = new md_();
        }
    }
    
    final void b487(final boolean b) {
        if (null == this._j) {
            return;
        }
        if (b) {
            this._y = null;
        }
        if (null == this.a010(26538)) {
            return;
        }
        for (ne_ ne_ = this._u.e024(); ne_ != null; ne_ = this._u.a024(4)) {
            final int n = (int)ne_._h;
            if (n < 0 || n >= this._y._l || 0 == this._y._k[n]) {
                ne_.a487(b);
            }
            else {
                if (this._h[n] == 0) {
                    this.a274((byte)95, n, 1);
                }
                if (this._h[n] == -1) {
                    this.a274((byte)123, n, 2);
                }
                if (this._h[n] == 1) {
                    ne_.a487(false);
                }
            }
        }
    }
    
    @Override
    final int b080(final int n, final int n2) {
        final vf_ vf_ = (vf_)this._l.a722(n, 8);
        if (n2 != 27318) {
            this._t = null;
        }
        if (null != vf_) {
            return vf_.d410((byte)107);
        }
        return 0;
    }
    
    static final void c487(final boolean b) {
        if (!b) {
            return;
        }
        final i_ i_ = (i_)id_._e.c024(0);
        if (i_ == null) {
            throw new IllegalStateException();
        }
        gf_.a397(i_._j, i_._i, i_._q);
        gf_.e115(i_._m, i_._p, i_._z, i_._k);
        i_._j = null;
        cd_._g.a865(i_);
    }
    
    public static void a487() {
        ti_.fs_focus_or_resolution = null;
        ti_._A = null;
        ti_._q = null;
        ti_.desc_imp = null;
    }
    
    //original signature: ti_(final int p9, final ln_ d, final ln_ g, final bb_ t, final cc_ b, final int w, final byte[] s, final int o, final boolean k) {
    ti_(final int p9, final ln_ d, final ln_ mainFile255Reader, final bb_ t, final cc_ b, final int checksum, final byte[] s, final int o, final boolean k) {
        this._l = new wa_(16);
        this._z = 0;
        this._u = new md_();
        this._m = 0L;
        this._p = p9;
        this._D = d;
        if (null == this._D) {
            this._x = false;
        }
        else {
            this._x = true;
            this._j = new md_();
        }
        this._o = o;
        this.checksum = checksum;
        this.mainFile255Reader = mainFile255Reader;
        this._k = k;
        this._s = s;
        this._B = b;
        this._t = t;
        if (null != this.mainFile255Reader) {
            this._C = this._B.a945(this.mainFile255Reader, this._p); //saves index data
        }
    }
    
    static {
        ti_.desc_imp = "Imps may be small and carry a cheeky, indeed, impish look, but they'll not give a second thought to whether or not to stab your raiders.";
        ti_._f = false;
        ti_.fs_focus_or_resolution = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
