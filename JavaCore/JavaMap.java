package JavaCore;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
    public static void main(String[] args) {

        // HashMap - неотсортированная мап (unordered_map)
        System.out.println("\nhashMap :\n");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 10);
        hashMap.put("pineapple", 2);
        hashMap.put("watermelon", 20);
        hashMap.put("banana", 15);
        hashMap.put("cherry", 67);
        hashMap.put("apple", 20);
        hashMap.replace("pineapple", 2, 30); // Можно использовать как проверку конкретного значения, если 2 - то меняем, иначе ничего
        hashMap.putIfAbsent("strawberry", 15); // Создание ключ-значения только в случае отсуствия ключа, то есть создать/обновить уже имеющееся не мы можем
        hashMap.remove("banana");
        System.out.println(hashMap);
        System.out.println(hashMap.get("banana"));
        if (hashMap.containsKey("apple")) {
            System.out.println("Яблоко в мапе");
        }
        if (hashMap.containsValue(20)) {
            System.out.println("Такое значение существует");
        }

        // LinkedHashMap - сохраняется порядок вставки
        System.out.println("\nlinkedMap :\n");
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("apple", 10);
        linkedMap.put("pineapple", 2);
        linkedMap.put("watermelon", 20);
        linkedMap.put("banana", 15);
        linkedMap.put("cherry", 67);
        System.out.println(linkedMap);

        // TreeMap - отсортированная мап (map)
        System.out.println("\ntreeMap :\n");
        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2, 1);
        treeMap.put(3, 10);
        treeMap.put(1, 5);
        treeMap.put(5, 5);
        treeMap.put(6, 2);
        System.out.println(treeMap);
    }
}
