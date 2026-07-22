package practice4a;

import java.util.Scanner;

public class WhileTask {
    static void main(String[] args) {
        //countFactorial();
        //printEvenNumbers();
        printNumbersReversed();

    }

    public static void countFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i <= number){
            result = result * i;
            i++;
        }
        System.out.println(result);
    }
    public static void printEvenNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 2;
        while (i <= number){
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void printNumbersReversed(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
