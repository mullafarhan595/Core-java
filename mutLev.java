import java.util.Scanner;
class   A
{
    int  a,b;
    void get()
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter 2 no=");
        a=sc.nextInt();
        b=sc.nextInt();
    }
}
class    add    extends    A
{
    int  z;
    void doadd()
    {
        super.get();
        z=super.a+super.b;
        System.out.println("Addition="+z);
    }
}
class   sub   extends   add
{
    int  z;
    void  dosub()
    {
        super.doadd();
       z=super.a-super.b; 
       System.out.println("Subtraction="+z);
    }
}

class  mutLev
{
    public static void main(String  ar[])
    {
        sub   obj=new   sub();
        obj.dosub();
    }
}