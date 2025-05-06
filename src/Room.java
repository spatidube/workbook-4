// Room class - represents a room in the hotel
public class Room {
    int number;
    boolean isOccupied;

    public Room(int number) {
        this.number = number;
        this.isOccupied = false;
    }

    public void assignToGuest() {
        isOccupied = true;
        System.out.println("Room " + number + " is now occupied.");
    }

    public void cleanRoom() {
        isOccupied = false;
        System.out.println("Room " + number + " has been cleaned.");
    }
}
