

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("king")) {
            return 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            return 124.00;
        }
        return 0.0;
    }

    public double getReservationTotal() {
        double rate = getPrice();
        if (isWeekend) {
            rate *= 1.10; // 10% weekend surcharge
        }
        return rate * numberOfNights;
    }
}
