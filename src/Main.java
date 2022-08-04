import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    static int inNumberYear() {
        System.out.println("Введи с клавиатуры год : ");
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


    public static void task1() {
        int year = inNumberYear();
        checkLeapYear(year);
    }
    public static void task2() {
        int clientOs = 1;
        installVersion(clientOs,inNumberYear());
    }
}
