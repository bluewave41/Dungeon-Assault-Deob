final class vl_ extends hl_
{
	//original name: _n
    private String username;
    //original name: _o
    private String password;
    //original name: _m
    static int mouseY;
    //original name: _l
    static String text_protection;
    
    @Override
    final void a330(final ec_ ec_) {
        ec_.a984(this.password);
        ec_.encodeRSString(this.username);
    }
    
    //original signature; static final String c738(final int n) {
    static final String getUsername() {
        if (ql_._f == ol_._i) {
            return ho_._i;
        }
        if (ql_._f == wd_._d) {
            return bf_._o;
        }
        if (!im_._b.getH()) {
            return bf_._o;
        }
        return co_.username;
    }
    
    public static void a423() {
        vl_.text_protection = null;
    }
    
    static final q_[] d461() {
        final q_[] array = new q_[dk_._d];
        for (int n = 0; dk_._d > n; ++n) {
            array[n] = new q_(ce_._x, tb_._i, hg_._t[n], fe_._g[n], jc_._f[n], jn_._k[n], ub_._q[n], uo_._b);
        }
        sb_.a150();
        return array;
    }
    
    @Override
    final fd_ b743(final int n) {
        return pe_._j;
    }
    
    static final void a366(final int k, final byte b) {
        if (!tl_._l) {
            if (k <= gm_.playerInformation._K) {
                return;
            }
            gm_.playerInformation._K = k;
            Trap._B.storeFuzzedOpcode(72);
            Trap._B.storeByte(gm_.playerInformation._K);
        }
        if (b != -49) {
            a873(105, 115, null);
        }
    }
    
    static final boolean a873(final int n, final int n2, final int[] array) {
        if (n2 > -58) {
            vl_.text_protection = null;
        }
        return 0x0 != (array[n >> 5] & 1 << (n & 0x1F));
    }
    
    //original signature: vl_(final String o, final String n) {
    vl_(final String password, final String username) {
        this.password = password;
        this.username = username;
    }
    
    static {
        vl_.mouseY = -1;
        vl_.text_protection = "This target is much less powerful than you, and is <%0>% more likely to wake.<br>(Renown gambled: <%1>)";
    }
}
