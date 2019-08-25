
public abstract class car {
	
	public String make;
	public String plate;
	public String size;
	
	
	public car()
	{
	}
	
	public car(String make, String plate)
	{
		this.make=make;
		this.plate=plate;
	}
	
	public void setMake(String make)
	{
		this.make=make;
	}
	
	public void setSize(String size)
	{
		this.size=size;
	}

	public void setPlate(String plate)
	{
		this.plate=plate;
	}
	
	public String getMake()
	{
		return make;
	}
	public String getPlate()
	{
		return plate;
	}
	public String getSize()
	{
		return size;
	}
	
	public abstract void setSize();
	
	
	
	
}
