package JavaCore;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaDeque {

    int x;

    // Список инициализации - по приколу
    {
        x = 10;
    }

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offerLast("Апельсин");
        deque.offerLast("Мандарин");
        deque.offerFirst("Банан");
        System.out.println(deque);
        System.out.println(deque.pollLast());
    }
}
