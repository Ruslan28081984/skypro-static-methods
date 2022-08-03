import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int year  = inNumberYear();
        checkYearUp(year);
    }
    public static int inNumberYear () {
        System.out.println ("Введи с клавиатуры год, который нуждается в проверке: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return  num;
    }
    public static void checkYearUp(int tr) {
        System.out.println("Ты ввел "+ tr);
        boolean thisYear = (tr % 4 == 0 && tr % 100 != 0 || tr % 400 == 0);
        if (thisYear) {
            System.out.println(tr + " год является высокосным ");
        } else {
            System.out.println(tr + " год не является высокосным");
        }
    }

    public static void adviceDownloaDSistems() {
     int currentYear = inNumberYear();
     int ios = 0;
     int android = 1;
     if( currentYear<2015){
         System.out.println();
     }
    }
}