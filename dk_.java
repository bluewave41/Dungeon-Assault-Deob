final class dk_ implements ca_
{
    static int _c;
    //original name: _b
    static Graphic piece_skeleton;
    //original name: _e
    static String text_title_requirements_unknown;
    //original name: _a
    static String desc_ogre_brute;
    static int _d;
    
    public static void a423() {
        dk_.desc_ogre_brute = null;
        dk_.text_title_requirements_unknown = null;
        dk_.piece_skeleton = null;
    }
    
    @Override
    public final void a623(final byte b, final lm_ lm_, final int n, final int n2, final boolean b2) {
        if (b != 34) {
            dk_.piece_skeleton = null;
        }
        final int n3 = lm_.xAxisOffset + n;
        final int n4 = n2 + lm_.yAxisOffset;
        ll_.a050(b ^ 0x20, n3, lm_.componentWidth, lm_.componentHeight, n4);
        final Graphic cn_ = sl_._c[1];
        if (lm_ instanceof GUIButton) {
            if (((GUIButton)lm_)._E) {
                cn_.b326(n3 + (1 + (-cn_.imageWidth2 + lm_.componentWidth >> 1)), 1 + n4 + (-cn_.imageHeight2 + lm_.componentHeight >> 1), 256);
            }
        }
    }
    
    //original signature: static final wh_ a747(final int n, final int n2, final String s) {
    static final MusicTrack loadMusic(final int n, final String songName) { //unpacking music
        final vh_ a109 = vh_.a109(bl_._t, songName);
        Room.a085(0, a109);
        return new MusicTrack(a109, n);
    }
    
    public dk_() {
    }
    
    static {
        dk_.text_title_requirements_unknown = "You do not meet the requirements for the title of <%0>.";
        dk_.desc_ogre_brute = "Large, hairy humanoid with a jutting lower jaw, ramshackle plate armour and a two-handed hammer. Ogres are forever hungry, but luckily for them, they can eat almost anything.";
    }
}
