/*
 * You are to complete three tasks involving powers of 2.
 *
 * Task 1: Calculate the sum of the powers of 2 from 1 to 20 (inclusive), skipping over power divisible by 3.
 * Task 2: Calculate the sum of the powers of 2 from 1 to 27 (inclusive), only including those with exponents divisible by 3.
 * Task 3: Find the exponent k such that 2^3 + 2^6 + 2^9 + ... + 2^k <= 1,000,000 where the sum only includes powers of two
 *         where the exponents are divisible by 3.
 *
 * Complete the tasks in the relevant sections below.
 *
 * ONLY ADD CODE TO THE SPECIFIED AREAS. DO NOT CHANGE ANY OTHER CODE.
 */
public class PrintPowers
{
    public static void main(String[] args)
    {
        int sum = 0;
        // ---------------- TASK 1 ---------------------
        // Calculate the sum of the powers of 2 from 1 to 20 (inclusive), skipping over power divisible by 3.

        //-----------Start below here. To do: approximate lines of code = 3
        // Write a for loop that counts from 1 to 20 (inclusive).
        // Declare and use an integer variable called power as the loop variable
        // Inside the loop body use the Math.pow(double a, double b) function to compute 2^power
        // and add it to the sum variable. Note: Math.pow() returns a double. So use a cast
        // operator to cast the double number to an int. For Example: int x = (int) Math.pow(3, 4);
        // Use an the modulo operator (%) to check if a number is divisible by 3, and use an if statement to avoid
        // adding in that case
        
        for(int i =1; i< 21; i++)
        {
            if (i %3 !=0)
            {
                sum += Math.pow(2,i);
            }
        }
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        System.out.println("------ Task 1 Test ------");
        System.out.println("OUTPUT:   Sum = " + sum);
        System.out.println("EXPECTED: Sum = 1797558");




        // ---------------- TASK 2 ---------------------
        // Calculate the sum of the powers of 2 from 1 to 27 (inclusive), only including those with exponents divisible by 3.
        // So the sum will be 2^3 + 2^6 + ...
        //-----------Start below here. To do: approximate lines of code = 3
        // Reset your sum variable to 0, then use a for loop as before
        // However, this time start the for loop at the index power = 3, and instead of having the for-loop increment
        // by 1 ever time, have it increment by 3
        // Just as before, remember to cast to an int
        sum =0;
        for(int i =3; i< 28; i+=3)
        {
                
                sum += Math.pow(2,i);
            
        }
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        System.out.println("\n\n------ Task 2 Test ------");
        System.out.println("OUTPUT:   Sum = " + sum);
        System.out.println("EXPECTED: Sum = 153391688");




        // ---------------- TASK 3 ---------------------
        // Find the exponent k such that 2^3 + 2^6 + 2^9 + ... + 2^k <= 1,000,000 where the sum only includes powers of two
        // where the exponents are divisible by 3. Create a program to find this value.
        //
        // For example, if the required max total was 1000, then the value would be 9, since 2^3 + 2^6 + 2^9 = 584 <= 1000
        // but 2^3 + 2^6 + 2^9 + 2^12 = 4680 > 1000.

        int power = 0;
        sum =0;
        //-----------Start below here. To do: approximate lines of code = 5
        // For this task, you should use a while-loop
        // Reset your sum variable to 0, and use the power value given above
        // HINT: You need to be careful about what your loop exit condition is, and how that affects the power
        // In particular, recall that we want the largest power such that the sum is NO GREATER THAN 1,000,000
        do 
        {   
            
            power +=3;
            sum +=Math.pow(2,power);
            
        }while (sum < 1000000);
        power =power -3;
   
        
        
        
        
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
        System.out.println("\n\n------ Task 3 Test ------");
        System.out.println("OUTPUT:   Power = " + power);
        System.out.println("EXPECTED: Power = 18");
    }
}