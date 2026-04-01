import java.util.*;

public class UseCase8BookingHistoryReport {
    public static void main(String[] args) {
        List<Reservation> list = new ArrayList<>();

        Reservation r = new Reservation("1", "A", "Single Room", 2);
        r.confirm("R101");

        list.add(r);

        for (Reservation x : list)
            System.out.println(x);
    }
}