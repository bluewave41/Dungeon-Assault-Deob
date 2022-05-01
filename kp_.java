final class kp_
{
	//original name: _d
    static String mustlogin_notloggedin;
    static ef_ _b;
    static int _c;
    static int _e;
    static int[] _a;
    
    static final void a150(final int n) {
        ib_.a150();
        if (null != c_.canvas) {
            pd_.a035(c_.canvas);
        }
        hf_.i423();
        fd_.a150();
        lm_.b423();
        if (ef_.b154()) {
            Trap._B.storeFuzzedOpcode(1);
            op_.writeToServer(0, 0);
        }
        tl_.a150(n - 72);
        if (n != 1) {
            kp_._b = null;
        }
    }
    
    public static void b150() {
        kp_._a = null;
        kp_._b = null;
        kp_.mustlogin_notloggedin = null;
    }
    
    static {
        kp_.mustlogin_notloggedin = "You are not currently logged in to the game.";
        kp_._b = new ef_();
    }
}
