abstract class un_
{
    static en_ _e;
    //original name: _d
    static String create_displayname_tooltip;
    static byte[] _c;
    //original name: _b
    static String[] tutorial_dragonsofrenown4;
    //original name: _a
    static String[] orbDescriptions;
    
    public static void a423() {
        un_.orbDescriptions = null;
        un_._c = null;
        un_.tutorial_dragonsofrenown4 = null;
        un_._e = null;
        un_.create_displayname_tooltip = null;
    }
    
    static final void a813(final boolean b) {
        lg_._w.a326(0, 0);
    }
    
    abstract void a167(final byte[] p0, final int p1);
    
    abstract byte[] b334(final byte p0);
    
    static {
        un_.create_displayname_tooltip = "Enter the name you'd prefer. This is the name displayed to other players.";
        un_._c = new byte[520];
        un_.tutorial_dragonsofrenown4 = new String[] { null, "To start a raid, select a player from the table and <col=FF0000>left-click the 'Raid' button near the bottom of the screen</col>." };
        un_.orbDescriptions = new String[6];
        un_._e = null;
    }
}
