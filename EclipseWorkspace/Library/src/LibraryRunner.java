import java.io.*;

public class LibraryRunner {

	public static void main(String[] args) {

		LibraryFunctions lf = new LibraryFunctions();

		Item b1 = new Book("Call of Cthulu", false, "H.P. Lovecraft", 25, 0);
		Item b2 = new Book("Call of Cthulu2",  false, "H.P. Lovecraft2", 251, 0);
		Item b3 = new Book("Call of Cthulu3",  false, "H.P. Lovecraft3", 252, 0);

		Item dvd1 = new DVD("Frozen",  true, 71, "Kids", 0);
		Item dvd2 = new DVD("Lord of the Rings: The Two Towers",  false, 133, "Fantasy", 0);
		Item dvd3 = new DVD("Final Destination",  true, 85, "Horror", 0);
		Item dvd4 = new DVD("Hot Fuzz",  false, 92, "Comedy", 0);

		lf.addItem(b1); // .addItem seems to be working
		lf.addItem(b2);
		lf.addItem(b3);

		// System.out.println(b3.getAuthor()); // .getAuthor seems to be working

		lf.addItem(dvd1); // seems to be working
		lf.addItem(dvd2);
		lf.addItem(dvd3);
		lf.addItem(dvd4);

		// System.out.println(dvd4.getRuntime()); //.getRuntime seems to be working

		// lf.updateItem(dvd4, dvd2); //needs fixing, can only alter variables Item can
		// access
		// System.out.println(dvd4.getRuntime());
		
		lf.findItem(dvd2);
		lf.removeItem(dvd2);
		lf.findItem(dvd2); // find and remove works, item has been removed from the list
		
		System.out.println(lf.getItemIDFromList(dvd2));
		System.out.println(lf.getItemIDFromList(dvd1));
		System.out.println(lf.getItemIDFromList(b1));
		System.out.println(lf.getItemIDFromList(b2));	//finding and setting of unique ID appears to work
		
		
		try {
			lf.writeToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			lf.readFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			lf.writeToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// lf.checkOutItem(dvd2); //.checkOut seems to be working
		// lf.checkInItem(dvd2); // .checkIn seems to be working

		User user1 = new User("00001", "UserName One");
		User user2 = new User("00002", "UserName Two");
		User user3 = new User("00003", "UserName Three");
		User user4 = new User("00004", "UserName Four");

		lf.registerUser(user1);
		lf.registerUser(user2);
		lf.registerUser(user3);
		lf.registerUser(user4);

	}
}
