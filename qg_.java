/*
 * Decompiled with CFR 0.151.
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class qg_
implements Runnable {
    private boolean _w = false;
    //original name: _p
    static String javaVersion;
    //original name: _r
    private static String userHomeDirectory;
    private static volatile long _a;
    //original name: _k
    private static String gameName;
    private Object _b;
    private pn_ _u = null;
    //original name: _c
    static String javaVendor;
    //original name: _n
    static String lowercaseOsName;
    private ma_ _m;
    //original name: _v
    CacheIndex[] cacheFileReaders;
    //original name: _f
    private Thread thread;
    //original name: _i
    private static String osName;
    private on_ _l;
    boolean _j = false;
    //original name: _t
    private static int numberOfCacheFiles;
    //original name: _h
    CacheIndex randomDat = null;
    static Method _g;
    //original name: _e
    EventQueue eventQueue;
    private Object _s;
    //original name: _q
    CacheIndex mainFileIdx255 = null;
    //original name: _x
    CacheIndex mainFileDat2 = null;
    //original name: _d
    private boolean isMicrosoftJava = false;
    private pn_ _o = null;

    private static final CacheIndex a237(String string, String string2, int n, int n2) {
        String string3 = n2 != 33 ? (n2 != 34 ? "jagex_" + string2 + "_preferences" + string + ".dat" : "jagex_" + string2 + "_preferences" + string + "_wip.dat") : "jagex_" + string2 + "_preferences" + string + "_rc.dat";
        String[] stringArray = new String[]{"c:/rscache/", "/rscache/", userHomeDirectory, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
        int n3 = 0;
        if (n != -35) {
            qg_.a237(null, null, -3, -52);
        }
        while (n3 < stringArray.length) {
            String string4 = stringArray[n3];
            if (0 >= string4.length() || new File(string4).exists()) {
                try {
                    CacheIndex qp_2 = new CacheIndex(new File(string4, string3), "rw", 10000L);
                    return qp_2;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            ++n3;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        while (true) {
            pn_ pn_2;
            Object object = this;
            synchronized (object) {
                while (true) {
                    if (this._w) {
                        return;
                    }
                    if (this._o != null) {
                        pn_2 = this._o;
                        this._o = this._o._a;
                        if (this._o != null) break;
                        this._u = null;
                        break;
                    }
                    try {
                        this.wait();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
            try {
                int n = pn_2._e;
                if (1 != n) {
                    if (n != 22) {
                        if (2 != n) {
                            if (4 == n) {
                                if (_a > kd_.getTime()) {
                                    throw new IOException();
                                }
                                pn_2._f = new DataInputStream(((URL)pn_2._d).openStream());
                            } else if (n != 8) {
                                if (9 != n) {
                                    if (18 != n) {
                                        if (n != 19) {
                                            if (!this._j) {
                                                throw new Exception("");
                                            }
                                            if (n == 3) {
                                                if (kd_.getTime() < _a) {
                                                    throw new IOException();
                                                }
                                                String string = (0xFF & pn_2._g >> 24) + "." + (0xFF & pn_2._g >> 16) + "." + (0xFF & pn_2._g >> 8) + "." + (0xFF & pn_2._g);
                                                pn_2._f = InetAddress.getByName(string).getHostName();
                                            } else if (21 == n) {
                                                if (kd_.getTime() < _a) {
                                                    throw new IOException();
                                                }
                                                pn_2._f = InetAddress.getByName((String)pn_2._d).getAddress();
                                            } else if (5 != n) {
                                                if (6 == n) {
                                                    Frame frame = new Frame("Jagex Full Screen");
                                                    pn_2._f = frame;
                                                    frame.setResizable(false);
                                                    if (!this.isMicrosoftJava) {
                                                        eo_.class.getMethod("enter", Frame.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this._b, frame, new Integer(pn_2._g >>> 16), new Integer(0xFFFF & pn_2._g), new Integer(pn_2._b >> 16), new Integer(pn_2._b & 0xFFFF));
                                                    } else {
                                                        //this._m.a121((byte)6, frame, pn_2._g >>> 16, pn_2._g & 0xFFFF, pn_2._b >> 16, 0xFFFF & pn_2._b);
                                                    }
                                                } else if (7 != n) {
                                                    if (n == 12) {
                                                        CacheIndex qp_2 = qg_.a237((String)pn_2._d, gameName, -35, numberOfCacheFiles);
                                                        pn_2._f = qp_2;
                                                    } else if (n != 13) {
                                                        if (!this._j || 14 != n) {
                                                            if (this._j && 15 == n) {
                                                                boolean bl = pn_2._g != 0;
                                                                Component component = (Component)pn_2._d;
                                                                if (!this.isMicrosoftJava) {
                                                                    w_.class.getDeclaredMethod("showcursor", Component.class, Boolean.TYPE).invoke(this._s, component, new Boolean(bl));
                                                                } else {
                                                                    //this._l.a834(-14677, component, bl);
                                                                }
                                                            } else if (!this.isMicrosoftJava && n == 17) {
                                                                Object[] objectArray = (Object[])pn_2._d;
                                                                w_.class.getDeclaredMethod("setcustomcursor", Component.class, int[].class, Integer.TYPE, Integer.TYPE, Point.class).invoke(this._s, objectArray[0], objectArray[1], new Integer(pn_2._g), new Integer(pn_2._b), objectArray[2]);
                                                            } else {
                                                                if (16 != n) throw new Exception("");
                                                                try {
                                                                    if (!lowercaseOsName.startsWith("win")) {
                                                                        throw new Exception();
                                                                    }
                                                                    String string = (String)pn_2._d;
                                                                    if (!string.startsWith("http://") && !string.startsWith("https://")) {
                                                                        throw new Exception();
                                                                    }
                                                                    String string2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                                                    for (int i = 0; string.length() > i; ++i) {
                                                                        if (string2.indexOf(string.charAt(i)) != -1) continue;
                                                                        throw new Exception();
                                                                    }
                                                                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"");
                                                                    pn_2._f = null;
                                                                }
                                                                catch (Exception exception) {
                                                                    pn_2._f = exception;
                                                                    throw exception;
                                                                }
                                                            }
                                                        } else {
                                                            int n2 = pn_2._g;
                                                            int n3 = pn_2._b;
                                                            if (this.isMicrosoftJava) {
                                                                //this._l.a773(n2, true, n3);
                                                            } else {
                                                                w_.class.getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this._s, new Integer(n2), new Integer(n3));
                                                            }
                                                        }
                                                    } else {
                                                        CacheIndex qp_3 = qg_.a237((String)pn_2._d, "", -35, numberOfCacheFiles);
                                                        pn_2._f = qp_3;
                                                    }
                                                } else if (!this.isMicrosoftJava) {
                                                    eo_.class.getMethod("exit", new Class[0]).invoke(this._b, new Object[0]);
                                                } else {
                                                    //this._m.a266(42, (Frame)pn_2._d);
                                                }
                                            } else {
                                                //pn_2._f = !this._d ? eo_.class.getMethod("listmodes", new Class[0]).invoke(this._b, new Object[0]) : (Object)this._m.a878(10127);
                                            }
                                        } else {
                                            Transferable transferable = (Transferable)pn_2._d;
                                            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                                            clipboard.setContents(transferable, null);
                                        }
                                    } else {
                                        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                                        pn_2._f = clipboard.getContents(null);
                                    }
                                } else {
                                    Object[] objectArray = (Object[])pn_2._d;
                                    if (this._j && null == ((Class)objectArray[0]).getClassLoader()) {
                                        throw new SecurityException();
                                    }
                                    pn_2._f = ((Class)objectArray[0]).getDeclaredField((String)objectArray[1]);
                                }
                            } else {
                                Object[] objectArray = (Object[])pn_2._d;
                                if (this._j && ((Class)objectArray[0]).getClassLoader() == null) {
                                    throw new SecurityException();
                                }
                                pn_2._f = ((Class)objectArray[0]).getDeclaredMethod((String)objectArray[1], (Class[])objectArray[2]);
                            }
                        } else {
                            Thread thread = new Thread((Runnable)pn_2._d);
                            thread.setDaemon(true);
                            thread.start();
                            thread.setPriority(pn_2._g);
                            pn_2._f = thread;
                        }
                    } else {
                        if (_a > kd_.getTime()) {
                            throw new IOException();
                        }
                        try {
                            pn_2._f = bp_.a243(pn_2._g, (String)pn_2._d).b693(13905);
                        }
                        catch (wl_ wl_2) {
                            pn_2._f = wl_2.getMessage();
                            throw wl_2;
                        }
                    }
                } else {
                    if (kd_.getTime() < _a) {
                        throw new IOException();
                    }
                    pn_2._f = new Socket(InetAddress.getByName((String)pn_2._d), pn_2._g);
                }
                pn_2._c = 1;
            }
            catch (ThreadDeath threadDeath) {
                throw threadDeath;
            }
            catch (Throwable throwable) {
                pn_2._c = 2;
            }
            object = pn_2;
            synchronized (object) {
                pn_2.notify();
            }
        }
    }

    //original signature: final pn_ a734(int n, URL uRL) {
    final pn_ a734(URL url) {
        return this.a626(0, url, 4, 0);
    }

    final boolean a154(int n) {
        if (!this._j) {
            return false;
        }
        if (n < 25) {
            this.a200(null, (byte)-13);
        }
        if (!this.isMicrosoftJava) {
            return this._b != null;
        }
        return this._m != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    //original signature: private final pn_ a626(int n, Object object, int n2, int n3, int n4) {
    private final pn_ a626(int n, Object object, int n3, int n4) {
        pn_ pn_2 = new pn_();
        pn_2._d = object;
        pn_2._g = n;
        pn_2._e = n3;
        pn_2._b = n4;
        qg_ qg_2 = this;
        synchronized (qg_2) {
            if (null != this._u) {
                this._u._a = pn_2;
                this._u = pn_2;
            } else {
                this._u = this._o = pn_2;
            }
            this.notify();
        }
        return pn_2;
    }

    //original signature: final pn_ a288(int n, int n2, String string) {
    final pn_ a288(int gamePort1, String codeHost) {
        return this.a570(codeHost, gamePort1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    //original signature: final void a423(byte by) {
    final void a423() {
        qg_ qg_2 = this;
        synchronized (qg_2) {
            this._w = true;
            this.notifyAll();
        }
        try {
            this.thread.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        if (this.mainFileDat2 != null) {
            try {
                this.mainFileDat2.closeFile();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (this.mainFileIdx255 != null) {
            try {
                this.mainFileIdx255.closeFile();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (null != this.cacheFileReaders) {
            for (int i = 0; i < this.cacheFileReaders.length; ++i) {
                if (null == this.cacheFileReaders[i]) continue;
                try {
                    this.cacheFileReaders[i].closeFile();
                    continue;
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
        }
        if (null != this.randomDat) {
            try {
                this.randomDat.closeFile();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    //original signature: final pn_ a508(int n, int n2, Runnable runnable) {
    final pn_ a508(int n2, Runnable runnable) {
        return this.a626(n2, runnable, 2, 0);
    }

    //original signature: final pn_ a240(byte by, int n, int n2, int n3, int n4) {
    final pn_ a240(int n, int n2, int n3, int n4) {
        return this.a626((n2 << 16) + n4, null, 6, n + (n3 << 16));
    }

    final pn_ a238(Component component, byte by, boolean bl) {
        if (by < 13) {
            this.cacheFileReaders = null;
        }
        return this.a626(!bl ? 0 : 1, component, 15, 0);
    }

    final pn_ a534(int n, Class clazz, String string) {
        if (n != 65535) {
            this.a626(21, null, 47, 126);
        }
        return this.a626(0, new Object[]{clazz, string}, 9, 0);
    }

    //original signature: final pn_ a256(boolean bl) {
    final pn_ a256() {
        return this.a626(0, null, 5, 0);
    }

    final pn_ a200(Frame frame, byte by) {
        if (by > -36) {
            javaVendor = null;
        }
        return this.a626(0, frame, 7, 0);
    }

    final pn_ a594(Class[] classArray, Class clazz, int n, String string) {
        if (n != -1) {
            return null;
        }
        return this.a626(0, new Object[]{clazz, string, classArray}, 8, 0);
    }

    //original signature: private final pn_ a570(boolean bl, String string, int n, int n2) {
    private final pn_ a570(String codeHost, int gamePort1) {
        return this.a626(gamePort1, codeHost, 1, 0);
    }

    //original signature: qg_(int n, String string, int n2, boolean bl) throws Exception {
    qg_() throws Exception {
        this._j = true;
        javaVendor = "Unknown";
        gameName = "dungeonassault";
        numberOfCacheFiles = 32;
        javaVersion = "1.1";
        try {
            javaVendor = System.getProperty("java.vendor");
            javaVersion = System.getProperty("java.version");
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            this.isMicrosoftJava = true;
        }
        try {
            osName = System.getProperty("os.name");
        }
        catch (Exception exception) {
            osName = "Unknown";
        }
        lowercaseOsName = osName.toLowerCase();
        try {
            System.getProperty("os.arch").toLowerCase();
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            System.getProperty("os.version").toLowerCase();
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            userHomeDirectory = System.getProperty("user.home");
            if (null != userHomeDirectory) {
                userHomeDirectory = userHomeDirectory + "/";
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (userHomeDirectory == null) {
            userHomeDirectory = "~/";
        }
        try {
            this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (!this.isMicrosoftJava) {
            try {
                Component.class.getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                _g = Container.class.getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        nc_.a871(numberOfCacheFiles, gameName);
        if (this._j) {
            this.randomDat = new CacheIndex(nc_.readCacheFile("random.dat", numberOfCacheFiles, null), "rw", 25L);
            this.mainFileDat2 = new CacheIndex(nc_.readCacheFile("main_file_cache.dat2"), "rw", 314572800L);
            this.mainFileIdx255 = new CacheIndex(nc_.readCacheFile("main_file_cache.idx255"), "rw", 0x100000L);
            this.cacheFileReaders = new CacheIndex[32];
            for (int i = 0; 32 > i; ++i) {
                this.cacheFileReaders[i] = new CacheIndex(nc_.readCacheFile("main_file_cache.idx" + i), "rw", 0x100000L);
            }
            if (this.isMicrosoftJava) {
                try {
                    pl_.class.newInstance();
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            try {
                if (this.isMicrosoftJava) {
                    this._m = new ma_();
                } else {
                    this._b = eo_.class.newInstance();
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                if (this.isMicrosoftJava) {
                    this._l = new on_();
                } else {
                    this._s = w_.class.newInstance();
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        this._w = false;
        this.thread = new Thread(this);
        this.thread.setPriority(10);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    static {
        _a = 0L;
    }
}

