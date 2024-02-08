/*
 * Complete the method that rearranges an array of list of words so that any word beginning with an uppercase letter
 * is shifted to the front of the list, and the rest are shifted to the end. The order relative order of all the upper
 * case words should stay the same before and after the shift. The same should be true of the lower case words.
 * For example, if the input list is
 *
 *      "Every" "dog" "named" "Rover" "in" "the" "city" "of" "Toronto" "always" "seems" "to" "be" "friendly"
 *
 * the result after the shifting should be
 *
 *           "Every" "Rover" "Toronto" "dog" "named" "in" "the" "city" "always" "seems" "to" "be" "friendly"
 *
 */

import java.util.ArrayList;

public class ShiftStrings
{
    /**
     * Shifts all strings starting with an uppercase letter to the
     * beginning, without otherwise changing the order of the elements
     *
     * @param list ArrayList of strings to be shifted
     */
    public static void shiftUppercase(ArrayList<String> list)
    {
        //-----------Start below here. To do: approximate lines of code = 9
        //
        // You may want to consider building temporary lists to store the words that start with upper and lower case words
        // There is also a way to do it without temporary lists. Come up with an algorithm first before coding it up
        //
        // You will need to use the method Character.isUpperCase() and the String method charAt(),
        // You will need to use the ArrayList methods size(), get(), remove(), and the add() method that takes two parameters
        int insertIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (uppercasecheck(str)) {
                list.add(insertIndex, str); 
                insertIndex++;
                list.remove(i + 1); 
            }
        }

        

                
        
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    public static boolean uppercasecheck (String name)
        {
            for (int i=0; i<name.length();i++)
            {
                if (Character.isUpperCase(name.charAt(i)))
                {
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args)
    {
        // Note that the lists are created as arrays first, but then converted to ArrayLists before the test is done
        // This is just for the convenience.
        System.out.println("------ Test 1 on mix of upper and lower case ------");
        String [] test1 = {"So", "much", "has", "been", "written", "about", "The", "Beatles"};
        String [] expected1 = {"So", "The", "Beatles", "much", "has", "been", "written", "about"};
        runTests(test1, expected1);

        System.out.println("\n\n------ Test 2 on mix of upper and lower case ------");
        String [] test2 = {"Every", "dog", "named", "Rover", "in", "the", "city", "of", "Toronto", "always", "seems", "to", "be", "friendly"};
        String [] expected2 = {"Every", "Rover", "Toronto", "dog", "named", "in", "the", "city", "of", "always", "seems", "to", "be", "friendly"};
        runTests(test2, expected2);

        System.out.println("\n\n------ Test on all upper case ------");
        String [] test3 = {"All", "Are", "Upper", "Case"};
        String [] expected3 = {"All", "Are", "Upper", "Case"};
        runTests(test3, expected3);

        System.out.println("\n\n------ Test on all lower case ------");
        String [] test4 = {"all", "are", "lower", "case"};
        String [] expected4 = {"all", "are", "lower", "case"};
        runTests(test4, expected4);

        System.out.println("\n\n------ Test on empty list ------");
        String [] test5 = {};
        String [] expected5 = {};
        runTests(test5, expected5);
    }

    public static void runTests(String [] testArray, String [] expected) {
        ArrayList<String> testList = getArrayListFromArray(testArray);
        ArrayList<String> expectedList = getArrayListFromArray(expected);

        System.out.println("Testing on array " + testList);

        boolean pass = true;
        shiftUppercase(testList);
        System.out.println("RESULT after shiftUppercase:   " + testList);
        if (!testList.equals(expectedList)) {
            System.out.println("EXPECTED after shiftUppercase: " + expectedList);
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
    public static ArrayList<String> getArrayListFromArray(String [] values)
    {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }
        return list;
    }
}
