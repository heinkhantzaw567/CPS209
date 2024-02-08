/**
 * Complete the method which takes in an ArrayList of ArrayLists of integers, and removes those lists whose sum is less
 * than a given value.
 *
 * For example, if the input list is {{10, 25, 5}, {3, 11, 12}, {0, -10, 12}, {22, 12, 7}} and the minimum value is 30,
 * then the list should be changed to {{10, 25, 5}, {22, 12, 7}}, since only those lists have a sum of at least 30.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSmallLists
{
    /**
     * Takes in a list of lists and removes those lists whose sum is less than some given minimum value. Note that the
     * sum of an empty list is treated as 0.
     *
     * @param lists The list of lists
     * @param minValue The value which defines which lists to keep
     */
    public static void removeSmallLists(ArrayList<ArrayList <Integer>> lists, int minValue) {
        //-----------Start below here. To do: approximate lines of code = 9
        //
        // For each list in the "lists", calculate the sum of the inner list. Remove those with a sum less than minValue
        // Can do it with a for loop, but need to be careful about how you iterate over the inner loops.
        // Or you can just first calculate the sum of all the lists, and remove those that are two small afterwards
        
        for (int i = lists.size() - 1; i >= 0; i--) {
            int sum = 0;
            for (int j = 0; j < lists.get(i).size(); j++) {
                sum += lists.get(i).get(j);
            }
            if (sum < minValue) {
                lists.remove(i);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        // Note that the lists are created as arrays first, but then converted to ArrayLists before the test is performed
        // This is just for the convenience.
        System.out.println("------ Test on 4x3 Array ------");
        int [][] lists1 = {{10, 25, 5}, {3, 11, 12}, {0, -10, 12}, {22, 12, 7}};
        int minValue1 = 30;
        int [][] expected1 = {{10, 25, 5}, {22, 12, 7}};
        runTest(lists1, minValue1, expected1);

        System.out.println("\n\n------ Test on Uneven Array ------");
        int [][] lists2 = {{}, {10, 25, 5, -100}, {3, 11, 12}, {9, 80, 14, 15}, {0, -10}, {22}, {-10, -5, 14}};
        int minValue2 = 0;
        int [][] expected2 = {{}, {3, 11, 12}, {9, 80, 14, 15}, {22}};
        runTest(lists2, minValue2, expected2);

        System.out.println("\n\n------ Check that Empty Lists are removed for Positive Value ------");
        int [][] lists3 = {{}, {10, 25, 5, -100}, {3, 11, 12}, {9, 80, 14, 15}, {0, -10}, {22}, {-10, -5, 14}};
        int minValue3 = 1;
        int [][] expected3 = {{3, 11, 12}, {9, 80, 14, 15}, {22}};
        runTest(lists3, minValue3, expected3);

        System.out.println("\n\n------ Test on Empty ArrayList ------");
        int [][] lists4 = {};
        int minValue4 = 0;
        int [][] expected4 = {};
        runTest(lists4, minValue4, expected4);
    }

    public static void runTest(int [][] testArray, int minValue, int [][] expected) {
        ArrayList<ArrayList<Integer>> testList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> copy = new ArrayList<>();
        ArrayList<ArrayList<Integer>> expectedList = new ArrayList<>();

        for (int i = 0; i < testArray.length; i++) {
            testList.add(getArrayListFromArray(testArray[i]));
            copy.add(getArrayListFromArray(testArray[i]));
        }

        for(int j = 0; j < expected.length; j++) {
            expectedList.add(getArrayListFromArray(expected[j]));
        }

        System.out.println("Testing on array " + testList);
        System.out.println("Min value is " + minValue);

        boolean pass = true;
        removeSmallLists(copy, minValue);
        System.out.println("OUTPUT of removeSmallLists:   " + copy);

        if (!copy.equals(expectedList)) {
            System.out.println("EXPECTED of removeSmallLists: " + Arrays.deepToString(expected));
            System.out.println("    INCORRECT OUTPUT");
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

}
