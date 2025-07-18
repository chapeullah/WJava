package JavaCore;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {

        // LinkedList
        Queue<String> queue = new LinkedList<>();
        // .offer() тоже самое что и .add() только безопаснее
        queue.offer("apple");
        queue.offer("banana");
        queue.offer("pineapple");
        queue.offer("cherry");
        
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Тоже самое что и .remove() только возвращает значение
        }

        // PriorityQueue - отдает значения в отсортированном порядке
        Queue<String> averagePoints = new PriorityQueue<>();
        averagePoints.offer("B");
        averagePoints.offer("C");
        averagePoints.offer("A");
        averagePoints.offer("F");
        averagePoints.offer("D");
        while (!averagePoints.isEmpty()) {
            System.out.println(averagePoints.poll());
        }

    }
}
