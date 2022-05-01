final class eb_ extends GUIButton
{
	//original name: _P
    static String text_hint_redistribute;
    int _J;
    private bp_ _K;
    //original name: _L
    static String tip_banshee;
    //original name: _M
    static String desc_shapeshifter;
    //original name: _O
    static AmbientAudioTrack[] da_gold_bar;
    int _N;
    private int _Q;
    //original name: _I
    static String text_flee_tooltip;
    
    @Override
    final boolean a946(final lm_ lm_, final int n, final int n2, final int n3, final int n4, final byte b, final int n5) {
        if (!super.a946(lm_, n, n2, n3, n4, (byte)83, n5)) {
            return false;
        }
        int n6 = -this._J + (n4 - n3);
        final int n7 = super.componentWidth - 2 * this._J;
        if (n6 > n7) {
            n6 = n7;
        }
        if (n6 < 0) {
            n6 = 0;
        }
        final int n8 = this._Q * n6 / n7;
        if (1 == n) {
            this._K.e093(n8, -67);
        }
        else if (n == 2) {
            int n9 = Integer.MAX_VALUE;
            int n10 = -1;
            for (int n11 = 0; this._K.a410((byte)(-44)) > n11; ++n11) {
                final int n12 = -n8 + this._K.a080(-814, n11);
                final int n13 = n12 * n12;
                if (n13 < n9) {
                    n10 = n11;
                    n9 = n13;
                }
            }
            if (n10 >= 0) {
                this._K.b093(n10, 100);
            }
        }
        return true;
    }
    
    final int i137(final int n) {
        if (n <= 88) {
            this.a080(-112, 127);
        }
        return this._K.a410((byte)(-72));
    }
    
    final int a080(final int n, final int n2) {
        if (~n2 <= n && this._K.a410((byte)(-91)) > n2) {
            return this._K.a080(-814, n2);
        }
        return -1;
    }
    
    public static void f423(final byte b) {
        eb_.desc_shapeshifter = null;
        if (b != 86) {
            f423((byte)0);
        }
        eb_.da_gold_bar = null;
        eb_.tip_banshee = null;
        eb_.text_flee_tooltip = null;
        eb_.text_hint_redistribute = null;
    }
    
    private eb_() throws Throwable {
        throw new Error();
    }
    
    final int a137(final int n) {
        if (n >= -58) {
            eb_.tip_banshee = null;
        }
        return this._Q;
    }
    
    static {
        eb_.text_hint_redistribute = "Select attack/defence balance";
        eb_.tip_banshee = "<col=FF0000>Attack -2</col>, <%col_detect>Detect +2</col> in adjacent rooms.";
        eb_.desc_shapeshifter = "Grey-skinned, faceless and hairless, this gangly creature can reshape its body at will.";
        eb_.text_flee_tooltip = "Order your raider to attempt to leave the room without fighting the monster. The monster in the room will not be defeated; you can send in a different raider or find another path around the monster.<br><br>Requires: <col=0A7500>Defence</col>, <col=21634A>Dodge</col>";
    }
}
