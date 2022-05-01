import java.util.*;

final class mo_
{
	//original name: _e
    static int instructionPageIndex; //index of which instructions page the player is on
    ec_ _c;
    static int _a;
    //original name: _b
    static String text_hint_revive;
    static String[] _g;
    //original name: _h
    static String text_raider_avoided_detection;
    //original name: _f
    static String text_charge_tooltip;
    //original name: _d
    static String toserverlist;
    
    static final boolean b154() {
        final oe_ oe_ = (oe_)fe_._k.e024();
        if (oe_ != null) {
            for (int n = 0; oe_._q > n; ++n) {
                if (oe_._s[n] != null) {
                    if (0 == oe_._s[n]._c) {
                        return false;
                    }
                }
                if (null != oe_._o[n]) {
                    if (0 == oe_._o[n]._c) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    static final boolean a244(final int[] array, final int n, final Random random) {
        int a004;
        for (int n2 = array.length - 2; 0 < n2; --n2, array[a004] = array[n2]) {
            a004 = uj_.getRandom(random, n2);
            final int n3 = array[a004];
            if (0 == me_.dungeonLayout[n3].roomType) {
                me_.dungeonLayout[n3] = new Room(n);
                return true;
            }
        }
        return false;
    }
    
    static final ab_ a263(final String s, final boolean b) {
        final int length = s.length();
        if (length == 0) {
            return ri_._e;
        }
        if (64 < length) {
            return ta_._d;
        }
        if ('\"' != s.charAt(0)) {
            if (!b) {
                mo_.toserverlist = null;
            }
            int n = 0;
            for (int i = 0; i < length; ++i) {
                final char char1 = s.charAt(i);
                if ('.' != char1) {
                    if (PlayerInformation.charset.indexOf(char1) == -1) {
                        return np_._E;
                    }
                    n = 0;
                }
                else {
                    if (i == 0 || i == length - 1 || n != 0) {
                        return np_._E;
                    }
                    n = 1;
                }
            }
            return null;
        }
        if (s.charAt(length - 1) != '\"') {
            return np_._E;
        }
        int n2 = 0;
        for (int j = 1; j < length - 1; ++j) {
            final char char2 = s.charAt(j);
            if (char2 != '\\') {
                if ('\"' == char2 && n2 == 0) {
                    return np_._E;
                }
                n2 = 0;
            }
            else {
                n2 = ((n2 == 0) ? 1 : 0);
            }
        }
        return null;
    }
    
    mo_(final int n, final ec_ c) {
        this._c = c;
    }
    
    public static void a150() {
        mo_.text_raider_avoided_detection = null;
        mo_.text_hint_revive = null;
        mo_.text_charge_tooltip = null;
        mo_._g = null;
        mo_.toserverlist = null;
    }
    
    mo_(final int n, final int n2) {
        this(n, new ec_(2));
        this._c.storeShort(n2);
    }
    
    static {
        mo_.instructionPageIndex = 0;
        mo_.text_hint_revive = "Select a raider to revive";
        mo_.text_raider_avoided_detection = "Your raider avoided detection by the monster.";
        mo_.text_charge_tooltip = "Order your raider to engage the monster in combat. <br><br>An aggressive attack,<col=8B1717>Charging</col> increases your raider's <%attack> at the expense of their <%defence>.<br><br>Requires: <col=FF0000>Attack</col>, <col=0A7500>Defence</col>, <col=00A7D2>Sneak</col>";
        mo_.toserverlist = "To server list";
    }
}
