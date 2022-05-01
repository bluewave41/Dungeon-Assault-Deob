import java.io.*;

final class uo_
{
	//original name: _d
    static String text_raider_detected;
    //original name: _g
    static String[] tutorial_placeroom2;
    static int[] _b;
    static int[] _c;
    //original name: _f
    static gn_[] currentTutorialString;
    //original name: _e
    static String login;
    static Graphic _a;
    
    public static void a150() {
        uo_.currentTutorialString = null;
        uo_._c = null;
        uo_.text_raider_detected = null;
        uo_._a = null;
        uo_.login = null;
        uo_.tutorial_placeroom2 = null;
        uo_._b = null;
    }
    
    static final boolean a689(String a955, final String s) {
        a955 = tg_.replace('_', a955, "");
        final String a956 = sh_.reverseString(a955);
        return -1 != s.indexOf(a955) || s.indexOf(a956) != -1;
    }
    
    //original signature: static final void a557(final int n, final int n2, final int[] array, final Object[] array2, final int n3) {
    static final void a557(final int n2, final int[] array, final Object[] array2, final int n3) {
        if (n3 < n2) {
            final int n4 = (n2 + n3) / 2;
            int n5 = n3;
            final int n6 = array[n4];
            array[n4] = array[n2];
            array[n2] = n6;
            final Object o = array2[n4];
            array2[n4] = array2[n2];
            array2[n2] = o;
            final boolean b = Integer.MAX_VALUE != n6;
            for (int i = n3; i < n2; ++i) {
                if (((b ? 1 : 0) & i) + n6 > array[i]) {
                    final int n7 = array[i];
                    array[i] = array[n5];
                    array[n5] = n7;
                    final Object o2 = array2[i];
                    array2[i] = array2[n5];
                    array2[n5++] = o2;
                }
            }
            array[n2] = array[n5];
            array[n5] = n6;
            array2[n2] = array2[n5];
            array2[n5] = o;
            a557(n5 - 1, array, array2, n3);
            a557(n2, array, array2, 1 + n5);
        }
    }
    
    private uo_() throws Throwable {
        throw new Error();
    }
    
    //original signature: static final nh_ a385(final boolean b, final int n, final boolean b2, final int n2, final int n3, final boolean b3) {
    static final nh_ a385(final boolean b, final int n, final boolean b2, final int n2) {
        try {
            ln_ mainFile255Reader = null;
            ln_ cacheFile = null;
            if (kn_._f.mainFileDat2 != null) {
                sa_._x = new hd_(kn_._f.mainFileDat2, 5200, 0);
                kn_._f.mainFileDat2 = null;
                mainFile255Reader = new ln_(255, sa_._x, new hd_(kn_._f.mainFileIdx255, 12000, 0), 2097152);
            }
            if (sa_._x != null) {
                if (null == AmbientAudioTrack._c) {
                    AmbientAudioTrack._c = new hd_[kn_._f.cacheFileReaders.length]; //cache file length
                }
                if (null == AmbientAudioTrack._c[n2]) {
                    AmbientAudioTrack._c[n2] = new hd_(kn_._f.cacheFileReaders[n2], 12000, 0);
                    kn_._f.cacheFileReaders[n2] = null;
                }
                cacheFile = new ln_(n2, sa_._x, AmbientAudioTrack._c[n2], 2097152); //single cache file
            }
            final ti_ a407 = bl_._r.a407(false, n2, mainFile255Reader, cacheFile);
            if (b) {
                a407.d150();
            }
            return new nh_(a407, b2, n);
        }
        catch (IOException ex) {
            throw new RuntimeException(ex.toString());
        }
    }
    
    static {
        uo_.login = "Log in";
        uo_.tutorial_placeroom2 = new String[] { null, "Spend some of your initial Treasure building your dungeon, but save some for recruiting <%raiders> (about 50-100 Treasure should be sufficient). When you're finished, <col=FF0000>save your dungeon and exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>" };
        uo_._c = new int[256];
        uo_.text_raider_detected = "Your raider was detected by the monster.";
    }
}
