/**
 * You are to create a method that reads a list of integer numbers from a String (using Scanner), and finds the sum
 * of all numbers in that list that are odd, and between a given range of values. This is like AddOddNumbers.java but
 * you are to create a parameterizable method to do it.
 *
 * HINT: Complete AddOddNumbers.java first, then copy the relevant part of the solution here and wrap it in
 * a method.
 */

import java.util.Scanner;

public class AddOddNumbersWithMethod
{

    //-----------Start below here. To do: approximate lines of code = 8
    // Create a method called addOddsInRange that takes in three parameters. The first is a String that is a list
    // of numbers. The second is an int that is the minimum value to include in the sum. The third is an int that is the
    // maximum value to include in the sum.
    // The method should create a Scanner that it will use to extract the integers from the String, sum up the
    // relevant values, and return the sum.
    // Remember to start the method with "public static" followed by the return type, the method name, and then
    // the method parameters in parentheses
    public static int addOddsInRange(String number, int range1 ,int range2){
        Scanner in = new Scanner(number);
        int sum = 0;
        while (in.hasNextInt())
        {
            int num = in.nextInt();
            if (num>=range1 && num <=range2 && num %2 !=0)
            {
                sum += num;
            }
        }
        return sum;
    }
    
    
    
    
    
    
    
    
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public static void main(String[] args)
    {
        System.out.println("------ First Set of Tests ------");
        System.out.println("These tests use the numberList \"7 67 23 18 16 99 45 51 42 64 33 71\"");
        String numbers = "7 67 23 18 16 99 45 51 42 64 33 71";

        System.out.println("OUTPUT:   With min = 20 and max = 60, result is " + addOddsInRange(numbers, 20, 60));
        System.out.println("EXPECTED: With min = 20 and max = 60, result is 152");

        System.out.println("\nOUTPUT:   With min = 1 and max = 30, result is " + addOddsInRange(numbers, 1, 30));
        System.out.println("EXPECTED: With min = 1 and max = 30, result is 30");

        System.out.println("\nOUTPUT:   With min = 70 and max = 90, result is " + addOddsInRange(numbers, 70, 90));
        System.out.println("EXPECTED: With min = 70 and max = 90, result is 71");

        System.out.println("\nOUTPUT:   With min = 100 and max = 200, result is " + addOddsInRange(numbers, 100, 200));
        System.out.println("EXPECTED: With min = 100 and max = 200, result is 0");

        System.out.println("\n\n------ Second Set of Tests ------");
        System.out.println("These tests use the numberList \"12 78 45 77 9 13\" and test that equality is handled correctly");
        numbers = "12 78 45 77 9 13";

        System.out.println("OUTPUT:   With min = 8 and max = 13, result is " + addOddsInRange(numbers, 8, 13));
        System.out.println("EXPECTED: With min = 8 and max = 13, result is 22");

        System.out.println("\nOUTPUT:   With min = 8 and max = 13, result is " + addOddsInRange(numbers, 2, 99));
        System.out.println("EXPECTED: With min = 9 and max = 13, result is 144");

        System.out.println("\n\n------ Corner Case Tests ------");
        System.out.println("This test checks that the answer is 0 when the minimum of the range is bigger than the max.");
        System.out.println("OUTPUT:   With min = 13 and max = 8, result is " + addOddsInRange(numbers, 13, 8));
        System.out.println("EXPECTED: With min = 13 and max = 8, result is 0");

        System.out.println("\nThis test checks that the answer is 0 when the input is an empty list.");
        System.out.println("OUTPUT:   With min = 13 and max = 8, result is " + addOddsInRange("", 13, 8));
        System.out.println("EXPECTED: With min = 13 and max = 8, result is 0");
    }
}
