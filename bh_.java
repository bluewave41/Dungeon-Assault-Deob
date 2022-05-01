class bh_ extends GUIButton
{
    private ci_ _O;
    static int _P;
    static boolean _M;
    //original name: _L
    static String desc_hidden_pit;
    //original name: _Q
    static String pleaselogin;
    private String[] _R;
    //original name: _J
    static String[] tutorial_welcome1;
    //original name: _K
    static String mb_achievement_count_1;
    //original name: _N
    static String[] ability_chaos_champion_brief;
    private md_ _S;
    
    //original signature: static final int b650(final int n, final int n2, final boolean b) {
    static final int b650(final int n, final int n2) {
        final int n3 = tg_._f[n2][n];
        if (ke_.a097(n3)) {
            return 260;
        }
        return tg_._b[n2];
    }
    
    //original signature: static final String a661(final int n, final int n2) {
    static final String getTitle(final int titleId) {
        if (titleId != -1) {
            return cc_.titles[titleId];
        }
        return null;
    }
    
    public static void f423() {
        bh_.tutorial_welcome1 = null;
        bh_.desc_hidden_pit = null;
        bh_.ability_chaos_champion_brief = null;
        bh_.mb_achievement_count_1 = null;
        bh_.pleaselogin = null;
    }
    
    @Override
    final void b050(final int n, final int n2, final int n3, final int n4, final int n5) {
        super.b050(n, n2, n3, n4, n5);
        this.g423((byte)(-109));
    }
    
    final void a871(final int n, final int n2, final String s) {
        if (null == this._R || this._R.length <= n2) {
            final String[] r = new String[n2 + 1];
            if (this._R != null) {
                for (int i = 0; i < this._R.length; ++i) {
                    r[i] = this._R[i];
                }
            }
            this._R = r;
        }
        if (n != 8) {
            return;
        }
        this._R[n2] = s;
    }
    
    bh_(final String s, final ca_ o) {
        super(s, null);
        this._O = null;
        super._o = o;
    }
    
    @Override
    boolean a336(final int n, final lm_ lm_) {
        if (n != 34) {
            bh_.mb_achievement_count_1 = null;
        }
        return false;
    }
    
    @Override
    final void b115(final int n, final int n2, final int n3, final int n4) {
        super.b115(n, n2, n3, n4);
        final ci_ a880 = this.a880(-super.xAxisOffset + n4, n - super.yAxisOffset, true);
        if (a880 != null && super._n != null) {
            ((pf_)super._n).a271(a880._r, this, n3 + 125, n2);
        }
    }
    
    //original signature: static final int a312(final boolean b, final String s, final int n, final boolean b2, final String s2) {
    //gets called when you hit the login button
    static final int a312(final boolean isHostJagex, final String password, final int affId, final boolean b2, final String username) {
        if (null == sp_._c && !rj_.writeOpcode12(b2)) {
            return -1;
        }
        if (pd_._A == no_._c) {
            if (b2) {
                be_._n = l_.a566(password, hg_._s, null);
            }
            else {
                be_._n = FooterCenterHint.a647(password, username);
            }
            Trap._B.currentIndex = 0;
            
            Trap._B.storeByte(14);
            Trap._B.storeByte(be_._n.b743(-110)._c);
            op_.writeToServer(0, -1); //writes code 14
            
            pd_._A = ik_._b;
        }
        if (pd_._A == ik_._b) {
            if (oi_.readServerData(1)) {
                final int c474 = ra_._c.readByte(); //should always be 0
                if (c474 == 0) {
                    pd_._A = mh_._c;
                }
                else {
                    hc_.loginStatusCode = c474;
                    nj_._b = -1;
                    pd_._A = bj_._K;
                }
                ra_._c.currentIndex = 0;
            }
        }
        if (mh_._c == pd_._A) {
            if (oi_.readServerData(8)) {
                o_.sessionKey = ra_._c.c411(); //reads session key (8 bytes)
                ra_._c.currentIndex = 0;
                b_.a895(be_._n, isHostJagex, affId, b2); //writes code 16
                pd_._A = rp_._d;
            }
        }
        if (rp_._d == pd_._A) {
            if (oi_.readServerData(1)) {
                final int statusCode = ra_._c.readByte(); //read byte
                ra_._c.currentIndex = 0;
                hc_.loginStatusCode = statusCode;
                pd_._E = null;
                if (statusCode != 0 && statusCode != 1) {
                    if (statusCode == 8) { //account details invalid
                        tl_.a150(127);
                        nh_._e = false;
                        return statusCode;
                    }
                    pd_._A = bj_._K;
                    nj_._b = -1;
                }
                else {
                    nj_._b = -1;
                    pd_._A = k_._e;
                }
            }
        }
        if (k_._e == pd_._A && kh_.d427()) {
            hg_._s = ra_._c.c411(); //8 bytes base37 encrypted string for something
            nh_._k = ra_._c.readByte(); //debug if > 2
            ra_._c.readByte(); //1 byte
            pb_.isMember = ra_._c.readShort(); //0 or greater than 0
            final String cookieThing = ra_._c.b791(); //string?
            final int c476 = ra_._c.readByte(); //1 byte (0)
            if ((0x1 & c476) != 0x0) {
                l_.b487();
            }
            if (!b2) {
                bh_._M = (0x0 != (0x8 & c476));
                Tooltip._l = ((c476 & 0x4) != 0x0); //unzap
                if (!bh_._M) {}
            }
            if (fa_.unused) { //always false, ignore this block
                ra_._c.readByte(); //1 byte
                ra_._c.readByte(); //1 byte
                ra_._c.readInt();  //4 bytes
                ao_._k = ra_._c.readShort(); //2 bytes
                ti_._q = new byte[ao_._k];
                for (int i = 0; i < ao_._k; ++i) {
                    ti_._q[i] = ra_._c.readUnsignedByte(); //1 byte //this is never used anywhere
                }
            }
            tc_.playerTitle = ra_._c.d738(); //string
            nn_._k = jm_.lowerCaseReplaceSpaceWithUnderscore(tc_.playerTitle); //something title related
            
            hf_.unreadTickets = ra_._c.readByte();
            pd_._A = qa_._c;
            
            if (be_._n.b743(65) == pe_._j) {
                ba_._e.a587(m_.getApplet());
            }
            else if (be_._n.b743(-104) == ug_._w) {
                gg_._c.a587(m_.getApplet());
            }
            
            nh_._e = false;
            if (cookieThing != null) {
                jb_.a674(cookieThing, m_.getApplet());
            }
            if (pb_.isMember <= 0 && !Tooltip._l) {
                try {
                    ee_.a460(m_.getApplet(), "unzap");
                }
                catch (Throwable t) {}
            }
            else {
                try {
                    ee_.a008("zap", m_.getApplet(), 15647, new Object[] { uj_.decodeBase37EncodedString(hg_._s) });
                }
                catch (Throwable t2) {}
            }
            if (pb_.isMember > 0) {
                ld_.isMember = true;
            }
            Trap._B.createIsaacCipher(n_.isaacCipherSeeds);
            for (int n2 = 0; 4 > n2; ++n2) { //increment each seed by 50
                final int[] f = n_.isaacCipherSeeds;
                final int n3 = n2;
                f[n3] += 50;
            }
            ra_._c.createIsaacCipher(n_.isaacCipherSeeds);
            return hc_.loginStatusCode;
        }
        if (pd_._A != bj_._K || !kh_.d427()) {
            if (null == sp_._c) {
                if (nh_._e) {
                    if (b_.a138() > 30000L) {
                        tp_._v = lh_.loginm3; //connection timeout
                    }
                    else {
                        tp_._v = fc_.loginm2; //error connecting
                    }
                    nh_._e = false;
                    return 3;
                }
                an_.gamePort1 = l_.gamePort2;
                l_.gamePort2 = an_.gamePort1;
                nh_._e = true;
            }
            return -1;
        }
        tl_.a150(-17);
        if (7 != hc_.loginStatusCode || nh_._e) {
            if (hc_.loginStatusCode == 7) {
                hc_.loginStatusCode = 3;
            }
            tp_._v = ra_._c.d738();
            nh_._e = false;
            return hc_.loginStatusCode;
        }
        nh_._e = true;
        return -1;
    }
    
    final void a762(final int n, final byte b, final int n2, final int n3) {
        this.b050(0, n2, n3, n, ((th_)super._o).a349(this, 8));
        if (b >= -11) {
            bh_._M = false;
        }
    }
    
    @Override
    void a115(final int n, final int n2, final int n3, final int n4) {
        super.a115(n, n2, n3 ^ n3, n4);
        if (0 != n) {
            return;
        }
        final th_ th_ = (th_)super._o;
        ci_ ci_ = this._O;
        if (null != ci_) {
            final int a437 = th_.a437(this, (byte)75, n2);
            final int a438 = th_.a387((byte)84, n4, this);
            do {
                in_.a050(ci_._k + a437 - 2, ci_._p + 2, ci_._i + 2, ci_._l + (a438 - 2), 1);
                ci_ = ci_._o;
            } while (null != ci_);
        }
    }
    
    @Override
    void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        super.a319(n, n2, lm_, b);
        this._O = null;
        if (super._u) {
            this._O = this.a880(-super.xAxisOffset + (hj_.mouseX - n), -n2 + Animation.mouseY - super.yAxisOffset, true);
        }
        if (!b) {
            getTitle(28);
        }
    }
    
    final void g423(final byte b) {
        this._S = new md_();
        int index = 0;
        final th_ th_ = (th_)super._o;
        final l_ b2 = th_.b865(-2, this);
        while (true) {
            final int index2 = super.buttonText.indexOf("<hotspot=", index);
            if (-1 == index2) {
                break;
            }
            final int int1 = Integer.parseInt(super.buttonText.substring(index2 + 9, super.buttonText.indexOf(">", index2)));
            index = super.buttonText.indexOf("</hotspot>", index2);
            final int a080 = b2.a080(0, index2);
            final int i = b2.a080(0, index);
            ci_ ci_ = null;
            for (int n = a080; i >= n; ++n) {
                final tg_ tg_ = b2._e[n];
                final int n2 = (n != a080) ? tg_._k[0] : b2.a543((byte)60, index2);
                final ci_ o = new ci_(int1, n2, tg_._m, -n2 + ((i == n) ? b2.a543((byte)70, index) : ((tg_ != null) ? tg_._k[tg_._k.length - 1] : 0)), Math.max(th_.a137(100), -tg_._m + tg_._c));
                if (null != ci_) {
                    ci_._o = o;
                }
                this._S.a865(o);
                ci_ = o;
            }
        }
    }
    
    private final ci_ a880(final int n, final int n2, final boolean b) {
        ci_ ci_ = (ci_)this._S.e024();
        if (!b) {
            return null;
        }
        while (null != ci_) {
            for (ci_ o = ci_; o != null; o = o._o) {
                if (n >= o._k && n2 >= o._l && o._i + o._k > n && o._l + o._p >= n2) {
                    return ci_;
                }
            }
            ci_ = (ci_)this._S.a024(4);
        }
        return null;
    }
    
    @Override
    String c983(final byte b) {
        if (this._O == null || this._R == null) {
            return null;
        }
        if (b <= 3) {
            return null;
        }
        if (this._R.length > this._O._r) {
            return this._R[this._O._r];
        }
        return null;
    }
    
    static {
        bh_._M = true;
        bh_.tutorial_welcome1 = new String[] { "Welcome", "Welcome to <%highlight>Dungeon Assault</col>! In this game, you play a dragon, battling your kind to gain <%highlight>Renown</col> in the realm of Dungaria.<br><br><%command>You can hide this tutorial by clicking on the down arrow icon at the top-right of this scroll, and return to it by clicking the visible portion of this scroll at the right edge of the screen. You can also reposition it by holding the mouse button and dragging.</col><br><br><%command>Click the arrow at the bottom-right of this scroll to continue." };
        bh_.desc_hidden_pit = "There is a pit in this room, but it remains concealed until a raider steps on it.";
        bh_.mb_achievement_count_1 = "OVER <%0>";
        bh_.pleaselogin = "Please log in to access this feature.";
        bh_.ability_chaos_champion_brief = new String[] { "Master of Chaos", "Sacrifice a raider to defeat any room. (Multiple use)" };
    }
}
