package JavaCore;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Watermelon");
        removeIterator(list, "Banana");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static <T> void removeIterator(ArrayList<T> list, T element) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T value = it.next();
            System.out.print(value);
            if (value.equals(element)) {
                System.out.println(" - удалено");
                it.remove();
            }
            else {
                System.out.println(" - файн");
            }
        }
    }
}
