package JavaCore;

import java.util.HashMap;

public class JavaHashmaps {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("яблоко", 50.99);
        map.put("банан", 69.99);
        map.put("апельсин", 25.33);
        map.put("кокос", 150.);
        System.out.println(map);
        map.put("апельсин", 2000.99);
        map.remove("яблоко");
        System.out.println(map);
        System.out.println(map.get("банан"));
        System.out.println(map.containsKey("банан"));
        System.out.println(map.containsKey("ананас"));
        if (map.containsValue(69.99)) {
            System.out.println(map.get("банан"));
        }
        else {
            System.out.println("Такого значения нет");
        }
        System.out.println(map.size());
        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
    }
}   