import java.awt.*;

abstract class c_
{
	//original name: _e
    static String text_dragons_of_renown;
    //original name: _f
    int componentHeight;
    int[] _g;
    //original name: _b
    int componentWidth;
    //original name: _h
    static Canvas canvas;
    static od_ _d;
    //original name: _c
    static String text_raider_snuck_past_guardian;
    //original name: _a
    Image image;
    
    abstract void a345(final byte p0, final Component p1, final int p2, final int p3);
    
    //original signature: abstract void a433(final int p0, boolean p1, final Graphics p2, final int p3);
    abstract void drawImage(final int p0, final Graphics p2, final int p3);
    
    //original signature: final void a487(final boolean b) {
    final void a487() {
        gf_.a397(this._g, this.componentWidth, this.componentHeight);
    }
    
    //original signature: static final void a842(final int n, final int n2, final int n3) {
    static final void a842(final int yPosition) {
        vd_.a669(640, 0, 0, 0, yPosition);
    }
    
    public static void a150() {
        c_.canvas = null;
        c_.text_raider_snuck_past_guardian = null;
        c_._d = null;
        c_.text_dragons_of_renown = null;
    }
    
    static {
        c_.text_dragons_of_renown = "Dragons of Renown";
        c_.text_raider_snuck_past_guardian = "Raider snuck past guardian and disarmed it.";
        c_._d = new od_();
    }
}
