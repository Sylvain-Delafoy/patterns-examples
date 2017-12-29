package patterndemo.strategy.implementezmoi;

import java.util.ArrayList;
import java.util.List;

public class StrategyExercice {
	public static void main(String[] args) {
		List<Story> stories = new ArrayList<Story>();
		stories.add(new Story("changer le bouton en un bleu moins foncé", 5, Priorite.BASSE));
		stories.add(new Story("avoir un serveur web", 1, Priorite.HAUTE));
		stories.add(new Story("Payer impots", 1000, Priorite.BASSE));
		stories.add(new Story("Avoir un business plan", 1000, Priorite.HAUTE));
		stories.add(new Story("Ouvrir aux aux clients internationaux", 500, Priorite.MOYENNE));
		stories.add(new Story("Centraliser les logs", 5, Priorite.MOYENNE));

		// Si seulement, je pouvais les trier par Importance métier
		System.out.println("Par importance métier");
		for (Story story : stories) {
			System.out.println(story);
		}

		// Oh, et par priorité ensuite
		System.out.println("Par priorité métier");
		for (Story story : stories) {
			System.out.println(story);
		}

	}
}
