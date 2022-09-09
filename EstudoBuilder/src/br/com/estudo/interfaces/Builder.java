package br.com.estudo.interfaces;

import br.com.estudo.dominio.Engine;
import br.com.estudo.dominio.GPSNavigator;
import br.com.estudo.dominio.TripComputer;
import br.com.estudo.enums.CarType;
import br.com.estudo.enums.Transmission;

public interface Builder {
	
	 void setCarType(CarType type);
	    void setSeats(int seats);
	    void setEngine(Engine engine);
	    void setTransmission(Transmission transmission);
	    void setTripComputer(TripComputer tripComputer);
	    void setGPSNavigator(GPSNavigator gpsNavigator);

}
