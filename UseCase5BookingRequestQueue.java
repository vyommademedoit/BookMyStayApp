import java.util.*;

public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {
        Queue<Reservation> q = new LinkedList<>();

        q.add(new Reservation("1", "A", "Single Room", 2));
        q.add(new Reservation("2", "B", "Double Room", 1));

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}