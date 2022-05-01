import java.awt.*;
import java.awt.event.*;

final class sk_ extends nl_ implements MouseWheelListener
{
    private int _h;
    
    @Override
    final void a649(final byte b, final Component component) {
        component.addMouseWheelListener(this);
    }
    
    @Override
    //original signature: final synchronized int a137(final int n) {
    final synchronized int a137() {
        final int h = this._h;
        this._h = 0;
        return h;
    }
    
    @Override
    public final synchronized void mouseWheelMoved(final MouseWheelEvent mouseWheelEvent) {
        this._h += mouseWheelEvent.getWheelRotation();
        mouseWheelEvent.consume();
    }
    
    @Override
    final void a177(final boolean b, final Component component) {
        if (b) {
            this.mouseWheelMoved(null);
        }
        component.removeMouseWheelListener(this);
    }
    
    sk_() {
        this._h = 0;
    }
}
