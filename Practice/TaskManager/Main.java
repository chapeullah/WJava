package Practice.TaskManager;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static TasksManager manager = new TasksManager();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {    
        mainMenu();
    }

    private static void mainMenu() {
        Integer input = null;
        String out = "\n=== Планировщик Задач ===\n\n1. Посмотреть список зад" + 
            "ач\n2. Управлять задачами\n0. Выйти\n\nВведите ваш выбор: ";
        while (input == null) {
            input = 0;
            System.out.print(out);
            try {
                input = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка: неверный формат ввода\n");
                input = null;
                continue;
            }
            finally {
                scanner.nextLine();
            }
            switch (input) {
                case 1 -> {
                    getTasks();
                    input = null;
                }
                case 2 -> {
                    manageTasks();
                    input = null;
                }
                case 0 -> System.out.println("Вы выбрали 0. Выйти\n");
                default -> input = wrongChoice(input);
            }
        }
    }

    private static void getTasks() {
        System.out.println(
            "Вы выбрали 1. Посмотреть список задач\n\n=== Список Задач ==="
        );
        manager.getTasks();
    }

    private static void manageTasks() {
        System.out.println("Вы выбрали 2. Управлять задачами\n");
        Integer input = null;
        String out = "=== Управление Задачами ===\n\n1. Добавить задачу\n2. В" + 
            "ыполнить задачу\n3. Удалить задачу\n0. Назад\n\nВведите ваш выбо" + 
            "р: ";
        while (input == null) {
            System.out.print(out);
            try {
                input = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка: неверный формат ввода\n");
                input = null;
                continue;
            }
            finally {
                scanner.nextLine();
            }
            switch (input) {
                case 1 -> {
                    addTask();
                    input = null;
                }
                case 2 -> {
                    completeTask();
                    input = null;
                }
                case 3 -> {
                    deleteTask();
                    input = null;
                }
                case 0 -> System.out.println("Вы выбрали 0. Назад");
                default -> input = wrongChoice(input);
            }
        }
    }

    private static void addTask() {
        System.out.print("Вы выбрали 1. Добавить задачу\n\n");
        Integer input = null;
        String out = "=== Добавить Задачу ===\n\n1. Обычная задача\n2. Важная" + 
            " задача\n3. Повторяющаяся задача\n0. Назад\n\nВведите ваш выбор: ";
        while (input == null) {
            System.out.print(out);
            try {
                input = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка: неверный формат ввода\n");
                input = null;
                continue;
            }
            finally {
                scanner.nextLine();
            }
            switch (input) {
                case 1 -> {
                    addSimpleTask();
                    input = null;
                }
                case 2 -> {
                    addImportantTask();
                    input = null;
                }
                case 3 -> {
                    addRecurringTask();
                    input = null;
                }
                case 0 -> System.out.println("Вы выбрали 0. Назад\n");
                default -> input = wrongChoice(input);
            }
        }
    }

    private static void completeTask() {
        System.out.println("Вы выбрали 2. Выполнить задачу\n");
        String title = "";
        while (title.isEmpty()) {
            System.out.print("=== Выполнить Задачу ===\n\n");
            System.out.print("Введите название задачи (0 - для отмены): ");
            title = scanner.nextLine();
            title = title.trim();
            if (title.isEmpty()) {
                System.out.println("Ошибка: название не может быть пустым\n");
                continue;
            }
            if (title.equals("0")) {
                System.out.println("Вы выбрали 0 для отмены\n");
                break;
            }
            if (manager.completeTask(title)) {
                System.out.println("Вы выполнили задачу: " + title + "\n");
            }
            else {
                System.out.println(
                    "Ошибка: такой задачи не существует\n"
                );
                title = "";
            }
        }
    }

    private static void deleteTask() {
        System.out.println("Вы выбрали 3. Удалить задачу\n");
        String title = "";
        while (title.isEmpty()) {
            System.out.print("=== Удалить Задачу ===\n\n");
            System.out.print("Введите название задачи (0 - для отмены): ");
            title = scanner.nextLine();
            title = title.trim();
            if (title.isEmpty()) {
                System.out.println("Ошибка: название не может быть пустым\n");
                continue;
            }
            if (title.equals("0")) {
                System.out.println("Вы выбрали 0 для отмены\n");
                break;
            }
            if (manager.deleteTask(title, scanner)) {
                System.out.println("Вы удалили задачу: " + title + "\n");
            }
            else {
                System.out.println(
                    "Ошибка: такого названия задачи не существует\n"
                );
                title = "";
            }
        }
    }    

    private static void addSimpleTask() {
        System.out.print("Вы выбрали 1. Обычная задача\n\n");
        String title = "";
        while (title.isEmpty()) {
            System.out.print("=== Обычная Задача ===\n\n");
            System.out.print("Введите название задачи (0 - для отмены): ");
            title = scanner.nextLine();
            title = title.trim();
            if (title.isEmpty()) {
                System.out.println("Ошибка: название не может быть пустым\n");
            }
            if (manager.isDuplicateTitle(title)) {
                System.out.println(
                    "Ошибка: такое название задачи уже существует\n"
                );
                title = "";
            } 
        }
        switch (title) {
            case "0" -> System.out.println("Вы выбрали 0 для отмены\n");
            default -> {
                System.out.println(
                    "Вы ввели название задачи: " + title + "\n"
                );
                addSimpleTaskEndDate(title);
            }
        }
    }

    private static void addSimpleTaskEndDate(String title) {
        LocalDate endDate = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        while (endDate == null) {
            String temp = "";
            System.out.print(
                "Введите дату окончания задачи (DD.MM.YYYY, 0 - для отмены): "
            );
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                System.out.println("Вы выбрали 0 для отмены");
                break;
            }
            try {
                endDate = LocalDate.parse(temp, formatter);
            } catch (DateTimeParseException e) {
                System.out.println(
                    "Ошибка: неверный формат ввода времени, " + 
                    "используйте \"DD.MM.YYYY\"\n"
                );
                endDate = null;
            }
        }
        System.out.printf(
            "Вы ввели дату окончания задачи: %02d-%02d-%04d\n\n", 
            endDate.getDayOfMonth(), 
            endDate.getMonthValue(), 
            endDate.getYear()
        );
        addSimpleTaskEndTime(title, endDate);
    }

    private static void addSimpleTaskEndTime(String title, LocalDate endDate) {
        LocalTime endTime = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (endTime == null) {
            String temp = "";
            System.out.print(
                "Введите время окончания задачи (HH:MM:SS, 0 - для отмены): "
            );
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                break;
            }
            try {
                endTime = LocalTime.parse(temp, formatter);
            } catch (DateTimeParseException e) {
                System.out.println(
                    "Ошибка: неверный формат ввода времени, " + 
                    "используйте \"HH:MM:SS\"\n"
                );
                endTime = null;
            }
        }
        String out = "Вы создали обычную задачу %s\nДата окончания: %02d:%02d" +
            ":%04d\nВремя окончания: %02d:%02d:%02d\n\n";
        System.out.printf(
            out, 
            title, 
            endDate.getDayOfMonth(), endDate.getMonthValue(), endDate.getYear(),
            endTime.getHour(), endTime.getMinute(), endTime.getSecond()
        );
        manager.addSimpleTask(title, endDate, endTime);
    }

    private static void addImportantTask() {
        System.out.print("Вы выбрали 2. Важная задача\n\n");
        String title = "";
        while (title.isEmpty()) {
            System.out.print("=== Важная Задача ===\n\n");
            System.out.print("Введите название задачи (0 - для отмены): ");
            title = scanner.nextLine();
            title = title.trim();
            if (title.isEmpty()) {
                System.out.println("Ошибка: название не может быть пустым\n");
            }
            if (manager.isDuplicateTitle(title)) {
                System.out.println(
                    "Ошибка: такое название задачи уже существует\n"
                );
                title = "";
            } 
        }
        switch (title) {
            case "0" -> System.out.println("Вы выбрали 0 для отмены\n");
            default -> {
                System.out.println("Вы ввели название задачи: " + title + "\n");
                addImportantTaskPriority(title);
            }
        }
    }

    private static void addImportantTaskPriority(String title) {
        Integer priority = null;
        while (priority == null) {
            System.out.print("Введите приоритет (1-100; 0 - для отмены): ");
            try {
                priority = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка: неверный формат ввода\n");
                priority = null;
                continue;
            }
            finally {
                scanner.nextLine();
            }
            switch (priority) {
                case 0 -> System.out.println("Вы выбрали 0 для отмены\n");
                default -> {
                    if (priority > 0 && priority <= 100) {
                        System.out.println(
                            "Вы ввели приоритет задачи: " + priority + "\n"
                        );
                        addImportantTaskEndDate(title, priority);
                    }
                    else {
                        System.out.println(
                            "Ошибка: приоритет НЕ может быть МЕНЬШЕ 1 или БОЛ" +
                            "ЬШЕ 100\n"
                        );
                        priority = null;
                    }
                }
            }
        }
    }

    private static void addImportantTaskEndDate(
        String title, Integer priority
    ) {
        LocalDate endDate = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        while (endDate == null) {
            String temp = "";
            System.out.print(
                "Введите дату окончания задачи (DD.MM.YYYY, 0 - для отмены): "
            );
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                System.out.println("Вы выбрали 0 для отмены\n");
                break;
            }
            try {
                endDate = LocalDate.parse(temp, formatter);
            } catch (DateTimeParseException e) {
                System.out.println(
                    "Ошибка: неверный формат ввода времени, используйте \"DD." + 
                    "MM.YYYY\"\n"
                );
                endDate = null;
            }
        }
        System.out.printf(
            "Вы ввели дату окончания задачи: %02d-%02d-%04d\n\n", 
            endDate.getDayOfMonth(), 
            endDate.getMonthValue(), 
            endDate.getYear()
        );
        addImportantTaskEndTime(title, endDate, priority);
    }

    private static void addImportantTaskEndTime(
        String title, LocalDate endDate, Integer priority
    ) {
        LocalTime endTime = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (endTime == null) {
            String temp = "";
            System.out.print(
                "Введите время окончания задачи (HH:MM:SS, 0 - для отмены): "
            );
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                break;
            }
            try {
                endTime = LocalTime.parse(temp, formatter);
            } catch (DateTimeParseException e) {
                System.out.println(
                    "Ошибка: неверный формат ввода времени, " + 
                    "используйте \"HH:MM:SS\"\n"
                );
                endTime = null;
            }
        }
        String out = "Вы создали важную задачу %s\nПриоритет: %03d/100\nДата " +
            "окончания: %02d:%02d:%04d\nВремя окончания: %02d:%02d:%02d\n\n";
        System.out.printf(
            out, 
            title, 
            priority, 
            endDate.getDayOfMonth(), endDate.getMonthValue(), endDate.getYear(),
            endTime.getHour(), endTime.getMinute(), endTime.getSecond()
        );
        manager.addImportantTask(title, priority, endDate, endTime);
    }

    private static void addRecurringTask() {
        System.out.print("Вы выбрали 3. Повторяющаяся задача\n\n");
        String title = "";
        while (title.isEmpty()) {
            System.out.print("=== Повторяющаяся Задача ===\n\n");
            System.out.print("Введите название задачи (0 - для отмены): ");
            title = scanner.nextLine();
            title = title.trim();
            if (title.isEmpty()) {
                System.out.println("Ошибка: название не может быть пустым\n");
            }
            if (manager.isDuplicateTitle(title)) {
                System.out.println(
                    "Ошибка: такое название задачи уже существует\n"
                );
                title = "";
            }
        }
        switch (title) {
            case "0" -> System.out.println("Вы выбрали 0 для отмены\n");
            default -> {
                System.out.println("Вы ввели название задачи: " + title + "\n");
                addRecurringTaskInterval(title);
            }
        }
    }

    private static void addRecurringTaskInterval(String title) {
        Integer interval = null;
        while (interval == null) {
            System.out.print(
                "Введите интервал повторения в днях (1 - раз в день и т. п; 0" + 
                " - для отмены): "
            );
            try {
                interval = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка: неверный формат ввода\n");
                interval = null;
                continue;
            }
            finally {
                scanner.nextLine();
            }
            if (interval < 0 || interval > 365) {
                System.out.println(
                    "Ошибка: интервал НЕ может быть БОЛЬШЕ 365\n"
                );
                interval = null;
            }
        }
        switch (interval) {
            case 0 -> System.out.println("Вы выбрали 0 для отмены\n");
            default -> {
                System.out.println(
                    "Вы ввели интервал задачи: " + interval + "\n"
                );
                addRecurringTaskRepeatTime(title, interval);
            }
        }
    }

    private static void addRecurringTaskRepeatTime(
        String title, Integer interval
    ) {
        LocalTime repeatTime = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (repeatTime == null) {
            String temp = "";
            System.out.print(
                "Введите время повтора (HH:MM:SS, 0 - для отмены): "
            );
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                break;
            }
            try {
                repeatTime = LocalTime.parse(temp, formatter);
            } catch (DateTimeParseException e) {
                System.out.println(
                    "Ошибка: неверный формат ввода времени, используйте \"HH:" + 
                    "MM:SS\"\n"
                );
                repeatTime = null;
            }
        }
        System.out.printf(
            "Вы ввели время повторения: %02d:%02d:%02d\n\n", 
            repeatTime.getHour(), 
            repeatTime.getMinute(), 
            repeatTime.getSecond()
        );
        addRecurringTaskEndDate(title, interval, repeatTime);
    }

    private static void addRecurringTaskEndDate(
        String title, Integer interval, LocalTime repeatTime
    ) {
        LocalDate endDate = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        while (endDate == null) {
            String temp = "";
            System.out.print(
                "Введите дату окончания задачи (DD.MM.YYYY, 0 - для отмены): "
            );
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                System.out.println("Вы выбрали 0 для отмены\n");
                break;
            }
            try {
                endDate = LocalDate.parse(temp, formatter);
            } catch (DateTimeParseException e) {
                System.out.println(
                    "Ошибка: неверный формат ввода времени, используйте \"DD." +
                    "MM.YYYY\"\n"
                );
                endDate = null;
            }
        }
        System.out.printf(
            "Вы ввели дату окончания задачи: %02d-%02d-%04d\n\n", 
            endDate.getDayOfMonth(), 
            endDate.getMonthValue(), 
            endDate.getYear()
        );
        addRecurringTaskEndTime(title, interval, repeatTime, endDate);
    }

    private static void addRecurringTaskEndTime(
        String title, 
        Integer interval, 
        LocalTime repeatTime, 
        LocalDate endDate
    ) {
        LocalTime endTime = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (endTime == null) {
            String temp = "";
            System.out.print(
                "Введите время окончания задачи (HH:MM:SS, 0 - для отмены): "
            );
            temp = scanner.nextLine();
            if (temp.equals("0")) {
                break;
            }
            try {
                endTime = LocalTime.parse(temp, formatter);
            } 
            catch (DateTimeParseException e) {
                System.out.println(
                    "Ошибка: неверный формат ввода времени, " + 
                    "используйте \"HH:MM:SS\"\n"
                );
                endTime = null;
            }
        }
        String out = "Вы создали повторяющуюся задачу задачу %s\nИнтервал: %d" +
            "\nВремя повторения: %02d:%02d:%02d\nДата окончания: %02d.%02d.%0" +
            "4d\nВремя окончания: %02d:%02d:%02d\n\n";
        System.out.printf(
            out,
            title, 
            interval, 
            repeatTime.getHour(), 
            repeatTime.getMinute(), 
            repeatTime.getSecond(),
            endDate.getDayOfMonth(), 
            endDate.getMonthValue(), 
            endDate.getYear(),
            endTime.getHour(), 
            endTime.getMinute(), 
            endTime.getSecond()
        );
        manager.addRecurringTask(title, interval, repeatTime, endDate, endTime);
    }
    
    private static Integer wrongChoice(Integer input) {
        System.out.println(
            "Ошибка: " + input + " не является вариантом выбора\n"
        );
        return null;
    }
}