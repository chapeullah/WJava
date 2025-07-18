package JavaCore;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class JavaSet {
    public static void main(String[] args) {

        // HashSet - неотсортированный сет (unordered_set)
        System.out.println("\nhashSet :\n");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("pineapple");
        hashSet.add("apple");
        hashSet.remove("pineapple");
        if (!hashSet.isEmpty()) {
            System.out.println("Сет не пустой");
        }
        if (hashSet.contains("banana")) {
            System.out.println("Сет имеет банана");
        }
        hashSet.forEach(str -> System.out.println(str));
        for (String str : hashSet) {
            System.out.println(str);
        }
        System.out.println(hashSet.size());
        System.out.println(hashSet);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(1);
        list1.add(3);
        System.out.println(list1);
        Set<Integer> set2 = new HashSet<>();
        set2.addAll(list1);
        System.out.println(set2);

        // LinkedSet 
        System.out.println("\nlinkedSet :\n");
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("A");
        linkedSet.add("B");
        linkedSet.add("C");
        linkedSet.add("D");
        linkedSet.add("E");
        linkedSet.add("F");
        linkedSet.add("G");
        System.out.println(linkedSet);

        // TreeSet - отсортированный сет (set)
        System.out.println("\ntreeSet :\n");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("G");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("C");
        treeSet.add("B");
        System.out.println(treeSet);

    }
}
