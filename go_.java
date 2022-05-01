import java.util.*;

final class go_ extends qe_
{
    static String[] _A;
    private boolean _w;
    //original name: _S
    static Graphic scrollbar_bottom;
    pj_ _Y;
    //original name: _F
    static String pit;
    //original name: _V
    static String text_topdown;
    private int _H;
    private nn_ _M;
    private int _I;
    private int[] _P;
    private pp_ _O;
    private int _s;
    private int _u;
    private String _E;
    private RaidMember _y;
    private boolean _v;
    private int _C;
    private hj_[] _z;
    //original name: _W
    private String text_status_pregame;
    private int[] _U;
    private boolean _Q;
    private pp_ _N;
    private pp_ _r;
    private HeaderLabelText _x;
    private md_ _B;
    private int _G;
    private pp_ _J;
    private cl_ _R;
    private md_ _T;
    private pp_ _t;
    ni_ _D;
    private int _X;
    ni_ _L;
    private pp_ _K;
    
    //original signature: final void b093(final int n, final int n2) {
    final void b093(final int n) {
        if (!this._w) {
            final mo_ b669 = this._Y.b669(this._Y.renownDividedBy10, gm_.playerInformation.renown, 18833, n, this._Y.renown);
            b669._c.currentIndex = 0;
            this.a739(true, b669._c, 122);
            return;
        }
        if (!this.h154(26)) {
            return;
        }
        Trap._B.storeFuzzedOpcode(69);
        Trap._B.storeShort(n);
    }
    
    private final void a700(final byte b, final RaidMember y) {
        final int s = y.raider.activeAbility;
        this._I = -1;
        this._G = -1;
        this._y = y;
        final ec_ ec_ = new ec_(1);
        ec_.storeByte(y.position);
        if (9 == s || s == 22 || 3 == s || s == 5) {
            this.a334(y, true);
            this.a603(ec_, 114);
            this._y = null;
        }
        else if (s != 0) {
            if (19 != s) {
                if (24 == s) {
                    this.setPregameStatusString(jd_.text_hint_ability_glamour);
                }
                else if (s == 2) {
                    this.setPregameStatusString(mo_.text_hint_revive);
                }
                else if (15 != s && 4 != s) {
                    if (6 != s) {
                        if (21 != s) {
                            if (s != 18) {
                                if (s == 13) {
                                    this.setPregameStatusString(li_.text_hint_spy);
                                }
                                else if (s != 16) {
                                    this._y = null;
                                    this.setPregameStatusString();
                                }
                                else {
                                    this.setPregameStatusString(eb_.text_hint_redistribute);
                                    super._b = new hn_(y.raider.name.toUpperCase(), y.attack + y.defence, y.raider.attack, y.attack);
                                }
                            }
                            else {
                                this.setPregameStatusString(wf_.text_hint_sacrifice_raider);
                            }
                        }
                        else {
                            this.setPregameStatusString(ta_.text_hint_sacrifice_greenskin);
                        }
                    }
                    else {
                        this.setPregameStatusString(em_.text_hint_sacrifice_goblin);
                    }
                }
                else {
                    this.setPregameStatusString(rl_.text_hint_scout_room);
                }
            }
            else {
                this.setPregameStatusString(bb_.text_hint_ability_boostsneak);
            }
        }
        else {
            this.setPregameStatusString(pe_.text_hint_ability_boostdef);
        }
    }
    
    static final void b423(final byte b) {
        if (b != 14) {
            go_._A = null;
        }
        ub_._n.a797();
        hm_._n.a797();
        --lj_._r;
        if (0 == lj_._r) {
            lj_._r = 200;
            for (fa_ fa_ = (fa_)ud_._v.e024(); null != fa_; fa_ = (fa_)ud_._v.a024(b ^ 0xA)) {
                if (!fa_._o.c154(-62)) {
                    fa_.a487(false);
                }
            }
            if (oi_._F != null) {
                for (fa_ fa_2 = (fa_)oi_._F.e024(); null != fa_2; fa_2 = (fa_)oi_._F.a024(4)) {
                    if (!fa_2._o.c154(-67)) {
                        fa_2.a487(false);
                    }
                }
            }
        }
        if (null == ob_._Xb || !ob_._Xb.b427((byte)(-124))) {}
    }
    
    //original signature: private final void a590(final byte b, final Room ai_) {
    private final void a590(final Room room) {
        if (null != room.trap.victoryAnimation) {
            room._c.a942(room.trap.victoryAnimation);
        }
        if (null != room.trap._x) {
            gd_.a364(64, room.trap._x);
        }
    }
    
    @Override
    final void b487(final boolean b) {
        t_.a124(64, g_.da_ingame_stealth, true);
    }
    
    final void a423(final byte b) {
        if (!gl_.topDownOrIsometric) {
            this._R = new lj_(this, 320, 210);
        }
        else {
            this._R = new sf_(this, 320, 240);
        }
    }
    
    //original signature: private final void c093(final int n, final int n2) {
    private final void c093(final int action) {
        if (!this._w) {
            final int b = this._Y._B;
            boolean b2 = false;
            if (kn_.isTutorial) {
                int n3 = 0;
                final RaidMember[] a = this._Y.raidMembers;
                for (int n4 = 0; a.length > n4; ++n4) {
                    final RaidMember raidMember = a[n4];
                    if (null != raidMember) {
                        if ((raidMember.status & 0x6) == 0x0) {
                            ++n3;
                        }
                    }
                }
                b2 = (n3 != 0);
            }
            final mo_ mo_ = b2 ? this._Y.handleTutorialTrapEncounter(action) : this._Y.handleTrapEncounter((byte)121, action); //does battle calculations
            mo_._c.currentIndex = 0;
            this.a536(true, mo_._c, b);
            return;
        }
        if (!this.h154(6)) {
            return;
        }
        if (action != 2) {
            if (action == 1) {
                Trap._B.storeFuzzedOpcode(66);
            }
            else {
                Trap._B.storeFuzzedOpcode(65);
            }
        }
        else {
            Trap._B.storeFuzzedOpcode(67);
        }
    }
    
    //original signature: private final void i150(final int n) {
    private final void i150() {
    	//24 center room?
        if (!this._Y._p.a370(24)) {
            this.b540(24);
        }
        this._Y.a345(this._Y.activeRaidMember, true, 24);
        this._Y.a540(64);
        this.setPregameStatusString(um_.text_hoardroom_hint);
        super._b = new ro_(this);
    }
    
    public static void f150(final int n) {
        go_._A = null;
        go_.pit = null;
        if (n != 10) {
            b423((byte)(-114));
        }
        go_.text_topdown = null;
        go_.scrollbar_bottom = null;
    }
    
    private final void b081(final Room ai_, final int n) {
        if (ai_.trap.defeatAnimation != null) {
            ai_._c.a721(li_._h, ai_.trap.defeatAnimation);
        }
        if (null != ai_.trap._p) {
            gd_.a364(64, ai_.trap._p);
        }
    }
    
    private final void g487(final boolean b) {
        super.b487(b);
        bl_.a423();
        for (int n = 0; 6 > n; ++n) {
            np_._I[n] = 110 - la_.roman12._H * (n * 4) / 3;
        }
        jh_.a276(super._e);
        qe_.a268(super._e, 0, 0, 640, 480, 320, 240);
        vo_.a050(82, 398, 336, 152);
        vo_.a050(72, 408, 185, 0);
        vo_.a050(72, 408, 185, 455);
        jc_.a669(32, 164, 8, 1, 2, 1);
        jc_.a669(32, 468, 8, 1, 2, 1);
        jc_.a669(352, 32, 48, 1, 2, 1);
        jc_.a669(352, 600, 48, 1, 2, 1);
        je_.a749(352, 48, pi_.interface_lattice, 0, 32);
        je_.a749(352, 48, pi_.interface_lattice, 608, 32);
        c_.a842(0);
        c_.a842(40);
        vd_.a669(200, 2, 0, 0, 400);
        vd_.a669(200, 0, 2, 440, 400);
        vd_.a669(360, 2, 2, 140, 390);
        ke_.a115(185, 72, 408);
        ke_.a115(447, 72, 408);
        ke_.a115(144, 2, 398);
        ke_.a115(488, 2, 398);
        en_.a775(40, 552, 100, 60);
        jh_.b797();
        new rh_(191, 345, 80, 160, 16711680, 768, 249);
        new rh_(449, 345, 80, 160, 16711680, 768, 249);
        this.a423((byte)57);
        final RaidMember[] raidMembers = this._Y.raidMembers;
        for (int n2 = 0; raidMembers.length > n2; ++n2) {
            final RaidMember raidMember = raidMembers[n2];
            if (raidMember != null) {
                raidMember._b = new wd_(raidMember.raider.idleAnimation);
                if ((raidMember.status & 0x6) != 0x0) {
                    raidMember._b._e = 0;
                    raidMember._b._k = 1;
                }
            }
        }
    }
    
    private final void a334(final RaidMember hb_, final boolean b) {
        if (hb_.raider.specialTrack != null) {
            gd_.a364(64, hb_.raider.specialTrack);
        }
        if (!b) {
            this._B = null;
        }
    }
    
