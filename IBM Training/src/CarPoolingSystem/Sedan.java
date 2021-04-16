package CarPoolingSystem;

public class Sedan extends Car
{
  private boolean absEnabled;
  private Integer bootSpace;
  public Sedan(boolean absEnabled,Integer bootSpace, Long id, String name)
  {
	  super(id,name);
	  this.absEnabled=absEnabled;
	  this.bootSpace=bootSpace;
  }
  public boolean getAbsEnabled()
  {
	  return absEnabled;
  }
  public void setAbsEnabled(boolean absEnabled)
  {
	  this.absEnabled=absEnabled;
  }
  public Integer getBootSpace()
  {
	  return bootSpace;
  }
  public void setBootSpace(Integer bootSpace)
  {
	  this.bootSpace=bootSpace;
  }
  @Override
  public double calculateDriveCost(double km)
  {
	  if(getBootSpace()>600)
	  {
		  return (15*(20/100))*km;
	  }
	  else
		  return 15*km;
	  
  }
}
