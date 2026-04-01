public class UseCase6RoomAllocationService {
    public static void main(String[] args) {
        RoomInventory inv = new RoomInventory();
        Reservation r = new Reservation("1", "A", "Single Room", 2);

        if (inv.available(r.roomType)) {
            inv.book(r.roomType);
            r.confirm("R101");
            System.out.println("Booked: " + r);
        }
    }
}