    //original signature: private final void e423(final byte b) {
    private final void e423() {
        ib_.c150();
        if (this._Y._g == 1) {
            t_.a124(1048576, kj_.da_raid_win, false);
        }
        else {
            if (this._Y._g == 4 || this._Y._g == 3) {
                gd_.a364(64, ef_.da_hoardroom_angry_dragon);
                final ro_ b2 = new ro_(this);
                b2.d150(2);
                super._b = b2;
            }
            t_.a124(1048576, tm_.da_raid_lose, false);
        }
    }
    
    //original signature: private final void m150(final int n) {
    private final void m150() {
        this._R.b150(-20827);
        if (this._Y.raidStatus == 128) {
            this.e423();
        }
        if (kn_.isTutorial) {
            int d = 0;
            final RaidMember[] raidMembers = this._Y.raidMembers;
            for (int i = 0; i < raidMembers.length; ++i) {
                final RaidMember raidMember = raidMembers[i];
                if (this._Y.b121(0, raidMember)) {
                    d |= 1 << raidMember.position;
                }
            }
            if (0x0 != (~cc_._d & d)) {
                gh_.a093(15);
            }
            cc_._d = d;
            boolean b = false;
            final RaidMember[] a2 = this._Y.raidMembers;
            for (int n2 = 0; a2.length > n2; ++n2) {
                final RaidMember hb_2 = a2[n2];
                if (null != hb_2) {
                    final int[] array = qa_._a[hb_2.position]; //stats
                    if (hb_2.attack != array[0] || array[1] != hb_2.defence || hb_2.dodge != array[2] || hb_2.sneak != array[3]) {
                        b = true;
                        array[3] = hb_2.raider.sneak;
                        array[2] = hb_2.raider.dodge;
                        array[0] = hb_2.raider.attack;
                        array[1] = hb_2.raider.defence;
                    }
                }
            }
            if (b) {
                if (kd_.tutorialStringIndex != 11) {
                    gh_.a093(16);
                }
            }
        }
        this.d150(-77);
        this.d487();
    }
    
    //original signature: private final void a013(final int n, final boolean b, final RaidMember hb_) {
    private final void a013(final boolean b, final RaidMember raidMember) {
        raidMember._b.a721(b ? li_._h : rf_._M, raidMember.raider.defeatAnimation);
        if (raidMember.raider.defeatTrack != null) {
            gd_.a364(64, raidMember.raider.defeatTrack);
        }
    }
    
    private final void g150(final int n) {
        this._R.c150(-30876);
        if (0 < this._X) {
            --this._X;
        }
        final RaidMember[] a = this._Y.raidMembers;
        for (int i = 0; i < a.length; ++i) {
            final RaidMember hb_ = a[i];
            if (null != hb_) {
                hb_._b.a556((byte)109, 20);
                if ((0x4 & hb_.status) != 0x0 && 1 == hb_._b._k) {
                    hb_._b.a721(0, k_._c);
                    hb_._b._e = 0;
                }
                final wd_ b = hb_._b;
                ++b._e;
            }
        }
        if (n >= -123) {
            return;
        }
        for (int j = 0; j < 49; ++j) {
            final Room room = this._Y.dungeonLayout[j];
            if (room != null) {
                if (room._c != null) {
                    room._c.a556((byte)109, 20);
                }
            }
        }
    }
    
    //original signature: private final void a996(final byte b, final ec_ ec_, final boolean b2) {
    private final void a996(final ec_ ec_, final boolean b2) {
        final int c474 = ec_.readByte();
        final int c475 = ec_.readByte();
        final RaidMember hb_ = (-1 != c475) ? this._Y.raidMembers[c475] : null;
        Room a167 = this._Y.dungeonLayout[c474];
        if (!b2) {
            a167 = bl_.a167(true, ec_, false);
            this._Y.dungeonLayout[c474] = a167;
            a167._c = new wd_(a167.trap.idleAnimation);
            this.a326(ec_.readByte(), c474);
        }
        if (!this._Y._p.a370(c474)) {
            this.b540(c474);
        }
        String trapName = a167.trap.name.toUpperCase();
        int n = -1;
        if (2 == a167.trap.roomType) {
            n = 16711680;
        }
        else if (1 != a167.trap.roomType) {
            if (3 == a167.trap.roomType) {
                n = 42962;
            }
        }
        else {
            n = 2188106;
        }
        if (n != -1) {
            trapName = "<col=" + Integer.toString(n, 16) + ">" + trapName + "</col>";
        }
        rf_._K.a018(trapName, -114, "lastroom");
        this._R.a150(2985);
        if (2 != a167.trap.roomType) {
            if (a167.trap.roomType == 1) {
                qh_.a726(this._N, 8);
                this._R.a326(-9398, 65280, c474);
            }
            else if (3 != a167.trap.roomType) {
                if (a167.roomType == 2) {
                    qh_.a726(this._K, 14);
                }
                else if (a167.roomType == 0) {
                    gh_.a093(3);
                }
                else if (a167.roomType == 3) {
                    qh_.a726(this._z[0], 1);
                }
            }
            else {
                qh_.a726(this._N, 9);
                this._R.a326(-9398, 8421631, c474);
            }
        }
        else {
            qh_.a726(this._N, 6);
            this._R.a326(-9398, 16711935, c474);
        }
        this._Y.a345(hb_, true, c474);
        if (!this._Y._j.a370(c474)) {
            this.a081(a167, 89);
        }
        if (this._Y.raidStatus == 8) {
            if (null == this._Y.activeRaidMember) {
                this.setPregameStatusString(ho_.text_hint_select_raider);
            }
            else {
                this.setPregameStatusString(pi_.text_hint_select_room);
            }
            this.m150();
        }
        else if (this._Y.raidStatus == 16) {
            this.setPregameStatusString(rn_.text_status_precombat);
            this.d150(-110);
            this.d487();
        }
    }
    
    private final void b150(final int n) {
        if (null == this._y) {
            return;
        }
    }
    
    @Override
    final void c487(final boolean b) {
        super.c487(b);
        if (0 < this._H) {
            --this._H;
        }
        if (b) {
            this.a540(true);
        }
        this.g150(-127);
        if (b) {
            this.k150();
            if (kn_.isTutorial) {
                bl_.a150(0);
            }
        }
        Label_0104: {
            if (this._E == null) {
                if (null == this.text_status_pregame) {
                    break Label_0104;
                }
            }
            else if (this._E.equals(this.text_status_pregame)) {
                break Label_0104;
            }
            this.d423((byte)(-93));
        }
        if (super._b != null) {
            if (super._b._d) {
                if (!(super._b instanceof ro_)) {
                    if (super._b instanceof hn_) {
                        final hn_ hn_ = (hn_)super._b;
                        if (hn_._s) {
                            final ec_ ec_ = new ec_(3);
                            this._y.defence = -hn_._o + hn_._n;
                            this._y.attack = hn_._o;
                            ec_.storeByte(this._y.position);
                            ec_.storeByte(this._y.attack);
                            ec_.storeByte(this._y.defence);
                            this.a334(this._y, true);
                            this.a603(ec_, 118);
                        }
                    }
                }
                else {
                    super._b.c150();
                    hm_.a668(11, -1, true, -62);
                }
                super._b.c150();
                super._b = null;
            }
        }
        final hj_[] z = this._z;
        for (int i = 0; i < z.length; ++i) {
            final hj_ hj_ = z[i];
            if (null != hj_) {
                hj_._Y = ((0x6 & hj_._V.status) == 0x0 && (this._Y.raidStatus == 8 || 4 == this._Y.raidStatus));
            }
        }
        this._O.isActive = (this._Y.activeRaidMember != null && this._Y.b121(0, this._Y.activeRaidMember));
        this._N.isActive = (16 == this._Y.raidStatus || 32 == this._Y.raidStatus);
        this._r.isActive = (this._Y.raidStatus == 16 && this._Y.dungeonLayout[this._Y._B].trap.roomType == 2 && !this._Y.dungeonLayout[this._Y._B].trap.hasAbility(15));
        this._t.isActive = (16 == this._Y.raidStatus && 2 == this._Y.dungeonLayout[this._Y._B].trap.roomType);
        this._v = ((this._Y.activeRaidMember == null || 0x0 != (0x6 & this._Y.activeRaidMember.status)) && (this._Y.raidStatus != 4 || !kn_.isTutorial));
        this._Q = (16 == this._Y.raidStatus || this._Y.raidStatus == 32);
    }
    
    private final void a081(final Room ai_, final int n) {
        if (ai_.trap != null && null != ai_.trap._a) {
            gd_.a364(64, ai_.trap._a);
        }
        this.f423((byte)(-128));
        if (n < 32) {
            this.b540(-116);
        }
    }
    
