package patterndemo.observer;

public class StderrConsoleWheatherDisplay {
	public void sortieConsole(SondeClimatique observableSondeClimatique) {
		System.err.println("Humidité:"+observableSondeClimatique.getHumidite()+", Temperature"+observableSondeClimatique.getTemperature());
	}
}
