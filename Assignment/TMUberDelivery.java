/*
 * 
 * This class simulates a food delivery service for a simple Uber app
 * 
 * A TMUberDelivery is-a TMUberService with some extra functionality
 */
public class TMUberDelivery extends TMUberService
{
  public static final String TYPENAME = "DELIVERY";
 
  private String restaurant; 
  private String foodOrderId;
   
   // Constructor to initialize all inherited and new instance variables 
  public TMUberDelivery(Driver driver, String from, String to, User user, int distance, double cost,
                        String restaurant, String order)
  {
    super(driver, from, to, user, distance, cost, "DELIVERY");
    this.restaurant = restaurant;
    this.foodOrderId= order;

    // Fill in the code - make use of the super method
  }
 
  
  public String getServiceType()
  {
    return TYPENAME;
  }
  public String getRestaurant()
  {
    return restaurant;
  }
  public void setRestaurant(String restaurant)
  {
    this.restaurant = restaurant;
  }
  public String getFoodOrderId()
  {
    return foodOrderId;
  }
  public void setFoodOrderId(String foodOrderId)
  {
    this.foodOrderId = foodOrderId;
  }
  /*
   * Two Delivery Requests are equal if they are equal in terms of TMUberServiceRequest
   * and the restaurant and food order id are the same  
   */
  public boolean equals(Object other)
  {
    TMUberService otherTmUberService = (TMUberService) other;
    if (!super.equals(otherTmUberService)){
      return false;
    }

    // If this and other are deliveries, check to see if they are equal
    TMUberDelivery othUberDelivery = (TMUberDelivery) other;
    return this.getRestaurant().equals(othUberDelivery.getRestaurant()) && 
           this.getFoodOrderId().equals(othUberDelivery.getFoodOrderId()); 
  }
    
  
  /*
   * Print Information about a Delivery Request
   */
  public void printInfo()
  {
    // Fill in the code
    // Use inheritance to first print info about a basic service request
    // Call the superclass printInfo() method to print common information
    super.printInfo();

    // Print specific subclass information: restaurant and food order ID
    System.out.printf("\nRestaurant: %-9s Food Order #: %-3s", restaurant, foodOrderId);
 
  }
}
