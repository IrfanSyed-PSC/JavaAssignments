import java.util.Scanner;

/**
 * Calculate the pay due an hourly worker in your company for
 * two types of works
 * 1. Exempt
 * 2. Non-Exempt workers
 * <p>
 * Exempt worker = hours worked * payrate
 * <p>
 * Non-exempt worker gets 1.5 times more if he works for more than 40 hours,
 * if more than 60 years old will get 50% exemption on the Associate fee.
 */
public class HourlyWeek {

    /* Constant variables used in this class */
    private static final double EMP_ASN_FEE = 14.50;
    private static final int STANDARDWORKHOURS = 40;
    private static final double EXTRAPAYRATE = 1.5;
    private static final int VETERANAGE = 60;
    private static final int ASN_FEECAP = 290;

    public static void main(String[] args) {


        // Create a scanner object to read the input of the user
        Scanner scanner = new Scanner(System.in);

        // Read the Employee type E or N. The input is converted to Uppercase
        System.out.println("Please enter your employee type (E or N):");
        String EmployeeInput = scanner.nextLine();
        char EmployeeType = EmployeeInput.toUpperCase().charAt(0);


        // Read the time worked by the employee
        System.out.println("Please enter how much time you worked:");
        String time = scanner.nextLine();


        // Read the payrate of the employee
        System.out.println("Please enter your pay rate:");
        double payrate = scanner.nextDouble();


        // Read the age of the employee
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();


        // Convert the time worked to hours
        int hours = Integer.parseInt(time.split(":")[0]);
        int minutes = Integer.parseInt(time.split(":")[1]);
        double minstohours = ((double) minutes / 60);
        double hoursworked = hours + minstohours;

        // Validate the EmployeeType, if E then apply the logic of the exempt worker, else apply the logic for non-exempt worker
        String Employee;
        double GrossPay;
        double NetPay = 0;
        double EmpAssFeeCharge = 0;
        if (EmployeeType == 'E') {
            Employee = "Exempt employee";
            GrossPay = hoursworked * payrate;

            // Employee Association fee is 0 for non-exempt employee
            EmpAssFeeCharge = 0;

            // GrossPay is equal to NetPay as the there is no Employee Association Charge
            NetPay = GrossPay;

        }


        // If EmployeeType is not 'E' then verify that EmployeeType is 'N'
        else if (EmployeeType == 'N') {

            Employee = "Non-exempt Employee";
            // If number of hours worked is more than 40 then pay the additional hours with 1.5 times
            if (hoursworked > STANDARDWORKHOURS) {

                // For standardhours multiply it with payrate but for extrhours worked apply the rate of 1.5 times
                double extrahours = hoursworked - STANDARDWORKHOURS;
                GrossPay = (STANDARDWORKHOURS * payrate) + (extrahours * (EXTRAPAYRATE * payrate));

            } else
                GrossPay = hoursworked * payrate;


            // Apply the logic for deducting the association fee from the GrossPay. Its applied only if the GrossPay is more than 290
            if (GrossPay > ASN_FEECAP) {

                // If the age is more than 60 then Association fee is half of the original else pay in total
                if (age > VETERANAGE)
                    EmpAssFeeCharge = EMP_ASN_FEE / 2;
                else
                    EmpAssFeeCharge = EMP_ASN_FEE;

                // Calculate the NetPay by deducting the Association fee from the GrossPay

                NetPay = GrossPay - EMP_ASN_FEE;

            }


        } else {
            System.err.print("Not a valid employee");
            return;

        }


        // Generate the output based on calculation
        System.out.println("");
        System.out.println("");

        System.out.println("You worked " + hours + " hours and " + minutes + " minutes this week");
        System.out.println(Employee);
        System.out.printf("Gross Pay is $%.2f \n", GrossPay);
        System.out.printf("Employee Association fee $%.2f \n", EmpAssFeeCharge);
        System.out.printf("Net Pay is $%.2f \n", NetPay);


    }


}
