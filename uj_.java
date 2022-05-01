import java.util.*;

final class uj_
{
    static int _d;
    //original name: _a
    static String create_alert_invalidemail;
    //original name: _e
    static String text_renown_and_raids;
    //original name: _b
    static String instructions_monsterroom;
    //original name: _c
    static Graphic stat_renown;
    
    //original signature: static final int a004(final Random random, final int n, final int n2) {
    /**
     * Returns an exclusive random integer between 0 and max
     * @param random Random object
     * @param max max value
     * @return random value
     */
    static final int getRandom(final Random random, final int max) {
        if (max <= 0) {
            throw new IllegalArgumentException();
        }
        boolean result = max == (max & -max);
        if (!result) {
            final int i = Integer.MIN_VALUE - (int)(4294967296L % max);
            int nextInt;
            do {
                nextInt = random.nextInt();
            } while (i <= nextInt);
            return ((nextInt >>> 31) + nextInt) % max + (nextInt >> 31 & max - 1);
        }
        return (int)(((long)random.nextInt() & 0xFFFFFFFFL) * max >> 32);
    }
    
    //original signature: static final String a748(long n, final int n2) {
    static final String decodeBase37EncodedString(long n) {
        if (0L >= n || 6582952005840035281L <= n) {
            return null;
        }
        if (0L == n % 37L) {
            return null;
        }
        int n3 = 0;
        for (long n4 = n; n4 != 0L; n4 /= 37L, ++n3) {}
        final StringBuilder sb = new StringBuilder(n3);
        while (0L != n) {
            final long n5 = n;
            n /= 37L;
            char c = ak_.charactersNumbersAndUnderscore[(int)(-(n * 37L) + n5)];
            if (c == '_') {
                final int n6 = sb.length() - 1;
                sb.setCharAt(n6, Character.toUpperCase(sb.charAt(n6)));
                c = ' ';
            }
            sb.append(c);
        }
        sb.reverse();
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }
    
    public static void a150() {
        uj_.stat_renown = null;
        uj_.create_alert_invalidemail = null;
        uj_.text_renown_and_raids = null;
        uj_.instructions_monsterroom = null;
    }
    
    static final void a872(final en_ o) {
        GUICheckbox._O = o;
    }
    
    static {
        uj_.text_renown_and_raids = "Renown";
        uj_.create_alert_invalidemail = "Please check if address is correct";
        uj_.instructions_monsterroom = "When entering a monster room, you can choose for your raider to Charge (increases Attack, decreases Defence), Advance (which leaves stats unchanged) or Flee (attempt to retreat from the room without engaging in combat). When combat begins, the raider's Sneak level is rolled against the monster's Detect level to determine who attacks first. In each round of combat, the attacker's Attack level is rolled against the defender's Defence level - if the attacker wins, the defender is defeated, otherwise, if the defender wins, they get a turn to attack. Fleeing works in much the same way, but instead of attacking each round, the raider rolls Dodge against the room's Snare - if successful, the raider escapes.";
    }
}
