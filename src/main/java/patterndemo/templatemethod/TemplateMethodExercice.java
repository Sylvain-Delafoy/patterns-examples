package patterndemo.templatemethod;

import java.util.Arrays;

// Oh mon dieu, regardez tout ce code qui se ressemble au moins 2 boucles for, des sysouts avant et après...
// il doit être possible de rendre la méthode countSquirels de SquirelCounter concrete et d'y utiliser les méthodes commentées
public class TemplateMethodExercice {

	public static abstract class SquirelCounter {
		public abstract void countSquirels(String... items);
		// public abstract boolean canCount();
		// public abstract void notice();
		// public abstract String report(int count);
	}

	public static class DogVersion extends SquirelCounter {
		@Override
		public void countSquirels(String... items) {
			System.out.println("Grrrr!");
			// Les chiens n'ont pas à compter. Ils préfèrent s'économiser pour leur courrir après.
			// Indice, il faudrait un moyen pour dire à l'algo général de sauter la section en trop.
			// Et si c'était appelé hook?
			System.out.println("Ouaf!");
		}
	}

	public static class EnglishVersion extends SquirelCounter {
		@Override
		public void countSquirels(String... items) {
			System.out.println("Oh, squirels and stuff.");
			int count = 0;
			for (String string : items) {
				if(string.equalsIgnoreCase("squirel")) {
					count++;
				}
			}
			System.out.println("there are "+count+" squirels");
		}
	}

	public static class FrenchVersion extends SquirelCounter {
		public void countSquirels(String... items) {
			System.out.println("Tiens, des écureils entre autres choses");
			int count = 0;
			for (String string : items) {
				if(string.equalsIgnoreCase("squirel")) {
					count++;
				}
			}
			System.out.println("Il y a "+count+" écureuils");
		}
	}

	public static void main(String[] args) {
		for (SquirelCounter counter : Arrays.asList(new EnglishVersion(), new FrenchVersion(), new DogVersion())) {
			counter.countSquirels("squirel", "apple", "squirel", "book");
		}
	}
}
