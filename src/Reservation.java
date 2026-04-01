public class Reservation {
    String id, name, roomType;
    int nights;
    String roomId;
    boolean confirmed = false;

    public Reservation(String id, String name, String roomType, int nights) {
        this.id = id;
        this.name = name;
        this.roomType = roomType;
        this.nights = nights;
    }

    public void confirm(String roomId) {
        this.roomId = roomId;
        this.confirmed = true;
    }

    public String toString() {
        return id + " | " + name + " | " + roomType + " | " + roomId;
    }
}