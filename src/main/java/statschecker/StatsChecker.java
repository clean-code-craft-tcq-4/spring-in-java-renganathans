package statschecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import alerter.IAlerter;

public class StatsChecker {

	private List<IAlerter> listOfalerter = new ArrayList<IAlerter>();

	private float maxThreshold;

	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		if (alerters != null)
			listOfalerter = Arrays.asList(alerters);
		this.maxThreshold = maxThreshold;
	}

	public void checkAndAlert(List<Float> numberList) {
		if (numberList != null) {
			for (Float number : numberList) {
				if (number > maxThreshold) {
					for (IAlerter alerter : listOfalerter) {
						alerter.doAlert();
					}
				}
			}
		}
	}
}

