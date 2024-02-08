/*
 * Complete the method which takes two string array lists and finds all the elements in common (i.e. the intersection set)
 * For example:
 * If list1 contains words: bear porcupine Beaver moose wolf
 * and list2 contains:      otter wolf squirrel beaver
 * then the intersection set is:
 * Beaver wolf
 *
 * Notice that the case of the words is ignored and the elements are returned in the order they appear in list1.
 */

import java.util.ArrayList;
import java.util.Arrays;


public class SetIntersection
{
    /**
     * Finds the set of elements that are found in both of the given array lists. The case of elements in the array list are
     * ignored (ie. "Bear" and "bear" are considered the same). The method assumes that each array list doesn't contain
     * duplicates (ie. the word "Bear" may appear in both first and second, but it does not appear more than once in
     * first). The elements appear in the resulting array list in the order they appear in the first array list.
     *
     * Note that neither input set should be changed
     *
     * @param first The first set
     * @param second The second set
     * @return The intersection of the two sets
     */
    public static ArrayList<String> getIntersection(ArrayList<String> first, ArrayList<String> second)
    {
        //-----------Start below here. To do: approximate lines of code = 8
        //
        // Hint: make use of the method equalsIgnoreCase of class String to test if two strings are equal
        // regardless of case e.g.  "green" is equal to "Green"
        ArrayList<String> myList = new ArrayList<>();
        for(int i=0; i<first.size();i++)
        {   
            
            for (int j=0; j<second.size();j++)
            {
                if (first.get(i).toLowerCase().equals(second.get(j).toLowerCase()))
                {
                    myList.add(first.get(i));
                }

            }
           

        }
        return myList;
        
        
        
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        // Note that the lists are created as arrays first, but then converted to ArrayLists before the test is done
        // This is just for the convenience.
        System.out.println("------ Tests ------");
        String [] first1 = {"a", "b", "c", "d", "e", "f", "g"};
        String [] second1 = {"j", "f", "d", "i", "b"};
        String [] expected1 = {"b", "d", "f"};

        runTest(first1, second1, expected1);
        System.out.println();

        // Test the reverse the order
        String [] expected2 = {"f", "d", "b"};
        runTest(second1, first1, expected2);

        // Test a set with itself
        System.out.println();
        runTest(first1, first1, first1);

        // Test to make sure case is ignored properly
        String [] first4 = {"Mary", "had", "A", "little", "Lamb"};
        String [] second4 = {"mary", "had a", "little", "lamb"};
        String [] expected4 = {"Mary", "little", "Lamb"};
        System.out.println();
        runTest(first4, second4, expected4);

        // Test to make sure empty sets are handled correctly
        String [] first5 = {"a", "b", "c", "d", "e", "f", "g"};
        String [] second5 = {};
        String [] expected5 = {};
        System.out.println();
        runTest(first5, second5, expected5);

        // Reverse empty set test
        System.out.println();
        runTest(second5, first5, expected5);
    }

    public static void runTest(String [] first, String [] second, String [] expected)
    {
        System.out.println("Checking arrays " + Arrays.toString(first) + " and " + Arrays.toString(second));
        ArrayList<String> firstSet = getArrayListFromArray(first);
        ArrayList<String> secondSet = getArrayListFromArray(second);
        ArrayList<String> expectedSet = getArrayListFromArray(expected);

        ArrayList<String> result = getIntersection(firstSet, secondSet);

        boolean pass = true;
        System.out.println("OUTPUT of getIntersection:   " + result);
        if (!result.equals(expectedSet)) {
            System.out.println("EXPECTED of getIntersection: " + expectedSet);
            System.out.println("    INCORRECT OUTPUT");
            pass = false;
        }

        ArrayList<String> firstSetCopy = getArrayListFromArray(first);
        if (!firstSet.equals(firstSetCopy)) {
            System.out.println("    INCORRECT - The first set has been changed to " + firstSet);
            pass = false;
        }

        ArrayList<String> secondSetCopy = getArrayListFromArray(second);
        if (!secondSet.equals(secondSetCopy)) {
            System.out.println("    INCORRECT - The second set has been changed to " + secondSet);
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
    public static ArrayList<String> getArrayListFromArray(String [] values)
    {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }
        return list;
    }
}
