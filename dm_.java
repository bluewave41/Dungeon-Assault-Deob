final class dm_
{
    static Graphic[] _d;
    static Graphic[] _a;
    static Graphic _g;
    static Graphic _f;
    //original name: _c
    static String text_modifier_blinded;
    //original name: _e
    static String[] ability_firststrike_brief;
    //original name: _b
    static String desc_crusher;
    
    static final boolean c154(final int n) {
        return kh_._n >= 10 && !tl_._l && !dh_.a427();
    }
    
    static final String a738(final int n) {
        String s = "";
        if (null != wo_._e) {
            s = wo_._e.getButtonText();
        }
        if (0 == s.length()) {
            s = dc_.getTitle();
        }
        if (0 == s.length()) {
            s = fb_.DEFAULT_PLAYER_NAME;
        }
        return s;
    }
    
    static final void a731(final md_ md_, final int[] array, final int n, final int n2, final int n3) {
        if (!bo_._Jb.a370(n3)) {
            return;
        }
        if (n > array[n2]) {
            return;
        }
        array[n2] = n;
        final a_ a_ = new a_(n2);
        a_ a_2;
        for (a_2 = (a_)md_.e024(); null != a_2; a_2 = (a_)md_.a024(4)) {
            if (array[a_2._j] > n) {
                so_.a985((byte)60, a_2, a_);
                break;
            }
        }
        if (null == a_2) {
            md_.a865(a_);
        }
    }
    
    public static void b150() {
        dm_._g = null;
        dm_.desc_crusher = null;
        dm_._d = null;
        dm_._a = null;
        dm_.text_modifier_blinded = null;
        dm_.ability_firststrike_brief = null;
        dm_._f = null;
    }
    
    static {
        dm_.ability_firststrike_brief = new String[] { "First Strike", "Always attacks first." };
        dm_.text_modifier_blinded = "Blinded";
        dm_.desc_crusher = "The floor of this room is covered in blood, and the sound of machinery creaking echoes ominously overhead.";
    }
}
