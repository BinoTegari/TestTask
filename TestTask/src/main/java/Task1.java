import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String stringIn = "сьешь еще этих мягких булок да выпей чаю и сьешь еще этих булок";
        Map<String, Integer> count = new HashMap<>();
        for (
                String str : stringIn.split("\\s")) {
            if (count.containsKey(str)) {
                count.put(str, count.get(str) + 1);
            } else {
                count.put(str, 1);
            }
        }
        for (
                Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
