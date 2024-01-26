/**
 * The program below is intended to iterate through a list of integers (using Scanner) in a String, and for each integer,
 * should calculate the sum of the even digits in the integer.
 * For example, if the number is 12345, then the sum is 2 + 4 = 6
                if the number is 248, then the sum is 2 + 4 + 8 = 14
                if the number is 65732098, then the sum is 6 + 2 + 8 = 16
 */
import java.util.Scanner;


public class ComputeSumofEvenDigits
{
    public static void main(String[] args)
    {
        String digits = "48596732 273457 135798 24680 3";
        Scanner in = new Scanner(digits);
        int test = 0;

        while (in.hasNextInt()) {
            test++;
            int num = in.nextInt();

            int sum = 0;
    

            //-----------Start below here. To do: approximate lines of code = 5
            // Below, write the code to calculate the sum of the even digits in num
            // Use a while loop.
            // While num is greater than 0, use the modulus operator to strip off the next digit.
            // Check if this digit is even, if so add it to the sum variable
            // Finally, divide the num by 10 to "throw away" the current digit
            // HINT: To determine if a digit is even, use modulo 2
            
            
            while (num>0)
            {
                int remainder = num%10;
                if (remainder%2 ==0)
                {
                    sum += remainder;
                }
                num =num/10;
            }
            
            
            
            
            //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
            
            System.out.println("\n------ Test " + test + " ------");
            System.out.println("OUTPUT:   The sum is " + sum);
            if (test == 1)
            {
                System.out.println("EXPECTED: The sum is 20\n");
            }
            else if (test == 2)
            {
                System.out.println("EXPECTED: The sum is 6\n");
            }
            else if (test == 3)
            {
                System.out.println("EXPECTED: The sum is 8\n");
            }
            else if (test == 4)
            {
                System.out.println("EXPECTED: The sum is 20\n");
            }
            else if (test == 5)
            {
                System.out.println("EXPECTED: The sum is 0\n");
            }

        }
    }
}