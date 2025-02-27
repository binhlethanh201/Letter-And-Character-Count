import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input the content
		System.out.println("Enter your content: ");
		String input = sc.nextLine().trim().toLowerCase();
		// count words
		StringTokenizer token = new StringTokenizer(input, " ,./\\!?'';:[]{}");
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		while(token.hasMoreTokens()) {
			String word = token.nextToken();
			wordCount.put(word, wordCount.getOrDefault(word, 0) +1);
		}
		//count letters
		Map<Character, Integer> letterCount = new LinkedHashMap<>();
		for(char c : input.toCharArray()) {
			if(Character.isLetter(c)) {
				letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
			}
		}
		
		//Print out the result
		System.out.println(wordCount);
		System.out.println(letterCount);
		sc.close();

	}

}
