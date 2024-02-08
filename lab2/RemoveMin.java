/**
 * Complete the method which takes in an ArrayList of integers, finds the minimum element, and removes it.
 * e.g. for the arraylist:   2,5,8,9,1,11,17  the result is 2,5,8,9,11,17
 */

import java.util.ArrayList;

public class RemoveMin
{

    //-----------Start below here. To do: approximate lines of code = 10
    // Write the static method called removeMin that takes in an ArrayList of Integers and
    // removes the minimum value in the list. The method should be void, since the input list is what
    // is affected. If the list is empty, it should not do anything.
    // HINT: Find the position of the minimum value first, then remove it
    
    public static void removeMin(ArrayList<Integer> list) {
        if  (list.size()>0 ){
        int min = list.get(0);
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                minIndex = i;
            }
        }
    
        list.remove(minIndex);
    }
    else
    {
        return;
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public static void main(String[] args)
    {
        System.out.println("------ Test on List of Size 12 ------");
        int [] values1 = {14, 29, 19, 3, 15, 62, 18, 97, 44, 31, 51, 78};
        ArrayList<Integer> testList = getArrayListFromArray(values1);
        System.out.println("The test array is " + testList);
        removeMin(testList);
        System.out.println("OUTPUT:   The result is " + testList);
        System.out.println("EXPECTED: The result is [14, 29, 19, 15, 62, 18, 97, 44, 31, 51, 78]");

        System.out.println("\n\n------ Test on List of Size 6 ------");
        int [] values2 = {14, -29, 19, 3, 15, 62};
        testList = getArrayListFromArray(values2);
        System.out.println("The test array is " + testList);
        removeMin(testList);
        System.out.println("OUTPUT:   The result is " + testList);
        System.out.println("EXPECTED: The result is [14, 19, 3, 62, 18]");

        System.out.println("\n\n------ Test on List of Size 1 ------");
        int [] values3 = {-100014};
        testList = getArrayListFromArray(values3);
        System.out.println("The test array is " + testList);
        removeMin(testList);
        System.out.println("OUTPUT:   The result is " + testList);
        System.out.println("EXPECTED: The result is []");

        System.out.println("\n\n------ Test on List of Size 0 ------");
        int [] values4 = {};
        testList = getArrayListFromArray(values4);
        System.out.println("The test array is " + testList);
        removeMin(testList);
        System.out.println("OUTPUT:   The result is " + testList);
        System.out.println("EXPECTED: The result is []");
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
