import java.util.Arrays;

public class RandomArrayStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(arr));
        double[] result = findAverageMinMax(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
