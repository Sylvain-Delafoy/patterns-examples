package patterndemo.strategy;

import java.util.List;

public class MaxerWithStrategy {
	public static <T> T findMax(List<T> list, MyComparator<T> comparator) {
		T candidate = list.get(0);

		for(int i=1; i< list.size(); i++) {
			T next = list.get(i);
			if (comparator.compare(next, candidate))
				candidate = next;
		}
		return candidate;
	}
}