    //original signature: private final void k150(final int n) {
    private final void k150() {
        this._s = -1;
        if (kh_.d491()) {
            eg_.a537(null);
            return;
        }
        if (kn_.isTutorial && od_.a427()) {
            return;
        }
        if (super.d801()) {
            return;
        }
        RaidMember v = null;
        int b313 = -1;
        if (1 == no_.isMetaDown) {
            b313 = this._R.b313(lc_.mouseX, 19091, hm_.mouseY);
            if (-1 != b313) {
                this._u = b313;
            }
        }
        this._s = this._R.b313(hj_.mouseX, 19091, Animation.mouseY);
        if (hh_._s != null) {
            if (this._J == hh_._s) {
                gd_.a778(dc_._z, 0, 1, false);
            }
            if (this._K == hh_._s) {
                hm_.a668(11, -1, true, -23);
            }
            if (this._N == hh_._s) {
                if (this._Y.raidStatus == 16) {
                    this.c093(0);
                }
                else if (32 == this._Y.raidStatus) {
                    this.e150(68);
                }
            }
            if (this._r == hh_._s) {
                if (this._Y.raidStatus != 16) {
                    if (this._Y.raidStatus == 32) {
                        this.e150(68);
                    }
                }
                else {
                    this.c093(1);
                }
            }
            if (this._t == hh_._s) {
                if (16 == this._Y.raidStatus) {
                    this.c093(2);
                }
            }
            if (this._O == hh_._s) {
                if (null != this._Y.activeRaidMember && this._Y.b121(0, this._Y.activeRaidMember)) {
                    this.a700((byte)(-94), this._Y.activeRaidMember);
                }
            }
            if (hh_._s instanceof hj_) {
                v = ((hj_)hh_._s)._V;
                if (this._y == null) {
                    if (v != null && (4 != this._Y.raidStatus || !kn_.isTutorial) && (v.status & 0x6) == 0x0 && (this._Y.raidStatus == 8 || this._Y.raidStatus == 4)) {
                        this.b700(v);
                        this.setPregameStatusString(pi_.text_hint_select_room);
                        this.m150();
                        gh_.a093(2);
                    }
                }
            }
        }
        if (this._y == null && -1 != b313) {
            boolean b314 = false;
            if (this._Y.raidStatus == 4) {
                b314 = true;
            }
            if (8 == this._Y.raidStatus) {
                b314 = (null != this._Y.activeRaidMember && (0x6 & this._Y.activeRaidMember.status) == 0x0);
            }
            if (b314 && this._Y.b097(b313, 27747)) {
                this.a171(this._Y.activeRaidMember, b313, (byte)123);
            }
            else {
                this._X = 125;
            }
        }
        if (this._y != null) {
            this.a512(this._y, v, b313, (byte)(-115));
        }
        if (-1 != this._s) {
            final Room pb = this._Y.dungeonLayout[this._s];
            if (pb != jb_._Pb) {
                if (this._Y._p.a370(this._s) || this._s == 24) {
                    kh_._u = new bd_(this._Y, pb);
                }
                else {
                    final Trap trap = gh_.traps[1];
                    kh_._u = new FooterCenterHint(trap.name.toUpperCase(), trap.description, trap.name);
                }
                jb_._Pb = pb;
            }
            uj_.a872(kh_._u);
        }
        if (jg_.a643(10, 112, 112, 57) && this._Y.activeRaidMember != null) {
            final RaidMemberStatusIcon[] i = this._Y.activeRaidMember._i;
            en_ en_ = this._z[this._Y.activeRaidMember.position]._n;
            final int n2 = 7;
            if (null != i) {
                final int n3 = 104;
                final int n4 = 151;
                int n5 = n3;
                int n6 = n4;
                int n7 = 0;
                while (i.length > n7) {
                    final RaidMemberStatusIcon wb_ = i[n7];
                    if (jg_.a643(n5, 12, 12, n6)) {
                        en_ = wb_.a047();
                    }
                    n5 -= 16;
                    if (0 != ++n7 % n2) {
                        continue;
                    }
                    n5 = n3 - 18;
                    n6 -= 16;
                }
            }
            uj_.a872(en_);
        }
        for (int j = 0; j < 4; ++j) {
            final int n8 = 126;
            if (jg_.a643(50, 16, n8, 16 * j + 320)) {
                uj_.a872(fi_.raiderStatBars[j]);
            }
            if (jg_.a643(-n8 + 590, 16, n8, 320 + 16 * j)) {
                uj_.a872(rd_.trapStatBars[j]);
            }
        }
        int b315 = (0 > this._u || !this._Y._p.a370(this._u)) ? -1 : this._u;
        if (-1 == b315) {
            if (0 <= this._Y._B) {
                b315 = this._Y._B;
            }
        }
        final Room pb2 = (0 <= b315) ? this._Y.dungeonLayout[b315] : null;
        if (jg_.a643(518, 112, 112, 57) && pb2 != null) {
            final RaidMemberStatusIcon[] f = pb2._f;
            en_ en_2 = null;
            final int n9 = 7;
            if (null != f) {
                final int n10 = 612;
                final int n11 = 151;
                int n12 = n10;
                int n13 = n11;
                int k = 0;
                while (k < f.length) {
                    final RaidMemberStatusIcon wb_2 = f[k];
                    if (jg_.a643(n12, 12, 12, n13)) {
                        en_2 = wb_2.a047();
                    }
                    n12 -= 16;
                    if (++k % n9 != 0) {
                        continue;
                    }
                    n13 -= 16;
                    n12 = n10 - 18;
                }
            }
            if (null == en_2) {
                if (jb_._Pb != pb2) {
                    if (!this._Y._p.a370(b315) && 24 != b315) {
                        final Trap ac_2 = gh_.traps[1];
                        kh_._u = new FooterCenterHint(ac_2.name.toUpperCase(), ac_2.description, ac_2.name);
                    }
                    else {
                        kh_._u = new bd_(this._Y, pb2);
                    }
                    jb_._Pb = pb2;
                }
                en_2 = kh_._u;
            }
            uj_.a872(en_2);
        }
    }
    
    //original signature: private final void a453(final int n, final ec_ ec_, final boolean b) {
    private final void a453(final ec_ ec_, final boolean b) {
        this._y = null;
        final RaidMember hb_ = this._Y.raidMembers[ec_.readByte()];
        final int s = hb_.raider.activeAbility;
        if (s != 15 && s != 4) {
            if (s == 13) {
                final int o = ec_.currentIndex;
                final int c474 = ec_.readByte();
                final int c475 = ec_.readByte();
                if (!b) {
                    final Room a167 = bl_.a167(true, ec_, false);
                    a167._c = new wd_(a167.trap.idleAnimation);
                    final int c476 = ec_.readByte();
                    final Room a168 = bl_.a167(true, ec_, false);
                    a168._c = new wd_(a168.trap.idleAnimation);
                    final int c477 = ec_.readByte();
                    this._Y.dungeonLayout[c474] = a167;
                    this._Y.dungeonLayout[c475] = a168;
                    this.a326(c476, c474);
                    this.a326(c477, c475);
                }
                if (!this._Y._p.a370(c474)) {
                    this.b540(c474);
                }
                if (!this._Y._p.a370(c475)) {
                    this.b540(c475);
                }
                je_.playSound(dc_.da_door_open);
                ec_.currentIndex = o;
            }
            else if (s != 6 && 21 != s && s != 18) {
                if (s == 2) {
                    final int o2 = ec_.currentIndex;
                    final RaidMember hb_2 = this._Y.raidMembers[ec_.readByte()];
                    hb_2._b.a721(rf_._M, hb_2.raider.victoryAnimation);
                    ec_.currentIndex = o2;
                }
                else if (s == 9 || s == 22) {
                    this.playVictoryAnimation(this._Y.activeRaidMember);
                    this.b081(this._Y.dungeonLayout[this._Y._B], -113);
                }
            }
            else {
                final int o3 = ec_.currentIndex;
                final RaidMember hb_3 = this._Y.raidMembers[ec_.readByte()];
                hb_3._b.a721(li_._h, hb_3.raider._deathAnimation);
                ec_.currentIndex = o3;
                if (null != hb_3.raider.defeatTrack) {
                    gd_.a364(64, hb_3.raider.defeatTrack);
                }
                hb_._b = new wd_(hb_.raider.idleAnimation, hb_.raider.victoryAnimation, rf_._M);
            }
        }
        else {
            final int o4 = ec_.currentIndex;
            final int c478 = ec_.readByte();
            if (!b) {
                final Room a169 = bl_.a167(true, ec_, false);
                a169._c = new wd_(a169.trap.idleAnimation);
                final int c479 = ec_.readByte();
                this._Y.dungeonLayout[c478] = a169;
                this.a326(c479, c478);
            }
            if (!this._Y._p.a370(c478)) {
                this.b540(c478);
            }
            if (15 == s) {
                je_.playSound(dc_.da_door_open);
            }
            ec_.currentIndex = o4;
        }
        this._Y.a395(hb_, ec_, 118);
        this.d487();
        if (s == 9 || 22 == s) {
            this._R.b150(-20827);
        }
    }
    
    private final void c150(final int n) {
        this._U = new int[32];
        for (int n2 = 0; 32 > n2; ++n2) {
            this._U[n2] = oi_.getRandom(4);
        }
        this._P = new int[4];
        if (n != 7872) {
            a748(117L);
        }
        this._B = new md_();
        this._T = new md_();
        this._D = ni_.a071(om_.da_ambience_burning_torches_loop_4000ms._e, 256, 0);
        this._L = ni_.a071(k_.da_ambience_running_water_loop_1000ms._e, 256, 0);
        this._D.e150(-1);
        this._L.e150(-1);
        l_.a472(this._D);
        l_.a472(this._L);
        t_.a124(64, g_.da_ingame_stealth, true);
    }
    
