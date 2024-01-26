import java.util.Scanner;

/**
 * You are to complete a program that can take in a String and constructs the String that has the same characters,
 * but in reverse order. However, unlike ReverseSingleWord, this problem requires you to so in a method. You need
 * to create a method that accomplishes this task that follows the specified method signature.
 *
 * HINT: Complete ReverseSingleWord.java first, then copy the relevant part of the solution here and wrap it in
 * a method.
 */

public class ReverseWordsUsingMethod
{
    public static String reverseWord(String str){
        Scanner in = new Scanner(str);

        int test = 0;
        String reversedWord ="";
        while (in.hasNext()) {
            test++;
            String word = in.next();

            
            for (int i=word.length()-1; i>=0; i--)
            {
                reversedWord += word.charAt(i);
            }

    }
    return reversedWord;
}
    //-----------Start below here. To do: approximate lines of code = 5
    // Create a method called reverseWord that takes in a String as a parameter and returns a String that
    // is the reverse of the input String
    // Remember to start the method with "public static" followed by the return type, the method name, and then
    // the method parameters in parentheses
    // HINT: Look back at the code you wrote for ReverseSingleWord, just "wrap" it inside of a method.
    
    
    
    
    
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public static void main(String[] args)
    {
        System.out.println("------ Standard Word Tests ------");
        System.out.println("OUTPUT:   The reverse of \"quick\" is " + reverseWord("quick"));
        System.out.println("EXPECTED: The reverse of \"quick\" is kciuq");

        System.out.println("\nOUTPUT:   The reverse of \"broWn\" is " + reverseWord("broWn"));
        System.out.println("EXPECTED: The reverse of \"broWn\" is nWorb");

        System.out.println("\nOUTPUT:   The reverse of \"Alligator\" is " + reverseWord("Alligator"));
        System.out.println("EXPECTED: The reverse of \"Alligator\" is rotagillA");

        System.out.println("\n\n------ Corner Case Word tests ------");
        System.out.println("OUTPUT:   The reverse of \"A\" is " + reverseWord("A"));
        System.out.println("EXPECTED: The reverse of \"A\" is A");

        System.out.println("\nOUTPUT:   The reverse of \"\" is " + reverseWord(""));
        System.out.println("EXPECTED: The reverse of \"\" is ");

        System.out.println("\nOUTPUT:   The reverse of \"radar\" is " + reverseWord("radar"));
        System.out.println("EXPECTED: The reverse of \"radar\" is radar");


    }
}
