/*
 * You are to complete a program reads that double values from a list (actually from a string) using a scanner.
 * It will then count how many input numbers there are and calculate the minimum, maximum, range, and average.
 *
 * For example, if the values are: 20 10 30 40 then the average is (20+10+30+40)/4 = 25 and the min is 10 and the max is 40
 *
 * Below, you need to complete code for calculating these values.
 */
import java.util.Scanner;

public class ComputeMaxMinAverage
{
    public static void main(String[] args)
    {
        String numbers = "34 68 22 76.0 81 98 78 84 62";
        Scanner in = new Scanner(numbers);
        
        double min = 10000000;
        double max = 0;
        double sum = 0.0;

        // Use this variable to keep track of the number of floating point numbers read in from numbers string above
        // After the loop is finished, you can use count to compute the average.
        int count = 0;
        //-----------Start below here. To do: approximate lines of code = 8
        // Use a while loop and read one number at a time using the scanner "in" (see above).
        // Hint: use in.hasNextDouble() as the loop condition
        // Inside the loop, update variable sum and update variables min and max if necessary
        // Don't forget to increment variable count.
        // Hint: never call in.nextDouble() more than once inside a loop - call it once and assign the result to a variable.
        // Use this variable to test the value
        while(in.hasNextDouble())
        
        {
            double num = in.nextDouble();
            if (max<num)
            {
                max = num;
            }
            else if (min > num){
                min  =num;
            }
            sum += num;
            count ++;
            
        }
        double range = max-min;
        double average = sum/count;
        
        
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

        //-----------Start below here. To do: approximate lines of code = 2
        // Create a double variable called range whose value is given by the difference between the max and min
        // Create a second variable called average whose value is given by the average of the values
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

        System.out.println("------ Max Test -------");
        System.out.printf("OUTPUT:   The maximum is %.2f%n", max);
        System.out.println("EXPECTED: The maximum is 98.00");

        System.out.println("\n\n------ Min Test -------");
        System.out.printf("OUTPUT:   The minimum is %.2f%n", min);
        System.out.println("EXPECTED: The minimum is 22.00");

        System.out.println("\n\n------ Count Test -------");
        System.out.println("OUTPUT:   The count is " + count);
        System.out.println("EXPECTED: The count is 9");

        System.out.println("\n\n------ Sum Test -------");
        System.out.printf("OUTPUT:   The sum is %.2f%n", sum);
        System.out.println("EXPECTED: The sum is 603.00");

        System.out.println("\n\n------ Range Test -------");
        System.out.printf("OUTPUT:   The range is %.2f%n", range);
        System.out.println("EXPECTED: The range is 76.00");

        System.out.println("\n------ Average Test -------");
        System.out.printf("OUTPUT:   The average is %.2f%n", average);
        System.out.println("EXPECTED: The average is 67.00");
    }
}
