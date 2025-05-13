

public class HotelOperations {
    public static void main(String[] args) {
        // Test Room
        Room room1 = new Room(2, 124.00, false, false);
        System.out.println("Room has " + room1.getNumberOfBeds() + " beds.");
        System.out.println("Room price: $" + room1.getPrice());
        System.out.println("Is room available? " + room1.isAvailable());

        room1.checkIn();
        System.out.println("Checked in: Is room available? " + room1.isAvailable());

        room1.checkout();
        System.out.println("Checked out: Is room dirty? " + room1.isDirty());

        room1.cleanRoom();
        System.out.println("Room cleaned: Is room dirty? " + room1.isDirty());

        System.out.println("----------------------------------------");

        // Test Reservation
        Reservation res1 = new Reservation("king", 3, true);
        System.out.println("Room type: " + res1.getRoomType());
        System.out.println("Price per night: $" + res1.getPrice());
        System.out.println("Reservation total: $" + res1.getReservationTotal());

        System.out.println("----------------------------------------");

        // Test Employee
        Employee emp1 = new Employee(101, "Maria Lopez", "Housekeeping", 18.50, 45);
        System.out.println("Employee: " + emp1.getName());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Regular Hours: " + emp1.getRegularHours());
        System.out.println("Overtime Hours: " + emp1.getOvertimeHours());
        System.out.println("Total Pay: $" + emp1.getTotalPay());
    }
}
