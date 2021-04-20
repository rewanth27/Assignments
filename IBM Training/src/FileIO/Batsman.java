package FileIO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Batsman implements Serializable
{
  private int id;
  private String name;
  private int innings;
  private int totalRuns;
public Batsman(int id, String name, int innings, int totalRuns) 
{
	this.id = id;
	this.name = name;
	this.innings = innings;
	this.totalRuns = totalRuns;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getInnings() {
	return innings;
}
public void setInnings(int innings) {
	this.innings = innings;
}
public int getTotalRuns() {
	return totalRuns;
}
public void setTotalRuns(int totalRuns) {
	this.totalRuns = totalRuns;
}
@Override
public String toString() {
	return "[id=" + id + ", name=" + this.name + ", innings=" + innings + ", totalRuns=" + totalRuns + "]";
}
  
}
