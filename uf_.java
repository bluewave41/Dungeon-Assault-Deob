final class uf_
{
	//original name: _d
    static String[] ability_intimidate_brief;
    //original name: _c
    static String minotaur;
    //original name: _b
    static String text_viewstyle;
    
    public static void b150() {
        uf_.ability_intimidate_brief = null;
        uf_.text_viewstyle = null;
        uf_.minotaur = null;
    }
    
    static final void a150(final int n) {
        fl_._m[n] = 73;
        fl_._m[92] = 74;
        fl_._m[46] = 72;
        fl_._m[59] = 57;
        fl_._m[45] = 26;
        fl_._m[91] = 42;
        fl_._m[222] = 58;
        fl_._m[520] = 59;
        fl_._m[192] = 28;
        fl_._m[44] = 71;
        fl_._m[93] = 43;
        fl_._m[61] = 27;
    }
    
    static final void c150() {
        final int[] b = hk_._b;
        for (int n = 0; b.length > n; b[n++] = 0, b[n++] = 0, b[n++] = 0, b[n++] = 0, b[n++] = 0, b[n++] = 0, b[n++] = 0, b[n++] = 0) {}
    }
    
    static {
        uf_.minotaur = "Minotaur";
        uf_.text_viewstyle = "VIEW: ";
        uf_.ability_intimidate_brief = new String[] { "Intimidate", "<col=FF0000>Sneak -1</col> to raiders, <col=FF0000>Attack -1</col> to monsters." };
    }
}
