import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        while (true) {
            System.out.println("Введите год в формате \"yyyy\" :");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней :");
            int days = scanner.nextInt();
            if (days == daysInYear(year)) {
                points++;
            } else {
                System.out.println("Неправильно! В этом году" + " " + daysInYear(year) + " " + "дней!");
                System.out.println("Набрано очков :" + " " + points);
                break;
            }
        }

    }

    static int daysInYear(int year) {
        int days;
        if (year % 400 == 0) {
            days = 366;
        } else if (year % 100 == 0) {
            days = 365;
        } else if (year % 4 == 0) {
            days = 366;
        } else {
            days = 365;
        }
        return days;
    }
}
