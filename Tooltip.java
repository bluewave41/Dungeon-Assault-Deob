final class Tooltip extends en_
{
    static boolean _l;
    //original name: _j
    static Graphic menu_moss_top_right;
    static int _d;
    //original name: _g
    static String text_revive_tooltip;
    //original name: _i
    static String desc_hidden_darts;
    private String _h;
    private String _m;
    //original name: _k
    static String death_knight;
    private String _f;
    
    //original signature: e_(final String s) {
    Tooltip(final String tip) {
        this(null, tip, tip);
    }
    
    //original signature: public static void c423(final byte b) {
    public static void c423() {
        Tooltip.death_knight = null;
        Tooltip.desc_hidden_darts = null;
        Tooltip.menu_moss_top_right = null;
        Tooltip.text_revive_tooltip = null;
    }
    
    @Override
    final Graphic b373(final byte b) {
        if (this._m != null) {
            final Graphic cn_ = new Graphic(db_.roman12bold.b926(this._m), db_.roman12bold._H + db_.roman12bold._E);
            jh_.a303(cn_);
            db_.roman12bold.b191(this._m, 0, db_.roman12bold._H, 16777215, -1);
            jh_.b797();
            return cn_;
        }
        return null;
    }
    
    Tooltip(final String f, final String h, final String m) {
        this._h = h;
        this._m = m;
        this._f = f;
    }
    
    @Override
    final void a185(final int n, final sa_ sa_) {
        sa_.a050(false, GUIButton._H.a803(this._f, (byte)(-48)), (byte)91, GUIButton._H.a803(this._h, (byte)(-48)), 16777215);
    }
    
    static {
        Tooltip.death_knight = "Death Knight";
        Tooltip.text_revive_tooltip = "Revive this <%0>, allowing them to fight again, at a cost of <%1> Treasure.";
        Tooltip.desc_hidden_darts = "Fail to spot the dart launchers hidden in this room and a raider will find himself peppered with sharp bits of metal.<br><br>This trap is poisonous, and may kill raiders if they fail a <%defence> roll against this room's <%attack>.";
    }
}
