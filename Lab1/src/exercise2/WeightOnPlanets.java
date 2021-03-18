package exercise2;
import java.util.ArrayList;
import exercise1.WeightOnMars;

public class WeightOnPlanets {
		
	private ArrayList<WeightOnMars> weightList = new ArrayList<WeightOnMars>();
	
	public void addEarthWeight(double earthWeight)
	{
		WeightOnMars weightOnMars = new WeightOnMars();
		weightOnMars.setEarthWeight(earthWeight);
		weightList.add(weightOnMars);		
	}
	
	public void addMarsWeight(double marsWeight)
	{
		WeightOnMars weightOnMars = new WeightOnMars();
		weightOnMars.setMarsWeight(marsWeight);
		weightList.add(weightOnMars);
	}
	
	public double getEarthWeight(int index)
	{
		return weightList.get(index).getEarthWeight();
	}
	
	public double getMarsWeight(int index)
	{
		return weightList.get(index).getMarsWeight();
	}
	
	public void delete()
	{
		weightList.remove(weightList.size()-1);
	}
	
	public void delete(int index)
	{
		weightList.remove(index);
	}
	
	public void modifyEarthWeight(int index, double earthWeight)
	{
		WeightOnMars weightOnMars = new WeightOnMars();
		weightOnMars.setEarthWeight(earthWeight);
		weightList.set(index, weightOnMars);
	}
	
	public void modifyMarsWeight(int index, double marsWeight)
	{
		WeightOnMars weightOnMars = new WeightOnMars();
		weightOnMars.setMarsWeight(marsWeight);
		weightList.set(index, weightOnMars);
	}
	
	public boolean isEmpty()
	{
		return weightList.isEmpty();
	}
}






