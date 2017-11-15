
public class main {

	public static void main(String[] args) {

		Garage garage = new Garage();

		Car v1 = new Car("Ford", "Focus", 2001, true, "Blue");
		Motorcycle v2 = new Motorcycle("Harley", "GoodOne", 1977, true, "ThereIsExtraDamageOnTheSeat");
		Car v3 = new Car("Renault", "Clio", 2011, true, "Silver");
		Tank v4 = new Tank("General Dynamics", "M1 Series", 2015, false, true);
		Motorcycle v5 = new Motorcycle("Harley", "NotAsGood", 1992, true, "CrapBike");
		Tank v6 = new Tank("General Dynamics2", "M1 Series2", 2016, false, false);

		garage.addVehicle(v1);
		garage.addVehicle(v2);
		garage.addVehicle(v3);
		garage.addVehicle(v4);
		garage.addVehicle(v5);
		garage.addVehicle(v6);
		System.out.println("Added 6 vehicles");

		garage.valuesInArray();
		System.out.println("");

		System.out.println("Repair Bill 1");
		System.out.println(garage.repairBill(v1));
		System.out.println("");

		System.out.println("Repair Bill 2");
		System.out.println(garage.repairBill(v2));
		System.out.println("");

		System.out.println("Repair Bill 3");
		System.out.println(garage.repairBill(v4));
		System.out.println("");

		System.out.println("Remove 1 vehicle");
		garage.removeVehicle(v4);

		garage.valuesInArray();
		System.out.println("");

		System.out.println("Remove all Motorcycles types");
		garage.removeVehicle("Car");

		garage.valuesInArray();
		System.out.println("");

		System.out.println("Empty Array");
		garage.removeAllVehicles();

		garage.valuesInArray();
		System.out.println("done");

	}
}
