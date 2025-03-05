import java.util.*;

public class Main {
	
	private static final Scanner sc = new Scanner(System.in);
	
	// count words
	private static Map<String, Integer> wordCount(String input){
		StringTokenizer token = new StringTokenizer(input, " ,./\\!?'';:[]{}?!@#$%^&*()");
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		while(token.hasMoreTokens()) {
			String word = token.nextToken();
			wordCount.put(word, wordCount.getOrDefault(word, 0) +1);
		}
		return wordCount;
	}
	
	//count letters
	private static Map<Character, Integer> letterCount(String input){
		Map<Character, Integer> letterCount = new LinkedHashMap<>();
		for(char c : input.toCharArray()) {
			if(Character.isLetter(c)) {
				letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
			}
		}
		return letterCount;
	}
	
	public static void main(String[] args) {
		
		//input the content
		System.out.println("Enter your content: ");
		String input = sc.nextLine().trim().toLowerCase();
		//Print out the result
		System.out.println(wordCount(input));
		System.out.println(letterCount(input));

	}

}
