public abstract class Room {
    String type;
    double price;

    public Room(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public void display() {
        System.out.println(type + " - ₹" + price);
    }
}

