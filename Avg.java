import   java.util.Scanner;
class   Avg
{
    int  a,b,c,d,e;
    float  z;
    void get()
    {
        Scanner   sc=new Scanner(System.in);
        System.out.println("Enter 5 no=");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
    }
    void display()
    {       
        z=(float)(a+b+c+d+e)/5;
        System.out.printf("Average="+z);

    }
    public static void main(String ar[])
    {
        Avg   obj=new Avg();
        obj.get();
        obj.display();
    }
}