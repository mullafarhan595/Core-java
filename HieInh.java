import java.util.Scanner;
class   A
{
    int   a,b;
    void  get()
    {
        Scanner  sc=new  Scanner(System.in);
        System.out.print("Enter 2 no=");
        a=sc.nextInt();
        b=sc.nextInt();
    }
}
class   add   extends   A
{
      int   z;
      void   doadd()
      {
        super.get();
        z=super.a+super.b;
        System.out.println("Add="+z);
      }
}
class     sub   extends   A
{
    int   z;
    void  dosub()
    {
        super.get();
        z=super.a-super.b;
        System.out.println("Subtraction="+z);
    }
}
class    HieInh
{
    public static void main(String  ar[])
    {
        add    x=new   add();
        x.doadd();
        sub   y=new   sub();
        y.dosub();
    }
}
