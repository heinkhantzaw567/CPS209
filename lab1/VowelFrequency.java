/*
 * You are to complete a program that counts the number of 'a' , 'e', 'i', 'o', 'u' characters
 * that occur in a sentence string
 *
 * For example, if the sentence string is "hello how are you"
 * the output should be:
 * a 1
 * e 2
 * i 0
 * o 3
 * u 1
 *
 */

public class VowelFrequency
{
    public static int countvowel(String str, char c)
    {
        int count =0;
        for (int i =0; i<str.length(); i++)
        {
            if (str.charAt(i) == c)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        String sentence = "the quick brown fox jumps over the lazy dog";
        sentence =sentence.toUpperCase();
        int aCount = countvowel(sentence, 'A');
        int eCount = countvowel(sentence, 'E');
        int iCount = countvowel(sentence, 'I');
        int oCount =countvowel(sentence, 'O');
        int uCount = countvowel(sentence, 'U');
        //-----------Start below here. To do: approximate lines of code = 5
        // Create a separate integer variable for each vowel.
        // Call these aCount, eCount, iCount, oCount, and uCount.
        // Initialize them all to 0.
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

        //-----------Start below here. To do: approximate lines of code = 12
        // Write a for loop that counts from 0 to the length-1 of the string variable sentence (see above)
        // Inside the loop use the charAt() method of the String class and check if the current character of the sentence is a
        // one of 'a' 'e' 'i' 'o' 'u'.
        // If it is, increment the appropriate count variable by 1
        // Hints: use sentence.length() to determine the length of the sentence string. Use sentence.charAt(i) to get the ith character in the string.
		// Keep in mind that the char variable type is a primitive type - it is not a string!. 	So compare a char variable to constant characters like 'e' not "e"
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

        System.out.println("------ 'a' Test ------");
        System.out.println("OUTPUT:   a = " + aCount);
        System.out.println("EXPECTED: a = 1");

        System.out.println("\n\n------ 'e' Test ------");
        System.out.println("OUTPUT:   e = " + eCount);
        System.out.println("EXPECTED: e = 3");

        System.out.println("\n\n------ 'i' Test ------");
        System.out.println("OUTPUT:   i = " + iCount);
        System.out.println("EXPECTED: i = 1");

        System.out.println("\n\n------ 'o' Test ------");
        System.out.println("OUTPUT:   o = " + oCount);
        System.out.println("EXPECTED: o = 4");

        System.out.println("\n\n------ 'u' Test ------");
        System.out.println("OUTPUT:   o = " + uCount);
        System.out.println("EXPECTED: o = 2");

    }
}
