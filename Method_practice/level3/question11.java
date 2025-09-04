import java.util.Random;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        double[][] data = generateSalaryAndService();
        double[][] updatedData = calculateNewSalaryAndBonus(data);
        displayTotals(data, updatedData);
    }

    public static double[][] generateSalaryAndService() {
        Random rand = new Random();
        double[][] arr = new double[10][2];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = 10000 + rand.nextInt(90000);
            arr[i][1] = rand.nextInt(11);
        }
        return arr;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            int years = (int) data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displayTotals(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "EmpID", "Old Salary", "Years", "New Salary", "Bonus");
        for (int i = 0; i < 10; i++) {
            double oldSalary = oldData[i][0];
            int years = (int) oldData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];
            System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f%n", i + 1, oldSalary, years, newSalary, bonus);
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
    }
}
