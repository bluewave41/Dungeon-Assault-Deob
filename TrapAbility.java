
public enum TrapAbility {
	MINUS_ATTACK(0),
	MINUS_DEFENCE(1),
	SKELETON_SENTINELS(2),
	RAISE_DETECT_ADJACENT(5),
	VAMPIRE_LORD(6),
	TERRORIZE(7),
	RAISE_DETECT(9),
	DETECT_RAISE_2(10),
	PIT(11),
	BOTTOMLESS_PIT(12),
	TELEPORT(13),
	HIDDEN_DARTS(14),
	CORROSIVE_SLIME(15),
	ARMORED(17);
	
	private int value;
	
	TrapAbility(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
