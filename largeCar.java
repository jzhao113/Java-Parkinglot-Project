
public class largeCar extends car{
	
	public largeCar()
	{
		super();
		setSize();
	}
	
	public largeCar(String make, String plate)
	{
		super(make,plate);
		setSize();
	}
	
	public void setSize()
	{
		size="large";
	}
}
