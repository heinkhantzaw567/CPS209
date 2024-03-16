import java.util.Arrays;
import java.util.Scanner;

// The city consists of a grid of 9 X 9 City Blocks

// Streets are east-west (1st street to 9th street)
// Avenues are north-south (1st avenue to 9th avenue)

// Example 1 of Interpreting an address:  "34 4th Street"
// A valid address *always* has 3 parts.
// Part 1: Street/Avenue residence numbers are always 2 digits (e.g. 34).
// Part 2: Must be 'n'th or 1st or 2nd or 3rd (e.g. where n => 1...9)
// Part 3: Must be "Street" or "Avenue" (case insensitive)

// Use the first digit of the residence number (e.g. 3 of the number 34) to determine the avenue.
// For distance calculation you need to identify the the specific city block - in this example 
// it is city block (3, 4) (3rd avenue and 4th street)

// Example 2 of Interpreting an address:  "51 7th Avenue"
// Use the first digit of the residence number (i.e. 5 of the number 51) to determine street.
// For distance calculation you need to identify the the specific city block - 
// in this example it is city block (7, 5) (7th avenue and 5th street)
//
// Distance in city blocks between (3, 4) and (7, 5) is then == 5 city blocks
// i.e. (7 - 3) + (5 - 4) 

public class CityMap
{
  // Checks for string consisting of all digits
  // An easier solution would use String method matches()
// Check if all characters in the string 's' are digits
private static boolean allDigits(String s)
{
    // Iterate through each character in the string 's'
    for (int i = 0; i < s.length(); i++) {
        // Check if the character at index 'i' is not a digit
        if (!Character.isDigit(s.charAt(i))) {
            // If any non-digit character is found, return false
            return false;
        }
    }
    // If all characters are digits, return true
    return true;
}


  // Get all parts of address string
  // An easier solution would use String method split()
  // Other solutions are possible - you may replace this code if you wish
  private static String[] getParts(String address)
  {
    String parts[] = new String[3];
    
    if (address == null || address.length() == 0)
    {
      parts = new String[0];
      return parts;
    }
    int numParts = 0;
    Scanner sc = new Scanner(address);
    while (sc.hasNext())
    {
      if (numParts >= 3){
        parts = Arrays.copyOf(parts, parts.length+1);
      }
      parts[numParts] = sc.next();
      numParts++;
    }
    if (numParts == 1)
      parts = Arrays.copyOf(parts, 1);
    else if (numParts == 2)
      parts = Arrays.copyOf(parts, 2);
    return parts;
  }

  // Checks for a valid address
  // Split the address string into parts and validate each part
public static boolean validAddress(String address)
{
    String[] parts = getParts(address);
    
    // Check if address has exactly three parts
    if (parts.length != 3) {
        return false;
    }

    // Validate the first part (should be two digits)
    String part1 = parts[0];
    if (part1.length() != 2 || !allDigits(part1)) {
        return false;
    }

    // Validate the second part (should be a number followed by "st", "nd", "rd", or "th")
    String part2 = parts[1];
    if (part2.length() != 3) {
        return false;
    }
    char firstDigit = part2.charAt(0);
    String suffix = part2.substring(1);
    int num = Integer.parseInt(String.valueOf(firstDigit));
    if ((num == 1 && !suffix.equals("st")) || 
        (num == 2 && !suffix.equals("nd")) || 
        (num == 3 && !suffix.equals("rd")) || 
        (num >= 4 && !suffix.equals("th"))) {
        return false;
    }

    // Third part can be anything, no further validation needed
    return true;
}


  // Computes the city block coordinates from an address string
  // returns an int array of size 2. e.g. [3, 4] 
  // where 3 is the avenue and 4 the street
  // See comments at the top for a more detailed explanation
  // Extracts the city block information from the address
public static int[] getCityBlock(String address)
{
    // Initialize the city block array with default values
    int[] block = {-1, -1};
    
    // Split the address into parts
    String[] parts = getParts(address);
    
    // Extract relevant information from parts
    String part1 = parts[0];
    String part2 = parts[1];
    int number1 = Integer.parseInt(part1.substring(0, 1));
    int number2 = Integer.parseInt(part2.substring(0, 1));
    String part3 = parts[2];
    
    // Determine the orientation of the block (Street or Avenue) and set block coordinates accordingly
    if (part3.equalsIgnoreCase("Street")) {
        block[0] = number1;
        block[1] = number2;
    } else if (part3.equalsIgnoreCase("Avenue")) {
        block[1] = number1;
        block[0] = number2;
    }
    
    // Return the city block coordinates
    return block;
}

  
  // Calculates the distance in city blocks between the 'from' address and 'to' address
  // Hint: be careful not to generate negative distances
  
  // This skeleton version generates a random distance
  // If you do not want to attempt this method, you may use this default code
  public static int getDistance(String from, String to)
  {
    // Fill in the code or use this default code below. If you use
    // the default code then you are not eligible for any marks for this part
     // Get the city block coordinates for the 'from' and 'to' locations
     int[] blockFrom = getCityBlock(from);
     int[] blockTo = getCityBlock(to);
     
     // Calculate the absolute differences in x and y coordinates
     int deltaX = Math.abs(blockFrom[0] - blockTo[0]);
     int deltaY = Math.abs(blockFrom[1] - blockTo[1]);
     
     // Return the maximum difference between the x and y coordinates
     return Math.abs(deltaX+ deltaY);
 
    // Math.random() generates random number from 0.0 to 0.999
    // Hence, Math.random()*17 will be from 0.0 to 16.999

    // cast the double to whole number


    
  }
  
}
