import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String stringIn = "сьешь еще этих мягких булок да выпей чаю и сьешь еще этих булок";
        stringIn = stringIn.replace(" ","");
        char[] chars = stringIn.toCharArray();
        Map<Character, Integer> count = new HashMap<>();
        for (
                char currentChar : chars) {
            if (count.containsKey(currentChar)) {
                count.put(currentChar, count.get(currentChar) + 1);
            } else {
                count.put(currentChar, 1);
            }
        }
        for (
                Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
