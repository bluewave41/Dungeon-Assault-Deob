import java.lang.reflect.*;

final class il_
{
    static int[] _d;
    //original name: _b
    static String desc_giant_rats;
    static bn_ _c;
    static int _a;
    private Object _e;
    
    final Graphic a316(final int n) {
        if (!(this._e instanceof Graphic)) {
            try {
                if (n != 16) {
                    this._e = null;
                }
                return (Graphic)hd_._e.invoke(this._e, (Object[])null);
            }
            catch (IllegalAccessException ex) {}
            catch (InvocationTargetException ex2) {}
            return null;
        }
        return (Graphic)this._e;
    }
    
    static final boolean a778(final char c) {
        if (Character.isISOControl(c)) {
            return false;
        }
        if (pp_.isCharacterOrDigit(c)) {
            return true;
        }
        final char[] f = new char[] { ' ', ' ', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
        for (int n = 0; f.length > n; ++n) {
            if (c == f[n]) {
                return true;
            }
        }
        final char[] c2 = new char[] { '[', ']', '#' };
        for (int n2 = 0; c2.length > n2; ++n2) {
            if (c == c2[n2]) {
                return true;
            }
        }
        return false;
    }
    
    il_(final Graphic e) {
        this._e = e;
        if (hd_._h != null) {
            ql_._e[0] = e;
            try {
                this._e = hd_._h.newInstance(ql_._e);
            }
            catch (IllegalAccessException ex) {}
            catch (InvocationTargetException ex2) {}
            catch (InstantiationException ex3) {}
        }
    }
    
    public static void a423() {
        il_._d = null;
        il_.desc_giant_rats = null;
        il_._c = null;
    }
    
    static {
        il_.desc_giant_rats = "Most dungeon rooms contain rats scavenging for food. The rats in this room are much, much larger and do more than scavenge.";
        il_._c = null;
        il_._d = new int[] { 15, 15, 16 };
    }
}
