import java.util.Scanner;
class arraySum
{
    int  x[]=new int[5],sum=0,sz,i;
    arraySum(int a[],int s)
    {
        sz=s;
        for(i=0;i<=sz-1;i++)
        {
            x[i]=a[i];
        }  
    }
    void show()
    {
        for(i=0;i<=sz-1;i++)
        {
            sum=sum+x[i];
        }
        System.out.println("\nSum of Array Ele="+sum);
    }
    public static void main(String ar[])
    {
        int   n[]=new int[5],i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 no=");
        for(i=0;i<=4;i++)
        {
            n[i]=sc.nextInt();
        }
        arraySum  obj=new arraySum(n,5);   //call to para. constructor
        obj.show();
    }
}