import java.awt.event.*;

final class mh_ implements MouseListener, MouseMotionListener, FocusListener
{
    static vk_ _b;
    static ef_ _c;
    //original name: _g
    static int serverNum;
    static int _a;
    static gl_ _e;
    static char[] _d;
    //original name: _f
    static AmbientAudioTrack da_menu_fire;
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
    }
    
    @Override
    public final synchronized void mousePressed(final MouseEvent mouseEvent) {
        if (ib_._f != null) {
            fc_._m = 0;
            ak_.mouseX = mouseEvent.getX();
            em_.mouseY = mouseEvent.getY();
            kd_.getTime(); //does nothing
            if (mouseEvent.isMetaDown()) {
                DungeonPath.isMetaDown = 2;
                ua_.isMetaDown = 2;
            }
            else {
                DungeonPath.isMetaDown = 1;
                ua_.isMetaDown = 1;
            }
            final int modifiers = mouseEvent.getModifiers();
            if (0x0 == (0x8 & modifiers)) {}
            if ((modifiers & 0x4) == 0x0) {}
            lj_._g = true;
            if (0x0 != (0x10 & modifiers)) {}
        }
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    @Override
    public final synchronized void mouseMoved(final MouseEvent mouseEvent) {
        if (ib_._f != null) {
            fc_._m = 0;
            wi_.mouseX = mouseEvent.getX();
            dj_.mouseY = mouseEvent.getY();
            lj_._g = true;
        }
    }
    
    @Override
    public final synchronized void focusLost(final FocusEvent focusEvent) {
        if (ib_._f != null) {
            ua_.isMetaDown = 0;
        }
    }
    
    @Override
    public final synchronized void mouseDragged(final MouseEvent mouseEvent) {
        if (ib_._f != null) {
            fc_._m = 0;
            wi_.mouseX = mouseEvent.getX();
            dj_.mouseY = mouseEvent.getY();
            lj_._g = true;
        }
    }
    
    static final int a170(final int n, final int n2) {
        final int n3 = n >> 16;
        final int n4 = 0xFFFF & n;
        return ((0xFFFF & n2) * n4 >> 16) + n4 * (n2 >> 16) + n3 * n2;
    }
    
    @Override
    public final synchronized void mouseExited(final MouseEvent mouseEvent) {
        if (null != ib_._f) {
            fc_._m = 0;
            wi_.mouseX = -1;
            dj_.mouseY = -1;
            lj_._g = true;
        }
    }
    
    static final void b150(final int y) {
        of_._k = false;
        nf_._y = y;
        Animation._o._N = true;
        Animation._o.isActive = true;
        final ed_ e = og_._e;
        og_._e._N = false;
        e.isActive = false;
    }
    
    static final boolean a097(int n) {
        if (n == -1) {
            return true;
        }
        n &= 0x7F;
        if (MusicTrack._a <= n) {
            return gg_._g.length > n - MusicTrack._a;
        }
        if (n >= 64) {
            return -64 + n < id_._j.length;
        }
        if (n >= 48) {
            return bl_._n.length > -48 + n;
        }
        if (32 <= n) {
            return -32 + n < ci_._s.length;
        }
        if (n < 16) {
            return 0 <= n && dc_._p.length > n;
        }
        return -16 + n < RaidMember._m.length;
    }
    
    public static void a150() {
        mh_.da_menu_fire = null;
        mh_._b = null;
        mh_._d = null;
        mh_._c = null;
        mh_._e = null;
    }
    
    @Override
    public final synchronized void mouseEntered(final MouseEvent mouseEvent) {
        if (null != ib_._f) {
            fc_._m = 0;
            wi_.mouseX = mouseEvent.getX();
            dj_.mouseY = mouseEvent.getY();
            lj_._g = true;
        }
    }
    
    @Override
    public final void mouseClicked(final MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    @Override
    public final synchronized void mouseReleased(final MouseEvent mouseEvent) {
        if (ib_._f != null) {
            fc_._m = 0;
            ua_.isMetaDown = 0;
            lj_._g = true;
            final int modifiers = mouseEvent.getModifiers();
            if (0x0 == (0x10 & modifiers)) {}
            if ((modifiers & 0x4) != 0x0) {}
            if (0x0 == (modifiers & 0x8)) {}
        }
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    static {
        mh_._c = new ef_();
        mh_._d = new char[] { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
    }
}
