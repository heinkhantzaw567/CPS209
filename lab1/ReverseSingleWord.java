/*
 * The program below is intended to iterate through the words in a list of words (using Scanner), and reverse each
 * word. You will complete the part that reverses each word. For example, if the word is "word", then the result
 * should be "drow", and if the input is "total", then the result should be "latot".
 */

import java.util.Scanner;

public class ReverseSingleWord
{
    public static void main(String[] args)
    {
        String words = "word total quick";
        Scanner in = new Scanner(words);

        int test = 0;

        while (in.hasNext()) {
            test++;
            String word = in.next();

            String reversedWord ="";
            //-----------Start below here. To do: approximate lines of code = 3
            // Reverse word and store in a variable called reversedWord.
            // 1. You must use a for loop and the charAt() method of class String to
            // store the reversed word into a string and then print the reversed word
            // Hint: count down rather than up in the for loop (i.e. start at the end of the word)
            
            for (int i=word.length()-1; i>=0; i--)
            {
                reversedWord += word.charAt(i);
            }
            
            
            //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

            System.out.println("------ Test " + test + " ------");
            System.out.println("OUTPUT:   The reverse of \"" + word + "\" is " + reversedWord);
            if (test == 1)
            {
                System.out.println("EXPECTED: The reverse of \"word\" is drow\n");
            }
            else if (test == 2)
            {
                System.out.println("EXPECTED: The reverse of \"total\" is latot\n");
            }
            else if (test == 3)
            {
                System.out.println("EXPECTED: The reverse of \"quick\" is kciuq\n");
            }
        }
    }
}
