package patterndemo.strategy;

import java.util.List;

public abstract class TrieurTemplateMethod<T>{
	public void bubbleSort(List<T> arr) {
		int n = arr.size();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (compare(arr.get(j - 1), arr.get(j))) {
					// swap elements
					T temp = arr.get(j - 1);
					arr.set(j - 1, arr.get(j));
					arr.set(j, temp);
				}
			}
		}

	}

	protected abstract boolean compare(T t, T t2) ;
}