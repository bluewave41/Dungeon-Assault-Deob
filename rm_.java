import java.awt.*;
import java.awt.datatransfer.*;

class rm_ extends GUIButton
{
    private int _R;
    //original name: _M
    private int textLength2;
    //original name: _J
    static String text_passive_ability;
    private boolean _Q;
    //original name: _I
    private long time;
    static boolean _P;
    //original name: _L
    private int textLength;
    //original name: _K
    private int maxLength;
    private boolean _N;
    static int _T;
    //original name: _O
    private long time2;
    //original name: _S
    static String[] tutorial_defeat_repeated;
    
    //original signature: private final void l150(final int n) {
    private final void l150() {
        try {
            final String clipboardText = (String)Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor);
            this.g423(); //does this do anything?
            this.a627(clipboardText);
        }
        catch (Exception ex) {}
    }
    
    private final void s150(final int n) {
        if (n != 32) {
            rm_.text_passive_ability = null;
        }
        if (super._n instanceof jo_) {
            ((jo_)super._n).a157(this, (byte)(-127));
        }
    }
    
    //on paste?
    //original signature: private final void a627(String substring, final byte b) {
    private final void a627(String substring) {
        if (this.maxLength != -1) {
            final int n = this.maxLength - super.buttonText.length();
            if (n >= 0) {
                return;
            }
            substring = substring.substring(0, n);
        }
        if (this.textLength != super.buttonText.length()) {
            super.buttonText = super.buttonText.substring(0, this.textLength) + substring + super.buttonText.substring(this.textLength, super.buttonText.length());
        }
        else {
            super.buttonText += substring;
        }
        this.textLength += substring.length();
        this.textLength2 = this.textLength;
        this.n150(4746);
    }
    
    @Override
    final boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        this.time = kd_.getTime();
        if (b < 55) {
            this._R = 21;
        }
        if ('<' == c || '>' == c) {
            return false;
        }
        if (' ' > c || c > '~') {
            if (85 != n) {
                if (n != 101) {
                    if (n == 13) {
                        this.p150(61);
                        return true;
                    }
                    if (n != 96) {
                        if (97 != n) {
                            if (n == 102) {
                                this.a093(0, 6931);
                                return true;
                            }
                            if (n == 103) {
                                this.a093(super.buttonText.length(), 6931);
                                return true;
                            }
                            if (84 == n) {
                                this.s150(32);
                                return true;
                            }
                            if (qk_._e[82] && n == 65) {
                                this.i150(0);
                                return true;
                            }
                            if (qk_._e[82] && n == 66) {
                                this.h423((byte)(-86));
                                return true;
                            }
                            if (qk_._e[82] && 67 == n) {
                                this.l150();
                                return true;
                            }
                        }
                        else if (this.textLength < super.buttonText.length()) {
                            this.a093(qk_._e[82] ? this.f410() : (1 + this.textLength), 6931);
                            return true;
                        }
                    }
                    else if (0 < this.textLength) {
                        this.a093(qk_._e[82] ? this.o137() : (this.textLength - 1), 6931);
                        return true;
                    }
                }
                else {
                    if (this.textLength != this.textLength2) {
                        this.g423();
                        return true;
                    }
                    if (this.textLength < super.buttonText.length()) {
                        this.textLength2 = this.textLength + 1;
                        this.g423();
                        return true;
                    }
                }
            }
            else {
                if (this.textLength2 != this.textLength) {
                    this.g423();
                    return true;
                }
                if (0 < this.textLength) {
                    this.textLength2 = this.textLength - 1;
                    this.g423();
                    return true;
                }
            }
            return false;
        }
        if (this.textLength != this.textLength2) {
            this.g423();
        }
        if (this.maxLength == -1 || super.buttonText.length() < this.maxLength) {
            if (this.textLength >= super.buttonText.length()) {
                super.buttonText += c;
                final int length = super.buttonText.length();
                this.textLength = length;
                this.textLength2 = length;
            }
            else {
                super.buttonText = super.buttonText.substring(0, this.textLength) + c + super.buttonText.substring(this.textLength, super.buttonText.length());
                ++this.textLength;
                this.textLength2 = this.textLength;
            }
            this.n150(4746);
        }
        return true;
    }
    
    //original signature: final void a223(String w, final boolean b, final byte b2) {
    final void capInputLength(String inputText, final boolean b) {
        if (inputText == null) {
            inputText = "";
        }
        super.buttonText = inputText;
        final int length = inputText.length();
        if (this.maxLength != -1) {
            if (length > this.maxLength) {
                super.buttonText = super.buttonText.substring(0, this.maxLength);
            }
        }
        final int length2 = super.buttonText.length();
        this.textLength2 = length2;
        this.textLength = length2;
        if (!b) {
            this.n150(4746);
        }
    }
    
    private final void h423(final byte b) {
        if (b >= -73) {
            return;
        }
        if (this.k738(82).length() > 0) {
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(this.k738(82)), null);
        }
    }
    
    private final void i150(final int n) {
        if (n != 0) {
            rm_.tutorial_defeat_repeated = null;
        }
        this.h423((byte)(-89));
        this.g423();
    }
    
    //original signature: void n150(final int n) {
    void n150(final int n) {
        if (super._n instanceof jo_) {
            ((jo_)super._n).a430(this, 10000536);
        }
    }
    
    //original signature: static final int a616(final ec_ ec_, final int n) {
    static final int getNextByte(final ec_ ec_) {
        int n2 = ec_.readByte();
        if (n2 == 255) {
            n2 = -1;
        }
        return n2;
    }
    
    //original signature: private final int o137(final int n) {
    private final int o137() {
        if (this.textLength == 0) {
            return this.textLength;
        }
        int n2;
        for (n2 = this.textLength - 1; 0 < n2 && super.buttonText.charAt(n2 - 1) != ' '; --n2) {}
        return n2;
    }
    
    @Override
    final boolean a946(final lm_ lm_, final int n, final int n2, final int n3, final int n4, final byte b, final int n5) {
        if (super.a946(lm_, n, n2, n3, n4, (byte)(-124), n5)) {
            if (super._o instanceof th_) {
                final int a605 = ((th_)super._o).a605(16, n5, hj_.mouseX, n3, this, Animation.mouseY);
                this.a093((a605 == -1) ? 0 : a605, 6931);
                final long time = kd_.getTime();
                this._N = (-this.time2 + time < 250L);
                if (this._N) {
                    this.textLength2 = this.o137();
                    this.textLength = this.f410();
                    if (this.textLength > 0) {
                        if (super.buttonText.charAt(this.textLength - 1) == ' ') {
                            --this.textLength;
                        }
                    }
                    this._R = this.textLength;
                }
                this.time2 = time;
                return true;
            }
        }
        return false;
    }
    
    @Override
    final void a115(final int n, final int n2, final int n3, final int n4) {
        if (super._o != null && 0 == n) {
            super._o.a623((byte)34, this, n2, n4, super._B);
            if (super._o instanceof th_) {
                final th_ th_ = (th_)super._o;
                if (this.textLength != this.textLength2) {
                    th_.a308(this.textLength2, n2, n4, this, 33, this.textLength);
                }
                if ((-this.time + kd_.getTime()) % 1000L < 500L) {
                    th_.a923(this, this.textLength, n4, -1, n2);
                }
            }
        }
        if (n3 != 0) {
            this.j150(31);
        }
    }
    
    //original signature: static final int a901(final CharSequence charSequence, final char c) {
    static final int countOccurencesOfCharacter(final CharSequence charSequence, final char c) {
        int n = 0;
        for (int length = charSequence.length(), i = 0; i < length; ++i) {
            if (c == charSequence.charAt(i)) {
                ++n;
            }
        }
        return n;
    }
    
    //original signature: private final void g423(final byte b) {
    private final void g423() {
        if (this.textLength2 != this.textLength) {
            final int n = (this.textLength2 < this.textLength) ? this.textLength2 : this.textLength;
            final int n2 = (this.textLength2 < this.textLength) ? this.textLength : this.textLength2;
            this.textLength2 = n;
            this.textLength = n;
            super.buttonText = super.buttonText.substring(0, n) + super.buttonText.substring(n2, super.buttonText.length());
            this.n150(4746);
        }
    }
    
    //original signature: static final double a802(final int n, final int n2, final double n3, final int n4) {
    static final double a802(final int numberOfThieves, final int n2, final double n3, final int n4) {
        double n5 = n4 / (double)n2 * (0.9 - 0.08 * numberOfThieves) + (n3 + (-(numberOfThieves * 0.02) + 0.1));
        if (1.0 < n5) {
            n5 = 1.0;
        }
        return n5;
    }
    
    private final void a093(final int l, final int n) {
        this.textLength = l;
        if (n != 6931) {
            rm_._P = false;
        }
        if (!qk_._e[81]) {
            this.textLength2 = this.textLength;
        }
    }
    
    public static void m150() {
        rm_.tutorial_defeat_repeated = null;
        rm_.text_passive_ability = null;
    }
    
    //original signature: private final int f410(final byte b) {
    private final int f410() {
        final int length = super.buttonText.length();
        if (this.textLength == length) {
            return this.textLength;
        }
        int n;
        for (n = 1 + this.textLength; length > n && super.buttonText.charAt(n - 1) != ' '; ++n) {}
        return n;
    }
    
    @Override
    void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        super.a319(n, n2, lm_, b);
        this.j150(-24768);
        if (1 == super._y) {
            if (super._o instanceof th_) {
                int l = ((th_)super._o).a605(16, n2, hj_.mouseX, n, this, Animation.mouseY);
                if (-1 != l) {
                    if (this._N && l < this._R && this.textLength2 < l) {
                        l = this._R;
                    }
                    this.textLength = l;
                }
            }
            this.time = kd_.getTime();
        }
    }
    
    //original signature: rm_(final String s, final pg_ pg_, final int k) {
    rm_(final String text, final pg_ pg_, final int maxLength) {
        super(text, pg_);
        this._R = -1;
        this.time2 = 0L;
        this._N = false;
        this.maxLength = maxLength;
        super._o = hl_._a._c;
        this.capInputLength(text, true);
        this._Q = true;
        this.time = kd_.getTime();
    }
    
    static final void q150(final int n) {
        final wj_ c = ra_._c;
        if (n != -5705) {
            rm_._T = -87;
        }
        final int c2 = c.readByte();
        if (c2 != 0) {
            if (c2 == 1) {
                int h137;
                ue_ ue_;
                for (h137 = c.readInt(), ue_ = (ue_)qm_._q.e024(); null != ue_ && ue_._k != h137; ue_ = (ue_)qm_._q.a024(4)) {}
                if (null == ue_) {
                    tl_.a150(126);
                    return;
                }
                ue_.a487(false);
            }
            else {
                sm_.a741(null, 1, "A1: " + sj_.l738());
                tl_.a150(-85);
            }
        }
        else {
            final ub_ ub_ = (ub_)bg_._s.e024();
            if (null == ub_) {
                tl_.a150(-86);
                return;
            }
            final int c3 = c.readByte();
            if (c3 != 0) {
                c.a286(0, c3, new byte[c3]);
            }
            final wj_ wj_ = c;
            wj_.currentIndex += 4;
            if (!c.compareChecksums()) {
                tl_.a150(n ^ 0xFFFFE9DD);
                return;
            }
            ub_.a487(false);
        }
    }
    
    private final void j150(final int n) {
        if (!this._Q) {
            super._A = 0;
            super._j = 0;
            return;
        }
        if (!(super._o instanceof th_)) {
            return;
        }
        final th_ th_ = (th_)super._o;
        if (n != -24768) {
            getNextByte(null);
        }
        final l_ b865 = th_.b865(-2, this);
        final int c137 = b865.c137(-117);
        final int c138 = th_.c353(n + 24772, this);
        final int n2 = th_.a137(n ^ 0xFFFF9F3A) >> 1;
        if (-n2 + c138 <= c137) {
            final int n3 = super._j + b865.a543((byte)86, this.textLength);
            if (c138 - n2 < n3) {
                super._j -= -c138 + n2 + n3;
            }
            else if (n3 < n2) {
                super._j = n2 + (-n3 + super._j);
            }
            if (0 >= super._j) {
                if (n2 - c138 > super._j) {
                    super._j = n2 - c138;
                }
            }
            else {
                super._j = 0;
            }
            return;
        }
        super._j = 0;
        super._A = 0;
    }
    
    final void p150(final int n) {
        if (n <= 30) {
            countOccurencesOfCharacter(null, '\uffab');
        }
        this.textLength2 = 0;
        super.buttonText = "";
        this.textLength = 0;
        this.n150(4746);
    }
    
    private final String k738(final int n) {
        final int n2 = (this.textLength <= this.textLength2) ? this.textLength : this.textLength2;
        if (n != 82) {
            return null;
        }
        return super.buttonText.substring(n2, (this.textLength2 < this.textLength) ? this.textLength : this.textLength2);
    }
    
    static final void r150() {
        ga_.introImages = new Graphic[9];
        if (1 == hc_.lang) {
            sj_._db = hl_._e;
        }
        else if (2 == hc_.lang) {
            sj_._db = na_._G;
        }
        else {
            sj_._db = dd_._C;
        }
        ga_.introImages[0] = rc_.a324("", sb_._a, "intro_01.jpg");
        ga_.introImages[1] = rc_.a324("", sb_._a, "intro_03.jpg");
        ga_.introImages[2] = rc_.a324("", sb_._a, "intro_02.jpg");
        ga_.introImages[3] = rc_.a324("", sb_._a, "intro_04.jpg");
        ga_.introImages[4] = rc_.a324("", sb_._a, "intro_05.jpg");
        ga_.introImages[5] = ga_.introImages[4];
        ga_.introImages[6] = rc_.a324("", sb_._a, "intro_06.jpg");
        ga_.introImages[7] = rc_.a324("", sb_._a, "intro_07.jpg");
        ga_.introImages[8] = rc_.a324("", sb_._a, "intro_08.jpg");
        jh_.c797();
        for (int i = 0; i < ga_.introImages.length; ++i) {
            ga_.introImages[i].e797();
            gf_.e050(0, 0, gf_._i, gf_._c, 0);
            gf_.e669(1, 1, gf_._i - 2, gf_._c - 2, 0, 128);
        }
        jh_.b797();
        sg_._b = rc_.a324("", sb_._a, "logo.jpg");
        ro_._B = true;
    }
    
    static {
        rm_.text_passive_ability = "Passive ability - <%0>";
        rm_.tutorial_defeat_repeated = new String[] { "Defeat", "<%highlight>Your raider has failed!</col><br><br><%command>Seek another route or try again with another raider. Continue moving your party toward the hoard room.</col>" };
    }
}
