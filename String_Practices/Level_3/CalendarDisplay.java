package String_Practices.Level_3;

import java.util.Scanner;

public class CalendarDisplay {
    public static String getMonthName(int month) {
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        return months[month-1];
    }

    public static int getDaysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m-1];
    }

    public static boolean isLeapYear(int y) {
        return (y%4==0 && y%100!=0) || (y%400==0);
    }

    public static int firstDayOfMonth(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int days = getDaysInMonth(m,y);
        int startDay = firstDayOfMonth(1,m,y);

        System.out.println("   " + getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i=0;i<startDay;i++) System.out.print("    ");
        for (int d=1;d<=days;d++) {
            System.out.printf("%3d ", d);
            if ((d+startDay)%7==0) System.out.println();
        }
    }
}
