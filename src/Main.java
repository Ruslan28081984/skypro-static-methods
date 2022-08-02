public class Main {
    public static void  printSeparator(){
        System.out.println("============");
        System.out.println("++++++++++++++");
    }

    public static void printIssues(int issuesCount) {
        System.out.println(issuesCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int valueSr(int[] valueNumbers) {
        int value = 0;
        int valueSr = 0;
        for (int i = 0; i < valueNumbers.length; i++) {
            value = value + i;
            valueSr = value / valueNumbers.length;
        }
        return valueSr;
    }

    public static void main(String[] args) {
        int[] issuesByMonths = {4, 9, 10, 3, 8, 7, 1, 10, 6, 11, 4, 9};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
       int total = sum(issuesByMonths);
        printIssues(total);
        int total2 = valueSr(issuesByMonths);
        printIssues(total2);
    }
}