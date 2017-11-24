import java.io.*;

public class LibraryRunner {

	public static void main(String[] args) {

		LibraryFunctions libraryFunctions = new LibraryFunctions();

		Item book1 = new Book("Call of Cthulu", false, "H.P. Lovecraft", 25, 0);
		Item book2 = new Book("Call of Cthulu2",  false, "H.P. Lovecraft2", 251, 0);
		Item book3 = new Book("Call of Cthulu3",  false, "H.P. Lovecraft3", 252, 0);

		Item dvd1 = new DVD("Frozen",  true, 71, "Kids", 0);
		Item dvd2 = new DVD("Lord of the Rings: The Two Towers",  false, 133, "Fantasy", 0);
		Item dvd3 = new DVD("Final Destination",  true, 85, "Horror", 0);
		Item dvd4 = new DVD("Hot Fuzz",  false, 92, "Comedy", 0);

		libraryFunctions.addItem(book1); // .addItem seems to be working
		libraryFunctions.addItem(book2);
		libraryFunctions.addItem(book3);
		

		// System.out.println(b3.getAuthor()); // .getAuthor seems to be working

		libraryFunctions.addItem(dvd1); // seems to be working
		libraryFunctions.addItem(dvd2);
		libraryFunctions.addItem(dvd3);
		libraryFunctions.addItem(dvd4);

		// System.out.println(dvd4.getRuntime()); //.getRuntime seems to be working

		// lf.updateItem(dvd4, dvd2); //needs fixing, can only alter variables Item can
		// access
		// System.out.println(dvd4.getRuntime());
		
		libraryFunctions.findItem(dvd2);
		libraryFunctions.removeItem(dvd2);
		libraryFunctions.findItem(dvd2); // find and remove works, item has been removed from the list
		
		System.out.println(libraryFunctions.getItemIDFromList(dvd2));
		System.out.println(libraryFunctions.getItemIDFromList(dvd1));
		System.out.println(libraryFunctions.getItemIDFromList(book1));
		System.out.println(libraryFunctions.getItemIDFromList(book2));	//finding and setting of unique ID appears to work
		
		
		try {
			libraryFunctions.readFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			libraryFunctions.writeToFile();
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

		libraryFunctions.registerUser(user1);
		libraryFunctions.registerUser(user2);
		libraryFunctions.registerUser(user3);
		libraryFunctions.registerUser(user4);

	}
}
