import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



/*
 * 
 * This class contains the main logic of the system.
 * 
 *  It keeps track of all users, drivers and service requests (RIDE or DELIVERY)
 * 
 */
public class TMUberSystemManager
{
  private ArrayList<User>   users;
  private ArrayList<Driver> drivers;

  private ArrayList<TMUberService> serviceRequests; 

  public double totalRevenue; // Total revenues accumulated via rides and deliveries
  
  // Rates per city block
  private static final double DELIVERYRATE = 1.2;
  private static final double RIDERATE = 1.5;
  // Portion of a ride/delivery cost paid to the driver
  private static final double PAYRATE = 0.1;

  //These variables are used to generate user account and driver ids
  int userAccountId = 900;
  int driverId = 700;

  public TMUberSystemManager()
  {
    users   = new ArrayList<User>();
    drivers = new ArrayList<Driver>();
    serviceRequests = new ArrayList<TMUberService>(); 
    
    TMUberRegistered.loadPreregisteredUsers(users);
    TMUberRegistered.loadPreregisteredDrivers(drivers);
    
    totalRevenue = 0;
  }

  // General string variable used to store an error message when something is invalid 
  // (e.g. user does not exist, invalid address etc.)  
  // The methods below will set this errMsg string and then return false
  String errMsg = null;

  public String getErrorMessage()
  {
    return errMsg;
  }
  
  // Given user account id, find user in list of users
  // Return null if not found
  public User getUser(String accountId)
  {
    // Iterate through the list of users.
    for (int i = 0; i < users.size(); i++) {
      // Check if the account ID of the current user matches the provided account ID.
      if (users.get(i).getAccountId().equals(accountId)) {
          // If a matching user is found, return it.
          return users.get(i);
      }
    }
    // If no matching user is found, return null.
    return null;
  }
  
  // Check for duplicate user
  private boolean userExists(User user)
  {
    // Return true if the list of users contains the provided user.
    return users.contains(user);
    // Fill in the code

  }
  
 // Check for duplicate driver
 private boolean driverExists(Driver driver)
 {
    // Check if the provided driver exists in the list of drivers.
    return drivers.contains(driver);
   // Fill in the code
   
 }
  
  // Given a user, check if user ride/delivery request already exists in service requests
  private boolean existingRequest(TMUberService req)
  {
     return serviceRequests.contains(req);

    // Fill in the code
  }

  // Calculate the cost of a ride or of a delivery based on distance 
  private double getDeliveryCost(int distance)
  {
    return distance * DELIVERYRATE;
  }

  private double getRideCost(int distance)
  {
    return distance * RIDERATE;
  }

  // Go through all drivers and see if one is available
  // Choose the first available driver
  // Return null if no available driver
  private Driver getAvailableDriver()

  {
    // Iterate through the list of drivers.
    for (int i = 0; i < drivers.size(); i++) {
      // Check if the status of the current driver is AVAILABLE.
      if (drivers.get(i).getStatus() == Driver.Status.AVAILABLE) {
          // If an available driver is found, return it.
          return drivers.get(i);
      }
    }
    // If no available driver is found, return null.
    return null;

  }

  // Print Information (printInfo()) about all registered users in the system
  public void listAllUsers()
  {
    // Print a newline to separate previous output.
    System.out.println();

    // Iterate through the list of users.
    for (int i = 0; i < users.size(); i++)
    {
        // Increment index for display.
        int index = i + 1;
        
        // Print index followed by user information.
        System.out.printf("%-2s.", index);
        users.get(i).printInfo();
        
        // Print a newline for formatting.
        System.out.println(); 
    }

  }

  // Print Information (printInfo()) about all registered drivers in the system
  public void listAllDrivers()
  {
    for (int i = 0; i < drivers.size(); i++)
    {
        // Increment index for display.
        int index = i + 1;
        
        // Print index followed by driver information.
        System.out.printf("%-2s. ", index);
        drivers.get(i).printInfo();
        
        // Print a newline for formatting.
        System.out.println();
    }
    // Fill in the code
  }

  // Print Information (printInfo()) about all current service requests
  public void listAllServiceRequests()
  {
    // Iterate through the list of drivers.
    for (int i = 0; i < serviceRequests.size(); i++)
    {
        // Increment index for display.
        int index = i + 1;
        
        // Print index followed by driver information.
        System.out.printf("%-2s. ------------------------\n ", index);
        drivers.get(i).printInfo();
        
        // Print a newline for formatting.
        System.out.println();
    }

    // Fill in the code
  }

