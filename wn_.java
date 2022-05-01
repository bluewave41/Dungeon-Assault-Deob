import java.awt.*;
import javax.sound.sampled.*;

final class wn_ extends vn_
{
    private int _x;
    private AudioFormat _y;
    private SourceDataLine _w;
    private byte[] _v;
    
    @Override
    final void b797() {
        int n = 256;
        if (vn_._g) {
            n <<= 1;
        }
        for (int i = 0; i < n; ++i) {
            int n2 = super._q[i];
            if ((n2 + 8388608 & 0xFF000000) != 0x0) {
                n2 = (0x7FFFFF ^ n2 >> 31);
            }
            this._v[i * 2] = (byte)(n2 >> 8);
            this._v[i * 2 + 1] = (byte)(n2 >> 16);
        }
        this._w.write(this._v, 0, n << 1);
    }
    
    @Override
    final void d797() {
        if (this._w != null) {
            this._w.close();
            this._w = null;
        }
    }
    
    @Override
    final int f784() {
        return this._x - (this._w.available() >> (vn_._g ? 2 : 1));
    }
    
    @Override
    final void b150(final int x) throws LineUnavailableException {
        try {
            (this._w = (SourceDataLine)AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, this._y, x << (vn_._g ? 2 : 1)))).open();
            this._w.start();
            this._x = x;
        }
        catch (LineUnavailableException ex) {
            if (in_.a080(x) != 1) {
                this.b150(gk_.a080(x));
                return;
            }
            this._w = null;
            throw ex;
        }
    }
    
    @Override
    final void a963(final Component component) {
        final Mixer.Info[] mixerInfo = AudioSystem.getMixerInfo();
        if (mixerInfo != null) {
            final Mixer.Info[] array = mixerInfo;
            for (int i = 0; i < array.length; ++i) {
                final Mixer.Info info = array[i];
                if (info != null) {
                    final String name = info.getName();
                    if (name == null || name.toLowerCase().indexOf("soundmax") >= 0) {}
                }
            }
        }
        this._y = new AudioFormat((float)vn_._t, 16, vn_._g ? 2 : 1, true, false);
        this._v = new byte[256 << (vn_._g ? 2 : 1)];
    }
}
