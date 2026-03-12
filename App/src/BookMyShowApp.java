abstract class Room {


    private int beds;
    private double size;
    private double price;


    public Room(int beds, double size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public int getBeds() {
        return beds;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getRoomType();

    public void displayDetails() {
        System.out.println("Room Type : " + getRoomType());
        System.out.println("Beds      : " + beds);
        System.out.println("Size      : " + size + " sq.m");
        System.out.println("Price     : ₹" + price + " per night");
    }
}
/**
 * SingleRoom class extending Room
 */
class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 18.5, 2500);
    }

    @Override
    public String getRoomType() {
        return "Single Room";
    }
}
/**
 * DoubleRoom class extending Room
 */
class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 28.0, 4000);
    }

    @Override
    public String getRoomType() {
        return "Double Room";
    }
}
/**
 * SuiteRoom class extending Room
 */
class SuiteRoom extends Room {

    public SuiteRoom() {
        super(3, 45.0, 7000);
    }

    @Override
    public String getRoomType() {
        return "Suite Room";
    }
}
/**
 * HotelRoomApp
 * Demonstrates abstraction, inheritance, polymorphism,
 * and simple availability representation.
 */
public class HotelRoomApp {

    public static void main(String[] args) {

        // Static availability variables (simple representation)
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable  = 2;

        // Polymorphism: using Room reference for different objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("===== HOTEL ROOM DETAILS =====\n");

        // Display Single Room
        single.displayDetails();
        System.out.println("Available : " + singleAvailable);
        System.out.println("-------------------------------");

        // Display Double Room
        doubleRoom.displayDetails();
        System.out.println("Available : " + doubleAvailable);
        System.out.println("-------------------------------");

        // Display Suite Room
        suite.displayDetails();
        System.out.println("Available : " + suiteAvailable);
        System.out.println("-------------------------------");

        System.out.println("Application terminated.");
    }
}