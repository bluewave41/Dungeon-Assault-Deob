final class vh_ extends ne_
{
    wa_ _j;
    byte[] _i;
    
    final void b797() {
        this._j = null;
    }
    
    final void a797() {
        if (this._j != null) {
            return;
        }
        this._j = new wa_(16);
        final int[] array = new int[16];
        final int[] array2 = new int[16];
        array[9] = (array2[9] = 128);
        final vm_ vm_ = new vm_(this._i);
        for (int a784 = vm_.a784(), i = 0; i < a784; ++i) {
            vm_.d150(i);
            vm_.b150(i);
            vm_.a150(i);
        }
    Label_0431:
        while (true) {
            final int b784 = vm_.b784();
            while (vm_._d[b784] == vm_._d[b784]) {
                vm_.d150(b784);
                final int c137 = vm_.c137(b784);
                if (c137 == 1) {
                    vm_.e797();
                    vm_.a150(b784);
                    if (!vm_.f801()) {
                        break;
                    }
                    break Label_0431;
                }
                else {
                    final int n = c137 & 0xF0;
                    if (n == 176) {
                        final int n2 = c137 & 0xF;
                        final int n3 = c137 >> 8 & 0x7F;
                        final int n4 = c137 >> 16 & 0x7F;
                        if (n3 == 0) {
                            array[n2] = (array[n2] & 0xFFE03FFF) + (n4 << 14);
                        }
                        if (n3 == 32) {
                            array[n2] = (array[n2] & 0xFFFFC07F) + (n4 << 7);
                        }
                    }
                    if (n == 192) {
                        final int n5 = c137 & 0xF;
                        array2[n5] = array[n5] + (c137 >> 8 & 0x7F);
                    }
                    if (n == 144) {
                        final int n6 = c137 & 0xF;
                        final int n7 = c137 >> 8 & 0x7F;
                        if ((c137 >> 16 & 0x7F) > 0) {
                            final int n8 = array2[n6];
                            mk_ mk_ = (mk_)this._j.a722(n8, 8);
                            if (mk_ == null) {
                                mk_ = new mk_(new byte[128]);
                                this._j.a102(mk_, 12460, n8);
                            }
                            mk_._k[n7] = 1;
                        }
                    }
                    vm_.b150(b784);
                    vm_.a150(b784);
                }
            }
        }
    }
    
    //original signature: static final vh_ a109(final nh_ nh_, final String s, final String s2) {
    static final vh_ a109(final nh_ nh_, final String songName) {
        final byte[] a826 = nh_.a826("", songName);
        if (a826 == null) {
            return null;
        }
        return new vh_(new ec_(a826));
    }
    
    private vh_(final ec_ ec_) {
        ec_.currentIndex = ec_.buffer.length - 3;
        final int c474 = ec_.readByte();
        final int k137 = ec_.readShort();
        int n = 14 + c474 * 10;
        ec_.currentIndex = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        for (int i = 0; i < c474; ++i) {
            int n10 = -1;
            while (true) {
                final int c475 = ec_.readByte();
                if (c475 != n10) {
                    ++n;
                }
                n10 = (c475 & 0xF);
                if (c475 == 7) {
                    break;
                }
                if (c475 == 23) {
                    ++n2;
                }
                else if (n10 == 0) {
                    ++n4;
                }
                else if (n10 == 1) {
                    ++n5;
                }
                else if (n10 == 2) {
                    ++n3;
                }
                else if (n10 == 3) {
                    ++n6;
                }
                else if (n10 == 4) {
                    ++n7;
                }
                else if (n10 == 5) {
                    ++n8;
                }
                else {
                    if (n10 != 6) {
                        throw new RuntimeException();
                    }
                    ++n9;
                }
            }
        }
        final int n11 = n + 5 * n2 + 2 * (n4 + n5 + n3 + n6 + n8) + (n7 + n9);
        final int o = ec_.currentIndex;
        for (int n12 = c474 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9, j = 0; j < n12; ++j) {
            ec_.e137();
        }
        final int n13 = n11 + (ec_.currentIndex - o);
        int o2 = ec_.currentIndex;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        int n23 = 0;
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        for (int l = 0; l < n3; ++l) {
            n26 = (n26 + ec_.readByte() & 0x7F);
            if (n26 == 0 || n26 == 32) {
                ++n9;
            }
            else if (n26 == 1) {
                ++n14;
            }
            else if (n26 == 33) {
                ++n15;
            }
            else if (n26 == 7) {
                ++n16;
            }
            else if (n26 == 39) {
                ++n17;
            }
            else if (n26 == 10) {
                ++n18;
            }
            else if (n26 == 42) {
                ++n19;
            }
            else if (n26 == 99) {
                ++n20;
            }
            else if (n26 == 98) {
                ++n21;
            }
            else if (n26 == 101) {
                ++n22;
            }
            else if (n26 == 100) {
                ++n23;
            }
            else if (n26 == 64 || n26 == 65 || n26 == 120 || n26 == 121 || n26 == 123) {
                ++n24;
            }
            else {
                ++n25;
            }
        }
        int n27 = 0;
        int o3 = ec_.currentIndex;
        ec_.currentIndex += n24;
        int o4 = ec_.currentIndex;
        ec_.currentIndex += n8;
        int o5 = ec_.currentIndex;
        ec_.currentIndex += n7;
        int o6 = ec_.currentIndex;
        ec_.currentIndex += n6;
        int o7 = ec_.currentIndex;
        ec_.currentIndex += n14;
        int o8 = ec_.currentIndex;
        ec_.currentIndex += n16;
        int o9 = ec_.currentIndex;
        ec_.currentIndex += n18;
        int o10 = ec_.currentIndex;
        ec_.currentIndex += n4 + n5 + n8;
        int o11 = ec_.currentIndex;
        ec_.currentIndex += n4;
        int o12 = ec_.currentIndex;
        ec_.currentIndex += n25;
        int o13 = ec_.currentIndex;
        ec_.currentIndex += n5;
        int o14 = ec_.currentIndex;
        ec_.currentIndex += n15;
        int o15 = ec_.currentIndex;
        ec_.currentIndex += n17;
        int o16 = ec_.currentIndex;
        ec_.currentIndex += n19;
        int o17 = ec_.currentIndex;
        ec_.currentIndex += n9;
        int o18 = ec_.currentIndex;
        ec_.currentIndex += n6;
        int o19 = ec_.currentIndex;
        ec_.currentIndex += n20;
        int o20 = ec_.currentIndex;
        ec_.currentIndex += n21;
        int o21 = ec_.currentIndex;
        ec_.currentIndex += n22;
        int o22 = ec_.currentIndex;
        ec_.currentIndex += n23;
        int o23 = ec_.currentIndex;
        ec_.currentIndex += n2 * 3;
        this._i = new byte[n13];
        final ec_ ec_2 = new ec_(this._i);
        ec_2.storeInt(1297377380);
        ec_2.storeInt(6);
        ec_2.storeShort((c474 > 1) ? 1 : 0);
        ec_2.storeShort(c474);
        ec_2.storeShort(k137);
        ec_.currentIndex = o;
        int n28 = 0;
        int n29 = 0;
        int n30 = 0;
        int n31 = 0;
        int n32 = 0;
        int n33 = 0;
        int n34 = 0;
        final int[] array = new int[128];
        int n35 = 0;
        for (int n36 = 0; n36 < c474; ++n36) {
            ec_2.storeInt(1297379947);
            final ec_ ec_3 = ec_2;
            ec_3.currentIndex += 4;
            final int o24 = ec_2.currentIndex;
            int n37 = -1;
            while (true) {
                ec_2.e093(ec_.e137());
                final int n38 = ec_.buffer[n27++] & 0xFF;
                final boolean b = n38 != n37;
                n37 = (n38 & 0xF);
                if (n38 == 7) {
                    if (b) {
                        ec_2.storeByte(255);
                    }
                    ec_2.storeByte(47);
                    ec_2.storeByte(0);
                    ec_2.d093(1, ec_2.currentIndex - o24);
                    break;
                }
                if (n38 == 23) {
                    if (b) {
                        ec_2.storeByte(255);
                    }
                    ec_2.storeByte(81);
                    ec_2.storeByte(3);
                    ec_2.storeByte(ec_.buffer[o23++]);
                    ec_2.storeByte(ec_.buffer[o23++]);
                    ec_2.storeByte(ec_.buffer[o23++]);
                }
                else {
                    n28 ^= n38 >> 4;
                    if (n37 == 0) {
                        if (b) {
                            ec_2.storeByte(144 + n28);
                        }
                        n29 += ec_.buffer[o10++];
                        n30 += ec_.buffer[o11++];
                        ec_2.storeByte(n29 & 0x7F);
                        ec_2.storeByte(n30 & 0x7F);
                    }
                    else if (n37 == 1) {
                        if (b) {
                            ec_2.storeByte(128 + n28);
                        }
                        n29 += ec_.buffer[o10++];
                        n31 += ec_.buffer[o13++];
                        ec_2.storeByte(n29 & 0x7F);
                        ec_2.storeByte(n31 & 0x7F);
                    }
                    else if (n37 == 2) {
                        if (b) {
                            ec_2.storeByte(176 + n28);
                        }
                        n35 = (n35 + ec_.buffer[o2++] & 0x7F);
                        ec_2.storeByte(n35);
                        byte b2;
                        if (n35 == 0 || n35 == 32) {
                            b2 = ec_.buffer[o17++];
                        }
                        else if (n35 == 1) {
                            b2 = ec_.buffer[o7++];
                        }
                        else if (n35 == 33) {
                            b2 = ec_.buffer[o14++];
                        }
                        else if (n35 == 7) {
                            b2 = ec_.buffer[o8++];
                        }
                        else if (n35 == 39) {
                            b2 = ec_.buffer[o15++];
                        }
                        else if (n35 == 10) {
                            b2 = ec_.buffer[o9++];
                        }
                        else if (n35 == 42) {
                            b2 = ec_.buffer[o16++];
                        }
                        else if (n35 == 99) {
                            b2 = ec_.buffer[o19++];
                        }
                        else if (n35 == 98) {
                            b2 = ec_.buffer[o20++];
                        }
                        else if (n35 == 101) {
                            b2 = ec_.buffer[o21++];
                        }
                        else if (n35 == 100) {
                            b2 = ec_.buffer[o22++];
                        }
                        else if (n35 == 64 || n35 == 65 || n35 == 120 || n35 == 121 || n35 == 123) {
                            b2 = ec_.buffer[o3++];
                        }
                        else {
                            b2 = ec_.buffer[o12++];
                        }
                        ec_2.storeByte((array[n35] += b2) & 0x7F);
                    }
                    else if (n37 == 3) {
                        if (b) {
                            ec_2.storeByte(224 + n28);
                        }
                        n32 = n32 + ec_.buffer[o18++] + (ec_.buffer[o6++] << 7);
                        ec_2.storeByte(n32 & 0x7F);
                        ec_2.storeByte(n32 >> 7 & 0x7F);
                    }
                    else if (n37 == 4) {
                        if (b) {
                            ec_2.storeByte(208 + n28);
                        }
                        n33 += ec_.buffer[o5++];
                        ec_2.storeByte(n33 & 0x7F);
                    }
                    else if (n37 == 5) {
                        if (b) {
                            ec_2.storeByte(160 + n28);
                        }
                        n29 += ec_.buffer[o10++];
                        n34 += ec_.buffer[o4++];
                        ec_2.storeByte(n29 & 0x7F);
                        ec_2.storeByte(n34 & 0x7F);
                    }
                    else {
                        if (n37 != 6) {
                            throw new RuntimeException();
                        }
                        if (b) {
                            ec_2.storeByte(192 + n28);
                        }
                        ec_2.storeByte(ec_.buffer[o17++]);
                    }
                }
            }
        }
    }
}
