/**
 * Complete the method replaceEven which replaces the even values in an array with the number 0.
 */

import java.util.Arrays;

public class ReplaceEvenWithZero
{
    /**
     * Replace the even elements in the given array with 0
     *
     * @param values the array to use for the replacements
     */
    public static void replaceEvenWithZero(int[] values)
    {
        //-----------Start below here. To do: approximate lines of code = 2
        // Write a for loop to go through each element, determine if it is even
        //If so, replace with 0. Hint: use the modulus operator % to determine if an integer is even
        for (int i=0; i<values.length; i++)
        {
            if (values[i] % 2 == 0)
                values[i] =0; // Number is even
        
        
        }
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        System.out.println("------ Test on Array of size 12 ------");
        int[] testArray1 = {14, 2, 19, 3, 15, 22, 18, 7, 44, 39, 51, 78};
        System.out.println("The test array is " + Arrays.toString(testArray1));
        replaceEvenWithZero(testArray1);
        System.out.println("OUTPUT:   After replacing evens is " + Arrays.toString(testArray1));
        System.out.println("EXPECTED: After replacing evens is [0, 0, 19, 3, 15, 0, 0, 7, 0, 39, 51, 0]");

        System.out.println("\n\n------ Test on Array of size 7 ------");
        int[] testArray2 = {89, 87, 80, 34, 12, 10, 0, 1, 19};
        System.out.println("The test array is " + Arrays.toString(testArray2));
        replaceEvenWithZero(testArray2);
        System.out.println("OUTPUT:   After replacing evens is " + Arrays.toString(testArray2));
        System.out.println("EXPECTED: After replacing evens is [89, 87, 0, 0, 0, 0, 0, 1, 19]");

        System.out.println("\n\n------ Test on Array of size - ------");
        int[] testArray3 = {};
        System.out.println("The test array is " + Arrays.toString(testArray3));
        replaceEvenWithZero(testArray3);
        System.out.println("OUTPUT:   After replacing evens is " + Arrays.toString(testArray3));
        System.out.println("EXPECTED: After replacing evens is []");
    }
}
