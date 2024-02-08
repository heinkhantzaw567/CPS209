/*
 * This program determines whether an array of integer elements is in increasing order
 * For example: 1, 2, 3, 4, 5, 6, 7, 8, 9, 42 is in increasing order
 * but array: 2, 1, 3, 4, 5, 6, 7, 8, 9, 42 is not
 */

import java.util.Arrays;

public class InOrder
{

    /**
     * Checks if the given array of integers is in strictly ascending order from beginning to end.
     * The order should be strict in that the array has two elements of the same value, the method returns false.
     *
     * Note that if an array has 1 or fewer elements, it is considered in order
     *
     * @param values The array
     * @return If the array is in ascending order
     */
    public static boolean inOrder(int[] values)
    {
        //-----------Start below here. To do: approximate lines of code = 4
        // Loop through the array, and check if all the elements are in order
        
        for (int i = 0; i < values.length-1; i++) {
            if (values[i] >=values[i+1]) {
                return false;
            }
        
        }
        return true;
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        int tests_passed = 0;
        int total_tests = 5;

        System.out.println("------ Test on Regular Array in Order ------");
        int [] test_array1 = {-1, 2, 3, 4, 5, 6, 7, 8, 9, 42};
        System.out.println("Testing on array " + Arrays.toString(test_array1));
        tests_passed += runTest(test_array1, true);

        System.out.println("\n\n------ Test on Regular Array Not in Order ------");
        int [] test_array2 = {1, 2, 3, 4, 6, 5, 7, 8};
        System.out.println("Testing on array " + Arrays.toString(test_array2));
        tests_passed += runTest(test_array2, false);

        System.out.println("\n\n------ Test on Regular Array With Duplicates ------");
        int [] test_array3 = {-1, 2, 3, 4, 6, 6, 7, 8};
        System.out.println("Testing on array " + Arrays.toString(test_array3));
        tests_passed += runTest(test_array3, false);

        System.out.println("\n\n------ Test on Single Element Array ------");
        int [] test_array4 = {-10};
        System.out.println("Testing on array " + Arrays.toString(test_array4));
        tests_passed += runTest(test_array4, true);

        System.out.println("\n\n------ Test on Empty Array ------");
        int [] test_array5 = {};
        System.out.println("Testing on array " + Arrays.toString(test_array5));
        tests_passed += runTest(test_array5, true);


        System.out.println("\n\nPassed " + tests_passed + " of " + total_tests + " tests");
    }

    public static int runTest(int[] test_array, boolean expected_output)
    {
        boolean test_output = inOrder(test_array);

        if (test_output == expected_output) {
            System.out.println("TEST PASSES: CORRECTLY OUTPUTS " + test_output);
            return 1;
        } else {
            System.out.println("TEST FAILS: INCORRECTLY OUTPUTS " + test_output);
            return 0;
        }
    }
}