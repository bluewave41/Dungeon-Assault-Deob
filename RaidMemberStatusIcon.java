//original name: wb_
final class RaidMemberStatusIcon
{
	//original name: _c
    Graphic icon;
    //original name: _b
    String text;
    int _a;
    private en_ _d;
    
    final en_ a047() {
        if (this._d == null) {
            this._d = new jf_(this);
        }
        return this._d;
    }
    
    //original signature: wb_(final String b, final Graphic c, final int a) {
    RaidMemberStatusIcon(final String text, final Graphic icon, final int a) {
        this.text = text;
        this.icon = icon;
        this._a = a;
    }
}
