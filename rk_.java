import java.net.*;
import java.io.*;

final class rk_ implements Runnable
{
    private qg_ _b;
    private int _j;
    private boolean _n;
    private int _i;
    //old name: _g
    private InputStream inputStream;
    private pn_ _e;
    //original name: _k
    static String[] tutorial_dragonsofrenown3;
    //old name: _o
    private OutputStream outputStream;
    private boolean _m;
    //original name: _h
    private Socket socket;
    //original name: _a
    static String text_snare;
    static long _l;
    //original name: _f
    static String[] ability_tough_brief;
    private byte[] _c;
    private int _d;
    
    public static void a487(final boolean b) {
        if (!b) {
            rk_.ability_tough_brief = null;
        }
        rk_.text_snare = null;
        rk_.tutorial_dragonsofrenown3 = null;
        rk_.ability_tough_brief = null;
    }
    
    //puts received message into array
    //original signature: final void a120(final byte[] array, final boolean b, int i, int n) throws IOException {
    final void readDataIntoArray(final byte[] array, final boolean b, int i, int n) throws IOException {
        if (!this._m) {
            if (b) {
                this._i = 17;
            }
            while (i > 0) {
                final int read = this.inputStream.read(array, n, i); //offset refers to the array
                if (read <= 0) {
                    throw new EOFException();
                }
                i -= read;
                n += read;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.c150(-6624);
    }
    
    //original name: a137 (final int n)
    final int getNumberOfAvailableBytes() throws IOException {
        if (!this._m) {
            return this.inputStream.available();
        }
        return 0;
    }
    
    final void b150(final int n) throws IOException {
        if (this._m) {
            return;
        }
        if (this._n) {
            this._n = false;
            throw new IOException();
        }
    }
    
    rk_(final Socket socket, final qg_ qg_) throws IOException {
        this(socket, qg_, 5000);
    }
    
    final void c150(final int n) {
        if (n != -6624) {
            this.outputStream = null;
        }
        if (this._m) {
            return;
        }
        synchronized (this) {
            this._m = true;
            this.notifyAll();
        }
        if (this._e != null) {
            while (this._e._c == 0) {
                pj_.a054(n + 6624, 1L);
            }
            if (1 == this._e._c) {
                try {
                    ((Thread)this._e._f).join();
                }
                catch (InterruptedException ex) {}
            }
        }
        this._e = null;
    }
    
    //original signature: a410(final byte b)
    final int readFirstByteOfPacket() throws IOException {
        if (this._m) {
            return 0;
        }
        return this.inputStream.read();
    }
    
    @Override
    public final void run() {
        try {
            while (true) {
                final int offset;
                int length;
                synchronized (this) {
                    if (this._i == this._d) {
                        if (this._m) {
                            break;
                        }
                        try {
                            this.wait();
                        }
                        catch (InterruptedException ex2) {}
                    }
                    offset = this._d;
                    if (this._d > this._i) {
                        length = -this._d + this._j;
                    }
                    else {
                        length = this._i - this._d;
                    }
                }
                if (0 < length) {
                    try {
                        this.outputStream.write(this._c, offset, length); //writes to server
                    }
                    catch (IOException ex3) {
                        this._n = true;
                    }
                    this._d = (this._d + length) % this._j;
                    try {
                        if (this._i != this._d) {
                            continue;
                        }
                        this.outputStream.flush();
                    }
                    catch (IOException ex4) {
                        this._n = true;
                    }
                }
            }
            try {
                if (this.inputStream != null) {
                    this.inputStream.close();
                }
                if (null != this.outputStream) {
                    this.outputStream.close();
                }
                if (null != this.socket) {
                    this.socket.close();
                }
            }
            catch (IOException ex5) {}
            this._c = null;
        }
        catch (Exception ex) {
            sm_.a741(ex, 1, null);
        }
    }
    
    static final void a161(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Graphic cn_) {
        final int n9 = cn_._w - (-n6 - n3 + n7);
        final int n10 = n6 + (cn_._w - (-n3 - n));
        final int n11 = n5 + cn_._A + (cn_.imageHeight >> 1);
        if (n8 < 97) {
            return;
        }
        gf_.a115(n9, 0, n10, n11 + n4);
        cn_.b326(n6 - 1, n5 - 1, n2);
        cn_.b326(n6 - 1, n5 + 1, n2);
        gf_.b331(rp_._e);
        gf_.a115(1 + n9, 0, n10 + 1, n4 + n11);
        cn_.b326(1 + n6, n5 - 1, n2);
        cn_.b326(1 + n6, 1 + n5, n2);
        gf_.b331(rp_._e);
        final int n12 = -n + (n6 + (cn_._w + cn_.imageWidth) - n3);
        final int n13 = cn_.imageWidth + cn_._w - (-n6 + n3) - n7;
        gf_.a115(n12, -n4 + n11, n13, 480);
        cn_.b326(n6 - 1, n5 - 1, n2);
        cn_.b326(n6 - 1, 1 + n5, n2);
        gf_.b331(rp_._e);
        gf_.a115(n12 + 1, n11 - n4, 1 + n13, 480);
        cn_.b326(1 + n6, n5 - 1, n2);
        cn_.b326(n6 + 1, 1 + n5, n2);
        gf_.b331(rp_._e);
    }
    
    //original signature: final void b120(final byte[] array, final boolean b, final int n, final int i) throws IOException {
    final void b120(final byte[] array, final int i) throws IOException {
        if (this._m) {
            return;
        }
        if (this._n) {
            this._n = false;
            throw new IOException();
        }
        if (null == this._c) {
            this._c = new byte[this._j];
        }
        synchronized (this) {
            for (int n2 = 0; i > n2; ++n2) {
                this._c[this._i] = array[n2]; //buffer with packets to send
                this._i = (this._i + 1) % this._j;
                if ((this._j - 100 + this._d) % this._j == this._i) {
                    throw new IOException();
                }
            }
            if (null == this._e) {
                this._e = this._b.a508(3, this);
            }
            this.notifyAll();
        }
    }
    
    //original signature: private rk_(final Socket h, final qg_ b, final int j) throws IOException {
    private rk_(final Socket socket, final qg_ b, final int j) throws IOException {
        this._i = 0;
        this._n = false;
        this._m = false;
        this._d = 0;
        this._b = b;
        (this.socket = socket).setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.inputStream = this.socket.getInputStream();
        this.outputStream = this.socket.getOutputStream();
        this._j = j;
    }
    
    static {
        rk_.text_snare = "Snare";
        rk_.ability_tough_brief = new String[] { "Toughness", "Any lethal blow becomes <col=FF0000>Defence -1</col>." };
        rk_.tutorial_dragonsofrenown3 = new String[] { null, "<%highlight>It's generally best to attack a player close to you in the table.</col> Players much higher than you are likely to be better defended, with more ferocious <%monsters> and devious <%traps>. Players far beneath you may be easier to assault, but the potential gains will be low." };
    }
}
