public class Main {
    public static void main(String[] args)  {
        ERyder bike1 = new ERyder("001", 85, true, 10, "user123", "1234567890");
        bike1.printBikeDetails();
        bike1.printRideDetails();
        bike1.ride();
        System.out.println("Calculating fare for bike1: " + bike1.calculateFare(30) + " dollars");


        ERyder bike2 = new ERyder("002", 32, true, 6, "user456", "0987654321");
        bike2.printBikeDetails();
        bike2.printRideDetails();
        bike2.ride();
        System.out.println("Calculating fare for bike2: " + bike2.calculateFare(30) + " dollars");
    
    }
        

        
      
}
