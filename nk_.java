class nk_ extends hf_ implements vg_
{
    private uc_ _Bb;
    //original name: _Lb
    static String text_exit_without_saving_brief;
    private boolean _Mb;
    static ae_ _Jb;
    static g_ _Ib;
    private boolean _Db;
    private boolean _Gb;
    static int _Kb;
    static boolean _Hb;
    private se_ _Cb;
    static int[] _Fb;
    private boolean _Eb;
    
    final void a013(final int n, final String s, final int n2) {
        if (this._Eb) {
            return;
        }
        this._Db = (256 == n2);
        if (n != 26889) {
            nk_._Fb = null;
        }
        this._Eb = true;
        this._Bb.b789(4210752, (byte)94, 8405024);
        final kc_ kc_ = new kc_(this, this._Cb, s);
        if (n2 == 5) {
            kc_.a871(11, 6824, oh_.reloadgame);
            kc_.a871(17, n - 20065, db_.quittowebsite);
        }
        else if (n2 != 256) {
            kc_.a871(-1, 6824, this._Mb ? kn_.retry : gk_.back);
        }
        else {
            kc_.a592(kn_.retry, this, (byte)(-80));
        }
        if (n2 == 3) {
            kc_.a871(7, 6824, mo_.toserverlist);
        }
        else if (4 != n2) {
            if (6 == n2) {
                kc_.a871(9, 6824, ip_.tocustomersupport);
            }
            else if (9 == n2) {
                kc_.a592(df_.changedisplayname, this, (byte)(-97));
            }
        }
        else {
            kc_.a871(8, 6824, ho_.playfreeversion);
        }
        this.b340(1, kc_);
    }
    
    @Override
    final boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        if (13 != n) {
            return b >= 55 && super.a401(lm_, c, n, (byte)92);
        }
        this.j423((byte)115);
        return true;
    }
    
    final void j423(final byte b) {
        if (super._T) {
            if (b < 48) {
                this.a401(null, '\uffb7', 86, (byte)(-102));
            }
            super._T = false;
            if (this._Mb) {
                gg_.b150(0);
            }
            else if (this._Gb) {
                np_.d423();
            }
        }
    }
    
    public static void n150(final int n) {
        nk_._Jb = null;
        nk_._Ib = null;
        nk_._Fb = null;
        nk_.text_exit_without_saving_brief = null;
        if (n != 2121792) {
            n150(57);
        }
    }
    
    nk_(final ji_ ji_, final se_ cb, final String s, final boolean mb, final boolean gb) {
        super(ji_, new kc_(null, cb, s), 77, 10, 10);
        this._Mb = mb;
        this._Cb = cb;
        this._Eb = false;
        this._Db = false;
        this._Gb = gb;
        this._Bb = new uc_(13, 50, 274, 30, 15, 2113632, 4210752);
        this._Bb._R = true;
        this.b485(this._Bb);
    }
    
    @Override
    public void a475(final GUIButton ck_, final byte b, final int n, final int n2, final int n3) {
        if (b != 98) {
            return;
        }
        if (!this._Db) {
            oe_.a808("tochangedisplayname.ws", m_.getApplet());
        }
        else {
            sn_.a093(b ^ 0x3C, 3);
            this.j423((byte)123);
        }
    }
    
    final void o150(final int n) {
        this._Bb.b789(n, (byte)94, 2121792);
        final kc_ kc_ = new kc_(this, this._Cb, gd_.connectionrestored);
        kc_.a871(15, 6824, me_.returntogame);
        this.b340(n - 4210751, kc_);
    }
    
    static final void a627(final String c, final byte b) {
        if (mm_.mouseX == -1) {
            if (vl_.mouseY == -1) {
                mm_.mouseX = hj_.mouseX;
                vl_.mouseY = Animation.mouseY;
            }
        }
        ++no_._a;
        Label_0160: {
            if (null != c) {
                if (c.equals(vj_._c)) {
                    break Label_0160;
                }
            }
            else if (vj_._c != null) {
                break Label_0160;
            }
            final boolean b2 = !ti_._f && no_._a >= lp_._z && no_._a < 250 + lp_._z;
            if (null != c && (ti_._f || b2)) {
                no_._a = lp_._z;
            }
            else {
                no_._a = 0;
            }
            wa_.mouseX = mm_.mouseX;
            if (c != null) {
                ti_._f = false;
            }
            else if (b2) {
                ti_._f = true;
            }
            fl_.mouseY = vl_.mouseY;
        }
        if (!ti_._f && no_._a < lp_._z) {
            if (cp_._U) {
                fl_.mouseY = vl_.mouseY;
                no_._a = 0;
                wa_.mouseX = mm_.mouseX;
            }
        }
        vj_._c = c;
        if (ti_._f && 10 == no_._a) {
            no_._a = 0;
            ti_._f = false;
        }
        vl_.mouseY = -1;
        mm_.mouseX = -1;
    }
    
    static {
        nk_.text_exit_without_saving_brief = "Exit without saving";
        nk_._Hb = false;
        nk_._Fb = new int[] { 18, 10, 19, 24, 25, 26, 27 };
        nk_._Jb = new ae_(nk_._Fb.length);
    }
}
