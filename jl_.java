import java.util.zip.*;
import java.applet.*;
import java.net.*;

final class jl_
{
	//original name: _a
    static CRC32 crc32;
    //original name: _c
    static Graphic piece_goblin_scout;
    //original name: _b
    static String mercenary_knight;
    static int _d;
    
    static final void a262(final Applet applet) {
        try {
            applet.getAppletContext().showDocument(j_.a550(new URL(applet.getCodeBase(), "tosupport.ws"), applet), "_top");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    static final boolean a234(final wj_ wj_) {
        return wj_.j080(-55, 1) == 1;
    }
    
    public static void a423() {
        jl_.piece_goblin_scout = null;
        jl_.mercenary_knight = null;
        jl_.crc32 = null;
    }
    
    static {
        jl_.crc32 = new CRC32();
        jl_.mercenary_knight = "Mercenary Knight";
    }
}
