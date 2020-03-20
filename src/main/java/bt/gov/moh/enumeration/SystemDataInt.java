package bt.gov.moh.enumeration;

public enum SystemDataInt {
	MESSAGE_STATUS_SUCCESSFUL(1),
	MESSAGE_STATUS_UNSUCCESSFUL(0),
	MESSAGE_STATUS_WARNING(2),
	MESSAGE_STATUS_APPROVAL(3),
	MESSAGE_STATUS_REJECT(4),
	MESSAGE_STATUS_CONFIRMED(4);
	
	private final int value;
	
	private SystemDataInt(int value) {
		this.value = value;
	}
	
	public int value() {
		return value;
	}
} 