    //original signature: private final void b671(final hb_ hb_, final int n) {
    private final void playDeathAnimation(final RaidMember raidMember) {
        raidMember._b.a721(li_._h, raidMember.raider._deathAnimation);
        if (raidMember.raider.defeatTrack != null) {
            gd_.a364(64, raidMember.raider.defeatTrack);
        }
        gh_.a093(13);
        this._R.a423((byte)(-77));
    }
    
    @Override
    final void f797() {
        if (13 == mm_._t) {
            gd_.a778(dc_._z, 0, 1, false);
            return;
        }
        if (ll_.debugMode) {
            if (this._Y.activeRaidMember != null && !qk_._e[82]) {
                if (!this._w) {
                    final int j = this._Y.activeRaidMember.position;
                    int c;
                    final int n = c = this._Y.activeRaidMember.raiderId;
                    if (mm_._t == 27) {
                        c = (1 + n) % 35;
                        if (c == 0) {
                            ++c;
                        }
                    }
                    else if (26 == mm_._t) {
                        c = (n + 34) % 35;
                        if (c == 0) {
                            c = 34;
                        }
                    }
                    if (n != c) {
                        this._Y.raidMembers[j] = new RaidMember(j, c);
                        this._Y.raidMembers[j]._b = new wd_(this._Y.raidMembers[j].raider.idleAnimation);
                        this.b700(this._Y.raidMembers[j]);
                    }
                }
            }
            if (this._u != -1 && qk_._e[82] && !this._w) {
                int a;
                final int n2 = a = this._Y.dungeonLayout[this._u].roomType;
                this._Y._p.a093(this._u);
                this.b540(this._u);
                if (27 != mm_._t) {
                    if (mm_._t == 26) {
                        a = (n2 + 37) % 38;
                    }
                }
                else {
                    a = (n2 + 1) % 38;
                }
                if (n2 != a) {
                    final Room[] dungeonLayout = this._Y.dungeonLayout;
                    final int u = this._u;
                    final Room room = new Room(a);
                    dungeonLayout[u] = room;
                    this._Y._j.b093(this._u, 31);
                    this.a081(room, 76);
                    room._c = new wd_(room.trap.idleAnimation);
                }
            }
            if (mm_._t == 9) {
                ll_.a150();
            }
        }
        super.f797();
    }
    
    //original signature: private final void b125(final int n, final hb_ hb_) {
    private final void b125(final RaidMember raidMember) {
        if (raidMember._b._n == raidMember._b.idleAnimation) {
            raidMember._b.a942(raidMember.raider.selectAnimation);
            if (raidMember.raider.revealTrack != null) {
                gd_.a364(64, raidMember.raider.revealTrack);
            }
        }
    }
    
    private final boolean h154(final int n) {
        if (this._H <= 0) {
            this._H = 50;
            if (n <= 2) {
                this._E = null;
            }
            return true;
        }
        return false;
    }
    
