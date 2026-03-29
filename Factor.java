class Factor {
public static void main(String[] args) {
    int num = 12; // Change this to any number
    
    System.out.println("Factors of " + num + ":");
    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            System.out.println(i);
        }
    }
}
}