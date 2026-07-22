package practice4a;

import java.util.Scanner;

public class IfElseTask {

    static void main(String[] args) {
        //readNumber();
        //findMax();
        //printMarks();
        //System.out.println(checkParity());
        //System.out.println(determineDescount());
        System.out.println(printComment());
    }

    public static void readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number;
        number = scanner.nextInt();
        String say;
        if (number > 0) {
            say = "Число положительное";
        }
        else if (number < 0) {
            say = "Число отрицательное";
        }
        else {
            say = "Число равно нулю";
        }
        System.out.println(say);
    }
    public static void findMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = scanner.nextInt();
        System.out.print("Введите y: ");
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println(x);
        } else if (x < y) {
            System.out.println(y);
        } else {
            System.out.println("Числа равны");
        }
    }
    public static void printMarks(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int mark = scanner.nextInt();
        String answer;
        if (mark == 5) {
            answer = "Отлично";
        } else if (mark == 4) {
            answer = "Хорошо";
        } else if (mark == 3) {
            answer = "Удовлетворительно";
        } else if (mark == 2 || mark == 1) {
            answer = "Неудовлетворительно";
        } else {
            answer = "Подобная оценка не существует";
        }
        System.out.println(answer);
    }
    public static String checkParity(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        String parity = "Нечетное";
        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }
    public static String determineDescount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        String discount = "Нет скидки";
        if (age < 18) {
            discount = "25%";
        } else if (age >= 65) {
            discount = "30%";
        }
        return discount;
    }
    public static String printComment(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите баллы от 1 до 100: ");
        int scores = scanner.nextInt();
        String comment;
        if (scores >=90 && scores <= 100) {
            comment = "Отлично";
        } else if (scores >=75 && scores <= 89 ) {
            comment = "Хорошо";
        } else if (scores >= 60 && scores <= 74) {
            comment = "Удовлетворительно";
        } else if (scores < 60 && scores >= 0) {
            comment = "Неудовлетворительно";
        } else {
            comment = "Данного балла не существует";
        }
        return comment;
    }
}
