class NumberCheckerQ6 {
    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) sum += i;
        return sum == num && num != 1;
    }

    public static boolean isAbundant(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) sum += i;
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) sum += i;
        return sum < num;
    }

    public static boolean isFriendlyPair(int a, int b) {
        int sumA = 0, sumB = 0;
        for (int i = 1; i < a; i++) if (a % i == 0) sumA += i;
        for (int i = 1; i < b; i++) if (b % i == 0) sumB += i;
        return (double) sumA / a == (double) sumB / b;
    }

    public static void main(String[] args) {
        int num = 28, num2 = 496;
        System.out.println("Perfect: " + isPerfect(num));
        System.out.println("Abundant: " + isAbundant(num));
        System.out.println("Deficient: " + isDeficient(num));
        System.out.println("Friendly Pair: " + isFriendlyPair(num, num2));
    }
}
