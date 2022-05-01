final class wc_
{
    int _c;
    int[] _a;
    int[] _b;
    int _d;
    
    wc_() {
        jp_.a137(16);
        this._c = ((jp_.b784() != 0) ? (jp_.a137(4) + 1) : 1);
        if (jp_.b784() != 0) {
            jp_.a137(8);
        }
        jp_.a137(2);
        if (this._c > 1) {
            this._d = jp_.a137(4);
        }
        this._a = new int[this._c];
        this._b = new int[this._c];
        for (int i = 0; i < this._c; ++i) {
            jp_.a137(8);
            this._a[i] = jp_.a137(8);
            this._b[i] = jp_.a137(8);
        }
    }
}
