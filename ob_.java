import java.awt.*;

final class ob_ extends ok_
{
    static int[] _cc;
    //original name: _oc
    static String[] ability_fragility;
    ok_ _ic;
    ok_ _Tb;
    static char _Yb;
    //original name: _Kb
    static String off;
    //original name: _Rb
    static String[] ability_chaos_champion;
    static ug_ _Xb;
    
    static final void a578(final Graphic cn_, int j, final int n, int f, final boolean b) {
        if (!b) {
            a572(null);
        }
        j += cn_._w;
        f += cn_._A;
        int n2 = gf_._i * f + j;
        int n3 = 0;
        int imageHeight = cn_.imageHeight;
        int imageWidth = cn_.imageWidth;
        int n4 = -imageWidth + gf_._i;
        if (f < gf_._f) {
            final int n5 = gf_._f - f;
            f = gf_._f;
            n2 += n5 * gf_._i;
            imageHeight -= n5;
            n3 += imageWidth * n5;
        }
        int n6 = 0;
        if (gf_._e < f + imageHeight) {
            imageHeight -= -gf_._e + imageHeight + f;
        }
        if (j < gf_._j) {
            final int n7 = gf_._j - j;
            imageWidth -= n7;
            n6 += n7;
            n3 += n7;
            j = gf_._j;
            n2 += n7;
            n4 += n7;
        }
        if (j + imageWidth > gf_._h) {
            final int n8 = imageWidth + j - gf_._h;
            n6 += n8;
            n4 += n8;
            imageWidth -= n8;
        }
        if (0 >= imageWidth || 0 >= imageHeight) {
            return;
        }
        o_.a270(imageWidth, 0, gf_._b, n3, cn_._B, imageHeight, n, n2, n4, n6);
    }
    
    ob_(final long n, final ok_ ok_, final ok_ ok_2, final ok_ ok_3, final Graphic l, final String s) {
        super(n, ok_);
        if (l != null) {
            this._Tb = new ok_(0L, ok_2);
            this._Tb._L = l;
            this.a652(this._Tb, (byte)124);
        }
        if (s != null) {
            this.a652(this._ic = new ok_(0L, ok_3, s), (byte)124);
        }
        this.e150(30509);
    }
    
    static final void a572(final nh_ nh_) {
        final Graphic cn_ = new Graphic(nh_.a826("final_frame.jpg", ""), c_.canvas);
        final int y = cn_.imageWidth;
        final int v = cn_.imageHeight;
        ie_.a150();
        (dm_._g = new Graphic(y, 3 * v / 4)).e797();
        cn_.c093(0, 0);
        (PlayerInformation._C = new Graphic(y, -dm_._g.imageHeight + v)).e797();
        cn_.c093(0, -dm_._g.imageHeight);
        PlayerInformation._C._A = dm_._g.imageHeight;
        ti_.c487(true);
    }
    
    static final void a749(final int n, final int n2, final Canvas canvas, final int n3) {
        try {
            final Graphics graphics = canvas.getGraphics();
            k_._h.drawImage(n, graphics, n3);
            graphics.dispose();
        }
        catch (Exception ex) {
            canvas.repaint();
        }
        if (n2 > -76) {
            a578(null, -84, 120, -93, false);
        }
    }
    
    public static void g150() {
        ob_.ability_chaos_champion = null;
        ob_._cc = null;
        ob_._Xb = null;
        ob_.off = null;
        ob_.ability_fragility = null;
    }
    
    static final void a697(final int n, final int n2, final int n3, final int n4) {
        for (int i = 0; i < n3; ++i) {
            te_.a812(n, i + n2, n4, ji_._F);
        }
    }
    
    static {
        ob_.ability_fragility = new String[] { "Fragility", "The strange chemicals the <%0> uses to fuel his mindless rage have their own cost; blows that would otherwise only stun a raider are always fatal to the <%0>." };
        ob_._cc = new int[28];
        s_.a326(0, 8);
        s_.a326(19, 8);
        s_.a326(24, 8);
        s_.a326(1, 0);
        s_.a326(2, 40);
        s_.a326(3, 16);
        s_.a326(4, 8);
        s_.a326(5, 16);
        s_.a326(6, 160);
        s_.a326(21, 160);
        s_.a326(7, 0);
        s_.a326(8, 0);
        s_.a326(9, 16);
        s_.a326(22, 16);
        s_.a326(10, 0);
        s_.a326(11, 0);
        s_.a326(12, 0);
        s_.a326(13, 4);
        s_.a326(14, 0);
        s_.a326(15, 8);
        s_.a326(16, 16);
        s_.a326(17, 0);
        s_.a326(20, 0);
        s_.a326(26, 0);
        s_.a326(25, 0);
        s_.a326(27, 0);
        s_.a326(18, 16);
        ob_.off = "OFF";
        ob_.ability_chaos_champion = new String[] { "Master of Chaos", "The <%0> is able to harness the raw power of chaos, using the energy released by the sacrifice of another raider to overcome any room. (Multiple use)" };
    }
}
