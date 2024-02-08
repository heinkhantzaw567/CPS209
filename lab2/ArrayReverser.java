/**
 * Complete the method which takes in an array, and returns a new array with the same values as the input,
 * but in reverse order.
 */

import java.util.Arrays;

public class ArrayReverser
{
    /**
     Makes a new array that has the elements of the given array
     in reverse order. The input array should not be changed in any way.

     @param values the int array to reverse
     @return a new int array which is the reverse of the given array
     */
    public static int [] getReverseArray(int[] values)
    {
        //-----------Start below here. To do: approximate lines of code = 4
        //
        // Start by creating a new empty array with the same length as the parameter array.
        // Go through each integer element in the parameter array (use a for loop)
        // Set the last element of the new array to the first element of the parameter array,
        // Set the second last element to the second element etc
        // when finished, return the new array
        int [] myarray = new int[values.length];
        for ( int i =0; i<myarray.length; i++)

        {
            myarray[i] = values[values.length -(i+1)];
        }
        
        return myarray;
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        System.out.println("----- Test on Array of Size 8 ------");
        int[] test1Values = {14, 2, 19, 3, 15, 22, 18, 7};
        System.out.println("The test array is " + Arrays.toString(test1Values));
        System.out.println("OUTPUT:   The reverse array is " + Arrays.toString(getReverseArray(test1Values)));
        System.out.println("EXPECTED: The reverse array is [7, 18, 22, 15, 3, 19, 2, 14]");
        System.out.println("OUTPUT:   The original array is " + Arrays.toString(test1Values));
        System.out.println("EXPECTED: The original array is [14, 2, 19, 3, 15, 22, 18, 7]");

        System.out.println("\n\n----- Test on Array of Size 11 ------");
        int[] test2Values = {14, 100, 33, 72, -2, -19, 3, 150, 22, 218, -2};
        System.out.println("The test array is " + Arrays.toString(test2Values));
        System.out.println("OUTPUT:   The reverse array is " + Arrays.toString(getReverseArray(test2Values)));
        System.out.println("EXPECTED: The reverse array is [-2, 218, 22, 150, 3, -19, -2, 72, 33, 100, 14]");
        System.out.println("OUTPUT:   The original array is " + Arrays.toString(test2Values));
        System.out.println("EXPECTED: The original array is [14, 100, 33, 72, -2, -19, 3, 150, 22, 218, -2]");

        System.out.println("\n\n----- Test on Array of Size 1 ------");
        int[] test3Values = {99};
        System.out.println("The test array is " + Arrays.toString(test3Values));
        System.out.println("OUTPUT:   The reverse array is " + Arrays.toString(getReverseArray(test3Values)));
        System.out.println("EXPECTED: The reverse array is [99]");
        System.out.println("OUTPUT:   The original array is " + Arrays.toString(test3Values));
        System.out.println("EXPECTED: The original array is [99]");

        System.out.println("\n\n----- Test on Array of Size 0 ------");
        int[] test4Values = {};
        System.out.println("The test array is " + Arrays.toString(test4Values));
        System.out.println("OUTPUT:   The reverse array is " + Arrays.toString(getReverseArray(test4Values)));
        System.out.println("EXPECTED: The reverse array is []");
        System.out.println("OUTPUT:   The original array is " + Arrays.toString(test4Values));
        System.out.println("EXPECTED: The original array is []");
    }

}
