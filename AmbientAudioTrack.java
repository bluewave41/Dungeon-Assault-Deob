//original name: cf_
final class AmbientAudioTrack
{
    static boolean[] _b;
    int _a;
    static hd_[] _c;
    //original name: _d
    static String text_3dview;
    va_ _e;
    static Graphic _f;
    
    public static void a150(final int n) {
        AmbientAudioTrack._b = null;
        AmbientAudioTrack.text_3dview = null;
        if (n != 30) {
            a150(45);
        }
        AmbientAudioTrack._c = null;
        AmbientAudioTrack._f = null;
    }
    
    static final void a548(final boolean b, final int n, final int n2) {
        nl_.benefits_button_frame.drawImage(n, n2);
        if (b) {
            int n3 = jc_._e % nl_.benefits_button_frame.imageWidth * 2;
            if (n3 >= nl_.benefits_button_frame.imageWidth) {
                n3 = nl_.benefits_button_frame.imageWidth - (n3 - nl_.benefits_button_frame.imageWidth);
            }
            if (10 <= n3) {
                if (nl_.benefits_button_frame.imageWidth - 40 < n3) {
                    n3 = nl_.benefits_button_frame.imageWidth - 40;
                }
            }
            else {
                n3 = 10;
            }
            rk_.a161(30, 80, n3, 0, n2, n, 0, 116, nl_.benefits_button_frame);
        }
    }
    
    AmbientAudioTrack(final va_ e, final int a) {
        this._a = a;
        this._e = e;
    }
    
    static final fa_ a319(final va_ va_, final int n) {
        return l_.a472(ni_.b071(va_, 100, n));
    }
    
    static {
        AmbientAudioTrack._b = new boolean[] { true, true, true, true, false, false };
        AmbientAudioTrack.text_3dview = "3D VIEW: ";
    }
}
