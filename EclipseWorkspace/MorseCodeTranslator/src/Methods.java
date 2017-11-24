import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Methods {

	private HashMap<String, Character> morseAlphabet = new HashMap<String, Character>();
	
	public Methods(){
	morseAlphabet.put(".-", 'A');
	morseAlphabet.put("-...", 'B');
	morseAlphabet.put("-.-.", 'C');
	morseAlphabet.put("-..", 'D');
	morseAlphabet.put(".", 'E');
	morseAlphabet.put("..-.", 'F');
	morseAlphabet.put("--.", 'G');
	morseAlphabet.put("....", 'H');
	morseAlphabet.put("..", 'I');
	morseAlphabet.put(".---", 'J');
	morseAlphabet.put("-.-", 'K');
	morseAlphabet.put(".-..", 'L');
	morseAlphabet.put("--", 'M');
	morseAlphabet.put("-.", 'N');
	morseAlphabet.put("---", 'O');
	morseAlphabet.put(".--.", 'P');
	morseAlphabet.put("--.-", 'Q');
	morseAlphabet.put(".-.", 'R');
	morseAlphabet.put("...", 'S');
	morseAlphabet.put("-", 'T');
	morseAlphabet.put("..-", 'U');
	morseAlphabet.put("...-", 'V');
	morseAlphabet.put(".--", 'W');
	morseAlphabet.put("-..-", 'X');
	morseAlphabet.put("-.--", 'Y');
	morseAlphabet.put("--..", 'Z');
	
	
	}
	
	public String translateFromMorse(String morseString) {
		// TODO Auto-generated method stub
		String toReturn = "";
		
		String[] arrayMorseString;
		
		arrayMorseString = morseString.split(" / ");
		
		for(String word : arrayMorseString)
		{
			String[] wordIsBuiltOf = word.split(" ");
			for(String character : wordIsBuiltOf)
			{
				//getTranslation(character);
				toReturn = toReturn + getTranslation(character);
			}
			toReturn += " ";
		}
		//System.out.println(toReturn);
		return toReturn;
	}

	public char getTranslation(String string) {
		char toReturn = ' ';
		toReturn = morseAlphabet.get(string);
		//System.out.println(toReturn);
		return toReturn;
	}

	public String translateToMorse(String phraseToTranslate) {
		// TODO Auto-generated method stub
		String toReturn = "";
		phraseToTranslate = phraseToTranslate.toUpperCase();
		
		String[]arrayWordString = phraseToTranslate.split(" ");
		
		for(String word : arrayWordString)
		{
			char[] charactersInWord = word.toCharArray();
			for(char i : charactersInWord)
			{
				toReturn += translateCharToMorse(i) + " ";
			}
			toReturn += " / ";
		}
		
		return toReturn;
	}

	public String translateCharToMorse(char i) {
		// TODO Auto-generated method stub
		String toReturn = "";
	
		for(Map.Entry<String, Character> entry : morseAlphabet.entrySet())
		{
			if(entry.getValue().equals(i))
			{
				toReturn += entry.getKey();
			}
		}
		
		return toReturn;
	}
	
	public void toBeeper(String s) throws LineUnavailableException, InterruptedException
	{
		char[] beeps = s.toCharArray();
		
		for(char i : beeps)
		{
			if(i == '.')
			{
				tone(1000, 100, SAMPLE_RATE);
			} else if (i == '-')
			{
				tone(1000, 100, SAMPLE_RATE);
				Thread.sleep(100);
			} else {
				Thread.sleep(250);
			}
			
		}
	}
	
	private float SAMPLE_RATE = 8000f;
	
	private void tone(int hz, int msecs, double vol) throws LineUnavailableException
	{
		byte[] buffer = new byte[1];
		AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
		SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
		sdl.open(af);
		sdl.start();
		
		for(int i = 0; i < msecs*8 ; i++)
		{
			double angle = i / (SAMPLE_RATE/hz) * 2.0 *Math.PI;
			buffer[0] = (byte)(Math.sin(angle) * 127.0 * vol);
			sdl.write(buffer, 0, 1);
		}
		sdl.drain();
		sdl.stop();
		sdl.close();
	}

}
