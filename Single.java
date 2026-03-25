import  java.util.Scanner;
class    parent
{
     int a,b;
     void get()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no=");
        a=sc.nextInt();
        b=sc.nextInt();
     }
}
class   child   extends    parent
{
    int  z,a,b;
    void  show()
    {
       super.get();   //call to get method 
       z=super.a+super.b;
       System.out.println("Addition="+z);
    }
}
class   Single
{
    public static void main(String ar[])
    {
        child  obj=new child();
        obj.show();

    }
}