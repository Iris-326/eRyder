public class Main {
    public static void main(String[] args)  {
        ERyder bike1 = new ERyder();
        bike1.printBikeDetails();

        ERyder bike2 = new ERyder("2007", 32, true, 6);
        bike2.printBikeDetails();
        bike2.ride();
        bike2.printBikeDetails();
    }
}
