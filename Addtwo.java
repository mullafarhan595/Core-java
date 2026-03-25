import    java.util.Scanner;
class    Addtwo
{
    int   a,b,c;
    void  get()
    {
        Scanner   scobj=new Scanner(System.in);
        System.out.println("Enter two no=");
        a=scobj.nextInt();
        b=scobj.nextInt();
    }
    void   show()
    {
        c=a+b;
        System.out.println("Add="+c);
    }
    public static void main(String   ar[])
    {
        Addtwo   obj=new  Addtwo();   //object
        obj.get();
        obj.show();
    }

}