/**
 * Abstract Room Class
 * Defines common properties for all rooms
 * @version 2.0
 */

public abstract class Room {

    protected int beds;
    protected double size;
    protected double price;

    public Room(int beds, double size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public abstract String getRoomType();

    public void displayRoomDetails() {
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price: $" + price);
    }
}