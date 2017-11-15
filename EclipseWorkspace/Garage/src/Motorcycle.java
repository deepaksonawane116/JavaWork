
public class Motorcycle extends Vehicle {
	String extraNote;

	public Motorcycle(String make, String model, int yearMade, boolean hasWheels, String extraNote) {
		super(make, model, yearMade, hasWheels, "Motorcycle");
		this.extraNote = extraNote;

	}

}
