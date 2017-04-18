import java.util.HashMap;

/**
 * Created by akshay on 4/17/17.
 */
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("one", "Akshay");
        hm.put("two", "Mukka");
        System.out.println(hm.get("one"));
    }
}
