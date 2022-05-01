final class ei_ extends Graphic
{
    ei_(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array) {
        super(n, n2, n3, n4, n5, n6, array);
    }
    
    private static final void e650(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n8 = -n4;
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                n = array2[n2++];
                final int n9 = n >>> 24;
                if (n9 != 0) {
                    final int n10 = 256 - n9;
                    final int n11 = array[n3];
                    array[n3++] = ((n & 0xFF00FF) * n9 + (n11 & 0xFF00FF) * n10 & 0xFF00FF00) + ((n & 0xFF00) * n9 + (n11 & 0xFF00) * n10 & 0xFF0000) >>> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    @Override
    final void b326(int j, int f, final int n) {
        j += super._w;
        f += super._A;
        int n2 = j + f * gf_._i;
        int n3 = 0;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n4 = gf_._i - y;
        int n5 = 0;
        if (f < gf_._f) {
            final int n6 = gf_._f - f;
            v -= n6;
            f = gf_._f;
            n3 += n6 * y;
            n2 += n6 * gf_._i;
        }
        if (f + v > gf_._e) {
            v -= f + v - gf_._e;
        }
        if (j < gf_._j) {
            final int n7 = gf_._j - j;
            y -= n7;
            j = gf_._j;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (j + y > gf_._h) {
            final int n8 = j + y - gf_._h;
            y -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        b057(0, 0, 0, gf_._b, super._B, n3, 0, n2, 0, y, v, n4, n5, n);
    }
    
    @Override
    final void g093(int j, int f) {
        j += super._w;
        f += super.imageHeight2 - super.imageHeight - super._A;
        int n = j + (f + super.imageHeight - 1) * gf_._i;
        int n2 = 0;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n3 = -gf_._i - y;
        int n4 = 0;
        if (f < gf_._f) {
            v -= gf_._f - f;
            f = gf_._f;
        }
        if (f + v > gf_._e) {
            final int n5 = f + v - gf_._e;
            v -= n5;
            n -= n5 * gf_._i;
            n2 += n5 * y;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            y -= n6;
            j = gf_._j;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (j + y > gf_._h) {
            final int n7 = j + y - gf_._h;
            y -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        e650(gf_._b, super._B, 0, n2, n, y, v, n3, n4);
    }
    
    @Override
    final void b093(int j, int f) {
        j += super._w;
        f += super.imageHeight2 - super.imageHeight - super._A;
        int n = j + (f + super.imageHeight - 1) * gf_._i;
        int n2 = super.imageWidth - 1;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n3 = -gf_._i - y;
        int n4 = y + y;
        if (f < gf_._f) {
            v -= gf_._f - f;
            f = gf_._f;
        }
        if (f + v > gf_._e) {
            final int n5 = f + v - gf_._e;
            v -= n5;
            n -= n5 * gf_._i;
            n2 += n5 * y;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            y -= n6;
            j = gf_._j;
            n2 -= n6;
            n += n6;
            n4 -= n6;
            n3 += n6;
        }
        if (j + y > gf_._h) {
            final int n7 = j + y - gf_._h;
            y -= n7;
            n4 -= n7;
            n3 += n7;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        d650(gf_._b, super._B, 0, n2, n, y, v, n3, n4);
    }
    
    @Override
    final void a093(int n, int n2) {
        final int n3 = super.imageWidth >> 1;
        final int n4 = super.imageHeight >> 1;
        n += super._w / 2;
        n2 += super._A / 2;
        final int n5 = (n < gf_._j) ? (gf_._j - n << 1) : 0;
        final int n6 = (n + n3 > gf_._h) ? ((gf_._h - n << 1) - 2) : (super.imageWidth - 2);
        final int n7 = (n2 < gf_._f) ? (gf_._f - n2 << 1) : 0;
        for (int n8 = (n2 + n4 > gf_._e) ? ((gf_._e - n2 << 1) - 2) : (super.imageHeight - 2), i = n7; i <= n8; i += 2) {
            for (int n9 = i * super.imageWidth + n5, n10 = (n2 + (i >> 1)) * gf_._i + (n + (n5 >> 1)), j = n5; j <= n6; j += 2, ++n10, n9 += 2) {
                int n11 = 0;
                int n12 = 0;
                int n13 = 0;
                int n14 = 0;
                for (int k = 0; k < 4; ++k) {
                    final int n15 = super._B[n9 + (k & 0x1) + (((k & 0x2) == 0x0) ? super.imageWidth : 0)];
                    final int n16 = n15 >>> 24;
                    n14 += n16;
                    n11 += n16 * (n15 >> 16 & 0xFF);
                    n12 += n16 * (n15 >> 8 & 0xFF);
                    n13 += n16 * (n15 & 0xFF);
                }
                if (n14 != 0) {
                    final int n17 = (n11 / n14 << 16) + n13 / n14;
                    final int n18 = n12 / n14 << 8;
                    final int n19 = n14 >> 2;
                    final int n20 = 256 - n19;
                    final int n21 = gf_._b[n10];
                    gf_._b[n10] = (n19 * n17 + n20 * (n21 & 0xFF00FF) & 0xFF00FF00) + (n19 * n18 + n20 * (n21 & 0xFF00) & 0xFF0000) >>> 8;
                }
            }
        }
    }
    
    @Override
    final void f093(int j, int f) {
        j += super.imageWidth2 - super.imageWidth - super._w;
        f += super._A;
        int n = j + f * gf_._i;
        int n2 = super.imageWidth - 1;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n3 = gf_._i - y;
        int n4 = y + y;
        if (f < gf_._f) {
            final int n5 = gf_._f - f;
            v -= n5;
            f = gf_._f;
            n2 += n5 * y;
            n += n5 * gf_._i;
        }
        if (f + v > gf_._e) {
            v -= f + v - gf_._e;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            y -= n6;
            j = gf_._j;
            n2 -= n6;
            n += n6;
            n4 -= n6;
            n3 += n6;
        }
        if (j + y > gf_._h) {
            final int n7 = j + y - gf_._h;
            y -= n7;
            n4 -= n7;
            n3 += n7;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        d650(gf_._b, super._B, 0, n2, n, y, v, n3, n4);
    }
    
    @Override
    final void c326(int j, int f, final int n) {
        j += super._w;
        f += super._A;
        int n2 = j + f * gf_._i;
        int n3 = 0;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n4 = gf_._i - y;
        int n5 = 0;
        if (f < gf_._f) {
            final int n6 = gf_._f - f;
            v -= n6;
            f = gf_._f;
            n3 += n6 * y;
            n2 += n6 * gf_._i;
        }
        if (f + v > gf_._e) {
            v -= f + v - gf_._e;
        }
        if (j < gf_._j) {
            final int n7 = gf_._j - j;
            y -= n7;
            j = gf_._j;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (j + y > gf_._h) {
            final int n8 = j + y - gf_._h;
            y -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        d983(gf_._b, super._B, 0, n3, n2, 0, 0, y, v, n4, n5, n);
    }
    
    private static final void e663(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = n8 >> 16 & 0xFF;
        final int n10 = n8 >> 8 & 0xFF;
        final int n11 = n8 & 0xFF;
        final int n12 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        final int n13 = n12 + n12 + n12 + n12 + n4;
        for (int i = -n5; i < 0; ++i) {
            for (int j = n13; j < 0; ++j) {
                n = array2[n2++];
                final int n14 = n >>> 24;
                if (n14 != 0) {
                    final int n15 = n >> 16 & 0xFF;
                    final int n16 = n >> 8 & 0xFF;
                    final int n17 = n & 0xFF;
                    int n18;
                    if (n15 == n16 && n16 == n17) {
                        if (n15 <= 128) {
                            n18 = (n15 * n9 >> 7 << 16) + (n16 * n10 >> 7 << 8) + (n17 * n11 >> 7);
                        }
                        else {
                            n18 = (n9 * (256 - n15) + 255 * (n15 - 128) >> 7 << 16) + (n10 * (256 - n16) + 255 * (n16 - 128) >> 7 << 8) + (n11 * (256 - n17) + 255 * (n17 - 128) >> 7);
                        }
                    }
                    else {
                        n18 = n;
                    }
                    final int n19 = 256 - n14;
                    final int n20 = array[n3];
                    array[n3++] = ((n18 & 0xFF00FF) * n14 + (n20 & 0xFF00FF) * n19 & 0xFF00FF00) + ((n18 & 0xFF00) * n14 + (n20 & 0xFF00) * n19 & 0xFF0000) >>> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    @Override
    final void a669(int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n6 == 0) {
            return;
        }
        n -= super._w << 4;
        n2 -= super._A << 4;
        final double n7 = (n5 & 0xFFFF) * 9.587379924285257E-5;
        final int n8 = (int)Math.floor(Math.sin(n7) * n6 + 0.5);
        final int n9 = (int)Math.floor(Math.cos(n7) * n6 + 0.5);
        final int n10 = -n * n9 + -n2 * n8;
        final int n11 = -(-n) * n8 + -n2 * n9;
        final int n12 = ((super.imageWidth << 4) - n) * n9 + -n2 * n8;
        final int n13 = -((super.imageWidth << 4) - n) * n8 + -n2 * n9;
        final int n14 = -n * n9 + ((super.imageHeight << 4) - n2) * n8;
        final int n15 = -(-n) * n8 + ((super.imageHeight << 4) - n2) * n9;
        final int n16 = ((super.imageWidth << 4) - n) * n9 + ((super.imageHeight << 4) - n2) * n8;
        final int n17 = -((super.imageWidth << 4) - n) * n8 + ((super.imageHeight << 4) - n2) * n9;
        int n18;
        int n19;
        if (n10 < n12) {
            n18 = n10;
            n19 = n12;
        }
        else {
            n18 = n12;
            n19 = n10;
        }
        if (n14 < n18) {
            n18 = n14;
        }
        if (n16 < n18) {
            n18 = n16;
        }
        if (n14 > n19) {
            n19 = n14;
        }
        if (n16 > n19) {
            n19 = n16;
        }
        int n20;
        int n21;
        if (n11 < n13) {
            n20 = n11;
            n21 = n13;
        }
        else {
            n20 = n13;
            n21 = n11;
        }
        if (n15 < n20) {
            n20 = n15;
        }
        if (n17 < n20) {
            n20 = n17;
        }
        if (n15 > n21) {
            n21 = n15;
        }
        if (n17 > n21) {
            n21 = n17;
        }
        final int n22 = n18 >> 12;
        final int n23 = n19 + 4095 >> 12;
        final int n24 = n20 >> 12;
        final int n25 = n21 + 4095 >> 12;
        final int n26 = n22 + n3;
        final int n27 = n23 + n3;
        final int n28 = n24 + n4;
        final int n29 = n25 + n4;
        int j = n26 >> 4;
        int h = n27 + 15 >> 4;
        int f = n28 >> 4;
        int e = n29 + 15 >> 4;
        if (j < gf_._j) {
            j = gf_._j;
        }
        if (h > gf_._h) {
            h = gf_._h;
        }
        if (f < gf_._f) {
            f = gf_._f;
        }
        if (e > gf_._e) {
            e = gf_._e;
        }
        final int n30 = j - h;
        if (n30 >= 0) {
            return;
        }
        final int n31 = f - e;
        if (n31 >= 0) {
            return;
        }
        int n32 = f * gf_._i + j;
        final double n33 = 1.6777216E7 / n6;
        final int n34 = (int)Math.floor(Math.sin(n7) * n33 + 0.5);
        final int n35 = (int)Math.floor(Math.cos(n7) * n33 + 0.5);
        final int n36 = (j << 4) + 8 - n3;
        final int n37 = (f << 4) + 8 - n4;
        int n38 = (n << 8) - (n37 * n34 >> 4);
        int n39 = (n2 << 8) + (n37 * n35 >> 4);
        if (n35 == 0) {
            if (n34 == 0) {
                for (int i = n31; i < 0; ++i, n32 += gf_._i) {
                    int n40 = n32;
                    final int n41 = n38;
                    final int n42 = n39;
                    int k = n30;
                    if (n41 >= 0) {
                        if (n42 >= 0) {
                            if (n41 - (super.imageWidth << 12) < 0) {
                                if (n42 - (super.imageHeight << 12) < 0) {
                                    while (k < 0) {
                                        final int n43 = super._B[(n42 >> 12) * super.imageWidth + (n41 >> 12)];
                                        final int n44 = gf_._b[n40];
                                        final int n45 = n43 >>> 24;
                                        final int n46 = 256 - n45;
                                        gf_._b[n40++] = ((n43 & 0xFF00FF) * n45 + (n44 & 0xFF00FF) * n46 & 0xFF00FF00) + ((n43 & 0xFF00) * n45 + (n44 & 0xFF00) * n46 & 0xFF0000) >>> 8;
                                        ++k;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int l = n31; l < 0; ++l, n38 -= n34, n32 += gf_._i) {
                    int n47 = n32;
                    final int n48 = n38;
                    int n49 = n39 + (n36 * n34 >> 4);
                    int n50 = n30;
                    if (n48 >= 0) {
                        if (n48 - (super.imageWidth << 12) < 0) {
                            final int n51;
                            if ((n51 = n49 - (super.imageHeight << 12)) >= 0) {
                                final int n52 = (n34 - n51) / n34;
                                n50 += n52;
                                n49 += n34 * n52;
                                n47 += n52;
                            }
                            final int n53;
                            if ((n53 = (n49 - n34) / n34) > n50) {
                                n50 = n53;
                            }
                            while (n50 < 0) {
                                final int n54 = super._B[(n49 >> 12) * super.imageWidth + (n48 >> 12)];
                                final int n55 = gf_._b[n47];
                                final int n56 = n54 >>> 24;
                                final int n57 = 256 - n56;
                                gf_._b[n47++] = ((n54 & 0xFF00FF) * n56 + (n55 & 0xFF00FF) * n57 & 0xFF00FF00) + ((n54 & 0xFF00) * n56 + (n55 & 0xFF00) * n57 & 0xFF0000) >>> 8;
                                n49 += n34;
                                ++n50;
                            }
                        }
                    }
                }
            }
            else {
                for (int n58 = n31; n58 < 0; ++n58, n38 -= n34, n32 += gf_._i) {
                    int n59 = n32;
                    final int n60 = n38;
                    int n61 = n39 + (n36 * n34 >> 4);
                    int n62 = n30;
                    if (n60 >= 0) {
                        if (n60 - (super.imageWidth << 12) < 0) {
                            if (n61 < 0) {
                                final int n63 = (n34 - 1 - n61) / n34;
                                n62 += n63;
                                n61 += n34 * n63;
                                n59 += n63;
                            }
                            final int n64;
                            if ((n64 = (1 + n61 - (super.imageHeight << 12) - n34) / n34) > n62) {
                                n62 = n64;
                            }
                            while (n62 < 0) {
                                final int n65 = super._B[(n61 >> 12) * super.imageWidth + (n60 >> 12)];
                                final int n66 = gf_._b[n59];
                                final int n67 = n65 >>> 24;
                                final int n68 = 256 - n67;
                                gf_._b[n59++] = ((n65 & 0xFF00FF) * n67 + (n66 & 0xFF00FF) * n68 & 0xFF00FF00) + ((n65 & 0xFF00) * n67 + (n66 & 0xFF00) * n68 & 0xFF0000) >>> 8;
                                n61 += n34;
                                ++n62;
                            }
                        }
                    }
                }
            }
        }
        else if (n35 < 0) {
            if (n34 == 0) {
                for (int n69 = n31; n69 < 0; ++n69, n39 += n35, n32 += gf_._i) {
                    int n70 = n32;
                    int n71 = n38 + (n36 * n35 >> 4);
                    final int n72 = n39;
                    int n73 = n30;
                    if (n72 >= 0) {
                        if (n72 - (super.imageHeight << 12) < 0) {
                            final int n74;
                            if ((n74 = n71 - (super.imageWidth << 12)) >= 0) {
                                final int n75 = (n35 - n74) / n35;
                                n73 += n75;
                                n71 += n35 * n75;
                                n70 += n75;
                            }
                            final int n76;
                            if ((n76 = (n71 - n35) / n35) > n73) {
                                n73 = n76;
                            }
                            while (n73 < 0) {
                                final int n77 = super._B[(n72 >> 12) * super.imageWidth + (n71 >> 12)];
                                final int n78 = gf_._b[n70];
                                final int n79 = n77 >>> 24;
                                final int n80 = 256 - n79;
                                gf_._b[n70++] = ((n77 & 0xFF00FF) * n79 + (n78 & 0xFF00FF) * n80 & 0xFF00FF00) + ((n77 & 0xFF00) * n79 + (n78 & 0xFF00) * n80 & 0xFF0000) >>> 8;
                                n71 += n35;
                                ++n73;
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int n81 = n31; n81 < 0; ++n81, n38 -= n34, n39 += n35, n32 += gf_._i) {
                    int n82 = n32;
                    int n83 = n38 + (n36 * n35 >> 4);
                    int n84 = n39 + (n36 * n34 >> 4);
                    int n85 = n30;
                    final int n86;
                    if ((n86 = n83 - (super.imageWidth << 12)) >= 0) {
                        final int n87 = (n35 - n86) / n35;
                        n85 += n87;
                        n83 += n35 * n87;
                        n84 += n34 * n87;
                        n82 += n87;
                    }
                    final int n88;
                    if ((n88 = (n83 - n35) / n35) > n85) {
                        n85 = n88;
                    }
                    final int n89;
                    if ((n89 = n84 - (super.imageHeight << 12)) >= 0) {
                        final int n90 = (n34 - n89) / n34;
                        n85 += n90;
                        n83 += n35 * n90;
                        n84 += n34 * n90;
                        n82 += n90;
                    }
                    final int n91;
                    if ((n91 = (n84 - n34) / n34) > n85) {
                        n85 = n91;
                    }
                    while (n85 < 0) {
                        final int n92 = super._B[(n84 >> 12) * super.imageWidth + (n83 >> 12)];
                        final int n93 = gf_._b[n82];
                        final int n94 = n92 >>> 24;
                        final int n95 = 256 - n94;
                        gf_._b[n82++] = ((n92 & 0xFF00FF) * n94 + (n93 & 0xFF00FF) * n95 & 0xFF00FF00) + ((n92 & 0xFF00) * n94 + (n93 & 0xFF00) * n95 & 0xFF0000) >>> 8;
                        n83 += n35;
                        n84 += n34;
                        ++n85;
                    }
                }
            }
            else {
                for (int n96 = n31; n96 < 0; ++n96, n38 -= n34, n39 += n35, n32 += gf_._i) {
                    int n97 = n32;
                    int n98 = n38 + (n36 * n35 >> 4);
                    int n99 = n39 + (n36 * n34 >> 4);
                    int n100 = n30;
                    final int n101;
                    if ((n101 = n98 - (super.imageWidth << 12)) >= 0) {
                        final int n102 = (n35 - n101) / n35;
                        n100 += n102;
                        n98 += n35 * n102;
                        n99 += n34 * n102;
                        n97 += n102;
                    }
                    final int n103;
                    if ((n103 = (n98 - n35) / n35) > n100) {
                        n100 = n103;
                    }
                    if (n99 < 0) {
                        final int n104 = (n34 - 1 - n99) / n34;
                        n100 += n104;
                        n98 += n35 * n104;
                        n99 += n34 * n104;
                        n97 += n104;
                    }
                    final int n105;
                    if ((n105 = (1 + n99 - (super.imageHeight << 12) - n34) / n34) > n100) {
                        n100 = n105;
                    }
                    while (n100 < 0) {
                        final int n106 = super._B[(n99 >> 12) * super.imageWidth + (n98 >> 12)];
                        final int n107 = gf_._b[n97];
                        final int n108 = n106 >>> 24;
                        final int n109 = 256 - n108;
                        gf_._b[n97++] = ((n106 & 0xFF00FF) * n108 + (n107 & 0xFF00FF) * n109 & 0xFF00FF00) + ((n106 & 0xFF00) * n108 + (n107 & 0xFF00) * n109 & 0xFF0000) >>> 8;
                        n98 += n35;
                        n99 += n34;
                        ++n100;
                    }
                }
            }
        }
        else if (n34 == 0) {
            for (int n110 = n31; n110 < 0; ++n110, n39 += n35, n32 += gf_._i) {
                int n111 = n32;
                int n112 = n38 + (n36 * n35 >> 4);
                final int n113 = n39;
                int n114 = n30;
                if (n113 >= 0) {
                    if (n113 - (super.imageHeight << 12) < 0) {
                        if (n112 < 0) {
                            final int n115 = (n35 - 1 - n112) / n35;
                            n114 += n115;
                            n112 += n35 * n115;
                            n111 += n115;
                        }
                        final int n116;
                        if ((n116 = (1 + n112 - (super.imageWidth << 12) - n35) / n35) > n114) {
                            n114 = n116;
                        }
                        while (n114 < 0) {
                            final int n117 = super._B[(n113 >> 12) * super.imageWidth + (n112 >> 12)];
                            final int n118 = gf_._b[n111];
                            final int n119 = n117 >>> 24;
                            final int n120 = 256 - n119;
                            gf_._b[n111++] = ((n117 & 0xFF00FF) * n119 + (n118 & 0xFF00FF) * n120 & 0xFF00FF00) + ((n117 & 0xFF00) * n119 + (n118 & 0xFF00) * n120 & 0xFF0000) >>> 8;
                            n112 += n35;
                            ++n114;
                        }
                    }
                }
            }
        }
        else if (n34 < 0) {
            for (int n121 = n31; n121 < 0; ++n121, n38 -= n34, n39 += n35, n32 += gf_._i) {
                int n122 = n32;
                int n123 = n38 + (n36 * n35 >> 4);
                int n124 = n39 + (n36 * n34 >> 4);
                int n125 = n30;
                if (n123 < 0) {
                    final int n126 = (n35 - 1 - n123) / n35;
                    n125 += n126;
                    n123 += n35 * n126;
                    n124 += n34 * n126;
                    n122 += n126;
                }
                final int n127;
                if ((n127 = (1 + n123 - (super.imageWidth << 12) - n35) / n35) > n125) {
                    n125 = n127;
                }
                final int n128;
                if ((n128 = n124 - (super.imageHeight << 12)) >= 0) {
                    final int n129 = (n34 - n128) / n34;
                    n125 += n129;
                    n123 += n35 * n129;
                    n124 += n34 * n129;
                    n122 += n129;
                }
                final int n130;
                if ((n130 = (n124 - n34) / n34) > n125) {
                    n125 = n130;
                }
                while (n125 < 0) {
                    final int n131 = super._B[(n124 >> 12) * super.imageWidth + (n123 >> 12)];
                    final int n132 = gf_._b[n122];
                    final int n133 = n131 >>> 24;
                    final int n134 = 256 - n133;
                    gf_._b[n122++] = ((n131 & 0xFF00FF) * n133 + (n132 & 0xFF00FF) * n134 & 0xFF00FF00) + ((n131 & 0xFF00) * n133 + (n132 & 0xFF00) * n134 & 0xFF0000) >>> 8;
                    n123 += n35;
                    n124 += n34;
                    ++n125;
                }
            }
        }
        else {
            for (int n135 = n31; n135 < 0; ++n135, n38 -= n34, n39 += n35, n32 += gf_._i) {
                int n136 = n32;
                int n137 = n38 + (n36 * n35 >> 4);
                int n138 = n39 + (n36 * n34 >> 4);
                int n139 = n30;
                if (n137 < 0) {
                    final int n140 = (n35 - 1 - n137) / n35;
                    n139 += n140;
                    n137 += n35 * n140;
                    n138 += n34 * n140;
                    n136 += n140;
                }
                final int n141;
                if ((n141 = (1 + n137 - (super.imageWidth << 12) - n35) / n35) > n139) {
                    n139 = n141;
                }
                if (n138 < 0) {
                    final int n142 = (n34 - 1 - n138) / n34;
                    n139 += n142;
                    n137 += n35 * n142;
                    n138 += n34 * n142;
                    n136 += n142;
                }
                final int n143;
                if ((n143 = (1 + n138 - (super.imageHeight << 12) - n34) / n34) > n139) {
                    n139 = n143;
                }
                while (n139 < 0) {
                    final int n144 = super._B[(n138 >> 12) * super.imageWidth + (n137 >> 12)];
                    final int n145 = gf_._b[n136];
                    final int n146 = n144 >>> 24;
                    final int n147 = 256 - n146;
                    gf_._b[n136++] = ((n144 & 0xFF00FF) * n146 + (n145 & 0xFF00FF) * n147 & 0xFF00FF00) + ((n144 & 0xFF00) * n146 + (n145 & 0xFF00) * n147 & 0xFF0000) >>> 8;
                    n137 += n35;
                    n138 += n34;
                    ++n139;
                }
            }
        }
    }
    
    private static final void d983(final int[] array, final int[] array2, int n, int n2, int n3, int i, int j, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = n8 & 0xFF00FF;
        final int n10 = n8 >> 8 & 0xFF;
        int n11;
        int n12;
        int n13;
        int n14;
        for (j = -n5; j < 0; ++j) {
            for (i = -n4; i < 0; ++i) {
                n = array2[n2++];
                n11 = n >>> 24;
                n &= 0xFFFFFF;
                if (n11 != 0) {
                    if (n >> 8 == (n & 0xFFFF)) {
                        n &= 0xFF;
                        n12 = (n * n9 >> 8 & 0xFF00FE) + (n * n10 & 0xFF00) + 1;
                    }
                    else {
                        n12 = n;
                    }
                    n13 = 256 - n11;
                    n14 = array[n3];
                    array[n3++] = ((n12 & 0xFF00FF) * n11 + (n14 & 0xFF00FF) * n13 & 0xFF00FF00) + ((n12 & 0xFF00) * n11 + (n14 & 0xFF00) * n13 & 0xFF0000) >>> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    @Override
    final void e093(int n, int n2) {
        final int n3 = super.imageWidth >> 2;
        final int n4 = super.imageHeight >> 2;
        n += super._w / 4;
        n2 += super._A / 4;
        final int n5 = (n < gf_._j) ? (gf_._j - n << 2) : 0;
        final int n6 = (n + n3 > gf_._h) ? ((gf_._h - n << 2) - 4) : (super.imageWidth - 4);
        final int n7 = (n2 < gf_._f) ? (gf_._f - n2 << 2) : 0;
        final int n8 = (n2 + n4 > gf_._e) ? ((gf_._e - n2 << 2) - 4) : (super.imageHeight - 4);
        final int[] array = new int[16];
        for (int i = n7; i <= n8; i += 4) {
            for (int j = n5; j <= n6; j += 4) {
                final int n9 = i * super.imageWidth + j;
                final int n10 = (n2 + (i >> 2)) * gf_._i + (n + (j >> 2));
                for (int k = 0; k < 4; ++k) {
                    for (int l = 0; l < 4; ++l) {
                        array[(k << 2) + l] = super._B[n9 + k * super.imageWidth + l];
                    }
                }
                int n11 = 0;
                int n12 = 0;
                int n13 = 0;
                int n14 = 0;
                for (int n15 = 0; n15 < 16; ++n15) {
                    final int n16 = array[n15] >>> 24;
                    n11 += n16;
                    n12 += n16 * (array[n15] >> 16 & 0xFF);
                    n13 += n16 * (array[n15] >> 8 & 0xFF);
                    n14 += n16 * (array[n15] & 0xFF);
                }
                if (n11 != 0) {
                    final int n17 = (n12 / n11 << 16) + n14 / n11;
                    final int n18 = n13 / n11 << 8;
                    final int n19 = n11 >> 4;
                    final int n20 = 256 - n19;
                    final int n21 = gf_._b[n10];
                    gf_._b[n10] = (n19 * n17 + n20 * (n21 & 0xFF00FF) & 0xFF00FF00) + (n19 * n18 + n20 * (n21 & 0xFF00) & 0xFF0000) >>> 8;
                }
            }
        }
    }
    
    private static final void b590(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        final int n11 = n;
        for (int i = -n6; i < 0; ++i) {
            final int n12 = (n2 >> 16) * n9;
            for (int j = -n5; j < 0; ++j) {
                final int n13 = array2[(n >> 16) + n12];
                final int n14 = array[n3];
                final int n15 = (n13 >>> 24) * n10 >> 8;
                final int n16 = 256 - n15;
                array[n3++] = ((n13 & 0xFF00FF) * n15 + (n14 & 0xFF00FF) * n16 & 0xFF00FF00) + ((n13 & 0xFF00) * n15 + (n14 & 0xFF00) * n16 & 0xFF0000) >>> 8;
                n += n7;
            }
            n2 += n8;
            n = n11;
            n3 += n4;
        }
    }
    
    @Override
    final void d115(int i, int j, final int n, final int n2) {
        if (super.imageHeight == 0) {
            return;
        }
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n3 = n << 8;
        final int n4 = (n2 - n << 8) / v;
        int n5 = 0;
        if (i < gf_._j) {
            y -= gf_._j - i;
            n5 += gf_._j - i;
            i = gf_._j;
        }
        if (j < gf_._f) {
            n3 += (gf_._f - j) * n4;
            v -= gf_._f - j;
            n5 += (gf_._f - j) * gf_._i;
            j = gf_._f;
        }
        if (i + y > gf_._h) {
            y = gf_._h - i;
        }
        if (j + v > gf_._e) {
            v = gf_._e - j;
        }
        final int n6 = gf_._i - y;
        final int n7 = super.imageWidth - y;
        int n8 = i + j * gf_._i;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        for (j = -v; j < 0; ++j) {
            n9 = n3 >> 8;
            if (n9 >= 0) {
                for (i = -y; i < 0; ++i) {
                    n10 = (super._B[n5] >>> 24) * n9 >> 8;
                    n11 = 256 - n10;
                    n12 = super._B[n5++];
                    n13 = gf_._b[n8];
                    gf_._b[n8++] = ((n12 & 0xFF00FF) * n10 + (n13 & 0xFF00FF) * n11 & 0xFF00FF00) + ((n12 & 0xFF00) * n10 + (n13 & 0xFF00) * n11 & 0xFF0000) >>> 8;
                }
                n8 += n6;
                n5 += n7;
                n3 += n4;
            }
        }
    }
    
    @Override
    final void f326(int j, int f, final int n) {
        if (n == 256) {
            this.drawImage(j, f);
            return;
        }
        j += super._w;
        f += super._A;
        int n2 = j + f * gf_._i;
        int n3 = 0;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n4 = gf_._i - y;
        int n5 = 0;
        if (f < gf_._f) {
            final int n6 = gf_._f - f;
            v -= n6;
            f = gf_._f;
            n3 += n6 * y;
            n2 += n6 * gf_._i;
        }
        if (f + v > gf_._e) {
            v -= f + v - gf_._e;
        }
        if (j < gf_._j) {
            final int n7 = gf_._j - j;
            y -= n7;
            j = gf_._j;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (j + y > gf_._h) {
            final int n8 = j + y - gf_._h;
            y -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        d663(gf_._b, super._B, 0, n3, n2, y, v, n4, n5, n);
    }
    
    @Override
    final void d326(int j, int f, final int n) {
        j += super._w;
        f += super._A;
        int n2 = j + f * gf_._i;
        int n3 = 0;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n4 = gf_._i - y;
        int n5 = 0;
        if (f < gf_._f) {
            final int n6 = gf_._f - f;
            v -= n6;
            f = gf_._f;
            n3 += n6 * y;
            n2 += n6 * gf_._i;
        }
        if (f + v > gf_._e) {
            v -= f + v - gf_._e;
        }
        if (j < gf_._j) {
            final int n7 = gf_._j - j;
            y -= n7;
            j = gf_._j;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (j + y > gf_._h) {
            final int n8 = j + y - gf_._h;
            y -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        f663(gf_._b, super._B, n3, n2, y, v, n4, n5, n);
    }
    
    private static final void d663(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                final int n9 = n >>> 24;
                if (n9 != 0) {
                    final int n10 = array[n3];
                    final int n11 = 256 - n9;
                    n = (((n & 0xFF00FF) * n8 & 0xFF00FF00) | ((n & 0xFF00) * n8 & 0xFF0000)) >>> 8;
                    array[n3++] = ((n & 0xFF00FF) * n9 + (n10 & 0xFF00FF) * n11 & 0xFF00FF00) + ((n & 0xFF00) * n9 + (n10 & 0xFF00) * n11 & 0xFF0000) >>> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    private static final void f663(final int[] array, final int[] array2, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        for (int i = -n4; i < 0; ++i) {
            for (int j = -n3; j < 0; ++j) {
                final int n8 = (array2[n] >>> 24) * n7 >> 8;
                final int n9 = 256 - n8;
                final int n10 = array2[n++];
                final int n11 = array[n2];
                array[n2++] = ((n10 & 0xFF00FF) * n8 + (n11 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n10 & 0xFF00) * n8 + (n11 & 0xFF00) * n9 & 0xFF0000) >>> 8;
            }
            n2 += n5;
            n += n6;
        }
    }
    
    @Override
    final void c115(int n, int n2, int n3, int n4) {
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        final int y = super.imageWidth;
        final int v = super.imageHeight;
        int n5 = 0;
        int n6 = 0;
        final int e = super.imageWidth2;
        final int g = super.imageHeight2;
        final int n7 = (e << 16) / n3;
        final int n8 = (g << 16) / n4;
        if (super._w > 0) {
            final int n9 = ((super._w << 16) + n7 - 1) / n7;
            n += n9;
            n5 += n9 * n7 - (super._w << 16);
        }
        if (super._A > 0) {
            final int n10 = ((super._A << 16) + n8 - 1) / n8;
            n2 += n10;
            n6 += n10 * n8 - (super._A << 16);
        }
        if (y < e) {
            n3 = ((y << 16) - n5 + n7 - 1) / n7;
        }
        if (v < g) {
            n4 = ((v << 16) - n6 + n8 - 1) / n8;
        }
        int n11 = n + n2 * gf_._i;
        int n12 = gf_._i - n3;
        if (n2 + n4 > gf_._e) {
            n4 -= n2 + n4 - gf_._e;
        }
        if (n2 < gf_._f) {
            final int n13 = gf_._f - n2;
            n4 -= n13;
            n11 += n13 * gf_._i;
            n6 += n8 * n13;
        }
        if (n + n3 > gf_._h) {
            final int n14 = n + n3 - gf_._h;
            n3 -= n14;
            n12 += n14;
        }
        if (n < gf_._j) {
            final int n15 = gf_._j - n;
            n3 -= n15;
            n11 += n15;
            n5 += n7 * n15;
            n12 += n15;
        }
        e983(gf_._b, super._B, 0, n5, n6, n11, n12, n3, n4, n7, n8, y);
    }
    
    @Override
    final void drawImage(int j, int f) {
        j += super._w;
        f += super._A;
        int n = j + f * gf_._i;
        int n2 = 0;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n3 = gf_._i - y;
        int n4 = 0;
        if (f < gf_._f) {
            final int n5 = gf_._f - f;
            v -= n5;
            f = gf_._f;
            n2 += n5 * y;
            n += n5 * gf_._i;
        }
        if (f + v > gf_._e) {
            v -= f + v - gf_._e;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            y -= n6;
            j = gf_._j;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (j + y > gf_._h) {
            final int n7 = j + y - gf_._h;
            y -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        e650(gf_._b, super._B, 0, n2, n, y, v, n3, n4);
    }
    
    private static final void b057(int n, int n2, int n3, final int[] array, final int[] array2, int n4, int i, int n5, int j, final int n6, final int n7, final int n8, final int n9, final int n10) {
        int n11;
        for (j = -n7; j < 0; ++j) {
            for (i = -n6; i < 0; ++i) {
                n = array2[n4++];
                if (n != 0) {
                    n11 = (n10 * (n >>> 24) >> 8 & 0xFF);
                    n2 = (n & 0xFF00FF) * n11;
                    n = (n2 & 0xFF00FF00) + (n * n11 - n2 & 0xFF0000) >>> 8;
                    n2 = array[n5];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array[n5++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n5;
                }
            }
            n5 += n8;
            n4 += n9;
        }
    }
    
    @Override
    final void c093(int j, int f) {
        j += super._w;
        f += super._A;
        int n = j + f * gf_._i;
        int n2 = 0;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n3 = gf_._i - y;
        int n4 = 0;
        if (f < gf_._f) {
            final int n5 = gf_._f - f;
            v -= n5;
            f = gf_._f;
            n2 += n5 * y;
            n += n5 * gf_._i;
        }
        if (f + v > gf_._e) {
            v -= f + v - gf_._e;
        }
        if (j < gf_._j) {
            final int n6 = gf_._j - j;
            y -= n6;
            j = gf_._j;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (j + y > gf_._h) {
            final int n7 = j + y - gf_._h;
            y -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        e650(gf_._b, super._B, 0, n2, n, y, v, n3, n4);
    }
    
    private static final void e983(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        final int n11 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n12 = (n3 >> 16) * n10;
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n12];
                final int n13 = n >>> 24;
                if (n13 != 0) {
                    final int n14 = 256 - n13;
                    final int n15 = array[n4];
                    array[n4++] = ((n & 0xFF00FF) * n13 + (n15 & 0xFF00FF) * n14 & 0xFF00FF00) + ((n & 0xFF00) * n13 + (n15 & 0xFF00) * n14 & 0xFF0000) >>> 8;
                }
                else {
                    ++n4;
                }
                n2 += n8;
            }
            n3 += n9;
            n2 = n11;
            n4 += n5;
        }
    }
    
    @Override
    final void a326(int j, int f, final int n) {
        j += super._w;
        f += super._A;
        int n2 = j + f * gf_._i;
        int n3 = 0;
        int v = super.imageHeight;
        int y = super.imageWidth;
        int n4 = gf_._i - y;
        int n5 = 0;
        if (f < gf_._f) {
            final int n6 = gf_._f - f;
            v -= n6;
            f = gf_._f;
            n3 += n6 * y;
            n2 += n6 * gf_._i;
        }
        if (f + v > gf_._e) {
            v -= f + v - gf_._e;
        }
        if (j < gf_._j) {
            final int n7 = gf_._j - j;
            y -= n7;
            j = gf_._j;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (j + y > gf_._h) {
            final int n8 = j + y - gf_._h;
            y -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (y <= 0 || v <= 0) {
            return;
        }
        e663(gf_._b, super._B, 0, n3, n2, y, v, n4, n5, n);
    }
    
    @Override
    final void d050(int n, int n2, int n3, int n4, final int n5) {
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        final int y = super.imageWidth;
        final int v = super.imageHeight;
        int n6 = 0;
        int n7 = 0;
        final int e = super.imageWidth2;
        final int g = super.imageHeight2;
        final int n8 = (e << 16) / n3;
        final int n9 = (g << 16) / n4;
        if (super._w > 0) {
            final int n10 = ((super._w << 16) + n8 - 1) / n8;
            n += n10;
            n6 += n10 * n8 - (super._w << 16);
        }
        if (super._A > 0) {
            final int n11 = ((super._A << 16) + n9 - 1) / n9;
            n2 += n11;
            n7 += n11 * n9 - (super._A << 16);
        }
        if (y < e) {
            n3 = ((y << 16) - n6 + n8 - 1) / n8;
        }
        if (v < g) {
            n4 = ((v << 16) - n7 + n9 - 1) / n9;
        }
        int n12 = n + n2 * gf_._i;
        int n13 = gf_._i - n3;
        if (n2 + n4 > gf_._e) {
            n4 -= n2 + n4 - gf_._e;
        }
        if (n2 < gf_._f) {
            final int n14 = gf_._f - n2;
            n4 -= n14;
            n12 += n14 * gf_._i;
            n7 += n9 * n14;
        }
        if (n + n3 > gf_._h) {
            final int n15 = n + n3 - gf_._h;
            n3 -= n15;
            n13 += n15;
        }
        if (n < gf_._j) {
            final int n16 = gf_._j - n;
            n3 -= n16;
            n12 += n16;
            n6 += n8 * n16;
            n13 += n16;
        }
        b590(gf_._b, super._B, n6, n7, n12, n13, n3, n4, n8, n9, y, n5);
    }
    
    private static final void d650(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n8 = -n4;
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                n = array2[n2--];
                final int n9 = n >>> 24;
                if (n9 != 0) {
                    final int n10 = 256 - n9;
                    final int n11 = array[n3];
                    array[n3++] = ((n & 0xFF00FF) * n9 + (n11 & 0xFF00FF) * n10 & 0xFF00FF00) + ((n & 0xFF00) * n9 + (n11 & 0xFF00) * n10 & 0xFF0000) >>> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    ei_(final int n, final int n2) {
        super(n, n2);
    }
}
