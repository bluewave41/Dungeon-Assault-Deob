import java.util.*;
import java.awt.*;
import java.awt.image.*;

final class ij_ extends c_
{
	//original name: _i
    private Component component;
    
    //original signature: final void a345(final byte b, final Component i, final int f, final int b2) {
    @Override
    final void a345(final byte b, final Component component, final int componentHeight, final int componentWidth) {
        super.componentHeight = componentHeight;
        super._g = new int[componentWidth * componentHeight + 1];
        super.componentWidth = componentWidth;
        final DataBufferInt dataBufferInt = new DataBufferInt(super._g, super._g.length);
        final DirectColorModel directColorModel = new DirectColorModel(32, 16711680, 65280, 255);
        super.image = new BufferedImage(directColorModel, Raster.createWritableRaster(directColorModel.createCompatibleSampleModel(super.componentWidth, super.componentHeight), dataBufferInt, null), false, new Hashtable<Object, Object>());
        this.component = component;
        this.a487();
    }
    
    //original signature: k_._h.a433(n, true, graphics, n3);
    @Override
    final void drawImage(final int x, final Graphics graphics, final int y) {
        graphics.drawImage(super.image, x, y, this.component);
    }
    
    public ij_() {}
}
