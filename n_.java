final class n_
{
	//original name: _e
    static q_ ingot;
    //original name: _b
    static Graphic piece_snake;
    //original name: _f
    static int[] isaacCipherSeeds;
    static se_ _c;
    static int _d;
    //original name: _a
    static String text_x_renown;
    static int[] _g;
    
    static final boolean a427() { //this causes login problem
        return qc_._t;
    }
    
    public static void a150() {
        n_.piece_snake = null;
        n_.ingot = null;
        n_._c = null;
        n_.isaacCipherSeeds = null;
        n_.text_x_renown = null;
        n_._g = null;
    }
    
    static final byte[] a381(final CharSequence charSequence) {
        final int i = charSequence.length();
        final byte[] array = new byte[i];
        for (int n = 0; i > n; ++n) {
            final char char1 = charSequence.charAt(n);
            if (('\0' < char1 && char1 < '\u0080') || (char1 >= ' ' && char1 <= '\u00ff')) {
                array[n] = (byte)char1;
            }
            else if (char1 == '\u20ac') {
                array[n] = -128;
            }
            else if (char1 == '\u201a') {
                array[n] = -126;
            }
            else if (char1 != '\u0192') {
                if ('\u201e' == char1) {
                    array[n] = -124;
                }
                else if (char1 != '\u2026') {
                    if (char1 == '\u2020') {
                        array[n] = -122;
                    }
                    else if ('\u2021' == char1) {
                        array[n] = -121;
                    }
                    else if ('\u02c6' != char1) {
                        if ('\u2030' != char1) {
                            if ('\u0160' != char1) {
                                if ('\u2039' != char1) {
                                    if ('\u0152' != char1) {
                                        if ('\u017d' != char1) {
                                            if (char1 == '\u2018') {
                                                array[n] = -111;
                                            }
                                            else if ('\u2019' != char1) {
                                                if (char1 == '\u201c') {
                                                    array[n] = -109;
                                                }
                                                else if (char1 != '\u201d') {
                                                    if ('\u2022' == char1) {
                                                        array[n] = -107;
                                                    }
                                                    else if (char1 != '\u2013') {
                                                        if (char1 == '\u2014') {
                                                            array[n] = -105;
                                                        }
                                                        else if ('\u02dc' == char1) {
                                                            array[n] = -104;
                                                        }
                                                        else if (char1 != '\u2122') {
                                                            if (char1 == '\u0161') {
                                                                array[n] = -102;
                                                            }
                                                            else if ('\u203a' != char1) {
                                                                if ('\u0153' == char1) {
                                                                    array[n] = -100;
                                                                }
                                                                else if ('\u017e' != char1) {
                                                                    if (char1 == '\u0178') {
                                                                        array[n] = -97;
                                                                    }
                                                                    else {
                                                                        array[n] = 63;
                                                                    }
                                                                }
                                                                else {
                                                                    array[n] = -98;
                                                                }
                                                            }
                                                            else {
                                                                array[n] = -101;
                                                            }
                                                        }
                                                        else {
                                                            array[n] = -103;
                                                        }
                                                    }
                                                    else {
                                                        array[n] = -106;
                                                    }
                                                }
                                                else {
                                                    array[n] = -108;
                                                }
                                            }
                                            else {
                                                array[n] = -110;
                                            }
                                        }
                                        else {
                                            array[n] = -114;
                                        }
                                    }
                                    else {
                                        array[n] = -116;
                                    }
                                }
                                else {
                                    array[n] = -117;
                                }
                            }
                            else {
                                array[n] = -118;
                            }
                        }
                        else {
                            array[n] = -119;
                        }
                    }
                    else {
                        array[n] = -120;
                    }
                }
                else {
                    array[n] = -123;
                }
            }
            else {
                array[n] = -125;
            }
        }
        return array;
    }
    
    static {
        n_.isaacCipherSeeds = new int[4];
        n_.text_x_renown = "<%0> <img=0><img=0><img=0>";
    }
}
