/**
 * Complete the method to append one array list to another. Do not use the ArrayList library to do it as you should
 * get practice using loops.
 */

import java.util.ArrayList;

public class AppendArrayLists
{
    /**
     * Append the given ArrayList b to the end of the given ArrayList a. Note that b should not be changed
     * by this method.
     *
     * @param a An ArrayList of integers
     * @param b An ArrayList of integers
     */
    public static void append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        //-----------Start below here. To do: approximate lines of code = 2
        // append the integer elements in ArrayList b to the end of ArrayList0 a
        // Hint: use a for loop that goes through each element of ArrayList b, don't forget the class ArrayList has a size() method that
        for (int i =0; i<b.size(); i++)
        {
            a.add(b.get(i));
        }
    
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> a;
        ArrayList<Integer> b;

        System.out.println("------ Append Empty Array List to an non-Empty One ------");
        a = getTestList(5, 3);
        b = new ArrayList<>();
        System.out.println("Append " + b + " to " + a);
        append(a, b);
        System.out.println("OUTPUT for a:   " + a);
        System.out.println("EXPECTED for a: [3, 4, 5, 6, 7]");
        System.out.println("OUTPUT for b:   " + b);
        System.out.println("EXPECTED for b: []");

        System.out.println("\n\n------ Append Non-Empty List to an Empty One ------");
        a = new ArrayList<>();
        b = getTestList(3, 4);
        System.out.println("Append " + b + " to " + a);
        append(a, b);
        System.out.println("OUTPUT for a:   " + a);
        System.out.println("EXPECTED for a: [4, 5, 6]");
        System.out.println("OUTPUT for b:   " + b);
        System.out.println("EXPECTED for b: [4, 5, 6]");

        System.out.println("\n\n------ Append Two Non-Empty Lists ------");
        a = getTestList(5, 3);
        b = getTestList(3, 4);
        System.out.println("Append " + b + " to " + a);
        append(a, b);
        System.out.println("OUTPUT for a:   " + a);
        System.out.println("EXPECTED for a: [3, 4, 5, 6, 7, 4, 5, 6]");
        System.out.println("OUTPUT for b:   " + b);
        System.out.println("EXPECTED for b: [4, 5, 6]");
    }

    /**
     * Creates and returns a test Array List of the given size, starting from the given value and incrementing
     * every value by 1.
     *
     * @param size  The ArrayList size
     * @param start The starting value
     * @return The new array list
     */
    public static ArrayList<Integer> getTestList(int size, int start)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(i + start);
        }
        return list;
    }
}

