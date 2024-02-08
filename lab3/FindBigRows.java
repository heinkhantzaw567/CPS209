/**
 * Complete the method which takes in a 2D array and finds the rows whose sum is at least as large as a given target.
 * The indices of these rows are then returned in an ArrayList.
 *
 * For example, if the input array is
 *
 *          4   5   6
 *          7   8   9
 *          1   2   3
 *         10  11  12
 *
 * And the minimum target is 24, then the returned list should be {1, 3} since 7 + 8 + 9 >= 24 and 10 + 11 + 12 >= 24.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class FindBigRows
{

    /**
     * Finds the indices of the row in the given 2D arrays whose sum is at least as large as the given required value.
     * The list is returned as an ArrayList
     *
     * Does not change the input array.
     *
     * @param values The 2D array
     * @param minValue The minimum sum to find
     * @return The list of row indices whose sum is bigger than the given minimum value
     */
    public static ArrayList<Integer> getBigRows(int [][] values, int minValue) {
        //-----------Start below here. To do: approximate lines of code = 8
        //
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for(int i=0; i<values.length; i++)
        {   
            int sum =0; 
            for (int j=0; j<values[i].length; j++)
            {
                sum +=values[i][j];
            }
            if (sum >= minValue)
            mylist.add(i);
        }
        return mylist;
        
        
        
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        System.out.println("------ Test 1 on positive values ------");
        int [][] testArray1 = {{4, 5, 6}, {7, 8, 9}, {1, 2, 3}, {10, 11, 12}};
        int minValue1 = 24;
        int [] expected1 = {1, 3};
        runTest(testArray1, minValue1, expected1);

        System.out.println("\n\n------ Test 2 has negatives ------");
        int [][] testArray2 = {{4, 5, 6, -7}, {7, 8, 9, -100}, {1,- 2, 3, 0}, {1, 10, 11, 12}};
        int minValue2 = 4;
        int [] expected2 = {0, 3};
        runTest(testArray2, minValue2, expected2);

        System.out.println("\n\n------ Test with None Big Enough ------");
        int [][] testArray3 = {{4, 5, 6, -7}, {7, 8, 9, -100}, {1,- 2, 3, 0}, {1, 10, 11, 12}};
        int minValue3 = 10000;
        int [] expected3 = {};
        runTest(testArray3, minValue3, expected3);
    }

    public static void runTest(int [][] testArray, int minValue, int [] expected) {
        System.out.println("Testing on array " + Arrays.deepToString(testArray));
        System.out.println("Min value is " + minValue);

        int [][] copy = copy2DArray(testArray);
        ArrayList<Integer> expectedList = getArrayListFromArray(expected);

        ArrayList<Integer> output = getBigRows(copy, minValue);
        System.out.println("OUTPUT of getBigRows:   " + output);

        boolean pass = true;
        if (!output.equals(expectedList)) {
            System.out.println("EXPECTED of getBigRows: " + expectedList);
            System.out.println("    INCORRECT OUTPUT");
            pass = false;
        }

        if (!are2DArraysEqual(copy, testArray)) {
            System.out.println("    INCORRECT - The input array list has been changed to " + Arrays.deepToString(copy));
            pass = false;
        }

        if (pass) {
            System.out.println("*** TEST PASSES ***");
        } else {
            System.out.println("*******************************************");
            System.out.println("*************** TEST FAILED ***************");
            System.out.println("*******************************************");
        }

    }

    /**
     * Checks that the 2D integer arrays are equal
     *
     * @param array1 The first array
     * @param array2 The second array
     * @return If they are equal or not
     */
    public static boolean are2DArraysEqual(int [][] array1, int [][] array2) {
        if (array1 == null || array2 == null) {
            return array1 == array2;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i].length != array2[i].length) {
                return false;
            }
            for (int j = 0; j <array1[i].length; j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Creates an ArrayList from a given array of values.
     *
     * @param values The array of values
     * @return An ArrayList
     */
    public static ArrayList<Integer> getArrayListFromArray(int [] values) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }
        return list;
    }

    /**
     * Copies a 2D array.
     *
     * @param toCopy The array to copy
     * @return The copy
     */
    public static int [][] copy2DArray(int [][] toCopy) {
        int [][] copy = new int [toCopy.length][];
        for (int i = 0; i < toCopy.length; i++) {
            copy[i] = Arrays.copyOf(toCopy[i], toCopy[i].length);
        }
        return toCopy;
    }
}
