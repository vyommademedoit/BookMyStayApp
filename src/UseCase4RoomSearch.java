public class UseCase4RoomSearch {
    public static void main(String[] args) {
        RoomInventory inv = new RoomInventory();

        String type = "Single Room";
        if (inv.available(type))
            System.out.println(type + " available");
        else
            System.out.println("Not available");
    }
}