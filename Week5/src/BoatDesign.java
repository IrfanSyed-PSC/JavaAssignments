import java.util.Scanner;

/**
 * BoatDesign program to create a plan for the type of the sail boat.
 * <p>
 * It takes input as a integer and prints the sail boat based on the
 * the input and apply the logic for height, width and the hull
 */
public class BoatDesign {


    public static void main(String[] args) {

        // define a parameter to read the user input which is basically the height of the mast
        int m;

        // a do-while loop to read the input of the user
        do {

            // Create a scanner object and read the user input
            System.out.println();
            System.out.println("Please enter the height of the mast:");
            Scanner scanner = new Scanner(System.in);
            m = scanner.nextInt();

            // If the input is -1 then stop the program
            if (m == -1) {
                System.out.println();
                System.out.println("Finished.");
                return;
            }

            // Run the program only if the input is between 3 and 33
            if (m > 3 && m < 33) {

                // Calculate the height,width and hull of the boat based the below formulae
                int width = (2 * m + 1);
                int height = (4 / 3 * m + 1);
                int hull = (m / 3);


                // Outer loop that prints the boat based on the height
                for (int i = height; i > 1; --i) {

                    // Start printing the left side of the sail

                    // Print "." in the format of a inverted pyramid. The value decrements for each loop as the value of i will get smaller
                    for (int j = 1; j < i; ++j) {
                        System.out.print(".");
                    }

                    // After every last "." print "/" for each line
                    if (m != i - 1)
                        System.out.print("/");

                    // If we are not printing "." or "/" then print spaces
                    int p = i;
                    while (p < m) {
                        System.out.print(" ");
                        p++;
                    }

                    // Print "|" for the center of the sail
                    System.out.print("|");

                    // Finished printing the left side of the of the sail.Start printing the right side of the sail

                    // Print " " if the if "\" or "." are not printed
                    p = i;
                    while (p < m) {
                        System.out.print(" ");
                        p++;
                    }

                    // Print "\" for the right side of the sail

                    if (m != i - 1)
                        System.out.print("\\");

                    // Print "." for the right side of the sail. The value will be in decreasing order
                    for (int j = i; j > 1; --j) {
                        System.out.print(".");
                    }


                    System.out.println();
                }

                // Completed printing the sail boat

                // After the boat is printed, print the deck of the boat based on its width

                int temp_width = width;

                while (temp_width >= 0) {
                    System.out.print("-");
                    temp_width--;
                }

                // Completed printing the deck, go to next line
                System.out.println();

                // Now that the sail boat and the deck are printed, print the hull


                // Outer loop to print the hull. The value of the hull is calculated above

                for (int i = 1; i <= hull; i++) {

                    // Print "." for the left side of the hull. The value will be in increasing order for each line printed
                    for (int j = 1; j <= i; j++) {
                        System.out.print(".");
                    }

                    // Print "\" for the left side of the hull
                    int p = i;
                    while (p < m) {
                        System.out.print("\\");
                        p++;
                    }

                    // Print "V" for the center of the hull
                    System.out.print("V");

                    // Print "/" for the right side of the hull
                    p = i;
                    while (p < m) {
                        System.out.print("/");
                        p++;
                    }

                    /* Print "." for the right side of the hull. This is the last thing that gets printed for each line of the hull and will be in
                      increasing order just like the left side of the hull
                    */
                    for (int j = 1; j <= i; j++) {
                        System.out.print(".");
                    }

                    // Completed printing the line, go to next line

                    System.out.println();


                }


            }
            // Allowed values between 3 and 33
            else
                System.out.println("Not a valid input, please enter the value between 3 and 33");


            // while condition for the mast value
        } while (m != 0);

    }

}
