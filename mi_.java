final class mi_
{
    static String _d;
    //original name: _c
    static String text_bounty;
    //original name: _a
    static String[] ability_ferocity_brief;
    static int _f;
    //original name: _b
    static String tripwire_bell;
    static nh_ _e;
    
    static final void a300(final pp_ pp_, final String s, final se_ se_, final Graphic cn_) {
        jh_.c797();
        final int b926 = se_.b926(s);
        final int n = se_._E + se_._H;
        final Graphic cn_2 = new Graphic(b926, n);
        cn_2.e797();
        se_.b191(s, 0, se_._H, 16760960, -1);
        final Graphic a983 = te_.a983(b926, n, ag_._c, 32, 32, 0.125);
        for (int n2 = 0; a983._B.length > n2; ++n2) {
            if (cn_2._B[n2] == 0) {
                a983._B[n2] = 0;
            }
        }
        final Graphic a984 = GUICheckbox.a551(16, cn_2, 16776960, (byte)(-38));
        final int n3 = -cn_2.imageWidth + cn_.imageWidth >> 1;
        final int n4 = -cn_2.imageHeight + cn_.imageHeight >> 1;
        final Graphic a985 = dd_.a510(4, a983);
        final Graphic d125 = cn_.d125();
        d125.e797();
        bp_.a131(n4, a985, n3);
        a983.drawImage(n3, n4);
        d125.h797();
        final Graphic d126 = d125.d125();
        d126.e797();
        gf_.b669(0, 0, cn_.imageWidth, cn_.imageHeight, 0, 160);
        final Graphic d127 = cn_.d125();
        d127.e797();
        GUICheckbox.a551(8, cn_2, 12690143, (byte)(-34)).b326(n3, n4, 32);
        cn_2.drawImage(n3, n4);
        final Graphic cn_3 = a984;
        cn_3._w += n3;
        final Graphic cn_4 = a984;
        cn_4._A += n4;
        jh_.b797();
        pp_.a994(d125, a984, d127, d126, 31);
    }
    
    static final void a050(final int n, final int g, final int g2, final int a) {
        ag_._a = a;
        mj_._g = g;
        i_._n = n;
        li_._g = g2;
    }
    
    //original signature: static final void a150() {
    static final void loadMusicTracks() {
        lf_.da_title3 = dk_.loadMusic(120, "da_title3");
        jd_.da_intro = dk_.loadMusic(170, "da_intro");
        wj_.da_highscores = dk_.loadMusic(150, "da_highscores");
        gh_.da_ingame_battle = dk_.loadMusic(110, "da_ingame_battle");
        g_.da_ingame_stealth = dk_.loadMusic(180, "da_ingame_stealth");
        kj_.da_raid_win = dk_.loadMusic(89, "da_raid_win");
        tm_.da_raid_lose = dk_.loadMusic(131, "da_raid_lose");
        gl_.da_stressing_music = dk_.loadMusic(200, "da_stressing_music");
        dd_.da_defeat_monster = dk_.loadMusic(100, "da_defeat_monster");
        ek_._b._A.f150();
        ha_._k = null;
    }
    
    static final void b150() {
        if (ql_._d >= 224) {
            um_.a430(256);
        }
        else {
            um_.a430(-(ql_._d % 32) + (ql_._d + 32));
        }
    }
    
    public static void c150() {
        mi_._e = null;
        mi_.ability_ferocity_brief = null;
        mi_.text_bounty = null;
        mi_._d = null;
        mi_.tripwire_bell = null;
    }
    
    static {
        mi_.text_bounty = "There is a bounty on this dungeon - you will be awarded <%0> Treasure if you reach the hoard room.";
        mi_.ability_ferocity_brief = new String[] { "Ferocity", "Double <%attack> in first round of combat." };
        mi_.tripwire_bell = "Tripwire Bell";
    }
}
