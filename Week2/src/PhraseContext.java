import java.util.Scanner;

/**
 * Write a program called ​PhraseContext​ to search for and display a phrase in context.
 *
 * Example:-
 *
 * Please enter some text:​
 *          IBM Watson passed its first test onJeopardy! in February 2011, but the real test will be in applying
 *          the underlying systems, data management and analytics technology in business and across different industries.
 *
 *Please enter a word or phrase to find in context:
 *         ​ technology
 *
 * The phrase appears in the following context:
 *          [analytics TECHNOLOGY in]
 *
 * Input taken using scanner object for both text and a phrase. Once the required characters are passed,
 * upper-case the phrase when displayed in the output.
 */

public class PhraseContext {


    public static void main(String[] args) {

        // Define variables used for this program
        int start_index;
        int end_index;
        String orig_text;
        String orig_phrase;

        // Define scanner object to read the user input
        Scanner scanner = new Scanner(System.in);


        // Read the text from the user and store it to a string
        System.out.println("Please enter your some text:");
        String text = scanner.nextLine();

        // Assign the input to a temporary string and lowercase the input
        orig_text = text;
        text = text.toLowerCase();

        // Read the phrase from the user and store it to a string
        System.out.println("Please enter a word or phrase to find in context:");
        String phrase = scanner.nextLine();

        // Assign the input to a temporary string
        orig_phrase = phrase;
        phrase = phrase.toLowerCase();


        // Get the index from where the string has to be printed
        start_index = text.lastIndexOf(' ', (text.lastIndexOf(' ', text.indexOf(phrase))) - 1);

        //Get the index to where the string has to be printed
        end_index = text.indexOf(' ', text.indexOf(phrase) + phrase.length() + 1);


        // Get the characters between the two indexes
        String result = orig_text.substring(start_index, end_index);

        // Print the characters between the index by uppercasing the phrase
        System.out.println("[" + result.replace(phrase, orig_phrase.toUpperCase()).trim() + "]");


    }
}
