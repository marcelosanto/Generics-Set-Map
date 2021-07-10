package map;

import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Marcelo");
        cookies.put("sobrenome", "Santos");
        cookies.put("email", "rocha.mrs@gmail.com");

        cookies.remove("sobrenome");
        cookies.put("cor", "preto");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies");

        for (String str : cookies.keySet()){
            System.out.println(str + ": " + cookies.get(str));
        }
    }
}
