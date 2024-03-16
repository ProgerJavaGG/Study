
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperatureOutside = scanner.nextInt();
        if (temperatureOutside < 5) {
            System.out.println("На улице холодно, а именно " + temperatureOutside + ", нужно надеть шапку.");
        } else {
            System.out.println("На улице не холодно, а именно " + temperatureOutside + ", можно идти без шапки.");
        }

        task6();
        task7();
        task8();
    }

    static void task6() {
        for (int i = 0; i < 18; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void task7() {
        for (int i = 10; i > 0;) {
            System.out.println(i);
            i--;
        }
    }

    static void task8() {
        int expiredSum = 2459000;
        int currentSum = 0;
        int countMonths = 0;
        while (expiredSum > currentSum) {
            countMonths++;
            currentSum += 15000;
            System.out.println("Месяц " + countMonths + ", сумма " + currentSum);
        }
    }
}