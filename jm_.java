final class jm_
{
	//original name: _a
    static String[] ability_summon;
    //original name: _g
    static String desc_minotaur;
    //original name: _b
    static String mb_achievement_count_2;
    //original name: _i
    static Graphic button_152;
    //original name: _e
    static String create_alert_nameleadingspace;
    static lh_ _h;
    static int _c;
    //original name: _d
    static String desc_basilisk;
    static md_ _f;
    
    static final void a115(final int n, final int n2, final int n3, final int n4) {
        if (0 != n2 % 7 && gm_.playerInformation._k.a370(-(n2 / 7) + (n2 - 1))) {
            ol_._a[0].b326(n4, n, 256);
        }
        if (n2 % 7 != 6) {
            if (gm_.playerInformation._k.a370(n2 - n2 / 7)) {
                ol_._a[2].b326(n4, n, 256);
            }
        }
        if (n3 != 3) {
            a115(125, 94, 37, 21);
        }
        if (6 < n2) {
            if (gm_.playerInformation._k.a370(n2 + 35)) {
                ol_._a[1].b326(n4, n, 256);
            }
        }
        if (42 > n2 && gm_.playerInformation._k.a370(n2 + 42)) {
            ol_._a[3].b326(n4, n, 256);
        }
    }
    
    static final void a315(final la_ la_, final byte b) {
        if (null == la_._d) {
            return;
        }
        if (0 != la_._o || 0 != la_._m) {
            for (int i = 0; i < ud_._x; ++i) {
                final la_ la_2 = nb_._a[i];
                if (2 == la_2._n && la_2._o == la_._o && la_2._m == la_._m) {
                    return;
                }
            }
        }
        if (b != 116) {
            a315(null, (byte)75);
        }
        if (null == la_._i) {}
        ul_.a588(la_);
    }
    
    static final void a660(int n, final int n2, final Graphic[] array, final int n3, final int n4) {
        if (null != array && 0 < n2) {
            final int e = array[0].imageWidth2;
            final int e2 = array[2].imageWidth2;
            final int e3 = array[1].imageWidth2;
            array[n3].drawImage(n, n4);
            array[2].drawImage(n + n2 - e2, n4);
            gf_.a331(mk_._i);
            gf_.a115(n + e, n4, n2 + (n - e2), n4 + array[1].imageHeight2);
            final int n5 = e + n;
            int i;
            for (i = n2 + n - e2, n = n5; i > n; n += e3) {
                array[1].drawImage(n, n4);
            }
            gf_.b331(mk_._i);
        }
    }
    
    static final void a487() {
        bb_.image = null;
        td_._a = null;
    }
    
    public static void a423() {
        jm_._f = null;
        jm_._h = null;
        jm_.desc_minotaur = null;
        jm_.button_152 = null;
        jm_.ability_summon = null;
        jm_.create_alert_nameleadingspace = null;
        jm_.desc_basilisk = null;
        jm_.mb_achievement_count_2 = null;
    }
    
    static final void a050(final int n, final int n2, final int n3, final int n4) {
        gf_.e050(n2, n4, n3, n, 0);
        gf_.e050(n2 - 1, n4 - 1, n3 + 2, 2 + n, 12632256);
        qe_.b229(n2 - 1, n4 - 1, 2 + n3, n + 2, 192, 64, 3, 192);
    }
    
    //original signature: static final String a715(final byte b, final CharSequence charSequence) {
    static final String lowerCaseReplaceSpaceWithUnderscore(final CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int n;
        int i;
        for (n = 0, i = charSequence.length(); i > n && jc_.a351(charSequence.charAt(n)); ++n) {}
        while (i > n && jc_.a351(charSequence.charAt(i - 1))) {
            --i;
        }
        final int n2 = -n + i;
        if (n2 < 1 || n2 > 12) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(n2);
        for (int n3 = n; i > n3; ++n3) {
            final char char1 = charSequence.charAt(n3);
            if (il_.a778(char1)) {
                final char a771 = tl_.a771(char1);
                if (a771 != '\0') {
                    sb.append(a771);
                }
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
    
    static final void a150(final int n) {
        if (!tl_._l) {
            if (!jn_._c) {
                Trap._B.storeFuzzedOpcode(70);
                Trap._B.storeTribyte(ke_._b);
                Trap._B.storeByte(oh_._s);
            }
            else {
                Trap._B.storeFuzzedOpcode(71);
                final wj_ b = Trap._B;
                ++b.currentIndex;
                final int o = Trap._B.currentIndex;
                Trap._B.a984(ip_._j);
                Trap._B.storeByte(oh_._s);
                Trap._B.c093(Trap._B.currentIndex - o, -1);
            }
            if (n != -17573) {
                a487();
            }
        }
    }
    
    static {
        jm_.desc_minotaur = "A very large, well-muscled creature with the head of a bull and the body of a man. It wields a massive axe but wears little in the way of protective clothing.";
        jm_.create_alert_nameleadingspace = "Names cannot start or end with space or underscore";
        jm_.mb_achievement_count_2 = "achievements to collect";
        jm_.ability_summon = new String[] { "Summon Zombie", "From the miscellaneous body parts found so frequently around a dungeon, the <%0> is able to assemble a zombie to scout the next room. The zombie is incapable of fighting or disarming traps. (Single use)" };
        jm_.desc_basilisk = "Most reptiles don't have eight legs. Saying that, most reptiles don't have a penchant for eating raiders.";
    }
}
