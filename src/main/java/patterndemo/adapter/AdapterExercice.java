package patterndemo.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class AdapterExercice {

	public static class Invariants {

		private static Enumeration<Integer> createEnumeration() {
			final Integer[] values = { 1, 2, 3, 4, 5 };
			return new Enumeration<Integer>() {
				private int idx = 0;

				@Override
				public Integer nextElement() {
					return values[idx++];
				}

				@Override
				public boolean hasMoreElements() {
					return idx < values.length;
				}
			};
		}

		static Integer somme(Iterator<Integer> valeurs) {
			Integer result = 0;
			while (valeurs.hasNext()) {
				Integer integer = valeurs.next();
				if (integer != 0) {
					result += integer;
				}
			}
			return result;
		}
	}


	public static void main(String[] args) {
		Enumeration<Integer> enumeration = Invariants.createEnumeration();
		// Comment faire? pour appeller le code suivant? (peut être en changeant "enumeration", mais c'est tout)
		// Integer somme = Invariants.somme(enumeration);
		// System.out.println("t:" + somme);
	}

}
