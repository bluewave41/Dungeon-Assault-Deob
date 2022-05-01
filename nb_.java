final class nb_
{
    static la_[] _a;
    //original name: _c
    static String desc_whirling_blades;
    static Graphic _d;
    static int[] _e;
    //original name: _b
    static String loading_animations;
    
    //original signature: static int a080(final int n, final int n2) {
    static int and(final int n, final int n2) {
        return n & n2;
    }
    
    public static void a423() {
        nb_._a = null;
        nb_._e = null;
        nb_.desc_whirling_blades = null;
        nb_.loading_animations = null;
        nb_._d = null;
    }
    
    static final void a150() {
        if (MusicTrack._d) {
            return;
        }
        if (MusicTrack._d = rf_._S) {
        	jb_.k423();
            bo_.g150();
        }
    }
    
    static {
        nb_.desc_whirling_blades = "Giant whirling blades concealed in the floor and walls of this room will slice less nimble raiders into chunks.<br><br>Trapped raiders permanently lose 3 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        nb_._e = new int[] { 5, 6, 22, 23, 9 };
        nb_.loading_animations = "Loading animations";
    }
}