    //wake dragon
    final int a080(final int n, final int n2) {
        this.setPregameStatusString(sm_.text_woke_dragon);
        if (n != 1) {
            go_.pit = null;
        }
        gd_.a364(64, ef_.da_hoardroom_angry_dragon);
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            if (0x0 != (n2 & 1 << i)) {
                this._Y.a125(120, this._Y.raidMembers[i]);
                if (0x0 != (0x4 & this._Y.raidMembers[i].status)) {
                    this.playDeathAnimation(this._Y.raidMembers[i]);
                    n3 |= 1 << i;
                }
                else if ((this._Y.raidMembers[i].status & 0x2) != 0x0) {
                    this.a013(true, this._Y.raidMembers[i]);
                }
            }
        }
        this.e423();
        return n3;
    }
    
    private final void a512(final RaidMember hb_, final RaidMember hb_2, final int i, final byte b) {
        if (2 == no_.isMetaDown) {
            this._y = null;
            this.setPregameStatusString();
            return;
        }
        final int s = hb_.raider.activeAbility;
        final ec_ ec_ = new ec_(3);
        boolean b2 = false;
        ec_.storeByte(hb_.position);
        if ((15 == s || s == 4) && this._G == -1 && this._Y.b097(i, 27747)) {
            if (i != 24) {
                this._G = i;
                b2 = true;
                ec_.storeByte(this._G);
            }
        }
        Label_0217: {
            if (6 == s || 21 == s) {
                if (this._G == -1) {
                    if (null != hb_2 && (0x6 & hb_2.status) == 0x0) {
                        if (0 != hb_2.raider.unknown1) {
                            if (21 != s) {
                                break Label_0217;
                            }
                            if (hb_2.raider.unknown1 != 1) {
                                break Label_0217;
                            }
                        }
                        ec_.storeByte(this._G = hb_2.position);
                        b2 = true;
                    }
                }
            }
        }
        if (0 == s || s == 19 || s == 24) {
            final int n = (0 == s) ? 1 : ((s != 19) ? 4 : 2);
            if (hb_2 != null && (0x6 & hb_2.status) == 0x0) {
                if ((hb_2._d & n) == 0x0) {
                    ec_.storeByte(this._G = hb_2.position);
                    b2 = true;
                }
            }
        }
        if (18 == s) {
            if (-1 == this._G) {
                if (null != hb_2 && this._y != hb_2 && (hb_2.status & 0x6) == 0x0) {
                    this._G = hb_2.position;
                    b2 = true;
                    ec_.storeByte(this._G);
                }
            }
        }
        if (s == 13 && (i != -1 && i != this._G) && !this._Y._p.a370(i)) {
            if (24 != i) {
                if (this._G == -1) {
                    this._G = i;
                }
                else {
                    this._I = i;
                    ec_.storeByte(this._G);
                    b2 = true;
                    ec_.storeByte(this._I);
                }
            }
        }
        if (s == 2) {
            if (hb_2 != null && 0x0 != (0x4 & hb_2.status)) {
                if (hb_2.defence > 0) {
                    this._G = hb_2.position;
                    b2 = true;
                    ec_.storeByte(this._G);
                }
            }
        }
        if (b2) {
            this.a334(hb_, true);
            this.a603(ec_, 110);
            this.setPregameStatusString();
        }
    }
    
    //original signature: private final void b700(final byte b, final RaidMember u) {
    private final void b700(final RaidMember raidMember) {
        this.b125(this._Y.activeRaidMember = raidMember);
        ae_._a = jn_.a782(this._Y.activeRaidMember.raider.name.toUpperCase(), np_._I, -73, la_.roman12);
        if (this._Y.activeRaidMember.raider.activeAbility != -1) {
            final String[] d = this._Y.activeRaidMember.raider.abilityTexts;
            this._O._n = new FooterCenterHint(jk_.replacePlaceholders(new String[] { d[0] }, vo_.text_useskill), jk_.replacePlaceholders(new String[] { jk_.replacePlaceholders(new String[] { this._Y.activeRaidMember.raider.name.toUpperCase() }, "<col=178B8B><%0></col>") }, d[1]));
        }
    }
    
    //original signature: private final void a171(RaidMember hb_, final int n, final byte b) {
    private final void a171(RaidMember raidMember, final int n, final byte b) {
        if (raidMember == null) {
            if (this._Y.raidStatus == 4) {
                raidMember = this._Y.raidMembers[0];
            }
        }
        if (!this._Y._p.a370(n)) {
            je_.playSound(dc_.da_door_open);
        }
        if (!this._w) {
            final ec_ ec_ = new ec_(2);
            ec_.storeByte(n);
            if (b <= 6) {
                this._L = null;
            }
            ec_.storeByte((raidMember != null) ? raidMember.position : -1);
            ec_.currentIndex = 0;
            this.a996(ec_, true);
            if (2 == this._Y.dungeonLayout[this._Y._B].roomType) {
                if (kn_.isTutorial) {
                    gh_.a093(17);
                }
                else {
                    this.i150();
                }
            }
            return;
        }
        if (this.h154(51)) {
            Trap._B.storeFuzzedOpcode(63);
            Trap._B.storeByte(n);
            Trap._B.storeByte(raidMember.position);
        }
    }
    
    private final void d423(final byte b) {
        this._E = this.text_status_pregame;
        jh_.c797();
        final int n = super._q._b - 40;
        final String[] a782 = jn_.a782(this.text_status_pregame, new int[] { n }, -103, la_.roman12);
        final int n2 = la_.roman12._E + la_.roman12._H * a782.length;
        int h = la_.roman12._H;
        final Graphic cn_ = new Graphic(n, n2);
        if (b > -62) {
            this.a512(null, null, 123, (byte)(-100));
        }
        cn_.e797();
        final String[] array = a782;
        for (int n3 = 0; array.length > n3; ++n3) {
            la_.roman12.c191(array[n3], n >> 1, h, 16777215, -1);
            h += la_.roman12._H;
        }
        jh_.b797();
        super._q.a098(cn_, 0, true, 116, -cn_.imageHeight + super._q._y >> 1);
    }
    
    //original signature: private final void a326(final int n, final int n2, final int n3) {
    private final void a326(final int n, final int n3) {
        if (0x0 != (n & 0x1)) {
            this._Y._v.a093(n3 - n3 / 7 - 1);
        }
        if ((0x2 & n) != 0x0) {
            this._Y._v.a093(n3 - n3 / 7);
        }
        if ((0x4 & n) != 0x0) {
            this._Y._v.a093(n3 + 35);
        }
        if (0x0 != (0x8 & n)) {
            this._Y._v.a093(42 + n3);
        }
    }
    
    @Override
    final void c797() {
        super.c797();
        ln_.a118(this._D);
        ln_.a118(this._L);
        jb_._Pb = null;
        this._R = null;
        kh_._u = null;
        System.gc();
    }
    
    //original signature: private final void b540(final boolean b, final int n) {
    private final void b540(final int roomId) {
        final Room room = this._Y.dungeonLayout[roomId];
        room._c = new wd_(room.trap.idleAnimation);
        this._R.a093(15122, roomId);
    }
    
    //original signature: final void a668(final int n, final int n2, final boolean b, final int n3) {
    final void a668(final int n, final int n2, final boolean b) {
        final Room room = this._Y.dungeonLayout[n2];
        boolean b2 = false;
        final RaidMember activeRaidMember = this._Y.activeRaidMember;
        final boolean i = room._i;
        room._i = ((n & 0x800) != 0x0);
        if (room.trap.roomType != 1) { //trap
            if (room.trap.roomType == 2) { //monster
                b2 = (0x0 != (n & 0x8000));
                if (room.trap.hasAbility(TrapAbility.TERRORIZE.getValue()) && b2) { //if demon lord
                    this._Y.a093(3);
                    this.a590(room);
                    final RaidMember[] raidMembers = this._Y.raidMembers;
                    for (int n4 = 0; raidMembers.length > n4; ++n4) {
                        final RaidMember raidMember = raidMembers[n4];
                        if (null != raidMember) {
                            this.a013(true, raidMember); //death animations
                        }
                    }
                    this.e423();
                    this.m150();
                    return;
                }
                if (0x0 != (0x4000 & n)) {
                    if (!b) {
                        this._Y.a773(n2, true, -12331);
                    }
                }
                if (0x0 != (0x4000 & n) || !b2) {}
                if (room.trap.hasAbility(3) && 0x0 == (0x4000 & n)) {
                    if ((n & 0x1000) != 0x0) {
                        this.b081(room, 86);
                    }
                    else {
                        this.a590(room);
                        if (!b) {
                            this._Y.a183(n2);
                        }
                        if ((n & 0x800) != 0x0) {
                            this.playDeathAnimation(activeRaidMember);
                        }
                        else {
                            this.a013(true, activeRaidMember);
                        }
                    }
                }
                else {
                    if (room.trap.hasAbility(TrapAbility.CORROSIVE_SLIME.getValue()) && 0x0 == (0x4000 & n)) {
                        this._Y.b150(-100);
                        this._Y.a540(32);
                        this._Y.a540(8);
                        this.m150();
                        return;
                    }
                    int n5 = (0x0 != (n & 0x2000)) ? 1 : 0;
                    final boolean hasWon = 0x0 != (n & 0x1000);
                    int n6 = 0x7 & n;
                    while (true) {
                        --n6;
                        if (n5 != 0) {
                            if (!b2) {
                                if (n6 <= 0) {
                                    if (hasWon) {
                                        this.playVictoryAnimation(activeRaidMember); //play victory animation?
                                        this.b081(room, 57);
                                        break;
                                    }
                                }
                            }
                            else if (0 >= n6 && hasWon) {
                                break;
                            }
                        }
                        n5 = 1;
                        if (n6 == 0) {
                            if (hasWon) {
                                continue;
                            }
                            this.a590(room);
                            if ((n & 0x800) == 0x0) {
                                this.a013(true, activeRaidMember);
                                break;
                            }
                            this.playDeathAnimation(activeRaidMember); //play death
                            break;
                        }
                    }
                }
            }
            else if (room.trap.roomType == 3) {
                if (!room.trap.hasAbility(TrapAbility.DETECT_RAISE_2.getValue() )) {
                    if (n == 36864) {
                        this.playVictoryAnimation(activeRaidMember);
                        this.b081(room, -101);
                    }
                    else {
                        if (!b) {
                            this._Y.a773(n2, true, -12331);
                        }
                        this.a013(false, activeRaidMember);
                        this.a590(room);
                    }
                }
                else if (n != 36864) {
                    if (!b) {
                        this._Y.a183(n2);
                    }
                    this.a013(false, activeRaidMember);
                    this.a590(room);
                }
                else {
                    this.playVictoryAnimation(activeRaidMember);
                    this.b081(room, 4);
                }
            }
        }
        else if (n == 36864) {
            this.b081(room, 76);
            this.playVictoryAnimation(activeRaidMember);
        }
        else {
            if (!b) {
                this._Y.a773(n2, true, -12331);
            }
            if (n == 20480) {
                this.b081(room, 2);
            }
            else {
                this.a590(room);
                if (!b) {
                    this._Y.a183(n2);
                }
                if (0x0 == (n & 0x800)) {
                    this.a013(true, activeRaidMember);
                }
                else {
                    this.playDeathAnimation(activeRaidMember);
                }
            }
        }
        if (!b) {
            if (room.trap.hasAbility(13)) {
                this._Y.a487(false);
            }
            if ((n & 0x1000) != 0x0) {
                if (!b2) {
                    this._Y.a487(false);
                }
                else {
                    this._Y.a150(-8);
                }
            }
            else {
                this._Y.d150(108);
            }
        }
        room._i = i;
        this.m150();
    }
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        super._e.drawImage(0, 0);
        if (null == this._Y) {
            return;
        }
        if (null == this._Y.activeRaidMember) {
            qe_.a594(10, 57, null);
        }
        else {
            qe_.a594(10, 57, this._Y.activeRaidMember);
            int n = 85;
            final String[] a = ae_._a;
            for (int i = 0; i < a.length; ++i) {
                la_.roman12.b191(a[i], 140, n, 16777215, -1);
                n += la_.roman12._H;
            }
        }
        qe_.a305(50, 320, this._Y.activeRaidMember, this._Y.aliveZealots);
        int n2 = this._Y._B;
        if ((n2 == -1 || this._Y._q == n2) && this._s != -1 && this._Y._p.a370(this._s)) {
            n2 = this._s;
        }
        final Room n3 = (n2 < 0) ? null : this._Y.dungeonLayout[n2];
        boolean b2 = false;
        if (0x0 != (0x1 & this._Y._t)) {
            b2 = true;
        }
        if (null != this._Y.activeRaidMember) {
            if ((this._Y.activeRaidMember._d & 0x4) != 0x0) {
                b2 = true;
            }
        }
        boolean b3 = b2 & this._Y._B == n2;
        if (n3 != null) {
            if (n3.trap != null) {
                b3 &= (n3.trap.roomType == 2);
            }
        }
        if (null != n3) {
            qe_.a484(518, 57, n3);
            if (n3 != Trap._n) {
                ig_._b = jn_.a782(n3.trap.name.toUpperCase(), np_._I, -122, la_.roman12);
                Trap._n = n3;
            }
            int n4 = 85;
            final String[] b4 = ig_._b;
            for (int n5 = 0; b4.length > n5; ++n5) {
                la_.roman12.a191(b4[n5], 500, n4, 16777215, -1);
                n4 += la_.roman12._H;
            }
        }
        else {
            qe_.a204(518, 57, null, kc_._V);
        }
        qe_.a509(590, 320, n3, b3, this._Y.aliveZealots);
        for (rj_ rj_ = (rj_)super._p.e024(); rj_ != null; rj_ = (rj_)super._p.a024(4)) {
            rj_.a150(65);
        }
        ad_.interface_crescent.i093(172, -ad_.interface_crescent.imageHeight + 40);
        ad_.interface_crescent.f093(468 - ad_.interface_crescent.imageWidth, 40 - ad_.interface_crescent.imageHeight);
        if (null != this._x) {
            this._x.drawHeaderLabel();
        }
        this._R.b423((byte)(-55));
        this.b150(-114);
        if (super._b != null) {
            super._b.a423((byte)(-110));
        }
        e797();
        super._q.a423((byte)(-21));
        if (super._b == null) {
            if (this._Y.raidStatus == 4 || (null != this._Y.activeRaidMember && 0x0 == (this._Y.activeRaidMember.status & 0x6) && (32 == this._Y.raidStatus || 8 == this._Y.raidStatus))) {
                this._R.a183(!this._w || 0 == this._H, -1723, this._X);
            }
            this._R.a487(true);
        }
        for (rj_ rj_2 = (rj_)super._p.e024(); null != rj_2; rj_2 = (rj_)super._p.a024(4)) {
            rj_2.d150(0);
        }
        if (!this._w || 0 == this._H) {
            if (this._Q) {
                final int t = this._N._t;
                final int j = this._N._i;
                final int n6 = this._O._t - (-this._O.imageWidth + t);
                final int x = this._N.imageHeight;
                if (null == uk_._e) {
                    uk_._e = mf_.a971(16744448, 4 + x, 8, 4 + n6);
                }
                if (this._X % 30 < 15) {
                    uk_._e.b326(t - 2, j - 2, (this._X > 0) ? 256 : ((int)((1.0 + Math.cos(mo_._a / 10.0f)) * 64.0) + 128));
                }
                else {
                    ec_.a021(j - 2, t - 2, uk_._e, 16711680, 256);
                }
            }
            if (this._v) {
                final int t2 = this._z[0]._t;
                final int k = this._z[0]._i;
                final int n7 = 166;
                final int x2 = this._z[0].imageHeight;
                if (rd_._z == null) {
                    rd_._z = mf_.a971(16744448, 4 + x2, 8, n7 + 4);
                }
                if (15 > this._X % 30) {
                    rd_._z.b326(t2 - 2, k - 2, (this._X > 0) ? 256 : ((int)(64.0 * (Math.cos(mo_._a / 10.0f) + 1.0)) + 128));
                }
                else {
                    ec_.a021(k - 2, t2 - 2, rd_._z, 16711680, 256);
                }
            }
        }
        if (super._b != null) {
            for (int l = 0; l < gf_._b.length; ++l) {
                gf_._b[l] = nb_.and(gf_._b[l] >>> 2, 1061109567);
            }
            super._b.b150(-61);
        }
        if (kn_.isTutorial) {
            ab_.a150();
        }
        if (-1 != hj_.mouseX) {
            if (this.f491(true)) {}
            oh_.a423();
        }
        if (ll_.debugMode && 0 < this._H) {
            ne_.roman20.a191(Integer.toString(this._H), 630, ne_.roman20._H + 10, 16777215, -1);
        }
    }
    
    final void a430(final int n, final boolean b) {
        if (this._w) {
            Trap._B.storeFuzzedOpcode(62);
            if (nf_._A) {
                return;
            }
        }
        if (n != 17158) {
            this.a081(null, 46);
        }
        if (!kn_.isTutorial || 17 != kd_.tutorialStringIndex) {
            if (!en_.doesArrayContainNonZero(bp_._e)) {
                if (ve_.a491()) {
                    gd_.a778(0, 0, 12, b);
                }
                else {
                    gd_.a778(ve_.a491() ? 12 : 0, n ^ 0x4306, 0, b);
                }
            }
            else {
                gd_.a778(ve_.a491() ? 12 : 0, 0, 9, b);
            }
        }
        else {
            gd_.a778(0, n ^ 0x4306, 4, b);
        }
    }
    
    final void f423(final byte b) {
        int n = 0;
        if (-1 != this._Y._B) {
            final Room ai_ = this._Y.dungeonLayout[this._Y._B];
            n = ((ai_.attack2 + ai_.defence2 > 8) ? 1 : 0);
        }
        if (n == 0) {
            t_.a124(64, g_.da_ingame_stealth, true);
        }
        else {
            t_.a124(64, gh_.da_ingame_battle, true);
        }
        if (b > -126) {
            this.b540(28);
        }
    }
    
    //original signature: final void a540(final boolean b, final int n) {
    final void a540(final boolean b) {
        if (b) {
            if (-1 != this._Y._q) {
                final int n2 = this._Y._q / 7;
                final int n3 = this._Y._q % 7;
                final int n4 = 4 * (1 + n2 >> 1) + (1 + n3 >> 1);
                final int n5 = 4 * (n2 >> 1) + 16 + (n3 >> 1);
                final int n6 = this._U[n4];
                final int n7 = this._U[n5];
                for (int n8 = 0; 4 > n8; ++n8) {
                    if (n8 != n6 && n7 != n8) {
                        if (0 < this._P[n8]) {
                            final int[] p2 = this._P;
                            final int n9 = n8;
                            --p2[n9];
                        }
                    }
                    else if (256 > this._P[n8]) {
                        final int[] p3 = this._P;
                        final int n10 = n8;
                        ++p3[n10];
                    }
                }
            }
        }
        else {
            for (int i = 0; i < 4; ++i) {
                if (0 < this._P[i]) {
                    final int[] p4 = this._P;
                    final int n11 = i;
                    --p4[n11];
                }
            }
        }
        if (0 < this._P[2] && 0 == oi_.getRandom(100)) {
            this._B.a865(je_.playSound(sa_.da_ambience_drip));
        }
        if (this._P[3] > 0 && 0 == oi_.getRandom(100)) {
            this._T.a865(je_.playSound(hp_.da_ambience_insect));
        }
        this._D.d150(oo_._d * (om_.da_ambience_burning_torches_loop_4000ms._a * this._P[0]) / 96 >> 8);
        this._L.d150(this._P[1] * (k_.da_ambience_running_water_loop_1000ms._a * oo_._d) / 96 >> 8);
        o_ o_ = (o_)this._B.e024();
        while (o_ != null) {
            o_._k.a093(o_._p * this._P[2] >> 2, 16);
            o_ = (o_)this._B.a024(4);
        }
        for (o_ o_2 = (o_)this._T.e024(); null != o_2; o_2 = (o_)this._T.a024(4)) {
            o_2._k.a093(o_2._p * this._P[3] >> 2, -111);
        }
    }
    
    //original signature: private final void e487(final boolean b) {
    private final void e487() {
        this._H = 0;
    }
    
    private final boolean f491(final boolean b) {
        if (null == this._y) {
            return false;
        }
        RaidMember v = null;
        if (wi_._ob instanceof hj_) {
            v = ((hj_)wi_._ob)._V;
        }
        final int s = this._y.raider.activeAbility;
        if (!b) {
            return true;
        }
        if (13 == s) {
            if (this._G != -1) {
                final gg_ b2 = this._R.b624(this._G, -15390);
                fj_.spy_icon[0].drawImage(-(fj_.spy_icon[0].imageWidth2 >> 1) + b2._f, -(fj_.spy_icon[0].imageHeight2 >> 1) + b2._b);
            }
        }
        if (this._s != -1) {
            if ((15 == s || s == 4) && -1 == this._G) {
                int n = (this._Y.b097(this._s, 27747) && 24 != this._s) ? 1 : 0;
                if (n != 0 && this._Y._p.a370(this._s)) {
                    n = 0;
                }
                if (n == 0) {
                    fj_.spy_icon[1].drawImage(hj_.mouseX - 16, Animation.mouseY - 16);
                }
                else {
                    fj_.spy_icon[0].drawImage(hj_.mouseX - 16, Animation.mouseY - 16);
                }
                return true;
            }
            if (13 == s) {
                if (this._I == -1) {
                    int n2 = (-1 != this._s && this._s != this._G && this._s != 24) ? 1 : 0;
                    if (n2 != 0) {
                        if (this._Y._p.a370(this._s)) {
                            n2 = 0;
                        }
                    }
                    if (n2 != 0) {
                        fj_.spy_icon[0].drawImage(hj_.mouseX - 16, Animation.mouseY - 16);
                    }
                    else {
                        fj_.spy_icon[1].drawImage(hj_.mouseX - 16, Animation.mouseY - 16);
                    }
                    return true;
                }
            }
        }
        if (null != v) {
            if ((s == 6 || s == 21) && -1 == this._G) {
                boolean b3 = 0 == v.raider.unknown1;
                if (21 == s) {
                    b3 |= (v.raider.unknown1 == 1);
                }
                if (b3 & 0x0 == (0x6 & v.status)) {
                    bf_.sac_icon[0].drawImage(hj_.mouseX - 16, Animation.mouseY - 16);
                }
                else {
                    bf_.sac_icon[1].drawImage(hj_.mouseX - 16, Animation.mouseY - 16);
                }
                return true;
            }
            if (s == 2 && this._G == -1) {
                if (0x0 == (v.status & 0x4) || v.defence <= 0) {
                    kh_.revive_icon.e326(hj_.mouseX - 16, Animation.mouseY - 16, 4210752);
                }
                else {
                    kh_.revive_icon.drawImage(hj_.mouseX - 16, Animation.mouseY - 16);
                }
                return true;
            }
            if (s == 18 && this._G == -1 && hj_.mouseX != -1) {
                if (v != this._y && 0x0 == (v.status & 0x6)) {
                    bf_.sac_icon[0].drawImage(hj_.mouseX - 16, Animation.mouseY - 16);
                }
                else {
                    bf_.sac_icon[1].drawImage(hj_.mouseX - 16, Animation.mouseY - 16);
                }
                return true;
            }
        }
        return false;
    }
    
    //original signature: final boolean j154(final int n) {
    final boolean handleRaidOpcodes() {
        final wj_ c = ra_._c;
        if (hc_.loginStatusCode == 59) { //starting a raid?
            this.e487();
            this.a996(c, false);
            return true;
        }
        if (hc_.loginStatusCode == 66) { //encounter trap?
            this.e487();
            this.a536(false, c, this._Y._B);
            return true;
        }
        if (hc_.loginStatusCode == 65) { //something with animations
            this.e487();
            this.a453(c, false);
            return true;
        }
        if (hc_.loginStatusCode == 70) {
            this.e487();
            this._Y.a540(8);
            return true;
        }
        if (67 == hc_.loginStatusCode) {
            this.e487();
            this._Y.renownDividedBy10 = c.readTribyte(-118);
            this._Y.renown = c.readTribyte(-97);
            this._Y.claimedBountyAmount = c.readTribyte(-119);
            this.i150(); //reached hoardroom?
            return true;
        }
        if (68 == hc_.loginStatusCode) {
            this.e487();
            this.a739(false, c, -33);
            return true;
        }
        return false;
    }
    
    final void c423(final byte b) {
        this.setPregameStatusString(jk_.replacePlaceholders(new String[] { Integer.toString(this._C) }, wi_.text_stole_gold));
        if (b >= -107) {
            b423((byte)51);
        }
        gd_.a364(64, qm_.da_gold_stealing);
        this.e423();
    }
    
    //original signature: private final void a125(final int n, final RaidMember hb_) {
    private final void playVictoryAnimation(final RaidMember raidMember) {
        raidMember._b.a942(raidMember.raider.victoryAnimation);
        t_.a124(64, g_.da_ingame_stealth, true);
    }
    
    static final String a748(final long n) {
        l_.calendar.setTime(new Date(n));
        final int value = l_.calendar.get(7);
        final int value2 = l_.calendar.get(5);
        final int value3 = l_.calendar.get(2);
        final int value4 = l_.calendar.get(1);
        final int value5 = l_.calendar.get(11);
        final int value6 = l_.calendar.get(12);
        final int value7 = l_.calendar.get(13);
        return tl_.days_of_week[value - 1] + ", " + value2 / 10 + value2 % 10 + "-" + pp_._F[value3] + "-" + value4 + " " + value5 / 10 + value5 % 10 + ":" + value6 / 10 + value6 % 10 + ":" + value7 / 10 + value7 % 10 + " GMT";
    }
    
    private final void d150(final int n) {
        if (this._Y.activeRaidMember == null || this._Y.activeRaidMember.raider.activeAbility == -1) {
            this._O._n = null;
        }
        else {
            final String[] d = this._Y.activeRaidMember.raider.abilityTexts;
            this._O._n = new FooterCenterHint(jk_.replacePlaceholders(new String[] { d[0] }, vo_.text_useskill), jk_.replacePlaceholders(new String[] { jk_.replacePlaceholders(new String[] { this._Y.activeRaidMember.raider.name.toUpperCase() }, "<col=178B8B><%0></col>") }, d[1]));
        }
        final Room room = (this._Y._B == -1) ? null : this._Y.dungeonLayout[this._Y._B];
        if (room != null) {
            if (room.trap.roomType == 1) {
                this._N._n = new FooterCenterHint(vd_.text_disarm_trap_coloured, room.text_disarm_trap_tooltip, vo_.text_disarm_trap_minitip);
            }
            else if (room.trap.roomType == 3) {
                this._N._n = new FooterCenterHint(u_.text_disarm_guardian_coloured, kg_.text_disarm_guardian_tooltip, GUICheckbox.text_disarm_guardian_minitip);
            }
            else if (room.trap.hasAbility(15)) {
                this._N._n = new FooterCenterHint(dn_.text_advance_coloured, a_.text_sneak_past_tooltip, gi_.text_advance_minitip);
            }
            else {
                this._N._n = new FooterCenterHint(dn_.text_advance_coloured, hm_.text_advance_tooltip, gi_.text_advance_minitip);
            }
        }
        this._r._n = new FooterCenterHint(lh_.text_charge_coloured, mo_.text_charge_tooltip, fp_.text_charge_minitip);
        this._t._n = new FooterCenterHint(qa_.text_flee_coloured, eb_.text_flee_tooltip, jc_.text_flee_minitip);
        if (32 == this._Y.raidStatus) {
            this._N._n = new Tooltip(pb_.text_continue_tooltip);
        }
    }
    
    private final void a603(final ec_ ec_, final int n) {
        if (!this._w) {
            if (n < 106) {
                this.a487(false);
            }
            ec_.currentIndex = 0;
            this.a453(ec_, true);
            return;
        }
        if (!this.h154(56)) {
            return;
        }
        Trap._B.storeFuzzedOpcode(64);
        Trap._B.storeByte(ec_.currentIndex);
        Trap._B.storeArray(ec_.buffer, ec_.currentIndex);
    }
    
    go_(final boolean b, final pj_ pj_, final go_ go_) {
        this(b, pj_);
        if (gl_.topDownOrIsometric) {
            this._R = new sf_(this, 320, 240);
        }
        else if (go_._R instanceof lj_) {
            this._R = new lj_(this, (lj_)go_._R);
        }
        else {
            this._R = new lj_(this, 320, 210);
        }
        this._P = go_._P;
        this._L = go_._L;
        this._T = go_._T;
        this._B = go_._B;
        this._D = go_._D;
        this._U = go_._U;
    }
    
    private final void a739(final boolean b, final ec_ ec_, final int n) {
        this._C = ec_.readShort();
        final int c474 = ec_.readByte();
        kl_ kl_;
        if (!(super._b instanceof ro_)) {
            kl_ = (super._b = new ro_(this));
        }
        else {
            kl_ = super._b;
        }
        if (c474 == 0) {
            if (!b) {
                this._Y.a093(1);
            }
            ((ro_)kl_).a556((byte)101, this._C);
        }
        else {
            if (!b) {
                this._Y.a093(2);
            }
            ((ro_)kl_).a599(0xF & c474, this._C, (byte)1);
        }
    }
    
    //original signature: private final void d487(final boolean b) {
    private final void d487() {
        final RaidMember[] raidMembers = this._Y.raidMembers;
        for (int n = 0; raidMembers.length > n; ++n) {
            final RaidMember raidMember = raidMembers[n];
            if (raidMember != null) {
                raidMember._i = qe_.a814(raidMember, this._Y.aliveZealots);
            }
        }
        for (int n2 = 0; 49 > n2; ++n2) {
            final Room room = this._Y.dungeonLayout[n2];
            if (room != null) {
                boolean b2 = false;
                if (0 != (1 & this._Y._t)) {
                    b2 = true;
                }
                if (this._Y.activeRaidMember != null && 0 != (4 & this._Y.activeRaidMember._d)) {
                    b2 = true;
                }
                room._f = qe_.a928(room, this._Y._j.a370(n2), b2 & this._Y._B == n2 & 2 == room.trap.roomType, this._Y.aliveZealots);
            }
        }
    }
    
    private final void e150(final int n) {
        if (!this._w) {
            this._Y.a540(8);
            if (n != 68) {
                this.a512(null, null, -76, (byte)(-21));
            }
            return;
        }
        if (this.h154(105)) {
            Trap._B.storeFuzzedOpcode(68);
        }
    }
    
    //original signature: private final void a900(final String w, final int n) {
    private final void setPregameStatusString(final String status) {
        this.text_status_pregame = status;
    }
    
    private final void l150(final int n) {
        if (n != 18014) {
            return;
        }
        this.b797();
        final int n2 = -gh_.strategy_buttons[0].imageHeight + 888 >> 1;
        this._r = ke_.a724(n2, gh_.strategy_buttons[0], 506);
        this._N = ke_.a724(n2, gh_.strategy_buttons[1], 464);
        this._t = ke_.a724(n2, gh_.strategy_buttons[2], 548);
        this._O = ke_.a724(n2, gh_.strategy_buttons[3], 590);
        this._J = tn_.a226(-jm_.button_152.imageWidth + 164 >> 1, (32 - jm_.button_152.imageHeight >> 1) + 8, ne_.roman20, jm_.button_152, n - 18125, l_.text_menu);
        this._K = tn_.a226(476 + (-jm_.button_152.imageWidth + 164 >> 1), 8 + (32 - jm_.button_152.imageHeight >> 1), ne_.roman20, jm_.button_152, -109, r_.text_exit);
        final int n3 = 424;
        this._M = new nn_(false);
        this._z = new hj_[4];
        for (int n4 = 0; 4 > n4; ++n4) {
            if (null != this._Y.raidMembers[n4]) {
                this._z[n4] = new hj_(this._Y, this._Y.raidMembers[n4], 10 + 42 * n4, n3);
                this._M.a507(this._z[n4]);
                super._p.a865(this._z[n4]);
            }
        }
        super._p.a865(this._r);
        super._p.a865(this._N);
        super._p.a865(this._t);
        super._p.a865(this._O);
        super._p.a865(this._J);
        super._p.a865(this._K);
        this._x = ((null != this._Y._f) ? new HeaderLabelText(ne_.roman20, this._Y._f, ag_._c) : null);
        super._q = new sa_(180, 401, 280, 79);
        this.d423((byte)(-70));
    }
    
    //original signature: private final void a536(final boolean t, final ec_ ec_, final int q, final int n) {
    private final void a536(final boolean t, final ec_ ec_, final int q) {
        final int k137 = ec_.readShort();
        final Room room = this._Y.dungeonLayout[q];
        final RaidMember raidMember = this._Y.activeRaidMember;
        oc_ b;
        if (room.trap.roomType != 1) {
            if (room.trap.roomType != 2) {
                if (room.trap.roomType != 3) {
                    b = null;
                }
                else if (!room.trap.hasAbility(TrapAbility.DETECT_RAISE_2.getValue())) {
                    if (k137 == 36864) {
                        b = new oc_(raidMember, room, true, c_.text_raider_snuck_past_guardian);
                    }
                    else {
                        b = new oc_(raidMember, room, false, nh_.text_guardian_detected_alerted);
                    }
                }
                else if (k137 != 36864) {
                    b = new oc_(raidMember, room, false, ah_.text_guardian_trapped_alerted);
                }
                else {
                    b = new oc_(raidMember, room, true, np_.text_raider_avoided_guardian);
                }
            }
            else {
                final boolean isEscaping = 0x0 != (k137 & 0x8000);
                if (!room.trap.hasAbility(TrapAbility.TERRORIZE.getValue()) || !isEscaping) {
                    if (0x0 != (0x4000 & k137)) {
                        if (!t) {
                            this._Y.a773(q, true, -12331);
                        }
                    }
                    String s;
                    if ((0x4000 & k137) == 0x0 && !isEscaping) {
                        s = mo_.text_raider_avoided_detection;
                    }
                    else {
                        s = uo_.text_raider_detected;
                    }
                    if ((0x400 & k137) != 0x0) {
                        if (raidMember.raider.hasAbility(RaiderAbility.FEROCITY.getValue())) {
                            s = s + " <col=FF8000>" + jk_.replacePlaceholders(new String[] { raidMember.raider.name }, ia_.ability_ferocity_message) + "</col> ";
                        }
                    }
                    Label_1169: {
                        if (!room.trap.hasAbility(3) || (k137 & 0x4000) != 0x0) {
                            if (room.trap.hasAbility(TrapAbility.CORROSIVE_SLIME.getValue()) && 0x0 == (0x4000 & k137)) {
                                b = new oc_(raidMember, room, true, s + " " + qj_.text_party_sneaks_past);
                            }
                            else {
                                int n2 = (0x0 != (k137 & 0x2000)) ? 1 : 0;
                                final boolean b3 = 0x0 != (0x1000 & k137);
                                int n3 = 0x7 & k137;
                                int a760 = -1;
                                if (0x0 != (k137 & 0x400)) {
                                    if (raidMember.raider.hasAbility(RaiderAbility.ARMORED.getValue())) { //black knight
                                        a760 = ji_.getRandom(n3 - 1, 1);
                                    }
                                }
                                int a761 = -1;
                                if ((0x200 & k137) != 0x0 && room.trap.hasAbility(TrapAbility.ARMORED.getValue())) { //if stone golem
                                    int n4 = 1;
                                    if (!b3) {
                                        n4 = 0;
                                    }
                                    a761 = ji_.getRandom(n3 - 1, n4);
                                }
                                do {
                                    --n3;
                                    Label_0865: {
                                        if (n2 != 0) { //hit
                                            if (!isEscaping) {
                                                s = s + " " + ri_.text_raider_attacks;
                                                if (a761 == n3) {
                                                    s = s + " <col=FF8000>" + jk_.replacePlaceholders(new String[] { room.trap.name }, qi_.ability_room_armoured_message) + "</col>";
                                                }
                                                if (n3 != 0) {
                                                    break Label_0865;
                                                }
                                                if (!b3) {
                                                    break Label_0865;
                                                }
                                                b = new oc_(raidMember, room, true, s + " " + lj_.text_raider_wins);
                                            }
                                            else {
                                                s = s + " " + al_.text_raider_dodges;
                                                if (n3 > 0) {
                                                    break Label_0865;
                                                }
                                                if (!b3) {
                                                    break Label_0865;
                                                }
                                                b = new oc_(raidMember, room, true, s + " " + cm_.text_raider_escapes);
                                            }
                                            break Label_1169;
                                        }
                                    }
                                    s = s + " " + u_.text_monster_attacks;
                                    n2 = 1;
                                    if (n3 != a760) {
                                        continue;
                                    }
                                    s = s + " <col=FF8000>" + jk_.replacePlaceholders(new String[] { raidMember.raider.name }, le_.ability_armoured_message) + "</col>";
                                } while (n3 > 0 || b3);
                                b = new oc_(raidMember, room, false, s + " " + Raider.text_monster_wins);
                            }
                        }
                        else if ((0x1000 & k137) == 0x0) {
                            if (0x0 != (k137 & 0x800)) {
                                b = new oc_(raidMember, room, false, s + " " + vb_.text_raider_trapped_killed);
                            }
                            else {
                                b = new oc_(raidMember, room, false, s + " " + bp_.text_raider_trapped_incap);
                            }
                        }
                        else {
                            b = new oc_(raidMember, room, true, s + " " + fc_.text_monster_failed_to_trap);
                        }
                    }
                }
                else {
                    b = new oc_(raidMember, room, false, jk_.replacePlaceholders(new String[] { room.trap.name }, ep_.text_raiders_flee_in_terror));
                }
            }
        }
        else if (k137 == TrapOutcome.DISARMED.getValue()) {
            b = new oc_(raidMember, room, true, ch_.text_raider_disarmed_trap);
        }
        else if (k137 == TrapOutcome.TRIGGERED.getValue()) {
            if (0x0 == (k137 & 0x800)) {
                b = new oc_(raidMember, room, false, bp_.text_raider_trapped_incap);
            }
            else {
                b = new oc_(raidMember, room, false, vb_.text_raider_trapped_killed);
            }
        }
        else {
            b = new oc_(raidMember, room, true, ba_.text_raider_avoided_trap);
        }
        if (b != null) {
            if (super._b != null) {
                super._b.c150();
                super._b = null;
            }
            b._t = t;
            b._B = k137;
            super._b = b;
            b._w = this;
            b._q = q;
        }
    }
    
    //original signature: private final void a150(final int n) {
    private final void setPregameStatusString() {
        if (this._Y.raidStatus == 4) { //select entrance
            this.setPregameStatusString(bj_.text_status_pregame);
        }
        else if (this._Y.raidStatus == 8) { //selected entrance
            if (this._Y.activeRaidMember == null) {
                this.setPregameStatusString(ho_.text_hint_select_raider);
            }
            else {
                this.setPregameStatusString(pi_.text_hint_select_room);
            }
        }
        else if (16 != this._Y.raidStatus) {
            if (this._Y.raidStatus == 32) {
                this.setPregameStatusString(co_.text_status_postcombat);
            }
        }
        else {
            this.setPregameStatusString(rn_.text_status_precombat);
        }
    }
    
    go_(final boolean w, final pj_ y) {
        new md_();
        this._v = true;
        this._y = null;
        this._Q = true;
        this.text_status_pregame = bj_.text_status_pregame;
        this._X = 0;
        this._w = w;
        final int[] e = bp_._e;
        for (int n = 0; 8 > n; ++n) {
            e[n] = 0;
        }
        this._Y = y;
        this.setPregameStatusString();
        this.g487(false);
        this.c150(7872);
        this.l150(18014);
        if (kn_.isTutorial) {
            cc_._d = 0;
            qa_._a = new int[this._Y.raidMembers.length][];
            final RaidMember[] raidMembers = this._Y.raidMembers;
            for (int n2 = 0; raidMembers.length > n2; ++n2) {
                final RaidMember raidMember = raidMembers[n2];
                if (null != raidMember) {
                    qa_._a[raidMember.position] = new int[] { raidMember.raider.attack, raidMember.raider.defence, raidMember.raider.dodge, raidMember.raider.sneak };
                }
            }
            fm_.a093(0);
        }
        this.d487();
        if (null == fi_.raiderStatBars) {
            rd_.trapStatBars = new en_[4];
            (fi_.raiderStatBars = new en_[4])[0] = (rd_.trapStatBars[0] = new Tooltip(GUIButton._H.a772("attack")));
            fi_.raiderStatBars[1] = (rd_.trapStatBars[1] = new Tooltip(GUIButton._H.a772("defence")));
            fi_.raiderStatBars[2] = new Tooltip(GUIButton._H.a772("dodge"));
            fi_.raiderStatBars[3] = new Tooltip(GUIButton._H.a772("sneak"));
            rd_.trapStatBars[2] = new Tooltip(GUIButton._H.a772("snare"));
            rd_.trapStatBars[3] = new Tooltip(GUIButton._H.a772("detect"));
        }
        int numberOfRaidMembers = 0;
        final RaidMember[] a2 = this._Y.raidMembers;
        for (int i = 0; i < a2.length; ++i) {
            if (a2[i] != null) {
                ++numberOfRaidMembers;
            }
        }
        if (numberOfRaidMembers == 1) {
            final RaidMember[] a3 = this._Y.raidMembers;
            for (int j = 0; j < a3.length; ++j) {
                final RaidMember raidMember = a3[j];
                if (raidMember != null) {
                    this._Y.activeRaidMember = raidMember;
                }
            }
        }
        if (this._Y.activeRaidMember != null) {
            this.b700(this._Y.activeRaidMember);
        }
        for (int n4 = 0; 49 > n4; ++n4) {
            if (this._Y._p.a370(n4)) {
                final Room room = this._Y.dungeonLayout[n4];
                room._c = new wd_(room.trap.idleAnimation);
            }
        }
    }
    
    static {
        go_.pit = "Pit";
        go_.text_topdown = "TOP DOWN";
    }
}
