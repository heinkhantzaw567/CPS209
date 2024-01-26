/*
 * You are to create a method, isLeapYear, which determines whether a given year is a leap year or not.
 * The rules for a leap year are given below.
 */

public class IsLeapYear
{
    /**
     * Determines if input is a leap year.
     *
     * @param year current year (integer)
     * @return true if year is a leap year, false otherwise
     */
    //-----------Start below here. To do: approximate lines of code = 6
    // Write a static method isLeapYear. This method returns a boolean. It takes one parameter: the integer
    // value for the year and returns true if it is a leap year and false otherwise. There are two cases for leap years:
    //
    // 1. The year is exactly divisible by 400
    // 2. The year is not divisible by 400, but it is divisible by 4 AND it is NOT exactly divisible by 100
    //
    // Hint: use the modulus operator (i.e. remainder operator) % to check if exactly divisible
    
    public static boolean isLeapYear(int y)
    {
        if (y %400 ==0)
        {
            return true;
        }
        else if (y%4 ==0 && y%100 != 0)
        {
            return true;
        }
        return false;
    }
    
    
    
    
    
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public static void main(String[] args)
    {
        System.out.println("------ Tests ------");
        System.out.println("OUTPUT:   Is 500 a leap year? " + isLeapYear(500));
        System.out.println("EXPECTED: Is 500 a leap year? false");

        System.out.println("\nOUTPUT:   Is 2022 a leap year? " + isLeapYear(2022));
        System.out.println("EXPECTED: Is 2022 a leap year? false");

        System.out.println("\nOUTPUT:   Is 1020 a leap year? " + isLeapYear(1020));
        System.out.println("EXPECTED: Is 1020 a leap year? true");

        System.out.println("\nOUTPUT:   Is 100 a leap year? " + isLeapYear(100));
        System.out.println("EXPECTED: Is 100 a leap year? false");

        System.out.println("\nOUTPUT:   Is 1724 a leap year? " + isLeapYear(1724));
        System.out.println("EXPECTED: Is 1724 a leap year? true");

        System.out.println("\nOUTPUT:   Is 1200 a leap year? " + isLeapYear(1200));
        System.out.println("EXPECTED: Is 1200 a leap year? true");
    }

}