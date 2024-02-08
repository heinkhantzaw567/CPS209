/**
 * Create two methods, getAverage and getAverageOfEvens, both of which take in an 2D int array as a parameter.
 * getAverage will then compute the average of ALL the elements in the input array. getAverageOfEvens will
 * compute the average of just the even numbers in the input.
 *
 * For example, if the array is
 *
 *        5  6  7
 *        8  9  1
 *
 * Then getAverage will return (5 + 6 + 7 + 8 + 9 + 1)/6 and getAverageOfEvens will return (6 +  8)/2.
 */

import java.util.Arrays;

public class TwoDimAverager
{
    //-----------Start below here. To do: approximate lines of code = 6
    //
    // Create a method called getAverage which takes in a 2D int array and returns a double.
    // The returned value should be the average of all the values in the input array
    //
    // Use nested loops to loop over all the elements in the 2D array. Use a double variable
    // to keep track of the running sum. Use that running sum to calculate the average and return it
    // HINT: Will need to calculate the average by dividing the total sum of elements by the number
    // of elements in the array. How are you going to calculate that number?
    //
    // Also, make sure your implementation does not change the input array and be careful about integer division.
    
    public static double getAverage(int [][] array){
        double sum =0.0;
        int count=0;
        for (int i=0; i<array.length; i++)
        {
            for (int j =0; j<array[i].length; j++)
            {
                sum += array[i][j];
                count++;
            }
        }
        return sum/count;

    }
    
    
    
    
    
    
    
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    //-----------Start below here. To do: approximate lines of code = 11
    // Create a method called getAverageOfEvens which takes in a 2D int array and returns a double
    // that is the average of just the even numbers in the array.
    //
    // The implementation should be very similar to getAverage, which we suggest you do first.
    
    
    
    public static double getAverageOfEvens (int [][] array){
        double sum =0.0;
        int count=0;
        for (int i=0; i<array.length; i++)
        {   
           
            for (int j =0; j<array[i].length; j++)
            {
                if (array[i][j]%2 ==0){
                sum += array[i][j];
                
                count++;
            }
            
        }
        

    }
    if (count==0) return 0.0;
    return sum/count;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public static void main(String[] args)
    {
        System.out.println("------ Test on 4x5 Array ------");
        int[][] test_4x5 = {{5, 9, 3, 2, 14}, {77, 44, 22, 15, 99},
                {14, 2, 3, 9, 5}, {88, 15, 17, 121, 33}};
        runTest(test_4x5, 29.85, 26.57);

        System.out.println("\n\n------ Test on 4x4 Array ------");
        int[][] test_4x4 = {{5, 9, 3, 2}, {77, 44, 22, 15},
                {14, 2, 3, 9}, {88, 15, 17, 121}};
        runTest(test_4x4, 27.88, 28.67);

        System.out.println("\n\n------ Test on 1x3 Array ------");
        int[][] test_1x3 = {{9, 3, 2}};
        runTest(test_1x3, 4.67, 2.00);

        System.out.println("\n\n------ Test on 5x1 Array ------");
        int[][] test_5x1 = {{9}, {56}, {34}, {90}, {3}};
        runTest(test_5x1, 38.40, 60.00);

        System.out.println("\n\n------ Test on No Evens ------");
        int[][] test_4x4_no_evens = {{5, 9, 3, 21}, {77, 441, 221, 15},
                {141, 21, 3, 9}, {881, 15, 17, 121}};
        runTest(test_4x4_no_evens, 125.0, 0);
    }

    public static void runTest(int [][] testArray, double expectedAverage, double expectedAverageEvens) {
        System.out.println("The test array is " + Arrays.deepToString(testArray));
        int [][] copy = copy2DArray(testArray);

        double output = getAverage(copy);

        boolean pass = true;
        System.out.printf("OUTPUT of getAverage:   %.2f\n", output);
        if (Math.abs(output - expectedAverage) >= 0.01) {
            System.out.println("EXPECTED of getAverage: " + expectedAverage);
            System.out.println("    INCORRECT OUTPUT");
            pass = false;
        }
        if (!are2DArraysEqual(testArray, copy)) {
            System.out.println("    INCORRECT - The input array list has been changed to " + Arrays.deepToString(copy));
            pass = false;
        }

        output = getAverageOfEvens(copy);

        System.out.printf("OUTPUT of getAverageOfEvens:   %.2f\n", output);
        if (Math.abs(output - expectedAverageEvens) >= 0.01) {
            System.out.println("EXPECTED of getAverageOfEvens: " + expectedAverageEvens);
            System.out.println("    INCORRECT OUTPUT");
            pass = false;
        }
        if (!are2DArraysEqual(testArray, copy)) {
            System.out.println("    INCORRECT - The input array list has been changed to " + Arrays.deepToString(copy));
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
     * Checks that the 2D integer arrays are equal
     *
     * @param array1 The first array
     * @param array2 The second array
     * @return If they are equal or not
     */
    public static boolean are2DArraysEqual(int [][] array1, int [][] array2) {
        if (array1 == null || array2 == null) {
            return array1 == array2;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i].length != array2[i].length) {
                return false;
            }
            for (int j = 0; j <array1[i].length; j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Copies a 2D array.
     *
     * @param toCopy The array to copy
     * @return The copy
     */
    public static int [][] copy2DArray(int [][] toCopy) {
        int [][] copy = new int [toCopy.length][];
        for (int i = 0; i < toCopy.length; i++) {
            copy[i] = Arrays.copyOf(toCopy[i], toCopy[i].length);
        }
        return toCopy;
    }

}
