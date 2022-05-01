//original name: qf_
final class FooterCenterHint extends en_
{
	//original name: _d
    private String minitip;
    //original name: _g
    private String tooltip;
    //original name: _f
    static Graphic scrollbar_bottom;
    //original name: _e
    private String heading;
    
    //original signature: static final hl_ a647(final boolean b, final String s, final String s2) {
    static final hl_ a647(final String username, final String password) {
        long a438 = 0L;
        String s3 = null;
        if (password.indexOf('@') != -1) {
            s3 = password;
        }
        else {
            a438 = ci_.encodeBase37(password);
        }
        return l_.a566(username, a438, s3);
    }
    
    static final String a034(final CharSequence charSequence) {
        int length = charSequence.length();
        if (length > 20) {
            length = 20;
        }
        final char[] array = new char[length];
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if (char1 >= 'A' && 'Z' >= char1) {
                array[i] = (char)(char1 + 'a' - 65);
            }
            else if (('a' <= char1 && 'z' >= char1) || (char1 >= '0' && char1 <= '9')) {
                array[i] = char1;
            }
            else {
                array[i] = '_';
            }
        }
        return new String(array);
    }
    
    public static void b150() {
        FooterCenterHint.scrollbar_bottom = null;
    }
    
    @Override
    final Graphic b373(final byte b) {
        if (this.minitip != null) {
            jh_.c797();
            final String[] a782 = jn_.a782(GUIButton._H.a803(this.minitip, (byte)(-48)), new int[] { 200 }, -63, db_.roman12bold);
            final int n = db_.roman12bold._E + db_.roman12bold._H * a782.length;
            int h = db_.roman12bold._H;
            final Graphic cn_ = new Graphic(200, n);
            cn_.e797();
            final String[] array = a782;
            for (int n2 = 0; array.length > n2; ++n2) {
                db_.roman12bold.c191(array[n2], 100, h, 16777215, -1);
                h += db_.roman12bold._H;
            }
            jh_.b797();
            return cn_;
        }
        return null;
    }
    
    //original signature: qf_(final String e, final String g, final String d) {
    FooterCenterHint(final String heading, final String tooltip, final String minitip) {
        this.tooltip = tooltip;
        this.minitip = minitip;
        this.heading = heading;
    }
    
    private final Graphic a574(final byte b, final int n) {
        jh_.c797();
        final String[] a782 = jn_.a782(GUIButton._H.a803(this.tooltip, (byte)(-48)), new int[] { n }, -83, la_.roman12);
        int n2 = a782.length * la_.roman12._H + la_.roman12._E;
        int h = la_.roman12._H;
        if (this.heading != null) {
            n2 += 2 * la_.roman12._H;
        }
        final Graphic cn_ = new Graphic(n, n2);
        if (b <= 22) {
            return null;
        }
        cn_.e797();
        if (null != this.heading) {
            db_.roman12bold.c191(GUIButton._H.a803(this.heading, (byte)(-48)), n >> 1, h, 16777215, -1);
            h += la_.roman12._H * 2;
        }
        final String[] array = a782;
        for (int n3 = 0; array.length > n3; ++n3) {
            la_.roman12.c191(array[n3], n >> 1, h, 16777215, -1);
            h += la_.roman12._H;
        }
        jh_.b797();
        return cn_;
    }
    
    FooterCenterHint(final String s, final String s2) {
        this(s, s2, s);
    }
    
    @Override
    final void a185(final int n, final sa_ sa_) {
        if (n != 0) {
            this.a574((byte)(-60), 34);
        }
        final Graphic a574 = this.a574((byte)32, sa_._b - 40);
        sa_.a098(a574, a574.imageHeight + 8, false, 112, -la_.roman12._H + sa_._y >> 1);
    }
}
