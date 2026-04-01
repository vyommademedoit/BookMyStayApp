public class UseCase11ConcurrentBookingSimulation {
    static RoomInventory inv = new RoomInventory();

    public static void main(String[] args) {
        Runnable task = () -> {
            synchronized (inv) {
                if (inv.available("Single Room")) {
                    inv.book("Single Room");
                    System.out.println(Thread.currentThread().getName() + " booked");
                }
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}