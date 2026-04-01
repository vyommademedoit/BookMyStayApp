import java.util.*;

public class UseCase7AddOnServiceSelection {
    public static void main(String[] args) {
        Map<String, List<String>> services = new HashMap<>();

        services.put("1", new ArrayList<>());
        services.get("1").add("Breakfast");
        services.get("1").add("WiFi");

        System.out.println(services);
    }
}