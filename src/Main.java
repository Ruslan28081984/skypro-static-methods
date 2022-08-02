import java.util.Scanner;


public class Main {
    public static void currentYear (){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введи год, который хочешь проверить ");
        int num = in.nextInt();
        System.out.print("Ты ввел "+ num + " а теперь смотри результат: ");
        boolean thisYear = (num % 4 == 0 && num % 100 != 0 || num % 400 == 0);
        if (thisYear) {
            System.out.println(num + " год является высокосным ");
        } else {
            System.out.println(num + " год не является высокосным");
        }
    }

    public static int inConsole (){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return  num;
    }
    public static void main(String[] args) {
        System.out.println ("Сейчас проверим является ли год высокосным.  ");
      currentYear();


    }
}