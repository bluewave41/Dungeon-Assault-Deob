final class b_ extends RuntimeException
{
	//original name: _b
    static String error_js5connect;
    //original name: _a
    static char[] keysUserPressed;
    String _c;
    //original name: _d
    Throwable throwable;
    
    static final void a525(final int n, final int n2, final boolean b, final qh_ qh_) {
        final int a080 = ue_.a080((-n + n2) * 3);
        final int n3 = 3 * n;
        final int n4 = a080 - 10;
        ea_.c150(0);
        if (0 < qh_._w && qh_._y != null) {
            uf_.c150();
        }
        ab_._c = 0;
    Label_0383:
        for (short n5 = 0; qh_._h > n5; ++n5) {
            final short n6 = qh_._A[n5];
            final short n7 = qh_._x[n5];
            final short n8 = qh_._N[n5];
            if (b) {
                final int n9 = nj_._g[n6];
                final int n10 = ra_._b[n6];
                if (0 <= -((nj_._g[n8] - n9) * (-n10 + ra_._b[n7])) + (-n10 + ra_._b[n8]) * (-n9 + nj_._g[n7])) {
                    continue;
                }
            }
            final int n11 = ko_._v[n6];
            if (n11 != Integer.MIN_VALUE) {
                final int n12 = ko_._v[n7];
                if (Integer.MIN_VALUE != n12) {
                    final int n13 = ko_._v[n8];
                    if (Integer.MIN_VALUE != n13) {
                        final int n14 = -n3 + (n13 + n12) + n11;
                        int n15;
                        int n16;
                        for (n15 = -((n4 < 0) ? (n14 << -n4) : (n14 >> n4)) + (gg_._a.length - 1), n16 = gg_._a[n15]; 0 != n16 >> 4; n16 = gg_._a[n15]) {
                            if (--n15 < 0) {
                                System.err.println("Out of range!");
                                continue Label_0383;
                            }
                        }
                        hf_._yb[n16 + (n15 << 4)] = n5;
                        gg_._a[n15] = 1 + n16;
                        if (qh_._w > 0) {
                            if (null != qh_._y) {
                                final int[] b2 = hk_._b;
                                final byte b3 = qh_._y[n5];
                                ++b2[b3];
                            }
                        }
                        ++ab_._c;
                    }
                }
            }
        }
        if (qh_._w > 0 && qh_._y != null) {
            int n17 = 0;
            for (int n18 = 0; hk_._b.length > n18; ++n18) {
                final int n19 = hk_._b[n18];
                hk_._b[n18] = n17;
                n17 += n19;
            }
        }
    }
    
    static final long a138() {
        return -qm_.time + kd_.getTime();
    }
    
    public static void b150() {
        b_.keysUserPressed = null;
        b_.error_js5connect = null;
    }
    
    //original signature: static final void a895(final hl_ hl_, final boolean b, final int n, final boolean b) {
    
    //encrypting block?
    static final void a895(final hl_ hl_, final boolean b, final int n, final boolean isReconnect) {
        n_.isaacCipherSeeds[0] = bl_.random.nextInt();
        n_.isaacCipherSeeds[1] = bl_.random.nextInt();
        n_.isaacCipherSeeds[2] = (int)(o_.sessionKey >> 32); //2 ints we sent
        n_.isaacCipherSeeds[3] = (int)o_.sessionKey; // 2 ints we sent
        
        ta_._c.currentIndex = 0;
        ta_._c.storeInt(n_.isaacCipherSeeds[0]);
        ta_._c.storeInt(n_.isaacCipherSeeds[1]);
        ta_._c.storeInt(n_.isaacCipherSeeds[2]);
        ta_._c.storeInt(n_.isaacCipherSeeds[3]);
        
        mf_.a897(ta_._c);
        
        ta_._c.storeShort(n);
        
        hl_.a330(ta_._c);
        
        Trap._B.currentIndex = 0;
        
        if (isReconnect) {
            Trap._B.storeByte(18);
        }
        else {
            Trap._B.storeByte(16);
        }
        
        Trap._B.currentIndex += 2;
        
        final int o = Trap._B.currentIndex;
        
        Trap._B.storeInt(la_.crc);
        Trap._B.storeLong8Byte(dn_.instanceId);
        
        int n2 = 0;
        if (ld_.isMember) {
            n2 |= 0x1;
        }
        if (fa_.unused) { //always false
            n2 |= 0x4;
        }
        if (b) {
            n2 |= 0x8;
        }
        if (pd_._E != null) {
            n2 |= 0x10;
        }
        
        Trap._B.storeByte(n2); //member flag???
        
        String a326 = oj_.a326(m_.getApplet());
        if (null == a326) {
            a326 = "";
        }
        Trap._B.b627(a326);
        
        if (null != pd_._E) {
            Trap._B.a984(pd_._E);
        }
        
        of_.encryptBlock(Trap._B, kd_.publicKey, om_.publicKeyExponent, ta_._c);
        
        Trap._B.writeNewSize(-o + Trap._B.currentIndex, 1);
        
        op_.writeToServer(0, -1); //write code 16
    }
    
    static final String a772(final String s, final int n) {
        if (n != -1) {
            b_.error_js5connect = null;
        }
        return "<col=FF0000>" + s + "</col>";
    }
    
    b_(final Throwable d, final String c) {
        this.throwable = d;
        this._c = c;
    }
    
    static {
        b_.keysUserPressed = new char[128];
        b_.error_js5connect = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
