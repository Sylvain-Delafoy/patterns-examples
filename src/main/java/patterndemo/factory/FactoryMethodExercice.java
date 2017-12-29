package patterndemo.factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Essayons de démontrer la rapidité de quelques Listes.
 */
public class FactoryMethodExercice {
	private static final int BENCHMARK_SIZE = 100000;

	void benchmark() {
		this.timeToForWithCounter();
		this.timeToForWithIterator();
		this.timeInsertInFront();
		this.timeInsertInBack();
	}

	private long timeToForWithCounter(){
		List<Integer> listOfElements = new ArrayList<>();
		initialize(listOfElements);
		long start = System.nanoTime();
		long sum=0;
		for (int i = 0; i < listOfElements.size(); i++) {
			Integer element = listOfElements.get(i);
			sum+=element;
		}
		long stop = System.nanoTime();
		presentResults(sum, listOfElements, start, stop);
		return sum;
	}
	private long timeToForWithIterator(){
		List<Integer> listOfElements = new ArrayList<>();
		initialize(listOfElements);
		long start = System.nanoTime();
		long sum=0;
		for (Integer element : listOfElements) {
			sum+=element;
		}
		long stop = System.nanoTime();
		presentResults(sum, listOfElements, start, stop);
		return sum;
	}
	private void timeInsertInFront() {
		List<Integer> listOfElements = new ArrayList<>();
		long start = System.nanoTime();
		for (int i = 0; i < BENCHMARK_SIZE; i++) {
			listOfElements.add(0, i);
		}
		long stop = System.nanoTime();
		presentResults(listOfElements.size(), listOfElements, start, stop);
	}
	private void timeInsertInBack() {
		List<Integer> listOfElements = new ArrayList<>();
		long start = System.nanoTime();
		for (int i = 0; i < BENCHMARK_SIZE; i++) {
			listOfElements.add(i);
		}
		long stop = System.nanoTime();
		presentResults(listOfElements.size(), listOfElements, start, stop);
	}
	private void initialize(List<Integer> listOfElements) {
		for(int j=0; j<BENCHMARK_SIZE ; j++) {
			listOfElements.add(j);
		}
	}

	private void presentResults(long sum, List<Integer> listOfElements, long start, long stop) {
		System.out.printf("%20s result: %15s in %15s", listOfElements.getClass().getName(),sum, (stop-start));
		System.out.println();
	}
	public static void main(String[] args) {
		FactoryMethodExercice arrayListBenchmark = new FactoryMethodExercice();
		arrayListBenchmark.benchmark();
		//Zut, comment réutiliser le code de ce benchmark au maximum pour tester plutot avec une LinkedList
		// et un Vector ?
	}

}
