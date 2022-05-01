import java.nio.*;

final class ep_ extends un_
{
	//original name: _i
    static String text_raiders_flee_in_terror;
    //original name: _j
    static String create_alert_mismatch;
    //original name: _g
    static Graphic benefits_signup_text;
    //original name: _f
    static String[] rating_mode_name;
    //original name: _h
    private ByteBuffer byteBuffer;
    
    @Override
    final void a167(final byte[] array, final int n) {
        if (n < 30) {
            a556();
        }
        (this.byteBuffer = ByteBuffer.allocateDirect(array.length)).position(0);
        this.byteBuffer.put(array);
    }
    
    public static void a150() {
        ep_.create_alert_mismatch = null;
        ep_.benefits_signup_text = null;
        ep_.text_raiders_flee_in_terror = null;
        ep_.rating_mode_name = null;
    }
    
    @Override
    final byte[] b334(final byte b) {
        final byte[] array = new byte[this.byteBuffer.capacity()];
        this.byteBuffer.position(0);
        this.byteBuffer.get(array);
        return array;
    }
    
    static final RaidMember a069(final int n, final int n2, final ec_ ec_) {
        final int c474 = ec_.readByte();
        if (n2 != ~c474) {
            final RaidMember raidMember = new RaidMember(n, c474);
            raidMember.attack = ec_.readByte();
            raidMember.defence = ec_.readByte();
            raidMember.dodge = ec_.readByte();
            raidMember.sneak = ec_.readByte();
            raidMember.status = ec_.readByte();
            raidMember._d = ec_.readByte();
            raidMember._p = ec_.readByte();
            return raidMember;
        }
        ec_.b411((byte)80);
        return null;
    }
    
    //original signature: static final void a556(final int n) {
    static final void a556() {
        for (ak_ ak_ = (ak_)oh_._j.e024(); ak_ != null; ak_ = (ak_)oh_._j.a024(4)) {
            g_.a953(4, ak_);
        }
        for (ne_ ne_ = sf_._c.e024(); ne_ != null; ne_ = sf_._c.a024(4)) {
            bd_.createOpcode4();
        }
    }
    
    static {
        ep_.text_raiders_flee_in_terror = "Your raiders flee in terror from the <%0>!";
        ep_.create_alert_mismatch = "This entry doesn't match";
        ep_.rating_mode_name = new String[] { "By rating", "By win percentage" };
    }
}
