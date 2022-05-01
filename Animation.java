final class Animation
{
    int _g;
    il_[] _l;
    int _m;
    int[] _k;
    int[] _j;
    //original name: _b
    String unitName;
    //original name: _e
    static String[] tutorial_guardian1;
    nh_ _d;
    //original name: _a
    static String text_gold_stolen;
    private md_ _n;
    int _f;
    //original name: _i
    String animationName;
    static ed_ _o;
    //original name: _h
    static int mouseY;
    int _c;
    
    static final boolean b154() {
        return il_._c != null && il_._c.b154(-108);
    }
    
    static final boolean a213(final String s) {
        return nn_._k.equals(jm_.lowerCaseReplaceSpaceWithUnderscore(s));
    }
    
    final void a423(final byte b) {
        this._n = null;
        if (b != -19) {
            a213(null);
        }
        this._l = null;
    }
    
    public static void a150() {
        Animation.tutorial_guardian1 = null;
        Animation.text_gold_stolen = null;
        Animation._o = null;
    }
    
    private final Graphic a574(final byte b, final int n) {
        if (this._l == null) {
            this._l = new il_[this._c];
        }
        if (null != this._l[n]) {
            final Graphic a316 = this._l[n].a316(16);
            if (a316 != null) {
                return a316;
            }
        }
        for (int i = 0; i < this._c; ++i) {
            if (this._k[i] == this._k[n] && null != this._l[i]) {
                final Graphic a317 = this._l[i].a316(16);
                if (null != a317) {
                    this._l[n] = this._l[i];
                    return a317;
                }
            }
        }
        final Graphic a318 = ia_.a059(this.unitName, this._m, this.animationName, this._g, Integer.toString(this._k[n]), this._d);
        this._l[n] = new il_(a318);
        return a318;
    }
    
    //original signature: final cn_ a571(final int n, final int n2, final int n3, final int n4) {
    final Graphic a571(final int n, final int n2, final int n3) {
        if (n == this._g && this._m == n3) {
            return this.a574((byte)(-94), n2);
        }
        if (this._n == null) {
            this._n = new md_();
        }
        fl_ fl_;
        for (fl_ = (fl_)this._n.e024(); fl_ != null && (fl_._q != n || n3 != fl_._p); fl_ = (fl_)this._n.a024(4)) {}
        if (fl_ == null) {
            fl_ = new fl_(n, n3, this._c);
            this._n.a865(fl_);
        }
        Graphic cn_ = null;
        if (fl_._k[n2] != null) {
            cn_ = fl_._k[n2].a316(16);
        }
        if (cn_ == null) {
            cn_ = lc_.a608(this.a574((byte)(-105), n2), n, n3);
            fl_._k[n2] = new il_(cn_);
        }
        return cn_;
    }
    
    static {
        Animation.tutorial_guardian1 = new String[] { "Guardians", "<%highlight>This is a guardian room</col> - similar to <%traps>, a <%guardian> may be triggered by a raider entering the room. Unlike traps, they will never injure raiders or prevent progress through the dungeon. Instead, a triggered <%guardian> <%highlight>alerts all monsters in the dungeon</col>, making it harder to get the first attack against them." };
        Animation.text_gold_stolen = "Gold stolen: ";
        Animation.mouseY = 0;
    }
}
