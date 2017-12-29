package patterndemo.observer;

public class ObserverlessMain {
	public static void main(String[] args) throws InterruptedException {
		StdoutConsoleWheatherDisplay stdoutConsoleWheatherDisplay = new StdoutConsoleWheatherDisplay();
		StderrConsoleWheatherDisplay stderrConsoleWheatherDisplay = new StderrConsoleWheatherDisplay();
		SondeClimatique sonde = new SondeClimatique();
		sonde.mesure();
		stdoutConsoleWheatherDisplay.affiche(sonde);
		stderrConsoleWheatherDisplay.sortieConsole(sonde);
		Thread.sleep(300);
		sonde.mesure();
		stdoutConsoleWheatherDisplay.affiche(sonde);
		stderrConsoleWheatherDisplay.sortieConsole(sonde);
		//Que ce passe t'il si j'ajoute une sonde en plus je dois ajouter un affiche à chaque mesure?
		// Et si les mesures sont faites dans d'autres endroits du code, comment ne pas en oublier?

		// Et si on mettait les différents stdout dans mesure?
		// et bien soudainement la sonde climatique serait couplée à 2 afficheurs et à chaque nouvel affichage un nouveau couplage.

		// Il doit y avoir un meilleur moyen, et une fois ce moyen en place,
		// profitez en pour ajouter UnAutreAffichage et supprimer un affichage du départ entre deux mesures.
	}
}
