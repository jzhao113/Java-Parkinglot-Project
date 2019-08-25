import java.util.*;
public class parkingLot {
	
	public static car[][]parkingLot= new car [6][10];
	public static ArrayList<parkedCar> minutesList = new ArrayList();
	public static int ledger=0;
	
	//So 01 are SC 23 are MC 45 LC
	
	public parkingLot()
	{
		
	}
	
	public void parkACar(car c, int minutes)
	{
		parkedCar pk = new parkedCar(c,minutes);
		pk.parkTheCar();
		minutesList.add(pk);
	}
	public void checkStatusofCar(car c)
	{
		minutesList.stream()
		.filter(e -> (e.getPlate().equals(c.getPlate())))
		.forEach(p -> System.out.println("Status\nPlate:"+p.getPlate()+"\nMinutes Bought: "+p.getMinutes()+"\n"));
	}
	
	public void removeCar(car c)
	{
		removeTheCar rc = new removeTheCar(c);
		rc.carRemoval();
		System.out.println("Car with Plate:"+c.getPlate()+" has been removed\n");
	}
	
	public void updateMins(int add, car c)
	{
		minutesList.stream()
		.filter( e -> (e.getPlate().equals(c.getPlate())))
		.forEach(p -> p.addMinutes(add));
		
		minutesList.stream()
		.filter( e -> (e.getPlate().equals(c.getPlate())))
		.forEach(p->System.out.println("Car with Plate: "+c.getPlate()+" has been updated to "+p.getMinutes()+"\n"));
		
	}
	
	public void getSpot(car c)
	{
		minutesList.stream()
		.filter( e -> (e.getPlate().equals(c.getPlate())))
		.forEach(p -> p.showSpace());
	}
	
	public void sortMinutes()
	{
		sortMinutes sm = new sortMinutes(minutesList);
		sm.sort();
		sm.showList();
	}
	
	public void giveDiscount(car c,double discount)
	{
		minutesList.stream()
		.filter( e -> (e.getPlate().equals(c.getPlate())))
		.forEach(p -> p.giveDiscount(discount));
	}
	
	public void getBill(car c)
	{
		minutesList.stream()
		.filter( e -> (e.getPlate().equals(c.getPlate())))
		.forEach(p -> System.out.printf("The bill for plate "+c.getPlate()+" is "+"$%.2f\n\n",p.getBill()));
	}
	
	public void showLedger()
	{
		System.out.println("Money made: $"+ledger+"\n");
	}
	
	public void showPrice(String x)
	{
		if(x.equals("small"))
			System.out.println("The price per hour is $12 for a small car\n");
		else if(x.equals("medium"))
			System.out.println("The price per hour is $15 for a medium car\n");
		else
			System.out.println("The price per hour is $18 a large car\n");
	}
	
	public void getMake()
	{
		minutesList.stream()
		.forEach(e -> System.out.println("The make for plate: "+e.getPlate()+" is "+e.getMake()));
	}
	
	public void showAllOpenSpots()
	{
		int smallSpots=0;
		int mediumSpots=0;
		int largeSpots=0;
		System.out.println("Spots that are a free");
		for(int b=0;b<10;b++)
		{
			for(int a=0;a<2;a++)
			{
				if(parkingLot[a][b]==null)
					smallSpots++;
			}
			for(int a=2;a<4;a++)
			{
				if(parkingLot[a][b]==null)
					mediumSpots++;
				
			}
			for(int a=4;a<6;a++)
			{
				if(parkingLot[a][b]==null)
					largeSpots++;
				
			}
		}
		
		System.out.println("There are a total of "+smallSpots+" spots left for small cars.");
		System.out.println("There are a total of "+mediumSpots+" spots left for medium cars.");
		System.out.println("There are a total of "+largeSpots+" spots left for large cars.\n");
	}
}
