import  java.util.Scanner;
class   A
{
    int   a,b;
    void  get()
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter  2 no= ");
        a=sc.nextInt();
        b=sc.nextInt();
    }
}
class    add   extends    A
{
    int  z;
    void  doadd()
    {
        super.get();
        z=super.a+super.b;    
        System.out.println("Add="+z);
    }
}
class    sub   extends   add 
{
    int  z;
    void  dosub()
    {
        super.doadd();
        super.get();
        z=super.a-super.b;
        System.out.println("Sub="+z);
    }
}
class    mul   extends    A  
{
    int  z;
    void  domul()
    {
        super.get();
        z=super.a*super.b;
        System.out.println("Multiplication="+z);
    }
}
class    Hybrid
{
    public  static void main(String ar[])
    {
        sub     x=new   sub();
        x.dosub();
        mul    y=new   mul();
        y.domul();
    }
}



