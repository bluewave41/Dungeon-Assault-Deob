import java.net.*;
import java.applet.*;

final class j_ extends GUIButton
{
    int _I;
    int _N;
    int _P;
    int _K;
    //original name: _S
    static String[] ability_redistribute;
    int _R;
    static en_ _Q;
    //original name: _O
    static String[] titles_mastery_male;
    //original name: _L
    static String[] rating_mode_long_name;
    int _M;
    //original name: _J
    static int lang;
    
    @Override
    final boolean a946(final lm_ lm_, final int n, final int n2, final int n3, final int n4, final byte b, final int n5) {
        if (super.a946(lm_, n, n2, n3, n4, (byte)31, n5)) {
            final int n6 = n4 + (-n3 - super.xAxisOffset - this._I);
            final int n7 = n2 - n5 + (-super.yAxisOffset - this._R);
            if (this._M * this._M > n6 * n6 + n7 * n7) {
                double n8 = Math.atan2(n7, n6) - jd_._j;
                if (n8 < 0.0) {
                    n8 -= 3.141592653589793 / this._N;
                }
                else if (0.0 < n8) {
                    n8 += 3.141592653589793 / this._N;
                }
                this._K = (int)(this._N * n8 / 6.283185307179586);
                while (this._N <= this._K) {
                    this._K -= this._N;
                }
                while (this._K < 0) {
                    this._K += this._N;
                }
            }
            return true;
        }
        return false;
    }
    
    static final URL a550(final URL url, final Applet applet) {
        String a = null;
        if (null != ql_._a && !ql_._a.equals(applet.getParameter("settings"))) {
            a = ql_._a;
        }
        String b = null;
        if (pa_._b != null) {
            if (!pa_._b.equals(applet.getParameter("session"))) {
                b = pa_._b;
            }
        }
        return ng_.a531(-1, 0, b, a, url);
    }
    
    static final boolean a623(final String s) {
        final char char1 = s.charAt(0);
        for (int n = 1; s.length() > n; ++n) {
            if (s.charAt(n) != char1) {
                return false;
            }
        }
        return true;
    }
    
    public static void g423() {
        j_.ability_redistribute = null;
        j_._Q = null;
        j_.titles_mastery_male = null;
        j_.rating_mode_long_name = null;
    }
    
