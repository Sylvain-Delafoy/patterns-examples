package patterndemo.observer;

final class UnAutreAffichage {
	private void afficherEtat(SondeClimatique changed) {
		System.out.printf("Je suis un autre observer et j'ai vu: %f %f", changed.getHumidite(), changed.getTemperature());
		System.out.println();
	}

}