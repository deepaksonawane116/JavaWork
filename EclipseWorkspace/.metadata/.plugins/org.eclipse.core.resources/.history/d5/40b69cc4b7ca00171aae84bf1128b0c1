import java.util.ArrayList;

public abstract class Item {

	private ArrayList<Integer> uniqueIDList = new ArrayList<Integer>();
	
	private String itemName;
	private String typeOfItem;
	private boolean isCheckedOut;
	private static int uniqueID;

	public Item(String itemName, String typeOfItem, boolean isCheckedOut) {
		this.itemName = itemName;
		this.typeOfItem = typeOfItem;
		this.isCheckedOut = isCheckedOut;
		Item.uniqueID = generateUniqueID();
	}
	

	public String getItemName() {
		return itemName;
	}

	private int generateUniqueID() {
		boolean uniqueIDAdded = false;
		int counter = 0;
		do {

			if (uniqueIDList.contains(counter)) {
				counter += 1;
			} else {
				uniqueIDList.add(counter);
				uniqueIDAdded = true;
			}

		} while (!uniqueIDAdded);
		return counter;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getTypeOfItem() {
		return typeOfItem;
	}

	public void setTypeOfItem(String typeOfItem) {
		this.typeOfItem = typeOfItem;
	}

	public boolean isCheckedOut() {
		return isCheckedOut;
	}

	public void setCheckedOut(boolean isCheckedOut) {
		this.isCheckedOut = isCheckedOut;
	}
	
	public int getUniqueID() {
		return this.uniqueID;
	}

}
