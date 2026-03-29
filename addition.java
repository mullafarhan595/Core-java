class addition 
{
    public static void main(String fm[])  
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("\n Addition:"+c);
        
        System.out.println("Enter First Number");
        int s=sc.nextInt();
        System.out.println("Enter Second Number");
        int p=sc.nextInt();
        int d=s-p;
        System.out.println("\n Substraction:"+d);

        System.out.println("Enter First Number");
        int x=sc.nextInt();
        System.out.println("Enter Second Number");
        int y=sc.nextInt();
        int e=x*y;
        System.out.println("\n Multiplication:"+e);

        System.out.println("Enter First Number");
        int m=sc.nextInt();
        System.out.println("Enter Second Number");
        int n=sc.nextInt();
        int f=m/n;
        System.out.println("Diviion:"+f);
        sc.close();
        
    }  
}
