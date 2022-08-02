public class Main {
    public static void currentYear (){
        int year  = 2020;
        boolean thisYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (thisYear) {
            System.out.println(year + " год является высокосным ");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }
    public static void main(String[] args) {
        System.out.print("Сейчас проверим является ли год высокосным: ");
      currentYear();


    }
}