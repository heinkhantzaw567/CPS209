/**
 * Complete the method which takes in a list of words as Strings and a target String, creates an ArrayList that contains
 * the indices of the input array at which that target String can be found.
 *
 * For example, if the input list is ["a", "b", "b", "a", "c", "k", "b", "a"] and the target is "b". Then the output
 * should be [1, 2, 6], since "b" is at locations 1, 2, and 6, but not anywhere else.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllWithArrayLists
{
    //-----------Start below here. To do: approximate lines of code = 6
    //
    // Create a method called findAll, which takes in an array of Strings and a target String and has a
    // return type of ArrayList<Integer>. The description of what this method does is shown above.
    //
    // HINT: Look back at the solution for findAll from lab 2, and adapt it accordingly.
    
    
    public static ArrayList<Integer> findAll(String[] word, String target) {
    
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for ( int i=0; i< word.length; i++)
        {
            if (word[i].equals(target)){
                mylist.add(i);
            }
        }
        return mylist;
    }
    
    
    
    
    
    
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public static void main(String[] args)
    {
        String [] words1 = {"a", "b", "b", "a", "c", "k", "b", "a"};
        String target1 = "b";
        int [] expected1 = {1, 2, 6};
        runTest(words1, target1, expected1);

        System.out.println();
        String target2 = "a";
        int [] expected2 = {0, 3, 7};
        runTest(words1, target2, expected2);

        System.out.println();
        String target3 = "q";
        int [] expected3 = {};
        runTest(words1, target3, expected3);
    }

    public static void runTest(String [] testArray, String target, int [] expected) {
        String [] copy = Arrays.copyOf(testArray, testArray.length);
        ArrayList<Integer> expectedList = getArrayListFromArray(expected);

        System.out.println("Testing on array " + Arrays.toString(testArray));

        boolean pass = true;
        ArrayList<Integer> output = findAll(copy, target);
        System.out.println("OUTPUT of findAll:   " + output);
        if (!output.equals(expectedList)) {
            System.out.println("EXPECTED of findAll: " + expectedList);
            System.out.println("    INCORRECT OUTPUT");
            pass = false;
        }

        if (!Arrays.equals(testArray, copy)) {
            System.out.println("    INCORRECT - The input array list has been changed to " + Arrays.toString(copy));
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
