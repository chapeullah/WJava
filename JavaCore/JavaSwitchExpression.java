package JavaCore;

import java.util.Scanner;

public class JavaSwitchExpression {
    
    public static void main(JavaString[] args) {

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Введите день недели: ");
        day = scanner.nextLine();

        switch (day.toLowerCase()) {
            case "понедельник", "вторник", "среда", "четверг" -> System.out.println("Это будний день");
            case "пятница" -> System.out.println("Это сокращённый будний день");
            case "суббота", "воскресенье" -> System.out.println("Это выходной день");
            default -> System.out.println(day + " не день недели");
        }

        scanner.close();
        
    }  

}