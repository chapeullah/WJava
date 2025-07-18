package JavaCore;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        int top = stack.pop();
        System.out.println(top);
        System.out.println(stack.get(0));
        // System.out.println(stack.get(1)); <- ошибка
    }
}
