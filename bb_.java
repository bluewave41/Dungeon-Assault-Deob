import java.awt.*;

abstract class bb_
{
    static nh_ _b;
    //original name: _t
    static String[] tutorial_trap1;
    static String _f;
    //original name: _r
    static String text_hint_ability_boostsneak;
    //original name: _l
    static String[] ability_sacrifice_green_brief;
    //original name: _q
    static String text_result;
    //original name: _e
    static Image image;
    //original name: _k
    static String[] achievement_criteria;
    up_ _g;
    up_ _p;
    up_ _d;
    up_ _s;
    int _a;
    //original name: _o
    ec_ dataBuffer2;
    //original name: _n
    long oldTime;
    volatile int _h;
    volatile int _c;
    //original name: _m
    ec_ dataBuffer1;
    byte _j;
    em_ _i;
    
    public static void a423() {
        bb_.text_result = null;
        bb_._b = null;
        bb_.achievement_criteria = null;
        bb_.tutorial_trap1 = null;
        bb_.image = null;
        bb_._f = null;
        bb_.text_hint_ability_boostsneak = null;
        bb_.ability_sacrifice_green_brief = null;
    }
    
    static final Graphic[] a447(final int n, final int n2, final int n3) {
        return pe_.a289(n3, n, n2, 1);
    }
    
    abstract void a150(final int p0);
    
    final boolean d154(final int n) {
        if (n != 20) {
            this._d = null;
        }
        return 20 <= this.e137(n + 0);
    }
    
    abstract void a993(final Object p0, final boolean p1);
    
    abstract void f150(final int p0);
    
    abstract boolean b427(final byte p0);
    
    final int c137(final int n) {
        if (n != 20) {
            this._a = 69;
        }
        return this._g.b410((byte)53) + this._p.b410((byte)53);
    }
    
    final boolean b154(final int n) {
        return n != -21431 || 20 <= this.c137(n ^ 0xFFFFAC5D);
    }
    
    final int e137(final int n) {
        if (n != 20) {
            this.d154(38);
        }
        return this._d.b410((byte)53) + this._s.b410((byte)53);
    }
    
    final em_ a180(final boolean b, final int n, final byte e, final int n2, final byte b2) {
        final long o = n2 + ((long)n << 32);
        final em_ em_ = new em_();
        em_._E = e;
        em_._o = o;
        if (!(em_._B = b)) {
            if (20 <= this.e137(20)) {
                throw new RuntimeException();
            }
            this._d.a857(em_);
        }
        else {
            if (this.c137(20) >= 20) {
                throw new RuntimeException();
            }
            this._g.a857(em_);
        }
        if (b2 <= 65) {
            bb_.tutorial_trap1 = null;
        }
        return em_;
    }
    
    bb_() {
        this._g = new up_();
        this._p = new up_();
        this._d = new up_();
        this._s = new up_();
        this.dataBuffer2 = new ec_(6);
        this._j = 0;
        this._h = 0;
        this._c = 0;
        this.dataBuffer1 = new ec_(10);
    }
    
    static {
        bb_._f = null;
        bb_.text_hint_ability_boostsneak = "Select a raider to enchant with additional Sneak";
        bb_.text_result = "RESULT";
        bb_.ability_sacrifice_green_brief = new String[] { "Offering", "Sacrifice an orc or goblin to negate death or incapacity. (Multiple use)" };
        bb_.achievement_criteria = new String[] { "Raid a dungeon using only goblins", "Raid a dungeon using only orcs", "Complete 1 raid", "Complete 5 raids", "Complete 10 raids", "Complete 20 raids", "Complete 5 raids in succession", "Complete a raid without any raider being incapacitated or killed", "Defend your dungeon from 1 raid", "Defend your dungeon from 5 raids", "Defend your dungeon from 10 raids", "Defend your dungeon from 20 raids", "Kill 50% of the raiders raiding your dungeon", "Kill 100% of the raiders raiding your dungeon", "Successfully raid and clear all rooms including entrances in a dungeon where the dragon has more than 4,500 Renown", "Reach 7,000 Renown", "Successfully raid a dragon after failing it previously", "Lose 4 raiders when a dragon wakes", "Collect a bounty from 5 dungeons consecutively", "Successfully complete 500 raids", "Successfully defend your dungeon from 250 attacks", "Successfully steal over 2000 gold from a player in one raid", "Achieve all of the 'Dragon's...' Achievements", "Successfully complete 1000 raids", "Successfully defend your dungeon from 500 attacks", "Reach 10,000 Renown", "Defend your dungeon with traps worth over 3000 Treasure", "Defend your dungeon with monsters worth over 3000 Treasure", "Successfully steal a dragon's gold with a 90% or higher chance of waking it", "Successfully steal over 5000 gold from a player in one raid", "Charge at least 20 Orbs of Mastery at the same time", "Successfully complete 2000 raids", "Successfully defend your dungeon from 1000 attacks", "Reach 20,000 Renown", "Successfully raid the same dragon 3 times consecutively", "Steal an Orb of Power", "Successfully steal a dragon's gold twice consecutively, with an 80% or higher chance of waking it", "Collect a bounty from a dragon with at least 15,000 Renown, successfully stealing its gold with a 90% or higher chance of waking it, using only raiders available while charging an orb without any of them being killed or incapacitated", "Collect all the titles", "Steal 1000 gold from the player who last raided you", "Hold 20,000 Treasure at once", "Have earned a total of 1,000,000 Treasure", "Never go more than 7 days without raiding a dungeon throughout a whole year", "Achieve a top 200 place among the Dragons of Renown", "Achieve a top 30 place among the Dragons of Renown", "Achieve a top 10 place among the Dragons of Renown" };
        bb_.tutorial_trap1 = new String[] { "Trap", "<%highlight>This room contains a trap!</col> A <%trap>, such as <%lastroom>, will usually have high <%snare> and <%detect>, with low or no <%attack> or <%defence>." };
    }
}
