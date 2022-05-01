import java.applet.*;

final class ba_
{
	//original name: _g
    private String lastLoginMethod;
    static int _f;
    //original name: _d
    static String text_raider_avoided_trap;
    static kg_ _c;
    static int[] _b;
    static ba_ _e;
    //original name: _a
    static String desc_ogre_thug;
    //original name: _h
    static String text_game_name;
    
    public static void a423() {
        ba_.text_raider_avoided_trap = null;
        ba_.desc_ogre_thug = null;
        ba_.text_game_name = null;
        ba_._b = null;
        ba_._e = null;
    }
    
    //original signature: static final void a787(final rj_ l, final byte b, final int c) {
    static final void a787(final rj_ l, final byte b, final int tutorialStringIndex) {
        kd_.tutorialStringIndex = tutorialStringIndex;
        uo_.currentTutorialString = le_.tutorialStrings[kd_.tutorialStringIndex];
        fc_._d = 0;
        id_._l = l;
        if (b < 40) {
            return;
        }
        og_.a188(false, 0, uo_.currentTutorialString[fc_._d]);
    }
    
    //original signature: final void a587(final int n, final Applet applet) {
    final void a587(final Applet applet) {
        lm_.a890(false, "jagex-last-login-method", 31536000L, applet, this.lastLoginMethod);
    }
    
    //original signature: final boolean a896(final String s, final int n) {
    final boolean a896(final String s) {
        return this.lastLoginMethod.equals(s);
    }
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    static final Graphic[] a089(final int n, final int n2, final int n3, final int n4, final int n5, final int i, final int n6, final int j) {
        final int k = i + (n5 + j);
        final Graphic[] array2;
        final Graphic[] array = array2 = new Graphic[] { new Graphic(k, k), new Graphic(n2, k), new Graphic(k, k), new Graphic(k, n2), new Graphic(64, 64), new Graphic(k, n2), new Graphic(k, k), new Graphic(n2, k), new Graphic(k, k) };
        for (int n7 = 0; array2.length > n7; ++n7) {
            final Graphic cn_ = array2[n7];
            for (int n8 = 0; cn_._B.length > n8; ++n8) {
                cn_._B[n8] = n3;
            }
        }
        for (int n9 = 0; i > n9; ++n9) {
            for (int l = 0; l < k; ++l) {
                array[6]._B[l + k * (-n9 + (k - 1))] = n4;
                array[8]._B[(k - 1 - n9) * k + l] = n4;
                array[2]._B[l * k + (-n9 - 1 + k)] = n4;
                array[8]._B[k - 1 - n9 + l * k] = n4;
            }
        }
        for (int n10 = 0; n10 < i; ++n10) {
            for (int n11 = 0; k > n11; ++n11) {
                array[0]._B[n10 * k + n11] = n;
                array[0]._B[n10 + k * n11] = n;
                if (-n10 + k > n11) {
                    array[2]._B[k * n10 + n11] = n;
                    array[6]._B[n10 + n11 * k] = n;
                }
            }
        }
        for (int n12 = 0; n12 < n2; ++n12) {
            for (int n13 = 0; i > n13; ++n13) {
                array[7]._B[n12 + (-n13 + k - 1) * n2] = n4;
                array[5]._B[n12 * k - (-k + 1) - n13] = n4;
                array[1]._B[n2 * n13 + n12] = n;
                array[3]._B[n13 + n12 * k] = n;
            }
        }
        for (int n14 = 0; n14 < n2 >> 1; ++n14) {
            for (int n15 = 0; j > n15; ++n15) {
                array[1]._B[n14 + (k - n15 - 1) * n2] = n6;
                array[3]._B[-n15 - (-k + 1) + k * n14] = n6;
                array[7]._B[n14 + n15 * n2] = n6;
                array[5]._B[n14 * k + n15] = n6;
            }
        }
        return array;
    }
    
    ba_(final String g) {
        this.lastLoginMethod = g;
    }
    
    static {
        ba_.text_raider_avoided_trap = "Your raider was detected by trap, but avoided it.";
        ba_._b = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        ba_.desc_ogre_thug = "Notoriously dimwitted, the ogres share the highlands with the goblin and orc tribes. What this particular ogre thug lacks in intellect and subtlety, he compensates for with raw force.";
        ba_._c = null;
        ba_._e = new ba_("email");
        ba_.text_game_name = "Dungeon Assault";
    }
}
