final class cj_
{
	//copying from array into array2?
    static final void a278(final byte[] array, int i, final byte[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static final void a397(final int[] array, int i, int n) {
        for (n = i + n - 7; i < n; array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0) {}
        for (n += 7; i < n; array[i++] = 0) {}
    }
    
    static final void a382(final int[] array, int i, final int[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    static final void a030(final Object[] array, int i, final Object[] array2, int n, int n2) {
        if (array == array2) {
            if (i == n) {
                return;
            }
            if (n > i && n < i + n2) {
                --n2;
                for (i += n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
}
