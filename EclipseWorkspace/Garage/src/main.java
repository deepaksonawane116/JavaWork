
public class main {

	public static void main(String[] args) {

		Garage garageManager = new Garage();

		Car vehicle1 = new Car("Ford", "Focus", 2001, true, "Blue");
		Motorcycle vehicle2 = new Motorcycle("Harley", "GoodOne", 1977, true, "ThereIsExtraDamageOnTheSeat");
		Car vehicle3 = new Car("Renault", "Clio", 2011, true, "Silver");
		Tank vehicle4 = new Tank("General Dynamics", "M1 Series", 2015, false, true);
		Motorcycle vehicle5 = new Motorcycle("Harley", "NotAsGood", 1992, true, "CrapBike");
		Tank vehicle6 = new Tank("General Dynamics2", "M1 Series2", 2016, false, false);

		garageManager.addVehicle(vehicle1);
		garageManager.addVehicle(vehicle2);
		garageManager.addVehicle(vehicle3);
		garageManager.addVehicle(vehicle4);
		garageManager.addVehicle(vehicle5);
		garageManager.addVehicle(vehicle6);
		System.out.println("Added 6 vehicles");

		garageManager.valuesInArray();
		System.out.println("");

		System.out.println("Repair Bill 1");
		System.out.println(garageManager.repairBill(vehicle1));
		System.out.println("");

		System.out.println("Repair Bill 2");
		System.out.println(garageManager.repairBill(vehicle2));
		System.out.println("");

		System.out.println("Repair Bill 3");
		System.out.println(garageManager.repairBill(vehicle4));
		System.out.println("");

		System.out.println("Remove 1 vehicle");
		garageManager.removeVehicle(vehicle4);

		garageManager.valuesInArray();
		System.out.println("");

		System.out.println("Remove all Motorcycles types");
		garageManager.removeVehicle("Car");

		garageManager.valuesInArray();
		System.out.println("");

		System.out.println("Empty Array");
		garageManager.removeAllVehicles();

		garageManager.valuesInArray();
		System.out.println("done");

	}
}
