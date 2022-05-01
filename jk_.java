final class jk_ extends hf_
{
	//original name: _Cb
    static String priest;
    static int[] _Bb;
    static int[] _Db;
    
    @Override
    final void b340(final int n, final lm_ lm_) {
        super.b340(n, lm_);
    }
    
    //original signature: static final void j423(final byte b) {
    static final void j423() {
        final Room[] dungeonLayout = gm_.playerInformation.dungeonLayout;
        for (int i = 0; i < dungeonLayout.length; ++i) {
            final Room room = dungeonLayout[i];
            room._c = new wd_(room.trap.idleAnimation);
        }
        DungeonPath._c = null;
        im_._e = null;
        if (!gl_.topDownOrIsometric) {
            kh_.e150();
            ra_.c150();
        }
        else {
            li_.b150();
            of_.a150();
        }
        df_.b150();
    }
    
    //original signature: static final String a841(final String[] array, final String s, final int n) {
    static final String replacePlaceholders(final String[] array, final String s) {
        final int length = s.length();
        int n2 = length;
        int n3 = 0;
        while (true) {
            final int index = s.indexOf("<%", n3);
            if (index < 0) {
                break;
            }
            for (n3 = index + 2; length > n3 && qm_.a331(57, s.charAt(n3)); ++n3) {}
            final String substring = s.substring(2 + index, n3);
            if (!sj_.a454(substring)) {
                continue;
            }
            if (length <= n3 || '>' != s.charAt(n3)) {
                continue;
            }
            ++n3;
            n2 += array[mm_.a978(substring, true, 10)].length() - n3 + index;
        }
        final StringBuilder sb = new StringBuilder(n2);
        int n4 = 0;
        int n5 = 0;
        while (true) {
            final int index2 = s.indexOf("<%", n5);
            if (index2 < 0) {
                break;
            }
            for (n5 = index2 + 2; n5 < length && qm_.a331(57, s.charAt(n5)); ++n5) {}
            final String substring2 = s.substring(index2 + 2, n5);
            if (!sj_.a454(substring2)) {
                continue;
            }
            if (n5 >= length || s.charAt(n5) != '>') {
                continue;
            }
            ++n5;
            final int a034 = mm_.a978(substring2, true, 10);
            sb.append(s.substring(n4, index2));
            n4 = n5;
            sb.append(array[a034]);
        }
        sb.append(s.substring(n4));
        return sb.toString();
    }
    
    public static void n150() {
        jk_._Bb = null;
        jk_.priest = null;
        jk_._Db = null;
    }
    
    jk_(final ji_ ji_, final lm_ lm_) {
        super(ji_, lm_, 33, 20, 30);
    }
    
    static final String a661(final int n, final int n2) {
        if (n <= 110) {
            return null;
        }
        return k_.a460((byte)(-122), 1, 1, n2);
    }
    
    static {
        jk_.priest = "Priest";
        jk_._Db = new int[128];
    }
}
