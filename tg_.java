final class tg_
{
    static int[] _j;
    static int[][] _f;
    //original name: _a
    static String desc_hall_of_glass;
    static int[] _d;
    static int _g;
    int _c;
    //original name: _e
    static String[] tutorial_placeroom1;
    int _m;
    static int[] _b;
    int[] _k;
    //original name: _l
    static se_ benefits_small_font;
    static int[] _h;
    //original name: _n
    static String orb_war;
    
    public static void a150(final int n) {
        tg_.tutorial_placeroom1 = null;
        tg_.benefits_small_font = null;
        tg_.orb_war = null;
        tg_._b = null;
        tg_._f = null;
        tg_._h = null;
        if (n != 400) {
            return;
        }
        tg_._d = null;
        tg_._j = null;
        tg_.desc_hall_of_glass = null;
    }
    
    final int a410(final byte b) {
        if (b != -90) {
            return 15;
        }
        return (null != this._k && this._k.length != 0) ? this._k[this._k.length - 1] : 0;
    }
    
    //original signature: static final String a955(final char c, final String s, final String s2) {
    static final String replace(final char c, final String s, final String s2) {
        final int length = s.length();
        final int length2 = s2.length();
        int n = length;
        final int n2 = length2 - 1;
        if (n2 != 0) {
            int index = 0;
            while (true) {
                index = s.indexOf(c, index);
                if (0 > index) {
                    break;
                }
                n += n2;
                ++index;
            }
        }
        final StringBuilder sb = new StringBuilder(n);
        int n3 = 0;
        while (true) {
            final int index2 = s.indexOf(c, n3);
            if (index2 < 0) {
                break;
            }
            sb.append(s.substring(n3, index2));
            n3 = index2 + 1;
            sb.append(s2);
        }
        sb.append(s.substring(n3));
        return sb.toString();
    }
    
    final int a543(final byte b, final int n) {
        if (this._k == null || 0 == this._k.length) {
            return 0;
        }
        for (int n2 = 1; this._k.length > n2; ++n2) {
            if (n < this._k[n2] + this._k[n2 - 1] >> 1) {
                return n2 - 1;
            }
        }
        if (b > -77) {
            a150(-90);
        }
        return this._k.length - 1;
    }
    
    tg_(final int m, final int c, final int n) {
        this._c = c;
        this._k = new int[n + 1];
        this._m = m;
    }
    
    static {
        tg_._j = new int[14];
        tg_._d = new int[14];
        tg_._b = new int[14];
        tg_._g = 0;
        tg_.desc_hall_of_glass = "Traversing this room without breaking any glass or mirrors will take a skilful and agile raider.<br><br>When triggered, the <%detect> of all monsters in this dungeon is increased by 2.";
        tg_._f = new int[14][];
        tg_._h = new int[14];
        tg_.tutorial_placeroom1 = new String[] { null, "Rooms you have just placed are <%highlight>surrounded by a blue glow to show they are not yet fixed</col>. You can <col=FF0000>right-click</col> on a newly placed room to remove it, restoring the tile it replaced." };
        tg_.orb_war = "Orb of War";
        pi_.a861(new int[] { 20, 4, 3, 7, 21, 13, 14, 8, 15, 12 }, 180, 0, 33, 460, 88);
        pi_.a861(new int[] { 2, 13, 14, 28, 7, 11 }, 180, 1, 33, 460, 88);
        pi_.a861(new int[] { 5, 6, 3, 9 }, 82, 3, 33, 336, 88);
        pi_.a861(new int[] { 10 }, 180, 6, 33, 460, 410);
        pi_.a861(new int[] { 16, 10 }, 200, 8, 33, 440, 392);
        pi_.a861(new int[] { 10 }, 200, 9, 33, 440, 392);
        pi_.a861(new int[] { 16, 17 }, 180, 10, 33, 460, 400);
        pi_.a861(new int[] { 9 }, 290, 11, 33, 460, 400);
        pi_.a861(new int[0], 180, 12, 33, 460, 88);
    }
}
