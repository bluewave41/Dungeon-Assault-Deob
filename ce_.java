final class ce_ extends kl_
{
    private pp_ _n;
    //original name: _v
    static Animation dragonVictory;
    static long _s;
    private pp_ _r;
    static int _p;
    //original name: _q
    static String[] titles_purchased;
    //original name: _m
    static String snakes;
    //original name: _t
    static String create_password_tooltip;
    static int _x;
    //original name: _o
    static String[] achievement_names;
    static int _w;
    StringBuilder _u;
    
    public static void d423() {
        ce_.snakes = null;
        ce_.dragonVictory = null;
        ce_.achievement_names = null;
        ce_.create_password_tooltip = null;
        ce_.titles_purchased = null;
    }
    
    @Override
    final void b150(final int n) {
        super.b150(-51);
        final int n2 = (super.imageWidth >> 1) + super._k;
        final int n3 = super._j + 10;
        ne_.roman20.c191(RaidMember.text_search.toUpperCase(), n2, n3 + ne_.roman20._H, 16777215, -1);
        final int n4 = n3 + ne_.roman20._H;
        la_.roman12.a385(hl_.text_search_tip, 20 + super._k, n4, super.imageWidth - 40, super.imageHeight + super._j - n4 - (24 + jm_.button_152.imageHeight * 2), 16777215, -1, 1, 1, la_.roman12._H);
        final int n5 = super._k + (super.imageWidth - 200 >> 1);
        final int n6 = 60 + n4;
        gf_.b050(n5 - 4, n6 - 4, 208, 28, 0);
        rp_.a857(4, 200, (byte)108, n5, 20, kc_._S, n6);
        if (this._u != null) {
            String s = this._u.toString();
            if (0x0 == (0x1 & mo_._a / 25)) {
                s += "|";
            }
            la_.roman12.b191(s, n5, (la_.roman12._H + 20 >> 1) + n6, (this._u.length() <= 12) ? 16777215 : 16711680, -1);
        }
    }
    
    @Override
    final void b487(final boolean b) {
        if (84 == mm_._t) {
            super._d = true;
        }
        else if (13 == mm_._t) {
            this._u = null;
            super._d = true;
        }
        else if (85 != mm_._t) {
            if (12 > this._u.length()) {
                if (pe_.a628(this._u, ob_._Yb)) {
                    this._u.append(ob_._Yb);
                }
            }
        }
        else if (this._u.length() > 0) {
            am_.a541(this._u, ' ', this._u.length() - 1);
        }
        if (b) {
            ce_.dragonVictory = null;
        }
    }
    
    @Override
    final void a487(final boolean b) {
        super.a487(b);
        if (null != hh_._s) {
            if (this._n == hh_._s) {
                this._u = null;
            }
            super._d = true;
        }
    }
    
    //original signature: ce_(final String s) {
    ce_(final String playerTitle) {
        this._u = new StringBuilder(playerTitle);
        this.a326(350, 88 + 2 * jm_.button_152.imageHeight + oj_.a170(hl_.text_search_tip, new int[] { 300 }, la_.roman12) * la_.roman12._H);
        super._d = false;
        this._r = tn_.a226(super._k + 10 + ((super.imageWidth >> 1) - 10 - jm_.button_152.imageWidth >> 1), super.imageHeight + (super._j - 16) - jm_.button_152.imageHeight, ne_.roman20, jm_.button_152, -85, RaidMember.text_search);
        this._n = tn_.a226((-jm_.button_152.imageWidth + (super.imageWidth >> 1) - 10 >> 1) + (super.imageWidth >> 1) + super._k, super.imageHeight + super._j + (-16 - jm_.button_152.imageHeight), ne_.roman20, jm_.button_152, -125, be_.text_cancel);
        super._f.a865(this._r);
        super._f.a865(this._n);
    }
    
    static {
        ce_.snakes = "Snakes";
        ce_.create_password_tooltip = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        ce_.achievement_names = new String[] { "Goblin Chieftain", "Orc Warlord", "Raider Newt", "Raider Lizard", "Raider Drake", "Raider Dragon", "Feared Raider", "Heroic Raider", "Defender Newt", "Defender Lizard", "Defender Drake", "Defender Dragon", "Vengeful Dragon", "Tyrannical Dragon", "Cartographer", "Renowned Dragon", "Persistence", "Price of Greed", "Bounty Hunter", "Great Raider", "Great Defender", "Plunder", "Consummate Dragon", "Glorious Raider", "Glorious Defender", "Gold Standing", "Dragon's Engineering", "Dragon's Empathy", "Draconic Heist", "Ransack", "Arcane Mastery", "Majestic Raider", "Majestic Defender", "Platinum Standing", "Dragon's Determination", "Dragon's Scheming", "Dragon's Daring", "Dragon's Triumph", "Aristocrat", "Dragon's Wrath", "Dragon's Hoard", "Dragon's Riches", "Creature of Habit", "Dungeon Assault Bronze", "Dungeon Assault Silver", "Dungeon Assault Gold" };
        ce_.titles_purchased = new String[] { "<%0> the Black", "<%0> the White", "<%0> the Good", "<%0> the Evil", "<%0> Flameclaw", "<%0> Ironscale", "<%0> Orcbane", "<%0> the Ascendant", "<%0> the Wanderer", "<%0>, Winged Terror", "<%0> the Deceitful", "<%0>, Disciple of Night", "<%0>, Servant of Dawn", "<%0> Demonfire", "<%0>, Kindler of Hatred", "<%0>, Agent of Malice" };
    }
}
