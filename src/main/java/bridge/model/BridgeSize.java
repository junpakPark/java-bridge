package bridge.model;

import bridge.Error;

public class BridgeSize {
	private final int bridgeSize;

	public BridgeSize(int value) {
		validateRange(value);
		this.bridgeSize = value;
	}

	public int getSize() {
		return bridgeSize;
	}

	private void validateRange(int value) {
		if (!isInRange(value)) {
			throw new IllegalArgumentException(Error.RANGE.getMessage());
		}
	}

	private static boolean isInRange(int value) {
		return 3 <= value && value <= 20;
	}
}
