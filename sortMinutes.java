import java.util.*;
public class sortMinutes {
	
	ArrayList<parkedCar>x=new ArrayList();
	public sortMinutes(ArrayList<parkedCar>x)
	{
		this.x=x;
	}
	
	public void sort()
	{
		int size = 0;
		for(int limit=0;limit<x.size();limit++)
		{
			parkedCar min = x.get(size);
			int location=limit;
			for(int a=size;a<x.size();a++)
			{
				if(x.get(a).getMinutes()<min.getMinutes())
				{
					min=x.get(a);
					location=a;
				}
			}
			
			parkedCar temp=x.get(limit);
			x.set(limit, min);
			x.set(location, temp);
			size++;
		}
	}
	
	public void showList()
	{
		System.out.println("Sorted from least to greatest minutes bought");
		for(parkedCar x:parkingLot.minutesList)
		{
			System.out.println("Plate: "+x.getPlate()+"\nMinutes Bought:"+x.getMinutes());
		}
		System.out.println("");
	}
}
