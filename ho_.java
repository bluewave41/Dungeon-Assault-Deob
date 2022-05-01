import java.util.*;
import java.awt.event.*;
import java.awt.*;

final class ho_ implements Iterator
{
	//original name: _f
    static String playfreeversion;
    //original name: _c
    static String text_cost_x;
    static String _i;
    private ne_ _g;
    //original name: _b
    static String text_hint_select_raider;
    //original name: _e
    static String tip_whirling_blades;
    private ne_ _d;
    private qi_ _h;
    private int _a;
    
    private final void a423(final byte b) {
        this._a = 1;
        this._g = null;
        if (b <= 51) {
            ho_._i = null;
        }
        this._d = this._h._d[0]._e;
    }
    
    @Override
    public final void remove() {
        if (this._g != null) {
            this._g.a487(false);
            this._g = null;
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void a150() {
        ho_.playfreeversion = null;
        ho_.text_hint_select_raider = null;
        ho_._i = null;
        ho_.text_cost_x = null;
        ho_.tip_whirling_blades = null;
    }
    
    static final void b423() {
        Trap._s = 0;
        for (int i = 0; i < 8; ++i) {
            if (um_.stableMembers[i] != null) {
                if (um_.stableMembers[i] != gm_.playerInformation.stableMembers[i]) {
                    if (gm_.playerInformation.stableMembers[i] == null || gm_.playerInformation.stableMembers[i].raiderId != um_.stableMembers[i].raiderId) {
                        Trap._s += ib_.a598(um_.stableMembers[i].raider);
                    }
                    else {
                        Trap._s += gj_.a498(um_.stableMembers[i].raider);
                    }
                }
            }
        }
        sn_._b.isActive = (gm_.playerInformation.unspentTreasureAmount >= Trap._s);
        PlayerInformation.a487();
    }
    
    @Override
    public final Object next() {
        if (this._h._d[this._a - 1] == this._d) {
            while (this._h._g > this._a) {
                final ne_ e = this._h._d[this._a++]._e;
                if (this._h._d[this._a - 1] == e) {
                    continue;
                }
                this._g = e;
                this._d = e._e;
                return e;
            }
            return null;
        }
        final ne_ d = this._d;
        this._g = d;
        this._d = d._e;
        return d;
    }
    
    @Override
    public final boolean hasNext() {
        if (this._h._d[this._a - 1] != this._d) {
            return true;
        }
        while (this._a < this._h._g) {
            if (this._h._d[this._a++]._e != this._h._d[this._a - 1]) {
                this._d = this._h._d[this._a - 1]._e;
                return true;
            }
            this._d = this._h._d[this._a - 1];
        }
        return false;
    }
    
    //old name: a246 (qg_ qg_, Object o)
    static final void handleEventQueue(final qg_ qg_, final Object o) {
        if (qg_.eventQueue == null) {
            return;
        }
        for (int n = 0; 50 > n && null != qg_.eventQueue.peekEvent(); ++n) {
            pj_.a054(0, 1L);
        }
        try {
            if (null != o) {
                qg_.eventQueue.postEvent(new ActionEvent(o, 1001, "dummy"));
            }
        }
        catch (Exception ex) {}
    }
    
    ho_(final qi_ h) {
        this._g = null;
        this._h = h;
        this.a423((byte)67);
    }
    
    static {
        ho_.playfreeversion = "Play free version";
        ho_.text_cost_x = "Cost: <%0>";
        ho_.tip_whirling_blades = "<col=FF0000>Defence -3</col>";
        ho_.text_hint_select_raider = "Select a party leader, who will be first to enter the next room.";
    }
}
