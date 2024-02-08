/**
 * Complete the method which takes in an array list of integers and a minimum value, and returns a new list that
 * contains the elements in the original list no smaller than the given minimum value.
 *
 * For example, if the given list is [10, 2, 30, 4, 50, 6] and the given minimum is 6, then the returned list should
 * have values [10, 30, 50, 6]
 */

import java.util.ArrayList;

public class NoSmaller
{
    /**
     * Creates a new list that consists of the same values as the input list, but with all values less than
     * the given value are removed.
     *
     * @param values The input array list
     * @param minValue The value below which elements should be removed
     * @return An array list with the elements that are not big enough having been removed
     */
    public static ArrayList<Integer> getNoSmallerList(ArrayList<Integer> values, int minValue)
    {
        //-----------Start below here. To do: approximate lines of code = 5
        //
        // Create a new list. Then loop over values and add those values that are as big as maxValue to the new list.
        // Remember to return the new list and not to change values
        ArrayList <Integer> newarr = new ArrayList<>();
        for (int i =0; i <values.size(); i++)
        {
            if (values.get(i) >= minValue)
            {
                newarr.add(values.get(i));
            }
        }
        return newarr;
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> testList;
        System.out.println("------ Test with List of Size 12 ------");
        int [] values1 = {14, 0, 19, 3, 15, 0, 18, 0, 44, 0, 51, 78};
        testList = getArrayListFromArray(values1);
        System.out.println("OUTPUT:   The list with values no smaller than 1 is " + getNoSmallerList(testList, 1));
        System.out.println("EXPECTED: The list with values no smaller than 1 is [14, 19, 3, 15, 18, 44, 51, 78]");
        System.out.println("OUTPUT:   The size of the input list still has length " + testList.size());
        System.out.println("OUTPUT:   The size of the input list still has length 12");

        System.out.println("\nOUTPUT:   The list with values no smaller than 18 is " + getNoSmallerList(testList, 18));
        System.out.println("EXPECTED: The list with values no smaller than 18 is [19, 18, 44, 51, 78]");
        System.out.println("OUTPUT:   The size of the input list is still " + testList.size());
        System.out.println("OUTPUT:   The size of the input list is still 12");

        System.out.println("\nOUTPUT:   The list with values no smaller than 180 is " + getNoSmallerList(testList, 180));
        System.out.println("EXPECTED: The list with values no smaller than 180 is []");
        System.out.println("OUTPUT:   The size of the input list still has length " + testList.size());
        System.out.println("OUTPUT:   The size of the input list still has length 12");

        System.out.println("\n\n------ Test with List of Size 5 ------");
        int [] values2 = {-14, 10, -19, 33, 1};
        testList = getArrayListFromArray(values2);
        System.out.println("OUTPUT:   The list with values no smaller than 1 is " + getNoSmallerList(testList, 1));
        System.out.println("EXPECTED: The list with values no smaller than 1 is [10, 33, 1]");
        System.out.println("OUTPUT:   The size of the input list still has length " + testList.size());
        System.out.println("OUTPUT:   The size of the input list still has length 5");

        System.out.println("\nOUTPUT:   The list with values no smaller than 11 is " + getNoSmallerList(testList, 11));
        System.out.println("EXPECTED: The list with values no smaller than 11 is [33]");
        System.out.println("OUTPUT:   The size of the input list still has length " + testList.size());
        System.out.println("OUTPUT:   The size of the input list still has length 5");

        System.out.println("\nOUTPUT:   The list with values no smaller than 34 is " + getNoSmallerList(testList, 34));
        System.out.println("EXPECTED: The list with values no smaller than 34 is []");
        System.out.println("OUTPUT:   The size of the input list still has length " + testList.size());
        System.out.println("OUTPUT:   The size of the input list still has length 5");

        System.out.println("\n\n------ Test with Empty List ------");
        int [] values3 = {};
        testList = getArrayListFromArray(values3);
        System.out.println("OUTPUT:   The list with values no smaller than 1 is " + getNoSmallerList(testList, 1));
        System.out.println("EXPECTED: The list with values no smaller than 1 is []");
        System.out.println("OUTPUT:   The size of the input list still has length " + testList.size());
        System.out.println("OUTPUT:   The size of the input list still has length 0");
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
