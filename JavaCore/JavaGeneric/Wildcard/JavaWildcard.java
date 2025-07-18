package JavaCore.JavaGeneric.Wildcard;

import java.util.ArrayList;
import java.util.List;

import JavaCore.JavaGeneric.Wildcard.Model.Test;

public class JavaWildcard {
    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        Object test = list.get(0);
        // list.set(0, test); <- Ошибка, так как объект неопределенного типа (равносильно обычному Object)
        System.out.println(test.toString());
    }

    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem.toString() + " ");
        }
        System.out.println();
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; ++i) {
            list.add(i);
        }
    }

    public static <T> void fooHelper(List<T> list) {
        list.set(0, list.get(0));
    }

    public static void foo(List<?> list) {
        fooHelper(list);
    }

}
