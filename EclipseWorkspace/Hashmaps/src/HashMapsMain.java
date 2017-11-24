import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapsMain {

	public static void main(String[] args) throws IOException
	{
		ReadFromFile methods = new ReadFromFile();
		ArrayList<String> populate = new ArrayList<String>();
		HashMap<String, Integer> wordWithAnagram = new HashMap<String, Integer>();
		
		methods.readFromFile("C:\\Users\\Admin\\Desktop\\wordlist.txt", wordWithAnagram);
		
		System.out.println(methods.stringWithMostAnagrams(wordWithAnagram));
	}
}
