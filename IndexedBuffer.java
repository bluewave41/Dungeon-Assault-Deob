//original name: _el_
final class IndexedBuffer
{
	//original name: _b
    int index;
    //original name: _a
    int[] data;
    
    //original signature: final void a797() {
    final void clear() {
        for (int i = 0; i < this.data.length; ++i) {
            this.data[i] = 0;
        }
    }
    
    //original signature: el_(final int n) {
    IndexedBuffer(final int size) {
        this.data = new int[size];
    }
}
