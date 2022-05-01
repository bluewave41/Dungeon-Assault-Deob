final class bd_ extends en_
{
    static Graphic _g;
    static int _f;
    //original name: _d
    private Room room;
    //original name: _h
    private Trap trap;
    //original name: _e
    static String[] reconnect_lost_seq;
    
    private final Graphic a438(final boolean b, final int n) {
        jh_.c797();
        final String[] a782 = jn_.a782(GUIButton._H.a803(this.trap.description, (byte)(-48)), new int[] { n }, -98, la_.roman12);
        int n2 = (a782.length + 2) * la_.roman12._H + la_.roman12._E;
        final int h = la_.roman12._H;
        final RaidMemberStatusIcon[] array = (RaidMemberStatusIcon[])((null == this.room) ? null : this.room._f);
        if (array != null) {
            n2 += (array.length + 1) * db_.roman12bold._H;
        }
        final boolean b2 = ((null == this.room) ? this.trap.isFatal : this.room._i) & (this.trap.roomType == 2 || this.trap.roomType == 1 || 3 == this.trap.roomType);
        if (b2) {
            n2 += 2 * db_.roman12bold._H;
        }
        final Graphic cn_ = new Graphic(n, n2);
        cn_.e797();
        db_.roman12bold.c191(this.trap.name.toUpperCase(), n >> 1, h, 16777215, -1);
        int n3 = h + la_.roman12._H * 2;
        if (!b) {
            this.a185(80, null);
        }
        final String[] array2 = a782;
        for (int i = 0; i < array2.length; ++i) {
            la_.roman12.c191(array2[i], n >> 1, n3, 16777215, -1);
            n3 += la_.roman12._H;
        }
        if (b2) {
            final int n4 = n3 + la_.roman12._H;
            if (this.trap.roomType != 2) {
                if (this.trap.roomType == 1) {
                    db_.roman12bold.c191(gm_.fatal_trap, n >> 1, n4, 16711680, -1);
                }
                else if (this.trap.roomType == 3) {
                    db_.roman12bold.c191(lf_.fatal_guardian, n >> 1, n4, 16711680, -1);
                }
            }
            else {
                db_.roman12bold.c191(GUICheckbox.fatal_monster, n >> 1, n4, 16711680, -1);
            }
            n3 = n4 + la_.roman12._H;
        }
        if (null != array) {
            int n5 = n3 + la_.roman12._H;
            final RaidMemberStatusIcon[] array3 = array;
            for (int j = 0; j < array3.length; ++j) {
                final RaidMemberStatusIcon wb_ = array3[j];
                final int n6 = db_.roman12bold.b926(wb_.text) + 24;
                wb_.icon.c326(-n6 + n >> 1, -(-wb_.icon.imageHeight + la_.roman12._H * 3 >> 1) + n5, wb_._a);
                db_.roman12bold.b191(GUIButton._H.a803(wb_.text, (byte)(-48)), 24 + (-n6 + n >> 1), n5, wb_._a, -1);
                n5 += la_.roman12._H;
            }
        }
        jh_.b797();
        return cn_;
    }
    
    //original signature: static final void a366(final int n, final byte b) {
    static final void createOpcode4() {
        final wj_ b2 = Trap._B;
        b2.storeFuzzedOpcode(4);
        b2.storeByte(1);
        b2.storeByte(2);
    }
    
    @Override
    final Graphic b373(final byte b) {
        jh_.c797();
        String s = this.trap.tip;
        if (s == null) {
            if (this.trap.isFatal) {
                s = lg_.fatal_brief;
            }
        }
        String[] a782 = null;
        if (s != null) {
            s = GUIButton._H.a803(jk_.replacePlaceholders(new String[] { jk_.replacePlaceholders(new String[] { this.trap.name.toUpperCase() }, "<col=178B8B><%0></col>") }, s), (byte)(-48));
            a782 = jn_.a782(s, new int[] { 200 }, -122, db_.roman12bold);
        }
        final Graphic cn_ = new Graphic(200, db_.roman12bold._H * ((null != s) ? (2 + a782.length) : 1) + db_.roman12bold._E);
        cn_.e797();
        final int h = db_.roman12bold._H;
        db_.roman12bold.c191(this.trap.name, 100, h, 16777215, -1);
        int n = h + db_.roman12bold._H;
        if (s != null) {
            final String[] array = a782;
            for (int n2 = 0; array.length > n2; ++n2) {
                final String s2 = array[n2];
                n += db_.roman12bold._H;
                db_.roman12bold.c191(s2, 100, n, 16777215, -1);
            }
        }
        jh_.b797();
        return cn_;
    }
    
    @Override
    final void a185(final int n, final sa_ sa_) {
        if (n != 0) {
            this.room = null;
        }
        final Graphic a438 = this.a438(true, sa_._b - 40);
        sa_.a098(a438, 8 + a438.imageHeight, false, 111, -la_.roman12._H + sa_._y >> 1);
    }
    
    //original signature: public static void b150(final int n) {
    public static void cleanup() {
        bd_._g = null;
        bd_.reconnect_lost_seq = null;
    }
    
    //original signature: bd_(final pj_ pj_, final Room d) {
    bd_(final pj_ pj_, final Room room) {
        this.room = room;
        this.trap = this.room.trap;
    }
    
    //original signature: bd_(final Trap h) {
    bd_(final Trap trap) {
        this.trap = trap;
        this.room = null;
    }
    
    static {
        bd_.reconnect_lost_seq = new String[] { "Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..." };
    }
}
