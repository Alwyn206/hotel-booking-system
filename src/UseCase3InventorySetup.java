/**
 * Use Case 3
 * Centralized Room Inventory Management
 * @version 3.1
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        inventory.addRoom("Single Room", 5);
        inventory.addRoom("Double Room", 3);
        inventory.addRoom("Suite Room", 2);

        inventory.displayInventory();
    }
}