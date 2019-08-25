
public class smallCar extends car{
	
	public smallCar()
	{
		super();
		setSize();
	}
	
	public smallCar(String make, String plate)
	{
		super(make,plate);
		setSize();
	}
	
	public void setSize()
	{
		size="small";
	}
	public String toString()
	{
		return "This is a small car";
	}
}
