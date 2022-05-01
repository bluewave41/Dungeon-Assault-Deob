import java.awt.event.*;

final class og_ implements KeyListener, FocusListener
{
    static ed_ _e;
    static ad_ _c;
    //original name: _b
    static String[] hs_mode_name;
    //original name: _a
    static String[] tutorial_raiders3;
    static int _f;
    //original name: _d
    static String text_inst_guardian;
    
    //original signature: static final int a571(final boolean b, final String s, final int n) {
    static final int a571(final boolean b, final String s) {
        if (!b) {
            return n_._c.b926(s);
        }
        return i_._x.b926(s);
    }
    
    @Override
    public final void keyTyped(final KeyEvent keyEvent) {
        if (null != in_._C) {
            final char keyChar = keyEvent.getKeyChar();
            if (keyChar != '\uffff' && oh_.a331(-161, keyChar)) {
                final int c = 0x7F & ka_._c + 1;
                if (c != je_._i) {
                    jk_._Db[ka_._c] = -1;
                    b_.keysUserPressed[ka_._c] = keyChar;
                    ka_._c = c;
                }
            }
        }
        keyEvent.consume();
    }
    
    static final void a188(final boolean k, final int p3, final gn_ l) {
        if (l != null) {
            l.a423((byte)(-117));
        }
        ce_._p = p3;
        gk_._L = l;
        bl_._k = k;
        hc_._b = ((l != null) ? l._a : 0);
    }
    
    static final void a348(int n, final int n2, final q_ q_, final int n3, final byte b) {
        int n4 = n2 + q_._h * n3;
        while (n-- > 0) {
            q_._j[n4] = b;
            n4 += q_._h;
        }
    }
    
    @Override
    public final synchronized void focusLost(final FocusEvent focusEvent) {
        if (null != in_._C) {
            ia_._M = -1;
        }
    }
    
    @Override
    public final synchronized void keyReleased(final KeyEvent keyEvent) {
        if (null != in_._C) {
            hl_._g = 0;
            final int keyCode = keyEvent.getKeyCode();
            int n;
            if (0 > keyCode || fl_._m.length <= keyCode) {
                n = -1;
            }
            else {
                n = (fl_._m[keyCode] & 0xFFFFFF7F);
            }
            if (0 <= ia_._M) {
                if (0 <= n) {
                    ih_._r[ia_._M] = ~n;
                    ia_._M = (0x7F & 1 + ia_._M);
                    if (dl_._b == ia_._M) {
                        ia_._M = -1;
                    }
                }
            }
        }
        keyEvent.consume();
    }
    
    static final int a451(final se_ se_, final String[] array, int n, final String s) {
        final int b926 = se_.b926(s);
        if (n >= b926 && s.indexOf("<br>") == -1) {
            array[0] = s;
            return 1;
        }
        n = b926 / ((n + b926 - 1) / n);
        int n2 = 0;
        int n3 = 0;
        final int length = s.length();
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (' ' == char1 || '-' == char1) {
                final String trim = s.substring(n3, i + 1).trim();
                if (se_.b926(trim) >= n) {
                    n3 = i + 1;
                    array[n2++] = trim;
                }
            }
            if (char1 == '>') {
                if (s.regionMatches(i - 3, "<br>", 0, 4)) {
                    array[n2++] = s.substring(n3, i - 3).trim();
                    n3 = i + 1;
                }
            }
        }
        if (n3 < length) {
            array[n2++] = s.substring(n3, length).trim();
        }
        return n2;
    }
    
    static final int b137() {
        return jn_._d;
    }
    
    @Override
    public final synchronized void keyPressed(final KeyEvent keyEvent) {
        if (null != in_._C) {
            hl_._g = 0;
            final int keyCode = keyEvent.getKeyCode();
            int n;
            if (0 > keyCode || fl_._m.length <= keyCode) {
                n = -1;
            }
            else {
                n = fl_._m[keyCode];
                if ((n & 0x80) != 0x0) {
                    n = -1;
                }
            }
            if (0 <= ia_._M && n >= 0) {
                ih_._r[ia_._M] = n;
                ia_._M = (1 + ia_._M & 0x7F);
                if (dl_._b == ia_._M) {
                    ia_._M = -1;
                }
            }
            if (0 <= n) {
                final int c = 0x7F & 1 + ka_._c;
                if (c != je_._i) {
                    jk_._Db[ka_._c] = n;
                    b_.keysUserPressed[ka_._c] = '\0';
                    ka_._c = c;
                }
            }
            if (0x0 != (0xA & keyEvent.getModifiers()) || n == 85 || n == 10) {
                keyEvent.consume();
            }
        }
    }
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
    }
    
    public static void a150() {
        og_.hs_mode_name = null;
        og_.text_inst_guardian = null;
        og_._c = null;
        og_.tutorial_raiders3 = null;
        og_._e = null;
    }
    
    static {
        og_._c = new ad_(8, 1);
        og_.hs_mode_name = new String[] { "All scores", "My scores", "Best each" };
        og_.tutorial_raiders3 = new String[] { null, "One raider will be the <%highlight>party leader</col>, and will be first to enter the next room and encounter whatever lies inside. You can change your party leader before you enter any room by <col=FF0000>left-clicking on it in the party view</col> at the bottom-left of the screen." };
        og_.text_inst_guardian = "GUARDIAN";
    }
}
