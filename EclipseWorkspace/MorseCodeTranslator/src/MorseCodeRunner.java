import javax.sound.sampled.*;


public class MorseCodeRunner {

	public static void main (String[] args)
	{
	Methods methods = new Methods();
	
	String toTranslate = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
	
	System.out.println(methods.translateFromMorse(toTranslate));
	
	String toMorse = "Somebody once told me the world is gonna roll me";
	
	System.out.println(methods.translateToMorse(toMorse));
	
	try {
		methods.toBeeper(methods.translateToMorse(toMorse));
	} catch (LineUnavailableException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
}
