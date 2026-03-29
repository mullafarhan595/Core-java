public class Reverse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r, s= 0;
        
        while (n > 0) {
            r= n % 10;
            s=s*10+r;
            n /= 10;
        }
        
        System.out.println("Reverse: " + s);
    }
}

    

