import java.awt.image.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.*;

//original name: cn_
class Graphic extends rd_
{
    int[] _B;
    static int i = 0;
    
    final void g797() {
        final int[] b = new int[super.imageWidth * super.imageHeight];
        int n = 0;
        for (int i = 0; i < super.imageWidth; ++i) {
            for (int j = super.imageHeight - 1; j >= 0; --j) {
                b[n++] = this._B[i + j * super.imageWidth];
            }
        }
        this._B = b;
        final int a = super._A;
        super._A = super._w;
        super._w = super.imageHeight2 - super.imageHeight - a;
        final int v = super.imageHeight;
        super.imageHeight = super.imageWidth;
        super.imageWidth = v;
        final int g = super.imageHeight2;
        super.imageHeight2 = super.imageWidth2;
        super.imageWidth2 = g;
    }
    
    void a669(int n, int n2, final int n3, final int n4, final int n5, final int n6) {
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
                                        final int n43 = this._B[(n42 >> 12) * super.imageWidth + (n41 >> 12)];
                                        if (n43 != 0) {
                                            gf_._b[n40++] = n43;
                                        }
                                        else {
                                            ++n40;
                                        }
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
                    int n44 = n32;
                    final int n45 = n38;
                    int n46 = n39 + (n36 * n34 >> 4);
                    int n47 = n30;
                    if (n45 >= 0) {
                        if (n45 - (super.imageWidth << 12) < 0) {
                            final int n48;
                            if ((n48 = n46 - (super.imageHeight << 12)) >= 0) {
                                final int n49 = (n34 - n48) / n34;
                                n47 += n49;
                                n46 += n34 * n49;
                                n44 += n49;
                            }
                            final int n50;
                            if ((n50 = (n46 - n34) / n34) > n47) {
                                n47 = n50;
                            }
                            while (n47 < 0) {
                                final int n51 = this._B[(n46 >> 12) * super.imageWidth + (n45 >> 12)];
                                if (n51 != 0) {
                                    gf_._b[n44++] = n51;
                                }
                                else {
                                    ++n44;
                                }
                                n46 += n34;
                                ++n47;
                            }
                        }
                    }
                }
            }
            else {
                for (int n52 = n31; n52 < 0; ++n52, n38 -= n34, n32 += gf_._i) {
                    int n53 = n32;
                    final int n54 = n38;
                    int n55 = n39 + (n36 * n34 >> 4);
                    int n56 = n30;
                    if (n54 >= 0) {
                        if (n54 - (super.imageWidth << 12) < 0) {
                            if (n55 < 0) {
                                final int n57 = (n34 - 1 - n55) / n34;
                                n56 += n57;
                                n55 += n34 * n57;
                                n53 += n57;
                            }
                            final int n58;
                            if ((n58 = (1 + n55 - (super.imageHeight << 12) - n34) / n34) > n56) {
                                n56 = n58;
                            }
                            while (n56 < 0) {
                                final int n59 = this._B[(n55 >> 12) * super.imageWidth + (n54 >> 12)];
                                if (n59 != 0) {
                                    gf_._b[n53++] = n59;
                                }
                                else {
                                    ++n53;
                                }
                                n55 += n34;
                                ++n56;
                            }
                        }
                    }
                }
            }
        }
        else if (n35 < 0) {
            if (n34 == 0) {
                for (int n60 = n31; n60 < 0; ++n60, n39 += n35, n32 += gf_._i) {
                    int n61 = n32;
                    int n62 = n38 + (n36 * n35 >> 4);
                    final int n63 = n39;
                    int n64 = n30;
                    if (n63 >= 0) {
                        if (n63 - (super.imageHeight << 12) < 0) {
                            final int n65;
                            if ((n65 = n62 - (super.imageWidth << 12)) >= 0) {
                                final int n66 = (n35 - n65) / n35;
                                n64 += n66;
                                n62 += n35 * n66;
                                n61 += n66;
                            }
                            final int n67;
                            if ((n67 = (n62 - n35) / n35) > n64) {
                                n64 = n67;
                            }
                            while (n64 < 0) {
                                final int n68 = this._B[(n63 >> 12) * super.imageWidth + (n62 >> 12)];
                                if (n68 != 0) {
                                    gf_._b[n61++] = n68;
                                }
                                else {
                                    ++n61;
                                }
                                n62 += n35;
                                ++n64;
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int n69 = n31; n69 < 0; ++n69, n38 -= n34, n39 += n35, n32 += gf_._i) {
                    int n70 = n32;
                    int n71 = n38 + (n36 * n35 >> 4);
                    int n72 = n39 + (n36 * n34 >> 4);
                    int n73 = n30;
                    final int n74;
                    if ((n74 = n71 - (super.imageWidth << 12)) >= 0) {
                        final int n75 = (n35 - n74) / n35;
                        n73 += n75;
                        n71 += n35 * n75;
                        n72 += n34 * n75;
                        n70 += n75;
                    }
                    final int n76;
                    if ((n76 = (n71 - n35) / n35) > n73) {
                        n73 = n76;
                    }
                    final int n77;
                    if ((n77 = n72 - (super.imageHeight << 12)) >= 0) {
                        final int n78 = (n34 - n77) / n34;
                        n73 += n78;
                        n71 += n35 * n78;
                        n72 += n34 * n78;
                        n70 += n78;
                    }
                    final int n79;
                    if ((n79 = (n72 - n34) / n34) > n73) {
                        n73 = n79;
                    }
                    while (n73 < 0) {
                        final int n80 = this._B[(n72 >> 12) * super.imageWidth + (n71 >> 12)];
                        if (n80 != 0) {
                            gf_._b[n70++] = n80;
                        }
                        else {
                            ++n70;
                        }
                        n71 += n35;
                        n72 += n34;
                        ++n73;
                    }
                }
            }
            else {
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
                    if (n84 < 0) {
                        final int n89 = (n34 - 1 - n84) / n34;
                        n85 += n89;
                        n83 += n35 * n89;
                        n84 += n34 * n89;
                        n82 += n89;
                    }
                    final int n90;
                    if ((n90 = (1 + n84 - (super.imageHeight << 12) - n34) / n34) > n85) {
                        n85 = n90;
                    }
                    while (n85 < 0) {
                        final int n91 = this._B[(n84 >> 12) * super.imageWidth + (n83 >> 12)];
                        if (n91 != 0) {
                            gf_._b[n82++] = n91;
                        }
                        else {
                            ++n82;
                        }
                        n83 += n35;
                        n84 += n34;
                        ++n85;
                    }
                }
            }
        }
        else if (n34 == 0) {
            for (int n92 = n31; n92 < 0; ++n92, n39 += n35, n32 += gf_._i) {
                int n93 = n32;
                int n94 = n38 + (n36 * n35 >> 4);
                final int n95 = n39;
                int n96 = n30;
                if (n95 >= 0) {
                    if (n95 - (super.imageHeight << 12) < 0) {
                        if (n94 < 0) {
                            final int n97 = (n35 - 1 - n94) / n35;
                            n96 += n97;
                            n94 += n35 * n97;
                            n93 += n97;
                        }
                        final int n98;
                        if ((n98 = (1 + n94 - (super.imageWidth << 12) - n35) / n35) > n96) {
                            n96 = n98;
                        }
                        while (n96 < 0) {
                            final int n99 = this._B[(n95 >> 12) * super.imageWidth + (n94 >> 12)];
                            if (n99 != 0) {
                                gf_._b[n93++] = n99;
                            }
                            else {
                                ++n93;
                            }
                            n94 += n35;
                            ++n96;
                        }
                    }
                }
            }
        }
        else if (n34 < 0) {
            for (int n100 = n31; n100 < 0; ++n100, n38 -= n34, n39 += n35, n32 += gf_._i) {
                int n101 = n32;
                int n102 = n38 + (n36 * n35 >> 4);
                int n103 = n39 + (n36 * n34 >> 4);
                int n104 = n30;
                if (n102 < 0) {
                    final int n105 = (n35 - 1 - n102) / n35;
                    n104 += n105;
                    n102 += n35 * n105;
                    n103 += n34 * n105;
                    n101 += n105;
                }
                final int n106;
                if ((n106 = (1 + n102 - (super.imageWidth << 12) - n35) / n35) > n104) {
                    n104 = n106;
                }
                final int n107;
                if ((n107 = n103 - (super.imageHeight << 12)) >= 0) {
                    final int n108 = (n34 - n107) / n34;
                    n104 += n108;
                    n102 += n35 * n108;
                    n103 += n34 * n108;
                    n101 += n108;
                }
                final int n109;
                if ((n109 = (n103 - n34) / n34) > n104) {
                    n104 = n109;
                }
                while (n104 < 0) {
                    final int n110 = this._B[(n103 >> 12) * super.imageWidth + (n102 >> 12)];
                    if (n110 != 0) {
                        gf_._b[n101++] = n110;
                    }
                    else {
                        ++n101;
                    }
                    n102 += n35;
                    n103 += n34;
                    ++n104;
                }
            }
        }
        else {
            for (int n111 = n31; n111 < 0; ++n111, n38 -= n34, n39 += n35, n32 += gf_._i) {
                int n112 = n32;
                int n113 = n38 + (n36 * n35 >> 4);
                int n114 = n39 + (n36 * n34 >> 4);
                int n115 = n30;
                if (n113 < 0) {
                    final int n116 = (n35 - 1 - n113) / n35;
                    n115 += n116;
                    n113 += n35 * n116;
                    n114 += n34 * n116;
                    n112 += n116;
                }
                final int n117;
                if ((n117 = (1 + n113 - (super.imageWidth << 12) - n35) / n35) > n115) {
                    n115 = n117;
                }
                if (n114 < 0) {
                    final int n118 = (n34 - 1 - n114) / n34;
                    n115 += n118;
                    n113 += n35 * n118;
                    n114 += n34 * n118;
                    n112 += n118;
                }
                final int n119;
                if ((n119 = (1 + n114 - (super.imageHeight << 12) - n34) / n34) > n115) {
                    n115 = n119;
                }
                while (n115 < 0) {
                    final int n120 = this._B[(n114 >> 12) * super.imageWidth + (n113 >> 12)];
                    if (n120 != 0) {
                        gf_._b[n112++] = n120;
                    }
                    else {
                        ++n112;
                    }
                    n113 += n35;
                    n114 += n34;
                    ++n115;
                }
            }
        }
    }
    
    private static final void c983(final int[] array, final int[] array2, int n, int n2, int n3, int i, int j, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = n8 & 0xFF00FF;
        final int n10 = n8 >> 8 & 0xFF;
        for (j = -n5; j < 0; ++j) {
            for (i = -n4; i < 0; ++i) {
                n = array2[n2++];
                if (n != 0) {
                    if (n >> 8 == (n & 0xFFFF)) {
                        n &= 0xFF;
                        array[n3++] = (n * n9 >> 8 & 0xFF00FE) + (n * n10 & 0xFF00) + 1;
                    }
                    else {
                        array[n3++] = n;
                    }
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    private static final void b650(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    final Graphic d125() {
        final Graphic cn_ = new Graphic(super.imageWidth, super.imageHeight);
        cn_.imageWidth2 = super.imageWidth2;
        cn_.imageHeight2 = super.imageHeight2;
        cn_._w = super._w;
        cn_._A = super._A;
        for (int length = this._B.length, i = 0; i < length; ++i) {
            cn_._B[i] = this._B[i];
        }
        return cn_;
    }
    
    final void f797() {
        final int[] b = new int[super.imageWidth * super.imageHeight];
        int n = 0;
        for (int i = super.imageWidth - 1; i >= 0; --i) {
            for (int j = 0; j < super.imageHeight; ++j) {
                b[n++] = this._B[i + j * super.imageWidth];
            }
        }
        this._B = b;
        final int w = super._w;
        super._w = super._A;
        super._A = super.imageWidth2 - super.imageWidth - w;
        final int v = super.imageHeight;
        super.imageHeight = super.imageWidth;
        super.imageWidth = v;
        final int g = super.imageHeight2;
        super.imageHeight2 = super.imageWidth2;
        super.imageWidth2 = g;
    }
    
    void e093(int n, int n2) {
        final int n3 = super.imageWidth >> 2;
        final int n4 = super.imageHeight >> 2;
        n += super._w / 4;
        n2 += super._A / 4;
        final int n5 = (n < gf_._j) ? (gf_._j - n << 2) : 0;
        final int n6 = (n + n3 > gf_._h) ? ((gf_._h - n << 2) - 4) : (super.imageWidth - 4);
        final int n7 = (n2 < gf_._f) ? (gf_._f - n2 << 2) : 0;
        for (int n8 = (n2 + n4 > gf_._e) ? ((gf_._e - n2 << 2) - 4) : (super.imageHeight - 4), i = n7; i <= n8; i += 4) {
            for (int n9 = i * super.imageWidth + n5, n10 = (n2 + (i >> 2)) * gf_._i + (n + (n5 >> 2)), j = n5; j <= n6; j += 4, n9 += 4, ++n10) {
                int n11 = 0;
                int n12 = 0;
                for (int k = 0; k < 4; ++k) {
                    for (int l = 0; l < 4; ++l) {
                        int n13 = this._B[n9 + k * super.imageWidth + l];
                        if (n13 == 0) {
                            n13 = gf_._b[n10];
                        }
                        n11 += (n13 & 0xFF00FF);
                        n12 += (n13 & 0xFF00);
                    }
                }
                gf_._b[n10] = ((n11 & 0xFF00FF0) | (n12 & 0xFF000)) >> 4;
            }
        }
    }
    
    private static final void a590(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        final int n12 = 256 - n11;
        final int n13 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n14 = (n3 >> 16) * n10;
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n14];
                if (n != 0) {
                    final int n15 = array[n4];
                    array[n4++] = ((n & 0xFF00FF) * n11 + (n15 & 0xFF00FF) * n12 & 0xFF00FF00) + ((n & 0xFF00) * n11 + (n15 & 0xFF00) * n12 & 0xFF0000) >> 8;
                }
                else {
                    ++n4;
                }
                n2 += n8;
            }
            n3 += n9;
            n2 = n13;
            n4 += n5;
        }
    }
    
    final void a797() {
        if (super.imageWidth == super.imageWidth2 && super.imageHeight == super.imageHeight2) {
            return;
        }
        final int[] b = new int[super.imageWidth2 * super.imageHeight2];
        for (int i = 0; i < super.imageHeight; ++i) {
            for (int j = 0; j < super.imageWidth; ++j) {
                b[(i + super._A) * super.imageWidth2 + (j + super._w)] = this._B[i * super.imageWidth + j];
            }
        }
        this._B = b;
        super.imageWidth = super.imageWidth2;
        super.imageHeight = super.imageHeight2;
        super._w = 0;
        super._A = 0;
    }
    
    final void e797() {
        gf_.a397(this._B, super.imageWidth, super.imageHeight);
    }
    
    void b093(int j, int f) {
        j += super.imageWidth2 - super.imageWidth - super._w;
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
        c650(gf_._b, this._B, 0, n2, n, y, v, n3, n4);
    }
    
    final void e326(int j, int f, final int n) {
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
        a650(gf_._b, this._B, n, n3, n2, y, v, n4, n5);
    }
    
    final Graphic b125() {
        final Graphic cn_ = new Graphic(super.imageWidth, super.imageHeight);
        cn_.imageWidth2 = super.imageWidth2;
        cn_.imageHeight2 = super.imageHeight2;
        cn_._w = super.imageWidth2 - super.imageWidth - super._w;
        cn_._A = super._A;
        for (int i = 0; i < super.imageHeight; ++i) {
            for (int j = 0; j < super.imageWidth; ++j) {
                cn_._B[i * super.imageWidth + j] = this._B[i * super.imageWidth + super.imageWidth - 1 - j];
            }
        }
        return cn_;
    }
    
    final void e115(int n, int n2, final int n3, final int n4) {
        final int n5 = super.imageWidth2 << 3;
        final int n6 = super.imageHeight2 << 3;
        n = (n << 4) + (n5 & 0xF);
        n2 = (n2 << 4) + (n6 & 0xF);
        this.b669(n5, n6, n, n2, n3, n4);
    }
    
    void d326(int j, int f, final int n) {
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
        a663(gf_._b, this._B, 0, n3, n2, y, v, n4, n5, n);
    }
    
    final void b115(final int n, final int n2, final int n3, final int n4) {
        if (n3 > super.imageWidth2 || n4 > super.imageHeight2) {
            throw new IllegalArgumentException();
        }
        int j = n + super._w * n3 / super.imageWidth2;
        int h = n + ((super._w + super.imageWidth) * n3 + super.imageWidth2 - 1) / super.imageWidth2;
        int f = n2 + super._A * n4 / super.imageHeight2;
        int e = n2 + ((super._A + super.imageHeight) * n4 + super.imageHeight2 - 1) / super.imageHeight2;
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
        if (j >= h || f >= e) {
            return;
        }
        int n5 = f * gf_._i + j;
        final int n6 = gf_._i - (h - j);
        for (int i = f; i < e; ++i) {
            for (int k = j; k < h; ++k) {
                final int n7 = k - n << 4;
                final int n8 = i - n2 << 4;
                int n9 = n7 * super.imageWidth2 / n3 - (super._w << 4);
                int n10 = (n7 + 16) * super.imageWidth2 / n3 - (super._w << 4);
                int n11 = n8 * super.imageHeight2 / n4 - (super._A << 4);
                int n12 = (n8 + 16) * super.imageHeight2 / n4 - (super._A << 4);
                final int n13 = (n10 - n9) * (n12 - n11);
                if (n13 != 0) {
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if (n10 > super.imageWidth << 4) {
                        n10 = super.imageWidth << 4;
                    }
                    if (n11 < 0) {
                        n11 = 0;
                    }
                    if (n12 > super.imageHeight << 4) {
                        n12 = super.imageHeight << 4;
                    }
                    --n10;
                    --n12;
                    final int n14 = 16 - (n9 & 0xF);
                    final int n15 = (n10 & 0xF) + 1;
                    final int n16 = 16 - (n11 & 0xF);
                    final int n17 = (n12 & 0xF) + 1;
                    final int n18 = n9 >> 4;
                    final int n19 = n10 >> 4;
                    final int n20 = n11 >> 4;
                    final int n21 = n12 >> 4;
                    int n22 = 0;
                    int n23 = 0;
                    int n24 = 0;
                    int n25 = 0;
                    final int n26 = gf_._b[n5];
                    for (int l = n20; l <= n21; ++l) {
                        int n27 = 16;
                        if (l == n20) {
                            n27 = n16;
                        }
                        if (l == n21) {
                            n27 = n17;
                        }
                        for (int n28 = n18; n28 <= n19; ++n28) {
                            int n29 = this._B[l * super.imageWidth + n28];
                            if (n29 == 0) {
                                n29 = n26;
                            }
                            final int n30 = n27;
                            int n31;
                            if (n28 == n18) {
                                n31 = n30 * n14;
                            }
                            else if (n28 == n19) {
                                n31 = n30 * n15;
                            }
                            else {
                                n31 = n30 << 4;
                            }
                            n25 += n31;
                            n22 += (n29 >> 16 & 0xFF) * n31;
                            n23 += (n29 >> 8 & 0xFF) * n31;
                            n24 += (n29 & 0xFF) * n31;
                        }
                    }
                    if (n25 < n13) {
                        final int n32 = n13 - n25;
                        n22 += (n26 >> 16 & 0xFF) * n32;
                        n23 += (n26 >> 8 & 0xFF) * n32;
                        n24 += (n26 & 0xFF) * n32;
                    }
                    int n33 = (n22 / n13 << 16) + (n23 / n13 << 8) + n24 / n13;
                    if (n33 == 0) {
                        n33 = 1;
                    }
                    gf_._b[n5] = n33;
                    ++n5;
                }
            }
            n5 += n6;
        }
    }
    
    void c115(int n, int n2, int n3, int n4) {
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
        b983(gf_._b, this._B, 0, n5, n6, n11, n12, n3, n4, n7, n8, y);
    }
    
    void c093(int j, int f) {
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
        a415(gf_._b, this._B, n2, n, y, v, n3, n4);
    }
    
    void a326(int j, int f, final int n) {
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
        c663(gf_._b, this._B, 0, n3, n2, y, v, n4, n5, n);
    }
    
    void f093(int j, int f) {
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
        c650(gf_._b, this._B, 0, n2, n, y, v, n3, n4);
    }
    
    void a093(int n, int n2) {
        n += super._w >> 1;
        n2 += super._A >> 1;
        final int n3 = (n < gf_._j) ? (gf_._j - n << 1) : 0;
        final int n4 = (n + (super.imageWidth >> 1) > gf_._h) ? (gf_._h - n << 1) : super.imageWidth;
        final int n5 = (n2 < gf_._f) ? (gf_._f - n2 << 1) : 0;
        a600(this._B, n5 * super.imageWidth + n3, (n2 + (n5 >> 1)) * gf_._i + (n + (n3 >> 1)), (super.imageWidth << 1) - (n4 - n3) + (super.imageWidth & 0x1), gf_._i - (n4 - n3 >> 1), super.imageWidth, n4 - n3 >> 1, ((n2 + (super.imageHeight >> 1) > gf_._e) ? (gf_._e - n2 << 1) : super.imageHeight) - n5 >> 1);
    }
    
    final void a115(final int n, final int n2, final int n3, final int n4) {
        if (n3 > super.imageWidth2 || n4 > super.imageHeight2) {
            throw new IllegalArgumentException();
        }
        int j = n + super._w * n3 / super.imageWidth2;
        int h = n + ((super._w + super.imageWidth) * n3 + super.imageWidth2 - 1) / super.imageWidth2;
        int f = n2 + super._A * n4 / super.imageHeight2;
        int e = n2 + ((super._A + super.imageHeight) * n4 + super.imageHeight2 - 1) / super.imageHeight2;
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
        if (j >= h || f >= e) {
            return;
        }
        int n5 = f * gf_._i + j;
        final int n6 = gf_._i - (h - j);
        for (int i = f; i < e; ++i) {
            for (int k = j; k < h; ++k) {
                final int n7 = k - n << 4;
                final int n8 = i - n2 << 4;
                int n9 = n7 * super.imageWidth2 / n3 - (super._w << 4);
                int n10 = (n7 + 16) * super.imageWidth2 / n3 - (super._w << 4);
                int n11 = n8 * super.imageHeight2 / n4 - (super._A << 4);
                int n12 = (n8 + 16) * super.imageHeight2 / n4 - (super._A << 4);
                final int n13 = (n10 - n9) * (n12 - n11) >> 1;
                if (n13 != 0) {
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if (n10 > super.imageWidth << 4) {
                        n10 = super.imageWidth << 4;
                    }
                    if (n11 < 0) {
                        n11 = 0;
                    }
                    if (n12 > super.imageHeight << 4) {
                        n12 = super.imageHeight << 4;
                    }
                    --n10;
                    --n12;
                    final int n14 = 16 - (n9 & 0xF);
                    final int n15 = (n10 & 0xF) + 1;
                    final int n16 = 16 - (n11 & 0xF);
                    final int n17 = (n12 & 0xF) + 1;
                    final int n18 = n9 >> 4;
                    final int n19 = n10 >> 4;
                    final int n20 = n11 >> 4;
                    final int n21 = n12 >> 4;
                    int n22 = 0;
                    int n23 = 0;
                    int n24 = 0;
                    int n25 = 0;
                    for (int l = n20; l <= n21; ++l) {
                        int n26 = 16;
                        if (l == n20) {
                            n26 = n16;
                        }
                        if (l == n21) {
                            n26 = n17;
                        }
                        for (int n27 = n18; n27 <= n19; ++n27) {
                            final int n28 = this._B[l * super.imageWidth + n27];
                            if (n28 != 0) {
                                final int n29 = n26;
                                int n30;
                                if (n27 == n18) {
                                    n30 = n29 * n14;
                                }
                                else if (n27 == n19) {
                                    n30 = n29 * n15;
                                }
                                else {
                                    n30 = n29 << 4;
                                }
                                n25 += n30;
                                n22 += (n28 >> 16 & 0xFF) * n30;
                                n23 += (n28 >> 8 & 0xFF) * n30;
                                n24 += (n28 & 0xFF) * n30;
                            }
                        }
                    }
                    if (n25 >= n13) {
                        int n31 = (n22 / n25 << 16) + (n23 / n25 << 8) + n24 / n25;
                        if (n31 == 0) {
                            n31 = 1;
                        }
                        gf_._b[n5] = n31;
                    }
                    ++n5;
                }
            }
            n5 += n6;
        }
    }
    
    private static final void b983(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        final int n11 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n12 = (n3 >> 16) * n10;
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n12];
                if (n != 0) {
                    array[n4++] = n;
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
    
    private static final void c650(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                n = array2[n2--];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    final void b669(int n, int n2, final int n3, final int n4, final int n5, final int n6) {
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
        final int n33 = gf_._i + n30;
        final double n34 = 1.6777216E7 / n6;
        final int n35 = (int)Math.floor(Math.sin(n7) * n34 + 0.5);
        final int n36 = (int)Math.floor(Math.cos(n7) * n34 + 0.5);
        final int n37 = (j << 4) + 8 - n3;
        final int n38 = (f << 4) + 8 - n4;
        int n39 = (n << 8) - 2048 - (n38 * n35 >> 4);
        int n40 = (n2 << 8) - 2048 + (n38 * n36 >> 4);
        if (n36 < 0) {
            if (n35 < 0) {
                int n45;
                for (int i = n31; i < 0; ++i, n39 -= n35, n40 += n36, n32 = n45 + n33) {
                    int n41 = n39 + (n37 * n36 >> 4);
                    int n42 = n40 + (n37 * n35 >> 4);
                    int n43 = n30;
                    final int n44;
                    if ((n44 = n41 - (super.imageWidth << 12)) >= 0) {
                        if (n36 == 0) {
                            n45 = n32 - n43;
                            continue;
                        }
                        final int n46 = (n36 - n44) / n36;
                        n43 += n46;
                        n41 += n36 * n46;
                        n42 += n35 * n46;
                        n32 += n46;
                    }
                    final int n47;
                    if ((n47 = n42 - (super.imageHeight << 12)) >= 0) {
                        if (n35 == 0) {
                            n45 = n32 - n43;
                            continue;
                        }
                        final int n48 = (n35 - n47) / n35;
                        n43 += n48;
                        n41 += n36 * n48;
                        n42 += n35 * n48;
                        n32 += n48;
                    }
                    while (n43 < 0 && n41 >= -4096 && n42 >= -4096) {
                        this.c050(n32, n41 >> 12, n42 >> 12, n41, n42);
                        ++n43;
                        n41 += n36;
                        n42 += n35;
                        ++n32;
                    }
                    n45 = n32 - n43;
                }
            }
            else {
                int n53;
                for (int k = n31; k < 0; ++k, n39 -= n35, n40 += n36, n32 = n53 + n33) {
                    int n49 = n39 + (n37 * n36 >> 4);
                    int n50 = n40 + (n37 * n35 >> 4);
                    int n51 = n30;
                    final int n52;
                    if ((n52 = n49 - (super.imageWidth << 12)) >= 0) {
                        if (n36 == 0) {
                            n53 = n32 - n51;
                            continue;
                        }
                        final int n54 = (n36 - n52) / n36;
                        n51 += n54;
                        n49 += n36 * n54;
                        n50 += n35 * n54;
                        n32 += n54;
                    }
                    final int n55;
                    if ((n55 = n50 + 4096) < 0) {
                        if (n35 == 0) {
                            n53 = n32 - n51;
                            continue;
                        }
                        final int n56 = (n35 - 1 - n55) / n35;
                        n51 += n56;
                        n49 += n36 * n56;
                        n50 += n35 * n56;
                        n32 += n56;
                    }
                    int n57;
                    while (n51 < 0 && n49 >= -4096 && (n57 = n50 >> 12) < super.imageHeight) {
                        this.c050(n32, n49 >> 12, n57, n49, n50);
                        ++n51;
                        n49 += n36;
                        n50 += n35;
                        ++n32;
                    }
                    n53 = n32 - n51;
                }
            }
        }
        else if (n35 < 0) {
            int n62;
            for (int l = n31; l < 0; ++l, n39 -= n35, n40 += n36, n32 = n62 + n33) {
                int n58 = n39 + (n37 * n36 >> 4);
                int n59 = n40 + (n37 * n35 >> 4);
                int n60 = n30;
                final int n61;
                if ((n61 = n58 + 4096) < 0) {
                    if (n36 == 0) {
                        n62 = n32 - n60;
                        continue;
                    }
                    final int n63 = (n36 - 1 - n61) / n36;
                    n60 += n63;
                    n58 += n36 * n63;
                    n59 += n35 * n63;
                    n32 += n63;
                }
                final int n64;
                if ((n64 = n59 - (super.imageHeight << 12)) >= 0) {
                    if (n35 == 0) {
                        n62 = n32 - n60;
                        continue;
                    }
                    final int n65 = (n35 - n64) / n35;
                    n60 += n65;
                    n58 += n36 * n65;
                    n59 += n35 * n65;
                    n32 += n65;
                }
                int n66;
                while (n60 < 0 && n59 >= -4096 && (n66 = n58 >> 12) < super.imageWidth) {
                    this.c050(n32, n66, n59 >> 12, n58, n59);
                    ++n60;
                    n58 += n36;
                    n59 += n35;
                    ++n32;
                }
                n62 = n32 - n60;
            }
        }
        else {
            int n72;
            for (int n67 = n31; n67 < 0; ++n67, n39 -= n35, n40 += n36, n32 = n72 + n33) {
                int n68 = n39 + (n37 * n36 >> 4);
                int n69 = n40 + (n37 * n35 >> 4);
                int n70 = n30;
                final int n71;
                if ((n71 = n68 + 4096) < 0) {
                    if (n36 == 0) {
                        n72 = n32 - n70;
                        continue;
                    }
                    final int n73 = (n36 - 1 - n71) / n36;
                    n70 += n73;
                    n68 += n36 * n73;
                    n69 += n35 * n73;
                    n32 += n73;
                }
                final int n74;
                if ((n74 = n69 + 4096) < 0) {
                    if (n35 == 0) {
                        n72 = n32 - n70;
                        continue;
                    }
                    final int n75 = (n35 - 1 - n74) / n35;
                    n70 += n75;
                    n68 += n36 * n75;
                    n69 += n35 * n75;
                    n32 += n75;
                }
                int n76;
                int n77;
                while (n70 < 0 && (n76 = n68 >> 12) < super.imageWidth && (n77 = n69 >> 12) < super.imageHeight) {
                    this.c050(n32, n76, n77, n68, n69);
                    ++n70;
                    n68 += n36;
                    n69 += n35;
                    ++n32;
                }
                n72 = n32 - n70;
            }
        }
    }
    
    //original signature: void h093(int j, int f) {
    void drawImage(int j, int f) {
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
        b650(gf_._b, this._B, 0, n2, n, y, v, n3, n4);
    }
    
    private static final void a057(int n, int n2, int n3, final int[] array, final int[] array2, int n4, int i, int n5, int j, final int n6, final int n7, final int n8, final int n9, final int n10) {
        for (j = -n7; j < 0; ++j) {
            for (i = -n6; i < 0; ++i) {
                n = array2[n4++];
                if (n != 0) {
                    n2 = (n & 0xFF00FF) * n10;
                    n = (n2 & 0xFF00FF00) + (n * n10 - n2 & 0xFF0000) >>> 8;
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
    
    final void d093(int j, int f) {
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
        a871(0, gf_._b, this._B, 0, n2, n, y, v, n3, n4);
    }
    
    void g093(int j, int f) {
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
        b650(gf_._b, this._B, 0, n2, n, y, v, n3, n4);
    }
    
    void b326(int j, int f, final int n) {
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
        if (n == 256) {
            a138(0, 0, 0, gf_._b, this._B, n3, 0, n2, 0, y, v, n4, n5);
        }
        else {
            a057(0, 0, 0, gf_._b, this._B, n3, 0, n2, 0, y, v, n4, n5, n);
        }
    }
    
    private static final void a663(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n10 = array[n3];
                    array[n3++] = ((n & 0xFF00FF) * n8 + (n10 & 0xFF00FF) * n9 & 0xFF00FF00) + ((n & 0xFF00) * n8 + (n10 & 0xFF00) * n9 & 0xFF0000) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    void d050(int n, int n2, int n3, int n4, final int n5) {
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
        a590(gf_._b, this._B, 0, n6, n7, n12, n13, n3, n4, n8, n9, y, n5);
    }
    
    private static final void a871(int n, final int[] array, final int[] array2, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8) {
        for (int i = -n6; i < 0; ++i) {
            for (int j = -n5; j < 0; ++j) {
                n2 = array2[n3++];
                if (n2 != 0) {
                    n = array[n4];
                    if (n != 0) {
                        array[n4++] = (((n2 & 0xFF0000) >>> 16) * ((n & 0xFF0000) >>> 16) >>> 8 << 16) + ((n2 & 0xFF00) * (n & 0xFF00) >>> 24 << 8) + ((n2 & 0xFF) * (n & 0xFF) >>> 8);
                    }
                    else {
                        ++n4;
                    }
                }
                else {
                    ++n4;
                }
            }
            n4 += n7;
            n3 += n8;
        }
    }
    
    private static final void a415(final int[] array, final int[] array2, int n, int i, final int n2, final int n3, final int n4, final int n5) {
        for (int j = -n3; j < 0; ++j) {
            int n6;
            for (n6 = i + n2 - 3; i < n6; array[i++] = array2[n++], array[i++] = array2[n++], array[i++] = array2[n++], array[i++] = array2[n++]) {}
            for (n6 += 3; i < n6; array[i++] = array2[n++]) {}
            i += n4;
            n += n5;
        }
    }
    
    private static final void a600(final int[] array, int n, int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        for (int i = 0; i < n7; ++i, n += n3, n2 += n4) {
            for (int j = 0; j < n6; ++j, n += 2) {
                final int n8 = gf_._b[n2] & 0xFF00FF;
                final int n9 = gf_._b[n2] & 0xFF00;
                final int n10 = 0;
                final int n11 = 0;
                final int n12;
                int n13;
                int n14;
                if ((n12 = array[n]) == 0) {
                    n13 = n10 + n8;
                    n14 = n11 + n9;
                }
                else {
                    n13 = n10 + (n12 & 0xFF00FF);
                    n14 = n11 + (n12 & 0xFF00);
                }
                final int n15;
                int n16;
                int n17;
                if ((n15 = array[n + 1]) == 0) {
                    n16 = n13 + n8;
                    n17 = n14 + n9;
                }
                else {
                    n16 = n13 + (n15 & 0xFF00FF);
                    n17 = n14 + (n15 & 0xFF00);
                }
                final int n18;
                int n19;
                int n20;
                if ((n18 = array[n + n5]) == 0) {
                    n19 = n16 + n8;
                    n20 = n17 + n9;
                }
                else {
                    n19 = n16 + (n18 & 0xFF00FF);
                    n20 = n17 + (n18 & 0xFF00);
                }
                final int n21;
                int n22;
                int n23;
                if ((n21 = array[n + n5 + 1]) == 0) {
                    n22 = n19 + n8;
                    n23 = n20 + n9;
                }
                else {
                    n22 = n19 + (n21 & 0xFF00FF);
                    n23 = n20 + (n21 & 0xFF00);
                }
                gf_._b[n2++] = ((n22 & 0x3FC03FC) | (n23 & 0x3FC00)) >> 2;
            }
        }
    }
    
    final void h797() {
        int i = -1;
        int n = super.imageWidth * super.imageHeight - 4;
        while (i < n) {
            if (this._B[++i] == 0) {
                this._B[i] = 1;
            }
            if (this._B[++i] == 0) {
                this._B[i] = 1;
            }
            if (this._B[++i] == 0) {
                this._B[i] = 1;
            }
            if (this._B[++i] == 0) {
                this._B[i] = 1;
            }
        }
        n += 3;
        while (i < n) {
            if (this._B[++i] == 0) {
                this._B[i] = 1;
            }
        }
    }
    
    void d115(int i, int j, final int n, final int n2) {
        if (super.imageHeight == 0) {
            return;
        }
        i += super._w;
        j += super._A;
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
            n5 += (gf_._f - j) * super.imageWidth;
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
            n10 = 256 - n9;
            if (n9 >= 0) {
                if (n9 > 255) {
                    for (i = -y; i < 0; ++i) {
                        n11 = this._B[n5++];
                        if (n11 != 0) {
                            gf_._b[n8++] = n11;
                        }
                        else {
                            ++n8;
                        }
                    }
                }
                else {
                    for (i = -y; i < 0; ++i) {
                        n12 = this._B[n5++];
                        if (n12 != 0) {
                            n13 = gf_._b[n8];
                            gf_._b[n8++] = ((n13 & 0xFF00FF) * n10 + (n12 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n13 & 0xFF00) * n10 + (n12 & 0xFF00) * n9 >> 8 & 0xFF00);
                        }
                        else {
                            ++n8;
                        }
                    }
                }
                n8 += n6;
                n5 += n7;
                n3 += n4;
            }
        }
    }
    
    final void d150(final int n) {
        final int[] b = new int[super.imageWidth * super.imageHeight];
        int n2 = 0;
        for (int i = 0; i < super.imageHeight; ++i) {
            for (int j = 0; j < super.imageWidth; ++j) {
                int n3 = this._B[n2];
                if (n3 == 0) {
                    if (j > 0 && this._B[n2 - 1] != 0) {
                        n3 = n;
                    }
                    else if (i > 0 && this._B[n2 - super.imageWidth] != 0) {
                        n3 = n;
                    }
                    else if (j < super.imageWidth - 1 && this._B[n2 + 1] != 0) {
                        n3 = n;
                    }
                    else if (i < super.imageHeight - 1 && this._B[n2 + super.imageWidth] != 0) {
                        n3 = n;
                    }
                }
                b[n2++] = n3;
            }
        }
        this._B = b;
    }
    
    private static final void b663(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = (((n & 0xFF00FF) * n8 & 0xFF00FF00) | ((n & 0xFF00) * n8 & 0xFF0000)) >>> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    private static final void a983(final int[] array, final int[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        final int n11 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n12 = (n3 >> 16) * n10;
            for (int j = -n6; j < 0; ++j) {
                if (array2[(n2 >> 16) + n12] != 0) {
                    array[n4++] = n;
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
    
    final void c797() {
        int i = 0;
    Label_0054:
        for (i = super.imageHeight - 1; i >= 0; --i) {
            final int n = i * super.imageWidth;
            for (int j = 0; j < super.imageWidth; ++j) {
                if (this._B[n + j] != 0) {
                    break Label_0054;
                }
            }
        }
        int k = 0;
    Label_0107:
        for (k = 0; k < i; ++k) {
            final int n2 = k * super.imageWidth;
            for (int l = 0; l < super.imageWidth; ++l) {
                if (this._B[n2 + l] != 0) {
                    break Label_0107;
                }
            }
        }
        int n3 = 0;
    Label_0159:
        for (n3 = super.imageWidth - 1; n3 >= 0; --n3) {
            for (int n4 = k; n4 <= i; ++n4) {
                if (this._B[n4 * super.imageWidth + n3] != 0) {
                    break Label_0159;
                }
            }
        }
        int n5 = 0;
    Label_0210:
        for (n5 = 0; n5 < n3; ++n5) {
            for (int n6 = k; n6 <= i; ++n6) {
                if (this._B[n6 * super.imageWidth + n5] != 0) {
                    break Label_0210;
                }
            }
        }
        if (n5 == 0 && n3 == super.imageWidth - 1 && k == 0 && i == super.imageHeight - 1) {
            return;
        }
        final int y = n3 + 1 - n5;
        final int v = i + 1 - k;
        final int[] b = new int[y * v];
        for (int n7 = 0; n7 < v; ++n7) {
            for (int n8 = 0; n8 < y; ++n8) {
                b[n7 * y + n8] = this._B[(n7 + k) * super.imageWidth + (n8 + n5)];
            }
        }
        this._B = b;
        super.imageWidth = y;
        super.imageHeight = v;
        super._w += n5;
        super._A += k;
    }
    
    private static final void c663(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = n8 >> 16 & 0xFF;
        final int n10 = n8 >> 8 & 0xFF;
        final int n11 = n8 & 0xFF;
        final int n12 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        final int n13 = n12 + n12 + n12 + n12 + n4;
        for (int i = -n5; i < 0; ++i) {
            for (int j = n13; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n14 = n >> 16 & 0xFF;
                    final int n15 = n >> 8 & 0xFF;
                    final int n16 = n & 0xFF;
                    if (n14 == n15 && n15 == n16) {
                        if (n14 <= 128) {
                            array[n3++] = (n14 * n9 >> 7 << 16) + (n15 * n10 >> 7 << 8) + (n16 * n11 >> 7);
                        }
                        else {
                            array[n3++] = (n9 * (256 - n14) + 255 * (n14 - 128) >> 7 << 16) + (n10 * (256 - n15) + 255 * (n15 - 128) >> 7 << 8) + (n11 * (256 - n16) + 255 * (n16 - 128) >> 7);
                        }
                    }
                    else {
                        array[n3++] = n;
                    }
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    void c326(int j, int f, final int n) {
        j += super._w;
        f += super._A;
        int n2 = j + f * gf_._i;
        int n3 = 0;
        int imageHeight = super.imageHeight;
        int imageWidth = super.imageWidth;
        int n4 = gf_._i - imageWidth;
        int n5 = 0;
        if (f < gf_._f) {
            final int n6 = gf_._f - f;
            imageHeight -= n6;
            f = gf_._f;
            n3 += n6 * imageWidth;
            n2 += n6 * gf_._i;
        }
        if (f + imageHeight > gf_._e) {
            imageHeight -= f + imageHeight - gf_._e;
        }
        if (j < gf_._j) {
            final int n7 = gf_._j - j;
            imageWidth -= n7;
            j = gf_._j;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (j + imageWidth > gf_._h) {
            final int n8 = j + imageWidth - gf_._h;
            imageWidth -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (imageWidth <= 0 || imageHeight <= 0) {
            return;
        }
        c983(gf_._b, this._B, 0, n3, n2, 0, 0, imageWidth, imageHeight, n4, n5, n);
    }
    
    private static final void a650(final int[] array, final int[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    final void b050(int n, int n2, int n3, int n4, final int n5) {
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
        a983(gf_._b, this._B, n5, n6, n7, n12, n13, n3, n4, n8, n9, y);
    }
    
    private static final void a138(int n, int n2, int n3, final int[] array, final int[] array2, int n4, int i, int n5, int j, final int n6, final int n7, final int n8, final int n9) {
        for (j = -n7; j < 0; ++j) {
            for (i = -n6; i < 0; ++i) {
                n = array2[n4++];
                if (n != 0) {
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
    
    void f326(int j, int f, final int n) {
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
        b663(gf_._b, this._B, 0, n3, n2, y, v, n4, n5, n);
    }
    
    private final void c050(final int n, final int n2, final int n3, int n4, int n5) {
        final int n6 = n3 * super.imageWidth + n2;
        n4 &= 0xFFF;
        n5 &= 0xFFF;
        int n7;
        int n8;
        int n9;
        int n10;
        if (n3 >= 0) {
            if (n2 >= 0) {
                n7 = this._B[n6];
                n8 = ((n7 != 0) ? ((4096 - n4) * (4096 - n5)) : 0);
            }
            else {
                n8 = 0;
                n7 = 0;
            }
            if (n2 < super.imageWidth - 1) {
                n9 = this._B[n6 + 1];
                n10 = ((n9 != 0) ? (n4 * (4096 - n5)) : 0);
            }
            else {
                n10 = 0;
                n9 = 0;
            }
        }
        else {
            n10 = 0;
            n8 = 0;
            n9 = 0;
            n7 = 0;
        }
        int n11;
        int n12;
        int n13;
        int n14;
        if (n3 < super.imageHeight - 1) {
            if (n2 >= 0) {
                n11 = this._B[n6 + super.imageWidth];
                n12 = ((n11 != 0) ? ((4096 - n4) * n5) : 0);
            }
            else {
                n12 = 0;
                n11 = 0;
            }
            if (n2 < super.imageWidth - 1) {
                n13 = this._B[n6 + super.imageWidth + 1];
                n14 = ((n13 != 0) ? (n4 * n5) : 0);
            }
            else {
                n14 = 0;
                n13 = 0;
            }
        }
        else {
            n14 = 0;
            n12 = 0;
            n13 = 0;
            n11 = 0;
        }
        final int n15 = n8 >> 16;
        final int n16 = n10 >> 16;
        final int n17 = n12 >> 16;
        final int n18 = n14 >> 16;
        final int n19 = n15 + n16 + n17 + n18;
        if (n19 >= 256) {
            int n20 = ((n7 & 0xFF00FF) * n15 + (n9 & 0xFF00FF) * n16 + ((n11 & 0xFF00FF) * n17 + (n13 & 0xFF00FF) * n18) >>> 8 & 0xFF00FF) + ((n7 & 0xFF00) * n15 + (n9 & 0xFF00) * n16 + ((n11 & 0xFF00) * n17 + (n13 & 0xFF00) * n18) >>> 8 & 0xFF00);
            if (n20 == 0) {
                n20 = 1;
            }
            gf_._b[n] = n20;
        }
        else if (n19 >= 128) {
            final int n21 = (n7 & 0xFF00FF) * n15 + (n9 & 0xFF00FF) * n16 + ((n11 & 0xFF00FF) * n17 + (n13 & 0xFF00FF) * n18);
            int n22 = ((n21 >>> 16) / n19 << 16) + (((n7 & 0xFF00) * n15 + (n9 & 0xFF00) * n16 + ((n11 & 0xFF00) * n17 + (n13 & 0xFF00) * n18)) / n19 & 0xFF00) + (n21 & 0xFFFF) / n19;
            if (n22 == 0) {
                n22 = 1;
            }
            gf_._b[n] = n22;
        }
    }
    
    Graphic(final int e, final int g, final int w, final int a, final int y, final int v, final int[] b) {
        super.imageWidth2 = e;
        super.imageHeight2 = g;
        super._w = w;
        super._A = a;
        super.imageWidth = y;
        super.imageHeight = v;
        this._B = b;
    }
    
    //original signature: cn_(final int n, final int n2) {
    Graphic(final int imageWidth, final int imageHeight) {
        this._B = new int[imageWidth * imageHeight];
        super.imageWidth2 = imageWidth;
        super.imageWidth = imageWidth;
        super.imageHeight2 = imageHeight;
        super.imageHeight = imageHeight;
        super._A = 0;
        super._w = 0;
    }
    
    Graphic(final byte[] array, final Component component) {
        try {
        	ByteArrayInputStream bis = new ByteArrayInputStream(array);
            final Image image = ImageIO.read(bis);
            ImageIO.write((BufferedImage)image, "png", new File("C:/users/megam/desktop/images/" + this.i++ + ".png"));
            final MediaTracker mediaTracker = new MediaTracker(component);
            mediaTracker.addImage(image, 0);
            mediaTracker.waitForAll();
            super.imageWidth = image.getWidth(component);
            super.imageHeight = image.getHeight(component);
            super.imageWidth2 = super.imageWidth;
            super.imageHeight2 = super.imageHeight;
            super._w = 0;
            super._A = 0;
            this._B = new int[super.imageWidth * super.imageHeight];
            new PixelGrabber(image, 0, 0, super.imageWidth, super.imageHeight, this._B, 0, super.imageWidth).grabPixels();
        }
        catch (Exception ex) {}
    }
}
