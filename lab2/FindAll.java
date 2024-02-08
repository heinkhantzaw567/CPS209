/**
 * Complete the method which takes in a list of words as Strings and a target String, creates a boolean array that
 * indicates whether the target String is at each location in words.
 *
 * For example, if the input list is ["a", "b", "b", "a", "c", "k", "b", "a"] and the target is "b". Then the output
 * should be [false, true, true, false, false, false, true, false], since "b" is at locations 1, 2, and 6, but not
 * anywhere else.
 */

import java.util.Arrays;

public class FindAll
{
    /**
     * Given a target String and an array of Strings, creates a boolean array indicating whether
     * or not the target String is at each location.
     *
     * The input array of
     *
     * @param words The input array of Strings
     * @param target The target String we are searching for
     * @return A boolean array showing where the target string is
     */
    public static boolean [] findAll(String [] words, String target)
    {
        boolean [] inList = new boolean [words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                inList[i] = true;
            } else {
                inList[i] = false;
            }
        }

        return inList;
    }

    public static void main(String[] args)
    {
        String [] words1 = {"a", "b", "b", "a", "c", "k", "b", "a"};
        String target1 = "b";
        boolean [] expected1 = {false, true, true, false, false, false, true, false};
        runTest(words1, target1, expected1);

        System.out.println();
        String target2 = "a";
        boolean [] expected2 = {true, false, false, true, false, false, false, true};
        runTest(words1, target2, expected2);

        System.out.println();
        String target3 = "q";
        boolean [] expected3 = {false, false, false, false, false, false, false, false};
        runTest(words1, target3, expected3);
    }

    public static void runTest(String [] words, String target, boolean [] expected) {
        String [] words2 = words.clone();
        System.out.println("Testing with target " + target + " on list " + Arrays.toString(words));
        System.out.println("OUTPUT:   the find all array is " + Arrays.toString(findAll(words, target)));
        System.out.println("EXPECTED: the find all array is " + Arrays.toString(expected));
        System.out.println("OUTPUT:   the words array after the call is " + Arrays.toString(words));
        System.out.println("EXPECTED: the words array after the call is " + Arrays.toString(words2));
    }
}
