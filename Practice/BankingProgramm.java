package Practice;

import java.util.Scanner;

public class BankingProgramm {
    
    double balance;
    int choice;
    boolean isRunning;

    public BankingProgramm() {
        choice = 0;
        balance = 0;
        isRunning = true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingProgramm bank = new BankingProgramm();
        System.out.println("\nБанковское приложение");
        while (bank.isRunning) {
            System.out.print("\n=== Главное меню ===\n\n1. Показать баланс\n2. Пополнить\n3. Вывести\n4. Закрыть приложение\n\nВыберите опцию: ");
            bank.choice = scanner.nextInt();
            scanner.nextLine();
            switch (bank.choice) {
                case 1 -> {
                    System.out.printf("\n=== Баланс ===\n\nБаланс: %.2f рублей\n", bank.showBalance());
                    continue;
                }
                case 2 -> {
                    Double sum = null;
                    while (sum == null) {
                        System.out.print("\n=== Пополнение баланса ===\n\nВведите сумму (0 для отмены): ");
                        sum = scanner.nextDouble();
                        scanner.nextLine();
                        if (sum > 0) {
                            bank.deposit(sum);
                            System.out.printf("Баланс пополнен на %.2f рублей\n", sum);
                        } else if (sum == 0) {
                            System.out.println("Отмена пополнения баланса");
                        } else {
                            System.out.println("ОШИБКА: Сумма должна быть больше нуля");
                            sum = null;
                        }
                    }
                }
                case 3 -> {
                    Double sum = null;
                    while (sum == null) {
                        System.out.print("\n=== Вывести средства ===\n\nВведите сумму (0 для отмены): ");
                        sum = scanner.nextDouble();
                        scanner.nextLine();
                        if (sum > 0) {
                            if (!bank.withdraw(sum)) {
                                System.out.println("ОШИБКА: Недостаточно средств");
                            } else {
                                System.out.printf("Вы вывели %.2f рублей\n", sum);
                            }
                        } else if (sum == 0) {
                            System.out.println("Отмена вывода средств");
                        } else {
                            System.out.println("ОШИБКА: Сумма должна быть больше нуля");
                            sum = null;
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Завершение программы");
                    bank.isRunning = false;
                }
                default -> {
                    System.out.println("ОШИБКА: " + bank.choice + " - не опция");
                }
            }
        }
        scanner.close();
    }  

    public void deposit(double deposit) {
        balance += deposit;
    }

    public boolean withdraw(double withdraw) {
        if (this.balance - withdraw < 0) {
            return false;
        }
        balance -= withdraw;
        return true;
    }

    public double showBalance() {
        return balance;
    }

}