
public enum TrapOutcome {
	DISARMED(36864),
	TRIGGERED(20480);
	
	private int value;
	
	TrapOutcome(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
