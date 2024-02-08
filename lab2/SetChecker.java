/**
 * Complete the methods isIn and isSameSet. The first method checks if a given String is in a given set of Strings
 * (given as an array). The second method takes in two sets (given as arrays), and checks if they contain the exact
 * same set of elements (though perhaps with duplicates or in a different order). For example,
 *
 * ["a", "b", "c", "a"] and ["c", "b", "a", "c"] are considered to have the same set of elements
 *
 * but
 *
 * ["a", "b", "c", "a"] and ["c", "b", "c"] are NOT considered to have the same set of elements
 */

import java.util.Arrays;

public class SetChecker
{
    /**
     * Checks if the given element is in the given array.
     *
     * @param elem the element to search for
     * @param set the set of strings stored in an array
     * @return If the element is in the set
     */
    public static boolean isIn(String elem, String[] set)
    {
        //-----------Start below here. To do: approximate lines of code = 4
        // Use a loop to search for the given element
        // Hints:
        //      - Don't forget to use .equals() method to compare two strings
        //      - Get this method working before sameSet. While you work on it, just have sameSet always return true,
        //        so you can run the rest of the code. Fix sameSet after you have isIn working
        
        for(int i=0; i< set.length; i++)
        {
            if(set[i].equals(elem)){ return true;
            }
        }
        return false;
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    /**
     * Checks if the same set contain the same elements. They do not need to be in the same order and there may be
     * duplicates in one or both.
     *
     * @param set1 The first set
     * @param set2 The second set
     * @return If the sets are the same or not
     */
    public static boolean isSameSet(String[] set1, String[] set2)
    {
        //-----------Start below here. To do: approximate lines of code = 7
        // Iterate over every element in set1 and check if it is in set2. Use your isIn method above.
        // If you ever find an element in set1 that is not in set2, you can return false immediately

        for (int i = 0; i < set1.length || i < set2.length; i++) {
            if ((i < set1.length && !isIn(set1[i], set2)) || (i < set2.length && !isIn(set2[i], set1))) {
                return false;
            }
        }
        return true;
        
        
        
        
        // Now iterate over every element in set2 and check if it is in set1 in an analogous way as above
        
        
        
        
        
        // Remember to return true if you didn't find any elements above that were in one set but not the other
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        System.out.println("------ Test isIn ------");
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("The set is " + Arrays.toString(months));

        System.out.println("OUTPUT:   is Jun in the set - " + isIn("Jun", months));
        System.out.println("EXPECTED: is Jun in the set - true");
        System.out.println("\nOUTPUT:   is Feb in the set - " + isIn("Feb", months));
        System.out.println("EXPECTED: is Feb in the set - true");
        System.out.println("\nOUTPUT:   is February in the set - " + isIn("February", months));
        System.out.println("EXPECTED: is February in the set - false");

        System.out.println("\nNow test on empty set");
        String [] emptySet = {};
        System.out.println("OUTPUT:   is Jun in the empty set - " + isIn("Jun", emptySet));
        System.out.println("EXPECTED: is Jun in the empty set - false");

        System.out.println("\n\n------ Test isSameSet ------");
        System.out.println("First test if isSameSet works for the same set");
        System.out.println("OUTPUT:   " + isSameSet(months, months));
        System.out.println("EXPECTED: true");

        String [] outOfOrder = {"Nov", "Sep", "Jan", "Mar", "Feb", "May", "Jun", "Apr", "Aug", "Dec", "Oct", "Jul"};
        System.out.println("\nThe set to compare against is " + Arrays.toString(outOfOrder));
        System.out.println("OUTPUT:   Is months the same as outOfOrder - " + isSameSet(months, outOfOrder));
        System.out.println("EXPECTED: Is months the same as outOfOrder - true");

        System.out.println("\nOUTPUT:   Is outOfOrder the same as months - " + isSameSet(months, outOfOrder));
        System.out.println("EXPECTED: Is outOfOrder the same as months - true");

        String [] extraMonths = {"Nov", "Jul", "Sep", "Jan", "Mar", "Dec", "Aug", "Feb", "May", "Jun", "Apr", "Aug", "Dec", "Dec", "Oct", "Jul", "Mar"};
        System.out.println("\nThe set to compare against is " + Arrays.toString(extraMonths));
        System.out.println("OUTPUT:   Is months the same as extraMonths - " + isSameSet(months, extraMonths));
        System.out.println("EXPECTED: Is months the same as extraMonths - true");

        System.out.println("\nOUTPUT:   Is extraMonths the same as months - " + isSameSet(months, extraMonths));
        System.out.println("EXPECTED: Is extraMonths the same as months - true");

        String [] missing = {"Nov", "Jul", "Jan", "Mar", "Dec", "Aug", "Feb", "May", "Jun", "Apr", "Aug", "Dec", "Dec", "Oct", "Jul", "Mar"};
        System.out.println("\nThe set to compare against is missing Sept: " + Arrays.toString(missing));
        System.out.println("OUTPUT:   Is months the same as missing - " + isSameSet(months, missing));
        System.out.println("EXPECTED: Is months the same as missing - false");

        System.out.println("\nOUTPUT:   Is missing the same as months - " + isSameSet(months, missing));
        System.out.println("EXPECTED: Is missing the same as months - false");

        System.out.println("\n\n------ Test with Empty Set ------");
        String [] empty = {};
        System.out.println("OUTPUT:   Is months the same as empty - " + isSameSet(months, empty));
        System.out.println("EXPECTED: Is months the same as empty - false");

        System.out.println("\nOUTPUT:   Is empty the same as months - " + isSameSet(empty, months));
        System.out.println("EXPECTED: Is empty the same as months - false");

        String [] empty2 = {};
        System.out.println("\nOUTPUT:   Is empty the same as empty - " + isSameSet(empty, empty2));
        System.out.println("EXPECTED: Is empty the same as empty - true");
    }

}