  // Add a new user to the system
  public boolean registerNewUser(String name, String address, double wallet)
  {
    
    // Check if the name is null or empty.
    if (name == null || name.length() == 0)
    {
        // Set error message and return false if name is invalid.
        errMsg = "Invalid Name";
        return false;
    }

    // Check if the address is valid using CityMap's validAddress method.
    if (!CityMap.validAddress(address))
    {
        // Set error message and return false if address is invalid.
        errMsg = "Invalid Address";
        return false;
    }

    // Check if wallet amount is negative.
    if (wallet < 0)
    {
        // Set error message and return false if wallet amount is invalid.
        errMsg = "Invalid Wallet";
        return false;
    }

    // Generate a unique user ID and create a new User object.
    String id = String.valueOf(userAccountId);
    User user = new User(id+""+users.size(), name, address, wallet);

    // Check if the user already exists.
    if (userExists(user)) {
        // Set error message and return false if the user already exists.
        errMsg = "User already exists";
        return false;
    }

    // Add the new user to the list of users and return true.
    users.add(user);
    return true;

    

    // Fill in the code. Before creating a new user, check paramters for validity
    // See the assignment document for list of possible erros that might apply
    // Write the code like (for example):
    // if (address is *not* valid)
    // {
    //    set errMsg string variable to "Invalid Address "
    //    return false
    // }
    // If all parameter checks pass then create and add new user to array list users
    // Make sure you check if this user doesn't already exist!
    
  }

  // Add a new driver to the system
  public boolean registerNewDriver(String name, String carModel, String carLicencePlate)
  {
    // Check if the name is null or empty.
    if (name == null || name.isEmpty())
    {
        // Set error message and return false if name is invalid.
        errMsg = "Invalid Name";
        return false;
    }

    // Check if the car model is null or empty.
    if (carModel == null || carModel.isEmpty())
    {
        // Set error message and return false if car model is invalid.
        errMsg = "Invalid Car Model";
        return false;
    }

    // Check if the car license plate is null or empty.
    if (carLicencePlate == null || carLicencePlate.isEmpty())
    {
        // Set error message and return false if car license plate is invalid.
        errMsg = "Invalid Car Licence Plate";
        return false;
    }

    // Generate a unique driver ID and create a new Driver object.
    String id = String.valueOf(driverId);
    Driver driver = new Driver(id+""+drivers.size(), name, carModel, carLicencePlate);

    // Check if the driver already exists.
    if (driverExists(driver)) {
        // Set error message and return false if the driver already exists.
        errMsg = "Driver already exists";
        return false;
    }

    // Add the new driver to the list of drivers and return true.
    drivers.add(driver);
    return true;

    // Fill in the code - see the assignment document for error conditions
    // that might apply. See comments above in registerNewUser

  }

  // Request a ride. User wallet will be reduced when drop off happens
  public boolean requestRide(String accountId, String from, String to) {
    // Retrieve the user associated with the provided account ID.
    User user = getUser(accountId);

    // If user not found, return false with error message
    if (!userExists(user)) {
        errMsg = "User Account Not Found";
        return false;
    }

    // Check if addresses are valid
    if (!CityMap.validAddress(from) || !CityMap.validAddress(to)) {
        errMsg = "Invalid Address";
        return false;
    }

    // Calculate distance
    int distance = CityMap.getDistance(from, to);

    // Check if distance is sufficient
    if (distance < 1) {
        errMsg = "Insufficient Travel Distance";
        return false;
    }

    // Create a new TMUberRide object with the available driver, origin, destination, user, and distance
    TMUberRide ride = new TMUberRide(getAvailableDriver(), from, to, user, distance, distance);

    // Check if there's already a ride request with the same criteria
    if(existingRequest(ride))
    {
        errMsg = "User Already Has Ride Request";
        return false;
    }

    // Check user's wallet balance
    double wallet = user.getWallet();
    double cost = getRideCost(distance);
    if (cost > wallet) {
        errMsg = "Insufficient Funds";
        return false;
    }

    // Get an available driver
    Driver driver = getAvailableDriver();
    if (driver == null) {
        errMsg = "No Drivers Available";
        return false;
    }

    // Update driver status
    driver.setStatus(Driver.Status.DRIVING);

    // Create a new ride request
    TMUberRide rideRequest = new TMUberRide(driver, from, to, user, distance, cost);

    // Add the ride request to the service requests list
    serviceRequests.add(rideRequest);

    // Increment the number of rides the user has had
    user.addRide();

    return true;

  }


  // Request a food delivery. User wallet will be reduced when drop off happens
  public boolean requestDelivery(String accountId, String from, String to, String restaurant, String foodOrderId) {
    User user = getUser(accountId);

    // Search for the user with the given accountId
    

    // If user not found, return false with error message
    if (!userExists(user)) {
        errMsg = "User Account Not Found";
        return false;
    }

    // Check if addresses are valid
    if (!CityMap.validAddress(from) || !CityMap.validAddress(to)) {
        errMsg = "Invalid Address";
        return false;
    }

    // Calculate distance
    int distance = CityMap.getDistance(from, to);

    // Check if distance is sufficient
    if (distance < 1) {
        errMsg = "Insufficient Travel Distance";
        return false;
    }

    // Check if there's already a delivery request with the same criteria
    
    
    
    TMUberDelivery  del = new TMUberDelivery(getAvailableDriver(), from, to, user, distance, distance, restaurant, foodOrderId);
    if (existingRequest(del)) {
        errMsg = "User Already Has Delivery Request at Restaurant with this Food Order";
        return false;
    }

    // Check user's wallet balance
    double wallet = user.getWallet();
    double cost = getDeliveryCost(distance);
    if (cost > wallet) {
        errMsg = "Insufficient Funds";
        return false;
    }

    // Get an available driver
    Driver driver = getAvailableDriver();
    if (driver == null) {
        errMsg = "No Drivers Available";
        return false;
    }

    // Update driver status
    driver.setStatus(Driver.Status.DRIVING);

    // Create a new delivery request
    TMUberDelivery deliveryRequest = new TMUberDelivery(driver, from, to, user, distance, cost, restaurant, foodOrderId);

    // Add the delivery request to the service requests list
    serviceRequests.add(deliveryRequest);

    // Increment the number of deliveries the user has had
    user.addDelivery();
    
    return true;
}




