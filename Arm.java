public class Arm {
    

public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int originalNum = n;
    int sum = 0;
    int digits = String.valueOf(n).length();
    
    while (n > 0) {
        int digit = n % 10;
        sum += Math.pow(digit, digits);
        n /= 10;
    }
    
    if (sum == originalNum) {
        System.out.println(originalNum + " is an Armstrong number");
    } else {
        System.out.println(originalNum + " is not an Armstrong number");
    }
}
}