import java.util.Scanner;
class    statDemo
{
   static String  name;
    void  get()
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter name=");
        name=sc.next();
    }
    void show()
    {
        System.out.println("Name="+name);
    }
    public static void main(String   ar[])
    {
        statDemo   a=new statDemo();
        statDemo   b=new statDemo();
        a.get();
        b.show();
    }
}