    static final void createRaiders() {
    	//static final void createRaider(final int[] abilities, final int unknown1, final int unknown2, final int raiderId, final int renown, final int attack, final int cost,
		//final int dodge, final int defence, final int sneak) {
        gj_.createRaider(new int[0], 0, 0, 1, 0, 1, 0, 1, 1, 1); //goblin runt
        gj_.createRaider(new int[0], 0, 0, 3, 0, 2, 100, 2, 1, 1); //goblin cleaver
        gj_.createRaider(new int[0], 1, 0, 4, 0, 2, 150, 1, 2, 1); //orc warrior
        gj_.createRaider(new int[0], -1, 0, 2, 0, 1, 200, 3, 1, 2); //saurus spawn
        gj_.createRaider(new int[0], -1, 0, 13, 3500, 3, 300, 1, 4, 0); //ogre thug
        gj_.createRaider(new int[] { RaiderAbility.PIT_IMMUNITY.getValue() }, -1, 0, 7, 4500, 1, 350, 3, 3, 1); //saurus slink
        gj_.createRaider(new int[0], -1, 0, 6, 6500, 4, 400, 1, 1, 3); //beastman
        gj_.createRaider(new int[] { 0 }, -1, 0, 5, 7500, 2, 500, 2, 3, 3); //
        gj_.createRaider(new int[] { RaiderAbility.GIFT_OF_THE_TREES.getValue() }, -1, 1, 34, 10000, 1, 550, 2, 3, 4); //dryad
        gj_.createRaider(new int[] { 20 }, -1, 0, 17, 12500, 4, 600, 2, 4, 0);
        gj_.createRaider(new int[] { RaiderAbility.RETREAT.getValue() }, 0, 1, 11, 14500, 1, 800, 5, 4, 2); //goblin scout
        gj_.createRaider(new int[0], -1, 1, 15, 16500, 3, 850, 4, 3, 4); //saurus warrior
        gj_.createRaider(new int[] { RaiderAbility.OFFERING.getValue() }, 1, 0, 16, 18500, 5, 900, 4, 3, 1); //orc shaman
        gj_.createRaider(new int[0], -1, 1, 8, 20000, 6, 1000, 1, 5, 1); //mercenary knight
        gj_.createRaider(new int[0], 1, 1, 10, 21500, 7, 1100, 1, 1, 5); //orc blademaster
        gj_.createRaider(new int[] { RaiderAbility.THIEVERY.getValue() }, -1, 0, 20, 23000, 3, 1150, 6, 3, 5); //thief
        gj_.createRaider(new int[0], -1, 0, 24, 24500, 6, 1200, 1, 7, 0); //ogre brute
        gj_.createRaider(new int[] { 4 }, -1, -1, 12, 27500, 4, 1300, 2, 5, 4); //
        gj_.createRaider(new int[0], -1, -1, 32, 29000, 7, 1400, 7, 4, 2);
        gj_.createRaider(new int[] { RaiderAbility.REVIVE.getValue() }, -1, 0, 9, 31000, 5, 1450, 3, 5, 3); //priest
        gj_.createRaider(new int[] { RaiderAbility.CIRCUMVENT.getValue() }, -1, 0, 19, 33000, 3, 1500, 2, 4, 2); //dwarf renegade
        gj_.createRaider(new int[] { RaiderAbility.SCOUT.getValue() }, -1, 1, 28, 35000, 5, 1600, 5, 7, 0); //minotaur
        gj_.createRaider(new int[] { RaiderAbility.RECONNOITRE.getValue() }, -1, 0, 25, 37500, 2, 1800, 8, 3, 8); //spy
        gj_.createRaider(new int[] { RaiderAbility.GLAMOUR.getValue() }, -1, 1, 14, 40000, 1, 1900, 4, 6, 6); //enchantress
        gj_.createRaider(new int[] { RaiderAbility.INTIMIDATE.getValue() }, -1, 0, 21, 42500, 8, 2000, 7, 2, 0); //zealot
        gj_.createRaider(new int[] { RaiderAbility.FEROCITY.getValue() }, -1, 1, 18, 45000, 4, 2100, 7, 7, 5); //ranger of the north
        gj_.createRaider(new int[] { RaiderAbility.FIRST_STRIKE.getValue(), RaiderAbility.FRAGILITY.getValue() }, -1, 1, 23, 47500, 10, 2200, 0, 0, 0); //berserker
        gj_.createRaider(new int[0], -1, -1, 26, 50000, 6, 2300, 6, 6, 6); //
        gj_.createRaider(new int[] { RaiderAbility.ARMORED.getValue() }, -1, 0, 27, 52500, 8, 2400, 4, 9, 1); //black knight
        gj_.createRaider(new int[0], -1, 1, 22, 55000, 8, 2500, 5, 5, 9); //dark elf assassin
        gj_.createRaider(new int[] { RaiderAbility.DARK_ARTS.getValue() }, -1, 3, 29, 59000, 7, 2700, 2, 6, 2); //sorceress
        gj_.createRaider(new int[] { RaiderAbility.FIRE_IMMUNITY.getValue() }, -1, 2, 33, 63000, 6, 2800, 9, 6, 9); //daemonette
        gj_.createRaider(new int[] { 17 }, -1, -1, 30, 67500, 9, 3000, 0, 9, 0); //
        gj_.createRaider(new int[] { RaiderAbility.MASTER_OF_CHAOS.getValue(), RaiderAbility.FICKLE.getValue() }, -1, 3, 31, 70000, 10, 5000, 10, 10, 10); //chaos champion
    }
    
    private j_() throws Throwable {
        throw new Error();
    }
    
    static {
        j_.ability_redistribute = new String[] { "Dark Arts", "The dark powers can be wielded by the <%0> equally well for both attack and defence. The <%0> can readjust the balance as she sees fit. (Single use)" };
        j_.titles_mastery_male = new String[] { "<%0> of the Orb", "<%0> the Wise", "<%0> the Cunning", "<%0> the Potent", "<%0> the Mighty", "<%0>, Master of the Tower", "<%0> the Magnificent", "<%0> the Unbound" };
        j_.rating_mode_long_name = new String[] { "Showing by rating", "Showing by win percentage" };
    }
}
