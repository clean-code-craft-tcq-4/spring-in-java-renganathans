package alerter;

public class EmailAlert implements IAlerter {

	private boolean isMailSent;

	public boolean emailSent() {
		return isMailSent;
	}

	@Override
	public void doAlert() {
		isMailSent = true;
	}
}
