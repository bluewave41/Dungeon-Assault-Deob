final class hp_
{
	//original name: _b
    static Raider[] raiders;
    //original name: _a
    static String create_email_confirm;
    //original name: _d
    static String spy;
    //original name: _c
    static AmbientAudioTrack[] da_ambience_insect;
    
    static final void a366(final int n) {
        final wj_ b = Trap._B;
        b.storeFuzzedOpcode(n);
        b.storeByte(1);
        b.storeByte(0);
    }
    
    public static void a150() {
        hp_.da_ambience_insect = null;
        hp_.spy = null;
        hp_.create_email_confirm = null;
        hp_.raiders = null;
    }
    
    static {
        hp_.spy = "Spy";
        hp_.raiders = new Raider[35];
        hp_.create_email_confirm = "Confirm Email:";
    }
}
