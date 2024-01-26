/*
 * You should create a method that calculates the tax refund amount based on the income for the year and the number of
 * children a person has.
 *
 * The rules are:
 * Note: the abbreviation ch represents the number of children)
 * Income > 30000$ and <= 40000$ and ch > 0, refund is 1000.0$ * ch
 * Income > 20000$ and <= 30000$ and ch > 0, refund is 1500.0$ * ch
 * Income <= 20000$ and ch > 0, refund is 2000.0$ * ch
 *
 * Otherwise, the refund is 0.0.
 *
 * For example, if the income was 34312$ and the number of children (ch) was 7 then the tax refund would be: 1000*7 = 7000.0$
 *
 */

public class TaxRefund
{
    //-----------Start below here. To do: approximate lines of code = 9
    // Write a method called "refund" whose return type is double and that has two parameters. The first is a
    // double for the person's income. The second is a integer for the number of children. The return value should
    // be the amount of the refund. See the way to calculate the refund at the top of this file.
    //
    // Remember to start the method with "public static" followed by the return type, the method name, and then
    // the method parameters in parentheses
    
    public static  double refund (double income, int ch)
    {
        double refundmoney =0.0;
        if ((income>30000 && income <=40000) && ch>0){
            refundmoney =1000.0;
        }
        else if ((income>20000 && income <=30000) && ch>0){
            refundmoney =1500.0;
        }
        else if (income<20000 && ch>0){
            refundmoney =2000.0;
        }
        if (ch>0){
            double result =refundmoney*ch;
            return result;
        }
        return refundmoney;
    }
    
    
    
    
    
    
    
    
    
    
    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

    public static void main(String[] args)
    {
        System.out.println("------ Tests ------");
        System.out.println("OUTPUT  : with income 23000 and 2 children, refund is " + refund(23000, 2));
        System.out.println("EXPECTED: with income 23000 and 2 children, refund is 3000.0");

        System.out.println("\nOUTPUT  : with income 17500 and 3 children, refund is " + refund(17500, 3));
        System.out.println("EXPECTED: with income 17500 and 3 children, refund is 6000.0");

        System.out.println("\nOUTPUT  : with income 80000 and 9 children, refund is " + refund(80000, 9));
        System.out.println("EXPECTED: with income 80000 and 9 children, refund is 0.0");

        System.out.println("\nOUTPUT  : with income 35000 and 5 children, refund is " + refund(35000, 5));
        System.out.println("EXPECTED: with income 35000 and 5 children, refund is 5000.0");

        System.out.println("\nOUTPUT  : with income 35000 and -1 children, refund is " + refund(35000, -1));
        System.out.println("EXPECTED: with income 35000 and -1 children, refund is 0.0");
    }
}
