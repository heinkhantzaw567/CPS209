/**
 * Create the method valueOf, which takes in a valid Roman numeral character and returns the decimal value
 * of the character. For example, if the Roman numeral is X then the valueOf method returns 10, if the Roman numeral is
 * 'D' then the value is 500. The valueOf method assumes the parameter is always one of the characters
 * 'I' 'X' 'L' 'C' 'D' 'M', which have value 1, 10, 50, 100, 500, and 1000, respectively.
 *
 * Your code does not have to handle Roman numerals consisting of more than one character
 */

import java.util.Scanner;

public class ConvertRomanNumeral
{
    /**
     Returns the integer value of the given Roman numeral
     @param numeral a single Roman numeral character (i.e. char) (one of 'I' 'X' 'L' 'C' 'D' 'M')
     @return the integer value of the Roman numeral.
     */
    //-----------Start below here. To do: approximate lines of code = 14
    // write a static method called valueOf with the appropriate parameters (see the Javadoc above) and return type.
    // see how this static method is called above in main() inside the println statements
    // Remember to start the method with "public static" followed by the return type, the method name, and then
    // the method parameters in parentheses
    
    public static int valueOf(char romanChar){

        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
            
    }
    
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public static void main(String[] args)
    {
        System.out.println("------ Tests ------");
        System.out.println("OUTPUT:   The value of 'I' is " + valueOf('I'));
        System.out.println("EXPECTED: The value of 'I' is 1");

        System.out.println("\nOUTPUT:   The value of 'C' is " + valueOf('C'));
        System.out.println("EXPECTED: The value of 'C' is 100");

        System.out.println("\nOUTPUT:   The value of 'X' is " + valueOf('X'));
        System.out.println("EXPECTED: The value of 'X' is 10");

        System.out.println("\nOUTPUT:   The value of 'D' is " + valueOf('D'));
        System.out.println("EXPECTED: The value of 'D' is 500");

        System.out.println("\nOUTPUT:   The value of 'M' is " + valueOf('M'));
        System.out.println("EXPECTED: The value of 'M' is 1000");

        System.out.println("\nOUTPUT:   The value of 'L' is " + valueOf('L'));
        System.out.println("EXPECTED: The value of 'L' is 50");
    }
}
