package practicefunda;
import java.util.Scanner;

public class SentenceBuiler {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask user for parts of the sentence
	        System.out.print("Enter a subject (e.g., The cat): ");
	        String subject = scanner.nextLine();

	        System.out.print("Enter a verb (e.g., eats): ");
	        String verb = scanner.nextLine();

	        System.out.print("Enter an object (e.g., a fish): ");
	        String object = scanner.nextLine();

	        System.out.print("Enter an adverb (optional, e.g., quickly): ");
	        String adverb = scanner.nextLine();

	        // Build the sentence
	        String sentence;
	        if (adverb.isEmpty()) {
	            sentence = subject + " " + verb + " " + object + ".";
	        } else {
	            sentence = subject + " " + verb + " " + object + " " + adverb + ".";
	        }

	        // Capitalize first letter properly
	        sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);

	        System.out.println("\nYour sentence is: " + sentence);

	        scanner.close();
	    }
	}
