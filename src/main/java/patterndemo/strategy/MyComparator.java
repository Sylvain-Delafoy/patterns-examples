package patterndemo.strategy;

public interface MyComparator<T> {
	boolean compare(T t, T t2);
}