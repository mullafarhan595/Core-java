import java.util.Scanner;
class    Maximum
{
    int   x[]=new  int[10];
    int   i,mx;
    void  get()
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter 10 no=");
        for(i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
    }
    void   show()
    {
        mx=x[0];
        for(i=0;i<=9;i++)
        {
            if(mx<x[i])
            {
               mx=x[i]; 
            }
        }

        System.out.println("Maximum="+mx);
    }
  public static void main(String ar[])
  {
    Maximum   obj=new  Maximum();
    obj.get();
    obj.show();
  }

}