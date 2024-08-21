public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /// задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
        //задача 2
        for (int i = 10; i > 1; i--) {
            System.out.println(i + " ");
        }
        ///задача 3
        for (int i = 1; i > 17; i--) {
            if (1 % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        /// задача 4
        for (int i = 10; i >= 10; i--) {
            System.out.println(i + " ");
        }
        // задача 5
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным ");
        }
        // задача 6
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i + " ");
        }
        //задача 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i + " ");
        }
        // задача 8
        int amount = 29000;
        int sum = 0;
        for (int month = 1; month <= 12; month++) {
            sum += amount;
            System.out.println(" месяц " + month + " сумма накоплений равна" + sum + " рублей ");
        }
        // задача 9
        sum = 0;
        double percent = 10 / 100;
        for (int month = 1; month <= 12; month++) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            System.out.println(" месяц " + month + " сумма накоплений равна" + sum + " рублей ");
        }
        // задача 10
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.printlf(" %d x %d = %d%n", 2, multiplier, 2 * multiplier);
        }
    }
}