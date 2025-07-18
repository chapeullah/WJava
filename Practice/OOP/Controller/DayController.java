package Practice.OOP.Controller;

import java.util.Scanner;

import Practice.OOP.Model.Day;

public class DayController {
    public static void main(String[] args) {
        String response; 
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите день недели: ");
            response = scanner.nextLine().toUpperCase();
        }

        Day day = Day.valueOf(response);
        
        System.out.println(day);
        System.out.println(day.getDayNumber());

        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Сейчас будний день");
            case SATURDAY, SUNDAY -> System.out.println("Сейчас выходной");
        }
    }
}
