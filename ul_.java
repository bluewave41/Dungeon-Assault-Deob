final class ul_
{
	//original name: _b
    static String error_js5connect_full;
    //original name: _a
    static String desc_rot_worms;
    static String _d;
    
    static final void a588(final la_ la_) {
        for (int n = 0; 3 > n; ++n) {
            nn_._j[n] = 0;
        }
        for (int i = 0; i < ud_._x; ++i) {
            if (la_._n == nb_._a[i]._n) {
                final int[] j = nn_._j;
                final int b410 = nb_._a[i].b410((byte)115);
                ++j[b410];
            }
        }
        final int[] k = nn_._j;
        final int b411 = la_.b410((byte)107);
        ++k[b411];
        int x = 0;
        for (int l = 0; l < ud_._x; ++l) {
            if (nb_._a[l]._n == la_._n) {
                final int b412 = nb_._a[l].b410((byte)104);
                if (nn_._j[b412] > co_._H) {
                    final int[] m = nn_._j;
                    final int n2 = b412;
                    --m[n2];
                    continue;
                }
            }
            nb_._a[x++] = nb_._a[l];
        }
        ud_._x = x;
        nb_._a[ud_._x++] = la_;
    }
    
    public static void a487() {
        ul_.desc_rot_worms = null;
        ul_.error_js5connect_full = null;
        ul_._d = null;
    }
    
    static {
        ul_.error_js5connect_full = "Data server full or too many connections from your address. Please try again in a few minutes.";
        ul_.desc_rot_worms = "A room full of large, maggot-like creatures; their bile can burn through raiders' armour in seconds, inflicting permanent injury.<br><br>Defeated raiders permanently lose 1 <%attack>.";
    }
}
