import java.nio.charset.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.net.Proxy;
import java.lang.reflect.*;

final class ha_ extends um_
{
	//original name: _n
    static String[] mustlogin2;
    //original name: _j
    static String[] tutorial_hoardroom;
    //original name: _m
    private ProxySelector proxySelector;
    //original name: _o
    static String connectionlost_reconnecting;
    static lc_ _k;
    //original name: _l
    static String[] ability_boostdef_brief;
    
    static final void d150(final int v) {
        vf_._w = 620;
        qc_._w = 240;
        kn_.isTutorial = true;
        id_._l = null;
        gk_._L = null;
        wi_._kb = 0;
        jn_._l = null;
        hc_._b = 0;
        Raider._f = null;
        ui_._a = 0;
        ce_._p = -1;
        bl_._l = null;
        pp_._K = new md_();
        ti_._A = sj_.a595(dh_._a, 37);
        ti_._A._v = 1;
        tk_._k = sj_.a595(fl_._i, 107);
        ec_._n = sj_.a595(DungeonPath._h, 59);
        ec_._n._v = v;
        pp_._K.a865(ti_._A);
        pp_._K.a865(tk_._k);
        pp_._K.a865(ec_._n);
        o_.dungeonPath.clearDungeonPath();
    }
    
    private final Socket a879(final int n, final byte b, final String s, final String s2) throws IOException {
        final Socket socket = new Socket(s, n);
        socket.setSoTimeout(10000);
        final OutputStream outputStream = socket.getOutputStream();
        if (null != s2) {
            outputStream.write(("CONNECT " + super.hostName + ":" + super.port + " HTTP/1.0\n" + s2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
        }
        else {
            outputStream.write(("CONNECT " + super.hostName + ":" + super.port + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        }
        outputStream.flush();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        final String line = bufferedReader.readLine();
        if (null != line) {
            if (line.startsWith("HTTP/1.0 200") || line.startsWith("HTTP/1.1 200")) {
                return socket;
            }
            if (line.startsWith("HTTP/1.0 407") || line.startsWith("HTTP/1.1 407")) {
                int n2 = 0;
                final String s3 = "proxy-authenticate: ";
                for (String s4 = bufferedReader.readLine(); null != s4 && 50 > n2; ++n2, s4 = bufferedReader.readLine()) {
                    if (s4.toLowerCase().startsWith(s3)) {
                        String s5 = s4.substring(s3.length()).trim();
                        final int index = s5.indexOf(32);
                        if (index != -1) {
                            s5 = s5.substring(0, index);
                        }
                        throw new wl_(s5);
                    }
                }
                throw new wl_("");
            }
        }
        outputStream.close();
        bufferedReader.close();
        if (b < 6) {
            d150(66);
        }
        socket.close();
        return null;
    }
    
    @Override
    final Socket b693(final int n) throws IOException {
        final boolean boolean1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (n != 13905) {
            return null;
        }
        if (!boolean1) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        final boolean b = 443 == super.port;
        List<Proxy> select;
        List<Proxy> select2;
        try {
            select = this.proxySelector.select(new URI((b ? "https" : "http") + "://" + super.hostName));
            select2 = this.proxySelector.select(new URI((b ? "http" : "https") + "://" + super.hostName));
        }
        catch (URISyntaxException ex) {
            return this.getNewSocket();
        }
        select.addAll(select2);
        final Object[] array = select.toArray();
        wl_ wl_ = null;
        final Object[] array2 = array;
        for (int n2 = 0; array2.length > n2; ++n2) {
            final Proxy proxy = (Proxy)array2[n2];
            try {
                final Socket a867 = this.a867(proxy, n - 13285);
                if (null != a867) {
                    return a867;
                }
            }
            catch (wl_ wl_2) {
                wl_ = wl_2;
            }
            catch (IOException ex2) {}
        }
        if (null == wl_) {
            return this.getNewSocket();
        }
        throw wl_;
    }
    
    private final Socket a867(final Proxy proxy, final int n) throws IOException {
        if (proxy.type() == Proxy.Type.DIRECT) {
            return this.getNewSocket();
        }
        final SocketAddress address = proxy.address();
        if (!(address instanceof InetSocketAddress)) {
            return null;
        }
        if (n != 620) {
            ha_.connectionlost_reconnecting = null;
        }
        final InetSocketAddress inetSocketAddress = (InetSocketAddress)address;
        /*if (proxy.type() == Proxy.Type.HTTP) {
            String string = null;
            try {
                final Class<AuthenticationInfo> clazz = AuthenticationInfo.class;
                final Method declaredMethod = clazz.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
                declaredMethod.setAccessible(true);
                final Object invoke = declaredMethod.invoke(null, inetSocketAddress.getHostName(), new Integer(inetSocketAddress.getPort()));
                if (invoke != null) {
                    final Method declaredMethod2 = clazz.getDeclaredMethod("supportsPreemptiveAuthorization", (Class<?>[])new Class[0]);
                    declaredMethod2.setAccessible(true);
                    if (declaredMethod2.invoke(invoke, new Object[0])) {
                        final Method declaredMethod3 = clazz.getDeclaredMethod("getHeaderName", (Class<?>[])new Class[0]);
                        declaredMethod3.setAccessible(true);
                        final Method declaredMethod4 = clazz.getDeclaredMethod("getHeaderValue", URL.class, String.class);
                        declaredMethod4.setAccessible(true);
                        string = (String)declaredMethod3.invoke(invoke, new Object[0]) + ": " + (String)declaredMethod4.invoke(invoke, new URL("https://" + super._a + "/"), "https");
                    }
                }
            }
            catch (Exception ex) {}
            return this.a879(inetSocketAddress.getPort(), (byte)113, inetSocketAddress.getHostName(), string);
        }*/
        if (proxy.type() == Proxy.Type.SOCKS) {
            final Socket socket = new Socket(proxy);
            socket.connect(new InetSocketAddress(super.hostName, super.port));
            return socket;
        }
        return null;
    }
    
    static final boolean b427() {
        synchronized (in_._C) {
            if (je_._i != pj_._x) {
                mm_._t = jk_._Db[je_._i];
                ob_._Yb = b_.keysUserPressed[je_._i];
                je_._i = (0x7F & je_._i + 1);
                return true;
            }
            return false;
        }
    }
    
    //original signature: static final double a405() {
    static final double getRandomDouble() {
        return ld_.random.nextDouble();
    }
    
    public static void c150() {
        ha_.connectionlost_reconnecting = null;
        ha_._k = null;
        ha_.tutorial_hoardroom = null;
        ha_.mustlogin2 = null;
        ha_.ability_boostdef_brief = null;
    }
    
    ha_() {
        this.proxySelector = ProxySelector.getDefault();
    }
    
    static {
        ha_.tutorial_hoardroom = new String[] { "Hoard Room", "You have reached the <%highlight>hoard room</col>! You can now select <%highlight>how much gold you wish to steal</col>. For every ten pieces of gold you steal, you will gain <%highlight>one point of Renown</col> - but the chance of waking the dragon increases as your raiders become more ambitious! If the Dragon wakes, <%highlight>some of your raiders may be killed</col>." };
        ha_.connectionlost_reconnecting = "Connection lost - attempting to reconnect";
        ha_.mustlogin2 = new String[] { null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must" };
        ha_.ability_boostdef_brief = new String[] { "Harden Raider", "Double target <%defence> in the next room. (Single use)" };
    }
}
