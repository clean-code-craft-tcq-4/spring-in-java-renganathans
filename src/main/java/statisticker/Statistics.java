package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics {

	public static Stats getStatistics(List<Float> numbers) {
		return new Statistics().new Stats(numbers);
	}

	class Stats {
		private float average;
		private float min;
		private float max;

		public float getAverage() {
			return average;
		}

		public float getMin() {
			return min;
		}

		public float getMax() {
			return max;
		}

		public Stats(List<Float> numbers) {
			if (!numbers.isEmpty()) {
				findAverage(numbers);
				findMin(numbers);
				findMax(numbers);
			} else {
				average = Float.NaN;
				min = Float.NaN;
				max = Float.NaN;
			}
		}

		void findAverage(List<Float> numbers) {
			float sum = 0;
			for (Float number : numbers) {
				sum += number;
			}
			average = sum / numbers.size();
		}

		void findMin(List<Float> numbers) {
			min = Collections.min(numbers);
		}

		void findMax(List<Float> numbers) {
			max = Collections.max(numbers);
		}
	}
}
