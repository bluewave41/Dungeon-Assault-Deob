final class u_ extends gd_
{
    static ad_ _U;
    //original name: _T
    static AmbientAudioTrack[] introTracks;
    static int _P;
    //original name: _S
    static String text_disarm_guardian_coloured;
    Raider _Q;
    static boolean _O;
    //original name: _R
    static String text_monster_attacks;
    
    static final int a650(final int n, final int n2) {
        if (n != 0) {
            if (n >= 0) {
                if (0 == n2) {
                    return 0;
                }
                if (0 <= n2) {
                    return d_.a313(-103, n, n2);
                }
                return -d_.a313(-120, n, -n2);
            }
            else {
                if (0 == n2) {
                    return 4096;
                }
                if (0 <= n2) {
                    return -d_.a313(-81, -n, n2) + 4096;
                }
                return d_.a313(-89, -n, -n2) - 4096;
            }
        }
        else {
            if (0 == n2) {
                return 0;
            }
            if (0 > n2) {
                return -2048;
            }
            return 2048;
        }
    }
    
    u_(final int n, final int n2, final Raider q) {
        super(n, n2, 0, 0, 0);
        this._Q = q;
        final String f = this._Q.name;
        final int a598 = ib_.a598(this._Q);
        final String[] a599 = jn_.a782(f, new int[] { 140, 88 }, -78, db_.roman12bold);
        final int n3 = a599.length * db_.roman12bold._H + la_.roman12._H + 42;
        final boolean b = 0 >= pb_.isMember && 0x0 != (0x1 & this._Q.unknown2);
        final boolean b2 = 0 == gm_.playerInformation._e && 0x0 != (this._Q.unknown2 & 0x2);
        final boolean b3 = b | b2;
        final Graphic cn_ = new Graphic(140, n3);
        final Graphic cn_2 = new Graphic(140, n3);
        final Graphic cn_3 = new Graphic(140, n3);
        jh_.a303(cn_);
        gf_.a797();
        int n4 = 0;
        for (int n5 = 0; a599.length > n5; ++n5) {
            n4 += la_.roman12._H;
            la_.roman12.b191(a599[n5], (n5 == 0) ? 0 : la_.roman12._H, n4, b3 ? 8421504 : 16760832, -1);
        }
        int n6 = n4 + (la_.roman12._H + 2);
        if (b) {
            la_.roman12.b191(dn_.text_members_only, 52, n6, 16711680, -1);
        }
        else if (b2) {
            la_.roman12.b191(be_.text_orbmode, 52, n6, 16711680, -1);
        }
        else {
            la_.roman12.b191(jk_.replacePlaceholders(new String[] { Integer.toString(a598 / 10) }, n_.text_x_renown), 52, n6, 12632256, -1);
        }
        n6 += 4;
        cn_2.e797();
        final int n7 = n3 - 45;
        gf_.a797();
        cn_.e326(0, 0, 16744448);
        gk_.a560(52, this._Q, 16744448, n6);
        rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, n7);
        cn_3.e797();
        gf_.a797();
        cn_.e326(0, 0, 12690143);
        gk_.a560(52, this._Q, 10449103, n6);
        rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, n7);
        cn_.e797();
        gk_.a560(52, this._Q, 12632256, n6);
        rp_.a857(8, 40, (byte)108, 2, 40, kc_._S, n7);
        jh_.b797();
        this.a037(cn_2, cn_, GUICheckbox.a551(16, cn_2, 16711680, (byte)(-128)), cn_3, (byte)106, GUICheckbox.a551(16, cn_2, 255, (byte)99));
        super._n = new fc_(this._Q);
        if (b3) {
            super.isActive = false;
        }
    }
    
    static final void a041(final PlayerInformation lb_) {
        if (um_.stableMembers == null) {
            um_.stableMembers = new RaidMember[8];
        }
        for (int n = 0; 8 > n; ++n) {
            if (null == lb_ || um_.stableMembers[n] == lb_.stableMembers[n]) {
                um_.stableMembers[n] = gm_.playerInformation.stableMembers[n];
                if (null != um_.stableMembers[n]) {
                    um_.stableMembers[n]._b = new wd_((255 == um_.stableMembers[n]._p) ? k_._c : um_.stableMembers[n].raider.idleAnimation);
                }
            }
        }
        ho_.b423();
    }
    
    @Override
    final void b326(final int n, final int n2, final int n3) {
        final int n4 = super._t - 3 + n;
        final int n5 = n3 + super._i - 3;
        final int n6 = super.imageWidth + n4 + 5;
        final int n7 = super.imageHeight + n5 + 5;
        if (n4 > gf_._h || gf_._e < n5 || gf_._j > n6 || gf_._f > n7) {
            return;
        }
        gf_.b669(n4, n5, 5 + super.imageWidth, super.imageHeight + 5, 0, 128);
        super.b326(n, n2, n3);
        final Graphic cn_ = (null == this._Q.idleAnimation) ? null : this._Q.idleAnimation.a571(40, 0, 40);
        final int n8 = super.imageHeight + n5 - 2 - 40;
        final int n9 = 5 + n4;
        if (cn_ == null) {
            gf_.b050(n9, n8, 32, 32, 0);
        }
        else {
            cn_.c093(n9, n8);
        }
    }
    
    static final String a975(final se_ se_, final String s, final int n, final int n2, final int n3) {
        return ia_.a282(n3, se_, an_.a537(n2, n, s));
    }
    
    public static void c423() {
        u_.text_monster_attacks = null;
        u_.text_disarm_guardian_coloured = null;
        u_.introTracks = null;
        u_._U = null;
    }
    
    static {
        u_.text_disarm_guardian_coloured = "<col=8B1717>Disarm</col>";
        u_._U = new ad_(7, 1);
        u_.text_monster_attacks = "Monster attacks.";
    }
}
