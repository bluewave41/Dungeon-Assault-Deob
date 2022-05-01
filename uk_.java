import java.util.zip.*;
import java.util.*;
import java.awt.*;

final class uk_
{
	//original name: _d
    private Inflater inflater;
    static int _c;
    //original name: _b
    static String text_title_requirements_external;
    static Graphic _e;
    static int _a;
    
    static boolean contains(int[] array, int value) {
    	for(int i : array) {
    		if(i == value) {
    			return true;
    		}
    	}
    	return false;
    }
    
    //original signature: static final wm_ a651(final int n, final Random random) {
    //something in here generates a path through the dungeon
    static final DungeonPath generateDungeonPath(final Random random) {
        bo_._Jb = new DungeonPath(84);
        wl_._e = new int[84];
        Raider._j = 0;
        
        int[] badValues = new int[] { 14, 15, 20, 21, 26, 27, 58, 59, 60, 65, 66, 67 };
        for (int i = 0; i < 84; ++i) {
        	if(!contains(badValues, i)) {
        		wl_._e[Raider._j++] = i;
        	}
        }
        
        //fill with 0-49
        ue_._j = new int[49];
        for (int n2 = 0; ue_._j.length > n2; ++n2) {
            ue_._j[n2] = n2;
        }
        
        while (Raider._j > 0) {
            fo_.a093(gd_.a518(random)); //shuffle
        }
        
        final int randomValue = uj_.getRandom(random, 4);
        int randomValue2 = uj_.getRandom(random, 3);
        
        if (randomValue2 == randomValue) {
            randomValue2 = 3;
        }
        if (randomValue == 0 || randomValue2 == 0) {
            bo_._Jb.a093(20);
        }
        if (randomValue == 1 || randomValue2 == 1) {
            bo_._Jb.a093(21);
        }
        if (randomValue == 2 || randomValue2 == 2) {
            bo_._Jb.a093(59);
        }
        if (randomValue == 3 || randomValue2 == 3) {
            bo_._Jb.a093(66);
        }
        
        int[] array = ec_.h111(24);
        for (int j = 0; j < 4; ++j) {
            final int[] h111 = ec_.h111((j != 0) ? ((j != 0) ? 6 : ((2 != j) ? 48 : 42)) : 0);
            int n3 = 0;
            int n4 = -1;
            for (int n5 = 1; 84 > n5; ++n5) {
                if (n5 != 20 && n5 != 21 && n5 != 59 && n5 != 66) {
                    if (10 <= qc_.a890(n5, h111)) {
                        final int a6 = sh_.a890(123, n5, h111);
                        if (n4 == -1 || n3 < a6) {
                            n3 = a6;
                            n4 = n5;
                        }
                    }
                }
            }
            if (n4 != -1) {
                bo_._Jb.a093(n4);
            }
        }
        
        while (true) {
            int n6 = 4;
            int n7 = -1;
            for (int k = 0; k < 84; ++k) {
                if (k != 20 && 21 != k && k != 59 && k != 66) {
                    if (8 <= qc_.a890(k, array)) {
                        final int a7 = sh_.a890(120, k, array);
                        if (n6 < a7) {
                            n7 = k;
                            n6 = a7;
                        }
                    }
                }
            }
            if (n7 == -1) {
                break;
            }
            bo_._Jb.a093(n7);
            array = ec_.h111(24);
        }
        return bo_._Jb;
    }
    
    public uk_() {}
    
    static final void a762(final Canvas canvas) {
        lj_.addListeners(canvas);
        im_.addListeners(canvas);
        if (bn_._j != null) {
            bn_._j.a649((byte)123, canvas);
        }
    }
    
    public static void a150() {
        uk_.text_title_requirements_external = null;
        uk_._e = null;
    }
    
    final void a730(final int n, final byte[] array, final ec_ ec_) {
        if (ec_.buffer[ec_.currentIndex] == 31 && ec_.buffer[1 + ec_.currentIndex] == -117) {
            if (null == this.inflater) {
                this.inflater = new Inflater(true);
            }
            try {
                this.inflater.setInput(ec_.buffer, 10 + ec_.currentIndex, ec_.buffer.length - 10 + (-ec_.currentIndex - 8));
                this.inflater.inflate(array);
            }
            catch (Exception ex) {
                this.inflater.reset();
                throw new RuntimeException("");
            }
            if (n >= -80) {
                uk_._e = null;
            }
            this.inflater.reset();
            return;
        }
        throw new RuntimeException("");
    }
    
    static {
        uk_.text_title_requirements_external = "You must gain the <%0> Achievement in <%1> to earn the title of <%2>.";
        uk_._c = 2;
    }
}
