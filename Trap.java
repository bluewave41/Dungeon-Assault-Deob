final class Trap
{
    AmbientAudioTrack _a;
    //original name: _o
    String tip;
    //original name: _r
    int detect;
    //original name: _c
    int cost;
    //original name: _v
    int trapId;
    static int _s;
    AmbientAudioTrack _p;
    //original name: _j
    int requirements; //1 requires membership, 2 requires charging orb
    //original name: _d
    Animation idleAnimation;
    //original name: _b
    boolean isFatal;
    //original name: _C
    boolean isMonster;
    private int[] _e;
    //original name: _i
    int renown;
    static ph_ _w;
    //original name: _k
    int defence;
    //original name: _h
    static String text_success;
    //original name: _u
    Animation victoryAnimation;
    //original name: _q
    private int[] abilities;
    //original name: _f
    static String text_title_requirements_aggression;
    //original name: _g
    int roomType;
    //original name: _z
    String name;
    static Room _n;
    //original name: _m
    Animation defeatAnimation;
    static wj_ _B;
    //original name: _t
    String description;
    //original name: _D
    static String renowntable_error;
    static boolean _l;
    //original name: _y
    int snare;
    //original name: _A
    int attack;
    AmbientAudioTrack _x;
    
    //original signature: final int a080(final int n, final int n2) {
    final int a080(final int abilityId) {
        for (int n3 = 0; this.abilities.length > n3; ++n3) {
            if (this.abilities[n3] == abilityId) {
                return this._e[n3];
            }
        }
        return 0;
    }
    
    //original signature: final boolean a560(final byte b, final int n) {
    final boolean hasAbility(final int abilityIndex) {
        int i = 0;
        while (i < this.abilities.length) {
            if (this.abilities[i] == abilityIndex) {
                return true;
            }
            ++i;
        }
        return false;
    }
    
    //original signature: static final void a900(final String s, final int n) {
    static final void startRaid(final String s, final int n) {
        if (tl_._l) {
            throw new RuntimeException((String)null);
        }
        if (Animation.a213(s)) {
            throw new RuntimeException((String)null);
        }
        if (gm_.playerInformation != null) {
            if (n != 0) {
                Trap._n = null;
            }
            if (!gm_.playerInformation.isDungeonActivated) {
                Trap._B.storeFuzzedOpcode(58);
            }
            Trap._B.storeFuzzedOpcode(60);
            final wj_ b = Trap._B;
            ++b.currentIndex;
            final int o = Trap._B.currentIndex;
            Trap._B.a984(s);
            Trap._B.c093(-o + Trap._B.currentIndex, -1);
            return;
        }
        throw new RuntimeException((String)null);
    }
    
    public static void a150() {
        Trap.renowntable_error = null;
        Trap._n = null;
        Trap.text_title_requirements_aggression = null;
        Trap.text_success = null;
        Trap._w = null;
        Trap._B = null;
    }
    
    static final void a572(final nh_ nh_) {
        jp_.a604(nh_.a826("headers.packvorbis", ""));
        jp_.a825(nh_, "jagex logo2.packvorbis", "").c981();
    }
    
    Trap(final int trapId, final int roomType, final int cost, final int renown, final int unknown2, final int attack, final int defence, final int snare,
    		final int detect, final boolean isMonster, final boolean isFatal, final int[][] abilities) {
        this.defence = defence;
        this.cost = cost;
        this.isFatal = isFatal;
        this.attack = attack;
        this.trapId = trapId;
        this.roomType = roomType;
        this.detect = detect;
        this.renown = renown;
        this.requirements = unknown2;
        this.snare = snare;
        this.isMonster = isMonster;
        final int length = abilities.length;
        this.abilities = new int[length];
        this._e = new int[length];
        for (int l = 0; l < length; ++l) {
            final int[] array2 = abilities[l];
            if (array2.length == 1) {
                this.abilities[l] = array2[0];
                this._e[l] = 1;
            }
            else {
            	//2 abilities means the stat they decrease and the amount it decreases by
                if (array2.length != 2) {
                    throw new RuntimeException();
                }
                this.abilities[l] = array2[0];
                this._e[l] = array2[1];
            }
        }
    }
    
    static {
        Trap.text_success = "SUCCESS";
        Trap.text_title_requirements_aggression = "You must once have charged <%0> Orbs of Mastery at one time to earn the title of <%1>.";
        Trap.renowntable_error = "An error has occurred retrieving the Renown Table.";
        Trap._n = null;
    }
}
