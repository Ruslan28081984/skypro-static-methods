import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static int inNumberYear() {
       // System.out.println("Введи с клавиатуры год : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    public static void checkLeapYear(int b) {
        boolean thisYear = (b % 4 == 0 && b % 100 != 0 || b % 400 == 0);
        if (thisYear) {
            System.out.println(b + " год является високосным ");
        } else {
            System.out.println(b + " год не является високосным");
        }
    }
    public static void installVersion(int a, int num) {
        if (a == 0 && num >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке: ");
        } else if (a == 0 && num < 2015) {
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке: ");
        } else if (a == 1 && num >= 2015) {
            System.out.println("Установите  версию приложения для Android по ссылке: ");
        } else if (a == 1 && num < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке: ");
        } else {
            System.out.println("Ваша операционная система не поддерживается");
        }
    }
    public static void deliveryTime (int num){
        if ( num < 20 && num> 0) {
            System.out.println("потребуется один день доставки");
        } else if (num >= 20 && num< 60){
            System.out.println(" Потребуется два дня доставки");
        } else if (num >= 60 && num< 100){
            System.out.println(" Потребуется два дня доставки");
            }else {
            System.out.println("Доставки нет");
        }

    }

    public static void task1() {
        System.out.println("Введи год, который нужно узнать високосный он или нет:");
        int year = inNumberYear();
        checkLeapYear(year);
    }
    public static void task2() {
        System.out.println("Вееди год выпуска своего гаджета:");
        int clientOs = 1;
        installVersion(clientOs,inNumberYear());
    }

    public static void task3() {
        System.out.print("Вееди расстояние доставки: ");
        int distance = inNumberYear();
        deliveryTime (distance);
    }
}
