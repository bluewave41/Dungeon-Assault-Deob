final class wj_ extends ec_
{
	//original name: _w
    static Graphic menu_moss_1;
    //original name: _v
    private IsaacCipher isaacCipher;
    //original name: _s
    static int crc;
    private int _t;
    //original name: _x
    static String text_confirm_changes_dungeon;
    //original name: _u
    static MusicTrack da_highscores;
    
    //original signature: final void d556(final byte b, final int n) {
    final void storeFuzzedOpcode(final int n) {
        super.buffer[super.currentIndex++] = (byte)(n + this.isaacCipher.next());
    }
    
    //original signature: final void a977(final int[] array, final byte b) {
    final void createIsaacCipher(final int[] array) {
        this.isaacCipher = new IsaacCipher(array);
    }
    
    //original signature: final int m137(final int n) {
    final int m137() {
        return 0xFF & super.buffer[super.currentIndex++] - this.isaacCipher.next();
    }
    
    final int j080(final int n, int i) {
        int n2 = this._t >> 3;
        int n3 = -(0x7 & this._t) + 8;
        int n4 = 0;
        this._t += i;
        while (i > n3) {
            n4 += (super.buffer[n2++] & ba_._b[n3]) << -n3 + i;
            i -= n3;
            n3 = 8;
        }
        int n5;
        if (n3 == i) {
            n5 = n4 + (super.buffer[n2] & ba_._b[n3]);
        }
        else {
            n5 = n4 + (super.buffer[n2] >> -i + n3 & ba_._b[i]);
        }
        return n5;
    }
    
    final void f423(final byte b) {
        super.currentIndex = (this._t + 7) / 8;
        if (b <= 19) {
            this.f423((byte)(-32));
        }
    }
    
    wj_(final int n) {
        super(n);
    }
    
    wj_(final byte[] array) {
        super(array);
    }
    
    final void a596(final int n, final byte b, final int n2, final byte[] array) {
        for (int i = 0; i < n2; ++i) {
            array[i + n] = (byte)(super.buffer[super.currentIndex++] - this.isaacCipher.next());
        }
        if (b != 95) {
            this.e487();
        }
    }
    
    public static void n150() {
        wj_.da_highscores = null;
        wj_.menu_moss_1 = null;
        wj_.text_confirm_changes_dungeon = null;
    }
    
    //original signature: final void e487(final boolean b) {
    final void e487() {
        this._t = 8 * super.currentIndex;
    }
    
    static {
        wj_.text_confirm_changes_dungeon = "The changes you have made to your dungeon have not yet been saved. Would you like them to be saved now?";
    }
}
