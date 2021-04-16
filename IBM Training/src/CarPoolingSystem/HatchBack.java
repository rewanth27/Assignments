package CarPoolingSystem;

public class HatchBack extends Car 
{
  private boolean powerWindowsEnabled;
  private boolean automaticGear;
  
  public HatchBack(boolean powerWindowsEnabled, boolean automaticGear,Long id, String name)
  {
	super(id,name);
	this.powerWindowsEnabled = powerWindowsEnabled;
	this.automaticGear = automaticGear;
  }
  

 public boolean getPowerWindowsEnabled() 
 {
	return powerWindowsEnabled;
 }


 public void setPowerWindowsEnabled(boolean powerWindowsEnabled) 
 {
	this.powerWindowsEnabled = powerWindowsEnabled;
 }


 public boolean getAutomaticGear() 
 {
	return automaticGear;
 }


 public void setAutomaticGear(boolean automaticGear) 
 {
	this.automaticGear = automaticGear;
 }


@Override
  public double calculateDriveCost(double km)
  {
	  if(getAutomaticGear()==true)
	  {
		  return 12*km;
	  }
	  else
	  {
		  return 10*km;
	  }
	  
  }

}
