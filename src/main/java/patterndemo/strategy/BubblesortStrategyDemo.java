package patterndemo.strategy;

import java.util.Arrays;

public class BubblesortStrategyDemo {
	public static void main(String[] args) {
		System.out.println("=======");
		// Ceci est une utilisation bien trop simple d'une template method. Essayez avec TemplateMethodExercice.java plutot
		{
			TrieurTemplateMethod<Integer> trieurTemplateMethodInt = new TrieurTemplateMethodInt();
			Integer arr2[] = mkIntArray();
			System.out.println("Array Before Bubble Sort Template Method"+Arrays.toString(arr2));
			trieurTemplateMethodInt.bubbleSort(Arrays.asList(arr2));
			System.out.println("Array After Bubble Sort" +Arrays.toString(arr2));

			String strs1[] = mkStringArray();
			System.out.println("Array Before Bubble Sort Template Method"+Arrays.toString(strs1));
			new TrieurTemplateMethodString().bubbleSort(Arrays.asList(strs1));
			System.out.println("Array After Bubble Sort " +Arrays.toString(strs1));
		}

		System.out.println("=======");
		{
			TrieurStrategyMethod trieurGeneral = new TrieurStrategyMethod();
			final Integer[] ints = mkIntArray();
			System.out.println("Array Before Bubble Sort Strategy in method"+Arrays.toString(ints));
			trieurGeneral.bubbleSort(Arrays.asList(ints), new MyComparatorInt());
			System.out.println("Array After Bubble Sort "+Arrays.toString(ints));

			String strs[] = mkStringArray();
			System.out.println("Array Before Bubble Sort Strategy in method"+Arrays.toString(strs));
			trieurGeneral.bubbleSort(Arrays.asList(strs), new MyComparatorString());
			System.out.println("Array After Bubble Sort " +Arrays.toString(strs));
		}

		System.out.println("=======");
		{
			String strs[] = mkStringArray();
			TrieurStrategyInstance<String> trieurDeStrings = new TrieurStrategyInstance<>(new MyComparatorString());
			System.out.println("Array Before Bubble Sort Strategy in instance"+Arrays.toString(strs));
			trieurDeStrings.bubbleSort(Arrays.asList(strs));
			System.out.println("Array After Bubble Sort " +Arrays.toString(strs));

			Integer ints[] = mkIntArray();
			TrieurStrategyInstance<Integer> trieurDeInts = new TrieurStrategyInstance<>(new MyComparatorInt());
			System.out.println("Array Before Bubble Sort Strategy in instance"+Arrays.toString(ints));
			trieurDeInts.bubbleSort(Arrays.asList(ints));
			System.out.println("Array After Bubble Sort " +Arrays.toString(ints));
		}

		System.out.println("=======");
		{
			Integer arr1[] = mkIntArray();
			System.out.println("Array Before Max Search (reuse)"+Arrays.toString(arr1));

			Integer findMax = MaxerWithStrategy.findMax(Arrays.asList(arr1),
					new MyComparatorInverse<>(new MyComparatorInt()));
			System.out.println("max:" + findMax);
		}
	}


	private static String[] mkStringArray() {
		return new String[] { "Sylvain", "Lea", "Mourad", "Denis" };
	}

	private static Integer[] mkIntArray() {
		return new Integer[] { 3, 60, 35, 2, 45, 320, 5 };
	}
}
