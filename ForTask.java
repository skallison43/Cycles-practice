package practice4a;

import java.util.Scanner;

public class ForTask {

    static void main(String[] args) {

        //printNumbers();
        //System.out.println(sumOfNumbers());
        //multiplyTable();
        //System.out.println(isNumberPrime());
        printNumbersTo10();
    }

    public static void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public static int sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void multiplyTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " x " + i + " = " + number * i
            );
        }
    }
    public static boolean isNumberPrime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, чтобы проверить простое ли оно, вернем true если да, false если нет: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        }else {
            for (int i = 2; i <= number - 1; i ++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
    public static void printNumbersTo10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
