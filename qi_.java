import java.util.*;

final class qi_ implements Iterable
{
    static double _a;
    static Graphic[] _f;
    //original name: _h
    static String ability_room_armoured_message;
    static int _b;
    static pn_ _e;
    static Graphic _i;
    private ne_ _j;
    //original name: _c
    static String desc_warlock;
    ne_[] _d;
    int _g;
    
    @Override
    public final Iterator iterator() {
        return new ho_(this);
    }
    
    final void a957(final long h, final byte b, final ne_ ne_) {
        if (ne_._a != null) {
            ne_.a487(false);
        }
        if (b > -127) {
            return;
        }
        final ne_ e = this._d[(int)(h & (long)(this._g - 1))];
        ne_._a = e._a;
        ne_._e = e;
        ne_._a._e = ne_;
        ne_._e._a = ne_;
        ne_._h = h;
    }
    
    final ne_ a808(final int n, final long n2) {
        final ne_ ne_ = this._d[(int)((long)(this._g - n) & n2)];
        this._j = ne_._e;
        while (this._j != ne_) {
            if (this._j._h == n2) {
                final ne_ j = this._j;
                this._j = this._j._e;
                return j;
            }
            this._j = this._j._e;
        }
        return this._j = null;
    }
    
    private qi_() throws Throwable {
        throw new Error();
    }
    
    public static void a487() {
        qi_.desc_warlock = null;
        qi_._e = null;
        qi_.ability_room_armoured_message = null;
        qi_._i = null;
        qi_._f = null;
    }
    
    static {
        qi_._a = 0.0;
        qi_.ability_room_armoured_message = "The <%0> is undamaged!";
        qi_.desc_warlock = "Years spent studying the dark arts, in service to the corrupt human nobles of the west, have given the sorceress the knowledge to tame the elements and turn them against her foes.";
    }
}
