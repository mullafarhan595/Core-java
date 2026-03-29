public class Perfect {
public static boolean isPerfect(int number) {
    int sum = 0;
    for (int i = 1; i <= number / 2; i++) {
        if (number % i == 0) {
            sum += i;
        }
    }
    return sum == number;
}

public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    if (isPerfect(n)) {
        System.out.println(n + " is a perfect number.");
    } else {
        System.out.println(n + " is not a perfect number.");
    }
}
}