import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReadFromFile {
	
	ArrayList<String> initialWords = new ArrayList<>();
	ArrayList<String> sortedWords = new ArrayList<>();
	
	public void readFromFile(String fileName, HashMap<String, Integer> populate) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		String line = null;
		while ((line = in.readLine()) != null) {
			initialWords.add(line);
			sortedWords.add(sortString(line));
			populate.put(line, 0);
		}
		in.close();
	}

	public String sortString(String string) {
		char tempArray[] = string.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}

	public String stringWithMostAnagrams( HashMap<String, Integer> wordMap) {
		String toReturn = "";
		int best = 0;
		
		for(String i : initialWords)
		{
			for(String j : sortedWords)
			{
				if(sortString(i).equals(j))
				{
					wordMap.put(i, wordMap.get(i) + 1);
				}
			}
		}
		
		for(Map.Entry<String,Integer> entry : wordMap.entrySet())
		{
			if(entry.getValue() > best)
			{
				toReturn = entry.getKey().toString();
			}
		}
		
		return toReturn;
		
	}

	public boolean isAnagram(String string1, String string2) {
		// TODO Auto-generated method stub
		
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		string1 = sortString(string1);
		string2 = sortString(string2);
		
		if(string1.length() != string2.length())
		{
			return false;
		}
		return string1.equals(string2);
				
	}
}