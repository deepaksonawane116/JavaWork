import java.util.ArrayList;
import java.io.*;

public class WorkingWithFiles {
	public static void main(String[] args) throws IOException {
		ArrayList<Perople> personArrayList = new ArrayList<Perople>();
		ArrayList<Perople> arrayToPopulate = new ArrayList<Perople>();

		Methods m = new Methods();

		String fileName = "C:\\Users\\Admin\\Documents\\testFile.txt";
		String readFromFile = "C:\\Users\\Admin\\Documents\\testReadFile.txt";

		BufferedWriter buffer = null;
		FileWriter file = null;
		
		

		Perople person1 = new Perople("Jim Dave", 21, "Fishmonger");
		Perople person2 = new Perople("Owen Samuel", 26, "Professional Nail Filer");
		Perople person3 = new Perople("Lucy Mel", 37, "Official Football Pitch Grass Height Measurer");
		Perople person4 = new Perople("Racheal Gambon", 23, "Unofficial Conkers Referee");
		Perople person5 = new Perople("Benedict Jaymon", 32, "Elevated Surface Advisor");

		personArrayList.add(person1);
		personArrayList.add(person2);
		personArrayList.add(person3);
		personArrayList.add(person4);
		personArrayList.add(person5);

		m.writeToFile(fileName, buffer, file, personArrayList);
		m.readFromFile(readFromFile, arrayToPopulate);

		System.out.print(arrayToPopulate.get(2).getName());
		System.out.print(arrayToPopulate.get(2).getAge());
		System.out.print(arrayToPopulate.get(2).getJobTitle());

	}
}

class Methods {
	public void writeToFile(String fileName, BufferedWriter buffer, FileWriter file, ArrayList<Perople> personArrayList)
			throws IOException {
		file = new FileWriter(fileName);
		buffer = new BufferedWriter(file);

		for (Perople i : personArrayList) {
			String contentToWrite = i.getName() + ", " + i.getAge() + ", " + i.getJobTitle() + "\r\n"; // for some
																										// reason \r\n
																										// is needed on
																										// notepad?

			buffer.write(contentToWrite);
		}

		buffer.close();
		file.close();
	}

	public void readFromFile(String fileName, ArrayList<Perople> arrayToPopulate) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		String line = null;
		while ((line = in.readLine()) != null) {
			String[] inputs = line.split(", ");
			Perople person1 = new Perople(inputs[0], Integer.parseInt(inputs[1]), inputs[2]);
			arrayToPopulate.add(person1);
		}
		in.close();
	}
}