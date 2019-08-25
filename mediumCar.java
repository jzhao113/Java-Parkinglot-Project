
public class mediumCar extends car{
	
	public mediumCar()
	{
		super();
		setSize();
	}
	
	public mediumCar(String make, String plate)
	{
		super(make,plate);
		setSize();
	}
	
	public void setSize()
	{
		size="medium";
	}

}
