import java.util.*;
import java.awt.*;
import java.awt.image.*;

final class kf_ extends c_ implements ImageProducer, ImageObserver
{
	//original name: _l
    private ColorModel colorModel;
    //original name: _j
    static Animation dragonDefeat;
    static pn_ _m;
    //original name: _k
    static Graphic piece_ork_blademaster;
    //original name: _q
    static String hell_beast;
    //original name: _i
    static String warlock;
    static qg_ _o;
    static nh_ _p;
    //original name: _n
    private ImageConsumer imageConsumer;
    
    @Override
    public final boolean imageUpdate(final Image image, final int n, final int n2, final int n3, final int n4, final int n5) {
        return true;
    }
    
    //original signature: static final int a313(final int n, final int n2, final int n3) {
    //never called
    static final int return30() {
        return 30;
    }
    
    public static void b487() {
        kf_.hell_beast = null;
        kf_.piece_ork_blademaster = null;
        kf_.dragonDefeat = null;
        kf_.warlock = null;
        kf_._o = null;
        kf_._p = null;
        kf_._m = null;
    }
    
    @Override
    public final void requestTopDownLeftRightResend(final ImageConsumer imageConsumer) {
    }
    
    @Override
    public final void startProduction(final ImageConsumer imageConsumer) {
        this.addConsumer(imageConsumer);
    }
    
    @Override
    public final synchronized void addConsumer(final ImageConsumer n) {
        (this.imageConsumer = n).setDimensions(super.componentWidth, super.componentHeight);
        n.setProperties(null);
        n.setColorModel(this.colorModel);
        n.setHints(14);
    }
    
    @Override
    public final synchronized boolean isConsumer(final ImageConsumer imageConsumer) {
        return imageConsumer == this.imageConsumer;
    }
    
    private final synchronized void b150(final int n) {
        if (this.imageConsumer != null) {
            this.imageConsumer.setPixels(n, 0, super.componentWidth, super.componentHeight, this.colorModel, super._g, 0, super.componentWidth);
            this.imageConsumer.imageComplete(2);
        }
    }
    
    @Override
    public final synchronized void removeConsumer(final ImageConsumer imageConsumer) {
        if (imageConsumer == this.imageConsumer) {
            this.imageConsumer = null;
        }
    }
    
    @Override
    final void drawImage(final int n, final Graphics graphics, final int n2) {
        this.b150(0);
        graphics.drawImage(super.image, n, n2, this);
    }
    
    @Override
    final void a345(final byte b, final Component component, final int f, final int b2) {
        super.componentWidth = b2;
        super.componentHeight = f;
        super._g = new int[b2 * f + 1];
        this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
        super.image = component.createImage(this);
        this.b150(0);
        component.prepareImage(super.image, this);
        this.b150(0);
        component.prepareImage(super.image, this);
        this.b150(0);
        component.prepareImage(super.image, this);
        this.a487();
    }
    
    static {
        kf_.hell_beast = "Hell Beast";
        kf_.warlock = "Sorceress";
    }
}
