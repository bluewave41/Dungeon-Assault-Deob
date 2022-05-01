import java.applet.*;

abstract class en_
{
	//original name: _a
    static String[] instructions_pages;
    //original name: _b
    static Graphic[] text_benefits_images;
    static int _c;
    
    public static void a150() {
        en_.instructions_pages = null;
        en_.text_benefits_images = null;
    }
    
    abstract void a185(final int p0, final sa_ p1);
    
    abstract Graphic b373(final byte p0);
    
    static final void a775(final int n, final int n2, final int n3, final int n4) {
        ob_.a697(n, n4, n3, n2);
        te_.a812(n, n4 - 1, n2, kc_._S[0]);
        te_.a812(n, n3 + n4 - 4, n2, kc_._S[0]);
        for (int i = 0; i < 5; ++i) {
            final int n5 = 160 - i * 32;
            gf_.d050(n, n4 - 2 - i, n2, 0, n5);
            gf_.d050(n, n4 + i, n2, 0, n5);
            gf_.d050(n, n3 + (n4 + (-5 - i)), n2, 0, n5);
            gf_.d050(n, n4 + (n3 - 3) + i, n2, 0, n5);
        }
    }
    
    //original signature: static final boolean a568(final int n, final int[] array) {
    static final boolean doesArrayContainNonZero(final int[] array) {
        for (int i = 0; i < 8; ++i) {
            if (array[i] != 0) {
                return true;
            }
        }
        return false;
    }
    
    static final void a423() {
        RaidMember._a._h = 0;
        RaidMember._a._c = 0;
    }
    
    static final int a031(final String s, final String s2) {
        int index;
        for (int i = index = s.indexOf(s2, 0); i != -1; i = s.indexOf(s2, index + 1)) {
            index = i;
        }
        return index;
    }
    
    //original signature: static final String a794(final String s, final Applet applet) {
    static final String getLastLoginMethod(final String s, final Applet applet) {
        try {
            final String[] a640 = ih_.split(';', (String)ee_.a460(applet, "getcookies"));
            for (int i = 0; i < a640.length; ++i) {
                final int index = a640[i].indexOf(61);
                if (0 <= index && a640[i].substring(0, index).trim().equals(s)) {
                    return a640[i].substring(1 + index).trim();
                }
            }
        }
        catch (Throwable t) {}
        return null;
    }
    
    static {
        en_.instructions_pages = new String[] { "Welcome to Dungeon Assault!<br><br>The goal of this game is to win power and fame as a dragon by successfully raiding other players' dungeons while defending your own.<br><br>Use raiders to steal gold from the hoards of other dragons; construct devious traps and recruit powerful monsters to safeguard your own hoard.", "Ages ago, the realm of Dungaria was plagued by continuous wars between the native dragons, as they warred with each other in pursuit of power. Eventually, the gods of that realm intervened, binding all dragons with powerful magics, forbidding them from engaging directly in combat with each other. Even with these restrictions, the dragons still felt the urge to compete against others of their kind, and so became 'the Game': a system of ritualised combat executed entirely with minions, as the dragons themselves sleep at the centres of their domains. It is as a player of 'the Game' that you interact with the world of Dungeon Assault.", "Renown tracks your success in the Game. Your Renown will increase with each successful raid or dungeon defence, as well as slowly over time. Your Renown will decrease for each failed raid or dungeon defence. How much Renown you have, and how much you have lost since you started playing the Game, are used to determine the amount of Treasure you are able to steal from other dragons.", "Raiders are mortal creatures, bound in service to a dragon. They can be injured (making them unavailable for a short length of time) or killed (permanently lost). Raiders can be recruited by spending Treasure. Each raider has different levels in the following four skills:<br>-Attack, used in combat against opponents<br>-Defence, used in combat and to flee from opponents<br>-Dodge, used to avoid traps and flee from opponents<br>-Sneak, used to disarm traps and to gain the element of surprise in combat.<br><br>This means that some raiders will be good at dealing with certain room types, but poor at dealing with others. As your Renown increases, you will be able to select from a wider range of raiders. Recruit raiders by clicking on 'My Stable'. You can employ up to eight raiders at a time. Select a raider type from the panel on the left and click 'Recruit' to recruit it, or select an existing raider from the central section and click 'Dismiss' to remove it. When finished, click 'Confirm' to save any changes and exit.", "Rooms are placed in your dungeon to make attacking it more difficult. Rooms can be added to your dungeon by spending Treasure. There are three types of room: monster, trap and guardian. Monster rooms contain creatures that engage any raiders in combat. Trap rooms contain traps that, if triggered, attempt to incapacitate or kill a raider. Guardian rooms, if triggered, alert all creatures in the dungeon, making them harder to surprise and, therefore, more effective in combat. Rooms are rated in four areas: Attack, Defence, Snare and Detect.<br><br>To construct rooms in your dungeon, click 'My Dungeon'. Similarly to recruiting raiders, click a room type from the panel on the left, and click on your dungeon to place it. Replacing an existing room will refund half of the original room's cost. The entrances and the hoard room cannot be replaced. When finished, click 'Confirm' to save any changes and exit.", "All players are listed in the 'Dragons of Renown' table, which is updated every few minutes. Players are sorted by their current Renown. To raid another player's dungeon, click their entry on this table and select 'Raid'. A good target to choose would be one that is close to you in the table - players that are far above you will be too well defended for you to successfully attack, and the potential gain from players that are far below you is minimal. Additionally, if your target has much less Renown than you, he may sense the involvement of such a powerful will and be more likely to wake.", "You can select up to a maximum of four raiders (from your stable of up to eight) to assault a dungeon. You may choose to enter at any of the four corners. Your objective is then to reach the centre: the hoard room. Select one of your raiders by clicking on its portrait at the bottom-left of the screen, then move it by clicking on a room. All rooms that are currently accessible are highlighted with a glowing orange border.<br><br>The types of rooms your raider's will encounter are:", "Rooms cannot be placed on top of an entrance or the hoard room. Placing rooms costs Treasure, and more room types become available as your Renown increases. Rooms can be replaced or removed, but the arrangement of doors in a dungeon cannot be changed. To place a room, select it from the panel on the left and click a blank room in your dungeon. You need to click 'Save' to confirm any changes before leaving that menu." };
    }
}
