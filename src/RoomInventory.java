import java.util.*;

public class RoomInventory {
    Map<String, Integer> map = new HashMap<>();

    public RoomInventory() {
        map.put("Single Room", 3);
        map.put("Double Room", 2);
        map.put("Suite Room", 1);
    }

    public boolean available(String type) {
        return map.get(type) > 0;
    }

    public void book(String type) {
        map.put(type, map.get(type) - 1);
    }

    public void cancel(String type) {
        map.put(type, map.get(type) + 1);
    }

    public void show() {
        System.out.println(map);
    }
}