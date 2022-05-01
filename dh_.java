import java.util.*;

final class dh_ implements Iterable
{
    static af_ _b;
    //original name: _c
    static String text_warning_activate_dungeon;
    //original name: _f
    static String overxachievements;
    ll_ _d;
    static Graphic _a;
    static int _g;
    //original name: _e
    static String text_traps;
    
    //original signature: static final boolean a491() {
    //never called
    static final boolean returnTrue() {
        return true;
    }
    
    final void a520(final ll_ ll_, final boolean b) {
        if (b) {
            return;
        }
        if (null != ll_._l) {
            ll_.b423();
        }
        ll_._n = this._d;
        ll_._l = this._d._l;
        ll_._l._n = ll_;
        ll_._n._l = ll_;
    }
    
    @Override
    public final Iterator iterator() {
        return new id_(this);
    }
    
    static final void a115(final int n, final int n2, final int n3, final int n4) {
        final int[] array = new int[4];
        gf_.a331(array);
        gf_.e115(0, n4 - 16, 640, n3 + (n + n4));
        final int n5 = (200 - bl_.scroll_tile.imageWidth2 >> 1) + n2;
        for (int n6 = n4 - 16; 32 + n3 + n4 > n6; n6 += bl_.scroll_tile.imageHeight2) {
            bl_.scroll_tile.drawImage(n5, n6);
        }
        gf_.b331(array);
        ao_.scroll_top.d115(n2 + (-ao_.scroll_top.imageWidth2 + 200 >> 1), -(ao_.scroll_top.imageHeight2 >> 1) - 16 + n4, 500, 0);
        rn_.scroll_bottom.d115((200 - rn_.scroll_bottom.imageWidth2 >> 1) + n2, n3 + n4 + (20 - (rn_.scroll_bottom.imageHeight2 >> 1)), 0, 500);
    }
    
    static final void b150() {
        if (0 - hh_._b == nl_._d || nl_._d == -hh_._b + 250) {}
        ++nl_._d;
    }
    
    final ll_ b162(final boolean b) {
        final ll_ n = this._d._n;
        if (this._d != n) {
            n.b423();
            if (!b) {
                this.a520(null, false);
            }
            return n;
        }
        return null;
    }
    
    static final boolean a427() {
        return sp_._c != null && pd_._A == qa_._c;
    }
    
    //original signature: public static void a150(final int n) {
    public static void a150() {
        dh_._b = null;
        dh_.text_warning_activate_dungeon = null;
        dh_._a = null;
        dh_.overxachievements = null;
        dh_.text_traps = null;
    }
    
    private dh_() throws Throwable {
        throw new Error();
    }
    
    static {
        dh_.text_warning_activate_dungeon = "<br><br>This will activate your dungeon, allowing other players to raid it.";
        dh_._b = new af_();
        dh_.text_traps = "Traps";
    }
}
