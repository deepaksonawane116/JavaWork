import java.util.*;

public class Garage {

	static ArrayList<Vehicle> vehiclesInGarage = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicleToAdd) {
		vehiclesInGarage.add(vehicleToAdd);
	}

	public void removeVehicle(Vehicle vehicleToRemove) {
		vehiclesInGarage.remove(vehicleToRemove);
	}

	public void removeVehicle(String typeToRemove) {
		for (int i = 0; i < vehiclesInGarage.size(); i++) {
			if (vehiclesInGarage.get(i).type.equals(typeToRemove))
				vehiclesInGarage.remove(i);
		}
	}

	public void valuesInArray() {
		for (int i = 0; i < vehiclesInGarage.size(); i++) {
			System.out.println(vehiclesInGarage.get(i));
		}
	}

	public int repairBill(Vehicle vehicleToBill) {
		int returnBill = 0;
		if (vehicleToBill.hasWheels) {
			returnBill += 1000;
		}
		returnBill += returnBill + (2500 - vehicleToBill.yearMade);
		return returnBill;

	}

	public void removeAllVehicles() {
		ArrayList<Vehicle> emptyArray = new ArrayList<Vehicle>();
		vehiclesInGarage = emptyArray;
	}
}
