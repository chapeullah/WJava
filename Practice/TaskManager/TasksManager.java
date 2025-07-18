package Practice.TaskManager;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Practice.TaskManager.Model.ImportantTask;
import Practice.TaskManager.Model.RecurringTask;
import Practice.TaskManager.Model.SimpleTask;
import Practice.TaskManager.Model.Task;
import Practice.TaskManager.Model.Type;

public class TasksManager {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void getTasks() {
        if (tasks.isEmpty()) {
            System.out.println("\nСписок задач пуст");
            return;
        }

        for (int i = 0; i < tasks.size(); ++i) {
            System.out.println("\n" + tasks.get(i).getDetails(i + 1));
        }
    }

    public void addSimpleTask(
        String title, 
        LocalDate endDate, 
        LocalTime endTime
    ) {
        SimpleTask simpleTask = new SimpleTask(
            Type.SIMPLE, title, endDate, endTime
        );
        tasks.add(simpleTask);
    }

    public void addImportantTask(
        String title, int priority, LocalDate endDate, LocalTime endTime
    ) {
        ImportantTask importantTask = new ImportantTask(
            Type.IMPORTANT, title, priority, endDate, endTime
        );
        tasks.add(importantTask);
    }

    public void addRecurringTask(
        String title, 
        int schedule, 
        LocalTime repeatTime, 
        LocalDate endDate, 
        LocalTime endTime
    ) {
        RecurringTask recurringTask = new RecurringTask(
            Type.RECURRING, title, schedule, repeatTime, endDate, endTime
        );
        tasks.add(recurringTask);
    }

    public boolean isDuplicateTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean completeTask(String title) {
        for (int i = 0; i < tasks.size(); ++i) {
            Task task = tasks.get(i);
            if (task.getTitle().equals(title)) {
                task.markDone();
                return true;
            }
        }
        return false;
    }

    public boolean deleteTask(String title, Scanner scanner) {
        Integer input = null;
        for (int i = 0; i < tasks.size(); ++i) {
            Task task = tasks.get(i);
            if (task.getTitle().equals(title)) {
                System.out.print("Вы уверенны? (1 - да, 0 - нет): ");
                while (input == null) {
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
                            tasks.remove(i);
                        }
                        case 2 -> {
                            System.out.println("Вы выбрали 0 - нет\n");
                        }
                        default -> {
                            System.out.println(input + " не вариант выбора\n");
                            input = null;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}