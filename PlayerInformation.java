//original name: lb_
final class PlayerInformation
{
	//original name: _w
    int _w;
    static Graphic _C;
    //original name: _i
    int raidStreakStartDate;
    int _K;
    static Graphic _o;
    //original name: _O
    static String charset;
    //original name: _v
    static Graphic piece_demon;
    //original name: _r
    int defencesSuccessful;
    //original name: _u
    int collectedBounties;
    private long[] _c;
    private int[] _n;
    int[] _J;
    //original name: _L
    Room[] dungeonLayout;
    int _l;
    private int[] _M;
    DungeonPath _k;
    //original name: _E
    static String previous;
    //original name: _H
    boolean isDungeonActivated;
    int _b;
    //original name: _g
    int totalEarnedTreasure;
    int _e;
    int _q;
    //original name: _h
    int raidsSuccessful;
    //original name: _B
    int raidsAttempted;
    //original name: _N
    int renown;
    int[] _F;
    private int[] _G;
    long[] _t;
    //original name: _m
    int highestRenown;
    //original name: _p
    int raidByDate;
    //original name: _d
    static String[] tutorial_monster2;
    //original name: _x
    static String tip_skeleton_sentinels;
    int _D;
    int _A;
    int _I;
    private long[] _j;
    //original name: _a
    RaidMember[] stableMembers;
    int _f;
    //original name: _y
    int defencesAttempted;
    int _z;
    //original name: _s
    int unspentTreasureAmount;
    
    static final void a487() {
        for (int n = 0; 8 > n; ++n) {
            final RaidMember hb_ = um_.stableMembers[n];
            if (hb_ != null) {
                hb_._i = qe_.a814(hb_, 0);
            }
        }
    }
    
    //get player info?
    //original signature: private final void a994(final ec_ ec_, final int n2) {
    private final void a994(final ec_ buffer) {
        this.isDungeonActivated = ((buffer.readByte() & 0x1) != 0x0);
        this.renown = buffer.readInt();
        this._l = buffer.readInt(); //reputation lost?
		this.unspentTreasureAmount = buffer.readInt();
		this.highestRenown = buffer.readInt();
		this._b = -this.renown + this._l; //new renown?
        buffer.readInt();
		this._q = buffer.readInt(); //reset dungeon layout?
        this._K = buffer.readByte(); //??
        this.raidsAttempted = buffer.readTribyte(-122);
        this.raidsSuccessful = buffer.readTribyte(-119);
        this._D = buffer.readShort(); //unused?
        
        this.defencesAttempted = buffer.readTribyte(-105);
        this.defencesSuccessful = buffer.readTribyte(-121);
        this._I = buffer.readShort(); //unused?
        
        this._w = rm_.getNextByte(buffer); //something to do with title
        buffer.readByte();
        
        //read dungeon info
        for (int i = 0; i < this._k.dungeonPath.length; ++i) {
            this._k.dungeonPath[i] = buffer.readInt();
        }
        
        (this.dungeonLayout = new Room[49])[24] = new Room(2);
        final Room[] l = this.dungeonLayout;
        final int n3 = 0;
        final Room[] j = this.dungeonLayout;
        final int n4 = 6;
        final Room[] k = this.dungeonLayout;
        final int n5 = 42;
        final Room[] m = this.dungeonLayout;
        final int n6 = 48;
        final Room corner = new Room(3);
        k[n5] = (m[n6] = corner);
        l[n3] = (j[n4] = corner);
        
        for (int n7 = 0; 49 > n7; ++n7) {
            if (n7 != 0 && n7 != 6 && n7 != 24 && n7 != 42 && 48 != n7) {
                this.dungeonLayout[n7] = gk_.createRoom(buffer);
            }
        }
        this.stableMembers = new RaidMember[8];
        for (int n8 = 0; 8 > n8; ++n8) {
            this.stableMembers[n8] = corner.createRaidMember(buffer, n8);
        }
        
        this._F = new int[6]; //orbs being charged?
        this._e = 0;
        this._J = new int[6]; //orbs being charged?
        for (int n9 = 0; n9 < 6; ++n9) {
		    this._J[n9] = buffer.readShort();
		}
		for (int n10 = 0; n10 < 6; ++n10) {
		    final int c474 = buffer.readByte();
		    this._F[n10] = c474;
		    this._e += c474;
		}
		this._f = buffer.readShort();
		this._A = buffer.readInt();
		this._z = buffer.readByte();
        for (int n13 = 0; 10 > n13; ++n13) {
            this._c[n13] = buffer.c411();
            this._G[n13] = buffer.readTribyte();
        }
        for (int n14 = 0; n14 < 10; ++n14) {
            this._t[n14] = buffer.c411();
            this._n[n14] = buffer.readTribyte();
        }
        for (int n15 = 0; 10 > n15; ++n15) {
            if (0L == this._c[n15]) {
                this._c[n15] = -1L;
                this._G[n15] = 0;
            }
            if (0L == this._t[n15]) {
                this._t[n15] = -1L;
                this._n[n15] = 0;
            }
        }
        for (int n16 = 0; n16 < 10; ++n16) {
		    this._j[n16] = buffer.c411();
		    this._M[n16] = buffer.readInt();
		}
        this.collectedBounties = buffer.readByte();
        buffer.readShort();
        this.totalEarnedTreasure = buffer.readInt();
        this.raidStreakStartDate = buffer.readInt();
        this.raidByDate = buffer.readInt();
    }
    
