package patterndemo.singleton;

import java.util.stream.IntStream;

public class SingletonDemo {

	public static void main(String[] args) {
		runParallel(SimpleSingleton::getInstance);
		runParallel(EagerSingleton::getInstance);
		runParallel(DoubleCheckSingleton::getInstance);
		runParallel(BillPughSingleton::getInstance);
	}

	private static void runParallel(java.util.function.Supplier<Object> supplier) {
		long start = System.currentTimeMillis();
		long differents = IntStream.iterate(0, i->i+1).limit(1000).parallel().mapToObj(i->supplier.get()).distinct().count();
		long stop = System.currentTimeMillis();
		System.out.println("en "+(stop-start-1000)+" instances:"+differents);
	}
	public static void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}

}
