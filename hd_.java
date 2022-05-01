import java.lang.reflect.*;
import java.awt.image.*;
import java.awt.*;
import java.io.*;
import java.lang.ref.*;

final class hd_
{
    private int _d;
    private int _l;
    //original name: _k
    private long newIndex;
    private byte[] _n;
    static Constructor _h;
    private long _a;
    private long _c;
    private long _b;
    //original name: _f
    private CacheIndex cacheIndex;
    static int[] _j;
    private long _i;
    private long _p;
    private byte[] _o;
    static Method _e;
    //original name: _m
    static String[] titles_aggression_male;
    static od_ _g;
    
    final void c423(final byte b) throws IOException {
        this.d423((byte)(-117));
        this.cacheIndex.closeFile();
    }
    
    private final void d423(final byte b) throws IOException {
        if (-1L != this._c) {
            if (this._a != this._c) {
                this.cacheIndex.seek(this._c);
                this._a = this._c;
            }
            this.cacheIndex.a209(0, this._n, this._d);
            this._a += this._d;
            if (this._i < this._a) {
                this._i = this._a;
            }
            long n = -1L;
            if (this._c >= this._b && this._l + this._b > this._c) {
                n = this._c;
            }
            else if (this._b >= this._c && this._b < this._d + this._c) {
                n = this._b;
            }
            long n2 = -1L;
            if (this._b >= this._d + this._c || this._l + this._b < this._d + this._c) {
                if (this._l + this._b > this._c && this._l + this._b <= this._d + this._c) {
                    n2 = this._l + this._b;
                }
            }
            else {
                n2 = this._c + this._d;
            }
            if (n > -1L && n2 > n) {
                cj_.a278(this._n, (int)(n - this._c), this._o, (int)(n - this._b), (int)(n2 - n));
            }
            this._d = 0;
            this._c = -1L;
        }
    }
    
    public static void b423() {
        hd_._h = null;
        hd_._e = null;
        hd_._j = null;
        hd_.titles_aggression_male = null;
        hd_._g = null;
    }
    
