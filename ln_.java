import java.io.*;

final class ln_
{
    static int _e;
    private int _b;
    static int _d;
    //original name: _c
    static String create_select_alternative;
    private int _a;
    //original name: _f
    private hd_ mainDatFile;
    //original name: _g
    private hd_ cacheFile;
    
    static final void a118(final ni_ ni_) {
        wa_._j.a501(ni_);
    }
    
    static final String a173(final int n, final String s) {
        final String title = bh_.getTitle(n);
        if (title != null) {
            return jk_.replacePlaceholders(new String[] { s }, title);
        }
        return s;
    }
    
    final byte[] a104(final int n, final int n2) {
        synchronized (this.mainDatFile) {
            try {
                if (6 + n * 6 > this.cacheFile.a411((byte)(-92))) {
                    return null;
                }
                this.cacheFile.setK(6 * n);
                this.cacheFile.a209(0, -1, un_._c, 6);
                //un._c contains the index file data
                final int n3 = ((0xFF & un_._c[0]) << 16) + (((un_._c[1] & 0xFF) << 8) + (un_._c[2] & 0xFF));
                int n4 = (un_._c[5] & 0xFF) + (((un_._c[4] & 0xFF) << 8) + ((un_._c[3] & 0xFF) << 16)); //why is this 1?
                if (n3 < 0 || n3 > this._b) {
                    return null;
                }
                if (n4 <= 0 || n4 > this.mainDatFile.a411((byte)(-92)) / 520L) {
                    return null;
                }
                final byte[] array = new byte[n3];
                int i = 0;
                int n5 = 0;
                while (i < n3) {
                    if (n4 == 0) {
                        return null;
                    }
                    this.mainDatFile.setK(n4 * 520); 
                    int n6 = n3 - i;
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    if (n > 65535) {
                        n7 = 10;
                        if (510 < n6) {
                            n6 = 510;
                        }
                        this.mainDatFile.a209(0, -1, un_._c, n7 + n6);
                        n8 = ((0xFF & un_._c[6]) << 16) - (-((un_._c[7] & 0xFF) << 8) - (un_._c[8] & 0xFF));
                        n9 = (0xFF & un_._c[9]);
                        n10 = (un_._c[3] & 0xFF) + ((0xFF00 & un_._c[2] << 8) + (0xFF000000 & un_._c[0] << 24) + ((un_._c[1] & 0xFF) << 16));
                        n11 = ((un_._c[4] & 0xFF) << 8) + (0xFF & un_._c[5]);
                    }
                    else {
                        if (512 < n6) {
                            n6 = 512;
                        }
                        n7 = 8;
                        this.mainDatFile.a209(0, -1, un_._c, n7 + n6); //reads main file data into un._c
                        n10 = (0xFF00 & un_._c[0] << 8) + (0xFF & un_._c[1]); //header stuff
                        n9 = (0xFF & un_._c[7]);
                        n8 = ((un_._c[5] & 0xFF) << 8) + (((un_._c[4] & 0xFF) << 16) + (0xFF & un_._c[6]));
                        n11 = (un_._c[3] & 0xFF) + (0xFF00 & un_._c[2] << 8);
                    }
                    if (n10 != n || n5 != n11 || n9 != this._a) { //verify header
                        return null;
                    }
                    if (0 > n8 || n8 > this.mainDatFile.a411((byte)(-92)) / 520L) {
                        return null;
                    }
                    final int j = n7 + n6; //block size
                    n4 = n8;
                    ++n5;
                    for (int n12 = n7; j > n12; ++n12) { //copy data bits into array
                        array[i++] = un_._c[n12];
                    }
                }
                return array;
            }
            catch (IOException ex) {
                return null;
            }
        }
    }
    
    static final void a157(final long n) {
        try {
            Thread.sleep(n);
        }
        catch (InterruptedException ex) {}
    }
    
    static final cd_ a683(final byte b) {
        final String username = vl_.getUsername();
        if (username != null) {
            if (0 > username.indexOf('@')) {}
        }
        if (b != -120) {
            ln_._e = -79;
        }
        return new cd_(vl_.getUsername(), pi_.c154());
    }
    
    public static void b150() {
        ln_.create_select_alternative = null;
    }
    
