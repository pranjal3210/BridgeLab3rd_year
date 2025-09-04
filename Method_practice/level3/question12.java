import java.util.Scanner;

public class DistanceAndLineEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        double m = calculateSlope(x1, y1, x2, y2);
        double b = calculateIntercept(x1, y1, m);
        System.out.printf("Equation of line: y = %.2fx + %.2f%n", m, b);
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double calculateSlope(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static double calculateIntercept(double x1, double y1, double m) {
        return y1 - m * x1;
    }
}