  // Cancel an existing service request. 
  // parameter int request is the index in the serviceRequests array list
  public boolean cancelServiceRequest(int request) {
    // Check if valid request #
    // Check if the request number is valid
    if (request < 1 || request > serviceRequests.size()) {
      errMsg = "Invalid Request #" + request;
      return false;
    }

    // Get the service request to be canceled
    TMUberService request1 = serviceRequests.remove(request - 1);

    // Decrement number of rides or deliveries for this user
    if (request1 instanceof TMUberRide) {
      ((TMUberRide) request1).getUser().removeRide();
    } else if (request1 instanceof TMUberDelivery) {
      ((TMUberDelivery) request1).getUser().removeDelivery();
    }

    return true;

}

  
  // Drop off a ride or a delivery. This completes a service.
  // parameter request is the index in the serviceRequests array list
  public boolean dropOff(int request)
  {
    // Check if the request number is valid
    if (request < 1 || request > serviceRequests.size()) {
      errMsg = "Invalid Request #" + request;
      return false;
    }

    // Get the service request to be processed
    TMUberService request1 = serviceRequests.remove(request - 1);

    // Get the cost of the service
    double cost = request1.getCost();

    // Update total revenue
    totalRevenue += cost;

    // Get the driver associated with the service request
    Driver driver = request1.getDriver();

    // Calculate and pay the driver's fee
    double fee = cost * PAYRATE;
    driver.pay(fee);
    totalRevenue -= fee;

    // Set the driver's status to AVAILABLE
    driver.setStatus(Driver.Status.AVAILABLE);

    // Get the user associated with the service request and deduct the cost
    User user = request1.getUser();
    user.payForService(cost);

    // Compact the code by removing unnecessary variables and operations

    return true;

    // See above method for guidance
    // Get the cost for the service and add to total revenues
    // Pay the driver
    // Deduct driver fee from total revenues
    // Change driver status
    // Deduct cost of service from user
  
  }


  // Sort users by name
  // Then list all users
  public void sortByUserName()
  {
    // Create a NameComparator instance
    NameComparator nameComparator = new NameComparator();

    // Sort the users list using the comparator's compare method
    users.sort(nameComparator.com);

    // List all users after sorting
    listAllUsers();

  }

  // Helper class for method sortByUserName
  private class NameComparator 
  {
    // Define a comparator for sorting users by their names.
    Comparator<User> com = new Comparator<User>() {
      // Compare two users based on their names
      public int compare(User u1, User u2) {
          // Compare user names and return the result
          return u1.getName().compareTo(u2.getName());
      }
    };
  }

  // Sort users by number amount in wallet
  // Then ist all users
  public void sortByWallet()
  {
   // Create a UserWalletComparator instance
    UserWalletComparator com = new UserWalletComparator();

    // Sort the users list using the comparator's compare method
    users.sort(com.com);

    // List all users after sorting
    listAllUsers();

    
  }
  // Helper class for use by sortByWallet
  private class UserWalletComparator 
  {
    // Define a comparator for sorting users by their wallet amounts.
    Comparator<User> com = new Comparator<User>() {
      // Compare two users based on their wallet amounts
      public int compare(User u1, User u2) {
          // Compare wallet amounts and return the result
          if (u1.getWallet() > u2.getWallet())
              return 1;
          else
              return -1;
      }
    };

  }

  // Sort trips (rides or deliveries) by distance
  // Then list all current service requests
  public void sortByDistance()
  {
    // Create a DistComparator instance
    DistComparator com = new DistComparator();

    // Sort the service requests list using the comparator's compare method
    serviceRequests.sort(com.com);

    // List all service requests after sorting
    listAllServiceRequests();


  }
  private class DistComparator 
  {
    // Define a comparator for sorting TMUberService objects by distance.
    Comparator<TMUberService> com = new Comparator<TMUberService>() {
      // Compare two TMUberService objects based on their distances
      public int compare(TMUberService u1, TMUberService u2) {
          // Compare distances and return the result
          if (u1.getDistance() > u2.getDistance())
              return 1;
          else
              return -1;
      }
    };

  }
}
