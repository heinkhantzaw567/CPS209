/**
 * Complete the method which calculates the elementwise sum of two given arrays.
 * For example, if the arrays are [1, 2, 3] and [4, 5, 6], then the result will be [1 + 4, 2 + 5, 3 + 6] which is
 * [5, 7, 9].
 */

import java.util.Arrays;

public class AddArrays
{
    /**
     * Creates a new array given by adding the given elementwise sum of the two arrays. The input arrays are not affected
     * by this method.
     *
     * If the arrays are of mismatched size, returns null
     *
     * @param values1 The first array
     * @param values2 The second array
     * @return A new array given by the elementwise sum of the two arrays
     */
    public static int [] addArrays(int [] values1, int [] values2)
    {
        //-----------Start below here. To do: approximate lines of code = 6
        //
        // First check if the arrays have the same length. If they don't, return none
        // Otherwise, create a new array to hold the elementwise sum.
        // Then calculate the value for each position using a for loop
        if (values1.length != values2.length)
        {
            return null;
        }
        int [] myarray = new int[values1.length];
        for (int i =0; i<values1.length; i++)
        {
            myarray[i] = values1[i]+values2[i];
        }
        
        
        return myarray;
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        System.out.println("----- Add Arrays of Length 5 -----");
        int [] first1 = {4, -1, 4, 8, 9};
        int [] second1 = {77, 1, -10, 12, 0};
        int [] expected1 = {81, 0, -6, 20, 9};
        runTest(first1, second1, expected1);

        System.out.println("\n\n----- Add Arrays of Length 8 -----");
        int [] first2 = {78, 76, -10, -9, -10, 34, 2, 1};
        int [] second2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] expected2 = {79, 78, -7, -5, -5, 40, 9, 9};
        runTest(first2, second2, expected2);

        System.out.println("\n\n----- Add Arrays of Length 1 -----");
        int [] first3 = {7100};
        int [] second3 = {900};
        int [] expected3 = {8000};
        runTest(first3, second3, expected3);

        System.out.println("\n\n----- Add Arrays of Length 0 -----");
        int [] first4 = {};
        int [] second4 = {};
        int [] expected4 = {};
        runTest(first4, second4, expected4);

        System.out.println("\n\n----- Add Arrays with Mismatched Size -----");
        int [] first5 = {4, -1, 4, 8, 9};
        int [] second5 = {78, 76, -10, -9, -10, 34, 2, 1};
        int [] expected5 = null;
        runTest(first5, second5, expected5);

        System.out.println();
        int [] first6 = {78, 76, -10, -9, -10, 34, 2, 1};
        int [] second6 = {78, 76, -10, -9, -10, 34, 2};
        int [] expected6 = null;
        runTest(first6, second6, expected6);
    }

    public static void runTest(int [] first, int [] second, int [] expected)
    {
        System.out.println("Adding array " + Arrays.toString(first) + " to " + Arrays.toString(second));
        int [] originalFirst = Arrays.copyOf(first, first.length);
        int [] originalSecond = Arrays.copyOf(second, second.length);
        int [] result = addArrays(first, second);

        System.out.println("OUTPUT:   " + Arrays.toString(result));
        System.out.println("EXPECTED: " + Arrays.toString(expected));
        System.out.println("OUTPUT:   after add, the first array is " + Arrays.toString(first));
        System.out.println("EXPECTED: after add, the first array is " + Arrays.toString(originalFirst));
        System.out.println("OUTPUT:   after add, the second array is " + Arrays.toString(second));
        System.out.println("EXPECTED: after add, the second array is " + Arrays.toString(originalSecond));
    }
}
