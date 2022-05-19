package alerter;

public class LEDAlert implements IAlerter {

	private boolean isLedGlows;

	public boolean ledGlows() {
		return isLedGlows;
	}

	@Override
	public void doAlert() {
		isLedGlows = true;
	}
}
