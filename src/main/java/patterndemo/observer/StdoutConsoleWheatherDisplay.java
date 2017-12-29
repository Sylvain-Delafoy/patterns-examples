package patterndemo.observer;

public class StdoutConsoleWheatherDisplay {
	public void affiche(SondeClimatique observableSondeClimatique) {
		System.out.println("Humidité:"+observableSondeClimatique.getHumidite()+", Temperature"+observableSondeClimatique.getTemperature());
	}
}
