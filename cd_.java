final class cd_
{
	//original name: _a
    private String username;
    static boolean _b;
    static md_ _g;
    static gd_ _d;
    private boolean _c;
    //original name: _h
    static String quit;
    static int _e;
    //original signature: _f
    static RegisterScreen registerScreen;
    
    final boolean a427(final byte b) {
        return this._c;
    }
    
    //original signature: cd_(final String s) {
    cd_(final String username) {
        this(username, false);
    }
    
    //original signature: final String b738(final int n) {
    final String getUsername() {
        return this.username;
    }
    
    //original signature: public static void a150(final int n) {
    public static void a150() {
        cd_.quit = null;
        cd_._d = null;
        cd_.registerScreen = null;
        cd_._g = null;
    }
    
    //original signature: cd_(final String a, final boolean c) {
    cd_(final String username, final boolean c) {
        this.username = username;
        if (null == this.username) {
            this.username = "";
        }
        this._c = c;
        if (0 == this.username.length()) {
            this._c = false;
        }
    }
    
    static {
        cd_._b = false;
        cd_.quit = "Quit";
        cd_._g = new md_();
    }
}
