import java.awt.*;
import java.util.Arrays;

final class ic_ extends mc_
{
	//original name: _A
    static String none;
    //original name: _z
    static String desc_magical_guardian_room;
    //original name: _y
    static pp_ renownTableSearchButton;
    
    static final void a540(final boolean b) {
        int n;
        if (0 >= pb_.isMember) {
            if (!tl_._l) {
                n = 1;
            }
            else {
                n = 0;
            }
        }
        else {
            if (null == il_._c) {
                cm_._R = gh_.a470(0, 0, 480, i_._A, 640);
            }
            else {
                cm_._R = il_._c.d487(92);
                gk_.a366(2, (byte)4);
            }
            if (cm_._R != null) {
                uk_.a762(cm_._R);
                n = 2;
            }
            else {
                n = 3;
            }
        }
        if (il_._c == null) {
            ae_.a183(b, n);
        }
    }
    
    //original signature: ic_(final int n) {
    ic_() {
        this(lp_._C, 10000536);
    }
    
    public static void d150() {
        ic_.none = null;
        ic_.desc_magical_guardian_room = null;
        ic_.renownTableSearchButton = null;
    }
    
    //original signature: static final void a871(final int n, final int n2, final String s) {
    static final void unpackAnimations(final int trapId, final String trapName) {
        final Trap trap = gh_.traps[trapId];
        if (null != trap) {
            trap.idleAnimation = tp_.unpackAnimation(kf_._p, "idle", trapName);
        }
    }
    
    @Override
    final String getButtonText(final lm_ lm_, final int n) {
    	char[] array = new char[lm_.buttonText.length()];
    	Arrays.fill(array, '*');
    	return new String(array);
    }
    
    private ic_(final se_ se_, final int n) {
        super(se_, n);
    }
    
    static {
        ic_.none = "Empty Room";
        ic_.desc_magical_guardian_room = "The pillar in the centre of this room is covered in mouths that will shrill and screech if they sense any raiders.<br><br>When triggered, the <%detect> of all monsters in this dungeon is increased by 3.";
    }
}
