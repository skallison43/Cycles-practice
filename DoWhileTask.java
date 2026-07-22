package practice4a;

import java.util.Scanner;

public class DoWhileTask {
    static void main(String[] args) {
        //writePositiveNumber();
        //writePassword();
        //printNumbersTo10();
        //command();
        countNumber();
    }

    public static void writePositiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Вводите число пока оно не станет верным: ");
            number = scanner.nextInt();
        } while (!(number>0));
        System.out.println("Верно!");
    }
    public static void writePassword(){
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.print("Введите верный пароль: ");
            password = scanner.nextLine();
        } while (!password.equals("12345"));
        System.out.println("Пароль верный!");
    }
    public static void printNumbersTo10(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
    public static void command(){
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        System.out.println("Выход из программы");
    }
    public static void countNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;
        do {
           number = number / 10;
           count++;
        } while (number !=0);
        System.out.println(count);
    }
}
