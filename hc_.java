import java.io.*;

final class hc_
{
	//original name: _c
    static int loginStatusCode;
    static se_ _f;
    static int _b;
    static Graphic _a;
    //original name: _g
    static String desc_spy;
    static se_ _e;
    //original name: _d
    static int lang;
    
    static final boolean b154() {
        return (MusicTrack._d && null != gm_.playerInformation) || tl_._l;
    }
    
    public static void a150() {
        hc_._e = null;
        hc_._a = null;
        hc_._f = null;
        hc_.desc_spy = null;
    }
    
    static final String a505(Throwable d) throws IOException {
        String s;
        if (!(d instanceof b_)) {
            s = "";
        }
        else {
            final b_ b_ = (b_)d;
            d = b_.throwable;
            s = b_._c + " | ";
        }
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        d.printStackTrace(printWriter);
        printWriter.close();
        final BufferedReader bufferedReader = new BufferedReader(new StringReader(stringWriter.toString()));
        final String line = bufferedReader.readLine();
        while (true) {
            final String line2 = bufferedReader.readLine();
            if (null == line2) {
                break;
            }
            final int index = line2.indexOf(40);
            final int index2 = line2.indexOf(41, index + 1);
            String substring;
            if (-1 == index) {
                substring = line2;
            }
            else {
                substring = line2.substring(0, index);
            }
            final String trim = substring.trim();
            final String substring2 = trim.substring(trim.lastIndexOf(32) + 1);
            String s2 = s + substring2.substring(substring2.lastIndexOf(9) + 1);
            if (-1 != index && -1 != index2) {
                final int index3 = line2.indexOf(".java:", index);
                if (index3 >= 0) {
                    s2 += line2.substring(5 + index3, index2);
                }
            }
            s = s2 + ' ';
        }
        return s + "| " + line;
    }
    
    static {
        hc_.loginStatusCode = -1;
        hc_.desc_spy = "His face is obscured by the darkness of his hood and most do not notice him until his voice rasps in their ear...or his blade plunges into their back.";
        hc_._a = new Graphic(540, 140);
    }
}
