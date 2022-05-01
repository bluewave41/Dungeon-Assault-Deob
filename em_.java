final class em_ extends vf_
{
	//original name: _D
    ec_ dataBuffer;
    //original name: _C
    static volatile int mouseY;
    byte _E;
    //original name: _F
    static String text_hint_sacrifice_goblin;
    int _G;
    
    public static void c487(final boolean b) {
        em_.text_hint_sacrifice_goblin = null;
    }
    
    //original signature: static final String e738(final int n) {
    static final String getPassword() {
        if (ol_._i == ql_._f) {
            return td_._d;
        }
        return ek_.password;
    }
    
    @Override
    final int d410(final byte b) {
        if (b < 98) {
            this._G = -32;
        }
        if (this.dataBuffer == null) {
            return 0;
        }
        return 100 * this.dataBuffer.currentIndex / (-this._E + this.dataBuffer.buffer.length);
    }
    
    static final vk_ a953(final String[] c) {
        final vk_ vk_ = new vk_(false);
        vk_._c = c;
        return vk_;
    }
    
    @Override
    final byte[] b318(final boolean b) {
        if (!super._v && this.dataBuffer.currentIndex >= this.dataBuffer.buffer.length - this._E) {
            return this.dataBuffer.buffer;
        }
        throw new RuntimeException();
    }
    
    static {
        em_.mouseY = 0;
        em_.text_hint_sacrifice_goblin = "Select a goblin to sacrifice";
    }
}
