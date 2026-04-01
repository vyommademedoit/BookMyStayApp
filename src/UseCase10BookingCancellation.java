public class UseCase10BookingCancellation {
    public static void main(String[] args) {
        RoomInventory inv = new RoomInventory();
        Reservation r = new Reservation("1", "A", "Single Room", 2);

        inv.book(r.roomType);
        r.confirm("R101");

        inv.cancel(r.roomType);
        System.out.println("Cancelled");
    }
}