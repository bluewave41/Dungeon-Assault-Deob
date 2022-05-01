final class aj_ extends ok_
{
	//original name: _Gb
    static int componentX;
    
    private aj_() throws Throwable {
        super(0L, null);
        throw new Error();
    }
    
    static final short[] a042(final wj_ wj_, short[] array, final byte b, final int n) {
        final int i = wj_.j080(b ^ 0x74, n);
        if (i == 0) {
            return null;
        }
        if (null == array || array.length != i) {
            array = new short[i];
        }
        final int j080 = wj_.j080(84, 4);
        if (b != 31) {
            a042(null, null, (byte)18, -27);
        }
        final short n2 = (short)wj_.j080(-93, 16);
        if (0 < j080) {
            for (int n3 = 0; i > n3; ++n3) {
                array[n3] = (short)(wj_.j080(87, j080) + n2);
            }
        }
        else {
            for (int k = 0; k < i; ++k) {
                array[k] = n2;
            }
        }
        return array;
    }
    
    static {
        aj_.componentX = 0;
    }
}
