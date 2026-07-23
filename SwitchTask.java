package practice4a;

import java.util.Scanner;

public class SwitchTask {
    static void main(String[] args) {
        //System.out.println(nameDayOfWeek());
        //printPrice();
        //numberToMark();
        //textCommand();
        calculator();
    }

    public static String nameDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int day;
        day = scanner.nextInt();
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
        }
        return dayOfWeek;
    }
    public static void printPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int day;
        day = scanner.nextInt();
        String price;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                price = "Стоимость билета 300 рублей";
                break;
            case 6:
            case 7:
                price = "Стоимость билета 450 рублей";
                break;
            default:
                price = "Вы выбрали несуществующий день недели, выберите, пожалуйста, цифры от 1 до 7";
        }
        System.out.println(price);
    }
    public static void numberToMark() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 100: ");
        int number;
        number = scanner.nextInt();
        String mark = "";
        if (number<0 || number > 100) {
            mark = "Не соответствует данной системе счисления, исправьте количество баллов";
        }
        else {
            int score = number/10;
            switch (score){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    mark = "F";
                    break;
                case 6:
                    mark = "D";
                    break;
                case 7:
                    mark = "C";
                    break;
                case 8:
                    mark = "B";
                    break;
                case 9:
                case 10:
                    mark = "A";
                    break;
            }
        }
        System.out.println("Ваша оценка: " + mark);
    }
    public static void textCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String text;
        text = scanner.nextLine();
        String message;
        switch (text) {
            case "start" -> message = "Система запущена";
            case "stop" -> message = "Система выключена";
            case "restart" -> message = "Выполнен перезапуск системы";
            case "status" -> message = "Статус запрошен";
            default -> message = "Ошибка, введите другую команду";
        }
        System.out.println(message);
    }
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        String operator;
        System.out.print("Введите первое число: ");
        x = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        y = scanner.nextDouble();
        System.out.print("Введите один из операторов: +, -, /, * ");
        operator = scanner.next();
        double result = 0;
        switch (operator) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                if (y == 0){
                    System.out.println("Выполнение операции невозможно, деление на 0 запрещено");
                    return;
                } else {
                    result = x / y;
                    break;
                }
            default:
                System.out.println("Вы выбрали некорректный оператор");
                return;
        }
        System.out.println(result);
    }
}
