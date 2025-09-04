class NumberCheckerQ5 {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int num) {
        int sq = num * num, sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, prod = 1, temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += d; prod *= d;
            temp /= 10;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int num) {
        int sq = num * num;
        return String.valueOf(sq).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int num = 25;
        System.out.println("Prime: " + isPrime(num));
        System.out.println("Neon: " + isNeon(num));
        System.out.println("Spy: " + isSpy(num));
        System.out.println("Automorphic: " + isAutomorphic(num));
        System.out.println("Buzz: " + isBuzz(num));
    }
}
