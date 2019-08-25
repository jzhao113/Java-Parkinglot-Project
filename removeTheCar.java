
public class removeTheCar {
	
	private car c;
	
	public removeTheCar(car c)
	{
		this.c=c;
	}
	
	public void carRemoval()
	{
		removeFromLot();
		// parkingLot.minutesList.remove(parkingLot.minutesList.stream()
		//		.filter( e -> e.getPlate().equals(c.getPlate())).toArray()[0]);
		parkingLot.minutesList.removeIf(e -> (e.getPlate().equals(c.getPlate())));
	}
	
	private void removeFromLot()
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
		
		remove:
		for(int a=bound1;a<bound2;a++)
		{
			for(int b=0;b<10;b++)
			{
				if(parkingLot.parkingLot[a][b].getPlate().equals(c.getPlate()))
				{
					parkingLot.parkingLot[a][b]=null;
					break remove;
				}
			}
			if(a==bound2-1)
				System.out.println("That car cannot be found. No car removed from parkingLot.");
		}
	}
}
