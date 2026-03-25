import   java.util.Scanner;
class arrDemo
{
    int   x[]=new int[5];
    int i;
    void  get()
    {
        Scanner   sc=new Scanner(System.in);
        System.out.println("Enter 5 no=");
        for(i=0;i<=4;i++)
        {
            x[i]=sc.nextInt();
        }
    }
    void  show()
    {
        System.out.println("Array Ele=");
        for(i=0;i<=4;i++)
        {
            System.out.println(x[i]);
        }
    }
    public  static void main(String []ar)
    {
        arrDemo  obj=new arrDemo();
        obj.get();
        obj.show();
    }
}