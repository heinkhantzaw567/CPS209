/**
 * Complete the method findAllLocs which takes in a 2D array of integers and a target integer, and returns a list of
 * arrays, where each location provides the [row, column] of the locations of that target value in the input array.
 *
 * For example, if the array is
 *
 *     4    5    2
 *     2    0    2
 *     8    9   -3
 *     2    9    1
 *
 * and the target value is 2, then the returned list should contain locations [0, 2] (row with index 0 and column 2),
 * [1, 0] (row with index 1 and column 0), [1, 2] (row with index 1 and column 2), and [3, 0] (row with index 3 and
 * column 0). They should be returned in the Array List in that order.
 *
 * Note that you will be working with an ArrayList of arrays in this question.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllLocs2DArray
{
    /**
     * Finds all the locations that a given target value appears in a 2D array and returns them.
     *
     * Does not alter the original input list.
     *
     * @param values The input 2D array
     * @param target The value we are searching for
     * @return The list of locations that the target is found at
     */
    public static ArrayList<int []> findAllLocs(int [][] values, int target) {
        //-----------Start below here. To do: approximate lines of code = 7
        //
        // Create a new ArrayList of the right type (see return type)
        // Then iterate through values searching for the target. When it is found, record the row and col in a new
        // integer array and add it to the ArrayList
        ArrayList<int[]> mylist = new ArrayList<int[]>();
    for (int i = 0; i < values.length; i++) {
        for (int j = 0; j < values[i].length; j++) {
            if (values[i][j]==target) {
            int[] listsub = new int[2];
            listsub[0] = i;
            listsub[1] = j;
            mylist.add(listsub);
        }
    }
}
return mylist;

        
        
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        // Note that the expected lists are given as arrays below, for convenience. But the actual expected output
        // is array lists.
        System.out.println("------ Test on 4x3 Array ------");
        int [][] values1 = {{4, 5, 2}, {2, 0, 2}, {8, 9, -3}, {2, 9, 1}};
        int target1 = 2;
        int [][] expected1 = {{0, 2}, {1, 0}, {1, 2}, {3, 0}};
        runTest(values1, target1, expected1);

        System.out.println("\n\n------ Test on 3x2 Array ------");
        int [][] values2 = {{40, -5}, {-5, 0}, {2, 90}};
        int target2 = -5;
        int [][] expected2 = {{0, 1}, {1, 0}};
        runTest(values2, target2, expected2);

        System.out.println("\n\n------ Test on 3x2 Array Never Appears ------");
        int [][] values3 = {{4, 5}, {2, 0}, {8, 9}};
        int target3 = 20;
        int [][] expected3 = {};
        runTest(values3, target3, expected3);

        System.out.println("\n\n------ Test Empty Array ------");
        int [][] values4 = {};
        int target4 = 20;
        int [][] expected4 = {};
        runTest(values4, target4, expected4);
    }

    public static void runTest(int [][] testArray, int target, int [][] expected) {
        int [][] copy = copy2DArray(testArray);
        System.out.println("Testing on array " + Arrays.deepToString(testArray));

        boolean pass = true;
        ArrayList<int []> output = findAllLocs(copy, target);
        System.out.print("OUTPUT of findAllLocs:   [");
        for (int i = 0; i < output.size(); i++) {
            System.out.print(Arrays.toString(output.get(i)));
            if (i < output.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        if (output.size() != expected.length) {
            pass = false;
        } else {
            for (int i = 0; i < output.size(); i ++) {
                if (output.get(i).length != expected[i].length) {
                    pass = false;
                    break;
                }
                for(int j = 0; j < output.get(i).length; j++) {
                    if(output.get(i)[j] != expected[i][j]) {
                        pass = false;
                        break;
                    }
                }
                if (!pass) {
                    break;
                }
            }
        }
        if (!pass) {
            System.out.println("EXPECTED of findAllLocs: " + Arrays.deepToString(expected));
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