    private final boolean a664(final boolean b, final int n, final int n2, boolean b2, final byte[] array) {
        synchronized (this.mainDatFile) {
            try {
                int n3;
                if (!b2) {
                    n3 = (int)((this.mainDatFile.a411((byte)(-92)) + 519L) / 520L);
                    if (n3 == 0) {
                        n3 = 1;
                    }
                }
                else {
                    if (this.cacheFile.a411((byte)(-92)) < 6 * n2 + 6) {
                        return false;
                    }
                    this.cacheFile.setK(n2 * 6);
                    this.cacheFile.a209(0, -1, un_._c, 6);
                    n3 = ((0xFF & un_._c[4]) << 8) + ((0xFF & un_._c[3]) << 16) + (0xFF & un_._c[5]);
                    if (n3 <= 0 || n3 > this.mainDatFile.a411((byte)(-92)) / 520L) {
                        return false;
                    }
                }
                un_._c[5] = (byte)n3;
                un_._c[3] = (byte)(n3 >> 16);
                un_._c[4] = (byte)(n3 >> 8);
                un_._c[2] = (byte)n;
                un_._c[0] = (byte)(n >> 16);
                un_._c[1] = (byte)(n >> 8);
                this.cacheFile.setK(6 * n2);
                this.cacheFile.a539(0, -91, 6, un_._c);
                int i = 0;
                if (!b) {
                    this._b = 88;
                }
                int n4 = 0;
                while (i < n) {
                    int n5 = 0;
                    if (b2) {
                        this.mainDatFile.setK(520 * n3);
                        int n6;
                        int n7;
                        int n8;
                        if (65535 < n2) {
                            try {
                                this.mainDatFile.a209(0, -1, un_._c, 10);
                            }
                            catch (EOFException ex) {
                                break;
                            }
                            n6 = ((un_._c[1] & 0xFF) << 16) + ((0xFF000000 & un_._c[0] << 24) + (un_._c[2] << 8 & 0xFF00) + (un_._c[3] & 0xFF));
                            n5 = (un_._c[7] << 8 & 0xFF00) + ((un_._c[6] & 0xFF) << 16) + (0xFF & un_._c[8]);
                            n7 = ((0xFF & un_._c[4]) << 8) + (0xFF & un_._c[5]);
                            n8 = (0xFF & un_._c[9]);
                        }
                        else {
                            try {
                                this.mainDatFile.a209(0, -1, un_._c, 8);
                            }
                            catch (EOFException ex2) {
                                break;
                            }
                            n7 = (0xFF00 & un_._c[2] << 8) + (un_._c[3] & 0xFF);
                            n8 = (un_._c[7] & 0xFF);
                            n5 = (un_._c[4] << 16 & 0xFF0000) + (((un_._c[5] & 0xFF) << 8) + (0xFF & un_._c[6]));
                            n6 = (un_._c[1] & 0xFF) + (un_._c[0] << 8 & 0xFF00);
                        }
                        if (n6 != n2 || n4 != n7 || this._a != n8) {
                            return false;
                        }
                        if (0 > n5 || this.mainDatFile.a411((byte)(-92)) / 520L < n5) {
                            return false;
                        }
                    }
                    if (n5 == 0) {
                        n5 = (int)((519L + this.mainDatFile.a411((byte)(-92))) / 520L);
                        b2 = false;
                        if (n5 == 0) {
                            ++n5;
                        }
                        if (n5 == n3) {
                            ++n5;
                        }
                    }
                    if (512 >= -i + n) {
                        n5 = 0;
                    }
                    if (65535 >= n2) {
                        un_._c[2] = (byte)(n4 >> 8);
                        un_._c[6] = (byte)n5;
                        un_._c[5] = (byte)(n5 >> 8);
                        un_._c[1] = (byte)n2;
                        un_._c[4] = (byte)(n5 >> 16);
                        un_._c[7] = (byte)this._a;
                        un_._c[3] = (byte)n4;
                        un_._c[0] = (byte)(n2 >> 8);
                        this.mainDatFile.setK(520 * n3);
                        this.mainDatFile.a539(0, -97, 8, un_._c);
                        int n9 = -i + n;
                        if (512 < n9) {
                            n9 = 512;
                        }
                        this.mainDatFile.a539(i, -125, n9, array);
                        i += n9;
                    }
                    else {
                        un_._c[1] = (byte)(n2 >> 16);
                        un_._c[7] = (byte)(n5 >> 8);
                        un_._c[5] = (byte)n4;
                        un_._c[6] = (byte)(n5 >> 16);
                        un_._c[4] = (byte)(n4 >> 8);
                        un_._c[3] = (byte)n2;
                        un_._c[0] = (byte)(n2 >> 24);
                        un_._c[9] = (byte)this._a;
                        un_._c[2] = (byte)(n2 >> 8);
                        un_._c[8] = (byte)n5;
                        this.mainDatFile.setK(n3 * 520);
                        this.mainDatFile.a539(0, -116, 10, un_._c);
                        int n10 = -i + n;
                        if (n10 > 510) {
                            n10 = 510;
                        }
                        this.mainDatFile.a539(i, -106, n10, array);
                        i += n10;
                    }
                    ++n4;
                    n3 = n5;
                }
                return true;
            }
            catch (IOException ex3) {
                return false;
            }
        }
    }
    
    @Override
    public final String toString() {
        return "" + this._a;
    }
    
    final boolean a267(final byte[] array, final int n, final int n2, final int n3) {
        if (n3 != -29447) {
            return false;
        }
        synchronized (this.mainDatFile) {
            if (n2 >= 0 && this._b >= n2) {
                boolean b = this.a664(true, n2, n, true, array);
                if (!b) {
                    b = this.a664(true, n2, n, false, array);
                }
                return b;
            }
            throw new IllegalArgumentException();
        }
    }
    
    static final boolean a154() {
        return bl_._r.b427((byte)113);
    }
    
    //a is 255
    ln_(final int a, final hd_ f, final hd_ g, final int b) {
        this._b = 65000;
        this.mainDatFile = null;
        this.cacheFile = null;
        this.mainDatFile = f;
        this.cacheFile = g;
        this._a = a;
        this._b = b;
    }
    
    static {
        ln_.create_select_alternative = "Use this alternative as your account name";
    }
}
