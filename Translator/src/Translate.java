import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Translate {

	public Translate () throws IOException {
		
		HashMap<String, String> map = new HashMap<String, String>(); 
		
		boolean ifQuit = false;
		
		String userWord = "";
		
		Scanner s = new Scanner(System.in);
		
		BufferedReader in = new BufferedReader(new FileReader("EnglishToArabicDictionary.txt"));
		
		for (String line = in.readLine(); line != null; line = in.readLine()) {
			
			String word = line;
			String translatedWord = in.readLine();
			map.put(word, translatedWord);
			
		}
		
		in.close();
		
		while (ifQuit == false) {
			
			System.out.println("Please type the word you want to translate and press q to quit");
			userWord = s.nextLine();
			
			if (userWord.equals("q")) {
				
				ifQuit = true;
				
			} else if (map.get(userWord) != null) {
				
				System.out.println("Your word translated to Arabic is: "+map.get(userWord));
				
			} else if (map.get(userWord) == null) {
				
				System.out.println("Sorry, your word cannot be translated right now");
				
			} 
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		new Translate();
		
	}

}
