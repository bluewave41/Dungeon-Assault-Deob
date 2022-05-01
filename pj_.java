final class pj_
{
    static int[] _e;
    static boolean[] _w;
    DungeonPath _v;
    static int _x;
    String _f;
    static gk_ _c;
    //original name: _n
    static String create_alert_email_unavailable;
    //original name: _a
    static int gameId;
    static int _r;
    //original name: _h
    Room[] dungeonLayout;
    DungeonPath _p;
    //original name: _z
    static volatile long time;
    DungeonPath _j;
    private DungeonPath _d;
    //original name: _i
    int aliveZealots;
    int _B;
    int _g;
    //original name: _y
    int renown;
    int _t;
    //original name: _u
    RaidMember activeRaidMember;
    //original name: _k
    int raidStatus; //enum candidate
    //original name: _A
    RaidMember[] raidMembers;
    private int _s;
    int _q;
    //original name: _l
    int claimedBountyAmount;
    //original name: _o
    int renownDividedBy10;
    private DungeonPath _b;
    DungeonPath _m;
    
    pj_(final ec_ ec_, final boolean b) {
        this();
        this.a785(111, b, ec_);
    }
    
    private final void a326(final int n, final int n2, final int n3) {
        if (n2 <= 0) {
            return;
        }
        final boolean b = 6 < n3;
        if (n != -3) {
            this.a078(-113, null, (byte)(-64), true);
        }
        final boolean b2 = n3 < 42;
        final boolean b3 = n3 % 7 != 0;
        final boolean b4 = n3 % 7 != 6;
        if (b) {
            if (b3) {
                final int n4 = n3 - 8;
                if (!this._j.a370(n4)) {
                    final Room room = this.dungeonLayout[n4];
                    if (room.trap != null && room.trap.roomType == 2) {
                        room.detect2 += n2;
                    }
                }
            }
        }
        if (b) {
            final int n5 = n3 - 7;
            if (!this._j.a370(n5)) {
                final Room ai_3 = this.dungeonLayout[n5];
                if (null != ai_3.trap) {
                    if (2 == ai_3.trap.roomType) {
                        final Room ai_4 = ai_3;
                        ai_4.detect2 += n2;
                    }
                }
            }
        }
        if (b && b4) {
            final int n6 = n3 - 6;
            if (!this._j.a370(n6)) {
                final Room ai_5 = this.dungeonLayout[n6];
                if (ai_5.trap != null) {
                    if (2 == ai_5.trap.roomType) {
                        final Room ai_6 = ai_5;
                        ai_6.detect2 += n2;
                    }
                }
            }
        }
        if (b3) {
            final int n7 = n3 - 1;
            if (!this._j.a370(n7)) {
                final Room ai_7 = this.dungeonLayout[n7];
                if (ai_7.trap != null) {
                    if (ai_7.trap.roomType == 2) {
                        final Room ai_8 = ai_7;
                        ai_8.detect2 += n2;
                    }
                }
            }
        }
        if (b4) {
            final int n8 = n3 + 1;
            if (!this._j.a370(n8)) {
                final Room ai_9 = this.dungeonLayout[n8];
                if (null != ai_9.trap) {
                    if (2 == ai_9.trap.roomType) {
                        final Room ai_10 = ai_9;
                        ai_10.detect2 += n2;
                    }
                }
            }
        }
        if (b2) {
            if (b3) {
                final int n9 = n3 + 6;
                if (!this._j.a370(n9)) {
                    final Room ai_11 = this.dungeonLayout[n9];
                    if (null != ai_11.trap && ai_11.trap.roomType == 2) {
                        final Room ai_12 = ai_11;
                        ai_12.detect2 += n2;
                    }
                }
            }
        }
        if (b2) {
            final int n10 = 7 + n3;
            if (!this._j.a370(n10)) {
                final Room ai_13 = this.dungeonLayout[n10];
                if (ai_13.trap != null && ai_13.trap.roomType == 2) {
                    final Room ai_14 = ai_13;
                    ai_14.detect2 += n2;
                }
            }
        }
        if (b2 && b4) {
            final int n11 = 8 + n3;
            if (!this._j.a370(n11)) {
                final Room ai_15 = this.dungeonLayout[n11];
                if (ai_15.trap != null) {
                    if (2 == ai_15.trap.roomType) {
                        final Room ai_16 = ai_15;
                        ai_16.detect2 += n2;
                    }
                }
            }
        }
    }
    
    //original signature: final void a093(final int n, final int g) {
    //remove all chaos champions?
    final void a093(final int g) {
        this.a540(128);
        this._g = g;
        if (1 != this._g) {
            final RaidMember[] a = this.raidMembers;
            for (int n2 = 0; a.length > n2; ++n2) {
                final RaidMember hb_ = a[n2];
                if (hb_ != null && hb_.raider.hasAbility(RaiderAbility.FICKLE.getValue())) {
                    hb_.a487(false);
                }
            }
        }
    }
    
    //original signature: final mo_ b215(final byte b, final int n) {
    final mo_ handleTrapEncounter(final byte b, final int n) {
        if (null == this.activeRaidMember) {
            throw new IllegalStateException("Combat raider is null");
        }
        if (0x0 != (0x2 & this.activeRaidMember.status)) {
            throw new IllegalStateException("Combat raider is incapacitated.");
        }
        if ((this.activeRaidMember.status & 0x4) != 0x0) {
            throw new IllegalStateException("Combat raider is dead.");
        }
        final Room room = this.dungeonLayout[this._B];
        final Trap trap = room.trap;
        int sneak = this.activeRaidMember.sneak;
        if (0x0 != (0x2 & this.activeRaidMember._d)) { //ability
            sneak <<= 1;
        }
        int adjustedSneak = sneak - this.aliveZealots;
        if (0 > adjustedSneak) {
            adjustedSneak = 0;
        }
        if (trap.hasAbility(TrapAbility.TELEPORT.getValue())) {
            this.a487(false);
        }
        if (trap.hasAbility(TrapAbility.HIDDEN_DARTS.getValue())) {
            room._i = this.isRollSuccessful(room.attack2, this.activeRaidMember.defence);
        }
        if (1 == room.trap.roomType) { //trap
            if (this.activeRaidMember.raider.hasAbility(RaiderAbility.PIT_IMMUNITY.getValue()) && trap.hasAbility(11)) { //pit immunity
                this.a487(false);
                return new mo_(66, TrapOutcome.DISARMED.getValue()); //disarm
            }
            if (this.isRollSuccessful(room.detect2, adjustedSneak)) {
                this.a487(false);
                return new mo_(66, TrapOutcome.DISARMED.getValue()); //disarm
            }
            this.a773(this._B, true, -12331); //reset?
            if (this.isRollSuccessful(room.snare2, this.activeRaidMember.dodge)) {
                this.a487(false);
                return new mo_(66, TrapOutcome.TRIGGERED.getValue());
            }
            this.d150(116);
            final boolean b2 = false;
            if (0x0 == (this.activeRaidMember.status & 0x4)) {
                return new mo_(66, (false | b2) ? 1 : 0);
            }
            return new mo_(66, 0x800 | (b2 ? 1 : 0));
        }
        else if (room.trap.roomType == 2) { //monster
            final boolean a793 = this.isRollSuccessful(adjustedSneak, room.detect2);
            if (a793) {
                this.a773(this._B, true, -12331);
            }
            if (trap.hasAbility(3) && !a793) {
                int n3;
                if (this.isRollSuccessful(room.snare2, this.activeRaidMember.dodge)) {
                    this.a487(false);
                    n3 = 4096;
                }
                else {
                    this.d150(2);
                    n3 = ((0x0 == (0x4 & this.activeRaidMember.status)) ? 0 : 2048);
                }
                if (a793) {
                    n3 |= 0x4000;
                }
                return new mo_(66, n3);
            }
            if (trap.hasAbility(15) && !a793) {
                this.b150(-111);
                this.a540(32);
                this.a540(8);
                return new mo_(66, 0);
            }
            return this.a852(a793, room, n, (byte)98);
        }
        else {
            if (room.trap.roomType != 3) {
                throw new IllegalStateException("Can't enter combat in special room");
            }
            if (!trap.hasAbility(10)) {
                if (this.isRollSuccessful(room.detect2, adjustedSneak)) {
                    this.a487(false);
                    return new mo_(66, 36864);
                }
                this.a773(this._B, true, -12331);
                this.d150(105);
                return new mo_(66, 0);
            }
            else {
                if (!this.isRollSuccessful(room.snare2, this.activeRaidMember.dodge)) {
                    this.a183(this._B);
                    this.d150(27);
                    return new mo_(66, 0);
                }
                this.a487(false);
                return new mo_(66, 36864);
            }
        }
    }
    
    private final void a876(final DungeonPath wm_, final ec_ ec_, final int n) {
        wm_.dungeonPath[0] = ec_.readTribyte(n + 22957);
        wm_.dungeonPath[1] = ec_.readShort();
        final int c474 = ec_.readByte();
        wm_.dungeonPath[1] = mp_.or(wm_.dungeonPath[1], nb_.and(c474 << 16, 65536));
        wm_.dungeonPath[0] = mp_.or(wm_.dungeonPath[0], nb_.and(254, c474) << 24);
        if (n != -23082) {
            this._t = -3;
        }
    }
    
    private final void a671(final RaidMember hb_, final int n) {
        if (this.raidStatus != 128) {
            boolean b = false;
            final RaidMember[] a = this.raidMembers;
            for (int n2 = 0; a.length > n2; ++n2) {
                final RaidMember hb_2 = a[n2];
                if (hb_2 != null && 0x0 == (0x6 & hb_2.status)) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                this.a093(4);
            }
        }
        if (n != 6) {
            this.isRollSuccessful(67, -29);
        }
    }
    
    private final void a785(final int n, final boolean b, final ec_ ec_) {
        this.readDungeon(ec_, this._v);
        final Room[] h = this.dungeonLayout;
        final int n2 = 0;
        final Room[] h2 = this.dungeonLayout;
        final int n3 = 6;
        final Room[] h3 = this.dungeonLayout;
        final int n4 = 42;
        final Room[] h4 = this.dungeonLayout;
        final int n5 = 48;
        final Room ai_ = new Room(3);
        h3[n4] = (h4[n5] = ai_);
        h[n2] = (h2[n3] = ai_);
        this.dungeonLayout[24] = new Room(2);
        for (int n6 = 0; 49 > n6; ++n6) {
            if (n6 != 0 && n6 != 6 && n6 != 24 && n6 != 42) {
                if (n6 != 48) {
                    this.dungeonLayout[n6] = bl_.a167(b, ec_, false);
                }
            }
        }
        this.a876(this._p, ec_, -23082);
        this.a876(this._j, ec_, -23082);
        this._q = ec_.readUnsignedByte();
        this._B = ec_.readUnsignedByte();
        for (int i = 0; i < 4; ++i) {
            this.raidMembers[i] = ep_.a069(i, -1, ec_);
        }
        if (n < 57) {
            this.renown = 110;
        }
        final int c474 = ec_.readByte();
        this.activeRaidMember = ((4 <= c474) ? null : this.raidMembers[c474]);
        this._g = ec_.readByte();
        this.a540(ec_.readByte());
        this._t = ec_.readByte();
        this._s = ec_.readByte();
        if (!b) {
            this.renownDividedBy10 = ec_.readTribyte(-110);
            this.renown = ec_.readTribyte(-94);
            this.claimedBountyAmount = ec_.readTribyte(-107);
            this.a876(this._d, ec_, -23082);
        }
        else {
            this._f = ec_.readString();
        }
        if (this._q != -1) {
            this.a366(this._q, (byte)107);
        }
    }
    
    //original signature: private final boolean a793(final int n, final byte b, final int n2) {
    //bad name for function
    private final boolean isRollSuccessful(final int stat1, final int stat2) {
        if (stat2 == 0) { //only ever triggers for berserker?
            return stat1 == 0 && oi_.getRandom(2) == 0;
        }
        if (stat1 == 0) { //fail safe?
            return true;
        }
        final int n3 = stat2 - stat1;
        if (-10 > n3) {
            return false;
        }
        if (0 > n3) {
            return 0 == oi_.getRandom(1 + (1 << -n3));
        }
        return n3 > 10 || oi_.getRandom(1 + (1 << n3)) != 0;
    }
    
    private final mo_ a852(final boolean b, final Room ai_, final int n, final byte b2) {
        int n2 = b ? 0 : 1;
        final Raider n3 = this.activeRaidMember.raider;
        if (n3.hasAbility(RaiderAbility.FIRST_STRIKE.getValue())) {
            n2 = 1;
        }
        if (n == 2) {
            n2 = 0;
        }
        int n4 = 0;
        int a080 = ai_.trap.a080(17);
        int g = this.activeRaidMember.defence;
        if (b2 != 98) {
            this.a671(null, -125);
        }
        int e = this.activeRaidMember.attack;
        int p4 = ai_.attack2;
        int g2 = ai_.defence2;
        if (0x0 != (0x1 & this.activeRaidMember._d)) {
            g <<= 1;
        }
        if (((0x1 & this._t) != 0x0 || 0x0 != (this.activeRaidMember._d & 0x4)) & ai_.trap.roomType == 2) {
            g2 = g2 + 1 >> 1;
            p4 = p4 + 1 >> 1;
        }
        int n5 = p4 - this.aliveZealots;
        if (n5 < 0) {
            n5 = 0;
        }
        if (ai_.trap.hasAbility(7) && g << 1 <= n5) {
            this.a093(3);
            return new mo_(66, 32768);
        }
        int n6 = b ? 16384 : 0;
        if (n2 != 0) {
            n6 |= 0x2000;
        }
        if (2 == n) {
            n6 |= 0x8000;
        }
        if (1 == n) {
            ++e;
            --g;
        }
        int n7 = 0;
        while (true) {
            ++n7;
            if (n2 != 0) {
                int n8 = (2 == n) ? this.activeRaidMember.dodge : e;
                final int n9 = (n == 2) ? ai_.snare2 : g2;
                if (n != 2) {
                    if (n3.hasAbility(RaiderAbility.FEROCITY.getValue())) {
                        if (n4 == 0) {
                            n8 <<= 1;
                            n6 |= 0x400;
                            n4 = 1;
                        }
                    }
                }
                if (this.isRollSuccessful(n9, n8) || 100 < n7) {
                    if (2 == n) {
                        this.a150(-8);
                        n6 |= 0x1000;
                        break;
                    }
                    if (0 >= a080) {
                        this.a487(false);
                        n6 |= 0x1000;
                        break;
                    }
                    n6 |= 0x200;
                    --a080;
                }
                if (((n8 == 0 && n9 != 0) || n9 > 10 + n8) && ((0 == ai_.attack2 && 0 != this.activeRaidMember.defence) || 10 + ai_.attack2 < this.activeRaidMember.defence)) {
                    n6 |= 0x1000;
                    if (2 != n) {
                        this.a487(false);
                    }
                    else {
                        this.a150(-8);
                    }
                    n7 = 5;
                    break;
                }
            }
            n2 = 1;
            if (this.isRollSuccessful(g, n5)) {
                if (n3.hasAbility(7) && this.activeRaidMember.status == 0) {
                    final RaidMember u = this.activeRaidMember;
                    u.status |= 0x1;
                }
                else if (!n3.hasAbility(RaiderAbility.ARMORED.getValue()) || n4 != 0) {
                    this.d150(b2 - 183);
                    if ((0x4 & this.activeRaidMember.status) == 0x0) {
                        break;
                    }
                    n6 |= 0x800;
                    break;
                }
                else {
                    n6 |= 0x400;
                    n4 = 1;
                }
            }
        }
        if (5 < n7) {
            n7 = 5;
        }
        return new mo_(66, n6 | n7);
    }
    
    public static void e150(final int n) {
        pj_._c = null;
        pj_._e = null;
        pj_.create_alert_email_unavailable = null;
        pj_._w = null;
        if (n < 111) {
            a054(43, 127L);
        }
    }
    
    final double b308(final int n, final int n2, final int n3) {
        if (n3 <= 45) {
            return -0.5947890367550314;
        }
        return this.c068(n, this.renown, n2, 2, this.renownDividedBy10);
    }
    
    final void a773(final int n, final boolean b, final int n2) {
        final Trap trap = this.dungeonLayout[n].trap;
        this.e093(trap.a080(9));
        this.a326(-3, trap.a080(5), n);
    }
    
    //original signature: final void a540(final boolean b, final int k) {
    final void a540(final int k) {
        this.raidStatus = k;
        if (this.raidStatus == 32) {
            final RaidMember[] raidMembers = this.raidMembers;
            for (int i = 0; i < raidMembers.length; ++i) {
                final RaidMember raidMember = raidMembers[i];
                if (raidMember != null) {
                    raidMember._d = 0;
                }
            }
            this._t = 0;
        }
        this.aliveZealots = 0;
        final RaidMember[] a2 = this.raidMembers;
        for (int j = 0; j < a2.length; ++j) {
            final RaidMember hb_2 = a2[j];
            if (hb_2 != null && hb_2.raider.hasAbility(RaiderAbility.INTIMIDATE.getValue())) { //zealot
                if (0x0 == (hb_2.status & 0x6)) {
                    ++this.aliveZealots;
                }
            }
        }
    }
    
    final mo_ b669(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n3 != 18833) {
            this._t = 19;
        }
        final ec_ ec_ = new ec_(3);
        ec_.storeShort(n4);
        if (this.a046(n5, n4, n3 + 18031, n2, n)) {
            ec_.storeByte(0x10 | this.a410());
            this.a093(2);
        }
        else {
            ec_.storeByte(0);
            this.a093(1);
        }
        return new mo_(68, ec_);
    }
    
    final void a125(final int n, final RaidMember hb_) {
        boolean b = true;
        final Raider n2 = hb_.raider;
        if (n2.hasAbility(7) && 0x0 == (hb_.status & 0x1)) { //unused
            return;
        }
        if (n2.hasAbility(17)) { //unused
            b = false;
        }
        if (n2.hasAbility(20)) { //unused
            if (hb_.defence > 1) {
                --hb_.defence;
                b = false;
            }
        }
        if (!b) {
            hb_.a150(3);
        }
        else {
            hb_.a487(false);
        }
        hb_.status |= 0x8;
        if (n <= 97) {
            this._g = 87;
        }
        this.a671(hb_, 6);
    }
    
    private final int a417(final int n, final boolean b) {
        final int[] a464;
        final int[] array = a464 = this.a464((byte)(-107), n);
        for (int i = 0; i < a464.length; ++i) {
            if (this._q == a464[i]) {
                return this._q;
            }
        }
        final int[] array2 = array;
        for (int j = 0; j < array2.length; ++j) {
            final int n2 = array2[j];
            if (this._m.a370(n2)) {
                return n2;
            }
        }
        if (!b) {
            pj_._w = null;
        }
        return -1;
    }
    
    //original signature: final boolean b121(final int n, final RaidMember hb_) {
    final boolean b121(final int n, final RaidMember raidMember) {
        if (raidMember == null) {
            return false;
        }
        final int o = raidMember.status;
        final int s = raidMember.raider.activeAbility;
        if (s == -1) {
            return false;
        }
        if (n != (o & 0x1)) {
            return false;
        }
        if (0x0 != (o & 0x6)) {
            if (s != 6 && s != 21) {
                return false;
            }
            if (raidMember.defence <= 0) {
                return false;
            }
        }
        if (this.raidStatus == 128) {
            if ((s == 6 || s == 21) && o == 12) {
                final RaidMember[] raidMembers = this.raidMembers;
                for (int i = 0; i < raidMembers.length; ++i) {
                    final RaidMember hb_2 = raidMembers[i];
                    if (hb_2 != null) {
                        if (0x0 == (hb_2.status & 0x6)) {
                            if (hb_2.raider.unknown1 == 0) {
                                return true;
                            }
                            if (s == 21 && 1 == hb_2.raider.unknown1) {
                                return true;
                            }
                        }
                    }
                }
            }
            if (2 == s) {
                if (o == 0) {
                    final RaidMember[] a2 = this.raidMembers;
                    for (int j = 0; j < a2.length; ++j) {
                        final RaidMember hb_3 = a2[j];
                        if (hb_3 != null && (0x4 & hb_3.status) != 0x0 && hb_3.defence > 0) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        if (this.raidStatus == 32 && this.activeRaidMember != raidMember) {
            return false;
        }
        if (0x0 == (this.raidStatus & ob_._cc[s])) {
            return false;
        }
        if (this.activeRaidMember != raidMember) {
            if (s == 3) {
                return false;
            }
            if (6 == s) {
                return false;
            }
            if (s == 21) {
                return false;
            }
            if (s == 9) {
                return false;
            }
            if (s == 22) {
                return false;
            }
            if (16 == s) {
                return false;
            }
            if (18 == s) {
                return false;
            }
        }
        if (2 == s) {
            final RaidMember[] a3 = this.raidMembers;
            for (int n2 = 0; a3.length > n2; ++n2) {
                final RaidMember hb_4 = a3[n2];
                if (hb_4 != null) {
                    if ((0x4 & hb_4.status) != 0x0) {
                        if (hb_4.defence > 0) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        if (9 == s && this.dungeonLayout[this._B].trap.roomType == 1) {
            return false;
        }
        if (s != 6 && s != 21) {
            return true;
        }
        final RaidMember[] a4 = this.raidMembers;
        for (int k = 0; k < a4.length; ++k) {
            final RaidMember hb_5 = a4[k];
            if (null != hb_5 && 0x0 == (0x6 & hb_5.status)) {
                if (hb_5.raider.unknown1 == 0) {
                    return true;
                }
                if (s == 21 && hb_5.raider.unknown1 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private final boolean a046(final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n3 != 36864) {
            this.a016((byte)20, -103, true);
        }
        return n5 < n2 || ha_.getRandomDouble() < this.c068(n4, n, n2, 2, n5);
    }
    
    final DungeonPath b184(final byte b) {
        final DungeonPath wm_ = new DungeonPath(84);
        int n = 0;
        if (b > -1) {
            this.a966(null, -59, -23, 96, true);
        }
        for (int i = 0; i < 7; ++i) {
            for (int n2 = 0; 6 > n2; ++n2) {
                final int n3 = i * 7 + n2;
                final int n4 = n3 + 1;
                if (this._p.a370(n3) || this._p.a370(n4)) {
                    wm_.a093(n);
                }
                ++n;
            }
        }
        for (int j = 0; j < 6; ++j) {
            for (int n5 = 0; 7 > n5; ++n5) {
                final int n6 = n5 + 7 * j;
                final int n7 = 7 + n6;
                if (this._p.a370(n6) || this._p.a370(n7)) {
                    wm_.a093(n);
                }
                ++n;
            }
        }
        return wm_;
    }
    
    //original signature: private final void e093(final int n, final int n2) {
    //increase detect
    private final void e093(final int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < 49; ++i) {
            if (!this._j.a370(i)) {
                final Room room = this.dungeonLayout[i];
                if (room.trap != null && room.trap.roomType == 2) {
                    room.detect2 += n;
                }
            }
        }
    }
    
    //original signature: final mo_ c610(final int n, final int n2) {
    final mo_ handleTutorialTrapEncounter(final int action) {
        if (this.activeRaidMember == null) {
            throw new IllegalStateException("Combat raider is null");
        }
        if (0x0 != (0x2 & this.activeRaidMember.status)) {
            throw new IllegalStateException("Combat raider is incapacitated.");
        }
        if ((4 & this.activeRaidMember.status) != 0) {
            throw new IllegalStateException("Combat raider is dead.");
        }
        final Room room = this.dungeonLayout[this._B];
        final Trap trap = room.trap;
        int sneak = this.activeRaidMember.sneak;
        if ((2 & this.activeRaidMember._d) != 0) { //ability?
            sneak <<= 1;
        }
        int adjustedSneak = sneak - this.aliveZealots; //adjust sneak for zealot ability
        if (0 > adjustedSneak) {
            adjustedSneak = 0;
        }
        if (room.trap.roomType == 1) { //trap
            if (this.activeRaidMember.raider.hasAbility(RaiderAbility.PIT_IMMUNITY.getValue()) && trap.hasAbility(11)) { //pit and immunity
                this.a487(false);
                return new mo_(66, TrapOutcome.DISARMED.getValue());
            }
            if (this.isRollSuccessful(this.activeRaidMember.dodge, adjustedSneak)) {
                this.a487(false);
                return new mo_(66, TrapOutcome.DISARMED.getValue());
            }
            this.a773(this._B, true, -12331);
            this.a487(false);
            return new mo_(66, TrapOutcome.TRIGGERED.getValue());
        }
        else {
            if (room.trap.roomType == 2) { //monster
                final boolean a793 = this.isRollSuccessful(adjustedSneak, room.detect2);
                if (a793) {
                    this.a773(this._B, true, -12331);
                }
                return this.a078(action, room, (byte)26, a793);
            }
            if (room.trap.roomType != 3) {
                throw new IllegalStateException("Can't enter combat in special room");
            }
            if (trap.hasAbility(TrapAbility.DETECT_RAISE_2.getValue())) { //hall of glass
                if (this.isRollSuccessful(room.snare2, this.activeRaidMember.dodge)) {
                    this.a487(false); //reset
                    return new mo_(66, 36864);
                }
                this.a183(this._B);
                this.d150(124);
                return new mo_(66, 0);
            }
            else {
                if (this.isRollSuccessful(room.detect2, adjustedSneak)) {
                    this.a487(false);
                    return new mo_(66, 36864);
                }
                this.a773(this._B, true, -12331);
                this.d150(113);
                return new mo_(66, 0);
            }
        }
    }
    
    final void a345(final RaidMember u, final boolean b, final int b2) {
        this._B = this.a417(b2, b);
        if (this._B != -1) {
            this.b150(-92);
        }
        this._p.a093(b2);
        this._B = b2;
        final Room ai_ = this.dungeonLayout[b2];
        if (0 == ai_.roomType || ai_.roomType == 3) {
            this._j.a093(b2);
            this._d.a093(b2);
        }
        if (2 != ai_.roomType && !this._j.a370(b2)) {
            this.a540(16);
            this.activeRaidMember = u;
        }
        else {
            this.b150(-113);
            this.a540(8);
        }
    }
    
    //original signature: final void a183(final boolean b, final int n, final int n2) {
    final void a183(final int roomId) {
        final Trap trap = this.dungeonLayout[roomId].trap;
        this.e093(trap.a080(8)); //stat reduction?
        this.a326(-3, trap.a080(4), roomId);
    }
    
    final int[] b574(final int n, final byte b) {
        int n2 = 0;
        if (n % 7 != 0 && this._v.a370(n - 1 - n / 7)) {
            ia_._S[n2++] = n - 1 - n / 7;
        }
        if (n % 7 != 6 && this._v.a370(n - n / 7)) {
            ia_._S[n2++] = -(n / 7) + n;
        }
        if (6 < n) {
            if (this._v.a370(35 + n)) {
                ia_._S[n2++] = 35 + n;
            }
        }
        if (42 > n) {
            if (this._v.a370(n + 42)) {
                ia_._S[n2++] = n + 42;
            }
        }
        final int[] array = new int[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = ia_._S[i];
        }
        return array;
    }
    
    final int c137(final int n) {
        int n2 = 0;
        final RaidMember[] a = this.raidMembers;
        for (int i = 0; i < a.length; ++i) {
            final RaidMember hb_ = a[i];
            if (hb_ != null) {
                if (0x0 == (hb_.status & 0x6)) {
                    n2 += hb_.sneak + hb_.attack - (-hb_.defence - hb_.dodge);
                }
            }
        }
        if (n > -77) {
            pj_._w = null;
        }
        int o = 100 * n2;
        if (o > 50000) {
            o = 50000;
        }
        if (this.renownDividedBy10 < o) {
            o = this.renownDividedBy10;
        }
        return o;
    }
    
    final int[] a464(final byte b, final int n) {
        return nf_.a197(this._v, n);
    }
    
    private final void a016(final byte b, final int n, final boolean b2) {
        final Room ai_ = this.dungeonLayout[n];
        if (b != -52) {
            e150(-22);
        }
        final Trap h = ai_.trap;
        if (b2) {
            this.a305(h.a080(1), h.a080(0), this.activeRaidMember, -110);
            if (h.hasAbility(TrapAbility.VAMPIRE_LORD.getValue())) {
                if (ai_.trap.defence << 1 > ai_.defence1) {
                    final Room ai_2 = ai_;
                    ++ai_2.defence2;
                    final Room ai_3 = ai_;
                    ++ai_3.defence1;
                }
                if (ai_.trap.attack << 1 > ai_.attack1) {
                    final Room ai_4 = ai_;
                    ++ai_4.attack2;
                    final Room ai_5 = ai_;
                    ++ai_5.attack1;
                }
            }
            final int a080 = h.a080(16);
            if (a080 > 0) {
                final RaidMember[] a81 = this.raidMembers;
                for (int i = 0; i < a81.length; ++i) {
                    final RaidMember hb_ = a81[i];
                    if (hb_ != null && 0x0 == (0x6 & hb_.status)) {
                        this.a305(a080, a080, hb_, b ^ 0x7C);
                    }
                }
            }
        }
    }
    
    final void b150(final int n) {
        if (-1 != this._q && this.dungeonLayout[this._q].trap.hasAbility(2)) {
            this._j.b093(this._q, 31);
        }
        if (n > -83) {
            return;
        }
        this.a366(this._q = this._B, (byte)(-90));
    }
    
    static final void a054(final int n, final long n2) {
        if (n >= n2) {
            return;
        }
        if (n2 % 10L != 0L) {
            ln_.a157(n2);
        }
        else {
            ln_.a157(n2 - 1L);
            ln_.a157(1L);
        }
    }
    
    final void a487(final boolean b) {
        this._j.a093(this._B);
        this._d.a093(this._B);
        final Room room = this.dungeonLayout[this._B];
        if (room.defence1 > room.trap.defence) {
            room.defence1 = room.trap.defence;
        }
        if (room.trap.snare < room.snare1) {
            room.snare1 = room.trap.snare;
        }
        if (room.detect1 > room.trap.detect) {
            room.detect1 = room.trap.detect;
        }
        if (room.trap.attack < room.attack1) {
            room.attack1 = room.trap.attack;
        }
        this.b150(-111);
        this.a540(32);
        this.a540(8);
    }
    
    final void d150(final int n) {
        final Room room = this.dungeonLayout[this._B];
        final Trap trap = room.trap;
        final int g = trap.roomType;
        final Raider activeRaider = this.activeRaidMember.raider;
        if (g != 3) {
            int i = room._i ? 1 : 0;
            if (i != 0 && !trap.hasAbility(RaiderAbility.ARMORED.getValue())) {
                if (activeRaider.hasAbility(RaiderAbility.FRAGILITY.getValue())) {
                    i = 0;
                }
                if (activeRaider.hasAbility(7) && room.isMonster && this.activeRaidMember.status == 0) {
                    final RaidMember u = this.activeRaidMember;
                    u.status |= 0x1;
                    this.a487(false);
                    return;
                }
                if (activeRaider.hasAbility(20)) {
                    if (this.activeRaidMember.defence > 1) {
                        i = 0;
                        final RaidMember u2 = this.activeRaidMember;
                        --u2.defence;
                    }
                }
            }
            if (activeRaider.hasAbility(RaiderAbility.FRAGILITY.getValue())) {
                i = 1;
            }
            if (i != 0) {
                this.activeRaidMember.a487(false);
            }
            else {
                this.activeRaidMember.a150(3);
            }
            this.a016((byte)(-52), this._B, true);
            this._B = this._q;
            this.a540(32);
            boolean b = false;
            final RaidMember[] raidMembers = this.raidMembers;
            for (int n3 = 0; raidMembers.length > n3; ++n3) {
                if (this.b121(0, raidMembers[n3])) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                this.a540(8);
            }
            this.a671(this.activeRaidMember, 6);
            return;
        }
        this.b150(-106);
        this._j.a093(this._B);
        this._d.a093(this._B);
        this.a540(32);
        this.a540(8);
    }
    
    //original signature: static final String a022(final byte b, final int n, String s) {
    static final String a022(final int n, String s) {
        s = ((s != null) ? s : ng_.title_dtdtdt);
        if (!mh_.a097(n)) {
            return s;
        }
        return ln_.a173(n, s);
    }
    
    //original signature: private final mo_ a078(final int n, final Room ai_, final byte b, final boolean b2) {
    private final mo_ a078(final int action, final Room room, final byte b, final boolean b2) {
        int n2 = b2 ? 0 : 1;
        final Raider raider = this.activeRaidMember.raider;
        if (raider.hasAbility(RaiderAbility.FIRST_STRIKE.getValue())) {
            n2 = 1;
        }
        if (action == RaidAction.FLEE.getValue()) { //flee
            n2 = 0;
        }
        boolean hasFerocityBeenUsed = false;
        int a080 = room.trap.a080(17);
        int raiderDefence = this.activeRaidMember.defence;
        int raiderAttack = this.activeRaidMember.attack;
        int monsterAttack = room.attack2;
        int monsterDefence = room.defence2;
        
        if (b < 16) {
            this.c068(-99, 88, -59, -18, 46);
        }
        
        if ((0x1 & this.activeRaidMember._d) != 0x0) {
            raiderDefence <<= 1; //double defence
        }
        
        //ability stuff?
        if (((0x1 & this._t) != 0x0 || 0x0 != (this.activeRaidMember._d & 0x4)) & room.trap.roomType == 2) {
            monsterAttack = 1 + monsterAttack >> 1;
            monsterDefence = 1 + monsterDefence >> 1;
        }
        
        int zealotModifiedMonsterAttack = monsterAttack - this.aliveZealots;
        
        if (0 > zealotModifiedMonsterAttack) {
            zealotModifiedMonsterAttack = 0;
        }
        
        //demon lord
        if (room.trap.hasAbility(TrapAbility.TERRORIZE.getValue()) && raiderDefence << 1 <= zealotModifiedMonsterAttack) {
            this.a093(3);
            return new mo_(66, 32768); //flee in terror
        }
        
        int n6 = b2 ? 16384 : 0;
        
        if (n2 != 0) {
            n6 |= 0x2000;
        }
        if (action == RaidAction.FLEE.getValue()) {
            n6 |= 0x8000;
        }
        if (action == RaidAction.CHARGE.getValue()) { //charging
            ++raiderAttack;
            --raiderDefence;
        }
        
        int n7 = 0;
        int n10;
        while (true) {
            ++n7;
            if (n2 != 0) {
                int attack = (action == RaidAction.FLEE.getValue()) ? this.activeRaidMember.dodge : raiderAttack;
                final int defence = (action == RaidAction.FLEE.getValue()) ? room.snare2 : monsterDefence;
                if (action != RaidAction.FLEE.getValue()) { //not fleeing
                    if (raider.hasAbility(RaiderAbility.FEROCITY.getValue())) {
                        if (!hasFerocityBeenUsed) {
                        	hasFerocityBeenUsed = true;
                            attack <<= 1; //double attack
                        }
                    }
                }
                if (this.isRollSuccessful(defence, attack)) {
                    if (a080 <= 0) {
                        if (action != RaidAction.FLEE.getValue()) { //not fleeing
                            this.a487(false); //reset?
                        }
                        else {
                            this.a150(-8);
                        }
                        n10 = (n6 | 0x1000);
                        break;
                    }
                    --a080;
                }
                if (defence > attack + 5) {
                    if (action == RaidAction.FLEE.getValue()) {
                        this.a150(-8);
                    }
                    else {
                        this.a487(false);
                    }
                    n10 = (n6 | 0x1000);
                    n7 = 5;
                    break;
                }
            }
            n2 = 1;
        }
        if (n7 > 5) {
            n7 = 5;
        }
        return new mo_(66, n10 | n7);
    }
    
    //dark arts stuff
    private final void a305(int n, int n2, final RaidMember hb_, final int n3) {
        if (!hb_.raider.hasAbility(RaiderAbility.DARK_ARTS.getValue())) {
            if (n2 >= hb_.attack) {
                hb_.attack = 0;
            }
            else {
                hb_.attack -= n2;
            }
            if (hb_.defence <= n) {
                hb_.a487(false);
            }
            else {
                hb_.defence -= n;
            }
        }
        else {
            if (n2 > hb_.attack) {
                n2 -= hb_.attack;
                n += n2;
                hb_.attack = 0;
            }
            else {
                hb_.attack -= n2;
            }
            if (hb_.defence - 1 >= n) {
                hb_.defence -= n;
            }
            else {
                n -= hb_.defence - 1;
                hb_.defence = 1;
                if (hb_.attack < n) {
                    hb_.a487(false);
                }
                else {
                    hb_.attack -= n;
                }
            }
        }
        if (n3 > -68) {
            this.a345(null, false, -72);
        }
    }
    
    //original signature: private final void a984(final int n, final ec_ ec_, final wm_ wm_) {
    private final void readDungeon(final ec_ ec_, final DungeonPath wm_) {
        for (int n2 = 0; wm_.dungeonPath.length > n2; ++n2) {
            wm_.dungeonPath[n2] = ec_.readInt();
        }
    }
    
    final void a150(final int n) {
        this._B = this._q;
        this.a540(32);
        if (n != -8) {
            this.claimedBountyAmount = 36;
        }
        this.a540(8);
    }
    
    final boolean b097(final int n, final int n2) {
        if (-1 == n) {
            return false;
        }
        final Room room = this.dungeonLayout[n];
        if (n2 != 27747) {
            this.b150(-54);
        }
        if (this.raidStatus == 4) {
            return room.roomType == 3;
        }
        return (8 == this.raidStatus || this.raidStatus == 32) && this._m.a370(n);
    }
    
    //original signature:  private final int a410(final byte b) {
    private final int a410() {
        int n = 0;
        for (int n2 = 0; 4 > n2; ++n2) {
            if (this.raidMembers[n2] != null) {
                if (0x0 == (0x6 & this.raidMembers[n2].status)) {
                    if (0 == oi_.getRandom(3)) {
                        if (!this.raidMembers[n2].raider.hasAbility(RaiderAbility.FIRE_IMMUNITY.getValue())) {
                            this.a125(107, this.raidMembers[n2]);
                            n |= 1 << n2;
                        }
                    }
                }
            }
        }
        return n;
    }
    
    private final void a366(final int n, final byte b) {
        this._m.clearDungeonPath();
        this._b.clearDungeonPath();
        co_._I.b150(-4);
        co_._I.a865(new a_(n));
        this._m.a093(n);
        while (!co_._I.a427()) {
            final int j = ((a_)co_._I.b081())._j;
            if (0 < j % 7) {
                this.a966(co_._I, 49, j - 1, j - 1 - j / 7, true);
            }
            if (6 > j % 7) {
                this.a966(co_._I, 49, 1 + j, -(j / 7) + j, false);
            }
            if (j > 6) {
                this.a966(co_._I, 49, j - 7, j - 7 + 42, false);
            }
            if (j >= 42) {
                continue;
            }
            this.a966(co_._I, 49, 7 + j, j + 42, true);
        }
    }
    
    final int d080(final int n, final int n2) {
        if (n2 != 30813) {
            this.d080(-124, -104);
        }
        int n3 = 0;
        if (n % 7 != 0) {
            if (this._v.a370(-(n / 7) - 1 + n)) {
                n3 |= 0x1;
            }
        }
        if (6 != n % 7 && this._v.a370(n - n / 7)) {
            n3 |= 0x2;
        }
        if (n > 6 && this._v.a370(n + 35)) {
            n3 |= 0x4;
        }
        if (42 > n && this._v.a370(42 + n)) {
            n3 |= 0x8;
        }
        return n3;
    }
    
    //calculate gold to steal?
    private final double c068(final int n, final int n2, final int n3, final int n4, final int n5) {
        int numberOfThieves = 0;
        for (int i = 0; i < 4; ++i) {
            final RaidMember raidMember = this.raidMembers[i];
            if (raidMember != null && (0x6 & raidMember.status) == 0x0) {
                if (raidMember.raider.hasAbility(RaiderAbility.THIEVERY.getValue())) {
                    ++numberOfThieves;
                }
            }
        }
        if (n4 != 2) {
            a054(-70, 33L);
        }
        return rm_.a802(numberOfThieves, n5, ek_.a780(this._s, n, n2), n3);
    }
    
    final mo_ a395(final RaidMember hb_, final ec_ ec_, final int n) {
        if (n <= 70) {
            this._B = 63;
        }
        hb_.status |= 0x1;
        final int s = hb_.raider.activeAbility;
        if (2 == s) {
            final RaidMember hb_3;
            final RaidMember hb_2 = hb_3 = this.raidMembers[ec_.readByte()];
            hb_3.status &= 0xFFFFFFFB;
            hb_2.a150(3);
            if (128 == this.raidStatus) {
                this.a540(128);
            }
            else {
                this.a540(8);
            }
            final ec_ ec_2 = new ec_(3);
            ec_2.storeByte(2);
            ec_2.storeByte(hb_.position);
            ec_2.storeByte(hb_2.position);
            return new mo_(65, ec_2);
        }
        if (15 == s || s == 4) {
            final int c474 = ec_.readByte();
            this._p.a093(c474);
            if (4 == s) {
                this.a773(c474, false, -12331);
                this.a183(c474);
                this.a016((byte)(-52), c474, false);
            }
            this.a540(this.raidStatus);
            final ec_ ec_3 = new ec_(9);
            ec_3.storeByte(8);
            ec_3.storeByte(hb_.position);
            ec_3.storeByte(c474);
            this.dungeonLayout[c474].a785(-12, true, ec_3);
            ec_3.storeByte(this.d080(c474, 30813));
            return new mo_(65, ec_3);
        }
        if (s == 6 || s == 21) {
            final RaidMember hb_4 = this.raidMembers[ec_.readByte()];
            hb_4.a487(false);
            hb_.status &= 0xFFFFFFF9;
            hb_.status &= 0xFFFFFFFE;
            this.a540(8);
            final ec_ ec_4 = new ec_(3);
            ec_4.storeByte(2);
            ec_4.storeByte(hb_.position);
            ec_4.storeByte(hb_4.position);
            return new mo_(65, ec_4);
        }
        if (s == 18) {
            final RaidMember hb_5 = this.raidMembers[ec_.readByte()];
            hb_5.a487(false);
            hb_.status &= 0xFFFFFFFE;
            this.a487(false);
            final ec_ ec_5 = new ec_(3);
            ec_5.storeByte(2);
            ec_5.storeByte(hb_.position);
            ec_5.storeByte(hb_5.position);
            return new mo_(65, ec_5);
        }
        if (s == 9 || 22 == s) {
            this.a487(false);
            final ec_ ec_6 = new ec_(2);
            ec_6.storeByte(1);
            ec_6.storeByte(hb_.position);
            return new mo_(65, ec_6);
        }
        if (3 == s) {
            this._B = this._q;
            this.a540(8);
            final ec_ ec_7 = new ec_(2);
            ec_7.storeByte(1);
            ec_7.storeByte(hb_.position);
            return new mo_(65, ec_7);
        }
        if (s == 13) {
            final int c475 = ec_.readByte();
            final int c476 = ec_.readByte();
            this._p.a093(c475);
            this._p.a093(c476);
            this.a540(this.raidStatus);
            final ec_ ec_8 = new ec_(16);
            ec_8.storeByte(15);
            ec_8.storeByte(hb_.position);
            ec_8.storeByte(c475);
            ec_8.storeByte(c476);
            this.dungeonLayout[c475].a785(-12, true, ec_8);
            ec_8.storeByte(this.d080(c475, 30813));
            this.dungeonLayout[c476].a785(-12, true, ec_8);
            ec_8.storeByte(this.d080(c476, 30813));
            return new mo_(65, ec_8);
        }
        if (s == 5) {
            this._t |= 0x1;
            this.a540(this.raidStatus);
            final ec_ ec_9 = new ec_(2);
            ec_9.storeByte(1);
            ec_9.storeByte(hb_.position);
            return new mo_(65, ec_9);
        }
        if (s == 0 || 19 == s || s == 24) {
            final RaidMember hb_6 = this.raidMembers[ec_.readByte()];
            if (s != 0) {
                if (s == 19) {
                    final RaidMember hb_7 = hb_6;
                    hb_7._d |= 0x2;
                }
                else if (s == 24) {
                    final RaidMember hb_8 = hb_6;
                    hb_8._d |= 0x4;
                }
            }
            else {
                final RaidMember hb_9 = hb_6;
                hb_9._d |= 0x1;
            }
            this.a540(this.raidStatus);
            final ec_ ec_10 = new ec_(3);
            ec_10.storeByte(2);
            ec_10.storeByte(hb_.position);
            ec_10.storeByte(hb_6.position);
            return new mo_(65, ec_10);
        }
        if (s == 16) {
            final int c477 = ec_.readByte();
            final int c478 = ec_.readByte();
            hb_.attack = c477;
            hb_.defence = c478;
            final ec_ ec_11 = new ec_(4);
            ec_11.storeByte(3);
            ec_11.storeByte(hb_.position);
            ec_11.storeByte(c477);
            ec_11.storeByte(c478);
            return new mo_(65, ec_11);
        }
        throw new IllegalStateException("Invalid ability use!");
    }
    
    private final void a966(final md_ md_, final int n, final int n2, int n3, final boolean b) {
        if (!this._v.a370(n3) || this._m.a370(n2)) {
            return;
        }
        this._m.a093(n2);
        if (n != 49) {
            a022(-25, null);
        }
        if (this._j.a370(n2)) {
            md_.a865(new a_(n2));
        }
        else {
            if (b) {
                n3 += 84;
            }
            this._b.a093(n3);
        }
    }
    
    pj_() {
        this._v = new DungeonPath(84);
        this.dungeonLayout = new Room[49];
        this._p = new DungeonPath(49);
        this._j = new DungeonPath(49);
        this._d = new DungeonPath(49);
        this._g = 0;
        this.raidMembers = new RaidMember[4];
        this._B = -1;
        this.activeRaidMember = null;
        this._q = -1;
        this.raidStatus = 1;
        this.claimedBountyAmount = 0;
        for (int i = 0; i < 49; ++i) { //initialize empty dungeon
            this.dungeonLayout[i] = new Room(0);
        }
        final Room[] h = this.dungeonLayout;
        final Room[] h2 = this.dungeonLayout;
        final Room[] h3 = this.dungeonLayout;
        final Room[] h4 = this.dungeonLayout;
        
        final Room corner = new Room(3);
        h3[42] = (h4[48] = corner); //corner
        h[0] = (h2[6] = corner); //corner
        
        this.dungeonLayout[24] = new Room(2); //center
        
        this._p.a093(0);
        this._p.a093(6);
        this._p.a093(42);
        this._p.a093(48);
        this._b = new DungeonPath(168);
        (this._m = new DungeonPath(49)).a093(0);
        this._m.a093(6);
        this._m.a093(42);
        this._m.a093(48);
    }
    
    static {
        pj_._w = new boolean[64];
        pj_.create_alert_email_unavailable = "Email address is unavailable";
        pj_._x = 0;
        pj_.time = 0L;
    }
}
