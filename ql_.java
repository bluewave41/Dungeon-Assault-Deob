import java.awt.*;

final class ql_ extends Canvas
{
	//original name: _k
    static String fs_nonmember;
    //original name: _c
    static Graphic benefits_arrow;
    //original name: _i
    private Component component;
    //original name: _l
    static String desc_black_knight;
    static String _a;
    //original name: _h
    static String mouseoveranicon;
    static af_ _f;
    //original name: _g
    static String text_isometric;
    static int _d;
    static Object[] _e;
    static int _j;
    static int _b;
    
    @Override
    public final void update(final Graphics graphics) {
        this.component.update(graphics);
    }
    
    public static void b423() {
        ql_.text_isometric = null;
        ql_._a = null;
        ql_.fs_nonmember = null;
        ql_._f = null;
        ql_.benefits_arrow = null;
        ql_._e = null;
        ql_.desc_black_knight = null;
        ql_.mouseoveranicon = null;
    }
    
    static final boolean a726(final nh_ nh_, final nh_ nh_2, final nh_ nh_3) {
        return nh_3.a154() &&
        	   nh_3.a213(false, "commonui") && 
        	   nh_.a154() &&
        	   nh_.a213(false, "commonui") &&
        	   (nh_2.a154() &&
        	   nh_2.a213(false, "button.gif"));
    }
    
    static final void a423() {}
    
    //original signature: ql_(final Component i) {
    ql_(final Component component) {
        this.component = component;
    }
    
    @Override
    public final void paint(final Graphics graphics) {
        this.component.paint(graphics);
    }
    
    static {
        ql_.fs_nonmember = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        ql_.mouseoveranicon = "Mouse over an icon for details";
        ql_.text_isometric = "STANDARD";
        ql_.desc_black_knight = "A knight in ornate black armour, adorned with evil-looking sigils. He has a grim look about him, likely from seeing so many enemies fall before his sword.";
        ql_._f = new af_();
        ql_._j = 0;
        ql_._d = 256;
        ql_._e = new Object[1];
        ql_._b = 0;
    }
}
