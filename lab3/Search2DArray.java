/*
 * Complete the method which searches a 2D array for the first occurrence of a given value
 * e.g. if the 2D array is
 * 3  22 85 43 91
 * 54 38 74 1  13
 * 65 27 99 17 7
 *
 *  and the given value is 17, then the program returns the row (2) and column (3)
 *  where 17 is stored
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Search2DArray
{
    /**
     * Searches a 2D array for the first occurrence of a value. For this method, the first occurrence will be the
     * one in the lowest row position. If there are two occurrences in the same row, it should return the one with
     * the lowest column value.
     * For
     *
     * @param values two-dimensional array to be searched
     * @param target number to be searched for
     * @return an int array of length 2 containing the (zero-indexed) row and column
     * index of the target, or return a null if the target is not found in the array
     */
    public static int[] findValue(int[][] values, int target)
    {
        //-----------Start below here. To do: approximate lines of code = 8
        //
        int [] mylist = new int[2];
        for ( int i =0; i<values.length; i++){
            for (int j =0; j<values[i].length; j++)
            {
                if (values[i][j] == target){
                   mylist[0] =i;
                   mylist[1] =j;
                   return mylist;
                }
                
            }
        }
        
        
        return null;
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        System.out.println("------ Test on 4x3 Array -----");
        int[][] values = {{0, 4, 5}, {2, 2, 9}, {0, 2, 7}, {7, 3, 6}};
        System.out.println("The Array for all tests below is " + Arrays.deepToString(values));

        int [] expected0 = {0, 0};
        runTest(values, 0, expected0);

        int [] expected1 = null;
        runTest(values, 1, expected1);

        int [] expected2 = {1, 0};
        runTest(values, 2, expected2);

        int [] expected3 = {3, 1};
        runTest(values, 3, expected3);

        int [] expected4 = {0, 1};
        runTest(values, 4, expected4);

        int [] expected5 = {0, 2};
        runTest(values, 5, expected5);

        int [] expected6 = {3, 2};
        runTest(values, 6, expected6);

        int [] expected7 = {2, 2};
        runTest(values, 7, expected7);

        int [] expected8 = null;
        runTest(values, 8, expected8);

        int [] expected9 = {1, 2};
        runTest(values, 9, expected9);
    }

    public static void runTest(int [][] testArray, int value, int [] expected) {
        System.out.println("\nThe value to search for is " + value);
        int [][] copy = copy2DArray(testArray);

        int [] output = findValue(copy, value);

        boolean pass = true;
        System.out.println("OUTPUT of findValue:   " + Arrays.toString(output));

        if (!Arrays.equals(output, expected)) {
            System.out.println("EXPECTED of findValue: " + Arrays.toString(expected));
            System.out.println("    INCORRECT OUTPUT");
            pass = false;
        }

        if (!are2DArraysEqual(testArray, copy)) {
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