    static final void a846(final String s, Color color, final boolean b, final int n) {
        try {
            final Graphics graphics = c_.canvas.getGraphics();
            if (td_._a == null) {
                td_._a = new Font("Helvetica", 1, 13);
            }
            if (b) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, up_.componentWidth, eg_.componentHeight);
            }
            if (null == color) {
                color = new Color(140, 17, 17);
            }
            try {
                if (bb_.image == null) {
                    bb_.image = c_.canvas.createImage(304, 34);
                }
                final Graphics graphics2 = bb_.image.getGraphics();
                graphics2.setColor(color);
                graphics2.drawRect(0, 0, 303, 33);
                graphics2.fillRect(2, 2, n * 3, 30);
                graphics2.setColor(Color.black);
                graphics2.drawRect(1, 1, 301, 31);
                graphics2.fillRect(2 + n * 3, 2, 300 - n * 3, 30);
                graphics2.setFont(td_._a);
                graphics2.setColor(Color.white);
                graphics2.drawString(s, (304 - s.length() * 6) / 2, 22);
                graphics.drawImage(bb_.image, up_.componentWidth / 2 - 152, eg_.componentHeight / 2 - 18, null);
            }
            catch (Exception ex) {
                final int n2 = up_.componentWidth / 2 - 152;
                final int n3 = eg_.componentHeight / 2 - 18;
                graphics.setColor(color);
                graphics.drawRect(n2, n3, 303, 33);
                graphics.fillRect(2 + n2, n3 + 2, n * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(n2 + 1, n3 + 1, 301, 31);
                graphics.fillRect(2 + (n2 + n * 3), n3 + 2, -(n * 3) + 300, 30);
                graphics.setFont(td_._a);
                graphics.setColor(Color.white);
                graphics.drawString(s, n2 + (-(6 * s.length()) + 304) / 2, 22 + n3);
            }
            if (bb_._f != null) {
                graphics.setFont(td_._a);
                graphics.setColor(Color.white);
                graphics.drawString(bb_._f, up_.componentWidth / 2 - 6 * bb_._f.length() / 2, eg_.componentHeight / 2 - 26);
            }
        }
        catch (Exception ex2) {
            c_.canvas.repaint();
        }
    }
    
    static final void a164(final int n, final boolean b, final String s, final boolean b2) {
        tn_.a150(-1);
        lg_._w.h150(1);
        wo_._e = new dn_(co_.username, null, qc_._t, b2, b);
        if (n != 8192) {
            return;
        }
        ta_._a = new jk_(lg_._w, wo_._e);
        lg_._w.a336(ta_._a, -1);
    }
    
    static final void a487(final boolean b) {
        if (b) {
            hd_._j = null;
        }
        final wj_ c = ra_._c;
        final int c2 = c.readByte();
        final int c3 = c.readByte();
        if (c2 == 0) {
            final kj_ kj_ = (kj_)cc_._i.e024();
            if (null == kj_) {
                tl_.a150(-21);
                return;
            }
            int i = nj_._b - c.currentIndex;
            final int[] l = kj_._l;
            if (i > l.length << 2) {
                i = l.length << 2;
            }
            for (int n = 0; i > n; ++n) {
                final int[] array = l;
                final int n2 = n >> 2;
                array[n2] += c.readByte() << nb_.and(768, n << 8);
            }
            kj_.a487(false);
        }
        else if (c2 != 0) {
            int l2;
            mm_ mm_;
            for (l2 = c.l137(), mm_ = (mm_)m_._a.e024(); mm_ != null && (c3 != mm_._p || mm_._r != l2); mm_ = (mm_)m_._a.a024(4)) {}
            if (null == mm_) {
                tl_.a150(-23);
                return;
            }
            mm_.a487(false);
        }
        else {
            sm_.a741(null, 1, "LR1: " + sj_.l738());
            tl_.a150(-51);
        }
    }
    
    //original signature: final void a884(final long k, final int n) throws IOException {
    final void setK(final long newIndex) throws IOException {
        if (0L > newIndex) {
            throw new IOException();
        }
        this.newIndex = newIndex;
    }
    
    //reading index data into buffer
    private final void a150(final int n) throws IOException {
        this._l = 0;
        if (this.newIndex != this._a) {
            this.cacheIndex.seek(this.newIndex);
            this._a = this.newIndex;
        }
        this._b = this.newIndex;
        while (this._l < this._o.length) {
            int n2 = -this._l + this._o.length;
            if (200000000 < n2) {
                n2 = 200000000;
            }
            //this._o will have the index data
            final int bytesRead = this.cacheIndex.readFromFile(this._l, n2, this._o); //seeked past the invalid block
            if (-1 == bytesRead) {
                break;
            }
            this._l += bytesRead;
            this._a += bytesRead;
        }
    }
    
    //original signature: final void a209(int n, final int n2, final byte[] array, int n3) throws IOException {
    final void a209(int offset, final int n2, final byte[] array, int length) throws IOException {
        try {
            if (array.length < offset + length) {
                throw new ArrayIndexOutOfBoundsException(-array.length + (length + offset));
            }
            if (-1 != this._c && this.newIndex >= this._c && this.newIndex + length <= this._d + this._c) {
                cj_.a278(this._n, (int)(this.newIndex - this._c), array, offset, length);
                this.newIndex += length;
                return;
            }
            final long k = this.newIndex; //block size
            if (this.newIndex >= this._b && this.newIndex < this._l + this._b) {
                int n6 = (int)(this._l + (-this.newIndex + this._b));
                if (length < n6) {
                    n6 = length;
                }
                cj_.a278(this._o, (int)(-this._b + this.newIndex), array, offset, n6);
                offset += n6;
                this.newIndex += n6;
                length -= n6;
            }
            if (length <= this._o.length) {
                if (length > 0) {
                    this.a150(-57); //reads main dat file into this._o
                    int l = length; //block size
                    if (l > this._l) { //this._l is how much data was read
                        l = this._l;
                    }
                    cj_.a278(this._o, 0, array, offset, l);
                    this.newIndex += l;
                    length -= l;
                    offset += l;
                }
            }
            else {
                this.cacheIndex.seek(this.newIndex);
                this._a = this.newIndex;
                while (0 < length) {
                    final int bytesRead = this.cacheIndex.readFromFile(offset, length, array);
                    if (bytesRead == -1) {
                        break;
                    }
                    this._a += bytesRead;
                    length -= bytesRead;
                    this.newIndex += bytesRead;
                    offset += bytesRead;
                }
            }
            if (this._c != -1L) {
                if (this.newIndex < this._c && length > 0) {
                    int i = offset + (int)(-this.newIndex + this._c);
                    if (i > offset + length) {
                        i = offset + length;
                    }
                    while (i > offset) {
                        --length;
                        array[offset++] = 0;
                        ++this.newIndex;
                    }
                }
                long c = -1L;
                if (this._c >= k && length + k > this._c) {
                    c = this._c;
                }
                else if (k >= this._c && k < this._c + this._d) {
                    c = k;
                }
                long j = -1L;
                if (k < this._c + this._d && length + k >= this._d + this._c) {
                    j = this._d + this._c;
                }
                else if (k + length > this._c && this._d + this._c >= k + length) {
                    j = length + k;
                }
                if (-1L < c && c < j) {
                    cj_.a278(this._n, (int)(c - this._c), array, offset + (int)(c - k), (int)(j - c));
                    if (j > this.newIndex) {
                        length -= (int)(-this.newIndex + j);
                        this.newIndex = j;
                    }
                }
            }
        }
        catch (IOException ex) {
            this._a = -1L;
            throw ex;
        }
        if (length <= 0) {
            return;
        }
        throw new EOFException();
    }
    
    //original signature: final void a837(final int n, final byte[] array) throws IOException {
    final void a837(final byte[] array) throws IOException {
        this.a209(0, -1, array, array.length);
    }
    
    static final AmbientAudioTrack a492(final int n, final String s) {
        final va_ a846 = ci_.a846(s);
        if (null == a846) {
            return null;
        }
        return new AmbientAudioTrack(a846, n);
    }
    
    final void a539(int n, final int n2, int n3, final byte[] array) throws IOException {
        try {
            if (this.newIndex + n3 > this._p) {
                this._p = n3 + this.newIndex;
            }
            if (n2 >= -75) {
                a487(true);
            }
            if (-1L != this._c) {
                if (this._c > this.newIndex || this.newIndex > this._c + this._d) {
                    this.d423((byte)115);
                }
            }
            if (this._c != -1L) {
                if (this.newIndex + n3 > this._n.length + this._c) {
                    final int n4 = (int)(this._c - this.newIndex + this._n.length);
                    cj_.a278(array, n, this._n, (int)(this.newIndex - this._c), n4);
                    n += n4;
                    this.newIndex += n4;
                    n3 -= n4;
                    this._d = this._n.length;
                    this.d423((byte)(-92));
                }
            }
            if (this._n.length < n3) {
                if (this.newIndex != this._a) {
                    this.cacheIndex.seek(this.newIndex);
                    this._a = this.newIndex;
                }
                this.cacheIndex.a209(n, array, n3);
                this._a += n3;
                if (this._a > this._i) {
                    this._i = this._a;
                }
                long n5 = -1L;
                long n6 = -1L;
                if (this.newIndex < this._b || this.newIndex >= this._l + this._b) {
                    if (this.newIndex <= this._b && this._b < this.newIndex + n3) {
                        n5 = this._b;
                    }
                }
                else {
                    n5 = this.newIndex;
                }
                if (n3 + this.newIndex > this._b && n3 + this.newIndex <= this._b + this._l) {
                    n6 = this.newIndex + n3;
                }
                else if (this.newIndex < this._b + this._l) {
                    if (this._b + this._l <= n3 + this.newIndex) {
                        n6 = this._l + this._b;
                    }
                }
                if (-1L < n5) {
                    if (n5 < n6) {
                        cj_.a278(array, (int)(-this.newIndex + (n5 + n)), this._o, (int)(n5 - this._b), (int)(n6 - n5));
                    }
                }
                this.newIndex += n3;
                return;
            }
            if (n3 > 0) {
                if (this._c == -1L) {
                    this._c = this.newIndex;
                }
                cj_.a278(array, n, this._n, (int)(-this._c + this.newIndex), n3);
                this.newIndex += n3;
                if (-this._c + this.newIndex > this._d) {
                    this._d = (int)(this.newIndex - this._c);
                }
            }
        }
        catch (IOException ex) {
            this._a = -1L;
            throw ex;
        }
    }
    
    //original signature: hd_(final CacheIndex f, final int n, final int n2) throws IOException {
    hd_(final CacheIndex cacheIndex, final int n, final int n2) throws IOException {
        this._b = -1L;
        this._d = 0;
        this._c = -1L;
        this.cacheIndex = cacheIndex;
        //original name: a411
        final long a411 = cacheIndex.getFileLength();
        this._i = a411;
        this._p = a411;
        this._n = new byte[n2];
        this._o = new byte[n];
        this.newIndex = 0L;
    }
    
    final long a411(final byte b) {
        if (b != -92) {
            return -92L;
        }
        return this._p;
    }
    
    static {
        hd_._j = new int[8192];
        hd_.titles_aggression_male = new String[] { "<%0> the Fierce", "<%0> the Cruel", "<%0> the Fell", "<%0> the Terrible", "<%0> the Savage", "<%0> the Raging", "<%0>, Bringer of Wrath", "<%0>, Lord of Chaos", "<%0> the Undefeated" };
        try {
            final Class<SoftReference> clazz = SoftReference.class;
            hd_._h = clazz.getConstructor(Object.class);
            hd_._e = clazz.getMethod("get", (Class<?>[])null);
        }
        catch (Exception ex2) {
            hd_._h = null;
        }
        hd_._g = new od_();
    }
}
