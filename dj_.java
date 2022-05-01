import java.io.*;

final class dj_
{
	//original name: _d
    static volatile int mouseY;
    private ne_ _b;
    static int _a;
    private md_ _e;
    //original name: _c
    static String text_defence;
    
    //original signature: final ne_ c024(final int n) {
    final ne_ c024() {
        final ne_ b = this._b;
        if (b == this._e._c) {
            return this._b = null;
        }
        this._b = b._e;
        return b;
    }
    
    //a134(this.instanceId, this.gamePort1, this.codeBaseHost, this.crc, hc_.lang, this.gamePort2, this.serverNum, this.isMember, (byte)(-27), i_._A)
    static final void a134(final long instanceId, final int gamePort1, final String codeBaseHost,
    		final int crc, final int lang, final int gamePort2, final int serverNum,
    		final boolean isMember, final qg_ q2) {
        ra_._c = new wj_(5000);
        Trap._B = new wj_(5000);
        ld_.isMember = isMember;
        mh_.serverNum = serverNum;
        kn_.gameId = 32;
        fa_.unused = false;
        an_.gamePort1 = gamePort1;
        dn_.instanceId = instanceId;
        l_.gamePort2 = gamePort2;
        ii_.codeBaseHost = codeBaseHost;
        la_.crc = crc;
        sc_._q = q2;
        rd_.lang = lang;
        if (null != sc_._q.randomDat) {
            try {
                bk_._b = new hd_(sc_._q.randomDat, 64, 0);
            }
            catch (IOException ex) {
                throw new RuntimeException(ex.toString());
            }
        }
    }
    
    static final boolean a988(final int n, final String s) {
        if (n != 6623) {
            return false;
        }
        for (int n2 = 0; s.length() > n2; ++n2) {
            final char char1 = s.charAt(n2);
            if (!uc_.a331(n - 854863799, char1) && !qm_.a331(57, char1)) {
                return true;
            }
        }
        return false;
    }
    
    //never called
    final ne_ a159(final ne_ ne_, final boolean b) {
        if (b) {
            dj_._a = 16;
        }
        ne_ a;
        if (ne_ != null) {
            a = ne_;
        }
        else {
            a = this._e._c._a;
        }
        if (a != this._e._c) {
            this._b = a._a;
            return a;
        }
        return this._b = null;
    }
    
    //original signature: final ne_ b024(final int n) {
    final ne_ b024() {
        final ne_ a = this._e._c._a;
        if (a == this._e._c) {
            return this._b = null;
        }
        this._b = a._a;
        return a;
    }
    
    //never called
    final ne_ a071(final boolean b, final ne_ ne_) {
        ne_ e;
        if (ne_ != null) {
            e = ne_;
        }
        else {
            e = this._e._c._e;
        }
        if (!b) {
            return null;
        }
        if (e != this._e._c) {
            this._b = e._e;
            return e;
        }
        return this._b = null;
    }
    
    //original signature: final ne_ d024(final int n) {
    final ne_ d024() {
        final ne_ b = this._b;
        if (this._e._c == b) {
            return this._b = null;
        }
        this._b = b._a;
        return b;
    }
    
    //original signature: final ne_ a024(final int n) {
    final ne_ a024() {
        final ne_ e = this._e._c._e;
        if (e != this._e._c) {
            this._b = e._e;
            return e;
        }
        return this._b = null;
    }
    
    public static void a423(final byte b) {
        dj_.text_defence = null;
        if (b < 22) {
            a134(1L, 66, null, -4, 49, 6, -5, true, null);
        }
    }
    
    static final String a064(final byte[] array, final boolean b) {
        if (b) {
            return null;
        }
        return mk_.a046(array, array.length, 0);
    }
    
    dj_(final md_ e) {
        this._e = e;
    }
    
    static final void a330(final ec_ ec_, final byte b) {
        dh_._g = ec_.readShort() << 5;
        if (b < 122) {
            a423((byte)(-97));
        }
        final int c474 = ec_.readByte();
        dh_._g += c474 >> 3;
        cm_._P = (c474 << 18 & 0x1C0000);
        cm_._P += ec_.readShort() << 2;
        final int c475 = ec_.readByte();
        fm_._g = (0x1F8000 & c475 << 15);
        cm_._P += c475 >> 6;
        fm_._g += ec_.readByte() << 7;
        final int c476 = ec_.readByte();
        fm_._g += c476 >> 1;
        ln_._e = (0x10000 & c476 << 16);
        ln_._e += ec_.readShort();
    }
    
    static {
        dj_._a = 0;
        dj_.mouseY = -1;
        dj_.text_defence = "Defence";
    }
}
