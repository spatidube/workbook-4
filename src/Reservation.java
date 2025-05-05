public class Reservation {

    String roomType;
    boolean weekend;

    double getPrice() {
        if (this.roomType.equals("king")) {
            return 139.8;
        } else if (this.roomType.equals("double")) {
            return 124.00;

        } else {
            throw new RuntimeException("Invalid room type");
        }
    }

    public void setRoomType(String roomType) {
        if (!roomType.equals("king") && !roomType.equals("double")) {
            throw new RuntimeException("invalid room type.(again)");

        }
        this.roomType = roomType;


    }

    public String getRoomType() {

    }
}