//original name: tf_

import java.applet.*;

final class HeaderLabelText
{
    private Graphic _c;
    //original name: _h
    int[] possibleColors;
    //original signature: _f
    String text;
    private Graphic _b;
    int _i;
    private int _d;
    //original name: _a
    private se_ fontName;
    static boolean[] _e;
    static int[] _k;
    //original name: _g
    static String text_close;
    static Graphic _j;
    
    //original signature: static final boolean a595(final Applet applet, final int n) {
    static final boolean a595(final Applet applet) {
        if (ia_._W != null) {
        	jb_.k423();
            tp_.a132(75.0f, i_.unpacking_soundeffects);
            g_.a035(fi_.getCanvas());
            ra_.b150();
            ia_._W = null;
            nf_.d150(0);
            return false;
        }
        if (null != ll_._r) {
            tp_.a132(75.0f, i_.unpacking_soundeffects);
            g_.a035(fi_.getCanvas());
            ll_._r = null;
            nf_.d150(0);
            return false;
        }
        if (null != bl_._t) {
            tp_.a132(80.0f, ik_.unpacking_music);
            g_.a035(fi_.getCanvas());
            mi_.loadMusicTracks();
            tl_._k = null;
            bl_._t = null;
            nf_.d150(0);
            return false;
        }
        if (null != np_._A) {
            tp_.a132(84.0f, ib_.unpacking_graphics);
            g_.a035(fi_.getCanvas());
            sl_.a812(applet);
            bl_.unpackGraphics();
            gh_._c = null;
            np_._A = null;
            nf_.d150(10);
            return false;
        }
        if (kf_._p != null) {
            tp_.a132(92.0f, he_.unpacking_animations);
            g_.a035(fi_.getCanvas());
            vf_.unpackAnimations();
            kf_._p = null;
            nf_.d150(0);
            return false;
        }
        if (id_._i == null) {
            return true;
        }
        df_.a951(new ja_(id_._i.a826("", "huffman")));
        id_._i = null;
        nf_.d150(0);
        return false;
    }
    
    //original signature: final void b326(final int n, final int n2, final int n3) {
    final void b326(final int n, final int n3) {
        bp_.a131(n, this._c, n3); //text outline?
        //this._b.drawImage(n3, n);
    }
    
    //original signature: final void a326(final int n, final int n2, final int n3) {
    final void drawHeaderLabel() {
        this.b326(25 - (this._d >> 1), 320 - (this._i >> 1));
    }
    
    //original signature: HeaderLabelText(final se_ a, final String f, final int[] h) {
    HeaderLabelText(final se_ fontName, final String text, final int[] possibleColors) {
        this.text = text;
        this.fontName = fontName;
        this.possibleColors = possibleColors;
        jh_.c797();
        this._i = this.fontName.b926(this.text);
        this._d = this.fontName._H + this.fontName._E;
        final Graphic cn_ = new Graphic(this._i, this._d);
        cn_.e797();
        this.fontName.b191(this.text, 0, this.fontName._H, 16777215, -1);
        this._b = te_.a983(this._i, this._d, this.possibleColors, 32, 32, 0.125);
        for (int i = 0; i < this._b._B.length; ++i) {
            if (0 == cn_._B[i]) {
                this._b._B[i] = 0;
            }
            else if (this._b._B[i] == 0) {
                this._b._B[i] = 65793;
            }
        }
        this._c = dd_.a510(4, cn_);
        jh_.b797();
    }
    
    public static void a150() {
        HeaderLabelText.text_close = null;
        HeaderLabelText._k = null;
        HeaderLabelText._j = null;
        HeaderLabelText._e = null;
    }
    
    static {
        HeaderLabelText._k = GUICheckbox.b330(8421504, 4210752, 64);
        HeaderLabelText.text_close = "CLOSE";
    }
}
