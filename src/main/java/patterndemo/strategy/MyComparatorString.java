package patterndemo.strategy;

public class MyComparatorString implements MyComparator<String>{
	@Override
	public boolean compare(String t, String t2) {
		return t.compareTo(t2)>0;
	}
}