/**
 * You should complete the following code which introduces you to the basics of the Scanner class.
 * You should look into the Java scanner methods (e.g. scanner.nextDouble(), scanner.nextInt(), scanner.next(),
 * scanner.nextLine() etc) as needed.
 */

import java.util.Scanner;

public class ScannerTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner("5.42 integer 99 Hello World!");
        //-----------Start below here. To do: approximate lines of code = 4
        // 1. read a double number from scanner into a variable called x
        
        //2. read a word (ie. String) into a variable word
        
        //3. read an integer from the scanner into a variable called i
        
        //4. read the rest of the words into a variable called line
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        double x = scanner.nextDouble();
        String word = scanner.next();
        int i = scanner.nextInt();
        String line = scanner.nextLine();
        
        System.out.println("------ Double Test ------");
        System.out.println("OUTPUT:   " + x);
        System.out.println("EXPECTED: 5.42");

        System.out.println("\n\n------ Word Test ------");
        System.out.println("OUTPUT:   " + word);
        System.out.println("EXPECTED: Integer");

        System.out.println("\n\n------ Integer Test ------");
        System.out.println("OUTPUT:   " + i);
        System.out.println("EXPECTED: 99");

        System.out.println("\n\n------ Word Test ------");
        System.out.println("OUTPUT:   " + word);
        System.out.println("EXPECTED: integer");

        System.out.println("\n\n------ Line Test ------");
        System.out.println("OUTPUT:   " + line);
        System.out.println("EXPECTED:  Hello World!");

        System.out.println("\n\n------ Type Test ------");
        System.out.println("If the following is not correct, then i does not have the correct type");
        System.out.println("OUTPUT:   " + (i / 2));
        System.out.println("EXPECTED: 49");
        System.out.println("\nIf the following is not correct, then x does not have the correct type");
        System.out.println("OUTPUT:   " + (x / x));
        System.out.println("EXPECTED: 1.0");

    }
}