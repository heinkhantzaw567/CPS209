/**
 * Complete the method to find the longest String in an array list of Strings.
 */

import java.util.ArrayList;

public class FindLongestString
{
    /**
     * Finds the longest String in the given ArrayList of Strings. Can assume the list contains at least
     * one string
     * @param stringList The list of Strings
     * @return The longest String in the list
     */
    public static String findLongest(ArrayList<String> stringList)
    {
        //-----------Start below here. To do: approximate lines of code = 8
        // Loop through the list and keep track of the longest String so far. Return that String at the end
        
        String max = stringList.get(0);
        for (int i =0; i<stringList.size(); i++)
        {
            if (stringList.get(i).length() > max.length())
            {
                max =stringList.get(i);
            }
        }
        return max;
        
        
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        System.out.println("------ Test with 6 Element ArrayList ------");

        ArrayList<String> elems = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile", "city", "deviation"};
        for (int i = 0; i < words.length; i++) {
            elems.add(words[i]);
        }
        System.out.println("ArrayList is "+ elems);
        System.out.println("OUTPUT:   Longest String is " + findLongest(elems));
        System.out.println("EXPECTED: Longest String is metropolitan");

        System.out.println("\n\n------ Test with 5 Element ArrayList, Longest at Front ------");

        elems = new ArrayList<String>();
        String[] words2 = {"tarantula", "cattle", "metro", "turnstile", "city"};
        for (int i = 0; i < words2.length; i++) {
            elems.add(words2[i]);
        }
        System.out.println("ArrayList is "+ elems);
        System.out.println("OUTPUT:   Longest String is " + findLongest(elems));
        System.out.println("EXPECTED: Longest String is tarantula");

        System.out.println("\n\n------ Single Word List ------");

        elems = new ArrayList<String>();
        elems.add("happy");
        System.out.println("ArrayList is "+ elems);
        System.out.println("OUTPUT:   Longest String is " + findLongest(elems));
        System.out.println("EXPECTED: Longest String is happy");
    }
}
