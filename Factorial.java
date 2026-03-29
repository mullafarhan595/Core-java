public class Factorial {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument");
            return;
        }
        int num = Integer.parseInt(args[0]);
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
