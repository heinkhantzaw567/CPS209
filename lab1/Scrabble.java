/*
 * Complete the following program which calculates the value of a word in the game Scrabble. For those who don't know
 * Scrabble, players put down words on a board, and they get points based on how rare the letters they use are. The
 * values of the letters are given below:
 *  Scrabble letter values:
 *      A,E,I,O,U,L,N,S,T,R  = 1
 *      D,G = 2
 *      B,C,M,P = 3
 *      F, H, V, W, Y = 4
 *      K = 5
 *      J, X = 8
 *      Q, Z = 10
 *
 * Below, you must complete two methods. The first takes in a character and returns the Scrabble value of it.
 * The second calculates the Scrabble value of an entire word.
*/

public class Scrabble
{

    /**
     * Finds the point value of a letter in Scrabble
     *
     * @param ch the character to be evaluated
     * @return the letter point value (int)
     */
    public static int letterValue(char ch)
    {
        int value = 0;
        //-----------Start below here. To do: approximate lines of code = 41
        // Use an If or switch statement to determine the value of the input letter
        // See the comments at the top of the file for Scrabble letter values.
        // HINT: This method should handle both upper and lower case characters, so use the toUpperCase(c) method in
        // the character library to first get the upper case value, before then passing that to your if/switch statement
        //
        // WE STRONGLY ENCOURAGE YOU TO TRY IMPLEMENTING IT AS BOTH AN IF OR SWITCH STATEMENT SO YOU CAN SEE THE DIFFERENCE
        
        ch = Character.toUpperCase(ch);
        if (ch =='A'||  ch =='E'||ch =='I'||ch =='O'||ch =='U'||
            ch =='L'||ch =='N'||  ch =='S'||ch =='T'||ch =='R'){
                value =1;
            }
           
        else if (ch =='D'||ch =='G')
        {
            value =2;
        }
        else if (ch =='B'||ch =='C'|| ch =='M'||ch =='P')
        {
            value =3;
        }
        else if(ch =='F'||ch =='H' || ch =='V'||ch =='W' || ch =='Y')
        {
            value =4;
        }
        else if (ch =='K')
            value=  5;
        else if (ch =='J'||ch =='X' )
            value =8;
        else if (ch =='Q'||ch =='Z' )
            value =10;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        return value;
    }

    /**
     * Finds the point value of a word in Scrabble
     *
     * @param str the word to be evaluated
     * @return the letter point value of the word
     */
    public static int wordValue(String str)
    {
        int total = 0;
        //-----------Start below here. To do: approximate lines of code = 2
        // Use a for loop to loop over the letters in the word. For each, call the letterValue method above
        // to get the letter's value, and add it to total
        for (int i=0; i<str.length(); i++)
        {
            total += letterValue(str.charAt(i));
        }
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        return total;
    }

    public static void main(String[] args)
    {
        System.out.println("------ Letters Test ------");
        System.out.println("OUTPUT:   The value of 'A' is " + letterValue('A'));
        System.out.println("EXPECTED: The value of 'A' is 1");

        System.out.println("\nOUTPUT:   The value of 'a' is " + letterValue('a'));
        System.out.println("EXPECTED: The value of 'a' is 1");

        System.out.println("\nOUTPUT:   The value of 'Q' is " + letterValue('Q'));
        System.out.println("EXPECTED: The value of 'Q' is 10");

        System.out.println("\nOUTPUT:   The value of 'q' is " + letterValue('q'));
        System.out.println("EXPECTED: The value of 'q' is 10");

        System.out.println("\n\n------ Words Tests ------");
        System.out.println("OUTPUT:   The value of \"A\" is " + wordValue("A"));
        System.out.println("EXPECTED: The value of \"A\" is 1");

        System.out.println("\nOUTPUT:   The value of \"abdicate\" is " + wordValue("abdicate"));
        System.out.println("EXPECTED: The value of \"abdicate\" is 13");

        System.out.println("\nOUTPUT:   The value of \"kite\" is " + wordValue("kite"));
        System.out.println("EXPECTED: The value of \"kite\" is 8");

        System.out.println("\nOUTPUT:   The value of \"quick\" is " + wordValue("quick"));
        System.out.println("EXPECTED: The value of \"quick\" is 20");

        System.out.println("\nOUTPUT:   The value of \"zap\" is " + wordValue("zap"));
        System.out.println("EXPECTED: The value of \"zap\" is 14");

        System.out.println("\nOUTPUT:   The value of \"about\" is " + wordValue("about"));
        System.out.println("EXPECTED: The value of \"about\" is 7");

        System.out.println("\nOUTPUT:   The value of \"cattle\" is " + wordValue("cattle"));
        System.out.println("EXPECTED: The value of \"cattle\" is 8");
    }


}
