/*
 * You are to complete a program that reads a list of integer numbers from a String (using Scanner), and finds the sum
 * of all numbers in that list that are odd, at least 20, and no larger than 60. For example, if the String is
 * "7 67 23 18 16 99 45 51 42 64 33 71", then the sum is 23 + 45 + 51 + 33 = 152.
 */

import java.util.Scanner;

public class AddOddNumbers
{
    public static void main(String[] args)
    {
        int min = 20;
        int max = 60;

        String numbers = "7 67 23 18 16 99 45 51 42 64 33 71";
        Scanner in = new Scanner(numbers);
        int sum = 0;
        

        //-----------Start below here. To do: approximate lines of code = 4
        // Use a while loop, check for another integer num using Scanner in (hint: use in.hasNextInt())
        // Get the next int and assign it to variable. Use an "if" statement to check if the number is between
        // a and b (>= a and <= b) and if it is odd.
        // If so, add to the sum variable. Hint: use the % operator to determine if a number is odd
        // Note: inside the loop, never call in.nextInt() more than once. Call it once only and assign the result to a variable.
        while (in.hasNextInt())
        {
            int num = in.nextInt();
            if (num>=20 && num <=60 && num %2 !=0)
            {
                sum += num;
            }
        }
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

        System.out.println("------ Test ------");
        System.out.println("OUTPUT:   The sum is " + sum);
        System.out.println("EXPECTED: The sum is 152");
    }
}
