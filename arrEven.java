import   java.util.Scanner;
class   arrEven
{
    int   x[]=new   int[10];
    int  i;
    void  get()
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter 10 No=");
        for(i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
    }
    void   show()
    {
        System.out.println("Enven No=");
        for(i=0;i<=9;i++)
        {
            if(x[i]%2==0)
            {
                System.out.println(x[i]);
            }
        }
    }
    public static  void  main(String  []ar)
    {
            arrEven   obj=new   arrEven();
            obj.get();
            obj.show();
    }
}