/**
 * Complete the method which calculates the average of the elements in an integer array.
 */

import java.util.Arrays;

public class ArrayAverage
{

    /**
     * Returns the average of the elements in the given integer array.
     *
     * @param data The input array
     * @return The average of the values in the input array
     */
    public static double getAverage(int[] data)
    {
        //-----------Start below here. To do: approximate lines of code = 5
        //
        double sum =0.0;
        for (int i =0; i<data.length; i++)
        {
            sum += data[i];
        }
        return sum/ data.length;
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        System.out.println("------ Test Standard Array ------");
        int[] data1 = {2, 34, 57, 31, 5, 79, 88, 62, 98, 53, 42};
        System.out.println("Test on array " + Arrays.toString(data1));
        System.out.printf("OUTPUT:   The average is %.2f\n", getAverage(data1));
        System.out.println("EXPECTED: The average is 50.09");

        System.out.println("\n\n------ Test On Different Standard Array ------");
        int[] data2 = {2, 100, 57, -31, 5, -79, 88, 620, 98, -53, 42};
        System.out.println("Test on array " + Arrays.toString(data2));
        System.out.printf("OUTPUT:   The average is %.2f\n", getAverage(data2));
        System.out.println("EXPECTED: The average is 77.18");

        System.out.println("\n\n------ Test One Element Array ------");
        int[] data3 = {2};
        System.out.println("Test on array " + Arrays.toString(data3));
        System.out.printf("OUTPUT:   The average is %.2f\n", getAverage(data3));
        System.out.println("EXPECTED: The average is 2.00");
    }
}
