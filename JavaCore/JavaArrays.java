package JavaCore;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class JavaArrays {
    public static void main(String[] args) {
        int[][][] matrix = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        // Arrays.deepToString() 2d matrix
        System.out.println(Arrays.deepToString(matrix));
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone();
        int[] d = {5, 6, 7, 8, 9};
        
        // Arrays.fill()
        Arrays.fill(d, 0);

        System.out.println("d = " + Arrays.toString(d));

        // Arrays.binarySearch()
        System.out.println(Arrays.binarySearch(a, 3));

        // Arrays.equals()
        if (Arrays.equals(a, b)) {
            System.out.println("a == b");
        }
        else {
            System.out.println("a != b");
        }
        
        b[0] = 4;

        // Arrays.copyOf()
        int[] x = Arrays.copyOf(b, b.length - 1);
        Arrays.sort(b);

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("x = " + Arrays.toString(x));

        int initialCapacity = 5;

        List<String> anotherList = new ArrayList<>(initialCapacity);

        List<String> list1 = new ArrayList<>(List.of("A", "B", "C", "D"));
        List<String> list2 = new ArrayList<>(initialCapacity);      // С указанием ёмкости
        List<String> list3 = new ArrayList<>(anotherList);          // Копия из другого списка

        list1.add("A");                // Добавить в конец
        list2.add(1, "B");             // Вставить по индексу
        list1.addAll(anotherList);     // Добавить все элементы из другого списка
        list1.addAll(1, anotherList);  // Вставить с указанного индекса

        list1.remove(0);              // Удалить по индексу
        list2.remove("A");            // Удалить первое вхождение объекта
        list3.removeAll(anotherList); // Удалить все элементы, содержащиеся в otherList
        list1.clear();                // Удалить все элементы

        list1.get(0);                // Получить элемент по индексу
        list1.set(1, "NewValue");    // Заменить элемент по индексу
        list1.indexOf("A");          // Первый индекс элемента
        list1.lastIndexOf("A");      // Последний индекс элемента

        list1.contains("A");          // Проверка на наличие
        list2.isEmpty();              // true, если список пуст
        list3.size();                 // Количество элементов

        list1.subList(1, 4);          // Подсписок [1, 4) — включая 1, не включая 4
        list1.toArray();              // Преобразовать в Object[]
        list1.toArray(new String[0]); // Преобразовать в String[]

        Collections.sort(list1);                   // Сортировка по естественному порядку
        Collections.reverse(list1);                // Обратный порядок
        Collections.shuffle(list1);                // Перемешивание
        Collections.unmodifiableList(list1);       // Сделать неизменяемым
        
        list1.removeIf(s -> s.length() > 3);       // Удаление по условию
        list1.replaceAll(s -> s.toUpperCase());    // Преобразование всех элементов
        list1.forEach(System.out::println);        // Перебор лямбдой

        List<String> names = new ArrayList<>();
        names.add("Denis");
        names.add("Alice");
        names.add("Dima");
        names.remove(2);
        names.set(1, null);
        names.set(1, "Danil");
        names.add("Vlad");
        for (String str : names) {
            System.out.println(str + "\n");
        }

        LinkedList<String> list = new LinkedList<>();
        List<String> listStr = new ArrayList<>();
        Deque<String> listDeq = new ArrayDeque<>();

        System.out.println(list.toString() + listStr.toString() + listDeq.toString());
        
    }
   
}
