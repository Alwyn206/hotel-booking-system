/**
 * Use Case 2
 * Basic Room Types & Static Availability
 *
 * @version 2.1
 */

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("Hotel Booking System v2.1");
        System.out.println("Room Availability\n");

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);
        System.out.println();

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}