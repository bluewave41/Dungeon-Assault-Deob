import java.io.*;

final class op_
{
    static nn_ _d;
    //original name: _a
    static String orbpoints_colon;
    //original name: _b
    static String dark_elf_assassin;
    static int[] _c;
    
    //writing something to server
    //original signature: static final void a093(final int n, final int n2) {
    static final void writeToServer(final int n, final int n2) {
        if (null == sp_._c || (0 <= n2 && pd_._A != qa_._c)) {
            Trap._B.currentIndex = 0;
            return;
        }
        if (n == Trap._B.currentIndex) {
            if (kd_.getTime() > 10000L + MusicTrack.time) {
                Trap._B.storeFuzzedOpcode(n2);
            }
        }
        if (0 < Trap._B.currentIndex) {
            try {
                sp_._c.b120(Trap._B.buffer, Trap._B.currentIndex); //writing to server
                MusicTrack.time = kd_.getTime();
            }
            catch (IOException ex) {
                tl_.a150(117);
            }
            Trap._B.currentIndex = 0;
        }
    }
    
    //this gets constantly called but it shouldn't
    static final int a489(final cd_ cd_, final int n, final int n2, final cd_ cd_2, final String s, final int n3, final boolean b) {
        if (n3 > -47) {
            writeToServer(3, -113);
        }
        final String b2 = cd_.getUsername();
        final String b3 = cd_2.getUsername();
        if (null == sp_._c && !rj_.writeOpcode12(false)) {
            return -1;
        }
        if (no_._c == pd_._A) {
            fj_._e = null;
            Trap._B.currentIndex = 0;
            if (null == s) {
                ta_._c.currentIndex = 0;
                ta_._c.storeInt(bl_.random.nextInt());
                ta_._c.storeInt(bl_.random.nextInt());
                ta_._c.a984(cd_.a427((byte)(-102)) ? b2 : "");
                ta_._c.a984(cd_2.a427((byte)123) ? b3 : "");
                Trap._B.storeByte(16);
                final wj_ b4 = Trap._B;
                ++b4.currentIndex;
                final int o = Trap._B.currentIndex;
                of_.encryptBlock(Trap._B, kd_.publicKey, om_.publicKeyExponent, ta_._c);
                Trap._B.c093(Trap._B.currentIndex - o, -1);
            }
            else {
                int n4 = 0;
                if (b) {
                    n4 |= 0x1;
                }
                ta_._c.currentIndex = 0;
                ta_._c.storeInt(bl_.random.nextInt());
                ta_._c.storeInt(bl_.random.nextInt());
                ta_._c.a984(b2);
                ta_._c.a984(b3);
                ta_._c.a984(FooterCenterHint.a034(s));
                ta_._c.storeShort(n);
                ta_._c.storeByte(n2);
                ta_._c.storeByte(n4);
                Trap._B.storeByte(18);
                final wj_ b5 = Trap._B;
                b5.currentIndex += 2;
                final int o2 = Trap._B.currentIndex;
                String a326 = oj_.a326(m_.getApplet());
                if (a326 == null) {
                    a326 = "";
                }
                Trap._B.b627(a326);
                of_.encryptBlock(Trap._B, kd_.publicKey, om_.publicKeyExponent, ta_._c);
                Trap._B.writeNewSize(-o2 + Trap._B.currentIndex, 1);
            }
            writeToServer(0, -1);
            pd_._A = kp_._b;
        }
        if (pd_._A == kp_._b) {
            if (oi_.readServerData(1)) {
                final int c474 = ra_._c.readByte();
                ra_._c.currentIndex = 0;
                if (c474 >= 100 && 105 >= c474) {
                    pd_._A = jg_._a;
                    mf_._c = new String[c474 - 100];
                }
                else {
                    if (248 == c474) {
                        np_.a812((byte)(-126), m_.getApplet());
                        tp_._v = m_.create_unable;
                        tl_.a150(-84);
                        nh_._e = false;
                        return c474;
                    }
                    if (99 != c474) {
                        nj_._b = -1;
                        hc_.loginStatusCode = c474;
                        pd_._A = sd_._G;
                    }
                    else {
                        oi_.readServerData(la_.a137());
                        fj_._e = fm_.isNextByteZero(ra_._c);
                        ra_._c.currentIndex = 0;
                    }
                }
            }
        }
        if (pd_._A == jg_._a) {
            if (oi_.readServerData(2)) {
                final int k137 = ra_._c.readShort();
                ra_._c.currentIndex = 0;
                if (oi_.readServerData(k137)) {
                    final int i = mf_._c.length;
                    for (int n5 = 0; i > n5; ++n5) {
                        mf_._c[n5] = ra_._c.readString();
                    }
                    tl_.a150(-60);
                    nh_._e = false;
                    return i + 100;
                }
            }
        }
        if (pd_._A == sd_._G) {
            if (kh_.d427()) {
                if (hc_.loginStatusCode == 255) {
                    final String b6 = ra_._c.b791();
                    if (null != b6) {
                        jb_.a674(b6, m_.getApplet());
                    }
                }
                else {
                    tp_._v = ra_._c.d738();
                }
                tl_.a150(-59);
                nh_._e = false;
                return hc_.loginStatusCode;
            }
        }
        if (null == sp_._c) {
            if (nh_._e) {
                if (30000L < b_.a138()) {
                    tp_._v = lh_.loginm3;
                }
                else {
                    tp_._v = fc_.loginm2;
                }
                nh_._e = false;
                return 249;
            }
            an_.gamePort1 = l_.gamePort2;
            nh_._e = true;
            l_.gamePort2 = an_.gamePort1;
        }
        return -1;
    }
    
    public static void a423() {
        op_._d = null;
        op_._c = null;
        op_.orbpoints_colon = null;
        op_.dark_elf_assassin = null;
    }
    
    static {
        op_.dark_elf_assassin = "Dark Elf Assassin";
        op_.orbpoints_colon = "Orb points: ";
    }
}
