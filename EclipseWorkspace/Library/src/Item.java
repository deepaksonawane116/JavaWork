public abstract class Item {

	private String itemName;
	private String typeOfItem;
	private boolean isCheckedOut;
	private int uniqueID;

	public Item(String itemName, boolean isCheckedOut, int id) {
		this.itemName = itemName;
		this.isCheckedOut = isCheckedOut;
		this.uniqueID = id;
	}
	
	public void setID(int uniqueID) {
		this.uniqueID = uniqueID;
	}

	public int getID() {
		return uniqueID;
	}

	public String getItemName() {
		return itemName;
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
	
	

