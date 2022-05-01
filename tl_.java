import java.net.*;
import java.io.*;

final class tl_ implements Runnable
{
	//original name: _h
    private URL url;
    private int _a;
    static nh_ _k;
    private pn_ _g;
    //original name: _i
    static Graphic benefits_button;
    //original name: _e
    static String[] days_of_week;
    //original name: _c
    static String text_title_requirements_mastery_one;
    //original name: _o
    private DataInputStream dataInputStream;
    private ec_ _j;
    private pn_ _b;
    //original name: _m
    static String[] tutorial_modifiers;
    private qg_ _f;
    private pn_ _n;
    static boolean _l;
    static boolean _d;
    
    static final char a771(final char c) {
        if (' ' != c && ' ' != c && '_' != c && c != '-') {
            if (c != '[') {
                if (']' != c) {
                    if ('#' != c) {
                        if (c != '\u00e0') {
                            if ('\u00e1' != c) {
                                if ('\u00e2' != c) {
                                    if (c != '\u00e4') {
                                        if ('\u00e3' != c) {
                                            if ('\u00c0' != c) {
                                                if ('\u00c1' != c) {
                                                    if (c != '\u00c2') {
                                                        if ('\u00c4' != c) {
                                                            if ('\u00c3' != c) {
                                                                if (c != '\u00e8') {
                                                                    if (c != '\u00e9') {
                                                                        if (c != '\u00ea') {
                                                                            if (c != '\u00eb') {
                                                                                if ('\u00c8' != c) {
                                                                                    if ('\u00c9' != c) {
                                                                                        if ('\u00ca' != c) {
                                                                                            if (c != '\u00cb') {
                                                                                                if ('\u00ed' != c) {
                                                                                                    if (c != '\u00ee') {
                                                                                                        if (c != '\u00ef') {
                                                                                                            if (c != '\u00cd') {
                                                                                                                if ('\u00ce' != c) {
                                                                                                                    if ('\u00cf' != c) {
                                                                                                                        if (c != '\u00f2') {
                                                                                                                            if (c != '\u00f3') {
                                                                                                                                if (c != '\u00f4') {
                                                                                                                                    if ('\u00f6' != c) {
                                                                                                                                        if ('\u00f5' != c) {
                                                                                                                                            if ('\u00d2' != c && c != '\u00d3' && '\u00d4' != c) {
                                                                                                                                                if (c != '\u00d6') {
                                                                                                                                                    if (c != '\u00d5') {
                                                                                                                                                        if ('\u00f9' != c) {
                                                                                                                                                            if ('\u00fa' != c) {
                                                                                                                                                                if ('\u00fb' != c) {
                                                                                                                                                                    if ('\u00fc' != c) {
                                                                                                                                                                        if (c != '\u00d9') {
                                                                                                                                                                            if ('\u00da' != c) {
                                                                                                                                                                                if ('\u00db' != c) {
                                                                                                                                                                                    if (c != '\u00dc') {
                                                                                                                                                                                        if ('\u00e7' != c) {
                                                                                                                                                                                            if ('\u00c7' != c) {
                                                                                                                                                                                                if ('\u00ff' != c) {
                                                                                                                                                                                                    if ('\u0178' != c) {
                                                                                                                                                                                                        if ('\u00f1' != c) {
                                                                                                                                                                                                            if (c != '\u00d1') {
                                                                                                                                                                                                                if ('\u00df' == c) {
                                                                                                                                                                                                                    return 'b';
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return Character.toLowerCase(c);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return 'n';
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                return 'y';
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        return 'c';
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return 'u';
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        return 'o';
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                return 'i';
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return 'e';
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return 'a';
                    }
                }
            }
            return c;
        }
        return '_';
    }
    
    final ec_ c735(final int n) {
        if (this._a == n) {
            return this._j;
        }
        return null;
    }
    
    public static void a423() {
        tl_._k = null;
        tl_.text_title_requirements_mastery_one = null;
        tl_.days_of_week = null;
        tl_.benefits_button = null;
        tl_.tutorial_modifiers = null;
    }
    
    @Override
    protected final void finalize() {
        if (null != this._g) {
            if (this._g._f != null) {
                try {
                    ((DataInputStream)this._g._f).close();
                }
                catch (Exception ex) {}
            }
            this._g = null;
        }
        if (null != this._n) {
            if (null != this._n._f) {
                try {
                    ((Socket)this._n._f).close();
                }
                catch (Exception ex2) {}
            }
            this._n = null;
        }
        if (null != this.dataInputStream) {
            try {
                this.dataInputStream.close();
            }
            catch (Exception ex3) {}
            this.dataInputStream = null;
        }
        this._b = null;
    }
    
    static final void a150(final int n) {
        if (sp_._c != null) {
            sp_._c.c150(-6624);
            sp_._c = null;
        }
    }
    
    @Override
    public final void run() {
        try {
            while (this._j.buffer.length > this._j.currentIndex) {
                final int read = this.dataInputStream.read(this._j.buffer, this._j.currentIndex, -this._j.currentIndex + this._j.buffer.length);
                if (0 > read) {
                    break;
                }
                final ec_ j = this._j;
                j.currentIndex += read;
            }
            if (this._j.buffer.length == this._j.currentIndex) {
                throw new Exception("HG1: " + this._j.buffer.length + " " + this.url);
            }
            synchronized (this) {
                this.finalize();
                this._a = 3;
            }
        }
        catch (Exception ex) {
            synchronized (this) {
                this.finalize();
                ++this._a;
            }
        }
    }
    
    final synchronized boolean d154(final int n) {
        if (this._a >= 2) {
            return true;
        }
        if (0 == this._a) {
            if (null == this._g) {
                this._g = this._f.a734(this.url);
            }
            if (this._g._c == 0) {
                return false;
            }
            if (this._g._c != 1) {
                this._g = null;
                ++this._a;
                return false;
            }
        }
        if (1 == this._a) {
            if (null == this._n) {
                this._n = this._f.a288(443, this.url.getHost());
            }
            if (this._n._c == 0) {
                return false;
            }
            if (this._n._c != 1) {
                this._n = null;
                ++this._a;
                return false;
            }
        }
        if (null == this.dataInputStream) {
            try {
                if (this._a == 0) {
                    this.dataInputStream = (DataInputStream)this._g._f;
                }
                if (1 == this._a) {
                    final Socket socket = (Socket)this._n._f;
                    socket.setSoTimeout(10000);
                    final OutputStream outputStream = socket.getOutputStream();
                    outputStream.write(17);
                    outputStream.write(n_.a381("JAGGRAB " + this.url.getFile() + "\n\n"));
                    this.dataInputStream = new DataInputStream(socket.getInputStream());
                }
                this._j.currentIndex = 0;
            }
            catch (IOException ex) {
                this.finalize();
                ++this._a;
            }
        }
        if (this._b == null) {
            this._b = this._f.a508(5, this);
        }
        if (0 != this._b._c) {
            if (1 != this._b._c) {
                this.finalize();
                ++this._a;
            }
            if (n <= 13) {
                this.finalize();
            }
            return false;
        }
        return false;
    }
    
    tl_(final qg_ f, final URL h, final int n) {
        this.url = h;
        this._f = f;
        this._j = new ec_(n);
    }
    
    static final String b738(final int n) {
        if (~dk_._c > n) {
            return to_.connectingToUpdateServerString;
        }
        if (ia_._U != null) {
            if (ia_._U.a154()) {
                return ki_.loadingTextString;
            }
            return ec_.waitingForTextString;
        }
        else {
            if (!fi_._u.a154()) {
                return qk_.waitingfor_graphics;
            }
            if (!fi_._u.a213(false, "commonui")) {
                return sa_.loading_graphics + " - " + fi_._u.b913("commonui") + "%";
            }
            if (!kg_._b.a154()) {
                return rf_.waitingfor_fonts;
            }
            if (!kg_._b.a213(false, "commonui")) {
                return mp_.loading_fonts + " - " + kg_._b.b913("commonui") + "%";
            }
            if (!ib_._b.a154()) {
                return fg_.waitingfor_extradata;
            }
            if (ib_._b.a427((byte)59)) {
                return DungeonBuilder.pleasewait_dotdotdot;
            }
            return kj_.loading_extradata + " - " + ib_._b.b137() + "%";
        }
    }
    
    static {
        tl_.days_of_week = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        tl_.tutorial_modifiers = new String[] { "Modifiers", "Some things are capable of changing the skill levels of your raider, or a dungeon room. If any of these effects are present on a raider or room, a symbol will be displayed in the corner of its portrait. A <col=00FF00>green</col> symbol means a skill level has <col=00FF00>increased</col>; a <col=FF0000>red</col> symbol indicates a skill level has <col=FF0000>decreased</col>. There are also other symbols you will encounter.<br><br><%command>Continue moving your party towards the hoard room.</col>" };
        tl_.text_title_requirements_mastery_one = "You must have charged <%0> Orb of Mastery in total to earn the title of <%1>.";
        tl_._l = true;
    }
}
