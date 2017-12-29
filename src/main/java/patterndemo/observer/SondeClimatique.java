package patterndemo.observer;

public class SondeClimatique {
	private double temperature;
	public double getHumidite() {
		return humidite;
	}

	private double humidite;
	public double getTemperature() {
		return temperature;
	}


	public void mesure() {
		try {
			// 2 raisons d'attendre:
			// - ça ordonne la sortie rendant l'exemple plus compréhensible
			// - ça donne l'impression d'un truc complexe.
			Thread.sleep(300);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // Quand on utilise Thread, il y a plein de conséquences compliquées.
		}
		this.temperature = Math.random();
		this.humidite = Math.random();
		notifyObservers();
	}


	protected void notifyObservers() {
		// je ne suis pas un observable... mais si vous héritez de cette classe vous pouvez en faire une version observable.
		// et pas besoin de toucher au fichier existant.

	}




}

