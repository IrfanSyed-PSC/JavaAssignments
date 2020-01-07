import java.util.Scanner;

public class RoofEstimator {

       static  int SHINGLES_ON_AVERAGE_DAY = 8;
       static int WORKDAYS_IN_WEEK = 5;
       static int SQUARES_PER_SQUAREFEET = 100;
       static double BUNDLES_PER_SQUARE = 3.0;
       static double WASTAGE= 1.05;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of the root in feet");
        double length = scanner.nextDouble();

        System.out.println("Please enter the width of the root in feet");
        double width = scanner.nextDouble();

        System.out.println("Please enter the price of the bundle shingles in dollars");
        double price = scanner.nextDouble();

        System.out.println("Please enter the number of shingles in a bundle");
        int shingles = scanner.nextInt();

        // Calculate the Square footage of the area covered
        double area = length * width;

        System.out.println("The area of the roof is: " + area + " square feet.");

        // Calculate squares for the area
         double squares = (area / SQUARES_PER_SQUAREFEET);

        System.out.printf("The number of squares needed is : $%.2f \n",squares);

        // Calculate the shingles needed
        int bundles = (int) Math.ceil((squares * BUNDLES_PER_SQUARE) * WASTAGE);


        System.out.println("The number of bundles needed is " + bundles);

        // Number of shingles needed
        int shinglesneeded = bundles * shingles;

        System.out.println("The number of shingles needed is: " + shinglesneeded);

        // Cost of the materials
        double cost = bundles * price;

        System.out.printf("The cost of materials: $%.2f \n",cost);


        int totaldays = (int) (Math.ceil(squares) / SHINGLES_ON_AVERAGE_DAY);

        int time_in_weeks = totaldays / WORKDAYS_IN_WEEK;
        int time_in_days = totaldays % WORKDAYS_IN_WEEK;

        System.out.println("Total time to fix would be " + time_in_weeks + " week(s) and " + time_in_days + " day(s)");



    }
}

