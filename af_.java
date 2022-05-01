import java.awt.*;

final class af_
{
	//original name: _a
    static String text_monster;
    
    static final void a224(final boolean b, final tc_ b2, final int n, final int n2, final Component component, final int u, final qg_ qg_) {
        vn_.a773(n, b, 10);
        ub_._n = vn_.a393(qg_, component, 0, n2);
        hm_._n = vn_.a393(qg_, component, 1, u);
        wa_._j = new mb_();
        kc_._U = u;
        hm_._n.a501(wa_._j);
        (ek_._b = b2).a093(ql_._d, 256);
        ub_._n.a501(ek_._b);
    }
    
    public static void a150() {
        af_.text_monster = null;
    }
    
    @Override
    public final String toString() {
        throw new IllegalStateException();
    }
    
    static final void a423() {
        if (co_._G == null) {
            return;
        }
        co_._G = null;
        bd_._f = 0;
        if (gh_._f) {
            ik_._e.c797();
            gh_._f = false;
            nf_._A = false;
            ik_._e = null;
        }
        if (wa_._a) {
            ll_._i = new md_();
            final int[] c = gj_._c;
            for (int i = 0; i < 8; ++i) {
                c[i] = 0;
            }
            final int[] e = bp_._e;
            for (int n = 0; 8 > n; ++n) {
                e[n] = 0;
            }
            wa_._a = false;
        }
    }
    
    static {
        af_.text_monster = "Monster";
    }
}
