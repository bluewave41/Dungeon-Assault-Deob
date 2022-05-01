//original name: rb_
final class GUICheckbox extends GUIButton
{
	//original name: _J
    static String[] renowntable_column_text;
    //original name: _M
    static String text_defences;
    static int _N;
    static en_ _O;
    //original name: _L
    static int componentY;
    //original name: _K
    static String fatal_monster;
    //original name: _I
    static String text_disarm_guardian_minitip;
    
    //original signature: rb_(final String s, final pg_ pg_, final boolean e) {
    GUICheckbox(final String s, final pg_ pg_, final boolean defaultValue) {
        this(s, pg_);
        super._E = defaultValue;
    }
    
    //does something with colors?
    //original signature: static final int[] b330(final int n, final int n2, final int n3) {
    static final int[] b330(final int n, final int n2, final int size) {
        final int[] array = new int[size];
        for (int i = 0; i < 64; ++i) {
            array[i] = hj_.a185(n, i << 2, n2);
        }
        return array;
    }
    
    static final Graphic a551(final int n, final Graphic cn_, final int n2, final byte b) {
        final Graphic cn_2 = new Graphic(cn_.imageWidth + n * 2, cn_.imageHeight + n * 2);
        jh_.a303(cn_2);
        for (int i = 0; i < n; ++i) {
            cn_.e326(-cn_._w + n, n - cn_._A, n2);
            gf_.d669(1, 1, 0, 0, cn_2.imageWidth, cn_2.imageHeight);
        }
        cn_.e326(n - cn_._w, -cn_._A + n, 0);
        jh_.b797();
        cn_2._A = cn_._A - n;
        cn_2._w = cn_._w - n;
        return cn_2;
    }
    
    public static void a150(final int n) {
        GUICheckbox._O = null;
        if (n != 4935) {
            a150(39);
        }
        GUICheckbox.text_disarm_guardian_minitip = null;
        GUICheckbox.renowntable_column_text = null;
        GUICheckbox.text_defences = null;
        GUICheckbox.fatal_monster = null;
    }
    
    //original signature: static final int a218(final byte b, final String s) {
    static final int a218(final String s) {
        return mp_._a.b926(s);
    }
    
    private GUICheckbox(final String s, final pg_ pg_) {
        this(s, hl_._a._o, pg_);
        super._o = hl_._a._q;
    }
    
    private GUICheckbox(final String s, final ca_ ca_, final pg_ pg_) {
        super(s, ca_, pg_);
        super._o = hl_._a._q;
    }
    
    @Override
    final void b115(final int n, final int n2, final int n3, final int n4) {
        super._E = !super._E;
        super.b115(n, n2, n3, n4);
    }
    
    static {
        GUICheckbox.renowntable_column_text = new String[] { "Rank", "Name", "Renown", "Last Raided" };
        GUICheckbox._N = -1;
        GUICheckbox.fatal_monster = "The attack of this monster is lethal.";
        GUICheckbox.componentY = 0;
        GUICheckbox.text_disarm_guardian_minitip = "<col=8B1717>Disarm</col>";
        GUICheckbox.text_defences = "Defences: ";
    }
}
