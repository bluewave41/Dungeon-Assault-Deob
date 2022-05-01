
public enum RaidAction {
	ADVANCE(0),
	CHARGE(1),
	FLEE(2);
	
	private int value;
	
	RaidAction(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
