import  java.util.Scanner;
class   Matrix1
{
    int    x[][]=new   int[3][4];
    int  i,j;
    void   get()
    {
        Scanner   sc=new Scanner(System.in);
        System.out.println("Enter matrix of order 3X4 ");
        for(i=0;i<=2;i++)//row
        {
            for(j=0;j<=3;j++)  //column
            {
                x[i][j]=sc.nextInt();
            }
        }
    }
    void   show()
    {
        System.out.println("Matrix=");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void  main(String  ar[])
    {
        Matrix1  obj=new Matrix1();
        obj.get();
        obj.show();
    }
}