package d_data_structures;

import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> klucz = new TreeMap<>();
        klucz.put("browser", "chrome");
        klucz.put("resolution", "1920x1080");
        klucz.put("headless", "false");
        System.out.println(klucz.containsKey("browser"));
        System.out.println(klucz.get("headless"));
        klucz.remove("headless");
        System.out.println(klucz.get("headless"));
    }

}
