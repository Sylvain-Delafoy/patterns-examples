package patterndemo.strategy;

public class MyComparatorInt implements MyComparator<Integer>{
	@Override
	public boolean compare(Integer t, Integer t2) {
		return t > t2;
	}
}