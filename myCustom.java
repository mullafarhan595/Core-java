import java.util.Scanner;
class   Custom   extends  Exception
{
    Custom(String  msg)
    {
        super(msg);
    }
}

class myCustom
{
    public  static void main(String  ar[])
    {
        int   age;
        Scanner   sc=new   Scanner(System.in);
        try
        {
          System.out.println("Enter age=");
          age=sc.nextInt();
          if(age>=18)
          {
            System.out.println("Eligible for Votting..");
          }
          else
          {
            throw   new   Custom("Not Eligible for Votting..");
          }
        }
        catch(Custom   e)
        {
           System.out.println(e);
        }
    }
}