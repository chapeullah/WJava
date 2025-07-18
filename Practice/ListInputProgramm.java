package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ListInputProgramm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        String temp;
        boolean isRunning = true;
        while (isRunning) {
            System.out.print("Вводите вашу любимую еду (0 - для выхода, 1 - для просмотра результата): ");
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                isRunning = false;
            } else if (temp.equals("1")) {
                System.out.println(input);
                isRunning = false;
            } else {
                input.add(temp);
            }
        }
        scanner.close();
    }
}