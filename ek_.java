import java.awt.event.*;
import java.awt.*;

final class ek_ extends Canvas implements FocusListener
{
	//original name: _j
    static String[] tutorial_defeat;
    Frame _e;
    volatile boolean _g;
    //original name: _i
    static String password;
    static tc_ _b;
    //original name: _a
    static String tip_teleport;
    static uk_ _f;
    //original name: _h
    static String[] titles_age_female;
    //original name: _d
    static String orb_preservation;
    
    //original signature: static final double a780(final int n, final int n2, final int n3) {
    static final double a780(final int n, final int playerRenown, final int targetRenown) {
        double n4 = -(targetRenown / (double)playerRenown) + 0.75;
        if (0.0 > n4) {
            n4 = 0.0;
        }
        return n4 + 25 * n / 100.0;
    }
    
    public static void a423() {
        ek_.tutorial_defeat = null;
        ek_.titles_age_female = null;
        ek_.orb_preservation = null;
        ek_._f = null;
        ek_._b = null;
        ek_.tip_teleport = null;
        ek_.password = null;
    }
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
    }
    
    @Override
    public final void paint(final Graphics graphics) {
    }
    
    @Override
    public final void focusLost(final FocusEvent focusEvent) {
        this._g = true;
    }
    
    static final Graphic[] a229(final int n) {
        return new Graphic[] { null, null, null, null, bl_.a091(n, 64), null, null, null, null };
    }
    
    final void a707(final qg_ qg_, final int n) {
        ng_.a139(qg_, this._e);
        if (n != 0) {
            this.focusGained(null);
        }
    }
    
    @Override
    public final void update(final Graphics graphics) {
    }
    
    static {
        ek_.tutorial_defeat = new String[] { "Defeat", "<%highlight>Your raider has failed!</col> When a raider is defeated in a dungeon, it will be <%highlight>teleported back to your stable to recover</col>. They will be unavailable during the rest of the raid. You can attempt this room with another raider, or try to find a different route to the <%highlight>hoard room.</col><br><br><%command>Try again with another raider, or find another route to the hoard room</col>" };
        ek_.tip_teleport = "Only triggers once per raid.";
        ek_.orb_preservation = "Orb of Preservation";
        ek_.titles_age_female = new String[] { "<%0> the Warrior", "<%0> the Veteran", "<%0> the Elder", "<%0> the Venerated", "<%0> the Ancient", "<%0> the Immortal" };
        ek_._f = new uk_();
    }
}
