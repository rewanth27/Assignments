package FileIO;

import java.io.Serializable;

public class Car implements Serializable
{
	private transient String registrationNumber;
	private String carMake;
	private Engine engine;

	public Car(String registrationNumber, String carMake, Engine engine) 
	{	
		this.registrationNumber = registrationNumber;
		this.carMake = carMake;
		this.engine = engine;
	}

	public String getRegistrationNumber() 
	{
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) 
	{
		this.registrationNumber = registrationNumber;
	}

	public String getCarMake() 
	{
		return carMake;
	}

	public void setCarMake(String carMake) 
	{
		this.carMake = carMake;
	}

	public Engine getEngine()
	{
		return engine;
	}

	public void setEngine(Engine engine)
	{
		this.engine = engine;
	}

	@Override
	public String toString()
	{
		return "Car [registrationNumber=" + registrationNumber + ", carMake=" + carMake + ", engine=" + engine + "]";
	}

}
