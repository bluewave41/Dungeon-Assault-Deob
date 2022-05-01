final class ke_
{
	//original name: _a
    static String desc_giant_snake;
    static int _e;
    static int _b;
    static int _d;
    //original name: _c
    static String[] quickchat_shortcut_keys;
    
    static final void a115(final int n, final int n2, final int n3) {
    	jc_.a669(n2, n, n3, 0, 2, 0);
    }
    
    public static void a150() {
        ke_.desc_giant_snake = null;
        ke_.quickchat_shortcut_keys = null;
    }
    
    static final void b150(final int g) {
        synchronized (ib_._f) {
            la_.isMetaDown = ua_.isMetaDown;
            ++fc_._m;
            hj_.mouseX = wi_.mouseX;
            Animation.mouseY = dj_.mouseY;
            cp_._U = lj_._g;
            lj_._g = false;
            no_.isMetaDown = DungeonPath.isMetaDown;
            lc_.mouseX = ak_.mouseX;
            hm_.mouseY = em_.mouseY;
            DungeonPath.isMetaDown = g;
        }
    }
    
    static final pp_ a724(final int n, final Graphic cn_, final int n2) {
        jh_.c797();
        final Graphic cn_2 = new Graphic(cn_.imageWidth, cn_.imageHeight);
        cn_2.e797();
        cn_.f326(0, 0, 96);
        final Graphic d125 = cn_.d125();
        d125.e797();
        cn_.b326(0, 0, 256);
        cn_.b326(0, 0, 256);
        final Graphic a551 = GUICheckbox.a551(32, cn_, 8421631, (byte)117);
        jh_.b797();
        return new pp_(cn_, cn_2, d125, a551, n2, n);
    }
    
    //original signature: static final boolean a097(final int n, final int n2) {
    static final boolean a097(final int n2) {
        return 10 == n2 || n2 == 12 || n2 == 19 || n2 == 18 || n2 == 9;
    }
    
    static {
        ke_.desc_giant_snake = "Being a python, the snake in this room is not venomous, but its massive size makes it no less deadly to slow-witted raiders.";
        ke_._e = 0;
        ke_.quickchat_shortcut_keys = new String[] { "[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]" };
    }
}
