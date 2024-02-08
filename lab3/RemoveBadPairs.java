/*
 * Complete the method removeBadPairs that accepts an ArrayList of integers and removes any adjacent pair
 * of integers in the list if the left element of the pair is larger than the right element of the pair.
 * Every pair's left element is an even-numbered index in the list, and every pair's right element is an odd index in the list.
 * For example, suppose a variable called list stores the following element values:
 * [3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1]
 * We can think of this list as a sequence of pairs: (3, 7), (9, 2), (5, 5), (8, 5), (6, 3), (4, 7), (3, 1).
 * The pairs (9,2), (8, 5), (6, 3), and (3, 1) are "bad" because the left element is larger than the right one, so these pairs
 * should be removed. So the call of removeBadPairs(list); would change the list to store the following element values:
 * [3, 7, 5, 5, 4, 7]
 * If the list has an odd length, the last element is not part of a pair and is also considered "bad;" it should
 * therefore be removed by your method.
 * If an empty list is passed in, the list should still be empty at the end of the call.
 * You may assume that the list passed is not null.
 */

import java.util.ArrayList;


public class RemoveBadPairs
{
    /**
     * Given an ArrayList of pairs of items, creates a new list that corresponds to the first, but with the bad pairs
     * removed. Should not affect the original list.
     *
     * @param pairs The original array list of pairs
     * @return A new list which corresponds to the original, but with the bad pairs removed
     */
    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> pairs)
    {
        //-----------Start below here. To do: approximate lines of code = 9
        //
        // Start by creating a new array list which is empty. Then loop over pairs, and add the good pairs
        // to your new list. Finally, make sure you return the ArrayList that you created
        // HINTS:
        //      - increment your loop index by 2 every time, and handle each pair each time
        //      - be careful of your termination condition to handle the case of an odd sized list correctly. Consider
        //          setting a variable before you start the loop that will define the last value
        
        ArrayList<Integer> mylist = new ArrayList<>();
        for (int i=0; i+1<pairs.size(); i+=2)
        {   
          
            if (pairs.get(i) < pairs.get(i+1) || pairs.get(i) == pairs.get(i+1) )
            {
                mylist.add(pairs.get(i));
                mylist.add(pairs.get(i+1));
            }
        }
        return mylist;
        
        
    
        
        
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        // Note that the lists are created as arrays first, but then converted to ArrayLists before the test is done
        // This is just for the convenience.
        System.out.println("------ Test on ArrayList of 14 Elements ------");
        int [] values1 = {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1};
        int [] expected1 = {3, 7, 5, 5, 4, 7};
        runTest(values1, expected1);

        System.out.println("\n\n------ Test on ArrayList with 11 Elements ------");
        int [] values2 = {8, 1, 9, 2, 1, 2, 3, 3, 7, 4, 5};
        int [] expected2 = {1, 2, 3, 3};
        runTest(values2, expected2);

        System.out.println("\n\n------ Test on ArrayList with 0 Elements ------");
        int [] values3 = {};
        int [] expected3 = {};
        runTest(values3, expected3);

        System.out.println("\n\n------ Test on ArrayList with 1 Element ------");
        int [] values4 = {1};
        int [] expected4 = {};
        runTest(values4, expected4);
    }

    /**
     * Runs the test for the given input array by comparing with expected output array.
     *
     * @param testArray The input array
     * @param expected The expected result array
     */
    public static void runTest(int [] testArray, int [] expected) {
        ArrayList<Integer> testList = getArrayListFromArray(testArray);
        ArrayList<Integer> testListCopy = new ArrayList<>(testList);
        ArrayList<Integer> expectedList = getArrayListFromArray(expected);

        System.out.println("Testing on array " + testListCopy);
        ArrayList<Integer> output = removeBadPairs(testListCopy);

        boolean pass = true;
        System.out.println("OUTPUT of removeBadPairs:   " + output);
        if (!output.equals(expectedList)) {
            System.out.println("EXPECTED of removeBadPairs: " + expectedList);
            System.out.println("    INCORRECT OUTPUT");
            pass = false;
        }

        if (!testListCopy.equals(testList)) {
            System.out.println("    INCORRECT - The input array list has been changed to " + testListCopy);
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
