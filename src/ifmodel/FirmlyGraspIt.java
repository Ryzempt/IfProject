package ifmodel;

public class FirmlyGraspIt
{
//data members
	private double distance;
	private String name;
	private int timeMinutes;
	private int timeHours;
	public String toString;
	
	/**
	 * Default constructor for after the fact customization.
	 * AKA I don't know the info yet.
	 */
	
	public FirmlyGraspIt()
	{
		this.distance = -99.99;
		this.name = "unnamed run";
		this.timeMinutes = -99;
		this.timeHours = -99;
				
	}
	/**
	 * Better Constructor when i know info for object.
	 * @param distance
	 */
	
	
	
	public FirmlyGraspIt(double distance)
	{
		this.distance = distance;
	}
	
	public double getDistance()
	{
		return distance;
	}
	public String getName()
	{
		return name;
	}
	public int getTimeHours()
	{
		return timeHours;
	}
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	
	
	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setTimeMinutes(int timeMinutes)
	{
		this.timeMinutes = timeMinutes;
	}
	public void setTimeHours(int hours)
	{
		this.timeHours = hours;
	}
	
	public String toString()
	{
		String description = "This is a Run!";
		description += " The Run is Named " + name;
		description += " and it took " + timeMinutes + " minutes to run";
		return description;
	}
	
	public void updateTime(int hours, int minutes)
	{
		
	}
}
