package practice4a;

import java.util.Scanner;

public class BreakContinueTask {
    static void main(String[] args) {
        //sumOfNumbers();
        //printNumbersTo20();
        //printPositive();
        printCommand();
    }

    public static void sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Сумма = " + sum);
                break;
            } else {
                sum = sum + number;
                System.out.println("Сумма = " + sum);
            }
        }
    }
    public static void printNumbersTo20(){
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void printPositive(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если хотите завершить выполнение программы введите 0");
        int number;
        while (true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            }else if (number == 0) {
                break;
            }
            System.out.println(number);
        }
    }
    public static void printCommand(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если хотите завершить выполнение программы введите stop");
        String command;
        while (true) {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
        }
    }
}
