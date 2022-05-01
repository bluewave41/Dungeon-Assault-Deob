final class sh_
{
	//original name: _a
    static Graphic members_benefits_logo;
    //original name: _b
    static String create_emailvalid;
    
    //original signature: static final String a439(final String s) {
    static final String reverseString(final String s) {
        final int i = s.length();
        final char[] array = new char[i];
        for (int n = 0; i > n; ++n) {
            array[i - (1 + n)] = s.charAt(n);
        }
        return new String(array);
    }
    
    static final void a041(final int n, final PlayerInformation lb_) {
        final kl_ b = bf_._f[2]._b;
        if (b instanceof fk_) {
            ((fk_)b).a067(lb_, 83);
        }
        if (n != 27886) {
            sh_.members_benefits_logo = null;
        }
    }
    
    //original signature: static final cf_[] a289(final int n, final String s, final int[] array) {
    static final AmbientAudioTrack[] a289(final String s, final int[] array) {
        final int length = array.length;
        final AmbientAudioTrack[] array2 = new AmbientAudioTrack[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = mp_.a473(Integer.toString(i + 1), s, array[i]);
        }
        return array2;
    }
    
    static final int a890(final int n, final int n2, final int[] array) {
        int n3;
        int n4;
        if (42 > n2) {
            n3 = n2 % 6 + 7 * (n2 / 6);
            n4 = n3 + 1;
        }
        else {
            n3 = n2 - 42;
            n4 = 7 + n3;
        }
        final int n5 = array[n3] - array[n4];
        return (0 >= n5) ? (-n5) : n5;
    }
    
    public static void a487() {
        sh_.create_emailvalid = null;
        sh_.members_benefits_logo = null;
    }
    
    static {
        sh_.create_emailvalid = "Email is valid";
    }
}
