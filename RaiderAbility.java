
public enum RaiderAbility {
	PIT_IMMUNITY(1),
	REVIVE(2),
	RETREAT(3),
	FEROCITY(8),
	THIEVERY(10),
	FIRST_STRIKE(11),
	FRAGILITY(12),
	RECONNOITRE(13), 
	ARMORED(14),
	SCOUT(15),
	DARK_ARTS(16),
	MASTER_OF_CHAOS(18),
	GIFT_OF_THE_TREES(19),
	OFFERING(21),
	CIRCUMVENT(22),
	GLAMOUR(24),
	INTIMIDATE(25),
	FIRE_IMMUNITY(26),
	FICKLE(27);
	
	private int value;
	
	RaiderAbility(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
