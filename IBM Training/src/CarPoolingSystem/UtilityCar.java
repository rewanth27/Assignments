package CarPoolingSystem;

public class UtilityCar extends Car
{
  private boolean rearCoolingVents;

  public UtilityCar(boolean rearCoolingVents, Long id, String name)
  {
	super(id,name);
	this.rearCoolingVents = rearCoolingVents;
  }
  public boolean getRearCoolingVents()
  {
	  return rearCoolingVents;
  }
  public void setRearCoolingVents(boolean rearCoolingVents)
  {
	  this.rearCoolingVents=rearCoolingVents;
  }
  @Override
  public double calculateDriveCost(double km)
  {
	 return 18*km;
  }
  
}
