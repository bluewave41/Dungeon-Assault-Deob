import java.applet.*;

final class oj_
{
	//original name: _a
    static Graphic menu_moss_2;
    static boolean _b;
    //original name: _c
    static String text_orb_warning;
    
    static final int a170(final String s, final int[] array, final se_ se_) {
        if (null == wk_._a) {
            wk_._a = new String[32];
        }
        int a899;
        while (true) {
            try {
                a899 = se_.a899(s, array, wk_._a);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                if (wk_._a.length >= 1024) {
                    return -1;
                }
                wk_._a = new String[wk_._a.length << 1];
                continue;
            }
            break;
        }
        return a899;
    }
    
    static final int a353(int n) {
        n &= 0x1FFF;
        if (4096 <= n) {
            return (6144 > n) ? (-jb_._Tb[n - 4096]) : (-jb_._Tb[8192 - n]);
        }
        return (n < 2048) ? jb_._Tb[n] : jb_._Tb[-n + 4096];
    }
    
    public static void a423(final byte b) {
        oj_.menu_moss_2 = null;
        if (b != -29) {
            a423((byte)67);
        }
        oj_.text_orb_warning = null;
    }
    
    static final void a871(final int n, final mm_ mm_) {
        final wj_ b = Trap._B;
        b.storeFuzzedOpcode(n);
        final wj_ wj_ = b;
        ++wj_.currentIndex;
        final int o = b.currentIndex;
        b.storeByte(1);
        b.storeByte(mm_._p);
        b.f093(-65, mm_._r);
        b.storeInt(mm_._i);
        b.storeInt(mm_._l);
        b.storeInt(mm_._n);
        b.storeInt(mm_._o);
        b.calculateAndStoreChecksum(o);
        b.c093(-o + b.currentIndex, -1);
    }
    
    static final String a326(final Applet applet) {
        try {
            final String string = applet.getParameter("cookieprefix") + "settings";
            final String[] a640 = ih_.split(';', (String)ee_.a460(applet, "getcookies"));
            for (int i = 0; i < a640.length; ++i) {
                final int index = a640[i].indexOf('=');
                if (index >= 0 && a640[i].substring(0, index).trim().equals(string)) {
                    return a640[i].substring(1 + index).trim();
                }
            }
        }
        catch (Throwable t) {}
        if (ql_._a == null) {
            return applet.getParameter("settings");
        }
        return ql_._a;
    }
    
    static {
        oj_.text_orb_warning = "An Orb of Mastery takes one week to charge. When finished, its effects will apply to you permanently, but the backlash of power will destroy your dungeon and stable - you must rebuild them!<br><br> Some of your Treasure will survive the blast and can help you shape your new dungeon faster.<br><br>Are you sure you wish to construct an Orb of Mastery now?";
    }
}
