package patterndemo.strategy;

import java.util.List;

public class TrieurStrategyMethod {

	<T> void bubbleSort(List<T> arr, MyComparator<T> comparator) {
		int n = arr.size();
		T temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (comparator.compare(arr.get(j - 1), arr.get(j))) {
					// swap elements
					temp = arr.get(j - 1);
					arr.set(j - 1, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
	}

}