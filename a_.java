final class a_ extends ne_
{
	//original name: _m
    static String text_raider_recruitment_hint;
    static DungeonPath _o;
    //original name: _p
    static String desc_saurus_spawn;
    //original name: _k
    static String text_sneak_past_tooltip;
    //original name: _l
    static String desc_enchantress;
    //original name: _i
    static int mouseY;
    int _j;
    static nk_ _n;
    
    public static void a150() {
        a_.desc_enchantress = null;
        a_._n = null;
        a_.text_raider_recruitment_hint = null;
        a_.desc_saurus_spawn = null;
        a_._o = null;
        a_.text_sneak_past_tooltip = null;
    }
    
    //original signature: static final void a743(final int n, final int n2, final se_ se_, final boolean b, final int n3, final int n4, final int n5, final int n6, final int n7, final Graphic[] array, final Graphic[] array2) {
    static final void a743(final boolean b) {
        he_.a295(b);
    }
    
    a_(final int j) {
        this._j = j;
    }
    
    static {
        a_.text_raider_recruitment_hint = "Select raiders from the panel on the left";
        a_.desc_saurus_spawn = "Like all lizardmen of the eastern deserts, the saurus spawn is sly and agile, though his simple rags and battered weapon leave something to be desired.";
        a_.text_sneak_past_tooltip = "Order your raider to enter the room. It will engage the <%0> in combat if detected; otherwise, you may pass through the room.";
        a_.desc_enchantress = "A perfect vision of beauty, her skill in the arts of deception are legendary, allowing herself and others to trick their way past a dungeon's obstacles.";
        a_.mouseY = -1;
    }
}
