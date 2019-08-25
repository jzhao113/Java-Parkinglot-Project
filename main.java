
public class main {
	
	public static void main(String[]args)
	{
		//Creating a parking lot
		parkingLot parkingLot = new parkingLot();
		
		//Creating cars ranging from small, medium and large
		smallCar sc = new smallCar("Toyota","390294");
		smallCar sc2 = new smallCar("Honda","ASI323I");
		smallCar sc3 = new smallCar("NotAHonda","2949S4D");
		smallCar sc4 = new smallCar("Toyota","39042294");
		smallCar sc5 = new smallCar("Honda","ASI32342I");
		smallCar sc6 = new smallCar("NotAHonda","294944S4D");
		smallCar sc7 = new smallCar("Toyota","390293324");
		smallCar sc8 = new smallCar("Honda","ASI32423I");
		smallCar sc9 = new smallCar("NotAHonda","294349S4D");
		smallCar sc10 = new smallCar("Toyota","390242494");
		smallCar sc11 = new smallCar("Honda","ASI324223I");
		smallCar sc12= new smallCar("NotAHonda","294924S4D");
		smallCar sc13 = new smallCar("Toyota","39022494");
		smallCar sc14= new smallCar("Honda","ASI32423I");
		smallCar sc15= new smallCar("NotAHonda","2922449S4D");
		smallCar sc16 = new smallCar("Toyota","390242494");
		smallCar sc17 = new smallCar("Honda","ASI322423I");
		smallCar sc18= new smallCar("NotAHonda","2949S134D");
		smallCar sc19 = new smallCar("Toyota","39021494");
		smallCar sc20= new smallCar("Honda","ASI32133I");
		smallCar sc21= new smallCar("NotAHonda","294149S4D");
		
		mediumCar mc = new mediumCar("Kia","393lD44");
		mediumCar mc2 = new mediumCar("Honda","394kkdk");
		mediumCar mc3 = new mediumCar("Toyoya","324231");
		largeCar lc = new largeCar("Honda","D3049DK");
		
		largeCar lc2 = new largeCar("Big Car","3324123D4");
		largeCar lc3 = new largeCar("Big Honda","32423D42");
		largeCar lc4 = new largeCar("Herro","3245de23");
		
		//Parking the cars in the the parking lot
		parkingLot.parkACar(sc,5);
		parkingLot.parkACar(sc2,4 );
		parkingLot.parkACar(sc3,342);
		parkingLot.parkACar(sc4,900);
		parkingLot.parkACar(sc5,49);
		parkingLot.parkACar(sc6,61);
		parkingLot.parkACar(sc7,55);
		parkingLot.parkACar(sc8,87);
		parkingLot.parkACar(sc9,98);
		parkingLot.parkACar(sc10,104);
		parkingLot.parkACar(sc11,31 );
		parkingLot.parkACar(sc12,98);
		parkingLot.parkACar(sc13,33);
		parkingLot.parkACar(sc14,42);
		parkingLot.parkACar(sc15,42);
		parkingLot.parkACar(sc16,11);
		parkingLot.parkACar(sc17,44 );
		parkingLot.parkACar(sc18,30);
		parkingLot.parkACar(sc19,55);
		parkingLot.parkACar(sc20,43 );
		parkingLot.parkACar(mc,60);
		parkingLot.parkACar(mc2,424 );
		parkingLot.parkACar(mc3,34 );
		parkingLot.parkACar(lc, 10);
		parkingLot.parkACar(lc2,134 );
		parkingLot.parkACar(lc3,123 );
		parkingLot.parkACar(lc4,350 );
		System.out.println("");
		
		//Checking the status of a smallCar 'sc'
		parkingLot.checkStatusofCar(sc);
		
		//Sorting the minutes from least to greatest
		parkingLot.sortMinutes();
		
		//Getting the spot location of smallCar 'sc'
		parkingLot.getSpot(sc);
		
		//Getting the ledger of the parkingLot
		parkingLot.showLedger();
		
		//Getting the bill for largeCar 'lc';
		parkingLot.getBill(lc);
		
		//Getting the number of open spots left for cars
		parkingLot.showAllOpenSpots();
		
		//Trying to add a 21st (sc21) small car to already full small car lot
		parkingLot.parkACar(sc21, 342);
		
		//Removing a car
		parkingLot.removeCar(sc);
		
		//Adding sc21 to the lot since sc was removed, thus freed up a spot
		parkingLot.parkACar(sc21, 48);
		System.out.println("");
		
		//Show price for per hour by type of car
		parkingLot.showPrice("small");
		parkingLot.showPrice("medium");
		parkingLot.showPrice("large");
		
		//Getting the makes of all cars in parkingLot
		parkingLot.getMake();
		
	}
}
