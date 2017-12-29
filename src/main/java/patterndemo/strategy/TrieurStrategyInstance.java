package patterndemo.strategy;

import java.util.List;

public class TrieurStrategyInstance<T>{
	MyComparator<T> comparator;

	public TrieurStrategyInstance(MyComparator<T> comparator) {
		this.comparator = comparator;
	}

	public void bubbleSort(List<T> arr) {
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