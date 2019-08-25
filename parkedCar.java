
import java.util.*;
public class parkedCar {
	
	private car c;
	private int minutes;
	private int mutipler;
	public double bill;
	private int space[] = new int[2];
	
	public parkedCar(car c, int minutes)
	{
		this.c=c;
		this.minutes=minutes;
		setBill(c);
		
	}
	
	public String getPlate()
	{
		return c.getPlate();
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public void addMinutes(int minutes)
	{
		this.minutes+=minutes;
		bill+=Math.ceil(minutes/60)*mutipler;
		parkingLot.ledger+=bill;
	}
	
	public void showSpace()
	{
		System.out.println("Car with plate "+c.getPlate()+" is parked at spot "+space[0]+","+space[1]+"\n");
	}
	
	public void setBill(car c)
	{
		if(c.getSize().equals("small"))
			mutipler=12;
		else if(c.getSize().equals("medium"))
			mutipler=15;
		else
			mutipler=18;
		bill=Math.ceil((double)minutes/60)*mutipler;
		parkingLot.ledger+=bill;
	}
	
	public double getBill()
	{
		return bill;
	}
	
	public void giveDiscount(double a)
	{
		tools c = (double x, double y) -> x-y;
		bill=c.update(bill, a);
	}
	
	public String getMake()
	{
		return c.getMake();
	}
	
	public void parkTheCar()
	{
		int bound1, bound2;
		if(c.getSize().equals("small"))
		{
			bound1=0;
			bound2=2;
		}
		else if(c.getSize().equals("medium"))
		{
			bound1=2;
			bound2=4;
		}
		else
		{
			bound1=5;
			bound2=7;
		}
		
		space=checkSpaces(bound1, bound2);
		
		if(space[0]<10)
		{
			parkingLot.parkingLot[space[0]][space[1]]=c;
			System.out.println("Plate: "+c.getPlate()+" was parked at spot "+space[0]+","+space[1]);
		}
		else
		{
			System.out.println("No spaces left for this type of car. Car not parked\n");
		}
	}

	
	
	
	
	private int[]checkSpaces(int bound1, int bound2)
	{
		int[]output = new int[2];
		checkSpaces:
		for(int a=bound1;a<bound2;a++)
		{
			for(int b=0;b<10;b++)
			{
				if(parkingLot.parkingLot[a][b]==null)
				{
					output[0]=a;
					output[1]=b;
					break checkSpaces;
				}
			}
			if(a==bound2-1)
			{
				output[0]=1000;
			}
		}
		
		return output;
	}

}