    public static void a423() {
        PlayerInformation.previous = null;
        PlayerInformation._C = null;
        PlayerInformation.charset = null;
        PlayerInformation.tip_skeleton_sentinels = null;
        PlayerInformation._o = null;
        PlayerInformation.tutorial_monster2 = null;
        PlayerInformation.piece_demon = null;
    }
    
    //original signature: static final void a583(final se_ x, final se_ c, final int l, final int n) {
    static final void a583(final se_ x, final se_ c) {
        wa_._l = 480;
        i_._x = x;
        n_._c = c;
        DungeonPath.a679();
        mi_.a050(x._N, x._E + x._N, c._N, c._N + c._E);
    }
    
    //original signature: PlayerInformation(final ec_ ec_, final int n) {
    PlayerInformation(final ec_ ec_) {
        this();
        this.a994(ec_);
    }
    
    static final char a328(final char c) {
        if (c != 'µ' && '\u0192' != c) {
            return Character.toTitleCase(c);
        }
        return c;
    }
    
    PlayerInformation() {
        this._n = new int[10];
        this._M = new int[10];
        this._G = new int[10];
        this.raidByDate = -1;
        this._t = new long[10];
        this._c = new long[10];
        this._j = new long[10];
        this._w = -1;
        this._b = 0;
        this.highestRenown = 2500;
        this._q = -1;
        this._l = 2500;
        this.unspentTreasureAmount = 2500;
        this.renown = 2500;
        this._k = new DungeonPath(84);
        this.stableMembers = new RaidMember[8];
        this.dungeonLayout = new Room[49];
        for (int i = 0; i < 49; ++i) { //dungeon loop
            if (24 == i) { //center
                this.dungeonLayout[i] = new Room(2);
            }
            else if (i == 0 || 6 == i || i == 42 || i == 48) { //corners
                this.dungeonLayout[i] = new Room(3);
            }
            else {
                this.dungeonLayout[i] = new Room(0);
            }
        }
        this._J = new int[6];
        this._F = new int[6];
        this._A = -1;
        for (int j = 0; j < 10; ++j) {
            this._c[j] = (this._t[j] = -1L);
        }
        for (int n = 0; 10 > n; ++n) {
            this._j[n] = -1L;
            this._M[n] = -1;
        }
        this.collectedBounties = 0;
    }
    
    static {
        PlayerInformation.charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        PlayerInformation.previous = "Previous";
        PlayerInformation.tutorial_monster2 = new String[] { null, "When a raider enters a room containing a monster, it will fight to the death. As the raider and monster exchange blows, the <%attack> of one is compared to the <%defence> of the other to see if the strike breaks through the other's guard." };
        PlayerInformation.tip_skeleton_sentinels = "Regenerate when raider leaves.";
    }
}
