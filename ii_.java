import java.util.*;

class ii_ extends lm_ implements aa_
{
	//original name: _E
    static String skip;
    md_ _B;
    //original name: _I
    static String[] quickchat_shortcut_help;
    static int _G;
    //original name: _C
    static String text_defeated;
    //original name: _D
    static String codeBaseHost;
    //original name: _J
    static String tip_magical_guardian_room;
    //original name: _H
    static Graphic piece_rotworm;
    
    @Override
    final boolean a276(final int n, final int n2, final int n3, final int n4, final int n5, final lm_ lm_, final byte b) {
        if (b != -84) {
            return false;
        }
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_2 = (lm_)dj_.a024(); lm_2 != null && lm_2.c154(-55); lm_2 = (lm_)dj_.c024()) {
        }
        return false;
    }
    
    public static void e423() {
        ii_.quickchat_shortcut_help = null;
        ii_.codeBaseHost = null;
        ii_.piece_rotworm = null;
        ii_.skip = null;
        ii_.tip_magical_guardian_room = null;
        ii_.text_defeated = null;
    }
    
    //original signature: ii_(final int n, final int n2, final int n3, final int n4, final ca_ ca_) {
    ii_(final int xAxisOffset, final int yAxisOffset, final int componentWidth, final int componentHeight,
    		final ca_ ca_) {
        super(xAxisOffset, yAxisOffset, componentWidth, componentHeight, ca_, null);
        this._B = new md_();
    }
    
    @Override
    final StringBuilder a481(final int n, final Hashtable hashtable, final StringBuilder sb, final byte b) {
        if (this.a597(hashtable, n, -38, sb)) {
            this.a801(n, sb, hashtable, 1);
            this.a922(sb, hashtable, true, n);
        }
        if (b >= -76) {
            return null;
        }
        return sb;
    }
    
    private final void a922(final StringBuilder sb, final Hashtable hashtable, final boolean b, final int i) {
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_ = (lm_)dj_.a024(); null != lm_; lm_ = (lm_)dj_.c024()) {
            sb.append('\n');
            for (int n = 0; i >= n; ++n) {
                sb.append(' ');
            }
            lm_.a481(i + 1, hashtable, sb, (byte)(-108));
        }
        if (!b) {
            ii_.text_defeated = null;
        }
    }
    
    private final void h150(final int n) {
        final dj_ dj_ = new dj_(this._B);
        if (n != 0) {
            a490(22, (byte)122, -68, -5, 99, -3, false);
        }
        for (lm_ lm_ = (lm_)dj_.a024(); lm_ != null; lm_ = (lm_)dj_.c024()) {
            lm_.f150(12591);
        }
    }
    
    static final void a490(final int n, final byte b, final int n2, final int i, final int n3, final int j, final boolean b2) {
        if (n3 <= i) {
            return;
        }
        if (1 + i >= j) {
            return;
        }
        if (i + 5 < j && n2 != n) {
            final int n4 = (n2 >> 1) + (n >> 1) + (n2 & n & 0x1);
            int n5 = i;
            int n6 = n;
            int n7 = n2;
            for (int n8 = i; j > n8; ++n8) {
                final int n9 = ol_._k[n8];
                final int n10 = b2 ? i_._t[n9] : ci_._n[n9];
                if (n4 >= n10) {
                    if (n7 < n10) {
                        n7 = n10;
                    }
                }
                else {
                    ol_._k[n8] = ol_._k[n5];
                    ol_._k[n5++] = n9;
                    if (n6 > n10) {
                        n6 = n10;
                    }
                }
            }
            a490(n, (byte)94, n6, i, n3, n5, b2);
            a490(n7, (byte)(-127), n2, n5, n3, j, b2);
            return;
        }
        for (int k = j - 1; i < k; --k) {
            for (int n11 = i; k > n11; ++n11) {
                final int n12 = ol_._k[n11];
                final int n13 = ol_._k[1 + n11];
                if (r_.a254(b2, n12, n13)) {
                    ol_._k[n11] = n13;
                    ol_._k[n11 + 1] = n12;
                }
            }
        }
    }
    
    @Override
    void a319(final int n, final int n2, final lm_ lm_, final boolean b) {
        super.a319(n, n2, lm_, b);
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_2 = (lm_)dj_.a024(); lm_2 != null && lm_2.c154(-18); lm_2 = (lm_)dj_.c024()) {
            lm_2.a319(super.xAxisOffset + n, n2 + super.yAxisOffset, lm_, b);
        }
    }
    
    @Override
    final String c983(final byte b) {
        final dj_ dj_ = new dj_(this._B);
        if (b < 3) {
            this.a277(70, false, -108, null, 67, 9);
        }
        for (lm_ lm_ = (lm_)dj_.a024(); lm_ != null; lm_ = (lm_)dj_.c024()) {
            final String c983 = lm_.c983((byte)80);
            if (null != c983) {
                return c983;
            }
        }
        return null;
    }
    
    @Override
    final void e150(final int n) {
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_ = (lm_)dj_.a024(); lm_ != null; lm_ = (lm_)dj_.c024()) {
            lm_.e150(119);
        }
        if (n < 1) {
            ii_._G = -31;
        }
    }
    
    //original signature: final void b485(final byte b, final lm_ lm_) {
    final void b485(final lm_ lm_) {
        this._B.a865(lm_);
    }
    
    @Override
    void a115(final int n, final int n2, final int n3, final int n4) {
        if (n == n3) {
            if (null != super._o) {
                super._o.a623((byte)34, this, n2, n4, true);
            }
        }
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_ = (lm_)dj_.b024(); lm_ != null; lm_ = (lm_)dj_.d024()) {
            lm_.a115(n, super.xAxisOffset + n2, 0, super.yAxisOffset + n4);
        }
    }
    
    @Override
    final boolean returnFalse() {
        return this.returnNull() != null;
    }
    
    final boolean a489(final byte b, final lm_ lm_) {
        if (this._B.a427()) {
            return false;
        }
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_2 = (lm_)dj_.a024(); null != lm_2; lm_2 = (lm_)dj_.c024()) {
        }
        if (b != -5) {
            ii_.text_defeated = null;
        }
        return false;
    }
    
    @Override
    boolean a401(final lm_ lm_, final char c, final int n, final byte b) {
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_2 = (lm_)dj_.a024(); lm_2 != null && lm_2.c154(-124); lm_2 = (lm_)dj_.c024()) {
        }
        if (b < 55) {
            ii_.piece_rotworm = null;
        }
        return n == 80 && (qk_._e[81] ? this.a059(lm_) : this.a489((byte)(-5), lm_));
    }
    
    @Override
    final int d137(final int n) {
        int n2 = 0;
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_ = (lm_)dj_.a024(); null != lm_; lm_ = (lm_)dj_.c024()) {
            final int d137 = 0;
            if (n2 < d137) {
                n2 = d137;
            }
        }
        return n2;
    }
    
    @Override
    final void b050(final int n, final int n2, final int n3, final int n4, final int n5) {
        super.b050(n ^ n, n2, n3, n4, n5);
        this.h150(0);
    }
    
    lm_ returnNull() {
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_ = (lm_)dj_.a024(); null != lm_; lm_ = (lm_)dj_.c024()) {
        }
        return null;
    }
    
    @Override
    final boolean a336(final int n, final lm_ lm_) {
        final dj_ dj_ = new dj_(this._B);
        if (n != 34) {
            return true;
        }
        for (lm_ lm_2 = (lm_)dj_.a024(); lm_2 != null; lm_2 = (lm_)dj_.c024()) {
            if (lm_2.a336(34, lm_)) {
                return true;
            }
        }
        return false;
    }
    
    //original signature: final boolean a059(final lm_ lm_, final byte b) {
    //probably returns false always
    final boolean a059(final lm_ lm_) {
        if (!this._B.a427()) {
            final dj_ dj_ = new dj_(this._B);
            for (lm_ lm_2 = (lm_)dj_.b024(); null != lm_2; lm_2 = (lm_)dj_.d024()) {
            }
            return false;
        }
        return false;
    }
    
    @Override
    final boolean a946(final lm_ lm_, final int n, final int n2, final int n3, final int n4, final byte b, final int n5) {
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_2 = (lm_)dj_.a024(); null != lm_2 && lm_2.c154(-76); lm_2 = (lm_)dj_.c024()) {
            if (lm_2.a946(lm_, n, n2, super.xAxisOffset + n3, n4, (byte)53, super.yAxisOffset + n5)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    final void a277(final int n, final boolean b, final int n2, final lm_ lm_, final int n3, final int n4) {
        final dj_ dj_ = new dj_(this._B);
        for (lm_ lm_2 = (lm_)dj_.a024(); null != lm_2 && lm_2.c154(-101); lm_2 = (lm_)dj_.c024()) {
            lm_2.a277(super.yAxisOffset + n, true, n2, lm_, n3 + super.xAxisOffset, n4);
        }
        if (!b) {
            a490(-2, (byte)(-30), 118, -44, -40, -125, false);
        }
    }
    
    static {
        ii_.skip = "Skip";
        ii_.tip_magical_guardian_room = "<%col_detect>Detect +3 to all monsters.</col>";
        ii_.text_defeated = "Defeated";
        ii_.quickchat_shortcut_help = new String[] { "Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu." };
        ii_._G = -1;
    }
}
