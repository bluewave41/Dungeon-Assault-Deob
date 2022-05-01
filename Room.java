//original name: ai_
final class Room
{
	//original name: _l
    int defence1;
    //original name: _m
    boolean isMonster;
    //original name: _q
    int detect2;
    boolean _i;
    //original name: _o
    int detect1;
    //original name: _j
    int attack1;
    RaidMemberStatusIcon[] _f;
    wd_ _c;
    static int _n;
    //original name: _g
    int defence2;
    //original name: _r
    int snare2;
    //original name: _b
    static String tip_vampire_lord;
    //original name: _h
    Trap trap;
    //original name: _e
    static String text_renowntable_hint;
    //original name: _k
    static String desc_thief;
    //original name: _d
    static String text_disarm_trap_tooltip;
    //original name: _p
    int attack2;
    //original name: _s
    int snare1;
    //original name: _a
    int roomType; //0 regular, 2 center, 3 corner
    
    static final void a150(final int n) {
        qi_._b = ne_.roman20.b926(ll_.menuOptions[13]); //sound colon
        final int b926 = ne_.roman20.b926(ll_.menuOptions[14]); //music colon
        if (n > -74) {
            return;
        }
        if (b926 > qi_._b) {
            qi_._b = b926;
        }
    }
    
    public static void a423() {
        Room.text_renowntable_hint = null;
        Room.text_disarm_trap_tooltip = null;
        Room.tip_vampire_lord = null;
        Room.desc_thief = null;
    }
    
    //original signature: static final RaidMember a494(final ec_ ec_, final int n, final int n2, final int n3) {
    static final RaidMember createRaidMember(final ec_ buffer, final int position) {
        final int id = buffer.readByte();
        if (id == 0) {
            buffer.readInt();
            buffer.readByte();
            return null;
        }
        final RaidMember raidMember = new RaidMember(position, id);
        raidMember.attack = buffer.readByte(); //stats
        raidMember.defence = buffer.readByte();
        raidMember.dodge = buffer.readByte();
        raidMember.sneak = buffer.readByte();
        raidMember._p = buffer.readByte();
        return raidMember;
    }
    
    final void a785(final int n, final boolean b, final ec_ ec_) {
        ec_.storeByte(this.roomType);
        ec_.storeByte(this.attack2);
        ec_.storeByte(this.defence2);
        ec_.storeByte(this.snare2);
        ec_.storeByte(this.detect2);
        if (n != -12) {
            Room._n = -63;
        }
        if (!b) {
            ec_.storeByte(this.attack1);
            ec_.storeByte(this.defence1);
            ec_.storeByte(this.snare1);
            ec_.storeByte(this.detect1);
        }
    }
    
    static final void a900(final String e) {
        pd_._E = e;
    }
    
    static final void a085(final int n, final vh_ vh_) {
        ek_._b._A.a688(false, ha_._k, tl_._k, n, vh_);
    }
    
    //original signature: Room(final int a) {
    Room(final int roomType) {
        this.roomType = roomType;
        this.trap = gh_.traps[this.roomType]; //this doesn't really make sense
        if (null != this.trap) {
            this.isMonster = this.trap.isMonster;
            final int detect = this.trap.detect;
            this.detect1 = detect;
            this.detect2 = detect;
            final int attack = this.trap.attack;
            this.attack1 = attack;
            this.attack2 = attack;
            final int snare = this.trap.snare;
            this.snare1 = snare;
            this.snare2 = snare;
            final int defence = this.trap.defence;
            this.defence1 = defence;
            this.defence2 = defence;
            this._i = this.trap.isFatal;
        }
    }
    
    static {
        Room.tip_vampire_lord = "<col=FF0000>Lethal</col>. <%0> gains <%col_attack>+1 Attack</col>, <%col_defence>+1 Defence</col> if it wins in combat.";
        Room.text_renowntable_hint = "Select a dragon from the table and click 'Raid' to start a raid.";
        Room.desc_thief = "From simple pickpockets and highwaymen and up through a variety of brigands, the human cities of the west are full of thieves. This is one of the more competant examples - he is, after all, still alive.";
        Room.text_disarm_trap_tooltip = "Order your raider to disarm the trap. <br><br>The trap may be disarmed, the raider may trigger the trap but avoid its effects, or the raider may become trapped.<br><br>Requires: <col=21634A>Dodge</col>, <col=00A7D2>Sneak</col>";
    }
}
