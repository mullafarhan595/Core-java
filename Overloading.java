class Add {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Add obj = new Add();
        
        System.out.println(obj.sum(10, 20));
        System.out.println(obj.sum(10, 20, 30));
        System.out.println(obj.sum(5.5, 2.5));
    }
}